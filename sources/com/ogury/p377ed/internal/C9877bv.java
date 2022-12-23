package com.ogury.p377ed.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p377ed.internal.C9887ca;
import com.ogury.p377ed.internal.C9918cw;
import java.util.Iterator;
import java.util.List;
import p401io.presage.common.AdConfig;
import p401io.presage.interstitial.p402ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.bv */
public final class C9877bv {

    /* renamed from: a */
    private final Context f24894a;

    /* renamed from: b */
    private final C9875bt f24895b;

    /* renamed from: c */
    private final C10244m f24896c;

    /* renamed from: d */
    private final C9891cd f24897d;

    /* renamed from: e */
    private final C9901ck f24898e;

    /* renamed from: f */
    private final C10029fn f24899f;

    /* renamed from: g */
    private final C9887ca.C9888a f24900g;

    /* renamed from: h */
    private C10076h f24901h;

    /* renamed from: i */
    private C10177k f24902i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C9872bs f24903j;

    /* renamed from: k */
    private C10204l f24904k;

    private C9877bv(Context context, C9875bt btVar, C10244m mVar, C9891cd cdVar, C9901ck ckVar, C10029fn fnVar, C9887ca.C9888a aVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(btVar, "adControllerFactory");
        C10263mq.m29882b(mVar, "adsSourceFactory");
        C10263mq.m29882b(cdVar, "publisherActivityFilter");
        C10263mq.m29882b(ckVar, "publisherFragmentFilter");
        C10263mq.m29882b(fnVar, "profigGateway");
        C10263mq.m29882b(aVar, "positionCalculatorFactory");
        this.f24894a = context;
        this.f24895b = btVar;
        this.f24896c = mVar;
        this.f24897d = cdVar;
        this.f24898e = ckVar;
        this.f24899f = fnVar;
        this.f24900g = aVar;
    }

