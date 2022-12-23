package com.applovin.impl.sdk.p049ad;

import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import com.applovin.impl.adview.C1535i;
import com.applovin.impl.adview.C1563s;
import com.applovin.impl.adview.C1567v;
import com.applovin.impl.sdk.C1831ab;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p048a.C1800b;
import com.applovin.impl.sdk.p050b.C1864c;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p052d.C1875a;
import com.applovin.impl.sdk.utils.C2049g;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.e */
public abstract class C1839e extends AppLovinAdImpl {

    /* renamed from: a */
    private final List<Uri> f2971a = CollectionUtils.synchronizedList();

    /* renamed from: b */
    private final AtomicBoolean f2972b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f2973c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicReference<C1864c> f2974d = new AtomicReference<>();

    /* renamed from: e */
    private List<C1875a> f2975e;

    /* renamed from: f */
    private List<C1875a> f2976f;

    /* renamed from: g */
    private List<C1875a> f2977g;

    /* renamed from: h */
    private List<C1875a> f2978h;

    /* renamed from: i */
    private C1843c f2979i;

    /* renamed from: com.applovin.impl.sdk.ad.e$a */
    public enum C1841a {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* renamed from: com.applovin.impl.sdk.ad.e$b */
    public enum C1842b {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* renamed from: com.applovin.impl.sdk.ad.e$c */
    public class C1843c {

        /* renamed from: a */
        public final int f2988a;

        /* renamed from: b */
        public final int f2989b;

        /* renamed from: c */
        public final int f2990c;

        /* renamed from: d */
        public final int f2991d;

        /* renamed from: e */
        public final int f2992e;

        private C1843c() {
            this.f2988a = AppLovinSdkUtils.dpToPx(C1839e.this.sdk.mo14520L(), C1839e.this.mo14185Y());
            this.f2989b = AppLovinSdkUtils.dpToPx(C1839e.this.sdk.mo14520L(), C1839e.this.mo14186Z());
            this.f2990c = AppLovinSdkUtils.dpToPx(C1839e.this.sdk.mo14520L(), C1839e.this.mo14204aa());
            this.f2991d = AppLovinSdkUtils.dpToPx(C1839e.this.sdk.mo14520L(), ((Integer) C1839e.this.sdk.mo14534a(C1867b.f3159bG)).intValue());
            this.f2992e = AppLovinSdkUtils.dpToPx(C1839e.this.sdk.mo14520L(), ((Integer) C1839e.this.sdk.mo14534a(C1867b.f3158bF)).intValue());
        }
    }

    /* renamed from: com.applovin.impl.sdk.ad.e$d */
    public enum C1844d {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public C1839e(JSONObject jSONObject, JSONObject jSONObject2, C1835b bVar, C1969m mVar) {
        super(jSONObject, jSONObject2, bVar, mVar);
    }

    /* renamed from: b */
    private C1535i.C1536a m3919b(boolean z) {
        return z ? C1535i.C1536a.WHITE_ON_TRANSPARENT : C1535i.C1536a.WHITE_ON_BLACK;
    }

    /* renamed from: b */
    private String m3921b(PointF pointF, boolean z) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", (String) null);
        Map<String, String> c = m3925c(pointF, z);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, c);
        }
        return null;
    }

    /* renamed from: b */
    private List<Integer> mo12844b() {
        return getIntegerListFromAdObject("multi_close_style", (List<Integer>) null);
    }

    /* renamed from: c */
    private String mo12845c() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", (String) null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    /* renamed from: c */
    private Map<String, String> m3925c(PointF pointF, boolean z) {
        Point a = C2049g.m4937a(this.sdk.mo14520L());
        HashMap hashMap = new HashMap(5);
        hashMap.put(Utils.MACRO_CLCODE, getClCode());
        hashMap.put(Utils.MACRO_CLICK_X, String.valueOf(pointF.x));
        hashMap.put(Utils.MACRO_CLICK_Y, String.valueOf(pointF.y));
        hashMap.put(Utils.MACRO_SCREEN_WIDTH, String.valueOf(a.x));
        hashMap.put(Utils.MACRO_SCREEN_HEIGHT, String.valueOf(a.y));
        hashMap.put(Utils.MACRO_IS_VIDEO_CLICK, String.valueOf(z));
        return hashMap;
    }

    /* renamed from: A */
    public List<Uri> mo14162A() {
        return this.f2971a;
    }

