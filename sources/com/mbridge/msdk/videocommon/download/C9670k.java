package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8616ad;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.p078c.C2456d;
import com.mbridge.msdk.videocommon.download.C9661h;
import com.mbridge.msdk.videocommon.listener.C9673a;
import com.mbridge.msdk.videocommon.p375d.C9638b;
import com.mbridge.msdk.videocommon.p375d.C9640c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: com.mbridge.msdk.videocommon.download.k */
/* compiled from: UnitCacheCtroller */
public final class C9670k {

    /* renamed from: a */
    C2456d f24076a = null;

    /* renamed from: b */
    C2456d f24077b = null;

    /* renamed from: c */
    private List<CampaignEx> f24078c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f24079d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C9673a f24080e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ConcurrentHashMap<String, C9673a> f24081f;

    /* renamed from: g */
    private C9646d f24082g = new C9646d() {
        /* renamed from: a */
        public final void mo63666a(long j, int i) {
            if (i == 5 || i == 4) {
                boolean unused = C9670k.this.f24079d = true;
                C9670k.this.mo63690a();
            }
            if (i == 2) {
                boolean unused2 = C9670k.this.f24079d = true;
            }
        }
    };

    /* renamed from: h */
    private CopyOnWriteArrayList<Map<String, C9641a>> f24083h = new CopyOnWriteArrayList<>();

    /* renamed from: i */
    private Context f24084i = C8388a.m23845e().mo56913g();

    /* renamed from: j */
    private ExecutorService f24085j;

    /* renamed from: k */
    private long f24086k = 3600;

    /* renamed from: l */
    private String f24087l;

    /* renamed from: m */
    private C9640c f24088m;

    /* renamed from: n */
    private int f24089n = 2;

    /* renamed from: o */
    private int f24090o = 1;

    public C9670k(Context context, List<CampaignEx> list, ExecutorService executorService, String str, int i) {
        List<CampaignEx> list2 = this.f24078c;
        if (!(list2 == null || list == null)) {
            list2.addAll(list);
        }
        this.f24085j = executorService;
        this.f24087l = str;
        this.f24090o = i;
        m27590b(this.f24078c);
    }

    public C9670k(Context context, CampaignEx campaignEx, ExecutorService executorService, String str, int i) {
        List<CampaignEx> list = this.f24078c;
        if (!(list == null || campaignEx == null)) {
            list.add(campaignEx);
        }
        this.f24085j = executorService;
        this.f24087l = str;
        this.f24090o = i;
        m27590b(this.f24078c);
    }

    /* renamed from: a */
    public final void mo63692a(C9673a aVar) {
        this.f24080e = aVar;
    }

    /* renamed from: a */
    public final void mo63693a(String str, C9673a aVar) {
        if (this.f24081f == null) {
            this.f24081f = new ConcurrentHashMap<>();
        }
        this.f24081f.put(str, aVar);
    }

    /* renamed from: a */
    public final void mo63694a(List<CampaignEx> list) {
        List<CampaignEx> list2 = this.f24078c;
        if (!(list2 == null || list == null)) {
            list2.addAll(list);
        }
        m27590b(this.f24078c);
    }

