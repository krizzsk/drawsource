package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.C11863b;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.webview.bridge.invocation.C12153a;

/* renamed from: com.unity3d.services.ads.operation.load.g */
/* compiled from: LoadOperation */
public class C11879g extends C11863b implements C11868b {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11882h f28816d;

    /* renamed from: com.unity3d.services.ads.operation.load.g$a */
    /* compiled from: LoadOperation */
    class C11880a implements Runnable {
        C11880a() {
        }

        public void run() {
            if (C11879g.this.f28816d != null) {
                C11879g.this.f28816d.mo70834f();
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.load.g$b */
    /* compiled from: LoadOperation */
    class C11881b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UnityAds.UnityAdsLoadError f28818a;

        /* renamed from: b */
        final /* synthetic */ String f28819b;

        C11881b(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
            this.f28818a = unityAdsLoadError;
            this.f28819b = str;
        }

        public void run() {
            if (C11879g.this.f28816d != null) {
                C11879g.this.f28816d.mo70833a(this.f28818a, this.f28819b);
            }
        }
    }

    public C11879g(C11882h hVar, C12153a aVar) {
        super(aVar, "load");
        this.f28816d = hVar;
    }

    /* renamed from: b */
    public C11882h mo70816b() {
        return this.f28816d;
    }

    public void onUnityAdsAdLoaded(String str) {
        C11882h hVar = this.f28816d;
        if (hVar != null && hVar.f28821h != null && str != null) {
            C12080j.m32879a((Runnable) new C11880a());
        }
    }

    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        C11882h hVar = this.f28816d;
        if (hVar != null && hVar.f28821h != null && str != null) {
            C12080j.m32879a((Runnable) new C11881b(unityAdsLoadError, str2));
        }
    }

    /* renamed from: a */
    public String mo70811a() {
        return this.f28816d.f28790b;
    }
}
