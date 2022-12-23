package com.mbridge.msdk.foundation.same.net.p311f;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.net.C8557k;
import com.mbridge.msdk.foundation.same.net.p308c.C8513b;
import com.mbridge.msdk.foundation.same.net.p310e.C8535c;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.f.c */
/* compiled from: RequestControlUtil */
public final class C8539c {

    /* renamed from: a */
    private final String f20922a;

    /* renamed from: b */
    private int f20923b;

    /* renamed from: c */
    private ArrayList<Integer> f20924c;

    /* renamed from: d */
    private ConcurrentHashMap<String, C8541a> f20925d;

    /* renamed from: com.mbridge.msdk.foundation.same.net.f.c$b */
    /* compiled from: RequestControlUtil */
    private static class C8542b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C8539c f20929a = new C8539c();
    }

    private C8539c() {
        this.f20922a = "IDErrorUtil";
        this.f20924c = new ArrayList<>();
        this.f20925d = new ConcurrentHashMap<>();
        C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
        b = b == null ? C2445b.m6020a().mo16285b() : b;
        this.f20923b = b.mo16206ax() * 1000;
        if (b.mo16207ay() == null || b.mo16207ay().size() <= 0) {
            this.f20924c.addAll(Arrays.asList(new Integer[]{-1, -10, -1201, -1202, -1203, -1205, -1206, -1208, -1301, -1302, -1305, -1306, -1307, -1915, 10602, 10603, 10604, 10609, 10610, 10616}));
        } else {
            this.f20924c.addAll(b.mo16207ay());
        }
    }

    /* renamed from: a */
    public static C8539c m24459a() {
        return C8542b.f20929a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo57964a(java.lang.String r3, int r4, java.lang.String r5, long r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.same.net.f.c$a> r0 = r2.f20925d     // Catch:{ all -> 0x002b }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r2)
            return
        L_0x000b:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0013
            monitor-exit(r2)
            return
        L_0x0013:
            java.util.ArrayList<java.lang.Integer> r0 = r2.f20924c     // Catch:{ all -> 0x002b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x002b }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0029
            com.mbridge.msdk.foundation.same.net.f.c$a r0 = new com.mbridge.msdk.foundation.same.net.f.c$a     // Catch:{ all -> 0x002b }
            r0.<init>(r6, r4, r5)     // Catch:{ all -> 0x002b }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.same.net.f.c$a> r4 = r2.f20925d     // Catch:{ all -> 0x002b }
            r4.put(r3, r0)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.p311f.C8539c.mo57964a(java.lang.String, int, java.lang.String, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.mbridge.msdk.foundation.same.net.p311f.C8539c.C8541a m24458a(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.same.net.f.c$a> r0 = r7.f20925d     // Catch:{ all -> 0x0070 }
            boolean r0 = r0.containsKey(r8)     // Catch:{ all -> 0x0070 }
            r1 = 0
            if (r0 == 0) goto L_0x006e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.same.net.f.c$a> r0 = r7.f20925d     // Catch:{ all -> 0x0070 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0070 }
            com.mbridge.msdk.foundation.same.net.f.c$a r0 = (com.mbridge.msdk.foundation.same.net.p311f.C8539c.C8541a) r0     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x006e
            int r2 = r0.f20927b     // Catch:{ all -> 0x0070 }
            r3 = -1
            if (r2 != r3) goto L_0x001b
            monitor-exit(r7)
            return r0
        L_0x001b:
            long r2 = r0.f20926a     // Catch:{ all -> 0x0070 }
            int r4 = r7.f20923b     // Catch:{ all -> 0x0070 }
            long r4 = (long) r4     // Catch:{ all -> 0x0070 }
            long r2 = r2 + r4
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0070 }
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x006c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.same.net.f.c$a> r0 = r7.f20925d     // Catch:{ all -> 0x0070 }
            r0.remove(r8)     // Catch:{ all -> 0x0070 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.same.net.f.c$a> r8 = r7.f20925d     // Catch:{ all -> 0x0070 }
            int r8 = r8.size()     // Catch:{ all -> 0x0070 }
            if (r8 <= 0) goto L_0x006a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.same.net.f.c$a> r8 = r7.f20925d     // Catch:{ all -> 0x0070 }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x0070 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0070 }
        L_0x0040:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0070 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0070 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0070 }
            com.mbridge.msdk.foundation.same.net.f.c$a r2 = (com.mbridge.msdk.foundation.same.net.p311f.C8539c.C8541a) r2     // Catch:{ all -> 0x0070 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0070 }
            long r5 = r2.f20926a     // Catch:{ all -> 0x0070 }
            long r3 = r3 - r5
            int r2 = r7.f20923b     // Catch:{ all -> 0x0070 }
            long r5 = (long) r2     // Catch:{ all -> 0x0070 }
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0040
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.same.net.f.c$a> r2 = r7.f20925d     // Catch:{ all -> 0x0070 }
            java.lang.Object r0 = r0.getKey()     // Catch:{ all -> 0x0070 }
            r2.remove(r0)     // Catch:{ all -> 0x0070 }
            goto L_0x0040
        L_0x006a:
            monitor-exit(r7)
            return r1
        L_0x006c:
            monitor-exit(r7)
            return r0
        L_0x006e:
            monitor-exit(r7)
            return r1
        L_0x0070:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.p311f.C8539c.m24458a(java.lang.String):com.mbridge.msdk.foundation.same.net.f.c$a");
    }

    /* renamed from: a */
    public final C8557k mo57963a(C8550d dVar) {
        int parseInt;
        String str = dVar.mo57982b().get("app_id");
        String str2 = dVar.mo57982b().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        String str3 = dVar.mo57982b().get("ad_type");
        String str4 = dVar.mo57982b().get("token");
        String str5 = str + "_" + dVar.mo57982b().get(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID) + "_" + str2 + "_" + str3;
        C8541a a = m24458a(str5);
        if (a != null && !TextUtils.isEmpty(a.f20928c)) {
            try {
                if (a.f20927b != -1) {
                    return C8557k.m24541a(new JSONObject(a.f20928c), new C8535c(200, a.f20928c.getBytes(), (List<C8513b>) null));
                }
                if (!(!TextUtils.isEmpty(str4) || str3 == null || TextUtils.isEmpty(str3) || (parseInt = Integer.parseInt(str3)) == 287 || parseInt == 94)) {
                    if (System.currentTimeMillis() < ((long) (C2445b.m6020a().mo16290d(str, str2).mo16332v() * 1000)) + a.f20926a) {
                        return C8557k.m24541a(new JSONObject(a.f20928c), new C8535c(200, a.f20928c.getBytes(), (List<C8513b>) null));
                    }
                    this.f20925d.remove(str5);
                    return null;
                }
            } catch (Exception e) {
                C8672v.m24878d("IDErrorUtil", e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: com.mbridge.msdk.foundation.same.net.f.c$a */
    /* compiled from: RequestControlUtil */
    private static class C8541a {

        /* renamed from: a */
        public long f20926a;

        /* renamed from: b */
        public int f20927b;

        /* renamed from: c */
        public String f20928c;

        public C8541a(long j, int i, String str) {
            this.f20926a = j;
            this.f20927b = i;
            this.f20928c = str;
        }
    }
}
