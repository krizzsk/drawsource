package com.saygames.saypromo.p378a;

import com.saygames.saypromo.SayPromoThrowable;
import com.tapjoy.TJAdUnitConstants;
import kotlin.time.Duration;

/* renamed from: com.saygames.saypromo.a.Y */
public final class C10541Y implements C10666n6 {

    /* renamed from: a */
    final /* synthetic */ C10548Z f26022a;

    /* renamed from: b */
    final /* synthetic */ C10444K f26023b;

    C10541Y(C10444K k, C10548Z z) {
        this.f26022a = z;
        this.f26023b = k;
    }

    /* renamed from: a */
    public final void mo65398a(SayPromoThrowable.Show.Web web) {
        C10548Z.m30327n(this.f26022a);
        C10548Z.m30305a(this.f26022a, (SayPromoThrowable.Show) web);
    }

    /* renamed from: a */
    public final void mo65399a(C10626i6 i6Var) {
        C10697r5 r5Var = null;
        if (i6Var instanceof C10602f6) {
            C10394C5 c = this.f26022a.f26030b;
            if (c == null) {
                c = null;
            }
            if (Duration.m35143compareToLRDsOJo(c.mo65267b(), C10556a0.f26057a) >= 0) {
                C10394C5 c2 = this.f26022a.f26030b;
                if (c2 == null) {
                    c2 = null;
                }
                c2.mo65266a();
                C10697r5 h = this.f26022a.f26043o;
                if (h != null) {
                    r5Var = h;
                }
                C10602f6 f6Var = (C10602f6) i6Var;
                C10378A3.m30063a(r5Var, new C10627j(f6Var.mo65455b(), f6Var.mo65456c(), TJAdUnitConstants.String.HTML));
                if (((C10437J) this.f26023b).mo65341b()) {
                    C10548Z z = this.f26022a;
                    C10664n4 a = f6Var.mo65454a();
                    if (a == null) {
                        a = this.f26022a.f26046r;
                    }
                    C10548Z.m30307a(z, a);
                    return;
                }
                C10548Z z2 = this.f26022a;
                C10548Z.m30307a(z2, z2.f26046r);
            }
        } else if (i6Var instanceof C10610g6) {
            String a2 = ((C10610g6) i6Var).mo65475a();
            C10394C5 i = this.f26022a.f26031c;
            if (i == null) {
                i = null;
            }
            if (Duration.m35143compareToLRDsOJo(i.mo65267b(), Duration.m35147divUwyO8pc(C10556a0.f26057a, 2)) >= 0) {
                C10394C5 i2 = this.f26022a.f26031c;
                if (i2 == null) {
                    i2 = null;
                }
                i2.mo65266a();
                C10697r5 h2 = this.f26022a.f26043o;
                if (h2 != null) {
                    r5Var = h2;
                }
                C10378A3.m30063a(r5Var, new C10659n(a2));
            }
        } else {
            boolean z3 = i6Var instanceof C10618h6;
        }
    }
}
