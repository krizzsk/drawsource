package com.unity3d.services.core.api;

import com.unity3d.services.core.lifecycle.C12062d;
import com.unity3d.services.core.lifecycle.C12064f;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

public class Lifecycle {

    /* renamed from: a */
    private static C12064f f29115a;

    public static C12064f getLifecycleListener() {
        return f29115a;
    }

    @WebViewExposed
    public static void register(JSONArray jSONArray, C12160l lVar) {
        if (C12084a.m32907d() == null) {
            lVar.mo71346a(C12062d.APPLICATION_NULL, new Object[0]);
        } else if (getLifecycleListener() == null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    arrayList.add((String) jSONArray.get(i));
                    i++;
                } catch (JSONException unused) {
                    lVar.mo71346a(C12062d.JSON_ERROR, new Object[0]);
                    return;
                }
            }
            setLifecycleListener(new C12064f(arrayList));
            C12084a.m32907d().registerActivityLifecycleCallbacks(getLifecycleListener());
            lVar.mo71347a(new Object[0]);
        } else {
            lVar.mo71346a(C12062d.LISTENER_NOT_NULL, new Object[0]);
        }
    }

    public static void setLifecycleListener(C12064f fVar) {
        f29115a = fVar;
    }

    @WebViewExposed
    public static void unregister(C12160l lVar) {
        if (C12084a.m32907d() != null) {
            if (getLifecycleListener() != null) {
                C12084a.m32907d().unregisterActivityLifecycleCallbacks(getLifecycleListener());
                setLifecycleListener((C12064f) null);
            }
            lVar.mo71347a(new Object[0]);
            return;
        }
        lVar.mo71346a(C12062d.APPLICATION_NULL, new Object[0]);
    }
}
