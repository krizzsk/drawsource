package com.fyber.inneractive.sdk.bidder.adm;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.network.C4497k0;
import com.fyber.inneractive.sdk.network.C4501m0;
import com.fyber.inneractive.sdk.response.C5230b;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.response.C5238j;
import com.fyber.inneractive.sdk.util.C5290k;
import com.fyber.inneractive.sdk.util.C5299n;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.e */
public class C4168e implements C5238j {

    /* renamed from: a */
    public AdmParametersOuterClass$AdmParameters f10232a;

    /* renamed from: b */
    public final String f10233b;

    /* renamed from: c */
    public String f10234c;

    /* renamed from: d */
    public String f10235d;

    /* renamed from: com.fyber.inneractive.sdk.bidder.adm.e$a */
    public interface C4169a {
    }

    public C4168e(String str) {
        this.f10233b = str;
    }

    /* renamed from: a */
    public static void m13130a(C4168e eVar, C4169a aVar) {
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = eVar.f10232a;
        String markupUrl = (admParametersOuterClass$AdmParameters == null || !admParametersOuterClass$AdmParameters.hasMarkupUrl()) ? null : eVar.f10232a.getMarkupUrl();
        if (!TextUtils.isEmpty(markupUrl)) {
            C4497k0 k0Var = new C4497k0(new C4165b(eVar, aVar), markupUrl, eVar);
            k0Var.f11025d = new C4166c(eVar);
            IAConfigManager.f10324J.f10354t.f11186a.offer(k0Var);
            k0Var.mo24642a(C4501m0.QUEUED);
            return;
        }
        C5299n.f14024b.post(new C4167d(eVar, aVar));
    }

