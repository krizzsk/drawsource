package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.measurement.C4401a;
import com.fyber.inneractive.sdk.measurement.C4405d;
import com.fyber.inneractive.sdk.measurement.C4408g;
import com.fyber.inneractive.sdk.measurement.C4409h;
import com.fyber.inneractive.sdk.measurement.C4410i;
import com.fyber.inneractive.sdk.measurement.C4411j;
import com.fyber.inneractive.sdk.model.vast.C4420b;
import com.fyber.inneractive.sdk.model.vast.C4435q;
import com.fyber.inneractive.sdk.player.C4530a;
import com.fyber.inneractive.sdk.player.C5008f;
import com.fyber.inneractive.sdk.player.C5013g;
import com.fyber.inneractive.sdk.player.C5015i;
import com.fyber.inneractive.sdk.response.C5235g;
import com.fyber.inneractive.sdk.response.C5237i;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.flow.i */
public class C4360i extends C4348c<C5235g, C4392y> implements C5015i.C5017b {

    /* renamed from: h */
    public C5015i f10711h;

    public C4360i(String str) {
    }

    /* renamed from: a */
    public void mo24491a() {
        this.f10711h.mo25602a();
    }

    /* renamed from: b */
    public String mo24296b() {
        return "send_failed_vast_creatives";
    }

    /* renamed from: d */
    public void mo24496d() {
        super.mo24496d();
    }

    /* renamed from: e */
    public void mo24297e() {
        C4420b bVar;
        AdSessionConfiguration adSessionConfiguration;
        C4420b bVar2;
        IAlog.m16446a(IAlog.m16443a((Object) this) + "start called", new Object[0]);
        Content yVar = new C4392y(mo24495c(), this.f10674f, (C5235g) this.f10670b, this.f10669a);
        this.f10671c = yVar;
        C5235g gVar = (C5235g) this.f10670b;
        C5015i iVar = new C5015i(gVar, this.f10669a, yVar, this);
        this.f10711h = iVar;
        C4392y yVar2 = (C4392y) this.f10671c;
        yVar2.f10797g = iVar;
        yVar2.f10717f = this.f10675g;
        AdSessionContext adSessionContext = null;
        iVar.f13373e = null;
        if (!(gVar == null || (bVar2 = gVar.f13893C) == null)) {
            iVar.f13373e = bVar2.f10862d.poll();
        }
        if (iVar.f13373e == null) {
            iVar.mo25605b();
            C5015i.C5017b bVar3 = iVar.f13372d;
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR);
            C4360i iVar2 = (C4360i) bVar3;
            iVar2.mo24493a((InneractiveError) inneractiveInfrastructureError);
            iVar2.mo24494a(inneractiveInfrastructureError);
            return;
        }
        iVar.mo25608e();
        C4530a.C4531a aVar = iVar.f13374f;
        if (aVar != null) {
            C5008f fVar = (C5008f) aVar;
            C4401a aVar2 = fVar.f11211h;
            if (aVar2 != null) {
                C4408g gVar2 = new C4408g();
                List<C4410i> list = fVar.f13362x.f10863e;
                C4392y yVar3 = fVar.f11209f;
                try {
                    CreativeType creativeType = CreativeType.VIDEO;
                    ImpressionType impressionType = ImpressionType.UNSPECIFIED;
                    Owner owner = Owner.NATIVE;
                    adSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
                } catch (Throwable th) {
                    gVar2.mo24588a(th);
                }
                List<VerificationScriptResource> a = gVar2.mo24587a(list);
                if (!(((C4405d) aVar2).f10804c == null || ((C4405d) aVar2).f10803b == null)) {
                    try {
                        adSessionContext = AdSessionContext.createNativeAdSessionContext(((C4405d) aVar2).f10804c, ((C4405d) aVar2).f10803b, a, "", "");
                    } catch (Throwable th2) {
                        gVar2.mo24588a(th2);
                    }
                }
                AdSession createAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
                gVar2.f10812a = createAdSession;
                gVar2.f10813b = AdEvents.createAdEvents(createAdSession);
                gVar2.f10814c = MediaEvents.createMediaEvents(gVar2.f10812a);
                gVar2.f10812a.start();
                gVar2.f10817f = yVar3;
                fVar.f11212i = gVar2;
                fVar.f11213j = new C5013g(gVar2);
            }
            if (fVar.f11212i == null && (bVar = fVar.f13362x) != null) {
                for (C4410i next : bVar.f10863e) {
                    C4411j jVar = C4411j.ERROR_DURING_RESOURCE_LOAD;
                    C4435q qVar = C4435q.EVENT_VERIFICATION_NOT_EXECUTED;
                    C5008f.m15180a((C5237i) new C4409h(next, next.mo24589a(qVar), jVar), qVar);
                }
            }
        }
        iVar.mo25607d();
    }
}
