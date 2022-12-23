package com.unity3d.services.core.webview;

import android.content.Context;
import android.webkit.WebSettings;

/* renamed from: com.unity3d.services.core.webview.d */
/* compiled from: WebViewWithCache */
public class C12163d extends WebView {
    public C12163d(Context context) {
        super(context);
        WebSettings settings = getSettings();
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
    }
}
