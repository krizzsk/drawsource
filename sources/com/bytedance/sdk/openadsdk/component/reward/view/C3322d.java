package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.p141a.C3223c;
import com.bytedance.sdk.openadsdk.component.reward.p141a.C3224d;
import com.bytedance.sdk.openadsdk.component.reward.p141a.C3232e;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import com.bytedance.sdk.openadsdk.core.p144b.C3367g;
import com.bytedance.sdk.openadsdk.core.p149e.C3418l;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.core.p153i.C3471f;
import com.bytedance.sdk.openadsdk.core.p154j.C3473a;
import com.bytedance.sdk.openadsdk.core.widget.C3694c;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.view.d */
/* compiled from: RewardFullVideoLayout */
public class C3322d {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public String f7929A;

    /* renamed from: B */
    private int f7930B;

    /* renamed from: C */
    private boolean f7931C = false;

    /* renamed from: a */
    int f7932a = 3;

    /* renamed from: b */
    Activity f7933b;

    /* renamed from: c */
    C3431n f7934c;

    /* renamed from: d */
    C3223c f7935d;

    /* renamed from: e */
    public View f7936e;

    /* renamed from: f */
    RelativeLayout f7937f;

    /* renamed from: g */
    ImageView f7938g;

    /* renamed from: h */
    RelativeLayout f7939h;

    /* renamed from: i */
    TTRoundRectImageView f7940i;

    /* renamed from: j */
    TextView f7941j;

    /* renamed from: k */
    TextView f7942k;

    /* renamed from: l */
    TextView f7943l;

    /* renamed from: m */
    FrameLayout f7944m;

    /* renamed from: n */
    FrameLayout f7945n;

    /* renamed from: o */
    FrameLayout f7946o;

    /* renamed from: p */
    TTRatingBar2 f7947p;

    /* renamed from: q */
    TextView f7948q;

    /* renamed from: r */
    TextView f7949r;

    /* renamed from: s */
    RelativeLayout f7950s;

    /* renamed from: t */
    C3224d f7951t;

    /* renamed from: u */
    boolean f7952u = true;

    /* renamed from: v */
    protected int f7953v = 0;

    /* renamed from: w */
    protected final AtomicBoolean f7954w = new AtomicBoolean(false);

    /* renamed from: x */
    public C3418l f7955x;

