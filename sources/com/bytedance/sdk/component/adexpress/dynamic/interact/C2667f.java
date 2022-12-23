package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2617g;
import com.bytedance.sdk.component.adexpress.widget.PressButtonInteractView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.f */
/* compiled from: PressButtonInteract */
public class C2667f implements C2663b {

    /* renamed from: a */
    private PressButtonInteractView f5841a;

    public C2667f(Context context, DynamicBaseWidget dynamicBaseWidget, C2617g gVar) {
        this.f5841a = new PressButtonInteractView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicBaseWidget.getDynamicHeight(), dynamicBaseWidget.getDynamicHeight());
        layoutParams.gravity = 21;
        this.f5841a.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo17221a() {
        this.f5841a.mo17289a();
    }

    /* renamed from: b */
    public void mo17222b() {
        this.f5841a.mo17290b();
    }

    /* renamed from: c */
    public PressButtonInteractView mo17224d() {
        return this.f5841a;
    }
}
