package com.ogury.p377ed.internal;

import android.content.Context;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.hq */
public final class C10097hq implements C10087hj {

    /* renamed from: a */
    public static final C10098a f25347a = new C10098a((byte) 0);

    /* renamed from: b */
    private final C10093ho f25348b;

    /* renamed from: c */
    private final C10096hp f25349c;

    /* renamed from: d */
    private C10227lj<C10182ke> f25350d;

    /* renamed from: e */
    private C10227lj<C10182ke> f25351e;

    /* renamed from: f */
    private C10047gb f25352f = new C10048gc();

    /* renamed from: g */
    private final String[] f25353g = {"ogyCreateWebView", "ogyUpdateWebView", "ogyCloseWebView", "ogyNavigateBack", "ogyNavigateForward"};

    public C10097hq(C10093ho hoVar, C10096hp hpVar) {
        C10263mq.m29882b(hoVar, "browser");
        C10263mq.m29882b(hpVar, "multiWebViewCommandExecutor");
        this.f25348b = hoVar;
        this.f25349c = hpVar;
    }

    /* renamed from: a */
    public final void mo64849a(C10227lj<C10182ke> ljVar) {
        this.f25350d = ljVar;
    }

    /* renamed from: b */
    public final void mo64850b(C10227lj<C10182ke> ljVar) {
        this.f25351e = ljVar;
    }

    /* renamed from: com.ogury.ed.internal.hq$a */
    public static final class C10098a {
        public /* synthetic */ C10098a(byte b) {
            this();
        }

        private C10098a() {
        }
    }

    /* renamed from: a */
    public final boolean mo64822a(String str, C10158jh jhVar, C9981eb ebVar) {
        C10263mq.m29882b(str, "url");
        C10263mq.m29882b(jhVar, "webView");
        C10263mq.m29882b(ebVar, "ad");
        if (!C10090hl.m29328a(str)) {
            return false;
        }
        JSONObject jSONObject = new JSONObject(C10060gn.m29207a(C10090hl.m29329b(str)));
        String optString = jSONObject.optString("method", "");
        String optString2 = jSONObject.optString(TJAdUnitConstants.String.CALLBACK_ID, "");
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        C10263mq.m29879a((Object) optString, "command");
        C10263mq.m29879a((Object) optString2, TJAdUnitConstants.String.CALLBACK_ID);
        m29377a(optString, optJSONObject, optString2, jhVar);
        return C10184kg.m29748a(this.f25353g, optString);
    }

    /* renamed from: a */
    private final void m29377a(String str, JSONObject jSONObject, String str2, C10158jh jhVar) {
        switch (str.hashCode()) {
            case -1797727422:
                if (str.equals("ogyCloseWebView")) {
                    m29382c(jSONObject, str2, jhVar);
                    return;
                }
                return;
            case -1244773540:
                if (str.equals("ogyCreateWebView")) {
                    m29379a(jSONObject, str2, jhVar);
                    return;
                }
                return;
            case -692274449:
                if (str.equals("ogyUpdateWebView")) {
                    m29381b(jSONObject, str2, jhVar);
                    return;
                }
                return;
            case 960350259:
                if (str.equals("ogyNavigateForward")) {
                    m29380b(jSONObject);
                    return;
                }
                return;
            case 1635219001:
                if (str.equals("ogyNavigateBack")) {
                    m29378a(jSONObject);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m29379a(JSONObject jSONObject, String str, C10158jh jhVar) {
        C10047gb gbVar = this.f25352f;
        Context context = jhVar.getContext();
        C10263mq.m29879a((Object) context, "webView.context");
        if (gbVar.mo64776a(context)) {
            C10108hw hwVar = C10108hw.f25383a;
            C10106hv a = C10108hw.m29432a(jSONObject);
            this.f25348b.mo64829a(a);
            C10096hp.m29370a(jhVar, str, a.mo64866c());
            C10227lj<C10182ke> ljVar = this.f25350d;
            if (ljVar != null) {
                ljVar.mo64355a();
                return;
            }
            return;
        }
        C10227lj<C10182ke> ljVar2 = this.f25351e;
        if (ljVar2 != null) {
            ljVar2.mo64355a();
        }
    }

    /* renamed from: b */
    private final void m29381b(JSONObject jSONObject, String str, C10158jh jhVar) {
        C10108hw hwVar = C10108hw.f25383a;
        C10106hv a = C10108hw.m29432a(jSONObject);
        this.f25348b.mo64833b(a);
        C10096hp.m29370a(jhVar, str, a.mo64866c());
    }

    /* renamed from: c */
    private final void m29382c(JSONObject jSONObject, String str, C10158jh jhVar) {
        String optString = jSONObject.optString("webViewId", "");
        C10093ho hoVar = this.f25348b;
        C10263mq.m29879a((Object) optString, "webViewId");
        hoVar.mo64831a(optString);
        C10096hp.m29370a(jhVar, str, optString);
    }

    /* renamed from: a */
    private final void m29378a(JSONObject jSONObject) {
        String optString = jSONObject.optString("webViewId", "");
        C10093ho hoVar = this.f25348b;
        C10263mq.m29879a((Object) optString, "webViewId");
        hoVar.mo64835b(optString);
    }

    /* renamed from: b */
    private final void m29380b(JSONObject jSONObject) {
        String optString = jSONObject.optString("webViewId", "");
        C10093ho hoVar = this.f25348b;
        C10263mq.m29879a((Object) optString, "webViewId");
        hoVar.mo64838c(optString);
    }
}
