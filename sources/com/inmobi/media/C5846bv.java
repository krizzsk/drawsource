package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

/* renamed from: com.inmobi.media.bv */
/* compiled from: AdEventListener */
public abstract class C5846bv<T> {
    public void onAdClicked(T t, Map<Object, Object> map) {
    }

    public void onAdFetchSuccessful(T t, AdMetaInfo adMetaInfo) {
    }

    public void onAdImpression(T t) {
    }

    public void onAdLoadFailed(T t, InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    @Deprecated
    public void onAdLoadSucceeded(T t) {
    }

    public void onAdLoadSucceeded(T t, AdMetaInfo adMetaInfo) {
    }

    public void onRequestPayloadCreated(byte[] bArr) {
    }

    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    protected C5846bv() {
    }
}
