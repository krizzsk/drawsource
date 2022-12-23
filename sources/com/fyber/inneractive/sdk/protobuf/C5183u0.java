package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5068c0;
import com.fyber.inneractive.sdk.protobuf.C5169t1;
import com.fyber.inneractive.sdk.protobuf.C5181u;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.u0 */
public final class C5183u0<T> implements C5083f1<T> {

    /* renamed from: a */
    public final C5149q0 f13737a;

    /* renamed from: b */
    public final C5135m1<?, ?> f13738b;

    /* renamed from: c */
    public final boolean f13739c;

    /* renamed from: d */
    public final C5152r<?> f13740d;

    public C5183u0(C5135m1<?, ?> m1Var, C5152r<?> rVar, C5149q0 q0Var) {
        this.f13738b = m1Var;
        this.f13739c = rVar.mo26152a(q0Var);
        this.f13740d = rVar;
        this.f13737a = q0Var;
    }

    /* renamed from: a */
    public T mo25868a() {
        return ((GeneratedMessageLite.C5050a) this.f13737a.newBuilderForType()).mo25736b();
    }

    /* renamed from: b */
    public boolean mo25875b(T t, T t2) {
        if (!this.f13738b.mo26099b(t).equals(this.f13738b.mo26099b(t2))) {
            return false;
        }
        if (this.f13739c) {
            return this.f13740d.mo26146a((Object) t).equals(this.f13740d.mo26146a((Object) t2));
        }
        return true;
    }

    /* renamed from: c */
    public void mo25876c(T t) {
        this.f13738b.mo26106e(t);
        this.f13740d.mo26154c(t);
    }

    /* renamed from: d */
    public int mo25877d(T t) {
        int hashCode = this.f13738b.mo26099b(t).hashCode();
        return this.f13739c ? (hashCode * 53) + this.f13740d.mo26146a((Object) t).f13734a.hashCode() : hashCode;
    }

    /* renamed from: a */
    public void mo25871a(T t, T t2) {
        C5135m1<?, ?> m1Var = this.f13738b;
        Class<?> cls = C5092h1.f13561a;
        m1Var.mo26104c(t, m1Var.mo26091a(m1Var.mo26099b(t), m1Var.mo26099b(t2)));
        if (this.f13739c) {
            C5152r<?> rVar = this.f13740d;
            C5181u<?> a = rVar.mo26146a((Object) t2);
            if (!a.f13734a.isEmpty()) {
                rVar.mo26153b(t).mo26204a(a);
            }
        }
    }

    /* renamed from: b */
    public int mo25874b(T t) {
        C5135m1<?, ?> m1Var = this.f13738b;
        int d = m1Var.mo26105d(m1Var.mo26099b(t)) + 0;
        return this.f13739c ? d + this.f13740d.mo26146a((Object) t).mo26205c() : d;
    }

