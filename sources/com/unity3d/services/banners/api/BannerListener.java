package com.unity3d.services.banners.api;

import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class BannerListener {
    @WebViewExposed
    public static void sendClickEvent(String str, C12160l lVar) {
        BannerViewCache.getInstance().triggerBannerClickEvent(str);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void sendErrorEvent(String str, Integer num, String str2, C12160l lVar) {
        BannerViewCache.getInstance().triggerBannerErrorEvent(str, new BannerErrorInfo(str2, BannerErrorCode.values()[num.intValue()]));
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void sendLeaveApplicationEvent(String str, C12160l lVar) {
        BannerViewCache.getInstance().triggerBannerLeftApplicationEvent(str);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void sendLoadEvent(String str, C12160l lVar) {
        BannerViewCache.getInstance().triggerBannerLoadEvent(str);
        lVar.mo71347a(new Object[0]);
    }
}
