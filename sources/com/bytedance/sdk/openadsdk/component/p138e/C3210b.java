package com.bytedance.sdk.openadsdk.component.p138e;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.C3513m;

/* renamed from: com.bytedance.sdk.openadsdk.component.e.b */
/* compiled from: TTAppOpenAdTopManager */
public class C3210b {

    /* renamed from: g */
    private static String f7552g = "Skip";

    /* renamed from: a */
    private TextView f7553a;

    /* renamed from: b */
    private TextView f7554b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3209a f7555c;

    /* renamed from: d */
    private int f7556d = 0;

    /* renamed from: e */
    private float f7557e = 5.0f;

    /* renamed from: f */
    private int f7558f = 0;

    /* renamed from: h */
    private ValueAnimator f7559h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f7560i;

    /* renamed from: j */
    private boolean f7561j;

    public C3210b() {
        f7552g = C2914t.m8151a(C3513m.m10963a(), "tt_txt_skip");
    }

    /* renamed from: a */
    public void mo18872a(Activity activity) {
        this.f7553a = (TextView) activity.findViewById(C2914t.m8158e(activity, "tt_top_dislike"));
        this.f7554b = (TextView) activity.findViewById(C2914t.m8158e(activity, "tt_top_skip"));
        this.f7553a.setText(C2914t.m8151a(C3513m.m10963a(), "tt_reward_feedback"));
        m9296g();
    }

    /* renamed from: g */
    private void m9296g() {
        this.f7553a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3210b.this.f7555c != null) {
                    C3210b.this.f7555c.mo18308b(view);
                }
            }
        });
        this.f7554b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3210b.this.f7555c != null && C3210b.this.f7560i) {
                    C3210b.this.f7555c.mo18307a(view);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo18869a() {
        int i = (int) (this.f7557e * 1000.0f);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, i});
        this.f7559h = ofInt;
        ofInt.setDuration((long) i);
        this.f7559h.setInterpolator(new LinearInterpolator());
        this.f7559h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3210b.this.mo18871a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
    }

    /* renamed from: a */
    public void mo18871a(int i) {
        this.f7556d = i;
        float f = (((float) i) * 1.0f) / 1000.0f;
        int ceil = (int) Math.ceil((double) (this.f7557e - f));
        if (ceil <= 0) {
            ceil = 0;
            C3209a aVar = this.f7555c;
            if (aVar != null && !this.f7561j) {
                aVar.mo18306a();
                this.f7561j = true;
            }
        }
        String valueOf = String.valueOf(ceil);
        if (f >= ((float) this.f7558f)) {
            valueOf = valueOf + " | " + f7552g;
            this.f7560i = true;
        }
        this.f7554b.setText(valueOf);
    }

    /* renamed from: a */
    public void mo18870a(float f) {
        this.f7557e = f;
        if (f <= 0.0f) {
            this.f7557e = 5.0f;
        }
        mo18869a();
    }

    /* renamed from: b */
    public void mo18875b(int i) {
        this.f7558f = i;
    }

    /* renamed from: a */
    public void mo18873a(C3209a aVar) {
        this.f7555c = aVar;
    }

    /* renamed from: b */
    public ValueAnimator mo18874b() {
        return this.f7559h;
    }

    /* renamed from: c */
    public void mo18876c() {
        TextView textView = this.f7554b;
        if (textView != null) {
            textView.performClick();
        }
    }

    /* renamed from: d */
    public int mo18877d() {
        return this.f7556d;
    }

    /* renamed from: e */
    public float mo18878e() {
        return this.f7557e;
    }

    /* renamed from: f */
    public int mo18879f() {
        return this.f7558f;
    }
}
