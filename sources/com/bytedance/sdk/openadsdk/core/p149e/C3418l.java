package com.bytedance.sdk.openadsdk.core.p149e;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bytedance.sdk.component.adexpress.p094c.C2571a;
import com.bytedance.sdk.component.p108d.C2828j;
import com.bytedance.sdk.component.p108d.C2832n;
import com.bytedance.sdk.component.p108d.C2838t;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C3502k;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3580t;
import com.bytedance.sdk.openadsdk.core.C3666w;
import com.bytedance.sdk.openadsdk.core.C3706z;
import com.bytedance.sdk.openadsdk.core.p144b.C3359a;
import com.bytedance.sdk.openadsdk.core.p144b.C3360b;
import com.bytedance.sdk.openadsdk.core.video.p162c.C3623c;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3685b;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3686c;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3687d;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p128b.C3104n;
import com.bytedance.sdk.openadsdk.p165d.C3707a;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3881j;
import com.bytedance.sdk.openadsdk.p178l.C3882k;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import com.com.bytedance.overseas.sdk.p185a.C3969d;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.l */
/* compiled from: LandingPageModel */
public class C3418l {

    /* renamed from: A */
    private LinearLayout f8303A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public View f8304B;

    /* renamed from: C */
    private ImageView f8305C;

    /* renamed from: D */
    private View f8306D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public long f8307E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public AtomicBoolean f8308F = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public Activity f8309G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public String f8310H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C3968c f8311I;

    /* renamed from: J */
    private C3104n f8312J;

    /* renamed from: K */
    private AtomicBoolean f8313K = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f8314L = false;

    /* renamed from: a */
    ImageView f8315a;

    /* renamed from: b */
    FrameLayout f8316b;

    /* renamed from: c */
    TextView f8317c;

    /* renamed from: d */
    FrameLayout f8318d;

    /* renamed from: e */
    TextView f8319e;

    /* renamed from: f */
    RelativeLayout f8320f;

    /* renamed from: g */
    C3431n f8321g;

    /* renamed from: h */
    FrameLayout f8322h;

    /* renamed from: i */
    ObjectAnimator f8323i;

    /* renamed from: j */
    ObjectAnimator f8324j;

    /* renamed from: k */
    ObjectAnimator f8325k;

    /* renamed from: l */
    ObjectAnimator f8326l;

    /* renamed from: m */
    ObjectAnimator f8327m;

    /* renamed from: n */
    C2405c.C2406a f8328n;

    /* renamed from: o */
    C3359a f8329o;

    /* renamed from: p */
    C3360b f8330p;

    /* renamed from: q */
    private View f8331q;

    /* renamed from: r */
    private View f8332r;

    /* renamed from: s */
    private TextView f8333s;

    /* renamed from: t */
    private TextView f8334t;

    /* renamed from: u */
    private TTRoundRectImageView f8335u;

    /* renamed from: v */
    private TextView f8336v;

    /* renamed from: w */
    private C3666w f8337w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public SSWebView f8338x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public FrameLayout f8339y;

    /* renamed from: z */
    private AnimatorSet f8340z;

