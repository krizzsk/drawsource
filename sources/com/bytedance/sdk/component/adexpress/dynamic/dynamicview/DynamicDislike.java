package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.adexpress.widget.DislikeView;

public class DynamicDislike extends DynamicBaseWidgetImp {
    public DynamicDislike(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5754o = new DislikeView(context);
        this.f5754o.setTag(3);
        addView(this.f5754o, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.f5754o);
    }

    /* renamed from: h */
    public boolean mo17171h() {
        super.mo17171h();
        int a = (int) C2572b.m6622a(this.f5750k, this.f5751l.mo17050q());
        if (!(this.f5754o instanceof DislikeView)) {
            return true;
        }
        ((DislikeView) this.f5754o).setRadius((int) C2572b.m6622a(this.f5750k, this.f5751l.mo17048o()));
        ((DislikeView) this.f5754o).setStrokeWidth(a);
        ((DislikeView) this.f5754o).setStrokeColor(this.f5751l.mo17049p());
        ((DislikeView) this.f5754o).setBgColor(this.f5751l.mo17056w());
        ((DislikeView) this.f5754o).setDislikeColor(this.f5751l.mo17040g());
        ((DislikeView) this.f5754o).setDislikeWidth((int) C2572b.m6622a(this.f5750k, 1.0f));
        return true;
    }
}
