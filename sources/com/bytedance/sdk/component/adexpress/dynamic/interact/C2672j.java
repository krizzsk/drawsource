package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2617g;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.adexpress.widget.SlideUpView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.j */
/* compiled from: SlideUpInteract */
public class C2672j implements C2663b<SlideUpView> {

    /* renamed from: a */
    private SlideUpView f5854a;

    /* renamed from: b */
    private Context f5855b;

    /* renamed from: c */
    private DynamicBaseWidget f5856c;

    /* renamed from: d */
    private C2617g f5857d;

    public C2672j(Context context, DynamicBaseWidget dynamicBaseWidget, C2617g gVar) {
        this.f5855b = context;
        this.f5856c = dynamicBaseWidget;
        this.f5857d = gVar;
        m7214e();
    }

    /* renamed from: e */
    private void m7214e() {
        this.f5854a = new SlideUpView(this.f5855b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) C2572b.m6622a(this.f5855b, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) C2572b.m6622a(this.f5855b, 100.0f);
        this.f5854a.setLayoutParams(layoutParams);
        this.f5854a.setGuideText(this.f5857d.mo17029I());
    }

    /* renamed from: a */
    public void mo17221a() {
        this.f5854a.mo17344a();
    }

    /* renamed from: b */
    public void mo17222b() {
        this.f5854a.mo17346c();
    }

    /* renamed from: c */
    public SlideUpView mo17224d() {
        return this.f5854a;
    }
}