    /* renamed from: a */
    public final void mo63691a(CampaignEx campaignEx) {
        List<CampaignEx> list = this.f24078c;
        if (!(list == null || campaignEx == null)) {
            list.add(campaignEx);
        }
        m27590b(this.f24078c);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x01f1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27590b(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x0211
            int r0 = r13.size()
            if (r0 != 0) goto L_0x000a
            goto L_0x0211
        L_0x000a:
            r12.m27596e()
            r12.m27594d()
            int r0 = r12.f24090o
            r1 = 94
            r2 = 287(0x11f, float:4.02E-43)
            r3 = 1
            if (r0 == r3) goto L_0x00ee
            if (r0 == r2) goto L_0x009f
            r4 = 298(0x12a, float:4.18E-43)
            if (r0 == r4) goto L_0x0061
            if (r0 == r1) goto L_0x009f
            r4 = 95
            if (r0 == r4) goto L_0x0027
            goto L_0x0128
        L_0x0027:
            java.lang.String r0 = r12.f24087l     // Catch:{ Exception -> 0x0059 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0059 }
            if (r0 != 0) goto L_0x0128
            com.mbridge.msdk.c.b r0 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x0059 }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0059 }
            java.lang.String r4 = r4.mo56914h()     // Catch:{ Exception -> 0x0059 }
            java.lang.String r5 = r12.f24087l     // Catch:{ Exception -> 0x0059 }
            com.mbridge.msdk.c.d r0 = r0.mo16292e(r4, r5)     // Catch:{ Exception -> 0x0059 }
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = r12.f24087l     // Catch:{ Exception -> 0x0059 }
            com.mbridge.msdk.c.d r0 = com.mbridge.msdk.p078c.C2456d.m6071e(r0)     // Catch:{ Exception -> 0x0059 }
        L_0x0049:
            if (r0 == 0) goto L_0x0128
            long r4 = r0.mo16318h()     // Catch:{ Exception -> 0x0059 }
            r12.f24086k = r4     // Catch:{ Exception -> 0x0059 }
            int r0 = r0.mo16320j()     // Catch:{ Exception -> 0x0059 }
            r12.f24089n = r0     // Catch:{ Exception -> 0x0059 }
            goto L_0x0128
        L_0x0059:
            java.lang.String r13 = "UnitCacheCtroller"
            java.lang.String r0 = "make sure your had put feeds jar into your project"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r13, r0)
            return
        L_0x0061:
            com.mbridge.msdk.c.b r0 = com.mbridge.msdk.p078c.C2445b.m6020a()
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r4 = r4.mo56914h()
            java.lang.String r5 = r12.f24087l
            com.mbridge.msdk.c.d r0 = r0.mo16295f(r4, r5)
            r12.f24077b = r0
            if (r0 != 0) goto L_0x008b
            com.mbridge.msdk.c.b r0 = com.mbridge.msdk.p078c.C2445b.m6020a()
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r4 = r4.mo56914h()
            java.lang.String r5 = r12.f24087l
            com.mbridge.msdk.c.d r0 = r0.mo16290d(r4, r5)
            r12.f24077b = r0
        L_0x008b:
            com.mbridge.msdk.c.d r0 = r12.f24077b
            if (r0 == 0) goto L_0x0128
            long r4 = r0.mo16318h()
            r12.f24086k = r4
            com.mbridge.msdk.c.d r0 = r12.f24077b
            int r0 = r0.mo16320j()
            r12.f24089n = r0
            goto L_0x0128
        L_0x009f:
            java.lang.String r0 = "com.mbridge.msdk.videocommon.d.a"
            java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00e6 }
            com.mbridge.msdk.videocommon.d.b r0 = com.mbridge.msdk.videocommon.p375d.C9638b.m27377a()     // Catch:{ Exception -> 0x00e6 }
            com.mbridge.msdk.videocommon.d.a r0 = r0.mo63556b()     // Catch:{ Exception -> 0x00e6 }
            if (r0 != 0) goto L_0x00b5
            com.mbridge.msdk.videocommon.d.b r4 = com.mbridge.msdk.videocommon.p375d.C9638b.m27377a()     // Catch:{ Exception -> 0x00e6 }
            r4.mo63558c()     // Catch:{ Exception -> 0x00e6 }
        L_0x00b5:
            if (r0 == 0) goto L_0x00bd
            long r4 = r0.mo63543e()     // Catch:{ Exception -> 0x00e6 }
            r12.f24086k = r4     // Catch:{ Exception -> 0x00e6 }
        L_0x00bd:
            java.lang.String r0 = r12.f24087l     // Catch:{ Exception -> 0x00e6 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00e6 }
            if (r0 != 0) goto L_0x00d9
            com.mbridge.msdk.videocommon.d.b r0 = com.mbridge.msdk.videocommon.p375d.C9638b.m27377a()     // Catch:{ Exception -> 0x00e6 }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r4 = r4.mo56914h()     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r5 = r12.f24087l     // Catch:{ Exception -> 0x00e6 }
            com.mbridge.msdk.videocommon.d.c r0 = r0.mo63550a(r4, r5)     // Catch:{ Exception -> 0x00e6 }
            r12.f24088m = r0     // Catch:{ Exception -> 0x00e6 }
        L_0x00d9:
            com.mbridge.msdk.videocommon.d.c r0 = r12.f24088m     // Catch:{ Exception -> 0x00e6 }
            if (r0 == 0) goto L_0x0128
            com.mbridge.msdk.videocommon.d.c r0 = r12.f24088m     // Catch:{ Exception -> 0x00e6 }
            int r0 = r0.mo63608u()     // Catch:{ Exception -> 0x00e6 }
            r12.f24089n = r0     // Catch:{ Exception -> 0x00e6 }
            goto L_0x0128
        L_0x00e6:
            java.lang.String r13 = "UnitCacheCtroller"
            java.lang.String r0 = "make sure your had put reward jar into your project"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r13, r0)
            return
        L_0x00ee:
            java.lang.String r0 = r12.f24087l     // Catch:{ Exception -> 0x020a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x020a }
            if (r0 != 0) goto L_0x0128
            com.mbridge.msdk.c.b r0 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x020a }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x020a }
            java.lang.String r4 = r4.mo56914h()     // Catch:{ Exception -> 0x020a }
            java.lang.String r5 = r12.f24087l     // Catch:{ Exception -> 0x020a }
            com.mbridge.msdk.c.d r0 = r0.mo16292e(r4, r5)     // Catch:{ Exception -> 0x020a }
            r12.f24076a = r0     // Catch:{ Exception -> 0x020a }
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = r12.f24087l     // Catch:{ Exception -> 0x020a }
            com.mbridge.msdk.c.d r0 = com.mbridge.msdk.p078c.C2456d.m6070d(r0)     // Catch:{ Exception -> 0x020a }
            r12.f24076a = r0     // Catch:{ Exception -> 0x020a }
        L_0x0114:
            com.mbridge.msdk.c.d r0 = r12.f24076a     // Catch:{ Exception -> 0x020a }
            if (r0 == 0) goto L_0x0128
            com.mbridge.msdk.c.d r0 = r12.f24076a     // Catch:{ Exception -> 0x020a }
            long r4 = r0.mo16318h()     // Catch:{ Exception -> 0x020a }
            r12.f24086k = r4     // Catch:{ Exception -> 0x020a }
            com.mbridge.msdk.c.d r0 = r12.f24076a     // Catch:{ Exception -> 0x020a }
            int r0 = r0.mo16320j()     // Catch:{ Exception -> 0x020a }
            r12.f24089n = r0     // Catch:{ Exception -> 0x020a }
        L_0x0128:
            r0 = 0
            r4 = r0
        L_0x012a:
            int r5 = r13.size()
            if (r4 >= r5) goto L_0x01fa
            java.lang.Object r5 = r13.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = (com.mbridge.msdk.foundation.entity.CampaignEx) r5
            if (r5 == 0) goto L_0x01f6
            int r6 = r12.f24090o
            if (r6 == r1) goto L_0x015e
            if (r6 != r2) goto L_0x013f
            goto L_0x015e
        L_0x013f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r5.getId()
            r6.append(r7)
            java.lang.String r7 = r5.getVideoUrlEncode()
            r6.append(r7)
            java.lang.String r7 = r5.getBidToken()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L_0x017c
        L_0x015e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r5.getRequestId()
            r6.append(r7)
            java.lang.String r7 = r5.getId()
            r6.append(r7)
            java.lang.String r7 = r5.getVideoUrlEncode()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L_0x017c:
            boolean r7 = r12.m27592c(r5)
            if (r7 != 0) goto L_0x018d
            java.lang.String r7 = r5.getVideoUrlEncode()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x018d
            goto L_0x01f6
        L_0x018d:
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r7 = r12.f24083h
            if (r7 == 0) goto L_0x01f6
            monitor-enter(r7)
            r8 = r0
        L_0x0193:
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r9 = r12.f24083h     // Catch:{ all -> 0x01f1 }
            int r9 = r9.size()     // Catch:{ all -> 0x01f1 }
            if (r8 >= r9) goto L_0x01cc
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r9 = r12.f24083h     // Catch:{ all -> 0x01f1 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x01f1 }
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x01f1 }
            if (r9 == 0) goto L_0x01c9
            boolean r10 = r9.containsKey(r6)     // Catch:{ all -> 0x01f1 }
            if (r10 == 0) goto L_0x01c9
            java.lang.Object r10 = r9.get(r6)     // Catch:{ all -> 0x01f1 }
            com.mbridge.msdk.videocommon.download.a r10 = (com.mbridge.msdk.videocommon.download.C9641a) r10     // Catch:{ all -> 0x01f1 }
            r10.mo63623a((com.mbridge.msdk.foundation.entity.CampaignEx) r5)     // Catch:{ all -> 0x01f1 }
            int r11 = r12.f24089n     // Catch:{ all -> 0x01f1 }
            r10.mo63620a((int) r11)     // Catch:{ all -> 0x01f1 }
            r10.mo63627a((boolean) r0)     // Catch:{ all -> 0x01f1 }
            r9.remove(r6)     // Catch:{ all -> 0x01f1 }
            r9.put(r6, r10)     // Catch:{ all -> 0x01f1 }
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r10 = r12.f24083h     // Catch:{ all -> 0x01f1 }
            r10.set(r8, r9)     // Catch:{ all -> 0x01f1 }
            r8 = r3
            goto L_0x01cd
        L_0x01c9:
            int r8 = r8 + 1
            goto L_0x0193
        L_0x01cc:
            r8 = r0
        L_0x01cd:
            if (r8 != 0) goto L_0x01f1
            com.mbridge.msdk.videocommon.download.a r8 = new com.mbridge.msdk.videocommon.download.a     // Catch:{ all -> 0x01f1 }
            android.content.Context r9 = r12.f24084i     // Catch:{ all -> 0x01f1 }
            java.lang.String r10 = r12.f24087l     // Catch:{ all -> 0x01f1 }
            int r11 = r12.f24089n     // Catch:{ all -> 0x01f1 }
            r8.<init>(r9, r5, r10, r11)     // Catch:{ all -> 0x01f1 }
            int r5 = r12.f24089n     // Catch:{ all -> 0x01f1 }
            r8.mo63620a((int) r5)     // Catch:{ all -> 0x01f1 }
            int r5 = r12.f24090o     // Catch:{ all -> 0x01f1 }
            r8.mo63636d((int) r5)     // Catch:{ all -> 0x01f1 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x01f1 }
            r5.<init>()     // Catch:{ all -> 0x01f1 }
            r5.put(r6, r8)     // Catch:{ all -> 0x01f1 }
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r6 = r12.f24083h     // Catch:{ all -> 0x01f1 }
            r6.add(r5)     // Catch:{ all -> 0x01f1 }
        L_0x01f1:
            monitor-exit(r7)     // Catch:{ all -> 0x01f3 }
            goto L_0x01f6
        L_0x01f3:
            r13 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01f3 }
            throw r13
        L_0x01f6:
            int r4 = r4 + 1
            goto L_0x012a
        L_0x01fa:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r13 = r12.f24078c
            if (r13 == 0) goto L_0x0209
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x0209
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r13 = r12.f24078c
            r13.clear()
        L_0x0209:
            return
        L_0x020a:
            java.lang.String r13 = "UnitCacheCtroller"
            java.lang.String r0 = "make sure your had put native video jar into your project"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r13, r0)
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.C9670k.m27590b(java.util.List):void");
    }

    /* renamed from: d */
    private void m27594d() {
        CopyOnWriteArrayList<Map<String, C9641a>> copyOnWriteArrayList = this.f24083h;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i = 0;
                    while (i < this.f24083h.size()) {
                        Map map = this.f24083h.get(i);
                        for (Map.Entry value : map.entrySet()) {
                            C9641a aVar = (C9641a) value.getValue();
                            if (aVar != null) {
                                if (currentTimeMillis - aVar.mo63633c() > this.f24086k * 1000 && aVar.mo63639f() == 1) {
                                    aVar.mo63630b("download timeout");
                                    aVar.mo63620a(this.f24089n);
                                    aVar.mo63646m();
                                    this.f24083h.remove(map);
                                    i--;
                                }
                                if (!(aVar.mo63639f() == 1 || aVar.mo63639f() == 5 || aVar.mo63639f() == 0)) {
                                    aVar.mo63646m();
                                    this.f24083h.remove(map);
                                    i--;
                                }
                            }
                        }
                        i++;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    private void m27596e() {
        CopyOnWriteArrayList<Map<String, C9641a>> copyOnWriteArrayList = this.f24083h;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i = 0;
                    while (i < this.f24083h.size()) {
                        Map map = this.f24083h.get(i);
                        for (Map.Entry value : map.entrySet()) {
                            C9641a aVar = (C9641a) value.getValue();
                            if (aVar != null) {
                                if (aVar.mo63640g() != null) {
                                    if (aVar.mo63632b()) {
                                        aVar.mo63645l();
                                        this.f24083h.remove(map);
                                        i--;
                                    }
                                }
                            }
                        }
                        i++;
                    }
                }
            } catch (Throwable unused) {
                C8672v.m24878d("UnitCacheCtroller", "cleanDisplayTask ERROR");
            }
        }
    }

    /* renamed from: a */
    public final List<C9641a> mo63689a(String str, int i, boolean z, List<CampaignEx> list, boolean z2) {
        long j;
        Iterator it;
        Iterator it2;
        int i2 = i;
        boolean z3 = z2;
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList<Map<String, C9641a>> copyOnWriteArrayList = this.f24083h;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i3 = 0;
                    while (i3 < this.f24083h.size()) {
                        Map map = this.f24083h.get(i3);
                        Iterator it3 = map.entrySet().iterator();
                        while (it3.hasNext()) {
                            C9641a aVar = (C9641a) ((Map.Entry) it3.next()).getValue();
                            if (aVar != null) {
                                if (aVar.mo63640g() != null) {
                                    CampaignEx g = aVar.mo63640g();
                                    boolean z4 = false;
                                    for (CampaignEx next : list) {
                                        if (g == null || next == null || TextUtils.isEmpty(g.getRequestId()) || TextUtils.isEmpty(next.getRequestId())) {
                                            it2 = it3;
                                        } else {
                                            it2 = it3;
                                            if (g.getId().equals(next.getId()) && g.getRequestId().equals(next.getRequestId())) {
                                                z4 = true;
                                            }
                                        }
                                        it3 = it2;
                                    }
                                    it = it3;
                                    if (z4 && (!z || g.isBidCampaign())) {
                                        if (z || !g.isBidCampaign()) {
                                            String str2 = g.getendcard_url();
                                            String videoUrlEncode = g.getVideoUrlEncode();
                                            String str3 = "";
                                            if (!(g == null || g.getRewardTemplateMode() == null)) {
                                                str3 = g.getRewardTemplateMode().mo57576e();
                                            }
                                            g.getRewardTemplateMode();
                                            if (i2 == 94 || i2 == 287) {
                                                if (TextUtils.isEmpty(str3) || str3.contains(CampaignEx.KEY_IS_CMPT_ENTRY) || m27582a(i2, g, str3)) {
                                                    if (m27591b(str2, g)) {
                                                        if (aVar.mo63632b()) {
                                                            aVar.mo63645l();
                                                        } else if (C8616ad.m24717a(videoUrlEncode)) {
                                                            arrayList.add(aVar);
                                                        } else if (m27584a(aVar, m27588b(g), z3)) {
                                                            arrayList.add(aVar);
                                                        }
                                                    }
                                                }
                                            }
                                            boolean isEmpty = TextUtils.isEmpty(aVar.mo63644k());
                                            int f = aVar.mo63639f();
                                            if (f != 5) {
                                                long c = aVar.mo63633c();
                                                if (aVar.mo63639f() == 1) {
                                                    j = currentTimeMillis;
                                                    if (currentTimeMillis - c > this.f24086k * 1000) {
                                                        aVar.mo63630b("download timeout");
                                                        aVar.mo63646m();
                                                        this.f24083h.remove(map);
                                                        i3--;
                                                        if (i2 != 1) {
                                                            if (i2 == 94) {
                                                            }
                                                        }
                                                        it3 = it;
                                                        currentTimeMillis = j;
                                                    }
                                                } else {
                                                    j = currentTimeMillis;
                                                }
                                                if (f != 4) {
                                                    if (f != 2) {
                                                        if (f == 1) {
                                                            if (!aVar.mo63632b()) {
                                                                if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY && m27584a(aVar, m27588b(g), z3) && m27586a(str2, g)) {
                                                                    arrayList.add(aVar);
                                                                }
                                                            }
                                                            it3 = it;
                                                            currentTimeMillis = j;
                                                        }
                                                        if ((i2 == 94 || i2 == 287) && m27584a(aVar, m27588b(g), z3) && m27586a(str2, g)) {
                                                            arrayList.add(aVar);
                                                        }
                                                        it3 = it;
                                                        currentTimeMillis = j;
                                                    }
                                                }
                                                this.f24083h.remove(map);
                                                aVar.mo63646m();
                                                i3--;
                                                it3 = it;
                                                currentTimeMillis = j;
                                            } else if (aVar.mo63632b()) {
                                                aVar.mo63645l();
                                                this.f24083h.remove(map);
                                                i3--;
                                                it3 = it;
                                            } else if (!isEmpty) {
                                                aVar.mo63621a(0, 0);
                                                if (i2 == 95) {
                                                    arrayList.add(aVar);
                                                }
                                            } else if (!m27586a(str2, g)) {
                                                return null;
                                            } else {
                                                arrayList.add(aVar);
                                            }
                                        }
                                    }
                                    j = currentTimeMillis;
                                    it3 = it;
                                    currentTimeMillis = j;
                                }
                            }
                            j = currentTimeMillis;
                            it = it3;
                            it3 = it;
                            currentTimeMillis = j;
                        }
                        long j2 = currentTimeMillis;
                        i3++;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private int m27588b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return m27595e(campaignEx);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0268, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x026a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x026b, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0272, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0026, B:14:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01da A[Catch:{ Exception -> 0x026a, all -> 0x0268 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073 A[Catch:{ Exception -> 0x026a, all -> 0x0268 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.mbridge.msdk.videocommon.download.C9641a mo63687a(int r25, boolean r26) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            r2 = r26
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r3 = r1.f24083h
            r4 = 0
            if (r3 == 0) goto L_0x0273
            monitor-enter(r3)
            int r5 = r1.f24090o     // Catch:{ Exception -> 0x026a }
            r6 = 287(0x11f, float:4.02E-43)
            r7 = 94
            r8 = 1
            if (r5 == r7) goto L_0x0028
            int r5 = r1.f24090o     // Catch:{ Exception -> 0x026a }
            if (r5 != r6) goto L_0x001a
            goto L_0x0028
        L_0x001a:
            com.mbridge.msdk.videocommon.a.a r5 = com.mbridge.msdk.videocommon.p372a.C9627a.m27316a()     // Catch:{ Exception -> 0x026a }
            java.lang.String r9 = r1.f24087l     // Catch:{ Exception -> 0x026a }
            java.util.List r5 = r5.mo63504a((java.lang.String) r9, (int) r8)     // Catch:{ Exception -> 0x026a }
            if (r5 != 0) goto L_0x0066
            monitor-exit(r3)     // Catch:{ all -> 0x0268 }
            return r4
        L_0x0028:
            com.mbridge.msdk.videocommon.a.a r5 = com.mbridge.msdk.videocommon.p372a.C9627a.m27316a()     // Catch:{ Exception -> 0x026a }
            java.lang.String r9 = r1.f24087l     // Catch:{ Exception -> 0x026a }
            java.util.List r5 = r5.mo63505a((java.lang.String) r9, (int) r8, (boolean) r2)     // Catch:{ Exception -> 0x026a }
            if (r5 == 0) goto L_0x003a
            int r9 = r5.size()     // Catch:{ Exception -> 0x026a }
            if (r9 != 0) goto L_0x004a
        L_0x003a:
            if (r0 == r7) goto L_0x003e
            if (r0 != r6) goto L_0x004a
        L_0x003e:
            com.mbridge.msdk.videocommon.a.a r5 = com.mbridge.msdk.videocommon.p372a.C9627a.m27316a()     // Catch:{ Exception -> 0x026a }
            java.lang.String r9 = r1.f24087l     // Catch:{ Exception -> 0x026a }
            java.lang.String r10 = ""
            java.util.List r5 = r5.mo63520c(r9, r8, r2, r10)     // Catch:{ Exception -> 0x026a }
        L_0x004a:
            if (r5 == 0) goto L_0x025e
            java.lang.String r9 = "UnitCacheCtroller"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x026a }
            r10.<init>()     // Catch:{ Exception -> 0x026a }
            java.lang.String r11 = "UnitCache isReady campaignList = "
            r10.append(r11)     // Catch:{ Exception -> 0x026a }
            int r11 = r5.size()     // Catch:{ Exception -> 0x026a }
            r10.append(r11)     // Catch:{ Exception -> 0x026a }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x026a }
            com.mbridge.msdk.foundation.tools.C8672v.m24874a(r9, r10)     // Catch:{ Exception -> 0x026a }
        L_0x0066:
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x026a }
            r12 = 0
        L_0x006b:
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r13 = r1.f24083h     // Catch:{ Exception -> 0x026a }
            int r13 = r13.size()     // Catch:{ Exception -> 0x026a }
            if (r12 >= r13) goto L_0x026e
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r13 = r1.f24083h     // Catch:{ Exception -> 0x026a }
            java.lang.Object r13 = r13.get(r12)     // Catch:{ Exception -> 0x026a }
            java.util.Map r13 = (java.util.Map) r13     // Catch:{ Exception -> 0x026a }
            java.util.Set r14 = r13.entrySet()     // Catch:{ Exception -> 0x026a }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x026a }
        L_0x0083:
            boolean r15 = r14.hasNext()     // Catch:{ Exception -> 0x026a }
            if (r15 == 0) goto L_0x0253
            java.lang.Object r15 = r14.next()     // Catch:{ Exception -> 0x026a }
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch:{ Exception -> 0x026a }
            java.lang.Object r15 = r15.getValue()     // Catch:{ Exception -> 0x026a }
            com.mbridge.msdk.videocommon.download.a r15 = (com.mbridge.msdk.videocommon.download.C9641a) r15     // Catch:{ Exception -> 0x026a }
            if (r15 == 0) goto L_0x0248
            com.mbridge.msdk.foundation.entity.CampaignEx r16 = r15.mo63640g()     // Catch:{ Exception -> 0x026a }
            if (r16 != 0) goto L_0x009f
            goto L_0x0248
        L_0x009f:
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = r15.mo63640g()     // Catch:{ Exception -> 0x026a }
            java.util.Iterator r17 = r5.iterator()     // Catch:{ Exception -> 0x026a }
            r18 = 0
        L_0x00a9:
            boolean r19 = r17.hasNext()     // Catch:{ Exception -> 0x026a }
            if (r19 == 0) goto L_0x00c7
            java.lang.Object r19 = r17.next()     // Catch:{ Exception -> 0x026a }
            com.mbridge.msdk.foundation.entity.CampaignEx r19 = (com.mbridge.msdk.foundation.entity.CampaignEx) r19     // Catch:{ Exception -> 0x026a }
            java.lang.String r4 = r8.getId()     // Catch:{ Exception -> 0x026a }
            java.lang.String r11 = r19.getId()     // Catch:{ Exception -> 0x026a }
            boolean r4 = r4.equals(r11)     // Catch:{ Exception -> 0x026a }
            if (r4 == 0) goto L_0x00c5
            r18 = 1
        L_0x00c5:
            r4 = 0
            goto L_0x00a9
        L_0x00c7:
            if (r18 != 0) goto L_0x00ce
        L_0x00c9:
            r11 = r6
            r6 = r12
            r0 = 1
            goto L_0x024b
        L_0x00ce:
            if (r2 == 0) goto L_0x00d6
            boolean r4 = r8.isBidCampaign()     // Catch:{ Exception -> 0x026a }
            if (r4 == 0) goto L_0x00c9
        L_0x00d6:
            if (r2 != 0) goto L_0x00df
            boolean r4 = r8.isBidCampaign()     // Catch:{ Exception -> 0x026a }
            if (r4 == 0) goto L_0x00df
            goto L_0x00c9
        L_0x00df:
            java.lang.String r4 = r8.getendcard_url()     // Catch:{ Exception -> 0x026a }
            java.lang.String r11 = r8.getVideoUrlEncode()     // Catch:{ Exception -> 0x026a }
            java.lang.String r17 = ""
            if (r8 == 0) goto L_0x00f9
            com.mbridge.msdk.foundation.entity.CampaignEx$c r18 = r8.getRewardTemplateMode()     // Catch:{ Exception -> 0x026a }
            if (r18 == 0) goto L_0x00f9
            com.mbridge.msdk.foundation.entity.CampaignEx$c r17 = r8.getRewardTemplateMode()     // Catch:{ Exception -> 0x026a }
            java.lang.String r17 = r17.mo57576e()     // Catch:{ Exception -> 0x026a }
        L_0x00f9:
            r18 = r17
            r8.getRewardTemplateMode()     // Catch:{ Exception -> 0x026a }
            int r6 = r1.f24090o     // Catch:{ Exception -> 0x026a }
            if (r6 == r7) goto L_0x0106
            r6 = 287(0x11f, float:4.02E-43)
            if (r0 != r6) goto L_0x014a
        L_0x0106:
            boolean r6 = android.text.TextUtils.isEmpty(r18)     // Catch:{ Exception -> 0x026a }
            if (r6 != 0) goto L_0x011f
            java.lang.String r6 = "cmpt=1"
            r7 = r18
            boolean r6 = r7.contains(r6)     // Catch:{ Exception -> 0x026a }
            if (r6 != 0) goto L_0x011f
            int r6 = r1.f24090o     // Catch:{ Exception -> 0x026a }
            boolean r6 = r1.m27582a((int) r6, (com.mbridge.msdk.foundation.entity.CampaignEx) r8, (java.lang.String) r7)     // Catch:{ Exception -> 0x026a }
            if (r6 != 0) goto L_0x011f
            goto L_0x012e
        L_0x011f:
            boolean r6 = r1.m27591b((java.lang.String) r4, (com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ Exception -> 0x026a }
            if (r6 == 0) goto L_0x014a
            boolean r6 = r15.mo63632b()     // Catch:{ Exception -> 0x026a }
            if (r6 == 0) goto L_0x0136
            r15.mo63645l()     // Catch:{ Exception -> 0x026a }
        L_0x012e:
            r6 = r12
            r0 = 1
            r7 = 94
            r11 = 287(0x11f, float:4.02E-43)
            goto L_0x024b
        L_0x0136:
            boolean r6 = com.mbridge.msdk.foundation.tools.C8616ad.m24717a(r11)     // Catch:{ Exception -> 0x026a }
            if (r6 == 0) goto L_0x013e
            monitor-exit(r3)     // Catch:{ all -> 0x0268 }
            return r15
        L_0x013e:
            int r6 = r1.m27588b((com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ Exception -> 0x026a }
            boolean r6 = m27583a((com.mbridge.msdk.videocommon.download.C9641a) r15, (int) r6)     // Catch:{ Exception -> 0x026a }
            if (r6 == 0) goto L_0x014a
            monitor-exit(r3)     // Catch:{ all -> 0x0268 }
            return r15
        L_0x014a:
            java.lang.String r6 = r15.mo63644k()     // Catch:{ Exception -> 0x026a }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x026a }
            int r7 = r15.mo63639f()     // Catch:{ Exception -> 0x026a }
            int r11 = r1.f24090o     // Catch:{ Exception -> 0x026a }
            r0 = 298(0x12a, float:4.18E-43)
            if (r11 != r0) goto L_0x0168
            int r0 = r1.m27588b((com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ Exception -> 0x026a }
            boolean r0 = m27583a((com.mbridge.msdk.videocommon.download.C9641a) r15, (int) r0)     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x0168
            monitor-exit(r3)     // Catch:{ all -> 0x0268 }
            return r15
        L_0x0168:
            r0 = 5
            r11 = 95
            if (r7 != r0) goto L_0x019e
            boolean r0 = r15.mo63632b()     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x0187
            r15.mo63645l()     // Catch:{ Exception -> 0x026a }
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r0 = r1.f24083h     // Catch:{ Exception -> 0x026a }
            r0.remove(r13)     // Catch:{ Exception -> 0x026a }
        L_0x017b:
            int r12 = r12 + -1
        L_0x017d:
            r0 = r25
            r4 = 0
            r6 = 287(0x11f, float:4.02E-43)
            r7 = 94
            r8 = 1
            goto L_0x0083
        L_0x0187:
            if (r6 != 0) goto L_0x0193
            r0 = 0
            r15.mo63621a((int) r0, (int) r0)     // Catch:{ Exception -> 0x026a }
            int r4 = r1.f24090o     // Catch:{ Exception -> 0x026a }
            if (r4 != r11) goto L_0x012e
            monitor-exit(r3)     // Catch:{ all -> 0x0268 }
            return r15
        L_0x0193:
            boolean r0 = r1.m27586a((java.lang.String) r4, (com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x019b
            monitor-exit(r3)     // Catch:{ all -> 0x0268 }
            return r15
        L_0x019b:
            monitor-exit(r3)     // Catch:{ all -> 0x0268 }
            r2 = 0
            return r2
        L_0x019e:
            r0 = 0
            long r20 = r15.mo63633c()     // Catch:{ Exception -> 0x026a }
            int r6 = r15.mo63639f()     // Catch:{ Exception -> 0x026a }
            r0 = 1
            if (r6 != r0) goto L_0x01d2
            long r20 = r9 - r20
            r6 = r12
            long r11 = r1.f24086k     // Catch:{ Exception -> 0x026a }
            r22 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r22
            int r11 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x01d3
            java.lang.String r11 = "download timeout"
            r15.mo63630b((java.lang.String) r11)     // Catch:{ Exception -> 0x026a }
            r15.mo63646m()     // Catch:{ Exception -> 0x026a }
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r11 = r1.f24083h     // Catch:{ Exception -> 0x026a }
            r11.remove(r13)     // Catch:{ Exception -> 0x026a }
            int r12 = r6 + -1
            int r6 = r1.f24090o     // Catch:{ Exception -> 0x026a }
            r11 = 1
            if (r6 == r11) goto L_0x017d
            int r6 = r1.f24090o     // Catch:{ Exception -> 0x026a }
            r11 = 94
            if (r6 != r11) goto L_0x01d4
            goto L_0x017d
        L_0x01d2:
            r6 = r12
        L_0x01d3:
            r12 = r6
        L_0x01d4:
            int r6 = r1.f24090o     // Catch:{ Exception -> 0x026a }
            r0 = 95
            if (r6 != r0) goto L_0x01eb
            boolean r0 = r15.mo63632b()     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x01e9
            r15.mo63645l()     // Catch:{ Exception -> 0x026a }
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r0 = r1.f24083h     // Catch:{ Exception -> 0x026a }
            r0.remove(r13)     // Catch:{ Exception -> 0x026a }
            goto L_0x017b
        L_0x01e9:
            monitor-exit(r3)     // Catch:{ all -> 0x0268 }
            return r15
        L_0x01eb:
            r0 = 4
            if (r7 == r0) goto L_0x0237
            r0 = 2
            if (r7 != r0) goto L_0x01f2
            goto L_0x0237
        L_0x01f2:
            r0 = 1
            if (r7 != r0) goto L_0x0216
            boolean r6 = r15.mo63632b()     // Catch:{ Exception -> 0x026a }
            if (r6 == 0) goto L_0x0200
            r7 = 94
            r11 = 287(0x11f, float:4.02E-43)
            goto L_0x0246
        L_0x0200:
            boolean r6 = com.mbridge.msdk.MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY     // Catch:{ Exception -> 0x026a }
            if (r6 != 0) goto L_0x0216
            int r6 = r1.m27588b((com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ Exception -> 0x026a }
            boolean r6 = m27583a((com.mbridge.msdk.videocommon.download.C9641a) r15, (int) r6)     // Catch:{ Exception -> 0x026a }
            if (r6 == 0) goto L_0x0216
            boolean r6 = r1.m27586a((java.lang.String) r4, (com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ Exception -> 0x026a }
            if (r6 == 0) goto L_0x0216
            monitor-exit(r3)     // Catch:{ all -> 0x0268 }
            return r15
        L_0x0216:
            int r6 = r1.f24090o     // Catch:{ Exception -> 0x026a }
            r7 = 94
            if (r6 == r7) goto L_0x0223
            int r6 = r1.f24090o     // Catch:{ Exception -> 0x026a }
            r11 = 287(0x11f, float:4.02E-43)
            if (r6 != r11) goto L_0x0246
            goto L_0x0225
        L_0x0223:
            r11 = 287(0x11f, float:4.02E-43)
        L_0x0225:
            int r6 = r1.m27588b((com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ Exception -> 0x026a }
            boolean r6 = m27583a((com.mbridge.msdk.videocommon.download.C9641a) r15, (int) r6)     // Catch:{ Exception -> 0x026a }
            if (r6 == 0) goto L_0x0246
            boolean r4 = r1.m27586a((java.lang.String) r4, (com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ Exception -> 0x026a }
            if (r4 == 0) goto L_0x0246
            monitor-exit(r3)     // Catch:{ all -> 0x0268 }
            return r15
        L_0x0237:
            r0 = 1
            r7 = 94
            r11 = 287(0x11f, float:4.02E-43)
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r4 = r1.f24083h     // Catch:{ Exception -> 0x026a }
            r4.remove(r13)     // Catch:{ Exception -> 0x026a }
            r15.mo63646m()     // Catch:{ Exception -> 0x026a }
            int r12 = r12 + -1
        L_0x0246:
            r8 = r0
            goto L_0x024d
        L_0x0248:
            r11 = r6
            r0 = r8
            r6 = r12
        L_0x024b:
            r8 = r0
            r12 = r6
        L_0x024d:
            r6 = r11
            r4 = 0
            r0 = r25
            goto L_0x0083
        L_0x0253:
            r11 = r6
            r0 = r8
            r6 = r12
            int r12 = r6 + 1
            r6 = r11
            r4 = 0
            r0 = r25
            goto L_0x006b
        L_0x025e:
            java.lang.String r0 = "UnitCacheCtroller"
            java.lang.String r2 = "UnitCache isReady campaignList = 0"
            com.mbridge.msdk.foundation.tools.C8672v.m24874a(r0, r2)     // Catch:{ Exception -> 0x026a }
            monitor-exit(r3)     // Catch:{ all -> 0x0268 }
            r2 = 0
            return r2
        L_0x0268:
            r0 = move-exception
            goto L_0x0271
        L_0x026a:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0268 }
        L_0x026e:
            monitor-exit(r3)     // Catch:{ all -> 0x0268 }
            r2 = 0
            goto L_0x0274
        L_0x0271:
            monitor-exit(r3)     // Catch:{ all -> 0x0268 }
            throw r0
        L_0x0273:
            r2 = r4
        L_0x0274:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.C9670k.mo63687a(int, boolean):com.mbridge.msdk.videocommon.download.a");
    }

    /* renamed from: a */
    public static boolean m27583a(C9641a aVar, int i) {
        long h = aVar.mo63641h();
        long e = aVar.mo63637e();
        if (TextUtils.isEmpty(aVar.mo63619a())) {
            C8672v.m24874a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        if (i == 0) {
            if (aVar.mo63640g() == null || TextUtils.isEmpty(aVar.mo63640g().getVideoUrlEncode())) {
                return false;
            }
            return true;
        } else if (e > 0 && h * 100 >= e * ((long) i)) {
            if (i != 100 || aVar.mo63639f() == 5) {
                return true;
            }
            aVar.mo63646m();
            return false;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m27584a(C9641a aVar, int i, boolean z) {
        long h = aVar.mo63641h();
        long e = aVar.mo63637e();
        if (TextUtils.isEmpty(aVar.mo63619a())) {
            C8672v.m24874a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        CampaignEx g = aVar.mo63640g();
        if (g != null) {
            if (g.getRsIgnoreCheckRule() != null && g.getRsIgnoreCheckRule().size() > 0 && g.getRsIgnoreCheckRule().contains(0)) {
                C8672v.m24876b("UnitCacheCtroller", "Is not check video download status");
                return true;
            } else if (g.getIsTimeoutCheckVideoStatus() == 1 && g.getVideoCheckType() == 1) {
                return true;
            } else {
                if (z && g.getVideoCheckType() == 1) {
                    if (i == 0) {
                        return true;
                    }
                    if (!(e == 0 && h == 0) && h >= ((long) (i / 100)) * e) {
                        g.setIsTimeoutCheckVideoStatus(1);
                        return true;
                    }
                }
            }
        }
        return m27583a(aVar, i);
    }

    /* renamed from: a */
    private boolean m27586a(String str, CampaignEx campaignEx) {
        try {
            if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                C8672v.m24876b("UnitCacheCtroller", "Is not check endCard download status : " + str);
                return true;
            } else if ((!campaignEx.isDynamicView() || C8677z.m24952j(str)) && !C8616ad.m24717a(str) && !m27591b(str, campaignEx)) {
                return false;
            } else {
                return true;
            }
        } catch (Throwable th) {
            C8672v.m24875a("UnitCacheCtroller", th.getMessage(), th);
            return false;
        }
    }

    /* renamed from: b */
    private boolean m27591b(String str, CampaignEx campaignEx) {
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !m27592c(campaignEx)) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(2)) {
            C8672v.m24876b("UnitCacheCtroller", "Is not check endCard download status : " + str);
            return true;
        } else if (!C8616ad.m24718b(C9652g.m27539a().mo63670b(str)) && !C8616ad.m24718b(C9661h.C9663a.f24065a.mo63674b(str))) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private boolean m27582a(int i, CampaignEx campaignEx, String str) {
        if (campaignEx.isDynamicView()) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
            C8672v.m24876b("UnitCacheCtroller", "Is not check template download status");
            return true;
        } else if (!TextUtils.isEmpty(str) && campaignEx.getLoadTimeoutState() == 0 && C9652g.m27539a().mo63670b(str) == null) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    public final C9641a mo63695b(int i, boolean z) {
        try {
            return mo63687a(i, z);
        } catch (Throwable th) {
            C8672v.m24875a("UnitCacheCtroller", th.getMessage(), th);
            return null;
        }
    }

    /* renamed from: a */
    public final C9641a mo63688a(String str) {
        CopyOnWriteArrayList<Map<String, C9641a>> copyOnWriteArrayList = this.f24083h;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                Iterator<Map<String, C9641a>> it = this.f24083h.iterator();
                while (it.hasNext()) {
                    Map next = it.next();
                    if (next != null && next.containsKey(str)) {
                        C9641a aVar = (C9641a) next.get(str);
                        return aVar;
                    }
                }
            } catch (Throwable unused) {
                C8672v.m24878d("UnitCacheCtroller", "failed to get campaignTast by cid");
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m27587a(CopyOnWriteArrayList<Map<String, C9641a>> copyOnWriteArrayList) {
        try {
            Iterator<Map<String, C9641a>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Map next = it.next();
                if (next != null) {
                    for (Map.Entry value : next.entrySet()) {
                        if (((C9641a) value.getValue()).mo63639f() == 1) {
                            return true;
                        }
                    }
                    continue;
                }
            }
            return false;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01b1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0160  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63690a() {
        /*
            r16 = this;
            r1 = r16
            r16.m27594d()
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r2 = r1.f24083h
            if (r2 == 0) goto L_0x01f0
            monitor-enter(r2)
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r0 = r1.f24083h     // Catch:{ all -> 0x01ed }
            boolean r0 = r1.m27587a((java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.C9641a>>) r0)     // Catch:{ all -> 0x01ed }
            r3 = 1
            if (r0 != 0) goto L_0x0015
            r1.f24079d = r3     // Catch:{ all -> 0x01ed }
        L_0x0015:
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r0 = r1.f24083h     // Catch:{ all -> 0x01ed }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01ed }
        L_0x001b:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x01ed }
            if (r4 == 0) goto L_0x01eb
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x01ed }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x01ed }
            if (r4 != 0) goto L_0x002a
            goto L_0x001b
        L_0x002a:
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x01ed }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x01ed }
        L_0x0032:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x01ed }
            if (r5 == 0) goto L_0x001b
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x01ed }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x01ed }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x01ed }
            com.mbridge.msdk.videocommon.download.a r5 = (com.mbridge.msdk.videocommon.download.C9641a) r5     // Catch:{ all -> 0x01ed }
            if (r5 != 0) goto L_0x0047
            goto L_0x0032
        L_0x0047:
            boolean r6 = r5.mo63632b()     // Catch:{ all -> 0x01ed }
            if (r6 == 0) goto L_0x004e
            goto L_0x0032
        L_0x004e:
            int r6 = r1.f24090o     // Catch:{ all -> 0x01ed }
            r7 = 95
            if (r6 != r7) goto L_0x0056
            r1.f24079d = r3     // Catch:{ all -> 0x01ed }
        L_0x0056:
            int r6 = r5.mo63639f()     // Catch:{ all -> 0x01ed }
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = r5.mo63640g()     // Catch:{ all -> 0x01ed }
            if (r8 == 0) goto L_0x0072
            if (r6 != 0) goto L_0x0072
            com.mbridge.msdk.videocommon.download.c r6 = com.mbridge.msdk.videocommon.download.C9645c.getInstance()     // Catch:{ all -> 0x01ed }
            java.lang.String r9 = r8.getId()     // Catch:{ all -> 0x01ed }
            java.lang.String r10 = r8.getVideoUrlEncode()     // Catch:{ all -> 0x01ed }
            int r6 = r6.mo63659b(r9, r10)     // Catch:{ all -> 0x01ed }
        L_0x0072:
            com.mbridge.msdk.videocommon.download.k$2 r9 = new com.mbridge.msdk.videocommon.download.k$2     // Catch:{ all -> 0x01ed }
            r9.<init>(r8)     // Catch:{ all -> 0x01ed }
            r5.mo63625a((com.mbridge.msdk.videocommon.listener.C9673a) r9)     // Catch:{ all -> 0x01ed }
            int r9 = r1.m27588b((com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ all -> 0x01ed }
            int r10 = r1.f24090o     // Catch:{ all -> 0x01ed }
            if (r10 != r3) goto L_0x0092
            com.mbridge.msdk.c.d r9 = r1.f24076a     // Catch:{ all -> 0x01ed }
            if (r9 != 0) goto L_0x008e
            java.lang.String r9 = r1.f24087l     // Catch:{ all -> 0x01ed }
            com.mbridge.msdk.c.d r9 = com.mbridge.msdk.p078c.C2456d.m6070d(r9)     // Catch:{ all -> 0x01ed }
            r1.f24076a = r9     // Catch:{ all -> 0x01ed }
        L_0x008e:
            int r9 = r1.m27593d(r8)     // Catch:{ all -> 0x01ed }
        L_0x0092:
            r5.mo63634c((int) r9)     // Catch:{ all -> 0x01ed }
            int r10 = r1.f24090o     // Catch:{ all -> 0x01ed }
            r11 = 94
            r12 = 298(0x12a, float:4.18E-43)
            r13 = 287(0x11f, float:4.02E-43)
            if (r10 == r11) goto L_0x00f7
            int r10 = r1.f24090o     // Catch:{ all -> 0x01ed }
            if (r10 == r13) goto L_0x00f7
            int r10 = r1.f24090o     // Catch:{ all -> 0x01ed }
            if (r10 != r7) goto L_0x00a8
            goto L_0x00f7
        L_0x00a8:
            int r10 = r1.f24090o     // Catch:{ all -> 0x01ed }
            if (r10 != r12) goto L_0x00cf
            com.mbridge.msdk.c.d r10 = r1.f24077b     // Catch:{ all -> 0x01ed }
            if (r10 != 0) goto L_0x00c4
            com.mbridge.msdk.c.b r10 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ all -> 0x01ed }
            com.mbridge.msdk.foundation.controller.a r15 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x01ed }
            java.lang.String r15 = r15.mo56914h()     // Catch:{ all -> 0x01ed }
            java.lang.String r14 = r1.f24087l     // Catch:{ all -> 0x01ed }
            com.mbridge.msdk.c.d r10 = r10.mo16288c(r15, r14)     // Catch:{ all -> 0x01ed }
            r1.f24077b = r10     // Catch:{ all -> 0x01ed }
        L_0x00c4:
            com.mbridge.msdk.c.d r10 = r1.f24077b     // Catch:{ all -> 0x01ed }
            if (r10 == 0) goto L_0x00cf
            com.mbridge.msdk.c.d r10 = r1.f24077b     // Catch:{ all -> 0x01ed }
            int r10 = r10.mo16315f()     // Catch:{ all -> 0x01ed }
            goto L_0x00d0
        L_0x00cf:
            r10 = 0
        L_0x00d0:
            int r14 = r1.f24090o     // Catch:{ all -> 0x01ed }
            if (r14 != r3) goto L_0x0122
            com.mbridge.msdk.c.d r14 = r1.f24076a     // Catch:{ all -> 0x01ed }
            if (r14 != 0) goto L_0x00ec
            com.mbridge.msdk.c.b r14 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ all -> 0x01ed }
            com.mbridge.msdk.foundation.controller.a r15 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x01ed }
            java.lang.String r15 = r15.mo56914h()     // Catch:{ all -> 0x01ed }
            java.lang.String r7 = r1.f24087l     // Catch:{ all -> 0x01ed }
            com.mbridge.msdk.c.d r7 = r14.mo16288c(r15, r7)     // Catch:{ all -> 0x01ed }
            r1.f24076a = r7     // Catch:{ all -> 0x01ed }
        L_0x00ec:
            com.mbridge.msdk.c.d r7 = r1.f24076a     // Catch:{ all -> 0x01ed }
            if (r7 == 0) goto L_0x0122
            com.mbridge.msdk.c.d r7 = r1.f24076a     // Catch:{ all -> 0x01ed }
            int r10 = r7.mo16315f()     // Catch:{ all -> 0x01ed }
            goto L_0x0122
        L_0x00f7:
            com.mbridge.msdk.videocommon.d.c r7 = r1.f24088m     // Catch:{ all -> 0x01ed }
            if (r7 != 0) goto L_0x0116
            com.mbridge.msdk.videocommon.d.b r7 = com.mbridge.msdk.videocommon.p375d.C9638b.m27377a()     // Catch:{ all -> 0x01ed }
            com.mbridge.msdk.foundation.controller.a r10 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x01ed }
            java.lang.String r10 = r10.mo56914h()     // Catch:{ all -> 0x01ed }
            java.lang.String r14 = r1.f24087l     // Catch:{ all -> 0x01ed }
            int r15 = r1.f24090o     // Catch:{ all -> 0x01ed }
            if (r15 != r13) goto L_0x010f
            r15 = r3
            goto L_0x0110
        L_0x010f:
            r15 = 0
        L_0x0110:
            com.mbridge.msdk.videocommon.d.c r7 = r7.mo63551a((java.lang.String) r10, (java.lang.String) r14, (boolean) r15)     // Catch:{ all -> 0x01ed }
            r1.f24088m = r7     // Catch:{ all -> 0x01ed }
        L_0x0116:
            com.mbridge.msdk.videocommon.d.c r7 = r1.f24088m     // Catch:{ all -> 0x01ed }
            if (r7 == 0) goto L_0x0121
            com.mbridge.msdk.videocommon.d.c r7 = r1.f24088m     // Catch:{ all -> 0x01ed }
            int r10 = r7.mo63600q()     // Catch:{ all -> 0x01ed }
            goto L_0x0122
        L_0x0121:
            r10 = 0
        L_0x0122:
            r5.mo63628b((int) r10)     // Catch:{ all -> 0x01ed }
            if (r8 == 0) goto L_0x012c
            int r7 = r8.getVideoCtnType()     // Catch:{ all -> 0x01ed }
            goto L_0x012d
        L_0x012c:
            r7 = r3
        L_0x012d:
            r5.mo63638e((int) r7)     // Catch:{ all -> 0x01ed }
            java.lang.String r14 = "UnitCacheCtroller"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ed }
            r15.<init>()     // Catch:{ all -> 0x01ed }
            java.lang.String r13 = "ready_rate : "
            r15.append(r13)     // Catch:{ all -> 0x01ed }
            r15.append(r9)     // Catch:{ all -> 0x01ed }
            java.lang.String r13 = " cd_rate : "
            r15.append(r13)     // Catch:{ all -> 0x01ed }
            r15.append(r10)     // Catch:{ all -> 0x01ed }
            java.lang.String r10 = " videoCtnType : "
            r15.append(r10)     // Catch:{ all -> 0x01ed }
            r15.append(r7)     // Catch:{ all -> 0x01ed }
            java.lang.String r7 = r15.toString()     // Catch:{ all -> 0x01ed }
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r14, r7)     // Catch:{ all -> 0x01ed }
            int r7 = r1.m27588b((com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ all -> 0x01ed }
            boolean r7 = m27583a((com.mbridge.msdk.videocommon.download.C9641a) r5, (int) r7)     // Catch:{ all -> 0x01ed }
            if (r7 == 0) goto L_0x019a
            com.mbridge.msdk.videocommon.listener.a r7 = r1.f24080e     // Catch:{ all -> 0x01ed }
            if (r7 == 0) goto L_0x0177
            int r7 = r1.f24090o     // Catch:{ all -> 0x01ed }
            r10 = 297(0x129, float:4.16E-43)
            if (r7 == r10) goto L_0x016e
            int r7 = r1.f24090o     // Catch:{ all -> 0x01ed }
            if (r7 != r12) goto L_0x0177
        L_0x016e:
            com.mbridge.msdk.videocommon.listener.a r7 = r1.f24080e     // Catch:{ all -> 0x01ed }
            java.lang.String r10 = r8.getVideoUrlEncode()     // Catch:{ all -> 0x01ed }
            r7.mo58773a(r10)     // Catch:{ all -> 0x01ed }
        L_0x0177:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.listener.a> r7 = r1.f24081f     // Catch:{ all -> 0x01ed }
            if (r7 == 0) goto L_0x019a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.listener.a> r7 = r1.f24081f     // Catch:{ all -> 0x01ed }
            int r7 = r7.size()     // Catch:{ all -> 0x01ed }
            if (r7 <= 0) goto L_0x019a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.listener.a> r7 = r1.f24081f     // Catch:{ all -> 0x01ed }
            java.lang.String r10 = r8.getRequestId()     // Catch:{ all -> 0x01ed }
            java.lang.Object r7 = r7.get(r10)     // Catch:{ all -> 0x01ed }
            com.mbridge.msdk.videocommon.listener.a r7 = (com.mbridge.msdk.videocommon.listener.C9673a) r7     // Catch:{ all -> 0x01ed }
            if (r7 == 0) goto L_0x019a
            if (r8 == 0) goto L_0x019a
            java.lang.String r8 = r8.getVideoUrlEncode()     // Catch:{ all -> 0x01ed }
            r7.mo58773a(r8)     // Catch:{ all -> 0x01ed }
        L_0x019a:
            if (r6 == r3) goto L_0x0032
            r7 = 5
            if (r6 == r7) goto L_0x0032
            r7 = 4
            if (r6 == r7) goto L_0x0032
            android.content.Context r7 = r1.f24084i     // Catch:{ all -> 0x01ed }
            int r7 = com.mbridge.msdk.foundation.tools.C8660r.m24840o(r7)     // Catch:{ all -> 0x01ed }
            r8 = 9
            r10 = 2
            if (r7 == r8) goto L_0x01b3
            int r7 = r1.f24089n     // Catch:{ all -> 0x01ed }
            if (r7 != r10) goto L_0x01b3
            monitor-exit(r2)     // Catch:{ all -> 0x01ed }
            return
        L_0x01b3:
            if (r6 == r10) goto L_0x01bb
            boolean r6 = r1.f24079d     // Catch:{ all -> 0x01ed }
            if (r6 != 0) goto L_0x01bb
            goto L_0x0032
        L_0x01bb:
            com.mbridge.msdk.videocommon.download.d r6 = r1.f24082g     // Catch:{ all -> 0x01ed }
            r5.mo63624a((com.mbridge.msdk.videocommon.download.C9646d) r6)     // Catch:{ all -> 0x01ed }
            boolean r6 = m27583a((com.mbridge.msdk.videocommon.download.C9641a) r5, (int) r9)     // Catch:{ all -> 0x01ed }
            if (r6 == 0) goto L_0x01d5
            int r6 = r1.f24090o     // Catch:{ all -> 0x01ed }
            if (r6 == r11) goto L_0x01d0
            int r6 = r1.f24090o     // Catch:{ all -> 0x01ed }
            r7 = 287(0x11f, float:4.02E-43)
            if (r6 != r7) goto L_0x0032
        L_0x01d0:
            r5.mo63642i()     // Catch:{ all -> 0x01ed }
            goto L_0x0032
        L_0x01d5:
            int r6 = r1.f24090o     // Catch:{ all -> 0x01ed }
            if (r6 == r3) goto L_0x01e3
            int r6 = r1.f24090o     // Catch:{ all -> 0x01ed }
            r7 = 95
            if (r6 == r7) goto L_0x01e3
            int r6 = r1.f24090o     // Catch:{ all -> 0x01ed }
            if (r6 != r12) goto L_0x01e6
        L_0x01e3:
            r6 = 0
            r1.f24079d = r6     // Catch:{ all -> 0x01ed }
        L_0x01e6:
            r5.mo63642i()     // Catch:{ all -> 0x01ed }
            goto L_0x0032
        L_0x01eb:
            monitor-exit(r2)     // Catch:{ all -> 0x01ed }
            goto L_0x01f0
        L_0x01ed:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01ed }
            throw r0
        L_0x01f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.C9670k.mo63690a():void");
    }

    /* renamed from: b */
    public final void mo63696b() {
        CopyOnWriteArrayList<Map<String, C9641a>> copyOnWriteArrayList = this.f24083h;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    Iterator<Map<String, C9641a>> it = this.f24083h.iterator();
                    while (it.hasNext()) {
                        Map next = it.next();
                        if (next != null) {
                            for (Map.Entry value : next.entrySet()) {
                                C9641a aVar = (C9641a) value.getValue();
                                if (aVar != null) {
                                    if (aVar.mo63639f() == 1) {
                                        aVar.mo63630b("playing and stop download");
                                        aVar.mo63646m();
                                        this.f24083h.remove(next);
                                        return;
                                    }
                                }
                            }
                            continue;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public final CopyOnWriteArrayList<Map<String, C9641a>> mo63698c() {
        return this.f24083h;
    }

    /* renamed from: c */
    private boolean m27592c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    private int m27593d(CampaignEx campaignEx) {
        try {
            if (this.f24076a != null) {
                return this.f24076a.mo16314e();
            }
            return 100;
        } catch (Exception unused) {
            return 100;
        }
    }

    /* renamed from: b */
    public final void mo63697b(String str) {
        try {
            synchronized (this.f24083h) {
                if (!TextUtils.isEmpty(str) && this.f24083h != null && this.f24083h.size() > 0) {
                    Iterator<Map<String, C9641a>> it = this.f24083h.iterator();
                    while (it.hasNext()) {
                        Map next = it.next();
                        if (next != null) {
                            for (Map.Entry entry : next.entrySet()) {
                                if (entry != null && TextUtils.equals((CharSequence) entry.getKey(), str)) {
                                    this.f24083h.remove(next);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private int m27595e(CampaignEx campaignEx) {
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.f24077b == null) {
                    this.f24077b = C2445b.m6020a().mo16288c(C8388a.m23845e().mo56914h(), this.f24087l);
                }
                return this.f24077b.mo16314e();
            } else if (campaignEx.getAdType() == 42) {
                return m27593d((CampaignEx) null);
            } else {
                if (this.f24088m == null) {
                    this.f24088m = C9638b.m27377a().mo63551a(C8388a.m23845e().mo56914h(), this.f24087l, false);
                }
                return this.f24088m.mo63598p();
            }
        } catch (Throwable th) {
            C8672v.m24875a("UnitCacheCtroller", th.getMessage(), th);
            return 100;
        }
    }
}
