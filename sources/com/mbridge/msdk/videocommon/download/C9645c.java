package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.p078c.C2456d;
import com.mbridge.msdk.videocommon.listener.C9673a;
import com.mbridge.msdk.videocommon.p375d.C9638b;
import com.mbridge.msdk.videocommon.p375d.C9640c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.videocommon.download.c */
/* compiled from: DownLoadManager */
public class C9645c {

    /* renamed from: a */
    private static C9645c f24035a;

    /* renamed from: b */
    private ThreadPoolExecutor f24036b;

    /* renamed from: c */
    private boolean f24037c = false;

    /* renamed from: d */
    private ConcurrentHashMap<String, C9670k> f24038d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private Map<String, List<Map<String, C9641a>>> f24039e;

    /* renamed from: f */
    private Map<String, List<CampaignEx>> f24040f;

    /* renamed from: g */
    private Map<String, List<C9641a>> f24041g;

    private C9645c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 15, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f24036b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static C9645c getInstance() {
        if (f24035a == null) {
            synchronized (C9645c.class) {
                if (f24035a == null) {
                    f24035a = new C9645c();
                }
            }
        }
        return f24035a;
    }

    /* renamed from: a */
    public final C9641a mo63652a(String str, String str2) {
        C9670k c = mo63662c(str);
        if (c != null) {
            return c.mo63688a(str2);
        }
        return null;
    }

    /* renamed from: a */
    public final List<CampaignEx> mo63653a(String str) {
        Map<String, List<CampaignEx>> map = this.f24040f;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f24040f.get(str);
    }

    /* renamed from: b */
    public final List<C9641a> mo63660b(String str) {
        Map<String, List<C9641a>> map = this.f24041g;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f24041g.get(str);
    }

    /* renamed from: c */
    public final C9670k mo63662c(String str) {
        ConcurrentHashMap<String, C9670k> concurrentHashMap = this.f24038d;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f24038d.get(str);
    }

