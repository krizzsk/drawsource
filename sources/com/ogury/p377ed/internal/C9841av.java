package com.ogury.p377ed.internal;

import android.widget.FrameLayout;
import com.smaato.sdk.video.vast.model.C11130Ad;

/* renamed from: com.ogury.ed.internal.av */
public final class C9841av {

    /* renamed from: a */
    private final C9989ej f24817a;

    /* renamed from: b */
    private final FrameLayout f24818b;

    /* renamed from: c */
    private final C10044g f24819c;

    /* renamed from: d */
    private final C9816aj f24820d;

    public C9841av(C9989ej ejVar, FrameLayout frameLayout, C10044g gVar, C9816aj ajVar) {
        C10263mq.m29882b(ejVar, C11130Ad.AD_TYPE);
        C10263mq.m29882b(frameLayout, "parent");
        C10263mq.m29882b(gVar, "adLayout");
        C10263mq.m29882b(ajVar, "adController");
        this.f24817a = ejVar;
        this.f24818b = frameLayout;
        this.f24819c = gVar;
        this.f24820d = ajVar;
    }

    /* renamed from: a */
    public final C9989ej mo64363a() {
        return this.f24817a;
    }

    /* renamed from: b */
    public final FrameLayout mo64364b() {
        return this.f24818b;
    }

    /* renamed from: c */
    public final C10044g mo64365c() {
        return this.f24819c;
    }

    /* renamed from: d */
    public final C9816aj mo64366d() {
        return this.f24820d;
    }
}
