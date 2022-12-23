package com.apm.insight.runtime;

import com.apm.insight.C1250h;
import com.apm.insight.entity.C1228b;
import com.apm.insight.p025k.C1266a;
import com.apm.insight.p025k.C1291k;
import com.apm.insight.p026l.C1311l;
import com.apm.insight.p026l.C1321q;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.a */
public class C1351a {

    /* renamed from: a */
    private static ConcurrentLinkedQueue<Object> f1389a = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    public static int m2091a(int i, String... strArr) {
        return C1311l.m1855a(m2094a(), i, strArr);
    }

    /* renamed from: a */
    public static int m2092a(String... strArr) {
        return C1311l.m1855a(m2094a(), -1, strArr);
    }

    /* renamed from: a */
    public static String m2093a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("exception_modules")) == null) {
            return null;
        }
        return optJSONObject.optString("npth");
    }

    /* renamed from: a */
    public static JSONObject m2094a() {
        return C1374e.m2236c(C1250h.m1599a().mo12716e());
    }

    /* renamed from: a */
    public static JSONObject m2095a(JSONArray jSONArray, String str) {
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i).optJSONObject(str);
                if (optJSONObject != null) {
                    return optJSONObject;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m2096a(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            C1321q.m1929a("apmconfig", (Object) "fromnet " + z + " : " + jSONArray);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    String next = optJSONObject.keys().next();
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                    C1321q.m1927a((Object) "update config " + next + " : " + optJSONObject2);
                    C1374e.m2233a(next, optJSONObject2);
                    if (z) {
                        C1291k.m1759a(next);
                    }
                } catch (Throwable unused) {
                }
            }
            C1388n.m2272a(m2095a(jSONArray, String.valueOf(C1250h.m1599a().mo12716e())));
            if (z) {
                C1291k.m1760a(false, jSONArray);
            }
        }
    }

    /* renamed from: a */
    public static boolean m2097a(Object obj) {
        String b = C1228b.m1509b(obj);
        if (b != null) {
            return C1374e.m2235b(b);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m2098a(Object obj, String str) {
        C1374e d;
        String b = C1228b.m1509b(obj);
        if (b == null || (d = C1374e.m2237d(b)) == null) {
            return false;
        }
        return d.mo12719a(str);
    }

    /* renamed from: a */
    public static boolean m2099a(String str) {
        if (!C1374e.m2235b(str)) {
            C1266a.m1665b();
        }
        return C1374e.m2239f(str);
    }

    /* renamed from: b */
    public static boolean m2100b() {
        return C1389o.m2307e();
    }

    /* renamed from: b */
    public static boolean m2101b(String str) {
        if (!C1374e.m2235b(str)) {
            C1266a.m1665b();
        }
        return C1374e.m2241h(str);
    }

    /* renamed from: c */
    public static JSONArray m2102c() {
        return C1311l.m1857a(m2094a(), "custom_event_settings", "npth_simple_setting", "max_utm_thread_ignore");
    }

    /* renamed from: c */
    public static boolean m2103c(String str) {
        if (!C1374e.m2235b(str)) {
            C1266a.m1665b();
        }
        return C1374e.m2240g(str);
    }

    /* renamed from: d */
    public static boolean m2104d() {
        return m2092a("custom_event_settings", "npth_simple_setting", "disable_looper_monitor") == 1;
    }

    /* renamed from: e */
    public static boolean m2105e() {
        return m2092a("custom_event_settings", "npth_simple_setting", "enable_all_thread_stack_native") == 1;
    }

    /* renamed from: f */
    public static boolean m2106f() {
        return m2092a("custom_event_settings", "npth_simple_setting", "anr_with_traces_txt") == 1;
    }

    /* renamed from: g */
    public static boolean m2107g() {
        return m2092a("custom_event_settings", "npth_simple_setting", "upload_crash_crash") == 1;
    }

    /* renamed from: h */
    public static boolean m2108h() {
        return m2092a("custom_event_settings", "npth_simple_setting", "force_apm_crash") == 1;
    }

    /* renamed from: i */
    public static boolean m2109i() {
        return m2092a("custom_event_settings", "npth_simple_setting", "enable_killed_anr") == 1;
    }

    /* renamed from: j */
    public static boolean m2110j() {
        return m2092a("custom_event_settings", "npth_simple_setting", "enable_anr_all_process_trace") == 1;
    }
}
