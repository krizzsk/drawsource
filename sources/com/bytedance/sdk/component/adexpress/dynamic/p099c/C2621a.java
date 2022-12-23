package com.bytedance.sdk.component.adexpress.dynamic.p099c;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2616f;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.a */
/* compiled from: ComputeRuler */
public class C2621a {

    /* renamed from: a */
    public Map<String, C2624c> f5684a = new HashMap();

    /* renamed from: b */
    public Map<String, C2624c> f5685b = new HashMap();

    /* renamed from: c */
    public Map<String, C2624c> f5686c = new HashMap();

    /* renamed from: d */
    private double f5687d = Math.random();

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.adexpress.dynamic.p099c.C2621a.C2624c mo17102a(com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h r13, float r14, float r15) {
        /*
            r12 = this;
            com.bytedance.sdk.component.adexpress.dynamic.b.e r0 = r13.mo17082i()
            java.lang.String r0 = r0.mo16879c()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0023
            com.bytedance.sdk.component.adexpress.dynamic.b.e r0 = r13.mo17082i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r0 = r0.mo16882e()
            java.lang.String r0 = r0.mo16900P()
            if (r0 != 0) goto L_0x0023
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r13.<init>(r1, r1)
            return r13
        L_0x0023:
            com.bytedance.sdk.component.adexpress.dynamic.b.e r0 = r13.mo17082i()
            java.lang.String r0 = r0.mo16876b()
            java.lang.String r2 = "creative-playable-bait"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x0039
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r13.<init>(r1, r1)
            return r13
        L_0x0039:
            float r0 = r13.mo17079g()
            float r1 = r13.mo17081h()
            com.bytedance.sdk.component.adexpress.dynamic.b.e r2 = r13.mo17082i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r2 = r2.mo16882e()
            java.lang.String r3 = r2.mo17003r()
            java.lang.String r2 = r2.mo17000q()
            int r4 = r13.mo17085l()
            float r4 = (float) r4
            int r5 = r13.mo17086m()
            float r5 = (float) r5
            float r6 = r13.mo17087n()
            float r7 = r13.mo17088o()
            java.lang.String r8 = "fixed"
            boolean r9 = android.text.TextUtils.equals(r3, r8)
            java.lang.String r10 = "flex"
            java.lang.String r11 = "auto"
            if (r9 == 0) goto L_0x0086
            float r14 = java.lang.Math.min(r0, r14)
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto L_0x00b7
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = r12.mo17105b((com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h) r13, (float) r0, (float) r1)
            float r13 = r13.f5697b
        L_0x0083:
            float r1 = r13 + r7
            goto L_0x00b7
        L_0x0086:
            boolean r9 = android.text.TextUtils.equals(r3, r11)
            if (r9 == 0) goto L_0x009f
            float r14 = r14 - r6
            float r0 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = r12.mo17105b((com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h) r13, (float) r14, (float) r0)
            float r14 = r13.f5696a
            float r14 = r14 + r6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto L_0x00b7
            float r13 = r13.f5697b
            goto L_0x0083
        L_0x009f:
            boolean r3 = android.text.TextUtils.equals(r3, r10)
            if (r3 == 0) goto L_0x00b6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto L_0x00b7
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = r12.mo17105b((com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h) r13, (float) r0, (float) r1)
            float r13 = r13.f5697b
            goto L_0x0083
        L_0x00b6:
            r14 = r0
        L_0x00b7:
            java.lang.String r13 = "scale"
            boolean r13 = android.text.TextUtils.equals(r2, r13)
            if (r13 == 0) goto L_0x00d9
            float r13 = r14 - r4
            float r13 = r13 / r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r13 = r13 + r5
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
            float r13 = r15 - r5
            float r13 = r13 * r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r14 = r13 + r4
            goto L_0x00ed
        L_0x00d7:
            r15 = r13
            goto L_0x00ed
        L_0x00d9:
            boolean r13 = android.text.TextUtils.equals(r2, r8)
            if (r13 == 0) goto L_0x00e5
            float r1 = r1 + r5
            float r15 = java.lang.Math.min(r1, r15)
            goto L_0x00ed
        L_0x00e5:
            boolean r13 = android.text.TextUtils.equals(r2, r10)
            if (r13 == 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            r15 = r1
        L_0x00ed:
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r13.<init>()
            r13.f5696a = r14
            r13.f5697b = r15
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.p099c.C2621a.mo17102a(com.bytedance.sdk.component.adexpress.dynamic.b.h, float, float):com.bytedance.sdk.component.adexpress.dynamic.c.a$c");
    }

    /* renamed from: b */
    public C2624c mo17105b(C2618h hVar, float f, float f2) {
        C2624c cVar = new C2624c();
        if (hVar.mo17082i().mo16882e() == null) {
            return cVar;
        }
        C2624c e = m7009e(hVar, f, f2);
        float f3 = e.f5696a;
        float f4 = e.f5697b;
        cVar.f5696a = Math.min(f3, f);
        cVar.f5697b = Math.min(f4, f2);
        return cVar;
    }

    /* renamed from: e */
    private C2624c m7009e(C2618h hVar, float f, float f2) {
        String str = hVar.mo17066b() + "_" + f + "_" + f2;
        if (this.f5686c.containsKey(str)) {
            return this.f5686c.get(str);
        }
        C2624c f3 = m7011f(hVar, f, f2);
        this.f5686c.put(str, f3);
        return f3;
    }

    /* renamed from: f */
    private C2624c m7011f(C2618h hVar, float f, float f2) {
        new C2624c();
        C2616f e = hVar.mo17082i().mo16882e();
        hVar.mo17082i().mo16879c();
        e.mo16891G();
        float j = e.mo16975j();
        int F = e.mo16890F();
        double E = e.mo16889E();
        int H = e.mo16892H();
        boolean y = e.mo17019y();
        boolean I = e.mo16893I();
        int z = e.mo17020z();
        C2623b bVar = new C2623b();
        bVar.f5691a = j;
        bVar.f5692b = F;
        bVar.f5693c = H;
        bVar.f5694d = E;
        bVar.f5695e = f;
        return m6995a(hVar.mo17082i().mo16879c(), bVar, y, I, z, hVar);
    }

    /* renamed from: a */
    private C2624c m6995a(String str, C2623b bVar, boolean z, boolean z2, int i, C2618h hVar) {
        return C2640l.m7078a(str, hVar.mo17082i().mo16876b(), C2623b.m7019a(bVar).toString(), z, z2, i);
    }

    /* renamed from: c */
    public C2624c mo17106c(C2618h hVar, float f, float f2) {
        if (hVar == null) {
            return null;
        }
        C2624c a = mo17101a(hVar);
        if (a != null && (a.f5696a != 0.0f || a.f5697b != 0.0f)) {
            return a;
        }
        C2624c d = mo17107d(hVar, f, f2);
        m6996a(hVar, d);
        return d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fe  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.adexpress.dynamic.p099c.C2621a.C2624c mo17107d(com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h r19, float r20, float r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r3 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r3.<init>()
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x011a
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 > 0) goto L_0x0016
            goto L_0x011a
        L_0x0016:
            boolean r5 = r19.mo17090q()
            if (r5 == 0) goto L_0x0021
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r1 = r18.mo17102a((com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h) r19, (float) r20, (float) r21)
            return r1
        L_0x0021:
            float r5 = r19.mo17079g()
            float r6 = r19.mo17081h()
            float r7 = r19.mo17087n()
            float r8 = r19.mo17088o()
            com.bytedance.sdk.component.adexpress.dynamic.b.e r9 = r19.mo17082i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r9 = r9.mo16882e()
            java.lang.String r10 = r9.mo17003r()
            java.lang.String r9 = r9.mo17000q()
            java.lang.String r11 = "flex"
            boolean r12 = android.text.TextUtils.equals(r10, r11)
            java.lang.String r13 = "auto"
            if (r12 != 0) goto L_0x0057
            boolean r12 = android.text.TextUtils.equals(r10, r13)
            if (r12 == 0) goto L_0x0052
            goto L_0x0057
        L_0x0052:
            float r5 = java.lang.Math.min(r5, r1)
            goto L_0x0058
        L_0x0057:
            r5 = r1
        L_0x0058:
            float r5 = r5 - r7
            java.lang.String r12 = "scale"
            boolean r12 = android.text.TextUtils.equals(r9, r12)
            if (r12 == 0) goto L_0x0076
            float r12 = r5 / r6
            int r12 = java.lang.Math.round(r12)
            float r12 = (float) r12
            float r12 = r12 + r8
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 <= 0) goto L_0x0089
            float r5 = r2 - r8
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            goto L_0x0088
        L_0x0076:
            boolean r12 = android.text.TextUtils.equals(r9, r13)
            if (r12 != 0) goto L_0x0088
            boolean r12 = android.text.TextUtils.equals(r9, r11)
            if (r12 == 0) goto L_0x0083
            goto L_0x0088
        L_0x0083:
            float r12 = java.lang.Math.min(r6, r2)
            goto L_0x0089
        L_0x0088:
            r12 = r2
        L_0x0089:
            float r12 = r12 - r8
            java.util.List r6 = r19.mo17089p()
            java.util.Iterator r14 = r6.iterator()
            r15 = r4
            r16 = r15
        L_0x0095:
            boolean r17 = r14.hasNext()
            if (r17 == 0) goto L_0x00c3
            java.lang.Object r17 = r14.next()
            r1 = r17
            java.util.List r1 = (java.util.List) r1
            r19 = r14
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r14 = r0.m7001b((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h>) r1, (float) r5, (float) r12)
            boolean r1 = r0.m7003b((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h>) r1)
            if (r1 == 0) goto L_0x00b3
            r1 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 + r1
            goto L_0x00ba
        L_0x00b3:
            float r1 = r14.f5696a
            float r1 = java.lang.Math.max(r15, r1)
            r15 = r1
        L_0x00ba:
            float r1 = r14.f5697b
            float r16 = r16 + r1
            r14 = r19
            r1 = r20
            goto L_0x0095
        L_0x00c3:
            boolean r1 = android.text.TextUtils.equals(r10, r13)
            if (r1 == 0) goto L_0x00ec
            int r1 = r6.size()
            float r1 = (float) r1
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d5
            r15 = r20
            goto L_0x00ed
        L_0x00d5:
            java.util.Iterator r1 = r6.iterator()
        L_0x00d9:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00ed
            java.lang.Object r4 = r1.next()
            java.util.List r4 = (java.util.List) r4
            r0.m7005c((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h>) r4)
            r0.m7001b((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h>) r4, (float) r15, (float) r12)
            goto L_0x00d9
        L_0x00ec:
            r15 = r5
        L_0x00ed:
            boolean r1 = android.text.TextUtils.equals(r9, r13)
            if (r1 == 0) goto L_0x00fe
            int r1 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x00fa
            r12 = r16
            goto L_0x0113
        L_0x00fa:
            r0.m6997a((java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h>>) r6, (float) r15, (float) r12)
            goto L_0x0113
        L_0x00fe:
            java.lang.String r1 = "fixed"
            boolean r1 = android.text.TextUtils.equals(r9, r1)
            if (r1 != 0) goto L_0x010c
            boolean r1 = android.text.TextUtils.equals(r9, r11)
            if (r1 == 0) goto L_0x0113
        L_0x010c:
            int r1 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x0113
            r0.m6997a((java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h>>) r6, (float) r15, (float) r12)
        L_0x0113:
            float r15 = r15 + r7
            float r12 = r12 + r8
            r3.f5696a = r15
            r3.f5697b = r12
            return r3
        L_0x011a:
            r3.f5696a = r4
            r3.f5697b = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.p099c.C2621a.mo17107d(com.bytedance.sdk.component.adexpress.dynamic.b.h, float, float):com.bytedance.sdk.component.adexpress.dynamic.c.a$c");
    }

