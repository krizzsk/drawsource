package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.animation.p097a.C2590b;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.C2607a;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.C2608b;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2615e;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2616f;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2617g;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.dynamic.p100d.C2642a;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.utils.C2914t;
import java.util.List;

public abstract class DynamicBaseWidget extends FrameLayout implements C2608b, C2654b, C2655c {

    /* renamed from: a */
    private float f5740a;

    /* renamed from: b */
    private float f5741b;

    /* renamed from: c */
    protected float f5742c;

    /* renamed from: d */
    protected float f5743d;

    /* renamed from: e */
    protected float f5744e;

    /* renamed from: f */
    protected float f5745f;

    /* renamed from: g */
    protected int f5746g = ((int) C2572b.m6622a(this.f5750k, this.f5744e));

    /* renamed from: h */
    protected int f5747h = ((int) C2572b.m6622a(this.f5750k, this.f5745f));

    /* renamed from: i */
    protected int f5748i = ((int) C2572b.m6622a(this.f5750k, this.f5742c));

    /* renamed from: j */
    protected int f5749j = ((int) C2572b.m6622a(this.f5750k, this.f5743d));

    /* renamed from: k */
    protected Context f5750k;

    /* renamed from: l */
    protected C2617g f5751l;

    /* renamed from: m */
    protected C2618h f5752m;

    /* renamed from: n */
    protected DynamicRootView f5753n;

    /* renamed from: o */
    protected View f5754o;

    /* renamed from: p */
    protected boolean f5755p;

    /* renamed from: q */
    protected C2590b f5756q;

    /* renamed from: r */
    C2607a f5757r;

    /* renamed from: s */
    private float f5758s;

    public float getShineValue() {
        return this.f5741b;
    }

    public void setShineValue(float f) {
        this.f5741b = f;
        postInvalidate();
    }

    public float getRippleValue() {
        return this.f5740a;
    }

    public void setRippleValue(float f) {
        this.f5740a = f;
        postInvalidate();
    }

    public float getMarqueeValue() {
        return this.f5758s;
    }

    public void setMarqueeValue(float f) {
        this.f5758s = f;
        postInvalidate();
    }

