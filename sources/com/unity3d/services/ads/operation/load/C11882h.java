package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.ads.operation.C11866e;
import com.unity3d.services.core.configuration.Configuration;

/* renamed from: com.unity3d.services.ads.operation.load.h */
/* compiled from: LoadOperationState */
public class C11882h extends C11866e {

    /* renamed from: h */
    public IUnityAdsLoadListener f28821h;

    /* renamed from: i */
    public UnityAdsLoadOptions f28822i;

    public C11882h(String str, IUnityAdsLoadListener iUnityAdsLoadListener, UnityAdsLoadOptions unityAdsLoadOptions, Configuration configuration) {
        super(str, configuration);
        this.f28821h = iUnityAdsLoadListener;
        this.f28822i = unityAdsLoadOptions;
    }

    /* renamed from: a */
    public void mo70833a(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        IUnityAdsLoadListener iUnityAdsLoadListener = this.f28821h;
        if (iUnityAdsLoadListener != null) {
            iUnityAdsLoadListener.onUnityAdsFailedToLoad(this.f28791c, unityAdsLoadError, str);
        }
    }

    /* renamed from: f */
    public void mo70834f() {
        IUnityAdsLoadListener iUnityAdsLoadListener = this.f28821h;
        if (iUnityAdsLoadListener != null) {
            iUnityAdsLoadListener.onUnityAdsAdLoaded(this.f28791c);
        }
    }
}
