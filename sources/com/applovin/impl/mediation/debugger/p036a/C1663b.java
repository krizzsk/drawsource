package com.applovin.impl.mediation.debugger.p036a;

import com.amazon.device.ads.DTBAdSize;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.a.b */
public class C1663b {

    /* renamed from: a */
    private final String f2349a;

    /* renamed from: b */
    private DTBAdSize f2350b;

    /* renamed from: com.applovin.impl.mediation.debugger.a.b$a */
    private enum C1664a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    public C1663b(String str, JSONObject jSONObject, MaxAdFormat maxAdFormat) {
        this.f2349a = str;
        this.f2350b = m3397a(JsonUtils.getInt(jSONObject, "type", m3398a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    /* renamed from: a */
    private DTBAdSize m3397a(int i, MaxAdFormat maxAdFormat, String str) {
        try {
            if (C1664a.VIDEO.ordinal() == i) {
                return new DTBAdSize.DTBVideo(320, 480, str);
            }
            if (C1664a.DISPLAY.ordinal() == i) {
                return new DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (C1664a.INTERSTITIAL.ordinal() == i) {
                return new DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private C1664a m3398a(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? C1664a.DISPLAY : C1664a.INTERSTITIAL;
    }

    /* renamed from: a */
    public DTBAdSize mo13620a() {
        return this.f2350b;
    }
}
