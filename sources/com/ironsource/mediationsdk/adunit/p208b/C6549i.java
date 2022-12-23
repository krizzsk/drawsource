package com.ironsource.mediationsdk.adunit.p208b;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.b.i */
public final class C6549i extends C6546f {
    public C6549i(C6542d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo36471a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_LOAD_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo36472a(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        mo36461a(C6540b.TROUBLESHOOT_NOTIFICATION_ERROR, hashMap);
    }

    /* renamed from: a */
    public final void mo36473a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE, hashMap);
    }

    /* renamed from: a */
    public final void mo36474a(String str, String str2, String str3, String str4, String str5) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, str);
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, str2);
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str3);
        hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, str4);
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str5);
        mo36461a(C6540b.TROUBLESHOOT_BIDDING_DATA_MISSING, hashMap);
    }

    /* renamed from: b */
    public final void mo36475b(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, hashMap);
    }

    /* renamed from: b */
    public final void mo36476b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE, hashMap);
    }

    /* renamed from: c */
    public final void mo36477c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, hashMap);
    }

    /* renamed from: d */
    public final void mo36478d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, hashMap);
    }

    /* renamed from: e */
    public final void mo36479e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, hashMap);
    }

    /* renamed from: f */
    public final void mo36480f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, hashMap);
    }

    /* renamed from: g */
    public final void mo36481g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, hashMap);
    }

    /* renamed from: h */
    public final void mo36482h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, hashMap);
    }

    /* renamed from: i */
    public final void mo36483i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, hashMap);
    }

    /* renamed from: j */
    public final void mo36484j(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, hashMap);
    }

    /* renamed from: k */
    public final void mo36485k(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_UNEXPECTED_CLOSED, hashMap);
    }

    /* renamed from: l */
    public final void mo36486l(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, hashMap);
    }

    /* renamed from: m */
    public final void mo36487m(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_INTERNAL_ERROR, hashMap);
    }

    /* renamed from: n */
    public final void mo36488n(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR, hashMap);
    }

    /* renamed from: o */
    public final void mo36489o(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOTING_WATERFALL_OVERHEAD, hashMap);
    }

    /* renamed from: p */
    public final void mo36490p(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo36461a(C6540b.TROUBLESHOOT_AD_EXPIRED, hashMap);
    }
}
