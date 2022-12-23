package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;

public class SplashDiffuseView extends View {

    /* renamed from: c */
    private static int f5992c = 50;

    /* renamed from: a */
    private Paint f5993a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f5994b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ObjectAnimator f5995d;

    public SplashDiffuseView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SplashDiffuseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SplashDiffuseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5994b = 10;
        m7300b();
    }

    /* renamed from: b */
    private void m7300b() {
        Paint paint = new Paint();
        this.f5993a = paint;
        paint.setAntiAlias(true);
        this.f5993a.setColor(Color.parseColor("#FFFFFFFF"));
        this.f5993a.setStyle(Paint.Style.STROKE);
        this.f5993a.setStrokeWidth(18.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f});
        this.f5995d = ofFloat;
        ofFloat.setDuration(200);
    }

    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    public void onDraw(Canvas canvas) {
        this.f5993a.setShader(new LinearGradient((float) (getMeasuredWidth() / 2), 0.0f, (float) (getMeasuredWidth() / 2), (float) getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        canvas.drawCircle(((float) getMeasuredWidth()) / 2.0f, ((float) getMeasuredHeight()) / 2.0f, (float) this.f5994b, this.f5993a);
    }

    /* renamed from: a */
    public void mo17353a() {
        int min = (int) Math.min(((float) getMeasuredWidth()) / 2.0f, ((float) getMeasuredHeight()) / 2.0f);
        f5992c = min;
        int i = min - 18;
        f5992c = i;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{10, i});
        ofInt.setInterpolator(new C2710a(0.0f, 0.2f, 0.3f, 1.0f));
        ofInt.setDuration(800);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int unused = SplashDiffuseView.this.f5994b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SplashDiffuseView.this.requestLayout();
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                SplashDiffuseView.this.setVisibility(0);
                SplashDiffuseView.this.setAlpha(1.0f);
            }

            public void onAnimationEnd(Animator animator) {
                SplashDiffuseView.this.f5995d.start();
            }
        });
        ofInt.start();
    }
}
