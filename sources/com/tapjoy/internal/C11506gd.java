package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.tapjoy.internal.gd */
public final class C11506gd {

    /* renamed from: b */
    private static final C11506gd f27621b;

    /* renamed from: c */
    private static C11506gd f27622c;

    /* renamed from: a */
    public final C11503gb f27623a = new C11503gb();

    /* renamed from: d */
    private Context f27624d;

    static {
        C11506gd gdVar = new C11506gd();
        f27621b = gdVar;
        f27622c = gdVar;
    }

    /* renamed from: a */
    public static C11506gd m31492a() {
        return f27622c;
    }

    /* renamed from: b */
    public static C11503gb m31493b() {
        return f27622c.f27623a;
    }

    C11506gd() {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0030 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo70038a(android.content.Context r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L_0x0050
            android.content.Context r0 = r3.f27624d     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0050
            r3.f27624d = r4     // Catch:{ all -> 0x004d }
            android.content.SharedPreferences r4 = r3.mo70039c()     // Catch:{ all -> 0x004d }
            android.content.SharedPreferences r0 = r3.mo70039c()     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "configurations"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x003d
            com.tapjoy.internal.bh r0 = com.tapjoy.internal.C11296bh.m30911b(r0)     // Catch:{ Exception -> 0x0030 }
            java.util.Map r1 = r0.mo69714d()     // Catch:{ all -> 0x002b }
            r0.close()     // Catch:{ Exception -> 0x0030 }
            com.tapjoy.internal.gb r0 = r3.f27623a     // Catch:{ Exception -> 0x0030 }
            r0.mo70034a((java.util.Map) r1)     // Catch:{ Exception -> 0x0030 }
            goto L_0x003d
        L_0x002b:
            r1 = move-exception
            r0.close()     // Catch:{ Exception -> 0x0030 }
            throw r1     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "configurations"
            android.content.SharedPreferences$Editor r4 = r4.remove(r0)     // Catch:{ all -> 0x004d }
            r4.apply()     // Catch:{ all -> 0x004d }
        L_0x003d:
            com.tapjoy.internal.gd$1 r4 = new com.tapjoy.internal.gd$1     // Catch:{ all -> 0x004d }
            r4.<init>()     // Catch:{ all -> 0x004d }
            com.tapjoy.internal.gb r0 = r3.f27623a     // Catch:{ all -> 0x004d }
            r0.addObserver(r4)     // Catch:{ all -> 0x004d }
            com.tapjoy.internal.gb r0 = r3.f27623a     // Catch:{ all -> 0x004d }
            r4.update(r0, r2)     // Catch:{ all -> 0x004d }
            goto L_0x0050
        L_0x004d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0050:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11506gd.mo70038a(android.content.Context):void");
    }

    /* renamed from: c */
    public final SharedPreferences mo70039c() {
        return this.f27624d.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
    }
}
