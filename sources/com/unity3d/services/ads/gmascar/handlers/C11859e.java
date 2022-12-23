package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.WebViewAdsError;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;

/* renamed from: com.unity3d.services.ads.gmascar.handlers.e */
/* compiled from: WebViewErrorHandler */
public class C11859e implements IAdsErrorHandler<WebViewAdsError> {
    /* renamed from: a */
    public void handleError(WebViewAdsError webViewAdsError) {
        C12136a.m33103c().mo71310a((Enum) C12143b.valueOf(webViewAdsError.getDomain()), (Enum) webViewAdsError.getErrorCategory(), webViewAdsError.getErrorArguments());
    }
}
