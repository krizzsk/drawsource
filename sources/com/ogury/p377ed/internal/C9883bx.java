package com.ogury.p377ed.internal;

import android.app.Activity;
import android.content.Context;
import com.ogury.p377ed.internal.C9894cg;

/* renamed from: com.ogury.ed.internal.bx */
public final class C9883bx {

    /* renamed from: a */
    private final C9891cd f24912a;

    /* renamed from: b */
    private final C9901ck f24913b;

    /* renamed from: c */
    private final C9902cl f24914c;

    /* renamed from: d */
    private final C10029fn f24915d;

    public C9883bx(C9891cd cdVar, C9901ck ckVar, C9902cl clVar, C10029fn fnVar) {
        C10263mq.m29882b(cdVar, "publisherActivityFilter");
        C10263mq.m29882b(ckVar, "publisherFragmentFilter");
        C10263mq.m29882b(clVar, "supportLibraryChecker");
        C10263mq.m29882b(fnVar, "profigGateway");
        this.f24912a = cdVar;
        this.f24913b = ckVar;
        this.f24914c = clVar;
        this.f24915d = fnVar;
    }

    public /* synthetic */ C9883bx(C9891cd cdVar, C9901ck ckVar) {
        this(cdVar, ckVar, C9902cl.f24945a, C10029fn.f25239a);
    }

    /* renamed from: a */
    public final C9882bw mo64417a(Activity activity, C10044g gVar, C9816aj ajVar) {
        C10022fh fhVar;
        C10263mq.m29882b(activity, "activity");
        C10263mq.m29882b(gVar, "adLayout");
        C10263mq.m29882b(ajVar, "adController");
        C9876bu buVar = new C9876bu(gVar, ajVar);
        C10028fm a = C10029fn.m29114a((Context) activity);
        C10024fj fjVar = null;
        if (a == null) {
            fhVar = null;
        } else {
            fhVar = a.mo64720n();
        }
        if (fhVar == null) {
            fhVar = new C10022fh();
        }
        if (a != null) {
            fjVar = a.mo64721o();
        }
        if (fjVar == null) {
            fjVar = new C10024fj();
        }
        new C9866bo();
        C9869bq a2 = C9866bo.m28486a(activity, this.f24912a, fhVar);
        C9894cg.C9895a aVar = C9894cg.f24929a;
        C9894cg a3 = C9894cg.C9895a.m28575a(activity, fjVar, this.f24913b);
        if (this.f24913b.mo64440c() || !fjVar.mo64670a()) {
            return new C9870br(activity, buVar, a2);
        }
        if (C9902cl.m28597a()) {
            return new C9898cj(activity, buVar, new C9897ci(a3));
        }
        C10046ga gaVar = C10046ga.f25280a;
        C10046ga.m29181a("Fragment filter defined for thumbnail but no fragment dependency found. Only AndroidX is supported");
        return new C9870br(activity, buVar, a2);
    }
}
