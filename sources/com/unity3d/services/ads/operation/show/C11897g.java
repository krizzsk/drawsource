package com.unity3d.services.ads.operation.show;

import android.app.Activity;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.services.ads.operation.C11866e;
import com.unity3d.services.core.configuration.Configuration;

/* renamed from: com.unity3d.services.ads.operation.show.g */
/* compiled from: ShowOperationState */
public class C11897g extends C11866e {

    /* renamed from: h */
    public Activity f28847h;

    /* renamed from: i */
    public IUnityAdsShowListener f28848i;

    /* renamed from: j */
    public UnityAdsShowOptions f28849j;

    public C11897g(String str, IUnityAdsShowListener iUnityAdsShowListener, Activity activity, UnityAdsShowOptions unityAdsShowOptions, Configuration configuration) {
        super(str, configuration);
        this.f28848i = iUnityAdsShowListener;
        this.f28847h = activity;
        this.f28849j = unityAdsShowOptions;
    }

    /* renamed from: a */
    public void mo70851a(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        IUnityAdsShowListener iUnityAdsShowListener = this.f28848i;
        if (iUnityAdsShowListener != null) {
            iUnityAdsShowListener.onUnityAdsShowFailure(this.f28791c, unityAdsShowError, str);
        }
    }

    /* renamed from: f */
    public void mo70853f() {
        IUnityAdsShowListener iUnityAdsShowListener = this.f28848i;
        if (iUnityAdsShowListener != null) {
            iUnityAdsShowListener.onUnityAdsShowClick(this.f28791c);
        }
    }

    /* renamed from: a */
    public void mo70852a(String str) {
        IUnityAdsShowListener iUnityAdsShowListener = this.f28848i;
        if (iUnityAdsShowListener != null) {
            iUnityAdsShowListener.onUnityAdsShowStart(str);
        }
    }

    /* renamed from: a */
    public void mo70850a(UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        IUnityAdsShowListener iUnityAdsShowListener = this.f28848i;
        if (iUnityAdsShowListener != null) {
            iUnityAdsShowListener.onUnityAdsShowComplete(this.f28791c, unityAdsShowCompletionState);
        }
    }
}