    /* renamed from: B */
    public String mo14163B() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("video_button_properties", (JSONObject) null);
        return jsonObjectFromAdObject != null ? JsonUtils.getString(jsonObjectFromAdObject, "video_button_html", "") : "";
    }

    /* renamed from: C */
    public C1563s mo14164C() {
        return new C1563s(getJsonObjectFromAdObject("video_button_properties", (JSONObject) null), this.sdk);
    }

    /* renamed from: D */
    public boolean mo12831D() {
        return getBooleanFromAdObject("video_clickable", false);
    }

    /* renamed from: E */
    public boolean mo14165E() {
        return getBooleanFromAdObject("lock_current_orientation", false);
    }

    /* renamed from: F */
    public C1841a mo14166F() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", (String) null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if (TapjoyConstants.TJC_FULLSCREEN_AD_DISMISS_URL.equalsIgnoreCase(stringFromAdObject)) {
                return C1841a.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return C1841a.DO_NOT_DISMISS;
            }
        }
        return C1841a.UNSPECIFIED;
    }

    /* renamed from: G */
    public List<String> mo14167G() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", (String) null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    /* renamed from: H */
    public List<String> mo14168H() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", (String) null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : this.sdk.mo14567b(C1867b.f3194bp);
    }

    /* renamed from: I */
    public boolean mo14169I() {
        return getBooleanFromAdObject("sruifwvc", false);
    }

    /* renamed from: J */
    public boolean mo14170J() {
        return getBooleanFromAdObject("recognize_interaction_as_click", false);
    }

    /* renamed from: K */
    public boolean mo14171K() {
        return getBooleanFromAdObject("require_interaction_for_click", false);
    }

    /* renamed from: L */
    public String mo14172L() {
        return getStringFromAdObject("cache_prefix", (String) null);
    }

    /* renamed from: M */
    public boolean mo14173M() {
        return getBooleanFromAdObject("sscomt", false);
    }

    /* renamed from: N */
    public String mo14174N() {
        return getStringFromFullResponse("event_id", (String) null);
    }

    /* renamed from: O */
    public boolean mo14175O() {
        return getBooleanFromAdObject("progress_bar_enabled", false);
    }

    /* renamed from: P */
    public int mo14176P() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    /* renamed from: Q */
    public int mo14177Q() {
        int videoCompletionPercent;
        synchronized (this.adObjectLock) {
            videoCompletionPercent = Utils.getVideoCompletionPercent(this.adObject);
        }
        return videoCompletionPercent;
    }

    /* renamed from: R */
    public int mo14178R() {
        synchronized (this.adObjectLock) {
            int i = JsonUtils.getInt(this.adObject, "graphic_completion_percent", -1);
            if (i < 0 || i > 100) {
                return 90;
            }
            return i;
        }
    }

    /* renamed from: S */
    public int mo14179S() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    /* renamed from: T */
    public int mo14180T() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    /* renamed from: U */
    public boolean mo14181U() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", false);
    }

    /* renamed from: V */
    public boolean mo14182V() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", false);
    }

    /* renamed from: W */
    public boolean mo14183W() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", false);
    }

    /* renamed from: X */
    public C1843c mo14184X() {
        if (this.f2979i == null) {
            this.f2979i = new C1843c();
        }
        return this.f2979i;
    }

    /* renamed from: Y */
    public int mo14185Y() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.mo14534a(C1867b.f3240cj)).intValue());
    }

    /* renamed from: Z */
    public int mo14186Z() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.mo14534a(C1867b.f3241ck)).intValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1535i.C1536a mo14187a(int i) {
        return i == 1 ? C1535i.C1536a.WHITE_ON_TRANSPARENT : i == 2 ? C1535i.C1536a.INVISIBLE : i == 3 ? C1535i.C1536a.TRANSPARENT_SKIP : C1535i.C1536a.WHITE_ON_BLACK;
    }

    /* renamed from: a */
    public List<C1875a> mo14188a(PointF pointF) {
        List<C1875a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_click_tracking_urls", this.adObject, m3925c(pointF, true), (String) null, mo14223au(), mo14241y(), this.sdk);
        }
        return postbacks.isEmpty() ? mo14189a(pointF, true) : postbacks;
    }

    /* renamed from: a */
    public List<C1875a> mo14189a(PointF pointF, boolean z) {
        List<C1875a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("click_tracking_urls", this.adObject, m3925c(pointF, z), m3921b(pointF, z), mo14223au(), mo14241y(), this.sdk);
        }
        return postbacks;
    }

    /* renamed from: a */
    public abstract void mo12834a();

    /* renamed from: a */
    public void mo14190a(C1864c cVar) {
        this.f2974d.set(cVar);
    }

    /* renamed from: a */
    public void mo14191a(boolean z) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("html_resources_cached", z);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: aA */
    public List<String> mo14192aA() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    /* renamed from: aB */
    public List<String> mo14193aB() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", (String) null));
    }

    /* renamed from: aC */
    public Uri mo14194aC() {
        String stringFromAdObject = getStringFromAdObject("mute_image", (String) null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: aD */
    public Uri mo14195aD() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: aE */
    public boolean mo14196aE() {
        return this.f2973c.get();
    }

    /* renamed from: aF */
    public void mo14197aF() {
        this.f2973c.set(true);
    }

    /* renamed from: aG */
    public C1864c mo14198aG() {
        return this.f2974d.getAndSet((Object) null);
    }

    /* renamed from: aH */
    public boolean mo14199aH() {
        String str = this.sdk.mo14586p().getExtraParameters().get("should_use_exoplayer_if_available");
        return StringUtils.isValidString(str) ? Boolean.parseBoolean(str) : getBooleanFromAdObject("suep", false);
    }

    /* renamed from: aI */
    public boolean mo14200aI() {
        return getBooleanFromAdObject("rwvbv", false);
    }

    /* renamed from: aJ */
    public boolean mo14201aJ() {
        return getBooleanFromAdObject("upiosp", false);
    }

    /* renamed from: aK */
    public boolean mo14202aK() {
        return getBooleanFromAdObject("web_video", false);
    }

    /* renamed from: aL */
    public C1844d mo14203aL() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", (String) null);
        return "top".equals(stringFromAdObject) ? C1844d.TOP : TJAdUnitConstants.String.BOTTOM.equals(stringFromAdObject) ? C1844d.BOTTOM : "left".equals(stringFromAdObject) ? C1844d.LEFT : "right".equals(stringFromAdObject) ? C1844d.RIGHT : C1844d.RESIZE_ASPECT;
    }

    /* renamed from: aa */
    public int mo14204aa() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.mo14534a(C1867b.f3239ci)).intValue());
    }

    /* renamed from: ab */
    public boolean mo14205ab() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.mo14534a(C1867b.f3238ch));
    }

    /* renamed from: ac */
    public boolean mo14206ac() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.mo14534a(C1867b.f3245co));
    }

    /* renamed from: ad */
    public long mo14207ad() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1;
    }

    /* renamed from: ae */
    public int mo14208ae() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    /* renamed from: af */
    public boolean mo14209af() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", true);
    }

    /* renamed from: ag */
    public AtomicBoolean mo14210ag() {
        return this.f2972b;
    }

    /* renamed from: ah */
    public boolean mo14211ah() {
        return getBooleanFromAdObject("show_nia", false);
    }

    /* renamed from: ai */
    public String mo14212ai() {
        return getStringFromAdObject("nia_title", "");
    }

    /* renamed from: aj */
    public String mo14213aj() {
        return getStringFromAdObject("nia_message", "");
    }

    /* renamed from: ak */
    public String mo14214ak() {
        return getStringFromAdObject("nia_button_title", "");
    }

    /* renamed from: al */
    public boolean mo14215al() {
        return getBooleanFromAdObject("avoms", false);
    }

    /* renamed from: am */
    public boolean mo14216am() {
        return getBooleanFromAdObject("show_rewarded_interstitial_overlay_alert", Boolean.valueOf(AppLovinAdType.AUTO_INCENTIVIZED == getType()));
    }

    /* renamed from: an */
    public String mo14217an() {
        return getStringFromAdObject("text_rewarded_inter_alert_title", "Watch a video to earn a reward!");
    }

    /* renamed from: ao */
    public String mo14218ao() {
        return getStringFromAdObject("text_rewarded_inter_alert_body", "");
    }

    /* renamed from: ap */
    public String mo14219ap() {
        return getStringFromAdObject("text_rewarded_inter_alert_ok_action", "OK!");
    }

    /* renamed from: aq */
    public List<C1875a> mo14220aq() {
        List<C1875a> postbacks;
        List<C1875a> list = this.f2975e;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_end_urls", this.adObject, getClCode(), mo12845c(), this.sdk);
            this.f2975e = postbacks;
        }
        return postbacks;
    }

    /* renamed from: ar */
    public List<C1875a> mo14221ar() {
        List<C1875a> postbacks;
        List<C1875a> list = this.f2976f;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("ad_closed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f2976f = postbacks;
        }
        return postbacks;
    }

    /* renamed from: as */
    public List<C1875a> mo14222as() {
        List<C1875a> postbacks;
        List<C1875a> list = this.f2977g;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("app_killed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f2977g = postbacks;
        }
        return postbacks;
    }

    /* renamed from: at */
    public List<C1875a> mo12843at() {
        List<C1875a> postbacks;
        List<C1875a> list = this.f2978h;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("imp_urls", this.adObject, getClCode(), (Map<String, String>) null, (String) null, mo14223au(), mo14241y(), this.sdk);
            this.f2978h = postbacks;
        }
        return postbacks;
    }

    /* renamed from: au */
    public Map<String, String> mo14223au() {
        HashMap hashMap = new HashMap();
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", false)) {
            hashMap.put("User-Agent", C1831ab.m3871a());
        }
        return hashMap;
    }

    /* renamed from: av */
    public boolean mo14224av() {
        return getBooleanFromAdObject("playback_requires_user_action", true);
    }

    /* renamed from: aw */
    public String mo14225aw() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    /* renamed from: ax */
    public boolean mo14226ax() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", false);
    }

    /* renamed from: ay */
    public C1567v mo14227ay() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", (JSONObject) null);
        if (jsonObjectFromAdObject != null) {
            return new C1567v(jsonObjectFromAdObject);
        }
        return null;
    }

    /* renamed from: az */
    public int mo14228az() {
        return getIntFromAdObject("whalt", Utils.isBML(getSize()) ? 1 : ((Boolean) this.sdk.mo14534a(C1867b.f3320eL)).booleanValue() ? 0 : -1);
    }

    /* renamed from: b */
    public void mo14229b(Uri uri) {
        this.f2971a.add(uri);
    }

    /* renamed from: c */
    public void mo14230c(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "mute_image", uri);
        }
    }

    /* renamed from: d */
    public abstract String mo12846d();

    /* renamed from: d */
    public void mo14231d(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "unmute_image", uri);
        }
    }

    /* renamed from: f */
    public boolean mo12849f() {
        if (!C2102v.m5104a()) {
            return false;
        }
        this.sdk.mo14509A().mo15016e("DirectAd", "Attempting to invoke isVideoStream() from base ad class");
        return false;
    }

    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", (String) null);
    }

    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        return Collections.emptyList();
    }

    /* renamed from: h */
    public Uri mo12853h() {
        if (!C2102v.m5104a()) {
            return null;
        }
        this.sdk.mo14509A().mo15016e("DirectAd", "Attempting to invoke getVideoUri() from base ad class");
        return null;
    }

    public abstract boolean isOpenMeasurementEnabled();

    /* renamed from: j */
    public Uri mo12858j() {
        if (!C2102v.m5104a()) {
            return null;
        }
        this.sdk.mo14509A().mo15016e("DirectAd", "Attempting to invoke getClickDestinationUri() from base ad class");
        return null;
    }

    /* renamed from: k */
    public Uri mo12859k() {
        if (!C2102v.m5104a()) {
            return null;
        }
        this.sdk.mo14509A().mo15016e("DirectAd", "Attempting to invoke getVideoClickDestinationUri() from base ad class");
        return null;
    }

    /* renamed from: o */
    public abstract C1800b mo12863o();

    /* renamed from: p */
    public C1842b mo14232p() {
        String upperCase = getStringFromAdObject("ad_target", C1842b.DEFAULT.toString()).toUpperCase(Locale.ENGLISH);
        return "ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase) ? C1842b.ACTIVITY_PORTRAIT : "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? C1842b.ACTIVITY_LANDSCAPE : C1842b.DEFAULT;
    }

    /* renamed from: q */
    public long mo14233q() {
        return getLongFromAdObject("close_delay", 0);
    }

    /* renamed from: r */
    public long mo14234r() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5));
    }

    /* renamed from: s */
    public long mo14235s() {
        List<Integer> t = mo14236t();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (t == null || t.size() <= 0) ? 0 : (long) t.get(0).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0;
        }
        return longFromAdObject;
    }

    /* renamed from: t */
    public List<Integer> mo14236t() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", (List<Integer>) null);
    }

    /* renamed from: u */
    public C1535i.C1536a mo14237u() {
        List<Integer> b = mo12844b();
        int intFromAdObject = getIntFromAdObject("close_style", (b == null || b.size() <= 0) ? -1 : b.get(0).intValue());
        return intFromAdObject == -1 ? m3919b(hasVideoUrl()) : mo14187a(intFromAdObject);
    }

    /* renamed from: v */
    public List<C1535i.C1536a> mo14238v() {
        List<Integer> b = mo12844b();
        if (b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(b.size());
        for (Integer intValue : b) {
            arrayList.add(mo14187a(intValue.intValue()));
        }
        return arrayList;
    }

    /* renamed from: w */
    public C1535i.C1536a mo14239w() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? mo14237u() : mo14187a(intFromAdObject);
    }

    /* renamed from: x */
    public boolean mo14240x() {
        return getBooleanFromAdObject("dismiss_on_skip", false);
    }

    /* renamed from: y */
    public boolean mo14241y() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", false);
    }

    /* renamed from: z */
    public boolean mo14242z() {
        return getBooleanFromAdObject("html_resources_cached", false);
    }
}
