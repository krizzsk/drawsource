package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.p144b.C3359a;
import com.bytedance.sdk.openadsdk.core.p144b.C3365e;
import com.bytedance.sdk.openadsdk.core.p149e.C3414j;
import com.bytedance.sdk.openadsdk.core.p149e.C3417k;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.p165d.C3707a;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.com.bytedance.overseas.sdk.p185a.C3967b;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import java.util.List;

public class FullInteractionStyleView extends BackupView {

    /* renamed from: a */
    private float f7887a;

    /* renamed from: m */
    private boolean f7888m;

    /* renamed from: n */
    private int f7889n;

    /* renamed from: o */
    private int f7890o;

    /* renamed from: p */
    private int f7891p = 1;

    /* renamed from: q */
    private View f7892q;

    /* renamed from: r */
    private View f7893r;

    /* renamed from: s */
    private FrameLayout f7894s;

    /* renamed from: t */
    private C3365e f7895t;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19169a(View view, int i, C3414j jVar) {
    }

    public FullInteractionStyleView(Context context, String str) {
        super(context, str);
        this.f8806b = context;
    }

    /* renamed from: a */
    public void mo19170a(C3431n nVar, float f, int i, int i2, int i3) {
        this.f7887a = f;
        this.f7891p = i;
        this.f8807c = nVar;
        this.f8810f = "fullscreen_interstitial_ad";
        this.f7889n = i2;
        this.f7890o = i3;
        mo19989a(this.f8813i);
        m9789b();
    }

    /* renamed from: b */
    private void m9789b() {
        this.f8811g = C3904y.m12886e(this.f8806b, (float) this.f7889n);
        this.f8812h = C3904y.m12886e(this.f8806b, (float) this.f7890o);
        int i = (int) (this.f7887a * 1000.0f);
        if (this.f7891p == 1) {
            if (i == 666) {
                m9796e();
            } else if (i == 1000) {
                m9792c();
            } else if (i == 1500) {
                m9803k();
            } else if (i != 1777) {
                m9785a(0.562f);
                m9804l();
            } else {
                m9805m();
            }
        } else if (i == 562) {
            m9801i();
        } else if (i == 666) {
            m9799g();
        } else if (i == 1000) {
            m9792c();
        } else if (i != 1500) {
            m9785a(1.777f);
            m9802j();
        } else {
            m9800h();
        }
    }

    /* renamed from: c */
    private void m9792c() {
        this.f7892q = LayoutInflater.from(this.f8806b).inflate(C2914t.m8159f(this.f8806b, "tt_interaction_style_1_1"), this, true);
        m9794d();
        m9798f();
    }

