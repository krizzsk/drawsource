package com.apm.insight.entity;

import android.os.Environment;
import com.apm.insight.C1250h;
import com.apm.insight.p026l.C1308i;
import com.apm.insight.p026l.C1311l;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.entity.d */
public class C1231d {

    /* renamed from: a */
    private static String f1119a;

    /* renamed from: b */
    private static JSONObject f1120b;

    /* renamed from: a */
    private static void m1514a() {
        JSONObject jSONObject;
        if (f1119a == null) {
            f1119a = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + C1250h.m1615g().getPackageName() + "/AutomationTestInfo.json";
        }
        if (f1120b == null) {
            try {
                f1120b = new JSONObject(C1308i.m1842c(f1119a));
                return;
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            } catch (IOException unused2) {
                jSONObject = new JSONObject();
            }
        } else {
            return;
        }
        f1120b = jSONObject;
    }

    /* renamed from: a */
    public static void m1515a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                m1517c(jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m1516b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                m1518d(jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private static void m1517c(JSONObject jSONObject) {
        Object opt;
        m1514a();
        JSONObject jSONObject2 = f1120b;
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!"slardar_filter".equals(next) && (opt = f1120b.opt(next)) != null) {
                    try {
                        jSONObject.put(next, opt);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private static void m1518d(JSONObject jSONObject) {
        m1514a();
        JSONObject jSONObject2 = f1120b;
        if (jSONObject2 != null) {
            JSONObject optJSONObject = jSONObject2.optJSONObject("slardar_filter");
            if (!C1311l.m1861a(optJSONObject)) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("filters");
                if (optJSONObject2 == null) {
                    optJSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("filters", optJSONObject2);
                    } catch (JSONException unused) {
                    }
                }
                C1227a.m1471b(optJSONObject2, optJSONObject);
            }
        }
    }
}
