package com.unity3d.scar.adapter.v2000.scarads;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.scarads.IScarAd;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v2000.signals.QueryInfoMetadata;

public abstract class ScarAdBase<T> implements IScarAd {

    /* renamed from: a */
    protected T f28618a;

    /* renamed from: b */
    protected Context f28619b;

    /* renamed from: c */
    protected ScarAdMetadata f28620c;

    /* renamed from: d */
    protected QueryInfoMetadata f28621d;

    /* renamed from: e */
    protected ScarAdListener f28622e;

    /* renamed from: f */
    protected IAdsErrorHandler f28623f;

    public ScarAdBase(Context context, ScarAdMetadata scarAdMetadata, QueryInfoMetadata queryInfoMetadata, IAdsErrorHandler iAdsErrorHandler) {
        this.f28619b = context;
        this.f28620c = scarAdMetadata;
        this.f28621d = queryInfoMetadata;
        this.f28623f = iAdsErrorHandler;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo70686a(AdRequest adRequest, IScarLoadListener iScarLoadListener);

    public void loadAd(IScarLoadListener iScarLoadListener) {
        if (this.f28621d != null) {
            AdRequest build = new AdRequest.Builder().setAdInfo(new AdInfo(this.f28621d.getQueryInfo(), this.f28620c.getAdString())).build();
            this.f28622e.setLoadListener(iScarLoadListener);
            mo70686a(build, iScarLoadListener);
            return;
        }
        this.f28623f.handleError(GMAAdsError.QueryNotFoundError(this.f28620c));
    }

    public void setGmaAd(T t) {
        this.f28618a = t;
    }
}
