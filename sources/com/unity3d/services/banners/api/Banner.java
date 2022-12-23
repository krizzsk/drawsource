package com.unity3d.services.banners.api;

import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.C11961a;
import com.unity3d.services.banners.properties.C11963a;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Banner {

    /* renamed from: com.unity3d.services.banners.api.Banner$a */
    static /* synthetic */ class C11959a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29063a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.unity3d.services.banners.api.Banner$b[] r0 = com.unity3d.services.banners.api.Banner.C11960b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29063a = r0
                com.unity3d.services.banners.api.Banner$b r1 = com.unity3d.services.banners.api.Banner.C11960b.WEB_PLAYER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29063a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.banners.api.Banner$b r1 = com.unity3d.services.banners.api.Banner.C11960b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.banners.api.Banner.C11959a.<clinit>():void");
        }
    }

    /* renamed from: com.unity3d.services.banners.api.Banner$b */
    private enum C11960b {
        WEB_PLAYER,
        UNKNOWN;

        /* renamed from: a */
        public static C11960b m32550a(String str) {
            try {
                return valueOf(str);
            } catch (IllegalArgumentException unused) {
                return UNKNOWN;
            }
        }
    }

    @WebViewExposed
    public static void load(String str, Integer num, Integer num2, String str2, C12160l lVar) {
        if (C11959a.f29063a[C11960b.m32550a(str).ordinal()] == 1 && BannerViewCache.getInstance().loadWebPlayer(str2, new UnityBannerSize(num.intValue(), num2.intValue()))) {
            C11961a.m32557d(str2);
        }
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void setRefreshRate(String str, Integer num, C12160l lVar) {
        if (!(str == null || num == null)) {
            C11963a.m32558a().mo70997a(str, num);
        }
        lVar.mo71347a(new Object[0]);
    }
}
