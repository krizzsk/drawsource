package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class RippleView extends View {

    /* renamed from: a */
    private float f5942a;

    /* renamed from: b */
    private float f5943b;

    /* renamed from: c */
    private ValueAnimator f5944c;

    /* renamed from: d */
    private ValueAnimator f5945d;

    /* renamed from: e */
    private Paint f5946e;

    /* renamed from: f */
    private long f5947f = 300;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float f5948g = 0.0f;

    /* renamed from: h */
    private float f5949h;

    /* renamed from: i */
    private Animator.AnimatorListener f5950i;

    public RippleView(Context context) {
        super(context);
        mo17313a();
    }

    /* renamed from: a */
    public void mo17313a() {
        Paint paint = new Paint(1);
        this.f5946e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f5946e.setColor(Color.parseColor("#99000000"));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f5942a = ((float) i) / 2.0f;
        this.f5943b = ((float) i2) / 2.0f;
        this.f5949h = (float) (Math.hypot((double) i, (double) i2) / 2.0d);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f5942a, this.f5943b, this.f5948g, this.f5946e);
    }

    /* renamed from: b */
    public void mo17314b() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, this.f5949h});
        this.f5944c = ofFloat;
        ofFloat.setDuration(this.f5947f);
        this.f5944c.setInterpolator(new LinearInterpolator());
        this.f5944c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = RippleView.this.f5948g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        this.f5944c.start();
    }

    /* renamed from: c */
    public void mo17315c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f5949h, 0.0f});
        this.f5945d = ofFloat;
        ofFloat.setDuration(this.f5947f);
        this.f5945d.setInterpolator(new LinearInterpolator());
        this.f5945d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = RippleView.this.f5948g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.f5950i;
        if (animatorListener != null) {
            this.f5945d.addListener(animatorListener);
        }
        this.f5945d.start();
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f5950i = animatorListener;
    }
}
