package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5119j0;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.m0 */
public class C5134m0 implements C5131l0 {
    /* renamed from: a */
    public Map<?, ?> mo26076a(Object obj) {
        return (C5123k0) obj;
    }

    /* renamed from: b */
    public Object mo26077b(Object obj) {
        C5123k0 k0Var = C5123k0.f13627b;
        return k0Var.isEmpty() ? new C5123k0() : new C5123k0(k0Var);
    }

    /* renamed from: c */
    public Map<?, ?> mo26078c(Object obj) {
        return (C5123k0) obj;
    }

    /* renamed from: d */
    public boolean mo26079d(Object obj) {
        return !((C5123k0) obj).f13628a;
    }

    /* renamed from: e */
    public Object mo26080e(Object obj) {
        ((C5123k0) obj).f13628a = false;
        return obj;
    }

    /* renamed from: f */
    public C5119j0.C5120a<?, ?> mo26081f(Object obj) {
        ((C5119j0) obj).getClass();
        return null;
    }

    /* renamed from: a */
    public Object mo26075a(Object obj, Object obj2) {
        C5123k0 k0Var = (C5123k0) obj;
        C5123k0 k0Var2 = (C5123k0) obj2;
        if (!k0Var2.isEmpty()) {
            if (!k0Var.f13628a) {
                k0Var = k0Var.isEmpty() ? new C5123k0() : new C5123k0(k0Var);
            }
            k0Var.mo26033a();
            if (!k0Var2.isEmpty()) {
                k0Var.putAll(k0Var2);
            }
        }
        return k0Var;
    }

    /* renamed from: a */
    public int mo26074a(int i, Object obj, Object obj2) {
        C5123k0 k0Var = (C5123k0) obj;
        C5119j0 j0Var = (C5119j0) obj2;
        if (k0Var.isEmpty()) {
            return 0;
        }
        Iterator it = k0Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        j0Var.getClass();
        C5125l.m15781b(i);
        throw null;
    }
}
