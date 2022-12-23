package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.C2609b;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.utils.C2914t;

public class DynamicSkipCountDownBtn extends DynamicButton implements C2609b {

    /* renamed from: a */
    private int[] f5790a;

    /* renamed from: b */
    private int f5791b;

    /* renamed from: s */
    private int f5792s;

    public DynamicSkipCountDownBtn(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
    }

    /* renamed from: h */
    public boolean mo17171h() {
        super.mo17171h();
        ((TextView) this.f5754o).setText("");
        return true;
    }

    /* renamed from: f */
    public void mo17153f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f5746g, this.f5747h);
        layoutParams.gravity = 21;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.f5754o).getText())) {
            setMeasuredDimension(0, this.f5747h);
        } else {
            setMeasuredDimension(this.f5746g, this.f5747h);
        }
    }

    /* renamed from: a */
    public void mo16832a(CharSequence charSequence, boolean z, int i) {
        String a = C2914t.m8151a(C2570c.m6618a(), "tt_reward_screen_skip_tx");
        if (i == 0) {
            this.f5754o.setVisibility(0);
            ((TextView) this.f5754o).setText(" | " + a);
            this.f5754o.measure(-2, -2);
            this.f5790a = new int[]{this.f5754o.getMeasuredWidth() + 1, this.f5754o.getMeasuredHeight()};
            View view = this.f5754o;
            int[] iArr = this.f5790a;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.f5754o).setGravity(17);
            ((TextView) this.f5754o).setIncludeFontPadding(false);
            m7138a();
            this.f5754o.setPadding(this.f5751l.mo17036c(), this.f5791b, this.f5751l.mo17037d(), this.f5792s);
        }
        requestLayout();
    }

    /* renamed from: a */
    private void m7138a() {
        this.f5791b = ((this.f5747h - ((int) C2572b.m6622a(this.f5750k, this.f5751l.mo17038e()))) / 2) - this.f5751l.mo17032a();
        this.f5792s = 0;
    }
}
