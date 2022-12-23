package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.da */
/* compiled from: ExpandProperties */
public class C5904da {

    /* renamed from: d */
    private static final String f14940d = C5904da.class.getSimpleName();

    /* renamed from: a */
    public boolean f14941a = false;

    /* renamed from: b */
    public boolean f14942b;

    /* renamed from: c */
    public String f14943c;

    /* renamed from: e */
    private boolean f14944e = true;

    public C5904da() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", C6215il.m18444a().f15672a);
            jSONObject.put("height", C6215il.m18444a().f15673b);
            jSONObject.put("useCustomClose", this.f14941a);
            jSONObject.put("isModal", this.f14944e);
        } catch (JSONException unused) {
        }
        this.f14943c = jSONObject.toString();
    }

    /* renamed from: a */
    public static C5904da m17572a(String str) {
        C5904da daVar = new C5904da();
        daVar.f14943c = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            daVar.f14944e = true;
            if (jSONObject.has("useCustomClose")) {
                daVar.f14942b = true;
            }
            daVar.f14941a = jSONObject.optBoolean("useCustomClose", false);
        } catch (JSONException unused) {
        }
        return daVar;
    }
}
