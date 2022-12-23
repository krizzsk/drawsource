package com.unity3d.services.banners.bridge;

import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;

/* renamed from: com.unity3d.services.banners.bridge.a */
/* compiled from: BannerBridge */
public class C11961a {

    /* renamed from: com.unity3d.services.banners.bridge.a$a */
    /* compiled from: BannerBridge */
    public enum C11962a {
        BANNER_VISIBILITY_CHANGED,
        BANNER_RESIZED,
        BANNER_LOADED,
        BANNER_DESTROYED,
        BANNER_ATTACHED,
        BANNER_DETACHED,
        BANNER_LOAD_PLACEMENT,
        BANNER_DESTROY_BANNER
    }

    /* renamed from: a */
    public static void m32554a(String str, String str2, UnityBannerSize unityBannerSize) {
        C12136a c = C12136a.m33103c();
        if (c != null) {
            c.mo71310a((Enum) C12143b.BANNER, (Enum) C11962a.BANNER_LOAD_PLACEMENT, str, str2, Integer.valueOf(unityBannerSize.getWidth()), Integer.valueOf(unityBannerSize.getHeight()));
            return;
        }
        BannerView bannerView = BannerViewCache.getInstance().getBannerView(str2);
        if (bannerView != null && bannerView.getListener() != null) {
            bannerView.getListener().onBannerFailedToLoad(bannerView, new BannerErrorInfo("WebViewApp was not available, this is likely because UnityAds has not been initialized", BannerErrorCode.WEBVIEW_ERROR));
        }
    }

    /* renamed from: b */
    public static void m32555b(String str) {
        C12136a c = C12136a.m33103c();
        if (c != null) {
            c.mo71310a((Enum) C12143b.BANNER, (Enum) C11962a.BANNER_ATTACHED, str);
        }
    }

    /* renamed from: c */
    public static void m32556c(String str) {
        C12136a c = C12136a.m33103c();
        if (c != null) {
            c.mo71310a((Enum) C12143b.BANNER, (Enum) C11962a.BANNER_DETACHED, str);
        }
    }

    /* renamed from: d */
    public static void m32557d(String str) {
        C12136a c = C12136a.m33103c();
        if (c != null) {
            c.mo71310a((Enum) C12143b.BANNER, (Enum) C11962a.BANNER_LOADED, str);
        }
    }

    /* renamed from: a */
    public static void m32551a(String str) {
        C12136a c = C12136a.m33103c();
        if (c != null) {
            c.mo71310a((Enum) C12143b.BANNER, (Enum) C11962a.BANNER_DESTROY_BANNER, str);
        }
    }

    /* renamed from: a */
    public static void m32553a(String str, int i, int i2, int i3, int i4, float f) {
        C12136a c = C12136a.m33103c();
        if (c != null) {
            c.mo71310a((Enum) C12143b.BANNER, (Enum) C11962a.BANNER_RESIZED, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f));
        }
    }

    /* renamed from: a */
    public static void m32552a(String str, int i) {
        C12136a c = C12136a.m33103c();
        if (c != null) {
            c.mo71310a((Enum) C12143b.BANNER, (Enum) C11962a.BANNER_VISIBILITY_CHANGED, str, Integer.valueOf(i));
        }
    }
}
