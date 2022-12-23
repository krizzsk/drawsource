package com.bytedance.sdk.openadsdk.core.p149e;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.p */
/* compiled from: PlayableModel */
public class C3434p {

    /* renamed from: a */
    private boolean f8449a;

    /* renamed from: b */
    private int f8450b;

    /* renamed from: c */
    private String f8451c;

    /* renamed from: d */
    private String f8452d;

    /* renamed from: e */
    private int f8453e;

    /* renamed from: e */
    public static boolean m10493e(C3431n nVar) {
        return false;
    }

    public C3434p(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("playable");
            if (optJSONObject != null) {
                this.f8452d = optJSONObject.optString("playable_url", "");
                this.f8453e = optJSONObject.optInt("playable_orientation", 0);
            }
            this.f8449a = jSONObject.optBoolean("is_playable");
            this.f8450b = jSONObject.optInt("playable_type", 0);
            this.f8451c = jSONObject.optString("playable_style");
        }
    }

    /* renamed from: a */
    public void mo19684a(JSONObject jSONObject) {
        try {
            jSONObject.put("is_playable", this.f8449a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (!TextUtils.isEmpty(this.f8452d)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("playable_url", this.f8452d);
                jSONObject2.put("playable_orientation", this.f8453e);
                jSONObject.put("playable", jSONObject2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try {
            jSONObject.put("playable_type", this.f8450b);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        try {
            jSONObject.put("playable_style", this.f8451c);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: k */
    private static C3434p m10499k(C3431n nVar) {
        if (nVar == null) {
            return null;
        }
        return nVar.mo19611e();
    }

    /* renamed from: a */
    public static boolean m10489a(C3431n nVar) {
        C3434p k = m10499k(nVar);
        if (k != null && k.f8449a && !TextUtils.isEmpty(m10492d(nVar))) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private static int m10500l(C3431n nVar) {
        C3434p k = m10499k(nVar);
        if (k == null) {
            return 0;
        }
        return k.f8450b;
    }

    /* renamed from: b */
    public static String m10490b(C3431n nVar) {
        C3434p k = m10499k(nVar);
        if (k == null) {
            return null;
        }
        return k.f8451c;
    }

    /* renamed from: c */
    public static String m10491c(C3431n nVar) {
        C3434p k = m10499k(nVar);
        if (k == null) {
            return null;
        }
        return k.f8452d;
    }

    /* renamed from: d */
    public static String m10492d(C3431n nVar) {
        if (nVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(m10491c(nVar))) {
            return m10491c(nVar);
        }
        if (nVar.mo19517J() != null) {
            return nVar.mo19517J().mo15955j();
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m10494f(C3431n nVar) {
        if (((nVar == null || nVar.mo19517J() == null) ? 0 : nVar.mo19517J().mo15963r()) != 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m10495g(C3431n nVar) {
        if (nVar == null || nVar.mo19517J() == null || nVar.mo19517J().mo15963r() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static int m10496h(C3431n nVar) {
        C3434p k = m10499k(nVar);
        if (k == null) {
            return 0;
        }
        return k.f8453e;
    }

    /* renamed from: i */
    public static boolean m10497i(C3431n nVar) {
        return m10489a(nVar) && m10500l(nVar) == 1;
    }

    /* renamed from: j */
    public static boolean m10498j(C3431n nVar) {
        return m10489a(nVar) && m10500l(nVar) == 0;
    }
}
