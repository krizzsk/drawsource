package com.unity3d.services.core.webview.bridge.invocation;

import com.unity3d.services.core.webview.bridge.C12145b;
import java.util.concurrent.ExecutorService;

/* renamed from: com.unity3d.services.core.webview.bridge.invocation.c */
/* compiled from: WebViewBridgeInvocation */
public class C12155c implements C12153a {

    /* renamed from: a */
    private static C12154b f29678a;

    /* renamed from: b */
    private C12145b f29679b;

    /* renamed from: c */
    private ExecutorService f29680c;

    public C12155c(ExecutorService executorService, C12145b bVar, C12154b bVar2) {
        this.f29680c = executorService;
        f29678a = bVar2;
        if (bVar != null) {
            this.f29679b = bVar;
            return;
        }
        throw new IllegalArgumentException("webViewBridgeInvoker cannot be null");
    }

    /* renamed from: a */
    public synchronized void mo71341a(String str, String str2, int i, Object... objArr) {
        this.f29680c.submit(new C12156d(f29678a, this.f29679b, str, str2, i, objArr));
    }
}