    /* renamed from: a */
    public void mo25870a(T t, C5184u1 u1Var) throws IOException {
        Iterator<Map.Entry<?, Object>> f = this.f13740d.mo26146a((Object) t).mo26213f();
        while (f.hasNext()) {
            Map.Entry next = f.next();
            C5181u.C5182a aVar = (C5181u.C5182a) next.getKey();
            if (aVar.mo25744d() != C5169t1.C5176c.MESSAGE || aVar.mo25741b() || aVar.mo25745e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C5068c0.C5069a) {
                ((C5133m) u1Var).mo26086a(aVar.mo25739a(), (Object) ((C5068c0.C5069a) next).f13528a.getValue().mo25792a());
            } else {
                ((C5133m) u1Var).mo26086a(aVar.mo25739a(), next.getValue());
            }
        }
        C5135m1<?, ?> m1Var = this.f13738b;
        m1Var.mo26096a(m1Var.mo26099b(t), u1Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25872a(T r11, byte[] r12, int r13, int r14, com.fyber.inneractive.sdk.protobuf.C5075e.C5076a r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r0 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite) r0
            com.fyber.inneractive.sdk.protobuf.n1 r1 = r0.unknownFields
            com.fyber.inneractive.sdk.protobuf.n1 r2 = com.fyber.inneractive.sdk.protobuf.C5138n1.f13646f
            if (r1 != r2) goto L_0x000f
            com.fyber.inneractive.sdk.protobuf.n1 r1 = com.fyber.inneractive.sdk.protobuf.C5138n1.m15916c()
            r0.unknownFields = r1
        L_0x000f:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.ExtendableMessage) r11
            com.fyber.inneractive.sdk.protobuf.u r11 = r11.ensureExtensionsAreMutable()
            r0 = 0
            r2 = r0
        L_0x0017:
            if (r13 >= r14) goto L_0x00c5
            int r4 = com.fyber.inneractive.sdk.protobuf.C5075e.m15309d(r12, r13, r15)
            int r13 = r15.f13541a
            int r3 = com.fyber.inneractive.sdk.protobuf.C5169t1.f13694a
            r5 = 2
            if (r13 == r3) goto L_0x0061
            r3 = r13 & 7
            if (r3 != r5) goto L_0x005c
            com.fyber.inneractive.sdk.protobuf.r<?> r2 = r10.f13740d
            com.fyber.inneractive.sdk.protobuf.q r3 = r15.f13544d
            com.fyber.inneractive.sdk.protobuf.q0 r5 = r10.f13737a
            int r6 = r13 >>> 3
            java.lang.Object r2 = r2.mo26148a(r3, r5, r6)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d r8 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C5053d) r8
            if (r8 == 0) goto L_0x0051
            com.fyber.inneractive.sdk.protobuf.b1 r13 = com.fyber.inneractive.sdk.protobuf.C5066b1.f13524c
            com.fyber.inneractive.sdk.protobuf.q0 r2 = r8.f13497c
            java.lang.Class r2 = r2.getClass()
            com.fyber.inneractive.sdk.protobuf.f1 r13 = r13.mo25762a(r2)
            int r13 = com.fyber.inneractive.sdk.protobuf.C5075e.m15300a((com.fyber.inneractive.sdk.protobuf.C5083f1) r13, (byte[]) r12, (int) r4, (int) r14, (com.fyber.inneractive.sdk.protobuf.C5075e.C5076a) r15)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r8.f13498d
            java.lang.Object r3 = r15.f13543c
            r11.mo26206c(r2, r3)
            goto L_0x005a
        L_0x0051:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.fyber.inneractive.sdk.protobuf.C5075e.m15295a((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.fyber.inneractive.sdk.protobuf.C5138n1) r6, (com.fyber.inneractive.sdk.protobuf.C5075e.C5076a) r7)
        L_0x005a:
            r2 = r8
            goto L_0x0017
        L_0x005c:
            int r13 = com.fyber.inneractive.sdk.protobuf.C5075e.m15294a((int) r13, (byte[]) r12, (int) r4, (int) r14, (com.fyber.inneractive.sdk.protobuf.C5075e.C5076a) r15)
            goto L_0x0017
        L_0x0061:
            r13 = 0
            r3 = r0
        L_0x0063:
            if (r4 >= r14) goto L_0x00b9
            int r4 = com.fyber.inneractive.sdk.protobuf.C5075e.m15309d(r12, r4, r15)
            int r6 = r15.f13541a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto L_0x009a
            r9 = 3
            if (r7 == r9) goto L_0x0075
            goto L_0x00af
        L_0x0075:
            if (r2 == 0) goto L_0x008f
            com.fyber.inneractive.sdk.protobuf.b1 r6 = com.fyber.inneractive.sdk.protobuf.C5066b1.f13524c
            com.fyber.inneractive.sdk.protobuf.q0 r7 = r2.f13497c
            java.lang.Class r7 = r7.getClass()
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r6.mo25762a(r7)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5075e.m15300a((com.fyber.inneractive.sdk.protobuf.C5083f1) r6, (byte[]) r12, (int) r4, (int) r14, (com.fyber.inneractive.sdk.protobuf.C5075e.C5076a) r15)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r6 = r2.f13498d
            java.lang.Object r7 = r15.f13543c
            r11.mo26206c(r6, r7)
            goto L_0x0063
        L_0x008f:
            if (r8 != r5) goto L_0x00af
            int r4 = com.fyber.inneractive.sdk.protobuf.C5075e.m15302a(r12, r4, r15)
            java.lang.Object r3 = r15.f13543c
            com.fyber.inneractive.sdk.protobuf.i r3 = (com.fyber.inneractive.sdk.protobuf.C5093i) r3
            goto L_0x0063
        L_0x009a:
            if (r8 != 0) goto L_0x00af
            int r4 = com.fyber.inneractive.sdk.protobuf.C5075e.m15309d(r12, r4, r15)
            int r13 = r15.f13541a
            com.fyber.inneractive.sdk.protobuf.r<?> r2 = r10.f13740d
            com.fyber.inneractive.sdk.protobuf.q r6 = r15.f13544d
            com.fyber.inneractive.sdk.protobuf.q0 r7 = r10.f13737a
            java.lang.Object r2 = r2.mo26148a(r6, r7, r13)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d r2 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C5053d) r2
            goto L_0x0063
        L_0x00af:
            int r7 = com.fyber.inneractive.sdk.protobuf.C5169t1.f13695b
            if (r6 != r7) goto L_0x00b4
            goto L_0x00b9
        L_0x00b4:
            int r4 = com.fyber.inneractive.sdk.protobuf.C5075e.m15294a((int) r6, (byte[]) r12, (int) r4, (int) r14, (com.fyber.inneractive.sdk.protobuf.C5075e.C5076a) r15)
            goto L_0x0063
        L_0x00b9:
            if (r3 == 0) goto L_0x00c2
            int r13 = com.fyber.inneractive.sdk.protobuf.C5169t1.m16117a(r13, r5)
            r1.mo26120a((int) r13, (java.lang.Object) r3)
        L_0x00c2:
            r13 = r4
            goto L_0x0017
        L_0x00c5:
            if (r13 != r14) goto L_0x00c8
            return
        L_0x00c8:
            com.fyber.inneractive.sdk.protobuf.a0 r11 = com.fyber.inneractive.sdk.protobuf.C5061a0.m15277g()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5183u0.mo25872a(java.lang.Object, byte[], int, int, com.fyber.inneractive.sdk.protobuf.e$a):void");
    }

    /* renamed from: a */
    public void mo25869a(T t, C5078e1 e1Var, C5147q qVar) throws IOException {
        C5135m1<?, ?> m1Var = this.f13738b;
        C5152r<?> rVar = this.f13740d;
        Object a = m1Var.mo26090a((Object) t);
        C5181u<?> b = rVar.mo26153b(t);
        while (true) {
            try {
                if (e1Var.mo25847s() != Integer.MAX_VALUE) {
                    if (!mo26216a(e1Var, qVar, rVar, b, m1Var, a)) {
                        break;
                    }
                } else {
                    break;
                }
            } finally {
                m1Var.mo26102b((Object) t, a);
            }
        }
    }

    /* renamed from: a */
    public final <UT, UB, ET extends C5181u.C5182a<ET>> boolean mo26216a(C5078e1 e1Var, C5147q qVar, C5152r<ET> rVar, C5181u<ET> uVar, C5135m1<UT, UB> m1Var, UB ub) throws IOException {
        int e = e1Var.mo25820e();
        if (e == C5169t1.f13694a) {
            int i = 0;
            Object obj = null;
            C5093i iVar = null;
            while (e1Var.mo25847s() != Integer.MAX_VALUE) {
                int e2 = e1Var.mo25820e();
                if (e2 == C5169t1.f13696c) {
                    i = e1Var.mo25816c();
                    obj = rVar.mo26148a(qVar, this.f13737a, i);
                } else if (e2 == C5169t1.f13697d) {
                    if (obj != null) {
                        rVar.mo26149a(e1Var, obj, qVar, uVar);
                    } else {
                        iVar = e1Var.mo25805a();
                    }
                } else if (!e1Var.mo25829i()) {
                    break;
                }
            }
            if (e1Var.mo25820e() == C5169t1.f13695b) {
                if (iVar != null) {
                    if (obj != null) {
                        rVar.mo26150a(iVar, obj, qVar, uVar);
                    } else {
                        m1Var.mo26094a(ub, i, iVar);
                    }
                }
                return true;
            }
            throw C5061a0.m15271a();
        } else if ((e & 7) != 2) {
            return e1Var.mo25829i();
        } else {
            Object a = rVar.mo26148a(qVar, this.f13737a, e >>> 3);
            if (a == null) {
                return m1Var.mo26098a(ub, e1Var);
            }
            rVar.mo26149a(e1Var, a, qVar, uVar);
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo25873a(T t) {
        return this.f13740d.mo26146a((Object) t).mo26211e();
    }
}
