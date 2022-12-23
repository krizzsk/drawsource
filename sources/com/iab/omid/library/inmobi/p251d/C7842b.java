package com.iab.omid.library.inmobi.p251d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.inmobi.p249b.C7830c;
import com.iab.omid.library.inmobi.walking.C7857a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.d.b */
public class C7842b {

    /* renamed from: a */
    static float f18948a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f18949b;

    /* renamed from: c */
    private static String[] f18950c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.inmobi.d.b$a */
    private static class C7843a {

        /* renamed from: a */
        final float f18951a;

        /* renamed from: b */
        final float f18952b;

        C7843a(float f, float f2) {
            this.f18951a = f;
            this.f18952b = f2;
        }
    }

    /* renamed from: a */
    static float m21994a(int i) {
        return ((float) i) / f18948a;
    }

    /* renamed from: a */
    public static JSONObject m21995a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m21994a(i));
            jSONObject.put("y", (double) m21994a(i2));
            jSONObject.put("width", (double) m21994a(i3));
            jSONObject.put("height", (double) m21994a(i4));
        } catch (JSONException e) {
            C7844c.m22011a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m21996a(Context context) {
        if (context != null) {
            f18948a = context.getResources().getDisplayMetrics().density;
            f18949b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m21997a(JSONObject jSONObject) {
        C7843a b = m22003b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f18951a);
            jSONObject.put("height", (double) b.f18952b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m21998a(JSONObject jSONObject, C7857a.C7858a aVar) {
        C7830c a = aVar.mo55241a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo55243b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo55162b());
            jSONObject.put("friendlyObstructionPurpose", a.mo55163c());
            jSONObject.put("friendlyObstructionReason", a.mo55164d());
        } catch (JSONException e) {
            C7844c.m22011a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m21999a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C7844c.m22011a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m22000a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C7844c.m22011a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m22001a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m22002a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    private static C7843a m22003b(JSONObject jSONObject) {
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
                return new C7843a(f2, f);
            }
        } else if (f18949b != null) {
            Point point = new Point(0, 0);
            f18949b.getDefaultDisplay().getRealSize(point);
            f2 = m21994a(point.x);
            f = m21994a(point.y);
            return new C7843a(f2, f);
        }
        f = 0.0f;
        return new C7843a(f2, f);
    }

    /* renamed from: b */
    public static void m22004b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C7844c.m22011a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m22005b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m22006c(jSONObject, jSONObject2) && m22007d(jSONObject, jSONObject2) && m22008e(jSONObject, jSONObject2) && m22009f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m22006c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f18950c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m22007d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m22008e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22002a(optJSONArray, optJSONArray2)) {
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
    private static boolean m22009f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22002a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m22005b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
