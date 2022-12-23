package com.unity3d.services.ads.api;

import com.unity3d.services.ads.token.C11911f;
import com.unity3d.services.ads.token.C11913h;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import org.json.JSONArray;
import org.json.JSONException;

public class Token {
    @WebViewExposed
    public static void appendTokens(JSONArray jSONArray, C12160l lVar) {
        try {
            C11913h.m32462a(jSONArray);
            lVar.mo71347a(new Object[0]);
        } catch (JSONException e) {
            lVar.mo71346a(C11911f.JSON_EXCEPTION, e.getMessage());
        }
    }

    @WebViewExposed
    public static void createTokens(JSONArray jSONArray, C12160l lVar) {
        try {
            C11913h.m32465b(jSONArray);
            lVar.mo71347a(new Object[0]);
        } catch (JSONException e) {
            lVar.mo71346a(C11911f.JSON_EXCEPTION, e.getMessage());
        }
    }

    @WebViewExposed
    public static void deleteTokens(C12160l lVar) {
        C11913h.m32459a();
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void getNativeGeneratedToken(C12160l lVar) {
        C11913h.m32464b();
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void setPeekMode(Boolean bool, C12160l lVar) {
        C11913h.m32463a(bool.booleanValue());
        lVar.mo71347a(new Object[0]);
    }
}
