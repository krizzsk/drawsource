package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;

public class DynamicRoot extends DynamicBaseWidgetImp {

    /* renamed from: a */
    public C2653a f5773a;

    public DynamicRoot(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
    }

    /* renamed from: h */
    public boolean mo17171h() {
        return super.mo17171h();
    }

    /* access modifiers changed from: protected */
    public GradientDrawable getDrawable() {
        C2653a aVar = new C2653a();
        this.f5773a = aVar;
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GradientDrawable mo17147a(GradientDrawable.Orientation orientation, int[] iArr) {
        C2653a aVar = new C2653a(orientation, iArr);
        this.f5773a = aVar;
        return aVar;
    }
}
