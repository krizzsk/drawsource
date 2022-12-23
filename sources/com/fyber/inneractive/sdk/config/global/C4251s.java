package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.config.global.features.C4225a;
import com.fyber.inneractive.sdk.config.global.features.C4226b;
import com.fyber.inneractive.sdk.config.global.features.C4227c;
import com.fyber.inneractive.sdk.config.global.features.C4228d;
import com.fyber.inneractive.sdk.config.global.features.C4229e;
import com.fyber.inneractive.sdk.config.global.features.C4230f;
import com.fyber.inneractive.sdk.config.global.features.C4231g;
import com.fyber.inneractive.sdk.config.global.features.C4232h;
import com.fyber.inneractive.sdk.config.global.features.C4233i;
import com.fyber.inneractive.sdk.config.global.features.C4234j;
import com.fyber.inneractive.sdk.flow.C4349d;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.global.s */
public class C4251s {

    /* renamed from: a */
    public final C4250r f10452a = new C4250r();

    /* renamed from: b */
    public String f10453b = "";

    /* renamed from: c */
    public Map<Class, C4229e> f10454c;

    /* renamed from: d */
    public JSONArray f10455d;

    public C4251s() {
        mo24270e();
        Map<Class, C4229e> a = mo24265a();
        this.f10454c = a;
        IAlog.m16446a("%s: created. Supported features: %s", "SupportedFeaturesProvider", a);
    }

    /* renamed from: b */
    public static C4251s m13278b() {
        return new C4251s();
    }

