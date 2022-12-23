package com.ogury.p377ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.iv */
public final class C10141iv {

    /* renamed from: a */
    private final Context f25462a;

    /* renamed from: b */
    private final C10145iy f25463b;

    /* renamed from: c */
    private final C10227lj<C10182ke> f25464c;

    public C10141iv(Context context, C10145iy iyVar, C10227lj<C10182ke> ljVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(iyVar, "mraidViewCommands");
        this.f25462a = context;
        this.f25463b = iyVar;
        this.f25464c = ljVar;
    }

    /* renamed from: a */
    public final C10142iw mo64937a(C10158jh jhVar) {
        C10263mq.m29882b(jhVar, "mraidWebView");
        C10142iw iwVar = new C10142iw(this.f25462a, jhVar.getMraidCommandExecutor(), this.f25463b, C10075gz.f25308a, C10084hg.f25316a, new C10012fa(this.f25462a), new C10008ez(this.f25462a));
        iwVar.mo64938a(this.f25464c);
        return iwVar;
    }
}
