package com.bytedance.sdk.openadsdk.component.reward.p142b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.p141a.C3223c;
import com.bytedance.sdk.openadsdk.component.reward.view.C3322d;
import com.bytedance.sdk.openadsdk.component.reward.view.RatioImageView;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p144b.C3359a;
import com.bytedance.sdk.openadsdk.core.p144b.C3360b;
import com.bytedance.sdk.openadsdk.core.p149e.C3417k;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.p165d.C3707a;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.com.bytedance.overseas.sdk.p185a.C3967b;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.b.b */
/* compiled from: RewardFullTypeImage */
public class C3257b extends C3255a {

    /* renamed from: i */
    protected View f7718i;

    /* renamed from: j */
    private boolean f7719j = false;

    /* renamed from: k */
    private int f7720k = 33;

    /* renamed from: l */
    private RatioImageView f7721l;

    /* renamed from: m */
    private TTRoundRectImageView f7722m;

    /* renamed from: n */
    private TextView f7723n;

    /* renamed from: o */
    private TextView f7724o;

    /* renamed from: p */
    private TextView f7725p;

    /* renamed from: q */
    private TTRatingBar2 f7726q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public TextView f7727r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C3431n f7728s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f7729t = "fullscreen_interstitial_ad";

    public C3257b(Activity activity, C3431n nVar, int i, int i2) {
        super(activity, nVar, i, i2);
        boolean z = false;
        this.f7728s = nVar;
        this.f7720k = nVar.mo19570ad();
        this.f7719j = this.f7714e == 2 ? true : z;
    }

    /* renamed from: d */
    private void m9601d() {
        boolean z = this.f7714e == 2;
        this.f7719j = z;
        if (z) {
            int i = this.f7720k;
            if (i == 3) {
                m9605f();
            } else if (i != 33) {
                m9609j();
            } else {
                m9607h();
            }
        } else {
            int i2 = this.f7720k;
            if (i2 == 3) {
                m9604e();
            } else if (i2 != 33) {
                m9608i();
            } else {
                m9606g();
            }
        }
    }

    /* renamed from: e */
    private void m9604e() {
        this.f7718i = LayoutInflater.from(this.f7710a).inflate(C2914t.m8159f(this.f7710a, "tt_activity_full_image_model_3_191_v"), (ViewGroup) null, true);
        m9610k();
    }

