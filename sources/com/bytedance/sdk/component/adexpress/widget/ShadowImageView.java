package com.bytedance.sdk.component.adexpress.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;

public class ShadowImageView extends ImageView {

    /* renamed from: a */
    private Paint f5953a;

    /* renamed from: b */
    private RectF f5954b;

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5954b.right != ((float) getMeasuredWidth()) || this.f5954b.bottom != ((float) getMeasuredHeight())) {
            this.f5954b.set(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f5954b;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, this.f5954b.bottom / 2.0f, this.f5953a);
        super.onDraw(canvas);
    }
}
