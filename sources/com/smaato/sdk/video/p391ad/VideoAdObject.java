package com.smaato.sdk.video.p391ad;

import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.p380ad.AdObject;
import com.smaato.sdk.core.util.Objects;

/* renamed from: com.smaato.sdk.video.ad.VideoAdObject */
class VideoAdObject implements AdObject {
    private final SomaApiContext somaApiContext;

    VideoAdObject(SomaApiContext somaApiContext2) {
        this.somaApiContext = (SomaApiContext) Objects.requireNonNull(somaApiContext2);
    }

    public SomaApiContext getSomaApiContext() {
        return this.somaApiContext;
    }
}
