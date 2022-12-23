package com.bytedance.sdk.component.adexpress.dynamic.animation.p097a;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2610a;
import com.bytedance.sdk.component.utils.C2914t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.h */
/* compiled from: ScaleAnimation */
public class C2602h extends C2592d {
    public C2602h(View view, C2610a aVar) {
        super(view, aVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null && (viewGroup2 instanceof DynamicBaseWidget)) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
                ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
                if (viewGroup3 != null && (viewGroup3 instanceof DynamicBaseWidget)) {
                    viewGroup3.setClipChildren(false);
                    viewGroup3.setClipToPadding(false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo16801a() {
        this.f5527c.setTag(C2914t.m8158e(this.f5527c.getContext(), "tt_id_direction"), this.f5526b.mo16833a());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f5527c, "scaleX", new float[]{1.0f, (float) this.f5526b.mo16861j()}).setDuration((long) ((int) (this.f5526b.mo16860i() * 1000.0d)));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f5527c, "scaleY", new float[]{1.0f, (float) this.f5526b.mo16862k()}).setDuration((long) ((int) (this.f5526b.mo16860i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo16805a(duration));
        arrayList.add(mo16805a(duration2));
        return arrayList;
    }
}