    /* renamed from: a */
    public void mo24158a(C5230b bVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j;
        int i;
        int i2;
        int i3;
        String str6;
        C5230b bVar2 = bVar;
        bVar2.f13854a.f13864A = true;
        IAConfigManager.f10324J.f10358x.f10404e = true;
        ImpressionData impressionData = new ImpressionData();
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f10232a;
        if (admParametersOuterClass$AdmParameters != null) {
            int a = admParametersOuterClass$AdmParameters.getAdType().mo24014a();
            if (this.f10232a.hasErrorMessage()) {
                this.f10232a.getErrorMessage();
            }
            String sessionId = this.f10232a.hasSessionId() ? this.f10232a.getSessionId() : null;
            Long valueOf = this.f10232a.hasContentId() ? Long.valueOf(this.f10232a.getContentId()) : null;
            if (this.f10232a.hasPublisherId()) {
                this.f10232a.getPublisherId();
            }
            Integer valueOf2 = this.f10232a.hasAdWidth() ? Integer.valueOf(this.f10232a.getAdWidth()) : null;
            Integer valueOf3 = this.f10232a.hasAdHeight() ? Integer.valueOf(this.f10232a.getAdHeight()) : null;
            String sdkImpressionUrl = this.f10232a.hasSdkImpressionUrl() ? this.f10232a.getSdkImpressionUrl() : null;
            String sdkClickUrl = this.f10232a.hasSdkClickUrl() ? this.f10232a.getSdkClickUrl() : null;
            Integer valueOf4 = this.f10232a.hasAdExpirationInterval() ? Integer.valueOf(this.f10232a.getAdExpirationInterval()) : null;
            String adCompletionUrl = this.f10232a.hasAdCompletionUrl() ? this.f10232a.getAdCompletionUrl() : null;
            bVar2.f13855b = this.f10232a.hasAdUnitId() ? this.f10232a.getAdUnitId() : null;
            this.f10232a.getAdUnitType().name().toLowerCase();
            String lowerCase = this.f10232a.hasAdUnitId() ? this.f10232a.getAdUnitDisplayType().name().toLowerCase() : null;
            String adNetworkName = this.f10232a.hasAdNetworkName() ? this.f10232a.getAdNetworkName() : null;
            Long valueOf5 = this.f10232a.hasAdNetworkId() ? Long.valueOf(this.f10232a.getAdNetworkId()) : null;
            String creativeId = this.f10232a.hasCreativeId() ? this.f10232a.getCreativeId() : null;
            String adDomain = this.f10232a.hasAdDomain() ? this.f10232a.getAdDomain() : null;
            if (this.f10232a.hasAppBundleId()) {
                str2 = this.f10232a.getAppBundleId();
                str = lowerCase;
            } else {
                str = lowerCase;
                str2 = null;
            }
            String campaignId = this.f10232a.hasCampaignId() ? this.f10232a.getCampaignId() : null;
            impressionData.setCpmValue(this.f10232a.hasPricingValue() ? Double.toString(this.f10232a.getPricingValue()) : null);
            impressionData.setCurrency("USD");
            if (this.f10232a.hasMrcData()) {
                if (this.f10232a.getMrcData().hasPixelPercent()) {
                    i2 = this.f10232a.getMrcData().getPixelPercent();
                    str5 = adCompletionUrl;
                } else {
                    str5 = adCompletionUrl;
                    i2 = 0;
                }
                if (this.f10232a.getMrcData().hasPixelDuration()) {
                    i3 = this.f10232a.getMrcData().getPixelDuration();
                    str4 = sdkClickUrl;
                } else {
                    str4 = sdkClickUrl;
                    i3 = -1;
                }
                if (this.f10232a.getMrcData().hasPixelImpressionUrl()) {
                    str6 = this.f10232a.getMrcData().getPixelImpressionUrl();
                    str3 = sdkImpressionUrl;
                } else {
                    str3 = sdkImpressionUrl;
                    str6 = null;
                }
                C5233e eVar = bVar2.f13854a;
                eVar.f13884t = i2;
                eVar.f13885u = (float) i3;
                eVar.f13886v = str6;
            } else {
                str3 = sdkImpressionUrl;
                str4 = sdkClickUrl;
                str5 = adCompletionUrl;
            }
            Boolean valueOf6 = this.f10232a.hasSkipMode() ? Boolean.valueOf(this.f10232a.getSkipMode()) : null;
            if (bVar.mo24321b()) {
                bVar2.f13854a.f13881q = this.f10232a.toString();
            }
            C5233e eVar2 = bVar2.f13854a;
            String num = valueOf4.toString();
            eVar2.getClass();
            try {
                j = Long.parseLong(num);
            } catch (NumberFormatException unused) {
                j = 20;
            }
            eVar2.f13866b = j;
            Integer num2 = valueOf3;
            eVar2.f13865a = eVar2.f13867c + TimeUnit.MINUTES.toMillis(j);
            impressionData.setImpressionId(sessionId);
            impressionData.setDemandSource(adNetworkName);
            bVar2.f13854a.f13868d = valueOf != null ? valueOf.toString() : "";
            bVar2.f13854a.getClass();
            bVar2.f13854a.getClass();
            C5233e eVar3 = bVar2.f13854a;
            eVar3.f13889y = str2;
            eVar3.f13890z = this.f10235d;
            if (valueOf5 != null) {
                impressionData.setDemandId(valueOf5);
            }
            C5233e eVar4 = bVar2.f13854a;
            eVar4.f13871g = a;
            if (valueOf2 != null) {
                eVar4.f13869e = valueOf2.intValue();
            }
            if (num2 != null) {
                bVar2.f13854a.f13870f = num2.intValue();
            }
            C5233e eVar5 = bVar2.f13854a;
            eVar5.f13875k = str3;
            eVar5.f13876l = str4;
            eVar5.f13879o = str5;
            eVar5.f13877m = bVar2.f13855b;
            try {
                eVar5.f13878n = UnitDisplayType.fromValue(str);
            } catch (IllegalArgumentException unused2) {
                bVar2.f13854a.f13878n = UnitDisplayType.INTERSTITIAL;
            }
            if (!TextUtils.isEmpty(creativeId)) {
                impressionData.setCreativeId(creativeId);
            }
            if (!TextUtils.isEmpty(adDomain)) {
                impressionData.setAdvertiserDomain(adDomain);
            }
            if (!TextUtils.isEmpty(campaignId)) {
                impressionData.setCampaignId(campaignId);
            }
            impressionData.setCountry(C5290k.m16489g());
            bVar2.f13854a.f13882r = impressionData;
            if (valueOf6 == null) {
                i = -1;
            } else {
                i = valueOf6.booleanValue() ? 1 : 0;
            }
            bVar2.f13854a.f13887w = i;
        }
    }

    /* renamed from: a */
    public String mo24157a() {
        return this.f10234c;
    }
}
