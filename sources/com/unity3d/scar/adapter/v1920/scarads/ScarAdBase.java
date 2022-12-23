package com.unity3d.scar.adapter.v1920.scarads;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.scarads.IScarAd;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1920.signals.QueryInfoMetadata;

public abstract class ScarAdBase implements IScarAd {

    /* renamed from: a */
    protected Context f28542a;

    /* renamed from: b */
    protected ScarAdMetadata f28543b;

    /* renamed from: c */
    protected QueryInfoMetadata f28544c;

    /* renamed from: d */
    protected IAdsErrorHandler f28545d;

    public ScarAdBase(Context context, ScarAdMetadata scarAdMetadata, QueryInfoMetadata queryInfoMetadata, IAdsErrorHandler iAdsErrorHandler) {
        this.f28542a = context;
        this.f28543b = scarAdMetadata;
        this.f28544c = queryInfoMetadata;
        this.f28545d = iAdsErrorHandler;
    }

    public void loadAd(IScarLoadListener iScarLoadListener) {
        if (this.f28544c != null) {
            loadAdInternal(iScarLoadListener, new AdRequest.Builder().setAdInfo(new AdInfo(this.f28544c.getQueryInfo(), this.f28543b.getAdString())).build());
            return;
        }
        this.f28545d.handleError(GMAAdsError.QueryNotFoundError(this.f28543b));
    }

    /* access modifiers changed from: protected */
    public abstract void loadAdInternal(IScarLoadListener iScarLoadListener, AdRequest adRequest);
}
