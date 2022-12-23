package com.ogury.p377ed.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.List;
import p401io.presage.interstitial.p402ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.gv */
public final class C10069gv {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final InterstitialActivity f25291a;

    /* renamed from: b */
    private final Intent f25292b;

    /* renamed from: c */
    private final C9981eb f25293c;

    /* renamed from: d */
    private final List<C9981eb> f25294d;

    /* renamed from: e */
    private final C10068gu f25295e;

    /* renamed from: f */
    private final C9842aw f25296f;

    /* renamed from: g */
    private C10044g f25297g;

    /* renamed from: h */
    private C9816aj f25298h;

    private C10069gv(InterstitialActivity interstitialActivity, Intent intent, C9981eb ebVar, List<C9981eb> list, C10068gu guVar, C9842aw awVar) {
        C10263mq.m29882b(interstitialActivity, "activity");
        C10263mq.m29882b(intent, SDKConstants.PARAM_INTENT);
        C10263mq.m29882b(ebVar, "ad");
        C10263mq.m29882b(list, CampaignUnit.JSON_KEY_ADS);
        C10263mq.m29882b(guVar, "adControllerFactory");
        C10263mq.m29882b(awVar, "expandCacheStore");
        this.f25291a = interstitialActivity;
        this.f25292b = intent;
        this.f25293c = ebVar;
        this.f25294d = list;
        this.f25295e = guVar;
        this.f25296f = awVar;
        int intExtra = intent.getIntExtra("mode", 0);
        if (intExtra == 0) {
            m29235c();
        } else if (intExtra == 1) {
            m29236d();
        } else {
            throw new IllegalStateException(C10263mq.m29874a("Wrong mode ", (Object) Integer.valueOf(intExtra)));
        }
        m29237e();
        m29238f();
    }

    public /* synthetic */ C10069gv(InterstitialActivity interstitialActivity, Intent intent, C9981eb ebVar, List list) {
        this(interstitialActivity, intent, ebVar, list, C10068gu.f25290a, C9842aw.f24821a);
    }

    /* renamed from: a */
    public final C10044g mo64791a() {
        C10044g gVar = this.f25297g;
        if (gVar != null) {
            return gVar;
        }
        C10263mq.m29880a("adLayout");
        return null;
    }

    /* renamed from: b */
    public final C9816aj mo64792b() {
        C9816aj ajVar = this.f25298h;
        if (ajVar != null) {
            return ajVar;
        }
        C10263mq.m29880a("adController");
        return null;
    }

    /* renamed from: c */
    private final void m29235c() {
        Context applicationContext = this.f25291a.getApplicationContext();
        C10263mq.m29879a((Object) applicationContext, "activity.applicationContext");
        C10044g gVar = new C10044g(applicationContext);
        this.f25297g = gVar;
        InterstitialActivity interstitialActivity = this.f25291a;
        C9816aj ajVar = null;
        if (gVar == null) {
            C10263mq.m29880a("adLayout");
            gVar = null;
        }
        C9816aj a = C10068gu.m29233a(interstitialActivity, gVar, new C9834ao(this.f25293c.mo64545w(), InterstitialActivity.f29814a));
        this.f25298h = a;
        if (a == null) {
            C10263mq.m29880a("adController");
            a = null;
        }
        a.mo64305a((C9840au) new C10073gx());
        boolean a2 = this.f25293c.mo64528l().mo64599a();
        String a3 = this.f25293c.mo64530m().mo64573a();
        C9816aj ajVar2 = this.f25298h;
        if (ajVar2 == null) {
            C10263mq.m29880a("adController");
            ajVar2 = null;
        }
        Application application = this.f25291a.getApplication();
        C10263mq.m29879a((Object) application, "activity.application");
        ajVar2.mo64304a((C9832am) new C9837ar(new C9814ai(application), this.f25291a, new C9833an(), a2, a3));
        C9816aj ajVar3 = this.f25298h;
        if (ajVar3 == null) {
            C10263mq.m29880a("adController");
        } else {
            ajVar = ajVar3;
        }
        ajVar.mo64306a(this.f25293c, this.f25294d);
    }

