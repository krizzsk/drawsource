package com.unity3d.services.core.webview.bridge;

import android.webkit.JavascriptInterface;
import com.unity3d.services.core.log.C12065a;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.unity3d.services.core.webview.bridge.i */
/* compiled from: WebViewBridgeInterface */
public class C12152i {
    /* renamed from: a */
    private Object[] m33142a(JSONArray jSONArray) throws JSONException {
        Object[] objArr = new Object[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            objArr[i] = jSONArray.get(i);
        }
        return objArr;
    }

    @JavascriptInterface
    public void handleCallback(String str, String str2, String str3) throws Exception {
        Object[] objArr;
        C12065a.m32845b("handleCallback " + str + " " + str2 + " " + str3);
        JSONArray jSONArray = new JSONArray(str3);
        if (jSONArray.length() > 0) {
            objArr = new Object[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                objArr[i] = jSONArray.get(i);
            }
        } else {
            objArr = null;
        }
        C12150g.m33141b(str, str2, objArr);
    }

    @JavascriptInterface
    public void handleInvocation(String str) throws JSONException {
        C12065a.m32845b("handleInvocation " + str);
        JSONArray jSONArray = new JSONArray(str);
        C12148e eVar = new C12148e();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = (JSONArray) jSONArray.get(i);
            eVar.mo71333a((String) jSONArray2.get(0), (String) jSONArray2.get(1), m33142a((JSONArray) jSONArray2.get(2)), new C12160l((String) jSONArray2.get(3), eVar.mo71331a()));
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            eVar.mo71335c();
        }
        eVar.mo71336d();
    }
}
