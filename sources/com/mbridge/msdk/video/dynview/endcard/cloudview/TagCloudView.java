package com.mbridge.msdk.video.dynview.endcard.cloudview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.mbridge.msdk.video.dynview.endcard.cloudview.C9343d;

public class TagCloudView extends ViewGroup implements C9343d.C9344a, Runnable {
    public static final int MODE_DECELERATE = 1;
    public static final int MODE_DISABLE = 0;
    public static final int MODE_UNIFORM = 2;

    /* renamed from: a */
    private float f22909a = 2.0f;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C9342c f22910b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public float f22911c = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f22912d = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public float f22913e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public float f22914f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float f22915g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public float f22916h = 0.9f;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float[] f22917i = {1.0f, 0.0f, 0.0f, 1.0f};
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float[] f22918j = {0.9412f, 0.7686f, 0.2f, 1.0f};

    /* renamed from: k */
    private boolean f22919k;

    /* renamed from: l */
    private ViewGroup.MarginLayoutParams f22920l;

    /* renamed from: m */
    private int f22921m;
    public int mMode;

    /* renamed from: n */
    private boolean f22922n = false;

    /* renamed from: o */
    private Handler f22923o = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C9343d f22924p = new C9341b();

    /* renamed from: q */
    private C9337a f22925q;

    /* renamed from: r */
    private C9338b f22926r;

    /* renamed from: com.mbridge.msdk.video.dynview.endcard.cloudview.TagCloudView$a */
    public interface C9337a {
    }

    /* renamed from: com.mbridge.msdk.video.dynview.endcard.cloudview.TagCloudView$b */
    public interface C9338b {
    }

    public TagCloudView(Context context) {
        super(context);
        m26587a(context, (AttributeSet) null);
    }

