package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;

public class DynamicSplitLineView extends DynamicBaseWidgetImp {
    public DynamicSplitLineView(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5754o = new View(context);
        addView(this.f5754o, getWidgetLayoutParams());
    }

    /* renamed from: h */
    public boolean mo17171h() {
        super.mo17171h();
        this.f5754o.setBackgroundColor(this.f5751l.mo17056w());
        return true;
    }
}
