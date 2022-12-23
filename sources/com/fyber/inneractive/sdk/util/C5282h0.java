package com.fyber.inneractive.sdk.util;

/* renamed from: com.fyber.inneractive.sdk.util.h0 */
public class C5282h0 {

    /* renamed from: a */
    public transient C5283a[] f13995a;

    /* renamed from: b */
    public transient int f13996b;

    /* renamed from: c */
    public int f13997c;

    /* renamed from: com.fyber.inneractive.sdk.util.h0$a */
    public static class C5283a {

        /* renamed from: a */
        public int f13998a;

        /* renamed from: b */
        public Object f13999b;

        /* renamed from: c */
        public C5283a f14000c;

        public C5283a(int i, int i2, Object obj, C5283a aVar) {
            this.f13998a = i;
            this.f13999b = obj;
            this.f14000c = aVar;
        }
    }

    public C5282h0() {
        this(20, 0.75f);
    }

    public C5282h0(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        } else if (f > 0.0f) {
            i = i == 0 ? 1 : i;
            this.f13995a = new C5283a[i];
            this.f13997c = (int) (((float) i) * f);
        } else {
            throw new IllegalArgumentException("Illegal Load: " + f);
        }
    }
}
