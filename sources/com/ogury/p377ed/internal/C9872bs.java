package com.ogury.p377ed.internal;

import android.app.Activity;
import android.app.Application;
import android.graphics.Rect;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.bs */
public final class C9872bs {

    /* renamed from: a */
    private final Application f24879a;

    /* renamed from: b */
    private final C9883bx f24880b;

    /* renamed from: c */
    private final C9835ap f24881c;

    /* renamed from: d */
    private C9882bw f24882d;

    /* renamed from: e */
    private C10044g f24883e;

    /* renamed from: f */
    private final C9884by f24884f;

    /* renamed from: g */
    private final C9867bp f24885g;

    /* renamed from: h */
    private C9816aj f24886h;

    /* renamed from: i */
    private C10146iz f24887i;

    /* renamed from: j */
    private Activity f24888j;

    private C9872bs(Application application, C9883bx bxVar, C9835ap apVar, C10044g gVar, C9884by byVar, C9867bp bpVar) {
        C10263mq.m29882b(application, "application");
        C10263mq.m29882b(bxVar, "overlayInjectorFactory");
        C10263mq.m29882b(apVar, "interstitialShowCommand");
        C10263mq.m29882b(gVar, "adLayout");
        C10263mq.m29882b(byVar, "mraidAdControllerFactory");
        C10263mq.m29882b(bpVar, "positionManager");
        this.f24879a = application;
        this.f24880b = bxVar;
        this.f24881c = apVar;
        this.f24882d = null;
        this.f24883e = gVar;
        this.f24884f = byVar;
        this.f24885g = bpVar;
        this.f24887i = new C10146iz();
        this.f24883e.setContainsOverlayAd(true);
        this.f24886h = m28513b();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C9872bs(android.app.Application r8, com.ogury.p377ed.internal.C9883bx r9, com.ogury.p377ed.internal.C9835ap r10) {
        /*
            r7 = this;
            com.ogury.ed.internal.g r4 = new com.ogury.ed.internal.g
            android.content.Context r0 = r8.getApplicationContext()
            java.lang.String r1 = "constructor(\n    private…Controller = null\n    }\n}"
            com.ogury.p377ed.internal.C10263mq.m29879a((java.lang.Object) r0, (java.lang.String) r1)
            r4.<init>(r0)
            com.ogury.ed.internal.by r5 = new com.ogury.ed.internal.by
            r5.<init>(r10)
            com.ogury.ed.internal.bp r6 = com.ogury.p377ed.internal.C9867bp.f24863a
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.internal.C9872bs.<init>(android.app.Application, com.ogury.ed.internal.bx, com.ogury.ed.internal.ap):void");
    }

    /* renamed from: b */
    private final C9816aj m28513b() {
        C9816aj a = this.f24884f.mo64418a(this.f24879a, this.f24883e);
        a.mo64304a((C9832am) new C9839at());
        a.mo64311b((C9832am) new C9873a(this));
        a.mo64305a((C9840au) new C9892ce(new C9874b(this)));
        return a;
    }

    /* renamed from: com.ogury.ed.internal.bs$a */
    public static final class C9873a implements C9832am {

        /* renamed from: a */
        final /* synthetic */ C9872bs f24889a;

        C9873a(C9872bs bsVar) {
            this.f24889a = bsVar;
        }

        /* renamed from: a */
        public final void mo64282a(C10044g gVar, C9816aj ajVar) {
            C10263mq.m29882b(gVar, "adLayout");
            C10263mq.m29882b(ajVar, "adController");
            this.f24889a.mo64396a();
        }
    }

    /* renamed from: com.ogury.ed.internal.bs$b */
    /* synthetic */ class C9874b extends C10262mp implements C10239lv<C9981eb, List<C9981eb>, C10182ke> {
        C9874b(Object obj) {
            super(2, obj, C9872bs.class, "showNextAd", "showNextAd(Lio/presage/common/network/models/Ad;Ljava/util/List;)V");
        }

        /* renamed from: a */
        private void m28517a(C9981eb ebVar, List<C9981eb> list) {
            C10263mq.m29882b(ebVar, "p0");
            C10263mq.m29882b(list, "p1");
            ((C9872bs) this.f25588a).m28510a(ebVar, list);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64398a(Object obj, Object obj2) {
            m28517a((C9981eb) obj, (List<C9981eb>) (List) obj2);
            return C10182ke.f25542a;
        }
    }

    /* renamed from: a */
    public final void mo64397a(Activity activity, int i, int i2, List<C9981eb> list) {
        C10263mq.m29882b(activity, "activity");
        C10263mq.m29882b(list, CampaignUnit.JSON_KEY_ADS);
        this.f24888j = activity;
        try {
            C9981eb remove = list.remove(0);
            C9903cm.m28600a(list);
            this.f24887i.mo64950c(C10054gi.m29196b(i));
            this.f24887i.mo64952d(C10054gi.m29196b(i2));
            if (remove.mo64543u()) {
                this.f24881c.mo64361a(this.f24879a, remove, new ArrayList());
                if (!list.isEmpty()) {
                    m28511a(list.remove(0), list, activity, false);
                    return;
                }
                return;
            }
            m28511a(remove, list, activity, true);
        } catch (Throwable unused) {
            mo64396a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m28510a(C9981eb ebVar, List<C9981eb> list) {
        Activity activity = this.f24888j;
        if (activity != null) {
            C10044g gVar = new C10044g(this.f24879a);
            this.f24883e = gVar;
            gVar.setContainsOverlayAd(true);
            this.f24886h = m28513b();
            m28511a(ebVar, list, activity, true);
        }
    }

    /* renamed from: a */
    private final void m28511a(C9981eb ebVar, List<C9981eb> list, Activity activity, boolean z) {
        C9882bw bwVar;
        C9882bw bwVar2 = this.f24882d;
        if (bwVar2 != null) {
            bwVar2.mo64395d();
        }
        C9816aj ajVar = this.f24886h;
        if (ajVar != null) {
            this.f24882d = this.f24880b.mo64417a(activity, this.f24883e, ajVar);
            String a = ebVar.mo64530m().mo64573a();
            C9867bp.m28490a(this.f24883e, a);
            m28512a(a);
            ajVar.mo64306a(ebVar, list);
            if (z && (bwVar = this.f24882d) != null) {
                bwVar.mo64394c();
            }
            C9882bw bwVar3 = this.f24882d;
            if (bwVar3 != null) {
                bwVar3.mo64393b();
            }
        }
    }

    /* renamed from: a */
    private final void m28512a(String str) {
        Rect a = C9867bp.m28487a(str);
        if (a != null) {
            this.f24887i.mo64950c(a.left);
            this.f24887i.mo64952d(a.top);
        }
        C9816aj ajVar = this.f24886h;
        if (ajVar != null) {
            ajVar.mo64303a(this.f24887i.mo64951d(), this.f24887i.mo64953e());
        }
    }

    /* renamed from: a */
    public final void mo64396a() {
        C9882bw bwVar = this.f24882d;
        if (bwVar != null) {
            bwVar.mo64395d();
        }
        this.f24882d = null;
        this.f24883e.mo64735a();
        C9816aj ajVar = this.f24886h;
        if (ajVar != null) {
            ajVar.mo64323k();
        }
        this.f24886h = null;
    }
}
