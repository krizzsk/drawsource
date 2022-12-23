package com.applovin.impl.sdk.p052d;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.d.b */
public class C1876b {

    /* renamed from: A */
    public static final C1876b f3413A = m4132a("wvhec", "WEB_VIEW_HTTP_ERROR_COUNT");

    /* renamed from: B */
    public static final C1876b f3414B = m4132a("wvrec", "WEB_VIEW_RENDER_ERROR_COUNT");

    /* renamed from: C */
    public static final C1876b f3415C = m4132a("wvsem", "WEB_VIEW_SSL_ERROR_MESSAGES");

    /* renamed from: D */
    public static final C1876b f3416D = m4132a("wvruc", "WEB_VIEW_RENDERER_UNRESPONSIVE_COUNT");

    /* renamed from: G */
    private static final Set<String> f3417G = new HashSet(32);

    /* renamed from: a */
    public static final C1876b f3418a = m4132a("sas", "AD_SOURCE");

    /* renamed from: b */
    public static final C1876b f3419b = m4132a("srt", "AD_RENDER_TIME");

    /* renamed from: c */
    public static final C1876b f3420c = m4132a("sft", "AD_FETCH_TIME");

    /* renamed from: d */
    public static final C1876b f3421d = m4132a("sfs", "AD_FETCH_SIZE");

    /* renamed from: e */
    public static final C1876b f3422e = m4132a("sadb", "AD_DOWNLOADED_BYTES");

    /* renamed from: f */
    public static final C1876b f3423f = m4132a("sacb", "AD_CACHED_BYTES");

    /* renamed from: g */
    public static final C1876b f3424g = m4132a("stdl", "TIME_TO_DISPLAY_FROM_LOAD");

    /* renamed from: h */
    public static final C1876b f3425h = m4132a("stdi", "TIME_TO_DISPLAY_FROM_INIT");

    /* renamed from: i */
    public static final C1876b f3426i = m4132a("snas", "AD_NUMBER_IN_SESSION");

    /* renamed from: j */
    public static final C1876b f3427j = m4132a("snat", "AD_NUMBER_TOTAL");

    /* renamed from: k */
    public static final C1876b f3428k = m4132a("stah", "TIME_AD_HIDDEN_FROM_SHOW");

    /* renamed from: l */
    public static final C1876b f3429l = m4132a("stas", "TIME_TO_SKIP_FROM_SHOW");

    /* renamed from: m */
    public static final C1876b f3430m = m4132a("stac", "TIME_TO_CLICK_FROM_SHOW");

    /* renamed from: n */
    public static final C1876b f3431n = m4132a("stbe", "TIME_TO_EXPAND_FROM_SHOW");

    /* renamed from: o */
    public static final C1876b f3432o = m4132a("stbc", "TIME_TO_CONTRACT_FROM_SHOW");

    /* renamed from: p */
    public static final C1876b f3433p = m4132a("saan", "AD_SHOWN_WITH_ACTIVE_NETWORK");

    /* renamed from: q */
    public static final C1876b f3434q = m4132a("suvs", "INTERSTITIAL_USED_VIDEO_STREAM");

    /* renamed from: r */
    public static final C1876b f3435r = m4132a("sugs", "AD_USED_GRAPHIC_STREAM");

    /* renamed from: s */
    public static final C1876b f3436s = m4132a("svpv", "INTERSTITIAL_VIDEO_PERCENT_VIEWED");

    /* renamed from: t */
    public static final C1876b f3437t = m4132a("stpd", "INTERSTITIAL_PAUSED_DURATION");

    /* renamed from: u */
    public static final C1876b f3438u = m4132a("shsc", "HTML_RESOURCE_CACHE_SUCCESS_COUNT");

    /* renamed from: v */
    public static final C1876b f3439v = m4132a("shfc", "HTML_RESOURCE_CACHE_FAILURE_COUNT");

    /* renamed from: w */
    public static final C1876b f3440w = m4132a("schc", "AD_CANCELLED_HTML_CACHING");

    /* renamed from: x */
    public static final C1876b f3441x = m4132a("smwm", "AD_SHOWN_IN_MULTIWINDOW_MODE");

    /* renamed from: y */
    public static final C1876b f3442y = m4132a("vssc", "VIDEO_STREAM_STALLED_COUNT");

    /* renamed from: z */
    public static final C1876b f3443z = m4132a("wvem", "WEB_VIEW_ERROR_MESSAGES");

    /* renamed from: E */
    private final String f3444E;

    /* renamed from: F */
    private final String f3445F;

    static {
        m4132a("sisw", "IS_STREAMING_WEBKIT");
        m4132a("surw", "UNABLE_TO_RETRIEVE_WEBKIT_HTML_STRING");
        m4132a("surp", "UNABLE_TO_PERSIST_WEBKIT_HTML_PLACEMENT_REPLACED_STRING");
        m4132a("swhp", "SUCCESSFULLY_PERSISTED_WEBKIT_HTML_STRING");
        m4132a("skr", "STOREKIT_REDIRECTED");
        m4132a("sklf", "STOREKIT_LOAD_FAILURE");
        m4132a("skps", "STOREKIT_PRELOAD_SKIPPED");
    }

    private C1876b(String str, String str2) {
        this.f3444E = str;
        this.f3445F = str2;
    }

    /* renamed from: a */
    private static C1876b m4132a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        } else if (f3417G.contains(str)) {
            throw new IllegalArgumentException("Key has already been used: " + str);
        } else if (!TextUtils.isEmpty(str2)) {
            f3417G.add(str);
            return new C1876b(str, str2);
        } else {
            throw new IllegalArgumentException("No debug name specified");
        }
    }
}
