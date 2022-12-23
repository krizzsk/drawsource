package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.jw */
/* compiled from: UnifiedIDServiceCallback */
public final class C6276jw implements C6152gx<JSONObject> {

    /* renamed from: a */
    C6277jx f15806a;

    /* renamed from: b */
    Set<InMobiUnifiedIdInterface> f15807b;

    /* renamed from: a */
    public final /* synthetic */ void mo35335a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        synchronized (C6275jv.class) {
            if (!this.f15806a.f15547a.get()) {
                C6275jv.m18671d();
                C6272jt.m18652a(C6273ju.m18659a(jSONObject, C6272jt.m18651a()));
                JSONObject c = C6273ju.m18664c(C6272jt.m18651a());
                for (InMobiUnifiedIdInterface next : this.f15807b) {
                    if (c == null) {
                        C6273ju.m18660a(next, (JSONObject) null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                    } else {
                        C6273ju.m18660a(next, c, (Error) null);
                    }
                }
                this.f15807b.clear();
            }
        }
    }

    public C6276jw(C6277jx jxVar, Set<InMobiUnifiedIdInterface> set) {
        this.f15806a = jxVar;
        this.f15807b = set;
    }

    /* renamed from: a */
    public final void mo35334a(C6154gz gzVar) {
        synchronized (C6275jv.class) {
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(gzVar.f15517a));
            C6168hl.m18270a().mo35377a("UnifiedIdNetworkResponseFailure", (Map<String, Object>) hashMap);
            if (!this.f15806a.f15547a.get()) {
                C6275jv.m18671d();
                m18673a();
            }
        }
    }

    /* renamed from: a */
    private void m18673a() {
        JSONObject c = C6273ju.m18664c(C6272jt.m18651a());
        if (c != null) {
            try {
                if (c.has("ufids") && c.getJSONArray("ufids").length() > 0) {
                    for (InMobiUnifiedIdInterface a : this.f15807b) {
                        C6273ju.m18660a(a, c, (Error) null);
                    }
                    this.f15807b.clear();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.f15807b.clear();
                throw th;
            }
        }
        for (InMobiUnifiedIdInterface a2 : this.f15807b) {
            C6273ju.m18660a(a2, (JSONObject) null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
        }
        this.f15807b.clear();
    }
}
