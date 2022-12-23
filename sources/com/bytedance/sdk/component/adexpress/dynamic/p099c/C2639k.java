package com.bytedance.sdk.component.adexpress.dynamic.p099c;

import com.bytedance.sdk.component.adexpress.dynamic.p099c.C2621a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.k */
/* compiled from: FlexComputeRuler */
public class C2639k {
    /* renamed from: a */
    public static float m7074a(float f) {
        return (float) Math.ceil((double) ((f * 16.0f) / 16.0f));
    }

    /* renamed from: a */
    public static List<C2621a.C2622a> m7075a(float f, List<C2621a.C2622a> list) {
        ArrayList<C2621a.C2622a> arrayList = new ArrayList<>();
        for (C2621a.C2622a clone : list) {
            arrayList.add((C2621a.C2622a) clone.clone());
        }
        boolean z = true;
        int i = 0;
        int i2 = 0;
        for (C2621a.C2622a aVar : arrayList) {
            if (aVar.f5689b) {
                i = (int) (((float) i) + aVar.f5688a);
            } else {
                i2 = (int) (((float) i2) + aVar.f5688a);
                z = false;
            }
        }
        if (z && f > ((float) i)) {
            return arrayList;
        }
        float f2 = (float) i;
        int i3 = (f > f2 ? 1 : (f == f2 ? 0 : -1));
        float f3 = i3 < 0 ? f / f2 : 1.0f;
        int i4 = (f > f2 ? 1 : (f == f2 ? 0 : -1));
        float f4 = i4 > 0 ? (f - f2) / ((float) i2) : 0.0f;
        if (f4 > 1.0f) {
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            for (C2621a.C2622a aVar2 : arrayList) {
                if (!aVar2.f5689b && aVar2.f5690c != 0.0f && aVar2.f5688a * f4 > aVar2.f5690c) {
                    aVar2.f5688a = aVar2.f5690c;
                    aVar2.f5689b = true;
                    z2 = true;
                }
                arrayList2.add(aVar2);
            }
            if (z2) {
                return m7075a(f, arrayList2);
            }
        }
        int i5 = 0;
        for (C2621a.C2622a aVar3 : arrayList) {
            if (aVar3.f5689b) {
                aVar3.f5688a = m7074a(aVar3.f5688a * f3);
            } else {
                aVar3.f5688a = m7074a(aVar3.f5688a * f4);
            }
            i5 = (int) (((float) i5) + aVar3.f5688a);
        }
        float f5 = (float) i5;
        if (f5 < f) {
            float f6 = f - f5;
            for (int i6 = 0; i6 < arrayList.size() && f6 > 0.0f; i6 = (i6 + 1) % arrayList.size()) {
                C2621a.C2622a aVar4 = (C2621a.C2622a) arrayList.get(i6);
                if ((i3 < 0 && aVar4.f5689b) || (i4 > 0 && !aVar4.f5689b)) {
                    aVar4.f5688a += 0.0625f;
                    f6 -= 0.0625f;
                }
            }
        }
        return arrayList;
    }
}
