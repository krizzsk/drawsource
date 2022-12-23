package com.unity3d.services.ads.operation;

import com.unity3d.services.core.request.metrics.C12112c;
import com.unity3d.services.core.webview.bridge.C12147d;
import com.unity3d.services.core.webview.bridge.C12159k;
import com.unity3d.services.core.webview.bridge.invocation.C12157e;
import java.util.concurrent.ExecutorService;

/* renamed from: com.unity3d.services.ads.operation.a */
/* compiled from: AdModule */
public abstract class C11862a<T extends C12147d, T2> extends C12159k<T> implements C11864c<T, T2> {

    /* renamed from: b */
    protected C12112c f28784b;

    /* renamed from: c */
    protected ExecutorService f28785c = C12157e.m33149b().mo71343a();

    protected C11862a(C12112c cVar) {
        this.f28784b = cVar;
    }

    /* renamed from: a */
    public C12112c mo70808a() {
        return this.f28784b;
    }
}
