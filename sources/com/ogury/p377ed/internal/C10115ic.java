package com.ogury.p377ed.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.ogury.ed.internal.ic */
public final class C10115ic {

    /* renamed from: a */
    private final WeakReference<C10120ig> f25406a;

    /* renamed from: b */
    private final C10158jh f25407b;

    /* renamed from: c */
    private final C9981eb f25408c;

    /* renamed from: d */
    private final long f25409d;

    private C10115ic(WeakReference<C10120ig> weakReference, C10158jh jhVar, C9981eb ebVar, long j) {
        C10263mq.m29882b(weakReference, "presageAdGatewayRef");
        C10263mq.m29882b(jhVar, "webView");
        C10263mq.m29882b(ebVar, "ad");
        this.f25406a = weakReference;
        this.f25407b = jhVar;
        this.f25408c = ebVar;
        this.f25409d = j;
    }

    /* renamed from: a */
    public final WeakReference<C10120ig> mo64893a() {
        return this.f25406a;
    }

    /* renamed from: b */
    public final C10158jh mo64894b() {
        return this.f25407b;
    }

    /* renamed from: c */
    public final C9981eb mo64895c() {
        return this.f25408c;
    }

    public /* synthetic */ C10115ic(WeakReference weakReference, C10158jh jhVar, C9981eb ebVar) {
        this(weakReference, jhVar, ebVar, System.currentTimeMillis());
    }

    /* renamed from: d */
    public final long mo64896d() {
        return this.f25409d;
    }
}
