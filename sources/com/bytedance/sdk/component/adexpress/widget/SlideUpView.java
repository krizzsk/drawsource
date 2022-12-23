package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.utils.C2914t;

public class SlideUpView extends RelativeLayout {

    /* renamed from: a */
    private ImageView f5980a;

    /* renamed from: b */
    private ImageView f5981b;

    /* renamed from: c */
    private ImageView f5982c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView f5983d;

    /* renamed from: e */
    private TextView f5984e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AnimatorSet f5985f = new AnimatorSet();

    /* renamed from: g */
    private AnimatorSet f5986g = new AnimatorSet();

    /* renamed from: h */
    private AnimatorSet f5987h = new AnimatorSet();

    /* renamed from: i */
    private AnimatorSet f5988i = new AnimatorSet();

    public SlideUpView(Context context) {
        super(context);
        m7293a(context);
    }

    /* renamed from: a */
    private void m7293a(Context context) {
        if (context == null) {
            context = C2570c.m6618a();
        }
        inflate(context, C2914t.m8159f(context, "tt_dynamic_splash_slide_up"), this);
        this.f5982c = (ImageView) findViewById(C2914t.m8158e(context, "tt_splash_slide_up_guide_bar"));
        this.f5980a = (ImageView) findViewById(C2914t.m8158e(context, "tt_splash_slide_up_finger"));
        this.f5981b = (ImageView) findViewById(C2914t.m8158e(context, "tt_splash_slide_up_circle"));
        this.f5984e = (TextView) findViewById(C2914t.m8158e(context, "slide_guide_text"));
        this.f5983d = (ImageView) findViewById(C2914t.m8158e(context, "tt_splash_slide_up_bg"));
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.f5985f;
    }

    /* renamed from: a */
    public void mo17344a() {
        mo17345b();
        this.f5985f.start();
        this.f5985f.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideUpView.this.postDelayed(new Runnable() {
                    public void run() {
                        SlideUpView.this.f5985f.start();
                    }
                }, 200);
            }
        });
    }

    /* renamed from: b */
    public void mo17345b() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f5980a, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f5980a, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f5980a, "translationY", new float[]{0.0f, C2572b.m6622a(getContext(), -100.0f)});
        ofFloat3.setInterpolator(new C2710a(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (int) C2572b.m6622a(getContext(), 100.0f)});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) SlideUpView.this.f5983d.getLayoutParams();
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SlideUpView.this.f5983d.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new C2710a(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f5983d, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f5983d, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f5981b, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f5981b, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f5981b, "scaleX", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f5981b, "scaleY", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f5981b, "translationY", new float[]{0.0f, C2572b.m6622a(getContext(), -100.0f)});
        ValueAnimator valueAnimator = ofInt;
        ofFloat10.setInterpolator(new C2710a(0.2f, 0.0f, 0.3f, 1.0f));
        this.f5986g.setDuration(50);
        this.f5988i.setDuration(1500);
        this.f5987h.setDuration(50);
        this.f5986g.playTogether(new Animator[]{ofFloat2, ofFloat7, ofFloat5});
        this.f5987h.playTogether(new Animator[]{ofFloat, ofFloat6, ofFloat8, ofFloat9, ofFloat4});
        this.f5988i.playTogether(new Animator[]{ofFloat3, valueAnimator, ofFloat10});
        this.f5985f.playSequentially(new Animator[]{this.f5987h, this.f5988i, this.f5986g});
    }

    /* renamed from: c */
    public void mo17346c() {
        AnimatorSet animatorSet = this.f5985f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f5987h;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.f5986g;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.f5988i;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
    }

    public void setGuideText(String str) {
        this.f5984e.setText(str);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo17346c();
    }
}
