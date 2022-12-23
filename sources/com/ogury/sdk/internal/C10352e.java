package com.ogury.sdk.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ogury.sdk.internal.e */
/* compiled from: MonitoringInfoHeaders.kt */
public final class C10352e {

    /* renamed from: a */
    private final C10354f f25688a;

    static {
        new C10353a((byte) 0);
    }

    public C10352e(C10354f fVar) {
        C10363m.m30060b(fVar, "monitoringInfoHelper");
        this.f25688a = fVar;
    }

    /* renamed from: a */
    public final Map<String, String> mo65202a() {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Content-Encoding", "gzip");
        linkedHashMap.put("Content-Type", "application/json");
        linkedHashMap.put("Asset-Key", this.f25688a.mo65203a());
        try {
            linkedHashMap.put("Package-Name", this.f25688a.mo65204c());
        } catch (Exception unused) {
        }
        return linkedHashMap;
    }

    /* renamed from: com.ogury.sdk.internal.e$a */
    /* compiled from: MonitoringInfoHeaders.kt */
    public static final class C10353a {
        private C10353a() {
        }

        public /* synthetic */ C10353a(byte b) {
            this();
        }
    }
}
