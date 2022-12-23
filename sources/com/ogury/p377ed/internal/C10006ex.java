package com.ogury.p377ed.internal;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.network.OguryNetworkResponse;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ex */
public final class C10006ex {

    /* renamed from: a */
    public static final C10006ex f25167a = new C10006ex();

    private C10006ex() {
    }

    /* renamed from: a */
    public final void mo64617a(List<C9981eb> list, C10003ev evVar, C9967dv dvVar) throws C10005ew {
        C10263mq.m29882b(list, CampaignUnit.JSON_KEY_ADS);
        C10263mq.m29882b(evVar, "mraidDao");
        C10263mq.m29882b(dvVar, "presageApi");
        C9981eb a = m28962a(list);
        if (a != null) {
            if (!(!C10263mq.m29881a((Object) a.mo64526k(), (Object) evVar.mo64613a()))) {
                if (!(evVar.mo64615b().length() == 0)) {
                    return;
                }
            }
            try {
                m28963a(a.mo64526k(), true, evVar, dvVar);
            } catch (C10005ew e) {
                C9943di diVar = C9943di.f25015a;
                C9943di.m28717a((C9942dh) new C9953dl("loaded_error", a));
                throw e;
            }
        }
    }

    /* renamed from: a */
    private static C9981eb m28962a(List<C9981eb> list) {
        Object obj;
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C9981eb) obj).mo64526k().length() > 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C9981eb) obj;
    }

    /* renamed from: a */
    private final void m28963a(String str, boolean z, C10003ev evVar, C9967dv dvVar) throws C10005ew {
        OguryNetworkResponse b = dvVar.mo64489b(str);
        if (b instanceof OguryNetworkResponse.Success) {
            OguryNetworkResponse.Success success = (OguryNetworkResponse.Success) b;
            String responseBody = success.getResponseBody();
            C10263mq.m29879a((Object) responseBody, "response.responseBody");
            if (responseBody.length() > 0) {
                String responseBody2 = success.getResponseBody();
                C10263mq.m29879a((Object) responseBody2, "response.responseBody");
                evVar.mo64614a(responseBody2);
                evVar.mo64616b(str);
                return;
            }
        }
        if (z) {
            Thread.sleep(400);
            m28963a(str, false, evVar, dvVar);
            return;
        }
        throw new C10005ew();
    }
}
