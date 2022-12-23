package com.adcolony.sdk;

import com.adcolony.sdk.C0826e0;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.c0 */
class C0773c0 {
    /* renamed from: a */
    static C0832f1 m369a(String str, String str2) {
        String str3;
        try {
            return new C0832f1(str);
        } catch (JSONException e) {
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2 + ": " + e.toString();
            }
            new C0826e0.C0827a().mo10746a(str3).mo10747a(C0826e0.f462i);
            return new C0832f1();
        }
    }

    /* renamed from: b */
    static C0832f1 m379b() {
        return new C0832f1();
    }

    /* renamed from: c */
    static double m387c(C0832f1 f1Var, String str) {
        return f1Var.mo10774a(str, 0.0d);
    }

    /* renamed from: d */
    static int m389d(C0832f1 f1Var, String str) {
        return f1Var.mo10803j(str);
    }

    /* renamed from: e */
    static C0828e1 m390e(C0832f1 f1Var, String str) {
        return f1Var.mo10805l(str);
    }

    /* renamed from: f */
    static C0832f1 m391f(C0832f1 f1Var, String str) {
        return f1Var.mo10806m(str);
    }

    /* renamed from: g */
    static Object m392g(C0832f1 f1Var, String str) {
        Object o = f1Var.mo10808o(str);
        return o == null ? Boolean.FALSE : o;
    }

    /* renamed from: h */
    static String m393h(C0832f1 f1Var, String str) {
        return f1Var.mo10809p(str);
    }

    /* renamed from: i */
    static String m394i(C0832f1 f1Var, String str) {
        return f1Var.mo10810q(str);
    }

    /* renamed from: j */
    static boolean m395j(C0832f1 f1Var, String str) {
        try {
            C0723a.m193b().mo10907p().mo11163a(str, f1Var.toString(), false);
            return true;
        } catch (IOException e) {
            new C0826e0.C0827a().mo10746a("IOException in ADCJSON's saveObject: ").mo10746a(e.toString()).mo10747a(C0826e0.f462i);
            return false;
        }
    }

    /* renamed from: b */
    static C0832f1 m380b(String str) {
        return m369a(str, (String) null);
    }

    /* renamed from: c */
    static C0832f1 m388c(String str) {
        try {
            String sb = C0723a.m193b().mo10907p().mo11162a(str, false).toString();
            return m369a(sb, "loadObject from filepath " + str);
        } catch (IOException e) {
            new C0826e0.C0827a().mo10746a("IOException in ADCJSON's loadObject: ").mo10746a(e.toString()).mo10747a(C0826e0.f462i);
            return m379b();
        }
    }

    /* renamed from: b */
    static String m381b(C0828e1 e1Var, int i) {
        return e1Var.mo10757d(i);
    }

    /* renamed from: b */
    static boolean m382b(C0832f1 f1Var, String str) {
        return f1Var.mo10799f(str);
    }

    /* renamed from: b */
    static boolean m383b(C0832f1 f1Var, String str, int i) {
        try {
            f1Var.mo10788b(str, i);
            return true;
        } catch (JSONException e) {
            C0826e0.C0827a a = new C0826e0.C0827a().mo10746a("JSON error in ADCJSON putInteger(): ").mo10746a(e.toString());
            C0826e0.C0827a a2 = a.mo10746a(" with key: " + str);
            a2.mo10746a(" and value: " + i).mo10747a(C0826e0.f462i);
            return false;
        }
    }

    /* renamed from: a */
    static C0828e1 m365a() {
        return new C0828e1();
    }

    /* renamed from: a */
    static C0828e1 m367a(String str) {
        try {
            return new C0828e1(str);
        } catch (JSONException e) {
            new C0826e0.C0827a().mo10746a(e.toString()).mo10747a(C0826e0.f462i);
            return new C0828e1();
        }
    }

    /* renamed from: b */
    static boolean m384b(C0832f1 f1Var, String str, long j) {
        try {
            f1Var.mo10789b(str, j);
            return true;
        } catch (JSONException e) {
            C0826e0.C0827a a = new C0826e0.C0827a().mo10746a("JSON error in ADCJSON putLong(): ").mo10746a(e.toString());
            C0826e0.C0827a a2 = a.mo10746a(" with key: " + str);
            a2.mo10746a(" and value: " + j).mo10747a(C0826e0.f462i);
            return false;
        }
    }

    /* renamed from: a */
    static int m363a(C0832f1 f1Var, String str, int i) {
        return f1Var.mo10775a(str, i);
    }

    /* renamed from: a */
    static long m364a(C0832f1 f1Var, String str, long j) {
        return f1Var.mo10776a(str, j);
    }

    /* renamed from: a */
    static boolean m377a(C0832f1 f1Var, String str, boolean z) {
        return f1Var.mo10785a(str, z);
    }

    /* renamed from: a */
    static C0832f1 m368a(C0828e1 e1Var, int i) {
        return e1Var.mo10755c(i);
    }

    /* renamed from: a */
    static C0828e1 m366a(C0832f1 f1Var, String str) {
        return f1Var.mo10804k(str);
    }

    /* renamed from: b */
    static boolean m385b(C0832f1 f1Var, String str, boolean z) {
        try {
            f1Var.mo10790b(str, z);
            return true;
        } catch (JSONException e) {
            C0826e0.C0827a a = new C0826e0.C0827a().mo10746a("JSON error in ADCJSON putBoolean(): ").mo10746a(e.toString());
            C0826e0.C0827a a2 = a.mo10746a(" with key: " + str);
            a2.mo10746a(" and value: " + z).mo10747a(C0826e0.f462i);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m376a(C0832f1 f1Var, String str, String str2) {
        try {
            f1Var.mo10779a(str, str2);
            return true;
        } catch (JSONException e) {
            C0826e0.C0827a a = new C0826e0.C0827a().mo10746a("JSON error in ADCJSON putString(): ").mo10746a(e.toString());
            C0826e0.C0827a a2 = a.mo10746a(" with key: " + str);
            a2.mo10746a(" and value: " + str2).mo10747a(C0826e0.f462i);
            return false;
        }
    }

    /* renamed from: b */
    static C0832f1[] m386b(C0828e1 e1Var) {
        return e1Var.mo10756c();
    }

    /* renamed from: a */
    static boolean m374a(C0832f1 f1Var, String str, C0828e1 e1Var) {
        try {
            f1Var.mo10777a(str, e1Var);
            return true;
        } catch (JSONException e) {
            C0826e0.C0827a a = new C0826e0.C0827a().mo10746a("JSON error in ADCJSON putArray(): ").mo10746a(e.toString());
            C0826e0.C0827a a2 = a.mo10746a(" with key: " + str);
            a2.mo10746a(" and value: " + e1Var).mo10747a(C0826e0.f462i);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m375a(C0832f1 f1Var, String str, C0832f1 f1Var2) {
        try {
            f1Var.mo10778a(str, f1Var2);
            return true;
        } catch (JSONException e) {
            C0826e0.C0827a a = new C0826e0.C0827a().mo10746a("JSON error in ADCJSON putObject(): ").mo10746a(e.toString());
            C0826e0.C0827a a2 = a.mo10746a(" with key: " + str);
            a2.mo10746a(" and value: " + f1Var2).mo10747a(C0826e0.f462i);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m373a(C0832f1 f1Var, String str, double d) {
        try {
            f1Var.mo10787b(str, d);
            return true;
        } catch (JSONException unused) {
            C0826e0.C0827a a = new C0826e0.C0827a().mo10746a("JSON error in ADCJSON putDouble(): ");
            C0826e0.C0827a a2 = a.mo10746a(" with key: " + str);
            a2.mo10746a(" and value: " + d).mo10747a(C0826e0.f462i);
            return false;
        }
    }

    /* renamed from: a */
    static void m372a(C0828e1 e1Var, String str) {
        e1Var.mo10754b(str);
    }

    /* renamed from: a */
    static void m371a(C0828e1 e1Var, C0832f1 f1Var) {
        e1Var.mo10748a(f1Var);
    }

    /* renamed from: a */
    static String[] m378a(C0828e1 e1Var) {
        return e1Var.mo10758d();
    }

    /* renamed from: a */
    static C0832f1 m370a(C0832f1... f1VarArr) {
        C0832f1 f1Var = new C0832f1();
        for (C0832f1 a : f1VarArr) {
            f1Var.mo10782a(a);
        }
        return f1Var;
    }
}
