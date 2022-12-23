package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.request.metrics.C12112c;
import com.unity3d.services.core.webview.bridge.C12145b;

/* renamed from: com.unity3d.services.ads.operation.load.d */
/* compiled from: LoadModuleDecorator */
public class C11872d implements C11867a {

    /* renamed from: a */
    private final C11867a f28803a;

    public C11872d(C11867a aVar) {
        this.f28803a = aVar;
    }

    /* renamed from: a */
    public void mo70822a(C12145b bVar, C11882h hVar) {
        this.f28803a.mo70810a(bVar, hVar);
    }

    /* renamed from: c */
    public C11868b get(String str) {
        return (C11868b) this.f28803a.get(str);
    }

    public void onUnityAdsAdLoaded(String str) {
        this.f28803a.onUnityAdsAdLoaded(str);
    }

    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        this.f28803a.onUnityAdsFailedToLoad(str, unityAdsLoadError, str2);
    }

    /* renamed from: a */
    public C12112c mo70808a() {
        return this.f28803a.mo70808a();
    }

    /* renamed from: a */
    public void mo70823a(String str) {
        this.f28803a.mo70823a(str);
    }
}
