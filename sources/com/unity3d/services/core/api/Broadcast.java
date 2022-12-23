package com.unity3d.services.core.api;

import com.unity3d.services.core.broadcast.C11979a;
import com.unity3d.services.core.broadcast.C11982d;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import org.json.JSONArray;
import org.json.JSONException;

public class Broadcast {
    @WebViewExposed
    public static void addBroadcastListener(String str, JSONArray jSONArray, C12160l lVar) {
        addBroadcastListener(str, (String) null, jSONArray, lVar);
    }

    @WebViewExposed
    public static void removeAllBroadcastListeners(C12160l lVar) {
        C11982d.m32594a();
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void removeBroadcastListener(String str, C12160l lVar) {
        C11982d.m32595a(str);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void addBroadcastListener(String str, String str2, JSONArray jSONArray, C12160l lVar) {
        try {
            if (jSONArray.length() > 0) {
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.getString(i);
                }
                C11982d.m32596a(str, str2, strArr);
            }
            lVar.mo71347a(new Object[0]);
        } catch (JSONException unused) {
            lVar.mo71346a(C11979a.JSON_ERROR, new Object[0]);
        }
    }
}
