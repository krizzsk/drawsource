package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.o1 */
public class C5141o1 extends C5135m1<C5138n1, C5138n1> {
    /* renamed from: a */
    public void mo26092a(Object obj, int i, int i2) {
        ((C5138n1) obj).mo26120a(C5169t1.m16117a(i, 5), (Object) Integer.valueOf(i2));
    }

    /* renamed from: a */
    public boolean mo26097a(C5078e1 e1Var) {
        return false;
    }

    /* renamed from: b */
    public void mo26100b(Object obj, int i, long j) {
        ((C5138n1) obj).mo26120a(C5169t1.m16117a(i, 0), (Object) Long.valueOf(j));
    }

    /* renamed from: c */
    public int mo26103c(Object obj) {
        return ((C5138n1) obj).mo26123b();
    }

    /* renamed from: d */
    public int mo26105d(Object obj) {
        C5138n1 n1Var = (C5138n1) obj;
        int i = n1Var.f13650d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < n1Var.f13647a; i3++) {
            int i4 = n1Var.f13648b[i3];
            int i5 = C5169t1.f13694a;
            i2 += (C5125l.m15781b(1) * 2) + C5125l.m15793f(2, i4 >>> 3) + C5125l.m15772a(3, (C5093i) n1Var.f13649c[i3]);
        }
        n1Var.f13650d = i2;
        return i2;
    }

    /* renamed from: e */
    public void mo26106e(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.f13651e = false;
    }

    /* renamed from: f */
    public Object mo26107f(Object obj) {
        C5138n1 n1Var = (C5138n1) obj;
        n1Var.f13651e = false;
        return n1Var;
    }

    /* renamed from: a */
    public void mo26093a(Object obj, int i, long j) {
        ((C5138n1) obj).mo26120a(C5169t1.m16117a(i, 1), (Object) Long.valueOf(j));
    }

    /* renamed from: b */
    public void mo26102b(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (C5138n1) obj2;
    }

    /* renamed from: c */
    public void mo26104c(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (C5138n1) obj2;
    }

    /* renamed from: a */
    public void mo26095a(Object obj, int i, Object obj2) {
        ((C5138n1) obj).mo26120a(C5169t1.m16117a(i, 3), (Object) (C5138n1) obj2);
    }

    /* renamed from: b */
    public void mo26101b(Object obj, C5184u1 u1Var) throws IOException {
        ((C5138n1) obj).mo26121a(u1Var);
    }

    /* renamed from: a */
    public void mo26094a(Object obj, int i, C5093i iVar) {
        ((C5138n1) obj).mo26120a(C5169t1.m16117a(i, 2), (Object) iVar);
    }

    /* renamed from: b */
    public Object mo26099b(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* renamed from: a */
    public Object mo26091a(Object obj, Object obj2) {
        C5138n1 n1Var = (C5138n1) obj;
        C5138n1 n1Var2 = (C5138n1) obj2;
        return n1Var2.equals(C5138n1.f13646f) ? n1Var : C5138n1.m15914a(n1Var, n1Var2);
    }

    /* renamed from: a */
    public void mo26096a(Object obj, C5184u1 u1Var) throws IOException {
        C5138n1 n1Var = (C5138n1) obj;
        n1Var.getClass();
        u1Var.getClass();
        for (int i = 0; i < n1Var.f13647a; i++) {
            int i2 = n1Var.f13648b[i];
            int i3 = C5169t1.f13694a;
            ((C5133m) u1Var).mo26086a(i2 >>> 3, n1Var.f13649c[i]);
        }
    }

    /* renamed from: a */
    public Object mo26089a() {
        return C5138n1.m15916c();
    }

    /* renamed from: a */
    public Object mo26090a(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C5138n1 n1Var = generatedMessageLite.unknownFields;
        if (n1Var != C5138n1.f13646f) {
            return n1Var;
        }
        C5138n1 c = C5138n1.m15916c();
        generatedMessageLite.unknownFields = c;
        return c;
    }
}
