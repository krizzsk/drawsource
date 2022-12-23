package com.bytedance.sdk.component.adexpress.dynamic.p098b;

import java.util.Arrays;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.i */
/* compiled from: DynamicPoint */
public class C2619i {

    /* renamed from: a */
    public float f5682a;

    /* renamed from: b */
    public float f5683b;

    public C2619i(float f, float f2) {
        this.f5682a = f;
        this.f5683b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2619i iVar = (C2619i) obj;
        if (Float.compare(iVar.f5682a, this.f5682a) == 0 && Float.compare(iVar.f5683b, this.f5683b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5682a), Float.valueOf(this.f5683b)});
    }
}
