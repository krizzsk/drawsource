package com.bytedance.sdk.component.p118e.p122d;

/* renamed from: com.bytedance.sdk.component.e.d.b */
/* compiled from: Logger */
public class C2863b {

    /* renamed from: a */
    private C2865a f6445a;

    /* renamed from: b */
    private C2866b f6446b;

    /* renamed from: com.bytedance.sdk.component.e.d.b$a */
    /* compiled from: Logger */
    public enum C2865a {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* renamed from: com.bytedance.sdk.component.e.d.b$b */
    /* compiled from: Logger */
    public interface C2866b {
        /* renamed from: a */
        void mo17767a(String str, String str2);

        /* renamed from: b */
        void mo17768b(String str, String str2);
    }

    /* renamed from: com.bytedance.sdk.component.e.d.b$c */
    /* compiled from: Logger */
    private static class C2867c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C2863b f6452a = new C2863b();
    }

    private C2863b() {
        this.f6445a = C2865a.OFF;
        this.f6446b = new C2862a();
    }

    /* renamed from: a */
    public static void m7992a(C2865a aVar) {
        synchronized (C2863b.class) {
            C2867c.f6452a.f6445a = aVar;
        }
    }

    /* renamed from: a */
    public static void m7993a(String str, String str2) {
        if (C2867c.f6452a.f6445a.compareTo(C2865a.ERROR) <= 0) {
            C2867c.f6452a.f6446b.mo17767a(str, str2);
        }
    }

    /* renamed from: b */
    public static void m7994b(String str, String str2) {
        if (C2867c.f6452a.f6445a.compareTo(C2865a.DEBUG) <= 0) {
            C2867c.f6452a.f6446b.mo17768b(str, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'I';
        r1 = '`';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x0026;
            case 56: goto L_0x0026;
            case 57: goto L_0x000f;
            default: goto L_0x000e;
        };
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b1659536876590dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 74
            r1 = 55
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0000;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0026;
                case 95: goto L_0x000f;
                case 96: goto L_0x000f;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x0026;
                case 56: goto L_0x0026;
                case 57: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0026
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 73
            r1 = 96
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p118e.p122d.C2863b.b1659536876590dc(java.lang.String):java.lang.String");
    }
}
