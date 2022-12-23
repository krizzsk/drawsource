package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.dynamic.p099c.C2640l;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.utils.C2914t;

public class DynamicLogoAd extends DynamicBaseWidgetImp {
    public DynamicLogoAd(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5754o = new TextView(context);
        this.f5754o.setTag(Integer.valueOf(getClickArea()));
        addView(this.f5754o, getWidgetLayoutParams());
    }

    /* renamed from: h */
    public boolean mo17171h() {
        super.mo17171h();
        if (Build.VERSION.SDK_INT >= 17) {
            this.f5754o.setTextAlignment(this.f5751l.mo17041h());
        }
        ((TextView) this.f5754o).setTextColor(this.f5751l.mo17040g());
        ((TextView) this.f5754o).setTextSize(this.f5751l.mo17038e());
        if (C2570c.m6619b()) {
            ((TextView) this.f5754o).setIncludeFontPadding(false);
            ((TextView) this.f5754o).setTextSize(Math.min(((float) ((C2572b.m6626b(C2570c.m6618a(), (float) this.f5747h) - this.f5751l.mo17035b()) - this.f5751l.mo17032a())) - 0.5f, this.f5751l.mo17038e()));
            ((TextView) this.f5754o).setText(C2914t.m8154b(getContext(), "tt_logo_en"));
            return true;
        } else if (!m7118a()) {
            ((TextView) this.f5754o).setText(C2914t.m8154b(getContext(), "tt_logo_cn"));
            return true;
        } else if (C2640l.m7086b()) {
            ((TextView) this.f5754o).setText(C2640l.m7080a());
            return true;
        } else {
            ((TextView) this.f5754o).setText(C2640l.m7081a(this.f5751l.f5665b));
            return true;
        }
    }

    /* renamed from: a */
    private boolean m7118a() {
        if (C2570c.m6619b()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.f5751l.f5665b) || !this.f5751l.f5665b.contains("adx:")) && !C2640l.m7086b()) {
            return false;
        }
        return true;
    }
}
