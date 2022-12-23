package com.ogury.p377ed.internal;

import android.content.Context;
import com.smaato.sdk.video.vast.model.C11130Ad;
import p401io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.internal.m */
public final class C10244m {

    /* renamed from: a */
    private final Context f25582a;

    /* renamed from: b */
    private final AdConfig f25583b;

    /* renamed from: c */
    private final C9989ej f25584c;

    public C10244m(Context context, AdConfig adConfig, C9989ej ejVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(ejVar, C11130Ad.AD_TYPE);
        this.f25582a = context;
        this.f25583b = adConfig;
        this.f25584c = ejVar;
    }

    /* renamed from: a */
    public final void mo65125a(String str) {
        C10263mq.m29882b(str, "campaignId");
        C10035ft.m29150a(this.f25583b, str);
    }

    /* renamed from: b */
    public final void mo65126b(String str) {
        C10263mq.m29882b(str, "creativeId");
        C10035ft.m29151b(this.f25583b, str);
    }

    /* renamed from: a */
    public final C10204l mo65124a() {
        return new C10204l(this.f25582a, this.f25583b, this.f25584c);
    }
}
