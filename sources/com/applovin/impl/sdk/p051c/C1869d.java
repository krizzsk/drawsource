package com.applovin.impl.sdk.p051c;

import com.smaato.sdk.core.gdpr.CmpApiConstants;
import java.util.HashSet;

/* renamed from: com.applovin.impl.sdk.c.d */
public class C1869d<T> {

    /* renamed from: A */
    public static final C1869d<String> f3366A = new C1869d<>("com.applovin.sdk.mediation_provider", String.class);

    /* renamed from: B */
    public static final C1869d<String> f3367B = new C1869d<>("com.applovin.sdk.mediation.test_mode_network", String.class);

    /* renamed from: C */
    public static final C1869d<Boolean> f3368C = new C1869d<>("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);

    /* renamed from: a */
    public static final C1869d<String> f3369a = new C1869d<>("com.applovin.sdk.impl.isFirstRun", String.class);

    /* renamed from: b */
    public static final C1869d<Boolean> f3370b = new C1869d<>("com.applovin.sdk.launched_before", Boolean.class);

    /* renamed from: c */
    public static final C1869d<String> f3371c = new C1869d<>("com.applovin.sdk.latest_installed_version", String.class);

    /* renamed from: d */
    public static final C1869d<Long> f3372d = new C1869d<>("com.applovin.sdk.install_date", Long.class);

    /* renamed from: e */
    public static final C1869d<String> f3373e = new C1869d<>("com.applovin.sdk.user_id", String.class);

    /* renamed from: f */
    public static final C1869d<String> f3374f = new C1869d<>("com.applovin.sdk.compass_id", String.class);

    /* renamed from: g */
    public static final C1869d<String> f3375g = new C1869d<>("com.applovin.sdk.compass_random_token", String.class);

    /* renamed from: h */
    public static final C1869d<String> f3376h = new C1869d<>("com.applovin.sdk.applovin_random_token", String.class);

    /* renamed from: i */
    public static final C1869d<String> f3377i = new C1869d<>("com.applovin.sdk.device_test_group", String.class);

    /* renamed from: j */
    public static final C1869d<String> f3378j = new C1869d<>("com.applovin.sdk.variables", String.class);

    /* renamed from: k */
    public static final C1869d<Boolean> f3379k = new C1869d<>("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* renamed from: l */
    public static final C1869d<Boolean> f3380l = new C1869d<>("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* renamed from: m */
    public static final C1869d<Boolean> f3381m = new C1869d<>("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* renamed from: n */
    public static final C1869d<String> f3382n = new C1869d<>(CmpApiConstants.IABTCF_TC_STRING, String.class);

    /* renamed from: o */
    public static final C1869d<?> f3383o = new C1869d<>(CmpApiConstants.IABTCF_GDPR_APPLIES, Object.class);

    /* renamed from: p */
    public static final C1869d<HashSet> f3384p = new C1869d<>("com.applovin.sdk.impl.postbackQueue.key", HashSet.class);

    /* renamed from: q */
    public static final C1869d<String> f3385q = new C1869d<>("com.applovin.sdk.stats", String.class);

    /* renamed from: r */
    public static final C1869d<HashSet> f3386r = new C1869d<>("com.applovin.sdk.task.stats", HashSet.class);

    /* renamed from: s */
    public static final C1869d<String> f3387s = new C1869d<>("com.applovin.sdk.network_response_code_mapping", String.class);

    /* renamed from: t */
    public static final C1869d<String> f3388t = new C1869d<>("com.applovin.sdk.event_tracking.super_properties", String.class);

    /* renamed from: u */
    public static final C1869d<HashSet> f3389u = new C1869d<>("com.applovin.sdk.ad.stats", HashSet.class);

    /* renamed from: v */
    public static final C1869d<Integer> f3390v = new C1869d<>("com.applovin.sdk.last_video_position", Integer.class);

    /* renamed from: w */
    public static final C1869d<Boolean> f3391w = new C1869d<>("com.applovin.sdk.should_resume_video", Boolean.class);

    /* renamed from: x */
    public static final C1869d<String> f3392x = new C1869d<>("com.applovin.sdk.mediation.signal_providers", String.class);

    /* renamed from: y */
    public static final C1869d<String> f3393y = new C1869d<>("com.applovin.sdk.mediation.auto_init_adapters", String.class);

    /* renamed from: z */
    public static final C1869d<String> f3394z = new C1869d<>("com.applovin.sdk.persisted_data", String.class);

    /* renamed from: D */
    private final String f3395D;

    /* renamed from: E */
    private final Class<T> f3396E;

    public C1869d(String str, Class<T> cls) {
        this.f3395D = str;
        this.f3396E = cls;
    }

    /* renamed from: a */
    public String mo14293a() {
        return this.f3395D;
    }

    /* renamed from: b */
    public Class<T> mo14294b() {
        return this.f3396E;
    }

    public String toString() {
        return "Key{name='" + this.f3395D + '\'' + ", type=" + this.f3396E + '}';
    }
}
