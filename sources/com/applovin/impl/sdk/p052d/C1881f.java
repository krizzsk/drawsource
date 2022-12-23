package com.applovin.impl.sdk.p052d;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.d.f */
public class C1881f {

    /* renamed from: a */
    public static final C1881f f3465a = m4167a("ad_req");

    /* renamed from: b */
    public static final C1881f f3466b = m4167a("ad_imp");

    /* renamed from: c */
    public static final C1881f f3467c = m4167a("ad_session_start");

    /* renamed from: d */
    public static final C1881f f3468d = m4167a("ad_imp_session");

    /* renamed from: e */
    public static final C1881f f3469e = m4167a("cached_files_expired");

    /* renamed from: f */
    public static final C1881f f3470f = m4167a("cache_drop_count");

    /* renamed from: g */
    public static final C1881f f3471g = m4168a("sdk_reset_state_count", true);

    /* renamed from: h */
    public static final C1881f f3472h = m4168a("ad_response_process_failures", true);

    /* renamed from: i */
    public static final C1881f f3473i = m4168a("response_process_failures", true);

    /* renamed from: j */
    public static final C1881f f3474j = m4168a("incent_failed_to_display_count", true);

    /* renamed from: k */
    public static final C1881f f3475k = m4167a("app_paused_and_resumed");

    /* renamed from: l */
    public static final C1881f f3476l = m4168a("ad_rendered_with_mismatched_sdk_key", true);

    /* renamed from: m */
    public static final C1881f f3477m = m4167a("ad_shown_outside_app_count");

    /* renamed from: n */
    public static final C1881f f3478n = m4167a("med_ad_req");

    /* renamed from: o */
    public static final C1881f f3479o = m4168a("med_ad_response_process_failures", true);

    /* renamed from: p */
    public static final C1881f f3480p = m4168a("med_waterfall_ad_no_fill", true);

    /* renamed from: q */
    public static final C1881f f3481q = m4168a("med_waterfall_ad_adapter_load_failed", true);

    /* renamed from: r */
    public static final C1881f f3482r = m4168a("med_waterfall_ad_invalid_response", true);

    /* renamed from: s */
    private static final Set<String> f3483s = new HashSet(32);

    /* renamed from: u */
    private static final Set<C1881f> f3484u = new HashSet(16);

    /* renamed from: t */
    private final String f3485t;

    static {
        m4167a("fullscreen_ad_nil_vc_count");
        m4167a("applovin_bundle_missing");
    }

    private C1881f(String str) {
        this.f3485t = str;
    }

    /* renamed from: a */
    private static C1881f m4167a(String str) {
        return m4168a(str, false);
    }

    /* renamed from: a */
    private static C1881f m4168a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        } else if (!f3483s.contains(str)) {
            f3483s.add(str);
            C1881f fVar = new C1881f(str);
            if (z) {
                f3484u.add(fVar);
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Key has already been used: " + str);
        }
    }
}
