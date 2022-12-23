package com.fyber.marketplace.fairbid.impl;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4223e;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.factories.C4339b;
import com.fyber.inneractive.sdk.flow.C4348c;
import com.fyber.inneractive.sdk.interfaces.C4394a;
import com.fyber.inneractive.sdk.network.C4500m;
import com.fyber.inneractive.sdk.network.C4507o;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.p188dv.C4306g;
import com.fyber.inneractive.sdk.response.C5229a;
import com.fyber.inneractive.sdk.response.C5230b;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.response.C5239k;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.marketplace.fairbid.impl.a */
public abstract class C5379a {
    public C5389e adSpot;
    public MarketplaceAuctionParameters mMarketplaceAuctionParameters;
    private C5386c mMarketplaceAuctionResponse;
    /* access modifiers changed from: private */
    public boolean mMuted;
    public String mPlacementId;
    public C4306g mWrapperQueryInfo;

    /* renamed from: com.fyber.marketplace.fairbid.impl.a$a */
    public class C5380a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ MarketplaceAdLoadListener f14203a;

        /* renamed from: b */
        public final /* synthetic */ C5229a f14204b;

        /* renamed from: c */
        public final /* synthetic */ String f14205c;

        /* renamed from: d */
        public final /* synthetic */ Map f14206d;

        /* renamed from: e */
        public final /* synthetic */ InneractiveUnitController f14207e;

        public C5380a(MarketplaceAdLoadListener marketplaceAdLoadListener, C5229a aVar, String str, Map map, InneractiveUnitController inneractiveUnitController) {
            this.f14203a = marketplaceAdLoadListener;
            this.f14204b = aVar;
            this.f14205c = str;
            this.f14206d = map;
            this.f14207e = inneractiveUnitController;
        }

