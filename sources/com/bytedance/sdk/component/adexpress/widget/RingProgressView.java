package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class RingProgressView extends View {

    /* renamed from: a */
    private Context f5934a;

    /* renamed from: b */
    private Paint f5935b;

    /* renamed from: c */
    private RectF f5936c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f5937d;

    /* renamed from: e */
    private ValueAnimator f5938e;

    /* renamed from: f */
    private int f5939f = 1500;

    /* renamed from: g */
    private boolean f5940g;

    public RingProgressView(Context context) {
        super(context);
        this.f5934a = context;
        Paint paint = new Paint();
        this.f5935b = paint;
        paint.setAntiAlias(true);
        this.f5935b.setStyle(Paint.Style.STROKE);
        this.f5935b.setStrokeWidth(10.0f);
        this.f5935b.setColor(Color.parseColor("#80FFFFFF"));
        this.f5936c = new RectF();
    }

    /* renamed from: a */
    public void mo17305a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 360.0f});
        this.f5938e = ofFloat;
        ofFloat.setDuration((long) this.f5939f);
        this.f5938e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = RingProgressView.this.f5937d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RingProgressView.this.requestLayout();
            }
        });
        this.f5938e.start();
    }

    /* renamed from: b */
    public void mo17306b() {
        ValueAnimator valueAnimator = this.f5938e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo17307c() {
        this.f5940g = true;
        invalidate();
    }

    public void setDuration(int i) {
        this.f5939f = i;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f5940g) {
            canvas.drawArc(this.f5936c, 270.0f, this.f5937d, false, this.f5935b);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f5936c.set(5.0f, 5.0f, (float) (i - 5), (float) (i2 - 5));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }
}
