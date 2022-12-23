package com.fyber.inneractive.sdk.p191ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

/* renamed from: com.fyber.inneractive.sdk.ui.IAsmoothProgressBar */
public class IAsmoothProgressBar extends ProgressBar {

    /* renamed from: c */
    public static final Interpolator f13931c = new AccelerateDecelerateInterpolator();

    /* renamed from: a */
    public ValueAnimator f13932a;

    /* renamed from: b */
    public ValueAnimator f13933b;

    /* renamed from: com.fyber.inneractive.sdk.ui.IAsmoothProgressBar$a */
    public class C5250a implements ValueAnimator.AnimatorUpdateListener {
        public C5250a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IAsmoothProgressBar.super.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.ui.IAsmoothProgressBar$b */
    public class C5251b implements ValueAnimator.AnimatorUpdateListener {
        public C5251b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IAsmoothProgressBar.super.setSecondaryProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f13932a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f13933b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public synchronized void setProgress(int i) {
        if (!(Build.VERSION.SDK_INT >= 11)) {
            super.setProgress(i);
            return;
        }
        ValueAnimator valueAnimator = this.f13932a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f13932a;
        if (valueAnimator2 == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getProgress(), i});
            this.f13932a = ofInt;
            ofInt.setInterpolator(f13931c);
            this.f13932a.addUpdateListener(new C5250a());
        } else {
            valueAnimator2.setIntValues(new int[]{getProgress(), i});
        }
        this.f13932a.start();
    }

    public synchronized void setSecondaryProgress(int i) {
        if (!(Build.VERSION.SDK_INT >= 11)) {
            super.setSecondaryProgress(i);
            return;
        }
        ValueAnimator valueAnimator = this.f13933b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f13933b;
        if (valueAnimator2 == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getProgress(), i});
            this.f13933b = ofInt;
            ofInt.setInterpolator(f13931c);
            this.f13933b.addUpdateListener(new C5251b());
        } else {
            valueAnimator2.setIntValues(new int[]{getProgress(), i});
        }
        this.f13933b.start();
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