    /* renamed from: d */
    private final void m29236d() {
        C9814ai aiVar;
        C9841av a = C9842aw.m28409a(this.f25292b.getStringExtra("expand_cache_item_id"));
        if (a != null) {
            this.f25297g = a.mo64365c();
            this.f25298h = a.mo64366d();
            C10044g gVar = null;
            if (C9992el.m28924a(this.f25293c)) {
                Application application = this.f25291a.getApplication();
                C10263mq.m29879a((Object) application, "activity.application");
                aiVar = new C9814ai(application);
            } else {
                aiVar = null;
            }
            if (a.mo64363a().mo64572e()) {
                C9816aj ajVar = this.f25298h;
                if (ajVar == null) {
                    C10263mq.m29880a("adController");
                    ajVar = null;
                }
                FrameLayout b = a.mo64364b();
                Activity activity = this.f25291a;
                C9816aj ajVar2 = this.f25298h;
                if (ajVar2 == null) {
                    C10263mq.m29880a("adController");
                    ajVar2 = null;
                }
                ajVar.mo64304a((C9832am) new C9836aq(b, activity, ajVar2.mo64310b()));
            } else {
                C9816aj ajVar3 = this.f25298h;
                if (ajVar3 == null) {
                    C10263mq.m29880a("adController");
                    ajVar3 = null;
                }
                Activity activity2 = this.f25291a;
                C9816aj ajVar4 = this.f25298h;
                if (ajVar4 == null) {
                    C10263mq.m29880a("adController");
                    ajVar4 = null;
                }
                ajVar3.mo64304a((C9832am) new C9837ar(aiVar, activity2, ajVar4.mo64310b(), this.f25293c.mo64528l().mo64599a(), this.f25293c.mo64530m().mo64573a()));
            }
            C10044g gVar2 = this.f25297g;
            if (gVar2 == null) {
                C10263mq.m29880a("adLayout");
            } else {
                gVar = gVar2;
            }
            gVar.mo64740d();
            return;
        }
        throw new IllegalStateException("Cache Item not found");
    }

    /* renamed from: com.ogury.ed.internal.gv$b */
    public static final class C10071b implements C9832am {

        /* renamed from: a */
        final /* synthetic */ C10069gv f25301a;

        C10071b(C10069gv gvVar) {
            this.f25301a = gvVar;
        }

        /* renamed from: a */
        public final void mo64282a(C10044g gVar, C9816aj ajVar) {
            C10263mq.m29882b(gVar, "adLayout");
            C10263mq.m29882b(ajVar, "adController");
            this.f25301a.f25291a.mo72541a(ajVar.mo64318f());
        }
    }

    /* renamed from: e */
    private final void m29237e() {
        C9816aj ajVar = this.f25298h;
        if (ajVar == null) {
            C10263mq.m29880a("adController");
            ajVar = null;
        }
        ajVar.mo64313c((C9832am) new C10071b(this));
    }

    /* renamed from: f */
    private final void m29238f() {
        C9832am amVar;
        C9816aj ajVar = null;
        if (!C9992el.m28924a(this.f25293c)) {
            C9816aj ajVar2 = this.f25298h;
            if (ajVar2 == null) {
                C10263mq.m29880a("adController");
                ajVar2 = null;
            }
            amVar = ajVar2.mo64310b();
        } else {
            amVar = null;
        }
        C9816aj ajVar3 = this.f25298h;
        if (ajVar3 == null) {
            C10263mq.m29880a("adController");
        } else {
            ajVar = ajVar3;
        }
        ajVar.mo64311b((C9832am) new C10070a(amVar, this));
    }

    /* renamed from: com.ogury.ed.internal.gv$a */
    public static final class C10070a implements C9832am {

        /* renamed from: a */
        final /* synthetic */ C9832am f25299a;

        /* renamed from: b */
        final /* synthetic */ C10069gv f25300b;

        C10070a(C9832am amVar, C10069gv gvVar) {
            this.f25299a = amVar;
            this.f25300b = gvVar;
        }

        /* renamed from: a */
        public final void mo64282a(C10044g gVar, C9816aj ajVar) {
            C10263mq.m29882b(gVar, "adLayout");
            C10263mq.m29882b(ajVar, "adController");
            C9832am amVar = this.f25299a;
            if (amVar != null) {
                amVar.mo64282a(gVar, ajVar);
            }
            this.f25300b.f25291a.finish();
        }
    }
}
