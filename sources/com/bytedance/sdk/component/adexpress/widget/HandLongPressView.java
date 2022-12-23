package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.utils.C2914t;

public class HandLongPressView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f5911a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f5912b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public CircleRippleView f5913c;

    /* renamed from: d */
    private AnimatorSet f5914d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f5915e = true;

    /* renamed from: f */
    private TextView f5916f;

    public HandLongPressView(Context context) {
        super(context);
        this.f5911a = context;
        this.f5914d = new AnimatorSet();
        m7249c();
        m7250d();
        post(new Runnable() {
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) HandLongPressView.this.f5912b.getLayoutParams();
                layoutParams.topMargin = ((int) ((((float) HandLongPressView.this.f5913c.getMeasuredHeight()) / 2.0f) - C2572b.m6622a(HandLongPressView.this.getContext(), 5.0f))) + ((int) C2572b.m6622a(HandLongPressView.this.f5911a, 20.0f));
                layoutParams.leftMargin = ((int) ((((float) HandLongPressView.this.f5913c.getMeasuredWidth()) / 2.0f) - C2572b.m6622a(HandLongPressView.this.getContext(), 5.0f))) + ((int) C2572b.m6622a(HandLongPressView.this.f5911a, 20.0f));
                layoutParams.bottomMargin = (int) ((((float) (-HandLongPressView.this.f5913c.getMeasuredHeight())) / 2.0f) + C2572b.m6622a(HandLongPressView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) ((((float) (-HandLongPressView.this.f5913c.getMeasuredWidth())) / 2.0f) + C2572b.m6622a(HandLongPressView.this.getContext(), 5.0f));
                HandLongPressView.this.f5912b.setLayoutParams(layoutParams);
            }
        });
    }

    /* renamed from: c */
    private void m7249c() {
        this.f5913c = new CircleRippleView(this.f5911a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2572b.m6622a(this.f5911a, 80.0f), (int) C2572b.m6622a(this.f5911a, 80.0f));
        layoutParams.gravity = 51;
        layoutParams.topMargin = (int) C2572b.m6622a(this.f5911a, 20.0f);
        layoutParams.leftMargin = (int) C2572b.m6622a(this.f5911a, 20.0f);
        addView(this.f5913c, layoutParams);
        this.f5913c.mo17259a();
        this.f5912b = new ImageView(this.f5911a);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C2572b.m6622a(this.f5911a, 80.0f), (int) C2572b.m6622a(this.f5911a, 80.0f));
        this.f5912b.setImageResource(C2914t.m8157d(this.f5911a, "tt_splash_hand"));
        addView(this.f5912b, layoutParams2);
        TextView textView = new TextView(this.f5911a);
        this.f5916f = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) C2572b.m6622a(this.f5911a, 10.0f);
        addView(this.f5916f, layoutParams3);
    }

    /* renamed from: d */
    private void m7250d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f5912b, "scaleX", new float[]{1.0f, 0.8f});
        ofFloat.setDuration(1000);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(HandLongPressView.this.f5912b, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(200);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.start();
                HandLongPressView.this.f5912b.setVisibility(0);
            }

            public void onAnimationRepeat(Animator animator) {
                if (HandLongPressView.this.f5915e) {
                    HandLongPressView.this.f5913c.mo17259a();
                    HandLongPressView.this.f5913c.setAlpha(1.0f);
                } else {
                    HandLongPressView.this.f5913c.mo17260b();
                    HandLongPressView.this.f5913c.setAlpha(0.0f);
                }
                HandLongPressView handLongPressView = HandLongPressView.this;
                boolean unused = handLongPressView.f5915e = !handLongPressView.f5915e;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f5912b, "scaleY", new float[]{1.0f, 0.8f});
        ofFloat2.setDuration(1000);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.f5914d.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    public void setGuideText(String str) {
        this.f5916f.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.f5916f.setTextColor(i);
    }

    /* renamed from: a */
    public void mo17280a() {
        this.f5914d.start();
    }

    /* renamed from: b */
    public void mo17281b() {
        AnimatorSet animatorSet = this.f5914d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        CircleRippleView circleRippleView = this.f5913c;
        if (circleRippleView != null) {
            circleRippleView.mo17260b();
        }
    }
}
