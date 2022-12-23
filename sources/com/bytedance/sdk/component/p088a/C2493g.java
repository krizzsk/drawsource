package com.bytedance.sdk.component.p088a;

import com.bytedance.sdk.component.p088a.C2488d;
import com.bytedance.sdk.component.p088a.C2514t;
import com.bytedance.sdk.component.p088a.C2517v;
import com.bytedance.sdk.component.p088a.C2522w;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* renamed from: com.bytedance.sdk.component.a.g */
/* compiled from: CallHandler */
class C2493g implements C2522w.C2523a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2497h f5242a;

    /* renamed from: b */
    private final C2516u f5243b;

    /* renamed from: c */
    private final Map<String, C2486b> f5244c = new HashMap();

    /* renamed from: d */
    private final Map<String, C2488d.C2490b> f5245d = new HashMap();

    /* renamed from: e */
    private final List<C2509q> f5246e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Set<C2488d> f5247f = new HashSet();

    /* renamed from: g */
    private final C2505m f5248g;

    /* renamed from: h */
    private final boolean f5249h;

    /* renamed from: i */
    private final boolean f5250i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C2484a f5251j;

    C2493g(C2499j jVar, C2484a aVar, C2517v vVar) {
        this.f5251j = aVar;
        this.f5242a = jVar.f5264d;
        C2516u uVar = new C2516u(vVar, jVar.f5272l, jVar.f5273m);
        this.f5243b = uVar;
        uVar.mo16532a((C2522w.C2523a) this);
        this.f5243b.mo16531a(jVar.f5276p);
        this.f5248g = jVar.f5269i;
        this.f5249h = jVar.f5268h;
        this.f5250i = jVar.f5275o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2496a mo16487a(C2509q qVar, C2492f fVar) throws Exception {
        C2486b bVar = this.f5244c.get(qVar.f5281d);
        if (bVar != null) {
            try {
                C2524x b = m6238b(fVar.f5239b, bVar);
                fVar.f5241d = b;
                if (b == null) {
                    if (this.f5248g != null) {
                        this.f5248g.mo16510a(fVar.f5239b, qVar.f5281d, 1);
                    }
                    C2498i.m6251a("Permission denied, call: " + qVar);
                    throw new C2513s(-1);
                } else if (bVar instanceof C2491e) {
                    C2498i.m6251a("Processing stateless call: " + qVar);
                    return m6234a(qVar, (C2491e) bVar, fVar);
                } else if (bVar instanceof C2487c) {
                    C2498i.m6251a("Processing raw call: " + qVar);
                    return m6232a(qVar, (C2487c) bVar, b);
                }
            } catch (C2517v.C2519a e) {
                C2498i.m6252a("No remote permission config fetched, call pending: " + qVar, e);
                this.f5246e.add(qVar);
                return new C2496a(false, C2525y.m6325a());
            }
        }
        C2488d.C2490b bVar2 = this.f5245d.get(qVar.f5281d);
        if (bVar2 != null) {
            C2488d a = bVar2.mo16485a();
            a.mo16472a(qVar.f5281d);
            C2524x b2 = m6238b(fVar.f5239b, a);
            fVar.f5241d = b2;
            if (b2 != null) {
                C2498i.m6251a("Processing stateful call: " + qVar);
                return m6233a(qVar, a, fVar);
            }
            C2498i.m6251a("Permission denied, call: " + qVar);
            a.mo16481e();
            throw new C2513s(-1);
        }
        C2505m mVar = this.f5248g;
        if (mVar != null) {
            mVar.mo16510a(fVar.f5239b, qVar.f5281d, 2);
        }
        C2498i.m6254b("Received call: " + qVar + ", but not registered.");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16490a(String str, C2491e<?, ?> eVar) {
        eVar.mo16472a(str);
        this.f5244c.put(str, eVar);
        C2498i.m6251a("JsBridge stateless method registered: " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16489a(String str, C2488d.C2490b bVar) {
        this.f5245d.put(str, bVar);
        C2498i.m6251a("JsBridge stateful method registered: " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16488a() {
        for (C2488d f : this.f5247f) {
            f.mo16482f();
        }
        this.f5247f.clear();
        this.f5244c.clear();
        this.f5245d.clear();
        this.f5243b.mo16534b(this);
    }

    /* renamed from: a */
    private C2496a m6234a(C2509q qVar, C2491e eVar, C2492f fVar) throws Exception {
        return new C2496a(true, C2525y.m6326a(this.f5242a.mo16492a(eVar.mo16486a(m6235a(qVar.f5282e, (C2486b) eVar), fVar))));
    }

    /* renamed from: a */
    private C2496a m6233a(final C2509q qVar, final C2488d dVar, C2492f fVar) throws Exception {
        this.f5247f.add(dVar);
        dVar.mo16477a(m6235a(qVar.f5282e, (C2486b) dVar), fVar, new C2488d.C2489a() {
            /* renamed from: a */
            public void mo16483a(Object obj) {
                if (C2493g.this.f5251j != null) {
                    C2493g.this.f5251j.mo16468b(C2525y.m6326a(C2493g.this.f5242a.mo16492a(obj)), qVar);
                    C2493g.this.f5247f.remove(dVar);
                }
            }

            /* renamed from: a */
            public void mo16484a(Throwable th) {
                if (C2493g.this.f5251j != null) {
                    C2493g.this.f5251j.mo16468b(C2525y.m6327a(th), qVar);
                    C2493g.this.f5247f.remove(dVar);
                }
            }
        });
        return new C2496a(false, C2525y.m6325a());
    }

    /* renamed from: a */
    private C2496a m6232a(final C2509q qVar, C2487c cVar, C2524x xVar) throws Exception {
        cVar.mo16474a(qVar, new C2514t(qVar.f5281d, xVar, new C2514t.C2515a() {
        }));
        return new C2496a(false, C2525y.m6325a());
    }

    /* renamed from: a */
    private Object m6235a(String str, C2486b bVar) throws JSONException {
        return this.f5242a.mo16491a(str, m6236a((Object) bVar)[0]);
    }

    /* renamed from: b */
    private C2524x m6238b(String str, C2486b bVar) {
        if (this.f5250i) {
            return C2524x.PRIVATE;
        }
        return this.f5243b.mo16530a(this.f5249h, str, bVar);
    }

    /* renamed from: a */
    private static Type[] m6236a(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }

    /* renamed from: com.bytedance.sdk.component.a.g$a */
    /* compiled from: CallHandler */
    static final class C2496a {

        /* renamed from: a */
        boolean f5257a;

        /* renamed from: b */
        String f5258b;

        private C2496a(boolean z, String str) {
            this.f5257a = z;
            this.f5258b = str;
        }
    }
}