        public void run() {
            C5379a.this.loadParsedData(this.f14207e, this.f14203a, C5379a.this.parseResponseData(this.f14203a, this.f14204b, this.f14205c, this.f14206d), C5379a.this.getAdContentLoader(this.f14203a, this.f14204b));
        }
    }

    /* renamed from: com.fyber.marketplace.fairbid.impl.a$c */
    public class C5383c implements C4500m {

        /* renamed from: a */
        public final /* synthetic */ Map f14215a;

        /* renamed from: b */
        public final /* synthetic */ String f14216b;

        public C5383c(C5379a aVar, Map map, String str) {
            this.f14215a = map;
            this.f14216b = str;
        }

        /* renamed from: d */
        public StringBuffer mo24661d() {
            return new StringBuffer(this.f14216b);
        }

        /* renamed from: o */
        public Map<String, String> mo24662o() {
            return this.f14215a;
        }
    }

    public C5379a(String str, JSONObject jSONObject, Map<String, String> map, boolean z, MarketplaceAuctionParameters marketplaceAuctionParameters) {
        Map<String, String> lowerCaseHeaders = lowerCaseHeaders(map);
        C5229a responseAdType = getResponseAdType(lowerCaseHeaders);
        this.mMarketplaceAuctionParameters = marketplaceAuctionParameters;
        this.mPlacementId = str;
        if (responseAdType != null) {
            this.mMarketplaceAuctionResponse = new C5386c(jSONObject, responseAdType, lowerCaseHeaders);
        }
        this.mMuted = z;
    }

    private void fireAdLoadFailedEvent(MarketplaceAdLoadError marketplaceAdLoadError) {
        if (isFullscreen()) {
            IAlog.m16446a("Firing Event 801 - AdLoadFailed - errorCode - %s", marketplaceAdLoadError.getErrorMessage());
            C4511q.C4512a aVar = new C4511q.C4512a(C4507o.IA_AD_LOAD_FAILED, (InneractiveAdRequest) null, (C5233e) null, (JSONArray) null);
            JSONObject jSONObject = new JSONObject();
            String str = marketplaceAdLoadError.toString();
            try {
                jSONObject.put("message", str);
            } catch (Exception unused) {
                IAlog.m16450e("Got exception adding param to json object: %s, %s", "message", str);
            }
            String errorMessage = marketplaceAdLoadError.getErrorMessage();
            try {
                jSONObject.put("extra_description", errorMessage);
            } catch (Exception unused2) {
                IAlog.m16450e("Got exception adding param to json object: %s, %s", "extra_description", errorMessage);
            }
            aVar.f11167f.put(jSONObject);
            aVar.mo24693a((String) null);
        }
    }

    private C5230b generateParser(C5229a aVar, String str, Map<String, String> map) {
        C5230b a = C4339b.C4340a.f10657a.mo24484a(aVar);
        IAlog.m16446a("IA Exchange response handler: final headers: %s", map);
        if (a != null) {
            C5383c cVar = new C5383c(this, map, str);
            a.f13854a = a.mo24319a();
            a.f13856c = new C5239k(cVar);
        }
        return a;
    }

    /* access modifiers changed from: private */
    public void loadParsedData(InneractiveUnitController<?> inneractiveUnitController, MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener, C5233e eVar, C4394a aVar) {
        if (eVar != null && aVar != null) {
            C5299n.f14024b.post(new C5381b(eVar, aVar, inneractiveUnitController, marketplaceAdLoadListener));
        }
    }

    public C4394a getAdContentLoader(MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener, C5229a aVar) {
        C4339b.C4341b bVar = C4339b.C4340a.f10657a.f10656a.get(aVar);
        C4394a a = bVar != null ? bVar.mo24313a() : null;
        if (a != null) {
            return a;
        }
        notifyFailToListener(MarketplaceAdLoadError.UNSUPPORTED_AD_TYPE, marketplaceAdLoadListener);
        return null;
    }

    public abstract void internalOnAdLoaded(C5379a aVar, C5389e eVar);

    public abstract boolean isFullscreen();

    public boolean isMuted() {
        return this.mMuted;
    }

    public void loadAd(InneractiveUnitController<?> inneractiveUnitController, MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener) {
        C5386c cVar = this.mMarketplaceAuctionResponse;
        if (cVar == null) {
            notifyFailToListener(MarketplaceAdLoadError.FAILED_TO_PARSE_AD_CONTENT, marketplaceAdLoadListener);
            return;
        }
        C5229a aVar = cVar.f14241b;
        String str = cVar.f14240a;
        Map<String, String> map = cVar.f14242c;
        if (aVar == null || str == null || map.isEmpty()) {
            notifyFailToListener(MarketplaceAdLoadError.FAILED_TO_PARSE_AD_CONTENT, marketplaceAdLoadListener);
        } else {
            C5299n.m16520a(new C5380a(marketplaceAdLoadListener, aVar, str, map, inneractiveUnitController));
        }
    }

    public Map<String, String> lowerCaseHeaders(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (String next : map.keySet()) {
                hashMap.put(TextUtils.isEmpty(next) ? next : next.toLowerCase(Locale.ENGLISH), map.get(next));
            }
        }
        return hashMap;
    }

    public void notifyFailToListener(MarketplaceAdLoadError marketplaceAdLoadError, MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener) {
        fireAdLoadFailedEvent(marketplaceAdLoadError);
        marketplaceAdLoadListener.onAdLoadFailed(marketplaceAdLoadError);
    }

    public C5233e parseResponseData(MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener, C5229a aVar, String str, Map<String, String> map) {
        try {
            C5233e a = generateParser(aVar, str, map).mo26309a(str);
            C4306g gVar = this.mWrapperQueryInfo;
            if (gVar != null) {
                a.f13883s = gVar;
            }
            InneractiveErrorCode a2 = a.mo24322a((InneractiveAdRequest) null);
            if (a2 == null) {
                return a;
            }
            notifyFailToListener(MarketplaceAdLoadError.RESPONSE_VALIDATION_FAILED, marketplaceAdLoadListener);
            IAlog.m16446a("failed parsing response data with error: %s", a2.toString());
            return null;
        } catch (Exception e) {
            notifyFailToListener(MarketplaceAdLoadError.FAILED_TO_PARSE_AD_CONTENT, marketplaceAdLoadListener);
            if (e.getMessage() != null) {
                IAlog.m16446a("failed parsing response data with error: %s", e.getMessage());
            }
            return null;
        }
    }

    public void setQueryInfo(C4306g gVar) {
        this.mWrapperQueryInfo = gVar;
    }

    public C5229a getResponseAdType(Map<String, String> map) {
        String str = map.get("X-IA-Ad-Type".toLowerCase(Locale.ENGLISH));
        if (str == null) {
            return null;
        }
        try {
            return C5229a.m16362a(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: com.fyber.marketplace.fairbid.impl.a$b */
    public class C5381b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C5233e f14209a;

        /* renamed from: b */
        public final /* synthetic */ C4394a f14210b;

        /* renamed from: c */
        public final /* synthetic */ InneractiveUnitController f14211c;

        /* renamed from: d */
        public final /* synthetic */ MarketplaceAdLoadListener f14212d;

        public C5381b(C5233e eVar, C4394a aVar, InneractiveUnitController inneractiveUnitController, MarketplaceAdLoadListener marketplaceAdLoadListener) {
            this.f14209a = eVar;
            this.f14210b = aVar;
            this.f14211c = inneractiveUnitController;
            this.f14212d = marketplaceAdLoadListener;
        }

        public void run() {
            C5379a aVar = C5379a.this;
            C4251s featureProvider = aVar.mMarketplaceAuctionParameters.getFeatureProvider(aVar.mPlacementId);
            if (featureProvider == null) {
                featureProvider = new C4251s();
            }
            C5233e eVar = this.f14209a;
            C4223e eVar2 = new C4223e();
            ImpressionData impressionData = eVar.f13882r;
            eVar2.f10418a = impressionData != null ? impressionData.getDemandId() : null;
            try {
                eVar2.f10419b = Long.valueOf(IAConfigManager.f10324J.f10338d);
            } catch (NumberFormatException unused) {
                IAlog.m16446a("invalid publisherId", new Object[0]);
            }
            featureProvider.mo24266a(eVar2);
            C4394a aVar2 = this.f14210b;
            C5233e eVar3 = this.f14209a;
            boolean access$100 = C5379a.this.mMuted;
            C5382a aVar3 = new C5382a();
            C4348c cVar = (C4348c) aVar2;
            cVar.f10675g = access$100;
            cVar.mo24492a((InneractiveAdRequest) null, eVar3, featureProvider, aVar3);
        }

        /* renamed from: com.fyber.marketplace.fairbid.impl.a$b$a */
        public class C5382a implements C4394a.C4395a {
            public C5382a() {
            }

            /* renamed from: a */
            public void mo24503a() {
                C5381b bVar = C5381b.this;
                C5379a.this.adSpot = new C5389e(bVar.f14211c, ((C4348c) bVar.f14210b).f10671c);
                C5379a aVar = C5379a.this;
                aVar.internalOnAdLoaded(aVar, aVar.adSpot);
            }

            /* renamed from: a */
            public void mo24505a(InneractiveInfrastructureError inneractiveInfrastructureError) {
                C5381b.this.f14212d.onAdLoadFailed(MarketplaceAdLoadError.FAILED_TO_LOAD_AD);
            }
        }
    }
}
