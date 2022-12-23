package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class DislikeView extends View {

    /* renamed from: a */
    private int f5903a;

    /* renamed from: b */
    private int f5904b;

    /* renamed from: c */
    private RectF f5905c;

    /* renamed from: d */
    private Paint f5906d;

    /* renamed from: e */
    private Paint f5907e;

    /* renamed from: f */
    private int f5908f;

    /* renamed from: g */
    private Paint f5909g;

    /* renamed from: h */
    private int f5910h;

    public DislikeView(Context context) {
        super(context);
        m7244a();
    }

    /* renamed from: a */
    private void m7244a() {
        Paint paint = new Paint();
        this.f5906d = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f5909g = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f5907e = paint3;
        paint3.setAntiAlias(true);
    }

    public void setRadius(int i) {
        this.f5908f = i;
    }

    public void setDislikeColor(int i) {
        this.f5909g.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.f5909g.setStrokeWidth((float) i);
    }

    public void setStrokeColor(int i) {
        this.f5906d.setStyle(Paint.Style.STROKE);
        this.f5906d.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.f5906d.setStrokeWidth((float) i);
        this.f5910h = i;
    }

    public void setBgColor(int i) {
        this.f5907e.setStyle(Paint.Style.FILL);
        this.f5907e.setColor(i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f5905c;
        int i = this.f5908f;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f5907e);
        RectF rectF2 = this.f5905c;
        int i2 = this.f5908f;
        canvas.drawRoundRect(rectF2, (float) i2, (float) i2, this.f5906d);
        int i3 = this.f5903a;
        int i4 = this.f5904b;
        Canvas canvas2 = canvas;
        canvas2.drawLine(((float) i3) * 0.3f, ((float) i4) * 0.3f, ((float) i3) * 0.7f, ((float) i4) * 0.7f, this.f5909g);
        int i5 = this.f5903a;
        int i6 = this.f5904b;
        Canvas canvas3 = canvas;
        canvas3.drawLine(((float) i5) * 0.7f, ((float) i6) * 0.3f, ((float) i5) * 0.3f, ((float) i6) * 0.7f, this.f5909g);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f5903a = i;
        this.f5904b = i2;
        int i5 = this.f5910h;
        this.f5905c = new RectF((float) i5, (float) i5, (float) (this.f5903a - i5), (float) (this.f5904b - i5));
    }
}
