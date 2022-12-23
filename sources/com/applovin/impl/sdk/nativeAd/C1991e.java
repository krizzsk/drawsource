package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.p028a.C1411a;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.C1986a;
import com.applovin.impl.sdk.network.C2020i;
import com.applovin.impl.sdk.p049ad.C1835b;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.p053e.C1928r;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.nativeAd.e */
public class C1991e extends C1887a implements C1986a.C1987a, AppLovinAdLoadListener {

    /* renamed from: a */
    private final JSONObject f3776a;

    /* renamed from: c */
    private final JSONObject f3777c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final AppLovinNativeAdLoadListener f3778d;

    /* renamed from: e */
    private String f3779e = "";

    /* renamed from: f */
    private String f3780f = "";

    /* renamed from: g */
    private String f3781g = "";

    /* renamed from: h */
    private String f3782h = "";

    /* renamed from: i */
    private Uri f3783i = null;

    /* renamed from: j */
    private Uri f3784j = null;

    /* renamed from: k */
    private Uri f3785k = null;

    /* renamed from: l */
    private Uri f3786l = null;

    /* renamed from: m */
    private C1411a f3787m;

    /* renamed from: n */
    private Uri f3788n = null;

    /* renamed from: o */
    private Uri f3789o = null;

    /* renamed from: p */
    private final List<String> f3790p = new ArrayList();

    /* renamed from: q */
    private String f3791q;

    /* renamed from: r */
    private final List<C2020i> f3792r = new ArrayList();

    /* renamed from: s */
    private final List<C2020i> f3793s = new ArrayList();

    /* renamed from: t */
    private final List<C2020i> f3794t = new ArrayList();

    /* renamed from: u */
    private final List<C2020i> f3795u = new ArrayList();

    public C1991e(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1969m mVar) {
        super("TaskRenderNativeAd", mVar);
        this.f3776a = jSONObject;
        this.f3777c = jSONObject2;
        this.f3778d = appLovinNativeAdLoadListener;
    }

