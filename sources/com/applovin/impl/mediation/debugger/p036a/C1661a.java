package com.applovin.impl.mediation.debugger.p036a;

import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.a.a */
public class C1661a implements DTBAdCallback {

    /* renamed from: a */
    private final MaxAdFormat f2346a;

    /* renamed from: b */
    private final C1662a f2347b;

    /* renamed from: c */
    private DTBAdRequest f2348c;

    /* renamed from: com.applovin.impl.mediation.debugger.a.a$a */
    public interface C1662a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public C1661a(C1663b bVar, MaxAdFormat maxAdFormat, C1662a aVar) {
        this((List<C1663b>) Arrays.asList(new C1663b[]{bVar}), maxAdFormat, aVar);
    }

    public C1661a(List<C1663b> list, MaxAdFormat maxAdFormat, C1662a aVar) {
        this.f2346a = maxAdFormat;
        this.f2347b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i = 0; i < list.size(); i++) {
                dTBAdSizeArr[i] = list.get(i).mo13620a();
            }
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            this.f2348c = dTBAdRequest;
            dTBAdRequest.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo13617a() {
        this.f2348c.loadAd(this);
    }

    public void onFailure(AdError adError) {
        this.f2347b.onAdLoadFailed(adError, this.f2346a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f2347b.onAdResponseLoaded(dTBAdResponse, this.f2346a);
    }
}
