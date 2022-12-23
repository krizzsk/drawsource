package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.adexpress.p093b.C2553d;
import com.bytedance.sdk.component.adexpress.p093b.C2556f;
import com.bytedance.sdk.component.adexpress.p093b.C2565m;
import com.bytedance.sdk.component.adexpress.p093b.C2566n;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.C3704y;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView;
import com.bytedance.sdk.openadsdk.core.p149e.C3409g;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.dislike.C3716b;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.com.bytedance.overseas.sdk.p185a.C3967b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.b */
/* compiled from: BrandBannerController */
public class C3530b {

    /* renamed from: a */
    public static final Set<String> f8890a = new HashSet<String>() {
        {
            add(".jpeg");
            add(".png");
            add(".bmp");
            add(".gif");
            add(".jpg");
            add(".webp");
        }
    };

    /* renamed from: b */
    private final Context f8891b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3534b f8892c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2566n f8893d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public NativeExpressView f8894e;

    /* renamed from: f */
    private int f8895f;

    /* renamed from: g */
    private int f8896g;

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.b$c */
    /* compiled from: BrandBannerController */
    interface C3539c {
        /* renamed from: a */
        void mo20072a(int i, int i2);

        /* renamed from: b */
        void mo20077b(String str);

        /* renamed from: c */
        void mo20078c(String str);
    }

    public C3530b(Context context, NativeExpressView nativeExpressView, C3431n nVar) {
        this.f8891b = context;
        this.f8894e = nativeExpressView;
        m11078a(nativeExpressView);
        this.f8892c = new C3534b(context, nVar, this.f8895f, this.f8896g);
    }

    /* renamed from: a */
    private void m11078a(NativeExpressView nativeExpressView) {
        C3553k a = BannerExpressBackupView.m10011a(nativeExpressView.getExpectExpressWidth(), nativeExpressView.getExpectExpressHeight());
        if (nativeExpressView.getExpectExpressWidth() <= 0 || nativeExpressView.getExpectExpressHeight() <= 0) {
            int c = C3904y.m12877c(this.f8891b);
            this.f8895f = c;
            this.f8896g = Float.valueOf(((float) c) / a.f8953b).intValue();
        } else {
            this.f8895f = C3904y.m12886e(this.f8891b, (float) nativeExpressView.getExpectExpressWidth());
            this.f8896g = C3904y.m12886e(this.f8891b, (float) nativeExpressView.getExpectExpressHeight());
        }
        int i = this.f8895f;
        if (i > 0 && i > C3904y.m12877c(this.f8891b)) {
            float c2 = ((float) C3904y.m12877c(this.f8891b)) / ((float) this.f8895f);
            this.f8895f = C3904y.m12877c(this.f8891b);
            this.f8896g = Float.valueOf(((float) this.f8896g) * c2).intValue();
        }
    }

    /* renamed from: a */
    public void mo20062a(C2566n nVar) {
        this.f8893d = nVar;
    }

    /* renamed from: a */
    public void mo20061a() {
        C3534b bVar = this.f8892c;
        if (bVar != null) {
            bVar.mo16641a((C2556f) new C2556f() {
                /* renamed from: a */
                public void mo16639a(View view, C2565m mVar) {
                    if (C3530b.this.f8894e != null && view != null) {
                        C3530b.this.f8894e.removeView(view);
                        if (view.getParent() != null) {
                            ((ViewGroup) view.getParent()).removeView(view);
                        }
                        C3530b.this.f8894e.addView(view, new ViewGroup.LayoutParams(-1, -1));
                        if (C3530b.this.f8893d != null) {
                            C3530b.this.f8893d.mo16730a(C3530b.this.f8892c, mVar);
                        }
                    } else if (C3530b.this.f8893d != null) {
                        C3530b.this.f8893d.mo16731a_(106);
                    }
                }

                /* renamed from: a */
                public void mo16638a(int i) {
                    if (C3530b.this.f8893d != null) {
                        C3530b.this.f8893d.mo16731a_(106);
                    }
                }
            });
            return;
        }
        C2566n nVar = this.f8893d;
        if (nVar != null) {
            nVar.mo16731a_(106);
        }
    }

