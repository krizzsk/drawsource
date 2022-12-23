package com.apm.insight.p025k;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.apm.insight.C1239g;
import com.apm.insight.Npth;
import com.apm.insight.entity.C1230c;
import com.apm.insight.p026l.C1321q;
import com.apm.insight.runtime.C1351a;
import com.apm.insight.runtime.C1389o;
import com.apm.insight.runtime.C1394p;
import com.apm.insight.runtime.C1403u;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;

/* renamed from: com.apm.insight.k.g */
public final class C1284g {

    /* renamed from: a */
    private static final ConcurrentHashMap<Object, ConcurrentLinkedQueue<C1230c>> f1281a = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final HashMap<Object, HashMap<String, ConcurrentLinkedQueue<C1230c>>> f1282b = new HashMap<>();

    /* renamed from: c */
    private static volatile C1284g f1283c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1403u f1284d = C1394p.m2321b();

    /* renamed from: e */
    private volatile boolean f1285e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Runnable f1286f = new Runnable() {
        public void run() {
            if (!Npth.isStopUpload()) {
                if (!C1284g.f1282b.isEmpty() && C1389o.m2307e()) {
                    C1284g.m1746f();
                }
                C1284g.this.mo12562c();
                C1284g.this.f1284d.mo12750a(C1284g.this.f1286f, 30000);
            }
        }
    };

    private C1284g() {
    }

    /* renamed from: a */
    public static C1284g m1737a() {
        if (f1283c == null) {
            synchronized (C1284g.class) {
                if (f1283c == null) {
                    f1283c = new C1284g();
                }
            }
        }
        return f1283c;
    }

    /* renamed from: a */
    public static void m1739a(C1230c cVar) {
        m1740a(C1239g.m1549a(), cVar);
    }

    /* renamed from: a */
    public static void m1740a(final Object obj, final C1230c cVar) {
        Handler a = C1394p.m2321b().mo12747a();
        if (a == null || a.getLooper() != Looper.myLooper()) {
            C1394p.m2321b().mo12749a((Runnable) new Runnable() {
                public void run() {
                    C1284g.m1740a(obj, cVar);
                }
            });
            return;
        }
        if (obj == null) {
            obj = C1239g.m1549a();
        }
        if (!C1389o.m2307e()) {
            C1321q.m1929a("EventUploadQueue", (Object) "enqueue before init.");
            m1743c(obj, cVar);
            return;
        }
        if (!C1351a.m2097a(obj)) {
            C1266a.m1665b();
        }
        m1746f();
        String str = null;
        try {
            str = cVar.mo12488h().getString("log_type");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(str) || !C1351a.m2098a(obj, str)) {
            C1321q.m1929a("EventUploadQueue", (Object) "logType " + str + " not sampled");
            return;
        }
        C1321q.m1929a("EventUploadQueue", (Object) "logType " + str + " enqueued");
        m1742b(obj, cVar);
    }

    /* renamed from: b */
    private static void m1742b(Object obj, C1230c cVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        synchronized (obj) {
            concurrentLinkedQueue = f1281a.get(obj);
            if (concurrentLinkedQueue == null) {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                f1281a.put(obj, concurrentLinkedQueue);
            }
        }
        concurrentLinkedQueue.add(cVar);
        int size = f1281a.size();
        boolean z = size >= 30;
        C1321q.m1933b((Object) "[enqueue] size=" + size);
        if (z) {
            m1747g();
        }
    }

