package com.iab.omid.library.ironsrc.p257d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.ironsrc.p255b.C7880c;
import com.iab.omid.library.ironsrc.walking.C7907a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.d.b */
public class C7892b {

    /* renamed from: a */
    static float f19062a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f19063b;

    /* renamed from: c */
    private static String[] f19064c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.ironsrc.d.b$a */
    static class C7893a {

        /* renamed from: a */
        final float f19065a;

        /* renamed from: b */
        final float f19066b;

        C7893a(float f, float f2) {
            this.f19065a = f;
            this.f19066b = f2;
        }
    }

    /* renamed from: a */
    static float m22215a(int i) {
        return ((float) i) / f19062a;
    }

    /* renamed from: a */
    public static JSONObject m22216a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m22215a(i));
            jSONObject.put("y", (double) m22215a(i2));
            jSONObject.put("width", (double) m22215a(i3));
            jSONObject.put("height", (double) m22215a(i4));
        } catch (JSONException e) {
            C7894c.m22232a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m22217a(Context context) {
        if (context != null) {
            f19062a = context.getResources().getDisplayMetrics().density;
            f19063b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m22218a(JSONObject jSONObject) {
        C7893a b = m22224b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f19065a);
            jSONObject.put("height", (double) b.f19066b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m22219a(JSONObject jSONObject, C7907a.C7908a aVar) {
        C7880c a = aVar.mo55427a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo55429b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo55348b());
            jSONObject.put("friendlyObstructionPurpose", a.mo55349c());
            jSONObject.put("friendlyObstructionReason", a.mo55350d());
        } catch (JSONException e) {
            C7894c.m22232a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m22220a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C7894c.m22232a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m22221a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C7894c.m22232a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m22222a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m22223a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C7893a m22224b(JSONObject jSONObject) {
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
                return new C7893a(f2, f);
            }
        } else if (f19063b != null) {
            Point point = new Point(0, 0);
            f19063b.getDefaultDisplay().getRealSize(point);
            f2 = m22215a(point.x);
            f = m22215a(point.y);
            return new C7893a(f2, f);
        }
        f = 0.0f;
        return new C7893a(f2, f);
    }

    /* renamed from: b */
    public static void m22225b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C7894c.m22232a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m22226b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m22227c(jSONObject, jSONObject2) && m22228d(jSONObject, jSONObject2) && m22229e(jSONObject, jSONObject2) && m22230f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m22227c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f19064c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m22228d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m22229e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22223a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m22230f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22223a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m22226b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
