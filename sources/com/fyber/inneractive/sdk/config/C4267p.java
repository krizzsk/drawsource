package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.global.C4244l;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C4484f;
import com.fyber.inneractive.sdk.network.C4507o;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.network.C4521u;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.p */
public class C4267p implements C4521u<C4244l> {

    /* renamed from: a */
    public final /* synthetic */ IAConfigManager f10479a;

    public C4267p(IAConfigManager iAConfigManager) {
        this.f10479a = iAConfigManager;
    }

    /* renamed from: a */
    public void mo24154a(Object obj, Exception exc, boolean z) {
        C4244l lVar = (C4244l) obj;
        if (lVar != null) {
            IAlog.m16446a("calling mergeRemoteFeaturesConfig fromCache: %b", Boolean.valueOf(z));
            this.f10479a.f10360z.f10410a = lVar;
        } else if (exc == null) {
        } else {
            if (exc instanceof C4484f) {
                IAlog.m16446a("remote features config not modified", new Object[0]);
                return;
            }
            IAlog.m16446a("Config manager: Error getting or parsing remote config. Resetting configurable features", new Object[0]);
            IAConfigManager iAConfigManager = this.f10479a;
            IAConfigManager iAConfigManager2 = IAConfigManager.f10324J;
            iAConfigManager.getClass();
            new C4511q.C4512a(C4507o.FATAL_FEATURES_CONFIG_ERROR, (InneractiveAdRequest) null, (C5233e) null, (JSONArray) null).mo24692a("exception", exc.getClass().getName(), "message", exc.getLocalizedMessage()).mo24693a((String) null);
        }
    }
}