    /* renamed from: b */
    public void mo20066b() {
        C3534b bVar = this.f8892c;
        if (bVar != null) {
            bVar.mo20071a();
            this.f8892c = null;
        }
        this.f8893d = null;
        this.f8894e = null;
    }

    /* renamed from: a */
    public void mo20063a(TTAdDislike tTAdDislike) {
        C3534b bVar = this.f8892c;
        if (bVar != null) {
            bVar.mo20073a(tTAdDislike);
        }
    }

    /* renamed from: a */
    public void mo20064a(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        C3534b bVar = this.f8892c;
        if (bVar != null) {
            bVar.mo20074a(tTDislikeDialogAbstract);
        }
    }

    /* renamed from: a */
    public void mo20065a(String str) {
        C3534b bVar = this.f8892c;
        if (bVar != null) {
            bVar.mo20075a(str);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.b$b */
    /* compiled from: BrandBannerController */
    public static class C3534b implements C2553d<View>, C3539c {

        /* renamed from: a */
        AtomicBoolean f8900a = new AtomicBoolean(false);

        /* renamed from: b */
        AtomicBoolean f8901b = new AtomicBoolean(false);

        /* renamed from: c */
        WeakReference<ImageView> f8902c;

        /* renamed from: d */
        private C3716b f8903d;

        /* renamed from: e */
        private TTDislikeDialogAbstract f8904e;

        /* renamed from: f */
        private String f8905f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final Context f8906g;

        /* renamed from: h */
        private final int f8907h;

        /* renamed from: i */
        private final int f8908i;

        /* renamed from: j */
        private FrameLayout f8909j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C3431n f8910k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C3557n f8911l;

        /* renamed from: m */
        private int f8912m;

        /* renamed from: n */
        private SSWebView f8913n;

        /* renamed from: o */
        private C2556f f8914o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f8915p = 0;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public List<String> f8916q;

        /* renamed from: c */
        public int mo16632c() {
            return 5;
        }

        public C3534b(Context context, C3431n nVar, int i, int i2) {
            this.f8906g = context;
            this.f8907h = i;
            this.f8908i = i2;
            this.f8910k = nVar;
            this.f8912m = C3904y.m12886e(context, 3.0f);
            this.f8911l = new C3557n(context);
            m11096f();
        }

        /* renamed from: f */
        private void m11096f() {
            FrameLayout frameLayout = new FrameLayout(this.f8906g);
            this.f8909j = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.f8907h, this.f8908i);
            }
            layoutParams.width = this.f8907h;
            layoutParams.height = this.f8908i;
            layoutParams.gravity = 17;
            this.f8909j.setLayoutParams(layoutParams);
            this.f8909j.addView(m11099i());
            this.f8909j.addView(m11097g());
            ImageView h = m11098h();
            this.f8909j.addView(h);
            this.f8902c = new WeakReference<>(h);
        }

        /* renamed from: a */
        public void mo16641a(C2556f fVar) {
            if (!this.f8900a.get()) {
                this.f8901b.set(false);
                if (this.f8906g == null) {
                    fVar.mo16638a(106);
                    return;
                }
                this.f8915p = 0;
                this.f8914o = fVar;
                this.f8913n.mo17837a((String) null, this.f8910k.mo19592az(), "text/html", "UTF-8", (String) null);
            }
        }

        /* renamed from: g */
        private View m11097g() {
            View inflate = LayoutInflater.from(this.f8906g).inflate(C2914t.m8159f(this.f8906g, "tt_backup_ad1"), (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = this.f8912m;
            layoutParams.leftMargin = this.f8912m;
            inflate.setLayoutParams(layoutParams);
            inflate.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTWebsiteActivity.m8711a(C3534b.this.f8906g, C3534b.this.f8910k, "banner_ad");
                }
            });
            return inflate;
        }

