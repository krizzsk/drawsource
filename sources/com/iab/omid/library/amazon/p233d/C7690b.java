package com.iab.omid.library.amazon.p233d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.amazon.p231b.C7678c;
import com.iab.omid.library.amazon.walking.C7705a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.d.b */
public class C7690b {

    /* renamed from: a */
    static float f18598a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f18599b;

    /* renamed from: c */
    private static String[] f18600c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.amazon.d.b$a */
    private static class C7691a {

        /* renamed from: a */
        final float f18601a;

        /* renamed from: b */
        final float f18602b;

        C7691a(float f, float f2) {
            this.f18601a = f;
            this.f18602b = f2;
        }
    }

    /* renamed from: a */
    static float m21306a(int i) {
        return ((float) i) / f18598a;
    }

    /* renamed from: a */
    public static JSONObject m21307a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m21306a(i));
            jSONObject.put("y", (double) m21306a(i2));
            jSONObject.put("width", (double) m21306a(i3));
            jSONObject.put("height", (double) m21306a(i4));
        } catch (JSONException e) {
            C7692c.m21325a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m21308a(Context context) {
        if (context != null) {
            f18598a = context.getResources().getDisplayMetrics().density;
            f18599b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m21309a(JSONObject jSONObject) {
        C7691a b = m21316b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f18601a);
            jSONObject.put("height", (double) b.f18602b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m21310a(JSONObject jSONObject, C7705a.C7706a aVar) {
        C7678c a = aVar.mo54649a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo54651b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo54569b());
            jSONObject.put("friendlyObstructionPurpose", a.mo54570c());
            jSONObject.put("friendlyObstructionReason", a.mo54571d());
        } catch (JSONException e) {
            C7692c.m21325a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m21311a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C7692c.m21325a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m21312a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C7692c.m21325a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m21313a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C7692c.m21325a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m21314a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m21315a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    private static C7691a m21316b(JSONObject jSONObject) {
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
                return new C7691a(f2, f);
            }
        } else if (f18599b != null) {
            Point point = new Point(0, 0);
            f18599b.getDefaultDisplay().getRealSize(point);
            f2 = m21306a(point.x);
            f = m21306a(point.y);
            return new C7691a(f2, f);
        }
        f = 0.0f;
        return new C7691a(f2, f);
    }

    /* renamed from: b */
    public static void m21317b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C7692c.m21325a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m21318b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m21319c(jSONObject, jSONObject2) && m21321e(jSONObject, jSONObject2) && m21320d(jSONObject, jSONObject2) && m21322f(jSONObject, jSONObject2) && m21323g(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m21319c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f18600c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m21320d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")) == Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus"));
    }

    /* renamed from: e */
    private static boolean m21321e(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: f */
    private static boolean m21322f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m21315a(optJSONArray, optJSONArray2)) {
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
    private static boolean m21323g(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m21315a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m21318b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
