package com.mbridge.msdk.click;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.report.C8582d;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import java.util.HashMap;

/* renamed from: com.mbridge.msdk.click.f */
/* compiled from: WebViewSpider */
public class C6787f {

    /* renamed from: a */
    public static long f17910a = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f17911d = C6787f.class.getSimpleName();

    /* renamed from: b */
    boolean f17912b;

    /* renamed from: c */
    boolean f17913c;

    /* renamed from: e */
    private int f17914e = 15000;

    /* renamed from: f */
    private int f17915f = 3000;

    /* renamed from: g */
    private Handler f17916g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private C2440a f17917h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C6793a f17918i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f17919j;

    /* renamed from: k */
    private String f17920k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public WebView f17921l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f17922m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f17923n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f17924o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f17925p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f17926q;

    /* renamed from: r */
    private final Runnable f17927r = new Runnable() {
        public final void run() {
            boolean unused = C6787f.this.f17925p = true;
            int unused2 = C6787f.this.f17924o = 1;
            C6787f.m20683m(C6787f.this);
        }
    };

    /* renamed from: s */
    private final Runnable f17928s = new Runnable() {
        public final void run() {
            boolean unused = C6787f.this.f17925p = true;
            int unused2 = C6787f.this.f17924o = 2;
            C6787f.m20683m(C6787f.this);
        }
    };

    /* renamed from: com.mbridge.msdk.click.f$a */
    /* compiled from: WebViewSpider */
    interface C6793a {
        /* renamed from: a */
        void mo37102a(int i, String str, String str2, String str3);

        /* renamed from: a */
        void mo37103a(String str, boolean z, String str2);

        /* renamed from: a */
        boolean mo37104a(String str);

        /* renamed from: b */
        boolean mo37105b(String str);

        /* renamed from: c */
        boolean mo37106c(String str);
    }

    public C6787f() {
        C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
        this.f17917h = b;
        if (b == null) {
            this.f17917h = C2445b.m6020a().mo16285b();
        }
        this.f17922m = this.f17917h.mo16161P();
        this.f17914e = (int) this.f17917h.mo16166U();
        this.f17915f = (int) this.f17917h.mo16166U();
    }

