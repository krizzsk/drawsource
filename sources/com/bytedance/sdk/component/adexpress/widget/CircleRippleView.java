package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

public class CircleRippleView extends View {

    /* renamed from: a */
    private int f5889a;

    /* renamed from: b */
    private int f5890b;

    /* renamed from: c */
    private float f5891c;

    /* renamed from: d */
    private int f5892d;

    /* renamed from: e */
    private float f5893e;

    /* renamed from: f */
    private int f5894f;

    /* renamed from: g */
    private boolean f5895g;

    /* renamed from: h */
    private List<Integer> f5896h;

    /* renamed from: i */
    private List<Integer> f5897i;

    /* renamed from: j */
    private Paint f5898j;

    /* renamed from: k */
    private Paint f5899k;

    /* renamed from: l */
    private float f5900l;

    /* renamed from: m */
    private float f5901m;

    /* renamed from: n */
    private int f5902n;

    public CircleRippleView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5889a = -1;
        this.f5890b = SupportMenu.CATEGORY_MASK;
        this.f5891c = 18.0f;
        this.f5892d = 3;
        this.f5893e = 50.0f;
        this.f5894f = 2;
        this.f5895g = false;
        this.f5896h = new ArrayList();
        this.f5897i = new ArrayList();
        this.f5902n = 24;
        m7241c();
    }

    /* renamed from: c */
    private void m7241c() {
        Paint paint = new Paint();
        this.f5898j = paint;
        paint.setAntiAlias(true);
        this.f5898j.setStrokeWidth((float) this.f5902n);
        this.f5896h.add(255);
        this.f5897i.add(0);
        Paint paint2 = new Paint();
        this.f5899k = paint2;
        paint2.setAntiAlias(true);
        this.f5899k.setColor(Color.parseColor("#0FFFFFFF"));
        this.f5899k.setStyle(Paint.Style.FILL);
    }

    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = ((float) i) / 2.0f;
        this.f5900l = f;
        this.f5901m = ((float) i2) / 2.0f;
        float f2 = f - (((float) this.f5902n) / 2.0f);
        this.f5893e = f2;
        this.f5891c = f2 / 4.0f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    public void onDraw(Canvas canvas) {
        this.f5898j.setShader(new LinearGradient(this.f5900l, 0.0f, this.f5901m, (float) getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= this.f5896h.size()) {
                break;
            }
            Integer num = this.f5896h.get(i);
            this.f5898j.setAlpha(num.intValue());
            Integer num2 = this.f5897i.get(i);
            if (this.f5891c + ((float) num2.intValue()) < this.f5893e) {
                canvas.drawCircle(this.f5900l, this.f5901m, this.f5891c + ((float) num2.intValue()), this.f5898j);
            }
            if (num.intValue() > 0 && ((float) num2.intValue()) < this.f5893e) {
                List<Integer> list = this.f5896h;
                if (num.intValue() - this.f5894f > 0) {
                    i2 = num.intValue() - (this.f5894f * 3);
                }
                list.set(i, Integer.valueOf(i2));
                this.f5897i.set(i, Integer.valueOf(num2.intValue() + this.f5894f));
            }
            i++;
        }
        List<Integer> list2 = this.f5897i;
        if (((float) list2.get(list2.size() - 1).intValue()) >= this.f5893e / ((float) this.f5892d)) {
            this.f5896h.add(255);
            this.f5897i.add(0);
        }
        if (this.f5897i.size() >= 3) {
            this.f5897i.remove(0);
            this.f5896h.remove(0);
        }
        this.f5898j.setAlpha(255);
        this.f5898j.setColor(this.f5890b);
        canvas.drawCircle(this.f5900l, this.f5901m, this.f5891c, this.f5899k);
        if (this.f5895g) {
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo17259a() {
        this.f5895g = true;
        invalidate();
    }

    /* renamed from: b */
    public void mo17260b() {
        this.f5895g = false;
        this.f5897i.clear();
        this.f5896h.clear();
        this.f5896h.add(255);
        this.f5897i.add(0);
        invalidate();
    }

    public void setColor(int i) {
        this.f5889a = i;
    }

    public void setCoreColor(int i) {
        this.f5890b = i;
    }

    public void setCoreRadius(int i) {
        this.f5891c = (float) i;
    }

    public void setDiffuseWidth(int i) {
        this.f5892d = i;
    }

    public void setMaxWidth(int i) {
        this.f5893e = (float) i;
    }

    public void setDiffuseSpeed(int i) {
        this.f5894f = i;
    }
}
