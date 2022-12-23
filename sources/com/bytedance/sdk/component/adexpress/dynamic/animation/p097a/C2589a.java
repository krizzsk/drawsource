package com.bytedance.sdk.component.adexpress.dynamic.animation.p097a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2610a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.a */
/* compiled from: AlphaAnimation */
public class C2589a extends C2592d {
    public C2589a(View view, C2610a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo16801a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f5527c, "alpha", new float[]{((float) this.f5526b.mo16868q()) / 100.0f, ((float) this.f5526b.mo16869r()) / 100.0f}).setDuration((long) ((int) (this.f5526b.mo16860i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo16805a(duration));
        return arrayList;
    }
}