    /* renamed from: a */
    public final void mo37089a(String str, String str2, Context context, String str3, String str4, C6793a aVar) {
        if (aVar != null) {
            this.f17920k = str4;
            this.f17919j = str3;
            this.f17918i = aVar;
            m20665a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    /* renamed from: a */
    public final void mo37088a(String str, String str2, Context context, String str3, C6793a aVar) {
        if (aVar != null) {
            this.f17919j = str3;
            this.f17918i = aVar;
            m20665a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    /* renamed from: a */
    private void m20665a(final String str, final String str2, final Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m20666a(str, str2, context, this.f17919j);
        } else {
            this.f17916g.post(new Runnable() {
                public final void run() {
                    C6787f fVar = C6787f.this;
                    fVar.m20666a(str, str2, context, fVar.f17919j);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m20666a(String str, String str2, Context context, String str3) {
        try {
            m20663a(context, str, str2);
            if (!TextUtils.isEmpty(this.f17920k)) {
                this.f17921l.getSettings().setDefaultTextEncodingName("utf-8");
                this.f17915f = 2000;
                this.f17914e = 2000;
                C8672v.m24876b(f17911d, this.f17920k);
                this.f17921l.loadDataWithBaseURL(str3, this.f17920k, "*/*", "utf-8", str3);
            } else if (this.f17922m) {
                HashMap hashMap = new HashMap();
                if (this.f17921l.getUrl() != null) {
                    hashMap.put(HttpHeaders.REFERER, this.f17921l.getUrl());
                }
                this.f17921l.loadUrl(str3, hashMap);
            } else {
                this.f17921l.loadUrl(str3);
            }
        } catch (Throwable th) {
            try {
                if (this.f17918i != null) {
                    this.f17918i.mo37102a(0, this.f17919j, th.getMessage(), this.f17923n);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m20663a(final Context context, final String str, final String str2) {
        WebView webView = new WebView(context);
        this.f17921l = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f17921l.getSettings().setCacheMode(2);
        this.f17921l.getSettings().setLoadsImagesAutomatically(false);
        this.f17921l.setWebViewClient(new WebViewClient() {
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                try {
                    webView.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (C6787f.this.f17926q) {
                        int unused = C6787f.this.f17924o = 0;
                        C6787f.m20672c(C6787f.this);
                        return;
                    }
                    C6787f.this.f17913c = false;
                    if (webView.getTag() == null) {
                        webView.setTag("has_first_started");
                    } else {
                        C6787f.this.f17912b = true;
                    }
                    synchronized (C6787f.f17911d) {
                        String unused2 = C6787f.this.f17919j = str;
                        if (C6787f.this.f17918i == null || !C6787f.this.f17918i.mo37104a(str)) {
                            C6787f.m20675e(C6787f.this);
                        } else {
                            boolean unused3 = C6787f.this.f17926q = true;
                            C6787f.m20672c(C6787f.this);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
                if (com.mbridge.msdk.click.C6787f.m20678h(r3.f17936d) == false) goto L_0x0080;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
                r4 = new java.util.HashMap();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
                if (com.mbridge.msdk.click.C6787f.m20679i(r3.f17936d).getUrl() == null) goto L_0x0076;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
                r4.put(com.google.common.net.HttpHeaders.REFERER, com.mbridge.msdk.click.C6787f.m20679i(r3.f17936d).getUrl());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
                com.mbridge.msdk.click.C6787f.m20679i(r3.f17936d).loadUrl(r5, r4);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x0080, code lost:
                com.mbridge.msdk.click.C6787f.m20679i(r3.f17936d).loadUrl(r5);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
                return true;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean shouldOverrideUrlLoading(android.webkit.WebView r4, java.lang.String r5) {
                /*
                    r3 = this;
                    java.lang.String r4 = com.mbridge.msdk.click.C6787f.f17911d
                    monitor-enter(r4)
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C6787f.this     // Catch:{ all -> 0x008a }
                    r1 = 1
                    r0.f17913c = r1     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C6787f.this     // Catch:{ all -> 0x008a }
                    r0.m20674d()     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C6787f.this     // Catch:{ all -> 0x008a }
                    boolean r0 = r0.f17926q     // Catch:{ all -> 0x008a }
                    if (r0 == 0) goto L_0x0023
                    com.mbridge.msdk.click.f r5 = com.mbridge.msdk.click.C6787f.this     // Catch:{ all -> 0x008a }
                    r5.m20671c()     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r5 = com.mbridge.msdk.click.C6787f.this     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.C6787f.m20672c(r5)     // Catch:{ all -> 0x008a }
                    monitor-exit(r4)     // Catch:{ all -> 0x008a }
                    return r1
                L_0x0023:
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C6787f.this     // Catch:{ all -> 0x008a }
                    java.lang.String unused = r0.f17919j = r5     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C6787f.this     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f$a r0 = r0.f17918i     // Catch:{ all -> 0x008a }
                    if (r0 == 0) goto L_0x004d
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C6787f.this     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f$a r0 = r0.f17918i     // Catch:{ all -> 0x008a }
                    boolean r0 = r0.mo37105b(r5)     // Catch:{ all -> 0x008a }
                    if (r0 == 0) goto L_0x004d
                    com.mbridge.msdk.click.f r5 = com.mbridge.msdk.click.C6787f.this     // Catch:{ all -> 0x008a }
                    boolean unused = r5.f17926q = r1     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r5 = com.mbridge.msdk.click.C6787f.this     // Catch:{ all -> 0x008a }
                    r5.m20671c()     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r5 = com.mbridge.msdk.click.C6787f.this     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.C6787f.m20672c(r5)     // Catch:{ all -> 0x008a }
                    monitor-exit(r4)     // Catch:{ all -> 0x008a }
                    return r1
                L_0x004d:
                    monitor-exit(r4)     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r4 = com.mbridge.msdk.click.C6787f.this
                    boolean r4 = r4.f17922m
                    if (r4 == 0) goto L_0x0080
                    java.util.HashMap r4 = new java.util.HashMap
                    r4.<init>()
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C6787f.this
                    android.webkit.WebView r0 = r0.f17921l
                    java.lang.String r0 = r0.getUrl()
                    if (r0 == 0) goto L_0x0076
                    java.lang.String r0 = "Referer"
                    com.mbridge.msdk.click.f r2 = com.mbridge.msdk.click.C6787f.this
                    android.webkit.WebView r2 = r2.f17921l
                    java.lang.String r2 = r2.getUrl()
                    r4.put(r0, r2)
                L_0x0076:
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C6787f.this
                    android.webkit.WebView r0 = r0.f17921l
                    r0.loadUrl(r5, r4)
                    goto L_0x0089
                L_0x0080:
                    com.mbridge.msdk.click.f r4 = com.mbridge.msdk.click.C6787f.this
                    android.webkit.WebView r4 = r4.f17921l
                    r4.loadUrl(r5)
                L_0x0089:
                    return r1
                L_0x008a:
                    r5 = move-exception
                    monitor-exit(r4)     // Catch:{ all -> 0x008a }
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C6787f.C67892.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
            }

            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                synchronized (C6787f.f17911d) {
                    boolean unused = C6787f.this.f17926q = true;
                    C6787f.this.m20668b();
                    C6787f.m20672c(C6787f.this);
                }
                if (C6787f.this.f17918i != null) {
                    C6787f.this.f17918i.mo37102a(i, webView.getUrl(), str, C6787f.this.f17923n);
                }
            }

            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                try {
                    if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                        sslErrorHandler.cancel();
                    }
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                        new C8582d(context).mo58067a(str, str2, webView.getUrl());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    webView.loadUrl("javascript:window.navigator.vibrate([]);");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.f17921l.setWebChromeClient(new WebChromeClient() {
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
                    try {
                        webView.loadUrl("javascript:window.navigator.vibrate([]);");
                        if (!C6787f.this.f17926q && !C6787f.this.f17913c) {
                            C6787f.m20682l(C6787f.this);
                        }
                        if (C6787f.this.f17918i != null) {
                            C6787f.this.f17918i.mo37106c(webView.getUrl());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m20668b() {
        m20674d();
        m20671c();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m20671c() {
        this.f17916g.removeCallbacks(this.f17928s);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m20674d() {
        this.f17916g.removeCallbacks(this.f17927r);
    }

    /* renamed from: c */
    static /* synthetic */ void m20672c(C6787f fVar) {
        synchronized (f17911d) {
            try {
                fVar.m20668b();
                if (fVar.f17918i != null) {
                    fVar.f17918i.mo37103a(fVar.f17919j, fVar.f17925p, fVar.f17923n);
                }
            } catch (Exception e) {
                C8672v.m24878d(f17911d, e.getMessage());
            } catch (Throwable th) {
                C8672v.m24878d(f17911d, th.getMessage());
            }
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m20675e(C6787f fVar) {
        fVar.m20671c();
        fVar.f17916g.postDelayed(fVar.f17928s, (long) fVar.f17914e);
    }

    /* renamed from: l */
    static /* synthetic */ void m20682l(C6787f fVar) {
        fVar.m20674d();
        fVar.f17916g.postDelayed(fVar.f17927r, (long) fVar.f17915f);
    }

    /* renamed from: m */
    static /* synthetic */ void m20683m(C6787f fVar) {
        synchronized (f17911d) {
            try {
                fVar.m20668b();
                fVar.f17921l.destroy();
                if (fVar.f17918i != null) {
                    fVar.f17918i.mo37103a(fVar.f17919j, fVar.f17925p, fVar.f17923n);
                }
            } catch (Exception e) {
                C8672v.m24878d(f17911d, e.getMessage());
            } catch (Throwable th) {
                C8672v.m24878d(f17911d, th.getMessage());
            }
        }
    }
}
