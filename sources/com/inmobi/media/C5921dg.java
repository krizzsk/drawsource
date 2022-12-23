package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.dg */
/* compiled from: OrientationProperties */
public class C5921dg {

    /* renamed from: e */
    private static String f14994e = C5921dg.class.getSimpleName();

    /* renamed from: a */
    public boolean f14995a = true;

    /* renamed from: b */
    public String f14996b = "none";

    /* renamed from: c */
    public String f14997c = "right";

    /* renamed from: d */
    public String f14998d = null;

    /* renamed from: a */
    public static C5921dg m17607a(String str, C5921dg dgVar) {
        C5921dg dgVar2 = new C5921dg();
        dgVar2.f14998d = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            dgVar2.f14996b = jSONObject.optString("forceOrientation", dgVar.f14996b);
            dgVar2.f14995a = jSONObject.optBoolean("allowOrientationChange", dgVar.f14995a);
            dgVar2.f14997c = jSONObject.optString("direction", dgVar.f14997c);
            if (!dgVar2.f14996b.equals("portrait") && !dgVar2.f14996b.equals("landscape")) {
                dgVar2.f14996b = "none";
            }
            if (dgVar2.f14997c.equals("left") || dgVar2.f14997c.equals("right")) {
                return dgVar2;
            }
            dgVar2.f14997c = "right";
            return dgVar2;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String toString() {
        return "OrientationProperties{allowOrientationChange=" + this.f14995a + ", forceOrientation='" + this.f14996b + '\'' + ", direction='" + this.f14997c + '\'' + ", creativeSuppliedProperties='" + this.f14998d + '\'' + '}';
    }
}
