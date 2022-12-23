package com.unity3d.services.ads.operation.show;

import com.tapjoy.TJAdUnitConstants;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.C11863b;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.webview.bridge.invocation.C12153a;

/* renamed from: com.unity3d.services.ads.operation.show.f */
/* compiled from: ShowOperation */
public class C11892f extends C11863b implements C11884b {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11897g f28838d;

    /* renamed from: com.unity3d.services.ads.operation.show.f$a */
    /* compiled from: ShowOperation */
    class C11893a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UnityAds.UnityAdsShowError f28839a;

        /* renamed from: b */
        final /* synthetic */ String f28840b;

        C11893a(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
            this.f28839a = unityAdsShowError;
            this.f28840b = str;
        }

        public void run() {
            if (C11892f.this.f28838d != null) {
                C11892f.this.f28838d.mo70851a(this.f28839a, this.f28840b);
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.show.f$b */
    /* compiled from: ShowOperation */
    class C11894b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28842a;

        C11894b(String str) {
            this.f28842a = str;
        }

        public void run() {
            if (C11892f.this.f28838d != null) {
                C11892f.this.f28838d.mo70852a(this.f28842a);
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.show.f$c */
    /* compiled from: ShowOperation */
    class C11895c implements Runnable {
        C11895c() {
        }

        public void run() {
            if (C11892f.this.f28838d != null) {
                C11892f.this.f28838d.mo70853f();
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.show.f$d */
    /* compiled from: ShowOperation */
    class C11896d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UnityAds.UnityAdsShowCompletionState f28845a;

        C11896d(UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            this.f28845a = unityAdsShowCompletionState;
        }

        public void run() {
            if (C11892f.this.f28838d != null) {
                C11892f.this.f28838d.mo70850a(this.f28845a);
            }
        }
    }

    public C11892f(C11897g gVar, C12153a aVar) {
        super(aVar, TJAdUnitConstants.String.BEACON_SHOW_PATH);
        this.f28838d = gVar;
    }

    /* renamed from: c */
    public C11897g mo70840c() {
        return this.f28838d;
    }

    public void onUnityAdsShowClick(String str) {
        if (this.f28838d != null) {
            C12080j.m32879a((Runnable) new C11895c());
        }
    }

    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        if (this.f28838d != null) {
            C12080j.m32879a((Runnable) new C11896d(unityAdsShowCompletionState));
        }
    }

    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        C11897g gVar = this.f28838d;
        if (gVar != null && gVar.f28848i != null) {
            C12080j.m32879a((Runnable) new C11893a(unityAdsShowError, str2));
        }
    }

    public void onUnityAdsShowStart(String str) {
        if (this.f28838d != null) {
            C12080j.m32879a((Runnable) new C11894b(str));
        }
    }

    /* renamed from: a */
    public String mo70811a() {
        return this.f28838d.f28790b;
    }
}