        /* renamed from: h */
        private ImageView m11098h() {
            ImageView imageView = new ImageView(this.f8906g);
            imageView.setImageDrawable(this.f8906g.getResources().getDrawable(C2914t.m8157d(this.f8906g, "tt_dislike_icon2")));
            int e = C3904y.m12886e(this.f8906g, 15.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(e, e);
            layoutParams.gravity = GravityCompat.END;
            layoutParams.rightMargin = this.f8912m;
            layoutParams.topMargin = this.f8912m;
            imageView.setLayoutParams(layoutParams);
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C3534b.this.mo20076b();
                }
            });
            return imageView;
        }

        /* renamed from: i */
        private SSWebView m11099i() {
            SSWebView b = C3540c.m11115a().mo20085b();
            this.f8913n = b;
            if (b == null) {
                this.f8913n = new SSWebView(this.f8906g);
            }
            C3540c.m11115a().mo20088c(this.f8913n);
            this.f8913n.setWebViewClient(new C3533a(this.f8911l, this));
            this.f8913n.setWebChromeClient(new WebChromeClient() {
                public void onProgressChanged(WebView webView, int i) {
                    if (!C3534b.this.f8901b.get()) {
                        super.onProgressChanged(webView, i);
                        if (C3534b.this.f8915p == 0 && i >= 75) {
                            C3534b.this.mo20079d();
                            C3534b.this.f8901b.set(true);
                        }
                        if (i == 100 && C3534b.this.f8916q != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                JSONArray jSONArray = new JSONArray();
                                for (String put : C3534b.this.f8916q) {
                                    jSONArray.put(put);
                                }
                                jSONObject.put("error_url", jSONArray);
                                C3090e.m8919b(C3534b.this.f8906g, C3534b.this.f8910k, "banner_ad", "html_banner_error_url", jSONObject);
                                List unused = C3534b.this.f8916q = null;
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            });
            this.f8913n.getWebView().setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    C3534b.this.f8911l.onTouchEvent(motionEvent);
                    return false;
                }
            });
            this.f8913n.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.f8913n;
        }

        /* renamed from: e */
        public View mo16642e() {
            return this.f8909j;
        }

        /* renamed from: a */
        public void mo20071a() {
            this.f8909j = null;
            this.f8903d = null;
            this.f8904e = null;
            this.f8914o = null;
            this.f8910k = null;
            this.f8911l = null;
            if (this.f8913n != null) {
                C3540c.m11115a().mo20084a(this.f8913n);
            }
            this.f8900a.set(true);
            this.f8901b.set(false);
        }

        /* renamed from: a */
        public void mo20073a(TTAdDislike tTAdDislike) {
            if (tTAdDislike instanceof C3716b) {
                this.f8903d = (C3716b) tTAdDislike;
            }
        }

        /* renamed from: a */
        public void mo20074a(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            C3431n nVar;
            if (!(tTDislikeDialogAbstract == null || (nVar = this.f8910k) == null)) {
                tTDislikeDialogAbstract.setMaterialMeta(nVar);
            }
            this.f8904e = tTDislikeDialogAbstract;
        }

        /* renamed from: b */
        public void mo20076b() {
            TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f8904e;
            if (tTDislikeDialogAbstract != null) {
                tTDislikeDialogAbstract.show();
                return;
            }
            C3716b bVar = this.f8903d;
            if (bVar != null) {
                bVar.showDislikeDialog();
            } else {
                TTDelegateActivity.m8479a(this.f8910k, this.f8905f);
            }
        }

        /* renamed from: a */
        public void mo20075a(String str) {
            this.f8905f = str;
        }

        /* renamed from: b */
        public void mo20077b(String str) {
            if (!TextUtils.isEmpty(str)) {
                boolean z = false;
                if (str.contains("play.google.com/store/apps/details?id=")) {
                    z = C3967b.m13077b(this.f8906g, str.substring(str.indexOf("?id=") + 4));
                }
                if (!z) {
                    C3704y.m12114a(this.f8906g, this.f8910k, -1, (TTNativeAd) null, (TTNativeExpressAd) null, "", true, str);
                }
                if (this.f8911l != null) {
                    View view = null;
                    WeakReference<ImageView> weakReference = this.f8902c;
                    if (weakReference != null) {
                        view = (View) weakReference.get();
                    }
                    C3409g a = this.f8911l.mo20099a(this.f8906g, (View) this.f8909j.getParent(), view);
                    HashMap hashMap = new HashMap();
                    int i = 1;
                    hashMap.put("click_scence", 1);
                    Context context = this.f8906g;
                    C3431n nVar = this.f8910k;
                    if (!this.f8911l.mo20101b()) {
                        i = 2;
                    }
                    C3090e.m8901a(context, "click", nVar, a, "banner_ad", true, (Map<String, Object>) hashMap, i);
                }
                C3557n nVar2 = this.f8911l;
                if (nVar2 != null) {
                    nVar2.mo20100a();
                }
            }
        }

        /* renamed from: d */
        public void mo20079d() {
            if (this.f8914o != null) {
                C2565m mVar = new C2565m();
                mVar.mo16707a(true);
                mVar.mo16703a((double) C3904y.m12882d(this.f8906g, (float) this.f8907h));
                mVar.mo16710b((double) C3904y.m12882d(this.f8906g, (float) this.f8908i));
                this.f8914o.mo16639a(this.f8909j, mVar);
            }
        }

        /* renamed from: a */
        public void mo20072a(int i, int i2) {
            this.f8915p = i2;
            C2556f fVar = this.f8914o;
            if (fVar != null) {
                fVar.mo16638a(i);
            }
            C3090e.m8893a(this.f8906g, this.f8910k, "banner_ad", "render_html_fail");
        }

        /* renamed from: c */
        public void mo20078c(String str) {
            if (this.f8916q == null) {
                this.f8916q = new ArrayList();
            }
            this.f8916q.add(str);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.b$a */
    /* compiled from: BrandBannerController */
    static class C3533a extends SSWebView.C2926a {

        /* renamed from: a */
        C3557n f8898a;

        /* renamed from: b */
        C3539c f8899b;

        public C3533a(C3557n nVar, C3539c cVar) {
            this.f8898a = nVar;
            this.f8899b = cVar;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C3539c cVar;
            C3557n nVar = this.f8898a;
            if (nVar == null || !nVar.mo20101b() || (cVar = this.f8899b) == null) {
                return false;
            }
            cVar.mo20077b(str);
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r1 = r2.getUrl().toString();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceivedHttpError(android.webkit.WebView r1, android.webkit.WebResourceRequest r2, android.webkit.WebResourceResponse r3) {
            /*
                r0 = this;
                super.onReceivedHttpError(r1, r2, r3)
                if (r2 == 0) goto L_0x0040
                if (r3 == 0) goto L_0x0040
                int r1 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                if (r1 < r3) goto L_0x0040
                boolean r1 = r2.isForMainFrame()
                if (r1 == 0) goto L_0x0040
                android.net.Uri r1 = r2.getUrl()
                if (r1 == 0) goto L_0x0040
                android.net.Uri r1 = r2.getUrl()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "."
                int r2 = r1.lastIndexOf(r2)
                if (r2 <= 0) goto L_0x0040
                java.lang.String r2 = r1.substring(r2)
                java.lang.String r2 = r2.toLowerCase()
                java.util.Set<java.lang.String> r3 = com.bytedance.sdk.openadsdk.core.nativeexpress.C3530b.f8890a
                boolean r2 = r3.contains(r2)
                if (r2 == 0) goto L_0x0040
                com.bytedance.sdk.openadsdk.core.nativeexpress.b$c r2 = r0.f8899b
                if (r2 == 0) goto L_0x0040
                r2.mo20078c(r1)
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.C3530b.C3533a.onReceivedHttpError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (Build.VERSION.SDK_INT >= 23 && webResourceRequest != null && webResourceRequest.isForMainFrame() && webResourceError != null) {
                String str = null;
                if (webResourceRequest.getUrl() != null) {
                    str = webResourceRequest.getUrl().toString();
                }
                m11089a(str, webResourceError.getErrorCode(), webResourceError.getDescription().toString());
            }
        }

        /* renamed from: a */
        private void m11089a(String str, int i, String str2) {
            C3539c cVar = this.f8899b;
            if (cVar != null) {
                cVar.mo20072a(106, i);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (Build.VERSION.SDK_INT < 23) {
                m11089a(str2, i, str);
            }
        }
    }
}
