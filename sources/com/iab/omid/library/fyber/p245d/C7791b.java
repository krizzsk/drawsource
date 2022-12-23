package com.iab.omid.library.fyber.p245d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.fyber.p243b.C7779c;
import com.iab.omid.library.fyber.walking.C7806a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.d.b */
public class C7791b {

    /* renamed from: a */
    static float f18832a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f18833b;

    /* renamed from: c */
    private static String[] f18834c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.fyber.d.b$a */
    private static class C7792a {

        /* renamed from: a */
        final float f18835a;

        /* renamed from: b */
        final float f18836b;

        C7792a(float f, float f2) {
            this.f18835a = f;
            this.f18836b = f2;
        }
    }

    /* renamed from: a */
    static float m21766a(int i) {
        return ((float) i) / f18832a;
    }

    /* renamed from: a */
    public static JSONObject m21767a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m21766a(i));
            jSONObject.put("y", (double) m21766a(i2));
            jSONObject.put("width", (double) m21766a(i3));
            jSONObject.put("height", (double) m21766a(i4));
        } catch (JSONException e) {
            C7793c.m21785a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m21768a(Context context) {
        if (context != null) {
            f18832a = context.getResources().getDisplayMetrics().density;
            f18833b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m21769a(JSONObject jSONObject) {
        C7792a b = m21776b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f18835a);
            jSONObject.put("height", (double) b.f18836b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m21770a(JSONObject jSONObject, C7806a.C7807a aVar) {
        C7779c a = aVar.mo55047a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo55049b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo54967b());
            jSONObject.put("friendlyObstructionPurpose", a.mo54968c());
            jSONObject.put("friendlyObstructionReason", a.mo54969d());
        } catch (JSONException e) {
            C7793c.m21785a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m21771a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C7793c.m21785a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m21772a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C7793c.m21785a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m21773a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C7793c.m21785a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m21774a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m21775a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    private static C7792a m21776b(JSONObject jSONObject) {
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
                return new C7792a(f2, f);
            }
        } else if (f18833b != null) {
            Point point = new Point(0, 0);
            f18833b.getDefaultDisplay().getRealSize(point);
            f2 = m21766a(point.x);
            f = m21766a(point.y);
            return new C7792a(f2, f);
        }
        f = 0.0f;
        return new C7792a(f2, f);
    }

    /* renamed from: b */
    public static void m21777b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C7793c.m21785a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m21778b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m21779c(jSONObject, jSONObject2) && m21781e(jSONObject, jSONObject2) && m21780d(jSONObject, jSONObject2) && m21782f(jSONObject, jSONObject2) && m21783g(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m21779c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f18834c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m21780d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m21781e(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: f */
    private static boolean m21782f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m21775a(optJSONArray, optJSONArray2)) {
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
    private static boolean m21783g(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m21775a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m21778b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
