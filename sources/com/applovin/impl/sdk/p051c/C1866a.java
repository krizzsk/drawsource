package com.applovin.impl.sdk.p051c;

import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.c.a */
public class C1866a<T> extends C1867b<T> {

    /* renamed from: A */
    public static final C1867b<Boolean> f3047A = m4079a("fullscreen_ads_block_publisher_load_if_another_showing", true);

    /* renamed from: B */
    public static final C1867b<Boolean> f3048B = m4079a("fabsina", false);

    /* renamed from: C */
    public static final C1867b<Boolean> f3049C = m4079a("fabsiaif", false);

    /* renamed from: D */
    public static final C1867b<Long> f3050D = m4079a("ad_expiration_ms", Long.valueOf(TimeUnit.HOURS.toMillis(4)));

    /* renamed from: E */
    public static final C1867b<Boolean> f3051E = m4079a("saewib", false);

    /* renamed from: F */
    public static final C1867b<Long> f3052F = m4079a("fullscreen_ad_displayed_timeout_ms", -1L);

    /* renamed from: G */
    public static final C1867b<Long> f3053G = m4079a("ad_hidden_timeout_ms", -1L);

    /* renamed from: H */
    public static final C1867b<Boolean> f3054H = m4079a("schedule_ad_hidden_on_ad_dismiss", false);

    /* renamed from: I */
    public static final C1867b<Long> f3055I = m4079a("ad_hidden_on_ad_dismiss_callback_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: J */
    public static final C1867b<Boolean> f3056J = m4079a("proe", false);

    /* renamed from: K */
    public static final C1867b<Integer> f3057K = m4079a("mute_state", 2);

    /* renamed from: L */
    public static final C1867b<String> f3058L = m4079a("saf", "");

    /* renamed from: M */
    public static final C1867b<String> f3059M = m4079a("saui", "");

    /* renamed from: N */
    public static final C1867b<Integer> f3060N = m4079a("mra", -1);

    /* renamed from: O */
    public static final C1867b<String> f3061O = m4079a("mra_af", "INTER,REWARDED,REWARDED_INTER,BANNER,LEADER,MREC");

    /* renamed from: P */
    public static final C1867b<Boolean> f3062P = m4079a("pmp", false);

    /* renamed from: Q */
    public static final C1867b<Boolean> f3063Q = m4079a("sai", false);

    /* renamed from: R */
    public static final C1867b<Boolean> f3064R = m4079a("init_adapter_for_sc", true);

    /* renamed from: S */
    public static final C1867b<Boolean> f3065S = m4079a("init_adapter_for_al", true);

    /* renamed from: T */
    public static final C1867b<Boolean> f3066T = m4079a("fadiafase", true);

    /* renamed from: U */
    public static final C1867b<Boolean> f3067U = m4079a("fetch_mediated_ad_gzip", false);

    /* renamed from: V */
    public static final C1867b<Boolean> f3068V = m4079a("max_postback_gzip", false);

    /* renamed from: a */
    public static final C1867b<String> f3069a = m4079a("afi", "");

    /* renamed from: b */
    public static final C1867b<Long> f3070b = m4079a("afi_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(5)));

    /* renamed from: c */
    public static final C1867b<String> f3071c = m4079a("mediation_endpoint", "https://ms.applovin.com/");

    /* renamed from: d */
    public static final C1867b<String> f3072d = m4079a("mediation_backup_endpoint", "https://ms.applvn.com/");

    /* renamed from: e */
    public static final C1867b<Long> f3073e = m4079a("fetch_next_ad_retry_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(2)));

    /* renamed from: f */
    public static final C1867b<Long> f3074f = m4079a("fetch_next_ad_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(5)));

    /* renamed from: g */
    public static final C1867b<Long> f3075g = m4079a("fetch_mediation_debugger_info_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(7)));

    /* renamed from: h */
    public static final C1867b<Boolean> f3076h = m4079a("auto_init_mediation_debugger", true);

    /* renamed from: i */
    public static final C1867b<String> f3077i = m4079a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");

    /* renamed from: j */
    public static final C1867b<Boolean> f3078j = m4079a("persistent_mediated_postbacks", false);

    /* renamed from: k */
    public static final C1867b<Long> f3079k = m4079a("max_signal_provider_latency_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: l */
    public static final C1867b<Long> f3080l = m4079a("default_adapter_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: m */
    public static final C1867b<Long> f3081m = m4079a("ad_refresh_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: n */
    public static final C1867b<Long> f3082n = m4079a("ad_load_failure_refresh_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: o */
    public static final C1867b<String> f3083o = m4079a("ad_load_failure_refresh_ignore_error_codes", "204");

    /* renamed from: p */
    public static final C1867b<Long> f3084p = m4079a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);

    /* renamed from: q */
    public static final C1867b<Boolean> f3085q = m4079a("refresh_ad_view_timer_responds_to_background", true);

    /* renamed from: r */
    public static final C1867b<Boolean> f3086r = m4079a("refresh_ad_view_timer_responds_to_store_kit", true);

    /* renamed from: s */
    public static final C1867b<Boolean> f3087s = m4079a("refresh_ad_view_timer_responds_to_window_visibility_changed", false);

    /* renamed from: t */
    public static final C1867b<Boolean> f3088t = m4079a("avrsponse", false);

    /* renamed from: u */
    public static final C1867b<Boolean> f3089u = m4079a("allow_pause_auto_refresh_immediately", false);

    /* renamed from: v */
    public static final C1867b<Long> f3090v = m4079a("fullscreen_display_delay_ms", 600L);

    /* renamed from: w */
    public static final C1867b<Boolean> f3091w = m4079a("susaode", false);

    /* renamed from: x */
    public static final C1867b<Long> f3092x = m4079a("ahdm", 500L);

    /* renamed from: y */
    public static final C1867b<Long> f3093y = m4079a("ad_view_refresh_precache_request_viewability_undesired_flags", 502L);

    /* renamed from: z */
    public static final C1867b<Boolean> f3094z = m4079a("ad_view_refresh_precache_request_enabled", true);
}
