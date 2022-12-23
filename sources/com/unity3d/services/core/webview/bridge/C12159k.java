package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.bridge.C12147d;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.unity3d.services.core.webview.bridge.k */
/* compiled from: WebViewBridgeSharedObjectStore */
public abstract class C12159k<T extends C12147d> implements C12146c<T> {

    /* renamed from: a */
    private ConcurrentHashMap<String, T> f29692a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public void mo71344a(T t) {
        if (t != null) {
            this.f29692a.put(t.mo70811a(), t);
        }
    }

    public T get(String str) {
        if (str == null) {
            return null;
        }
        return (C12147d) this.f29692a.get(str);
    }

    /* renamed from: a */
    public void mo70823a(String str) {
        this.f29692a.remove(str);
    }
}
