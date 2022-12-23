package com.bykv.p054vk.openvk.component.video.p055a.p059b;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2414b;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2301b;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a.C2290b;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a.C2292c;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2305b;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2306c;
import com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a;
import com.bytedance.sdk.component.p123f.C2885g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.d */
/* compiled from: Preloader */
public class C2315d {

    /* renamed from: e */
    private static volatile C2315d f4654e;

    /* renamed from: a */
    private volatile int f4655a = 163840;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final SparseArray<Map<String, C2301b>> f4656b = new SparseArray<>(2);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2323b<Runnable> f4657c;

    /* renamed from: d */
    private final ExecutorService f4658d;

    /* renamed from: f */
    private volatile C2306c f4659f;

    /* renamed from: g */
    private volatile C2292c f4660g;

    /* renamed from: h */
    private volatile C2290b f4661h;

    /* renamed from: i */
    private final HashSet<C2322a> f4662i = new HashSet<>();

    /* renamed from: j */
    private final C2301b.C2303b f4663j = new C2301b.C2303b() {
        /* renamed from: a */
        public void mo15727a(C2301b bVar) {
            int f = bVar.mo15687f();
            synchronized (C2315d.this.f4656b) {
                Map map = (Map) C2315d.this.f4656b.get(f);
                if (map != null) {
                    map.remove(bVar.f4591h);
                }
            }
            if (C2325e.f4685c) {
                Log.d("TAG_PROXY_Preloader", "afterExecute, key: " + bVar.f4591h);
            }
        }
    };

    /* renamed from: k */
    private volatile C2310c f4664k;

    /* renamed from: l */
    private volatile C2310c f4665l;

    /* renamed from: m */
    private volatile String f4666m;

