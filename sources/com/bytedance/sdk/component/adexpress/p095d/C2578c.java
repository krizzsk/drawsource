package com.bytedance.sdk.component.adexpress.p095d;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.component.adexpress.d.c */
/* compiled from: TTAndroidObjectProxy */
public class C2578c {

    /* renamed from: a */
    private WeakReference<C2577b> f5499a;

    public C2578c(C2577b bVar) {
        this.f5499a = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public void mo16763a(C2577b bVar) {
        this.f5499a = new WeakReference<>(bVar);
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<C2577b> weakReference = this.f5499a;
        return (weakReference == null || weakReference.get() == null) ? "" : ((C2577b) this.f5499a.get()).adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<C2577b> weakReference = this.f5499a;
        return (weakReference == null || weakReference.get() == null) ? "" : ((C2577b) this.f5499a.get()).appInfo();
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<C2577b> weakReference = this.f5499a;
        return (weakReference == null || weakReference.get() == null) ? "" : ((C2577b) this.f5499a.get()).getTemplateInfo();
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<C2577b> weakReference = this.f5499a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2577b) this.f5499a.get()).renderDidFinish(str);
        }
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<C2577b> weakReference = this.f5499a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2577b) this.f5499a.get()).mo16750a(str);
        }
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<C2577b> weakReference = this.f5499a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2577b) this.f5499a.get()).muteVideo(str);
        }
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<C2577b> weakReference = this.f5499a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2577b) this.f5499a.get()).dynamicTrack(str);
        }
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<C2577b> weakReference = this.f5499a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2577b) this.f5499a.get()).changeVideoState(str);
        }
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<C2577b> weakReference = this.f5499a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2577b) this.f5499a.get()).clickEvent(str);
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<C2577b> weakReference = this.f5499a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2577b) this.f5499a.get()).skipVideo();
        }
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<C2577b> weakReference = this.f5499a;
        return (weakReference == null || weakReference.get() == null) ? "" : ((C2577b) this.f5499a.get()).getCurrentVideoState();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<C2577b> weakReference = this.f5499a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2577b) this.f5499a.get()).initRenderFinish();
        }
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<C2577b> weakReference = this.f5499a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2577b) this.f5499a.get()).mo16753b(str);
        }
    }
}
