package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.C11864c;

/* renamed from: com.unity3d.services.ads.operation.show.a */
/* compiled from: IShowModule */
public interface C11883a extends C11864c<C11884b, C11897g> {
    /* renamed from: b */
    void mo70835b(String str);

    void onUnityAdsShowClick(String str);

    void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2);

    void onUnityAdsShowStart(String str);
}