    /* renamed from: a */
    private void m6997a(List<List<C2618h>> list, float f, float f2) {
        float f3;
        if (list != null && list.size() > 0) {
            boolean z = false;
            for (List<C2618h> a : list) {
                if (m7000a(a, false)) {
                    z = true;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (List next : list) {
                C2622a aVar = new C2622a();
                boolean a2 = m7000a((List<C2618h>) next, !z);
                C2624c b = m7001b((List<C2618h>) next, f, f2);
                if (a2) {
                    f3 = 1.0f;
                } else {
                    f3 = b.f5697b;
                }
                aVar.f5688a = f3;
                aVar.f5689b = !a2;
                arrayList.add(aVar);
            }
            List<C2622a> a3 = C2639k.m7075a(f2, arrayList);
            for (int i = 0; i < list.size(); i++) {
                if (((C2622a) arrayList.get(i)).f5688a != a3.get(i).f5688a) {
                    List list2 = list.get(i);
                    m7005c((List<C2618h>) list2);
                    m7001b((List<C2618h>) list2, f, a3.get(i).f5688a);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m7003b(List<C2618h> list) {
        boolean z;
        List<List<C2618h>> p;
        Iterator<C2618h> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (TextUtils.equals(it.next().mo17082i().mo16882e().mo17003r(), "flex")) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return true;
        }
        Iterator<C2618h> it2 = list.iterator();
        while (true) {
            boolean z2 = false;
            while (true) {
                if (!it2.hasNext()) {
                    return z2;
                }
                C2618h next = it2.next();
                if (TextUtils.equals(next.mo17082i().mo16882e().mo17003r(), "auto") && (p = next.mo17089p()) != null) {
                    Iterator<List<C2618h>> it3 = p.iterator();
                    int i = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            continue;
                            break;
                        }
                        List next2 = it3.next();
                        i++;
                        if (m7003b((List<C2618h>) next2)) {
                            if (i == next2.size()) {
                                z2 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private C2624c m7001b(List<C2618h> list, float f, float f2) {
        C2624c a = mo17103a(list);
        if (a != null && (a.f5696a != 0.0f || a.f5697b != 0.0f)) {
            return a;
        }
        C2624c c = m7004c(list, f, f2);
        m6999a(list, c);
        return c;
    }

    /* renamed from: c */
    private C2624c m7004c(List<C2618h> list, float f, float f2) {
        float f3;
        m7007d(list);
        C2624c cVar = new C2624c();
        ArrayList<C2618h> arrayList = new ArrayList<>();
        ArrayList<C2618h> arrayList2 = new ArrayList<>();
        for (C2618h next : list) {
            C2616f e = next.mo17082i().mo16882e();
            if (e.mo16894J() == 1 || e.mo16894J() == 2) {
                arrayList.add(next);
            }
            if (!(e.mo16894J() == 1 || e.mo16894J() == 2)) {
                arrayList2.add(next);
            }
        }
        for (C2618h c : arrayList) {
            mo17106c(c, f, f2);
        }
        if (arrayList2.size() <= 0) {
            return cVar;
        }
        ArrayList arrayList3 = new ArrayList();
        for (C2618h c2 : arrayList2) {
            arrayList3.add(Float.valueOf(mo17106c(c2, f, f2).f5696a));
        }
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        while (true) {
            f3 = 0.0f;
            if (i >= arrayList2.size()) {
                break;
            }
            C2618h hVar = (C2618h) arrayList2.get(i);
            String r = hVar.mo17082i().mo16882e().mo17003r();
            float g = hVar.mo17079g();
            boolean equals = TextUtils.equals(r, "flex");
            if (TextUtils.equals(r, "auto")) {
                List<List<C2618h>> p = hVar.mo17089p();
                if (p != null && p.size() > 0) {
                    Iterator<List<C2618h>> it = p.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (m7003b(it.next())) {
                                equals = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                equals = false;
            }
            C2622a aVar = new C2622a();
            if (!equals) {
                g = ((Float) arrayList3.get(i)).floatValue();
            }
            aVar.f5688a = g;
            aVar.f5689b = !equals;
            if (equals) {
                f3 = ((Float) arrayList3.get(i)).floatValue();
            }
            aVar.f5690c = f3;
            arrayList4.add(aVar);
            i++;
        }
        m6998a((List<C2622a>) arrayList4, f, (List<C2618h>) arrayList2);
        List<C2622a> a = C2639k.m7075a(f, arrayList4);
        float f4 = 0.0f;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            f4 += a.get(i2).f5688a;
            if (((Float) arrayList3.get(i2)).floatValue() != a.get(i2).f5688a) {
                m7008d((C2618h) arrayList2.get(i2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        int i3 = 0;
        boolean z = false;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            i3++;
            if (!m7002b((C2618h) it2.next())) {
                z = false;
                break;
            } else if (i3 == arrayList2.size()) {
                z = true;
            }
        }
        if (z) {
            f3 = f2;
        }
        ArrayList<C2624c> arrayList5 = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            C2618h hVar2 = (C2618h) arrayList2.get(i4);
            C2624c c3 = mo17106c(hVar2, a.get(i4).f5688a, f2);
            if (!m7002b(hVar2)) {
                f3 = Math.max(f3, c3.f5697b);
            }
            arrayList5.add(c3);
        }
        ArrayList arrayList6 = new ArrayList();
        for (C2624c cVar2 : arrayList5) {
            arrayList6.add(Float.valueOf(cVar2.f5697b));
        }
        if (!z) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                C2618h hVar3 = (C2618h) arrayList2.get(i5);
                if (m7002b(hVar3) && ((Float) arrayList6.get(i5)).floatValue() != f3) {
                    m7008d(hVar3);
                    mo17106c(hVar3, a.get(i5).f5688a, f3);
                }
            }
        }
        cVar.f5696a = f4;
        cVar.f5697b = f3;
        return cVar;
    }

    /* renamed from: b */
    private boolean m7002b(C2618h hVar) {
        if (hVar == null) {
            return false;
        }
        if (TextUtils.equals(hVar.mo17082i().mo16882e().mo17000q(), "flex")) {
            return true;
        }
        return m7006c(hVar);
    }

    /* renamed from: c */
    private boolean m7006c(C2618h hVar) {
        List<List<C2618h>> p;
        if (!hVar.mo17090q() && TextUtils.equals(hVar.mo17082i().mo16882e().mo17000q(), "auto") && (p = hVar.mo17089p()) != null && p.size() > 0) {
            if (p.size() == 1) {
                for (C2618h b : p.get(0)) {
                    if (!m7002b(b)) {
                        return false;
                    }
                }
                return true;
            }
            for (List<C2618h> a : p) {
                if (m7000a(a, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m7000a(List<C2618h> list, boolean z) {
        boolean z2;
        Iterator<C2618h> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            String q = it.next().mo17082i().mo16882e().mo17000q();
            if (!TextUtils.equals(q, "flex") && (!z || !TextUtils.equals(q, "flex"))) {
            }
        }
        z2 = true;
        if (z2) {
            return true;
        }
        for (C2618h c : list) {
            if (m7006c(c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m6998a(List<C2622a> list, float f, List<C2618h> list2) {
        float f2 = 0.0f;
        for (C2622a next : list) {
            if (next.f5689b) {
                f2 += next.f5688a;
            }
        }
        if (f2 > f) {
            int i = 0;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list.get(i2).f5689b && list2.get(i2).mo17092s()) {
                    i++;
                }
            }
            if (i > 0) {
                float ceil = (float) (Math.ceil((double) (((f2 - f) / ((float) i)) * 1000.0f)) / 1000.0d);
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    C2622a aVar = list.get(i3);
                    if (aVar.f5689b && list2.get(i3).mo17092s()) {
                        aVar.f5688a -= ceil;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17104a() {
        this.f5686c.clear();
        this.f5684a.clear();
        this.f5685b.clear();
    }

    /* renamed from: a */
    public C2624c mo17101a(C2618h hVar) {
        return this.f5684a.get(m7010e(hVar));
    }

    /* renamed from: a */
    public C2624c mo17103a(List<C2618h> list) {
        return this.f5685b.get(m7007d(list));
    }

    /* renamed from: d */
    private void m7008d(C2618h hVar) {
        this.f5684a.remove(m7010e(hVar));
        List<List<C2618h>> p = hVar.mo17089p();
        if (p != null && p.size() > 0) {
            for (List<C2618h> c : p) {
                m7005c(c);
            }
        }
    }

    /* renamed from: c */
    private void m7005c(List<C2618h> list) {
        if (list != null && list.size() > 0) {
            this.f5685b.remove(m7007d(list));
            for (C2618h d : list) {
                m7008d(d);
            }
        }
    }

    /* renamed from: e */
    private String m7010e(C2618h hVar) {
        return hVar.mo17066b();
    }

    /* renamed from: d */
    private String m7007d(List<C2618h> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String b = list.get(i).mo17066b();
            if (i < list.size() - 1) {
                sb.append(b);
                sb.append("-");
            } else {
                sb.append(b);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m6996a(C2618h hVar, C2624c cVar) {
        this.f5684a.put(m7010e(hVar), cVar);
    }

    /* renamed from: a */
    private void m6999a(List<C2618h> list, C2624c cVar) {
        this.f5685b.put(m7007d(list), cVar);
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.a$c */
    /* compiled from: ComputeRuler */
    static class C2624c {

        /* renamed from: a */
        float f5696a;

        /* renamed from: b */
        float f5697b;

        public C2624c() {
        }

        public C2624c(float f, float f2) {
            this.f5696a = f;
            this.f5697b = f2;
        }

        public String toString() {
            return "UnitSize{width=" + this.f5696a + ", height=" + this.f5697b + '}';
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.a$b */
    /* compiled from: ComputeRuler */
    static class C2623b {

        /* renamed from: a */
        float f5691a;

        /* renamed from: b */
        int f5692b;

        /* renamed from: c */
        int f5693c;

        /* renamed from: d */
        double f5694d;

        /* renamed from: e */
        float f5695e;

        C2623b() {
        }

        /* renamed from: a */
        static JSONObject m7019a(C2623b bVar) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", (double) bVar.f5691a);
                jSONObject.put("letterSpacing", bVar.f5692b);
                jSONObject.put("lineHeight", bVar.f5694d);
                jSONObject.put("maxWidth", (double) bVar.f5695e);
                jSONObject.put("fontWeight", bVar.f5693c);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.a$a */
    /* compiled from: ComputeRuler */
    static class C2622a implements Cloneable {

        /* renamed from: a */
        float f5688a;

        /* renamed from: b */
        boolean f5689b;

        /* renamed from: c */
        float f5690c;

        C2622a() {
        }

        public Object clone() {
            try {
                return (C2622a) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
