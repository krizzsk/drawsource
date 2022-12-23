package com.ogury.p377ed.internal;

import androidx.browser.trusted.sharing.ShareTarget;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ogury.core.internal.network.NetworkRequest;
import com.ogury.core.internal.network.OguryNetworkClient;
import com.ogury.core.internal.network.OguryNetworkResponse;
import com.ogury.p377ed.internal.C9908cp;
import com.smaato.sdk.video.vast.model.C11130Ad;
import com.tapjoy.TapjoyConstants;
import org.json.JSONObject;
import p401io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.internal.dx */
public final class C9969dx implements C9967dv {

    /* renamed from: a */
    private final C9963ds f25059a;

    /* renamed from: b */
    private final C10012fa f25060b;

    /* renamed from: c */
    private final C10008ez f25061c;

    /* renamed from: d */
    private final C9928dc f25062d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final OguryNetworkClient f25063e;

    /* renamed from: f */
    private final C9965dt f25064f;

    /* renamed from: g */
    private final C10029fn f25065g;

    /* renamed from: h */
    private final C9998er f25066h;

    /* renamed from: i */
    private final C10040fx f25067i;

    private C9969dx(C9963ds dsVar, C10012fa faVar, C10008ez ezVar, C9928dc dcVar, OguryNetworkClient oguryNetworkClient, C9965dt dtVar, C10029fn fnVar, C9998er erVar, C10040fx fxVar) {
        C10263mq.m29882b(dsVar, "headersFactory");
        C10263mq.m29882b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10263mq.m29882b(ezVar, "androidDevice");
        C10263mq.m29882b(dcVar, "extraAdConfiguration");
        C10263mq.m29882b(oguryNetworkClient, "networkClient");
        C10263mq.m29882b(dtVar, "httpProfigChecker");
        C10263mq.m29882b(fnVar, "profigGateway");
        C10263mq.m29882b(erVar, "omidSdkChecker");
        C10263mq.m29882b(fxVar, "coreWrapper");
        this.f25059a = dsVar;
        this.f25060b = faVar;
        this.f25061c = ezVar;
        this.f25062d = dcVar;
        this.f25063e = oguryNetworkClient;
        this.f25064f = dtVar;
        this.f25065g = fnVar;
        this.f25066h = erVar;
        this.f25067i = fxVar;
    }

    public /* synthetic */ C9969dx(C9963ds dsVar, C10012fa faVar, C10008ez ezVar, C9928dc dcVar, OguryNetworkClient oguryNetworkClient, C10040fx fxVar) {
        this(dsVar, faVar, ezVar, dcVar, oguryNetworkClient, new C9965dt(), C10029fn.f25239a, C9998er.f25152a, fxVar);
    }

    /* renamed from: a */
    public final OguryNetworkResponse mo64485a(C9989ej ejVar, AdConfig adConfig, String str, C9999es esVar) {
        String str2 = str;
        C10263mq.m29882b(ejVar, C11130Ad.AD_TYPE);
        C10263mq.m29882b(str2, DataKeys.USER_ID);
        C9980ea eaVar = C9980ea.f25081a;
        String a = C9980ea.m28795a();
        String a2 = ejVar.mo64568a();
        String str3 = null;
        String adUnitId = adConfig == null ? null : adConfig.getAdUnitId();
        String campaignId = adConfig == null ? null : adConfig.getCampaignId();
        if (adConfig != null) {
            str3 = adConfig.getCreativeId();
        }
        C9982ec ecVar = new C9982ec(a2, adUnitId, campaignId, str3);
        C9987eh ehVar = new C9987eh(this.f25060b, this.f25061c, this.f25065g, this.f25066h, this.f25062d, this.f25067i);
        C9985ef efVar = C9985ef.f25118a;
        OguryNetworkResponse execute = this.f25063e.newCall(new NetworkRequest(a, ShareTarget.METHOD_POST, C9985ef.m28871a(ehVar, ecVar, str2, esVar), this.f25059a.mo64482b())).execute();
        C10263mq.m29879a((Object) execute, "networkClient.newCall(request).execute()");
        return execute;
    }

