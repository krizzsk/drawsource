package com.apm.insight.runtime;

import android.text.TextUtils;
import com.apm.insight.C1186b;
import com.apm.insight.C1215c;
import com.apm.insight.C1250h;
import com.apm.insight.p026l.C1308i;
import com.apm.insight.p026l.C1311l;
import com.apm.insight.p026l.C1318o;
import com.apm.insight.p026l.C1321q;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.n */
public class C1388n {

    /* renamed from: a */
    protected static JSONObject f1476a = new JSONObject();

    /* renamed from: a */
    public static void m2272a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                String a = C1351a.m2093a(jSONObject);
                File file = new File(C1318o.m1917j(C1250h.m1615g()), "apminsight/configCrash/configNative");
                if (a != null) {
                    JSONObject jSONObject2 = new JSONObject(a);
                    f1476a = jSONObject2;
                    C1308i.m1829a(file, m2278b(jSONObject2), false);
                    return;
                }
                f1476a = new JSONObject();
            } catch (JSONException unused) {
            } catch (Throwable th) {
                C1186b.m1306a().mo12441a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: a */
    public static boolean m2273a(String str, C1375f fVar) {
        if (f1476a == null) {
            return false;
        }
        if (fVar == null) {
            fVar = new C1375f();
        }
        JSONObject optJSONObject = f1476a.optJSONObject(str);
        if (optJSONObject != null && !m2274a(optJSONObject.optJSONArray("disable"), fVar)) {
            return m2274a(optJSONObject.optJSONArray("enable"), fVar);
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2274a(JSONArray jSONArray, C1375f fVar) {
        if (C1311l.m1860a(jSONArray)) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                C1186b.m1306a().mo12441a("NPTH_CATCH", (Throwable) new IllegalArgumentException("err config: " + jSONArray));
            } else if (m2275a(optJSONObject, fVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2275a(JSONObject jSONObject, C1375f fVar) {
        StringBuilder sb;
        Iterator<String> keys = jSONObject.keys();
        boolean z = false;
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                z = true;
                if (next.startsWith("header_")) {
                    if (!m2276a(jSONObject.optJSONObject(next), fVar.mo12723b(next.substring(7)))) {
                        sb = new StringBuilder();
                    }
                } else if (!next.startsWith("java_")) {
                    C1321q.m1927a((Object) "no rules match " + next);
                } else if (!m2276a(jSONObject.optJSONObject(next), fVar.mo12669a(next.substring(5)))) {
                    sb = new StringBuilder();
                }
                sb.append("not match ");
                sb.append(next);
                C1321q.m1927a((Object) sb.toString());
                return false;
            }
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m2276a(JSONObject jSONObject, Object obj) {
        JSONArray optJSONArray = jSONObject.optJSONArray(TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
        if (optJSONArray.length() == 0) {
            return false;
        }
        String optString = jSONObject.optString("op");
        String valueOf = String.valueOf(obj);
        if (optString.equals("=")) {
            return valueOf.equals(String.valueOf(optJSONArray.opt(0)));
        }
        if (optString.equals("in")) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (String.valueOf(optJSONArray.opt(i)).equals(valueOf)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private static JSONArray m2277b(JSONArray jSONArray, C1375f fVar) {
        JSONArray jSONArray2 = new JSONArray();
        if (C1311l.m1860a(jSONArray)) {
            return jSONArray2;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                C1215c a = C1186b.m1306a();
                a.mo12441a("NPTH_CATCH", (Throwable) new IllegalArgumentException("err config: " + jSONArray));
            } else if (m2275a(optJSONObject, fVar)) {
                jSONArray2.put(optJSONObject);
            }
        }
        return jSONArray2;
    }

    /* renamed from: b */
    public static JSONObject m2278b(JSONObject jSONObject) {
        StringBuilder sb;
        String str;
        Iterator<String> keys = jSONObject.keys();
        C1375f fVar = new C1375f();
        JSONObject jSONObject2 = new JSONObject();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!"configType".equals(next)) {
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject == null) {
                    C1215c a = C1186b.m1306a();
                    a.mo12441a("NPTH_CATCH", (Throwable) new IllegalArgumentException("err config with key: " + next));
                } else {
                    if (m2274a(optJSONObject.optJSONArray("disable"), fVar)) {
                        sb = new StringBuilder();
                        str = "match diable ";
                    } else {
                        JSONArray b = m2277b(optJSONObject.optJSONArray("enable"), fVar);
                        if (C1311l.m1860a(b)) {
                            sb = new StringBuilder();
                            str = "not match ";
                        } else {
                            try {
                                jSONObject2.put(next, new JSONObject().put("enable", b));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    sb.append(str);
                    sb.append(next);
                    C1321q.m1927a((Object) sb.toString());
                }
            }
        }
        return jSONObject2;
    }
}
