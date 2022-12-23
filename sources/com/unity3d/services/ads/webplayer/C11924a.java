package com.unity3d.services.ads.webplayer;

import android.webkit.JavascriptInterface;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;

/* renamed from: com.unity3d.services.ads.webplayer.a */
/* compiled from: WebPlayerBridgeInterface */
public class C11924a {

    /* renamed from: a */
    private final String f28928a;

    public C11924a(String str) {
        this.f28928a = str;
    }

    @JavascriptInterface
    public void handleEvent(String str) {
        if (C12136a.m33103c() != null) {
            C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.WEBPLAYER_EVENT, str, this.f28928a);
        }
    }
}
