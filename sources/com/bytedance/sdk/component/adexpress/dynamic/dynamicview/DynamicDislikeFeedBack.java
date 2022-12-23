package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.utils.C2914t;

public class DynamicDislikeFeedBack extends DynamicBaseWidgetImp {
    public DynamicDislikeFeedBack(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5754o = new TextView(context);
        this.f5754o.setTag(3);
        addView(this.f5754o, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.f5754o);
    }

    /* renamed from: h */
    public boolean mo17171h() {
        super.mo17171h();
        ((TextView) this.f5754o).setText(getText());
        if (Build.VERSION.SDK_INT >= 17) {
            this.f5754o.setTextAlignment(this.f5751l.mo17041h());
        }
        ((TextView) this.f5754o).setTextColor(this.f5751l.mo17040g());
        ((TextView) this.f5754o).setTextSize(this.f5751l.mo17038e());
        if (Build.VERSION.SDK_INT >= 16) {
            this.f5754o.setBackground(getBackgroundDrawable());
        }
        if (!this.f5751l.mo17053t()) {
            ((TextView) this.f5754o).setMaxLines(1);
            ((TextView) this.f5754o).setGravity(17);
            ((TextView) this.f5754o).setEllipsize(TextUtils.TruncateAt.END);
        } else {
            int u = this.f5751l.mo17054u();
            if (u > 0) {
                ((TextView) this.f5754o).setLines(u);
                ((TextView) this.f5754o).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        this.f5754o.setPadding((int) C2572b.m6622a(C2570c.m6618a(), (float) this.f5751l.mo17036c()), (int) C2572b.m6622a(C2570c.m6618a(), (float) this.f5751l.mo17035b()), (int) C2572b.m6622a(C2570c.m6618a(), (float) this.f5751l.mo17037d()), (int) C2572b.m6622a(C2570c.m6618a(), (float) this.f5751l.mo17032a()));
        ((TextView) this.f5754o).setGravity(17);
        return true;
    }

    public String getText() {
        return C2914t.m8151a(C2570c.m6618a(), "tt_reward_feedback");
    }
}
