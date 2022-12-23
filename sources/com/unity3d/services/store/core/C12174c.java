package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.WebViewAdsError;
import com.unity3d.services.core.webview.C12143b;

/* renamed from: com.unity3d.services.store.core.c */
/* compiled from: StoreWebViewError */
public class C12174c extends WebViewAdsError {
    public C12174c(Enum<?> enumR, String str, Object... objArr) {
        super(enumR, str, objArr);
    }

    public String getDomain() {
        return C12143b.STORE.name();
    }
}
