package com.ogury.p377ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.jd */
public final class C10152jd {

    /* renamed from: a */
    public static final C10153a f25497a = new C10153a((byte) 0);

    /* renamed from: b */
    private final C10154je f25498b;

    /* renamed from: c */
    private final C10154je f25499c;

    /* renamed from: d */
    private final C10154je f25500d;

    /* renamed from: e */
    private final C10154je f25501e;

    public /* synthetic */ C10152jd(C10154je jeVar, C10154je jeVar2, C10154je jeVar3, C10154je jeVar4, byte b) {
        this(jeVar, jeVar2, jeVar3, jeVar4);
    }

    private C10152jd(C10154je jeVar, C10154je jeVar2, C10154je jeVar3, C10154je jeVar4) {
        this.f25498b = jeVar;
        this.f25499c = jeVar2;
        this.f25500d = jeVar3;
        this.f25501e = jeVar4;
    }

    /* renamed from: com.ogury.ed.internal.jd$a */
    public static final class C10153a {
        public /* synthetic */ C10153a(byte b) {
            this();
        }

        private C10153a() {
        }

        /* renamed from: a */
        public static C10152jd m29677a(Context context, C9981eb ebVar) {
            C10263mq.m29882b(context, "context");
            C10263mq.m29882b(ebVar, "ad");
            C10008ez ezVar = new C10008ez(context);
            C10156jg jgVar = new C10156jg(ezVar);
            C10154je jfVar = new C10155jf(ezVar, C9983ed.m28861a(ebVar));
            return new C10152jd(jgVar, new C10151jc(ezVar, jfVar, ebVar), new C10150jb(), jfVar, (byte) 0);
        }
    }

    /* renamed from: a */
    public final void mo64963a(C10158jh jhVar) {
        C10263mq.m29882b(jhVar, "webView");
        this.f25498b.mo64962a(jhVar.getMraidCommandExecutor());
    }

    /* renamed from: b */
    public final void mo64964b(C10158jh jhVar) {
        C10263mq.m29882b(jhVar, "webView");
        this.f25499c.mo64962a(jhVar.getMraidCommandExecutor());
    }

    /* renamed from: c */
    public final void mo64965c(C10158jh jhVar) {
        C10263mq.m29882b(jhVar, "webView");
        this.f25500d.mo64962a(jhVar.getMraidCommandExecutor());
    }

    /* renamed from: d */
    public final void mo64966d(C10158jh jhVar) {
        C10263mq.m29882b(jhVar, "webView");
        this.f25501e.mo64962a(jhVar.getMraidCommandExecutor());
    }
}
