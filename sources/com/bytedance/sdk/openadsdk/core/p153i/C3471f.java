package com.bytedance.sdk.openadsdk.core.p153i;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.p089a.p091b.C2533a;
import com.bytedance.sdk.component.adexpress.p089a.p091b.C2535b;
import com.bytedance.sdk.component.adexpress.p089a.p092c.C2546b;
import com.bytedance.sdk.component.utils.C2899i;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.p184d.C3961a;
import com.bytedance.sdk.openadsdk.p178l.C3895u;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.gdpr.CmpApiConstants;
import com.vungle.warren.model.AdvertisementDBAdapter;
import com.vungle.warren.model.Cookie;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.i.f */
/* compiled from: TTSdkSettings */
public class C3471f implements C3465b {

    /* renamed from: a */
    public static String f8591a = null;

    /* renamed from: b */
    public static String f8592b = CmpApiConstants.IABTCF_TC_STRING;

    /* renamed from: c */
    public static String f8593c;

    /* renamed from: d */
    public static String f8594d;

    /* renamed from: e */
    public static String f8595e = (C2914t.m8151a(C3513m.m10963a(), "tt_feedback_thank_text") + "\n" + C2914t.m8151a(C3513m.m10963a(), "tt_feedback_experience_text"));

    /* renamed from: f */
    static ArrayList<String> f8596f;

    /* renamed from: n */
    private static final String f8597n = C3898x.m12822m();

    /* renamed from: p */
    private static final String f8598p = null;

    /* renamed from: q */
    private static final String f8599q = null;

    /* renamed from: r */
    private static final String f8600r = null;

    /* renamed from: A */
    private int f8601A = Integer.MAX_VALUE;

    /* renamed from: B */
    private int f8602B = Integer.MAX_VALUE;

    /* renamed from: C */
    private long f8603C = 0;

    /* renamed from: D */
    private Set<String> f8604D = Collections.synchronizedSet(new HashSet());

    /* renamed from: E */
    private Set<String> f8605E = Collections.synchronizedSet(new HashSet());

    /* renamed from: F */
    private int f8606F = Integer.MAX_VALUE;

    /* renamed from: G */
    private int f8607G = Integer.MAX_VALUE;

    /* renamed from: H */
    private long f8608H = 2147483647L;

    /* renamed from: I */
    private int f8609I = Integer.MAX_VALUE;

    /* renamed from: J */
    private int f8610J = Integer.MAX_VALUE;

    /* renamed from: K */
    private int f8611K = Integer.MAX_VALUE;

    /* renamed from: L */
    private int f8612L = Integer.MAX_VALUE;

    /* renamed from: M */
    private String f8613M;

    /* renamed from: N */
    private String f8614N;

    /* renamed from: O */
    private String f8615O;

    /* renamed from: P */
    private int f8616P = Integer.MAX_VALUE;

    /* renamed from: Q */
    private int f8617Q;

    /* renamed from: R */
    private String f8618R;

    /* renamed from: S */
    private int f8619S = Integer.MAX_VALUE;

    /* renamed from: T */
    private String f8620T;

    /* renamed from: U */
    private int f8621U;

    /* renamed from: V */
    private int f8622V;

    /* renamed from: W */
    private String f8623W = null;

    /* renamed from: X */
    private String f8624X = null;

    /* renamed from: Y */
    private boolean f8625Y = false;

    /* renamed from: Z */
    private String f8626Z = "";

    /* renamed from: aa */
    private int f8627aa = Integer.MAX_VALUE;

    /* renamed from: ab */
    private int f8628ab = Integer.MAX_VALUE;

    /* renamed from: ac */
    private int f8629ac = Integer.MAX_VALUE;

    /* renamed from: ad */
    private int f8630ad = Integer.MAX_VALUE;

    /* renamed from: ae */
    private int f8631ae = Integer.MAX_VALUE;

    /* renamed from: af */
    private int f8632af = Integer.MAX_VALUE;

    /* renamed from: ag */
    private int f8633ag = Integer.MAX_VALUE;

    /* renamed from: ah */
    private int f8634ah = Integer.MAX_VALUE;

    /* renamed from: ai */
    private final Set<String> f8635ai = Collections.synchronizedSet(new HashSet());

    /* renamed from: aj */
    private volatile boolean f8636aj = false;

    /* renamed from: ak */
    private final C3895u f8637ak = C3895u.m12724a("tt_sdk_settings", C3513m.m10963a());

    /* renamed from: al */
    private int f8638al = Integer.MAX_VALUE;

    /* renamed from: am */
    private float f8639am = 2.14748365E9f;

    /* renamed from: an */
    private int f8640an = Integer.MAX_VALUE;

    /* renamed from: ao */
    private int f8641ao = Integer.MAX_VALUE;

    /* renamed from: ap */
    private int f8642ap = 30;

    /* renamed from: g */
    private int f8643g = Integer.MAX_VALUE;

    /* renamed from: h */
    private Map<String, C3464a> f8644h = new HashMap();

    /* renamed from: i */
    private String f8645i;

    /* renamed from: j */
    private String f8646j;

    /* renamed from: k */
    private Set<String> f8647k = new HashSet();

    /* renamed from: l */
    private String f8648l;

    /* renamed from: m */
    private Set<String> f8649m = Collections.synchronizedSet(new HashSet());

    /* renamed from: o */
    private Set<String> f8650o = Collections.synchronizedSet(new HashSet());

    /* renamed from: s */
    private String f8651s;

    /* renamed from: t */
    private int f8652t = Integer.MAX_VALUE;

    /* renamed from: u */
    private int f8653u = Integer.MAX_VALUE;

    /* renamed from: v */
    private String f8654v;

    /* renamed from: w */
    private String f8655w;

    /* renamed from: x */
    private String f8656x;

    /* renamed from: y */
    private String f8657y;

    /* renamed from: z */
    private int f8658z = Integer.MAX_VALUE;

    /* renamed from: a */
    private int m10699a(boolean z) {
        return z ? 20 : 5;
    }

    /* renamed from: k */
    private static boolean m10706k(int i) {
        return i == 1 || i == 2;
    }

