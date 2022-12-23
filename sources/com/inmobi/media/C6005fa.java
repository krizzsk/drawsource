package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import com.inmobi.media.C6000ey;

/* renamed from: com.inmobi.media.fa */
/* compiled from: GifView */
public class C6005fa extends ImageView implements C6000ey.C6001a {

    /* renamed from: a */
    private C6000ey f15217a;

    /* renamed from: b */
    private float f15218b;

    /* renamed from: c */
    private boolean f15219c;

    /* renamed from: d */
    private String f15220d;

    public C6005fa(Context context) {
        this(context, (byte) 0);
    }

    private C6005fa(Context context, byte b) {
        super(context, (AttributeSet) null);
        this.f15218b = 1.0f;
        this.f15219c = true;
        this.f15220d = "unspecified";
        setLayerType(1, (Paint) null);
    }

    public void setPaused(boolean z) {
        this.f15217a.mo35127a(z);
    }

    public void setGifImpl(C6000ey eyVar) {
        this.f15217a = eyVar;
        if (eyVar != null) {
            eyVar.mo35126a((C6000ey.C6001a) this);
            this.f15217a.mo35124a();
        }
        requestLayout();
    }

    public void setContentMode(String str) {
        this.f15220d = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float[] m17891a(android.graphics.Canvas r10) {
        /*
            r9 = this;
            int r0 = r9.getWidth()
            float r0 = (float) r0
            int r1 = r9.getHeight()
            float r1 = (float) r1
            com.inmobi.media.ey r2 = r9.f15217a
            int r2 = r2.mo35128b()
            float r2 = (float) r2
            float r3 = r9.f15218b
            float r2 = r2 * r3
            com.inmobi.media.ey r3 = r9.f15217a
            int r3 = r3.mo35129c()
            float r3 = (float) r3
            float r4 = r9.f15218b
            float r3 = r3 * r4
            java.lang.String r4 = r9.f15220d
            int r5 = r4.hashCode()
            r6 = -1362001767(0xffffffffaed18099, float:-9.527063E-11)
            r7 = 0
            r8 = 1
            if (r5 == r6) goto L_0x003b
            r6 = 727618043(0x2b5e91fb, float:7.907283E-13)
            if (r5 == r6) goto L_0x0031
            goto L_0x0045
        L_0x0031:
            java.lang.String r5 = "aspectFill"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0045
            r4 = r7
            goto L_0x0046
        L_0x003b:
            java.lang.String r5 = "aspectFit"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0045
            r4 = r8
            goto L_0x0046
        L_0x0045:
            r4 = -1
        L_0x0046:
            r5 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L_0x006f
            if (r4 == r8) goto L_0x0054
            float r0 = r0 / r2
            float r1 = r1 / r3
            r10.scale(r0, r1)
            r0 = r5
            goto L_0x008a
        L_0x0054:
            float r4 = r1 / r3
            float r5 = r0 / r2
            float r4 = java.lang.Math.min(r4, r5)
            float r2 = r2 * r4
            float r0 = r0 - r2
            float r0 = r0 / r6
            float r2 = r9.f15218b
            float r5 = r4 * r2
            float r5 = r0 / r5
            float r3 = r3 * r4
            float r1 = r1 - r3
            float r1 = r1 / r6
            float r2 = r2 * r4
            float r0 = r1 / r2
            r10.scale(r4, r4)
            goto L_0x0089
        L_0x006f:
            float r4 = r1 / r3
            float r5 = r0 / r2
            float r4 = java.lang.Math.max(r4, r5)
            float r2 = r2 * r4
            float r0 = r0 - r2
            float r0 = r0 / r6
            float r2 = r9.f15218b
            float r5 = r4 * r2
            float r5 = r0 / r5
            float r3 = r3 * r4
            float r1 = r1 - r3
            float r1 = r1 / r6
            float r2 = r2 * r4
            float r0 = r1 / r2
            r10.scale(r4, r4)
        L_0x0089:
            r1 = r4
        L_0x008a:
            r10 = 3
            float[] r10 = new float[r10]
            r10[r7] = r5
            r10[r8] = r0
            r0 = 2
            r10[r0] = r1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6005fa.m17891a(android.graphics.Canvas):float[]");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f15218b = getScale();
        Drawable drawable = getDrawable();
        int i3 = 0;
        int i4 = 1;
        if (drawable != null) {
            i3 = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (i3 <= 0) {
                i3 = 1;
            }
            if (intrinsicHeight > 0) {
                i4 = intrinsicHeight;
            }
        } else {
            C6000ey eyVar = this.f15217a;
            if (eyVar != null) {
                int b = eyVar.mo35128b();
                int c = this.f15217a.mo35129c();
                if (b <= 0) {
                    b = 1;
                }
                if (c > 0) {
                    i4 = c;
                }
                i3 = b;
            } else {
                i4 = 0;
            }
        }
        setMeasuredDimension(resolveSize(Math.max(i3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i), resolveSize(Math.max(i4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2));
    }

    private int getDensity() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (!(getContext() instanceof Activity)) {
            return 240;
        }
        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    private float getScale() {
        float density = ((float) getContext().getResources().getDisplayMetrics().densityDpi) / ((float) getDensity());
        this.f15218b = density;
        if (density < 0.1f) {
            this.f15218b = 0.1f;
        }
        if (this.f15218b > 5.0f) {
            this.f15218b = 5.0f;
        }
        return this.f15218b;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f15219c = getVisibility() == 0;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C6000ey eyVar = this.f15217a;
        if (eyVar == null) {
            return;
        }
        if (eyVar.mo35130d()) {
            this.f15217a.mo35131e();
            m17893b(canvas);
            m17892b();
            return;
        }
        m17893b(canvas);
    }

    /* renamed from: b */
    private void m17893b(Canvas canvas) {
        canvas.save();
        float f = this.f15218b;
        canvas.scale(f, f);
        float[] a = m17891a(canvas);
        this.f15217a.mo35125a(canvas, a[0], a[1]);
        canvas.restore();
    }

    /* renamed from: b */
    private void m17892b() {
        if (!this.f15219c) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            postInvalidateOnAnimation();
        } else {
            invalidate();
        }
    }

    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.f15219c = z;
        m17892b();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.f15219c = i == 0;
        m17892b();
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f15219c = i == 0;
        m17892b();
    }

    /* renamed from: a */
    public final void mo35140a() {
        invalidate();
    }
}
