package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.adexpress.widget.TTRatingBar2;

public class DynamicStarView extends DynamicBaseWidgetImp {

    /* renamed from: a */
    private int f5796a = 0;

    /* renamed from: b */
    private int f5797b = 0;

    public DynamicStarView(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5754o = new TTRatingBar2(context, (AttributeSet) null);
        this.f5754o.setTag(Integer.valueOf(getClickArea()));
        addView(this.f5754o, getWidgetLayoutParams());
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        this.f5747h = (int) (((float) this.f5747h) + C2572b.m6622a(this.f5750k, (float) (this.f5751l.mo17035b() + this.f5751l.mo17032a())));
        int a = (int) ((C2572b.m6622a(C2570c.m6618a(), this.f5751l.mo17038e()) * 5.0f) + C2572b.m6622a(C2570c.m6618a(), ((float) this.f5751l.mo17036c()) + C2572b.m6622a(C2570c.m6618a(), (float) this.f5751l.mo17037d())));
        if (this.f5746g > a && 4 == this.f5751l.mo17041h()) {
            this.f5796a = (this.f5746g - a) / 2;
        }
        this.f5797b = (int) C2572b.m6622a(this.f5750k, (float) this.f5751l.mo17035b());
        this.f5746g = a;
        return new FrameLayout.LayoutParams(this.f5746g, this.f5747h);
    }

    /* renamed from: f */
    public void mo17153f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f5746g, this.f5747h);
        layoutParams.topMargin = this.f5749j + this.f5797b;
        layoutParams.leftMargin = this.f5748i + this.f5796a;
        setLayoutParams(layoutParams);
    }

    /* renamed from: h */
    public boolean mo17171h() {
        super.mo17171h();
        double m = this.f5751l.mo17046m();
        if (!C2570c.m6619b() || (m >= 0.0d && m <= 5.0d && (this.f5753n == null || this.f5753n.getRenderRequest() == null || this.f5753n.getRenderRequest().mo16681k() == 4))) {
            if (m < 0.0d || m > 5.0d) {
                m = 5.0d;
            }
            this.f5754o.setVisibility(0);
            ((TTRatingBar2) this.f5754o).mo17361a(m, this.f5751l.mo17040g(), (int) this.f5751l.mo17038e());
            return true;
        }
        this.f5754o.setVisibility(8);
        return true;
    }
}
