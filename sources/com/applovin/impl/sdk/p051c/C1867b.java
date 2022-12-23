package com.applovin.impl.sdk.p051c;

import android.net.Uri;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.p028a.C1428m;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.google.android.exoplayer2.audio.AacUtil;
import com.tapjoy.TapjoyConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.c.b */
public class C1867b<T> implements Comparable {

    /* renamed from: W */
    public static final C1867b<Boolean> f3095W = m4079a("is_disabled", false);

    /* renamed from: X */
    public static final C1867b<String> f3096X = m4079a("device_id", "");

    /* renamed from: Y */
    public static final C1867b<Boolean> f3097Y = m4079a("rss", true);

    /* renamed from: Z */
    public static final C1867b<String> f3098Z = m4079a("device_token", "");

    /* renamed from: a */
    private static final List<?> f3099a = Arrays.asList(new Class[]{Boolean.class, Float.class, Integer.class, Long.class, String.class});

    /* renamed from: aA */
    public static final C1867b<Long> f3100aA = m4079a("alert_consent_after_init_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));

    /* renamed from: aB */
    public static final C1867b<Long> f3101aB = m4079a("alert_consent_after_dialog_rejection_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(30)));

    /* renamed from: aC */
    public static final C1867b<Long> f3102aC = m4079a("alert_consent_after_dialog_close_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));

    /* renamed from: aD */
    public static final C1867b<Long> f3103aD = m4079a("alert_consent_after_dialog_close_with_back_button_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));

    /* renamed from: aE */
    public static final C1867b<Long> f3104aE = m4079a("alert_consent_after_cancel_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(10)));

    /* renamed from: aF */
    public static final C1867b<Long> f3105aF = m4079a("alert_consent_reschedule_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));

    /* renamed from: aG */
    public static final C1867b<String> f3106aG = m4079a("text_alert_consent_title", "Make this App Better and Stay Free!");

    /* renamed from: aH */
    public static final C1867b<String> f3107aH = m4079a("text_alert_consent_body", "If you don't give us consent to use your data, you will be making our ability to support this app harder, which may negatively affect the user experience.");

    /* renamed from: aI */
    public static final C1867b<String> f3108aI = m4079a("text_alert_consent_yes_option", "I Agree");

    /* renamed from: aJ */
    public static final C1867b<String> f3109aJ = m4079a("text_alert_consent_no_option", "Cancel");

    /* renamed from: aK */
    public static final C1867b<Long> f3110aK = m4079a("ttc_max_click_duration_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: aL */
    public static final C1867b<Integer> f3111aL = m4079a("ttc_max_click_distance_dp", 10);

    /* renamed from: aM */
    public static final C1867b<Integer> f3112aM = m4079a("ttc_acrsv2a", Integer.valueOf(AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN.ordinal()));

    /* renamed from: aN */
    public static final C1867b<Integer> f3113aN = m4079a("ttc_edge_buffer_dp", 0);

    /* renamed from: aO */
    public static final C1867b<String> f3114aO = m4079a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");

    /* renamed from: aP */
    public static final C1867b<String> f3115aP = m4079a("fetch_settings_endpoint", "https://ms.applovin.com/");

    /* renamed from: aQ */
    public static final C1867b<String> f3116aQ = m4079a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");

    /* renamed from: aR */
    public static final C1867b<String> f3117aR = m4079a("adserver_endpoint", "https://a.applovin.com/");

    /* renamed from: aS */
    public static final C1867b<String> f3118aS = m4079a("adserver_backup_endpoint", "https://a.applvn.com/");

    /* renamed from: aT */
    public static final C1867b<String> f3119aT = m4079a("api_endpoint", "https://d.applovin.com/");

    /* renamed from: aU */
    public static final C1867b<String> f3120aU = m4079a("api_backup_endpoint", "https://d.applvn.com/");

    /* renamed from: aV */
    public static final C1867b<String> f3121aV = m4079a("event_tracking_endpoint_v2", "https://rt.applovin.com/");

    /* renamed from: aW */
    public static final C1867b<String> f3122aW = m4079a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");

    /* renamed from: aX */
    public static final C1867b<String> f3123aX = m4079a("fetch_variables_endpoint", "https://ms.applovin.com/");

    /* renamed from: aY */
    public static final C1867b<String> f3124aY = m4079a("fetch_variables_backup_endpoint", "https://ms.applvn.com/");

    /* renamed from: aZ */
    public static final C1867b<String> f3125aZ = m4079a("anr_postback_endpoint", "https://ms.applovin.com/1.0/sdk/error");

    /* renamed from: aa */
    public static final C1867b<Long> f3126aa = m4079a("publisher_id", 0L);

    /* renamed from: ab */
    public static final C1867b<Boolean> f3127ab = m4079a("is_verbose_logging", false);

    /* renamed from: ac */
    public static final C1867b<String> f3128ac = m4079a("sc", "");

    /* renamed from: ad */
    public static final C1867b<String> f3129ad = m4079a("sc2", "");

    /* renamed from: ae */
    public static final C1867b<String> f3130ae = m4079a("sc3", "");

    /* renamed from: af */
    public static final C1867b<String> f3131af = m4079a("server_installed_at", "");

    /* renamed from: ag */
    public static final C1867b<Boolean> f3132ag = m4079a("track_network_response_codes", false);

    /* renamed from: ah */
    public static final C1867b<Boolean> f3133ah = m4079a("submit_network_response_codes", false);

    /* renamed from: ai */
    public static final C1867b<Boolean> f3134ai = m4079a("clear_network_response_codes_on_request", true);

    /* renamed from: aj */
    public static final C1867b<Boolean> f3135aj = m4079a("clear_completion_callback_on_failure", false);

    /* renamed from: ak */
    public static final C1867b<Long> f3136ak = m4079a("sicd_ms", 0L);

    /* renamed from: al */
    public static final C1867b<Integer> f3137al = m4079a("logcat_max_line_size", 1000);

    /* renamed from: am */
    public static final C1867b<Integer> f3138am = m4079a("stps", 16);

    /* renamed from: an */
    public static final C1867b<Boolean> f3139an = m4079a("ustp", false);

    /* renamed from: ao */
    public static final C1867b<Boolean> f3140ao = m4079a("exception_handler_enabled", true);

    /* renamed from: ap */
    public static final C1867b<Integer> f3141ap = m4079a("network_thread_count", 4);

    /* renamed from: aq */
    public static final C1867b<Boolean> f3142aq = m4079a("init_omsdk", true);

    /* renamed from: ar */
    public static final C1867b<String> f3143ar = m4079a("omsdk_partner_name", "applovin");

    /* renamed from: as */
    public static final C1867b<Boolean> f3144as = m4079a("publisher_can_show_consent_dialog", true);

    /* renamed from: at */
    public static final C1867b<String> f3145at = m4079a("consent_dialog_url", "https://assets.applovin.com/gdpr/flow_v1/gdpr-flow-1.html");

    /* renamed from: au */
    public static final C1867b<Boolean> f3146au = m4079a("consent_dialog_immersive_mode_on", false);

    /* renamed from: av */
    public static final C1867b<Long> f3147av = m4079a("consent_dialog_show_from_alert_delay_ms", 450L);

    /* renamed from: aw */
    public static final C1867b<Boolean> f3148aw = m4079a("alert_consent_for_dialog_rejected", false);

    /* renamed from: ax */
    public static final C1867b<Boolean> f3149ax = m4079a("alert_consent_for_dialog_closed", false);

    /* renamed from: ay */
    public static final C1867b<Boolean> f3150ay = m4079a("alert_consent_for_dialog_closed_with_back_button", false);

    /* renamed from: az */
    public static final C1867b<Boolean> f3151az = m4079a("alert_consent_after_init", false);

    /* renamed from: b */
    private static final Map<String, C1867b<?>> f3152b = new HashMap(512);

    /* renamed from: bA */
    public static final C1867b<String> f3153bA = m4079a("text_incent_nonvideo_warning_title", "Attention!");

    /* renamed from: bB */
    public static final C1867b<String> f3154bB = m4079a("text_incent_nonvideo_warning_body", "You won’t get your reward if the game hasn’t finished.");

    /* renamed from: bC */
    public static final C1867b<String> f3155bC = m4079a("text_incent_nonvideo_warning_close_option", "Close");

    /* renamed from: bD */
    public static final C1867b<String> f3156bD = m4079a("text_incent_nonvideo_warning_continue_option", "Keep Playing");

    /* renamed from: bE */
    public static final C1867b<Boolean> f3157bE = m4079a("check_webview_has_gesture", false);

    /* renamed from: bF */
    public static final C1867b<Integer> f3158bF = m4079a("close_button_touch_area", 0);

    /* renamed from: bG */
    public static final C1867b<Integer> f3159bG = m4079a("close_button_outside_touch_area", 0);

    /* renamed from: bH */
    public static final C1867b<Boolean> f3160bH = m4079a("creative_debugger_enabled", false);

    /* renamed from: bI */
    public static final C1867b<Long> f3161bI = m4079a("viewability_adview_imp_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: bJ */
    public static final C1867b<Integer> f3162bJ = m4079a("viewability_adview_banner_min_width", 320);

    /* renamed from: bK */
    public static final C1867b<Integer> f3163bK = m4079a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));

    /* renamed from: bL */
    public static final C1867b<Integer> f3164bL = m4079a("viewability_adview_mrec_min_width", Integer.valueOf(MaxAdFormat.MREC.getSize().getWidth()));

    /* renamed from: bM */
    public static final C1867b<Integer> f3165bM = m4079a("viewability_adview_mrec_min_height", Integer.valueOf(MaxAdFormat.MREC.getSize().getHeight()));

    /* renamed from: bN */
    public static final C1867b<Integer> f3166bN = m4079a("viewability_adview_leader_min_width", 728);

    /* renamed from: bO */
    public static final C1867b<Integer> f3167bO = m4079a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));

    /* renamed from: bP */
    public static final C1867b<Integer> f3168bP = m4079a("viewability_adview_native_min_width", 0);

    /* renamed from: bQ */
    public static final C1867b<Integer> f3169bQ = m4079a("viewability_adview_native_min_height", 0);

    /* renamed from: bR */
    public static final C1867b<Float> f3170bR = m4079a("viewability_adview_min_alpha", Float.valueOf(10.0f));

    /* renamed from: bS */
    public static final C1867b<Long> f3171bS = m4079a("viewability_timer_min_visible_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: bT */
    public static final C1867b<Long> f3172bT = m4079a("viewability_timer_interval_ms", 100L);

    /* renamed from: bU */
    public static final C1867b<Integer> f3173bU = m4079a("expandable_close_button_size", 27);

    /* renamed from: bV */
    public static final C1867b<Integer> f3174bV = m4079a("expandable_h_close_button_margin", 10);

    /* renamed from: bW */
    public static final C1867b<Integer> f3175bW = m4079a("expandable_t_close_button_margin", 10);

    /* renamed from: bX */
    public static final C1867b<Boolean> f3176bX = m4079a("expandable_lhs_close_button", false);

    /* renamed from: bY */
    public static final C1867b<Integer> f3177bY = m4079a("expandable_close_button_touch_area", 0);

    /* renamed from: bZ */
    public static final C1867b<Boolean> f3178bZ = m4079a("iaad", false);

    /* renamed from: ba */
    public static final C1867b<String> f3179ba = m4079a("token_type_prefixes_r", "4!");

    /* renamed from: bb */
    public static final C1867b<String> f3180bb = m4079a("token_type_prefixes_arj", "json_v3!");

    /* renamed from: bc */
    public static final C1867b<String> f3181bc = m4079a("top_level_events", "landing,paused,resumed,ref,rdf,checkout,iap");

    /* renamed from: bd */
    public static final C1867b<String> f3182bd = m4079a("valid_super_property_types", String.class.getName() + "," + Integer.class.getName() + "," + Long.class.getName() + "," + Double.class.getName() + "," + Float.class.getName() + "," + Date.class.getName() + "," + Uri.class.getName() + "," + List.class.getName() + "," + Map.class.getName());

    /* renamed from: be */
    public static final C1867b<Boolean> f3183be = m4079a("persist_super_properties", true);

    /* renamed from: bf */
    public static final C1867b<Integer> f3184bf = m4079a("super_property_string_max_length", 1024);

    /* renamed from: bg */
    public static final C1867b<Integer> f3185bg = m4079a("super_property_url_max_length", 1024);

    /* renamed from: bh */
    public static final C1867b<Long> f3186bh = m4079a("cached_advertising_info_ttl_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(10)));

    /* renamed from: bi */
    public static final C1867b<Boolean> f3187bi = m4079a("use_per_format_cache_queues", true);

    /* renamed from: bj */
    public static final C1867b<Boolean> f3188bj = m4079a("cache_cleanup_enabled", false);

    /* renamed from: bk */
    public static final C1867b<Long> f3189bk = m4079a("cache_file_ttl_seconds", Long.valueOf(TimeUnit.DAYS.toSeconds(1)));

    /* renamed from: bl */
    public static final C1867b<Integer> f3190bl = m4079a("cache_max_size_mb", -1);

    /* renamed from: bm */
    public static final C1867b<String> f3191bm = m4079a("precache_delimiters", ")]',");

    /* renamed from: bn */
    public static final C1867b<Boolean> f3192bn = m4079a("ad_resource_caching_enabled", true);

    /* renamed from: bo */
    public static final C1867b<Boolean> f3193bo = m4079a("fail_ad_load_on_failed_video_cache", true);

    /* renamed from: bp */
    public static final C1867b<String> f3194bp = m4079a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");

    /* renamed from: bq */
    public static final C1867b<String> f3195bq = m4079a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");

    /* renamed from: br */
    public static final C1867b<Boolean> f3196br = m4079a("use_old_file_manager", false);

    /* renamed from: bs */
    public static final C1867b<Integer> f3197bs = m4079a("vr_retry_count_v1", 1);

    /* renamed from: bt */
    public static final C1867b<Integer> f3198bt = m4079a("cr_retry_count_v1", 1);

    /* renamed from: bu */
    public static final C1867b<Boolean> f3199bu = m4079a("incent_warning_enabled", false);

    /* renamed from: bv */
    public static final C1867b<String> f3200bv = m4079a("text_incent_warning_title", "Attention!");

    /* renamed from: bw */
    public static final C1867b<String> f3201bw = m4079a("text_incent_warning_body", "You won’t get your reward if the video hasn’t finished.");

    /* renamed from: bx */
    public static final C1867b<String> f3202bx = m4079a("text_incent_warning_close_option", "Close");

    /* renamed from: by */
    public static final C1867b<String> f3203by = m4079a("text_incent_warning_continue_option", "Keep Watching");

    /* renamed from: bz */
    public static final C1867b<Boolean> f3204bz = m4079a("incent_nonvideo_warning_enabled", false);

    /* renamed from: cA */
    public static final C1867b<Integer> f3205cA = m4079a("progress_bar_vertical_padding", -8);

    /* renamed from: cB */
    public static final C1867b<Integer> f3206cB = m4079a("vs_buffer_indicator_size", 50);

    /* renamed from: cC */
    public static final C1867b<Long> f3207cC = m4079a("set_poststitial_muted_initial_delay_ms", 500L);

    /* renamed from: cD */
    public static final C1867b<Integer> f3208cD = m4079a("minepsv", -1);

    /* renamed from: cE */
    public static final C1867b<Integer> f3209cE = m4079a("maxepsv", -1);

    /* renamed from: cF */
    public static final C1867b<Boolean> f3210cF = m4079a("fasuic", true);

    /* renamed from: cG */
    public static final C1867b<Boolean> f3211cG = m4079a("ssfwif", false);

    /* renamed from: cH */
    public static final C1867b<Integer> f3212cH = m4079a("submit_postback_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: cI */
    public static final C1867b<Integer> f3213cI = m4079a("submit_postback_retries", 4);

    /* renamed from: cJ */
    public static final C1867b<Integer> f3214cJ = m4079a("max_postback_attempts", 3);

    /* renamed from: cK */
    public static final C1867b<Boolean> f3215cK = m4079a("fppopq", false);

    /* renamed from: cL */
    public static final C1867b<Integer> f3216cL = m4079a("max_persisted_postbacks", 100);

    /* renamed from: cM */
    public static final C1867b<Boolean> f3217cM = m4079a("retry_on_all_errors", false);

    /* renamed from: cN */
    public static final C1867b<Integer> f3218cN = m4079a("get_retry_delay_v1", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: cO */
    public static final C1867b<Integer> f3219cO = m4079a("http_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: cP */
    public static final C1867b<Integer> f3220cP = m4079a("http_socket_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(20)));

    /* renamed from: cQ */
    public static final C1867b<Boolean> f3221cQ = m4079a("force_ssl", false);

    /* renamed from: cR */
    public static final C1867b<Integer> f3222cR = m4079a("fetch_ad_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: cS */
    public static final C1867b<Integer> f3223cS = m4079a("fetch_ad_retry_count_v1", 1);

    /* renamed from: cT */
    public static final C1867b<Boolean> f3224cT = m4079a("faer", false);

    /* renamed from: cU */
    public static final C1867b<Boolean> f3225cU = m4079a("faroae", false);

    /* renamed from: cV */
    public static final C1867b<Integer> f3226cV = m4079a("submit_data_retry_count_v1", 1);

    /* renamed from: cW */
    public static final C1867b<Integer> f3227cW = m4079a("response_buffer_size", Integer.valueOf(AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND));

    /* renamed from: cX */
    public static final C1867b<Integer> f3228cX = m4079a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: cY */
    public static final C1867b<Integer> f3229cY = m4079a("fetch_basic_settings_retry_count", 3);

    /* renamed from: cZ */
    public static final C1867b<Boolean> f3230cZ = m4079a("fetch_basic_settings_on_reconnect", false);

    /* renamed from: ca */
    public static final C1867b<String> f3231ca = m4079a("js_tag_schemes", "applovin,mopub");

    /* renamed from: cb */
    public static final C1867b<String> f3232cb = m4079a("js_tag_load_success_hosts", "load,load_succeeded");

    /* renamed from: cc */
    public static final C1867b<String> f3233cc = m4079a("js_tag_load_failure_hosts", "failLoad,load_failed");

    /* renamed from: cd */
    public static final C1867b<Integer> f3234cd = m4079a("auxiliary_operations_threads", 3);

    /* renamed from: ce */
    public static final C1867b<Integer> f3235ce = m4079a("caching_operations_threads", 8);

    /* renamed from: cf */
    public static final C1867b<Long> f3236cf = m4079a("fullscreen_ad_pending_display_state_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: cg */
    public static final C1867b<Long> f3237cg = m4079a("fullscreen_ad_showing_state_timeout_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(2)));

    /* renamed from: ch */
    public static final C1867b<Boolean> f3238ch = m4079a("lhs_close_button_video", false);

    /* renamed from: ci */
    public static final C1867b<Integer> f3239ci = m4079a("close_button_right_margin_video", 4);

    /* renamed from: cj */
    public static final C1867b<Integer> f3240cj = m4079a("close_button_size_video", 30);

    /* renamed from: ck */
    public static final C1867b<Integer> f3241ck = m4079a("close_button_top_margin_video", 8);

    /* renamed from: cl */
    public static final C1867b<Long> f3242cl = m4079a("inter_display_delay", 200L);

    /* renamed from: cm */
    public static final C1867b<Long> f3243cm = m4079a("maximum_close_button_delay_seconds", 999L);

    /* renamed from: cn */
    public static final C1867b<Boolean> f3244cn = m4079a("respect_close_button", true);

    /* renamed from: co */
    public static final C1867b<Boolean> f3245co = m4079a("lhs_skip_button", true);

    /* renamed from: cp */
    public static final C1867b<Boolean> f3246cp = m4079a("track_app_killed", false);

    /* renamed from: cq */
    public static final C1867b<Boolean> f3247cq = m4079a("mute_controls_enabled", false);

    /* renamed from: cr */
    public static final C1867b<Boolean> f3248cr = m4079a("allow_user_muting", true);

    /* renamed from: cs */
    public static final C1867b<Boolean> f3249cs = m4079a("mute_videos", false);

    /* renamed from: ct */
    public static final C1867b<Boolean> f3250ct = m4079a("show_mute_by_default", false);

    /* renamed from: cu */
    public static final C1867b<Boolean> f3251cu = m4079a("mute_with_user_settings", true);

    /* renamed from: cv */
    public static final C1867b<Integer> f3252cv = m4079a("mute_button_size", 32);

    /* renamed from: cw */
    public static final C1867b<Integer> f3253cw = m4079a("mute_button_margin", 10);

    /* renamed from: cx */
    public static final C1867b<Integer> f3254cx = m4079a("mute_button_gravity", 85);

    /* renamed from: cy */
    public static final C1867b<Long> f3255cy = m4079a("progress_bar_step", 25L);

    /* renamed from: cz */
    public static final C1867b<Integer> f3256cz = m4079a("progress_bar_scale", 10000);

    /* renamed from: dA */
    public static final C1867b<Boolean> f3257dA = m4079a("hgn", false);

    /* renamed from: dB */
    public static final C1867b<Boolean> f3258dB = m4079a("cso", false);

    /* renamed from: dC */
    public static final C1867b<Boolean> f3259dC = m4079a("cfs", false);

    /* renamed from: dD */
    public static final C1867b<Boolean> f3260dD = m4079a("cmi", false);

    /* renamed from: dE */
    public static final C1867b<Boolean> f3261dE = m4079a("crat", false);

    /* renamed from: dF */
    public static final C1867b<Boolean> f3262dF = m4079a("cvs", false);

    /* renamed from: dG */
    public static final C1867b<Boolean> f3263dG = m4079a("caf", false);

    /* renamed from: dH */
    public static final C1867b<Boolean> f3264dH = m4079a("cf", false);

    /* renamed from: dI */
    public static final C1867b<Boolean> f3265dI = m4079a("cmtl", true);

    /* renamed from: dJ */
    public static final C1867b<Boolean> f3266dJ = m4079a("cnr", false);

    /* renamed from: dK */
    public static final C1867b<Boolean> f3267dK = m4079a("adr", false);

    /* renamed from: dL */
    public static final C1867b<Float> f3268dL = m4079a("volume_normalization_factor", Float.valueOf(6.6666665f));

    /* renamed from: dM */
    public static final C1867b<Boolean> f3269dM = m4079a("system_user_agent_collection_enabled", false);

    /* renamed from: dN */
    public static final C1867b<Boolean> f3270dN = m4079a("user_agent_collection_enabled", false);

    /* renamed from: dO */
    public static final C1867b<Boolean> f3271dO = m4079a("collect_device_angle", false);

    /* renamed from: dP */
    public static final C1867b<Boolean> f3272dP = m4079a("collect_device_movement", false);

    /* renamed from: dQ */
    public static final C1867b<Float> f3273dQ = m4079a("movement_degradation", Float.valueOf(0.75f));

    /* renamed from: dR */
    public static final C1867b<Integer> f3274dR = m4079a("device_sensor_period_ms", 250);

    /* renamed from: dS */
    public static final C1867b<Boolean> f3275dS = m4079a("dte", true);

    /* renamed from: dT */
    public static final C1867b<Boolean> f3276dT = m4079a("idcw", false);

    /* renamed from: dU */
    public static final C1867b<Long> f3277dU = m4079a("anr_debug_thread_refresh_time_ms", -1L);

    /* renamed from: dV */
    public static final C1867b<Integer> f3278dV = m4079a("fetch_basic_settings_delay_ms", 1500);

    /* renamed from: dW */
    public static final C1867b<Boolean> f3279dW = m4079a("cclia", true);

    /* renamed from: dX */
    public static final C1867b<Long> f3280dX = m4079a("lccdm", 10L);

    /* renamed from: dY */
    public static final C1867b<Integer> f3281dY = m4079a("lmfd", 3);

    /* renamed from: dZ */
    public static final C1867b<Boolean> f3282dZ = m4079a("is_track_ad_info", true);

    /* renamed from: da */
    public static final C1867b<Boolean> f3283da = m4079a("skip_fetch_basic_settings_if_not_connected", false);

    /* renamed from: db */
    public static final C1867b<Integer> f3284db = m4079a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(2)));

    /* renamed from: dc */
    public static final C1867b<Integer> f3285dc = m4079a("fetch_variables_connection_timeout_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(5)));

    /* renamed from: dd */
    public static final C1867b<Boolean> f3286dd = m4079a("idflrwbe", false);

    /* renamed from: de */
    public static final C1867b<Boolean> f3287de = m4079a("falawpr", false);

    /* renamed from: df */
    public static final C1867b<Boolean> f3288df = m4079a("sort_query_parameters", false);

    /* renamed from: dg */
    public static final C1867b<Boolean> f3289dg = m4079a("encode_amp_query_value", false);

    /* renamed from: dh */
    public static final C1867b<Long> f3290dh = m4079a("communicator_request_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: di */
    public static final C1867b<Integer> f3291di = m4079a("communicator_request_retry_count", 3);

    /* renamed from: dj */
    public static final C1867b<Long> f3292dj = m4079a("communicator_request_retry_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(2)));

    /* renamed from: dk */
    public static final C1867b<Integer> f3293dk = m4079a("ad_session_minutes", 60);

    /* renamed from: dl */
    public static final C1867b<Boolean> f3294dl = m4079a("session_tracking_cooldown_on_event_fire", true);

    /* renamed from: dm */
    public static final C1867b<Long> f3295dm = m4079a("session_tracking_resumed_cooldown_minutes", 90L);

    /* renamed from: dn */
    public static final C1867b<Long> f3296dn = m4079a("session_tracking_paused_cooldown_minutes", 90L);

    /* renamed from: do */
    public static final C1867b<Boolean> f3297do = m4079a("qq", false);

    /* renamed from: dp */
    public static final C1867b<Boolean> f3298dp = m4079a("qq1", true);

    /* renamed from: dq */
    public static final C1867b<Boolean> f3299dq = m4079a("qq2", true);

    /* renamed from: dr */
    public static final C1867b<Boolean> f3300dr = m4079a("qq3", true);

    /* renamed from: ds */
    public static final C1867b<Boolean> f3301ds = m4079a("qq4", true);

    /* renamed from: dt */
    public static final C1867b<Boolean> f3302dt = m4079a("qq5", true);

    /* renamed from: du */
    public static final C1867b<Boolean> f3303du = m4079a("qq6", true);

    /* renamed from: dv */
    public static final C1867b<Boolean> f3304dv = m4079a("qq7", true);

    /* renamed from: dw */
    public static final C1867b<Boolean> f3305dw = m4079a("qq8", true);

    /* renamed from: dx */
    public static final C1867b<Boolean> f3306dx = m4079a("qq9", false);

    /* renamed from: dy */
    public static final C1867b<Boolean> f3307dy = m4079a("pui", true);

    /* renamed from: dz */
    public static final C1867b<String> f3308dz = m4079a("plugin_version", "");

    /* renamed from: eA */
    public static final C1867b<Boolean> f3309eA = m4079a("reward_postback_gzip", false);

    /* renamed from: eB */
    public static final C1867b<Boolean> f3310eB = m4079a("force_rerender", false);

    /* renamed from: eC */
    public static final C1867b<Boolean> f3311eC = m4079a("daostr", false);

    /* renamed from: eD */
    public static final C1867b<Boolean> f3312eD = m4079a("tctlaa", false);

    /* renamed from: eE */
    public static final C1867b<Boolean> f3313eE = m4079a("rwvdv", false);

    /* renamed from: eF */
    public static final C1867b<Boolean> f3314eF = m4079a("handle_render_process_gone", true);

    /* renamed from: eG */
    public static final C1867b<Boolean> f3315eG = m4079a("comcr", true);

    /* renamed from: eH */
    public static final C1867b<Boolean> f3316eH = m4079a("teorpc", false);

    /* renamed from: eI */
    public static final C1867b<Boolean> f3317eI = m4079a("rmpibt", false);

    /* renamed from: eJ */
    public static final C1867b<Boolean> f3318eJ = m4079a("spbcioa", false);

    /* renamed from: eK */
    public static final C1867b<Boolean> f3319eK = m4079a("set_webview_render_process_client", false);

    /* renamed from: eL */
    public static final C1867b<Boolean> f3320eL = m4079a("disable_webview_hardware_acceleration", false);

    /* renamed from: eM */
    public static final C1867b<Boolean> f3321eM = m4079a("dsaovcf", false);

    /* renamed from: eN */
    public static final C1867b<Boolean> f3322eN = m4079a("daoar", false);

    /* renamed from: eO */
    public static final C1867b<Boolean> f3323eO = m4079a("use_uri_encode", false);

    /* renamed from: eP */
    public static final C1867b<Boolean> f3324eP = m4079a("anr_detection_enabled", false);

    /* renamed from: eQ */
    public static final C1867b<Long> f3325eQ = m4079a("anr_trigger_millis", 4000L);

    /* renamed from: eR */
    public static final C1867b<Long> f3326eR = m4079a("anr_touch_millis", 3000L);

    /* renamed from: eS */
    public static final C1867b<Long> f3327eS = m4079a("anr_check_millis", 3000L);

    /* renamed from: eT */
    public static final C1867b<Boolean> f3328eT = m4079a("frpcfn", false);

    /* renamed from: eU */
    public static final C1867b<String> f3329eU = m4079a("config_consent_dialog_state", "unknown");

    /* renamed from: eV */
    public static final C1867b<String> f3330eV = m4079a(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, "");

    /* renamed from: eW */
    public static final C1867b<String> f3331eW = m4079a("c_sticky_topics", "user_engagement_sdk_init,adjust_init,safedk_init,discovery_init,max_ad_events,send_http_request,adapter_initialization_status,privacy_setting_updated,network_sdk_version_updated");

    /* renamed from: eX */
    public static final C1867b<Boolean> f3332eX = m4079a("communicator_enabled", true);

    /* renamed from: ea */
    public static final C1867b<Boolean> f3333ea = m4079a("submit_ad_stats_enabled", false);

    /* renamed from: eb */
    public static final C1867b<Integer> f3334eb = m4079a("submit_ad_stats_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: ec */
    public static final C1867b<Integer> f3335ec = m4079a("submit_ad_stats_retry_count", 1);

    /* renamed from: ed */
    public static final C1867b<Integer> f3336ed = m4079a("submit_ad_stats_max_count", 500);

    /* renamed from: ee */
    public static final C1867b<Boolean> f3337ee = m4079a("asdm", false);

    /* renamed from: ef */
    public static final C1867b<String> f3338ef = m4079a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");

    /* renamed from: eg */
    public static final C1867b<String> f3339eg = m4079a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");

    /* renamed from: eh */
    public static final C1867b<Integer> f3340eh = m4079a("vast_max_response_length", 640000);

    /* renamed from: ei */
    public static final C1867b<Integer> f3341ei = m4079a("vast_max_wrapper_depth", 5);

    /* renamed from: ej */
    public static final C1867b<String> f3342ej = m4079a("vast_unsupported_video_extensions", "ogv,flv");

    /* renamed from: ek */
    public static final C1867b<String> f3343ek = m4079a("vast_unsupported_video_types", "video/ogg,video/x-flv");

    /* renamed from: el */
    public static final C1867b<Boolean> f3344el = m4079a("vast_validate_with_extension_if_no_video_type", true);

    /* renamed from: em */
    public static final C1867b<Integer> f3345em = m4079a("vast_video_selection_policy", Integer.valueOf(C1428m.C1430a.MEDIUM.ordinal()));

    /* renamed from: en */
    public static final C1867b<Integer> f3346en = m4079a("vast_wrapper_resolution_retry_count_v1", 1);

    /* renamed from: eo */
    public static final C1867b<Integer> f3347eo = m4079a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: ep */
    public static final C1867b<Boolean> f3348ep = m4079a("ree", true);

    /* renamed from: eq */
    public static final C1867b<Boolean> f3349eq = m4079a("btee", true);

    /* renamed from: er */
    public static final C1867b<Long> f3350er = m4079a("server_timestamp_ms", 0L);

    /* renamed from: es */
    public static final C1867b<Long> f3351es = m4079a("device_timestamp_ms", 0L);

    /* renamed from: et */
    public static final C1867b<Integer> f3352et = m4079a("gzip_min_length", 0);

    /* renamed from: eu */
    public static final C1867b<Boolean> f3353eu = m4079a("gzip_encoding_default", false);

    /* renamed from: ev */
    public static final C1867b<Boolean> f3354ev = m4079a("fetch_settings_gzip", false);

    /* renamed from: ew */
    public static final C1867b<Boolean> f3355ew = m4079a("device_init_gzip", false);

    /* renamed from: ex */
    public static final C1867b<Boolean> f3356ex = m4079a("fetch_ad_gzip", false);

    /* renamed from: ey */
    public static final C1867b<Boolean> f3357ey = m4079a("event_tracking_gzip", false);

    /* renamed from: ez */
    public static final C1867b<Boolean> f3358ez = m4079a("submit_ad_stats_gzip", false);

    /* renamed from: c */
    private final String f3359c;

    /* renamed from: d */
    private final T f3360d;

    public C1867b(String str, T t) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        } else if (t != null) {
            this.f3359c = str;
            this.f3360d = t;
        } else {
            throw new IllegalArgumentException("No default value specified");
        }
    }

    /* renamed from: a */
    protected static <T> C1867b<T> m4079a(String str, T t) {
        if (t == null) {
            throw new IllegalArgumentException("No default value specified");
        } else if (f3099a.contains(t.getClass())) {
            C1867b<T> bVar = new C1867b<>(str, t);
            if (!f3152b.containsKey(str)) {
                f3152b.put(str, bVar);
                return bVar;
            }
            throw new IllegalArgumentException("Setting has already been used: " + str);
        } else {
            throw new IllegalArgumentException("Unsupported value type: " + t.getClass());
        }
    }

    /* renamed from: c */
    public static Collection<C1867b<?>> m4080c() {
        return Collections.synchronizedCollection(f3152b.values());
    }

    /* renamed from: a */
    public T mo14279a(Object obj) {
        return this.f3360d.getClass().cast(obj);
    }

    /* renamed from: a */
    public String mo14280a() {
        return this.f3359c;
    }

    /* renamed from: b */
    public T mo14281b() {
        return this.f3360d;
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof C1867b)) {
            return 0;
        }
        return this.f3359c.compareTo(((C1867b) obj).mo14280a());
    }
}
