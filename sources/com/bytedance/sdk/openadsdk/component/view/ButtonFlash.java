package com.bytedance.sdk.openadsdk.component.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.view.ViewCompat;

public class ButtonFlash extends TextView {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f7970a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f7971b;

    /* renamed from: c */
    private Paint f7972c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public LinearGradient f7973d;

    /* renamed from: e */
    private RectF f7974e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Matrix f7975f;

    /* renamed from: g */
    private ValueAnimator f7976g;

    /* renamed from: h */
    private boolean f7977h = true;

    public ButtonFlash(Context context) {
        super(context);
        m9900b();
    }

    public ButtonFlash(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9900b();
    }

    public ButtonFlash(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9900b();
    }

    /* renamed from: b */
    private void m9900b() {
        this.f7974e = new RectF();
        this.f7972c = new Paint();
        m9902c();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f7970a = i;
        this.f7971b = i2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, ((float) this.f7970a) / 2.0f, (float) this.f7971b, new int[]{ViewCompat.MEASURED_SIZE_MASK, 1358954495, ViewCompat.MEASURED_SIZE_MASK}, new float[]{0.1f, 0.3f, 0.5f}, Shader.TileMode.CLAMP);
        this.f7973d = linearGradient;
        this.f7972c.setShader(linearGradient);
        this.f7972c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        Matrix matrix = new Matrix();
        this.f7975f = matrix;
        matrix.setTranslate((float) (-this.f7970a), (float) this.f7971b);
        this.f7973d.setLocalMatrix(this.f7975f);
        this.f7974e.set(0.0f, 0.0f, (float) this.f7970a, (float) this.f7971b);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7975f != null) {
            canvas.drawRoundRect(this.f7974e, 100.0f, 100.0f, this.f7972c);
        }
    }

    /* renamed from: c */
    private void m9902c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f7976g = ofFloat;
        ofFloat.setDuration(3000);
        this.f7976g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float a = (((float) (ButtonFlash.this.f7970a * 2)) * ((Float) valueAnimator.getAnimatedValue()).floatValue()) - ((float) ButtonFlash.this.f7970a);
                if (ButtonFlash.this.f7975f != null) {
                    ButtonFlash.this.f7975f.setTranslate(a, (float) ButtonFlash.this.f7971b);
                }
                if (ButtonFlash.this.f7973d != null) {
                    ButtonFlash.this.f7973d.setLocalMatrix(ButtonFlash.this.f7975f);
                }
                ButtonFlash.this.invalidate();
            }
        });
        if (this.f7977h) {
            this.f7976g.setRepeatCount(-1);
            ValueAnimator valueAnimator = this.f7976g;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    public void setAutoRun(boolean z) {
        this.f7977h = z;
    }

    /* renamed from: a */
    public void mo19249a() {
        ValueAnimator valueAnimator = this.f7976g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            invalidate();
        }
    }
}
