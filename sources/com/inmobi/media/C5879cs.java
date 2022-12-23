package com.inmobi.media;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: com.inmobi.media.cs */
/* compiled from: CustomView */
public class C5879cs extends View {

    /* renamed from: a */
    private static final String f14853a = C5879cs.class.getSimpleName();

    /* renamed from: b */
    private float f14854b;

    /* renamed from: c */
    private float f14855c;

    /* renamed from: d */
    private float f14856d;

    /* renamed from: e */
    private float f14857e;

    /* renamed from: f */
    private float f14858f;

    /* renamed from: g */
    private byte f14859g;

    /* renamed from: h */
    private int f14860h;

    /* renamed from: i */
    private Paint f14861i;

    /* renamed from: j */
    private Path f14862j;

    /* renamed from: k */
    private RectF f14863k;

    private C5879cs(Context context) {
        super(context);
    }

    public C5879cs(Context context, float f, byte b) {
        this(context);
        this.f14859g = b;
        this.f14854b = f;
        this.f14860h = 15;
        this.f14861i = new Paint(1);
        this.f14863k = new RectF();
        this.f14862j = new Path();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        this.f14861i.reset();
        switch (this.f14859g) {
            case 0:
                float f = this.f14854b;
                float f2 = (50.0f * f) / 2.0f;
                float f3 = (f * 30.0f) / 2.0f;
                float f4 = f3 / 3.0f;
                float f5 = f2 - f4;
                float f6 = f2 + f4;
                this.f14861i.setAntiAlias(true);
                this.f14861i.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.f14861i.setStrokeWidth(3.0f);
                this.f14861i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawCircle(f2, f2, f3, this.f14861i);
                this.f14861i.setColor(-1);
                this.f14861i.setStyle(Paint.Style.STROKE);
                Canvas canvas3 = canvas;
                float f7 = f5;
                float f8 = f6;
                canvas3.drawLine(f7, f5, f8, f6, this.f14861i);
                canvas3.drawLine(f7, f6, f8, f5, this.f14861i);
                canvas2.drawCircle(f2, f2, f3, this.f14861i);
                return;
            case 1:
                float f9 = (this.f14854b * 50.0f) / 2.0f;
                this.f14861i.setAntiAlias(true);
                this.f14861i.setColor(0);
                this.f14861i.setStrokeWidth(3.0f);
                this.f14861i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawCircle(f9, f9, f9, this.f14861i);
                return;
            case 2:
                this.f14861i.setAntiAlias(true);
                this.f14861i.setColor(-1);
                this.f14861i.setStrokeWidth(5.0f);
                this.f14861i.setStyle(Paint.Style.STROKE);
                Canvas canvas4 = canvas;
                canvas4.drawLine(((float) (getWidth() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f), ((((float) this.f14860h) * this.f14854b) / 2.0f) + ((float) (getWidth() / 2)), ((((float) this.f14860h) * this.f14854b) / 2.0f) + ((float) (getHeight() / 2)), this.f14861i);
                Canvas canvas5 = canvas;
                canvas5.drawLine(((float) (getWidth() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f), ((((float) this.f14860h) * this.f14854b) / 2.0f) + ((float) (getHeight() / 2)), ((((float) this.f14860h) * this.f14854b) / 2.0f) + ((float) (getWidth() / 2)), ((float) (getHeight() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f), this.f14861i);
                return;
            case 3:
                float width = ((float) getWidth()) / 2.0f;
                float height = ((float) getHeight()) / 2.0f;
                float f10 = (this.f14854b * 30.0f) / 2.0f;
                this.f14862j.reset();
                this.f14861i.setAntiAlias(true);
                this.f14861i.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.f14861i.setStrokeWidth(3.0f);
                this.f14861i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawCircle(width, height, f10, this.f14861i);
                this.f14861i.setColor(-1);
                this.f14861i.setStyle(Paint.Style.STROKE);
                canvas2.drawCircle(width, height, f10, this.f14861i);
                this.f14863k.set(((float) (getWidth() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f), ((float) (getWidth() / 2)) + ((((float) this.f14860h) * this.f14854b) / 2.0f), ((float) (getHeight() / 2)) + ((((float) this.f14860h) * this.f14854b) / 2.0f));
                canvas.drawArc(this.f14863k, 0.0f, 270.0f, false, this.f14861i);
                this.f14862j.setFillType(Path.FillType.EVEN_ODD);
                this.f14862j.moveTo(((float) (getWidth() / 2)) + ((((float) this.f14860h) * this.f14854b) / 2.0f), ((float) (getHeight() / 2)) - (this.f14854b * 2.0f));
                Path path = this.f14862j;
                float f11 = this.f14854b;
                path.lineTo((((float) (getWidth() / 2)) + ((((float) this.f14860h) * f11) / 2.0f)) - (f11 * 2.0f), (float) (getHeight() / 2));
                Path path2 = this.f14862j;
                float f12 = this.f14854b;
                path2.lineTo(((float) (getWidth() / 2)) + ((((float) this.f14860h) * f12) / 2.0f) + (f12 * 2.0f), (float) (getHeight() / 2));
                this.f14862j.lineTo(((float) (getWidth() / 2)) + ((((float) this.f14860h) * this.f14854b) / 2.0f), ((float) (getHeight() / 2)) - (this.f14854b * 2.0f));
                this.f14862j.close();
                this.f14861i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawPath(this.f14862j, this.f14861i);
                return;
            case 4:
                this.f14862j.reset();
                this.f14862j.setFillType(Path.FillType.EVEN_ODD);
                this.f14862j.moveTo(((float) (getWidth() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f), (float) (getHeight() / 2));
                this.f14862j.lineTo(((float) (getWidth() / 2)) + ((((float) this.f14860h) * this.f14854b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f));
                this.f14862j.lineTo(((float) (getWidth() / 2)) + ((((float) this.f14860h) * this.f14854b) / 2.0f), ((float) (getHeight() / 2)) + ((((float) this.f14860h) * this.f14854b) / 2.0f));
                this.f14862j.lineTo(((float) (getWidth() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f), (float) (getHeight() / 2));
                this.f14862j.close();
                this.f14861i.setAntiAlias(true);
                this.f14861i.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.f14861i.setStrokeWidth(3.0f);
                this.f14861i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawPath(this.f14862j, this.f14861i);
                return;
            case 5:
                this.f14862j.reset();
                this.f14862j.setFillType(Path.FillType.EVEN_ODD);
                this.f14862j.moveTo(((float) (getWidth() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f));
                this.f14862j.lineTo(((float) (getWidth() / 2)) + ((((float) this.f14860h) * this.f14854b) / 2.0f), (float) (getHeight() / 2));
                this.f14862j.lineTo(((float) (getWidth() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f), ((float) (getHeight() / 2)) + ((((float) this.f14860h) * this.f14854b) / 2.0f));
                this.f14862j.lineTo(((float) (getWidth() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f));
                this.f14862j.close();
                this.f14861i.setAntiAlias(true);
                this.f14861i.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.f14861i.setStrokeWidth(3.0f);
                this.f14861i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawPath(this.f14862j, this.f14861i);
                return;
            case 6:
                this.f14862j.reset();
                this.f14862j.setFillType(Path.FillType.EVEN_ODD);
                this.f14862j.moveTo(((float) (getWidth() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f));
                this.f14862j.lineTo(((float) (getWidth() / 2)) + ((((float) this.f14860h) * this.f14854b) / 2.0f), (float) (getHeight() / 2));
                this.f14862j.lineTo(((float) (getWidth() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f), ((float) (getHeight() / 2)) + ((((float) this.f14860h) * this.f14854b) / 2.0f));
                this.f14862j.lineTo(((float) (getWidth() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f14860h) * this.f14854b) / 2.0f));
                this.f14862j.close();
                this.f14861i.setAntiAlias(true);
                this.f14861i.setColor(-12303292);
                this.f14861i.setStrokeWidth(3.0f);
                this.f14861i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawPath(this.f14862j, this.f14861i);
                return;
            case 7:
                m17498b(canvas);
                float f13 = this.f14858f;
                this.f14855c = f13 / 3.0f;
                this.f14856d = f13 / 3.0f;
                this.f14861i.setStyle(Paint.Style.FILL);
                Path path3 = this.f14862j;
                float f14 = this.f14857e;
                path3.moveTo(this.f14855c + f14, f14);
                Path path4 = this.f14862j;
                float f15 = this.f14857e;
                path4.lineTo(f15 - this.f14855c, f15 - this.f14856d);
                Path path5 = this.f14862j;
                float f16 = this.f14857e;
                path5.lineTo(f16 - this.f14855c, f16 + this.f14856d);
                Path path6 = this.f14862j;
                float f17 = this.f14857e;
                path6.lineTo(this.f14855c + f17, f17);
                canvas2.drawPath(this.f14862j, this.f14861i);
                return;
            case 8:
                m17498b(canvas);
                float f18 = this.f14858f;
                float f19 = f18 / 4.0f;
                this.f14855c = f19;
                float f20 = f18 / 3.0f;
                this.f14856d = f20;
                float f21 = this.f14857e;
                canvas.drawLine(f21 - f19, f21 - f20, f21 - f19, f21 + f20, this.f14861i);
                float f22 = this.f14857e;
                float f23 = this.f14855c;
                float f24 = this.f14856d;
                canvas.drawLine(f22 + f23, f22 - f24, f22 + f23, f22 + f24, this.f14861i);
                return;
            case 9:
                m17497a(canvas);
                float f25 = this.f14857e;
                float f26 = this.f14854b;
                float f27 = this.f14856d;
                RectF rectF = new RectF(f25 - (f26 * 10.0f), (f25 - f27) - (f26 * 2.0f), (14.0f * f26) + f25, f25 + f27 + (f26 * 2.0f));
                float f28 = this.f14857e;
                float f29 = this.f14854b;
                float f30 = this.f14856d;
                RectF rectF2 = new RectF(f28 - (10.0f * f29), (f28 - f30) - (f29 * 4.0f), (18.0f * f29) + f28, f28 + f30 + (f29 * 4.0f));
                this.f14861i.setColor(-1);
                this.f14861i.setStrokeWidth(4.0f);
                this.f14861i.setStyle(Paint.Style.STROKE);
                Canvas canvas6 = canvas;
                canvas6.drawArc(rectF, -45.0f, 90.0f, false, this.f14861i);
                canvas6.drawArc(rectF2, -45.0f, 90.0f, false, this.f14861i);
                canvas2.drawPath(this.f14862j, this.f14861i);
                canvas2.drawPath(this.f14862j, this.f14861i);
                return;
            case 11:
                m17497a(canvas);
                this.f14861i.setColor(-1);
                this.f14861i.setStrokeWidth(4.0f);
                this.f14861i.setStyle(Paint.Style.STROKE);
                Path path7 = this.f14862j;
                float f31 = this.f14857e;
                path7.moveTo((this.f14854b * 10.0f) + f31, f31 - this.f14856d);
                Path path8 = this.f14862j;
                float f32 = this.f14857e;
                path8.lineTo((this.f14854b * 18.0f) + f32, f32 + this.f14856d);
                Path path9 = this.f14862j;
                float f33 = this.f14857e;
                path9.moveTo((this.f14854b * 18.0f) + f33, f33 - this.f14856d);
                Path path10 = this.f14862j;
                float f34 = this.f14857e;
                path10.lineTo((this.f14854b * 10.0f) + f34, f34 + this.f14856d);
                canvas2.drawPath(this.f14862j, this.f14861i);
                return;
            case 12:
                float f35 = this.f14854b;
                this.f14857e = (50.0f * f35) / 2.0f;
                this.f14855c = f35 * 3.0f;
                this.f14856d = f35 * 3.0f;
                this.f14861i.setStyle(Paint.Style.STROKE);
                this.f14861i.setStrokeWidth(4.0f);
                this.f14861i.setColor(-1);
                Path path11 = this.f14862j;
                float f36 = this.f14857e;
                path11.moveTo(f36 - this.f14855c, (f36 - this.f14856d) - (this.f14854b * 5.0f));
                Path path12 = this.f14862j;
                float f37 = this.f14857e;
                path12.lineTo(f37 - this.f14855c, f37 - this.f14856d);
                Path path13 = this.f14862j;
                float f38 = this.f14857e;
                path13.lineTo((f38 - this.f14855c) - (this.f14854b * 5.0f), f38 - this.f14856d);
                Path path14 = this.f14862j;
                float f39 = this.f14857e;
                path14.moveTo(this.f14855c + f39, (f39 - this.f14856d) - (this.f14854b * 5.0f));
                Path path15 = this.f14862j;
                float f40 = this.f14857e;
                path15.lineTo(this.f14855c + f40, f40 - this.f14856d);
                Path path16 = this.f14862j;
                float f41 = this.f14857e;
                path16.lineTo(this.f14855c + f41 + (this.f14854b * 5.0f), f41 - this.f14856d);
                Path path17 = this.f14862j;
                float f42 = this.f14857e;
                path17.moveTo(f42 - this.f14855c, f42 + this.f14856d + (this.f14854b * 5.0f));
                Path path18 = this.f14862j;
                float f43 = this.f14857e;
                path18.lineTo(f43 - this.f14855c, f43 + this.f14856d);
                Path path19 = this.f14862j;
                float f44 = this.f14857e;
                path19.lineTo((f44 - this.f14855c) - (this.f14854b * 5.0f), f44 + this.f14856d);
                Path path20 = this.f14862j;
                float f45 = this.f14857e;
                path20.moveTo(this.f14855c + f45, f45 + this.f14856d + (this.f14854b * 5.0f));
                Path path21 = this.f14862j;
                float f46 = this.f14857e;
                path21.lineTo(this.f14855c + f46, f46 + this.f14856d);
                Path path22 = this.f14862j;
                float f47 = this.f14857e;
                path22.lineTo(this.f14855c + f47 + (this.f14854b * 5.0f), f47 + this.f14856d);
                canvas2.drawPath(this.f14862j, this.f14861i);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m17497a(Canvas canvas) {
        float f = this.f14854b;
        this.f14857e = ((30.0f * f) / 2.0f) - (f * 5.0f);
        this.f14855c = f * 5.0f;
        this.f14856d = f * 5.0f;
        this.f14861i.setStyle(Paint.Style.FILL);
        this.f14861i.setColor(-1);
        this.f14861i.setStrokeWidth(4.0f);
        this.f14861i.setAntiAlias(true);
        Path path = this.f14862j;
        float f2 = this.f14857e;
        path.moveTo(f2 - this.f14855c, f2 - this.f14856d);
        Path path2 = this.f14862j;
        float f3 = this.f14857e;
        path2.lineTo(f3, f3 - this.f14856d);
        Path path3 = this.f14862j;
        float f4 = this.f14857e;
        float f5 = this.f14854b;
        path3.lineTo((f5 * 6.0f) + f4, (f4 - this.f14856d) - (f5 * 4.0f));
        Path path4 = this.f14862j;
        float f6 = this.f14857e;
        float f7 = this.f14854b;
        path4.lineTo((6.0f * f7) + f6, f6 + this.f14856d + (f7 * 4.0f));
        Path path5 = this.f14862j;
        float f8 = this.f14857e;
        path5.lineTo(f8, this.f14856d + f8);
        Path path6 = this.f14862j;
        float f9 = this.f14857e;
        path6.lineTo(f9 - this.f14855c, f9 + this.f14856d);
        Path path7 = this.f14862j;
        float f10 = this.f14857e;
        path7.lineTo(f10 - this.f14855c, f10 - this.f14856d);
        canvas.drawPath(this.f14862j, this.f14861i);
    }

    /* renamed from: b */
    private void m17498b(Canvas canvas) {
        float f = this.f14854b;
        this.f14858f = 25.0f * f;
        this.f14857e = f * 30.0f;
        this.f14861i.setAntiAlias(true);
        this.f14861i.setColor(-1);
        this.f14861i.setStrokeWidth(7.0f);
        this.f14861i.setStyle(Paint.Style.STROKE);
        float f2 = this.f14857e;
        canvas.drawCircle(f2, f2, this.f14858f, this.f14861i);
    }
}
