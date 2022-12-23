package com.bytedance.sdk.component.adexpress.dynamic.animation.p097a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2610a;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.k */
/* compiled from: TranslateAnimation */
public class C2605k extends C2592d {
    public C2605k(View view, C2610a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo16801a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f5527c, "translationX", new float[]{C2572b.m6622a(C2570c.m6618a(), (float) this.f5526b.mo16850e()), 0.0f}).setDuration((long) ((int) (this.f5526b.mo16860i() * 1000.0d)));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f5527c, "translationY", new float[]{C2572b.m6622a(C2570c.m6618a(), (float) this.f5526b.mo16854f()), 0.0f}).setDuration((long) ((int) (this.f5526b.mo16860i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo16805a(duration));
        arrayList.add(mo16805a(duration2));
        return arrayList;
    }
}
