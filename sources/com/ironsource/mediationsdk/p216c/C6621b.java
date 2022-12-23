package com.ironsource.mediationsdk.p216c;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C6655f;
import com.ironsource.mediationsdk.utils.C6736c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.c.b */
public class C6621b {

    /* renamed from: a */
    private String f17155a;

    /* renamed from: b */
    private String f17156b;

    /* renamed from: c */
    private C6655f f17157c;

    public C6621b(String str, String str2, C6655f fVar) {
        this.f17155a = str;
        this.f17156b = str2;
        this.f17157c = fVar;
    }

    /* renamed from: a */
    private static Object m20122a(Object obj) {
        return obj instanceof JSONObject ? m20124a((JSONObject) obj) : obj instanceof JSONArray ? m20123a((JSONArray) obj) : obj;
    }

    /* renamed from: a */
    private static List<Object> m20123a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(m20122a(jSONArray.get(i)));
            } catch (JSONException e) {
                IronLog.INTERNAL.error(String.format("Could not put value into list: %s", new Object[]{e.getMessage()}));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, Object> m20124a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, m20122a(jSONObject.get(next)));
            } catch (JSONException e) {
                IronLog.INTERNAL.error(String.format("Could not put value in map: %s, %s", new Object[]{next, e.getMessage()}));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONObject m20125a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                try {
                    jSONObject.put((String) next.getKey(), m20128b(next.getValue()));
                } catch (JSONException unused) {
                    IronLog.INTERNAL.error(String.format("Could not map entry to object: %s, %s", new Object[]{next.getKey(), next.getValue()}));
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m20126a(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < 2; i++) {
            JSONObject jSONObject2 = jSONObjectArr[i];
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.get(next));
                    } catch (JSONException e) {
                        IronLog.INTERNAL.error(e.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m20127a(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static Object m20128b(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return new JSONArray(Arrays.asList(new Object[]{obj}));
            } else if (obj instanceof Map) {
                return new JSONObject((Map) obj);
            } else {
                if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                    return obj;
                }
                if (obj instanceof Enum) {
                    return obj.toString();
                }
                if (obj.getClass().getPackage().getName().startsWith("java.")) {
                    return obj.toString();
                }
                return null;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public String mo36634a() {
        return this.f17155a;
    }

    /* renamed from: b */
    public String mo36635b() {
        return this.f17156b;
    }

    /* renamed from: c */
    public boolean mo36636c() {
        return this.f17157c.f17349g.f17573f > 0;
    }

    /* renamed from: d */
    public long mo36637d() {
        return this.f17157c.f17349g.f17577j;
    }

    /* renamed from: e */
    public int mo36638e() {
        return this.f17157c.f17348f;
    }

    /* renamed from: f */
    public long mo36639f() {
        return this.f17157c.f17344b;
    }

    /* renamed from: g */
    public int mo36640g() {
        return this.f17157c.f17347e;
    }

    /* renamed from: h */
    public C6736c mo36641h() {
        return this.f17157c.f17349g;
    }
}
