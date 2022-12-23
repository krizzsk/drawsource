package com.bytedance.sdk.openadsdk.activity;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bytedance.sdk.component.adexpress.p094c.C2571a;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2893e;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.utils.C2923x;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.C3178a;
import com.bytedance.sdk.openadsdk.component.p134a.C3190a;
import com.bytedance.sdk.openadsdk.component.p134a.C3191b;
import com.bytedance.sdk.openadsdk.component.p136c.C3205a;
import com.bytedance.sdk.openadsdk.component.p138e.C3209a;
import com.bytedance.sdk.openadsdk.component.p138e.C3210b;
import com.bytedance.sdk.openadsdk.component.p139f.C3214a;
import com.bytedance.sdk.openadsdk.component.p140g.C3216b;
import com.bytedance.sdk.openadsdk.component.view.ButtonFlash;
import com.bytedance.sdk.openadsdk.component.view.C3330a;
import com.bytedance.sdk.openadsdk.core.C3356b;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3574p;
import com.bytedance.sdk.openadsdk.core.C3580t;
import com.bytedance.sdk.openadsdk.core.p144b.C3360b;
import com.bytedance.sdk.openadsdk.core.p149e.C3417k;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p153i.C3471f;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3912a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3917a;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p128b.C3100j;
import com.bytedance.sdk.openadsdk.p174i.C3783a;
import com.bytedance.sdk.openadsdk.p174i.p175a.C3788b;
import com.bytedance.sdk.openadsdk.p178l.C3877h;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class TTAppOpenAdActivity extends Activity implements C2923x.C2924a {

    /* renamed from: F */
    private static TTAppOpenAd.AppOpenAdInteractionListener f6714F;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f6715A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public String f6716B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C3431n f6717C;

    /* renamed from: D */
    private IListenerManager f6718D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public TTAppOpenAd.AppOpenAdInteractionListener f6719E;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f6720G;

    /* renamed from: a */
    TTAdDislikeDialog f6721a;

    /* renamed from: b */
    TTAdDislikeToast f6722b;

    /* renamed from: c */
    final AtomicBoolean f6723c = new AtomicBoolean(false);

    /* renamed from: d */
    final AtomicBoolean f6724d = new AtomicBoolean(false);

    /* renamed from: e */
    protected boolean f6725e = false;

    /* renamed from: f */
    protected final AtomicBoolean f6726f = new AtomicBoolean(false);

    /* renamed from: g */
    protected final C2923x f6727g = new C2923x(Looper.getMainLooper(), this);

    /* renamed from: h */
    private final String f6728h = "open_ad";

    /* renamed from: i */
    private RelativeLayout f6729i;

    /* renamed from: j */
    private FrameLayout f6730j;

    /* renamed from: k */
    private ImageView f6731k;

    /* renamed from: l */
    private TextView f6732l;

    /* renamed from: m */
    private ButtonFlash f6733m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C3210b f6734n = new C3210b();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ValueAnimator f6735o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C3216b f6736p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f6737q;

    /* renamed from: r */
    private C3191b f6738r;

    /* renamed from: s */
    private final C3330a f6739s = new C3330a();

    /* renamed from: t */
    private float f6740t;

    /* renamed from: u */
    private float f6741u;

    /* renamed from: v */
    private ImageView f6742v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public long f6743w = 0;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C3100j f6744x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public AtomicBoolean f6745y = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f6746z;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m8305b(bundle)) {
            if (!TTAdSdk.isInitSuccess()) {
                finish();
            }
            this.f6746z = C3431n.m10311c(this.f6717C);
            m8310f();
            m8311g();
            m8313h();
            m8316i();
            m8318j();
            m8320k();
        }
    }

    /* renamed from: f */
    private void m8310f() {
        int f = C2914t.m8159f(this, "tt_app_open_view");
        int d = this.f6717C.mo19607d();
        if (d == 2) {
            f = C2914t.m8159f(this, "tt_app_open_view2");
        } else if (d == 3) {
            f = C2914t.m8159f(this, "tt_app_open_view3");
        }
        setContentView(f);
    }

    /* renamed from: g */
    private void m8311g() {
        int i;
        int i2;
        int am = this.f6717C.mo19579am();
        if (this.f6717C.mo19607d() == 3) {
            am = 2;
        }
        if (am != 2) {
            setRequestedOrientation(1);
        } else if (mo18292e()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
        int i3 = C3904y.m12892i(getApplicationContext());
        int h = C3904y.m12891h(getApplicationContext());
        if (am == 2) {
            i = Math.max(i3, h);
            i2 = Math.min(i3, h);
        } else {
            i = Math.min(i3, h);
            i2 = Math.max(i3, h);
        }
        this.f6740t = (float) i2;
        this.f6741u = (float) i;
        float j = C3904y.m12893j(getApplicationContext());
        if (!C3904y.m12879c((Activity) this)) {
            return;
        }
        if (am == 1) {
            this.f6740t -= j;
        } else if (am == 2) {
            this.f6741u -= j;
        }
    }

    /* renamed from: h */
    private void m8313h() {
        this.f6729i = (RelativeLayout) findViewById(C2914t.m8158e(this, "tt_open_ad_container"));
        this.f6742v = (ImageView) findViewById(C2914t.m8158e(this, "tt_open_ad_back_image"));
        this.f6730j = (FrameLayout) findViewById(C2914t.m8158e(this, "tt_open_ad_video_container"));
        this.f6731k = (ImageView) findViewById(C2914t.m8158e(this, "tt_open_ad_image"));
        this.f6733m = (ButtonFlash) findViewById(C2914t.m8158e(this, "tt_open_ad_click_button"));
        this.f6732l = (TextView) findViewById(C2914t.m8158e(this, "tt_ad_logo"));
        this.f6739s.mo19255a(this);
        this.f6734n.mo18872a((Activity) this);
    }

    /* renamed from: i */
    private void m8316i() {
        this.f6739s.mo19256a(this.f6717C, this.f6741u, this.f6740t);
    }

    /* renamed from: j */
    private void m8318j() {
        this.f6732l.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m8711a(TTAppOpenAdActivity.this, TTAppOpenAdActivity.this.f6717C, "open_ad");
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        this.f6734n.mo18873a((C3209a) new C3209a() {
            /* renamed from: a */
            public void mo18307a(View view) {
                C3574p.m11297c(TTAppOpenAdActivity.this.f6715A);
                TTAppOpenAdActivity.this.m8332t();
                if (TTAppOpenAdActivity.this.f6736p != null) {
                    TTAppOpenAdActivity.this.f6736p.mo18892a(4);
                }
                C3205a.m9276a(TTAppOpenAdActivity.this.f6717C, TTAppOpenAdActivity.this.f6734n.mo18877d(), TTAppOpenAdActivity.this.f6734n.mo18879f(), TTAppOpenAdActivity.this.f6734n.mo18878e());
                TTAppOpenAdActivity.this.finish();
            }

            /* renamed from: b */
            public void mo18308b(View view) {
                TTAppOpenAdActivity.this.mo18283a();
            }

            /* renamed from: a */
            public void mo18306a() {
                if (C3948b.m12959c()) {
                    TTAppOpenAdActivity.this.m8302a("onAdTimeOver");
                } else if (TTAppOpenAdActivity.this.f6719E != null) {
                    TTAppOpenAdActivity.this.f6719E.onAdCountdownToZero();
                }
                TTAppOpenAdActivity.this.finish();
            }
        });
        C3191b bVar = new C3191b(this.f6717C, this);
        this.f6738r = bVar;
        bVar.mo18852a((C3360b.C3361a) new C3360b.C3361a() {
            /* renamed from: a */
            public void mo18309a(View view, int i) {
                if (C3948b.m12959c()) {
                    TTAppOpenAdActivity.this.m8302a("onAdClicked");
                } else if (TTAppOpenAdActivity.this.f6719E != null) {
                    TTAppOpenAdActivity.this.f6719E.onAdClicked();
                }
            }
        });
        C3190a a = this.f6738r.mo18851a();
        if (this.f6717C.mo19601c() == 1) {
            this.f6729i.setOnClickListener(a);
            this.f6729i.setOnTouchListener(a);
        }
        this.f6733m.setOnClickListener(a);
        this.f6733m.setOnTouchListener(a);
    }

    /* renamed from: k */
    private void m8320k() {
        this.f6739s.mo19254a();
        this.f6733m.setText(this.f6717C.mo19530W());
        this.f6734n.mo18875b(C3513m.m10973h().mo19860i(this.f6715A));
        if (this.f6746z) {
            mo18284a(0);
            mo18289b(8);
            this.f6734n.mo18870a((float) this.f6717C.mo19517J().mo15946f());
            this.f6735o = this.f6734n.mo18874b();
            this.f6734n.mo18871a(0);
            m8324m();
            return;
        }
        int j = C3513m.m10973h().mo19862j(this.f6715A);
        mo18284a(8);
        mo18289b(0);
        this.f6734n.mo18870a((float) j);
        this.f6735o = this.f6734n.mo18874b();
        this.f6734n.mo18871a(0);
        m8321l();
    }

    /* renamed from: l */
    private void m8321l() {
        m8331s();
        C3417k kVar = this.f6717C.mo19523P().get(0);
        C3877h.m12656a(new C3783a(kVar.mo19468a(), kVar.mo19479g()), kVar.mo19472b(), kVar.mo19475c(), new C3877h.C3879a() {
            /* renamed from: a */
            public void mo18310a() {
            }

            /* renamed from: b */
            public void mo18312b() {
            }

            /* renamed from: a */
            public void mo18311a(C3788b bVar) {
                if (bVar.mo20607c()) {
                    TTAppOpenAdActivity.this.mo18287a(bVar);
                    TTAppOpenAdActivity.this.m8299a(bVar.mo20605a());
                }
            }
        }, C3214a.m9314b(TextUtils.isEmpty(kVar.mo19479g()) ? C2893e.m8077a(kVar.mo19468a()) : kVar.mo19479g(), this.f6715A).getParent());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8299a(Bitmap bitmap) {
        Bitmap a;
        if (bitmap != null) {
            try {
                if (Build.VERSION.SDK_INT >= 17 && (a = C2571a.m6621a(C3513m.m10963a(), bitmap, 25)) != null) {
                    this.f6742v.setImageDrawable(new BitmapDrawable(C3513m.m10963a().getResources(), a));
                }
            } catch (Throwable unused) {
                C2905l.m8118e("TTAppOpenAdActivity", "bindBackGroundImage error");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18287a(C3788b bVar) {
        if (bVar.mo20605a() != null) {
            this.f6731k.setImageBitmap(bVar.mo20605a());
        } else if (this.f6717C.mo19523P() != null && this.f6717C.mo19523P().get(0) != null) {
            Drawable a = C3877h.m12655a(bVar.mo20606b(), this.f6717C.mo19523P().get(0).mo19472b());
            this.f6731k.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f6731k.setImageDrawable(a);
        }
    }

    /* renamed from: m */
    private void m8324m() {
        boolean z;
        m8331s();
        C3216b bVar = new C3216b(this);
        this.f6736p = bVar;
        bVar.mo18893a(this.f6730j, this.f6717C);
        this.f6736p.mo18894a((C2405c.C2406a) new C2405c.C2406a() {
            /* renamed from: a */
            public void mo16056a(long j, int i) {
                C2905l.m8111b("TTAppOpenAdActivity", "onComplete");
            }

            /* renamed from: b */
            public void mo16058b(long j, int i) {
                C2905l.m8111b("TTAppOpenAdActivity", "onError");
                TTAppOpenAdActivity.this.m8332t();
                TTAppOpenAdActivity.this.finish();
            }

            /* renamed from: a */
            public void mo16055a() {
                C2905l.m8111b("TTAppOpenAdActivity", "onTimeOut");
                TTAppOpenAdActivity.this.m8332t();
                TTAppOpenAdActivity.this.finish();
            }

            /* renamed from: a */
            public void mo16057a(long j, long j2) {
                long unused = TTAppOpenAdActivity.this.f6737q = j;
                if (!TTAppOpenAdActivity.this.f6725e && TTAppOpenAdActivity.this.f6736p.mo18896b()) {
                    TTAppOpenAdActivity.this.f6736p.mo18898d();
                }
                TTAppOpenAdActivity.this.m8328p();
            }
        });
        try {
            z = this.f6736p.mo18895a();
        } catch (Throwable th) {
            C2905l.m8118e("TTAppOpenAdActivity", "ttAppOpenAd playVideo error: " + th.getMessage());
            z = false;
        }
        if (z) {
            m8327o();
        } else {
            finish();
        }
        C3178a.m9182a(this.f6717C, (C3178a.C3189d) new C3178a.C3189d() {
            /* renamed from: a */
            public void mo18313a() {
            }

            /* renamed from: a */
            public void mo18314a(Bitmap bitmap) {
                TTAppOpenAdActivity.this.m8299a(bitmap);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18284a(int i) {
        C3904y.m12853a((View) this.f6730j, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo18289b(int i) {
        C3904y.m12853a((View) this.f6731k, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18283a() {
        if (!isFinishing()) {
            if (this.f6724d.get()) {
                m8329q();
                return;
            }
            if (this.f6721a == null) {
                m8326n();
            }
            this.f6721a.mo18778a();
        }
    }

    /* renamed from: n */
    private void m8326n() {
        if (this.f6721a == null) {
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog((Context) this, this.f6717C);
            this.f6721a = tTAdDislikeDialog;
            tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.C3155a() {
                /* renamed from: c */
                public void mo18318c(View view) {
                }

                /* renamed from: a */
                public void mo18316a(View view) {
                    TTAppOpenAdActivity.this.f6723c.set(true);
                    TTAppOpenAdActivity.this.mo18290c();
                }

                /* renamed from: b */
                public void mo18317b(View view) {
                    TTAppOpenAdActivity.this.f6723c.set(false);
                    TTAppOpenAdActivity.this.mo18288b();
                }

                /* renamed from: a */
                public void mo18315a(int i, FilterWord filterWord) {
                    if (!TTAppOpenAdActivity.this.f6724d.get() && filterWord != null && !filterWord.hasSecondOptions()) {
                        TTAppOpenAdActivity.this.f6724d.set(true);
                        TTAppOpenAdActivity.this.m8330r();
                    }
                }
            });
        }
        ((FrameLayout) findViewById(16908290)).addView(this.f6721a);
        if (this.f6722b == null) {
            this.f6722b = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(16908290)).addView(this.f6722b);
        }
    }

    /* renamed from: o */
    private void m8327o() {
        if (this.f6746z) {
            this.f6727g.sendEmptyMessageDelayed(100, 5000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m8328p() {
        this.f6727g.removeMessages(100);
    }

    /* renamed from: q */
    private void m8329q() {
        this.f6722b.mo18786a(C3471f.f8594d);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m8330r() {
        this.f6722b.mo18786a(C3471f.f8595e);
    }

    public void onBackPressed() {
        C3210b bVar;
        if (C3513m.m10973h().mo19856h(this.f6715A) == 1) {
            if (((long) this.f6734n.mo18877d()) >= ((long) C3513m.m10973h().mo19860i(this.f6715A)) * 1000 && (bVar = this.f6734n) != null) {
                bVar.mo18876c();
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z || !this.f6745y.get()) {
            this.f6743w = System.currentTimeMillis();
            return;
        }
        if (this.f6743w > 0) {
            C3090e.m8913a((System.currentTimeMillis() - this.f6743w) + "", this.f6717C, "open_ad", this.f6744x);
        }
        this.f6743w = 0;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f6725e = true;
        if (this.f6726f.getAndSet(true)) {
            mo18288b();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f6725e = false;
        mo18290c();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f6746z) {
            C3205a.m9279a(this.f6717C, this.f6737q, this.f6734n.mo18878e(), true);
        } else {
            C3205a.m9279a(this.f6717C, -1, this.f6734n.mo18878e(), false);
        }
        if (this.f6743w > 0 && this.f6745y.get()) {
            C3090e.m8913a((System.currentTimeMillis() - this.f6743w) + "", this.f6717C, "open_ad", this.f6744x);
            this.f6743w = 0;
        }
        ButtonFlash buttonFlash = this.f6733m;
        if (buttonFlash != null) {
            buttonFlash.mo19249a();
        }
        C3216b bVar = this.f6736p;
        if (bVar != null) {
            bVar.mo18900f();
        }
        if (C3948b.m12959c()) {
            m8302a("recycleRes");
        }
        ValueAnimator valueAnimator = this.f6735o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        f6714F = null;
        this.f6719E = null;
        TTAdDislikeDialog tTAdDislikeDialog = this.f6721a;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.setCallback((TTAdDislikeDialog.C3155a) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo18288b() {
        if (this.f6746z) {
            if (this.f6736p.mo18897c()) {
                this.f6736p.mo18899e();
            }
            m8327o();
        }
        if (this.f6735o != null && Build.VERSION.SDK_INT >= 19) {
            this.f6735o.resume();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo18290c() {
        if (this.f6746z) {
            if (this.f6736p.mo18896b()) {
                this.f6736p.mo18898d();
            }
            m8328p();
        }
        if (this.f6735o != null && Build.VERSION.SDK_INT >= 19) {
            this.f6735o.pause();
        }
    }

    /* renamed from: s */
    private void m8331s() {
        try {
            getWindow().getDecorView().post(new Runnable() {
                public void run() {
                    C3100j unused = TTAppOpenAdActivity.this.f6744x = new C3100j();
                    TTAppOpenAdActivity.this.f6744x.mo18681a(System.currentTimeMillis(), 1.0f);
                    long unused2 = TTAppOpenAdActivity.this.f6743w = System.currentTimeMillis();
                    if (TTAppOpenAdActivity.this.f6735o != null && !TTAppOpenAdActivity.this.f6735o.isStarted()) {
                        TTAppOpenAdActivity.this.f6735o.start();
                    }
                    if (C3948b.m12959c()) {
                        TTAppOpenAdActivity.this.m8302a("onAdShow");
                    } else if (TTAppOpenAdActivity.this.f6719E != null) {
                        TTAppOpenAdActivity.this.f6719E.onAdShow();
                    }
                    View findViewById = TTAppOpenAdActivity.this.findViewById(16908290);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("width", findViewById.getWidth());
                        jSONObject.put("height", findViewById.getHeight());
                        jSONObject.put("alpha", (double) findViewById.getAlpha());
                        HashMap hashMap = new HashMap();
                        hashMap.put("root_view", jSONObject.toString());
                        hashMap.put("ad_root", Integer.valueOf(TTAppOpenAdActivity.this.f6720G));
                        hashMap.put("openad_creative_type", TTAppOpenAdActivity.this.f6746z ? "video_normal_ad" : "image_normal_ad");
                        if (C3330a.m9905c() == null) {
                            hashMap.put("appicon_acquirefail", "1");
                        }
                        C3090e.m8899a(C3513m.m10963a(), TTAppOpenAdActivity.this.f6717C, "open_ad", (Map<String, Object>) hashMap, (Double) null);
                        TTAppOpenAdActivity.this.f6745y.set(true);
                    } catch (JSONException unused3) {
                        TTAppOpenAdActivity.this.finish();
                    }
                }
            });
        } catch (Throwable unused) {
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m8332t() {
        if (C3948b.m12959c()) {
            m8302a("onAdSkip");
            return;
        }
        TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener = this.f6719E;
        if (appOpenAdInteractionListener != null) {
            appOpenAdInteractionListener.onAdSkip();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8302a(final String str) {
        C2882e.m8044c(new C2885g("AppOpenAd_executeMultiProcessCallback") {
            public void run() {
                try {
                    TTAppOpenAdActivity.this.mo18291d().executeAppOpenAdCallback(TTAppOpenAdActivity.this.f6716B, str);
                } catch (Throwable th) {
                    C2905l.m8115c("TTAppOpenAdActivity", "executeAppOpenAdCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public IListenerManager mo18291d() {
        if (this.f6718D == null) {
            this.f6718D = C3917a.asInterface(C3912a.m12924a(C3513m.m10963a()).mo20782a(7));
        }
        return this.f6718D;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3904y.m12848a((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (!TTAppOpenAdActivity.this.isFinishing()) {
                            TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() {
                                public void run() {
                                    C3904y.m12848a((Activity) TTAppOpenAdActivity.this);
                                }
                            }, 2500);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* renamed from: b */
    private boolean m8305b(Bundle bundle) {
        if (C3948b.m12959c()) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.f6717C = C3356b.m9935a(new JSONObject(stringExtra));
                    } catch (Exception e) {
                        C2905l.m8115c("TTAppOpenAdActivity", "initData MultiGlobalInfo throws ", e);
                    }
                }
                this.f6716B = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.f6717C = C3580t.m11322a().mo20135c();
            this.f6719E = C3580t.m11322a().mo20138f();
            C3580t.m11322a().mo20140h();
        }
        mo18285a(getIntent());
        mo18286a(bundle);
        C3431n nVar = this.f6717C;
        if (nVar == null) {
            C2905l.m8111b("TTAppOpenAdActivity", "mMaterialMeta is null , no data to display ,the TTOpenAdActivity finished !!");
            finish();
            return false;
        }
        this.f6715A = C3898x.m12794f(nVar);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18285a(Intent intent) {
        if (intent != null) {
            this.f6720G = intent.getIntExtra("ad_source", 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18286a(Bundle bundle) {
        if (bundle != null) {
            if (this.f6719E == null) {
                this.f6719E = f6714F;
                f6714F = null;
            }
            try {
                String string = bundle.getString("material_meta");
                this.f6716B = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
                this.f6720G = bundle.getInt("ad_source", 0);
                this.f6717C = C3356b.m9935a(new JSONObject(string));
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            bundle.putString("material_meta", this.f6717C != null ? this.f6717C.mo19584ar().toString() : null);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.f6716B);
            bundle.putInt("ad_source", this.f6720G);
        } catch (Throwable unused) {
        }
        f6714F = this.f6719E;
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public void mo17240a(Message message) {
        if (message.what == 100) {
            C3216b bVar = this.f6736p;
            if (bVar != null) {
                bVar.mo18892a(1);
            }
            m8332t();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo18292e() {
        try {
            if (getIntent().getIntExtra("orientation_angle", 0) == 3) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
