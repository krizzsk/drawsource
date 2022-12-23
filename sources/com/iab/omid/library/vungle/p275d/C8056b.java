package com.iab.omid.library.vungle.p275d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.vungle.p273b.C8044c;
import com.iab.omid.library.vungle.walking.C8071a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.d.b */
public class C8056b {

    /* renamed from: a */
    static float f19481a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f19482b;

    /* renamed from: c */
    private static String[] f19483c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.vungle.d.b$a */
    private static class C8057a {

        /* renamed from: a */
        final float f19484a;

        /* renamed from: b */
        final float f19485b;

        C8057a(float f, float f2) {
            this.f19484a = f;
            this.f19485b = f2;
        }
    }

    /* renamed from: a */
    static float m22995a(int i) {
        return ((float) i) / f19481a;
    }

    /* renamed from: a */
    public static JSONObject m22996a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m22995a(i));
            jSONObject.put("y", (double) m22995a(i2));
            jSONObject.put("width", (double) m22995a(i3));
            jSONObject.put("height", (double) m22995a(i4));
        } catch (JSONException e) {
            C8058c.m23012a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m22997a(Context context) {
        if (context != null) {
            f19481a = context.getResources().getDisplayMetrics().density;
            f19482b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m22998a(JSONObject jSONObject) {
        C8057a b = m23004b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f19484a);
            jSONObject.put("height", (double) b.f19485b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m22999a(JSONObject jSONObject, C8071a.C8072a aVar) {
        C8044c a = aVar.mo56158a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo56160b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo56079b());
            jSONObject.put("friendlyObstructionPurpose", a.mo56080c());
            jSONObject.put("friendlyObstructionReason", a.mo56081d());
        } catch (JSONException e) {
            C8058c.m23012a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m23000a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C8058c.m23012a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m23001a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C8058c.m23012a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m23002a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m23003a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    private static C8057a m23004b(JSONObject jSONObject) {
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
                return new C8057a(f2, f);
            }
        } else if (f19482b != null) {
            Point point = new Point(0, 0);
            f19482b.getDefaultDisplay().getRealSize(point);
            f2 = m22995a(point.x);
            f = m22995a(point.y);
            return new C8057a(f2, f);
        }
        f = 0.0f;
        return new C8057a(f2, f);
    }

    /* renamed from: b */
    public static void m23005b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C8058c.m23012a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m23006b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m23007c(jSONObject, jSONObject2) && m23008d(jSONObject, jSONObject2) && m23009e(jSONObject, jSONObject2) && m23010f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m23007c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f19483c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m23008d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m23009e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m23003a(optJSONArray, optJSONArray2)) {
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
    private static boolean m23010f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m23003a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m23006b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