    /* renamed from: a */
    public final boolean mo63656a(int i, String str, boolean z) {
        try {
            C9670k c = mo63662c(str);
            if (c == null || c.mo63687a(i, z) == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo63657a(int i, String str, boolean z, int i2, boolean z2, int i3, List<CampaignEx> list) {
        return mo63658a(i, str, z, i2, z2, i3, list, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0127, code lost:
        if (r5.size() >= r18) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0189, code lost:
        if (r4.size() > 0) goto L_0x018b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0249  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo63658a(int r15, java.lang.String r16, boolean r17, int r18, boolean r19, int r20, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r21, boolean r22) {
        /*
            r14 = this;
            r1 = r14
            r0 = r16
            r8 = r21
            r9 = 0
            if (r8 == 0) goto L_0x024c
            int r2 = r21.size()     // Catch:{ Exception -> 0x0244 }
            if (r2 != 0) goto L_0x0010
            goto L_0x024c
        L_0x0010:
            com.mbridge.msdk.videocommon.download.k r2 = r14.mo63662c(r0)     // Catch:{ Exception -> 0x0244 }
            if (r2 == 0) goto L_0x024c
            r3 = r16
            r4 = r15
            r5 = r17
            r6 = r21
            r7 = r22
            java.util.List r2 = r2.mo63689a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0244 }
            r3 = 1
            if (r2 == 0) goto L_0x018c
            int r4 = r2.size()     // Catch:{ Exception -> 0x0244 }
            if (r4 != 0) goto L_0x002e
            goto L_0x018c
        L_0x002e:
            if (r19 == 0) goto L_0x012e
            int r4 = r21.size()     // Catch:{ Exception -> 0x0244 }
            if (r4 <= 0) goto L_0x0065
            java.lang.Object r4 = r8.get(r9)     // Catch:{ Exception -> 0x0244 }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = (com.mbridge.msdk.foundation.entity.CampaignEx) r4     // Catch:{ Exception -> 0x0244 }
            if (r4 == 0) goto L_0x0065
            java.util.ArrayList r5 = r4.getRsIgnoreCheckRule()     // Catch:{ Exception -> 0x0244 }
            if (r5 == 0) goto L_0x0065
            java.util.ArrayList r5 = r4.getRsIgnoreCheckRule()     // Catch:{ Exception -> 0x0244 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x0244 }
            if (r5 <= 0) goto L_0x0065
            java.util.ArrayList r4 = r4.getRsIgnoreCheckRule()     // Catch:{ Exception -> 0x0244 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0244 }
            boolean r4 = r4.contains(r5)     // Catch:{ Exception -> 0x0244 }
            if (r4 == 0) goto L_0x0065
            java.lang.String r4 = "DownLoadManager"
            java.lang.String r5 = "Is not check video download status with TPL"
            com.mbridge.msdk.foundation.tools.C8672v.m24876b(r4, r5)     // Catch:{ Exception -> 0x0244 }
            r4 = r3
            goto L_0x0066
        L_0x0065:
            r4 = r9
        L_0x0066:
            if (r20 != 0) goto L_0x00ca
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x012a }
            r5.<init>()     // Catch:{ Exception -> 0x012a }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ Exception -> 0x012a }
        L_0x0071:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x012a }
            if (r7 == 0) goto L_0x00bf
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.videocommon.download.a r7 = (com.mbridge.msdk.videocommon.download.C9641a) r7     // Catch:{ Exception -> 0x012a }
            java.util.Iterator r9 = r21.iterator()     // Catch:{ Exception -> 0x012a }
        L_0x0081:
            boolean r10 = r9.hasNext()     // Catch:{ Exception -> 0x012a }
            if (r10 == 0) goto L_0x0071
            java.lang.Object r10 = r9.next()     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = (com.mbridge.msdk.foundation.entity.CampaignEx) r10     // Catch:{ Exception -> 0x012a }
            if (r7 == 0) goto L_0x0081
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r7.mo63640g()     // Catch:{ Exception -> 0x012a }
            if (r11 == 0) goto L_0x0081
            if (r10 == 0) goto L_0x0081
            java.lang.String r11 = r10.getId()     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = r7.mo63640g()     // Catch:{ Exception -> 0x012a }
            java.lang.String r12 = r12.getId()     // Catch:{ Exception -> 0x012a }
            boolean r11 = r11.equals(r12)     // Catch:{ Exception -> 0x012a }
            if (r11 == 0) goto L_0x0081
            java.lang.String r10 = r10.getRequestId()     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r7.mo63640g()     // Catch:{ Exception -> 0x012a }
            java.lang.String r11 = r11.getRequestId()     // Catch:{ Exception -> 0x012a }
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x012a }
            if (r10 == 0) goto L_0x0081
            r5.add(r7)     // Catch:{ Exception -> 0x012a }
            goto L_0x0081
        L_0x00bf:
            int r5 = r5.size()     // Catch:{ Exception -> 0x012a }
            if (r5 <= 0) goto L_0x00c7
            goto L_0x018b
        L_0x00c7:
            r9 = r4
            goto L_0x018c
        L_0x00ca:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x012a }
            r5.<init>()     // Catch:{ Exception -> 0x012a }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ Exception -> 0x012a }
        L_0x00d3:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x012a }
            if (r7 == 0) goto L_0x0121
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.videocommon.download.a r7 = (com.mbridge.msdk.videocommon.download.C9641a) r7     // Catch:{ Exception -> 0x012a }
            java.util.Iterator r10 = r21.iterator()     // Catch:{ Exception -> 0x012a }
        L_0x00e3:
            boolean r11 = r10.hasNext()     // Catch:{ Exception -> 0x012a }
            if (r11 == 0) goto L_0x00d3
            java.lang.Object r11 = r10.next()     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = (com.mbridge.msdk.foundation.entity.CampaignEx) r11     // Catch:{ Exception -> 0x012a }
            if (r7 == 0) goto L_0x00e3
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = r7.mo63640g()     // Catch:{ Exception -> 0x012a }
            if (r12 == 0) goto L_0x00e3
            if (r11 == 0) goto L_0x00e3
            java.lang.String r12 = r11.getId()     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.foundation.entity.CampaignEx r13 = r7.mo63640g()     // Catch:{ Exception -> 0x012a }
            java.lang.String r13 = r13.getId()     // Catch:{ Exception -> 0x012a }
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x012a }
            if (r12 == 0) goto L_0x00e3
            java.lang.String r11 = r11.getRequestId()     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = r7.mo63640g()     // Catch:{ Exception -> 0x012a }
            java.lang.String r12 = r12.getRequestId()     // Catch:{ Exception -> 0x012a }
            boolean r11 = r11.equals(r12)     // Catch:{ Exception -> 0x012a }
            if (r11 == 0) goto L_0x00e3
            r5.add(r7)     // Catch:{ Exception -> 0x012a }
            goto L_0x00e3
        L_0x0121:
            int r4 = r5.size()     // Catch:{ Exception -> 0x012a }
            r5 = r18
            if (r4 < r5) goto L_0x018c
            goto L_0x018b
        L_0x012a:
            r0 = move-exception
            r9 = r4
            goto L_0x0245
        L_0x012e:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0244 }
            r4.<init>()     // Catch:{ Exception -> 0x0244 }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ Exception -> 0x0244 }
        L_0x0137:
            boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x0244 }
            if (r6 == 0) goto L_0x0185
            java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x0244 }
            com.mbridge.msdk.videocommon.download.a r6 = (com.mbridge.msdk.videocommon.download.C9641a) r6     // Catch:{ Exception -> 0x0244 }
            java.util.Iterator r7 = r21.iterator()     // Catch:{ Exception -> 0x0244 }
        L_0x0147:
            boolean r10 = r7.hasNext()     // Catch:{ Exception -> 0x0244 }
            if (r10 == 0) goto L_0x0137
            java.lang.Object r10 = r7.next()     // Catch:{ Exception -> 0x0244 }
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = (com.mbridge.msdk.foundation.entity.CampaignEx) r10     // Catch:{ Exception -> 0x0244 }
            if (r6 == 0) goto L_0x0147
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r6.mo63640g()     // Catch:{ Exception -> 0x0244 }
            if (r11 == 0) goto L_0x0147
            if (r10 == 0) goto L_0x0147
            java.lang.String r11 = r10.getId()     // Catch:{ Exception -> 0x0244 }
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = r6.mo63640g()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r12 = r12.getId()     // Catch:{ Exception -> 0x0244 }
            boolean r11 = r11.equals(r12)     // Catch:{ Exception -> 0x0244 }
            if (r11 == 0) goto L_0x0147
            java.lang.String r10 = r10.getRequestId()     // Catch:{ Exception -> 0x0244 }
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r6.mo63640g()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r11 = r11.getRequestId()     // Catch:{ Exception -> 0x0244 }
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x0244 }
            if (r10 == 0) goto L_0x0147
            r4.add(r6)     // Catch:{ Exception -> 0x0244 }
            goto L_0x0147
        L_0x0185:
            int r4 = r4.size()     // Catch:{ Exception -> 0x0244 }
            if (r4 <= 0) goto L_0x018c
        L_0x018b:
            r9 = r3
        L_0x018c:
            if (r9 == 0) goto L_0x024c
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>>> r3 = r1.f24039e     // Catch:{ Exception -> 0x0244 }
            if (r3 != 0) goto L_0x019a
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x0244 }
            r3.<init>()     // Catch:{ Exception -> 0x0244 }
            r1.f24039e = r3     // Catch:{ Exception -> 0x0244 }
            goto L_0x01a7
        L_0x019a:
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>>> r3 = r1.f24039e     // Catch:{ Exception -> 0x0244 }
            boolean r3 = r3.containsKey(r0)     // Catch:{ Exception -> 0x0244 }
            if (r3 == 0) goto L_0x01a7
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>>> r3 = r1.f24039e     // Catch:{ Exception -> 0x0244 }
            r3.remove(r0)     // Catch:{ Exception -> 0x0244 }
        L_0x01a7:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.videocommon.download.a>> r3 = r1.f24041g     // Catch:{ Exception -> 0x0244 }
            if (r3 != 0) goto L_0x01b3
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x0244 }
            r3.<init>()     // Catch:{ Exception -> 0x0244 }
            r1.f24041g = r3     // Catch:{ Exception -> 0x0244 }
            goto L_0x01c0
        L_0x01b3:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.videocommon.download.a>> r3 = r1.f24041g     // Catch:{ Exception -> 0x0244 }
            boolean r3 = r3.containsKey(r0)     // Catch:{ Exception -> 0x0244 }
            if (r3 == 0) goto L_0x01c0
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.videocommon.download.a>> r3 = r1.f24041g     // Catch:{ Exception -> 0x0244 }
            r3.remove(r0)     // Catch:{ Exception -> 0x0244 }
        L_0x01c0:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>> r3 = r1.f24040f     // Catch:{ Exception -> 0x0244 }
            if (r3 != 0) goto L_0x01cc
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x0244 }
            r3.<init>()     // Catch:{ Exception -> 0x0244 }
            r1.f24040f = r3     // Catch:{ Exception -> 0x0244 }
            goto L_0x01d9
        L_0x01cc:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>> r3 = r1.f24040f     // Catch:{ Exception -> 0x0244 }
            boolean r3 = r3.containsKey(r0)     // Catch:{ Exception -> 0x0244 }
            if (r3 == 0) goto L_0x01d9
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>> r3 = r1.f24040f     // Catch:{ Exception -> 0x0244 }
            r3.remove(r0)     // Catch:{ Exception -> 0x0244 }
        L_0x01d9:
            if (r2 == 0) goto L_0x024c
            int r3 = r2.size()     // Catch:{ Exception -> 0x0244 }
            if (r3 <= 0) goto L_0x024c
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0244 }
            r3.<init>()     // Catch:{ Exception -> 0x0244 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0244 }
            r4.<init>()     // Catch:{ Exception -> 0x0244 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0244 }
            r5.<init>()     // Catch:{ Exception -> 0x0244 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0244 }
        L_0x01f4:
            boolean r6 = r2.hasNext()     // Catch:{ Exception -> 0x0244 }
            if (r6 == 0) goto L_0x0234
            java.lang.Object r6 = r2.next()     // Catch:{ Exception -> 0x0244 }
            com.mbridge.msdk.videocommon.download.a r6 = (com.mbridge.msdk.videocommon.download.C9641a) r6     // Catch:{ Exception -> 0x0244 }
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Exception -> 0x0244 }
            r7.<init>()     // Catch:{ Exception -> 0x0244 }
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = r6.mo63640g()     // Catch:{ Exception -> 0x0244 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0244 }
            r10.<init>()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r11 = r8.getId()     // Catch:{ Exception -> 0x0244 }
            r10.append(r11)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r11 = r8.getVideoUrlEncode()     // Catch:{ Exception -> 0x0244 }
            r10.append(r11)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r11 = r8.getBidToken()     // Catch:{ Exception -> 0x0244 }
            r10.append(r11)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0244 }
            r7.put(r10, r6)     // Catch:{ Exception -> 0x0244 }
            r3.add(r7)     // Catch:{ Exception -> 0x0244 }
            r4.add(r8)     // Catch:{ Exception -> 0x0244 }
            r5.add(r6)     // Catch:{ Exception -> 0x0244 }
            goto L_0x01f4
        L_0x0234:
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>>> r2 = r1.f24039e     // Catch:{ Exception -> 0x0244 }
            r2.put(r0, r3)     // Catch:{ Exception -> 0x0244 }
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>> r2 = r1.f24040f     // Catch:{ Exception -> 0x0244 }
            r2.put(r0, r4)     // Catch:{ Exception -> 0x0244 }
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.videocommon.download.a>> r2 = r1.f24041g     // Catch:{ Exception -> 0x0244 }
            r2.put(r0, r5)     // Catch:{ Exception -> 0x0244 }
            goto L_0x024c
        L_0x0244:
            r0 = move-exception
        L_0x0245:
            boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r2 == 0) goto L_0x024c
            r0.printStackTrace()
        L_0x024c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.C9645c.mo63658a(int, java.lang.String, boolean, int, boolean, int, java.util.List, boolean):boolean");
    }

    public void load(String str) {
        C9670k c = mo63662c(str);
        if (c != null) {
            c.mo63690a();
        }
    }

    public C9670k createUnitCache(Context context, String str, List<CampaignEx> list, int i, C9673a aVar) {
        if (TextUtils.isEmpty(str) || list == null || list.size() == 0) {
            return null;
        }
        if (this.f24038d.containsKey(str)) {
            C9670k kVar = this.f24038d.get(str);
            if (i == 94 || i == 287) {
                kVar.mo63693a(list.get(0).getRequestId(), aVar);
            } else {
                kVar.mo63692a(aVar);
            }
            kVar.mo63694a(list);
            return kVar;
        }
        C9670k kVar2 = new C9670k(context, list, (ExecutorService) this.f24036b, str, i);
        if (aVar != null) {
            kVar2.mo63692a(aVar);
        }
        this.f24038d.put(str, kVar2);
        return kVar2;
    }

    public C9670k createUnitCache(Context context, String str, CampaignEx campaignEx, int i, C9673a aVar) {
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return null;
        }
        if (this.f24038d.containsKey(str)) {
            C9670k kVar = this.f24038d.get(str);
            if (i == 94 || i == 287) {
                kVar.mo63693a(campaignEx.getRequestId(), aVar);
            } else {
                kVar.mo63692a(aVar);
            }
            kVar.mo63691a(campaignEx);
            return kVar;
        }
        C9670k kVar2 = new C9670k(context, campaignEx, (ExecutorService) this.f24036b, str, i);
        if (aVar != null) {
            kVar2.mo63692a(aVar);
        }
        this.f24038d.put(str, kVar2);
        return kVar2;
    }

    /* renamed from: a */
    public final void mo63655a(boolean z) {
        this.f24037c = z;
        ConcurrentHashMap<String, C9670k> concurrentHashMap = this.f24038d;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, C9670k> value : concurrentHashMap.entrySet()) {
                C9670k kVar = (C9670k) value.getValue();
                if (kVar != null) {
                    kVar.mo63696b();
                }
            }
        }
    }

    /* renamed from: b */
    public final int mo63659b(String str, String str2) {
        CopyOnWriteArrayList<Map<String, C9641a>> c;
        C9641a aVar;
        CampaignEx g;
        ConcurrentHashMap<String, C9670k> concurrentHashMap = this.f24038d;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, C9670k> value : concurrentHashMap.entrySet()) {
                C9670k kVar = (C9670k) value.getValue();
                if (!(kVar == null || (c = kVar.mo63698c()) == null)) {
                    int size = c.size();
                    for (int i = 0; i < size; i++) {
                        Map map = c.get(i);
                        if (map != null) {
                            Iterator it = map.entrySet().iterator();
                            if (!(!it.hasNext() || (aVar = (C9641a) ((Map.Entry) it.next()).getValue()) == null || (g = aVar.mo63640g()) == null)) {
                                String videoUrlEncode = g.getVideoUrlEncode();
                                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(videoUrlEncode) && str2.equals(videoUrlEncode)) {
                                    return aVar.mo63639f();
                                }
                            }
                        }
                    }
                    continue;
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo63661b(boolean z) {
        if (!z) {
            this.f24037c = false;
        } else if (this.f24037c) {
            return;
        }
        ConcurrentHashMap<String, C9670k> concurrentHashMap = this.f24038d;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, C9670k> value : concurrentHashMap.entrySet()) {
                ((C9670k) value.getValue()).mo63690a();
            }
        }
    }

    /* renamed from: a */
    public final void mo63654a() {
        ConcurrentHashMap<String, C9670k> concurrentHashMap = this.f24038d;
        if (concurrentHashMap != null) {
            for (Map.Entry next : concurrentHashMap.entrySet()) {
                C9670k kVar = (C9670k) next.getValue();
                String str = (String) next.getKey();
                try {
                    Class.forName("com.mbridge.msdk.videocommon.d.a");
                    C9640c a = C9638b.m27377a().mo63550a(C8388a.m23845e().mo56914h(), str);
                    if (a != null) {
                        if (a.mo63608u() == 2) {
                            kVar.mo63696b();
                        } else {
                            kVar.mo63690a();
                        }
                    }
                } catch (Exception e) {
                    C8672v.m24878d("DownLoadManager", e.getMessage());
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            C2456d e2 = C2445b.m6020a().mo16292e(C8388a.m23845e().mo56914h(), str);
                            if (e2 == null) {
                                e2 = C2456d.m6071e(str);
                            }
                            if (e2.mo16320j() == 2) {
                                kVar.mo63696b();
                            } else {
                                kVar.mo63690a();
                            }
                        }
                    } catch (Exception e3) {
                        C8672v.m24878d("DownLoadManager", e3.getMessage());
                    }
                }
            }
        }
    }
}
