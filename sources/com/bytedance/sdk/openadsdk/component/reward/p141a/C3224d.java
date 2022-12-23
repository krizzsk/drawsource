package com.bytedance.sdk.openadsdk.component.reward.p141a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.component.p108d.C2828j;
import com.bytedance.sdk.component.p108d.C2832n;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.TwoSemicirclesView;
import com.bytedance.sdk.openadsdk.p165d.C3707a;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.d */
/* compiled from: RewardFullVideoLoadingManager */
public class C3224d {

    /* renamed from: a */
    TTRoundRectImageView f7600a;

    /* renamed from: b */
    TextView f7601b;

    /* renamed from: c */
    ProgressBar f7602c;

    /* renamed from: d */
    TextView f7603d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3431n f7604e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Context f7605f;

    /* renamed from: g */
    private int f7606g = 0;

    /* renamed from: h */
    private View f7607h;

    /* renamed from: i */
    private boolean f7608i = false;

    /* renamed from: j */
    private LinearLayout f7609j;

    /* renamed from: k */
    private TwoSemicirclesView f7610k;

    /* renamed from: l */
    private TwoSemicirclesView f7611l;

    /* renamed from: m */
    private TextView f7612m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f7613n;

    /* renamed from: o */
    private int f7614o;

    /* renamed from: p */
    private AnimatorSet f7615p;

    /* renamed from: q */
    private AnimatorSet f7616q;

