package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class TwoSemicirclesView extends View {

    /* renamed from: a */
    private final RectF f9498a;

    /* renamed from: b */
    private int f9499b;

    /* renamed from: c */
    private int f9500c;

    /* renamed from: d */
    private Paint f9501d;

    /* renamed from: e */
    private Paint f9502e;

    /* renamed from: f */
    private float f9503f = -90.0f;

    /* renamed from: g */
    private float f9504g = 220.0f;

    /* renamed from: h */
    private int f9505h = Color.parseColor("#FFFFFF");

    /* renamed from: i */
    private int f9506i = Color.parseColor("#C4C4C4");

    public TwoSemicirclesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12024a();
        float f = this.f9504g;
        this.f9498a = new RectF(-f, -f, f, f);
    }

    /* renamed from: a */
    private void m12024a() {
        Paint paint = new Paint();
        this.f9501d = paint;
        paint.setColor(this.f9505h);
        this.f9501d.setStyle(Paint.Style.STROKE);
        this.f9501d.setStrokeWidth(4.0f);
        this.f9501d.setAlpha(20);
        Paint paint2 = new Paint(this.f9501d);
        this.f9502e = paint2;
        paint2.setColor(this.f9506i);
        this.f9502e.setAlpha(255);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f9499b = i;
        this.f9500c = i2;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f9498a;
        float f = this.f9504g;
        rectF.set(-f, -f, f, f);
        canvas.translate((float) (this.f9499b / 2), (float) (this.f9500c / 2));
        canvas.drawArc(this.f9498a, this.f9503f, 180.0f, false, this.f9501d);
        canvas.drawArc(this.f9498a, this.f9503f + 180.0f, 180.0f, false, this.f9502e);
    }

    public void setCurrentStartAngle(float f) {
        this.f9503f = f;
        postInvalidate();
    }

    public void setRadius(float f) {
        this.f9504g = f;
        postInvalidate();
    }

    public void setPaintOne(Paint paint) {
        this.f9501d = paint;
        postInvalidate();
    }

    public Paint getPaintOne() {
        return this.f9501d;
    }

    public void setPaintTwo(Paint paint) {
        this.f9502e = paint;
        postInvalidate();
    }

    public Paint getPaintTwo() {
        return this.f9502e;
    }
}
