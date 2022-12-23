package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.adview.C1523d;
import com.applovin.impl.adview.C1529e;
import com.applovin.impl.p028a.C1411a;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C2020i;
import com.applovin.impl.sdk.p048a.C1810e;
import com.applovin.impl.sdk.p052d.C1875a;
import com.applovin.impl.sdk.utils.C2049g;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class AppLovinNativeAdImpl extends AppLovinAdBase implements AppLovinNativeAd {
    private static final String AD_RESPONSE_TYPE_APPLOVIN = "applovin";
    private static final String AD_RESPONSE_TYPE_ORTB = "ortb";
    private static final String AD_RESPONSE_TYPE_UNDEFINED = "undefined";
    private final C1810e adEventTracker;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    /* access modifiers changed from: private */
    public final Uri clickDestinationBackupUri;
    /* access modifiers changed from: private */
    public final Uri clickDestinationUri;
    private final C1984a clickHandler;
    /* access modifiers changed from: private */
    public final List<String> clickTrackingUrls;
    /* access modifiers changed from: private */
    public AppLovinNativeAdEventListener eventListener;
    private Uri iconUri;
    private final List<C2020i> impressionRequests;
    private final AtomicBoolean impressionTracked;
    private final String jsTracker;
    private Uri mainImageUri;
    private AppLovinMediaView mediaView;
    private ViewGroup nativeAdView;
    private final C1985b onAttachStateChangeHandler;
    private AppLovinOptionsView optionsView;
    private final Uri privacyDestinationUri;
    private Uri privacyIconUri;
    private final List<View> registeredViews;
    private final String tag;
    private final String title;
    private final C1411a vastAd;
    private final List<C2020i> viewableMRC100Requests;
    private final List<C2020i> viewableMRC50Requests;
    private final List<C2020i> viewableVideo50Requests;

    public static class Builder {
        /* access modifiers changed from: private */
        public final JSONObject adObject;
        /* access modifiers changed from: private */
        public String advertiser;
        /* access modifiers changed from: private */
        public String body;
        /* access modifiers changed from: private */
        public String callToAction;
        /* access modifiers changed from: private */
        public Uri clickDestinationBackupUri;
        /* access modifiers changed from: private */
        public Uri clickDestinationUri;
        /* access modifiers changed from: private */
        public List<String> clickTrackingUrls;
        /* access modifiers changed from: private */
        public final JSONObject fullResponse;
        /* access modifiers changed from: private */
        public Uri iconUri;
        /* access modifiers changed from: private */
        public List<C2020i> impressionRequests;
        /* access modifiers changed from: private */
        public String jsTracker;
        /* access modifiers changed from: private */
        public Uri mainImageUri;
        /* access modifiers changed from: private */
        public Uri privacyDestinationUri;
        /* access modifiers changed from: private */
        public Uri privacyIconUri;
        /* access modifiers changed from: private */
        public final C1969m sdk;
        /* access modifiers changed from: private */
        public String title;
        /* access modifiers changed from: private */
        public C1411a vastAd;
        /* access modifiers changed from: private */
        public List<C2020i> viewableMRC100Requests;
        /* access modifiers changed from: private */
        public List<C2020i> viewableMRC50Requests;
        /* access modifiers changed from: private */
        public List<C2020i> viewableVideo50Requests;

        public Builder(JSONObject jSONObject, JSONObject jSONObject2, C1969m mVar) {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.sdk = mVar;
        }

        public AppLovinNativeAdImpl build() {
            return new AppLovinNativeAdImpl(this);
        }

        public Builder setAdvertiser(String str) {
            this.advertiser = str;
            return this;
        }

        public Builder setBody(String str) {
            this.body = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.callToAction = str;
            return this;
        }

        public Builder setClickDestinationBackupUri(Uri uri) {
            this.clickDestinationBackupUri = uri;
            return this;
        }

        public Builder setClickDestinationUri(Uri uri) {
            this.clickDestinationUri = uri;
            return this;
        }

        public Builder setClickTrackingUrls(List<String> list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public Builder setImpressionRequests(List<C2020i> list) {
            this.impressionRequests = list;
            return this;
        }

        public Builder setJsTracker(String str) {
            this.jsTracker = str;
            return this;
        }

        public Builder setMainImageUri(Uri uri) {
            this.mainImageUri = uri;
            return this;
        }

        public Builder setPrivacyDestinationUri(Uri uri) {
            this.privacyDestinationUri = uri;
            return this;
        }

        public Builder setPrivacyIconUri(Uri uri) {
            this.privacyIconUri = uri;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setVastAd(C1411a aVar) {
            this.vastAd = aVar;
            return this;
        }

        public Builder setViewableMRC100Requests(List<C2020i> list) {
            this.viewableMRC100Requests = list;
            return this;
        }

        public Builder setViewableMRC50Requests(List<C2020i> list) {
            this.viewableMRC50Requests = list;
            return this;
        }

        public Builder setViewableVideo50Requests(List<C2020i> list) {
            this.viewableVideo50Requests = list;
            return this;
        }
    }

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$a */
    private static class C1984a implements View.OnClickListener {

        /* renamed from: a */
        private final AppLovinNativeAdImpl f3767a;

        public C1984a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f3767a = appLovinNativeAdImpl;
        }

        /* renamed from: a */
        public AppLovinNativeAdImpl mo14667a() {
            return this.f3767a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo14668a(Object obj) {
            return obj instanceof C1984a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1984a)) {
                return false;
            }
            C1984a aVar = (C1984a) obj;
            if (!aVar.mo14668a(this)) {
                return false;
            }
            AppLovinNativeAdImpl a = mo14667a();
            AppLovinNativeAdImpl a2 = aVar.mo14667a();
            return a != null ? a.equals(a2) : a2 == null;
        }

        public int hashCode() {
            AppLovinNativeAdImpl a = mo14667a();
            return 59 + (a == null ? 43 : a.hashCode());
        }

        public void onClick(View view) {
            this.f3767a.sdk.mo14592u().maybeSubmitPersistentPostbacks(this.f3767a.getDirectClickTrackingPostbacks());
            for (String dispatchPostbackAsync : this.f3767a.clickTrackingUrls) {
                this.f3767a.sdk.mo14531X().dispatchPostbackAsync(dispatchPostbackAsync, (AppLovinPostbackListener) null);
            }
            if (Utils.openUri(view.getContext(), this.f3767a.clickDestinationUri, this.f3767a.sdk) || Utils.openUri(view.getContext(), this.f3767a.clickDestinationBackupUri, this.f3767a.sdk)) {
                C2053j.m4980a(this.f3767a.eventListener, (AppLovinNativeAd) this.f3767a);
            }
        }

        public String toString() {
            return "AppLovinNativeAdImpl.ClickHandler(ad=" + mo14667a() + ")";
        }
    }

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$b */
    private static class C1985b implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        private final AppLovinNativeAdImpl f3768a;

        public C1985b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f3768a = appLovinNativeAdImpl;
        }

        /* renamed from: a */
        public AppLovinNativeAdImpl mo14673a() {
            return this.f3768a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo14674a(Object obj) {
            return obj instanceof C1985b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1985b)) {
                return false;
            }
            C1985b bVar = (C1985b) obj;
            if (!bVar.mo14674a(this)) {
                return false;
            }
            AppLovinNativeAdImpl a = mo14673a();
            AppLovinNativeAdImpl a2 = bVar.mo14673a();
            return a != null ? a.equals(a2) : a2 == null;
        }

        public int hashCode() {
            AppLovinNativeAdImpl a = mo14673a();
            return 59 + (a == null ? 43 : a.hashCode());
        }

        public void onViewAttachedToWindow(View view) {
            this.f3768a.maybeHandleOnAttachedToWindow(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }

        public String toString() {
            return "AppLovinNativeAdImpl.OnAttachStateChangeHandler(ad=" + mo14673a() + ")";
        }
    }

    private AppLovinNativeAdImpl(Builder builder) {
        super(builder.adObject, builder.fullResponse, builder.sdk);
        this.impressionTracked = new AtomicBoolean();
        this.registeredViews = new ArrayList();
        this.clickHandler = new C1984a(this);
        this.onAttachStateChangeHandler = new C1985b(this);
        this.adEventTracker = new C1810e(this);
        this.title = builder.title;
        this.advertiser = builder.advertiser;
        this.body = builder.body;
        this.callToAction = builder.callToAction;
        this.iconUri = builder.iconUri;
        this.mainImageUri = builder.mainImageUri;
        this.privacyIconUri = builder.privacyIconUri;
        this.vastAd = builder.vastAd;
        this.privacyDestinationUri = builder.privacyDestinationUri;
        this.clickDestinationUri = builder.clickDestinationUri;
        this.clickDestinationBackupUri = builder.clickDestinationBackupUri;
        this.clickTrackingUrls = builder.clickTrackingUrls;
        this.jsTracker = builder.jsTracker;
        this.impressionRequests = builder.impressionRequests;
        this.viewableMRC50Requests = builder.viewableMRC50Requests;
        this.viewableMRC100Requests = builder.viewableMRC100Requests;
        this.viewableVideo50Requests = builder.viewableVideo50Requests;
        this.tag = "AppLovinNativeAd:" + getAdIdNumber();
    }

    /* access modifiers changed from: private */
    public List<C1875a> getDirectClickTrackingPostbacks() {
        List<C1875a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("click_tracking_urls", this.adObject, getClCode(), getStringFromAdObject("click_tracking_url", (String) null), this.sdk);
        }
        return postbacks;
    }

    /* access modifiers changed from: private */
    public void maybeHandleOnAttachedToWindow(View view) {
        if (this.impressionTracked.compareAndSet(false, true)) {
            if (StringUtils.isValidString(this.jsTracker)) {
                final C1523d dVar = new C1523d((C1529e) null, this.sdk, view.getContext());
                dVar.loadData(this.jsTracker, "text/html", "UTF-8");
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                    public void run() {
                        dVar.stopLoading();
                    }
                }, TimeUnit.SECONDS.toMillis(5));
            }
            for (C2020i dispatchPostbackRequest : this.impressionRequests) {
                this.sdk.mo14531X().dispatchPostbackRequest(dispatchPostbackRequest, (AppLovinPostbackListener) null);
            }
            this.adEventTracker.mo14061a(view);
            this.adEventTracker.mo14069d();
        }
    }

    public void destroy() {
        unregisterViewsForInteraction();
        this.eventListener = null;
        this.adEventTracker.mo14070e();
    }

    public C1810e getAdEventTracker() {
        return this.adEventTracker;
    }

    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1);
    }

    public String getAdvertiser() {
        return this.advertiser;
    }

    public String getBody() {
        return this.body;
    }

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", (String) null);
    }

    public String getCallToAction() {
        return this.callToAction;
    }

    public C1984a getClickHandler() {
        return this.clickHandler;
    }

    public Uri getIconUri() {
        return this.iconUri;
    }

    public Uri getMainImageUri() {
        return this.mainImageUri;
    }

    public AppLovinMediaView getMediaView() {
        return this.mediaView;
    }

    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", (String) null);
    }

    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.adObjectLock) {
            JSONArray jSONArray = JsonUtils.getJSONArray(this.adObject, "omid_verification_script_resources", (JSONArray) null);
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
                    try {
                        URL url = new URL(JsonUtils.getString(jSONObject, "url", (String) null));
                        String string = JsonUtils.getString(jSONObject, "vendor_key", (String) null);
                        String string2 = JsonUtils.getString(jSONObject, "parameters", (String) null);
                        arrayList.add((!StringUtils.isValidString(string) || !StringUtils.isValidString(string2)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                    } catch (Throwable th) {
                        this.sdk.mo14509A().mo15013b(this.tag, "Failed to parse OMID verification script resource", th);
                    }
                }
            }
        }
        return arrayList;
    }

    public AppLovinOptionsView getOptionsView() {
        return this.optionsView;
    }

    public Uri getPrivacyDestinationUri() {
        return this.privacyDestinationUri;
    }

    public Uri getPrivacyIconUri() {
        return this.privacyIconUri;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return getStringFromAdObject("type", "undefined");
    }

    public C1411a getVastAd() {
        return this.vastAd;
    }

    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", false);
    }

    public void registerViewsForInteraction(List<View> list, ViewGroup viewGroup) {
        this.nativeAdView = viewGroup;
        if ((!C2049g.m4941c() || !this.nativeAdView.isAttachedToWindow()) && (C2049g.m4941c() || this.nativeAdView.getParent() == null)) {
            this.nativeAdView.addOnAttachStateChangeListener(this.onAttachStateChangeHandler);
        } else {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        }
        if (C2102v.m5104a()) {
            C2102v A = this.sdk.mo14509A();
            String str = this.tag;
            A.mo15012b(str, "Registered ad view for impressions: " + this.nativeAdView);
        }
        if (this.clickDestinationUri != null || this.clickDestinationBackupUri != null) {
            for (View next : list) {
                if (next.hasOnClickListeners() && C2102v.m5104a()) {
                    C2102v A2 = this.sdk.mo14509A();
                    String str2 = this.tag;
                    A2.mo15016e(str2, "View has an onClickListener already - " + next);
                }
                next.setOnClickListener(this.clickHandler);
                this.registeredViews.add(next);
            }
            if (C2102v.m5104a()) {
                C2102v A3 = this.sdk.mo14509A();
                String str3 = this.tag;
                A3.mo15012b(str3, "Registered views for clicks: " + this.registeredViews);
            }
        }
    }

    public void setEventListener(AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        this.eventListener = appLovinNativeAdEventListener;
    }

    public void setIconUri(Uri uri) {
        this.iconUri = uri;
    }

    public void setMainImageUri(Uri uri) {
        this.mainImageUri = uri;
    }

    public void setPrivacyIconUri(Uri uri) {
        this.privacyIconUri = uri;
    }

    public void setUpNativeAdViewComponents() {
        this.mediaView = new AppLovinMediaView(this, this.sdk, this.sdk.mo14520L());
        this.optionsView = new AppLovinOptionsView(this, this.sdk, this.sdk.mo14520L());
    }

    public String toString() {
        return "AppLovinNativeAd{adIdNumber=" + getAdIdNumber() + " - " + getTitle() + "}";
    }

    public void unregisterViewsForInteraction() {
        for (View onClickListener : this.registeredViews) {
            onClickListener.setOnClickListener((View.OnClickListener) null);
        }
        if (C2102v.m5104a()) {
            C2102v A = this.sdk.mo14509A();
            String str = this.tag;
            A.mo15012b(str, "Unregistered views: " + this.registeredViews);
        }
        this.registeredViews.clear();
        ViewGroup viewGroup = this.nativeAdView;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this.onAttachStateChangeHandler);
            this.nativeAdView = null;
        }
        AppLovinMediaView appLovinMediaView = this.mediaView;
        if (appLovinMediaView != null) {
            appLovinMediaView.destroy();
        }
        AppLovinOptionsView appLovinOptionsView = this.optionsView;
        if (appLovinOptionsView != null) {
            appLovinOptionsView.destroy();
        }
    }
}
