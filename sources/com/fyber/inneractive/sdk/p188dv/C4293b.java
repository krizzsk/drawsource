package com.fyber.inneractive.sdk.p188dv;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C4348c;
import com.fyber.inneractive.sdk.p188dv.banner.C4295a;
import com.fyber.inneractive.sdk.p188dv.interstitial.C4314b;
import com.fyber.inneractive.sdk.p188dv.interstitial.C4317c;
import com.fyber.inneractive.sdk.p188dv.rewarded.C4321a;
import com.fyber.inneractive.sdk.p188dv.rewarded.C4325b;
import com.fyber.inneractive.sdk.util.C5292l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;

/* renamed from: com.fyber.inneractive.sdk.dv.b */
public class C4293b extends C4348c<C4305f, C4292a> implements C4302d {

    /* renamed from: h */
    public boolean f10556h = (!C5292l.m16504a("com.google.android.gms.ads.InterstitialAd"));

    /* renamed from: com.fyber.inneractive.sdk.dv.b$a */
    public static /* synthetic */ class C4294a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10557a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10557a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10557a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10557a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10557a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p188dv.C4293b.C4294a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public String mo24296b() {
        return null;
    }

    /* renamed from: e */
    public void mo24297e() {
        Content content;
        Response response = this.f10670b;
        if (response == null || ((C4305f) response).f13883s == null) {
            mo24298f();
            return;
        }
        InneractiveAdRequest inneractiveAdRequest = this.f10669a;
        if (inneractiveAdRequest != null) {
            boolean muteVideo = inneractiveAdRequest.getMuteVideo();
            try {
                MobileAds.setAppMuted(muteVideo);
                MobileAds.setAppVolume(muteVideo ? 0.0f : 1.0f);
            } catch (Throwable unused) {
            }
        }
        C4305f fVar = (C4305f) this.f10670b;
        UnitDisplayType unitDisplayType = fVar.f13878n;
        QueryInfo queryInfo = fVar.f13883s.f10568a;
        int i = C4294a.f10557a[unitDisplayType.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                content = new C4295a(mo24495c(), this.f10674f, (C4305f) this.f10670b);
            } else if (i != 4) {
                content = null;
            } else if (this.f10556h) {
                content = new C4321a(mo24495c(), this.f10674f, (C4305f) this.f10670b);
            } else {
                content = new C4325b(mo24495c(), this.f10674f, (C4305f) this.f10670b);
            }
        } else if (this.f10556h) {
            content = new C4314b(mo24495c(), this.f10674f, (C4305f) this.f10670b);
        } else {
            content = new C4317c(mo24495c(), this.f10674f, (C4305f) this.f10670b);
        }
        this.f10671c = content;
        if (queryInfo == null || content == null) {
            mo24298f();
        } else {
            ((C4292a) this.f10671c).mo24292a(new AdRequest.Builder().setAdInfo(new AdInfo(queryInfo, ((C4305f) this.f10670b).f10567B)).build(), this);
        }
    }

    /* renamed from: f */
    public void mo24298f() {
        mo24494a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
    }
}
