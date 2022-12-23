package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.utils.C2914t;

public class DynamicLogoUnion extends DynamicBaseWidgetImp {
    public DynamicLogoUnion(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5754o = new ImageView(context);
        this.f5754o.setTag(Integer.valueOf(getClickArea()));
        if (C2570c.m6619b()) {
            this.f5747h = Math.max(dynamicRootView.getLogoUnionHeight(), this.f5747h);
        }
        addView(this.f5754o, getWidgetLayoutParams());
    }

    /* renamed from: h */
    public boolean mo17171h() {
        super.mo17171h();
        if (C2570c.m6619b()) {
            ((ImageView) this.f5754o).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.f5754o).setImageResource(C2914t.m8157d(getContext(), "tt_ad_logo_reward_full"));
        } else {
            ((ImageView) this.f5754o).setImageResource(C2914t.m8157d(getContext(), "tt_ad_logo"));
        }
        ((ImageView) this.f5754o).setColorFilter(this.f5751l.mo17040g());
        return true;
    }
}
