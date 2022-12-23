package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class MBRotationView extends FrameLayout {

    /* renamed from: a */
    Runnable f18202a = new Runnable() {
        public void run() {
            MBRotationView.m20766a(MBRotationView.this);
        }
    };

    /* renamed from: b */
    private Camera f18203b;

    /* renamed from: c */
    private Matrix f18204c;

    /* renamed from: d */
    private int f18205d;

    /* renamed from: e */
    private int f18206e;

    /* renamed from: f */
    private int f18207f = 40;

    /* renamed from: g */
    private int f18208g = 20;

    /* renamed from: h */
    private int f18209h = 0;

    /* renamed from: i */
    private int f18210i = 0;

    /* renamed from: j */
    private int f18211j;

    /* renamed from: k */
    private int f18212k = 0;

    /* renamed from: l */
    private float f18213l = 0.5f;

    /* renamed from: m */
    private float f18214m = 0.9f;

    /* renamed from: n */
    private boolean f18215n = true;

    /* renamed from: o */
    private boolean f18216o = false;

    /* renamed from: p */
    private boolean f18217p = false;

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public MBRotationView(Context context) {
        super(context);
        m20763a();
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20763a();
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20763a();
    }

    /* renamed from: a */
    private void m20763a() {
        this.f18203b = new Camera();
        this.f18204c = new Matrix();
        setWillNotDraw(false);
    }

    public void setWidthRatio(float f) {
        this.f18213l = f;
    }

    public void setHeightRatio(float f) {
        this.f18214m = f;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        float f = (float) i5;
        float f2 = this.f18213l;
        int i6 = (int) (((1.0f - f2) * f) / 2.0f);
        int i7 = i4 - i2;
        float f3 = (float) i7;
        float f4 = this.f18214m;
        int i8 = (int) (((1.0f - f4) * f3) / 2.0f);
        this.f18205d = (int) (f3 * f4);
        this.f18206e = (int) (f * f2);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            childAt.layout(i6, i8, i5 - i6, i7 - i8);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = this.f18206e;
            if (i10 != i11) {
                layoutParams.width = i11;
                layoutParams.height = this.f18205d;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setRotateV(boolean z) {
        this.f18216o = z;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() != 0) {
            if (this.f18216o) {
                int height = getHeight() / 2;
                int i = ((this.f18209h * this.f18205d) / 2) / this.f18207f;
                m20765a(canvas, i, height, 0);
                m20765a(canvas, i, height, 1);
                if (Math.abs(this.f18209h) > this.f18207f / 2) {
                    m20765a(canvas, i, height, 3);
                    m20765a(canvas, i, height, 2);
                    return;
                }
                m20765a(canvas, i, height, 2);
                m20765a(canvas, i, height, 3);
                return;
            }
            int width = getWidth() / 2;
            int i2 = ((this.f18209h * this.f18206e) / 2) / this.f18207f;
            m20768b(canvas, i2, width, 0);
            m20768b(canvas, i2, width, 1);
            if (Math.abs(this.f18209h) > this.f18207f / 2) {
                m20768b(canvas, i2, width, 3);
                m20768b(canvas, i2, width, 2);
                return;
            }
            m20768b(canvas, i2, width, 2);
            m20768b(canvas, i2, width, 3);
        }
    }

    public void setAutoscroll(boolean z) {
        if (z) {
            postDelayed(this.f18202a, (long) (1000 / this.f18208g));
        }
        this.f18215n = z;
    }

    /* renamed from: a */
    private void m20764a(int i, int i2, int i3) {
        float f = ((float) (-i)) / 2.0f;
        if (i3 == 0) {
            this.f18203b.translate(0.0f, f, 0.0f);
            float f2 = (float) (-i2);
            this.f18203b.rotateX(f2);
            this.f18203b.translate(0.0f, f, 0.0f);
            this.f18203b.translate(0.0f, f, 0.0f);
            this.f18203b.rotateX(f2);
            this.f18203b.translate(0.0f, f, 0.0f);
        } else if (i3 == 1) {
            this.f18203b.translate(0.0f, f, 0.0f);
            this.f18203b.rotateX((float) i2);
            this.f18203b.translate(0.0f, f, 0.0f);
        } else if (i3 == 2) {
            this.f18203b.translate(0.0f, f, 0.0f);
            this.f18203b.rotateX((float) (-i2));
            this.f18203b.translate(0.0f, f, 0.0f);
        } else if (i3 == 3) {
            this.f18203b.rotateX(0.0f);
        }
    }

    /* renamed from: a */
    private void m20765a(Canvas canvas, int i, int i2, int i3) {
        canvas.save();
        this.f18203b.save();
        this.f18204c.reset();
        float f = (float) i;
        this.f18203b.translate(0.0f, f, 0.0f);
        this.f18203b.rotateX((float) this.f18209h);
        this.f18203b.translate(0.0f, f, 0.0f);
        if (i == 0) {
            if (this.f18217p) {
                m20764a(this.f18205d, this.f18207f, i3);
            } else {
                m20764a(-this.f18205d, -this.f18207f, i3);
            }
        } else if (i > 0) {
            m20764a(this.f18205d, this.f18207f, i3);
        } else if (i < 0) {
            m20764a(-this.f18205d, -this.f18207f, i3);
        }
        this.f18203b.getMatrix(this.f18204c);
        this.f18203b.restore();
        this.f18204c.preTranslate((float) ((-getWidth()) / 2), (float) (-i2));
        this.f18204c.postTranslate((float) (getWidth() / 2), (float) i2);
        canvas.concat(this.f18204c);
        View childAt = getChildAt(m20762a(i3));
        if (childAt != null) {
            drawChild(canvas, childAt, 0);
        }
        canvas.restore();
    }

    /* renamed from: a */
    private int m20762a(int i) {
        int i2;
        int i3;
        int i4;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    i2 = i != 3 ? 0 : this.f18210i;
                } else if (this.f18217p) {
                    i3 = this.f18210i;
                    i2 = i3 - 1;
                } else {
                    i4 = this.f18210i;
                }
            } else if (this.f18217p) {
                i4 = this.f18210i;
            } else {
                i3 = this.f18210i;
                i2 = i3 - 1;
            }
            i2 = i4 + 1;
        } else if (this.f18217p) {
            i2 = this.f18210i - 2;
        } else {
            i2 = this.f18210i + 2;
        }
        int childCount = i2 % getChildCount();
        if (childCount >= 0) {
            return childCount;
        }
        return childCount + getChildCount();
    }

    /* renamed from: b */
    private void m20767b(int i, int i2, int i3) {
        if (i3 == 0) {
            float f = (float) ((-i) / 2);
            this.f18203b.translate(f, 0.0f, 0.0f);
            float f2 = (float) (-i2);
            this.f18203b.rotateY(f2);
            this.f18203b.translate(f, 0.0f, 0.0f);
            this.f18203b.translate(f, 0.0f, 0.0f);
            this.f18203b.rotateY(f2);
            this.f18203b.translate(f, 0.0f, 0.0f);
        } else if (i3 == 1) {
            float f3 = (float) (i / 2);
            this.f18203b.translate(f3, 0.0f, 0.0f);
            this.f18203b.rotateY((float) i2);
            this.f18203b.translate(f3, 0.0f, 0.0f);
        } else if (i3 == 2) {
            float f4 = (float) ((-i) / 2);
            this.f18203b.translate(f4, 0.0f, 0.0f);
            this.f18203b.rotateY((float) (-i2));
            this.f18203b.translate(f4, 0.0f, 0.0f);
        } else if (i3 == 3) {
            this.f18203b.rotateY(0.0f);
        }
    }

    /* renamed from: b */
    private void m20768b(Canvas canvas, int i, int i2, int i3) {
        canvas.save();
        this.f18203b.save();
        this.f18204c.reset();
        float f = (float) i;
        this.f18203b.translate(f, 0.0f, 0.0f);
        this.f18203b.rotateY((float) this.f18209h);
        this.f18203b.translate(f, 0.0f, 0.0f);
        if (i == 0) {
            if (this.f18217p) {
                m20767b(this.f18206e, this.f18207f, i3);
            } else {
                m20767b(-this.f18206e, -this.f18207f, i3);
            }
        } else if (i > 0) {
            m20767b(this.f18206e, this.f18207f, i3);
        } else if (i < 0) {
            m20767b(-this.f18206e, -this.f18207f, i3);
        }
        this.f18203b.getMatrix(this.f18204c);
        this.f18203b.restore();
        this.f18204c.preTranslate((float) (-i2), (float) ((-getHeight()) / 2));
        this.f18204c.postTranslate((float) i2, (float) (getHeight() / 2));
        canvas.concat(this.f18204c);
        View childAt = getChildAt(m20762a(i3));
        if (childAt != null) {
            drawChild(canvas, childAt, 0);
        }
        canvas.restore();
    }

    /* renamed from: a */
    static /* synthetic */ void m20766a(MBRotationView mBRotationView) {
        int i;
        if (mBRotationView.getChildCount() != 0) {
            int i2 = mBRotationView.f18209h - 1;
            mBRotationView.f18209h = i2;
            int i3 = mBRotationView.f18210i;
            mBRotationView.f18211j = i3;
            int i4 = mBRotationView.f18207f;
            int i5 = i2 % i4;
            mBRotationView.f18209h = i5;
            mBRotationView.f18210i = i3 - (i2 / i4);
            if (Math.abs(i5) > mBRotationView.f18207f / 2) {
                i = mBRotationView.m20762a(2);
            } else {
                i = mBRotationView.m20762a(3);
            }
            if (mBRotationView.f18212k != i) {
                mBRotationView.f18212k = i;
            }
            mBRotationView.invalidate();
            if (mBRotationView.f18215n) {
                mBRotationView.postDelayed(mBRotationView.f18202a, (long) (1000 / mBRotationView.f18208g));
            }
        }
    }
}
