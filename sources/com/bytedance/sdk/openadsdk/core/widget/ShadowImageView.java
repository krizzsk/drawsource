package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ShadowImageView extends ImageView {

    /* renamed from: a */
    private Paint f9448a;

    /* renamed from: b */
    private RectF f9449b;

    public ShadowImageView(Context context) {
        super(context);
        m12009a();
    }

    public ShadowImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12009a();
    }

    public ShadowImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12009a();
    }

    /* renamed from: a */
    private void m12009a() {
        Paint paint = new Paint();
        this.f9448a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f9448a.setColor(Color.parseColor("#99333333"));
        this.f9448a.setAntiAlias(true);
        this.f9448a.setStrokeWidth(0.0f);
        this.f9449b = new RectF();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f9449b.right != ((float) getMeasuredWidth()) || this.f9449b.bottom != ((float) getMeasuredHeight())) {
            this.f9449b.set(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f9449b;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, this.f9449b.bottom / 2.0f, this.f9448a);
        super.onDraw(canvas);
    }
}