    public C3418l(Activity activity, C3431n nVar, String str, FrameLayout frameLayout) {
        this.f8309G = activity;
        this.f8321g = nVar;
        this.f8310H = str;
        if (m10266b(nVar)) {
            this.f8310H = "landingpage_split_screen";
        } else if (m10268c(nVar)) {
            this.f8310H = "landingpage_direct";
        }
        this.f8329o = new C3359a(C3513m.m10963a(), this.f8321g, this.f8310H, C3898x.m12747a(str));
        this.f8330p = new C3360b(C3513m.m10963a(), this.f8321g, this.f8310H, C3898x.m12747a(str), true);
        this.f8322h = frameLayout;
        try {
            if (m10268c(this.f8321g)) {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "timeDown", new int[]{0, (int) (this.f8321g.mo19534a().mo19502b() * 1000)});
                this.f8325k = ofInt;
                ofInt.setDuration(this.f8321g.mo19534a().mo19502b() * 1000);
                this.f8325k.setInterpolator(new LinearInterpolator());
                this.f8325k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (C3418l.this.f8328n != null && C3418l.this.f8321g.mo19534a() != null) {
                            C3418l.this.f8328n.mo16057a(((Integer) valueAnimator.getAnimatedValue()).longValue(), C3418l.this.f8321g.mo19534a().mo19502b() * 1000);
                        }
                    }
                });
                this.f8325k.start();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo19482a(C2405c.C2406a aVar) {
        this.f8328n = aVar;
    }

    /* renamed from: a */
    public void mo19480a() {
        Activity activity = this.f8309G;
        SSWebView sSWebView = (SSWebView) activity.findViewById(C2914t.m8158e(activity, "tt_reward_browser_webview_loading"));
        this.f8338x = sSWebView;
        if (sSWebView == null || C3431n.m10307a(this.f8321g)) {
            C3904y.m12853a((View) this.f8338x, 8);
        } else {
            this.f8338x.mo17833a();
        }
        Activity activity2 = this.f8309G;
        this.f8339y = (FrameLayout) activity2.findViewById(C2914t.m8158e(activity2, "tt_reward_loading_container"));
        Activity activity3 = this.f8309G;
        this.f8303A = (LinearLayout) activity3.findViewById(C2914t.m8158e(activity3, "wave_container"));
        Activity activity4 = this.f8309G;
        this.f8304B = activity4.findViewById(C2914t.m8158e(activity4, "tt_up_slide"));
        Activity activity5 = this.f8309G;
        this.f8305C = (ImageView) activity5.findViewById(C2914t.m8158e(activity5, "tt_up_slide_image"));
        Activity activity6 = this.f8309G;
        this.f8306D = activity6.findViewById(C2914t.m8158e(activity6, "tt_video_container_root"));
        Activity activity7 = this.f8309G;
        this.f8316b = (FrameLayout) activity7.findViewById(C2914t.m8158e(activity7, "tt_image_reward_container"));
        Activity activity8 = this.f8309G;
        this.f8315a = (ImageView) activity8.findViewById(C2914t.m8158e(activity8, "tt_image_reward"));
        Activity activity9 = this.f8309G;
        this.f8320f = (RelativeLayout) activity9.findViewById(C2914t.m8158e(activity9, "tt_browser_webview_page_loading"));
        Activity activity10 = this.f8309G;
        this.f8317c = (TextView) activity10.findViewById(C2914t.m8158e(activity10, "tt_loading_tip"));
        Activity activity11 = this.f8309G;
        this.f8318d = (FrameLayout) activity11.findViewById(C2914t.m8158e(activity11, "tt_video_container_back"));
        Activity activity12 = this.f8309G;
        this.f8332r = activity12.findViewById(C2914t.m8158e(activity12, "tt_back_container"));
        Activity activity13 = this.f8309G;
        this.f8331q = activity13.findViewById(C2914t.m8158e(activity13, "tt_loading_container"));
        Activity activity14 = this.f8309G;
        this.f8333s = (TextView) activity14.findViewById(C2914t.m8158e(activity14, "tt_back_container_title"));
        Activity activity15 = this.f8309G;
        this.f8334t = (TextView) activity15.findViewById(C2914t.m8158e(activity15, "tt_back_container_des"));
        Activity activity16 = this.f8309G;
        this.f8335u = (TTRoundRectImageView) activity16.findViewById(C2914t.m8158e(activity16, "tt_back_container_icon"));
        Activity activity17 = this.f8309G;
        this.f8336v = (TextView) activity17.findViewById(C2914t.m8158e(activity17, "tt_back_container_download"));
        if (!(this.f8317c == null || this.f8321g.mo19534a() == null)) {
            this.f8317c.setText(this.f8321g.mo19534a().mo19504c());
        }
        Activity activity18 = this.f8309G;
        this.f8319e = (TextView) activity18.findViewById(C2914t.m8158e(activity18, "tt_ad_loading_logo"));
        if ((m10268c(this.f8321g) || m10266b(this.f8321g)) && this.f8321g.mo19534a() != null) {
            TextView textView = this.f8319e;
            if (textView != null) {
                textView.setVisibility(8);
            }
            C3502k.m10922d().postDelayed(new Runnable() {
                public void run() {
                    if (!C3418l.this.f8308F.get()) {
                        C3090e.m8892a(C3513m.m10963a(), C3418l.this.f8321g, C3418l.this.f8310H, System.currentTimeMillis() - C3418l.this.f8307E, false);
                        C3418l.this.m10283m();
                    }
                }
            }, this.f8321g.mo19534a().mo19499a() * 1000);
        }
        m10276i();
        if (m10266b(this.f8321g)) {
            m10285o();
            if (!mo19484c()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8339y.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.f8339y.setLayoutParams(layoutParams);
            }
        }
        if (m10268c(this.f8321g)) {
            this.f8306D.setVisibility(8);
        }
    }

    /* renamed from: i */
    private void m10276i() {
        SSWebView sSWebView = this.f8338x;
        if (!(sSWebView == null || sSWebView.getWebView() == null)) {
            C3685b.m12035a(C3513m.m10963a()).mo20447a(false).mo20449b(false).mo20448a(this.f8338x.getWebView());
            SSWebView sSWebView2 = this.f8338x;
            if (!(sSWebView2 == null || sSWebView2.getWebView() == null)) {
                C3104n a = new C3104n(C3513m.m10963a(), this.f8321g, this.f8338x.getWebView()).mo18688a(true);
                this.f8312J = a;
                a.mo18698a(this.f8310H);
            }
            m10278j();
            this.f8338x.setLandingPage(true);
            this.f8338x.setTag(this.f8310H);
            this.f8338x.setMaterialMeta(this.f8321g.mo19559aC());
            this.f8338x.setWebViewClient(new C3687d(C3513m.m10963a(), this.f8337w, this.f8321g.mo19532Y(), this.f8312J, true) {
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    C3418l.this.m10280k();
                }

                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    if (C3418l.this.f8309G instanceof C3623c) {
                        ((C3623c) C3418l.this.f8309G).mo18348f();
                    }
                    long unused = C3418l.this.f8307E = System.currentTimeMillis();
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    String b = m12042b(str2);
                    if (this.f9540f != null) {
                        this.f9540f.mo18692a(webView, i, str, str2, m12042b(str2));
                    }
                    boolean z = true;
                    boolean z2 = b != null && b.startsWith("image");
                    if (b == null || !b.startsWith("mp4")) {
                        z = false;
                    }
                    if (!z2 && !z && !C3418l.this.f8308F.get()) {
                        C3418l.this.m10283m();
                    }
                }

                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        C3418l.this.m10283m();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }
            });
            this.f8338x.setWebChromeClient(new C3686c(this.f8337w, this.f8312J) {
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (C3418l.this.f8309G != null && !C3418l.this.f8309G.isFinishing() && i == 100) {
                        C3418l.this.m10280k();
                    }
                }
            });
            if (this.f8311I == null) {
                this.f8311I = C3969d.m13089a(C3513m.m10963a(), this.f8321g, this.f8310H);
            }
            this.f8338x.setDownloadListener(new DownloadListener() {
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (C3418l.this.f8311I != null) {
                        C3418l.this.f8311I.mo20860d();
                    }
                }
            });
            SSWebView sSWebView3 = this.f8338x;
            if (sSWebView3 != null) {
                sSWebView3.setUserAgentString(C3881j.m12666a(sSWebView3.getWebView(), (int) BuildConfig.VERSION_CODE));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.f8338x.setMixedContentMode(0);
            }
            this.f8338x.getWebView().setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!C3418l.this.f8314L) {
                        C3418l.this.f8330p.onTouch(view, motionEvent);
                    }
                    if (C3418l.this.f8314L || motionEvent.getAction() != 1) {
                        return false;
                    }
                    C3418l.this.f8338x.getWebView().performClick();
                    boolean unused = C3418l.this.f8314L = true;
                    return false;
                }
            });
            this.f8338x.getWebView().setOnClickListener(this.f8330p);
            C3090e.m8890a(C3513m.m10963a(), this.f8321g, this.f8310H);
            C3882k.m12668a(this.f8338x, this.f8321g.mo19522O());
        }
        if (this.f8338x != null) {
            m10287q();
        }
    }

    /* renamed from: j */
    private void m10278j() {
        C3666w wVar = new C3666w(C3513m.m10963a());
        this.f8337w = wVar;
        wVar.mo20354b(this.f8338x).mo20364d(this.f8321g.mo19532Y()).mo20368e(this.f8321g.mo19569ac()).mo20337a(this.f8321g).mo20353b(-1).mo20331a(this.f8321g.mo19513F()).mo20360c(this.f8310H).mo20370f(C3898x.m12810i(this.f8321g)).mo20334a(this.f8338x);
    }

    /* renamed from: a */
    public static boolean m10264a(C3431n nVar) {
        if (nVar == null) {
            return false;
        }
        return m10268c(nVar) || m10266b(nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m10280k() {
        if (!this.f8308F.get() && !this.f8313K.get()) {
            this.f8308F.set(true);
            C3090e.m8892a(C3513m.m10963a(), this.f8321g, this.f8310H, System.currentTimeMillis() - this.f8307E, true);
            m10281l();
        }
    }

    /* renamed from: l */
    private void m10281l() {
        this.f8320f.setVisibility(8);
        if (!m10268c(this.f8321g) && mo19484c()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "timeVisible", new float[]{0.0f, 1.0f});
            this.f8327m = ofFloat;
            ofFloat.setDuration(100);
            this.f8327m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) C3418l.this.f8339y.getLayoutParams();
                    layoutParams.weight = (float) (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.25d);
                    C3418l.this.mo19481a((float) (1.0d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.2d)));
                    C3418l.this.f8339y.setLayoutParams(layoutParams);
                }
            });
            this.f8327m.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m10283m() {
        if (!this.f8308F.get()) {
            m10284n();
            this.f8313K.set(true);
            Activity activity = this.f8309G;
            if (activity instanceof C3623c) {
                ((C3623c) activity).mo18354k();
            }
            this.f8331q.setVisibility(8);
            this.f8332r.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f8332r.getLayoutParams();
            layoutParams.addRule(13);
            layoutParams.addRule(10, 0);
            this.f8332r.setLayoutParams(layoutParams);
            if (this.f8321g.mo19520M() != null && !TextUtils.isEmpty(this.f8321g.mo19520M().mo19468a())) {
                C3792d.m12395a().mo20614a(this.f8321g.mo19520M().mo19468a(), (ImageView) this.f8335u);
            }
            this.f8333s.setText(this.f8321g.mo19518K());
            this.f8334t.setText(this.f8321g.mo19529V());
            if (this.f8336v != null) {
                mo19483b();
                this.f8336v.setClickable(true);
                this.f8336v.setOnClickListener(this.f8329o);
                this.f8336v.setOnTouchListener(this.f8329o);
            }
        }
    }

    /* renamed from: n */
    private void m10284n() {
        if (m10268c(this.f8321g)) {
            Activity activity = this.f8309G;
            if (activity instanceof C3623c) {
                ((C3623c) activity).mo18348f();
                ((C3623c) this.f8309G).mo18347e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19483b() {
        C3431n nVar = this.f8321g;
        if (nVar != null && !TextUtils.isEmpty(nVar.mo19530W())) {
            this.f8336v.setText(this.f8321g.mo19530W());
        }
    }

    /* renamed from: o */
    private void m10285o() {
        if (mo19484c()) {
            this.f8304B.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f8305C, "translationY", new float[]{16.0f, 0.0f}).setDuration(500);
            this.f8323i = duration;
            duration.setRepeatMode(2);
            this.f8323i.setRepeatCount(-1);
            this.f8323i.start();
            this.f8304B.setClickable(true);
            this.f8304B.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!C3418l.this.f8314L) {
                        C3418l.this.f8330p.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    C3418l.this.f8326l = ObjectAnimator.ofFloat(this, "timeSlide", new float[]{0.0f, 1.0f});
                    C3418l.this.f8326l.setDuration(200);
                    C3418l.this.f8326l.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) C3418l.this.f8339y.getLayoutParams();
                            layoutParams.weight = (float) (((double) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f)) + 0.25d);
                            C3418l.this.mo19481a((float) (0.800000011920929d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.5d)));
                            C3418l.this.f8339y.setLayoutParams(layoutParams);
                        }
                    });
                    C3418l.this.f8304B.performClick();
                    boolean unused = C3418l.this.f8314L = true;
                    C3418l.this.f8326l.start();
                    C3418l.this.f8304B.setVisibility(8);
                    return true;
                }
            });
            this.f8304B.setOnClickListener(this.f8330p);
        }
        if (!m10286p()) {
            this.f8322h.setVisibility(8);
            this.f8316b.setVisibility(0);
            this.f8315a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f8315a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C3090e.m8914b(C3513m.m10963a(), C3418l.this.f8321g, C3418l.this.f8310H);
                }
            });
            C3431n nVar = this.f8321g;
            if (!(nVar == null || nVar.mo19523P() == null || this.f8321g.mo19523P().size() <= 0 || this.f8321g.mo19523P().get(0) == null || TextUtils.isEmpty(this.f8321g.mo19523P().get(0).mo19468a()))) {
                C3792d.m12395a().mo20613a(this.f8321g.mo19523P().get(0), this.f8315a);
            }
        }
        try {
            C3707a.m12124a().mo17599a(this.f8321g.mo19523P().get(0).mo19468a()).mo17638a(C2838t.BITMAP).mo17633a((C2832n) new C2832n<Bitmap>() {
                /* renamed from: a */
                public void mo17178a(int i, String str, Throwable th) {
                }

                /* renamed from: a */
                public void mo17179a(C2828j<Bitmap> jVar) {
                    Bitmap a;
                    try {
                        Bitmap b = jVar.mo17647b();
                        if (Build.VERSION.SDK_INT >= 17 && (a = C2571a.m6621a(C3513m.m10963a(), b, 25)) != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(C3513m.m10963a().getResources(), a);
                            if (!C3418l.this.m10286p()) {
                                C3418l.this.f8316b.setBackground(bitmapDrawable);
                                return;
                            }
                            C3418l.this.f8318d.setBackground(bitmapDrawable);
                            View view = null;
                            if (C3418l.this.f8309G instanceof C3623c) {
                                view = ((C3623c) C3418l.this.f8309G).mo18356m();
                            }
                            if (view != null && (view.getParent() instanceof View)) {
                                ((View) view.getParent()).setBackground(bitmapDrawable);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public boolean m10286p() {
        return C3431n.m10311c(this.f8321g);
    }

    /* renamed from: q */
    private void m10287q() {
        this.f8340z = new AnimatorSet();
        LinearLayout linearLayout = this.f8303A;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", new float[]{-9.0f, 9.0f}).setDuration(300);
            this.f8324j = duration;
            duration.setRepeatMode(2);
            this.f8324j.setRepeatCount(-1);
            AnimatorSet.Builder play = this.f8340z.play(this.f8324j);
            for (int i = 1; i < this.f8303A.getChildCount(); i++) {
                float f = i % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f8303A.getChildAt(i), "translationY", new float[]{-f, f}).setDuration(300);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.f8340z.start();
        }
    }

    /* renamed from: c */
    public boolean mo19484c() {
        return this.f8321g.mo19570ad() == 15 || this.f8321g.mo19570ad() == 16;
    }

    /* renamed from: a */
    public void mo19481a(float f) {
        try {
            ((C3623c) this.f8309G).mo18355l();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static boolean m10266b(C3431n nVar) {
        if (nVar.mo19519L() == 3 && nVar.mo19615f() == 6 && !C3434p.m10489a(nVar) && nVar.mo19579am() == 1 && (nVar.mo19580an() == 0.0f || nVar.mo19580an() == 100.0f)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m10268c(C3431n nVar) {
        if (nVar == null || nVar.mo19519L() != 3 || nVar.mo19615f() != 5 || C3434p.m10489a(nVar)) {
            return false;
        }
        if (nVar.mo19580an() == 0.0f || nVar.mo19580an() == 100.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m10270d(C3431n nVar) {
        if (nVar != null && C3513m.m10973h().mo19854g() && nVar.mo19512E() && !m10266b(nVar) && !m10268c(nVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo19485d() {
        FrameLayout frameLayout = this.f8339y;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            this.f8306D.setVisibility(0);
        }
    }

    /* renamed from: e */
    public void mo19486e() {
        SSWebView sSWebView;
        C3104n nVar = this.f8312J;
        if (!(nVar == null || (sSWebView = this.f8338x) == null)) {
            nVar.mo18696a(sSWebView);
        }
        ObjectAnimator objectAnimator = this.f8325k;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.f8325k.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f8326l;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f8326l.cancel();
        }
        ObjectAnimator objectAnimator3 = this.f8327m;
        if (objectAnimator3 != null) {
            objectAnimator3.removeAllUpdateListeners();
            this.f8327m.cancel();
        }
        AnimatorSet animatorSet = this.f8340z;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimator4 = this.f8324j;
        if (objectAnimator4 != null) {
            objectAnimator4.cancel();
        }
        ObjectAnimator objectAnimator5 = this.f8323i;
        if (objectAnimator5 != null) {
            objectAnimator5.cancel();
        }
        if (this.f8338x != null) {
            C3706z.m12119a(C3513m.m10963a(), this.f8338x.getWebView());
            C3706z.m12120a(this.f8338x.getWebView());
        }
        this.f8338x = null;
        C3666w wVar = this.f8337w;
        if (wVar != null) {
            wVar.mo20379n();
        }
        C3104n nVar2 = this.f8312J;
        if (nVar2 != null) {
            nVar2.mo18703f();
        }
    }

    /* renamed from: f */
    public void mo19487f() {
        C3666w wVar = this.f8337w;
        if (wVar != null) {
            wVar.mo20377l();
        }
        C3104n nVar = this.f8312J;
        if (nVar != null) {
            nVar.mo18701d();
        }
    }

    /* renamed from: g */
    public void mo19488g() {
        C3104n nVar = this.f8312J;
        if (nVar != null) {
            nVar.mo18702e();
        }
    }

    /* renamed from: h */
    public void mo19489h() {
        C3580t.m11322a().mo20133b(true);
        C3666w wVar = this.f8337w;
        if (wVar != null) {
            wVar.mo20378m();
        }
    }
}
