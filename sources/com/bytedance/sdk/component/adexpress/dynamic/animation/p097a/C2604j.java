package com.bytedance.sdk.component.adexpress.dynamic.animation.p097a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2610a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.j */
/* compiled from: SwingAnimation */
public class C2604j extends C2592d {
    public C2604j(View view, C2610a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo16801a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f5527c, "rotation", new float[]{0.0f, (float) this.f5526b.mo16846d(), 0.0f, (float) this.f5526b.mo16846d(), 0.0f}).setDuration((long) ((int) (this.f5526b.mo16860i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo16805a(duration));
        return arrayList;
    }
}
