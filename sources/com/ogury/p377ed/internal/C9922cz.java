package com.ogury.p377ed.internal;

import com.ogury.core.internal.OguryEventBus;
import com.ogury.core.internal.OguryEventBuses;
import com.ogury.core.internal.OguryEventCallback;
import com.ogury.core.internal.OguryIntegrationLogger;

/* renamed from: com.ogury.ed.internal.cz */
public final class C9922cz {

    /* renamed from: a */
    public static final C9922cz f24969a = new C9922cz();

    /* renamed from: b */
    private static OguryEventBuses f24970b;

    private C9922cz() {
    }

    /* renamed from: a */
    public static void m28645a(OguryEventBuses oguryEventBuses) {
        f24970b = oguryEventBuses;
    }

    /* renamed from: a */
    public static OguryEventCallback m28643a(C10227lj<C10182ke> ljVar) {
        C10263mq.m29882b(ljVar, "consentDoneAction");
        OguryEventBuses oguryEventBuses = f24970b;
        OguryEventBus persistentMessage = oguryEventBuses == null ? null : oguryEventBuses.getPersistentMessage();
        if (persistentMessage == null) {
            OguryIntegrationLogger.m28105d("[Ads][EvenBus] Consent sync not available");
            ljVar.mo64355a();
            return null;
        }
        OguryEventCallback a = m28644a(ljVar, persistentMessage);
        OguryIntegrationLogger.m28105d("[Ads][EvenBus] Register to consent status");
        persistentMessage.register("CM-status", a);
        return a;
    }

    /* renamed from: b */
    public static OguryEventCallback m28649b(C10227lj<C10182ke> ljVar) {
        C10263mq.m29882b(ljVar, "consentChangedAction");
        OguryEventBuses oguryEventBuses = f24970b;
        OguryEventBus broadcast = oguryEventBuses == null ? null : oguryEventBuses.getBroadcast();
        if (broadcast == null) {
            OguryIntegrationLogger.m28105d("[Ads][EvenBus] Impossible to register to consent changes");
            return null;
        }
        OguryEventCallback c = m28651c(ljVar);
        OguryIntegrationLogger.m28105d("[Ads][EvenBus] Register to consent changes");
        broadcast.register("CM-consent-change", c);
        return c;
    }

    /* renamed from: com.ogury.ed.internal.cz$a */
    public static final class C9923a implements OguryEventCallback {

        /* renamed from: a */
        final /* synthetic */ C10227lj<C10182ke> f24971a;

        /* renamed from: b */
        final /* synthetic */ OguryEventBus f24972b;

        C9923a(C10227lj<C10182ke> ljVar, OguryEventBus oguryEventBus) {
            this.f24971a = ljVar;
            this.f24972b = oguryEventBus;
        }

        public final void onNewEvent(String str, String str2, long j) {
            C10263mq.m29882b(str, "event");
            C10263mq.m29882b(str2, "message");
            OguryIntegrationLogger.m28105d("[Ads][EvenBus] " + str + ' ' + str2 + " received");
            if (!C10263mq.m29881a((Object) str2, (Object) "COMPLETE") && !C10263mq.m29881a((Object) str2, (Object) "UNKNOWN") && !C10263mq.m29881a((Object) str2, (Object) "ERROR")) {
                C9922cz czVar = C9922cz.f24969a;
                if (!C9922cz.m28650b(j)) {
                    return;
                }
            }
            OguryIntegrationLogger.m28105d("[Ads][EvenBus] Consent synced");
            this.f24971a.mo64355a();
            OguryIntegrationLogger.m28105d("[Ads][EvenBus] Unregister from consent status");
            this.f24972b.unregister(str, this);
        }
    }

    /* renamed from: a */
    private static OguryEventCallback m28644a(C10227lj<C10182ke> ljVar, OguryEventBus oguryEventBus) {
        return new C9923a(ljVar, oguryEventBus);
    }

    /* renamed from: c */
    private static OguryEventCallback m28651c(C10227lj<C10182ke> ljVar) {
        return new OguryEventCallback() {
            public final void onNewEvent(String str, String str2, long j) {
                C9922cz.m28647a(C10227lj.this, str, str2, j);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m28647a(C10227lj ljVar, String str, String str2, long j) {
        C10263mq.m29882b(ljVar, "$consentChangedAction");
        OguryIntegrationLogger.m28105d("[Ads][EvenBus] " + str + ' ' + str2 + " received");
        ljVar.mo64355a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m28650b(long j) {
        return j < System.currentTimeMillis() - 30000;
    }

    /* renamed from: a */
    public static void m28646a(OguryEventCallback oguryEventCallback) {
        OguryEventBus persistentMessage;
        if (oguryEventCallback != null) {
            OguryIntegrationLogger.m28105d("[Ads][EvenBus] Unregister from consent status");
            OguryEventBuses oguryEventBuses = f24970b;
            if (oguryEventBuses != null && (persistentMessage = oguryEventBuses.getPersistentMessage()) != null) {
                persistentMessage.unregister("CM-status", oguryEventCallback);
            }
        }
    }
}
