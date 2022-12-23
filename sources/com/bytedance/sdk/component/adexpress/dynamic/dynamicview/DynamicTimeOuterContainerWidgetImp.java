package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.C2609b;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import java.util.Iterator;
import java.util.List;

public class DynamicTimeOuterContainerWidgetImp extends DynamicBaseWidgetImp implements C2609b {

    /* renamed from: a */
    int f5798a;

    /* renamed from: b */
    boolean f5799b;

    /* renamed from: s */
    private int f5800s = 0;

    public DynamicTimeOuterContainerWidgetImp(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        setTag(Integer.valueOf(getClickArea()));
        m7158a();
        dynamicRootView.setTimeOutListener(this);
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    /* renamed from: f */
    public void mo17153f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.f5799b) {
            layoutParams.leftMargin = this.f5748i;
        } else {
            layoutParams.leftMargin = this.f5748i + this.f5800s;
        }
        layoutParams.topMargin = this.f5749j;
        setLayoutParams(layoutParams);
    }

    /* renamed from: h */
    public boolean mo17171h() {
        super.mo17171h();
        setPadding((int) C2572b.m6622a(C2570c.m6618a(), (float) this.f5751l.mo17036c()), (int) C2572b.m6622a(C2570c.m6618a(), (float) this.f5751l.mo17035b()), (int) C2572b.m6622a(C2570c.m6618a(), (float) this.f5751l.mo17037d()), (int) C2572b.m6622a(C2570c.m6618a(), (float) this.f5751l.mo17032a()));
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5799b) {
            setMeasuredDimension(this.f5746g, this.f5747h);
        } else {
            setMeasuredDimension(this.f5798a, this.f5747h);
        }
    }

    /* renamed from: a */
    private void m7158a() {
        List<C2618h> j = this.f5752m.mo17083j();
        if (j != null && j.size() > 0) {
            Iterator<C2618h> it = j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2618h next = it.next();
                if (TextUtils.equals("skip-with-time-skip-btn", next.mo17082i().mo16876b())) {
                    this.f5798a = (int) (((float) this.f5746g) - C2572b.m6622a(this.f5750k, next.mo17079g()));
                    break;
                }
            }
            this.f5800s = this.f5746g - this.f5798a;
        }
    }

    /* renamed from: a */
    public void mo16832a(CharSequence charSequence, boolean z, int i) {
        if (z && this.f5799b != z) {
            this.f5799b = z;
            mo17153f();
        }
        this.f5799b = z;
    }
}
