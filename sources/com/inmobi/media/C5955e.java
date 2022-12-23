package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.inmobi.media.e */
/* compiled from: InterstitialPreloadCallbacks */
public class C5955e extends PublisherCallbacks {

    /* renamed from: a */
    protected WeakReference<InMobiInterstitial> f15093a;

    public byte getType() {
        return 1;
    }

    public C5955e(InMobiInterstitial inMobiInterstitial) {
        this.f15093a = new WeakReference<>(inMobiInterstitial);
    }

    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15093a.get();
        if (!(inMobiInterstitial == null || inMobiInterstitial.f19565a == null)) {
            inMobiInterstitial.f19565a.onAdReceived(inMobiInterstitial);
        }
        if (inMobiInterstitial != null && inMobiInterstitial.f19565a != null) {
            inMobiInterstitial.f19565a.onAdFetchSuccessful(inMobiInterstitial, adMetaInfo);
        }
    }

    public void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15093a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f19565a != null) {
            inMobiInterstitial.f19565a.onAdFetchFailed(inMobiInterstitial, inMobiAdRequestStatus);
        }
    }

    public void onAdLoadSucceeded(AdMetaInfo adMetaInfo) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15093a.get();
        if (!(inMobiInterstitial == null || inMobiInterstitial.f19565a == null)) {
            inMobiInterstitial.f19565a.onAdLoadSucceeded(inMobiInterstitial);
        }
        if (inMobiInterstitial != null && inMobiInterstitial.f19565a != null) {
            inMobiInterstitial.f19565a.onAdLoadSucceeded(inMobiInterstitial, adMetaInfo);
        }
    }

    public void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15093a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f19565a != null) {
            inMobiInterstitial.f19565a.onAdLoadFailed(inMobiInterstitial, inMobiAdRequestStatus);
        }
    }

    public void onAdWillDisplay() {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15093a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f19565a != null) {
            inMobiInterstitial.f19565a.onAdWillDisplay(inMobiInterstitial);
        }
    }

    public void onAdDisplayFailed() {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15093a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f19565a != null) {
            inMobiInterstitial.f19565a.onAdDisplayFailed(inMobiInterstitial);
        }
    }

    public void onAdDisplayed(AdMetaInfo adMetaInfo) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15093a.get();
        if (!(inMobiInterstitial == null || inMobiInterstitial.f19565a == null)) {
            inMobiInterstitial.f19565a.onAdDisplayed(inMobiInterstitial);
        }
        if (inMobiInterstitial != null && inMobiInterstitial.f19565a != null) {
            inMobiInterstitial.f19565a.onAdDisplayed(inMobiInterstitial, adMetaInfo);
        }
    }

    public void onAdDismissed() {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15093a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f19565a != null) {
            inMobiInterstitial.f19565a.onAdDismissed(inMobiInterstitial);
        }
    }

    public void onAdClicked(Map<Object, Object> map) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15093a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f19565a != null) {
            inMobiInterstitial.f19565a.onAdClicked(inMobiInterstitial, map);
        }
    }

    public void onRewardsUnlocked(Map<Object, Object> map) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15093a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f19565a != null) {
            inMobiInterstitial.f19565a.onRewardsUnlocked(inMobiInterstitial, map);
        }
    }

    public void onUserLeftApplication() {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15093a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f19565a != null) {
            inMobiInterstitial.f19565a.onUserLeftApplication(inMobiInterstitial);
        }
    }

    public void onRequestPayloadCreated(byte[] bArr) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15093a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f19565a != null) {
            inMobiInterstitial.f19565a.onRequestPayloadCreated(bArr);
        }
    }

    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15093a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f19565a != null) {
            inMobiInterstitial.f19565a.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
        }
    }

    public void onAdImpression(C6173ho hoVar) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15093a.get();
        if (inMobiInterstitial != null) {
            inMobiInterstitial.f19565a.onAdImpression(inMobiInterstitial);
            if (hoVar != null) {
                hoVar.mo35382a();
            }
        } else if (hoVar != null) {
            hoVar.mo35384b();
        }
    }
}