    /* renamed from: c */
    private static void m1743c(Object obj, C1230c cVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        try {
            String string = cVar.mo12488h().getString("log_type");
            synchronized (f1282b) {
                HashMap hashMap = f1282b.get(string);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    f1282b.put(obj, hashMap);
                }
                concurrentLinkedQueue = (ConcurrentLinkedQueue) hashMap.get(string);
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    hashMap.put(string, concurrentLinkedQueue);
                }
            }
            concurrentLinkedQueue.add(cVar);
            if (concurrentLinkedQueue.size() > 100) {
                concurrentLinkedQueue.poll();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m1746f() {
        HashMap hashMap;
        synchronized (f1282b) {
            hashMap = new HashMap(f1282b);
            f1282b.clear();
        }
        if (!C1351a.m2100b()) {
            C1321q.m1929a("EventUploadQueue", (Object) "ApmConfig not inited, clear cache.");
            return;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                String str = (String) entry2.getKey();
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) entry2.getValue();
                if (concurrentLinkedQueue == null || (C1351a.m2100b() && !C1351a.m2098a(entry.getKey(), str))) {
                    C1321q.m1929a("EventUploadQueue", (Object) "logType " + str + " not sampled");
                } else {
                    while (!concurrentLinkedQueue.isEmpty()) {
                        try {
                            C1230c cVar = (C1230c) concurrentLinkedQueue.poll();
                            if (cVar == null) {
                                break;
                            }
                            m1742b(entry.getKey(), cVar);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private static void m1747g() {
        if (C1389o.m2307e() && !Npth.isStopUpload()) {
            try {
                C1394p.m2321b().mo12749a((Runnable) new Runnable() {
                    public void run() {
                        C1284g.m1737a().mo12562c();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo12561b() {
        if (f1281a.isEmpty()) {
            this.f1284d.mo12750a(this.f1286f, 30000);
        } else {
            this.f1284d.mo12749a(this.f1286f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r1.hasNext() == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r2 = r1.next();
        r4 = (java.util.concurrent.ConcurrentLinkedQueue) r2.getValue();
        r2 = r2.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        r7.f1285e = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        r0 = new java.util.LinkedList();
        r1 = f1281a.entrySet().iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12562c() {
        /*
            r7 = this;
            com.apm.insight.runtime.u r0 = r7.f1284d
            monitor-enter(r0)
            boolean r1 = r7.f1285e     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            return
        L_0x0009:
            r1 = 1
            r7.f1285e = r1     // Catch:{ all -> 0x0080 }
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.util.concurrent.ConcurrentLinkedQueue<com.apm.insight.entity.c>> r1 = f1281a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x001c:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x007d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getValue()
            java.util.concurrent.ConcurrentLinkedQueue r4 = (java.util.concurrent.ConcurrentLinkedQueue) r4
            java.lang.Object r2 = r2.getKey()
        L_0x0033:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x001c
            r5 = r3
        L_0x003a:
            r6 = 30
            if (r5 >= r6) goto L_0x004f
            boolean r6 = r4.isEmpty()     // Catch:{ all -> 0x0078 }
            if (r6 == 0) goto L_0x0045
            goto L_0x004f
        L_0x0045:
            java.lang.Object r6 = r4.poll()     // Catch:{ all -> 0x0078 }
            r0.add(r6)     // Catch:{ all -> 0x0078 }
            int r5 = r5 + 1
            goto L_0x003a
        L_0x004f:
            boolean r5 = r0.isEmpty()     // Catch:{ all -> 0x0078 }
            if (r5 == 0) goto L_0x0056
            goto L_0x001c
        L_0x0056:
            com.apm.insight.runtime.a.f r5 = com.apm.insight.runtime.p027a.C1362f.m2195a()     // Catch:{ all -> 0x0078 }
            org.json.JSONArray r6 = com.apm.insight.entity.C1228b.m1502a((java.lang.Object) r2)     // Catch:{ all -> 0x0078 }
            com.apm.insight.entity.a r5 = r5.mo12702a((java.util.List<com.apm.insight.entity.C1227a>) r0, (org.json.JSONArray) r6)     // Catch:{ all -> 0x0078 }
            if (r5 == 0) goto L_0x0074
            java.lang.String r6 = "upload events"
            com.apm.insight.p026l.C1321q.m1927a((java.lang.Object) r6)     // Catch:{ all -> 0x0078 }
            com.apm.insight.k.d r6 = com.apm.insight.p025k.C1278d.m1705a()     // Catch:{ all -> 0x0078 }
            org.json.JSONObject r5 = r5.mo12488h()     // Catch:{ all -> 0x0078 }
            r6.mo12553a(r5)     // Catch:{ all -> 0x0078 }
        L_0x0074:
            r0.clear()     // Catch:{ all -> 0x0078 }
            goto L_0x0033
        L_0x0078:
            r5 = move-exception
            com.apm.insight.p026l.C1321q.m1934b((java.lang.Throwable) r5)
            goto L_0x0033
        L_0x007d:
            r7.f1285e = r3
            return
        L_0x0080:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p025k.C1284g.mo12562c():void");
    }
}
