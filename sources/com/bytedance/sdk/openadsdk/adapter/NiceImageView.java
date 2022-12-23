package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

public class NiceImageView extends ImageView {

    /* renamed from: a */
    private Context f7096a;

    /* renamed from: b */
    private boolean f7097b;

    /* renamed from: c */
    private boolean f7098c;

    /* renamed from: d */
    private int f7099d;

    /* renamed from: e */
    private int f7100e;

    /* renamed from: f */
    private int f7101f;

    /* renamed from: g */
    private int f7102g;

    /* renamed from: h */
    private int f7103h;

    /* renamed from: i */
    private int f7104i;

    /* renamed from: j */
    private int f7105j;

    /* renamed from: k */
    private int f7106k;

    /* renamed from: l */
    private int f7107l;

    /* renamed from: m */
    private int f7108m;

    /* renamed from: n */
    private Xfermode f7109n;

    /* renamed from: o */
    private int f7110o;

    /* renamed from: p */
    private int f7111p;

    /* renamed from: q */
    private float f7112q;

    /* renamed from: r */
    private float[] f7113r;

    /* renamed from: s */
    private float[] f7114s;

    /* renamed from: t */
    private RectF f7115t;

    /* renamed from: u */
    private RectF f7116u;

    /* renamed from: v */
    private Paint f7117v;

    /* renamed from: w */
    private Path f7118w;

    /* renamed from: x */
    private Path f7119x;

