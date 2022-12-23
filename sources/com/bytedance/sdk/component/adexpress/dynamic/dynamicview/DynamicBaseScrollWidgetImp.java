package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;

public class DynamicBaseScrollWidgetImp extends DynamicBaseWidgetImp implements C2655c {

    /* renamed from: a */
    ObjectAnimator f5731a;

    /* renamed from: b */
    ObjectAnimator f5732b;

    /* renamed from: s */
    private int f5733s = 0;

    /* renamed from: t */
    private Runnable f5734t = new Runnable() {
        public void run() {
            DynamicBaseScrollWidgetImp.this.m7092a();
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7092a() {
        final View childAt = getChildAt(this.f5733s);
        final View childAt2 = getChildAt((this.f5733s + 1) % getChildCount());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "translationY", new float[]{0.0f, (float) ((-(this.f5747h + getChildAt(this.f5733s).getHeight())) / 2)});
        this.f5731a = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f5731a.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", new float[]{(float) ((this.f5747h + childAt2.getHeight()) / 2), 0.0f});
        this.f5732b = ofFloat2;
        ofFloat2.setInterpolator(new LinearInterpolator());
        this.f5732b.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }
        });
        this.f5731a.setDuration(500);
        this.f5732b.setDuration(500);
        this.f5731a.start();
        this.f5732b.start();
        int i = this.f5733s + 1;
        this.f5733s = i;
        this.f5733s = i % getChildCount();
        postDelayed(this.f5734t, 2000);
    }

    public DynamicBaseScrollWidgetImp(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.f5747h - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.f5734t, 2500);
    }

    /* renamed from: b */
    public void mo16803b() {
        removeCallbacks(this.f5734t);
        ObjectAnimator objectAnimator = this.f5731a;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.f5731a.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f5732b;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f5732b.cancel();
        }
        super.mo16803b();
    }
}
