package com.bytedance.sdk.openadsdk.core.widget;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.C3513m;

public class TTCountdownView extends View {

    /* renamed from: a */
    public static final String f9460a = C2914t.m8151a(C3513m.m10963a(), "tt_count_down_view");

    /* renamed from: b */
    private float f9461b;

    /* renamed from: c */
    private float f9462c;

    /* renamed from: d */
    private int f9463d;

    /* renamed from: e */
    private boolean f9464e;

    /* renamed from: f */
    private float f9465f;

    /* renamed from: g */
    private float f9466g;

    /* renamed from: h */
    private String f9467h;

    /* renamed from: i */
    private boolean f9468i;

    /* renamed from: j */
    private Paint f9469j;

    /* renamed from: k */
    private Paint f9470k;

    /* renamed from: l */
    private Paint f9471l;

    /* renamed from: m */
    private Paint f9472m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f9473n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f9474o;

    /* renamed from: p */
    private RectF f9475p;

    /* renamed from: q */
    private C3679a f9476q;

    /* renamed from: r */
    private AnimatorSet f9477r;

    /* renamed from: s */
    private ValueAnimator f9478s;

    /* renamed from: t */
    private ValueAnimator f9479t;

    /* renamed from: u */
    private ValueAnimator f9480u;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.TTCountdownView$a */
    public interface C3679a {
    }

    /* renamed from: a */
    public float mo20411a(float f, float f2) {
        return f * f2;
    }

    /* renamed from: a */
    public float mo20412a(float f, int i) {
        return ((float) i) * f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            size = m12017b();
        }
        if (mode2 != 1073741824) {
            size2 = m12017b();
        }
        setMeasuredDimension(size, size2);
    }

    /* renamed from: b */
    private int m12017b() {
        return (int) ((((this.f9461b / 2.0f) + this.f9462c) * 2.0f) + m12013a(4.0f));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(((float) getMeasuredWidth()) / 2.0f, ((float) getMeasuredHeight()) / 2.0f);
        m12018b(canvas);
        m12015a(canvas);
    }

    /* renamed from: a */
    private void m12015a(Canvas canvas) {
        String str;
        canvas.save();
        Paint.FontMetrics fontMetrics = this.f9472m.getFontMetrics();
        if (this.f9468i) {
            str = "" + ((int) Math.ceil((double) mo20411a(this.f9474o, this.f9466g)));
        } else {
            str = this.f9467h;
        }
        if (TextUtils.isEmpty(str)) {
            str = f9460a;
        }
        canvas.drawText(str, 0.0f, 0.0f - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), this.f9472m);
        canvas.restore();
    }

    /* renamed from: b */
    private void m12018b(Canvas canvas) {
        float f;
        canvas.save();
        float a = mo20412a(this.f9473n, 360);
        if (this.f9464e) {
            f = ((float) this.f9463d) - a;
        } else {
            f = (float) this.f9463d;
        }
        canvas.drawCircle(0.0f, 0.0f, this.f9462c, this.f9470k);
        canvas.drawCircle(0.0f, 0.0f, this.f9462c, this.f9471l);
        Canvas canvas2 = canvas;
        canvas2.drawArc(this.f9475p, f, a, false, this.f9469j);
        canvas.restore();
    }

    private ValueAnimator getNumAnim() {
        ValueAnimator valueAnimator = this.f9478s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9478s = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f9474o, 0.0f});
        this.f9478s = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f9478s.setDuration((long) (mo20411a(this.f9474o, this.f9466g) * 1000.0f));
        this.f9478s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = TTCountdownView.this.f9474o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TTCountdownView.this.postInvalidate();
            }
        });
        return this.f9478s;
    }

    private ValueAnimator getArcAnim() {
        ValueAnimator valueAnimator = this.f9479t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9479t = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f9473n, 0.0f});
        this.f9479t = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f9479t.setDuration((long) (mo20411a(this.f9473n, this.f9465f) * 1000.0f));
        this.f9479t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = TTCountdownView.this.f9473n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TTCountdownView.this.postInvalidate();
            }
        });
        return this.f9479t;
    }

    /* renamed from: a */
    public void mo20413a() {
        AnimatorSet animatorSet = this.f9477r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f9477r = null;
        }
        ValueAnimator valueAnimator = this.f9480u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9480u = null;
        }
        ValueAnimator valueAnimator2 = this.f9478s;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f9478s = null;
        }
        ValueAnimator valueAnimator3 = this.f9479t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.f9479t = null;
        }
        this.f9473n = 1.0f;
        this.f9474o = 1.0f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        mo20413a();
        super.onDetachedFromWindow();
    }

    public void setCountDownTime(int i) {
        float f = (float) i;
        this.f9466g = f;
        this.f9465f = f;
        mo20413a();
    }

    /* renamed from: a */
    private float m12013a(float f) {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    public C3679a getCountdownListener() {
        return this.f9476q;
    }

    public void setCountdownListener(C3679a aVar) {
        this.f9476q = aVar;
    }
}
