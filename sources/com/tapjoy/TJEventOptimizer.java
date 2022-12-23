package com.tapjoy;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tapjoy.TapjoyErrorMessage;
import java.util.concurrent.CountDownLatch;

public class TJEventOptimizer extends WebView {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f26656a = "TJEventOptimizer";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static TJEventOptimizer f26657b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static CountDownLatch f26658c;

    /* renamed from: d */
    private Context f26659d;

    /* renamed from: e */
    private TJAdUnitJSBridge f26660e;

    /* synthetic */ TJEventOptimizer(Context context, byte b) {
        this(context);
    }

    private TJEventOptimizer(Context context) {
        super(context);
        this.f26659d = context;
        this.f26660e = new TJAdUnitJSBridge(this.f26659d, (WebView) this);
        try {
            getSettings().setJavaScriptEnabled(true);
            setWebViewClient(new C11229b(this, (byte) 0));
            setWebChromeClient(new C11228a(this, (byte) 0));
            loadUrl(TapjoyConnectCore.getHostURL() + TJAdUnitConstants.EVENTS_PROXY_PATH + TapjoyUtil.convertURLParams(TapjoyConnectCore.getGenericURLParams(), true));
        } catch (Exception e) {
            TapjoyLog.m30844w(f26656a, e.getMessage());
        }
    }

    public static void init(final Context context) {
        TapjoyLog.m30839d(f26656a, "Initializing event optimizer");
        f26658c = new CountDownLatch(1);
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                try {
                    TJEventOptimizer unused = TJEventOptimizer.f26657b = new TJEventOptimizer(context, (byte) 0);
                } catch (Exception e) {
                    TapjoyLog.m30844w(TJEventOptimizer.f26656a, e.getMessage());
                }
                TJEventOptimizer.f26658c.countDown();
            }
        });
        f26658c.await();
        if (f26657b == null) {
            throw new RuntimeException("Failed to init TJEventOptimizer");
        }
    }

    public static TJEventOptimizer getInstance() {
        return f26657b;
    }

    /* renamed from: com.tapjoy.TJEventOptimizer$b */
    class C11229b extends WebViewClient {
        private C11229b() {
        }

        /* synthetic */ C11229b(TJEventOptimizer tJEventOptimizer, byte b) {
            this();
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            TapjoyLog.m30840e(TJEventOptimizer.f26656a, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error encountered when instantiating a WebViewClient"));
        }

        public final void onPageFinished(WebView webView, String str) {
            TapjoyLog.m30839d(TJEventOptimizer.f26656a, "boostrap html loaded successfully");
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (TJEventOptimizer.f26657b != null) {
                ViewGroup viewGroup = (ViewGroup) TJEventOptimizer.f26657b.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(TJEventOptimizer.f26657b);
                }
                TJEventOptimizer.f26657b.destroy();
                TJEventOptimizer unused = TJEventOptimizer.f26657b = null;
            }
            TapjoyLog.m30840e(TJEventOptimizer.f26656a, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "WebView rendering process exited while instantiating a WebViewClient unexpectedly"));
            return true;
        }
    }

    /* renamed from: com.tapjoy.TJEventOptimizer$a */
    class C11228a extends WebChromeClient {
        private C11228a() {
        }

        /* synthetic */ C11228a(TJEventOptimizer tJEventOptimizer, byte b) {
            this();
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String a = TJEventOptimizer.f26656a;
            TapjoyLog.m30839d(a, "JS CONSOLE: " + consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }
    }
}