    public NiceImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7100e = -1;
        this.f7102g = -1;
        this.f7096a = context;
        this.f7103h = C3904y.m12886e(context, 10.0f);
        this.f7113r = new float[8];
        this.f7114s = new float[8];
        this.f7116u = new RectF();
        this.f7115t = new RectF();
        this.f7117v = new Paint();
        this.f7118w = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.f7109n = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.f7109n = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.f7119x = new Path();
        }
        m8719c();
        m8720d();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f7110o = i;
        this.f7111p = i2;
        m8712a();
        m8718b();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.f7115t, (Paint) null, 31);
        if (!this.f7098c) {
            int i = this.f7110o;
            int i2 = this.f7099d;
            int i3 = this.f7101f;
            int i4 = this.f7111p;
            canvas.scale((((float) ((i - (i2 * 2)) - (i3 * 2))) * 1.0f) / ((float) i), (((float) ((i4 - (i2 * 2)) - (i3 * 2))) * 1.0f) / ((float) i4), ((float) i) / 2.0f, ((float) i4) / 2.0f);
        }
        super.onDraw(canvas);
        this.f7117v.reset();
        this.f7118w.reset();
        if (this.f7097b) {
            this.f7118w.addCircle(((float) this.f7110o) / 2.0f, ((float) this.f7111p) / 2.0f, this.f7112q, Path.Direction.CCW);
        } else {
            this.f7118w.addRoundRect(this.f7115t, this.f7114s, Path.Direction.CCW);
        }
        this.f7117v.setAntiAlias(true);
        this.f7117v.setStyle(Paint.Style.FILL);
        this.f7117v.setXfermode(this.f7109n);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.f7118w, this.f7117v);
        } else {
            this.f7119x.addRect(this.f7115t, Path.Direction.CCW);
            this.f7119x.op(this.f7118w, Path.Op.DIFFERENCE);
            canvas.drawPath(this.f7119x, this.f7117v);
        }
        this.f7117v.setXfermode((Xfermode) null);
        int i5 = this.f7108m;
        if (i5 != 0) {
            this.f7117v.setColor(i5);
            canvas.drawPath(this.f7118w, this.f7117v);
        }
        canvas.restore();
        m8714a(canvas);
    }

    /* renamed from: a */
    private void m8714a(Canvas canvas) {
        if (this.f7097b) {
            int i = this.f7099d;
            if (i > 0) {
                m8715a(canvas, i, this.f7100e, this.f7112q - (((float) i) / 2.0f));
            }
            int i2 = this.f7101f;
            if (i2 > 0) {
                m8715a(canvas, i2, this.f7102g, (this.f7112q - ((float) this.f7099d)) - (((float) i2) / 2.0f));
                return;
            }
            return;
        }
        int i3 = this.f7099d;
        if (i3 > 0) {
            m8716a(canvas, i3, this.f7100e, this.f7116u, this.f7113r);
        }
    }

    /* renamed from: a */
    private void m8715a(Canvas canvas, int i, int i2, float f) {
        m8713a(i, i2);
        this.f7118w.addCircle(((float) this.f7110o) / 2.0f, ((float) this.f7111p) / 2.0f, f, Path.Direction.CCW);
        canvas.drawPath(this.f7118w, this.f7117v);
    }

    /* renamed from: a */
    private void m8716a(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        m8713a(i, i2);
        this.f7118w.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.f7118w, this.f7117v);
    }

    /* renamed from: a */
    private void m8713a(int i, int i2) {
        this.f7118w.reset();
        this.f7117v.setStrokeWidth((float) i);
        this.f7117v.setColor(i2);
        this.f7117v.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    private void m8712a() {
        if (!this.f7097b) {
            RectF rectF = this.f7116u;
            int i = this.f7099d;
            rectF.set(((float) i) / 2.0f, ((float) i) / 2.0f, ((float) this.f7110o) - (((float) i) / 2.0f), ((float) this.f7111p) - (((float) i) / 2.0f));
        }
    }

    /* renamed from: b */
    private void m8718b() {
        if (this.f7097b) {
            float min = ((float) Math.min(this.f7110o, this.f7111p)) / 2.0f;
            this.f7112q = min;
            RectF rectF = this.f7115t;
            int i = this.f7110o;
            int i2 = this.f7111p;
            rectF.set((((float) i) / 2.0f) - min, (((float) i2) / 2.0f) - min, (((float) i) / 2.0f) + min, (((float) i2) / 2.0f) + min);
            return;
        }
        this.f7115t.set(0.0f, 0.0f, (float) this.f7110o, (float) this.f7111p);
        if (this.f7098c) {
            this.f7115t = this.f7116u;
        }
    }

    /* renamed from: c */
    private void m8719c() {
        if (!this.f7097b) {
            int i = 0;
            if (this.f7103h > 0) {
                while (true) {
                    float[] fArr = this.f7113r;
                    if (i < fArr.length) {
                        int i2 = this.f7103h;
                        fArr[i] = (float) i2;
                        this.f7114s[i] = ((float) i2) - (((float) this.f7099d) / 2.0f);
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                float[] fArr2 = this.f7113r;
                int i3 = this.f7104i;
                float f = (float) i3;
                fArr2[1] = f;
                fArr2[0] = f;
                int i4 = this.f7105j;
                float f2 = (float) i4;
                fArr2[3] = f2;
                fArr2[2] = f2;
                int i5 = this.f7107l;
                float f3 = (float) i5;
                fArr2[5] = f3;
                fArr2[4] = f3;
                int i6 = this.f7106k;
                float f4 = (float) i6;
                fArr2[7] = f4;
                fArr2[6] = f4;
                float[] fArr3 = this.f7114s;
                int i7 = this.f7099d;
                float f5 = ((float) i3) - (((float) i7) / 2.0f);
                fArr3[1] = f5;
                fArr3[0] = f5;
                float f6 = ((float) i4) - (((float) i7) / 2.0f);
                fArr3[3] = f6;
                fArr3[2] = f6;
                float f7 = ((float) i5) - (((float) i7) / 2.0f);
                fArr3[5] = f7;
                fArr3[4] = f7;
                float f8 = ((float) i6) - (((float) i7) / 2.0f);
                fArr3[7] = f8;
                fArr3[6] = f8;
            }
        }
    }

    /* renamed from: a */
    private void m8717a(boolean z) {
        if (z) {
            this.f7103h = 0;
        }
        m8719c();
        m8712a();
        invalidate();
    }

    /* renamed from: d */
    private void m8720d() {
        if (!this.f7097b) {
            this.f7101f = 0;
        }
    }

    public void isCoverSrc(boolean z) {
        this.f7098c = z;
        m8718b();
        invalidate();
    }

    public void isCircle(boolean z) {
        this.f7097b = z;
        m8720d();
        m8718b();
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.f7099d = C3904y.m12886e(this.f7096a, (float) i);
        m8717a(false);
    }

    public void setBorderColor(int i) {
        this.f7100e = i;
        invalidate();
    }

    public void setInnerBorderWidth(int i) {
        this.f7101f = C3904y.m12886e(this.f7096a, (float) i);
        m8720d();
        invalidate();
    }

    public void setInnerBorderColor(int i) {
        this.f7102g = i;
        invalidate();
    }

    public void setCornerRadius(int i) {
        this.f7103h = C3904y.m12886e(this.f7096a, (float) i);
        m8717a(false);
    }

    public void setCornerTopLeftRadius(int i) {
        this.f7104i = C3904y.m12886e(this.f7096a, (float) i);
        m8717a(true);
    }

    public void setCornerTopRightRadius(int i) {
        this.f7105j = C3904y.m12886e(this.f7096a, (float) i);
        m8717a(true);
    }

    public void setCornerBottomLeftRadius(int i) {
        this.f7106k = C3904y.m12886e(this.f7096a, (float) i);
        m8717a(true);
    }

    public void setCornerBottomRightRadius(int i) {
        this.f7107l = C3904y.m12886e(this.f7096a, (float) i);
        m8717a(true);
    }

    public void setMaskColor(int i) {
        this.f7108m = i;
        invalidate();
    }
}