    public TagCloudView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26587a(context, attributeSet);
    }

    public TagCloudView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26587a(context, attributeSet);
    }

    /* renamed from: a */
    private void m26587a(Context context, AttributeSet attributeSet) {
        try {
            setFocusableInTouchMode(true);
            this.f22910b = new C9342c();
            this.mMode = 2;
            setManualScroll(true);
            setLightColor(Color.parseColor("#b1c914"));
            setDarkColor(Color.parseColor("#206fa1"));
            setRadiusPercent(0.6f);
            setScrollSpeed(1.0f);
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 13) {
                windowManager.getDefaultDisplay().getSize(point);
            } else {
                point.x = windowManager.getDefaultDisplay().getWidth();
                point.y = windowManager.getDefaultDisplay().getHeight();
            }
            int i = point.x;
            int i2 = point.y;
            if (i2 < i) {
                i = i2;
            }
            this.f22921m = i;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAutoScrollMode(int i) {
        this.mMode = i;
    }

    public int getAutoScrollMode() {
        return this.mMode;
    }

    public final void setAdapter(C9343d dVar) {
        this.f22924p = dVar;
        dVar.mo62844a((C9343d.C9344a) this);
        onChange();
    }

    public void setManualScroll(boolean z) {
        this.f22919k = z;
    }

    public void setLightColor(int i) {
        float[] fArr = new float[4];
        fArr[3] = (((float) Color.alpha(i)) / 1.0f) / 255.0f;
        fArr[0] = (((float) Color.red(i)) / 1.0f) / 255.0f;
        fArr[1] = (((float) Color.green(i)) / 1.0f) / 255.0f;
        fArr[2] = (((float) Color.blue(i)) / 1.0f) / 255.0f;
        this.f22918j = (float[]) fArr.clone();
        onChange();
    }

    public void setDarkColor(int i) {
        float[] fArr = new float[4];
        fArr[3] = (((float) Color.alpha(i)) / 1.0f) / 255.0f;
        fArr[0] = (((float) Color.red(i)) / 1.0f) / 255.0f;
        fArr[1] = (((float) Color.green(i)) / 1.0f) / 255.0f;
        fArr[2] = (((float) Color.blue(i)) / 1.0f) / 255.0f;
        this.f22917i = (float[]) fArr.clone();
        onChange();
    }

    public void setRadiusPercent(float f) {
        if (f > 1.0f || f < 0.0f) {
            throw new IllegalArgumentException("percent value not in range 0 to 1");
        }
        this.f22916h = f;
        onChange();
    }

    public void setScrollSpeed(float f) {
        this.f22909a = f;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26586a() {
        removeAllViews();
        for (C9339a e : this.f22910b.mo62839b()) {
            addView(e.mo62823e());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.f22920l == null) {
            this.f22920l = (ViewGroup.MarginLayoutParams) getLayoutParams();
        }
        if (mode != 1073741824) {
            size = (this.f22921m - this.f22920l.leftMargin) - this.f22920l.rightMargin;
        }
        if (mode2 != 1073741824) {
            size2 = (this.f22921m - this.f22920l.leftMargin) - this.f22920l.rightMargin;
        }
        setMeasuredDimension(size, size2);
        measureChildren(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22923o.post(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22923o.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            C9339a a = this.f22910b.mo62833a(i5);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                this.f22924p.mo62792a(childAt, a.mo62831j(), a.mo62830i());
                childAt.setScaleX(a.mo62821d());
                childAt.setScaleY(a.mo62821d());
                int g = ((int) (this.f22913e + a.mo62827g())) - (childAt.getMeasuredWidth() / 2);
                int h = ((int) (this.f22914f + a.mo62829h())) - (childAt.getMeasuredHeight() / 2);
                childAt.layout(g, h, childAt.getMeasuredWidth() + g, childAt.getMeasuredHeight() + h);
            }
        }
    }

    public void reset() {
        this.f22910b.mo62842c();
        m26586a();
    }

    public void run() {
        int i;
        if (!this.f22922n && (i = this.mMode) != 0) {
            if (i == 1) {
                float f = this.f22911c;
                if (f > 0.04f) {
                    this.f22911c = f - 0.02f;
                }
                float f2 = this.f22912d;
                if (f2 > 0.04f) {
                    this.f22912d = f2 - 0.02f;
                }
                float f3 = this.f22911c;
                if (f3 < -0.04f) {
                    this.f22911c = f3 + 0.02f;
                }
                float f4 = this.f22912d;
                if (f4 < -0.04f) {
                    this.f22912d = f4 + 0.02f;
                }
            }
            C9342c cVar = this.f22910b;
            if (cVar != null) {
                cVar.mo62835a(this.f22911c, this.f22912d);
                this.f22910b.mo62843d();
            }
            m26586a();
        }
        this.f22923o.postDelayed(this, 16);
    }

    public void setOnTagClickListener(C9337a aVar) {
        this.f22925q = aVar;
    }

    public void setOnTagViewClickListener(C9338b bVar) {
        this.f22926r = bVar;
    }

    public void onChange() {
        postDelayed(new Runnable() {
            public final void run() {
                TagCloudView tagCloudView = TagCloudView.this;
                float unused = tagCloudView.f22913e = (float) ((tagCloudView.getRight() - TagCloudView.this.getLeft()) / 2);
                TagCloudView tagCloudView2 = TagCloudView.this;
                float unused2 = tagCloudView2.f22914f = (float) ((tagCloudView2.getBottom() - TagCloudView.this.getTop()) / 2);
                TagCloudView tagCloudView3 = TagCloudView.this;
                float unused3 = tagCloudView3.f22915g = Math.min(tagCloudView3.f22913e * TagCloudView.this.f22916h, TagCloudView.this.f22914f * TagCloudView.this.f22916h);
                TagCloudView.this.f22910b.mo62840b((int) TagCloudView.this.f22915g);
                TagCloudView.this.f22910b.mo62838a(TagCloudView.this.f22918j);
                TagCloudView.this.f22910b.mo62841b(TagCloudView.this.f22917i);
                TagCloudView.this.f22910b.mo62834a();
                TagCloudView.this.removeAllViews();
                for (int i = 0; i < TagCloudView.this.f22924p.mo62789a(); i++) {
                    C9339a aVar = new C9339a(TagCloudView.this.f22924p.mo62790a(i));
                    aVar.mo62814a(TagCloudView.this.f22924p.mo62791a(TagCloudView.this.getContext(), i, (ViewGroup) TagCloudView.this));
                    TagCloudView.this.f22910b.mo62836a(aVar);
                }
                TagCloudView.this.f22910b.mo62835a(TagCloudView.this.f22911c, TagCloudView.this.f22912d);
                TagCloudView.this.f22910b.mo62837a(true);
                TagCloudView.this.m26586a();
            }
        }, 0);
    }
}
