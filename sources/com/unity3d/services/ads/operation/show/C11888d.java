package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.request.metrics.C12112c;
import com.unity3d.services.core.webview.bridge.C12145b;

/* renamed from: com.unity3d.services.ads.operation.show.d */
/* compiled from: ShowModuleDecorator */
public class C11888d implements C11883a {

    /* renamed from: a */
    private final C11883a f28831a;

    public C11888d(C11883a aVar) {
        this.f28831a = aVar;
    }

    /* renamed from: a */
    public void mo70843a(C12145b bVar, C11897g gVar) {
        this.f28831a.mo70810a(bVar, gVar);
    }

    /* renamed from: b */
    public void mo70835b(String str) {
        this.f28831a.mo70835b(str);
    }

    /* renamed from: c */
    public C11884b get(String str) {
        return (C11884b) this.f28831a.get(str);
    }

    public void onUnityAdsShowClick(String str) {
        this.f28831a.onUnityAdsShowClick(str);
    }

    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        this.f28831a.onUnityAdsShowComplete(str, unityAdsShowCompletionState);
    }

    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        this.f28831a.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    public void onUnityAdsShowStart(String str) {
        this.f28831a.onUnityAdsShowStart(str);
    }

    /* renamed from: a */
    public C12112c mo70808a() {
        return this.f28831a.mo70808a();
    }

    /* renamed from: a */
    public void mo70823a(String str) {
        this.f28831a.mo70823a(str);
    }
}
