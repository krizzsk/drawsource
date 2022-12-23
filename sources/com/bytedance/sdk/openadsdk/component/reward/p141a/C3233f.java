package com.bytedance.sdk.openadsdk.component.reward.p141a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.p094c.C2573c;
import com.bytedance.sdk.component.p088a.C2491e;
import com.bytedance.sdk.component.p088a.C2492f;
import com.bytedance.sdk.component.p088a.C2512r;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.C3158a;
import com.bytedance.sdk.openadsdk.common.C3160c;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3666w;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import com.bytedance.sdk.openadsdk.core.p149e.C3418l;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.core.video.p161b.C3597a;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3685b;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3686c;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3687d;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p128b.C3104n;
import com.bytedance.sdk.openadsdk.p128b.C3118u;
import com.bytedance.sdk.openadsdk.p169g.C3741a;
import com.bytedance.sdk.openadsdk.p169g.C3745e;
import com.bytedance.sdk.openadsdk.p169g.C3749h;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.bytedance.sdk.openadsdk.p176j.C3793a;
import com.bytedance.sdk.openadsdk.p176j.C3797c;
import com.bytedance.sdk.openadsdk.p176j.C3826f;
import com.bytedance.sdk.openadsdk.p176j.C3828g;
import com.bytedance.sdk.openadsdk.p178l.C3857b;
import com.bytedance.sdk.openadsdk.p178l.C3881j;
import com.bytedance.sdk.openadsdk.p178l.C3882k;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.f */
/* compiled from: RewardFullWebViewManager */
public class C3233f {

