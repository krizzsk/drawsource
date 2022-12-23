package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.C2581a;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.utils.C2914t;

public class DynamicMutedView extends DynamicBaseWidgetImp implements C2581a {
    /* renamed from: e */
    public boolean mo17152e() {
        return true;
    }

    public DynamicMutedView(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5754o = new ImageView(context);
        this.f5754o.setTag(5);
        addView(this.f5754o, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
    }

    /* renamed from: h */
    public boolean mo17171h() {
        super.mo17171h();
        ((ImageView) this.f5754o).setScaleType(ImageView.ScaleType.CENTER);
        setSoundMute(this.f5753n.f5775b);
        GradientDrawable gradientDrawable = (GradientDrawable) C2914t.m8156c(getContext(), "tt_ad_skip_btn_bg");
        gradientDrawable.setCornerRadius((float) (this.f5747h / 2));
        gradientDrawable.setColor(this.f5751l.mo17056w());
        ((ImageView) this.f5754o).setBackgroundDrawable(gradientDrawable);
        return true;
    }

    public void setSoundMute(boolean z) {
        int i;
        if (z) {
            i = C2914t.m8157d(getContext(), "tt_mute");
        } else {
            i = C2914t.m8157d(getContext(), "tt_unmute");
        }
        ((ImageView) this.f5754o).setImageResource(i);
    }
}
