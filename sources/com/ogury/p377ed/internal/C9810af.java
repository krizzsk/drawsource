package com.ogury.p377ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.af */
public final class C9810af implements C10328r {

    /* renamed from: a */
    public static final C9811a f24727a = new C9811a((byte) 0);

    /* renamed from: b */
    private final C9967dv f24728b;

    /* renamed from: c */
    private final C10084hg f24729c;

    /* renamed from: d */
    private final C9943di f24730d;

    /* renamed from: e */
    private boolean f24731e;

    /* renamed from: f */
    private C9981eb f24732f;

    /* renamed from: g */
    private C10327q f24733g;

    private C9810af(C9967dv dvVar, C10084hg hgVar, C9943di diVar) {
        C10263mq.m29882b(dvVar, "presageApi");
        C10263mq.m29882b(hgVar, "mraidEventBus");
        C10263mq.m29882b(diVar, "measurementsEventLogger");
        this.f24728b = dvVar;
        this.f24729c = hgVar;
        this.f24730d = diVar;
    }

    /* renamed from: a */
    public final void mo64292a(C9981eb ebVar) {
        this.f24732f = ebVar;
    }

    /* renamed from: a */
    public final void mo64293a(C10327q qVar) {
        if (qVar != null) {
            qVar.mo64287a(this);
        }
        this.f24733g = qVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C9810af(Context context) {
        this(C9968dw.m28771a(context), C10084hg.f25316a, C9943di.f25015a);
        C10263mq.m29882b(context, "context");
        C9968dw dwVar = C9968dw.f25057a;
    }

    /* renamed from: com.ogury.ed.internal.af$a */
    public static final class C9811a {
        public /* synthetic */ C9811a(byte b) {
            this();
        }

        private C9811a() {
        }
    }

    /* renamed from: b */
    private final void m28273b(C9981eb ebVar) {
        if (ebVar.mo64512e().length() > 0) {
            this.f24728b.mo64488a(ebVar.mo64512e());
        } else {
            C9943di.m28717a((C9942dh) new C9953dl("shown", ebVar));
        }
        C10084hg.m29312a(new C10083hf(ebVar.mo64503b(), "adDisplayed"));
        if (ebVar.mo64547y().mo64587a() && ebVar.mo64547y().mo64588b() == C9995eo.IMPRESSION_SOURCE_SDK) {
            C10084hg.m29312a(new C10083hf(ebVar.mo64503b(), "adImpression"));
        }
    }

    /* renamed from: a */
    public final void mo64291a(float f) {
        C9981eb ebVar = this.f24732f;
        if (ebVar != null && !this.f24731e && f >= 50.0f) {
            this.f24731e = true;
            C10263mq.m29874a("new impression: ", (Object) ebVar.mo64518g());
            C10327q qVar = this.f24733g;
            if (qVar != null) {
                qVar.mo64287a((C10328r) null);
            }
            m28273b(ebVar);
        }
    }
}
