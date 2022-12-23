package com.applovin.impl.sdk.p048a;

import android.webkit.WebView;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1834a;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* renamed from: com.applovin.impl.sdk.a.c */
public class C1808c extends C1800b {
    public C1808c(C1834a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AdSessionConfiguration mo14059a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, Owner.NONE, false);
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
            return AdSessionContext.createHtmlAdSessionContext(this.f2871b.mo14562al().mo14087d(), webView, this.f2870a.getOpenMeasurementContentUrl(), this.f2870a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                this.f2872c.mo15013b(this.f2873d, "Failed to create ad session context", th);
            }
            return null;
        }
    }
}