    /* renamed from: I */
    private static final C3826f.C3827a f7638I = new C3826f.C3827a() {
        /* renamed from: a */
        public void mo18472a(String str, String str2) {
            C2905l.m8111b(str, str2);
        }

        /* renamed from: a */
        public void mo18473a(String str, String str2, Throwable th) {
            C2905l.m8115c(str, str2, th);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: A */
    public float f7639A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public long f7640B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public SparseArray<C3362c.C3363a> f7641C = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f7642D = true;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public float f7643E = -1.0f;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public float f7644F = -1.0f;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C3160c f7645G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f7646H;

    /* renamed from: a */
    C3666w f7647a;

    /* renamed from: b */
    C3666w f7648b;

    /* renamed from: c */
    protected boolean f7649c = true;

    /* renamed from: d */
    protected String f7650d;

    /* renamed from: e */
    C3104n f7651e;

    /* renamed from: f */
    AtomicBoolean f7652f = new AtomicBoolean(true);

    /* renamed from: g */
    int f7653g = 0;

    /* renamed from: h */
    String f7654h = "";

    /* renamed from: i */
    protected C3118u f7655i;

    /* renamed from: j */
    boolean f7656j = false;

    /* renamed from: k */
    protected C3741a f7657k = new C3741a() {
        /* renamed from: a */
        public int mo19053a() {
            int measuredHeight = C3233f.this.f7665s != null ? C3233f.this.f7665s.getMeasuredHeight() : -1;
            C2905l.m8114c("TTAndroidObject", "mWebView>>>>height=" + measuredHeight);
            return measuredHeight <= 0 ? C3904y.m12881d(C3513m.m10963a()) : measuredHeight;
        }

        /* renamed from: b */
        public int mo19054b() {
            int measuredWidth = C3233f.this.f7665s != null ? C3233f.this.f7665s.getMeasuredWidth() : -1;
            C2905l.m8114c("TTAndroidObject", "mWebView>>>>width=" + measuredWidth);
            return measuredWidth <= 0 ? C3904y.m12877c(C3513m.m10963a()) : measuredWidth;
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Activity f7658l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C3431n f7659m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f7660n;

    /* renamed from: o */
    private int f7661o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f7662p;

    /* renamed from: q */
    private int f7663q;

    /* renamed from: r */
    private int f7664r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public SSWebView f7665s;

    /* renamed from: t */
    private SSWebView f7666t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f7667u = false;

    /* renamed from: v */
    private boolean f7668v = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C3828g f7669w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public View f7670x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public View f7671y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public float f7672z;

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.f$a */
    /* compiled from: RewardFullWebViewManager */
    public interface C3245a {
        /* renamed from: a */
        void mo18380a(WebView webView, int i);

        /* renamed from: a */
        void mo18381a(WebView webView, String str);

        /* renamed from: a */
        void mo18382a(WebView webView, String str, Bitmap bitmap);
    }

    /* renamed from: q */
    public void mo19040q() {
    }

    public C3233f(Activity activity) {
        this.f7658l = activity;
    }

    /* renamed from: a */
    public void mo19014a(C3431n nVar, String str, int i, boolean z) {
        if (!this.f7668v) {
            this.f7668v = true;
            this.f7659m = nVar;
            this.f7660n = str;
            this.f7661o = i;
            this.f7662p = z;
            mo19007a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19007a() {
        C3160c cVar;
        this.f7670x = this.f7658l.findViewById(16908290);
        boolean d = C3418l.m10270d(this.f7659m);
        this.f7646H = d;
        if (!d || (cVar = this.f7645G) == null) {
            Activity activity = this.f7658l;
            SSWebView sSWebView = (SSWebView) activity.findViewById(C2914t.m8158e(activity, "tt_reward_browser_webview"));
            this.f7665s = sSWebView;
            if (sSWebView == null || C3431n.m10307a(this.f7659m)) {
                C3904y.m12853a((View) this.f7665s, 8);
            } else {
                this.f7665s.mo17833a();
            }
        } else {
            this.f7665s = cVar.mo18794d();
        }
        Activity activity2 = this.f7658l;
        SSWebView sSWebView2 = (SSWebView) activity2.findViewById(C2914t.m8158e(activity2, "tt_browser_webview_loading"));
        this.f7666t = sSWebView2;
        if (sSWebView2 == null || C3431n.m10307a(this.f7659m)) {
            C3904y.m12853a((View) this.f7666t, 8);
        } else {
            this.f7666t.mo17833a();
        }
        SSWebView sSWebView3 = this.f7665s;
        if (sSWebView3 != null) {
            sSWebView3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    if (C3233f.this.f7665s != null && C3233f.this.f7665s.getViewTreeObserver() != null) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            C3233f.this.f7665s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        } else {
                            C3233f.this.f7665s.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        }
                        int measuredWidth = C3233f.this.f7665s.getMeasuredWidth();
                        int measuredHeight = C3233f.this.f7665s.getMeasuredHeight();
                        if (C3233f.this.f7665s.getVisibility() == 0) {
                            C3233f.this.mo19010a(measuredWidth, measuredHeight);
                        }
                    }
                }
            });
        }
        SSWebView sSWebView4 = this.f7666t;
        if (sSWebView4 != null) {
            sSWebView4.setLandingPage(true);
            this.f7666t.setTag(C3434p.m10489a(this.f7659m) ? this.f7660n : "landingpage_endcard");
            this.f7666t.setWebViewClient(new SSWebView.C2926a());
            C3431n nVar = this.f7659m;
            if (nVar != null) {
                this.f7666t.setMaterialMeta(nVar.mo19559aC());
            }
        }
    }

    /* renamed from: a */
    public void mo19016a(Boolean bool, String str, boolean z, C3745e eVar, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("rit_scene", str);
        }
        if (C3434p.m10489a(this.f7659m)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 2);
        }
        this.f7655i = m9460A();
        C3666w wVar = new C3666w(this.f7658l);
        this.f7647a = wVar;
        int i = 7;
        C3666w a = wVar.mo20354b(this.f7665s).mo20337a(this.f7659m).mo20364d(this.f7659m.mo19532Y()).mo20368e(this.f7659m.mo19569ac()).mo20353b(bool.booleanValue() ? 7 : 5).mo20340a(this.f7657k).mo20370f(C3898x.m12810i(this.f7659m)).mo20334a(this.f7665s);
        if (m9490z()) {
            str2 = "landingpage_endcard";
        }
        a.mo20360c(str2).mo20346a((Map<String, Object>) hashMap).mo20335a(this.f7655i);
        C3666w wVar2 = new C3666w(this.f7658l);
        this.f7648b = wVar2;
        C3666w e = wVar2.mo20354b(this.f7666t).mo20337a(this.f7659m).mo20364d(this.f7659m.mo19532Y()).mo20368e(this.f7659m.mo19569ac());
        if (!bool.booleanValue()) {
            i = 5;
        }
        e.mo20353b(i).mo20334a(this.f7666t).mo20370f(C3898x.m12810i(this.f7659m)).mo20335a(this.f7655i);
        if (C3434p.m10489a(this.f7659m)) {
            mo19015a(eVar, z);
        }
        this.f7647a.mo20344a((C3749h) new C3749h() {
            /* renamed from: a */
            public void mo19055a() {
                SSWebView a = C3233f.this.f7665s;
                if (a == null) {
                    C2905l.m8111b("RewardFullWebViewManage", "webView has destroy when onPauseWebView");
                    return;
                }
                a.mo17861k();
                C2905l.m8111b("RewardFullWebViewManage", "js make webView onPause OK");
            }

            /* renamed from: b */
            public void mo19056b() {
                SSWebView a = C3233f.this.f7665s;
                if (a == null) {
                    C2905l.m8111b("RewardFullWebViewManage", "webView has destroy when onPauseWebViewTimers");
                    return;
                }
                a.mo17864n();
                C2905l.m8111b("RewardFullWebViewManage", "js make webView pauseTimers OK");
            }
        });
    }

    /* renamed from: a */
    public void mo19015a(final C3745e eVar, boolean z) {
        C2512r a;
        C32449 r7;
        if (C3457h.m10580d().mo19779s()) {
            C3826f.m12455a(f7638I);
        }
        C32427 r1 = new C3793a() {
            /* renamed from: a */
            public void mo18481a(JSONObject jSONObject) {
            }

            /* renamed from: b */
            public void mo18483b(JSONObject jSONObject) {
            }

            /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x006e  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.bytedance.sdk.openadsdk.p176j.C3798d mo18480a() {
                /*
                    r7 = this;
                    java.lang.String r0 = com.bytedance.sdk.openadsdk.common.C3158a.m9140f()
                    int r1 = r0.hashCode()
                    r2 = 1653(0x675, float:2.316E-42)
                    r3 = 4
                    r4 = 3
                    r5 = 2
                    r6 = 1
                    if (r1 == r2) goto L_0x004a
                    r2 = 1684(0x694, float:2.36E-42)
                    if (r1 == r2) goto L_0x0040
                    r2 = 1715(0x6b3, float:2.403E-42)
                    if (r1 == r2) goto L_0x0036
                    r2 = 1746(0x6d2, float:2.447E-42)
                    if (r1 == r2) goto L_0x002c
                    r2 = 3649301(0x37af15, float:5.11376E-39)
                    if (r1 == r2) goto L_0x0022
                    goto L_0x0054
                L_0x0022:
                    java.lang.String r1 = "wifi"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0054
                    r0 = r3
                    goto L_0x0055
                L_0x002c:
                    java.lang.String r1 = "5g"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0054
                    r0 = r4
                    goto L_0x0055
                L_0x0036:
                    java.lang.String r1 = "4g"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0054
                    r0 = r5
                    goto L_0x0055
                L_0x0040:
                    java.lang.String r1 = "3g"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0054
                    r0 = r6
                    goto L_0x0055
                L_0x004a:
                    java.lang.String r1 = "2g"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0054
                    r0 = 0
                    goto L_0x0055
                L_0x0054:
                    r0 = -1
                L_0x0055:
                    if (r0 == 0) goto L_0x006e
                    if (r0 == r6) goto L_0x006b
                    if (r0 == r5) goto L_0x0068
                    if (r0 == r4) goto L_0x0065
                    if (r0 == r3) goto L_0x0062
                    com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p176j.C3798d.TYPE_UNKNOWN
                    return r0
                L_0x0062:
                    com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p176j.C3798d.TYPE_WIFI
                    return r0
                L_0x0065:
                    com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p176j.C3798d.TYPE_5G
                    return r0
                L_0x0068:
                    com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p176j.C3798d.TYPE_4G
                    return r0
                L_0x006b:
                    com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p176j.C3798d.TYPE_3G
                    return r0
                L_0x006e:
                    com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p176j.C3798d.TYPE_2G
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.C32427.mo18480a():com.bytedance.sdk.openadsdk.j.d");
            }

            /* renamed from: b */
            public void mo18482b() {
                C3233f.this.f7647a.mo20366d(true);
                C3745e eVar = eVar;
                if (eVar != null) {
                    eVar.mo18400a();
                }
            }

            /* renamed from: c */
            public void mo18484c(JSONObject jSONObject) {
                C3090e.m8919b(C3513m.m10963a(), C3233f.this.f7659m, C3233f.this.f7660n, "playable_track", jSONObject);
            }
        };
        C32438 r72 = new C3797c() {
            /* renamed from: a */
            public void mo18485a(String str, JSONObject jSONObject) {
                C3233f.this.f7647a.mo20350a(str, jSONObject);
            }
        };
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BidResponsedEx.KEY_CID, this.f7659m.mo19532Y());
            jSONObject.put("log_extra", this.f7659m.mo19569ac());
            C3828g a2 = C3828g.m12461a(C3513m.m10963a(), this.f7665s.getWebView(), r72, r1).mo20662f(this.f7650d).mo20659e(C3158a.m9135a(C3513m.m10963a())).mo20637a(C3158a.m9134a()).mo20639a(jSONObject).mo20638a("sdkEdition", C3158a.m9137c()).mo20646b(C3158a.m9139e()).mo20656d(C3158a.m9138d()).mo20652c(false).mo20640a(z);
            this.f7669w = a2;
            if (a2 == null) {
                r7 = new C2885g("PlayablePlugin_init") {
                    public void run() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("PlayablePlugin_is_null", true);
                            C3753b.m12287a().mo20573a("PlayablePlugin_init", jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                };
                C2882e.m8036a(r7, 5);
            }
        } catch (Throwable unused) {
            if (this.f7669w == null) {
                r7 = new C2885g("PlayablePlugin_init") {
                    public void run() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("PlayablePlugin_is_null", true);
                            C3753b.m12287a().mo20573a("PlayablePlugin_init", jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                };
            }
        }
        if (this.f7669w != null && !TextUtils.isEmpty(C3434p.m10490b(this.f7659m))) {
            this.f7669w.mo20651c(C3434p.m10490b(this.f7659m));
        }
        C3828g gVar = this.f7669w;
        if (gVar != null) {
            Set<String> j = gVar.mo20670j();
            final WeakReference weakReference = new WeakReference(this.f7669w);
            for (String next : j) {
                if (!"subscribe_app_ad".equals(next) && !"adInfo".equals(next) && !"webview_time_track".equals(next) && !"download_app_ad".equals(next) && (a = this.f7647a.mo20330a()) != null) {
                    a.mo16525a(next, (C2491e<?, ?>) new C2491e<JSONObject, JSONObject>() {
                        /* renamed from: a */
                        public JSONObject mo16486a(JSONObject jSONObject, C2492f fVar) throws Exception {
                            try {
                                C3828g gVar = (C3828g) weakReference.get();
                                if (gVar == null) {
                                    return null;
                                }
                                return gVar.mo20654c(mo16471a(), jSONObject);
                            } catch (Throwable unused) {
                                return null;
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19010a(int i, int i2) {
        Activity activity;
        if (this.f7647a != null && (activity = this.f7658l) != null && !activity.isFinishing()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("width", i);
                jSONObject.put("height", i2);
                this.f7647a.mo20350a(MraidJsMethods.RESIZE, jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo19018a(boolean z) {
        this.f7649c = z;
    }

    /* renamed from: b */
    public void mo19021b() {
        if (TextUtils.isEmpty(this.f7650d) || !this.f7650d.contains("play.google.com/store")) {
            SSWebView sSWebView = this.f7665s;
            if (sSWebView != null && this.f7649c) {
                C3882k.m12668a(sSWebView, this.f7650d + "&is_pre_render=1");
                return;
            }
            return;
        }
        this.f7656j = true;
    }

    /* renamed from: b */
    public void mo19022b(int i, int i2) {
        this.f7663q = i;
        this.f7664r = i2;
    }

    /* renamed from: c */
    public SSWebView mo19024c() {
        return this.f7665s;
    }

    /* renamed from: d */
    public SSWebView mo19026d() {
        return this.f7666t;
    }

    /* renamed from: e */
    public C3666w mo19028e() {
        return this.f7647a;
    }

    /* renamed from: f */
    public C3666w mo19029f() {
        return this.f7648b;
    }

    /* renamed from: g */
    public C3104n mo19030g() {
        return this.f7651e;
    }

    /* renamed from: h */
    public void mo19031h() {
        this.f7650d = C3434p.m10492d(this.f7659m);
        float an = this.f7659m.mo19580an();
        if (!TextUtils.isEmpty(this.f7650d)) {
            if (this.f7661o == 1) {
                if (this.f7650d.contains("?")) {
                    this.f7650d += "&orientation=portrait";
                } else {
                    this.f7650d += "?orientation=portrait";
                }
            }
            if (this.f7650d.contains("?")) {
                this.f7650d += "&height=" + this.f7664r + "&width=" + this.f7663q + "&aspect_ratio=" + an;
            } else {
                this.f7650d += "?height=" + this.f7664r + "&width=" + this.f7663q + "&aspect_ratio=" + an;
            }
        }
        if (!C3434p.m10489a(this.f7659m)) {
            this.f7650d = C3857b.m12582a(this.f7650d);
        }
    }

    /* renamed from: i */
    public void mo19032i() {
        SSWebView sSWebView;
        C3104n nVar = this.f7651e;
        if (!(nVar == null || (sSWebView = this.f7665s) == null)) {
            nVar.mo18696a(sSWebView);
        }
        this.f7665s = null;
        C3118u uVar = this.f7655i;
        if (uVar != null) {
            uVar.mo18724a(true);
            this.f7655i.mo18744m();
        }
        C3666w wVar = this.f7647a;
        if (wVar != null) {
            wVar.mo20379n();
        }
        C3104n nVar2 = this.f7651e;
        if (nVar2 != null) {
            nVar2.mo18703f();
        }
        C3828g gVar = this.f7669w;
        if (gVar != null) {
            gVar.mo20682v();
        }
        this.f7658l = null;
    }

    /* renamed from: a */
    public void mo19009a(int i) {
        C3431n nVar;
        C3904y.m12853a((View) this.f7665s, i);
        SSWebView sSWebView = this.f7665s;
        if (sSWebView != null) {
            C3904y.m12853a((View) sSWebView.getWebView(), i);
        }
        if (this.f7665s != null && (nVar = this.f7659m) != null) {
            if (nVar.mo19512E() || C3434p.m10489a(this.f7659m)) {
                this.f7665s.setLandingPage(true);
                this.f7665s.setTag(C3434p.m10489a(this.f7659m) ? this.f7660n : "landingpage_endcard");
                C3431n nVar2 = this.f7659m;
                if (nVar2 != null) {
                    this.f7665s.setMaterialMeta(nVar2.mo19559aC());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19013a(C3160c cVar) {
        this.f7645G = cVar;
    }

    /* renamed from: a */
    public void mo19008a(float f) {
        C3904y.m12852a((View) this.f7665s, f);
    }

    /* renamed from: b */
    public void mo19023b(boolean z) {
        Activity activity;
        if (this.f7647a != null && (activity = this.f7658l) != null && !activity.isFinishing()) {
            try {
                this.f7647a.mo20356b(z);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo19017a(String str, final C3245a aVar) {
        SSWebView sSWebView;
        SSWebView sSWebView2 = this.f7665s;
        if (!(sSWebView2 == null || sSWebView2.getWebView() == null)) {
            C3104n a = new C3104n(this.f7658l, this.f7659m, this.f7665s.getWebView()).mo18688a(true);
            this.f7651e = a;
            a.mo18688a(true);
            C3104n nVar = this.f7651e;
            if (m9490z()) {
                str = "landingpage_endcard";
            }
            nVar.mo18698a(str);
            final C3245a aVar2 = aVar;
            this.f7665s.setWebViewClient(new C3687d(C3513m.m10963a(), this.f7647a, this.f7659m.mo19532Y(), this.f7651e, this.f7659m.mo19512E() || C3434p.m10489a(this.f7659m)) {
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    if (!C3434p.m10489a(C3233f.this.f7659m)) {
                        return super.shouldInterceptRequest(webView, str);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    WebResourceResponse a = C3597a.m11391a().mo20167a(C3233f.this.f7659m.mo19517J().mo15956k(), C3233f.this.f7659m.mo19517J().mo15955j(), str);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (C3233f.this.f7655i != null) {
                        C2573c.C2574a a2 = C2573c.m6630a(str);
                        int i = a != null ? 1 : 2;
                        if (a2 == C2573c.C2574a.HTML) {
                            C3233f.this.f7655i.mo18722a(str, currentTimeMillis, currentTimeMillis2, i);
                        } else if (a2 == C2573c.C2574a.JS) {
                            C3233f.this.f7655i.mo18729b(str, currentTimeMillis, currentTimeMillis2, i);
                        }
                    }
                    return a;
                }

                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    try {
                        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                    } catch (Throwable th) {
                        C2905l.m8115c("RewardFullWebViewManage", "shouldInterceptRequest error1", th);
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    Log.i("RewardFullWebViewManage", "onReceivedError: description=" + str + "  url =" + str2);
                    if (!C3233f.this.m9468a(str2)) {
                        C3233f.this.f7652f.set(false);
                        C3233f.this.f7653g = i;
                        C3233f.this.f7654h = str;
                        try {
                            if (C3233f.this.f7669w != null) {
                                C3233f.this.f7669w.mo20642a(i, str, str2);
                            }
                        } catch (Throwable unused) {
                        }
                        if (C3233f.this.f7655i != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (Build.VERSION.SDK_INT >= 23) {
                                    jSONObject.put("code", i);
                                    jSONObject.put("msg", str);
                                }
                                C3233f.this.f7655i.mo18723a(jSONObject);
                            } catch (JSONException unused2) {
                            }
                        }
                        super.onReceivedError(webView, i, str, str2);
                    }
                }

                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    if (!(webResourceError == null || webResourceRequest == null || webResourceRequest.getUrl() == null)) {
                        Log.i("RewardFullWebViewManage", "onReceivedError WebResourceError : description=" + webResourceError.getDescription() + "  url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest == null || webResourceRequest.getUrl() == null || !C3233f.this.m9468a(webResourceRequest.getUrl().toString())) {
                        C3233f.this.f7652f.set(false);
                        if (C3233f.this.f7655i != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (Build.VERSION.SDK_INT >= 23 && webResourceError != null) {
                                    jSONObject.put("code", webResourceError.getErrorCode());
                                    jSONObject.put("msg", webResourceError.getDescription());
                                }
                                C3233f.this.f7655i.mo18723a(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                        if (webResourceError != null) {
                            C3233f.this.f7653g = webResourceError.getErrorCode();
                            C3233f.this.f7654h = String.valueOf(webResourceError.getDescription());
                        }
                        if (webResourceRequest != null) {
                            super.onReceivedError(webView, webResourceRequest, webResourceError);
                        }
                    }
                }

                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    try {
                        if (C3233f.this.f7669w != null) {
                            C3233f.this.f7669w.mo20645a(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                        }
                    } catch (Throwable unused) {
                    }
                    if (!(webResourceRequest == null || webResourceRequest.getUrl() == null)) {
                        Log.i("RewardFullWebViewManage", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest != null && !TextUtils.isEmpty(C3233f.this.f7650d) && C3233f.this.f7650d.equals(String.valueOf(webResourceRequest.getUrl()))) {
                        C3233f.this.f7652f.set(false);
                        if (webResourceResponse != null) {
                            C3233f.this.f7653g = webResourceResponse.getStatusCode();
                            C3233f.this.f7654h = "onReceivedHttpError";
                        }
                    }
                    if (C3233f.this.f7655i != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (Build.VERSION.SDK_INT >= 21 && webResourceResponse != null) {
                                jSONObject.put("code", webResourceResponse.getStatusCode());
                                jSONObject.put("msg", webResourceResponse.getReasonPhrase());
                            }
                            C3233f.this.f7655i.mo18723a(jSONObject);
                        } catch (JSONException unused2) {
                        }
                    }
                    if (webResourceRequest != null) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    }
                }

                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    if (C3233f.this.f7655i != null) {
                        C3233f.this.f7655i.mo18737f();
                    }
                    if (C3233f.this.f7669w != null) {
                        C3233f.this.f7669w.mo20666h(str);
                    }
                    C3245a aVar = aVar2;
                    if (aVar != null) {
                        aVar.mo18381a(webView, str);
                    }
                }

                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    if (C3233f.this.f7655i != null) {
                        C3233f.this.f7655i.mo18735e();
                    }
                    if (C3233f.this.f7669w != null) {
                        C3233f.this.f7669w.mo20665g(str);
                    }
                    C3245a aVar = aVar2;
                    if (aVar != null) {
                        aVar.mo18382a(webView, str, bitmap);
                    }
                }
            });
            if (!(!this.f7659m.mo19512E() || (sSWebView = this.f7665s) == null || sSWebView.getWebView() == null)) {
                this.f7665s.getWebView().setOnTouchListener(new View.OnTouchListener() {
                    /* JADX WARNING: Can't wrap try/catch for region: R(6:32|33|34|(1:38)|39|40) */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0152 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public boolean onTouch(android.view.View r20, android.view.MotionEvent r21) {
                        /*
                            r19 = this;
                            r1 = r19
                            java.lang.String r0 = "tt_id_click_end"
                            java.lang.String r2 = "tt_id_click_begin"
                            r3 = 0
                            int r4 = r21.getActionMasked()     // Catch:{ all -> 0x0360 }
                            r5 = 0
                            r7 = 3
                            r8 = -1
                            r9 = 2
                            r10 = 1
                            if (r4 == 0) goto L_0x00e9
                            if (r4 == r10) goto L_0x00e7
                            if (r4 == r9) goto L_0x001f
                            if (r4 == r7) goto L_0x001c
                            r12 = r8
                            goto L_0x015f
                        L_0x001c:
                            r7 = 4
                            goto L_0x00e7
                        L_0x001f:
                            float r2 = r21.getRawX()     // Catch:{ all -> 0x0360 }
                            float r4 = r21.getRawY()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f7672z     // Catch:{ all -> 0x0360 }
                            float r2 = r2 - r7
                            float r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0360 }
                            int r7 = com.bytedance.sdk.openadsdk.core.C3513m.f8794a     // Catch:{ all -> 0x0360 }
                            float r7 = (float) r7     // Catch:{ all -> 0x0360 }
                            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                            if (r2 >= 0) goto L_0x004c
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            float r2 = r2.f7639A     // Catch:{ all -> 0x0360 }
                            float r2 = r4 - r2
                            float r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0360 }
                            int r7 = com.bytedance.sdk.openadsdk.core.C3513m.f8794a     // Catch:{ all -> 0x0360 }
                            float r7 = (float) r7     // Catch:{ all -> 0x0360 }
                            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                            if (r2 < 0) goto L_0x0051
                        L_0x004c:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            boolean unused = r2.f7642D = r3     // Catch:{ all -> 0x0360 }
                        L_0x0051:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f7643E     // Catch:{ all -> 0x0360 }
                            float r11 = r21.getX()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r12 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            float r12 = r12.f7672z     // Catch:{ all -> 0x0360 }
                            float r11 = r11 - r12
                            float r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0360 }
                            float r7 = r7 + r11
                            float unused = r2.f7643E = r7     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f7644F     // Catch:{ all -> 0x0360 }
                            float r11 = r21.getY()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r12 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            float r12 = r12.f7639A     // Catch:{ all -> 0x0360 }
                            float r11 = r11 - r12
                            float r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0360 }
                            float r7 = r7 + r11
                            float unused = r2.f7644F = r7     // Catch:{ all -> 0x0360 }
                            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            long r13 = r2.f7640B     // Catch:{ all -> 0x0360 }
                            long r11 = r11 - r13
                            r13 = 200(0xc8, double:9.9E-322)
                            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                            r7 = 1090519040(0x41000000, float:8.0)
                            if (r2 <= 0) goto L_0x00b0
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            float r2 = r2.f7643E     // Catch:{ all -> 0x0360 }
                            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                            if (r2 > 0) goto L_0x00ae
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            float r2 = r2.f7644F     // Catch:{ all -> 0x0360 }
                            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                            if (r2 <= 0) goto L_0x00b0
                        L_0x00ae:
                            r2 = r10
                            goto L_0x00b1
                        L_0x00b0:
                            r2 = r9
                        L_0x00b1:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r11 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            boolean r11 = r11.f7646H     // Catch:{ all -> 0x0360 }
                            if (r11 == 0) goto L_0x00e4
                            com.bytedance.sdk.openadsdk.component.reward.a.f r11 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            float r11 = r11.f7639A     // Catch:{ all -> 0x0360 }
                            float r11 = r4 - r11
                            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                            if (r7 <= 0) goto L_0x00ce
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.common.c r7 = r7.f7645G     // Catch:{ all -> 0x0360 }
                            r7.mo18790a()     // Catch:{ all -> 0x0360 }
                        L_0x00ce:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f7639A     // Catch:{ all -> 0x0360 }
                            float r4 = r4 - r7
                            r7 = -1056964608(0xffffffffc1000000, float:-8.0)
                            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                            if (r4 >= 0) goto L_0x00e4
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.common.c r4 = r4.f7645G     // Catch:{ all -> 0x0360 }
                            r4.mo18792b()     // Catch:{ all -> 0x0360 }
                        L_0x00e4:
                            r12 = r2
                            goto L_0x015f
                        L_0x00e7:
                            r12 = r7
                            goto L_0x015f
                        L_0x00e9:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            android.util.SparseArray r7 = new android.util.SparseArray     // Catch:{ all -> 0x0360 }
                            r7.<init>()     // Catch:{ all -> 0x0360 }
                            android.util.SparseArray unused = r4.f7641C = r7     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r21.getRawX()     // Catch:{ all -> 0x0360 }
                            float unused = r4.f7672z = r7     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r21.getRawY()     // Catch:{ all -> 0x0360 }
                            float unused = r4.f7639A = r7     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0360 }
                            long unused = r4.f7640B = r11     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ Exception -> 0x0152 }
                            com.bytedance.sdk.component.widget.SSWebView r4 = r4.f7665s     // Catch:{ Exception -> 0x0152 }
                            android.webkit.WebView r4 = r4.getWebView()     // Catch:{ Exception -> 0x0152 }
                            android.content.Context r7 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()     // Catch:{ Exception -> 0x0152 }
                            int r7 = com.bytedance.sdk.component.utils.C2914t.m8158e(r7, r2)     // Catch:{ Exception -> 0x0152 }
                            java.lang.Object r4 = r4.getTag(r7)     // Catch:{ Exception -> 0x0152 }
                            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x0152 }
                            long r11 = r4.longValue()     // Catch:{ Exception -> 0x0152 }
                            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                            if (r4 <= 0) goto L_0x0152
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ Exception -> 0x0152 }
                            long r13 = r4.f7640B     // Catch:{ Exception -> 0x0152 }
                            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                            if (r4 >= 0) goto L_0x0152
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ Exception -> 0x0152 }
                            long unused = r4.f7640B = r11     // Catch:{ Exception -> 0x0152 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ Exception -> 0x0152 }
                            com.bytedance.sdk.component.widget.SSWebView r4 = r4.f7665s     // Catch:{ Exception -> 0x0152 }
                            android.content.Context r7 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()     // Catch:{ Exception -> 0x0152 }
                            int r2 = com.bytedance.sdk.component.utils.C2914t.m8158e(r7, r2)     // Catch:{ Exception -> 0x0152 }
                            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0152 }
                            r4.setTag(r2, r7)     // Catch:{ Exception -> 0x0152 }
                        L_0x0152:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                            float unused = r2.f7643E = r4     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            float unused = r2.f7644F = r4     // Catch:{ all -> 0x0360 }
                            r12 = r3
                        L_0x015f:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            android.util.SparseArray r2 = r2.f7641C     // Catch:{ all -> 0x0360 }
                            int r4 = r21.getActionMasked()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.core.b.c$a r7 = new com.bytedance.sdk.openadsdk.core.b.c$a     // Catch:{ all -> 0x0360 }
                            float r11 = r21.getSize()     // Catch:{ all -> 0x0360 }
                            double r13 = (double) r11     // Catch:{ all -> 0x0360 }
                            float r11 = r21.getPressure()     // Catch:{ all -> 0x0360 }
                            double r8 = (double) r11     // Catch:{ all -> 0x0360 }
                            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0360 }
                            r11 = r7
                            r15 = r8
                            r11.<init>(r12, r13, r15, r17)     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            int r2 = r21.getAction()     // Catch:{ all -> 0x0360 }
                            if (r2 != r10) goto L_0x0368
                            int r2 = r20.getVisibility()     // Catch:{ all -> 0x0360 }
                            if (r2 != 0) goto L_0x0368
                            float r2 = r20.getAlpha()     // Catch:{ all -> 0x0360 }
                            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x0360 }
                            int r2 = r2.intValue()     // Catch:{ all -> 0x0360 }
                            if (r2 != r10) goto L_0x0368
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            boolean r2 = r2.f7667u     // Catch:{ all -> 0x0360 }
                            if (r2 != 0) goto L_0x0368
                            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0360 }
                            r2.<init>()     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "down_x"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f7672z     // Catch:{ all -> 0x0360 }
                            double r7 = (double) r7     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "down_y"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f7639A     // Catch:{ all -> 0x0360 }
                            double r7 = (double) r7     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "down_time"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            long r7 = r7.f7640B     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "up_x"
                            float r7 = r21.getRawX()     // Catch:{ all -> 0x0360 }
                            double r7 = (double) r7     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "up_y"
                            float r7 = r21.getRawY()     // Catch:{ all -> 0x0360 }
                            double r7 = (double) r7     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ Exception -> 0x021e }
                            com.bytedance.sdk.component.widget.SSWebView r4 = r4.f7665s     // Catch:{ Exception -> 0x021e }
                            android.webkit.WebView r4 = r4.getWebView()     // Catch:{ Exception -> 0x021e }
                            android.content.Context r9 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()     // Catch:{ Exception -> 0x021e }
                            int r9 = com.bytedance.sdk.component.utils.C2914t.m8158e(r9, r0)     // Catch:{ Exception -> 0x021e }
                            java.lang.Object r4 = r4.getTag(r9)     // Catch:{ Exception -> 0x021e }
                            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x021e }
                            long r11 = r4.longValue()     // Catch:{ Exception -> 0x021e }
                            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                            if (r4 <= 0) goto L_0x021e
                            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                            if (r4 >= 0) goto L_0x021e
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ Exception -> 0x021d }
                            com.bytedance.sdk.component.widget.SSWebView r4 = r4.f7665s     // Catch:{ Exception -> 0x021d }
                            android.content.Context r5 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()     // Catch:{ Exception -> 0x021d }
                            int r0 = com.bytedance.sdk.component.utils.C2914t.m8158e(r5, r0)     // Catch:{ Exception -> 0x021d }
                            r5 = -1
                            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x021d }
                            r4.setTag(r0, r5)     // Catch:{ Exception -> 0x021d }
                        L_0x021d:
                            r7 = r11
                        L_0x021e:
                            java.lang.String r0 = "up_time"
                            r2.put(r0, r7)     // Catch:{ all -> 0x0360 }
                            r0 = 2
                            int[] r4 = new int[r0]     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            boolean r0 = r0.f7646H     // Catch:{ all -> 0x0360 }
                            if (r0 == 0) goto L_0x0248
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r5 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            android.app.Activity r5 = r5.f7658l     // Catch:{ all -> 0x0360 }
                            android.content.Context r6 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()     // Catch:{ all -> 0x0360 }
                            java.lang.String r7 = "tt_title_bar_feedback"
                            int r6 = com.bytedance.sdk.component.utils.C2914t.m8158e(r6, r7)     // Catch:{ all -> 0x0360 }
                            android.view.View r5 = r5.findViewById(r6)     // Catch:{ all -> 0x0360 }
                            android.view.View unused = r0.f7671y = r5     // Catch:{ all -> 0x0360 }
                            goto L_0x0261
                        L_0x0248:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r5 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            android.app.Activity r5 = r5.f7658l     // Catch:{ all -> 0x0360 }
                            android.content.Context r6 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()     // Catch:{ all -> 0x0360 }
                            java.lang.String r7 = "tt_top_dislike"
                            int r6 = com.bytedance.sdk.component.utils.C2914t.m8158e(r6, r7)     // Catch:{ all -> 0x0360 }
                            android.view.View r5 = r5.findViewById(r6)     // Catch:{ all -> 0x0360 }
                            android.view.View unused = r0.f7671y = r5     // Catch:{ all -> 0x0360 }
                        L_0x0261:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r0 = r0.f7671y     // Catch:{ all -> 0x0360 }
                            if (r0 == 0) goto L_0x029e
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r0 = r0.f7671y     // Catch:{ all -> 0x0360 }
                            r0.getLocationOnScreen(r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "button_x"
                            r5 = r4[r3]     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r5)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "button_y"
                            r4 = r4[r10]     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "button_width"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r4 = r4.f7671y     // Catch:{ all -> 0x0360 }
                            int r4 = r4.getWidth()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "button_height"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r4 = r4.f7671y     // Catch:{ all -> 0x0360 }
                            int r4 = r4.getHeight()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                        L_0x029e:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r0 = r0.f7670x     // Catch:{ all -> 0x0360 }
                            if (r0 == 0) goto L_0x02de
                            r0 = 2
                            int[] r4 = new int[r0]     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r0 = r0.f7670x     // Catch:{ all -> 0x0360 }
                            r0.getLocationOnScreen(r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "ad_x"
                            r5 = r4[r3]     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r5)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "ad_y"
                            r4 = r4[r10]     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "width"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r4 = r4.f7670x     // Catch:{ all -> 0x0360 }
                            int r4 = r4.getWidth()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "height"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r4 = r4.f7670x     // Catch:{ all -> 0x0360 }
                            int r4 = r4.getHeight()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                        L_0x02de:
                            java.lang.String r0 = "toolType"
                            r4 = r21
                            int r5 = r4.getToolType(r3)     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r5)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "deviceId"
                            int r5 = r21.getDeviceId()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r5)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "source"
                            int r4 = r21.getSource()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "ft"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            android.util.SparseArray r4 = r4.f7641C     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.core.h r5 = com.bytedance.sdk.openadsdk.core.C3457h.m10580d()     // Catch:{ all -> 0x0360 }
                            boolean r5 = r5.mo19752b()     // Catch:{ all -> 0x0360 }
                            if (r5 == 0) goto L_0x030f
                            r5 = r10
                            goto L_0x0310
                        L_0x030f:
                            r5 = 2
                        L_0x0310:
                            org.json.JSONObject r4 = com.bytedance.sdk.openadsdk.core.p149e.C3409g.m10166a(r4, r5)     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "user_behavior_type"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            boolean r4 = r4.f7642D     // Catch:{ all -> 0x0360 }
                            if (r4 == 0) goto L_0x0323
                            r4 = r10
                            goto L_0x0324
                        L_0x0323:
                            r4 = 2
                        L_0x0324:
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "click_scence"
                            r4 = 2
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            boolean r0 = r0.f7662p     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "click"
                            if (r0 == 0) goto L_0x0349
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            android.app.Activity r0 = r0.f7658l     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r5 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.core.e.n r5 = r5.f7659m     // Catch:{ all -> 0x0360 }
                            java.lang.String r6 = "rewarded_video"
                            com.bytedance.sdk.openadsdk.p128b.C3090e.m8897a((android.content.Context) r0, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r5, (java.lang.String) r6, (java.lang.String) r4, (org.json.JSONObject) r2)     // Catch:{ all -> 0x0360 }
                            goto L_0x035a
                        L_0x0349:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            android.app.Activity r0 = r0.f7658l     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r5 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.core.e.n r5 = r5.f7659m     // Catch:{ all -> 0x0360 }
                            java.lang.String r6 = "fullscreen_interstitial_ad"
                            com.bytedance.sdk.openadsdk.p128b.C3090e.m8897a((android.content.Context) r0, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r5, (java.lang.String) r6, (java.lang.String) r4, (org.json.JSONObject) r2)     // Catch:{ all -> 0x0360 }
                        L_0x035a:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.this     // Catch:{ all -> 0x0360 }
                            boolean unused = r0.f7667u = r10     // Catch:{ all -> 0x0360 }
                            goto L_0x0368
                        L_0x0360:
                            r0 = move-exception
                            java.lang.String r2 = "RewardFullWebViewManage"
                            java.lang.String r4 = "TouchRecordTool onTouch error"
                            android.util.Log.e(r2, r4, r0)
                        L_0x0368:
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f.C32372.onTouch(android.view.View, android.view.MotionEvent):boolean");
                    }
                });
            }
            this.f7665s.setWebChromeClient(new C3686c(this.f7647a, this.f7651e) {
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    C3245a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo18380a(webView, i);
                    }
                }
            });
            mo19012a(this.f7665s);
            if (Build.VERSION.SDK_INT >= 24) {
                this.f7665s.setLayerType(1, (Paint) null);
            }
            this.f7665s.setBackgroundColor(-1);
            this.f7665s.setDisplayZoomControls(false);
        }
        mo19021b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m9468a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        C3431n nVar = this.f7659m;
        if (nVar == null || !nVar.mo19512E() || !str.endsWith(".mp4")) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    private boolean m9490z() {
        String str = this.f7650d;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo19011a(DownloadListener downloadListener) {
        SSWebView sSWebView = this.f7665s;
        if (sSWebView != null && downloadListener != null) {
            sSWebView.setDownloadListener(downloadListener);
        }
    }

    /* renamed from: j */
    public boolean mo19033j() {
        return this.f7652f.get();
    }

    /* renamed from: a */
    public void mo19012a(SSWebView sSWebView) {
        if (sSWebView != null) {
            C3685b.m12035a((Context) this.f7658l).mo20447a(false).mo20449b(false).mo20448a(sSWebView.getWebView());
            sSWebView.setUserAgentString(C3881j.m12666a(sSWebView.getWebView(), (int) BuildConfig.VERSION_CODE));
            if (Build.VERSION.SDK_INT >= 21) {
                sSWebView.setMixedContentMode(0);
            }
        }
    }

    /* renamed from: k */
    public void mo19034k() {
        C3118u uVar = this.f7655i;
        if (uVar != null) {
            uVar.mo18741j();
        }
        C3104n nVar = this.f7651e;
        if (nVar != null) {
            nVar.mo18702e();
        }
    }

    /* renamed from: l */
    public void mo19035l() {
        SSWebView sSWebView = this.f7665s;
        if (sSWebView != null) {
            sSWebView.mo17861k();
        }
        C3666w wVar = this.f7647a;
        if (wVar != null) {
            wVar.mo20378m();
            this.f7647a.mo20356b(false);
            mo19025c(false);
            mo19020a(true, false);
        }
        C3828g gVar = this.f7669w;
        if (gVar != null) {
            gVar.mo20677q();
            this.f7669w.mo20647b(false);
        }
    }

    /* renamed from: c */
    public void mo19025c(boolean z) {
        try {
            if (this.f7669w != null) {
                this.f7669w.mo20647b(z);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z ? 1 : 0);
            this.f7647a.mo20350a("viewableChange", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo19020a(boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, z2);
            this.f7647a.mo20350a("endcard_control_event", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public void mo19027d(boolean z) {
        Activity activity;
        if (this.f7647a != null && (activity = this.f7658l) != null && !activity.isFinishing()) {
            C3828g gVar = this.f7669w;
            if (gVar != null) {
                gVar.mo20640a(z);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("endcard_mute", z);
                this.f7647a.mo20350a("volumeChange", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: m */
    public void mo19036m() {
        SSWebView sSWebView = this.f7665s;
        if (sSWebView != null) {
            sSWebView.mo17859i();
        }
        C3666w wVar = this.f7647a;
        if (wVar != null) {
            wVar.mo20377l();
            SSWebView sSWebView2 = this.f7665s;
            if (sSWebView2 != null) {
                if (sSWebView2.getVisibility() == 0) {
                    this.f7647a.mo20356b(true);
                    mo19025c(true);
                    mo19020a(false, true);
                } else {
                    this.f7647a.mo20356b(false);
                    mo19025c(false);
                    mo19020a(true, false);
                }
            }
        }
        C3104n nVar = this.f7651e;
        if (nVar != null) {
            nVar.mo18701d();
        }
        C3828g gVar = this.f7669w;
        if (gVar != null) {
            gVar.mo20678r();
            if (C3904y.m12884d((View) this.f7665s)) {
                this.f7669w.mo20647b(true);
            }
        }
    }

    /* renamed from: n */
    public int mo19037n() {
        return this.f7653g;
    }

    /* renamed from: o */
    public String mo19038o() {
        return this.f7654h;
    }

    /* renamed from: p */
    public String mo19039p() {
        return this.f7650d;
    }

    /* renamed from: r */
    public void mo19041r() {
        C3118u uVar = this.f7655i;
        if (uVar != null) {
            uVar.mo18740i();
        }
    }

    /* renamed from: a */
    public void mo19019a(boolean z, int i, String str) {
        C3118u uVar = this.f7655i;
        if (uVar != null) {
            if (z) {
                uVar.mo18725b();
            } else {
                uVar.mo18720a(i, str);
            }
        }
    }

    /* renamed from: s */
    public void mo19042s() {
        C3118u uVar = this.f7655i;
        if (uVar != null) {
            uVar.mo18739h();
        }
    }

    /* renamed from: t */
    public void mo19043t() {
        C3104n nVar = this.f7651e;
        if (nVar != null) {
            nVar.mo18690a(System.currentTimeMillis());
        }
    }

    /* renamed from: u */
    public boolean mo19044u() {
        return this.f7656j;
    }

    /* renamed from: v */
    public void mo19045v() {
        C3118u uVar = this.f7655i;
        if (uVar != null) {
            uVar.mo18731c();
            this.f7655i.mo18733d();
        }
    }

    /* renamed from: w */
    public void mo19046w() {
        C3118u uVar = this.f7655i;
        if (uVar != null) {
            uVar.mo18742k();
        }
    }

    /* renamed from: A */
    private C3118u m9460A() {
        return new C3118u(C3434p.m10489a(this.f7659m) ? 3 : 2, this.f7662p ? "rewarded_video" : "fullscreen_interstitial_ad", this.f7659m);
    }

    /* renamed from: x */
    public boolean mo19047x() {
        C3666w wVar = this.f7647a;
        if (wVar == null) {
            return false;
        }
        return wVar.mo20375j();
    }

    /* renamed from: y */
    public boolean mo19048y() {
        SSWebView sSWebView = this.f7665s;
        if (sSWebView == null || sSWebView.getWebView() == null) {
            return true;
        }
        return false;
    }
}
