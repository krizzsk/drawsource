package com.ogury.sdk.internal;

import android.os.AsyncTask;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.core.internal.network.OguryNetworkResponse;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.sdk.internal.c */
/* compiled from: MonitoringInfoAsyncTask.kt */
public final class C10349c extends AsyncTask<Object, Object, Object> {

    /* renamed from: a */
    private final C10350d f25684a;

    /* renamed from: b */
    private final C10358i f25685b;

    /* renamed from: c */
    private final C10356h f25686c;

    public C10349c(C10350d dVar, C10358i iVar, C10356h hVar) {
        C10363m.m30060b(dVar, "monitoringInfoFetcher");
        C10363m.m30060b(iVar, "monitoringInfoStorage");
        C10363m.m30060b(hVar, "monitoringInfoSender");
        this.f25684a = dVar;
        this.f25685b = iVar;
        this.f25686c = hVar;
    }

    public final Object doInBackground(Object[] objArr) {
        C10363m.m30060b(objArr, "objects");
        try {
            C10348b a = this.f25684a.mo65201a();
            if (a.mo65191a()) {
                OguryIntegrationLogger.m28105d("[Ogury][[environment] Failed to check environment");
                return null;
            }
            C10348b a2 = this.f25685b.mo65209a();
            if (a.mo65193a(TapjoyConstants.TJC_APP_VERSION_NAME) && a2.mo65193a(TapjoyConstants.TJC_APP_VERSION_NAME) && (!C10363m.m30059a((Object) a.mo65194b(TapjoyConstants.TJC_APP_VERSION_NAME), (Object) a2.mo65194b(TapjoyConstants.TJC_APP_VERSION_NAME)))) {
                OguryIntegrationLogger.m28105d("[Ogury][environment] New environment detected");
                this.f25685b.mo65211b();
                a2.mo65197c();
            }
            if (!a2.mo65192a(a)) {
                OguryIntegrationLogger.m28105d("[Ogury][environment] New environment info detected");
                a2.mo65196b(a);
                if (this.f25686c.mo65208a(a2) instanceof OguryNetworkResponse.Success) {
                    this.f25685b.mo65210a(a2);
                }
            }
            OguryIntegrationLogger.m28105d("[Ogury][environment] Environment checked");
            return null;
        } catch (Throwable unused) {
        }
    }
}
