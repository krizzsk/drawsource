package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.C1535i;

/* renamed from: com.applovin.impl.adview.q */
public final class C1561q extends C1535i {

    /* renamed from: c */
    private static final Paint f1985c = new Paint(1);

    /* renamed from: d */
    private static final Paint f1986d = new Paint(1);

    public C1561q(Context context) {
        super(context);
        f1985c.setARGB(80, 0, 0, 0);
        f1986d.setColor(-1);
        f1986d.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public void mo13182a(int i) {
        setViewScale(((float) i) / 30.0f);
    }

    /* access modifiers changed from: protected */
    public float getCenter() {
        return getSize() / 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getCrossOffset() {
        return this.f1928a * 8.0f;
    }

    /* access modifiers changed from: protected */
    public float getStrokeWidth() {
        return this.f1928a * 2.0f;
    }

    public C1535i.C1536a getStyle() {
        return C1535i.C1536a.WHITE_ON_TRANSPARENT;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f1985c);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        f1986d.setStrokeWidth(getStrokeWidth());
        Canvas canvas2 = canvas;
        float f = crossOffset;
        float f2 = size;
        canvas2.drawLine(f, crossOffset, f2, size, f1986d);
        canvas2.drawLine(f, size, f2, crossOffset, f1986d);
    }
}
