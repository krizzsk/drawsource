package com.bytedance.sdk.component.adexpress.dynamic.animation.p097a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2610a;
import com.bytedance.sdk.component.utils.C2914t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.i */
/* compiled from: ShineAnimation */
public class C2603i extends C2592d {
    public C2603i(View view, C2610a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo16801a() {
        this.f5527c.setTag(C2914t.m8158e(this.f5527c.getContext(), "tt_id_shine_width"), Integer.valueOf(this.f5526b.mo16842c()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f5527c, "shineValue", new float[]{0.0f, 1.0f}).setDuration((long) ((int) (this.f5526b.mo16860i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo16805a(duration));
        return arrayList;
    }
}
