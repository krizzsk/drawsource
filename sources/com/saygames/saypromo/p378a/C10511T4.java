package com.saygames.saypromo.p378a;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: com.saygames.saypromo.a.T4 */
public final class C10511T4 implements C10504S4 {
    C10511T4() {
    }

    /* renamed from: a */
    public final C10689q5 mo65386a(Object obj, C10667o oVar) {
        C10649l5 l5Var;
        C10689q5 o5Var;
        C10689q5 q5Var = (C10689q5) obj;
        if (q5Var instanceof C10649l5) {
            if (!(oVar instanceof C10587e)) {
                return q5Var;
            }
            C10649l5 l5Var2 = (C10649l5) q5Var;
            C10587e eVar = (C10587e) oVar;
            if (l5Var2.mo65495b()) {
                return l5Var2;
            }
            l5Var = new C10649l5(true, l5Var2.mo65494a());
        } else if (q5Var instanceof C10657m5) {
            if (oVar instanceof C10555a) {
                C10555a aVar = (C10555a) oVar;
                l5Var = new C10649l5(false, ((C10657m5) q5Var).mo65501b().mo65279c());
            } else if (oVar instanceof C10643l) {
                C10643l lVar = (C10643l) oVar;
                l5Var = new C10649l5(true, ((C10657m5) q5Var).mo65501b().mo65279c());
            } else if (!(oVar instanceof C10651m)) {
                return q5Var;
            } else {
                C10651m mVar = (C10651m) oVar;
                l5Var = new C10649l5(true, ((C10657m5) q5Var).mo65501b().mo65279c());
            }
        } else if (!(q5Var instanceof C10665n5)) {
            if (q5Var instanceof C10673o5) {
                if (oVar instanceof C10555a) {
                    C10555a aVar2 = (C10555a) oVar;
                    l5Var = new C10649l5(true, ((C10673o5) q5Var).mo65521b().mo65279c());
                } else if (!(oVar instanceof C10595f)) {
                    return q5Var;
                } else {
                    C10673o5 o5Var2 = (C10673o5) q5Var;
                    o5Var = new C10657m5(o5Var2.mo65520a(), o5Var2.mo65521b(), ((C10595f) oVar).mo65451b());
                }
            } else if (!(q5Var instanceof C10681p5)) {
                throw new NoWhenBranchMatchedException();
            } else if (oVar instanceof C10555a) {
                C10555a aVar3 = (C10555a) oVar;
                l5Var = new C10649l5(true, ((C10681p5) q5Var).mo65527a().mo65279c());
            } else if (oVar instanceof C10579d) {
                C10579d dVar = (C10579d) oVar;
                l5Var = new C10649l5(true, ((C10681p5) q5Var).mo65527a().mo65279c());
            } else if (oVar instanceof C10603g) {
                C10603g gVar = (C10603g) oVar;
                l5Var = new C10649l5(true, ((C10681p5) q5Var).mo65527a().mo65279c());
            } else if (!(oVar instanceof C10611h)) {
                return q5Var;
            } else {
                o5Var = new C10673o5(((C10611h) oVar).mo65476a(), ((C10681p5) q5Var).mo65527a());
            }
            return o5Var;
        } else if (oVar instanceof C10555a) {
            C10555a aVar4 = (C10555a) oVar;
            l5Var = new C10649l5(true, ((C10665n5) q5Var).mo65515d());
        } else if (!(oVar instanceof C10619i)) {
            return q5Var;
        } else {
            C10665n5 n5Var = (C10665n5) q5Var;
            C10619i iVar = (C10619i) oVar;
            return new C10681p5(iVar.mo65477a(), iVar.mo65478b());
        }
        return l5Var;
    }
}
