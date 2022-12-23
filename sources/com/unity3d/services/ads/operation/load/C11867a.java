package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.C11864c;

/* renamed from: com.unity3d.services.ads.operation.load.a */
/* compiled from: ILoadModule */
public interface C11867a extends C11864c<C11868b, C11882h> {
    void onUnityAdsAdLoaded(String str);

    void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2);
}
