package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2617g;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.adexpress.widget.SlideRightView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.i */
/* compiled from: SlideRightInteract */
public class C2671i implements C2663b {

    /* renamed from: a */
    private SlideRightView f5850a;

    /* renamed from: b */
    private Context f5851b;

    /* renamed from: c */
    private DynamicBaseWidget f5852c;

    /* renamed from: d */
    private C2617g f5853d;

    /* renamed from: b */
    public void mo17222b() {
    }

    public C2671i(Context context, DynamicBaseWidget dynamicBaseWidget, C2617g gVar) {
        this.f5851b = context;
        this.f5852c = dynamicBaseWidget;
        this.f5853d = gVar;
        m7210c();
    }

    /* renamed from: c */
    private void m7210c() {
        this.f5850a = new SlideRightView(this.f5851b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2572b.m6622a(this.f5851b, 120.0f), (int) C2572b.m6622a(this.f5851b, 120.0f));
        layoutParams.gravity = 17;
        this.f5850a.setLayoutParams(layoutParams);
        this.f5850a.setClipChildren(false);
        this.f5850a.setGuideText(this.f5853d.mo17029I());
    }

    /* renamed from: a */
    public void mo17221a() {
        this.f5850a.mo17337a();
    }

    /* renamed from: d */
    public ViewGroup mo17224d() {
        return this.f5850a;
    }
}
