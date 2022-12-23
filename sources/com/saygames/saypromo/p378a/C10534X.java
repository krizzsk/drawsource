package com.saygames.saypromo.p378a;

import android.view.View;
import com.saygames.saypromo.SayPromoThrowable;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: com.saygames.saypromo.a.X */
public final class C10534X implements C10578c6 {

    /* renamed from: a */
    final /* synthetic */ C10444K f26009a;

    /* renamed from: b */
    final /* synthetic */ C10548Z f26010b;

    C10534X(C10444K k, C10548Z z) {
        this.f26009a = k;
        this.f26010b = z;
    }

    /* renamed from: a */
    public final void mo65393a() {
        C10548Z.m30326m(this.f26010b);
        C10467N1 g = this.f26010b.f26042n;
        C10697r5 r5Var = null;
        if (g == null) {
            g = null;
        }
        if (g instanceof C10446K1) {
            this.f26010b.m30296a(((C10446K1) g).mo65349b());
            return;
        }
        C10697r5 h = this.f26010b.f26043o;
        if (h != null) {
            r5Var = h;
        }
        C10378A3.m30063a(r5Var, new C10627j(0.0f, 0.0f, "none"));
        C10548Z z = this.f26010b;
        C10548Z.m30307a(z, z.f26046r);
        C10548Z.m30314b(this.f26010b);
    }

    /* renamed from: a */
    public final void mo65394a(float f, float f2) {
        long b = ((C10430I) this.f26009a).mo65332b();
        Duration.Companion companion = Duration.Companion;
        C10586d6 l = this.f26010b.f26035g;
        C10697r5 r5Var = null;
        if (l == null) {
            l = null;
        }
        if (Duration.m35143compareToLRDsOJo(b, DurationKt.toDuration(l.mo65439a(), DurationUnit.MILLISECONDS)) <= 0) {
            C10394C5 c = this.f26010b.f26030b;
            if (c == null) {
                c = null;
            }
            if (Duration.m35143compareToLRDsOJo(c.mo65267b(), C10556a0.f26057a) >= 0) {
                C10394C5 c2 = this.f26010b.f26030b;
                if (c2 == null) {
                    c2 = null;
                }
                c2.mo65266a();
                C10416G a = ((C10430I) this.f26009a).mo65331a();
                if (a instanceof C10402E) {
                    mo65393a();
                } else if (a instanceof C10409F) {
                    C10697r5 h = this.f26010b.f26043o;
                    if (h != null) {
                        r5Var = h;
                    }
                    C10378A3.m30063a(r5Var, new C10627j(f, f2, "video"));
                    C10548Z z = this.f26010b;
                    C10548Z.m30307a(z, z.f26046r);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo65395a(int i, int i2) {
        if (((C10430I) this.f26009a).mo65335e()) {
            View k = this.f26010b.f26039k;
            if (k == null) {
                k = null;
            }
            k.setVisibility(0);
            this.f26010b.m30293a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo65396a(SayPromoThrowable.Show.Video video) {
        C10548Z.m30326m(this.f26010b);
        C10548Z.m30305a(this.f26010b, (SayPromoThrowable.Show) video);
    }
}
