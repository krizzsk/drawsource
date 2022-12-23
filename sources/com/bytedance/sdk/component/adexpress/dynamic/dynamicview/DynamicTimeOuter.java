package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.C2609b;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;

public class DynamicTimeOuter extends DynamicButton implements C2609b {
    public DynamicTimeOuter(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(hVar.mo17082i().mo16876b())) {
            dynamicRootView.setTimedown(this.f5747h);
        }
    }

    /* renamed from: h */
    public boolean mo17171h() {
        super.mo17171h();
        if ("timedown".equals(this.f5752m.mo17082i().mo16876b())) {
            ((TextView) this.f5754o).setText(String.valueOf((int) Double.parseDouble(this.f5751l.mo17043j())));
            return true;
        }
        ((TextView) this.f5754o).setText(((int) Double.parseDouble(this.f5751l.mo17043j())) + "s");
        return true;
    }

    /* renamed from: f */
    public void mo17153f() {
        if (TextUtils.equals("skip-with-countdowns-video-countdown", this.f5752m.mo17082i().mo16876b()) || TextUtils.equals("skip-with-time-countdown", this.f5752m.mo17082i().mo16876b())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f5746g, this.f5747h);
            layoutParams.gravity = 19;
            setLayoutParams(layoutParams);
            return;
        }
        super.mo17153f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.f5754o).getText())) {
            setMeasuredDimension(0, this.f5747h);
        }
    }

    /* renamed from: a */
    public void mo16832a(CharSequence charSequence, boolean z, int i) {
        if ("timedown".equals(this.f5752m.mo17082i().mo16876b())) {
            ((TextView) this.f5754o).setText(charSequence);
            return;
        }
        ((TextView) this.f5754o).setText(charSequence + "s");
    }
}
