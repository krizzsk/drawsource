package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.bidder.adm.C4168e;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4219a;
import com.fyber.inneractive.sdk.config.global.C4220b;
import com.fyber.inneractive.sdk.config.global.C4243k;
import com.fyber.inneractive.sdk.config.global.C4244l;
import com.fyber.inneractive.sdk.config.global.C4249q;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.config.global.features.C4229e;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.factories.C4339b;
import com.fyber.inneractive.sdk.flow.C4350e;
import com.fyber.inneractive.sdk.flow.C4353f;
import com.fyber.inneractive.sdk.flow.C4365m;
import com.fyber.inneractive.sdk.network.C4500m;
import com.fyber.inneractive.sdk.network.C4502n;
import com.fyber.inneractive.sdk.network.C4521u;
import com.fyber.inneractive.sdk.response.C5229a;
import com.fyber.inneractive.sdk.response.C5230b;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.b */
public class C4165b implements C4521u<C5233e> {

    /* renamed from: a */
    public final /* synthetic */ C4168e.C4169a f10228a;

    /* renamed from: b */
    public final /* synthetic */ C4168e f10229b;

    public C4165b(C4168e eVar, C4168e.C4169a aVar) {
        this.f10229b = eVar;
        this.f10228a = aVar;
    }

    /* renamed from: a */
    public void mo24154a(Object obj, Exception exc, boolean z) {
        int i;
        C4249q a;
        C4220b bVar;
        C4243k kVar;
        C4244l lVar;
        C4249q a2;
        C5233e eVar = (C5233e) obj;
        C5233e eVar2 = null;
        if (exc == null) {
            C4168e.C4169a aVar = this.f10228a;
            if (aVar != null) {
                C4365m.C4366a aVar2 = (C4365m.C4366a) aVar;
                C4251s sVar = new C4251s();
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = aVar2.f10743a.f10232a;
                if (admParametersOuterClass$AdmParameters != null) {
                    List<AdmParametersOuterClass$AdmParameters.Experiment> abExperimentsList = admParametersOuterClass$AdmParameters.getAbExperimentsList();
                    C4219a aVar3 = IAConfigManager.f10324J.f10360z;
                    aVar3.getClass();
                    for (C4229e next : sVar.f10454c.values()) {
                        if (!(next == null || (lVar = aVar3.f10410a) == null || (a2 = lVar.mo24257a(next.f10424b)) == null)) {
                            next.f10449a = a2.f10449a;
                        }
                    }
                    if (abExperimentsList != null && abExperimentsList.size() > 0) {
                        C4219a aVar4 = IAConfigManager.f10324J.f10360z;
                        aVar4.f10411b = sVar;
                        for (C4229e next2 : sVar.f10454c.values()) {
                            for (AdmParametersOuterClass$AdmParameters.Experiment next3 : abExperimentsList) {
                                String identifier = next3.getIdentifier();
                                String variant = next3.getVariant();
                                C4244l lVar2 = aVar4.f10410a;
                                if (!(lVar2 == null || (a = lVar2.mo24257a(next2.f10424b)) == null || (bVar = a.f10451c.get(identifier)) == null)) {
                                    Iterator<C4243k> it = bVar.f10414c.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            kVar = null;
                                            break;
                                        }
                                        kVar = it.next();
                                        if (kVar.f10445b.equals(variant)) {
                                            break;
                                        }
                                    }
                                    next2.f10425c.add(bVar);
                                    if (kVar != null) {
                                        next2.f10426d.put(bVar.f10412a, kVar);
                                    }
                                }
                            }
                        }
                    }
                }
                C4365m mVar = C4365m.this;
                C4353f fVar = mVar.f10742l;
                String str = mVar.f10731a;
                C4350e.C4352b bVar2 = mVar.f10734d;
                fVar.f10680e = null;
                fVar.f10679d = bVar2;
                if (IAConfigManager.m13181g()) {
                    fVar.f10681f = sVar;
                    C4502n nVar = new C4502n(fVar.f10680e, str, sVar, fVar);
                    fVar.f10682g = nVar;
                    nVar.mo24689a(eVar);
                    return;
                }
                IAConfigManager.addListener(fVar);
                IAConfigManager.m13175a();
            }
        } else if (this.f10228a != null) {
            C4168e eVar3 = this.f10229b;
            try {
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = eVar3.f10232a;
                if (admParametersOuterClass$AdmParameters2 != null) {
                    i = admParametersOuterClass$AdmParameters2.getAdType().mo24014a();
                } else {
                    i = AdmParametersOuterClass$AdmParameters.C4157a.UNRECOGNIZED.mo24014a();
                }
                C5229a a3 = C5229a.m16362a(i);
                if (a3 == null) {
                    a3 = C5229a.RETURNED_ADTYPE_MRAID;
                }
                C5230b a4 = C4339b.C4340a.f10657a.mo24484a(a3);
                if (a4 != null) {
                    a4.mo26310a((C4500m) null);
                    eVar3.mo24158a(a4);
                    eVar2 = a4.f13854a;
                } else {
                    IAlog.m16446a("failed parse adm network request with no input stream - received ad type %s does not have an appropriate parser", Integer.valueOf(i));
                }
            } catch (Exception e) {
                IAlog.m16445a("failed parse adm network request with no input stream", e, new Object[0]);
            }
            ((C4365m.C4366a) this.f10228a).mo24541a(exc, InneractiveErrorCode.CONNECTION_ERROR, eVar2);
        }
    }
}
