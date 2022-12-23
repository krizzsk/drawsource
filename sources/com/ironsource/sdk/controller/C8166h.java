package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.C8202x;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.h */
final class C8166h {

    /* renamed from: c */
    private static final String f19847c = C8166h.class.getCanonicalName();

    /* renamed from: a */
    private final C8140d f19848a;

    /* renamed from: b */
    private final C8195t f19849b;

    C8166h(C8140d dVar, C8195t tVar) {
        this.f19848a = dVar;
        this.f19849b = tVar;
    }

    /* renamed from: a */
    private static String m23312a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put("hash", SDKUtils.encodeString(str3));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public final void messageHandler(String str, String str2, String str3) {
        try {
            String str4 = f19847c;
            Logger.m23749i(str4, "messageHandler(" + str + " " + str3 + ")");
            if (this.f19849b.mo56484a(str, str2, str3)) {
                this.f19848a.mo56399a(str, str2);
                return;
            }
            C8140d dVar = this.f19848a;
            String a = m23312a(str, str2, str3);
            if (dVar.f19759a != null) {
                C8202x.C8225d dVar2 = dVar.f19759a;
                C8202x.this.mo56506b(C8202x.m23412a("unauthorizedMessage", a, (String) null, (String) null));
            }
        } catch (Exception e) {
            e.printStackTrace();
            String str5 = f19847c;
            Logger.m23749i(str5, "messageHandler failed with exception " + e.getMessage());
        }
    }
}
