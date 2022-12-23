package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3575q;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.b */
/* compiled from: PrivacyProtectDialog */
public class C3688b extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f9543a;

    /* renamed from: b */
    private String f9544b;

    /* renamed from: c */
    private String f9545c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3693c f9546d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3692b f9547e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public RelativeLayout f9548f;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.b$b */
    /* compiled from: PrivacyProtectDialog */
    public interface C3692b {
        /* renamed from: a */
        void mo18420a();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.b$c */
    /* compiled from: PrivacyProtectDialog */
    public interface C3693c {
        /* renamed from: a */
        void mo18419a();
    }

    public C3688b(Context context) {
        super(context, C2914t.m8160g(context, "tt_privacy_dialogTheme"));
        this.f9543a = context;
    }

    /* renamed from: a */
    public C3688b mo20457a(String str, C3693c cVar) {
        this.f9544b = str;
        this.f9546d = cVar;
        return this;
    }

    /* renamed from: a */
    public C3688b mo20456a(String str, C3692b bVar) {
        this.f9545c = str;
        this.f9547e = bVar;
        return this;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12045a();
        m12048b();
    }

    /* renamed from: a */
    private void m12045a() {
        View inflate = LayoutInflater.from(this.f9543a).inflate(C2914t.m8159f(this.f9543a, "tt_privacy_dialog"), (ViewGroup) null);
        setContentView(inflate);
        final TTCornersWebView tTCornersWebView = (TTCornersWebView) inflate.findViewById(C2914t.m8158e(this.f9543a, "tt_privacy_webview"));
        Button button = (Button) inflate.findViewById(C2914t.m8158e(this.f9543a, "tt_privacy_accept_btn"));
        TextView textView = (TextView) inflate.findViewById(C2914t.m8158e(this.f9543a, "tt_privacy_reject_btn"));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C2914t.m8158e(this.f9543a, "tt_privacy_back_layout"));
        this.f9548f = relativeLayout;
        C3904y.m12853a((View) relativeLayout, 8);
        textView.getPaint().setFlags(8);
        m12046a(tTCornersWebView);
        if (!TextUtils.isEmpty(this.f9544b) && !TextUtils.isEmpty(this.f9545c)) {
            button.setText(this.f9544b);
            textView.setText(this.f9545c);
        }
        button.setOnClickListener(new C3691a());
        textView.setOnClickListener(new C3691a());
        this.f9548f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTCornersWebView tTCornersWebView = tTCornersWebView;
                if (tTCornersWebView != null && tTCornersWebView.canGoBack()) {
                    tTCornersWebView.goBack();
                    if (!tTCornersWebView.canGoBack()) {
                        C3904y.m12853a((View) C3688b.this.f9548f, 8);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private void m12046a(final TTCornersWebView tTCornersWebView) {
        String t = C3513m.m10973h().mo19880t();
        if (t != null) {
            try {
                tTCornersWebView.getSettings().setJavaScriptEnabled(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                tTCornersWebView.getSettings().setMixedContentMode(0);
            }
            try {
                WebSettings settings = tTCornersWebView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(true);
                settings.setDomStorageEnabled(true);
                settings.setAllowFileAccess(false);
                settings.setBlockNetworkImage(false);
                settings.setSavePassword(false);
                tTCornersWebView.setLayerType(1, (Paint) null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            C3575q.m11308a(tTCornersWebView);
            tTCornersWebView.setWebViewClient(new SSWebView.C2926a() {
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    if (webView == null || webResourceRequest == null) {
                        return false;
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        webView.loadUrl(webResourceRequest.getUrl().toString());
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.toString());
                    return true;
                }

                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    TTCornersWebView tTCornersWebView = tTCornersWebView;
                    if (tTCornersWebView != null && tTCornersWebView.canGoBack()) {
                        C3904y.m12853a((View) C3688b.this.f9548f, 0);
                    }
                }
            });
            tTCornersWebView.loadUrl(t);
        }
    }

    /* renamed from: b */
    private void m12048b() {
        WindowManager.LayoutParams attributes;
        setCancelable(false);
        Window window = getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.dimAmount = 0.5f;
            attributes.width = (int) (((double) this.f9543a.getResources().getDisplayMetrics().widthPixels) * 0.8d);
            window.setAttributes(attributes);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.b$a */
    /* compiled from: PrivacyProtectDialog */
    private class C3691a implements View.OnClickListener {
        private C3691a() {
        }

        public void onClick(View view) {
            int id = view.getId();
            if (id == C2914t.m8158e(C3688b.this.f9543a, "tt_privacy_accept_btn")) {
                if (C3688b.this.f9546d != null) {
                    C3688b.this.f9546d.mo18419a();
                }
                C3688b.this.dismiss();
            } else if (id == C2914t.m8158e(C3688b.this.f9543a, "tt_privacy_reject_btn")) {
                if (C3688b.this.f9547e != null) {
                    C3688b.this.f9547e.mo18420a();
                }
                C3688b.this.dismiss();
            }
        }
    }
}
