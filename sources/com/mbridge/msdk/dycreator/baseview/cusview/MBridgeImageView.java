package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.C8672v;

public class MBridgeImageView extends ImageView {

    /* renamed from: a */
    private Xfermode f18220a;

    /* renamed from: b */
    private int f18221b;

    /* renamed from: c */
    private int f18222c;

    /* renamed from: d */
    private int f18223d;

    /* renamed from: e */
    private int f18224e;

    /* renamed from: f */
    private int f18225f;

    /* renamed from: g */
    private int f18226g;

    /* renamed from: h */
    private int f18227h;

    /* renamed from: i */
    private int f18228i;

    /* renamed from: j */
    private int f18229j;

    /* renamed from: k */
    private float[] f18230k;

    /* renamed from: l */
    private float[] f18231l;

    /* renamed from: m */
    private RectF f18232m;

    /* renamed from: n */
    private RectF f18233n;

    /* renamed from: o */
    private boolean f18234o;

    /* renamed from: p */
    private boolean f18235p;

    /* renamed from: q */
    private Path f18236q;

    /* renamed from: r */
    private Paint f18237r;

    public MBridgeImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18236q = new Path();
        this.f18237r = new Paint();
        this.f18230k = new float[8];
        this.f18231l = new float[8];
        this.f18233n = new RectF();
        this.f18232m = new RectF();
        this.f18220a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        super.onSizeChanged(i, i2, i3, i4);
        this.f18221b = i;
        this.f18222c = i2;
        int i8 = 0;
        if (this.f18235p) {
            try {
                if (!(this.f18230k == null || this.f18231l == null)) {
                    while (true) {
                        i5 = 2;
                        if (i8 >= 2) {
                            break;
                        }
                        this.f18230k[i8] = (float) this.f18224e;
                        this.f18231l[i8] = ((float) this.f18224e) - (((float) this.f18228i) / 2.0f);
                        i8++;
                    }
                    while (true) {
                        i6 = 4;
                        if (i5 >= 4) {
                            break;
                        }
                        this.f18230k[i5] = (float) this.f18225f;
                        this.f18231l[i5] = ((float) this.f18225f) - (((float) this.f18228i) / 2.0f);
                        i5++;
                    }
                    while (true) {
                        if (i6 >= 6) {
                            break;
                        }
                        this.f18230k[i6] = (float) this.f18226g;
                        this.f18231l[i6] = ((float) this.f18226g) - (((float) this.f18228i) / 2.0f);
                        i6++;
                    }
                    for (i7 = 6; i7 < 8; i7++) {
                        this.f18230k[i7] = (float) this.f18227h;
                        this.f18231l[i7] = ((float) this.f18227h) - (((float) this.f18228i) / 2.0f);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (!(this.f18230k == null || this.f18231l == null)) {
            while (i8 < this.f18230k.length) {
                try {
                    this.f18230k[i8] = (float) this.f18223d;
                    this.f18231l[i8] = ((float) this.f18223d) - (((float) this.f18228i) / 2.0f);
                    i8++;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        RectF rectF = this.f18233n;
        if (rectF != null) {
            int i9 = this.f18228i;
            rectF.set(((float) i9) / 2.0f, ((float) i9) / 2.0f, ((float) this.f18221b) - (((float) i9) / 2.0f), ((float) this.f18222c) - (((float) i9) / 2.0f));
        }
        RectF rectF2 = this.f18232m;
        if (rectF2 != null) {
            rectF2.set(0.0f, 0.0f, (float) this.f18221b, (float) this.f18222c);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (canvas != null) {
            try {
                canvas.saveLayer(this.f18232m, (Paint) null, 31);
                canvas.scale((((float) (this.f18221b - (this.f18228i * 2))) * 1.0f) / ((float) this.f18221b), (((float) (this.f18222c - (this.f18228i * 2))) * 1.0f) / ((float) this.f18222c), ((float) this.f18221b) / 2.0f, ((float) this.f18222c) / 2.0f);
                super.onDraw(canvas);
                if (this.f18237r != null) {
                    this.f18237r.reset();
                    this.f18237r.setAntiAlias(true);
                    this.f18237r.setStyle(Paint.Style.FILL);
                    this.f18237r.setXfermode(this.f18220a);
                }
                if (this.f18236q != null) {
                    this.f18236q.reset();
                    this.f18236q.addRoundRect(this.f18232m, this.f18231l, Path.Direction.CCW);
                }
                canvas.drawPath(this.f18236q, this.f18237r);
                if (this.f18237r != null) {
                    this.f18237r.setXfermode((Xfermode) null);
                }
                canvas.restore();
                if (this.f18234o) {
                    int i = this.f18228i;
                    int i2 = this.f18229j;
                    RectF rectF = this.f18233n;
                    float[] fArr = this.f18230k;
                    try {
                        if (this.f18236q != null) {
                            this.f18236q.reset();
                        }
                        if (this.f18237r != null) {
                            this.f18237r.setStrokeWidth((float) i);
                            this.f18237r.setColor(i2);
                            this.f18237r.setStyle(Paint.Style.STROKE);
                        }
                        if (this.f18236q != null) {
                            this.f18236q.addRoundRect(rectF, fArr, Path.Direction.CCW);
                        }
                        if (canvas != null) {
                            canvas.drawPath(this.f18236q, this.f18237r);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                C8672v.m24874a("MBridgeImageView", e2.getMessage());
            }
        }
    }

    public void setCornerRadius(int i) {
        this.f18223d = i;
    }

    public void setBorder(int i, int i2, int i3) {
        this.f18234o = true;
        this.f18228i = i2;
        this.f18229j = i3;
        this.f18223d = i;
    }

    public void setCustomBorder(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f18234o = true;
        this.f18235p = true;
        this.f18228i = i5;
        this.f18229j = i6;
        this.f18224e = i;
        this.f18226g = i3;
        this.f18225f = i2;
        this.f18227h = i4;
    }
}
