package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;

/* renamed from: com.fyber.inneractive.sdk.flow.f */
public class C4353f extends C4350e implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* renamed from: h */
    public final InneractiveAdSpot.RequestListener f10684h;

    /* renamed from: i */
    public final C4365m f10685i;

    public C4353f(InneractiveAdSpot.RequestListener requestListener, C4365m mVar) {
        this.f10684h = requestListener;
        this.f10685i = mVar;
    }

    /* renamed from: a */
    public void mo24503a() {
        super.mo24503a();
    }

    public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        IAConfigManager.removeListener(this);
        if (!z) {
            mo24504a(this.f10680e, mo24507c(), InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR);
        }
    }

    /* renamed from: a */
    public void mo24505a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        super.mo24505a(inneractiveInfrastructureError);
        InneractiveAdSpot.RequestListener requestListener = this.f10684h;
        if (requestListener != null) {
            requestListener.onInneractiveFailedAdRequest(this.f10685i, inneractiveInfrastructureError.getErrorCode());
        }
    }
}