    /* renamed from: f */
    private void m9605f() {
        View inflate = LayoutInflater.from(this.f7710a).inflate(C2914t.m8159f(this.f7710a, "tt_activity_full_image_model_3_191_h"), (ViewGroup) null, true);
        this.f7718i = inflate;
        this.f7721l = (RatioImageView) inflate.findViewById(C2914t.m8158e(this.f7710a, "tt_ratio_image_view"));
        this.f7722m = (TTRoundRectImageView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_full_ad_icon"));
        this.f7723n = (TextView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_full_ad_app_name"));
        this.f7724o = (TextView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_full_desc"));
        this.f7725p = (TextView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_full_comment"));
        this.f7727r = (TextView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_full_ad_download"));
        final View findViewById = this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_image_full_bar"));
        mo19090a((View) this.f7721l);
        mo19090a((View) this.f7722m);
        mo19090a((View) this.f7723n);
        mo19090a((View) this.f7724o);
        mo19090a((View) this.f7725p);
        mo19090a((View) this.f7727r);
        ((TextView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_ad_logo"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m8711a(C3257b.this.f7710a, C3257b.this.f7728s, C3257b.this.f7729t);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        this.f7727r.post(new Runnable() {
            public void run() {
                int width = findViewById.getWidth() / 2;
                if (width >= C3904y.m12882d(C3513m.m10963a(), 90.0f)) {
                    ViewGroup.LayoutParams layoutParams = C3257b.this.f7727r.getLayoutParams();
                    if (layoutParams.width > 0) {
                        layoutParams.width = Math.min(width, layoutParams.width);
                        C3257b.this.f7727r.setLayoutParams(layoutParams);
                    }
                }
            }
        });
    }

    /* renamed from: g */
    private void m9606g() {
        this.f7718i = LayoutInflater.from(this.f7710a).inflate(C2914t.m8159f(this.f7710a, "tt_activity_full_image_model_33_v"), (ViewGroup) null, true);
        m9610k();
    }

    /* renamed from: h */
    private void m9607h() {
        this.f7718i = LayoutInflater.from(this.f7710a).inflate(C2914t.m8159f(this.f7710a, "tt_activity_full_image_model_33_h"), (ViewGroup) null, true);
        m9610k();
    }

    /* renamed from: i */
    private void m9608i() {
        View inflate = LayoutInflater.from(this.f7710a).inflate(C2914t.m8159f(this.f7710a, "tt_activity_full_image_model_173_v"), (ViewGroup) null, true);
        this.f7718i = inflate;
        this.f7721l = (RatioImageView) inflate.findViewById(C2914t.m8158e(this.f7710a, "tt_ratio_image_view"));
        this.f7722m = (TTRoundRectImageView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_full_ad_icon"));
        this.f7723n = (TextView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_full_ad_app_name"));
        this.f7724o = (TextView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_full_desc"));
        this.f7727r = (TextView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_full_ad_download"));
        mo19090a((View) this.f7721l);
        mo19090a((View) this.f7722m);
        mo19090a((View) this.f7723n);
        mo19090a((View) this.f7724o);
        mo19090a((View) this.f7727r);
        ((TextView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_ad_logo"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m8711a(C3257b.this.f7710a, C3257b.this.f7728s, C3257b.this.f7729t);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: j */
    private void m9609j() {
        this.f7718i = LayoutInflater.from(this.f7710a).inflate(C2914t.m8159f(this.f7710a, "tt_activity_full_image_model_173_h"), (ViewGroup) null, true);
        m9610k();
    }

    /* renamed from: k */
    private void m9610k() {
        View view = this.f7718i;
        if (view != null) {
            this.f7721l = (RatioImageView) view.findViewById(C2914t.m8158e(this.f7710a, "tt_ratio_image_view"));
            this.f7722m = (TTRoundRectImageView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_full_ad_icon"));
            this.f7723n = (TextView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_full_ad_app_name"));
            this.f7724o = (TextView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_full_desc"));
            this.f7725p = (TextView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_full_comment"));
            this.f7726q = (TTRatingBar2) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_full_rb_score"));
            this.f7727r = (TextView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_full_ad_download"));
            mo19090a((View) this.f7721l);
            mo19090a((View) this.f7722m);
            mo19090a((View) this.f7723n);
            mo19090a((View) this.f7724o);
            mo19090a((View) this.f7725p);
            mo19090a((View) this.f7726q);
            mo19090a((View) this.f7727r);
            ((TextView) this.f7718i.findViewById(C2914t.m8158e(this.f7710a, "tt_ad_logo"))).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    try {
                        TTWebsiteActivity.m8711a(C3257b.this.f7710a, C3257b.this.f7728s, C3257b.this.f7729t);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: d */
    private void m9602d(C3431n nVar) {
        if (nVar != null) {
            RatioImageView ratioImageView = this.f7721l;
            if (ratioImageView != null) {
                int i = this.f7720k;
                if (i == 33) {
                    ratioImageView.setRatio(1.0f);
                } else if (i == 3) {
                    ratioImageView.setRatio(1.91f);
                } else {
                    ratioImageView.setRatio(0.56f);
                }
                m9597a((ImageView) this.f7721l);
            }
            if (!(this.f7722m == null || this.f7728s.mo19520M() == null || TextUtils.isEmpty(this.f7728s.mo19520M().mo19468a()))) {
                C3792d.m12395a().mo20614a(this.f7728s.mo19520M().mo19468a(), (ImageView) this.f7722m);
            }
            TextView textView = this.f7723n;
            if (textView != null) {
                textView.setText(mo19089a(this.f7728s));
            }
            TextView textView2 = this.f7724o;
            if (textView2 != null) {
                textView2.setText(mo19091b(this.f7728s));
            }
            m9611l();
            m9612m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo19089a(C3431n nVar) {
        if (nVar == null) {
            return "";
        }
        if (nVar.mo19567aa() != null && !TextUtils.isEmpty(nVar.mo19567aa().mo19404b())) {
            return nVar.mo19567aa().mo19404b();
        }
        if (!TextUtils.isEmpty(nVar.mo19518K())) {
            return nVar.mo19518K();
        }
        if (!TextUtils.isEmpty(nVar.mo19528U())) {
            return nVar.mo19528U();
        }
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo19091b(C3431n nVar) {
        if (nVar == null) {
            return "";
        }
        if (!TextUtils.isEmpty(nVar.mo19528U())) {
            return nVar.mo19528U();
        }
        if (!TextUtils.isEmpty(nVar.mo19529V())) {
            return nVar.mo19529V();
        }
        return "";
    }

    /* renamed from: a */
    private void m9597a(ImageView imageView) {
        List<C3417k> P;
        C3431n nVar = this.f7728s;
        if (nVar != null && (P = nVar.mo19523P()) != null && P.size() > 0) {
            C3707a.m12122a(P.get(0)).mo17632a(imageView);
        }
    }

    /* renamed from: l */
    private void m9611l() {
        TTRatingBar2 tTRatingBar2 = this.f7726q;
        if (tTRatingBar2 != null) {
            C3904y.m12861a((TextView) null, tTRatingBar2, this.f7711b, (Context) this.f7710a);
        }
    }

    /* renamed from: m */
    private void m9612m() {
        C3431n nVar;
        TextView textView = this.f7725p;
        if (textView != null && (nVar = this.f7728s) != null) {
            C3904y.m12859a(textView, nVar, (Context) this.f7710a, "tt_comment_num_backup");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19090a(View view) {
        C3360b bVar;
        if (view != null && this.f7710a != null && this.f7728s != null) {
            if (this.f7717h == null) {
                Activity activity = this.f7710a;
                C3431n nVar = this.f7728s;
                String str = this.f7729t;
                bVar = new C3359a(activity, nVar, str, C3898x.m12747a(str));
                bVar.mo19311a(m9603e(this.f7728s));
                HashMap hashMap = new HashMap();
                if (C3434p.m10497i(this.f7711b)) {
                    hashMap.put("click_scence", 3);
                } else {
                    hashMap.put("click_scence", 1);
                }
                bVar.mo19313a((Map<String, Object>) hashMap);
            } else {
                bVar = this.f7717h;
            }
            if (this.f7710a != null) {
                bVar.mo19304a(this.f7710a);
            }
            view.setOnTouchListener(bVar);
            view.setOnClickListener(bVar);
        }
    }

    /* renamed from: e */
    private C3968c m9603e(C3431n nVar) {
        if (nVar.mo19519L() == 4) {
            return new C3967b(C3513m.m10963a(), nVar, this.f7729t);
        }
        return null;
    }

    /* renamed from: a */
    public void mo19082a(FrameLayout frameLayout) {
        m9601d();
        m9602d(this.f7728s);
        frameLayout.addView(this.f7718i);
    }

    /* renamed from: c */
    public static boolean m9600c(C3431n nVar) {
        if (nVar != null && !C3431n.m10311c(nVar) && nVar.mo19580an() == 100.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo19086b() {
        return m9613n();
    }

    /* renamed from: c */
    public boolean mo19087c() {
        return m9613n();
    }

    /* renamed from: n */
    private boolean m9613n() {
        C3431n nVar = this.f7728s;
        if (nVar != null && nVar.mo19634l() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo19083a(C3223c cVar, C3322d dVar) {
        dVar.mo19225b(8);
        dVar.mo19216a(8);
        cVar.mo18946c(false);
        cVar.mo18948d(false);
        if (this.f7711b.mo19634l() == 2) {
            cVar.mo18939a(false);
            dVar.mo19230d(8);
            return;
        }
        cVar.mo18939a(this.f7711b.mo19582ap());
        dVar.mo19230d(0);
        cVar.mo18947d();
    }
}
