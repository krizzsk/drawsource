package com.fyber.inneractive.sdk.p191ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.fyber.inneractive.sdk.util.C5292l;

/* renamed from: com.fyber.inneractive.sdk.ui.IAcloseButton */
public class IAcloseButton extends View {

    /* renamed from: a */
    public Paint f13915a;

    /* renamed from: b */
    public Path f13916b;

    public IAcloseButton(Context context, int i, boolean z) {
        super(context);
        int b = C5292l.m16507b(10);
        int i2 = (z ? (i - (b * 2)) / 4 : 0) + b;
        Point point = new Point(i2, i2);
        int i3 = i - i2;
        Point point2 = new Point(i2, i3);
        Point point3 = new Point(i3, i3);
        Point point4 = new Point(i3, i2);
        Path path = new Path();
        this.f13916b = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f13916b.moveTo((float) point.x, (float) point.y);
        this.f13916b.lineTo((float) point3.x, (float) point3.y);
        this.f13916b.moveTo((float) point2.x, (float) point2.y);
        this.f13916b.lineTo((float) point4.x, (float) point4.y);
        this.f13916b.close();
        Paint paint = new Paint(1);
        this.f13915a = paint;
        paint.setStrokeWidth((float) C5292l.m16507b(2));
        this.f13915a.setColor(-1);
        this.f13915a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f13915a.setAntiAlias(true);
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-1436657061);
            gradientDrawable.setStroke(C5292l.m16507b(2), -1);
            C5292l.m16503a((View) this, (Drawable) gradientDrawable);
        }
        setPadding(b, b, b, b);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f13916b, this.f13915a);
    }
}