    public C3224d(Context context) {
        this.f7605f = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|10|11|(2:13|(2:15|(2:17|(2:19|29)(2:20|30))(2:21|31))(2:22|32))(2:23|33)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002c */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037 A[Catch:{ all -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f A[Catch:{ all -> 0x0054 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18951a(com.bytedance.sdk.openadsdk.core.p149e.C3431n r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 0
            r2.f7604e = r3     // Catch:{ all -> 0x0054 }
            boolean r3 = com.bytedance.sdk.openadsdk.core.p149e.C3431n.m10311c((com.bytedance.sdk.openadsdk.core.p149e.C3431n) r3)     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0053
            com.bytedance.sdk.openadsdk.core.e.n r3 = r2.f7604e     // Catch:{ all -> 0x0054 }
            boolean r3 = com.bytedance.sdk.openadsdk.core.p149e.C3434p.m10497i(r3)     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0015
            goto L_0x0053
        L_0x0015:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002c }
            com.bytedance.sdk.openadsdk.core.e.n r1 = r2.f7604e     // Catch:{ JSONException -> 0x002c }
            com.bytedance.sdk.openadsdk.core.e.n$a r1 = r1.mo19514G()     // Catch:{ JSONException -> 0x002c }
            java.lang.String r1 = r1.mo19682g()     // Catch:{ JSONException -> 0x002c }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x002c }
            java.lang.String r1 = "loading_page_type"
            int r3 = r3.optInt(r1, r0)     // Catch:{ JSONException -> 0x002c }
            r2.f7606g = r3     // Catch:{ JSONException -> 0x002c }
        L_0x002c:
            r2.f7613n = r4     // Catch:{ all -> 0x0054 }
            r2.f7614o = r5     // Catch:{ all -> 0x0054 }
            r3 = 1
            r2.f7608i = r3     // Catch:{ all -> 0x0054 }
            int r4 = r2.f7606g     // Catch:{ all -> 0x0054 }
            if (r4 == r3) goto L_0x004f
            r3 = 2
            if (r4 == r3) goto L_0x004b
            r3 = 3
            if (r4 == r3) goto L_0x0047
            r3 = 4
            if (r4 == r3) goto L_0x0043
            r2.f7608i = r0     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x0043:
            r2.m9399h()     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x0047:
            r2.m9398g()     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x004b:
            r2.m9397f()     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x004f:
            r2.m9396e()     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x0053:
            return
        L_0x0054:
            r2.f7608i = r0
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.p141a.C3224d.mo18951a(com.bytedance.sdk.openadsdk.core.e.n, java.lang.String, int):void");
    }

    /* renamed from: a */
    public void mo18950a() {
        try {
            int i = this.f7606g;
            if (i == 1) {
                m9400i();
            } else if (i == 2) {
                m9401j();
            } else if (i == 3) {
                m9402k();
            } else if (i == 4) {
                m9403l();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private void m9396e() {
        View inflate = LayoutInflater.from(this.f7605f).inflate(C2914t.m8159f(this.f7605f, "tt_full_reward_video_loading"), (ViewGroup) null, false);
        this.f7607h = inflate;
        this.f7600a = (TTRoundRectImageView) inflate.findViewById(C2914t.m8158e(this.f7605f, "tt_loading_icon"));
        this.f7601b = (TextView) this.f7607h.findViewById(C2914t.m8158e(this.f7605f, "tt_loading_appname"));
        this.f7602c = (ProgressBar) this.f7607h.findViewById(C2914t.m8158e(this.f7605f, "tt_loading_progressbar"));
        this.f7603d = (TextView) this.f7607h.findViewById(C2914t.m8158e(this.f7605f, "tt_loading_progress_number"));
        this.f7612m = (TextView) this.f7607h.findViewById(C2914t.m8158e(this.f7605f, "tt_ad_loading_logo"));
        if (this.f7614o == 1 && this.f7604e.mo19567aa() != null && !TextUtils.isEmpty(this.f7604e.mo19567aa().mo19404b())) {
            this.f7601b.setText(this.f7604e.mo19567aa().mo19404b());
        } else if (!TextUtils.isEmpty(this.f7604e.mo19528U())) {
            this.f7601b.setText(this.f7604e.mo19528U());
        } else {
            this.f7601b.setVisibility(8);
        }
        m9404m();
        this.f7612m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.m8711a(C3224d.this.f7605f, C3224d.this.f7604e, C3224d.this.f7613n);
            }
        });
    }

    /* renamed from: f */
    private void m9397f() {
        View inflate = LayoutInflater.from(this.f7605f).inflate(C2914t.m8159f(this.f7605f, "tt_full_reward_video_loading2"), (ViewGroup) null, false);
        this.f7607h = inflate;
        this.f7600a = (TTRoundRectImageView) inflate.findViewById(C2914t.m8158e(this.f7605f, "tt_loading_icon"));
        this.f7603d = (TextView) this.f7607h.findViewById(C2914t.m8158e(this.f7605f, "tt_loading_progress_number"));
        this.f7612m = (TextView) this.f7607h.findViewById(C2914t.m8158e(this.f7605f, "tt_ad_loading_logo"));
        m9404m();
        this.f7612m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.m8711a(C3224d.this.f7605f, C3224d.this.f7604e, C3224d.this.f7613n);
            }
        });
    }

    /* renamed from: g */
    private void m9398g() {
        View inflate = LayoutInflater.from(this.f7605f).inflate(C2914t.m8159f(this.f7605f, "tt_full_reward_video_loading3"), (ViewGroup) null, false);
        this.f7607h = inflate;
        this.f7609j = (LinearLayout) inflate.findViewById(C2914t.m8158e(this.f7605f, "wave_container"));
        this.f7603d = (TextView) this.f7607h.findViewById(C2914t.m8158e(this.f7605f, "tt_loading_progress_number"));
        TextView textView = (TextView) this.f7607h.findViewById(C2914t.m8158e(this.f7605f, "tt_ad_loading_logo"));
        this.f7612m = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.m8711a(C3224d.this.f7605f, C3224d.this.f7604e, C3224d.this.f7613n);
            }
        });
    }

    /* renamed from: h */
    private void m9399h() {
        View inflate = LayoutInflater.from(this.f7605f).inflate(C2914t.m8159f(this.f7605f, "tt_full_reward_video_loading4"), (ViewGroup) null, false);
        this.f7607h = inflate;
        this.f7610k = (TwoSemicirclesView) inflate.findViewById(C2914t.m8158e(this.f7605f, "inner_circle"));
        this.f7611l = (TwoSemicirclesView) this.f7607h.findViewById(C2914t.m8158e(this.f7605f, "outer_circle"));
        this.f7610k.setRadius((float) C3904y.m12886e(this.f7605f, 80.0f));
        Paint paintTwo = this.f7610k.getPaintTwo();
        paintTwo.setColor(Color.parseColor("#C4C4C4"));
        this.f7610k.setPaintTwo(paintTwo);
        this.f7611l.setRadius((float) C3904y.m12886e(this.f7605f, 95.0f));
        Paint paintTwo2 = this.f7611l.getPaintTwo();
        paintTwo2.setStrokeWidth(6.0f);
        paintTwo2.setColor(Color.parseColor("#118BFF"));
        this.f7611l.setPaintTwo(paintTwo2);
        this.f7603d = (TextView) this.f7607h.findViewById(C2914t.m8158e(this.f7605f, "tt_loading_progress_number"));
        TextView textView = (TextView) this.f7607h.findViewById(C2914t.m8158e(this.f7605f, "tt_ad_loading_logo"));
        this.f7612m = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.m8711a(C3224d.this.f7605f, C3224d.this.f7604e, C3224d.this.f7613n);
            }
        });
    }

    /* renamed from: i */
    private void m9400i() {
        m9405n();
    }

    /* renamed from: j */
    private void m9401j() {
        Context context = this.f7605f;
        this.f7600a.setAnimation(AnimationUtils.loadAnimation(context, C2914t.m8165l(context, "tt_loading_two_icon_scale")));
        m9405n();
    }

    /* renamed from: k */
    private void m9402k() {
        this.f7615p = new AnimatorSet();
        LinearLayout linearLayout = this.f7609j;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", new float[]{-9.0f, 9.0f}).setDuration(300);
            duration.setRepeatMode(2);
            duration.setRepeatCount(-1);
            AnimatorSet.Builder play = this.f7615p.play(duration);
            for (int i = 1; i < this.f7609j.getChildCount(); i++) {
                float f = i % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f7609j.getChildAt(i), "translationY", new float[]{-f, f}).setDuration(300);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.f7615p.start();
        }
        m9405n();
    }

    /* renamed from: l */
    private void m9403l() {
        this.f7615p = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f7610k, "rotation", new float[]{0.0f, 360.0f}).setDuration(1500);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatCount(-1);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f7611l, "rotation", new float[]{0.0f, 360.0f}).setDuration(2500);
        duration2.setRepeatCount(-1);
        this.f7615p.playTogether(new Animator[]{duration, duration2});
        this.f7615p.start();
        m9405n();
    }

    /* renamed from: m */
    private void m9404m() {
        if (this.f7604e.mo19520M() == null || TextUtils.isEmpty(this.f7604e.mo19520M().mo19468a())) {
            this.f7600a.setVisibility(8);
            return;
        }
        try {
            C3707a.m12122a(this.f7604e.mo19520M()).mo17633a((C2832n) new C2832n<Bitmap>() {
                /* renamed from: a */
                public void mo17179a(C2828j<Bitmap> jVar) {
                    if (jVar != null) {
                        try {
                            if (jVar.mo17647b() != null) {
                                C3224d.this.f7600a.setImageBitmap(jVar.mo17647b());
                                return;
                            }
                        } catch (Throwable unused) {
                            C3224d.this.f7600a.setVisibility(8);
                            return;
                        }
                    }
                    C3224d.this.f7600a.setVisibility(8);
                }

                /* renamed from: a */
                public void mo17178a(int i, String str, Throwable th) {
                    C3224d.this.f7600a.setVisibility(8);
                }
            });
        } catch (Throwable unused) {
            this.f7600a.setVisibility(8);
        }
    }

    /* renamed from: n */
    private void m9405n() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{1, 80});
        ofInt.setDuration(2000);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (C3224d.this.f7602c != null) {
                    C3224d.this.f7602c.setProgress(intValue);
                }
                C3224d.this.f7603d.setText(String.valueOf(intValue));
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{81, 99});
        ofInt2.setDuration(3000);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (C3224d.this.f7602c != null) {
                    C3224d.this.f7602c.setProgress(intValue);
                }
                C3224d.this.f7603d.setText(String.valueOf(intValue));
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofInt).before(ofInt2);
        animatorSet.start();
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f7616q = animatorSet2;
        animatorSet2.play(ofInt).before(ofInt2);
        this.f7616q.start();
    }

    /* renamed from: b */
    public void mo18952b() {
        AnimatorSet animatorSet = this.f7615p;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f7616q;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    /* renamed from: c */
    public View mo18953c() {
        return this.f7607h;
    }

    /* renamed from: d */
    public boolean mo18954d() {
        return this.f7608i;
    }
}
