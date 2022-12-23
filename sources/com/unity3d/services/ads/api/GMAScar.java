package com.unity3d.services.ads.api;

import com.unity3d.services.ads.gmascar.C11839a;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import org.json.JSONArray;
import org.json.JSONException;

public class GMAScar {

    /* renamed from: a */
    private static final C11839a f28721a = new C11839a();

    /* renamed from: a */
    private static String[] m32324a(JSONArray jSONArray) throws JSONException {
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return strArr;
    }

    @WebViewExposed
    public static void getSCARSignals(JSONArray jSONArray, JSONArray jSONArray2, C12160l lVar) throws JSONException {
        f28721a.mo70779a(m32324a(jSONArray), m32324a(jSONArray2));
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void getVersion(C12160l lVar) {
        f28721a.mo70780b();
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void initializeScar(C12160l lVar) {
        f28721a.mo70781c();
        lVar.mo71347a(new Object[0]);
    }

    public static void isInitialized(C12160l lVar) {
        f28721a.mo70782d();
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void load(String str, String str2, Boolean bool, String str3, String str4, Integer num, C12160l lVar) {
        f28721a.mo70778a(bool.booleanValue(), str, str2, str4, str3, num.intValue());
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void show(String str, String str2, Boolean bool, C12160l lVar) {
        f28721a.mo70777a(str, str2, bool.booleanValue());
        lVar.mo71347a(new Object[0]);
    }
}