    /* renamed from: d */
    private void m9794d() {
        this.f7894s = (FrameLayout) this.f7892q.findViewById(C2914t.m8158e(this.f8806b, "tt_ad_container"));
        ImageView imageView = (ImageView) this.f7892q.findViewById(C2914t.m8158e(this.f8806b, "tt_full_img"));
        TTRoundRectImageView tTRoundRectImageView = (TTRoundRectImageView) this.f7892q.findViewById(C2914t.m8158e(this.f8806b, "tt_full_ad_icon"));
        TextView textView = (TextView) this.f7892q.findViewById(C2914t.m8158e(this.f8806b, "tt_full_ad_app_name"));
        TextView textView2 = (TextView) this.f7892q.findViewById(C2914t.m8158e(this.f8806b, "tt_full_ad_download"));
        LinearLayout linearLayout = (LinearLayout) this.f7892q.findViewById(C2914t.m8158e(this.f8806b, "tt_ad_logo_layout"));
        if (!TextUtils.isEmpty(this.f8807c.mo19530W())) {
            textView2.setText(this.f8807c.mo19530W());
        }
        m9786a(this.f7894s, imageView);
        if (this.f8807c.mo19520M() != null && !TextUtils.isEmpty(this.f8807c.mo19520M().mo19468a())) {
            C3792d.m12395a().mo20614a(this.f8807c.mo19520M().mo19468a(), (ImageView) tTRoundRectImageView);
        }
        textView.setText(getTitle());
        m9790b((View) this.f7894s);
        m9790b((View) imageView);
        m9790b((View) tTRoundRectImageView);
        m9790b((View) textView);
        m9790b((View) textView2);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m8711a(FullInteractionStyleView.this.f8806b, FullInteractionStyleView.this.f8807c, FullInteractionStyleView.this.f8810f);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: e */
    private void m9796e() {
        this.f7892q = LayoutInflater.from(this.f8806b).inflate(C2914t.m8159f(this.f8806b, "tt_interaction_style_2_3"), this, true);
        m9794d();
        m9798f();
    }

    /* renamed from: f */
    private void m9798f() {
        TextView textView = (TextView) this.f7892q.findViewById(C2914t.m8158e(this.f8806b, "tt_full_ad_desc"));
        if (textView != null) {
            textView.setText(getDescription());
            m9790b((View) textView);
        }
    }

    /* renamed from: g */
    private void m9799g() {
        this.f7892q = LayoutInflater.from(this.f8806b).inflate(C2914t.m8159f(this.f8806b, "tt_interaction_style_2_3_h"), this, true);
        m9794d();
        m9798f();
    }

    /* renamed from: h */
    private void m9800h() {
        this.f7892q = LayoutInflater.from(this.f8806b).inflate(C2914t.m8159f(this.f8806b, "tt_interaction_style_3_2_h"), this, true);
        m9794d();
    }

    /* renamed from: i */
    private void m9801i() {
        this.f7892q = LayoutInflater.from(this.f8806b).inflate(C2914t.m8159f(this.f8806b, "tt_interaction_style_9_16_h"), this, true);
        m9794d();
        m9798f();
    }

    /* renamed from: j */
    private void m9802j() {
        this.f7892q = LayoutInflater.from(this.f8806b).inflate(C2914t.m8159f(this.f8806b, "tt_interaction_style_16_9_h"), this, true);
        m9794d();
    }

    /* renamed from: k */
    private void m9803k() {
        View inflate = LayoutInflater.from(this.f8806b).inflate(C2914t.m8159f(this.f8806b, "tt_interaction_style_3_2"), this, true);
        this.f7892q = inflate;
        this.f7894s = (FrameLayout) inflate.findViewById(C2914t.m8158e(this.f8806b, "tt_ad_container"));
        ImageView imageView = (ImageView) this.f7892q.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_img"));
        TextView textView = (TextView) this.f7892q.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_desc"));
        m9786a(this.f7894s, imageView);
        textView.setText(getDescription());
        m9790b((View) this.f7894s);
        m9790b((View) imageView);
        m9790b((View) textView);
        ((LinearLayout) this.f7892q.findViewById(C2914t.m8158e(this.f8806b, "tt_ad_logo_layout"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m8711a(FullInteractionStyleView.this.f8806b, FullInteractionStyleView.this.f8807c, FullInteractionStyleView.this.f8810f);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    private void m9786a(FrameLayout frameLayout, ImageView imageView) {
        if (this.f8807c != null) {
            boolean c = C3431n.m10311c(this.f8807c);
            if (this.f8807c.mo19517J() == null || !c) {
                m9787a(imageView);
                C3904y.m12853a((View) imageView, 0);
                C3904y.m12853a((View) frameLayout, 8);
                return;
            }
            C3904y.m12853a((View) imageView, 8);
            C3904y.m12853a((View) frameLayout, 0);
        }
    }

    /* renamed from: a */
    private void m9787a(ImageView imageView) {
        List<C3417k> P;
        if (this.f8807c != null && (P = this.f8807c.mo19523P()) != null && P.size() > 0) {
            C3707a.m12122a(P.get(0)).mo17632a(imageView);
        }
    }

    /* renamed from: l */
    private void m9804l() {
        this.f7892q = LayoutInflater.from(this.f8806b).inflate(C2914t.m8159f(this.f8806b, "tt_interaction_style_9_16_v"), this, true);
        m9794d();
    }

    /* renamed from: m */
    private void m9805m() {
        this.f7892q = LayoutInflater.from(this.f8806b).inflate(C2914t.m8159f(this.f8806b, "tt_interaction_style_16_9_v"), this, true);
        m9794d();
        m9798f();
    }

    /* renamed from: b */
    private void m9790b(View view) {
        if (view != null) {
            C3359a aVar = this.f7895t;
            if (aVar == null) {
                aVar = new C3359a(this.f8806b, this.f8807c, this.f8810f, C3898x.m12747a(this.f8810f));
                aVar.mo19311a(m9784a(this.f8807c, this.f8806b));
            }
            view.setOnTouchListener(aVar);
            view.setOnClickListener(aVar);
        }
    }

    /* renamed from: a */
    private C3968c m9784a(C3431n nVar, Context context) {
        if (nVar != null && nVar.mo19519L() == 4) {
            return new C3967b(context, nVar, this.f8810f);
        }
        return null;
    }

    public View getInteractionStyleRootView() {
        return this.f7892q;
    }

    public void setIsMute(boolean z) {
        this.f7888m = z;
        View view = this.f7893r;
        if (view != null && (view instanceof NativeVideoTsView)) {
            ((NativeVideoTsView) view).setIsQuiet(z);
        }
    }

    public FrameLayout getVideoContainer() {
        return this.f7894s;
    }

    public void setDownloadListener(C3365e eVar) {
        this.f7895t = eVar;
    }

    private float getHeightDp() {
        return (float) C3904y.m12882d(this.f8806b, (float) C3904y.m12891h(this.f8806b));
    }

    private float getWidthDp() {
        return (float) C3904y.m12882d(this.f8806b, (float) C3904y.m12892i(this.f8806b));
    }

    /* renamed from: a */
    private void m9785a(float f) {
        float f2;
        float f3;
        int i;
        int i2;
        float heightDp = getHeightDp();
        float widthDp = getWidthDp();
        if (this.f7891p == 2) {
            f2 = Math.max(heightDp, widthDp);
            f3 = Math.min(heightDp, widthDp);
        } else {
            f2 = Math.min(heightDp, widthDp);
            f3 = Math.max(heightDp, widthDp);
        }
        if (this.f7891p != 2 && C3904y.m12879c((Activity) this.f8806b)) {
            f3 -= (float) C3904y.m12882d(this.f8806b, C3904y.m12893j(this.f8806b));
        }
        int i3 = 20;
        int i4 = 0;
        if (this.f7891p != 2) {
            if (!(f == 0.0f || f == 100.0f)) {
                float f4 = (float) 20;
                i = (int) Math.max((f3 - (((f2 - f4) - f4) / f)) / 2.0f, 0.0f);
                i2 = 20;
                i4 = 20;
                i3 = i;
                ((Activity) this.f8806b).getWindow().getDecorView().setPadding(C3904y.m12886e(this.f8806b, (float) i4), C3904y.m12886e(this.f8806b, (float) i3), C3904y.m12886e(this.f8806b, (float) i2), C3904y.m12886e(this.f8806b, (float) i));
            }
        } else if (!(f == 0.0f || f == 100.0f)) {
            float f5 = (float) 20;
            i2 = (int) Math.max((f2 - (((f3 - f5) - f5) * f)) / 2.0f, 0.0f);
            i4 = i2;
            i = 20;
            ((Activity) this.f8806b).getWindow().getDecorView().setPadding(C3904y.m12886e(this.f8806b, (float) i4), C3904y.m12886e(this.f8806b, (float) i3), C3904y.m12886e(this.f8806b, (float) i2), C3904y.m12886e(this.f8806b, (float) i));
        }
        i = 0;
        i2 = 0;
        i3 = 0;
        ((Activity) this.f8806b).getWindow().getDecorView().setPadding(C3904y.m12886e(this.f8806b, (float) i4), C3904y.m12886e(this.f8806b, (float) i3), C3904y.m12886e(this.f8806b, (float) i2), C3904y.m12886e(this.f8806b, (float) i));
    }
}
