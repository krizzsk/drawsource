package com.unity3d.services.analytics.core.api;

import com.unity3d.services.analytics.interfaces.C11939a;
import com.unity3d.services.analytics.interfaces.C11940b;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Analytics {
    public static C11940b analyticsInterface;

    /* renamed from: com.unity3d.services.analytics.core.api.Analytics$a */
    static class C11938a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28990a;

        C11938a(String str) {
            this.f28990a = str;
        }

        public void run() {
            Analytics.analyticsInterface.mo70947a(this.f28990a);
        }
    }

    @WebViewExposed
    public static void addExtras(String str, C12160l lVar) {
        if (analyticsInterface != null) {
            C12080j.m32879a((Runnable) new C11938a(str));
            lVar.mo71347a(new Object[0]);
            return;
        }
        lVar.mo71346a(C11939a.API_NOT_FOUND, str);
    }

    public static void setAnalyticsInterface(C11940b bVar) {
        analyticsInterface = bVar;
    }
}
