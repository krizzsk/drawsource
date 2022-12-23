package com.unity3d.services.ads.operation;

import com.unity3d.services.core.webview.bridge.invocation.C12153a;

/* renamed from: com.unity3d.services.ads.operation.b */
/* compiled from: AdOperation */
public abstract class C11863b implements C11865d {

    /* renamed from: a */
    private static String f28786a = "webview";

    /* renamed from: b */
    private C12153a f28787b;

    /* renamed from: c */
    private String f28788c;

    protected C11863b(C12153a aVar, String str) throws NullPointerException {
        this.f28788c = str;
        if (str == null || str == "") {
            throw new IllegalArgumentException("invocationMethodName cannot be null");
        }
        this.f28787b = aVar;
        if (aVar == null) {
            throw new IllegalArgumentException("webViewBridgeInvocation cannot be null");
        }
    }

    /* renamed from: a */
    public void mo70809a(int i, Object... objArr) {
        this.f28787b.mo71341a(f28786a, this.f28788c, i, objArr);
    }
}
