package com.ironsource.mediationsdk.adunit.p208b;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.p206a.C6509b;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.mediationsdk.p206a.C6518d;
import com.ironsource.mediationsdk.p206a.C6522h;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.b.d */
public final class C6542d {

    /* renamed from: a */
    public C6547g f16923a;

    /* renamed from: b */
    public C6548h f16924b;

    /* renamed from: c */
    public C6545e f16925c;

    /* renamed from: d */
    public C6539a f16926d;

    /* renamed from: e */
    public C6549i f16927e;

    /* renamed from: f */
    private final int f16928f = -1;

    /* renamed from: g */
    private IronSource.AD_UNIT f16929g;

    /* renamed from: h */
    private C6544b f16930h;

    /* renamed from: i */
    private C6541c f16931i;

    /* renamed from: j */
    private C6509b f16932j;

    /* renamed from: k */
    private Map<C6540b, C6543a> f16933k;

    /* renamed from: l */
    private Map<C6540b, C6543a> f16934l;

    /* renamed from: com.ironsource.mediationsdk.adunit.b.d$a */
    class C6543a {

        /* renamed from: a */
        private int f16935a;

        /* renamed from: b */
        private int f16936b;

        public C6543a(int i, int i2) {
            this.f16935a = i;
            this.f16936b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo36453a(C6544b bVar) {
            return C6544b.MEDIATION.equals(bVar) ? this.f16935a : this.f16936b;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.adunit.b.d$b */
    public enum C6544b {
        MEDIATION,
        PROVIDER
    }

    public C6542d(IronSource.AD_UNIT ad_unit, C6544b bVar, C6541c cVar) {
        this.f16929g = ad_unit;
        this.f16930h = bVar;
        this.f16931i = cVar;
        this.f16932j = (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) || ad_unit.equals(IronSource.AD_UNIT.OFFERWALL)) ? C6522h.m19751d() : C6518d.m19731d();
        HashMap hashMap = new HashMap();
        this.f16933k = hashMap;
        hashMap.put(C6540b.INIT_STARTED, new C6543a(IronSourceConstants.IS_MANAGER_INIT_STARTED, -1));
        this.f16933k.put(C6540b.INIT_ENDED, new C6543a(IronSourceConstants.IS_MANAGER_INIT_ENDED, -1));
        this.f16933k.put(C6540b.SESSION_CAPPED, new C6543a(-1, IronSourceConstants.IS_CAP_SESSION));
        this.f16933k.put(C6540b.PLACEMENT_CAPPED, new C6543a(IronSourceConstants.IS_CAP_PLACEMENT, -1));
        this.f16933k.put(C6540b.AUCTION_REQUEST, new C6543a(2000, -1));
        this.f16933k.put(C6540b.AUCTION_SUCCESS, new C6543a(IronSourceConstants.IS_AUCTION_SUCCESS, -1));
        this.f16933k.put(C6540b.AUCTION_FAILED, new C6543a(IronSourceConstants.IS_AUCTION_FAILED, -1));
        this.f16933k.put(C6540b.AUCTION_REQUEST_WATERFALL, new C6543a(IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, -1));
        this.f16933k.put(C6540b.AUCTION_RESULT_WATERFALL, new C6543a(IronSourceConstants.IS_RESULT_WATERFALL, -1));
        this.f16933k.put(C6540b.INIT_SUCCESS, new C6543a(-1, -1));
        this.f16933k.put(C6540b.INIT_FAILED, new C6543a(-1, -1));
        this.f16933k.put(C6540b.SHOW_AD_SUCCESS, new C6543a(-1, IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS));
        this.f16933k.put(C6540b.AD_OPENED, new C6543a(-1, 2005));
        this.f16933k.put(C6540b.AD_CLOSED, new C6543a(-1, IronSourceConstants.IS_INSTANCE_CLOSED));
        this.f16933k.put(C6540b.AD_CLICKED, new C6543a(-1, 2006));
        this.f16933k.put(C6540b.LOAD_AD, new C6543a(2001, 2002));
        this.f16933k.put(C6540b.LOAD_AD_SUCCESS, new C6543a(2004, 2003));
        this.f16933k.put(C6540b.LOAD_AD_FAILED_WITH_REASON, new C6543a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, IronSourceConstants.IS_INSTANCE_LOAD_FAILED));
        this.f16933k.put(C6540b.LOAD_AD_NO_FILL, new C6543a(-1, IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL));
        this.f16933k.put(C6540b.SHOW_AD, new C6543a(2100, IronSourceConstants.IS_INSTANCE_SHOW));
        this.f16933k.put(C6540b.SHOW_AD_SUCCESS, new C6543a(-1, IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS));
        this.f16933k.put(C6540b.SHOW_AD_FAILED, new C6543a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, IronSourceConstants.IS_INSTANCE_SHOW_FAILED));
        this.f16933k.put(C6540b.AD_UNIT_CAPPED, new C6543a(IronSourceConstants.IS_AD_UNIT_CAPPED, -1));
        this.f16933k.put(C6540b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE, new C6543a(IronSourceConstants.TROUBLESHOOTING_IS_NETWORK_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_IS_NETWORK_ADAPTER_NOT_AVAILABLE));
        this.f16933k.put(C6540b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE, new C6543a(IronSourceConstants.TROUBLESHOOTING_IS_AD_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_IS_AD_ADAPTER_NOT_AVAILABLE));
        this.f16933k.put(C6540b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new C6543a(IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING));
        this.f16933k.put(C6540b.TROUBLESHOOT_BIDDING_DATA_MISSING, new C6543a(IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING));
        this.f16933k.put(C6540b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new C6543a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS));
        this.f16933k.put(C6540b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new C6543a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED));
        this.f16933k.put(C6540b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new C6543a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS));
        this.f16933k.put(C6540b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new C6543a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED));
        this.f16933k.put(C6540b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new C6543a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS));
        this.f16933k.put(C6540b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new C6543a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED));
        this.f16933k.put(C6540b.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, new C6543a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED));
        this.f16933k.put(C6540b.TROUBLESHOOT_UNEXPECTED_CLOSED, new C6543a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED));
        this.f16933k.put(C6540b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new C6543a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT));
        this.f16933k.put(C6540b.TROUBLESHOOT_INTERNAL_ERROR, new C6543a(IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR));
        this.f16933k.put(C6540b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR, new C6543a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR));
        this.f16933k.put(C6540b.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new C6543a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f16933k.put(C6540b.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new C6543a(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR));
        this.f16933k.put(C6540b.TROUBLESHOOT_NOTIFICATION_ERROR, new C6543a(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, -1));
        HashMap hashMap2 = new HashMap();
        this.f16934l = hashMap2;
        hashMap2.put(C6540b.INIT_STARTED, new C6543a(IronSourceConstants.RV_MANAGER_INIT_STARTED, -1));
        this.f16934l.put(C6540b.INIT_ENDED, new C6543a(IronSourceConstants.RV_MANAGER_INIT_ENDED, -1));
        this.f16934l.put(C6540b.SESSION_CAPPED, new C6543a(-1, IronSourceConstants.RV_CAP_SESSION));
        this.f16934l.put(C6540b.PLACEMENT_CAPPED, new C6543a(IronSourceConstants.RV_CAP_PLACEMENT, -1));
        this.f16934l.put(C6540b.AUCTION_REQUEST, new C6543a(IronSourceConstants.RV_AUCTION_REQUEST, -1));
        this.f16934l.put(C6540b.AUCTION_SUCCESS, new C6543a(IronSourceConstants.RV_AUCTION_SUCCESS, -1));
        this.f16934l.put(C6540b.AUCTION_FAILED, new C6543a(IronSourceConstants.RV_AUCTION_FAILED, -1));
        this.f16934l.put(C6540b.AUCTION_REQUEST_WATERFALL, new C6543a(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, -1));
        this.f16934l.put(C6540b.AUCTION_RESULT_WATERFALL, new C6543a(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, -1));
        this.f16934l.put(C6540b.INIT_SUCCESS, new C6543a(-1, -1));
        this.f16934l.put(C6540b.INIT_FAILED, new C6543a(-1, -1));
        this.f16934l.put(C6540b.AD_VISIBLE, new C6543a(-1, IronSourceConstants.RV_INSTANCE_VISIBLE));
        this.f16934l.put(C6540b.AD_OPENED, new C6543a(-1, 1005));
        this.f16934l.put(C6540b.AD_CLOSED, new C6543a(-1, IronSourceConstants.RV_INSTANCE_CLOSED));
        this.f16934l.put(C6540b.AD_STARTED, new C6543a(-1, IronSourceConstants.RV_INSTANCE_STARTED));
        this.f16934l.put(C6540b.AD_ENDED, new C6543a(-1, IronSourceConstants.RV_INSTANCE_ENDED));
        this.f16934l.put(C6540b.AD_CLICKED, new C6543a(-1, 1006));
        this.f16934l.put(C6540b.AD_REWARDED, new C6543a(-1, 1010));
        this.f16934l.put(C6540b.AD_AVAILABILITY_CHANGED_TRUE, new C6543a(IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE));
        this.f16934l.put(C6540b.AD_AVAILABILITY_CHANGED_FALSE, new C6543a(IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE));
        this.f16934l.put(C6540b.LOAD_AD, new C6543a(1000, 1001));
        this.f16934l.put(C6540b.LOAD_AD_SUCCESS, new C6543a(1003, 1002));
        this.f16934l.put(C6540b.LOAD_AD_FAILED, new C6543a(-1, IronSourceConstants.RV_INSTANCE_LOAD_FAILED));
        this.f16934l.put(C6540b.LOAD_AD_FAILED_WITH_REASON, new C6543a(IronSourceConstants.RV_MEDIATION_LOAD_ERROR, IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f16934l.put(C6540b.LOAD_AD_NO_FILL, new C6543a(-1, IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL));
        this.f16934l.put(C6540b.SHOW_AD, new C6543a(IronSourceConstants.RV_API_SHOW_CALLED, IronSourceConstants.RV_INSTANCE_SHOW));
        this.f16934l.put(C6540b.SHOW_AD_CHANCE, new C6543a(-1, IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.f16934l.put(C6540b.SHOW_AD_FAILED, new C6543a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, IronSourceConstants.RV_INSTANCE_SHOW_FAILED));
        this.f16934l.put(C6540b.AD_UNIT_CAPPED, new C6543a(IronSourceConstants.RV_AD_UNIT_CAPPED, -1));
        this.f16934l.put(C6540b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_NETWORK_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_RV_NETWORK_ADAPTER_NOT_AVAILABLE));
        this.f16934l.put(C6540b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_AD_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_RV_AD_ADAPTER_NOT_AVAILABLE));
        this.f16934l.put(C6540b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING));
        this.f16934l.put(C6540b.TROUBLESHOOT_BIDDING_DATA_MISSING, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING));
        this.f16934l.put(C6540b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS));
        this.f16934l.put(C6540b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED));
        this.f16934l.put(C6540b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS));
        this.f16934l.put(C6540b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED));
        this.f16934l.put(C6540b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS));
        this.f16934l.put(C6540b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED));
        this.f16934l.put(C6540b.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED));
        this.f16934l.put(C6540b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT));
        this.f16934l.put(C6540b.TROUBLESHOOT_UNEXPECTED_CLOSED, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED));
        this.f16934l.put(C6540b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT));
        this.f16934l.put(C6540b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT));
        this.f16934l.put(C6540b.TROUBLESHOOT_LOAD_FAILED, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED));
        this.f16934l.put(C6540b.TROUBLESHOOT_INTERNAL_ERROR, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR));
        this.f16934l.put(C6540b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR, new C6543a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR));
        this.f16934l.put(C6540b.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new C6543a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f16934l.put(C6540b.TROUBLESHOOTING_WATERFALL_OVERHEAD, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD));
        this.f16934l.put(C6540b.TROUBLESHOOT_NOTIFICATION_ERROR, new C6543a(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, -1));
        this.f16923a = new C6547g(this);
        this.f16924b = new C6548h(this);
        this.f16925c = new C6545e(this);
        this.f16926d = new C6539a(this);
        this.f16927e = new C6549i(this);
    }

    /* renamed from: a */
    private int m19834a(C6540b bVar) {
        try {
            if (IronSource.AD_UNIT.INTERSTITIAL.equals(this.f16929g) && this.f16933k.containsKey(bVar)) {
                return this.f16933k.get(bVar).mo36453a(this.f16930h);
            }
            if (!IronSource.AD_UNIT.REWARDED_VIDEO.equals(this.f16929g) || !this.f16934l.containsKey(bVar)) {
                return -1;
            }
            return this.f16934l.get(bVar).mo36453a(this.f16930h);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo36450a() {
        this.f16931i = null;
        this.f16925c = null;
        this.f16923a = null;
        this.f16924b = null;
        this.f16926d = null;
        this.f16927e = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36451a(C6540b bVar, Map<String, Object> map) {
        mo36452a(bVar, map, System.currentTimeMillis());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36452a(C6540b bVar, Map<String, Object> map, long j) {
        int a = m19834a(bVar);
        if (-1 != a) {
            HashMap hashMap = new HashMap();
            C6541c cVar = this.f16931i;
            if (cVar != null) {
                hashMap.putAll(cVar.mo36449a(bVar));
            }
            if (map != null && !map.isEmpty()) {
                hashMap.putAll(map);
            }
            this.f16932j.mo36349b(new C6517c(a, j, new JSONObject(hashMap)));
        }
    }
}