    /* renamed from: b */
    public final OguryNetworkResponse mo64489b(String str) {
        C10263mq.m29882b(str, "url");
        OguryNetworkResponse execute = this.f25063e.newCall(new NetworkRequest(str, ShareTarget.METHOD_GET, "", this.f25059a.mo64483c())).execute();
        C10263mq.m29879a((Object) execute, "networkClient.newCall(re…t)\n            .execute()");
        return execute;
    }

    /* renamed from: a */
    public final OguryNetworkResponse mo64486a(JSONObject jSONObject) {
        C10263mq.m29882b(jSONObject, "requestBody");
        boolean a = C9965dt.m28763a(jSONObject);
        C9980ea eaVar = C9980ea.f25081a;
        OguryNetworkResponse execute = this.f25063e.newCall(new NetworkRequest(C9980ea.m28797a(a), ShareTarget.METHOD_POST, jSONObject.toString(), this.f25059a.mo64481a())).execute();
        C10263mq.m29879a((Object) execute, "networkClient.newCall(request).execute()");
        return execute;
    }

    /* renamed from: a */
    public final C9908cp mo64487a(JSONObject jSONObject, String str) {
        C10263mq.m29882b(jSONObject, "requestBody");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            C9980ea eaVar = C9980ea.f25081a;
            str = C9980ea.m28798b();
        }
        NetworkRequest networkRequest = new NetworkRequest(str, ShareTarget.METHOD_POST, jSONObject.toString(), this.f25059a.mo64483c());
        C9908cp.C9909a aVar = C9908cp.f24951a;
        return C9908cp.C9909a.m28615a(new C9973d(this, networkRequest));
    }

    /* renamed from: com.ogury.ed.internal.dx$d */
    static final class C9973d extends C10264mr implements C10227lj<C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C9969dx f25071a;

        /* renamed from: b */
        final /* synthetic */ NetworkRequest f25072b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9973d(C9969dx dxVar, NetworkRequest networkRequest) {
            super(0);
            this.f25071a = dxVar;
            this.f25072b = networkRequest;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m28785b();
            return C10182ke.f25542a;
        }

        /* renamed from: b */
        private void m28785b() {
            OguryNetworkResponse execute = this.f25071a.f25063e.newCall(this.f25072b).execute();
            if (execute instanceof OguryNetworkResponse.Failure) {
                Throwable exception = ((OguryNetworkResponse.Failure) execute).getException();
                C10263mq.m29879a((Object) exception, "response.exception");
                throw exception;
            }
        }
    }

    /* renamed from: b */
    public final C9908cp mo64490b(JSONObject jSONObject, String str) {
        C10263mq.m29882b(jSONObject, "requestBody");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            C9980ea eaVar = C9980ea.f25081a;
            str = C9980ea.m28799c();
        }
        NetworkRequest networkRequest = new NetworkRequest(str, ShareTarget.METHOD_POST, jSONObject.toString(), this.f25059a.mo64484d());
        C9908cp.C9909a aVar = C9908cp.f24951a;
        return C9908cp.C9909a.m28615a(new C9975f(this, networkRequest));
    }

    /* renamed from: com.ogury.ed.internal.dx$f */
    static final class C9975f extends C10264mr implements C10227lj<C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C9969dx f25075a;

        /* renamed from: b */
        final /* synthetic */ NetworkRequest f25076b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9975f(C9969dx dxVar, NetworkRequest networkRequest) {
            super(0);
            this.f25075a = dxVar;
            this.f25076b = networkRequest;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m28789b();
            return C10182ke.f25542a;
        }

        /* renamed from: b */
        private void m28789b() {
            OguryNetworkResponse execute = this.f25075a.f25063e.newCall(this.f25076b).execute();
            if (execute instanceof OguryNetworkResponse.Failure) {
                Throwable exception = ((OguryNetworkResponse.Failure) execute).getException();
                C10263mq.m29879a((Object) exception, "response.exception");
                throw exception;
            }
        }
    }

    /* renamed from: a */
    public final void mo64488a(String str) {
        C10263mq.m29882b(str, "url");
        NetworkRequest networkRequest = new NetworkRequest(str, ShareTarget.METHOD_GET, "", this.f25059a.mo64484d());
        C9908cp.C9909a aVar = C9908cp.f24951a;
        C9908cp.C9909a.m28615a(new C9972c(this, networkRequest)).mo64444a((C10228lk<? super Throwable, C10182ke>) new C9970a(C10051gf.f25281a)).mo64445a((C10227lj<C10182ke>) C9971b.f25068a);
    }

    /* renamed from: com.ogury.ed.internal.dx$c */
    static final class C9972c extends C10264mr implements C10227lj<C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C9969dx f25069a;

        /* renamed from: b */
        final /* synthetic */ NetworkRequest f25070b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9972c(C9969dx dxVar, NetworkRequest networkRequest) {
            super(0);
            this.f25069a = dxVar;
            this.f25070b = networkRequest;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m28783b();
            return C10182ke.f25542a;
        }

        /* renamed from: b */
        private void m28783b() {
            OguryNetworkResponse execute = this.f25069a.f25063e.newCall(this.f25070b).execute();
            if (execute instanceof OguryNetworkResponse.Failure) {
                Throwable exception = ((OguryNetworkResponse.Failure) execute).getException();
                C10263mq.m29879a((Object) exception, "response.exception");
                throw exception;
            }
        }
    }

    /* renamed from: com.ogury.ed.internal.dx$a */
    /* synthetic */ class C9970a extends C10262mp implements C10228lk<Throwable, C10182ke> {
        C9970a(Object obj) {
            super(1, obj, C10051gf.class, "e", "e(Ljava/lang/Throwable;)V");
        }

        /* renamed from: a */
        private static void m28780a(Throwable th) {
            C10263mq.m29882b(th, "p0");
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m28780a((Throwable) obj);
            return C10182ke.f25542a;
        }
    }

    /* renamed from: com.ogury.ed.internal.dx$b */
    static final class C9971b extends C10264mr implements C10227lj<C10182ke> {

        /* renamed from: a */
        public static final C9971b f25068a = new C9971b();

        C9971b() {
            super(0);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64355a() {
            return C10182ke.f25542a;
        }
    }

    /* renamed from: c */
    public final C9908cp mo64491c(JSONObject jSONObject, String str) {
        C10263mq.m29882b(jSONObject, "requestBody");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            C9980ea eaVar = C9980ea.f25081a;
            str = C9980ea.m28800d();
        }
        NetworkRequest networkRequest = new NetworkRequest(str, ShareTarget.METHOD_POST, jSONObject.toString(), this.f25059a.mo64484d());
        C9908cp.C9909a aVar = C9908cp.f24951a;
        return C9908cp.C9909a.m28615a(new C9974e(this, networkRequest));
    }

    /* renamed from: com.ogury.ed.internal.dx$e */
    static final class C9974e extends C10264mr implements C10227lj<C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C9969dx f25073a;

        /* renamed from: b */
        final /* synthetic */ NetworkRequest f25074b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9974e(C9969dx dxVar, NetworkRequest networkRequest) {
            super(0);
            this.f25073a = dxVar;
            this.f25074b = networkRequest;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m28787b();
            return C10182ke.f25542a;
        }

        /* renamed from: b */
        private void m28787b() {
            OguryNetworkResponse execute = this.f25073a.f25063e.newCall(this.f25074b).execute();
            if (execute instanceof OguryNetworkResponse.Failure) {
                Throwable exception = ((OguryNetworkResponse.Failure) execute).getException();
                C10263mq.m29879a((Object) exception, "response.exception");
                throw exception;
            }
        }
    }
}
