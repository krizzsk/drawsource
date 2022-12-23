package com.unity3d.services.core.properties;

import com.unity3d.services.core.properties.C12088d;

/* renamed from: com.unity3d.services.core.properties.b */
/* compiled from: InitializationStatusReader */
public class C12085b {

    /* renamed from: com.unity3d.services.core.properties.b$a */
    /* compiled from: InitializationStatusReader */
    static /* synthetic */ class C12086a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29474a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.unity3d.services.core.properties.d$a[] r0 = com.unity3d.services.core.properties.C12088d.C12089a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29474a = r0
                com.unity3d.services.core.properties.d$a r1 = com.unity3d.services.core.properties.C12088d.C12089a.NOT_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29474a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.properties.d$a r1 = com.unity3d.services.core.properties.C12088d.C12089a.INITIALIZING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29474a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.services.core.properties.d$a r1 = com.unity3d.services.core.properties.C12088d.C12089a.INITIALIZED_SUCCESSFULLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29474a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.unity3d.services.core.properties.d$a r1 = com.unity3d.services.core.properties.C12088d.C12089a.INITIALIZED_FAILED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.properties.C12085b.C12086a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public String mo71232a(C12088d.C12089a aVar) {
        int i = C12086a.f29474a[aVar.ordinal()];
        if (i == 1) {
            return "not_initialized";
        }
        if (i == 2) {
            return "initializing";
        }
        if (i == 3) {
            return "initialized_successfully";
        }
        if (i != 4) {
            return null;
        }
        return "initialized_failed";
    }
}
