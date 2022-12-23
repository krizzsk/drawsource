package com.ogury.core.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: OguryPersistentMessageEventBus.kt */
public final class OguryPersistentMessageEventBus implements OguryEventBus {
    public static final C9700a Companion = new C9700a((byte) 0);
    private static final String UNKNOWN_MESSAGE = "UNKNOWN";
    private final OguryBroadcastEventBus broadcastEventBus;
    private final Map<String, C9703aa> lastEventsMap;

    public OguryPersistentMessageEventBus() {
        this((OguryBroadcastEventBus) null, 1, (C9716ah) null);
    }

    public OguryPersistentMessageEventBus(OguryBroadcastEventBus oguryBroadcastEventBus) {
        C9717ai.m28145b(oguryBroadcastEventBus, "broadcastEventBus");
        this.broadcastEventBus = oguryBroadcastEventBus;
        this.lastEventsMap = Collections.synchronizedMap(new LinkedHashMap());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OguryPersistentMessageEventBus(OguryBroadcastEventBus oguryBroadcastEventBus, int i, C9716ah ahVar) {
        this((i & 1) != 0 ? new OguryBroadcastEventBus() : oguryBroadcastEventBus);
    }

    /* renamed from: com.ogury.core.internal.OguryPersistentMessageEventBus$a */
    /* compiled from: OguryPersistentMessageEventBus.kt */
    public static final class C9700a {
        private C9700a() {
        }

        public /* synthetic */ C9700a(byte b) {
            this();
        }
    }

    public final void dispatch(String str, String str2) {
        C9717ai.m28145b(str, "event");
        C9717ai.m28145b(str2, "message");
        Map<String, C9703aa> map = this.lastEventsMap;
        C9717ai.m28143a((Object) map, "lastEventsMap");
        map.put(str, new C9703aa(str2, 0, 2));
        this.broadcastEventBus.dispatch(str, str2);
    }

    public final void register(String str, OguryEventCallback oguryEventCallback) {
        C9717ai.m28145b(str, "event");
        C9717ai.m28145b(oguryEventCallback, "callback");
        this.broadcastEventBus.register(str, oguryEventCallback);
        C9703aa aaVar = this.lastEventsMap.get(str);
        if (aaVar == null) {
            aaVar = new C9703aa(UNKNOWN_MESSAGE, 0, 2);
        }
        oguryEventCallback.onNewEvent(str, aaVar.mo64040a(), aaVar.mo64041b());
    }

    public final void unregister(String str, OguryEventCallback oguryEventCallback) {
        C9717ai.m28145b(str, "event");
        C9717ai.m28145b(oguryEventCallback, "callback");
        this.broadcastEventBus.unregister(str, oguryEventCallback);
    }
}