    public DynamicBaseWidget(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context);
        this.f5750k = context;
        this.f5753n = dynamicRootView;
        this.f5752m = hVar;
        this.f5742c = hVar.mo17075e();
        this.f5743d = hVar.mo17077f();
        this.f5744e = hVar.mo17079g();
        this.f5745f = hVar.mo17081h();
        C2617g gVar = new C2617g(hVar.mo17082i());
        this.f5751l = gVar;
        if (gVar.mo17051r() > 0) {
            this.f5746g += this.f5751l.mo17051r() * 2;
            this.f5747h += this.f5751l.mo17051r() * 2;
            this.f5748i -= this.f5751l.mo17051r();
            this.f5749j -= this.f5751l.mo17051r();
            List<C2618h> j = hVar.mo17083j();
            if (j != null) {
                for (C2618h next : j) {
                    next.mo17072c(next.mo17075e() + ((float) C2572b.m6626b(this.f5750k, (float) this.f5751l.mo17051r())));
                    next.mo17074d(next.mo17077f() + ((float) C2572b.m6626b(this.f5750k, (float) this.f5751l.mo17051r())));
                    next.mo17061a((float) C2572b.m6626b(this.f5750k, (float) this.f5751l.mo17051r()));
                    next.mo17067b((float) C2572b.m6626b(this.f5750k, (float) this.f5751l.mo17051r()));
                }
            }
        }
        this.f5755p = this.f5751l.mo17047n() > 0.0d;
        this.f5757r = new C2607a();
    }

    public void setShouldInvisible(boolean z) {
        this.f5755p = z;
    }

    public boolean getBeginInvisibleAndShow() {
        return this.f5755p;
    }

    /* renamed from: c */
    public boolean mo17150c() {
        mo17171h();
        mo17153f();
        mo17151d();
        return true;
    }

    /* renamed from: a */
    public void mo17148a(int i) {
        C2617g gVar = this.f5751l;
        if (gVar != null && gVar.mo17034a(i)) {
            mo17171h();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null && (getChildAt(i2) instanceof DynamicBaseWidget)) {
                    ((DynamicBaseWidget) childAt).mo17148a(i);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo17151d() {
        if (!mo17152e()) {
            return true;
        }
        View view = this.f5754o;
        if (view == null) {
            view = this;
        }
        view.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        view.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        view.setTag(C2914t.m8158e(getContext(), "tt_id_click_tag"), this.f5751l.mo17059z());
        view.setTag(C2914t.m8158e(getContext(), "tt_id_click_area_type"), this.f5752m.mo17082i().mo16876b());
        mo17149a(view);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17149a(View view) {
        C2616f e;
        C2618h hVar = this.f5752m;
        if (hVar != null && (e = hVar.mo17082i().mo16882e()) != null) {
            view.setTag(C2914t.m8158e(getContext(), "tt_id_open_landing_page"), Boolean.valueOf(e.mo16929ak()));
        }
    }

    /* renamed from: e */
    public boolean mo17152e() {
        C2617g gVar = this.f5751l;
        return (gVar == null || gVar.mo17055v() == 0) ? false : true;
    }

    /* renamed from: f */
    public void mo17153f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f5746g, this.f5747h);
        layoutParams.topMargin = this.f5749j;
        layoutParams.leftMargin = this.f5748i;
        setLayoutParams(layoutParams);
    }

    public int getClickArea() {
        return this.f5751l.mo17055v();
    }

    public C2642a getDynamicClickListener() {
        return this.f5753n.getDynamicClickListener();
    }

    /* access modifiers changed from: protected */
    public Drawable getBackgroundDrawable() {
        return mo17145a(false, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Drawable mo17145a(boolean z, String str) {
        int i;
        if (!TextUtils.isEmpty(this.f5751l.mo17058y())) {
            try {
                String y = this.f5751l.mo17058y();
                String[] split = y.substring(y.indexOf("(") + 1, y.length() - 1).split(", ");
                GradientDrawable a = mo17147a(mo17146a(split[0]), new int[]{C2617g.m6917a(split[1].substring(0, 7)), C2617g.m6917a(split[2].substring(0, 7))});
                a.setShape(0);
                a.setCornerRadius(C2572b.m6622a(this.f5750k, this.f5751l.mo17048o()));
                return a;
            } catch (Exception unused) {
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        drawable.setCornerRadius(C2572b.m6622a(this.f5750k, this.f5751l.mo17048o()));
        if (z) {
            i = Color.parseColor(str);
        } else {
            i = this.f5751l.mo17056w();
        }
        drawable.setColor(i);
        if (this.f5751l.mo17050q() > 0.0f) {
            drawable.setStroke((int) C2572b.m6622a(this.f5750k, this.f5751l.mo17050q()), this.f5751l.mo17049p());
        } else if (this.f5751l.mo17051r() > 0) {
            drawable.setStroke(this.f5751l.mo17051r(), this.f5751l.mo17049p());
            drawable.setAlpha(50);
        }
        return drawable;
    }

    /* access modifiers changed from: protected */
    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GradientDrawable mo17147a(GradientDrawable.Orientation orientation, int[] iArr) {
        return new GradientDrawable(orientation, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GradientDrawable.Orientation mo17146a(String str) {
        try {
            int parseInt = Integer.parseInt(str.substring(0, str.length() - 3));
            if (parseInt <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (parseInt <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (parseInt <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f5757r.mo16830a(canvas, (C2608b) this, (View) this);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C2607a aVar = this.f5757r;
        View view = this.f5754o;
        if (view == null) {
            view = this;
        }
        aVar.mo16831a(view, i, i2);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo17154g();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        mo16803b();
        super.onDetachedFromWindow();
    }

    /* renamed from: g */
    public void mo17154g() {
        if (!mo17130a()) {
            View view = this.f5754o;
            if (view == null) {
                view = this;
            }
            C2590b bVar = new C2590b(view, this.f5752m.mo17082i().mo16882e().mo16921ac());
            this.f5756q = bVar;
            bVar.mo16802a();
        }
    }

    /* renamed from: b */
    public void mo16803b() {
        C2590b bVar = this.f5756q;
        if (bVar != null) {
            bVar.mo16803b();
        }
    }

    /* renamed from: a */
    private boolean mo17130a() {
        C2618h hVar = this.f5752m;
        return hVar == null || hVar.mo17082i() == null || this.f5752m.mo17082i().mo16882e() == null || this.f5752m.mo17082i().mo16882e().mo16921ac() == null;
    }

    public int getDynamicWidth() {
        return this.f5746g;
    }

    public int getDynamicHeight() {
        return this.f5747h;
    }

    public C2616f getDynamicLayoutBrickValue() {
        C2615e i;
        C2618h hVar = this.f5752m;
        if (hVar == null || (i = hVar.mo17082i()) == null) {
            return null;
        }
        return i.mo16882e();
    }
}
