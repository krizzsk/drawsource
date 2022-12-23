package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

public class TTCornersWebView extends WebView {

    /* renamed from: a */
    private int f9453a;

    /* renamed from: b */
    private int f9454b;

    /* renamed from: c */
    private int f9455c;

    /* renamed from: d */
    private int f9456d;

    /* renamed from: e */
    private Paint f9457e;

    /* renamed from: f */
    private Paint f9458f;

    /* renamed from: g */
    private float[] f9459g = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    public TTCornersWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12011a(context, attributeSet);
    }

    public TTCornersWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12011a(context, attributeSet);
    }

    /* renamed from: a */
    private void m12011a(Context context, AttributeSet attributeSet) {
        Paint paint = new Paint();
        this.f9457e = paint;
        paint.setColor(-1);
        this.f9457e.setAntiAlias(true);
        this.f9457e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Paint paint2 = new Paint();
        this.f9458f = paint2;
        paint2.setXfermode((Xfermode) null);
        this.f9458f.setAntiAlias(true);
        float b = C3904y.m12868b(context, 14.0f);
        mo20408a(b, b, 0.0f, 0.0f);
    }

    /* renamed from: a */
    public void mo20408a(float f, float f2, float f3, float f4) {
        float[] fArr = this.f9459g;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f2;
        fArr[3] = f2;
        fArr[4] = f3;
        fArr[5] = f3;
        fArr[6] = f4;
        fArr[7] = f4;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f9453a = getMeasuredWidth();
        this.f9454b = getMeasuredHeight();
    }

    public void onDraw(Canvas canvas) {
        this.f9455c = getScrollX();
        this.f9456d = getScrollY();
        Path path = new Path();
        int i = this.f9456d;
        path.addRoundRect(new RectF(0.0f, (float) i, (float) (this.f9455c + this.f9453a), (float) (i + this.f9454b)), this.f9459g, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }
}
