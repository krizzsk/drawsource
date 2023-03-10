package com.mbridge.msdk.foundation.same.p300a;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.a.b */
/* compiled from: LruReplaceTempCache */
public final class C8471b implements C8472c<String, JSONObject> {

    /* renamed from: a */
    private final LinkedHashMap<String, JSONObject> f20769a;

    /* renamed from: b */
    private final int f20770b;

    /* renamed from: c */
    private int f20771c;

    /* renamed from: a */
    public final /* synthetic */ void mo37076a(Object obj) {
        String str = (String) obj;
        if (str != null) {
            synchronized (this) {
                if (((JSONObject) this.f20769a.remove(str)) != null) {
                    this.f20771c--;
                }
            }
            return;
        }
        throw new NullPointerException("key == null");
    }

    public C8471b(int i) {
        if (i > 0) {
            this.f20770b = i;
            this.f20769a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public final JSONObject mo37079b(String str) {
        JSONObject jSONObject;
        if (str != null) {
            synchronized (this) {
                jSONObject = this.f20769a.get(str);
            }
            return jSONObject;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: a */
    public final boolean mo37077a(String str, JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f20771c++;
            if (((JSONObject) this.f20769a.put(str, jSONObject)) != null) {
                this.f20771c--;
            }
        }
        m24264a(this.f20770b);
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24264a(int r3) {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            int r0 = r2.f20771c     // Catch:{ all -> 0x006f }
            if (r0 < 0) goto L_0x0050
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f20769a     // Catch:{ all -> 0x006f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0011
            int r0 = r2.f20771c     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x0050
        L_0x0011:
            int r0 = r2.f20771c     // Catch:{ all -> 0x006f }
            if (r0 <= r3) goto L_0x004e
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f20769a     // Catch:{ all -> 0x006f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x001e
            goto L_0x004e
        L_0x001e:
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f20769a     // Catch:{ all -> 0x006f }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x006f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x006f }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x006f }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x0032
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            goto L_0x004f
        L_0x0032:
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x006f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x006f }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x006f }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x006f }
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f20769a     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.remove(r1)     // Catch:{ all -> 0x004c }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x004c }
            int r0 = r2.f20771c     // Catch:{ all -> 0x004c }
            int r0 = r0 + -1
            r2.f20771c = r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            goto L_0x0000
        L_0x004e:
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
        L_0x004f:
            return
        L_0x0050:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r0.<init>()     // Catch:{ all -> 0x006f }
            java.lang.Class r1 = r2.getClass()     // Catch:{ all -> 0x006f }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x006f }
            r0.append(r1)     // Catch:{ all -> 0x006f }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x006f }
            r3.<init>(r0)     // Catch:{ all -> 0x006f }
            throw r3     // Catch:{ all -> 0x006f }
        L_0x006f:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.p300a.C8471b.m24264a(int):void");
    }

    /* renamed from: a */
    public final Collection<String> mo37075a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f20769a.keySet());
        }
        return hashSet;
    }

    /* renamed from: b */
    public final void mo37080b() {
        m24264a(-1);
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", new Object[]{Integer.valueOf(this.f20770b)});
    }
}
