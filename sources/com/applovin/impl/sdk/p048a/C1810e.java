package com.applovin.impl.sdk.p048a;

import android.webkit.WebView;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* renamed from: com.applovin.impl.sdk.a.e */
public class C1810e extends C1800b {
    public C1810e(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        super(appLovinNativeAdImpl);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AdSessionConfiguration mo14059a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                this.f2872c.mo15013b(this.f2873d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AdSessionContext mo14060a(WebView webView) {
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f2871b.mo14562al().mo14087d(), this.f2871b.mo14562al().mo14088e(), this.f2870a.getOpenMeasurementVerificationScriptResources(), this.f2870a.getOpenMeasurementContentUrl(), this.f2870a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                this.f2872c.mo15013b(this.f2873d, "Failed to create ad session context", th);
            }
            return null;
        }
    }
}
