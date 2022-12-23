package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.fyber.inneractive.sdk.protobuf.b1 */
public final class C5066b1 {

    /* renamed from: c */
    public static final C5066b1 f13524c = new C5066b1();

    /* renamed from: a */
    public final C5089g1 f13525a = new C5103i0();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C5083f1<?>> f13526b = new ConcurrentHashMap();

    /* renamed from: a */
    public <T> C5083f1<T> mo25762a(Class<T> cls) {
        C5083f1<T> f1Var;
        Class<?> cls2;
        Charset charset = C5194z.f13762a;
        if (cls != null) {
            C5083f1<T> f1Var2 = (C5083f1) this.f13526b.get(cls);
            if (f1Var2 != null) {
                return f1Var2;
            }
            C5103i0 i0Var = (C5103i0) this.f13525a;
            i0Var.getClass();
            Class<?> cls3 = C5092h1.f13561a;
            if (GeneratedMessageLite.class.isAssignableFrom(cls) || (cls2 = C5092h1.f13561a) == null || cls2.isAssignableFrom(cls)) {
                C5140o0 b = i0Var.f13575a.mo25931b(cls);
                if (!b.mo25796c()) {
                    boolean z = true;
                    if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                        if (b.mo25794a() != C5063a1.PROTO2) {
                            z = false;
                        }
                        if (z) {
                            C5187v0 v0Var = C5191x0.f13758b;
                            C5085g0 g0Var = C5085g0.f13556b;
                            C5135m1<?, ?> m1Var = C5092h1.f13564d;
                            C5152r<?> rVar = C5167t.f13673a;
                            f1Var = C5168t0.m16071a(b, v0Var, g0Var, (C5135m1) m1Var, (C5152r) C5167t.f13673a, C5137n0.f13645b);
                        } else {
                            f1Var = C5168t0.m16071a(b, C5191x0.f13758b, C5085g0.f13556b, (C5135m1) C5092h1.f13564d, (C5152r) null, C5137n0.f13645b);
                        }
                    } else {
                        if (b.mo25794a() != C5063a1.PROTO2) {
                            z = false;
                        }
                        if (z) {
                            C5187v0 v0Var2 = C5191x0.f13757a;
                            C5085g0 g0Var2 = C5085g0.f13555a;
                            C5135m1<?, ?> m1Var2 = C5092h1.f13562b;
                            C5152r<?> rVar2 = C5167t.f13674b;
                            if (rVar2 != null) {
                                f1Var = C5168t0.m16071a(b, v0Var2, g0Var2, (C5135m1) m1Var2, (C5152r) rVar2, C5137n0.f13644a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            f1Var = C5168t0.m16071a(b, C5191x0.f13757a, C5085g0.f13555a, (C5135m1) C5092h1.f13563c, (C5152r) null, C5137n0.f13644a);
                        }
                    }
                } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    C5135m1<?, ?> m1Var3 = C5092h1.f13564d;
                    C5152r<?> rVar3 = C5167t.f13673a;
                    f1Var = new C5183u0<>(m1Var3, C5167t.f13673a, b.mo25795b());
                } else {
                    C5135m1<?, ?> m1Var4 = C5092h1.f13562b;
                    C5152r<?> rVar4 = C5167t.f13674b;
                    if (rVar4 != null) {
                        f1Var = new C5183u0<>(m1Var4, rVar4, b.mo25795b());
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                C5083f1<T> putIfAbsent = this.f13526b.putIfAbsent(cls, f1Var);
                return putIfAbsent != null ? putIfAbsent : f1Var;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        throw new NullPointerException("messageType");
    }
}
