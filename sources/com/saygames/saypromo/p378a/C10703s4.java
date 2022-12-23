package com.saygames.saypromo.p378a;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: com.saygames.saypromo.a.s4 */
public final class C10703s4 implements C10696r4 {
    C10703s4() {
    }

    /* renamed from: a */
    public final C10664n4 mo65537a(C10688q4 q4Var) {
        if (q4Var instanceof C10672o4) {
            C10672o4 o4Var = (C10672o4) q4Var;
            if (o4Var.mo65519c() != null) {
                String c = o4Var.mo65519c();
                return new C10656m4("https://play.google.com/store/apps/details?id=" + c, "market://details?id=" + c);
            } else if (o4Var.mo65517a() != null) {
                String a = o4Var.mo65517a();
                return new C10656m4("https://play.google.com/store/apps/details?id=" + a, "market://details?id=" + a);
            } else if (o4Var.mo65518b() != null) {
                return new C10648l4(o4Var.mo65518b());
            } else {
                return null;
            }
        } else if (q4Var instanceof C10680p4) {
            C10680p4 p4Var = (C10680p4) q4Var;
            if (p4Var.mo65525a() != null) {
                String a2 = p4Var.mo65525a();
                return new C10656m4("https://play.google.com/store/apps/details?id=" + a2, "market://details?id=" + a2);
            } else if (p4Var.mo65526b() != null) {
                return new C10648l4(p4Var.mo65526b());
            } else {
                return null;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
