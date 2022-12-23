package com.ogury.p377ed.internal;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ogury.ed.internal.ej */
public enum C9989ej {
    INTERSTITIAL("interstitial", IronSourceConstants.INTERSTITIAL_AD_UNIT),
    OPTIN_VIDEO("optin_video", "Optin Video"),
    OVERLAY_THUMBNAIL("overlay_thumbnail", "Thumbnail"),
    SMALL_BANNER("banner_320x50", "Small Banner (320x50)"),
    MEDIUM_RECTANGLE("medium_rectangle", "MPU (300x250)");
    

    /* renamed from: a */
    public static final C9990a f25126a = null;

    /* renamed from: g */
    private final String f25133g;

    /* renamed from: h */
    private final String f25134h;

    private C9989ej(String str, String str2) {
        this.f25133g = str;
        this.f25134h = str2;
    }

    /* renamed from: a */
    public final String mo64568a() {
        return this.f25133g;
    }

    /* renamed from: b */
    public final String mo64569b() {
        return this.f25134h;
    }

    static {
        f25126a = new C9990a((byte) 0);
    }

    /* renamed from: c */
    public final boolean mo64570c() {
        return this == INTERSTITIAL || this == OPTIN_VIDEO;
    }

    /* renamed from: d */
    public final boolean mo64571d() {
        return this == OVERLAY_THUMBNAIL;
    }

    /* renamed from: e */
    public final boolean mo64572e() {
        return this == SMALL_BANNER || this == MEDIUM_RECTANGLE;
    }

    /* renamed from: com.ogury.ed.internal.ej$a */
    public static final class C9990a {
        public /* synthetic */ C9990a(byte b) {
            this();
        }

        private C9990a() {
        }

        /* renamed from: a */
        public static String m28913a(String str) {
            C10263mq.m29882b(str, "adUnitType");
            C9989ej[] values = C9989ej.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                C9989ej ejVar = values[i];
                i++;
                if (C10263mq.m29881a((Object) ejVar.mo64568a(), (Object) str)) {
                    return ejVar.mo64569b();
                }
            }
            return str;
        }
    }
}