    private /* synthetic */ C9877bv(Context context, C9875bt btVar, C10244m mVar) {
        this(context, btVar, mVar, new C9891cd(), new C9901ck(), C10029fn.f25239a, C9887ca.f24920a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C9877bv(Context context, AdConfig adConfig) {
        this(context, new C9875bt(InterstitialActivity.f29814a), new C10244m(context, adConfig, C9989ej.OVERLAY_THUMBNAIL));
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(adConfig, "adConfig");
    }

    /* renamed from: a */
    public final void mo64407a(String str) {
        C10263mq.m29882b(str, "campaignId");
        this.f24896c.mo65125a(str);
    }

    /* renamed from: b */
    public final void mo64413b(String str) {
        C10263mq.m29882b(str, "creativeId");
        this.f24896c.mo65126b(str);
    }

    /* renamed from: a */
    public final boolean mo64410a() {
        C10204l lVar = this.f24904k;
        if (lVar == null) {
            return false;
        }
        return lVar.mo65096a();
    }

    /* renamed from: a */
    public final void mo64405a(C10076h hVar) {
        OguryIntegrationLogger.m28105d("[Ads][Thumbnail] Registering to ad listener");
        if (hVar == null) {
            OguryIntegrationLogger.m28105d("[Ads][Thumbnail] Ad listener is null");
        }
        this.f24901h = hVar;
        C10204l lVar = this.f24904k;
        if (lVar != null) {
            lVar.mo65091a(hVar);
        }
    }

    /* renamed from: a */
    public final void mo64406a(C10177k kVar) {
        this.f24902i = kVar;
        C10204l lVar = this.f24904k;
        if (lVar != null) {
            lVar.mo65092a(kVar);
        }
    }

    /* renamed from: com.ogury.ed.internal.bv$b */
    static final class C9879b extends C10264mr implements C10228lk<C10001eu, C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C9877bv f24906a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9879b(C9877bv bvVar) {
            super(1);
            this.f24906a = bvVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m28545a((C10001eu) obj);
            return C10182ke.f25542a;
        }

        /* renamed from: a */
        private void m28545a(C10001eu euVar) {
            C10263mq.m29882b(euVar, "it");
            this.f24906a.mo64402a(euVar.mo64609d(), euVar.mo64611e());
        }
    }

    /* renamed from: b */
    public final void mo64411b() {
        m28528d().mo64451b(new C9879b(this));
    }

    /* renamed from: a */
    public final void mo64402a(int i, int i2) {
        C10204l lVar = this.f24904k;
        boolean z = true;
        if (lVar == null || !lVar.mo65099c()) {
            z = false;
        }
        if (z) {
            C9872bs bsVar = this.f24903j;
            if (bsVar != null) {
                bsVar.mo64396a();
            }
            C10204l lVar2 = this.f24904k;
            if (lVar2 != null) {
                lVar2.mo65101e();
            }
        }
        m28527c();
        m28526b(i, i2);
        C10204l lVar3 = this.f24904k;
        if (lVar3 != null) {
            lVar3.mo65100d();
        }
    }

    /* renamed from: b */
    private final void m28526b(int i, int i2) {
        C10204l a = this.f24896c.mo65124a();
        this.f24904k = a;
        if (a != null) {
            a.mo65091a(this.f24901h);
        }
        C10204l lVar = this.f24904k;
        if (lVar != null) {
            lVar.mo65092a(this.f24902i);
        }
        C10204l lVar2 = this.f24904k;
        if (lVar2 != null) {
            lVar2.mo65090a(new C9999es(i, i2));
        }
    }

    /* renamed from: c */
    private final void m28527c() {
        C9875bt btVar = this.f24895b;
        Context applicationContext = this.f24894a.getApplicationContext();
        if (applicationContext != null) {
            this.f24903j = btVar.mo64399a((Application) applicationContext, this.f24897d, this.f24898e);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
    }

    /* renamed from: com.ogury.ed.internal.bv$c */
    static final class C9880c extends C10264mr implements C10228lk<C10001eu, C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C9877bv f24907a;

        /* renamed from: b */
        final /* synthetic */ Activity f24908b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9880c(C9877bv bvVar, Activity activity) {
            super(1);
            this.f24907a = bvVar;
            this.f24908b = activity;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m28547a((C10001eu) obj);
            return C10182ke.f25542a;
        }

        /* renamed from: a */
        private void m28547a(C10001eu euVar) {
            C10263mq.m29882b(euVar, "it");
            this.f24907a.mo64404a(this.f24908b, new C9885bz(euVar.mo64603a(), euVar.mo64605b(), euVar.mo64607c()));
        }
    }

    /* renamed from: a */
    public final void mo64403a(Activity activity) {
        C10263mq.m29882b(activity, "activity");
        m28528d().mo64451b(new C9880c(this, activity));
    }

    /* renamed from: com.ogury.ed.internal.bv$a */
    static final class C9878a extends C10264mr implements C10227lj<C10001eu> {

        /* renamed from: a */
        final /* synthetic */ C9877bv f24905a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9878a(C9877bv bvVar) {
            super(0);
            this.f24905a = bvVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            return m28543b();
        }

        /* renamed from: b */
        private static C10001eu m28543b() {
            C10028fm a = C10029fn.m29113a();
            C10001eu p = a == null ? null : a.mo64722p();
            return p == null ? new C10001eu() : p;
        }
    }

    /* renamed from: d */
    private final C9918cw<C10001eu> m28528d() {
        C9918cw.C9919a aVar = C9918cw.f24963a;
        return C9918cw.C9919a.m28640a(new C9878a(this));
    }

    /* renamed from: a */
    public final void mo64404a(Activity activity, C9885bz bzVar) {
        C10263mq.m29882b(activity, "activity");
        C10263mq.m29882b(bzVar, "overlayPosition");
        if (this.f24904k == null) {
            OguryIntegrationLogger.m28106e("[Ads][Thumbnail][show] Failed to show (no ad loaded)");
            C10076h hVar = this.f24901h;
            if (hVar != null) {
                hVar.mo64633e();
            }
        }
        C10204l lVar = this.f24904k;
        if (lVar != null) {
            lVar.mo65094a((C10330t) new C9881d(this, activity, bzVar));
        }
    }

    /* renamed from: com.ogury.ed.internal.bv$d */
    public static final class C9881d implements C10330t {

        /* renamed from: a */
        final /* synthetic */ C9877bv f24909a;

        /* renamed from: b */
        final /* synthetic */ Activity f24910b;

        /* renamed from: c */
        final /* synthetic */ C9885bz f24911c;

        C9881d(C9877bv bvVar, Activity activity, C9885bz bzVar) {
            this.f24909a = bvVar;
            this.f24910b = activity;
            this.f24911c = bzVar;
        }

        /* renamed from: a */
        public final void mo64416a(Context context, List<C9981eb> list) {
            C10263mq.m29882b(context, "context");
            C10263mq.m29882b(list, CampaignUnit.JSON_KEY_ADS);
            C10000et a = C9877bv.m28525b(list);
            C9887ca a2 = C9887ca.C9888a.m28561a(this.f24910b);
            int a3 = a2.mo64425a(this.f24911c, a);
            int b = a2.mo64426b(this.f24911c, a);
            C9872bs a4 = this.f24909a.f24903j;
            if (a4 != null) {
                a4.mo64397a(this.f24910b, a3, b, list);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C10000et m28525b(List<C9981eb> list) {
        C10000et etVar;
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            etVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((C9981eb) obj).mo64543u()) {
                break;
            }
        }
        C9981eb ebVar = (C9981eb) obj;
        if (ebVar != null) {
            etVar = ebVar.mo64528l();
        }
        return etVar == null ? new C10000et() : etVar;
    }

    /* renamed from: a */
    public final void mo64409a(String[] strArr) {
        C10263mq.m29882b(strArr, "packages");
        this.f24897d.mo64430a(C10184kg.m29750b(strArr));
    }

    /* renamed from: a */
    public final void mo64408a(Class<? extends Activity>[] clsArr) {
        C10263mq.m29882b(clsArr, "activities");
        this.f24897d.mo64432b(C10184kg.m29750b(clsArr));
    }

    /* renamed from: b */
    public final void mo64415b(String[] strArr) {
        C10263mq.m29882b(strArr, "packages");
        this.f24898e.mo64437a(C10184kg.m29746a(strArr));
    }

    /* renamed from: b */
    public final void mo64414b(Class<? extends Object>[] clsArr) {
        C10263mq.m29882b(clsArr, "fragments");
        this.f24898e.mo64439b(C10184kg.m29746a(clsArr));
    }

    /* renamed from: b */
    public final void mo64412b(Activity activity) {
        C10263mq.m29882b(activity, "activity");
        C9893cf cfVar = C9893cf.f24926a;
        C9893cf.m28571a(activity, this.f24897d, this.f24898e);
    }
}
