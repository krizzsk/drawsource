package com.saygames.saypromo.p378a;

import android.content.Context;

/* renamed from: com.saygames.saypromo.a.h3 */
public abstract class C10615h3 {

    /* renamed from: a */
    private static final C10717u4 f26191a = new C10717u4();

    /* renamed from: b */
    private static C10607g3 f26192b;

    /* renamed from: a */
    public static final C10607g3 m30453a(Context context) {
        C10607g3 g3Var;
        C10607g3 g3Var2 = f26192b;
        if (g3Var2 != null) {
            return g3Var2;
        }
        synchronized (f26191a.f26352a) {
            g3Var = f26192b;
            if (g3Var == null) {
                g3Var = new C10607g3(context.getApplicationContext());
                f26192b = g3Var;
            }
        }
        return g3Var;
    }
}
