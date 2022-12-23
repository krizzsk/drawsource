package com.apm.insight.p026l;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.l */
public final class C1311l {
    /* renamed from: a */
    public static int m1855a(JSONObject jSONObject, int i, String... strArr) {
        JSONObject c = m1865c(jSONObject, strArr);
        if (c == null) {
            return i;
        }
        int optInt = c.optInt(strArr[strArr.length - 1], i);
        C1321q.m1929a("JSONUtil", (Object) "normal get jsonInt: " + strArr[strArr.length - 1] + " : " + optInt);
        return optInt;
    }

    /* renamed from: a */
    public static JSONArray m1856a(int i, int i2, JSONArray jSONArray) {
        int i3 = i2 + i;
        if (jSONArray.length() <= i3) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i4 = 0; i4 < i; i4++) {
            jSONArray2.put(jSONArray.opt(i4));
        }
        while (i < i3) {
            jSONArray2.put(jSONArray.opt(jSONArray.length() - (i3 - i)));
            i++;
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static JSONArray m1857a(JSONObject jSONObject, String... strArr) {
        JSONObject c = m1865c(jSONObject, strArr);
        if (c == null) {
            return null;
        }
        JSONArray optJSONArray = c.optJSONArray(strArr[strArr.length - 1]);
        C1321q.m1929a("ApmConfig", (Object) "normal get configArray: " + strArr[strArr.length - 1] + " : " + optJSONArray);
        return optJSONArray;
    }

    /* renamed from: a */
    public static JSONArray m1858a(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String put : strArr) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static void m1859a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    /* renamed from: a */
    public static boolean m1860a(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    /* renamed from: a */
    public static boolean m1861a(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    /* renamed from: a */
    public static boolean m1862a(JSONObject jSONObject, String str) {
        return m1861a(jSONObject) || m1860a(jSONObject.optJSONArray(str));
    }

    /* renamed from: b */
    public static String m1863b(JSONObject jSONObject, String... strArr) {
        JSONObject c = m1865c(jSONObject, strArr);
        if (c == null) {
            return null;
        }
        String optString = c.optString(strArr[strArr.length - 1]);
        C1321q.m1929a("ApmConfig", (Object) "normal get configArray: " + strArr[strArr.length - 1] + " : " + optString);
        return optString;
    }

    /* renamed from: b */
    public static HashMap<String, Object> m1864b(JSONObject jSONObject) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.opt(next));
        }
        return hashMap;
    }

    /* renamed from: c */
    public static JSONObject m1865c(JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            C1321q.m1930a("JSONUtil", "err get JsonFromParent: null json", new RuntimeException());
            return null;
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            jSONObject = jSONObject.optJSONObject(strArr[i]);
            if (jSONObject == null) {
                C1321q.m1929a("JSONUtil", (Object) "err get json: not found node:" + strArr[i]);
                return null;
            }
        }
        return jSONObject;
    }
}
