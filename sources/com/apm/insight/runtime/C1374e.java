package com.apm.insight.runtime;

import com.apm.insight.p026l.C1311l;
import com.apm.insight.p026l.C1321q;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.e */
public class C1374e {

    /* renamed from: a */
    private static HashMap<String, C1374e> f1448a = new HashMap<>();

    /* renamed from: b */
    private JSONObject f1449b = null;

    /* renamed from: c */
    private JSONObject f1450c = null;

    /* renamed from: d */
    private boolean f1451d = false;

    /* renamed from: e */
    private String f1452e;

    public C1374e(JSONObject jSONObject, String str) {
        this.f1452e = str;
        m2234a(jSONObject);
        f1448a.put(this.f1452e, this);
        C1321q.m1927a((Object) "after update aid " + str);
    }

    /* renamed from: a */
    public static void m2233a(String str, JSONObject jSONObject) {
        C1374e eVar = f1448a.get(str);
        if (eVar != null) {
            eVar.m2234a(jSONObject);
        } else {
            new C1374e(jSONObject, str);
        }
    }

    /* renamed from: a */
    private void m2234a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        this.f1449b = jSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("error_module")) != null) {
            boolean z = true;
            if (optJSONObject.optInt("switcher") != 1) {
                z = false;
            }
            this.f1451d = z;
        }
    }

    /* renamed from: b */
    public static boolean m2235b(String str) {
        return f1448a.get(str) != null;
    }

    /* renamed from: c */
    public static JSONObject m2236c(String str) {
        C1374e eVar = f1448a.get(str);
        if (eVar != null) {
            return eVar.mo12718a();
        }
        return null;
    }

    /* renamed from: d */
    public static C1374e m2237d(String str) {
        return f1448a.get(str);
    }

    /* renamed from: e */
    public static long m2238e(String str) {
        C1374e eVar = f1448a.get(str);
        if (eVar == null) {
            return 3600000;
        }
        try {
            return Long.decode(C1311l.m1863b(eVar.mo12718a(), "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000;
        }
    }

    /* renamed from: f */
    public static boolean m2239f(String str) {
        C1374e eVar = f1448a.get(str);
        return eVar != null && eVar.mo12720b();
    }

    /* renamed from: g */
    public static boolean m2240g(String str) {
        C1374e eVar = f1448a.get(str);
        return eVar != null && eVar.mo12721c();
    }

    /* renamed from: h */
    public static boolean m2241h(String str) {
        C1374e eVar = f1448a.get(str);
        return eVar != null && eVar.mo12722d();
    }

    /* renamed from: a */
    public JSONObject mo12718a() {
        return this.f1449b;
    }

    /* renamed from: a */
    public boolean mo12719a(String str) {
        if (this.f1449b == null) {
            return false;
        }
        return this.f1451d;
    }

    /* renamed from: b */
    public boolean mo12720b() {
        JSONObject jSONObject = this.f1449b;
        return jSONObject != null && 1 == C1311l.m1855a(jSONObject, 0, "crash_module", "switcher");
    }

    /* renamed from: c */
    public boolean mo12721c() {
        JSONObject jSONObject = this.f1449b;
        return jSONObject != null && 1 == C1311l.m1855a(jSONObject, 0, "crash_module", "switcher");
    }

    /* renamed from: d */
    public boolean mo12722d() {
        JSONObject jSONObject = this.f1449b;
        return jSONObject != null && 1 == C1311l.m1855a(jSONObject, 0, "crash_module", "switcher");
    }
}
