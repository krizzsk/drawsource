package p397e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.smaato.walking.C8030a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p012c.C0692c;

/* renamed from: e.b */
public class C12465b {

    /* renamed from: a */
    private static WindowManager f29786a;

    /* renamed from: b */
    private static String[] f29787b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f29788c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: e.b$a */
    private static class C12466a {

        /* renamed from: a */
        final float f29789a;

        /* renamed from: b */
        final float f29790b;

        C12466a(float f, float f2) {
            this.f29789a = f;
            this.f29790b = f2;
        }
    }

    /* renamed from: a */
    static float m33284a(int i) {
        return ((float) i) / f29788c;
    }

    /* renamed from: a */
    private static C12466a m33285a(JSONObject jSONObject) {
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
                return new C12466a(f2, f);
            }
        } else if (f29786a != null) {
            Point point = new Point(0, 0);
            f29786a.getDefaultDisplay().getRealSize(point);
            f2 = m33284a(point.x);
            f = m33284a(point.y);
            return new C12466a(f2, f);
        }
        f = 0.0f;
        return new C12466a(f2, f);
    }

    /* renamed from: a */
    public static JSONObject m33286a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m33284a(i));
            jSONObject.put("y", (double) m33284a(i2));
            jSONObject.put("width", (double) m33284a(i3));
            jSONObject.put("height", (double) m33284a(i4));
        } catch (JSONException e) {
            C12467c.m33303a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m33287a(Context context) {
        if (context != null) {
            f29788c = context.getResources().getDisplayMetrics().density;
            f29786a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m33288a(JSONObject jSONObject, C8030a.C8031a aVar) {
        C0692c a = aVar.mo55981a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo55983b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo10283d());
            jSONObject.put("friendlyObstructionPurpose", a.mo10281b());
            jSONObject.put("friendlyObstructionReason", a.mo10280a());
        } catch (JSONException e) {
            C12467c.m33303a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m33289a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C12467c.m33303a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m33290a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C12467c.m33303a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m33291a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C12467c.m33303a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m33292a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m33293a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    public static void m33294b(JSONObject jSONObject) {
        C12466a a = m33285a(jSONObject);
        try {
            jSONObject.put("width", (double) a.f29789a);
            jSONObject.put("height", (double) a.f29790b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m33295b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C12467c.m33303a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    private static boolean m33296b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m33293a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m33301g(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m33297c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m33293a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m33298d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m33299e(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f29787b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m33300f(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: g */
    public static boolean m33301g(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m33299e(jSONObject, jSONObject2) && m33300f(jSONObject, jSONObject2) && m33298d(jSONObject, jSONObject2) && m33297c(jSONObject, jSONObject2) && m33296b(jSONObject, jSONObject2);
    }
}
