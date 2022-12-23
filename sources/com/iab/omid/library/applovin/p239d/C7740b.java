package com.iab.omid.library.applovin.p239d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.applovin.p237b.C7728c;
import com.iab.omid.library.applovin.walking.C7755a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.d.b */
public class C7740b {

    /* renamed from: a */
    static float f18715a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f18716b;

    /* renamed from: c */
    private static String[] f18717c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.applovin.d.b$a */
    private static class C7741a {

        /* renamed from: a */
        final float f18718a;

        /* renamed from: b */
        final float f18719b;

        C7741a(float f, float f2) {
            this.f18718a = f;
            this.f18719b = f2;
        }
    }

    /* renamed from: a */
    static float m21536a(int i) {
        return ((float) i) / f18715a;
    }

    /* renamed from: a */
    public static JSONObject m21537a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m21536a(i));
            jSONObject.put("y", (double) m21536a(i2));
            jSONObject.put("width", (double) m21536a(i3));
            jSONObject.put("height", (double) m21536a(i4));
        } catch (JSONException e) {
            C7742c.m21555a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m21538a(Context context) {
        if (context != null) {
            f18715a = context.getResources().getDisplayMetrics().density;
            f18716b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m21539a(JSONObject jSONObject) {
        C7741a b = m21546b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f18718a);
            jSONObject.put("height", (double) b.f18719b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m21540a(JSONObject jSONObject, C7755a.C7756a aVar) {
        C7728c a = aVar.mo54848a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo54850b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo54768b());
            jSONObject.put("friendlyObstructionPurpose", a.mo54769c());
            jSONObject.put("friendlyObstructionReason", a.mo54770d());
        } catch (JSONException e) {
            C7742c.m21555a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m21541a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C7742c.m21555a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m21542a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C7742c.m21555a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m21543a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C7742c.m21555a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m21544a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m21545a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    private static C7741a m21546b(JSONObject jSONObject) {
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
                return new C7741a(f2, f);
            }
        } else if (f18716b != null) {
            Point point = new Point(0, 0);
            f18716b.getDefaultDisplay().getRealSize(point);
            f2 = m21536a(point.x);
            f = m21536a(point.y);
            return new C7741a(f2, f);
        }
        f = 0.0f;
        return new C7741a(f2, f);
    }

    /* renamed from: b */
    public static void m21547b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C7742c.m21555a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m21548b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m21549c(jSONObject, jSONObject2) && m21551e(jSONObject, jSONObject2) && m21550d(jSONObject, jSONObject2) && m21552f(jSONObject, jSONObject2) && m21553g(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m21549c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f18717c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m21550d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m21551e(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: f */
    private static boolean m21552f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m21545a(optJSONArray, optJSONArray2)) {
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
    private static boolean m21553g(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m21545a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m21548b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
