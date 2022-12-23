package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import java.lang.reflect.Method;

public class BrowserView extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f21274a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ProgressBar f21275b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WebView f21276c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ToolBar f21277d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C8684a f21278e;

    /* renamed from: f */
    private CampaignEx f21279f;

    /* renamed from: com.mbridge.msdk.foundation.webview.BrowserView$a */
    public interface C8684a {
        /* renamed from: a */
        void mo16131a();

        /* renamed from: a */
        void mo16132a(WebView webView, String str, Bitmap bitmap);

        /* renamed from: a */
        boolean mo16133a(WebView webView, String str);
    }

    public BrowserView(Context context, CampaignEx campaignEx) {
        super(context);
        this.f21279f = campaignEx;
        init();
    }

    public BrowserView(Context context) {
        super(context);
        init();
    }

    public BrowserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public void setListener(C8684a aVar) {
        this.f21278e = aVar;
    }

    public void loadUrl(String str) {
        WebView webView = this.f21276c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public void setWebView(WebView webView) {
        this.f21276c = webView;
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f21275b = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.f21276c == null) {
                this.f21276c = m24960a();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f21276c.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            C8672v.m24875a("BrowserView", "webview is error", th);
        }
        this.f21277d = new ToolBar(getContext());
        this.f21277d.setLayoutParams(new LinearLayout.LayoutParams(-1, C8677z.m24924b(getContext(), 40.0f)));
        this.f21277d.setBackgroundColor(-1);
        addView(this.f21275b);
        WebView webView = this.f21276c;
        if (webView != null) {
            addView(webView);
        }
        addView(this.f21277d);
        this.f21275b.initResource(true);
        this.f21277d.getItem("backward").setEnabled(false);
        this.f21277d.getItem("forward").setEnabled(false);
        this.f21277d.setOnItemClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (BrowserView.this.f21276c != null) {
                    BrowserView.this.f21276c.stopLoading();
                }
                String str = (String) view.getTag();
                boolean z = false;
                if (TextUtils.equals(str, "backward")) {
                    BrowserView.this.f21277d.getItem("forward").setEnabled(true);
                    if (BrowserView.this.f21276c != null && BrowserView.this.f21276c.canGoBack()) {
                        BrowserView.this.f21276c.goBack();
                    }
                    View item = BrowserView.this.f21277d.getItem("backward");
                    if (BrowserView.this.f21276c != null && BrowserView.this.f21276c.canGoBack()) {
                        z = true;
                    }
                    item.setEnabled(z);
                } else if (TextUtils.equals(str, "forward")) {
                    BrowserView.this.f21277d.getItem("backward").setEnabled(true);
                    if (BrowserView.this.f21276c != null && BrowserView.this.f21276c.canGoForward()) {
                        BrowserView.this.f21276c.goForward();
                    }
                    View item2 = BrowserView.this.f21277d.getItem("forward");
                    if (BrowserView.this.f21276c != null && BrowserView.this.f21276c.canGoForward()) {
                        z = true;
                    }
                    item2.setEnabled(z);
                } else if (TextUtils.equals(str, "refresh")) {
                    BrowserView.this.f21277d.getItem("backward").setEnabled(BrowserView.this.f21276c != null && BrowserView.this.f21276c.canGoBack());
                    View item3 = BrowserView.this.f21277d.getItem("forward");
                    if (BrowserView.this.f21276c != null && BrowserView.this.f21276c.canGoForward()) {
                        z = true;
                    }
                    item3.setEnabled(z);
                    if (BrowserView.this.f21276c != null) {
                        BrowserView.this.f21276c.loadUrl(BrowserView.this.f21274a);
                    }
                } else if (TextUtils.equals(str, "exits") && BrowserView.this.f21278e != null) {
                    BrowserView.this.f21278e.mo16131a();
                }
            }
        });
    }

    /* renamed from: a */
    private WebView m24960a() {
        WebChromeClient webChromeClient;
        WebSettings settings;
        WebView webView = new WebView(getContext());
        try {
            settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setAppCacheEnabled(true);
            settings.setAppCacheMaxSize(CacheDataSink.DEFAULT_FRAGMENT_SIZE);
            settings.setAllowFileAccess(true);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(false);
            }
        } catch (Throwable th) {
            C8672v.m24878d("BrowserView", th.getMessage());
        }
        if (Build.VERSION.SDK_INT >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        try {
            settings.setAllowUniversalAccessFromFileURLs(true);
        } catch (Throwable th2) {
            C8672v.m24878d("BrowserView", th2.getMessage());
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                settings.setMixedContentMode(0);
            }
        } catch (Exception e) {
            C8672v.m24878d("BrowserView", e.getMessage());
        }
        settings.setDatabaseEnabled(true);
        String path = getContext().getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        Class<WebSettings> cls = WebSettings.class;
        try {
            Method declaredMethod = cls.getDeclaredMethod("setDisplayZoomControls", new Class[]{Boolean.TYPE});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, new Object[]{false});
        } catch (Exception e2) {
            C8672v.m24878d("BrowserView", e2.getMessage());
        }
        webView.setDownloadListener(new MBDownloadListener(this.f21279f));
        webView.setWebViewClient(new WebViewClient() {
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                C8672v.m24876b("BrowserView", "开始! = " + str);
                String unused = BrowserView.this.f21274a = str;
                if (BrowserView.this.f21278e != null) {
                    BrowserView.this.f21278e.mo16132a(webView, str, bitmap);
                }
                BrowserView.this.f21275b.setVisible(true);
                BrowserView.this.f21275b.setProgressState(5);
            }

            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                C8672v.m24876b("BrowserView", "js大跳! = " + str);
                BrowserView.this.f21277d.getItem("backward").setEnabled(true);
                BrowserView.this.f21277d.getItem("forward").setEnabled(false);
                if (BrowserView.this.f21278e != null) {
                    BrowserView.this.f21278e.mo16133a(webView, str);
                }
                return false;
            }
        });
        if (C8660r.m24828i() <= 10) {
            webChromeClient = new WebChromeClient() {
                public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
                    return true;
                }

                public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
                    return true;
                }

                public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                    return true;
                }

                public final void onProgressChanged(WebView webView, int i) {
                    if (i == 100) {
                        BrowserView.this.f21275b.setProgressState(7);
                        new Handler().postDelayed(new Runnable() {
                            public final void run() {
                                BrowserView.this.f21275b.setVisible(false);
                            }
                        }, 200);
                    }
                }
            };
        } else {
            webChromeClient = new WebChromeClient() {
                public final void onProgressChanged(WebView webView, int i) {
                    if (i == 100) {
                        BrowserView.this.f21275b.setProgressState(7);
                        new Handler().postDelayed(new Runnable() {
                            public final void run() {
                                BrowserView.this.f21275b.setVisible(false);
                            }
                        }, 200);
                    }
                }
            };
        }
        webView.setWebChromeClient(webChromeClient);
        return webView;
    }

    public static final class MBDownloadListener implements DownloadListener {
        private CampaignEx campaignEx;
        private String title;

        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        }

        public MBDownloadListener(CampaignEx campaignEx2) {
            this.campaignEx = campaignEx2;
        }

        public MBDownloadListener() {
        }

        public final void setTitle(String str) {
            this.title = str;
        }
    }

    public void destroy() {
        WebView webView = this.f21276c;
        if (webView != null) {
            webView.stopLoading();
            this.f21276c.setWebViewClient((WebViewClient) null);
            this.f21276c.destroy();
            removeAllViews();
        }
    }
}
