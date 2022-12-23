package com.ogury.p377ed.internal;

import android.app.Application;
import android.content.Context;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.OguryIntegrationLogger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.u */
public final class C10331u {

    /* renamed from: a */
    public static final C10332a f25655a = new C10332a((byte) 0);

    /* renamed from: b */
    private final Application f25656b;

    /* renamed from: c */
    private final C9835ap f25657c;

    /* renamed from: d */
    private C10044g f25658d;

    /* renamed from: e */
    private final C10342z f25659e;

    /* renamed from: f */
    private final C9804ab f25660f;

    /* renamed from: g */
    private C9816aj f25661g;

    /* renamed from: h */
    private boolean f25662h;

    /* renamed from: i */
    private FrameLayout f25663i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C10331u(android.app.Application r8, com.ogury.p377ed.internal.C9835ap r9) {
        /*
            r7 = this;
            r0 = r8
            android.content.Context r0 = (android.content.Context) r0
            com.ogury.ed.internal.g r4 = com.ogury.p377ed.internal.C10331u.C10332a.m30001a(r0)
            com.ogury.ed.internal.z r5 = new com.ogury.ed.internal.z
            r5.<init>(r9)
            com.ogury.ed.internal.ab r6 = new com.ogury.ed.internal.ab
            android.content.Context r0 = r8.getApplicationContext()
            java.lang.String r1 = "<init>"
            com.ogury.p377ed.internal.C10263mq.m29879a((java.lang.Object) r0, (java.lang.String) r1)
            r6.<init>(r4, r0)
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.internal.C10331u.<init>(android.app.Application, com.ogury.ed.internal.ap):void");
    }

    private C10331u(Application application, C9835ap apVar, C10044g gVar, C10342z zVar, C9804ab abVar) {
        C10263mq.m29882b(application, "application");
        C10263mq.m29882b(apVar, "interstitialShowCommand");
        C10263mq.m29882b(gVar, "adLayout");
        C10263mq.m29882b(zVar, "adControllerFactory");
        C10263mq.m29882b(abVar, "sizeCalculator");
        this.f25656b = application;
        this.f25657c = apVar;
        this.f25658d = gVar;
        this.f25659e = zVar;
        this.f25660f = abVar;
        this.f25661g = m29995c();
    }

    /* renamed from: com.ogury.ed.internal.u$a */
    public static final class C10332a {
        public /* synthetic */ C10332a(byte b) {
            this();
        }

        private C10332a() {
        }

        /* renamed from: a */
        public static C10044g m30001a(Context context) {
            C10263mq.m29882b(context, "context");
            C10044g gVar = new C10044g(context);
            gVar.setupDrag(false);
            return gVar;
        }
    }

    /* renamed from: com.ogury.ed.internal.u$b */
    public static final class C10333b implements C9832am {

        /* renamed from: a */
        final /* synthetic */ C10331u f25664a;

        C10333b(C10331u uVar) {
            this.f25664a = uVar;
        }

        /* renamed from: a */
        public final void mo64282a(C10044g gVar, C9816aj ajVar) {
            C10263mq.m29882b(gVar, "adLayout");
            C10263mq.m29882b(ajVar, "adController");
            this.f25664a.m29996d();
        }
    }

    /* renamed from: c */
    private final C9816aj m29995c() {
        C9816aj a = this.f25659e.mo65181a(this.f25656b, this.f25658d);
        a.mo64311b((C9832am) new C10333b(this));
        a.mo64305a((C9840au) new C9806ad(new C10334c(this)));
        a.mo64304a((C9832am) new C9803aa());
        return a;
    }

    /* renamed from: com.ogury.ed.internal.u$c */
    /* synthetic */ class C10334c extends C10262mp implements C10239lv<C9981eb, List<C9981eb>, C10182ke> {
        C10334c(Object obj) {
            super(2, obj, C10331u.class, "showNextAd", "showNextAd(Lio/presage/common/network/models/Ad;Ljava/util/List;)V");
        }

        /* renamed from: a */
        private void m30003a(C9981eb ebVar, List<C9981eb> list) {
            C10263mq.m29882b(ebVar, "p0");
            C10263mq.m29882b(list, "p1");
            ((C10331u) this.f25588a).m29992a(ebVar, list);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64398a(Object obj, Object obj2) {
            m30003a((C9981eb) obj, (List<C9981eb>) (List) obj2);
            return C10182ke.f25542a;
        }
    }

    /* renamed from: a */
    public final void mo65167a(FrameLayout frameLayout, List<C9981eb> list) {
        C10263mq.m29882b(frameLayout, "bannerView");
        C10263mq.m29882b(list, CampaignUnit.JSON_KEY_ADS);
        this.f25663i = frameLayout;
        try {
            C9981eb remove = list.remove(0);
            C9903cm.m28600a(list);
            if (remove.mo64543u()) {
                this.f25657c.mo64361a(this.f25656b, remove, new ArrayList());
                if (!list.isEmpty()) {
                    m29991a(list.remove(0), frameLayout, list, true);
                    return;
                }
                return;
            }
            m29991a(remove, frameLayout, list, false);
        } catch (Throwable unused) {
            mo65170b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m29992a(C9981eb ebVar, List<C9981eb> list) {
        C10044g a = C10332a.m30001a(this.f25656b);
        this.f25658d = a;
        this.f25660f.mo64284a(a);
        this.f25661g = m29995c();
        m29991a(ebVar, this.f25663i, list, false);
    }

    /* renamed from: a */
    private final void m29991a(C9981eb ebVar, FrameLayout frameLayout, List<C9981eb> list, boolean z) {
        if (frameLayout != null) {
            C9816aj ajVar = this.f25661g;
            if (ajVar != null) {
                ajVar.mo64306a(ebVar, list);
            }
            this.f25662h = ebVar.mo64546x().mo64585a();
            frameLayout.addView(this.f25658d);
            OguryIntegrationLogger.m28105d("[Ads][" + ebVar.mo64545w().mo64569b() + "][show][" + ebVar.mo64530m().mo64573a() + "] Ad succefully attached to the banner view");
            OguryIntegrationLogger.m28105d("[Ads][" + ebVar.mo64545w().mo64569b() + "][show][" + ebVar.mo64530m().mo64573a() + "] Waiting for adding banner view in a layout...");
            m29990a(frameLayout, z);
        }
    }

    /* renamed from: a */
    private final void m29990a(FrameLayout frameLayout, boolean z) {
        C9816aj ajVar;
        if ((!frameLayout.hasWindowFocus() || z) && (ajVar = this.f25661g) != null) {
            ajVar.mo64327o();
        }
    }

    /* renamed from: a */
    public final void mo65168a(C9905cn cnVar) {
        C10263mq.m29882b(cnVar, "adSize");
        C9816aj ajVar = this.f25661g;
        this.f25660f.mo64283a(cnVar, this.f25662h, ajVar == null ? false : ajVar.mo64322j());
    }

    /* renamed from: a */
    public final boolean mo65169a() {
        C9816aj ajVar = this.f25661g;
        if (ajVar == null) {
            return false;
        }
        return ajVar.mo64336x();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m29996d() {
        this.f25658d.mo64735a();
        C9816aj ajVar = this.f25661g;
        if (ajVar != null) {
            ajVar.mo64323k();
        }
        this.f25661g = null;
    }

    /* renamed from: b */
    public final void mo65170b() {
        C9816aj ajVar = this.f25661g;
        if (ajVar != null) {
            if (ajVar.mo64336x()) {
                ajVar.mo64337y();
                ajVar.mo64316d();
            } else {
                ajVar.mo64335w();
            }
            ajVar.mo64324l();
        }
    }
}
