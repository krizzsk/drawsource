package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.AnimationButton;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;

public class DynamicButton extends DynamicBaseWidgetImp {
    public DynamicButton(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5754o = new AnimationButton(context);
        this.f5754o.setTag(Integer.valueOf(getClickArea()));
        addView(this.f5754o, getWidgetLayoutParams());
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (C2570c.m6619b() && "fillButton".equals(this.f5752m.mo17082i().mo16876b())) {
            ((TextView) this.f5754o).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView) this.f5754o).setMaxLines(1);
        }
        return super.getWidgetLayoutParams();
    }

    /* renamed from: h */
    public boolean mo17171h() {
        super.mo17171h();
        if (!TextUtils.equals("download-progress-button", this.f5752m.mo17082i().mo16876b()) || !TextUtils.isEmpty(this.f5751l.mo17043j())) {
            if (Build.VERSION.SDK_INT >= 17) {
                this.f5754o.setTextAlignment(this.f5751l.mo17041h());
            }
            ((TextView) this.f5754o).setText(this.f5751l.mo17043j());
            ((TextView) this.f5754o).setTextColor(this.f5751l.mo17040g());
            ((TextView) this.f5754o).setTextSize(this.f5751l.mo17038e());
            ((TextView) this.f5754o).setGravity(17);
            ((TextView) this.f5754o).setIncludeFontPadding(false);
            if ("fillButton".equals(this.f5752m.mo17082i().mo16876b())) {
                this.f5754o.setPadding(0, 0, 0, 0);
            } else {
                this.f5754o.setPadding(this.f5751l.mo17036c(), this.f5751l.mo17035b(), this.f5751l.mo17037d(), this.f5751l.mo17032a());
            }
            return true;
        }
        this.f5754o.setVisibility(4);
        return true;
    }
}
