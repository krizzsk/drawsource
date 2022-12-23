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

public class PressInteractView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f5926a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f5927b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SplashDiffuseView f5928c;

    /* renamed from: d */
    private AnimatorSet f5929d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f5930e = true;

    /* renamed from: f */
    private TextView f5931f;

    public PressInteractView(Context context) {
        super(context);
        this.f5926a = context;
        this.f5929d = new AnimatorSet();
        m7266c();
        m7267d();
        post(new Runnable() {
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PressInteractView.this.f5927b.getLayoutParams();
                layoutParams.topMargin = ((int) ((((float) PressInteractView.this.f5928c.getMeasuredHeight()) / 2.0f) - C2572b.m6622a(PressInteractView.this.getContext(), 5.0f))) + ((int) C2572b.m6622a(PressInteractView.this.f5926a, 20.0f));
                layoutParams.leftMargin = ((int) ((((float) PressInteractView.this.f5928c.getMeasuredWidth()) / 2.0f) - C2572b.m6622a(PressInteractView.this.getContext(), 5.0f))) + ((int) C2572b.m6622a(PressInteractView.this.f5926a, 20.0f));
                layoutParams.bottomMargin = (int) ((((float) (-PressInteractView.this.f5928c.getMeasuredHeight())) / 2.0f) + C2572b.m6622a(PressInteractView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) ((((float) (-PressInteractView.this.f5928c.getMeasuredWidth())) / 2.0f) + C2572b.m6622a(PressInteractView.this.getContext(), 5.0f));
                PressInteractView.this.f5927b.setLayoutParams(layoutParams);
            }
        });
    }

    /* renamed from: c */
    private void m7266c() {
        this.f5928c = new SplashDiffuseView(this.f5926a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2572b.m6622a(this.f5926a, 50.0f), (int) C2572b.m6622a(this.f5926a, 50.0f));
        layoutParams.gravity = 51;
        layoutParams.topMargin = (int) C2572b.m6622a(this.f5926a, 20.0f);
        layoutParams.leftMargin = (int) C2572b.m6622a(this.f5926a, 20.0f);
        addView(this.f5928c, layoutParams);
        this.f5927b = new ImageView(this.f5926a);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C2572b.m6622a(this.f5926a, 78.0f), (int) C2572b.m6622a(this.f5926a, 78.0f));
        this.f5927b.setImageResource(C2914t.m8157d(this.f5926a, "tt_splash_hand"));
        addView(this.f5927b, layoutParams2);
        TextView textView = new TextView(this.f5926a);
        this.f5931f = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) C2572b.m6622a(this.f5926a, 10.0f);
        addView(this.f5931f, layoutParams3);
        this.f5931f.setVisibility(8);
    }

    /* renamed from: d */
    private void m7267d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f5927b, "scaleX", new float[]{1.0f, 0.9f});
        ofFloat.setDuration(1000);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(PressInteractView.this.f5927b, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(200);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.start();
                PressInteractView.this.f5927b.setVisibility(0);
            }

            public void onAnimationRepeat(Animator animator) {
                if (PressInteractView.this.f5930e) {
                    PressInteractView.this.f5928c.mo17353a();
                }
                PressInteractView pressInteractView = PressInteractView.this;
                boolean unused = pressInteractView.f5930e = !pressInteractView.f5930e;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f5927b, "scaleY", new float[]{1.0f, 0.9f});
        ofFloat2.setDuration(1000);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.f5929d.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    public void setGuideText(String str) {
        this.f5931f.setVisibility(0);
        this.f5931f.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.f5931f.setTextColor(i);
    }

    /* renamed from: a */
    public void mo17296a() {
        this.f5929d.start();
    }

    /* renamed from: b */
    public void mo17297b() {
        AnimatorSet animatorSet = this.f5929d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
