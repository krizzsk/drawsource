package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2617g;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.adexpress.widget.PressInteractView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.g */
/* compiled from: PressInteract */
public class C2668g implements C2663b<PressInteractView> {

    /* renamed from: a */
    private PressInteractView f5842a;

    public C2668g(Context context, DynamicBaseWidget dynamicBaseWidget, C2617g gVar) {
        this.f5842a = new PressInteractView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2572b.m6622a(context, 180.0f), (int) C2572b.m6622a(context, 180.0f));
        layoutParams.gravity = 17;
        this.f5842a.setLayoutParams(layoutParams);
        this.f5842a.setGuideText(gVar.mo17029I());
    }

    /* renamed from: a */
    public void mo17221a() {
        this.f5842a.mo17296a();
    }

    /* renamed from: b */
    public void mo17222b() {
        this.f5842a.mo17297b();
    }

    /* renamed from: c */
    public PressInteractView mo17224d() {
        return this.f5842a;
    }
}
