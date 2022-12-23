package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.ei */
public enum C11395ei {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);
    

    /* renamed from: e */
    final int f27206e;

    private C11395ei(int i) {
        this.f27206e = i;
    }

    /* renamed from: com.tapjoy.internal.ei$1 */
    static /* synthetic */ class C113961 {

        /* renamed from: a */
        static final /* synthetic */ int[] f27207a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tapjoy.internal.ei[] r0 = com.tapjoy.internal.C11395ei.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27207a = r0
                com.tapjoy.internal.ei r1 = com.tapjoy.internal.C11395ei.VARINT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27207a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tapjoy.internal.ei r1 = com.tapjoy.internal.C11395ei.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27207a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tapjoy.internal.ei r1 = com.tapjoy.internal.C11395ei.FIXED64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27207a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tapjoy.internal.ei r1 = com.tapjoy.internal.C11395ei.LENGTH_DELIMITED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11395ei.C113961.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final C11400el<?> mo69845a() {
        int i = C113961.f27207a[ordinal()];
        if (i == 1) {
            return C11400el.f27221j;
        }
        if (i == 2) {
            return C11400el.f27218g;
        }
        if (i == 3) {
            return C11400el.f27223l;
        }
        if (i == 4) {
            return C11400el.f27228q;
        }
        throw new AssertionError();
    }
}
