package com.ogury.p376cm.internal;

import com.ogury.core.internal.OguryEventBus;
import com.ogury.core.internal.OguryEventBuses;
import com.ogury.core.internal.OguryIntegrationLogger;

/* renamed from: com.ogury.cm.internal.aabca */
public final class aabca {

    /* renamed from: a */
    public static final aabca f24267a = new aabca();

    /* renamed from: b */
    private static OguryEventBuses f24268b;

    private aabca() {
    }

    /* renamed from: a */
    public static void m27761a() {
        OguryEventBus broadcast;
        OguryIntegrationLogger.m28105d("[Consent][EventBus] Dispatch CM-consent-change");
        OguryEventBuses oguryEventBuses = f24268b;
        if (oguryEventBuses != null && (broadcast = oguryEventBuses.getBroadcast()) != null) {
            broadcast.dispatch("CM-consent-change", "");
        }
    }

    /* renamed from: a */
    public static void m27762a(OguryEventBuses oguryEventBuses) {
        f24268b = oguryEventBuses;
    }

    /* renamed from: a */
    public static void m27763a(String str) {
        OguryEventBus persistentMessage;
        OguryEventBus persistentMessage2;
        bbabc.m28052b(str, "msg");
        if (str.length() > 0) {
            OguryIntegrationLogger.m28105d("[Consent][EventBus] Dispatch CM-status ".concat(String.valueOf(str)));
            OguryEventBuses oguryEventBuses = f24268b;
            if (oguryEventBuses != null && (persistentMessage2 = oguryEventBuses.getPersistentMessage()) != null) {
                persistentMessage2.dispatch("CM-status", str);
                return;
            }
            return;
        }
        OguryIntegrationLogger.m28105d("[Consent][EventBus] Dispatch CM-status UNKNOWN");
        OguryEventBuses oguryEventBuses2 = f24268b;
        if (oguryEventBuses2 != null && (persistentMessage = oguryEventBuses2.getPersistentMessage()) != null) {
            persistentMessage.dispatch("CM-status", "UNKNOWN");
        }
    }
}
