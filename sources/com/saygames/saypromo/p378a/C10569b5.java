package com.saygames.saypromo.p378a;

import android.content.Context;

/* renamed from: com.saygames.saypromo.a.b5 */
public abstract class C10569b5 {

    /* renamed from: a */
    private static final C10717u4 f26078a = new C10717u4();

    /* renamed from: b */
    private static C10561a5 f26079b;

    /* renamed from: a */
    public static final C10561a5 m30355a(Context context) {
        C10561a5 a5Var;
        C10485P5.m30222a(context, "context");
        C10561a5 a5Var2 = f26079b;
        if (a5Var2 != null) {
            return a5Var2;
        }
        synchronized (f26078a.f26352a) {
            a5Var = f26079b;
            if (a5Var == null) {
                a5Var = new C10561a5(C10615h3.m30453a(context));
                f26079b = a5Var;
            }
        }
        return a5Var;
    }
}
