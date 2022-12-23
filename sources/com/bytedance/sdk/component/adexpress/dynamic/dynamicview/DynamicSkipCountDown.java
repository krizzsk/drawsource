package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.C2609b;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.utils.C2914t;

public class DynamicSkipCountDown extends DynamicButton implements C2609b {
    public DynamicSkipCountDown(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.f5754o).getText())) {
            setMeasuredDimension(0, this.f5747h);
        }
    }

    /* renamed from: f */
    public void mo17153f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f5746g, this.f5747h);
        layoutParams.leftMargin = this.f5748i;
        layoutParams.gravity = 16;
        setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo16832a(CharSequence charSequence, boolean z, int i) {
        if (i != 0) {
            String a = C2914t.m8151a(C2570c.m6618a(), "tt_reward_full_skip_count_down");
            ((TextView) this.f5754o).setText(" | " + String.format(a, new Object[]{Integer.valueOf(i)}));
        } else if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        requestLayout();
    }
}
