package com.unity3d.services.core.api;

import com.unity3d.services.core.connectivity.C12004c;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* renamed from: com.unity3d.services.core.api.Connectivity */
public class C11970Connectivity {
    @WebViewExposed
    public static void setConnectionMonitoring(Boolean bool, C12160l lVar) {
        C12004c.m32657a(bool.booleanValue());
        lVar.mo71347a(new Object[0]);
    }
}
