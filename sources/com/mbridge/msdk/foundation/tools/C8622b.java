package com.mbridge.msdk.foundation.tools;

/* renamed from: com.mbridge.msdk.foundation.tools.b */
/* compiled from: Container */
final class C8622b {

    /* renamed from: com.mbridge.msdk.foundation.tools.b$b */
    /* compiled from: Container */
    static abstract class C8624b {

        /* renamed from: a */
        int f21129a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract byte mo58123a();

        C8624b() {
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$c */
    /* compiled from: Container */
    static class C8625c extends C8624b {

        /* renamed from: b */
        boolean f21130b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte mo58123a() {
            return 1;
        }

        C8625c(int i, boolean z) {
            this.f21129a = i;
            this.f21130b = z;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$f */
    /* compiled from: Container */
    static class C8628f extends C8624b {

        /* renamed from: b */
        int f21133b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte mo58123a() {
            return 2;
        }

        C8628f(int i, int i2) {
            this.f21129a = i;
            this.f21133b = i2;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$e */
    /* compiled from: Container */
    static class C8627e extends C8624b {

        /* renamed from: b */
        float f21132b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte mo58123a() {
            return 3;
        }

        C8627e(int i, float f) {
            this.f21129a = i;
            this.f21132b = f;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$g */
    /* compiled from: Container */
    static class C8629g extends C8624b {

        /* renamed from: b */
        long f21134b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte mo58123a() {
            return 4;
        }

        C8629g(int i, long j) {
            this.f21129a = i;
            this.f21134b = j;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$d */
    /* compiled from: Container */
    static class C8626d extends C8624b {

        /* renamed from: b */
        double f21131b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte mo58123a() {
            return 5;
        }

        C8626d(int i, double d) {
            this.f21129a = i;
            this.f21131b = d;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$j */
    /* compiled from: Container */
    static abstract class C8632j extends C8624b {

        /* renamed from: b */
        Object f21135b;

        /* renamed from: c */
        int f21136c;

        /* renamed from: d */
        int f21137d;

        /* renamed from: e */
        boolean f21138e;

        C8632j(int i, int i2, Object obj, int i3, boolean z) {
            this.f21136c = i;
            this.f21129a = i2;
            this.f21135b = obj;
            this.f21137d = i3;
            this.f21138e = z;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$i */
    /* compiled from: Container */
    static class C8631i extends C8632j {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte mo58123a() {
            return 6;
        }

        C8631i(int i, int i2, String str, int i3, boolean z) {
            super(i, i2, str, i3, z);
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$a */
    /* compiled from: Container */
    static class C8623a extends C8632j {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte mo58123a() {
            return 7;
        }

        C8623a(int i, int i2, Object obj, int i3, boolean z) {
            super(i, i2, obj, i3, z);
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$h */
    /* compiled from: Container */
    static class C8630h extends C8632j {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte mo58123a() {
            return 8;
        }

        C8630h(int i, int i2, Object obj, int i3, boolean z) {
            super(i, i2, obj, i3, z);
        }
    }
}
