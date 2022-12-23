package com.ogury.p377ed.internal;

import com.ogury.p377ed.OguryBannerAdSize;

/* renamed from: com.ogury.ed.internal.a */
public final class C9801a {

    /* renamed from: a */
    public static final C9801a f24713a = new C9801a();

    /* renamed from: com.ogury.ed.internal.a$a */
    public /* synthetic */ class C9802a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24714a;

        static {
            int[] iArr = new int[OguryBannerAdSize.values().length];
            iArr[OguryBannerAdSize.MPU_300x250.ordinal()] = 1;
            iArr[OguryBannerAdSize.SMALL_BANNER_320x50.ordinal()] = 2;
            f24714a = iArr;
        }
    }

    private C9801a() {
    }

    /* renamed from: a */
    public static C9989ej m28256a(OguryBannerAdSize oguryBannerAdSize) {
        if (oguryBannerAdSize == null) {
            return null;
        }
        int i = C9802a.f24714a[oguryBannerAdSize.ordinal()];
        if (i == 1) {
            return C9989ej.MEDIUM_RECTANGLE;
        }
        if (i == 2) {
            return C9989ej.SMALL_BANNER;
        }
        throw new C10175jy();
    }

    /* renamed from: b */
    public static C9905cn m28257b(OguryBannerAdSize oguryBannerAdSize) {
        if (oguryBannerAdSize == null) {
            return new C9905cn(0, 0);
        }
        return new C9905cn(C10054gi.m29196b(oguryBannerAdSize.getWidth()), C10054gi.m29196b(oguryBannerAdSize.getHeight()));
    }
}
