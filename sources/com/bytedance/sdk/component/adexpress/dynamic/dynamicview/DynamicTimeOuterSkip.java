package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.C2609b;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.utils.C2914t;

public class DynamicTimeOuterSkip extends DynamicButton implements C2609b {

    /* renamed from: a */
    private boolean f5801a;

    public DynamicTimeOuterSkip(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            this.f5801a = dynamicRootView.getRenderRequest().mo16684n();
        }
    }

    /* renamed from: h */
    public boolean mo17171h() {
        super.mo17171h();
        if (!TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "skip-with-time-skip-btn")) {
            return true;
        }
        ((TextView) this.f5754o).setText("");
        return true;
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
        if (TextUtils.equals("skip-with-time-skip-btn", this.f5752m.mo17082i().mo16876b())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f5746g, this.f5747h);
            layoutParams.gravity = 21;
            setLayoutParams(layoutParams);
        } else {
            super.mo17153f();
        }
        if (!"skip-with-time-skip-btn".equals(this.f5752m.mo17082i().mo16876b()) && Build.VERSION.SDK_INT >= 17) {
            this.f5754o.setTextAlignment(1);
            ((TextView) this.f5754o).setGravity(17);
        }
        setVisibility(8);
    }

    /* renamed from: a */
    public void mo16832a(CharSequence charSequence, boolean z, int i) {
        String a = C2914t.m8151a(C2570c.m6618a(), "tt_reward_screen_skip_tx");
        if (z) {
            if ("skip-with-time-skip-btn".equals(this.f5752m.mo17082i().mo16876b())) {
                if (C2570c.m6619b() && this.f5801a) {
                    a = "X";
                }
                ((TextView) this.f5754o).setText(" | " + a);
            } else {
                ((TextView) this.f5754o).setText(a);
            }
            setVisibility(0);
        } else {
            setVisibility(8);
        }
        requestLayout();
    }
}
