package com.ogury.sdk.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ogury.sdk.internal.b */
/* compiled from: MonitoringInfo.kt */
public final class C10348b {

    /* renamed from: a */
    private final Map<String, String> f25683a = new LinkedHashMap();

    /* renamed from: a */
    public final void mo65190a(String str, String str2) {
        if (str != null) {
            boolean z = true;
            if ((str.length() > 0) && str2 != null) {
                if (str2.length() <= 0) {
                    z = false;
                }
                if (z && !this.f25683a.containsKey(str)) {
                    this.f25683a.put(str, str2);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo65191a() {
        return this.f25683a.isEmpty();
    }

    /* renamed from: a */
    public final boolean mo65193a(String str) {
        C10363m.m30060b(str, "name");
        return this.f25683a.containsKey(str);
    }

    /* renamed from: b */
    public final String mo65194b(String str) {
        C10363m.m30060b(str, "name");
        return this.f25683a.get(str);
    }

    /* renamed from: b */
    public final Set<Map.Entry<String, String>> mo65195b() {
        return this.f25683a.entrySet();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!C10363m.m30059a((Object) getClass(), (Object) obj.getClass()))) {
            return false;
        }
        return C10363m.m30059a((Object) this.f25683a, (Object) ((C10348b) obj).f25683a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0014  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo65192a(com.ogury.sdk.internal.C10348b r5) {
        /*
            r4 = this;
            java.lang.String r0 = "other"
            com.ogury.sdk.internal.C10363m.m30060b(r5, r0)
            java.util.Set r5 = r5.mo65195b()
            java.util.Iterator r5 = r5.iterator()
        L_0x000d:
            boolean r0 = r5.hasNext()
            r1 = 1
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r4.mo65193a((java.lang.String) r2)
            if (r3 == 0) goto L_0x0037
            java.lang.String r2 = r4.mo65194b((java.lang.String) r2)
            boolean r0 = com.ogury.sdk.internal.C10363m.m30059a((java.lang.Object) r2, (java.lang.Object) r0)
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x000d
        L_0x0037:
            r5 = 0
            return r5
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.sdk.internal.C10348b.mo65192a(com.ogury.sdk.internal.b):boolean");
    }

    /* renamed from: b */
    public final void mo65196b(C10348b bVar) {
        C10363m.m30060b(bVar, "other");
        this.f25683a.putAll(bVar.f25683a);
    }

    /* renamed from: c */
    public final void mo65197c() {
        this.f25683a.clear();
    }

    public final int hashCode() {
        return this.f25683a.hashCode();
    }
}