    /* renamed from: a */
    private void m4589a() {
        AppLovinNativeAdImpl build = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f3776a), JsonUtils.shallowCopy(this.f3777c), this.f3496b).setTitle(this.f3779e).setAdvertiser(this.f3780f).setBody(this.f3781g).setCallToAction(this.f3782h).setIconUri(this.f3783i).setMainImageUri(this.f3784j).setPrivacyIconUri(this.f3785k).setVastAd(this.f3787m).setPrivacyDestinationUri(this.f3786l).setClickDestinationUri(this.f3788n).setClickDestinationBackupUri(this.f3789o).setClickTrackingUrls(this.f3790p).setJsTracker(this.f3791q).setImpressionRequests(this.f3792r).setViewableMRC50Requests(this.f3793s).setViewableMRC100Requests(this.f3794t).setViewableVideo50Requests(this.f3795u).build();
        build.getAdEventTracker().mo14066b();
        if (C2102v.m5104a()) {
            mo14365a("Starting cache task for type: " + build.getType() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.f3496b.mo14526S().mo14429a((C1887a) new C1986a(build, this.f3496b, this), C1918o.C1920a.MAIN);
    }

    /* renamed from: a */
    private void m4593a(JSONObject jSONObject) {
        if (jSONObject != null) {
            String string = JsonUtils.getString(jSONObject, "url", (String) null);
            if (StringUtils.isValidString(string)) {
                this.f3788n = Uri.parse(string);
                if (C2102v.m5104a()) {
                    mo14365a("Processed click destination URL: " + this.f3788n);
                }
            }
            String string2 = JsonUtils.getString(jSONObject, "fallback", (String) null);
            if (StringUtils.isValidString(string2)) {
                this.f3789o = Uri.parse(string2);
                if (C2102v.m5104a()) {
                    mo14365a("Processed click destination backup URL: " + this.f3789o);
                }
            }
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", (JSONArray) null);
            if (jSONArray != null) {
                try {
                    this.f3790p.addAll(JsonUtils.toList(jSONArray));
                    if (C2102v.m5104a()) {
                        mo14365a("Processed click tracking URLs: " + this.f3790p);
                    }
                } catch (Throwable th) {
                    if (C2102v.m5104a()) {
                        mo14366a("Failed to render click tracking URLs", th);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m4595b() {
        this.f3778d.onNativeAdLoadFailed(-6);
    }

    /* renamed from: b */
    private void m4596b(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C2102v.m5104a()) {
                    C1991e.this.mo14365a("Preparing native ad view components...");
                }
                try {
                    appLovinNativeAdImpl.setUpNativeAdViewComponents();
                    if (C2102v.m5104a()) {
                        C1991e.this.mo14365a("Successfully prepared native ad view components");
                    }
                    appLovinNativeAdImpl.getAdEventTracker().mo14068c();
                    C1991e.this.f3778d.onNativeAdLoaded(appLovinNativeAdImpl);
                } catch (Throwable th) {
                    if (C2102v.m5104a()) {
                        C1991e.this.mo14366a("Failed to prepare native ad view components", th);
                    }
                    C1991e.this.m4595b();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo14686a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C2102v.m5104a()) {
            mo14365a("Successfully cached and loaded ad");
        }
        m4596b(appLovinNativeAdImpl);
    }

    public void adReceived(AppLovinAd appLovinAd) {
        if (C2102v.m5104a()) {
            mo14365a("VAST ad rendered successfully");
        }
        this.f3787m = (C1411a) appLovinAd;
        m4589a();
    }

    public void failedToReceiveAd(int i) {
        if (C2102v.m5104a()) {
            mo14370d("VAST ad failed to render");
        }
        m4589a();
    }

    public void run() {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        StringBuilder sb3;
        String str3;
        String sb4;
        String str4;
        Uri uri;
        StringBuilder sb5;
        String string = JsonUtils.getString(this.f3776a, "privacy_icon_url", (String) null);
        if (URLUtil.isValidUrl(string)) {
            this.f3785k = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f3776a, "privacy_url", (String) null);
        if (!URLUtil.isValidUrl(string2)) {
            string2 = "https://www.applovin.com/privacy/";
        }
        this.f3786l = Uri.parse(string2);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f3776a, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (C2102v.m5104a()) {
                mo14370d("No oRtb response provided: " + this.f3776a);
            }
            m4595b();
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, "version", (String) null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
        if (C2102v.m5104a()) {
            mo14365a("Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        m4593a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", (JSONArray) null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (C2102v.m5104a()) {
                mo14370d("Unable to retrieve assets - failing ad load: " + this.f3776a);
            }
            m4595b();
            return;
        }
        String str5 = "";
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject4.has("title")) {
                this.f3779e = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) null), "text", (String) null);
                if (C2102v.m5104a()) {
                    sb2 = new StringBuilder();
                    sb2.append("Processed title: ");
                    str2 = this.f3779e;
                }
            } else {
                if (jSONObject4.has("link")) {
                    m4593a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) null));
                } else {
                    if (jSONObject4.has("img")) {
                        int i2 = JsonUtils.getInt(jSONObject4, "id", -1);
                        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) null);
                        int i3 = JsonUtils.getInt(jSONObject5, "type", -1);
                        String string4 = JsonUtils.getString(jSONObject5, "url", (String) null);
                        if (i3 == 1 || 3 == i2) {
                            this.f3783i = Uri.parse(string4);
                            if (C2102v.m5104a()) {
                                sb5 = new StringBuilder();
                                sb5.append("Processed icon URL: ");
                                uri = this.f3783i;
                            }
                        } else if (i3 == 3 || 2 == i2) {
                            this.f3784j = Uri.parse(string4);
                            if (C2102v.m5104a()) {
                                sb5 = new StringBuilder();
                                sb5.append("Processed main image URL: ");
                                uri = this.f3784j;
                            }
                        } else {
                            if (C2102v.m5104a()) {
                                mo14368c("Unrecognized image: " + jSONObject4);
                            }
                            int i4 = JsonUtils.getInt(jSONObject5, "w", -1);
                            int i5 = JsonUtils.getInt(jSONObject5, "h", -1);
                            if (i4 <= 0 || i5 <= 0) {
                                if (C2102v.m5104a()) {
                                    sb4 = "Skipping...";
                                }
                            } else if (((double) (((float) i4) / ((float) i5))) > 1.0d) {
                                if (C2102v.m5104a()) {
                                    mo14365a("Inferring main image from " + i4 + "x" + i5 + APSSharedUtil.TRUNCATE_SEPARATOR);
                                }
                                this.f3784j = Uri.parse(string4);
                            } else {
                                if (C2102v.m5104a()) {
                                    mo14365a("Inferring icon image from " + i4 + "x" + i5 + APSSharedUtil.TRUNCATE_SEPARATOR);
                                }
                                this.f3783i = Uri.parse(string4);
                            }
                        }
                        sb5.append(uri);
                        str4 = sb5.toString();
                        mo14365a(str4);
                    } else {
                        if (jSONObject4.has("video")) {
                            str5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", (String) null);
                            if (StringUtils.isValidString(str5)) {
                                if (C2102v.m5104a()) {
                                    str4 = "Processed VAST video";
                                    mo14365a(str4);
                                }
                            } else if (C2102v.m5104a()) {
                                sb3 = new StringBuilder();
                                str3 = "Ignoring invalid \"vasttag\" for video: ";
                            }
                        } else if (jSONObject4.has("data")) {
                            int i6 = JsonUtils.getInt(jSONObject4, "id", -1);
                            JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                            int i7 = JsonUtils.getInt(jSONObject6, "type", -1);
                            String string5 = JsonUtils.getString(jSONObject6, "value", (String) null);
                            if (i7 == 1 || i6 == 8) {
                                this.f3780f = string5;
                                if (C2102v.m5104a()) {
                                    sb2 = new StringBuilder();
                                    sb2.append("Processed advertiser: ");
                                    str2 = this.f3780f;
                                }
                            } else if (i7 == 2 || i6 == 4) {
                                this.f3781g = string5;
                                if (C2102v.m5104a()) {
                                    sb2 = new StringBuilder();
                                    sb2.append("Processed body: ");
                                    str2 = this.f3781g;
                                }
                            } else if (i7 == 12 || i6 == 5) {
                                this.f3782h = string5;
                                if (C2102v.m5104a()) {
                                    sb2 = new StringBuilder();
                                    sb2.append("Processed cta: ");
                                    str2 = this.f3782h;
                                }
                            } else if (C2102v.m5104a()) {
                                sb3 = new StringBuilder();
                                str3 = "Skipping unsupported data: ";
                            }
                        } else if (C2102v.m5104a()) {
                            mo14370d("Unsupported asset object: " + jSONObject4);
                        }
                        sb3.append(str3);
                        sb3.append(jSONObject4);
                        sb4 = sb3.toString();
                    }
                    mo14368c(sb4);
                }
            }
            sb5.append(str2);
            str4 = sb5.toString();
            mo14365a(str4);
        }
        String string6 = JsonUtils.getString(jSONObject3, "jstracker", (String) null);
        if (StringUtils.isValidString(string6)) {
            this.f3791q = string6;
            mo14365a("Processed jstracker: " + string6);
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", (JSONArray) null);
        if (jSONArray2 != null) {
            for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i8, (Object) null);
                if (objectAtIndex instanceof String) {
                    String str6 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str6)) {
                        this.f3792r.add(new C2020i.C2021a(this.f3496b).mo14724a(str6).mo14736d(false).mo14735c(false).mo14728a());
                        if (C2102v.m5104a()) {
                            mo14365a("Processed imptracker URL: " + str6);
                        }
                    }
                }
            }
        }
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", (JSONArray) null);
        if (jSONArray3 != null) {
            for (int i9 = 0; i9 < jSONArray3.length(); i9++) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i9, (JSONObject) null);
                int i10 = JsonUtils.getInt(jSONObject7, "event", -1);
                int i11 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string7 = JsonUtils.getString(jSONObject7, "url", (String) null);
                if (!TextUtils.isEmpty(string7)) {
                    if (i11 == 1 || i11 == 2) {
                        C2020i b = new C2020i.C2021a(this.f3496b).mo14724a(string7).mo14736d(false).mo14735c(false).mo14819g(i11 == 2).mo14728a();
                        if (i10 == 1) {
                            this.f3792r.add(b);
                            if (C2102v.m5104a()) {
                                mo14365a("Processed impression URL: " + string7);
                            }
                        } else {
                            if (i10 == 2) {
                                this.f3793s.add(b);
                                if (C2102v.m5104a()) {
                                    sb = new StringBuilder();
                                    str = "Processed viewable MRC50 URL: ";
                                }
                            } else if (i10 == 3) {
                                this.f3794t.add(b);
                                if (C2102v.m5104a()) {
                                    sb = new StringBuilder();
                                    str = "Processed viewable MRC100 URL: ";
                                }
                            } else {
                                if (i10 == 4) {
                                    this.f3795u.add(b);
                                    if (C2102v.m5104a()) {
                                        mo14365a("Processed viewable video 50 URL: " + string7);
                                    }
                                } else if (C2102v.m5104a()) {
                                    mo14370d("Unsupported event tracker: " + jSONObject7);
                                }
                            }
                            sb.append(str);
                            sb.append(string7);
                            mo14365a(sb.toString());
                        }
                    } else if (C2102v.m5104a()) {
                        mo14370d("Unsupported method for event tracker: " + jSONObject7);
                    }
                }
            }
        }
        if (StringUtils.isValidString(str5)) {
            if (C2102v.m5104a()) {
                mo14365a("Processing VAST video...");
            }
            this.f3496b.mo14526S().mo14428a((C1887a) C1928r.m4331a(str5, JsonUtils.shallowCopy(this.f3776a), JsonUtils.shallowCopy(this.f3777c), C1835b.UNKNOWN, this, this.f3496b));
            return;
        }
        m4589a();
    }
}
