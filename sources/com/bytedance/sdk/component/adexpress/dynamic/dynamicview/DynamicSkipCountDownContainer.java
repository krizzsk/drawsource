package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.C2609b;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import java.util.List;

public class DynamicSkipCountDownContainer extends DynamicBaseWidgetImp implements C2609b {

    /* renamed from: a */
    private int f5793a;

    /* renamed from: b */
    private int f5794b;

    /* renamed from: s */
    private int f5795s;

    public DynamicSkipCountDownContainer(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        m7142a();
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    /* renamed from: h */
    public boolean mo17171h() {
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(getBackgroundDrawable());
        }
        setPadding((int) C2572b.m6622a(C2570c.m6618a(), (float) this.f5751l.mo17036c()), (int) C2572b.m6622a(C2570c.m6618a(), (float) this.f5751l.mo17035b()), (int) C2572b.m6622a(C2570c.m6618a(), (float) this.f5751l.mo17037d()), (int) C2572b.m6622a(C2570c.m6618a(), (float) this.f5751l.mo17032a()));
        return true;
    }

    /* renamed from: f */
    public void mo17153f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f5748i;
        layoutParams.topMargin = this.f5749j;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5795s == 0) {
            setMeasuredDimension(this.f5794b, this.f5747h);
        } else {
            setMeasuredDimension(this.f5793a, this.f5747h);
        }
    }

    /* renamed from: a */
    public void mo16832a(CharSequence charSequence, boolean z, int i) {
        this.f5795s = i;
    }

    /* renamed from: a */
    private void m7142a() {
        List<C2618h> j = this.f5752m.mo17083j();
        if (j != null && j.size() > 0) {
            for (C2618h next : j) {
                if (next.mo17082i().mo16873a() == 21) {
                    this.f5793a = (int) (((float) this.f5746g) - C2572b.m6622a(this.f5750k, next.mo17079g()));
                }
                if (next.mo17082i().mo16873a() == 20) {
                    this.f5794b = (int) (((float) this.f5746g) - C2572b.m6622a(this.f5750k, next.mo17079g()));
                }
            }
        }
    }
}
