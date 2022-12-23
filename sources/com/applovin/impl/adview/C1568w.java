package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.C1535i;

/* renamed from: com.applovin.impl.adview.w */
public final class C1568w extends C1535i {

    /* renamed from: c */
    private static final Paint f2004c = new Paint(1);

    /* renamed from: d */
    private static final Paint f2005d = new Paint(1);

    /* renamed from: e */
    private static final Paint f2006e = new Paint(1);

    public C1568w(Context context) {
        super(context);
        f2004c.setColor(-1);
        f2005d.setColor(ViewCompat.MEASURED_STATE_MASK);
        f2006e.setColor(-1);
        f2006e.setStyle(Paint.Style.STROKE);
    }

    /* access modifiers changed from: protected */
    public float getCenter() {
        return getSize() / 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getCrossOffset() {
        return this.f1928a * 10.0f;
    }

    /* access modifiers changed from: protected */
    public float getInnerCircleOffset() {
        return this.f1928a * 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    /* access modifiers changed from: protected */
    public float getStrokeWidth() {
        return this.f1928a * 3.0f;
    }

    public C1535i.C1536a getStyle() {
        return C1535i.C1536a.WHITE_ON_BLACK;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f2004c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f2005d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        f2006e.setStrokeWidth(getStrokeWidth());
        Canvas canvas2 = canvas;
        float f = crossOffset;
        float f2 = size;
        canvas2.drawLine(f, crossOffset, f2, size, f2006e);
        canvas2.drawLine(f, size, f2, crossOffset, f2006e);
    }
}
