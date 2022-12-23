package com.unity3d.services.core.webview.bridge.invocation;

import android.os.ConditionVariable;
import com.unity3d.services.core.webview.bridge.C12144a;
import com.unity3d.services.core.webview.bridge.C12145b;
import java.lang.reflect.Method;

/* renamed from: com.unity3d.services.core.webview.bridge.invocation.d */
/* compiled from: WebViewBridgeInvocationRunnable */
public class C12156d implements Runnable {

    /* renamed from: a */
    private static ConditionVariable f29681a;

    /* renamed from: b */
    private static C12144a f29682b;

    /* renamed from: c */
    private C12154b f29683c;

    /* renamed from: d */
    private C12145b f29684d;

    /* renamed from: e */
    private Method f29685e;

    /* renamed from: f */
    private String f29686f;

    /* renamed from: g */
    private String f29687g;

    /* renamed from: h */
    private int f29688h;

    /* renamed from: i */
    private Object[] f29689i;

    public C12156d(C12154b bVar, C12145b bVar2, String str, String str2, int i, Object... objArr) {
        try {
            this.f29685e = C12156d.class.getMethod("a", new Class[]{C12144a.class});
            this.f29683c = bVar;
            this.f29684d = bVar2;
            this.f29686f = str;
            this.f29687g = str2;
            this.f29688h = i;
            this.f29689i = objArr;
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("WebViewBridgeInvocation callback method cannot be found", e);
        }
    }

    /* renamed from: a */
    public static synchronized void m33148a(C12144a aVar) {
        synchronized (C12156d.class) {
            f29682b = aVar;
            ConditionVariable conditionVariable = f29681a;
            if (conditionVariable != null) {
                conditionVariable.open();
            }
        }
    }

    public void run() {
        f29682b = null;
        f29681a = new ConditionVariable();
        boolean a = this.f29684d.mo71311a(this.f29686f, this.f29687g, this.f29685e, this.f29689i);
        C12154b bVar = this.f29683c;
        if (bVar != null) {
            if (!a) {
                bVar.mo70819a("WebViewBridgeInvocationRunnable:run: invokeMethod failure", (C12144a) null);
            } else if (!f29681a.block((long) this.f29688h)) {
                this.f29683c.mo70820b();
            } else if (f29682b == C12144a.OK) {
                this.f29683c.mo70818a();
            } else {
                this.f29683c.mo70819a("WebViewBridgeInvocationRunnable:run CallbackStatus.Error", f29682b);
            }
        }
    }
}
