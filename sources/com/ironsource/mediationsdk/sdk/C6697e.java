package com.ironsource.mediationsdk.sdk;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.sdk.e */
public final class C6697e {

    /* renamed from: a */
    private static C6697e f17489a;

    /* renamed from: b */
    private JSONObject f17490b = new JSONObject();

    private C6697e() {
    }

    /* renamed from: a */
    public static synchronized C6697e m20344a() {
        C6697e eVar;
        synchronized (C6697e.class) {
            if (f17489a == null) {
                f17489a = new C6697e();
            }
            eVar = f17489a;
        }
        return eVar;
    }

    /* renamed from: a */
    public final synchronized String mo36912a(String str) {
        return this.f17490b.optString(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000c, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36913a(java.lang.String r2, java.lang.Object r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            org.json.JSONObject r0 = r1.f17490b     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            monitor-exit(r1)
            return
        L_0x0008:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x000b:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.sdk.C6697e.mo36913a(java.lang.String, java.lang.Object):void");
    }

    /* renamed from: a */
    public final synchronized void mo36914a(Map<String, Object> map) {
        if (map != null) {
            for (String next : map.keySet()) {
                mo36913a(next, map.get(next));
            }
        }
    }

    /* renamed from: b */
    public final synchronized JSONObject mo36915b() {
        return this.f17490b;
    }
}
