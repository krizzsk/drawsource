package com.ogury.sdk.internal;

import com.ogury.core.internal.network.HeadersLoader;
import java.util.Map;

/* renamed from: com.ogury.sdk.internal.j */
/* compiled from: MonitoringRequestHeader.kt */
public final class C10360j implements HeadersLoader {

    /* renamed from: a */
    private final C10354f f25695a;

    public C10360j(C10354f fVar) {
        C10363m.m30060b(fVar, "monitoringInfoHelper");
        this.f25695a = fVar;
    }

    public final Map<String, String> loadHeaders() {
        return new C10352e(this.f25695a).mo65202a();
    }
}
