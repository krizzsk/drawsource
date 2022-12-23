package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.utils.C2914t;

public class PressButtonInteractView extends FrameLayout {

    /* renamed from: a */
    private Context f5919a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f5920b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SplashDiffuseView f5921c;

    /* renamed from: d */
    private AnimatorSet f5922d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f5923e = true;

    public PressButtonInteractView(Context context) {
        super(context);
        this.f5919a = context;
        this.f5922d = new AnimatorSet();
        m7257c();
        m7259d();
        post(new Runnable() {
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PressButtonInteractView.this.f5920b.getLayoutParams();
                layoutParams.topMargin = (int) ((((float) PressButtonInteractView.this.f5921c.getMeasuredHeight()) / 2.0f) - C2572b.m6622a(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((((float) PressButtonInteractView.this.f5921c.getMeasuredWidth()) / 2.0f) - C2572b.m6622a(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) ((((float) (-PressButtonInteractView.this.f5921c.getMeasuredHeight())) / 2.0f) + C2572b.m6622a(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) ((((float) (-PressButtonInteractView.this.f5921c.getMeasuredWidth())) / 2.0f) + C2572b.m6622a(PressButtonInteractView.this.getContext(), 5.0f));
                PressButtonInteractView.this.f5920b.setLayoutParams(layoutParams);
            }
        });
    }

    /* renamed from: c */
    private void m7257c() {
        this.f5921c = new SplashDiffuseView(this.f5919a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2572b.m6622a(this.f5919a, 40.0f), (int) C2572b.m6622a(this.f5919a, 40.0f));
        layoutParams.gravity = 19;
        addView(this.f5921c, layoutParams);
        this.f5920b = new ImageView(this.f5919a);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C2572b.m6622a(this.f5919a, 62.0f), (int) C2572b.m6622a(this.f5919a, 62.0f));
        layoutParams2.gravity = 16;
        this.f5920b.setImageResource(C2914t.m8157d(this.f5919a, "tt_splash_hand"));
        addView(this.f5920b, layoutParams2);
    }

    /* renamed from: d */
    private void m7259d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f5920b, "scaleX", new float[]{1.0f, 0.9f});
        ofFloat.setDuration(800);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(PressButtonInteractView.this.f5920b, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(200);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.start();
                PressButtonInteractView.this.f5920b.setVisibility(0);
            }

            public void onAnimationRepeat(Animator animator) {
                if (PressButtonInteractView.this.f5923e) {
                    PressButtonInteractView.this.f5921c.mo17353a();
                }
                PressButtonInteractView pressButtonInteractView = PressButtonInteractView.this;
                boolean unused = pressButtonInteractView.f5923e = !pressButtonInteractView.f5923e;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f5920b, "scaleY", new float[]{1.0f, 0.9f});
        ofFloat2.setDuration(800);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f5922d.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    /* renamed from: a */
    public void mo17289a() {
        this.f5922d.start();
    }

    /* renamed from: b */
    public void mo17290b() {
        AnimatorSet animatorSet = this.f5922d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
