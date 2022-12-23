package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.C1535i;

/* renamed from: com.applovin.impl.adview.m */
public class C1550m extends FrameLayout {

    /* renamed from: a */
    private C1535i f1960a;

    /* renamed from: b */
    private int f1961b;

    public C1550m(C1535i.C1536a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        C1535i a = C1535i.m2857a(aVar, activity);
        this.f1960a = a;
        addView(a);
    }

    /* renamed from: a */
    public void mo13209a(int i, int i2, int i3, int i4) {
        this.f1961b = i;
        int i5 = i2 + i + i3;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i5;
            layoutParams.width = i5;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i, i4);
        layoutParams2.setMargins(i3, i3, i3, 0);
        this.f1960a.setLayoutParams(layoutParams2);
        this.f1960a.mo13182a(i);
    }

    /* renamed from: a */
    public void mo13210a(C1535i.C1536a aVar) {
        if (aVar != null && aVar != this.f1960a.getStyle()) {
            ViewGroup.LayoutParams layoutParams = this.f1960a.getLayoutParams();
            removeView(this.f1960a);
            C1535i a = C1535i.m2857a(aVar, getContext());
            this.f1960a = a;
            addView(a);
            this.f1960a.setLayoutParams(layoutParams);
            this.f1960a.mo13182a(this.f1961b);
        }
    }
}
