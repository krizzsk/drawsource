package com.ogury.sdk.internal;

import com.ogury.core.internal.network.OguryNetworkClient;
import com.ogury.core.internal.network.OguryNetworkResponse;
import org.json.JSONException;

/* renamed from: com.ogury.sdk.internal.h */
/* compiled from: MonitoringInfoSender.kt */
public final class C10356h {

    /* renamed from: a */
    private final C10354f f25691a;

    /* renamed from: b */
    private final C10355g f25692b;

    static {
        new C10357a((byte) 0);
    }

    public C10356h(C10354f fVar, C10355g gVar) {
        C10363m.m30060b(fVar, "monitoringInfoHelper");
        C10363m.m30060b(gVar, "monitoringInfoJsonSerializer");
        this.f25691a = fVar;
        this.f25692b = gVar;
    }

    /* renamed from: a */
    public final OguryNetworkResponse mo65208a(C10348b bVar) throws JSONException {
        C10363m.m30060b(bVar, "monitoringInfo");
        OguryNetworkResponse post = new OguryNetworkClient(3000, 3000).post("https://sdk-monitoring.ogury.co/sdk-versions", this.f25692b.mo65207a(bVar), new C10360j(this.f25691a));
        C10363m.m30058a((Object) post, "oguryNetworkClient.post(…er(monitoringInfoHelper))");
        return post;
    }

    /* renamed from: com.ogury.sdk.internal.h$a */
    /* compiled from: MonitoringInfoSender.kt */
    public static final class C10357a {
        private C10357a() {
        }

        public /* synthetic */ C10357a(byte b) {
            this();
        }
    }
}
