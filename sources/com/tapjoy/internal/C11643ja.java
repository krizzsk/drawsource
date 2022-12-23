package com.tapjoy.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tapjoy.internal.ja */
public final class C11643ja extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a */
    private boolean f28064a;

    /* renamed from: b */
    private float f28065b = 1.0f;

    /* renamed from: c */
    private View f28066c;

    /* renamed from: d */
    private View f28067d;

    /* renamed from: e */
    private FrameLayout f28068e;

    /* renamed from: f */
    private ImageView f28069f;

    /* renamed from: g */
    private C11636ix f28070g;

    /* renamed from: h */
    private C11604ie f28071h;

    /* renamed from: i */
    private C11644a f28072i;

    /* renamed from: com.tapjoy.internal.ja$a */
    public interface C11644a {
        /* renamed from: a */
        void mo70161a();

        /* renamed from: a */
        void mo70162a(C11598ic icVar);

        /* renamed from: b */
        void mo70163b();
    }

    public C11643ja(Context context, C11604ie ieVar, C11644a aVar) {
        super(context);
        this.f28071h = ieVar;
        this.f28072i = aVar;
        Context context2 = getContext();
        View view = new View(context2);
        this.f28066c = view;
        boolean z = true;
        view.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.f28066c, layoutParams);
        this.f28067d = new View(context2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(0, 0);
        layoutParams2.addRule(13);
        addView(this.f28067d, layoutParams2);
        this.f28068e = new FrameLayout(context2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(0, 0);
        layoutParams3.addRule(13);
        addView(this.f28068e, layoutParams3);
        ImageView imageView = new ImageView(context2);
        this.f28069f = imageView;
        imageView.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(0, 0);
        layoutParams4.addRule(7, this.f28066c.getId());
        layoutParams4.addRule(6, this.f28066c.getId());
        addView(this.f28069f, layoutParams4);
        if (this.f28071h.f27914m != null) {
            C11606if ifVar = this.f28071h.f27914m;
            if (ifVar.f27916a == null || (ifVar.f27917b == null && ifVar.f27918c == null)) {
                z = false;
            }
            if (z) {
                C11636ix ixVar = new C11636ix(context2);
                this.f28070g = ixVar;
                ixVar.setOnClickListener(this);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(0, 0);
                layoutParams5.addRule(5, this.f28067d.getId());
                layoutParams5.addRule(8, this.f28067d.getId());
                addView(this.f28070g, layoutParams5);
            }
        }
        this.f28069f.setImageBitmap(ieVar.f27904c.f27925b);
        if (this.f28070g != null && ieVar.f27914m != null && ieVar.f27914m.f27916a != null) {
            this.f28070g.setImageBitmap(ieVar.f27914m.f27916a.f27925b);
        }
    }

    public final void setLandscape(boolean z) {
        Bitmap bitmap;
        ArrayList<C11598ic> arrayList;
        Bitmap bitmap2;
        this.f28064a = z;
        if (z) {
            bitmap = this.f28071h.f27903b.f27925b;
            bitmap2 = this.f28071h.f27907f.f27925b;
            arrayList = this.f28071h.f27911j;
        } else {
            bitmap = this.f28071h.f27902a.f27925b;
            bitmap2 = this.f28071h.f27906e.f27925b;
            arrayList = this.f28071h.f27910i;
        }
        C11255aa.m30847a(this.f28066c, new BitmapDrawable((Resources) null, bitmap));
        C11255aa.m30847a(this.f28067d, new BitmapDrawable((Resources) null, bitmap2));
        if (this.f28068e.getChildCount() > 0) {
            this.f28068e.removeAllViews();
        }
        Context context = getContext();
        Iterator<C11598ic> it = arrayList.iterator();
        while (it.hasNext()) {
            View view = new View(context);
            view.setTag(it.next());
            view.setOnClickListener(this);
            this.f28068e.addView(view, new FrameLayout.LayoutParams(0, 0, 51));
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        Point point;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.f28064a) {
            this.f28065b = Math.min(((float) size) / 480.0f, ((float) size2) / 320.0f);
        } else {
            this.f28065b = Math.min(((float) size) / 320.0f, ((float) size2) / 480.0f);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f28066c.getLayoutParams();
        int i4 = 480;
        layoutParams.width = m31893a(this.f28064a ? 480 : 320);
        if (this.f28064a) {
            i4 = 320;
        }
        layoutParams.height = m31893a(i4);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f28067d.getLayoutParams();
        int i5 = 448;
        layoutParams2.width = m31893a(this.f28064a ? 448 : 290);
        if (this.f28064a) {
            i5 = 290;
        }
        layoutParams2.height = m31893a(i5);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f28068e.getLayoutParams();
        layoutParams3.width = layoutParams2.width;
        layoutParams3.height = layoutParams2.height;
        for (View next : C11256ab.m30848a(this.f28068e)) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) next.getLayoutParams();
            Rect rect = ((C11598ic) next.getTag()).f27882a;
            layoutParams4.width = m31893a(rect.width());
            layoutParams4.height = m31893a(rect.height());
            layoutParams4.leftMargin = m31893a(rect.left);
            layoutParams4.topMargin = m31893a(rect.top);
        }
        int i6 = 0;
        int a = m31893a(0);
        this.f28069f.setPadding(a, a, a, a);
        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f28069f.getLayoutParams();
        layoutParams5.width = m31893a(30);
        layoutParams5.height = layoutParams5.width;
        int i7 = -a;
        layoutParams5.rightMargin = m31893a(this.f28071h.f27905d.x) + i7;
        layoutParams5.topMargin = i7 + m31893a(this.f28071h.f27905d.y);
        if (this.f28070g != null) {
            int i8 = 16;
            int a2 = m31893a(this.f28064a ? 16 : 15);
            if (this.f28064a) {
                i8 = 15;
            }
            int a3 = m31893a(i8);
            this.f28070g.setPadding(a, a, a, a);
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f28070g.getLayoutParams();
            layoutParams6.width = m31893a(26);
            layoutParams6.height = layoutParams6.width;
            if (this.f28071h.f27914m != null) {
                if (this.f28064a) {
                    C11606if ifVar = this.f28071h.f27914m;
                    if (ifVar.f27917b == null) {
                        point = ifVar.f27918c;
                    } else {
                        point = ifVar.f27917b;
                    }
                } else {
                    C11606if ifVar2 = this.f28071h.f27914m;
                    if (ifVar2.f27918c == null) {
                        point = ifVar2.f27917b;
                    } else {
                        point = ifVar2.f27918c;
                    }
                }
                if (point != null) {
                    i6 = point.x;
                    i3 = point.y;
                    layoutParams6.leftMargin = a2 + m31893a(i6);
                    layoutParams6.topMargin = a3 + m31893a(i3);
                }
            }
            i3 = 0;
            layoutParams6.leftMargin = a2 + m31893a(i6);
            layoutParams6.topMargin = a3 + m31893a(i3);
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private int m31893a(int i) {
        return (int) (((float) i) * this.f28065b);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public final void onClick(View view) {
        C11636ix ixVar;
        if (view == this.f28069f) {
            this.f28072i.mo70161a();
        } else if (view != null && view == (ixVar = this.f28070g)) {
            ixVar.f28036a = !ixVar.f28036a;
            ixVar.mo70226a();
            ixVar.invalidate();
            this.f28072i.mo70163b();
        } else if (view.getTag() instanceof C11598ic) {
            this.f28072i.mo70162a((C11598ic) view.getTag());
        }
    }
}
