package com.unity3d.scar.adapter.v1950.scarads;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.scarads.IScarAd;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1950.signals.QueryInfoMetadata;

public abstract class ScarAdBase implements IScarAd {

    /* renamed from: a */
    protected Context f28580a;

    /* renamed from: b */
    protected ScarAdMetadata f28581b;

    /* renamed from: c */
    protected QueryInfoMetadata f28582c;

    /* renamed from: d */
    protected IAdsErrorHandler f28583d;

    public ScarAdBase(Context context, ScarAdMetadata scarAdMetadata, QueryInfoMetadata queryInfoMetadata, IAdsErrorHandler iAdsErrorHandler) {
        this.f28580a = context;
        this.f28581b = scarAdMetadata;
        this.f28582c = queryInfoMetadata;
        this.f28583d = iAdsErrorHandler;
    }

    public void loadAd(IScarLoadListener iScarLoadListener) {
        if (this.f28582c != null) {
            loadAdInternal(iScarLoadListener, new AdRequest.Builder().setAdInfo(new AdInfo(this.f28582c.getQueryInfo(), this.f28581b.getAdString())).build());
            return;
        }
        this.f28583d.handleError(GMAAdsError.QueryNotFoundError(this.f28581b));
    }

    /* access modifiers changed from: protected */
    public abstract void loadAdInternal(IScarLoadListener iScarLoadListener, AdRequest adRequest);
}
