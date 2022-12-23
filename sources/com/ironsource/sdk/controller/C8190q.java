package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.ironsource.sdk.controller.C8202x;
import com.ironsource.sdk.p280c.C8123d;
import com.ironsource.sdk.p280c.C8125e;
import com.ironsource.sdk.p282e.p283a.C8283a;
import com.ironsource.sdk.p285g.C8300f;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.q */
public class C8190q {

    /* renamed from: a */
    private static final String f19905a = C8190q.class.getSimpleName();

    /* renamed from: b */
    private final Context f19906b;

    /* renamed from: c */
    private final C8283a f19907c = new C8283a();

    /* renamed from: com.ironsource.sdk.controller.q$a */
    static class C8191a {

        /* renamed from: a */
        String f19908a;

        /* renamed from: b */
        JSONObject f19909b;

        /* renamed from: c */
        String f19910c;

        /* renamed from: d */
        String f19911d;

        private C8191a() {
        }

        /* synthetic */ C8191a(byte b) {
            this();
        }
    }

    public C8190q(Context context) {
        this.f19906b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo56482a(String str, C8202x.C8225d.C8255a aVar) {
        C8283a aVar2;
        JSONObject jSONObject = new JSONObject(str);
        C8191a aVar3 = new C8191a((byte) 0);
        aVar3.f19908a = jSONObject.optString("omidFunction");
        aVar3.f19909b = jSONObject.optJSONObject("omidParams");
        aVar3.f19910c = jSONObject.optString("success");
        aVar3.f19911d = jSONObject.optString("fail");
        C8300f fVar = new C8300f();
        if (aVar3.f19909b != null) {
            String optString = aVar3.f19909b.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString)) {
                fVar.mo56741a("adViewId", optString);
            }
        }
        try {
            String str2 = aVar3.f19908a;
            char c = 65535;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals("activate")) {
                        c = 0;
                        break;
                    }
                    break;
                case -984459207:
                    if (str2.equals("getOmidData")) {
                        c = 4;
                        break;
                    }
                    break;
                case 70701699:
                    if (str2.equals("finishSession")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1208109646:
                    if (str2.equals("impressionOccurred")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1850541012:
                    if (str2.equals("startSession")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c != 0) {
                if (c == 1) {
                    C8283a aVar4 = this.f19907c;
                    C8283a.C8284a a = C8283a.C8284a.m23604a(aVar3.f19909b);
                    if (!aVar4.f20176d) {
                        throw new IllegalStateException("OMID has not been activated");
                    } else if (!TextUtils.isEmpty(a.f20183g)) {
                        String str3 = a.f20183g;
                        if (!aVar4.f20175c.containsKey(str3)) {
                            C8125e a2 = C8123d.m23224a().mo56345a(str3);
                            if (a2 != null) {
                                AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(a.f20182f, a.f20181e, a.f20178b, a.f20179c, a.f20177a), AdSessionContext.createHtmlAdSessionContext(aVar4.f20174b, a2.mo56331b(), (String) null, a.f20180d));
                                createAdSession.registerAdView(a2.mo56331b());
                                createAdSession.start();
                                aVar4.f20175c.put(str3, createAdSession);
                            } else {
                                throw new IllegalStateException("No adview found with the provided adViewId");
                            }
                        } else {
                            throw new IllegalStateException("OMID Session has already started");
                        }
                    } else {
                        throw new IllegalStateException("Missing adview id in OMID params");
                    }
                } else if (c == 2) {
                    C8283a aVar5 = this.f19907c;
                    JSONObject jSONObject2 = aVar3.f19909b;
                    aVar5.mo56713a(jSONObject2);
                    String optString2 = jSONObject2.optString("adViewId");
                    AdSession adSession = aVar5.f20175c.get(optString2);
                    if (adSession != null) {
                        adSession.finish();
                        aVar5.f20175c.remove(optString2);
                    } else {
                        throw new IllegalStateException("OMID Session has not started");
                    }
                } else if (c == 3) {
                    C8283a aVar6 = this.f19907c;
                    JSONObject jSONObject3 = aVar3.f19909b;
                    aVar6.mo56713a(jSONObject3);
                    AdSession adSession2 = aVar6.f20175c.get(jSONObject3.optString("adViewId"));
                    if (adSession2 != null) {
                        AdEvents createAdEvents = AdEvents.createAdEvents(adSession2);
                        if (jSONObject3.optBoolean("signalLoaded")) {
                            createAdEvents.loaded();
                        }
                        createAdEvents.impressionOccurred();
                    } else {
                        throw new IllegalStateException("OMID Session has not started");
                    }
                } else if (c == 4) {
                    aVar2 = this.f19907c;
                } else {
                    throw new IllegalArgumentException(String.format("%s | unsupported OMID API", new Object[]{aVar3.f19908a}));
                }
                aVar.mo56641a(true, aVar3.f19910c, fVar);
            }
            C8283a aVar7 = this.f19907c;
            Context context = this.f19906b;
            if (!aVar7.f20176d) {
                Omid.activate(context);
                aVar7.f20176d = true;
            }
            aVar2 = this.f19907c;
            fVar = aVar2.mo56712a();
            aVar.mo56641a(true, aVar3.f19910c, fVar);
        } catch (Exception e) {
            fVar.mo56741a("errMsg", e.getMessage());
            Logger.m23749i(f19905a, "OMIDJSAdapter " + aVar3.f19908a + " Exception: " + e.getMessage());
            aVar.mo56641a(false, aVar3.f19911d, fVar);
        }
    }
}