    /* renamed from: y */
    Runnable f7956y = new Runnable() {
        public void run() {
            try {
                if (C3322d.this.f7935d != null && C3322d.this.f7939h != null) {
                    int[] iArr = new int[2];
                    C3322d.this.f7939h.getLocationOnScreen(iArr);
                    C3322d.this.f7935d.mo18942b(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    /* renamed from: z */
    private boolean f7957z;

    /* renamed from: a */
    private void m9859a(C3473a aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo19213a() {
        return true;
    }

    public C3322d(Activity activity) {
        this.f7933b = activity;
    }

    /* renamed from: a */
    public void mo19220a(C3431n nVar, String str, int i, boolean z, C3223c cVar) {
        if (!this.f7931C) {
            this.f7931C = true;
            this.f7934c = nVar;
            this.f7929A = str;
            this.f7930B = i;
            this.f7957z = z;
            this.f7935d = cVar;
            if (this.f7933b != null && mo19213a()) {
                C3224d dVar = new C3224d(this.f7933b);
                this.f7951t = dVar;
                dVar.mo18951a(nVar, this.f7929A, this.f7930B);
            }
            m9861s();
            C3418l lVar = new C3418l(this.f7933b, this.f7934c, str, this.f7944m);
            this.f7955x = lVar;
            lVar.mo19480a();
        }
    }

    /* renamed from: s */
    private void m9861s() {
        RelativeLayout relativeLayout;
        Activity activity = this.f7933b;
        this.f7936e = activity.findViewById(C2914t.m8158e(activity, "tt_reward_root"));
        Activity activity2 = this.f7933b;
        this.f7937f = (RelativeLayout) activity2.findViewById(C2914t.m8158e(activity2, "tt_video_reward_bar"));
        Activity activity3 = this.f7933b;
        this.f7943l = (TextView) activity3.findViewById(C2914t.m8158e(activity3, "tt_reward_ad_download"));
        Activity activity4 = this.f7933b;
        this.f7940i = (TTRoundRectImageView) activity4.findViewById(C2914t.m8158e(activity4, "tt_reward_ad_icon"));
        Activity activity5 = this.f7933b;
        this.f7941j = (TextView) activity5.findViewById(C2914t.m8158e(activity5, "tt_reward_ad_appname"));
        Activity activity6 = this.f7933b;
        this.f7942k = (TextView) activity6.findViewById(C2914t.m8158e(activity6, "tt_comment_vertical"));
        Activity activity7 = this.f7933b;
        this.f7948q = (TextView) activity7.findViewById(C2914t.m8158e(activity7, "tt_ad_logo"));
        Activity activity8 = this.f7933b;
        this.f7938g = (ImageView) activity8.findViewById(C2914t.m8158e(activity8, "tt_video_ad_close"));
        Activity activity9 = this.f7933b;
        this.f7939h = (RelativeLayout) activity9.findViewById(C2914t.m8158e(activity9, "tt_video_ad_close_layout"));
        Activity activity10 = this.f7933b;
        this.f7944m = (FrameLayout) activity10.findViewById(C2914t.m8158e(activity10, "tt_video_reward_container"));
        Activity activity11 = this.f7933b;
        this.f7945n = (FrameLayout) activity11.findViewById(C2914t.m8158e(activity11, "tt_click_upper_non_content_layout"));
        Activity activity12 = this.f7933b;
        this.f7946o = (FrameLayout) activity12.findViewById(C2914t.m8158e(activity12, "tt_click_lower_non_content_layout"));
        Activity activity13 = this.f7933b;
        this.f7947p = (TTRatingBar2) activity13.findViewById(C2914t.m8158e(activity13, "tt_rb_score"));
        Activity activity14 = this.f7933b;
        this.f7950s = (RelativeLayout) activity14.findViewById(C2914t.m8158e(activity14, "tt_full_reward_video_loading_container"));
        TTRatingBar2 tTRatingBar2 = this.f7947p;
        if (tTRatingBar2 != null) {
            C3904y.m12861a((TextView) null, tTRatingBar2, this.f7934c, (Context) this.f7933b);
        }
        C3224d dVar = this.f7951t;
        if (!(dVar == null || !dVar.mo18954d() || this.f7951t.mo18953c() == null || (relativeLayout = this.f7950s) == null)) {
            relativeLayout.addView(this.f7951t.mo18953c(), new LinearLayout.LayoutParams(-1, -1));
            this.f7951t.mo18950a();
        }
        C3431n nVar = this.f7934c;
        if (nVar != null && nVar.mo19589aw()) {
            Activity activity15 = this.f7933b;
            this.f7949r = (TextView) activity15.findViewById(C2914t.m8158e(activity15, "tt_reward_ad_description"));
        }
    }

    /* renamed from: a */
    public void mo19222a(String str, boolean z) {
        mo19233g();
        C3904y.m12853a((View) this.f7948q, C3434p.m10497i(this.f7934c) ? 8 : 0);
        mo19232f();
        mo19221a(str);
        mo19223a(z);
        mo19229d();
        if (this.f7957z) {
            mo19227c();
        }
        C3431n nVar = this.f7934c;
        if (nVar != null && nVar.mo19590ax() != null) {
            m9859a(this.f7934c.mo19590ax());
        }
    }

    /* renamed from: a */
    public void mo19212a(int i, int i2) {
        FrameLayout frameLayout;
        if (!this.f7952u) {
            mo19216a(4);
        }
        try {
            if (this.f7930B == 2 && this.f7934c.mo19660v() == 1) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f7943l.getLayoutParams();
                layoutParams.height = (int) C3904y.m12868b(this.f7933b, 55.0f);
                layoutParams.topMargin = (int) C3904y.m12868b(this.f7933b, 20.0f);
                this.f7943l.setLayoutParams(layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f7937f.getLayoutParams();
                layoutParams2.bottomMargin = (int) C3904y.m12868b(this.f7933b, 12.0f);
                this.f7937f.setLayoutParams(layoutParams2);
            }
        } catch (Throwable unused) {
        }
        C3431n nVar = this.f7934c;
        if (nVar != null && nVar.mo19660v() == 1 && (frameLayout = this.f7944m) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int c = C3904y.m12877c((Context) this.f7933b);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f7944m.getLayoutParams();
            layoutParams3.width = c;
            int i3 = (c * 9) / 16;
            layoutParams3.height = i3;
            this.f7944m.setLayoutParams(layoutParams3);
            this.f7953v = (C3904y.m12881d((Context) this.f7933b) - i3) / 2;
            C2905l.m8118e("RewardFullVideoLayout", "NonContentAreaHeight:" + this.f7953v);
        }
    }

    /* renamed from: a */
    public void mo19219a(C3362c cVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener, C3232e eVar) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        C3431n nVar;
        C3362c cVar2 = cVar;
        View.OnTouchListener onTouchListener2 = onTouchListener;
        final View.OnClickListener onClickListener2 = onClickListener;
        final C3232e eVar2 = eVar;
        C3431n nVar2 = this.f7934c;
        if (!(nVar2 == null || nVar2.mo19662w() == null)) {
            if (this.f7934c.mo19660v() != 5) {
                if (this.f7934c.mo19662w().f8220e) {
                    this.f7943l.setOnClickListener(cVar);
                    this.f7943l.setOnTouchListener(onTouchListener2);
                } else {
                    this.f7943l.setOnClickListener(onClickListener2);
                }
            }
            if (this.f7934c.mo19660v() == 1) {
                if (this.f7934c.mo19662w().f8216a) {
                    C3904y.m12855a((View) this.f7937f, (View.OnClickListener) cVar, "TTBaseVideoActivity#mRlDownloadBar");
                    C3904y.m12856a((View) this.f7937f, onTouchListener2, "TTBaseVideoActivity#mRlDownloadBar");
                    this.f7941j.setOnClickListener(cVar);
                    this.f7941j.setOnTouchListener(onTouchListener2);
                    this.f7942k.setOnClickListener(cVar);
                    this.f7942k.setOnTouchListener(onTouchListener2);
                    this.f7947p.setOnClickListener(cVar);
                    this.f7947p.setOnTouchListener(onTouchListener2);
                    this.f7940i.setOnClickListener(cVar);
                    this.f7940i.setOnTouchListener(onTouchListener2);
                } else {
                    C3904y.m12855a((View) this.f7937f, onClickListener2, "TTBaseVideoActivity#mRlDownloadBar");
                    this.f7941j.setOnClickListener(onClickListener2);
                    this.f7942k.setOnClickListener(onClickListener2);
                    this.f7947p.setOnClickListener(onClickListener2);
                    this.f7940i.setOnClickListener(onClickListener2);
                }
            } else if (this.f7934c.mo19660v() == 5) {
                if (this.f7934c.mo19662w().f8220e) {
                    C3362c cVar3 = cVar;
                    final C3232e eVar3 = eVar;
                    C33231 r0 = new C3367g("VAST_ACTION_BUTTON", this.f7934c.mo19590ax(), cVar3) {
                        /* renamed from: a */
                        public void mo19064a() {
                            if (C3322d.this.f7934c != null && C3322d.this.f7934c.mo19590ax() != null) {
                                C3322d.this.f7934c.mo19590ax().mo19887a().mo19966g(eVar3.mo18999s());
                            }
                        }
                    };
                    C33242 r02 = new C3367g("VAST_ICON", this.f7934c.mo19590ax(), cVar3) {
                        /* renamed from: a */
                        public void mo19064a() {
                            if (C3322d.this.f7934c != null && C3322d.this.f7934c.mo19590ax() != null && C3322d.this.f7934c.mo19590ax().mo19893b() != null) {
                                C3322d.this.f7934c.mo19590ax().mo19893b().mo19933a(eVar3.mo18999s());
                            }
                        }
                    };
                    TextView textView = this.f7943l;
                    if (textView != null) {
                        textView.setOnClickListener(r0);
                        this.f7943l.setOnTouchListener(r0);
                    }
                    TTRoundRectImageView tTRoundRectImageView = this.f7940i;
                    if (tTRoundRectImageView != null) {
                        tTRoundRectImageView.setOnClickListener(r02);
                        this.f7940i.setOnTouchListener(r02);
                    }
                    TextView textView2 = this.f7941j;
                    if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                        this.f7941j.setOnClickListener(r0);
                        this.f7941j.setOnTouchListener(r0);
                    }
                    TextView textView3 = this.f7949r;
                    if (textView3 != null && !TextUtils.isEmpty(textView3.getText())) {
                        this.f7949r.setOnClickListener(r0);
                        this.f7949r.setOnTouchListener(r0);
                    }
                } else {
                    C33253 r03 = new View.OnClickListener() {
                        public void onClick(View view) {
                            View.OnClickListener onClickListener = onClickListener2;
                            if (onClickListener != null) {
                                onClickListener.onClick(view);
                            }
                            if (C3322d.this.f7934c != null && C3322d.this.f7934c.mo19590ax() != null) {
                                C3322d.this.f7934c.mo19590ax().mo19887a().mo19966g(eVar2.mo18999s());
                            }
                        }
                    };
                    TextView textView4 = this.f7943l;
                    if (textView4 != null) {
                        textView4.setOnClickListener(r03);
                    }
                    TextView textView5 = this.f7941j;
                    if (textView5 != null && !TextUtils.isEmpty(textView5.getText())) {
                        this.f7941j.setOnClickListener(r03);
                    }
                    TextView textView6 = this.f7949r;
                    if (textView6 != null && !TextUtils.isEmpty(textView6.getText())) {
                        this.f7949r.setOnClickListener(r03);
                    }
                    TTRoundRectImageView tTRoundRectImageView2 = this.f7940i;
                    if (tTRoundRectImageView2 != null) {
                        tTRoundRectImageView2.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                View.OnClickListener onClickListener = onClickListener2;
                                if (onClickListener != null) {
                                    onClickListener.onClick(view);
                                }
                                if (C3322d.this.f7934c != null && C3322d.this.f7934c.mo19590ax() != null && C3322d.this.f7934c.mo19590ax().mo19893b() != null) {
                                    C3322d.this.f7934c.mo19590ax().mo19893b().mo19933a(eVar2.mo18999s());
                                }
                            }
                        });
                    }
                }
            } else if (this.f7934c.mo19662w().f8218c) {
                C3904y.m12855a((View) this.f7937f, (View.OnClickListener) cVar, "TTBaseVideoActivity#mRlDownloadBar");
                C3904y.m12856a((View) this.f7937f, onTouchListener2, "TTBaseVideoActivity#mRlDownloadBar");
            } else {
                C3904y.m12855a((View) this.f7937f, onClickListener2, "TTBaseVideoActivity#mRlDownloadBar");
            }
        }
        if (!(this.f7944m == null || (nVar = this.f7934c) == null || nVar.mo19662w() == null)) {
            if (!this.f7934c.mo19662w().f8221f || C3418l.m10266b(this.f7934c)) {
                mo19217a(onClickListener2);
            } else {
                mo19217a((View.OnClickListener) cVar);
                m9858a(cVar);
            }
        }
        C3431n nVar3 = this.f7934c;
        if (nVar3 != null && nVar3.mo19660v() == 1) {
            if (!(this.f7934c.mo19662w() == null || (frameLayout2 = this.f7945n) == null)) {
                C3904y.m12853a((View) frameLayout2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f7945n.getLayoutParams();
                layoutParams.height = this.f7953v;
                this.f7945n.setLayoutParams(layoutParams);
                if (this.f7934c.mo19662w().f8217b) {
                    this.f7945n.setOnClickListener(cVar);
                    this.f7945n.setOnTouchListener(onTouchListener2);
                } else {
                    this.f7945n.setOnClickListener(onClickListener2);
                }
            }
            if (!(this.f7934c.mo19662w() == null || (frameLayout = this.f7946o) == null)) {
                C3904y.m12853a((View) frameLayout, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f7946o.getLayoutParams();
                layoutParams2.height = this.f7953v;
                this.f7946o.setLayoutParams(layoutParams2);
                if (this.f7934c.mo19662w().f8219d) {
                    this.f7946o.setOnClickListener(cVar);
                    this.f7946o.setOnTouchListener(onTouchListener2);
                } else {
                    this.f7946o.setOnClickListener(onClickListener2);
                }
            }
        }
        TextView textView7 = this.f7948q;
        if (textView7 != null) {
            textView7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C2905l.m8114c("mAdLogo", "mAdLogo,,,,,,,onClick,,,,,");
                    try {
                        TTWebsiteActivity.m8711a(C3322d.this.f7933b, C3322d.this.f7934c, C3322d.this.f7929A);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo19224b() {
        C3904y.m12853a((View) this.f7944m, 8);
        C3904y.m12853a((View) this.f7945n, 8);
        C3904y.m12853a((View) this.f7946o, 8);
        C3904y.m12853a((View) this.f7937f, 8);
        C3904y.m12853a((View) this.f7941j, 8);
        C3904y.m12853a((View) this.f7940i, 8);
        C3904y.m12853a((View) this.f7942k, 8);
        C3904y.m12853a((View) this.f7947p, 8);
        C3904y.m12853a((View) this.f7938g, 8);
        C3904y.m12853a((View) this.f7939h, 8);
        C3904y.m12853a((View) this.f7943l, 8);
        C3904y.m12853a((View) this.f7948q, 8);
        C3904y.m12853a((View) this.f7950s, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo19227c() {
        int z = this.f7934c.mo19668z();
        this.f7932a = z;
        if (z == -200) {
            C3471f h = C3513m.m10973h();
            this.f7932a = h.mo19865k(C3898x.m12794f(this.f7934c) + "");
        }
        if (this.f7932a == -1 && this.f7952u) {
            C3904y.m12853a((View) this.f7937f, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo19229d() {
        if (this.f7934c.mo19660v() == 3) {
            int[] iArr = {Color.parseColor("#0070FF")};
            int e = C3904y.m12886e(this.f7933b, 17.0f);
            int parseColor = Color.parseColor("#80000000");
            C3694c.C3695a e2 = new C3694c.C3695a().mo20467a(iArr[0]).mo20470b(parseColor).mo20468a(iArr).mo20471c(e).mo20472d(0).mo20473e(C3904y.m12886e(this.f7933b, 3.0f));
            Activity activity = this.f7933b;
            C3694c.m12056a((LinearLayout) activity.findViewById(C2914t.m8158e(activity, "tt_reward_ad_download_layout")), e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19223a(boolean z) {
        if (this.f7930B == 1) {
            TextView textView = this.f7941j;
            if (textView != null) {
                textView.setMaxWidth((int) C3904y.m12868b(this.f7933b, 153.0f));
            }
        } else {
            TextView textView2 = this.f7941j;
            if (textView2 != null) {
                textView2.setMaxWidth((int) C3904y.m12868b(this.f7933b, 404.0f));
            }
            RelativeLayout relativeLayout = this.f7939h;
            if (relativeLayout != null && z) {
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    int b = m9860b("status_bar_height");
                    int b2 = m9860b("navigation_bar_height");
                    if (b > 0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (b > marginLayoutParams.topMargin) {
                            marginLayoutParams.topMargin = b;
                            this.f7935d.mo18935a(b);
                        }
                    }
                    if (b2 > 0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (b2 > marginLayoutParams2.rightMargin) {
                            marginLayoutParams2.rightMargin = b2;
                        }
                    }
                }
            }
        }
        if (!this.f7957z) {
            C3904y.m12853a((View) this.f7937f, 0);
        }
    }

    /* renamed from: b */
    private int m9860b(String str) {
        Resources resources = this.f7933b.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19221a(String str) {
        TextView textView;
        if (!this.f7934c.mo19589aw()) {
            TextView textView2 = this.f7943l;
            if (textView2 != null) {
                if (this.f7934c.mo19660v() == 3) {
                    str = mo19231e();
                }
                textView2.setText(str);
            }
        } else if (this.f7934c.mo19590ax() != null && TextUtils.isEmpty(this.f7934c.mo19590ax().mo19901f()) && (textView = this.f7943l) != null) {
            C3904y.m12853a((View) textView, 8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo19231e() {
        String j = C3898x.m12813j((Context) this.f7933b);
        if (j == null) {
            j = "";
        }
        boolean z = false;
        boolean z2 = true;
        try {
            if (!j.equals(Locale.CHINESE.getLanguage()) && !j.equals(Locale.CHINA.getLanguage())) {
                if (!j.equals(Locale.TRADITIONAL_CHINESE.getLanguage())) {
                    z2 = false;
                }
            }
            z = j.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
        }
        C3431n nVar = this.f7934c;
        String str = "Install";
        if (nVar == null) {
            return str;
        }
        if (!TextUtils.isEmpty(nVar.mo19530W())) {
            str = this.f7934c.mo19530W();
            if (str == null || !C3898x.m12811i(str) || str.length() <= 2) {
                if (str != null && !C3898x.m12811i(str) && str.length() > 7 && (z2 || z)) {
                    str = m9862t();
                }
            } else if (z2 || z) {
                str = m9862t();
            }
        } else if (this.f7934c.mo19519L() != 4) {
            str = "View";
        }
        if (z && !C3898x.m12811i(str)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7943l.getLayoutParams();
            layoutParams.bottomMargin = C3904y.m12886e(this.f7933b, 4.0f);
            this.f7943l.setLayoutParams(layoutParams);
        }
        return str;
    }

    /* renamed from: t */
    private String m9862t() {
        C3431n nVar = this.f7934c;
        if (nVar == null) {
            return null;
        }
        return nVar.mo19519L() != 4 ? "View" : "Install";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo19232f() {
        TextView textView = this.f7942k;
        if (textView != null) {
            C3904y.m12859a(textView, this.f7934c, (Context) this.f7933b, "tt_comment_num");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo19233g() {
        if (!(this.f7940i == null || this.f7934c.mo19520M() == null || TextUtils.isEmpty(this.f7934c.mo19520M().mo19468a()))) {
            C3792d.m12395a().mo20613a(this.f7934c.mo19520M(), (ImageView) this.f7940i);
            if (!(this.f7934c.mo19590ax() == null || this.f7934c.mo19590ax().mo19893b() == null)) {
                this.f7934c.mo19590ax().mo19893b().mo19936b(0);
            }
        }
        if (this.f7941j != null) {
            if (this.f7930B != 1 || this.f7934c.mo19567aa() == null || TextUtils.isEmpty(this.f7934c.mo19567aa().mo19404b())) {
                this.f7941j.setText(this.f7934c.mo19528U());
            } else {
                this.f7941j.setText(this.f7934c.mo19567aa().mo19404b());
            }
        }
        TextView textView = this.f7949r;
        if (textView != null) {
            textView.setText(this.f7934c.mo19529V());
        }
    }

    /* renamed from: b */
    public void mo19226b(boolean z) {
        this.f7952u = z;
    }

    /* renamed from: a */
    public void mo19216a(int i) {
        C3904y.m12853a((View) this.f7937f, i);
    }

    /* renamed from: a */
    public int mo19214a(C3431n nVar) {
        int f = C2914t.m8159f(this.f7933b, "tt_activity_full_reward_video_default_style");
        if (C3418l.m10266b(nVar)) {
            nVar.mo19632k(4);
            return C2914t.m8159f(this.f7933b, "tt_activity_full_reward_video_landingpage_style");
        } else if (C3418l.m10268c(nVar)) {
            nVar.mo19632k(4);
            return C2914t.m8159f(this.f7933b, "tt_activity_full_reward_landingpage_style");
        } else {
            int v = nVar.mo19660v();
            if (v == 0) {
                return C2914t.m8159f(this.f7933b, "tt_activity_full_reward_video_default_style");
            }
            if (v == 1) {
                return C3434p.m10497i(this.f7934c) ? C2914t.m8159f(this.f7933b, "tt_activity_full_reward_video_default_style") : C2914t.m8159f(this.f7933b, "tt_activity_full_reward_video_no_bar_style");
            } else if (v == 3) {
                return C2914t.m8159f(this.f7933b, "tt_activity_full_reward_video_new_bar_style");
            } else {
                if (v != 5) {
                    return f;
                }
                return C2914t.m8159f(this.f7933b, "tt_activity_full_reward_video_vast_bar_style");
            }
        }
    }

    /* renamed from: h */
    public FrameLayout mo19234h() {
        return this.f7944m;
    }

    /* renamed from: b */
    public void mo19225b(int i) {
        C3904y.m12853a((View) this.f7948q, i);
    }

    /* renamed from: c */
    public void mo19228c(int i) {
        int i2 = this.f7932a;
        if (i2 != -1 && i == i2 && !this.f7954w.get()) {
            this.f7937f.setVisibility(0);
            this.f7954w.set(true);
            mo19235i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo19235i() {
        if (this.f7937f != null) {
            Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.0f);
            Keyframe ofFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
            Keyframe ofFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
            Keyframe ofFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
            Keyframe ofFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
            Keyframe ofFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
            PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe("scaleX", new Keyframe[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6});
            PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe("scaleY", new Keyframe[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f7937f, new PropertyValuesHolder[]{ofKeyframe, ofKeyframe2});
            ofPropertyValuesHolder.setDuration(1000);
            ofPropertyValuesHolder.start();
        }
    }

    /* renamed from: d */
    public void mo19230d(int i) {
        C3904y.m12853a((View) this.f7938g, i);
        C3904y.m12853a((View) this.f7939h, i);
        RelativeLayout relativeLayout = this.f7939h;
        if (relativeLayout != null) {
            relativeLayout.post(this.f7956y);
        }
    }

    /* renamed from: j */
    public boolean mo19236j() {
        ImageView imageView = this.f7938g;
        if (imageView == null || this.f7939h == null || imageView.getVisibility() != 0 || this.f7939h.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo19217a(View.OnClickListener onClickListener) {
        C3904y.m12855a((View) this.f7944m, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    /* renamed from: a */
    private void m9858a(C3362c cVar) {
        C3904y.m12856a((View) this.f7944m, (View.OnTouchListener) cVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    /* renamed from: k */
    public View mo19237k() {
        return this.f7939h;
    }

    /* renamed from: l */
    public View mo19238l() {
        return this.f7937f;
    }

    /* renamed from: a */
    public void mo19215a(float f) {
        C3904y.m12852a((View) this.f7938g, f);
        C3904y.m12852a((View) this.f7939h, f);
    }

    /* renamed from: a */
    public void mo19218a(Animation animation) {
        RelativeLayout relativeLayout = this.f7950s;
        if (relativeLayout != null) {
            relativeLayout.setAnimation(animation);
        }
    }

    /* renamed from: m */
    public void mo19239m() {
        try {
            if (this.f7951t != null) {
                this.f7951t.mo18952b();
            }
            if (this.f7936e != null && this.f7950s != null) {
                ((ViewGroup) this.f7936e).removeView(this.f7950s);
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout = this.f7950s;
            if (relativeLayout != null) {
                relativeLayout.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: n */
    public void mo19240n() {
        C3418l lVar = this.f7955x;
        if (lVar != null) {
            lVar.mo19486e();
        }
        RelativeLayout relativeLayout = this.f7939h;
        if (relativeLayout != null) {
            relativeLayout.removeCallbacks(this.f7956y);
        }
    }

    /* renamed from: o */
    public void mo19241o() {
        C3418l lVar = this.f7955x;
        if (lVar != null) {
            lVar.mo19487f();
        }
    }

    /* renamed from: p */
    public void mo19242p() {
        C3418l lVar = this.f7955x;
        if (lVar != null) {
            lVar.mo19488g();
        }
    }

    /* renamed from: q */
    public void mo19243q() {
        C3418l lVar = this.f7955x;
        if (lVar != null) {
            lVar.mo19489h();
        }
    }

    /* renamed from: r */
    public void mo19244r() {
        RelativeLayout relativeLayout = this.f7937f;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            this.f7937f.setLayoutParams(layoutParams);
            this.f7937f.setVisibility(0);
        }
    }
}
