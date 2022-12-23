package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.C2641d;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.facebook.internal.security.CertificateUtil;

public class DynamicVideoView extends DynamicBaseWidgetImp implements C2641d {

    /* renamed from: a */
    TextView f5802a;

    /* renamed from: b */
    boolean f5803b = false;

    /* renamed from: e */
    public boolean mo17152e() {
        return true;
    }

    public DynamicVideoView(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5754o = new View(context);
        this.f5754o.setTag(Integer.valueOf(getClickArea()));
        this.f5802a = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2572b.m6622a(context, 40.0f), (int) C2572b.m6622a(context, 15.0f));
        layoutParams.gravity = 85;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.f5802a.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f5802a.setBackground(gradientDrawable);
        this.f5802a.setTextSize(10.0f);
        this.f5802a.setGravity(17);
        this.f5802a.setTextColor(-1);
        this.f5802a.setVisibility(8);
        addView(this.f5802a);
        addView(this.f5754o, getWidgetLayoutParams());
        dynamicRootView.setVideoListener(this);
    }

    /* renamed from: h */
    public boolean mo17171h() {
        super.mo17171h();
        double d = 0.0d;
        double d2 = 0.0d;
        for (C2618h hVar = this.f5752m; hVar != null; hVar = hVar.mo17084k()) {
            double e = d2 + ((double) hVar.mo17075e());
            double f = d + ((double) hVar.mo17077f());
            d2 = e - ((double) hVar.mo17071c());
            d = f - ((double) hVar.mo17073d());
        }
        try {
            float f2 = (float) d2;
            float f3 = (float) d;
            ((DynamicRoot) this.f5753n.getChildAt(0)).f5773a.mo17212a((int) C2572b.m6622a(getContext(), f2), (int) C2572b.m6622a(getContext(), f3), (int) C2572b.m6622a(getContext(), f2 + this.f5744e), (int) C2572b.m6622a(getContext(), f3 + this.f5745f));
        } catch (Exception unused) {
        }
        this.f5753n.mo17181a(d2, d, (double) this.f5744e, (double) this.f5745f, this.f5751l.mo17048o());
        return true;
    }

    public void setTimeUpdate(int i) {
        String str;
        String str2;
        if (!this.f5752m.mo17082i().mo16882e().mo16926ah() || i <= 0 || this.f5803b) {
            this.f5803b = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                m7165b(getChildAt(i2));
            }
            this.f5802a.setVisibility(8);
            return;
        }
        if (i >= 60) {
            str = "" + "0" + (i / 60);
        } else {
            str = "00";
        }
        String str3 = str + CertificateUtil.DELIMITER;
        int i3 = i % 60;
        if (i3 > 9) {
            str2 = str3 + i3;
        } else {
            str2 = str3 + "0" + i3;
        }
        this.f5802a.setText(str2);
        this.f5802a.setVisibility(0);
    }

    /* renamed from: b */
    private void m7165b(View view) {
        if (view != this.f5802a) {
            int i = 0;
            view.setVisibility(0);
            if (view instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i < viewGroup.getChildCount()) {
                        m7165b(viewGroup.getChildAt(i));
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17130a() {
        this.f5802a.setVisibility(8);
    }
}