    /* renamed from: n */
    private volatile boolean f4667n;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15740a(C2292c cVar) {
        this.f4660g = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15741a(C2306c cVar) {
        this.f4659f = cVar;
    }

    /* renamed from: a */
    public void mo15738a(int i) {
        if (i > 0) {
            this.f4655a = i;
        }
        if (C2325e.f4685c) {
            Log.i("TAG_PROXY_Preloader", "MaxPreloadSize: " + i);
        }
    }

    private C2315d() {
        C2323b<Runnable> bVar = new C2323b<>();
        this.f4657c = bVar;
        ExecutorService a = m5306a(bVar);
        this.f4658d = a;
        this.f4657c.mo15756a((ThreadPoolExecutor) a);
        this.f4656b.put(0, new HashMap());
        this.f4656b.put(1, new HashMap());
    }

    /* renamed from: a */
    public synchronized void mo15739a(long j, long j2, long j3) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2310c mo15737a() {
        return this.f4664k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2310c mo15747b() {
        return this.f4665l;
    }

    /* renamed from: c */
    public static C2315d m5308c() {
        if (f4654e == null) {
            synchronized (C2315d.class) {
                if (f4654e == null) {
                    f4654e = new C2315d();
                }
            }
        }
        return f4654e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.bykv.vk.openvk.component.video.a.b.b} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.HashSet] */
    /* JADX WARNING: type inference failed for: r0v15, types: [java.util.HashSet] */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v29 */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15743a(boolean r8, java.lang.String r9) {
        /*
            r7 = this;
            r7.f4666m = r9
            r7.f4667n = r8
            boolean r0 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setCurrentPlayKey, "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r0, r1)
        L_0x001e:
            r0 = 0
            if (r9 != 0) goto L_0x007b
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r1 = r7.f4662i
            monitor-enter(r1)
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r8 = r7.f4662i     // Catch:{ all -> 0x0078 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0078 }
            if (r8 != 0) goto L_0x0038
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0078 }
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r8 = r7.f4662i     // Catch:{ all -> 0x0078 }
            r0.<init>(r8)     // Catch:{ all -> 0x0078 }
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r8 = r7.f4662i     // Catch:{ all -> 0x0078 }
            r8.clear()     // Catch:{ all -> 0x0078 }
        L_0x0038:
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0141
            java.util.Iterator r8 = r0.iterator()
        L_0x003f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0141
            java.lang.Object r9 = r8.next()
            com.bykv.vk.openvk.component.video.a.b.d$a r9 = (com.bykv.p054vk.openvk.component.video.p055a.p059b.C2315d.C2322a) r9
            boolean r1 = r9.f4676a
            boolean r2 = r9.f4677b
            int r3 = r9.f4678c
            java.lang.String r4 = r9.f4679d
            java.util.Map<java.lang.String, java.lang.String> r5 = r9.f4680e
            java.lang.String[] r6 = r9.f4681f
            r0 = r7
            r0.mo15744a(r1, r2, r3, r4, r5, r6)
            boolean r0 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setCurrentPlayKey, resume preload: "
            r1.append(r2)
            java.lang.String r9 = r9.f4679d
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.i(r0, r9)
            goto L_0x003f
        L_0x0078:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            throw r8
        L_0x007b:
            int r1 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4690h
            r2 = 3
            if (r1 == r2) goto L_0x00aa
            r3 = 2
            if (r1 != r3) goto L_0x0084
            goto L_0x00aa
        L_0x0084:
            r2 = 1
            if (r1 != r2) goto L_0x0141
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r1 = r7.f4656b
            monitor-enter(r1)
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r2 = r7.f4656b     // Catch:{ all -> 0x00a7 }
            int r8 = com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2305b.m5294a(r8)     // Catch:{ all -> 0x00a7 }
            java.lang.Object r8 = r2.get(r8)     // Catch:{ all -> 0x00a7 }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x00a7 }
            if (r8 == 0) goto L_0x009f
            java.lang.Object r8 = r8.remove(r9)     // Catch:{ all -> 0x00a7 }
            r0 = r8
            com.bykv.vk.openvk.component.video.a.b.b r0 = (com.bykv.p054vk.openvk.component.video.p055a.p059b.C2301b) r0     // Catch:{ all -> 0x00a7 }
        L_0x009f:
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0141
            r0.mo15680a()
            goto L_0x0141
        L_0x00a7:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            throw r8
        L_0x00aa:
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r8 = r7.f4656b
            monitor-enter(r8)
            r9 = 0
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r3 = r7.f4656b     // Catch:{ all -> 0x0142 }
            int r3 = r3.size()     // Catch:{ all -> 0x0142 }
        L_0x00b4:
            if (r9 >= r3) goto L_0x00e2
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r4 = r7.f4656b     // Catch:{ all -> 0x0142 }
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r5 = r7.f4656b     // Catch:{ all -> 0x0142 }
            int r5 = r5.keyAt(r9)     // Catch:{ all -> 0x0142 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0142 }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x0142 }
            if (r4 == 0) goto L_0x00df
            java.util.Collection r5 = r4.values()     // Catch:{ all -> 0x0142 }
            if (r5 == 0) goto L_0x00dc
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0142 }
            if (r6 != 0) goto L_0x00dc
            if (r0 != 0) goto L_0x00d9
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0142 }
            r0.<init>()     // Catch:{ all -> 0x0142 }
        L_0x00d9:
            r0.addAll(r5)     // Catch:{ all -> 0x0142 }
        L_0x00dc:
            r4.clear()     // Catch:{ all -> 0x0142 }
        L_0x00df:
            int r9 = r9 + 1
            goto L_0x00b4
        L_0x00e2:
            monitor-exit(r8)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x0141
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L_0x0141
            java.util.Iterator r8 = r0.iterator()
        L_0x00ef:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x011b
            java.lang.Object r9 = r8.next()
            com.bykv.vk.openvk.component.video.a.b.b r9 = (com.bykv.p054vk.openvk.component.video.p055a.p059b.C2301b) r9
            r9.mo15680a()
            boolean r3 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c
            if (r3 == 0) goto L_0x00ef
            java.lang.String r3 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "setCurrentPlayKey, cancel preload: "
            r4.append(r5)
            java.lang.String r9 = r9.f4590g
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            android.util.Log.i(r3, r9)
            goto L_0x00ef
        L_0x011b:
            if (r1 != r2) goto L_0x0141
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r8 = r7.f4662i
            monitor-enter(r8)
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x013e }
        L_0x0124:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x013c
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x013e }
            com.bykv.vk.openvk.component.video.a.b.b r0 = (com.bykv.p054vk.openvk.component.video.p055a.p059b.C2301b) r0     // Catch:{ all -> 0x013e }
            java.lang.Object r0 = r0.f4622n     // Catch:{ all -> 0x013e }
            com.bykv.vk.openvk.component.video.a.b.d$a r0 = (com.bykv.p054vk.openvk.component.video.p055a.p059b.C2315d.C2322a) r0     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0124
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r1 = r7.f4662i     // Catch:{ all -> 0x013e }
            r1.add(r0)     // Catch:{ all -> 0x013e }
            goto L_0x0124
        L_0x013c:
            monitor-exit(r8)     // Catch:{ all -> 0x013e }
            goto L_0x0141
        L_0x013e:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x013e }
            throw r9
        L_0x0141:
            return
        L_0x0142:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0142 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p054vk.openvk.component.video.p055a.p059b.C2315d.mo15743a(boolean, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo15745a(boolean z, boolean z2, int i, String str, String... strArr) {
        mo15744a(z, z2, i, str, (Map<String, String>) null, strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0106, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0128, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0155, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15744a(boolean r19, boolean r20, int r21, java.lang.String r22, java.util.Map<java.lang.String, java.lang.String> r23, java.lang.String... r24) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r9 = r22
            r10 = r24
            boolean r2 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = "TAG_PROXY_Preloader"
            java.lang.String r3 = "preload start ！！！！"
            android.util.Log.d(r2, r3)
        L_0x0013:
            if (r0 == 0) goto L_0x0018
            com.bykv.vk.openvk.component.video.a.b.a.b r2 = r1.f4661h
            goto L_0x001a
        L_0x0018:
            com.bykv.vk.openvk.component.video.a.b.a.c r2 = r1.f4660g
        L_0x001a:
            r11 = r2
            com.bykv.vk.openvk.component.video.a.b.b.c r12 = r1.f4659f
            if (r11 == 0) goto L_0x01d3
            if (r12 != 0) goto L_0x0023
            goto L_0x01d3
        L_0x0023:
            boolean r2 = android.text.TextUtils.isEmpty(r22)
            if (r2 != 0) goto L_0x01d2
            if (r10 == 0) goto L_0x01d2
            int r2 = r10.length
            if (r2 > 0) goto L_0x0030
            goto L_0x01d2
        L_0x0030:
            if (r21 > 0) goto L_0x0036
            int r2 = r1.f4655a
            r13 = r2
            goto L_0x0038
        L_0x0036:
            r13 = r21
        L_0x0038:
            if (r20 == 0) goto L_0x003c
            r14 = r9
            goto L_0x0041
        L_0x003c:
            java.lang.String r2 = com.bykv.p054vk.openvk.component.video.api.p074f.C2414b.m5821a((java.lang.String) r22)
            r14 = r2
        L_0x0041:
            java.io.File r2 = r11.mo15693d(r14)
            if (r2 == 0) goto L_0x0077
            long r3 = r2.length()
            long r5 = (long) r13
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0077
            boolean r0 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "no need preload, file size: "
            r3.append(r4)
            long r4 = r2.length()
            r3.append(r4)
            java.lang.String r2 = ", need preload size: "
            r3.append(r2)
            r3.append(r13)
            java.lang.String r2 = r3.toString()
            android.util.Log.i(r0, r2)
        L_0x0076:
            return
        L_0x0077:
            com.bykv.vk.openvk.component.video.a.b.f r2 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2334f.m5358a()
            int r3 = com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2305b.m5294a(r19)
            boolean r2 = r2.mo15774a((int) r3, (java.lang.String) r14)
            if (r2 == 0) goto L_0x00a0
            boolean r0 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "has running proxy task, skip preload for key: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r0, r2)
        L_0x009f:
            return
        L_0x00a0:
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r15 = r1.f4656b
            monitor-enter(r15)
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r2 = r1.f4656b     // Catch:{ all -> 0x01cf }
            r16 = 0
            r8 = 1
            if (r0 == 0) goto L_0x00ac
            r3 = r8
            goto L_0x00ae
        L_0x00ac:
            r3 = r16
        L_0x00ae:
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x01cf }
            r7 = r2
            java.util.Map r7 = (java.util.Map) r7     // Catch:{ all -> 0x01cf }
            boolean r2 = r7.containsKey(r14)     // Catch:{ all -> 0x01cf }
            if (r2 == 0) goto L_0x00bd
            monitor-exit(r15)     // Catch:{ all -> 0x01cf }
            return
        L_0x00bd:
            com.bykv.vk.openvk.component.video.a.b.d$a r6 = new com.bykv.vk.openvk.component.video.a.b.d$a     // Catch:{ all -> 0x01cf }
            r2 = r6
            r3 = r19
            r4 = r20
            r5 = r13
            r10 = r6
            r6 = r22
            r17 = r7
            r7 = r23
            r21 = r13
            r13 = r8
            r8 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01cf }
            java.lang.String r2 = r1.f4666m     // Catch:{ all -> 0x01cf }
            if (r2 == 0) goto L_0x0156
            int r3 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4690h     // Catch:{ all -> 0x01cf }
            r4 = 3
            if (r3 != r4) goto L_0x010a
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r2 = r1.f4662i     // Catch:{ all -> 0x01cf }
            monitor-enter(r2)     // Catch:{ all -> 0x01cf }
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r0 = r1.f4662i     // Catch:{ all -> 0x0107 }
            r0.add(r10)     // Catch:{ all -> 0x0107 }
            monitor-exit(r2)     // Catch:{ all -> 0x0107 }
            boolean r0 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x0105
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cf }
            r2.<init>()     // Catch:{ all -> 0x01cf }
            java.lang.String r3 = "cancel preload: "
            r2.append(r3)     // Catch:{ all -> 0x01cf }
            r2.append(r9)     // Catch:{ all -> 0x01cf }
            java.lang.String r3 = ", add to pending queue"
            r2.append(r3)     // Catch:{ all -> 0x01cf }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01cf }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x01cf }
        L_0x0105:
            monitor-exit(r15)     // Catch:{ all -> 0x01cf }
            return
        L_0x0107:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0107 }
            throw r0     // Catch:{ all -> 0x01cf }
        L_0x010a:
            r4 = 2
            if (r3 != r4) goto L_0x0129
            boolean r0 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cf }
            r2.<init>()     // Catch:{ all -> 0x01cf }
            java.lang.String r3 = "cancel preload: "
            r2.append(r3)     // Catch:{ all -> 0x01cf }
            r2.append(r9)     // Catch:{ all -> 0x01cf }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01cf }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x01cf }
        L_0x0127:
            monitor-exit(r15)     // Catch:{ all -> 0x01cf }
            return
        L_0x0129:
            if (r3 != r13) goto L_0x0156
            boolean r3 = r1.f4667n     // Catch:{ all -> 0x01cf }
            if (r3 != r0) goto L_0x0156
            boolean r0 = r2.equals(r14)     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x0156
            boolean r0 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x0154
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cf }
            r2.<init>()     // Catch:{ all -> 0x01cf }
            java.lang.String r3 = "cancel preload: "
            r2.append(r3)     // Catch:{ all -> 0x01cf }
            r2.append(r9)     // Catch:{ all -> 0x01cf }
            java.lang.String r3 = ", it is playing"
            r2.append(r3)     // Catch:{ all -> 0x01cf }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01cf }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x01cf }
        L_0x0154:
            monitor-exit(r15)     // Catch:{ all -> 0x01cf }
            return
        L_0x0156:
            r0 = 0
            java.util.List r2 = com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.m5448a((java.util.Map<java.lang.String, java.lang.String>) r23)     // Catch:{ all -> 0x01cf }
            java.util.List r2 = com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.m5447a((java.util.List<com.bykv.p054vk.openvk.component.video.p055a.p059b.C2352i.C2354b>) r2)     // Catch:{ all -> 0x01cf }
            if (r2 == 0) goto L_0x0189
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01cf }
            int r3 = r2.size()     // Catch:{ all -> 0x01cf }
            r0.<init>(r3)     // Catch:{ all -> 0x01cf }
            int r3 = r2.size()     // Catch:{ all -> 0x01cf }
            r4 = r16
        L_0x0170:
            if (r4 >= r3) goto L_0x0189
            java.lang.Object r5 = r2.get(r4)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.i$b r5 = (com.bykv.p054vk.openvk.component.video.p055a.p059b.C2352i.C2354b) r5     // Catch:{ all -> 0x01cf }
            if (r5 == 0) goto L_0x0186
            com.bykv.vk.openvk.component.video.a.b.i$b r6 = new com.bykv.vk.openvk.component.video.a.b.i$b     // Catch:{ all -> 0x01cf }
            java.lang.String r7 = r5.f4765a     // Catch:{ all -> 0x01cf }
            java.lang.String r5 = r5.f4766b     // Catch:{ all -> 0x01cf }
            r6.<init>(r7, r5)     // Catch:{ all -> 0x01cf }
            r0.add(r6)     // Catch:{ all -> 0x01cf }
        L_0x0186:
            int r4 = r4 + 1
            goto L_0x0170
        L_0x0189:
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = new com.bykv.vk.openvk.component.video.a.b.b$a     // Catch:{ all -> 0x01cf }
            r2.<init>()     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo15717a((com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a.C2289a) r11)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo15719a((com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2306c) r12)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo15723a((java.lang.String) r9)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo15726b(r14)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.l r3 = new com.bykv.vk.openvk.component.video.a.b.l     // Catch:{ all -> 0x01cf }
            java.util.List r4 = com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.m5449a((java.lang.String[]) r24)     // Catch:{ all -> 0x01cf }
            r3.<init>((java.util.List<java.lang.String>) r4)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo15721a((com.bykv.p054vk.openvk.component.video.p055a.p059b.C2359l) r3)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$a r0 = r2.mo15724a((java.util.List<com.bykv.p054vk.openvk.component.video.p055a.p059b.C2352i.C2354b>) r0)     // Catch:{ all -> 0x01cf }
            r2 = r21
            com.bykv.vk.openvk.component.video.a.b.b$a r0 = r0.mo15716a((int) r2)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$b r2 = r1.f4663j     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$a r0 = r0.mo15718a((com.bykv.p054vk.openvk.component.video.p055a.p059b.C2301b.C2303b) r2)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$a r0 = r0.mo15722a((java.lang.Object) r10)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b r0 = r0.mo15725a()     // Catch:{ all -> 0x01cf }
            r2 = r17
            r2.put(r14, r0)     // Catch:{ all -> 0x01cf }
            monitor-exit(r15)     // Catch:{ all -> 0x01cf }
            java.util.concurrent.ExecutorService r2 = r1.f4658d
            r2.execute(r0)
            return
        L_0x01cf:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x01cf }
            throw r0
        L_0x01d2:
            return
        L_0x01d3:
            boolean r0 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c
            if (r0 == 0) goto L_0x01de
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.String r2 = "cache or videoProxyDB null in Preloader!!!"
            android.util.Log.e(r0, r2)
        L_0x01de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p054vk.openvk.component.video.p055a.p059b.C2315d.mo15744a(boolean, boolean, int, java.lang.String, java.util.Map, java.lang.String[]):void");
    }

    /* renamed from: a */
    public void mo15742a(String str) {
        mo15746a(false, false, str);
    }

    /* renamed from: a */
    public void mo15746a(boolean z, boolean z2, String str) {
        if (!TextUtils.isEmpty(str)) {
            final boolean z3 = z;
            final boolean z4 = z2;
            final String str2 = str;
            C2361a.m5450a((C2885g) new C2885g("cancel b b S") {
                public void run() {
                    C2301b bVar;
                    synchronized (C2315d.this.f4656b) {
                        Map map = (Map) C2315d.this.f4656b.get(C2305b.m5294a(z3));
                        if (map != null) {
                            bVar = (C2301b) map.remove(z4 ? str2 : C2414b.m5821a(str2));
                        } else {
                            bVar = null;
                        }
                    }
                    if (bVar != null) {
                        bVar.mo15680a();
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public void mo15748d() {
        C2361a.m5450a((C2885g) new C2885g("cancelAll") {
            public void run() {
                ArrayList<C2301b> arrayList = new ArrayList<>();
                synchronized (C2315d.this.f4656b) {
                    int size = C2315d.this.f4656b.size();
                    for (int i = 0; i < size; i++) {
                        Map map = (Map) C2315d.this.f4656b.get(C2315d.this.f4656b.keyAt(i));
                        if (map != null) {
                            arrayList.addAll(map.values());
                            map.clear();
                        }
                    }
                    C2315d.this.f4657c.clear();
                }
                for (C2301b bVar : arrayList) {
                    bVar.mo15680a();
                    if (C2325e.f4685c) {
                        Log.w("TAG_PROXY_Preloader", "PreloadTask: " + bVar + ", canceled!!!");
                    }
                }
            }
        });
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.d$a */
    /* compiled from: Preloader */
    private static final class C2322a {

        /* renamed from: a */
        final boolean f4676a;

        /* renamed from: b */
        final boolean f4677b;

        /* renamed from: c */
        final int f4678c;

        /* renamed from: d */
        final String f4679d;

        /* renamed from: e */
        final Map<String, String> f4680e;

        /* renamed from: f */
        final String[] f4681f;

        C2322a(boolean z, boolean z2, int i, String str, Map<String, String> map, String[] strArr) {
            this.f4676a = z;
            this.f4677b = z2;
            this.f4678c = i;
            this.f4679d = str;
            this.f4680e = map;
            this.f4681f = strArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2322a aVar = (C2322a) obj;
            if (this.f4676a == aVar.f4676a && this.f4677b == aVar.f4677b && this.f4678c == aVar.f4678c) {
                return this.f4679d.equals(aVar.f4679d);
            }
            return false;
        }

        public int hashCode() {
            return ((((((this.f4676a ? 1 : 0) * true) + (this.f4677b ? 1 : 0)) * 31) + this.f4678c) * 31) + this.f4679d.hashCode();
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.d$b */
    /* compiled from: Preloader */
    private static final class C2323b<T> extends LinkedBlockingDeque<T> {

        /* renamed from: a */
        private ThreadPoolExecutor f4682a;

        private C2323b() {
        }

        /* renamed from: a */
        public void mo15756a(ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this) {
                if (this.f4682a != null) {
                    throw new IllegalStateException("You can only call setExecutor() once!");
                } else if (threadPoolExecutor != null) {
                    this.f4682a = threadPoolExecutor;
                } else {
                    throw new NullPointerException("executor argument can't be null!");
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return offerFirst(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean offer(T r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.util.concurrent.ThreadPoolExecutor r0 = r3.f4682a     // Catch:{ all -> 0x002b }
                int r0 = r0.getPoolSize()     // Catch:{ all -> 0x002b }
                java.util.concurrent.ThreadPoolExecutor r1 = r3.f4682a     // Catch:{ all -> 0x002b }
                int r1 = r1.getActiveCount()     // Catch:{ all -> 0x002b }
                java.util.concurrent.ThreadPoolExecutor r2 = r3.f4682a     // Catch:{ all -> 0x002b }
                int r2 = r2.getMaximumPoolSize()     // Catch:{ all -> 0x002b }
                if (r1 < r0) goto L_0x0025
                if (r0 >= r2) goto L_0x0025
                boolean r4 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c     // Catch:{ all -> 0x002b }
                if (r4 == 0) goto L_0x0022
                java.lang.String r4 = "TAG_PROXY_TT"
                java.lang.String r0 = "create new preloader thread"
                android.util.Log.i(r4, r0)     // Catch:{ all -> 0x002b }
            L_0x0022:
                r4 = 0
                monitor-exit(r3)     // Catch:{ all -> 0x002b }
                return r4
            L_0x0025:
                monitor-exit(r3)     // Catch:{ all -> 0x002b }
                boolean r4 = r3.offerFirst(r4)
                return r4
            L_0x002b:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x002b }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bykv.p054vk.openvk.component.video.p055a.p059b.C2315d.C2323b.offer(java.lang.Object):boolean");
        }
    }

    /* renamed from: a */
    private static ExecutorService m5306a(final C2323b<Runnable> bVar) {
        int a = C2361a.m5439a();
        return new ThreadPoolExecutor(0, a < 1 ? 1 : a > 4 ? 4 : a, 60, TimeUnit.SECONDS, bVar, new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                C23201 r0 = new Thread(runnable) {
                    public void run() {
                        try {
                            Process.setThreadPriority(10);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        super.run();
                    }
                };
                r0.setName("tt_pangle_thread_video_preload_" + r0.getId());
                r0.setDaemon(true);
                if (C2325e.f4685c) {
                    Log.i("TAG_PROXY_Preloader", "new preload thead: " + r0.getName());
                }
                return r0;
            }
        }, new RejectedExecutionHandler() {
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                try {
                    bVar.offerFirst(runnable);
                    if (C2325e.f4685c) {
                        Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }
}
