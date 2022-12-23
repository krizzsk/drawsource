package com.saygames.saypromo.p378a;

/* renamed from: com.saygames.saypromo.a.s5 */
public final class C10704s5 implements C10697r5 {

    /* renamed from: a */
    private final C10717u4 f26339a = new C10717u4();

    /* renamed from: b */
    private Object f26340b;

    /* renamed from: c */
    final /* synthetic */ C10504S4 f26341c;

    /* renamed from: d */
    final /* synthetic */ C10601f5 f26342d;

    C10704s5(C10511T4 t4, C10633j5 j5Var, C10665n5 n5Var) {
        this.f26341c = t4;
        this.f26342d = j5Var;
        this.f26340b = n5Var;
    }

    /* renamed from: a */
    public final void mo65538a(C10667o oVar) {
        C10717u4 u4Var = this.f26339a;
        C10504S4 s4 = this.f26341c;
        C10601f5 f5Var = this.f26342d;
        synchronized (u4Var.f26352a) {
            Object obj = this.f26340b;
            this.f26340b = ((C10511T4) s4).mo65386a(obj, oVar);
            ((C10633j5) f5Var).mo65489a((C10697r5) this, oVar, obj);
        }
    }
}
