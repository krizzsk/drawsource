package com.ogury.p377ed.internal;

import android.content.Context;
import com.smaato.sdk.video.vast.model.C11130Ad;
import p401io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.internal.x */
public final class C10340x {

    /* renamed from: a */
    private final Context f25678a;

    public C10340x(Context context) {
        C10263mq.m29882b(context, "context");
        this.f25678a = context;
    }

    /* renamed from: a */
    public final C10204l mo65178a(AdConfig adConfig, C9989ej ejVar) {
        C10263mq.m29882b(adConfig, "adConfig");
        C10263mq.m29882b(ejVar, C11130Ad.AD_TYPE);
        return new C10204l(this.f25678a, adConfig, ejVar);
    }
}