    static {
        try {
            f8593c = C2914t.m8151a(C3513m.m10963a(), "tt_txt_skip");
            f8594d = C2914t.m8151a(C3513m.m10963a(), "tt_feedback_submit_text");
            f8596f = new ArrayList<>(Arrays.asList(new String[]{"ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "it", "es", "hi", "pt", "zh-Hant"}));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:53|54|(1:56)|57|(4:59|60|(2:62|63)|109)|68|(3:72|(2:75|73)|110)|76|(3:80|(2:83|81)|111)|84|(3:86|87|(2:89|(3:91|(2:93|112)(1:113)|94)))|95|96|97|98) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0594 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo19818a() {
        /*
            r16 = this;
            r1 = r16
            monitor-enter(r16)
            r2 = 1
            r1.f8636aj = r2     // Catch:{ all -> 0x05b6 }
            boolean r3 = com.bytedance.sdk.openadsdk.multipro.C3948b.m12959c()     // Catch:{ all -> 0x05b6 }
            r10 = 3000(0xbb8, float:4.204E-42)
            r11 = 5
            r12 = 3600(0xe10, float:5.045E-42)
            r13 = 50
            r14 = 10000(0x2710, double:4.9407E-320)
            r5 = 30
            r4 = 0
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 0
            if (r3 == 0) goto L_0x02ec
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "xpath"
            java.lang.String r9 = ""
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8651s = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "duration"
            long r8 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13021a((java.lang.String) r3, (java.lang.String) r8, (long) r14)     // Catch:{ all -> 0x05b6 }
            r1.f8608H = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "max"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r13)     // Catch:{ all -> 0x05b6 }
            r1.f8609I = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "download_config_dl_network"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8652t = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "download_config_dl_size"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r5)     // Catch:{ all -> 0x05b6 }
            r1.f8653u = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "vbtt"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r11)     // Catch:{ all -> 0x05b6 }
            r1.f8610J = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "fetch_template"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r12)     // Catch:{ all -> 0x05b6 }
            r1.f8611K = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "template_ids"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8648l = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ab_test_version"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8654v = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ab_test_param"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8655w = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "pyload_h5"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8656x = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "playableLoadH5Url"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8657y = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "splash_load_type"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8658z = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "splash_check_type"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8601A = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "if_both_open"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8606F = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "support_tnc"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8607G = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "force_language"
            java.lang.String r9 = ""
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8626Z = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "fetch_tpl_timeout_ctrl"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r10)     // Catch:{ all -> 0x05b6 }
            r1.f8627aa = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "disable_rotate_banner_on_dislike"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8640an = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "max_tpl_cnts"
            r9 = 100
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8628ab = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "tpl_infos"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8645i = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "insert_js_config"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8646j = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "app_list_control"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8602B = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "hit_app_list_time"
            r9 = 0
            long r8 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13021a((java.lang.String) r3, (java.lang.String) r8, (long) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8603C = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ads_url"
            java.lang.String r9 = f8599q     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8613M = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "app_log_url"
            java.lang.String r9 = f8598p     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8614N = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "apm_url"
            java.lang.String r9 = ""
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8615O = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "coppa"
            r9 = -99
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8616P = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ccpa"
            r9 = -1
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8617Q = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.core.h r3 = com.bytedance.sdk.openadsdk.core.C3457h.m10580d()     // Catch:{ all -> 0x05b6 }
            int r8 = r1.f8616P     // Catch:{ all -> 0x05b6 }
            r3.mo19757d((int) r8)     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "policy_url"
            java.lang.String r9 = f8600r     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8618R = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "consent_url"
            java.lang.String r9 = "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8620T = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ivrv_downward"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8622V = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "isGdprUser"
            r9 = -1
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8619S = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "dyn_draw_engine_url"
            java.lang.String r9 = f8597n     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8623W = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "dc"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8624X = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_ad_enable"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8629ac = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_personalized_ad"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8630ad = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_sladar_enable"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8631ae = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_app_log_enable"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8632af = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_sec_enable"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8633ag = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_debug_unlock"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8634ah = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_fields_allowed"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "webview_cache_count"
            r10 = 20
            int r8 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r8, (java.lang.String) r9, (int) r10)     // Catch:{ all -> 0x05b6 }
            r1.f8612L = r8     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.f8650o     // Catch:{ all -> 0x05b6 }
            if (r8 == 0) goto L_0x01f4
            java.util.Set<java.lang.String> r8 = r1.f8650o     // Catch:{ all -> 0x05b6 }
            r8.clear()     // Catch:{ all -> 0x05b6 }
        L_0x01f4:
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "gecko_hosts"
            java.util.Set r8 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13036b((java.lang.String) r8, (java.lang.String) r9, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8650o = r8     // Catch:{ all -> 0x05b6 }
            java.util.Set r8 = r1.mo19835a((java.util.Set<java.lang.String>) r8)     // Catch:{ all -> 0x05b6 }
            r1.f8650o = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "global_rate"
            r10 = 1065353216(0x3f800000, float:1.0)
            float r8 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13019a((java.lang.String) r8, (java.lang.String) r9, (float) r10)     // Catch:{ all -> 0x05b6 }
            r1.f8639am = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "sp_key_if_sp_cache"
            int r8 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r8, (java.lang.String) r9, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8643g = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "landingpage_new_style"
            int r6 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r8, (java.lang.String) r9, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8641ao = r6     // Catch:{ all -> 0x05b6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x024c
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0247 }
            r6.<init>(r3)     // Catch:{ JSONException -> 0x0247 }
            int r3 = r6.length()     // Catch:{ JSONException -> 0x0247 }
            java.util.Set<java.lang.String> r8 = r1.f8635ai     // Catch:{ JSONException -> 0x0247 }
            r8.clear()     // Catch:{ JSONException -> 0x0247 }
            r8 = r4
        L_0x0239:
            if (r8 >= r3) goto L_0x024c
            java.util.Set<java.lang.String> r9 = r1.f8635ai     // Catch:{ JSONException -> 0x0247 }
            java.lang.String r10 = r6.getString(r8)     // Catch:{ JSONException -> 0x0247 }
            r9.add(r10)     // Catch:{ JSONException -> 0x0247 }
            int r8 = r8 + 1
            goto L_0x0239
        L_0x0247:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()     // Catch:{ all -> 0x05b6 }
        L_0x024c:
            java.util.Set<java.lang.String> r3 = r1.f8604D     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r6 = "hit_app_list_data"
            java.util.Set r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13036b((java.lang.String) r3, (java.lang.String) r6, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x0277
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x0277
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x0265:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r6 == 0) goto L_0x0277
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.f8604D     // Catch:{ all -> 0x05b6 }
            r8.add(r6)     // Catch:{ all -> 0x05b6 }
            goto L_0x0265
        L_0x0277:
            java.util.Set<java.lang.String> r3 = r1.f8605E     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r6 = "scheme_list_data"
            java.util.Set r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13036b((java.lang.String) r3, (java.lang.String) r6, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x02a2
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x02a2
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x0290:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r6 == 0) goto L_0x02a2
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.f8605E     // Catch:{ all -> 0x05b6 }
            r8.add(r6)     // Catch:{ all -> 0x05b6 }
            goto L_0x0290
        L_0x02a2:
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r6 = "ad_slot_conf"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13035b((java.lang.String) r3, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x02d6
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x02d6 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x02d6 }
            int r3 = r6.length()     // Catch:{ Exception -> 0x02d6 }
            if (r3 <= 0) goto L_0x02d6
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.i.a> r7 = r1.f8644h     // Catch:{ Exception -> 0x02d6 }
            r7.clear()     // Catch:{ Exception -> 0x02d6 }
        L_0x02c0:
            if (r4 >= r3) goto L_0x02d6
            org.json.JSONObject r7 = r6.optJSONObject(r4)     // Catch:{ Exception -> 0x02d6 }
            com.bytedance.sdk.openadsdk.core.i.a r7 = m10701b((org.json.JSONObject) r7)     // Catch:{ Exception -> 0x02d6 }
            if (r7 == 0) goto L_0x02d3
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.i.a> r8 = r1.f8644h     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r9 = r7.f8553a     // Catch:{ Exception -> 0x02d6 }
            r8.put(r9, r7)     // Catch:{ Exception -> 0x02d6 }
        L_0x02d3:
            int r4 = r4 + 1
            goto L_0x02c0
        L_0x02d6:
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r4 = "read_video_from_cache"
            int r2 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r3, (java.lang.String) r4, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8638al = r2     // Catch:{ all -> 0x05b6 }
            java.lang.String r2 = "tt_sdk_settings"
            java.lang.String r3 = "blank_detect_rate"
            int r2 = com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13020a((java.lang.String) r2, (java.lang.String) r3, (int) r5)     // Catch:{ all -> 0x05b6 }
            r1.f8642ap = r2     // Catch:{ all -> 0x05b6 }
            monitor-exit(r16)
            return
        L_0x02ec:
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "xpath"
            java.lang.String r9 = ""
            java.lang.String r3 = r3.mo20759b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8651s = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "duration"
            long r8 = r3.mo20758b((java.lang.String) r8, (long) r14)     // Catch:{ all -> 0x05b6 }
            r1.f8608H = r8     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "max"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r13)     // Catch:{ all -> 0x05b6 }
            r1.f8609I = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "download_config_dl_network"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8652t = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "download_config_dl_size"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r5)     // Catch:{ all -> 0x05b6 }
            r1.f8653u = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "fetch_template"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r12)     // Catch:{ all -> 0x05b6 }
            r1.f8611K = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ab_test_version"
            java.lang.String r3 = r3.mo20748a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f8654v = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ab_test_param"
            java.lang.String r3 = r3.mo20748a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f8655w = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "vbtt"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r11)     // Catch:{ all -> 0x05b6 }
            r1.f8610J = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "template_ids"
            java.lang.String r3 = r3.mo20759b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8648l = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "pyload_h5"
            java.lang.String r3 = r3.mo20759b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8656x = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "playableLoadH5Url"
            java.lang.String r3 = r3.mo20759b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8657y = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "splash_load_type"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8658z = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "splash_check_type"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8601A = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "if_both_open"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8606F = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "support_tnc"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8607G = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tpl_infos"
            java.lang.String r3 = r3.mo20759b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8645i = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "insert_js_config"
            java.lang.String r3 = r3.mo20759b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8646j = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "app_list_control"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8602B = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "force_language"
            java.lang.String r9 = ""
            java.lang.String r3 = r3.mo20759b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8626Z = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "fetch_tpl_timeout_ctrl"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r10)     // Catch:{ all -> 0x05b6 }
            r1.f8627aa = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "disable_rotate_banner_on_dislike"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8640an = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "max_tpl_cnts"
            r9 = 100
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8628ab = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "hit_app_list_time"
            r9 = 0
            long r8 = r3.mo20758b((java.lang.String) r8, (long) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8603C = r8     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ads_url"
            java.lang.String r3 = r3.mo20748a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f8613M = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "app_log_url"
            java.lang.String r3 = r3.mo20748a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f8614N = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "apm_url"
            java.lang.String r3 = r3.mo20748a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f8615O = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "coppa"
            r9 = -99
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8616P = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ccpa"
            r9 = -1
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8617Q = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.core.h r3 = com.bytedance.sdk.openadsdk.core.C3457h.m10580d()     // Catch:{ all -> 0x05b6 }
            int r8 = r1.f8616P     // Catch:{ all -> 0x05b6 }
            r3.mo19757d((int) r8)     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "policy_url"
            java.lang.String r9 = f8600r     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = r3.mo20759b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8618R = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "consent_url"
            java.lang.String r9 = "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html"
            java.lang.String r3 = r3.mo20759b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8620T = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ivrv_downward"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8622V = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "dyn_draw_engine_url"
            java.lang.String r9 = f8597n     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = r3.mo20759b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8623W = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "dc"
            java.lang.String r3 = r3.mo20748a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f8624X = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "isGdprUser"
            r9 = -1
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8619S = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_ad_enable"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8629ac = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_personalized_ad"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8630ad = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_sladar_enable"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8631ae = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_app_log_enable"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8632af = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_sec_enable"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8633ag = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_debug_unlock"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8634ah = r3     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r3 = r1.f8650o     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x04aa
            java.util.Set<java.lang.String> r3 = r1.f8650o     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
        L_0x04aa:
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "gecko_hosts"
            java.util.Set r3 = r3.mo20760b((java.lang.String) r8, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8650o = r3     // Catch:{ all -> 0x05b6 }
            java.util.Set r3 = r1.mo19835a((java.util.Set<java.lang.String>) r3)     // Catch:{ all -> 0x05b6 }
            r1.f8650o = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "global_rate"
            r9 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3.mo20755b((java.lang.String) r8, (float) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8639am = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "sp_key_if_sp_cache"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8643g = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "landingpage_new_style"
            int r3 = r3.mo20757b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8641ao = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = "privacy_fields_allowed"
            java.lang.String r3 = r3.mo20759b((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x050a
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0505 }
            r6.<init>(r3)     // Catch:{ JSONException -> 0x0505 }
            int r3 = r6.length()     // Catch:{ JSONException -> 0x0505 }
            java.util.Set<java.lang.String> r8 = r1.f8635ai     // Catch:{ JSONException -> 0x0505 }
            r8.clear()     // Catch:{ JSONException -> 0x0505 }
            r8 = r4
        L_0x04f7:
            if (r8 >= r3) goto L_0x050a
            java.util.Set<java.lang.String> r9 = r1.f8635ai     // Catch:{ JSONException -> 0x0505 }
            java.lang.String r10 = r6.getString(r8)     // Catch:{ JSONException -> 0x0505 }
            r9.add(r10)     // Catch:{ JSONException -> 0x0505 }
            int r8 = r8 + 1
            goto L_0x04f7
        L_0x0505:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()     // Catch:{ all -> 0x05b6 }
        L_0x050a:
            java.util.Set<java.lang.String> r3 = r1.f8604D     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = "hit_app_list_data"
            java.util.Set r3 = r3.mo20760b((java.lang.String) r6, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x0535
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x0535
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x0523:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r6 == 0) goto L_0x0535
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.f8604D     // Catch:{ all -> 0x05b6 }
            r8.add(r6)     // Catch:{ all -> 0x05b6 }
            goto L_0x0523
        L_0x0535:
            java.util.Set<java.lang.String> r3 = r1.f8605E     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = "scheme_list_data"
            java.util.Set r3 = r3.mo20760b((java.lang.String) r6, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x0560
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x0560
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x054e:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r6 == 0) goto L_0x0560
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.f8605E     // Catch:{ all -> 0x05b6 }
            r8.add(r6)     // Catch:{ all -> 0x05b6 }
            goto L_0x054e
        L_0x0560:
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = "ad_slot_conf"
            java.lang.String r3 = r3.mo20759b((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x0594
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x0594 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x0594 }
            int r3 = r6.length()     // Catch:{ Exception -> 0x0594 }
            if (r3 <= 0) goto L_0x0594
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.i.a> r7 = r1.f8644h     // Catch:{ Exception -> 0x0594 }
            r7.clear()     // Catch:{ Exception -> 0x0594 }
        L_0x057e:
            if (r4 >= r3) goto L_0x0594
            org.json.JSONObject r7 = r6.optJSONObject(r4)     // Catch:{ Exception -> 0x0594 }
            com.bytedance.sdk.openadsdk.core.i.a r7 = m10701b((org.json.JSONObject) r7)     // Catch:{ Exception -> 0x0594 }
            if (r7 == 0) goto L_0x0591
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.i.a> r8 = r1.f8644h     // Catch:{ Exception -> 0x0594 }
            java.lang.String r9 = r7.f8553a     // Catch:{ Exception -> 0x0594 }
            r8.put(r9, r7)     // Catch:{ Exception -> 0x0594 }
        L_0x0591:
            int r4 = r4 + 1
            goto L_0x057e
        L_0x0594:
            com.bytedance.sdk.openadsdk.l.u r3 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r4 = "read_video_from_cache"
            int r2 = r3.mo20757b((java.lang.String) r4, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8638al = r2     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r2 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "webview_cache_count"
            r4 = 20
            int r2 = r2.mo20757b((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8612L = r2     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.l.u r2 = r1.f8637ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "blank_detect_rate"
            int r2 = r2.mo20757b((java.lang.String) r3, (int) r5)     // Catch:{ all -> 0x05b6 }
            r1.f8642ap = r2     // Catch:{ all -> 0x05b6 }
            monitor-exit(r16)
            return
        L_0x05b6:
            r0 = move-exception
            r2 = r0
            monitor-exit(r16)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p153i.C3471f.mo19818a():void");
    }

    /* renamed from: b */
    private static C3464a m10701b(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            return null;
        }
        String optString = jSONObject2.optString("code_id");
        int optInt = jSONObject2.optInt("auto_play", 1);
        int optInt2 = jSONObject2.optInt("voice_control", 1);
        int optInt3 = jSONObject2.optInt("rv_preload", 2);
        int optInt4 = jSONObject2.optInt("nv_preload", 1);
        int optInt5 = jSONObject2.optInt("proportion_watching", 100);
        int optInt6 = jSONObject2.optInt("skip_time_displayed", 0);
        int optInt7 = jSONObject2.optInt("video_skip_result", 2);
        int optInt8 = jSONObject2.optInt("reg_creative_control", 1);
        int optInt9 = jSONObject2.optInt("play_bar_show_time", 3);
        int optInt10 = jSONObject2.optInt("rv_skip_time", -1);
        int optInt11 = jSONObject2.optInt("voice_control", 2);
        int optInt12 = jSONObject2.optInt("if_show_win", 1);
        int optInt13 = jSONObject2.optInt("sp_preload", 2);
        int optInt14 = jSONObject2.optInt("stop_time", 1500);
        int optInt15 = jSONObject2.optInt("native_playable_delay", 2);
        int optInt16 = jSONObject2.optInt("time_out_control", -1);
        int optInt17 = jSONObject2.optInt("playable_close_time", -1);
        int optInt18 = jSONObject2.optInt("playable_reward_type", 0);
        int optInt19 = jSONObject2.optInt("reward_is_callback", 0);
        int optInt20 = jSONObject2.optInt("iv_skip_time", 5);
        JSONArray optJSONArray = jSONObject2.optJSONArray("parent_tpl_ids");
        int i = optInt20;
        int optInt21 = jSONObject2.optInt("slot_type", 2);
        boolean optBoolean = jSONObject2.optBoolean("close_on_click", false);
        int optInt22 = jSONObject2.optInt("allow_system_back", 0);
        int optInt23 = jSONObject2.optInt("splash_skip_time", 0);
        int optInt24 = jSONObject2.optInt("splash_image_count_down_time", 5);
        if (!m10706k(optInt2)) {
            optInt2 = 1;
        }
        return C3464a.m10646a().mo19792a(optString).mo19804k(optInt).mo19805l(optInt2).mo19806m(optInt3).mo19807n(optInt4).mo19808o(optInt5).mo19809p(optInt6).mo19810q(optInt7).mo19811r(optInt8).mo19803j(optInt9).mo19802i(optInt10).mo19801h(!m10706k(optInt11) ? 1 : optInt11).mo19812s(optInt12).mo19798e(optInt13).mo19799f(optInt14).mo19800g(optInt15).mo19797d(optInt16).mo19795b(optInt18).mo19796c(optInt19).mo19791a(optInt17).mo19813t(optInt21).mo19814u(i).mo19793a(optJSONArray).mo19794a(optBoolean).mo19815v(optInt22).mo19816w(optInt23).mo19817x(optInt24);
    }

    /* renamed from: b */
    public int mo19838b() {
        if (this.f8628ab == Integer.MAX_VALUE) {
            if (C3948b.m12959c()) {
                this.f8628ab = C3961a.m13020a("tt_sdk_settings", "max_tpl_cnts", 100);
            } else {
                this.f8628ab = this.f8637ak.mo20757b("max_tpl_cnts", 100);
            }
        }
        return this.f8628ab;
    }

    /* renamed from: a */
    public void mo19819a(JSONObject jSONObject) {
        String str;
        this.f8641ao = jSONObject.optInt("lp_new_style", Integer.MAX_VALUE);
        int optInt = jSONObject.optInt("blank_detect_rate", 30);
        this.f8642ap = optInt;
        if (optInt < 0 || optInt > 100) {
            this.f8642ap = 30;
        }
        this.f8651s = jSONObject.optString("xpath");
        JSONObject optJSONObject = jSONObject.optJSONObject("feq_policy");
        if (optJSONObject != null) {
            this.f8608H = optJSONObject.optLong("duration") * 1000;
            this.f8609I = optJSONObject.optInt("max");
        }
        this.f8610J = jSONObject.optInt("vbtt", 5);
        this.f8611K = jSONObject.optInt("fetch_tpl_interval", 3600);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("abtest");
        if (optJSONObject2 != null) {
            this.f8654v = optJSONObject2.optString("version");
            this.f8655w = optJSONObject2.optString("param");
        } else {
            m10698J();
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("log_rate_conf");
        if (optJSONObject3 != null) {
            this.f8639am = (float) optJSONObject3.optDouble("global_rate", 1.0d);
        }
        this.f8656x = jSONObject.optString("pyload_h5");
        this.f8657y = jSONObject.optString("pure_pyload_h5");
        this.f8613M = jSONObject.optString("ads_url");
        this.f8614N = jSONObject.optString("app_log_url");
        this.f8615O = jSONObject.optString("apm_url");
        this.f8616P = jSONObject.optInt(Cookie.COPPA_KEY, -99);
        this.f8617Q = jSONObject.optInt("ccpa", -1);
        C3457h.m10580d().mo19757d(this.f8616P);
        this.f8618R = jSONObject.optString("privacy_url", f8600r);
        this.f8620T = jSONObject.optString("consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
        this.f8621U = jSONObject.optInt("network_module", 1);
        this.f8622V = jSONObject.optInt("ivrv_downward", 0);
        this.f8624X = jSONObject.optString("dc");
        m10702c(jSONObject);
        m10703d(jSONObject);
        this.f8658z = m10704e(jSONObject);
        C2905l.m8118e("splashLoad", "setting-》mSplashLoadType=" + this.f8658z);
        this.f8601A = m10705f(jSONObject);
        C2905l.m8118e("splashLoad", "setting-》mSplashCheckType=" + this.f8601A);
        this.f8606F = jSONObject.optInt("if_both_open", 0);
        this.f8607G = jSONObject.optInt("support_tnc", 1);
        this.f8646j = jSONObject.optString("insert_js_config", "");
        this.f8602B = jSONObject.optInt(CampaignEx.JSON_KEY_AD_AL, 0);
        this.f8628ab = jSONObject.optInt("max_tpl_cnts", 100);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("app_common_config");
        if (optJSONObject4 != null) {
            this.f8626Z = optJSONObject4.optString("force_language");
            this.f8627aa = optJSONObject4.optInt("fetch_tpl_timeout_ctrl", 3000);
            this.f8640an = optJSONObject4.optInt("disable_rotate_banner_on_dislike", Integer.MAX_VALUE);
            this.f8643g = optJSONObject4.optInt("if_sp_cache", 0);
            this.f8612L = optJSONObject4.optInt("webview_cache_count", 20);
            try {
                this.f8650o.clear();
                JSONArray optJSONArray = optJSONObject4.optJSONArray("gecko_hosts");
                if (!(optJSONArray == null || optJSONArray.length() == 0)) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        this.f8650o.add(optJSONArray.getString(i));
                    }
                }
                this.f8650o = mo19835a(this.f8650o);
            } catch (Throwable th) {
                C2905l.m8110b("GeckoLog: settings json error " + th);
            }
        }
        this.f8603C = System.currentTimeMillis();
        this.f8604D.clear();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("spam_app_list");
        if (optJSONArray2 != null) {
            int length = optJSONArray2.length();
            for (int i2 = 0; i2 < length; i2++) {
                String optString = optJSONArray2.optString(i2);
                if (!TextUtils.isEmpty(optString)) {
                    this.f8604D.add(optString);
                }
            }
        }
        this.f8605E.clear();
        JSONArray optJSONArray3 = jSONObject.optJSONArray("scheme_check_list");
        if (optJSONArray3 != null) {
            int length2 = optJSONArray3.length();
            for (int i3 = 0; i3 < length2; i3++) {
                String optString2 = optJSONArray3.optString(i3);
                if (!TextUtils.isEmpty(optString2)) {
                    this.f8605E.add(optString2);
                }
            }
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("download_config");
        if (optJSONObject5 != null) {
            this.f8652t = optJSONObject5.optInt("dl_network", 1);
            this.f8653u = optJSONObject5.optInt("dl_size", 30);
        }
        this.f8638al = jSONObject.optInt("read_video_from_cache", 1);
        JSONArray optJSONArray4 = jSONObject.optJSONArray("ad_slot_conf_list");
        if (optJSONArray4 != null) {
            str = optJSONArray4.toString();
            int length3 = optJSONArray4.length();
            if (length3 > 0) {
                this.f8644h.clear();
                for (int i4 = 0; i4 < length3; i4++) {
                    C3464a b = m10701b(optJSONArray4.optJSONObject(i4));
                    if (b != null) {
                        this.f8644h.put(b.f8553a, b);
                    }
                }
            }
        } else {
            str = null;
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("privacy");
        if (optJSONObject6 != null) {
            this.f8629ac = optJSONObject6.optInt("ad_enable", Integer.MAX_VALUE);
            this.f8630ad = optJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE);
            this.f8631ae = optJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE);
            this.f8632af = optJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE);
            this.f8633ag = optJSONObject6.optInt("sec_enable", Integer.MAX_VALUE);
            this.f8634ah = optJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE);
            String optString3 = optJSONObject6.optString("fields_allowed", "");
            if (!TextUtils.isEmpty(optString3)) {
                try {
                    JSONArray jSONArray = new JSONArray(optString3);
                    int length4 = jSONArray.length();
                    this.f8635ai.clear();
                    for (int i5 = 0; i5 < length4; i5++) {
                        this.f8635ai.add(jSONArray.getString(i5));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                this.f8635ai.clear();
            }
        } else {
            this.f8629ac = Integer.MAX_VALUE;
            this.f8630ad = Integer.MAX_VALUE;
            this.f8631ae = Integer.MAX_VALUE;
            this.f8632af = Integer.MAX_VALUE;
            this.f8633ag = Integer.MAX_VALUE;
            this.f8634ah = Integer.MAX_VALUE;
            this.f8635ai.clear();
        }
        m10700a(str, (String) null);
        mo19836a((Boolean) true);
        this.f8625Y = true;
    }

    /* renamed from: J */
    private void m10698J() {
        this.f8655w = null;
        this.f8654v = null;
        if (C3948b.m12959c()) {
            C3961a.m13037b("tt_sdk_settings", "ab_test_version");
            C3961a.m13037b("tt_sdk_settings", "ab_test_param");
            return;
        }
        this.f8637ak.mo20762c("ab_test_version");
        this.f8637ak.mo20762c("ab_test_param");
    }

    /* renamed from: c */
    private void m10702c(JSONObject jSONObject) {
        String str;
        if (jSONObject != null) {
            if (C3948b.m12959c()) {
                str = C3961a.m13035b("tt_sdk_settings", "dyn_draw_engine_url", f8597n);
            } else {
                str = this.f8637ak.mo20759b("dyn_draw_engine_url", f8597n);
            }
            this.f8623W = jSONObject.optString("dyn_draw_engine_url", f8597n);
            C2905l.m8118e("TemplateManager", "settinng---TTDynamic.init().....oldDynDrawEngineUrl=" + str);
            C2905l.m8118e("TemplateManager", "settinng---TTDynamic.init().....newmDynDrawEngineUrl=" + this.f8623W);
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f8623W) && !this.f8623W.equals(str)) {
                C2905l.m8111b("TemplateManager", "Reinitialize the template TTDynamic.init().....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                C2535b.m6377a().mo16576g();
                C2535b.m6377a().mo16572b(false);
                C2533a.m6371b();
                C2535b.m6377a().mo16571b();
            }
        }
    }

    /* renamed from: a */
    public int mo19833a(String str) {
        if (str == null) {
            return 0;
        }
        return C3513m.m10973h().mo19872n(String.valueOf(str)).f8570r;
    }

    /* renamed from: d */
    private void m10703d(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("is_gdpr_user", -1);
        this.f8619S = optInt;
        if (optInt != -1 && optInt != 1 && optInt != 0) {
            this.f8619S = -1;
        }
    }

    /* renamed from: e */
    private int m10704e(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("splash_load_type", 1);
        this.f8658z = optInt;
        if (optInt == 0 || optInt == 1 || optInt == 2 || optInt == 3) {
            return this.f8658z;
        }
        return 1;
    }

    /* renamed from: f */
    private int m10705f(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("splash_check_type", 1);
        this.f8601A = optInt;
        if (optInt == 0 || optInt == 1) {
            return this.f8601A;
        }
        return 1;
    }

    /* renamed from: a */
    private void m10700a(String str, String str2) {
        String str3 = str;
        String str4 = "scheme_list_data";
        String str5 = "hit_app_list_data";
        String str6 = "hit_app_list_time";
        String str7 = "disable_rotate_banner_on_dislike";
        String str8 = "fetch_tpl_timeout_ctrl";
        String str9 = "max_tpl_cnts";
        String str10 = "app_list_control";
        if (C3948b.m12959c()) {
            String str11 = "privacy_fields_allowed";
            C3961a.m13029a("tt_sdk_settings", "xpath", this.f8651s);
            C3961a.m13028a("tt_sdk_settings", "duration", Long.valueOf(this.f8608H));
            C3961a.m13027a("tt_sdk_settings", "max", Integer.valueOf(this.f8609I));
            C3961a.m13027a("tt_sdk_settings", "download_config_dl_network", Integer.valueOf(this.f8652t));
            C3961a.m13027a("tt_sdk_settings", "download_config_dl_size", Integer.valueOf(this.f8653u));
            C3961a.m13027a("tt_sdk_settings", "vbtt", Integer.valueOf(this.f8610J));
            C3961a.m13027a("tt_sdk_settings", "fetch_template", Integer.valueOf(this.f8611K));
            C3961a.m13027a("tt_sdk_settings", "splash_load_type", Integer.valueOf(this.f8658z));
            C3961a.m13027a("tt_sdk_settings", "splash_check_type", Integer.valueOf(this.f8601A));
            C3961a.m13027a("tt_sdk_settings", "if_both_open", Integer.valueOf(this.f8606F));
            C3961a.m13027a("tt_sdk_settings", "support_tnc", Integer.valueOf(this.f8607G));
            C3961a.m13029a("tt_sdk_settings", "insert_js_config", this.f8646j);
            C3961a.m13029a("tt_sdk_settings", "pyload_h5", this.f8656x);
            C3961a.m13029a("tt_sdk_settings", "playableLoadH5Url", this.f8657y);
            C3961a.m13027a("tt_sdk_settings", str10, Integer.valueOf(this.f8602B));
            C3961a.m13027a("tt_sdk_settings", str9, Integer.valueOf(this.f8628ab));
            C3961a.m13027a("tt_sdk_settings", str8, Integer.valueOf(this.f8627aa));
            C3961a.m13027a("tt_sdk_settings", str7, Integer.valueOf(this.f8640an));
            C3961a.m13028a("tt_sdk_settings", str6, Long.valueOf(this.f8603C));
            C3961a.m13030a("tt_sdk_settings", str5, this.f8604D);
            C3961a.m13030a("tt_sdk_settings", str4, this.f8605E);
            C3961a.m13029a("tt_sdk_settings", "ads_url", this.f8613M);
            C3961a.m13029a("tt_sdk_settings", "app_log_url", this.f8614N);
            C3961a.m13029a("tt_sdk_settings", "apm_url", this.f8615O);
            C3961a.m13027a("tt_sdk_settings", Cookie.COPPA_KEY, Integer.valueOf(this.f8616P));
            C3961a.m13027a("tt_sdk_settings", "ccpa", Integer.valueOf(this.f8617Q));
            C3961a.m13029a("tt_sdk_settings", "policy_url", this.f8618R);
            C3961a.m13029a("tt_sdk_settings", "consent_url", this.f8620T);
            C3961a.m13027a("tt_sdk_settings", "ivrv_downward", Integer.valueOf(this.f8622V));
            C3961a.m13029a("tt_sdk_settings", "dyn_draw_engine_url", this.f8623W);
            C3961a.m13029a("tt_sdk_settings", "dc", this.f8624X);
            C3961a.m13027a("tt_sdk_settings", "isGdprUser", Integer.valueOf(this.f8619S));
            C3961a.m13027a("tt_sdk_settings", "sp_key_if_sp_cache", Integer.valueOf(this.f8643g));
            C3961a.m13027a("tt_sdk_settings", "landingpage_new_style", Integer.valueOf(this.f8641ao));
            if (!TextUtils.isEmpty(this.f8626Z) && f8596f.contains(this.f8626Z)) {
                C3961a.m13029a("tt_sdk_settings", "force_language", this.f8626Z);
            }
            String str12 = this.f8654v;
            if (str12 != null) {
                C3961a.m13029a("tt_sdk_settings", "ab_test_version", str12);
            }
            String str13 = this.f8655w;
            if (str13 != null) {
                C3961a.m13029a("tt_sdk_settings", "ab_test_param", str13);
            }
            if (!TextUtils.isEmpty(str)) {
                C3961a.m13029a("tt_sdk_settings", "ad_slot_conf", str);
            }
            if (!TextUtils.isEmpty(this.f8648l)) {
                C3961a.m13029a("tt_sdk_settings", "template_ids", this.f8648l);
            }
            if (!TextUtils.isEmpty(this.f8645i)) {
                C3961a.m13029a("tt_sdk_settings", "tpl_infos", this.f8645i);
            }
            C3961a.m13027a("tt_sdk_settings", "privacy_ad_enable", Integer.valueOf(this.f8629ac));
            C3961a.m13027a("tt_sdk_settings", "privacy_personalized_ad", Integer.valueOf(this.f8630ad));
            C3961a.m13027a("tt_sdk_settings", "privacy_sladar_enable", Integer.valueOf(this.f8631ae));
            C3961a.m13027a("tt_sdk_settings", "privacy_app_log_enable", Integer.valueOf(this.f8632af));
            C3961a.m13027a("tt_sdk_settings", "privacy_sec_enable", Integer.valueOf(this.f8633ag));
            C3961a.m13027a("tt_sdk_settings", "privacy_debug_unlock", Integer.valueOf(this.f8634ah));
            C3961a.m13030a("tt_sdk_settings", "gecko_hosts", this.f8650o);
            if (this.f8635ai.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (String put : this.f8635ai) {
                    jSONArray.put(put);
                }
                C3961a.m13029a("tt_sdk_settings", str11, jSONArray.toString());
            } else {
                C3961a.m13029a("tt_sdk_settings", str11, "");
            }
            C3961a.m13027a("tt_sdk_settings", "read_video_from_cache", Integer.valueOf(this.f8638al));
            C3961a.m13026a("tt_sdk_settings", "global_rate", Float.valueOf(this.f8639am));
            C3961a.m13027a("tt_sdk_settings", "webview_cache_count", Integer.valueOf(this.f8612L));
            C3961a.m13027a("tt_sdk_settings", "blank_detect_rate", Integer.valueOf(this.f8642ap));
            return;
        }
        String str14 = "privacy_fields_allowed";
        String str15 = str10;
        this.f8637ak.mo20752a("xpath", this.f8651s);
        this.f8637ak.mo20751a("duration", this.f8608H);
        this.f8637ak.mo20750a("max", this.f8609I);
        this.f8637ak.mo20750a("download_config_dl_network", this.f8652t);
        this.f8637ak.mo20750a("download_config_dl_size", this.f8653u);
        this.f8637ak.mo20750a("fetch_template", this.f8611K);
        this.f8637ak.mo20752a("pyload_h5", this.f8656x);
        this.f8637ak.mo20752a("insert_js_config", this.f8646j);
        this.f8637ak.mo20752a("playableLoadH5Url", this.f8657y);
        this.f8637ak.mo20750a("splash_load_type", this.f8658z);
        this.f8637ak.mo20750a("splash_check_type", this.f8601A);
        this.f8637ak.mo20750a("if_both_open", this.f8606F);
        this.f8637ak.mo20750a("support_tnc", this.f8607G);
        this.f8637ak.mo20750a(str10, this.f8602B);
        this.f8637ak.mo20750a(str9, this.f8628ab);
        this.f8637ak.mo20750a(str8, this.f8627aa);
        this.f8637ak.mo20750a(str7, this.f8640an);
        this.f8637ak.mo20751a(str6, this.f8603C);
        this.f8637ak.mo20753a(str5, this.f8604D);
        this.f8637ak.mo20753a(str4, this.f8605E);
        this.f8637ak.mo20752a("ads_url", this.f8613M);
        this.f8637ak.mo20752a("app_log_url", this.f8614N);
        this.f8637ak.mo20752a("apm_url", this.f8615O);
        this.f8637ak.mo20750a(Cookie.COPPA_KEY, this.f8616P);
        this.f8637ak.mo20750a("ccpa", this.f8617Q);
        this.f8637ak.mo20752a("policy_url", this.f8618R);
        this.f8637ak.mo20752a("consent_url", this.f8620T);
        this.f8637ak.mo20750a("ivrv_downward", this.f8622V);
        this.f8637ak.mo20752a("dyn_draw_engine_url", this.f8623W);
        this.f8637ak.mo20752a("dc", this.f8624X);
        this.f8637ak.mo20750a("isGdprUser", this.f8619S);
        this.f8637ak.mo20750a("sp_key_if_sp_cache", this.f8643g);
        this.f8637ak.mo20750a("landingpage_new_style", this.f8641ao);
        if (!TextUtils.isEmpty(this.f8626Z) && f8596f.contains(this.f8626Z)) {
            this.f8637ak.mo20752a("force_language", this.f8626Z);
        }
        String str16 = this.f8654v;
        if (str16 != null) {
            this.f8637ak.mo20752a("ab_test_version", str16);
        }
        String str17 = this.f8655w;
        if (str17 != null) {
            this.f8637ak.mo20752a("ab_test_param", str17);
        }
        this.f8637ak.mo20750a("vbtt", this.f8610J);
        if (!TextUtils.isEmpty(str)) {
            this.f8637ak.mo20752a("ad_slot_conf", str);
        }
        if (!TextUtils.isEmpty(this.f8648l)) {
            this.f8637ak.mo20752a("template_ids", this.f8648l);
        }
        if (!TextUtils.isEmpty(this.f8645i)) {
            this.f8637ak.mo20752a("tpl_infos", this.f8645i);
        }
        this.f8637ak.mo20750a("privacy_ad_enable", this.f8629ac);
        this.f8637ak.mo20750a("privacy_personalized_ad", this.f8630ad);
        this.f8637ak.mo20750a("privacy_sladar_enable", this.f8631ae);
        this.f8637ak.mo20750a("privacy_app_log_enable", this.f8632af);
        this.f8637ak.mo20750a("privacy_sec_enable", this.f8633ag);
        this.f8637ak.mo20750a("privacy_debug_unlock", this.f8634ah);
        this.f8637ak.mo20753a("gecko_hosts", this.f8650o);
        if (this.f8635ai.size() > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (String put2 : this.f8635ai) {
                jSONArray2.put(put2);
            }
            this.f8637ak.mo20752a(str14, jSONArray2.toString());
        } else {
            this.f8637ak.mo20752a(str14, "");
        }
        this.f8637ak.mo20750a("read_video_from_cache", this.f8638al);
        this.f8637ak.mo20749a("global_rate", this.f8639am);
        this.f8637ak.mo20750a("webview_cache_count", this.f8612L);
        this.f8637ak.mo20750a("blank_detect_rate", this.f8642ap);
    }

    /* renamed from: c */
    public boolean mo19842c() {
        if (this.f8606F == Integer.MAX_VALUE) {
            if (C3948b.m12959c()) {
                this.f8606F = C3961a.m13020a("tt_sdk_settings", "if_both_open", 0);
            } else {
                this.f8606F = this.f8637ak.mo20757b("if_both_open", 0);
            }
        }
        if (this.f8606F == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo19845d() {
        if (this.f8607G == Integer.MAX_VALUE) {
            if (C3948b.m12959c()) {
                this.f8607G = C3961a.m13020a("tt_sdk_settings", "support_tnc", 1);
            } else {
                this.f8607G = this.f8637ak.mo20757b("support_tnc", 1);
            }
        }
        if (this.f8607G == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public String mo19849e() {
        if (this.f8654v == null) {
            if (C3948b.m12959c()) {
                this.f8654v = C3961a.m13035b("tt_sdk_settings", "ab_test_version", (String) null);
            } else {
                this.f8654v = this.f8637ak.mo20748a("ab_test_version");
            }
        }
        return this.f8654v;
    }

    /* renamed from: f */
    public String mo19852f() {
        if (this.f8655w == null) {
            if (C3948b.m12959c()) {
                this.f8655w = C3961a.m13035b("tt_sdk_settings", "ab_test_param", (String) null);
            } else {
                this.f8655w = this.f8637ak.mo20748a("ab_test_param");
            }
        }
        return this.f8655w;
    }

    /* renamed from: g */
    public boolean mo19854g() {
        if (this.f8641ao == Integer.MAX_VALUE) {
            if (C3948b.m12959c()) {
                this.f8641ao = C3961a.m13020a("tt_sdk_settings", "landingpage_new_style", -1);
            } else {
                this.f8641ao = this.f8637ak.mo20756b("landingpage_new_style");
            }
        }
        return this.f8641ao == 1;
    }

    /* renamed from: h */
    public long mo19857h() {
        if (this.f8608H == 2147483647L) {
            if (C3948b.m12959c()) {
                this.f8608H = C3961a.m13021a("tt_sdk_settings", "duration", 10000);
            } else {
                this.f8608H = this.f8637ak.mo20758b("duration", 10000);
            }
        }
        return this.f8608H;
    }

    /* renamed from: i */
    public int mo19859i() {
        if (this.f8609I == Integer.MAX_VALUE) {
            if (C3948b.m12959c()) {
                this.f8609I = C3961a.m13020a("tt_sdk_settings", "max", 50);
            } else {
                this.f8609I = this.f8637ak.mo20757b("max", 50);
            }
        }
        return this.f8609I;
    }

    /* renamed from: j */
    public String mo19864j() {
        if (TextUtils.isEmpty(this.f8656x)) {
            if (C3948b.m12959c()) {
                this.f8656x = C3961a.m13035b("tt_sdk_settings", "pyload_h5", (String) null);
            } else {
                this.f8656x = this.f8637ak.mo20759b("pyload_h5", (String) null);
            }
        }
        return this.f8656x;
    }

    /* renamed from: k */
    public C3466c mo19866k() {
        if (TextUtils.isEmpty(this.f8646j)) {
            if (C3948b.m12959c()) {
                this.f8646j = C3961a.m13035b("tt_sdk_settings", "insert_js_config", (String) null);
            } else {
                this.f8646j = this.f8637ak.mo20759b("insert_js_config", (String) null);
            }
        }
        return new C3466c(this.f8646j);
    }

    /* renamed from: l */
    public String mo19867l() {
        if (TextUtils.isEmpty(this.f8657y)) {
            if (C3948b.m12959c()) {
                this.f8657y = C3961a.m13035b("tt_sdk_settings", "playableLoadH5Url", (String) null);
            } else {
                this.f8657y = this.f8637ak.mo20759b("playableLoadH5Url", (String) null);
            }
        }
        return this.f8657y;
    }

    /* renamed from: m */
    public int mo19869m() {
        if (this.f8627aa == Integer.MAX_VALUE) {
            if (C3948b.m12959c()) {
                this.f8627aa = C3961a.m13020a("tt_sdk_settings", "fetch_tpl_timeout_ctrl", 3000);
            } else {
                this.f8627aa = this.f8637ak.mo20757b("fetch_tpl_timeout_ctrl", 3000);
            }
        }
        if (this.f8627aa <= 0) {
            this.f8627aa = 3000;
        }
        return this.f8627aa;
    }

    /* renamed from: a */
    public void mo19836a(Boolean bool) {
        if (Build.VERSION.SDK_INT >= 17) {
            if (bool.booleanValue() && (TextUtils.isEmpty(this.f8626Z) || !f8596f.contains(this.f8626Z))) {
                if (C3948b.m12959c()) {
                    this.f8626Z = C3961a.m13035b("tt_sdk_settings", "force_language", "");
                } else {
                    this.f8626Z = this.f8637ak.mo20759b("force_language", "");
                }
            }
            if (!TextUtils.isEmpty(this.f8626Z)) {
                if (this.f8626Z.equals("zh-Hant")) {
                    C2899i.m8095a(C3513m.m10963a(), "zh", "tw");
                } else {
                    C2899i.m8095a(C3513m.m10963a(), this.f8626Z, (String) null);
                }
                try {
                    f8593c = C2914t.m8151a(C3513m.m10963a(), "tt_txt_skip");
                    f8594d = C2914t.m8151a(C3513m.m10963a(), "tt_feedback_submit_text");
                    f8595e = C2914t.m8151a(C3513m.m10963a(), "tt_feedback_thank_text") + "\n" + C2914t.m8151a(C3513m.m10963a(), "tt_feedback_experience_text");
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: n */
    public int mo19871n() {
        if (this.f8640an == Integer.MAX_VALUE) {
            if (C3948b.m12959c()) {
                this.f8640an = C3961a.m13020a("tt_sdk_settings", "disable_rotate_banner_on_dislike", Integer.MAX_VALUE);
            } else {
                this.f8640an = this.f8637ak.mo20757b("disable_rotate_banner_on_dislike", Integer.MAX_VALUE);
            }
        }
        return this.f8640an;
    }

    /* renamed from: a */
    public boolean mo19837a(int i) {
        return mo19872n(String.valueOf(i)).f8555c == 1;
    }

    /* renamed from: b */
    public boolean mo19840b(String str) {
        int i = C3513m.m10973h().mo19872n(String.valueOf(str)).f8557e;
        if (i == 1) {
            return C2909o.m8137d(C3513m.m10963a());
        }
        if (i != 2) {
            return false;
        }
        if (C2909o.m8136c(C3513m.m10963a()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo19843c(String str) {
        return mo19872n(String.valueOf(str)).f8559g == 1;
    }

    /* renamed from: d */
    public boolean mo19846d(String str) {
        if (str == null || C3513m.m10973h().mo19872n(String.valueOf(str)).f8565m == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public int mo19848e(String str) {
        if (str == null) {
            return 1500;
        }
        return C3513m.m10973h().mo19872n(String.valueOf(str)).f8567o;
    }

    /* renamed from: f */
    public int mo19851f(String str) {
        return C3513m.m10973h().mo19872n(String.valueOf(str)).f8563k;
    }

    /* renamed from: g */
    public JSONArray mo19853g(String str) {
        try {
            Set<String> b = C2533a.m6370b(str);
            if (b != null) {
                if (b.size() != 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (String a : b) {
                        C2546b a2 = C2533a.m6365a(a);
                        if (a2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("id", a2.mo16615b());
                            jSONObject.put(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5, a2.mo16617c());
                            jSONArray.put(jSONObject);
                        }
                    }
                    return jSONArray;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo19858h(String str) {
        try {
            C3464a n = C3513m.m10973h().mo19872n(String.valueOf(str));
            return (n == null || n.f8574v == null) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: i */
    public boolean mo19861i(String str) {
        try {
            C3464a n = C3513m.m10973h().mo19872n(String.valueOf(str));
            return n != null && n.f8575w == 8;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: o */
    public boolean mo19874o() {
        return this.f8625Y;
    }

    /* renamed from: j */
    public int mo19863j(String str) {
        return mo19872n(String.valueOf(str)).f8560h;
    }

    /* renamed from: k */
    public int mo19865k(String str) {
        return mo19872n(str).f8562j;
    }

    /* renamed from: a */
    public int mo19834a(String str, boolean z) {
        if (str == null) {
            return m10699a(z);
        }
        C3464a n = C3513m.m10973h().mo19872n(str);
        return n.f8576x != -1 ? n.f8576x : m10699a(z);
    }

    /* renamed from: l */
    public boolean mo19868l(String str) {
        return mo19872n(String.valueOf(str)).f8573u == 0;
    }

    /* renamed from: b */
    public boolean mo19839b(int i) {
        if (i == 0 || C3513m.m10973h().mo19872n(String.valueOf(i)).f8564l == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public String mo19875p() {
        if (TextUtils.isEmpty(this.f8613M)) {
            if (C3948b.m12959c()) {
                this.f8613M = C3961a.m13035b("tt_sdk_settings", "ads_url", f8599q);
            } else {
                this.f8613M = this.f8637ak.mo20759b("ads_url", f8599q);
            }
            if (TextUtils.isEmpty(this.f8613M)) {
                this.f8613M = f8599q;
            }
        }
        return this.f8613M;
    }

    /* renamed from: q */
    public String mo19877q() {
        if (TextUtils.isEmpty(this.f8614N)) {
            if (C3948b.m12959c()) {
                this.f8614N = C3961a.m13035b("tt_sdk_settings", "app_log_url", f8598p);
            } else {
                this.f8614N = this.f8637ak.mo20748a("app_log_url");
            }
            if (TextUtils.isEmpty(this.f8614N)) {
                this.f8614N = f8598p;
            }
        }
        return this.f8614N;
    }

    /* renamed from: r */
    public String mo19878r() {
        if (TextUtils.isEmpty(this.f8615O)) {
            if (C3948b.m12959c()) {
                this.f8615O = C3961a.m13035b("tt_sdk_settings", "apm_url", "");
            } else {
                this.f8615O = this.f8637ak.mo20759b("apm_url", "");
            }
        }
        return this.f8615O;
    }

    /* renamed from: s */
    public String mo19879s() {
        if (TextUtils.isEmpty(this.f8618R)) {
            if (C3948b.m12959c()) {
                this.f8618R = C3961a.m13035b("tt_sdk_settings", "policy_url", f8600r);
            } else {
                this.f8618R = this.f8637ak.mo20759b("policy_url", f8600r);
            }
        }
        return this.f8618R;
    }

    /* renamed from: t */
    public String mo19880t() {
        if (TextUtils.isEmpty(this.f8620T)) {
            if (C3948b.m12959c()) {
                this.f8620T = C3961a.m13035b("tt_sdk_settings", "consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
            } else {
                this.f8620T = this.f8637ak.mo20759b("consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
            }
        }
        return this.f8620T;
    }

    /* renamed from: u */
    public int mo19881u() {
        if (this.f8622V == 0) {
            if (C3948b.m12959c()) {
                this.f8622V = C3961a.m13020a("tt_sdk_settings", "ivrv_downward", 0);
            } else {
                this.f8622V = this.f8637ak.mo20757b("ivrv_downward", 0);
            }
        }
        return this.f8622V;
    }

    /* renamed from: v */
    public String mo19882v() {
        if (TextUtils.isEmpty(this.f8623W)) {
            if (C3948b.m12959c()) {
                this.f8623W = C3961a.m13035b("tt_sdk_settings", "dyn_draw_engine_url", f8597n);
            } else {
                this.f8623W = this.f8637ak.mo20759b("dyn_draw_engine_url", f8597n);
            }
        }
        return this.f8623W;
    }

    /* renamed from: w */
    public String mo19883w() {
        if (TextUtils.isEmpty(this.f8624X)) {
            if (C3948b.m12959c()) {
                this.f8624X = C3961a.m13035b("tt_sdk_settings", "dc", (String) null);
            } else {
                this.f8624X = this.f8637ak.mo20748a("dc");
            }
        }
        return this.f8624X;
    }

    /* renamed from: x */
    public int mo19884x() {
        if (this.f8619S == Integer.MAX_VALUE) {
            if (C3948b.m12959c()) {
                this.f8619S = C3961a.m13020a("tt_sdk_settings", "isGdprUser", -1);
            } else {
                this.f8619S = this.f8637ak.mo20757b("isGdprUser", -1);
            }
        }
        return this.f8619S;
    }

    /* renamed from: c */
    public int mo19841c(int i) {
        return mo19872n(String.valueOf(i)).f8554b;
    }

    /* renamed from: d */
    public int mo19844d(int i) {
        return mo19872n(String.valueOf(i)).f8561i;
    }

    /* renamed from: y */
    public int mo19885y() {
        if (this.f8610J == Integer.MAX_VALUE) {
            if (C3948b.m12959c()) {
                this.f8610J = C3961a.m13020a("tt_sdk_settings", "vbtt", 5);
            } else {
                this.f8610J = this.f8637ak.mo20757b("vbtt", 5);
            }
        }
        return this.f8610J;
    }

    /* renamed from: e */
    public int mo19847e(int i) {
        return mo19872n(String.valueOf(i)).f8571s;
    }

    /* renamed from: f */
    public int mo19850f(int i) {
        return mo19872n(String.valueOf(i)).f8563k;
    }

    /* renamed from: g */
    public boolean mo19855g(int i) {
        return mo19872n(String.valueOf(i)).f8572t;
    }

    /* renamed from: h */
    public int mo19856h(int i) {
        return mo19872n(String.valueOf(i)).f8577y;
    }

    /* renamed from: i */
    public int mo19860i(int i) {
        return mo19872n(String.valueOf(i)).f8578z;
    }

    /* renamed from: j */
    public int mo19862j(int i) {
        return mo19872n(String.valueOf(i)).f8552A;
    }

    /* renamed from: m */
    public boolean mo19870m(String str) {
        if (str != null && C3513m.m10973h().mo19872n(str).f8566n == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public C3464a mo19872n(String str) {
        C3464a aVar = this.f8644h.get(str);
        return aVar == null ? m10707q(str) : aVar;
    }

    /* renamed from: q */
    private C3464a m10707q(String str) {
        return C3464a.m10646a().mo19792a(str).mo19804k(1).mo19805l(this.f8647k.contains(str) ^ true ? 1 : 0).mo19806m(2).mo19807n(1).mo19808o(100).mo19809p(0).mo19811r(1).mo19803j(3).mo19802i(-1).mo19801h(1).mo19812s(1).mo19797d(-1).mo19791a(-1).mo19813t(2).mo19814u(5).mo19793a((JSONArray) null).mo19794a(false).mo19815v(0).mo19816w(0).mo19817x(5);
    }

    /* renamed from: o */
    public void mo19873o(String str) {
        this.f8647k.add(str);
    }

    /* renamed from: z */
    public boolean mo19886z() {
        if (this.f8629ac == Integer.MAX_VALUE) {
            if (C3948b.m12959c()) {
                this.f8629ac = C3961a.m13020a("tt_sdk_settings", "privacy_ad_enable", Integer.MAX_VALUE);
            } else {
                this.f8629ac = this.f8637ak.mo20757b("privacy_ad_enable", Integer.MAX_VALUE);
            }
        }
        int i = this.f8629ac;
        if (i == 1) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int o = C3898x.m12828o();
        return o == 1 || o == 2 || o == 3;
    }

    /* renamed from: A */
    public int mo19824A() {
        if (this.f8630ad == Integer.MAX_VALUE) {
            if (C3948b.m12959c()) {
                this.f8630ad = C3961a.m13020a("tt_sdk_settings", "privacy_personalized_ad", Integer.MAX_VALUE);
            } else {
                this.f8630ad = this.f8637ak.mo20757b("privacy_personalized_ad", Integer.MAX_VALUE);
            }
        }
        int i = this.f8630ad;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int o = C3898x.m12828o();
        if (o == 1 || o == 2) {
            return 2;
        }
        return o != 3 ? 0 : 1;
    }

    /* renamed from: B */
    public boolean mo19825B() {
        if (this.f8631ae == Integer.MAX_VALUE) {
            if (C3948b.m12959c()) {
                this.f8631ae = C3961a.m13020a("tt_sdk_settings", "privacy_sladar_enable", Integer.MAX_VALUE);
            } else {
                this.f8631ae = this.f8637ak.mo20757b("privacy_sladar_enable", Integer.MAX_VALUE);
            }
        }
        return this.f8631ae == 1;
    }

    /* renamed from: C */
    public boolean mo19826C() {
        if (this.f8633ag == Integer.MAX_VALUE) {
            if (C3948b.m12959c()) {
                this.f8633ag = C3961a.m13020a("tt_sdk_settings", "privacy_sec_enable", Integer.MAX_VALUE);
            } else {
                this.f8633ag = this.f8637ak.mo20757b("privacy_sec_enable", Integer.MAX_VALUE);
            }
        }
        if ("VA".equalsIgnoreCase(mo19883w()) || C3898x.m12828o() == 3) {
            return false;
        }
        int i = this.f8633ag;
        if (i == 1) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int o = C3898x.m12828o();
        if (o == 1 || o == 2 || o == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public boolean mo19827D() {
        if (this.f8634ah == Integer.MAX_VALUE) {
            if (C3948b.m12959c()) {
                this.f8634ah = C3961a.m13020a("tt_sdk_settings", "privacy_debug_unlock", Integer.MAX_VALUE);
            } else {
                this.f8634ah = this.f8637ak.mo20757b("privacy_debug_unlock", Integer.MAX_VALUE);
            }
        }
        return this.f8634ah != 0;
    }

    /* renamed from: p */
    public boolean mo19876p(String str) {
        if (this.f8635ai.size() != 0) {
            return this.f8635ai.contains(str);
        }
        int o = C3898x.m12828o();
        if (o != 1) {
            if (o == 2) {
                return "mcc".equals(str) || "mnc".equals(str);
            }
            if (o != 3) {
                return false;
            }
            return "mcc".equals(str) || "mnc".equals(str);
        }
    }

    /* renamed from: a */
    public Set<String> mo19835a(Set<String> set) {
        if (set == null) {
            try {
                return new HashSet();
            } catch (Throwable unused) {
                return new HashSet();
            }
        } else {
            HashSet hashSet = new HashSet();
            for (String next : set) {
                if (!TextUtils.isEmpty(next)) {
                    hashSet.add(next);
                }
            }
            return hashSet;
        }
    }

    /* renamed from: E */
    public boolean mo19828E() {
        return this.f8636aj;
    }

    /* renamed from: F */
    public boolean mo19829F() {
        if (this.f8639am == 2.14748365E9f) {
            if (C3948b.m12959c()) {
                this.f8639am = C3961a.m13019a("tt_sdk_settings", "global_rate", 1.0f);
            } else {
                this.f8639am = this.f8637ak.mo20755b("global_rate", 1.0f);
            }
        }
        return this.f8639am == 1.0f;
    }

    /* renamed from: G */
    public boolean mo19830G() {
        if (this.f8638al == Integer.MAX_VALUE) {
            if (C3948b.m12959c()) {
                this.f8638al = C3961a.m13020a("tt_sdk_settings", "read_video_from_cache", 1);
            } else {
                this.f8638al = this.f8637ak.mo20757b("read_video_from_cache", 1);
            }
        }
        if (this.f8638al == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public int mo19831H() {
        if (this.f8612L == Integer.MAX_VALUE) {
            if (C3948b.m12959c()) {
                this.f8612L = C3961a.m13020a("tt_sdk_settings", "webview_cache_count", 20);
            } else {
                this.f8612L = this.f8637ak.mo20757b("webview_cache_count", 20);
            }
        }
        int i = this.f8612L;
        if (i < 0) {
            return 20;
        }
        return i;
    }

    /* renamed from: I */
    public int mo19832I() {
        return this.f8642ap;
    }
}
