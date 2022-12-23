package com.bytedance.sdk.component.adexpress.p095d;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.p088a.C2526z;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.component.adexpress.d.d */
/* compiled from: WebViewBridgeProxy */
public class C2579d {

    /* renamed from: a */
    private WeakReference<C2526z> f5500a;

    public C2579d(C2526z zVar) {
        this.f5500a = new WeakReference<>(zVar);
    }

    /* renamed from: a */
    public void mo16777a(C2526z zVar) {
        this.f5500a = new WeakReference<>(zVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<C2526z> weakReference = this.f5500a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2526z) this.f5500a.get()).invokeMethod(str);
        }
    }
}
