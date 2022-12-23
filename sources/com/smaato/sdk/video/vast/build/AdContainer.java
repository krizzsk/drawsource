package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.C11130Ad;

class AdContainer<VastModel> {

    /* renamed from: ad */
    public final C11130Ad f26418ad;
    public final VastModel model;

    AdContainer(C11130Ad ad, VastModel vastmodel) {
        Objects.requireNonNull(ad, "Parameter ad cannot be null for AdContainer::new");
        Objects.requireNonNull(vastmodel, "Parameter model cannot be null for AdContainer::new");
        this.f26418ad = ad;
        this.model = vastmodel;
    }
}
