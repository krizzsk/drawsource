package com.iab.omid.library.mmadbridge.p263d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.mmadbridge.p261b.C7930c;
import com.iab.omid.library.mmadbridge.walking.C7957a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.d.b */
public class C7942b {

    /* renamed from: a */
    static float f19176a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f19177b;

    /* renamed from: c */
    private static String[] f19178c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.mmadbridge.d.b$a */
    private static class C7943a {

        /* renamed from: a */
        final float f19179a;

        /* renamed from: b */
        final float f19180b;

        C7943a(float f, float f2) {
            this.f19179a = f;
            this.f19180b = f2;
        }
    }

    /* renamed from: a */
    static float m22441a(int i) {
        return ((float) i) / f19176a;
    }

    /* renamed from: a */
    public static JSONObject m22442a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m22441a(i));
            jSONObject.put("y", (double) m22441a(i2));
            jSONObject.put("width", (double) m22441a(i3));
            jSONObject.put("height", (double) m22441a(i4));
        } catch (JSONException e) {
            C7944c.m22460a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m22443a(Context context) {
        if (context != null) {
            f19176a = context.getResources().getDisplayMetrics().density;
            f19177b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m22444a(JSONObject jSONObject) {
        C7943a b = m22451b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f19179a);
            jSONObject.put("height", (double) b.f19180b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m22445a(JSONObject jSONObject, C7957a.C7958a aVar) {
        C7930c a = aVar.mo55626a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo55628b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo55546b());
            jSONObject.put("friendlyObstructionPurpose", a.mo55547c());
            jSONObject.put("friendlyObstructionReason", a.mo55548d());
        } catch (JSONException e) {
            C7944c.m22460a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m22446a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C7944c.m22460a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m22447a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C7944c.m22460a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m22448a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C7944c.m22460a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m22449a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static boolean m22450a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    private static C7943a m22451b(JSONObject jSONObject) {
        float f;
        float f2 = 0.0f;
        if (Build.VERSION.SDK_INT < 17) {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                float f3 = 0.0f;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble("width");
                        double optDouble4 = optJSONObject.optDouble("height");
                        f2 = Math.max(f2, (float) (optDouble + optDouble3));
                        f3 = Math.max(f3, (float) (optDouble2 + optDouble4));
                    }
                }
                f = f3;
                return new C7943a(f2, f);
            }
        } else if (f19177b != null) {
            Point point = new Point(0, 0);
            f19177b.getDefaultDisplay().getRealSize(point);
            f2 = m22441a(point.x);
            f = m22441a(point.y);
            return new C7943a(f2, f);
        }
        f = 0.0f;
        return new C7943a(f2, f);
    }

    /* renamed from: b */
    public static void m22452b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C7944c.m22460a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m22453b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m22454c(jSONObject, jSONObject2) && m22456e(jSONObject, jSONObject2) && m22455d(jSONObject, jSONObject2) && m22457f(jSONObject, jSONObject2) && m22458g(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m22454c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f19178c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m22455d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m22456e(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: f */
    private static boolean m22457f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22450a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m22458g(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22450a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m22453b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
