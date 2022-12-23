package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2617g;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.adexpress.widget.HandLongPressView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.e */
/* compiled from: LongPressInteract */
public class C2666e implements C2663b {

    /* renamed from: a */
    private HandLongPressView f5840a;

    public C2666e(Context context, DynamicBaseWidget dynamicBaseWidget, C2617g gVar) {
        this.f5840a = new HandLongPressView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2572b.m6622a(context, 180.0f), (int) C2572b.m6622a(context, 180.0f));
        layoutParams.gravity = 17;
        this.f5840a.setLayoutParams(layoutParams);
        this.f5840a.setGuideText(gVar.mo17029I());
    }

    /* renamed from: a */
    public void mo17221a() {
        this.f5840a.mo17280a();
    }

    /* renamed from: b */
    public void mo17222b() {
        this.f5840a.mo17281b();
    }

    /* renamed from: d */
    public ViewGroup mo17224d() {
        return this.f5840a;
    }
}
