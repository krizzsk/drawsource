package com.applovin.impl.sdk;

import android.content.Context;
import com.applovin.impl.sdk.p051c.C1869d;
import com.applovin.impl.sdk.p051c.C1870e;

/* renamed from: com.applovin.impl.sdk.j */
public class C1954j {

    /* renamed from: a */
    private static final C1955a f3645a = new C1955a("Age Restricted User", C1869d.f3380l);

    /* renamed from: b */
    private static final C1955a f3646b = new C1955a("Has User Consent", C1869d.f3379k);

    /* renamed from: c */
    private static final C1955a f3647c = new C1955a("\"Do Not Sell\"", C1869d.f3381m);

    /* renamed from: com.applovin.impl.sdk.j$a */
    public static class C1955a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f3648a;

        /* renamed from: b */
        private final C1869d<Boolean> f3649b;

        C1955a(String str, C1869d<Boolean> dVar) {
            this.f3648a = str;
            this.f3649b = dVar;
        }

        /* renamed from: a */
        public Boolean mo14489a(Context context) {
            if (context != null) {
                return (Boolean) C1870e.m4103b(this.f3649b, null, context);
            }
            if (C2102v.m5104a()) {
                C2102v.m5110i("AppLovinSdk", "Failed to get value for key: " + this.f3649b);
            }
            return null;
        }

        /* renamed from: a */
        public String mo14490a() {
            return this.f3648a;
        }

        /* renamed from: b */
        public String mo14491b(Context context) {
            Boolean a = mo14489a(context);
            return a != null ? a.toString() : "No value set";
        }
    }

    /* renamed from: a */
    public static C1955a m4418a() {
        return f3645a;
    }

    /* renamed from: a */
    public static String m4419a(Context context) {
        return m4420a(f3645a, context) + m4420a(f3646b, context) + m4420a(f3647c, context);
    }

    /* renamed from: a */
    private static String m4420a(C1955a aVar, Context context) {
        return "\n" + aVar.f3648a + " - " + aVar.mo14491b(context);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.applovin.impl.sdk.c.d, java.lang.Object, com.applovin.impl.sdk.c.d<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m4421a(com.applovin.impl.sdk.p051c.C1869d<java.lang.Boolean> r2, java.lang.Boolean r3, android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0020
            boolean r3 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r3 == 0) goto L_0x001f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to update compliance value for key: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "AppLovinSdk"
            com.applovin.impl.sdk.C2102v.m5110i(r3, r2)
        L_0x001f:
            return r0
        L_0x0020:
            r1 = 0
            java.lang.Object r1 = com.applovin.impl.sdk.p051c.C1870e.m4103b(r2, r1, (android.content.Context) r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            com.applovin.impl.sdk.p051c.C1870e.m4101a(r2, r3, (android.content.Context) r4)
            r2 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 == r3) goto L_0x0030
            r0 = r2
        L_0x0030:
            return r0
        L_0x0031:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1954j.m4421a(com.applovin.impl.sdk.c.d, java.lang.Boolean, android.content.Context):boolean");
    }

    /* renamed from: a */
    public static boolean m4422a(boolean z, Context context) {
        return m4421a(C1869d.f3380l, Boolean.valueOf(z), context);
    }

    /* renamed from: b */
    public static C1955a m4423b() {
        return f3646b;
    }

    /* renamed from: b */
    public static boolean m4424b(boolean z, Context context) {
        return m4421a(C1869d.f3379k, Boolean.valueOf(z), context);
    }

    /* renamed from: c */
    public static C1955a m4425c() {
        return f3647c;
    }

    /* renamed from: c */
    public static boolean m4426c(boolean z, Context context) {
        return m4421a(C1869d.f3381m, Boolean.valueOf(z), context);
    }
}
