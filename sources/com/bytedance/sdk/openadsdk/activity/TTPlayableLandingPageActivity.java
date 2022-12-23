package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.p088a.C2491e;
import com.bytedance.sdk.component.p088a.C2492f;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.utils.C2923x;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.common.C3158a;
import com.bytedance.sdk.openadsdk.core.C3356b;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3580t;
import com.bytedance.sdk.openadsdk.core.C3666w;
import com.bytedance.sdk.openadsdk.core.C3706z;
import com.bytedance.sdk.openadsdk.core.p144b.C3359a;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import com.bytedance.sdk.openadsdk.core.p144b.C3364d;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3685b;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3686c;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3687d;
import com.bytedance.sdk.openadsdk.dislike.C3716b;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p128b.C3104n;
import com.bytedance.sdk.openadsdk.p128b.C3118u;
import com.bytedance.sdk.openadsdk.p169g.C3744d;
import com.bytedance.sdk.openadsdk.p169g.C3746f;
import com.bytedance.sdk.openadsdk.p169g.C3747g;
import com.bytedance.sdk.openadsdk.p176j.C3793a;
import com.bytedance.sdk.openadsdk.p176j.C3797c;
import com.bytedance.sdk.openadsdk.p176j.C3826f;
import com.bytedance.sdk.openadsdk.p176j.C3828g;
import com.bytedance.sdk.openadsdk.p178l.C3881j;
import com.bytedance.sdk.openadsdk.p178l.C3882k;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import com.com.bytedance.overseas.sdk.p185a.C3969d;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class TTPlayableLandingPageActivity extends Activity implements C2923x.C2924a, C3364d, C3746f {

    /* renamed from: J */
    private static final C3826f.C3827a f6912J = new C3826f.C3827a() {
        /* renamed from: a */
        public void mo18472a(String str, String str2) {
            C2905l.m8111b(str, str2);
        }

        /* renamed from: a */
        public void mo18473a(String str, String str2, Throwable th) {
            C2905l.m8115c(str, str2, th);
        }
    };

    /* renamed from: A */
    private C3968c f6913A;

    /* renamed from: B */
    private AtomicBoolean f6914B = new AtomicBoolean(false);

    /* renamed from: C */
    private String f6915C;

    /* renamed from: D */
    private int f6916D = 0;

    /* renamed from: E */
    private int f6917E = 0;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C3828g f6918F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f6919G = false;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C3118u f6920H;

    /* renamed from: I */
    private C3104n f6921I;

    /* renamed from: a */
    TTAdDislike f6922a;

    /* renamed from: b */
    protected C3747g f6923b;

    /* renamed from: c */
    protected C3744d f6924c = new C3744d() {
        /* renamed from: a */
        public void mo18401a() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && C3434p.m10493e(TTPlayableLandingPageActivity.this.f6944w) && C3434p.m10495g(TTPlayableLandingPageActivity.this.f6944w)) {
                TTPlayableLandingPageActivity.this.f6945x.removeMessages(2);
                TTPlayableLandingPageActivity.this.f6945x.sendMessage(TTPlayableLandingPageActivity.this.m8549a(1));
            }
        }

        /* renamed from: b */
        public void mo18403b() {
            if (C3434p.m10493e(TTPlayableLandingPageActivity.this.f6944w) && C3434p.m10494f(TTPlayableLandingPageActivity.this.f6944w)) {
                TTPlayableLandingPageActivity.this.f6945x.sendMessageDelayed(TTPlayableLandingPageActivity.this.m8549a(0), 1000);
            }
        }

        /* renamed from: a */
        public void mo18402a(int i) {
            if (C3434p.m10493e(TTPlayableLandingPageActivity.this.f6944w) && TTPlayableLandingPageActivity.this.f6935n != null) {
                TTPlayableLandingPageActivity.this.f6935n.setProgress(i);
            }
        }
    };

    /* renamed from: d */
    private SSWebView f6925d;

    /* renamed from: e */
    private SSWebView f6926e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f6927f = true;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f6928g = true;

    /* renamed from: h */
    private RelativeLayout f6929h;

    /* renamed from: i */
    private View f6930i;

    /* renamed from: j */
    private ImageView f6931j;

    /* renamed from: k */
    private Context f6932k;

    /* renamed from: l */
    private int f6933l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ProgressBar f6934m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public PlayableLoadingView f6935n;

    /* renamed from: o */
    private String f6936o;

    /* renamed from: p */
    private String f6937p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C3666w f6938q;

    /* renamed from: r */
    private C3666w f6939r;

    /* renamed from: s */
    private int f6940s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f6941t;

    /* renamed from: u */
    private String f6942u;

    /* renamed from: v */
    private final String f6943v = "embeded_ad";
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C3431n f6944w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C2923x f6945x = new C2923x(Looper.getMainLooper(), this);
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f6946y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f6947z;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Message m8549a(int i) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.arg1 = i;
        return obtain;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
            C3513m.m10965a(this);
        } catch (Throwable unused) {
        }
        m8552a(bundle);
        C3431n nVar = this.f6944w;
        if (nVar != null) {
            int h = C3434p.m10496h(nVar);
            if (h != 0) {
                if (h == 1) {
                    setRequestedOrientation(1);
                } else if (h == 2) {
                    setRequestedOrientation(0);
                }
            } else if (Build.VERSION.SDK_INT >= 18) {
                setRequestedOrientation(14);
            } else {
                setRequestedOrientation(1);
            }
            this.f6932k = this;
            setContentView(C2914t.m8159f(this, "tt_activity_ttlandingpage_playable"));
            m8571h();
            m8565e();
            mo18458a();
            m8579l();
            m8568f();
            m8569g();
            C3118u uVar = this.f6920H;
            if (uVar != null) {
                uVar.mo18739h();
            }
            C3747g gVar = new C3747g(getApplicationContext());
            this.f6923b = gVar;
            gVar.mo20529a((C3746f) this);
        }
    }

    /* renamed from: d */
    private void m8562d() {
        if (this.f6918F == null) {
            if (C3457h.m10580d().mo19779s()) {
                C3826f.m12455a(f6912J);
            }
            C30186 r0 = new C3793a() {
                /* renamed from: a */
                public void mo18481a(JSONObject jSONObject) {
                }

                /* renamed from: b */
                public void mo18482b() {
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.C30186.mo18480a():com.bytedance.sdk.openadsdk.j.d");
                }

                /* renamed from: c */
                public void mo18484c(JSONObject jSONObject) {
                    C3090e.m8919b(TTPlayableLandingPageActivity.this.getApplicationContext(), TTPlayableLandingPageActivity.this.f6944w, "embeded_ad", "playable_track", jSONObject);
                }
            };
            C30197 r1 = new C3797c() {
                /* renamed from: a */
                public void mo18485a(String str, JSONObject jSONObject) {
                    TTPlayableLandingPageActivity.this.f6938q.mo20350a(str, jSONObject);
                }
            };
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(BidResponsedEx.KEY_CID, this.f6936o);
                jSONObject.put("log_extra", this.f6937p);
                this.f6918F = C3828g.m12461a(getApplicationContext(), this.f6925d.getWebView(), r1, r0).mo20662f(this.f6941t).mo20659e(C3158a.m9135a(C3513m.m10963a())).mo20637a(C3158a.m9134a()).mo20639a(jSONObject).mo20646b(C3158a.m9139e()).mo20638a("sdkEdition", C3158a.m9137c()).mo20656d(C3158a.m9138d()).mo20652c(false).mo20640a(this.f6919G).mo20647b(true);
            } catch (Throwable unused) {
            }
            if (!TextUtils.isEmpty(C3434p.m10490b(this.f6944w))) {
                this.f6918F.mo20651c(C3434p.m10490b(this.f6944w));
            }
            Set<String> j = this.f6918F.mo20670j();
            final WeakReference weakReference = new WeakReference(this.f6918F);
            for (String next : j) {
                if (!"subscribe_app_ad".equals(next) && !"adInfo".equals(next) && !"webview_time_track".equals(next) && !"download_app_ad".equals(next)) {
                    this.f6938q.mo20330a().mo16525a(next, (C2491e<?, ?>) new C2491e<JSONObject, JSONObject>() {
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

    /* renamed from: e */
    private void m8565e() {
        if (this.f6944w.mo19519L() == 4) {
            this.f6913A = C3969d.m13089a(this.f6932k, this.f6944w, "interaction");
        }
    }

    /* renamed from: f */
    private void m8568f() {
        int i = C3513m.m10973h().mo19872n(String.valueOf(C3898x.m12794f(this.f6944w))).f8568p;
        if (i >= 0) {
            this.f6945x.sendEmptyMessageDelayed(1, (long) (i * 1000));
        } else {
            C3904y.m12853a((View) this.f6929h, 0);
        }
    }

    /* renamed from: a */
    private void m8552a(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            this.f6933l = intent.getIntExtra("sdk_version", 1);
            this.f6936o = intent.getStringExtra("adid");
            this.f6937p = intent.getStringExtra("log_extra");
            this.f6940s = intent.getIntExtra("source", -1);
            this.f6946y = intent.getBooleanExtra("ad_pending_download", false);
            this.f6941t = intent.getStringExtra("url");
            this.f6915C = intent.getStringExtra("gecko_id");
            this.f6942u = intent.getStringExtra("web_title");
            if (C3948b.m12959c()) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.f6944w = C3356b.m9935a(new JSONObject(stringExtra));
                    } catch (Exception e) {
                        C2905l.m8115c("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", e);
                    }
                }
            } else {
                this.f6944w = C3580t.m11322a().mo20135c();
                C3580t.m11322a().mo20140h();
            }
        }
        if (bundle != null) {
            try {
                this.f6933l = bundle.getInt("sdk_version", 1);
                this.f6936o = bundle.getString("adid");
                this.f6937p = bundle.getString("log_extra");
                this.f6940s = bundle.getInt("source", -1);
                this.f6946y = bundle.getBoolean("ad_pending_download", false);
                this.f6941t = bundle.getString("url");
                this.f6942u = bundle.getString("web_title");
                String string = bundle.getString("material_meta", (String) null);
                if (!TextUtils.isEmpty(string)) {
                    this.f6944w = C3356b.m9935a(new JSONObject(string));
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f6944w == null) {
            C2905l.m8118e("TTPWPActivity", "material is null, no data to display");
            finish();
            return;
        }
        try {
            this.f6919G = C3513m.m10973h().mo19839b(Integer.parseInt(this.f6944w.mo19664x().getCodeId()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m8569g() {
        SSWebView sSWebView = this.f6925d;
        if (sSWebView != null) {
            sSWebView.setLandingPage(true);
            this.f6925d.setTag("landingpage");
            this.f6925d.setMaterialMeta(this.f6944w.mo19559aC());
            C3104n a = new C3104n(this, this.f6944w, this.f6925d.getWebView()).mo18688a(true);
            this.f6921I = a;
            a.mo18698a("embeded_ad");
            this.f6921I.mo18697a(this.f6920H);
            this.f6925d.setWebViewClient(new C3687d(this.f6932k, this.f6938q, this.f6936o, this.f6921I, true) {
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    if (TTPlayableLandingPageActivity.this.f6918F != null) {
                        TTPlayableLandingPageActivity.this.f6918F.mo20665g(str);
                    }
                }

                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0024 */
                /* JADX WARNING: Removed duplicated region for block: B:11:0x002c A[Catch:{ all -> 0x0055 }] */
                /* JADX WARNING: Removed duplicated region for block: B:14:0x003f A[Catch:{ all -> 0x0055 }] */
                /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
                    /*
                        r0 = this;
                        super.onPageFinished(r1, r2)
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this
                        boolean r1 = r1.isFinishing()
                        if (r1 == 0) goto L_0x000c
                        return
                    L_0x000c:
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this
                        com.bytedance.sdk.openadsdk.j.g r1 = r1.f6918F
                        if (r1 == 0) goto L_0x001d
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this
                        com.bytedance.sdk.openadsdk.j.g r1 = r1.f6918F
                        r1.mo20666h((java.lang.String) r2)
                    L_0x001d:
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0024 }
                        com.bytedance.sdk.openadsdk.g.d r1 = r1.f6924c     // Catch:{ all -> 0x0024 }
                        r1.mo18403b()     // Catch:{ all -> 0x0024 }
                    L_0x0024:
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        android.widget.ProgressBar r1 = r1.f6934m     // Catch:{ all -> 0x0055 }
                        if (r1 == 0) goto L_0x0037
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        android.widget.ProgressBar r1 = r1.f6934m     // Catch:{ all -> 0x0055 }
                        r2 = 8
                        r1.setVisibility(r2)     // Catch:{ all -> 0x0055 }
                    L_0x0037:
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        boolean r1 = r1.f6927f     // Catch:{ all -> 0x0055 }
                        if (r1 == 0) goto L_0x0055
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        r1.m8574i()     // Catch:{ all -> 0x0055 }
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        java.lang.String r2 = "py_loading_success"
                        r1.m8555a((java.lang.String) r2)     // Catch:{ all -> 0x0055 }
                        com.bytedance.sdk.openadsdk.core.w r1 = r0.f9537c     // Catch:{ all -> 0x0055 }
                        if (r1 == 0) goto L_0x0055
                        com.bytedance.sdk.openadsdk.core.w r1 = r0.f9537c     // Catch:{ all -> 0x0055 }
                        r2 = 1
                        r1.mo20356b((boolean) r2)     // Catch:{ all -> 0x0055 }
                    L_0x0055:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.C30219.onPageFinished(android.webkit.WebView, java.lang.String):void");
                }

                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    if (!(TTPlayableLandingPageActivity.this.f6941t == null || webResourceRequest == null || webResourceRequest.getUrl() == null || !TTPlayableLandingPageActivity.this.f6941t.equals(webResourceRequest.getUrl().toString()))) {
                        boolean unused = TTPlayableLandingPageActivity.this.f6927f = false;
                    }
                    if (!(TTPlayableLandingPageActivity.this.f6918F == null || webResourceRequest == null)) {
                        try {
                            TTPlayableLandingPageActivity.this.f6918F.mo20645a(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                        } catch (Throwable unused2) {
                        }
                    }
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }

                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    boolean unused = TTPlayableLandingPageActivity.this.f6927f = false;
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    boolean unused = TTPlayableLandingPageActivity.this.f6927f = false;
                    if (TTPlayableLandingPageActivity.this.f6918F != null) {
                        TTPlayableLandingPageActivity.this.f6918F.mo20642a(i, str, str2);
                    }
                }

                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TTPlayableLandingPageActivity.this.f6918F != null) {
                            TTPlayableLandingPageActivity.this.f6918F.mo20668i(str);
                        }
                    } catch (Exception unused) {
                    }
                    return super.shouldInterceptRequest(webView, str);
                }
            });
            m8553a(this.f6925d);
            m8553a(this.f6926e);
            m8576j();
            C3882k.m12668a(this.f6925d, this.f6941t);
            this.f6925d.setWebChromeClient(new C3686c(this.f6938q, this.f6921I) {
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (!TTPlayableLandingPageActivity.this.isFinishing()) {
                        try {
                            TTPlayableLandingPageActivity.this.f6924c.mo18402a(i);
                        } catch (Throwable unused) {
                        }
                        if (TTPlayableLandingPageActivity.this.f6934m == null) {
                            return;
                        }
                        if (i != 100 || !TTPlayableLandingPageActivity.this.f6934m.isShown()) {
                            TTPlayableLandingPageActivity.this.f6934m.setProgress(i);
                            return;
                        }
                        TTPlayableLandingPageActivity.this.f6934m.setVisibility(8);
                        TTPlayableLandingPageActivity.this.m8574i();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            bundle.putString("material_meta", this.f6944w != null ? this.f6944w.mo19584ar().toString() : null);
            bundle.putInt("sdk_version", this.f6933l);
            bundle.putString("adid", this.f6936o);
            bundle.putString("log_extra", this.f6937p);
            bundle.putInt("source", this.f6940s);
            bundle.putBoolean("ad_pending_download", this.f6946y);
            bundle.putString("url", this.f6941t);
            bundle.putString("web_title", this.f6942u);
            bundle.putString("event_tag", "embeded_ad");
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* renamed from: h */
    private void m8571h() {
        this.f6935n = (PlayableLoadingView) findViewById(C2914t.m8158e(this, "tt_playable_loading"));
        this.f6925d = (SSWebView) findViewById(C2914t.m8158e(this, "tt_browser_webview"));
        this.f6926e = (SSWebView) findViewById(C2914t.m8158e(this, "tt_browser_webview_loading"));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C2914t.m8158e(this, "tt_playable_ad_close_layout"));
        this.f6929h = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.f6920H != null) {
                        TTPlayableLandingPageActivity.this.f6920H.mo18740i();
                    }
                    TTPlayableLandingPageActivity.this.m8555a("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        this.f6934m = (ProgressBar) findViewById(C2914t.m8158e(this, "tt_browser_progress"));
        View findViewById = findViewById(C2914t.m8158e(this, "tt_playable_ad_dislike"));
        this.f6930i = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTPlayableLandingPageActivity.this.mo18460b();
            }
        });
        ImageView imageView = (ImageView) findViewById(C2914t.m8158e(this, "tt_playable_ad_mute"));
        this.f6931j = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                boolean unused = tTPlayableLandingPageActivity.f6919G = !tTPlayableLandingPageActivity.f6919G;
                TTPlayableLandingPageActivity tTPlayableLandingPageActivity2 = TTPlayableLandingPageActivity.this;
                tTPlayableLandingPageActivity2.mo18461b(tTPlayableLandingPageActivity2.f6919G);
                if (TTPlayableLandingPageActivity.this.f6918F != null) {
                    TTPlayableLandingPageActivity.this.f6918F.mo20640a(TTPlayableLandingPageActivity.this.f6919G);
                }
            }
        });
        this.f6925d.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f6926e.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        C3904y.m12853a((View) this.f6925d, 4);
        C3904y.m12853a((View) this.f6926e, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18458a() {
        if (this.f6935n != null) {
            C3431n nVar = this.f6944w;
            if (nVar == null || C3434p.m10493e(nVar)) {
                this.f6935n.mo20387b();
                if (this.f6935n.getPlayView() != null) {
                    C30153 r1 = new C3359a(this, this.f6944w, "embeded_ad", this.f6940s) {
                        /* renamed from: a */
                        public void mo18383a(View view, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, boolean z) {
                            if (this.f8048d == null || this.f8048d.mo19625i() != 1 || z) {
                                super.mo18383a(view, f, f2, f3, f4, sparseArray, z);
                                boolean unused = TTPlayableLandingPageActivity.this.f6946y = true;
                                boolean unused2 = TTPlayableLandingPageActivity.this.f6947z = true;
                                HashMap hashMap = new HashMap();
                                hashMap.put("playable_url", TTPlayableLandingPageActivity.this.f6941t);
                                TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                                C3090e.m8926e((Context) tTPlayableLandingPageActivity, tTPlayableLandingPageActivity.f6944w, this.f8049e, "click_playable_download_button_loading", (Map<String, Object>) hashMap);
                            }
                        }
                    };
                    r1.mo19311a(this.f6913A);
                    this.f6935n.getPlayView().setOnClickListener(r1);
                }
                if (C3434p.m10495g(this.f6944w)) {
                    this.f6945x.sendMessageDelayed(m8549a(2), 10000);
                    return;
                }
                return;
            }
            this.f6935n.mo20386a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m8574i() {
        SSWebView sSWebView;
        if (!this.f6914B.getAndSet(true) && (sSWebView = this.f6925d) != null && this.f6926e != null) {
            C3904y.m12853a((View) sSWebView, 0);
            C3904y.m12853a((View) this.f6926e, 8);
        }
    }

    /* renamed from: a */
    private void m8553a(SSWebView sSWebView) {
        if (sSWebView != null) {
            C3685b.m12035a(this.f6932k).mo20447a(false).mo20449b(false).mo20448a(sSWebView.getWebView());
            sSWebView.setUserAgentString(C3881j.m12666a(sSWebView.getWebView(), this.f6933l));
            if (Build.VERSION.SDK_INT >= 21) {
                sSWebView.setMixedContentMode(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8555a(String str) {
        C3090e.m8923c((Context) this, this.f6944w, "embeded_ad", str, (JSONObject) null);
    }

    /* renamed from: j */
    private void m8576j() {
        if (this.f6926e != null) {
            String k = m8577k();
            if (!TextUtils.isEmpty(k)) {
                this.f6926e.setWebViewClient(new C3687d(this.f6932k, this.f6939r, this.f6936o, (C3104n) null, false) {
                    public void onPageFinished(WebView webView, String str) {
                        super.onPageFinished(webView, str);
                        if (TTPlayableLandingPageActivity.this.f6928g) {
                            TTPlayableLandingPageActivity.this.m8555a("loading_h5_success");
                        }
                    }

                    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                        boolean unused = TTPlayableLandingPageActivity.this.f6928g = false;
                    }

                    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView, webResourceRequest, webResourceError);
                        boolean unused = TTPlayableLandingPageActivity.this.f6928g = false;
                    }

                    public void onReceivedError(WebView webView, int i, String str, String str2) {
                        super.onReceivedError(webView, i, str, str2);
                        boolean unused = TTPlayableLandingPageActivity.this.f6928g = false;
                    }
                });
                this.f6926e.mo17835a(k);
            }
        }
    }

    /* renamed from: k */
    private String m8577k() {
        C3431n nVar;
        String j = C3513m.m10973h().mo19864j();
        if (TextUtils.isEmpty(j) || (nVar = this.f6944w) == null || nVar.mo19567aa() == null) {
            return j;
        }
        String b = this.f6944w.mo19567aa().mo19404b();
        double d = this.f6944w.mo19567aa().mo19409d();
        int e = this.f6944w.mo19567aa().mo19410e();
        String a = (this.f6944w.mo19520M() == null || TextUtils.isEmpty(this.f6944w.mo19520M().mo19468a())) ? "" : this.f6944w.mo19520M().mo19468a();
        String Y = this.f6944w.mo19532Y();
        String c = this.f6944w.mo19567aa().mo19407c();
        String a2 = this.f6944w.mo19567aa().mo19400a();
        String b2 = this.f6944w.mo19567aa().mo19404b();
        StringBuffer stringBuffer = new StringBuffer(j);
        stringBuffer.append("?appname=");
        stringBuffer.append(b);
        stringBuffer.append("&stars=");
        stringBuffer.append(d);
        stringBuffer.append("&comments=");
        stringBuffer.append(e);
        stringBuffer.append("&icon=");
        stringBuffer.append(a);
        stringBuffer.append("&downloading=");
        stringBuffer.append(false);
        stringBuffer.append("&id=");
        stringBuffer.append(Y);
        stringBuffer.append("&pkg_name=");
        stringBuffer.append(c);
        stringBuffer.append("&download_url=");
        stringBuffer.append(a2);
        stringBuffer.append("&name=");
        stringBuffer.append(b2);
        return stringBuffer.toString();
    }

    /* renamed from: l */
    private void m8579l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f6944w);
        this.f6920H = new C3118u(3, "embeded_ad", this.f6944w);
        C3666w wVar = new C3666w(this);
        this.f6938q = wVar;
        wVar.mo20354b(this.f6925d).mo20337a(this.f6944w).mo20345a((List<C3431n>) arrayList).mo20364d(this.f6936o).mo20368e(this.f6937p).mo20360c("embeded_ad").mo20353b(this.f6940s).mo20336a((C3364d) this).mo20335a(this.f6920H).mo20342a(this.f6924c).mo20334a(this.f6925d).mo20370f(C3898x.m12810i(this.f6944w));
        C3666w wVar2 = new C3666w(this);
        this.f6939r = wVar2;
        wVar2.mo20354b(this.f6926e).mo20337a(this.f6944w).mo20364d(this.f6936o).mo20368e(this.f6937p).mo20336a((C3364d) this).mo20353b(this.f6940s).mo20361c(false).mo20335a(this.f6920H).mo20334a(this.f6926e).mo20370f(C3898x.m12810i(this.f6944w));
        m8562d();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C3118u uVar = this.f6920H;
        if (uVar != null) {
            uVar.mo18742k();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C3666w wVar = this.f6938q;
        if (wVar != null) {
            wVar.mo20377l();
            SSWebView sSWebView = this.f6925d;
            if (sSWebView != null) {
                this.f6938q.mo20356b(sSWebView.getVisibility() == 0);
            }
        }
        C3666w wVar2 = this.f6939r;
        if (wVar2 != null) {
            wVar2.mo20377l();
        }
        C3828g gVar = this.f6918F;
        if (gVar != null) {
            gVar.mo20678r();
            this.f6918F.mo20647b(true);
        }
        C3104n nVar = this.f6921I;
        if (nVar != null) {
            nVar.mo18701d();
        }
        C3747g gVar2 = this.f6923b;
        if (gVar2 != null) {
            gVar2.mo20529a((C3746f) this);
            this.f6923b.mo20536e();
            if (this.f6923b.mo20538g() == 0) {
                this.f6919G = true;
            }
            mo18461b(this.f6919G);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C3580t.m11322a().mo20133b(true);
        C3666w wVar = this.f6938q;
        if (wVar != null) {
            wVar.mo20378m();
            this.f6938q.mo20356b(false);
        }
        C3666w wVar2 = this.f6939r;
        if (wVar2 != null) {
            wVar2.mo20378m();
        }
        C3828g gVar = this.f6918F;
        if (gVar != null) {
            gVar.mo20640a(true);
            this.f6918F.mo20677q();
            this.f6918F.mo20647b(false);
        }
        C3747g gVar2 = this.f6923b;
        if (gVar2 != null) {
            gVar2.mo20537f();
            this.f6923b.mo20529a((C3746f) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C3118u uVar = this.f6920H;
        if (uVar != null) {
            uVar.mo18741j();
        }
        C3104n nVar = this.f6921I;
        if (nVar != null) {
            nVar.mo18702e();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        C3118u uVar = this.f6920H;
        if (uVar != null) {
            uVar.mo18740i();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        C3118u uVar = this.f6920H;
        if (uVar != null) {
            uVar.mo18724a(true);
            this.f6920H.mo18744m();
        }
        C2923x xVar = this.f6945x;
        if (xVar != null) {
            xVar.removeCallbacksAndMessages((Object) null);
        }
        try {
            if (!(getWindow() == null || (viewGroup = (ViewGroup) getWindow().getDecorView()) == null)) {
                viewGroup.removeAllViews();
            }
        } catch (Throwable unused) {
        }
        SSWebView sSWebView = this.f6925d;
        if (sSWebView != null) {
            C3706z.m12119a(this.f6932k, sSWebView.getWebView());
            C3706z.m12120a(this.f6925d.getWebView());
            this.f6925d.mo17862l();
        }
        this.f6925d = null;
        C3666w wVar = this.f6938q;
        if (wVar != null) {
            wVar.mo20379n();
        }
        C3666w wVar2 = this.f6939r;
        if (wVar2 != null) {
            wVar2.mo20379n();
        }
        C3828g gVar = this.f6918F;
        if (gVar != null) {
            gVar.mo20682v();
        }
        C3104n nVar = this.f6921I;
        if (nVar != null) {
            nVar.mo18703f();
        }
        this.f6923b = null;
    }

    /* renamed from: a */
    public void mo17240a(Message message) {
        int i = message.what;
        if (i == 1) {
            C3904y.m12853a((View) this.f6929h, 0);
        } else if (i == 2) {
            C2905l.m8104a("playable hidden loading , type:" + message.arg1);
            HashMap hashMap = new HashMap();
            hashMap.put("remove_loading_page_type", Integer.valueOf(message.arg1));
            hashMap.put("playable_url", this.f6941t);
            C3090e.m8926e((Context) this, this.f6944w, "embeded_ad", "remove_loading_page", (Map<String, Object>) hashMap);
            this.f6945x.removeMessages(2);
            PlayableLoadingView playableLoadingView = this.f6935n;
            if (playableLoadingView != null) {
                playableLoadingView.mo20386a();
            }
        }
    }

    /* renamed from: a */
    public void mo18459a(boolean z) {
        C3968c cVar;
        this.f6946y = true;
        this.f6947z = z;
        if (!z) {
            try {
                Toast.makeText(this.f6932k, C2914t.m8151a(C3513m.m10963a(), "tt_toast_later_download"), 0).show();
            } catch (Throwable unused) {
            }
        }
        if (this.f6947z && (cVar = this.f6913A) != null) {
            cVar.mo20860d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18460b() {
        if (this.f6944w != null && !isFinishing()) {
            if (this.f6922a == null) {
                mo18462c();
            }
            this.f6922a.showDislikeDialog();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo18462c() {
        this.f6922a = new C3716b(this, this.f6944w);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18461b(boolean z) {
        int i;
        try {
            this.f6919G = z;
            if (z) {
                i = C2914t.m8157d(this.f6932k, "tt_mute");
            } else {
                i = C2914t.m8157d(this.f6932k, "tt_unmute");
            }
            this.f6931j.setImageResource(i);
            if (this.f6918F != null) {
                this.f6918F.mo20640a(z);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public void mo18340b(int i) {
        mo18461b(i <= 0);
    }
}
