package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2617g;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.adexpress.widget.CircleLongPressView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.a */
/* compiled from: CircleLongPressInteract */
public class C2658a implements C2663b {

    /* renamed from: a */
    private CircleLongPressView f5819a;

    public C2658a(Context context, DynamicBaseWidget dynamicBaseWidget, C2617g gVar) {
        this.f5819a = new CircleLongPressView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2572b.m6622a(context, 180.0f), (int) C2572b.m6622a(context, 180.0f));
        layoutParams.gravity = 17;
        this.f5819a.setLayoutParams(layoutParams);
        this.f5819a.setGuideText(gVar.mo17029I());
    }

    /* renamed from: a */
    public void mo17221a() {
        this.f5819a.mo17254a();
    }

    /* renamed from: b */
    public void mo17222b() {
        this.f5819a.mo17255b();
    }

    /* renamed from: c */
    public CircleLongPressView mo17224d() {
        return this.f5819a;
    }
}
