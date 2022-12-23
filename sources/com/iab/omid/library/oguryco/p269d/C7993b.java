package com.iab.omid.library.oguryco.p269d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.oguryco.p267b.C7981c;
import com.iab.omid.library.oguryco.walking.C8008a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.d.b */
public class C7993b {

    /* renamed from: a */
    static float f19300a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f19301b;

    /* renamed from: c */
    private static String[] f19302c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.oguryco.d.b$a */
    static class C7994a {

        /* renamed from: a */
        final float f19303a;

        /* renamed from: b */
        final float f19304b;

        C7994a(float f, float f2) {
            this.f19303a = f;
            this.f19304b = f2;
        }
    }

    /* renamed from: a */
    static float m22674a(int i) {
        return ((float) i) / f19300a;
    }

    /* renamed from: a */
    public static JSONObject m22675a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m22674a(i));
            jSONObject.put("y", (double) m22674a(i2));
            jSONObject.put("width", (double) m22674a(i3));
            jSONObject.put("height", (double) m22674a(i4));
        } catch (JSONException e) {
            C7995c.m22691a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m22676a(Context context) {
        if (context != null) {
            f19300a = context.getResources().getDisplayMetrics().density;
            f19301b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m22677a(JSONObject jSONObject) {
        C7994a b = m22683b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f19303a);
            jSONObject.put("height", (double) b.f19304b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m22678a(JSONObject jSONObject, C8008a.C8009a aVar) {
        C7981c a = aVar.mo55840a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo55842b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo55761b());
            jSONObject.put("friendlyObstructionPurpose", a.mo55762c());
            jSONObject.put("friendlyObstructionReason", a.mo55763d());
        } catch (JSONException e) {
            C7995c.m22691a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m22679a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C7995c.m22691a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m22680a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C7995c.m22691a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m22681a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m22682a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C7994a m22683b(JSONObject jSONObject) {
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
                return new C7994a(f2, f);
            }
        } else if (f19301b != null) {
            Point point = new Point(0, 0);
            f19301b.getDefaultDisplay().getRealSize(point);
            f2 = m22674a(point.x);
            f = m22674a(point.y);
            return new C7994a(f2, f);
        }
        f = 0.0f;
        return new C7994a(f2, f);
    }

    /* renamed from: b */
    public static void m22684b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C7995c.m22691a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m22685b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m22686c(jSONObject, jSONObject2) && m22687d(jSONObject, jSONObject2) && m22688e(jSONObject, jSONObject2) && m22689f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m22686c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f19302c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m22687d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m22688e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22682a(optJSONArray, optJSONArray2)) {
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
    private static boolean m22689f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22682a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m22685b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
