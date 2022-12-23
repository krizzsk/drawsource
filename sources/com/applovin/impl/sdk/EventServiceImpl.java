package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.impl.sdk.network.C2017h;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p051c.C1869d;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.p053e.C1944z;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class EventServiceImpl implements AppLovinEventService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1969m f2850a;

    /* renamed from: b */
    private final Map<String, Object> f2851b;

    /* renamed from: c */
    private final AtomicBoolean f2852c = new AtomicBoolean();

    public EventServiceImpl(C1969m mVar) {
        this.f2850a = mVar;
        if (((Boolean) mVar.mo14534a(C1867b.f3183be)).booleanValue()) {
            this.f2851b = JsonUtils.toStringObjectMap((String) this.f2850a.mo14565b(C1869d.f3388t, JsonUtils.EMPTY_JSON), new HashMap());
            return;
        }
        this.f2851b = new HashMap();
        mVar.mo14541a(C1869d.f3388t, JsonUtils.EMPTY_JSON);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m3794a() {
        return ((String) this.f2850a.mo14534a(C1867b.f3121aV)) + "4.0/pix";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m3797a(C2031p pVar, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        boolean contains = this.f2850a.mo14567b(C1867b.f3181bc).contains(pVar.mo14840a());
        hashMap.put("AppLovin-Event", contains ? pVar.mo14840a() : "postinstall");
        if (!contains) {
            hashMap.put("AppLovin-Sub-Event", pVar.mo14840a());
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m3798a(C2031p pVar, boolean z) {
        boolean contains = this.f2850a.mo14567b(C1867b.f3181bc).contains(pVar.mo14840a());
        Map<String, Object> a = this.f2850a.mo14529V().mo14821a((Map<String, String>) null, z, false);
        a.put("event", contains ? pVar.mo14840a() : "postinstall");
        a.put("event_id", pVar.mo14843d());
        a.put(CampaignEx.JSON_KEY_ST_TS, Long.toString(pVar.mo14842c()));
        if (!contains) {
            a.put("sub_event", pVar.mo14840a());
        }
        return Utils.stringifyObjectMap(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m3799b() {
        return ((String) this.f2850a.mo14534a(C1867b.f3122aW)) + "4.0/pix";
    }

    /* renamed from: c */
    private void m3802c() {
        if (((Boolean) this.f2850a.mo14534a(C1867b.f3183be)).booleanValue()) {
            this.f2850a.mo14541a(C1869d.f3388t, CollectionUtils.toJsonString(this.f2851b, JsonUtils.EMPTY_JSON));
        }
    }

    public Map<String, Object> getSuperProperties() {
        return new HashMap(this.f2851b);
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f2852c.compareAndSet(false, true)) {
            this.f2850a.mo14594w().trackEvent("landing");
        }
    }

    public void setSuperProperty(Object obj, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (obj == null) {
                this.f2851b.remove(str);
            } else {
                List<String> b = this.f2850a.mo14567b(C1867b.f3182bd);
                if (Utils.objectIsOfType(obj, b, this.f2850a)) {
                    this.f2851b.put(str, Utils.sanitizeSuperProperty(obj, this.f2850a));
                } else if (C2102v.m5104a()) {
                    C2102v.m5110i("AppLovinEventService", "Failed to set super property '" + obj + "' for key '" + str + "' - valid super property types include: " + b);
                    return;
                } else {
                    return;
                }
            }
            m3802c();
        } else if (C2102v.m5104a()) {
            C2102v.m5110i("AppLovinEventService", "Super property key cannot be null or empty");
        }
    }

    public String toString() {
        return "EventService{}";
    }

    public void trackCheckout(String str, Map<String, String> map) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap(1);
        }
        hashMap.put("transaction_id", str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, hashMap);
    }

    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    public void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, (Map<String, String>) null);
    }

    public void trackEvent(String str, Map<String, String> map, final Map<String, String> map2) {
        if (C2102v.m5104a()) {
            C2102v A = this.f2850a.mo14509A();
            A.mo15012b("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        }
        final C2031p pVar = new C2031p(str, map, this.f2851b);
        try {
            this.f2850a.mo14526S().mo14429a((C1887a) new C1944z(this.f2850a, new Runnable() {
                public void run() {
                    EventServiceImpl.this.f2850a.mo14528U().mo14764a(C2017h.m4735o().mo14798c(EventServiceImpl.this.m3794a()).mo14801d(EventServiceImpl.this.m3799b()).mo14792a((Map<String, String>) EventServiceImpl.this.m3798a(pVar, false)).mo14796b((Map<String, String>) EventServiceImpl.this.m3797a(pVar, (Map<String, String>) map2)).mo14799c(pVar.mo14841b()).mo14797b(((Boolean) EventServiceImpl.this.f2850a.mo14534a(C1867b.f3357ey)).booleanValue()).mo14793a(((Boolean) EventServiceImpl.this.f2850a.mo14534a(C1867b.f3348ep)).booleanValue()).mo14794a());
                }
            }), C1918o.C1920a.BACKGROUND);
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                C2102v A2 = this.f2850a.mo14509A();
                A2.mo15013b("AppLovinEventService", "Unable to track event: " + pVar, th);
            }
        }
    }

    public void trackEventSynchronously(String str) {
        if (C2102v.m5104a()) {
            C2102v A = this.f2850a.mo14509A();
            A.mo15012b("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        C2031p pVar = new C2031p(str, new HashMap(), this.f2851b);
        this.f2850a.mo14528U().mo14764a(C2017h.m4735o().mo14798c(m3794a()).mo14801d(m3799b()).mo14792a(m3798a(pVar, true)).mo14796b(m3797a(pVar, (Map<String, String>) null)).mo14799c(pVar.mo14841b()).mo14797b(((Boolean) this.f2850a.mo14534a(C1867b.f3357ey)).booleanValue()).mo14793a(((Boolean) this.f2850a.mo14534a(C1867b.f3348ep)).booleanValue()).mo14794a());
    }

    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        }
        try {
            hashMap.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            hashMap.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                C2102v.m5106c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            }
        }
        trackEvent("iap", hashMap);
    }
}
