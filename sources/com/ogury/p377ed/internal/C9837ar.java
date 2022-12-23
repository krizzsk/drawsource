package com.ogury.p377ed.internal;

import android.app.Activity;

/* renamed from: com.ogury.ed.internal.ar */
public final class C9837ar implements C9832am {

    /* renamed from: a */
    private final C9814ai f24810a;

    /* renamed from: b */
    private final Activity f24811b;

    /* renamed from: c */
    private final C9832am f24812c;

    /* renamed from: d */
    private final boolean f24813d;

    /* renamed from: e */
    private final String f24814e;

    /* renamed from: f */
    private final C9867bp f24815f;

    private C9837ar(C9814ai aiVar, Activity activity, C9832am amVar, boolean z, String str, C9867bp bpVar) {
        C10263mq.m29882b(activity, "interstitialActivity");
        C10263mq.m29882b(amVar, "closeCommandInCollapsedMode");
        C10263mq.m29882b(str, "adUnitId");
        C10263mq.m29882b(bpVar, "lastPositionManager");
        this.f24810a = aiVar;
        this.f24811b = activity;
        this.f24812c = amVar;
        this.f24813d = z;
        this.f24814e = str;
        this.f24815f = bpVar;
    }

    public /* synthetic */ C9837ar(C9814ai aiVar, Activity activity, C9832am amVar, boolean z, String str) {
        this(aiVar, activity, amVar, z, str, C9867bp.f24863a);
    }

    /* renamed from: a */
    public final void mo64282a(C10044g gVar, C9816aj ajVar) {
        C10263mq.m29882b(gVar, "adLayout");
        C10263mq.m29882b(ajVar, "adController");
        gVar.mo64736a(C9867bp.m28488a(this.f24814e, gVar));
        gVar.mo64735a();
        gVar.setupDrag(this.f24813d);
        C9814ai aiVar = this.f24810a;
        if (aiVar != null) {
            aiVar.mo64299a(gVar);
        }
        ajVar.mo64319g();
        this.f24811b.finish();
        ajVar.mo64311b(this.f24812c);
        ajVar.mo64304a((C9832am) new C9839at());
    }
}
