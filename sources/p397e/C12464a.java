package p397e;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: e.a */
public final class C12464a {
    /* renamed from: a */
    public static String m33280a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m33281b() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: c */
    public static String m33282c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m33283d() {
        JSONObject jSONObject = new JSONObject();
        C12465b.m33291a(jSONObject, "deviceType", m33280a());
        C12465b.m33291a(jSONObject, "osVersion", m33282c());
        C12465b.m33291a(jSONObject, "os", m33281b());
        return jSONObject;
    }
}
