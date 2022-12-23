package com.ogury.sdk.internal;

/* renamed from: com.ogury.sdk.internal.d */
/* compiled from: MonitoringInfoFetcher.kt */
public final class C10350d {

    /* renamed from: a */
    private final C10354f f25687a;

    static {
        new C10351a((byte) 0);
    }

    public C10350d(C10354f fVar) {
        C10363m.m30060b(fVar, "monitoringInfoHelper");
        this.f25687a = fVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0020 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074 A[LOOP:0: B:21:0x006e->B:23:0x0074, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0028 A[Catch:{ Exception -> 0x002d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ogury.sdk.internal.C10348b mo65201a() {
        /*
            r4 = this;
            com.ogury.sdk.internal.b r0 = new com.ogury.sdk.internal.b
            r0.<init>()
            com.ogury.sdk.internal.f r1 = r4.f25687a
            java.lang.String r1 = r1.mo65203a()
            java.lang.String r2 = "asset_key"
            r0.mo65190a(r2, r1)
            java.lang.String r1 = "device_os"
            java.lang.String r2 = "ANDROID"
            r0.mo65190a(r1, r2)
            java.lang.String r1 = "framework"
            java.lang.String r2 = com.ogury.sdk.internal.C10354f.m30045b()     // Catch:{ Exception -> 0x0020 }
            r0.mo65190a(r1, r2)     // Catch:{ Exception -> 0x0020 }
        L_0x0020:
            com.ogury.sdk.internal.f r1 = r4.f25687a     // Catch:{ Exception -> 0x002d }
            java.lang.String r1 = r1.mo65205d()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x002d
            java.lang.String r2 = "app_version"
            r0.mo65190a(r2, r1)     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            java.lang.String r1 = com.ogury.sdk.Ogury.getSdkVersion()
            java.lang.String r2 = "sdk_version"
            r0.mo65190a(r2, r1)
            java.lang.String r1 = "ads_version"
            java.lang.String r2 = com.ogury.p377ed.internal.InternalAds.getVersion()     // Catch:{ Exception | NoClassDefFoundError -> 0x0044 }
            java.lang.String r3 = "InternalAds.getVersion()"
            com.ogury.sdk.internal.C10363m.m30058a((java.lang.Object) r2, (java.lang.String) r3)     // Catch:{ Exception | NoClassDefFoundError -> 0x0044 }
            r0.mo65190a(r1, r2)     // Catch:{ Exception | NoClassDefFoundError -> 0x0044 }
        L_0x0044:
            java.lang.String r1 = "cm_version"
            java.lang.String r2 = com.ogury.p376cm.internal.InternalCM.getVersion()     // Catch:{ Exception | NoClassDefFoundError -> 0x0052 }
            java.lang.String r3 = "InternalCM.getVersion()"
            com.ogury.sdk.internal.C10363m.m30058a((java.lang.Object) r2, (java.lang.String) r3)     // Catch:{ Exception | NoClassDefFoundError -> 0x0052 }
            r0.mo65190a(r1, r2)     // Catch:{ Exception | NoClassDefFoundError -> 0x0052 }
        L_0x0052:
            java.lang.String r1 = "core_version"
            java.lang.String r2 = com.ogury.core.internal.InternalCore.getVersion()     // Catch:{ Exception | NoClassDefFoundError -> 0x0060 }
            java.lang.String r3 = "InternalCore.getVersion()"
            com.ogury.sdk.internal.C10363m.m30058a((java.lang.Object) r2, (java.lang.String) r3)     // Catch:{ Exception | NoClassDefFoundError -> 0x0060 }
            r0.mo65190a(r1, r2)     // Catch:{ Exception | NoClassDefFoundError -> 0x0060 }
        L_0x0060:
            com.ogury.sdk.internal.f r1 = r4.f25687a
            java.util.Map r1 = r1.mo65206e()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x006e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x008a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r0.mo65190a(r3, r2)
            goto L_0x006e
        L_0x008a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.sdk.internal.C10350d.mo65201a():com.ogury.sdk.internal.b");
    }

    /* renamed from: com.ogury.sdk.internal.d$a */
    /* compiled from: MonitoringInfoFetcher.kt */
    public static final class C10351a {
        private C10351a() {
        }

        public /* synthetic */ C10351a(byte b) {
            this();
        }
    }
}
