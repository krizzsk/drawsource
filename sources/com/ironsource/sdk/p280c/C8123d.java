package com.ironsource.sdk.p280c;

import com.google.firebase.messaging.Constants;
import com.ironsource.sdk.C8099a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c.d */
public class C8123d {

    /* renamed from: a */
    public static final String f19699a = C8123d.class.getSimpleName();

    /* renamed from: c */
    private static C8123d f19700c = null;

    /* renamed from: b */
    public Map<String, C8125e> f19701b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public static synchronized C8123d m23224a() {
        C8123d dVar;
        synchronized (C8123d.class) {
            if (f19700c == null) {
                f19700c = new C8123d();
            }
            dVar = f19700c;
        }
        return dVar;
    }

    /* renamed from: a */
    public static String m23225a(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    /* renamed from: b */
    public static boolean m23227b(JSONObject jSONObject) {
        try {
            return jSONObject.getBoolean("shouldCreateContainer");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    private static C8099a m23228d(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("adSize"));
            String obj = jSONObject2.get("height").toString();
            String obj2 = jSONObject2.get("width").toString();
            return new C8099a(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get(Constants.ScionAnalytics.PARAM_LABEL).toString());
        } catch (Exception unused) {
            return new C8099a();
        }
    }

    /* renamed from: a */
    public final C8125e mo56345a(String str) {
        if (str.isEmpty() || !this.f19701b.containsKey(str)) {
            return null;
        }
        return this.f19701b.get(str);
    }

    /* renamed from: c */
    public C8099a mo56346c(JSONObject jSONObject) {
        C8099a aVar = new C8099a();
        try {
            return m23228d(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return aVar;
        }
    }
}
