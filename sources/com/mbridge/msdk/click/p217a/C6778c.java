package com.mbridge.msdk.click.p217a;

import com.mbridge.msdk.foundation.same.p300a.C8472c;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* renamed from: com.mbridge.msdk.click.a.c */
/* compiled from: WaitRetryLruMemoryCache */
public final class C6778c implements C8472c<String, C6777b> {

    /* renamed from: a */
    private final LinkedHashMap<String, C6777b> f17884a;

    /* renamed from: b */
    private final int f17885b;

    /* renamed from: c */
    private int f17886c;

    public C6778c(int i) {
        if (i > 0) {
            this.f17885b = i;
            this.f17884a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public final C6777b mo37079b(String str) {
        if (str != null) {
            synchronized (this) {
                C6777b bVar = this.f17884a.get(str);
                if (bVar != null) {
                    return bVar;
                }
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: a */
    public final boolean mo37077a(String str, C6777b bVar) {
        if (str == null || bVar == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f17886c++;
            if (((C6777b) this.f17884a.put(str, bVar)) != null) {
                this.f17886c--;
            }
        }
        m20633a(this.f17885b);
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0049 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20633a(int r3) {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            int r0 = r2.f17886c     // Catch:{ all -> 0x006c }
            if (r0 < 0) goto L_0x004d
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f17884a     // Catch:{ all -> 0x006c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0011
            int r0 = r2.f17886c     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x004d
        L_0x0011:
            int r0 = r2.f17886c     // Catch:{ all -> 0x006c }
            if (r0 <= r3) goto L_0x004b
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f17884a     // Catch:{ all -> 0x006c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x001e
            goto L_0x004b
        L_0x001e:
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f17884a     // Catch:{ all -> 0x006c }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x006c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x006c }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x0032
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            goto L_0x004c
        L_0x0032:
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x006c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x006c }
            com.mbridge.msdk.click.a.b r0 = (com.mbridge.msdk.click.p217a.C6777b) r0     // Catch:{ all -> 0x006c }
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f17884a     // Catch:{ all -> 0x0049 }
            r0.remove(r1)     // Catch:{ all -> 0x0049 }
            int r0 = r2.f17886c     // Catch:{ all -> 0x0049 }
            int r0 = r0 + -1
            r2.f17886c = r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            goto L_0x0000
        L_0x004b:
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
        L_0x004c:
            return
        L_0x004d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            r0.<init>()     // Catch:{ all -> 0x006c }
            java.lang.Class r1 = r2.getClass()     // Catch:{ all -> 0x006c }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x006c }
            r0.append(r1)     // Catch:{ all -> 0x006c }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x006c }
            r3.<init>(r0)     // Catch:{ all -> 0x006c }
            throw r3     // Catch:{ all -> 0x006c }
        L_0x006c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.p217a.C6778c.m20633a(int):void");
    }

    /* renamed from: b */
    public final void mo37076a(String str) {
        if (str != null) {
            synchronized (this) {
                if (((C6777b) this.f17884a.remove(str)) != null) {
                    this.f17886c--;
                }
            }
            return;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: a */
    public final Collection<String> mo37075a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f17884a.keySet());
        }
        return hashSet;
    }

    /* renamed from: b */
    public final void mo37080b() {
        m20633a(-1);
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", new Object[]{Integer.valueOf(this.f17885b)});
    }
}
