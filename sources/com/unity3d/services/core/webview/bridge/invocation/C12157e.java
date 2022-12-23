package com.unity3d.services.core.webview.bridge.invocation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.unity3d.services.core.webview.bridge.invocation.e */
/* compiled from: WebViewBridgeInvocationSingleThreadedExecutor */
public class C12157e {

    /* renamed from: a */
    private static C12157e f29690a;

    /* renamed from: b */
    private ExecutorService f29691b = Executors.newSingleThreadExecutor();

    private C12157e() {
    }

    /* renamed from: b */
    public static C12157e m33149b() {
        if (f29690a == null) {
            f29690a = new C12157e();
        }
        return f29690a;
    }

    /* renamed from: a */
    public ExecutorService mo71343a() {
        return this.f29691b;
    }
}