    /* renamed from: a */
    public Map<Class, C4229e> mo24265a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f10454c.entrySet()) {
            hashMap.put(next.getKey(), ((C4229e) next.getValue()).mo24234b());
        }
        return hashMap;
    }

    /* renamed from: c */
    public JSONArray mo24268c() {
        if (this.f10455d == null) {
            JSONArray a = C4239g.m13247a(this.f10454c, false);
            this.f10455d = a;
            IAlog.m16446a("%s: active experiments json set = %s", "SupportedFeaturesProvider", a);
        }
        return this.f10455d;
    }

    /* renamed from: d */
    public JSONArray mo24269d() {
        JSONArray a = C4239g.m13247a(this.f10454c, true);
        IAlog.m16446a("%s: active experiments json set = %s", "SupportedFeaturesProvider", a);
        return a;
    }

    /* renamed from: e */
    public void mo24270e() {
        this.f10452a.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(C4234j.class, new C4234j());
        hashMap.put(C4226b.class, new C4226b());
        hashMap.put(C4225a.class, new C4225a());
        hashMap.put(C4232h.class, new C4232h());
        hashMap.put(C4228d.class, new C4228d());
        hashMap.put(C4231g.class, new C4231g());
        hashMap.put(C4227c.class, new C4227c());
        hashMap.put(C4233i.class, new C4233i());
        hashMap.put(C4230f.class, new C4230f());
        this.f10454c = hashMap;
        this.f10455d = null;
    }

    /* renamed from: a */
    public void mo24266a(C4223e eVar) {
        for (C4229e next : this.f10454c.values()) {
            List<C4220b> list = next.f10425c;
            for (int size = list.size() - 1; size >= 0; size--) {
                C4220b bVar = list.get(size);
                List<C4222d> list2 = bVar.f10415d;
                if (list2 != null) {
                    Iterator<C4222d> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C4222d next2 = it.next();
                        if (next2.mo24231a(eVar)) {
                            next.f10425c.remove(bVar);
                            next.f10426d.remove(bVar.f10412a);
                            this.f10455d = null;
                            IAlog.m16446a("%s: Experiment %s filtered! after response %s", "SupportedFeaturesProvider", bVar.f10412a, next2);
                            break;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public <T extends C4229e> T mo24264a(Class<T> cls) {
        if (this.f10454c.containsKey(cls)) {
            return (C4229e) this.f10454c.get(cls);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0138, code lost:
        r5 = r8;
        r12 = 3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24267a(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r0.f10453b = r1
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = com.fyber.inneractive.sdk.config.IAConfigManager.f10324J
            com.fyber.inneractive.sdk.config.global.a r1 = r1.f10360z
            r1.f10411b = r0
            java.util.Map<java.lang.Class, com.fyber.inneractive.sdk.config.global.features.e> r2 = r0.f10454c
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0016:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01fa
            java.lang.Object r3 = r2.next()
            com.fyber.inneractive.sdk.config.global.features.e r3 = (com.fyber.inneractive.sdk.config.global.features.C4229e) r3
            com.fyber.inneractive.sdk.config.global.l r4 = r1.f10410a
            if (r3 == 0) goto L_0x0016
            if (r4 == 0) goto L_0x0016
            java.lang.String r5 = r3.f10424b
            com.fyber.inneractive.sdk.config.global.q r4 = r4.mo24257a((java.lang.String) r5)
            r5 = 2
            java.lang.String r6 = "a"
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L_0x01eb
            com.fyber.inneractive.sdk.config.global.n r9 = r4.f10449a
            r3.f10449a = r9
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r7] = r6
            r9[r8] = r3
            java.lang.String r10 = "%s: Feature before variant merge: %s"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r10, r9)
            java.util.Map<java.lang.String, com.fyber.inneractive.sdk.config.global.b> r4 = r4.f10451c
            java.util.Set r9 = r4.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x004e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01eb
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r4.get(r10)
            com.fyber.inneractive.sdk.config.global.b r10 = (com.fyber.inneractive.sdk.config.global.C4220b) r10
            if (r10 == 0) goto L_0x004e
            java.util.Random r11 = new java.util.Random
            r11.<init>()
            r12 = 100
            int r11 = r11.nextInt(r12)
            int r11 = r11 + r8
            int r13 = r10.f10413b
            r14 = 4
            r15 = 3
            if (r13 >= r11) goto L_0x0093
            java.lang.Object[] r13 = new java.lang.Object[r14]
            r13[r7] = r6
            java.lang.String r14 = r10.f10412a
            r13[r8] = r14
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13[r5] = r11
            int r11 = r10.f10413b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13[r15] = r11
            java.lang.String r11 = "%s: Experiment '%s' filtered! rand: %d, with perc: %d"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r11, r13)
            r5 = r8
            r12 = r15
            goto L_0x015a
        L_0x0093:
            java.util.List<com.fyber.inneractive.sdk.config.global.d> r13 = r10.f10415d
            if (r13 == 0) goto L_0x00ed
            java.util.Iterator r13 = r13.iterator()
        L_0x009b:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L_0x00ed
            java.lang.Object r16 = r13.next()
            r12 = r16
            com.fyber.inneractive.sdk.config.global.d r12 = (com.fyber.inneractive.sdk.config.global.C4222d) r12
            com.fyber.inneractive.sdk.config.IAConfigManager r14 = com.fyber.inneractive.sdk.config.IAConfigManager.f10324J     // Catch:{ NumberFormatException -> 0x00de }
            java.lang.String r14 = r14.f10338d     // Catch:{ NumberFormatException -> 0x00de }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ NumberFormatException -> 0x00de }
            com.fyber.inneractive.sdk.config.global.e r5 = new com.fyber.inneractive.sdk.config.global.e     // Catch:{ NumberFormatException -> 0x00de }
            r5.<init>()     // Catch:{ NumberFormatException -> 0x00de }
            r5.f10419b = r14     // Catch:{ NumberFormatException -> 0x00de }
            com.fyber.inneractive.sdk.config.global.s r14 = r1.f10411b     // Catch:{ NumberFormatException -> 0x00de }
            java.lang.String r14 = r14.f10453b     // Catch:{ NumberFormatException -> 0x00de }
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r14 = com.fyber.inneractive.sdk.serverapi.C5240a.m16396a((java.lang.String) r14)     // Catch:{ NumberFormatException -> 0x00de }
            r5.f10420c = r14     // Catch:{ NumberFormatException -> 0x00de }
            boolean r5 = r12.mo24231a(r5)     // Catch:{ NumberFormatException -> 0x00de }
            if (r5 == 0) goto L_0x00d9
            java.lang.String r5 = "%s: Experiment '%s' filtered! with %s"
            java.lang.Object[] r14 = new java.lang.Object[r15]     // Catch:{ NumberFormatException -> 0x00de }
            r14[r7] = r6     // Catch:{ NumberFormatException -> 0x00de }
            java.lang.String r15 = r10.f10412a     // Catch:{ NumberFormatException -> 0x00de }
            r14[r8] = r15     // Catch:{ NumberFormatException -> 0x00de }
            r15 = 2
            r14[r15] = r12     // Catch:{ NumberFormatException -> 0x00de }
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r5, r14)     // Catch:{ NumberFormatException -> 0x00de }
            goto L_0x0138
        L_0x00d9:
            r5 = 2
            r12 = 100
            r14 = 4
            goto L_0x009b
        L_0x00de:
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r5[r7] = r6
            java.lang.String r12 = "%s: invalid publisherId"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r12, r5)
            r5 = 2
            r12 = 100
            r14 = 4
            r15 = 3
            goto L_0x009b
        L_0x00ed:
            boolean r5 = r3 instanceof com.fyber.inneractive.sdk.config.global.features.C4234j
            if (r5 == 0) goto L_0x013b
            java.util.List<com.fyber.inneractive.sdk.config.global.k> r5 = r10.f10414c
            java.util.Iterator r5 = r5.iterator()
        L_0x00f7:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x013b
            java.lang.Object r12 = r5.next()
            com.fyber.inneractive.sdk.config.global.k r12 = (com.fyber.inneractive.sdk.config.global.C4243k) r12
            com.fyber.inneractive.sdk.config.global.n r13 = r12.f10449a
            if (r13 == 0) goto L_0x011d
            java.util.Map r13 = r13.mo24261a()
            if (r13 == 0) goto L_0x011d
            com.fyber.inneractive.sdk.config.global.n r12 = r12.f10449a
            java.util.Map r12 = r12.mo24261a()
            java.lang.String r13 = "use_fmp_cache_mechanism"
            boolean r12 = r12.containsKey(r13)
            if (r12 == 0) goto L_0x011d
            r12 = r8
            goto L_0x011e
        L_0x011d:
            r12 = r7
        L_0x011e:
            if (r12 == 0) goto L_0x00f7
            com.fyber.inneractive.sdk.util.u r12 = com.fyber.inneractive.sdk.util.C5317u.Video
            com.fyber.inneractive.sdk.config.IAConfigManager r13 = com.fyber.inneractive.sdk.config.IAConfigManager.f10324J
            java.util.Map<com.fyber.inneractive.sdk.util.u, com.fyber.inneractive.sdk.util.t> r13 = r13.f10333H
            java.lang.Object r12 = r13.get(r12)
            com.fyber.inneractive.sdk.util.t r12 = (com.fyber.inneractive.sdk.util.C5315t) r12
            if (r12 == 0) goto L_0x0135
            java.lang.String r13 = "vid_cache"
            boolean r12 = r12.mo24630a(r13)
            goto L_0x0136
        L_0x0135:
            r12 = r7
        L_0x0136:
            if (r12 != 0) goto L_0x00f7
        L_0x0138:
            r5 = r8
            r12 = 3
            goto L_0x015a
        L_0x013b:
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r7] = r6
            java.lang.String r12 = r10.f10412a
            r5[r8] = r12
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 2
            r5[r12] = r11
            int r11 = r10.f10413b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 3
            r5[r12] = r11
            java.lang.String r11 = "%s: Experiment '%s' NOT filtered! rand: %d, with perc: %d"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r11, r5)
            r5 = r7
        L_0x015a:
            if (r5 != 0) goto L_0x01e8
            java.util.List<com.fyber.inneractive.sdk.config.global.k> r5 = r10.f10414c
            java.util.Random r11 = new java.util.Random
            r11.<init>()
            r13 = 100
            int r11 = r11.nextInt(r13)
            int r11 = r11 + r8
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r7] = r6
            java.lang.String r12 = r10.f10412a
            r13[r8] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r14 = 2
            r13[r14] = r12
            java.lang.String r12 = "%s: selectVariant for experiment '%s' generated random number: %d"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r12, r13)
            java.util.Iterator r5 = r5.iterator()
            r12 = r7
        L_0x0183:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L_0x01b2
            java.lang.Object r13 = r5.next()
            com.fyber.inneractive.sdk.config.global.k r13 = (com.fyber.inneractive.sdk.config.global.C4243k) r13
            int r15 = r13.f10446c
            int r12 = r12 + r15
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r15[r7] = r6
            r15[r8] = r13
            java.lang.String r8 = "%s: selectVariant variant found: %s"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r8, r15)
            if (r12 < r11) goto L_0x01a1
            r14 = 1
            goto L_0x01b4
        L_0x01a1:
            java.lang.Object[] r8 = new java.lang.Object[r14]
            r8[r7] = r6
            java.lang.String r13 = r13.f10445b
            r14 = 1
            r8[r14] = r13
            java.lang.String r13 = "%s: selectVariant variant '%s' percentage outside selected range"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r13, r8)
            r8 = r14
            r14 = 2
            goto L_0x0183
        L_0x01b2:
            r14 = r8
            r13 = 0
        L_0x01b4:
            if (r13 == 0) goto L_0x01c8
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r7] = r6
            java.lang.String r8 = r10.f10412a
            r5[r14] = r8
            r8 = 2
            r5[r8] = r13
            java.lang.String r11 = "%s: experiment '%s' variant selected! %s"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r11, r5)
            goto L_0x01d6
        L_0x01c8:
            r8 = 2
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r5[r7] = r6
            java.lang.String r8 = r10.f10412a
            r5[r14] = r8
            java.lang.String r8 = "%s: experiment '%s' no variant was selected! using control group"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r8, r5)
        L_0x01d6:
            java.util.List<com.fyber.inneractive.sdk.config.global.b> r5 = r3.f10425c
            r5.add(r10)
            if (r13 == 0) goto L_0x01e4
            java.util.Map<java.lang.String, com.fyber.inneractive.sdk.config.global.k> r5 = r3.f10426d
            java.lang.String r8 = r10.f10412a
            r5.put(r8, r13)
        L_0x01e4:
            r5 = 2
            r8 = 1
            goto L_0x004e
        L_0x01e8:
            r5 = 2
            goto L_0x004e
        L_0x01eb:
            r4 = r5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r7] = r6
            r5 = 1
            r4[r5] = r3
            java.lang.String r3 = "%s: Feature after variant merge: %s"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r3, r4)
            goto L_0x0016
        L_0x01fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.global.C4251s.mo24267a(java.lang.String):void");
    }

    /* renamed from: a */
    public static JSONArray m13277a(C4349d dVar, C4361j<?> jVar) {
        C4251s sVar;
        C4251s sVar2;
        if (dVar != null && (sVar2 = dVar.f10681f) != null) {
            return sVar2.mo24268c();
        }
        if (jVar == null || (sVar = jVar.f10714c) == null) {
            return null;
        }
        return sVar.mo24268c();
    }
}
