package com.applovin.impl.mediation.ads;

import android.app.Activity;
import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.C2088k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.mediation.ads.a */
public abstract class C1614a {

    /* renamed from: a */
    private static C1969m f2203a;
    protected final MaxAdFormat adFormat;
    protected MaxAdListener adListener;
    protected MaxAdReviewListener adReviewListener;
    protected final String adUnitId;
    protected final Map<String, Object> extraParameters = Collections.synchronizedMap(new HashMap());
    protected final Map<String, Object> localExtraParameters = Collections.synchronizedMap(new HashMap());
    protected final C2102v logger;
    protected MaxAdRevenueListener revenueListener;
    protected final C1969m sdk;
    protected final String tag;

    /* renamed from: com.applovin.impl.mediation.ads.a$a */
    public interface C1615a extends MaxAdListener, MaxAdRevenueListener {
    }

    protected C1614a(String str, MaxAdFormat maxAdFormat, String str2, C1969m mVar) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = mVar;
        this.tag = str2;
        this.logger = mVar.mo14509A();
    }

    public static void logApiCall(String str, String str2) {
        if (f2203a == null) {
            for (AppLovinSdk appLovinSdk : AppLovinSdk.m5176a()) {
                C1969m mVar = appLovinSdk.coreSdk;
                if (!mVar.mo14575e()) {
                    if (C2102v.m5104a()) {
                        mVar.mo14509A().mo15012b(str, str2);
                    }
                    f2203a = mVar;
                }
            }
        } else if (C2102v.m5104a()) {
            f2203a.mo14509A().mo15012b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13522a(C1583a aVar) {
        if (C2102v.m5104a()) {
            C2088k kVar = new C2088k();
            kVar.mo14935a().mo14941a("MAX Ad").mo14938a(aVar).mo14935a();
            this.logger.mo15012b(this.tag, kVar.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void destroy() {
        this.localExtraParameters.clear();
        this.adListener = null;
        this.revenueListener = null;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public void logApiCall(String str) {
        if (C2102v.m5104a()) {
            this.logger.mo15012b(this.tag, str);
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.logger;
            String str = this.tag;
            vVar.mo15012b(str, "Setting Ad Review creative id listener: " + maxAdReviewListener);
        }
        this.adReviewListener = maxAdReviewListener;
    }

    public void setExtraParameter(String str, String str2) {
        if (str != null) {
            if (this.adFormat.isAdViewAd() && "ad_refresh_seconds".equals(str) && StringUtils.isValidString(str2)) {
                int parseInt = Integer.parseInt(str2);
                if (((long) parseInt) > TimeUnit.MINUTES.toSeconds(2) && C2102v.m5104a()) {
                    String str3 = this.tag;
                    C2102v.m5110i(str3, "Attempting to set extra parameter \"ad_refresh_seconds\" to over 2 minutes (" + parseInt + "s) - this will be ignored");
                }
            }
            this.extraParameters.put(str, str2);
            return;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public void setListener(MaxAdListener maxAdListener) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.logger;
            String str = this.tag;
            vVar.mo15012b(str, "Setting listener: " + maxAdListener);
        }
        this.adListener = maxAdListener;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        } else if (!(obj instanceof Activity)) {
            if ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str)) {
                setExtraParameter("is_amazon_integration", Boolean.toString(true));
            }
            this.localExtraParameters.put(str, obj);
        } else if (C2102v.m5104a()) {
            this.logger.mo15016e(this.tag, "Ignoring setting local extra parameter to Activity instance - please pass a WeakReference of it instead!");
        }
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.logger;
            String str = this.tag;
            vVar.mo15012b(str, "Setting revenue listener: " + maxAdRevenueListener);
        }
        this.revenueListener = maxAdRevenueListener;
    }
}
