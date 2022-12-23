package com.ogury.p377ed.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.ogury.p377ed.internal.C10146iz;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.smaato.sdk.video.vast.model.Creative;
import com.tapjoy.TJAdUnitConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.it */
public abstract class C10137it implements C10087hj {

    /* renamed from: a */
    public static final C10138a f25456a = new C10138a((byte) 0);

    /* renamed from: b */
    private final C10078hb f25457b;

    /* renamed from: c */
    private C9925da f25458c = C9925da.f24975a;

    /* renamed from: a */
    public void mo64922a() {
    }

    /* renamed from: a */
    public void mo64925a(C9991ek ekVar) {
        C10263mq.m29882b(ekVar, "adUnit");
    }

    /* renamed from: a */
    public void mo64926a(C10146iz izVar) {
    }

    /* renamed from: a */
    public void mo64927a(String str) {
        C10263mq.m29882b(str, Creative.AD_ID);
    }

    /* renamed from: a */
    public void mo64928a(String str, String str2) {
        C10263mq.m29882b(str2, Creative.AD_ID);
    }

    /* renamed from: a */
    public void mo64929a(String str, String str2, String str3) {
        C10263mq.m29882b(str2, TJAdUnitConstants.String.CALLBACK_ID);
        C10263mq.m29882b(str3, Creative.AD_ID);
    }

    /* renamed from: a */
    public void mo64930a(Map<String, String> map, String str) {
        C10263mq.m29882b(map, "params");
        C10263mq.m29882b(str, "args");
    }

    /* renamed from: a */
    public void mo64923a(boolean z) {
    }

    /* renamed from: b */
    public void mo64931b() {
    }

    /* renamed from: b */
    public void mo64932b(String str) {
        C10263mq.m29882b(str, Creative.AD_ID);
    }

    /* renamed from: b */
    public void mo64933b(String str, String str2) {
        C10263mq.m29882b(str2, TJAdUnitConstants.String.CALLBACK_ID);
    }

    /* renamed from: b */
    public void mo64924b(boolean z) {
    }

    /* renamed from: c */
    public void mo64934c() {
    }

    /* renamed from: c */
    public void mo64935c(String str) {
        C10263mq.m29882b(str, Creative.AD_ID);
    }

    /* renamed from: c */
    public void mo64936c(boolean z) {
    }

    public C10137it(C10078hb hbVar) {
        C10263mq.m29882b(hbVar, "mraidCommandExecutor");
        this.f25457b = hbVar;
    }

    /* renamed from: com.ogury.ed.internal.it$a */
    public static final class C10138a {
        public /* synthetic */ C10138a(byte b) {
            this();
        }

        private C10138a() {
        }
    }

    /* renamed from: a */
    public final boolean mo64822a(String str, C10158jh jhVar, C9981eb ebVar) {
        C10263mq.m29882b(str, "url");
        C10263mq.m29882b(jhVar, "webView");
        C10263mq.m29882b(ebVar, "ad");
        C10060gn.m29207a(str);
        if (!m29584a(jhVar)) {
            return true;
        }
        m29581a(str, ebVar);
        return true;
    }

    /* renamed from: a */
    private static boolean m29584a(C10158jh jhVar) {
        return !C10263mq.m29881a((Object) jhVar.getAdState(), (Object) "hidden") && !C10263mq.m29881a((Object) jhVar.getAdState(), (Object) "loading");
    }

    /* renamed from: a */
    private final void m29581a(String str, C9981eb ebVar) {
        String str2;
        Map linkedHashMap = new LinkedHashMap();
        try {
            JSONObject d = m29588d(str);
            str2 = d.optString("method", "");
            C10263mq.m29879a((Object) str2, "json.optString(\"method\", \"\")");
            try {
                String optString = d.optString(TJAdUnitConstants.String.CALLBACK_ID);
                C10263mq.m29879a((Object) optString, "json.optString(\"callbackId\")");
                linkedHashMap.put(TJAdUnitConstants.String.CALLBACK_ID, optString);
                Object opt = d.opt("args");
                if (opt == null) {
                    opt = "";
                }
                m29580a(opt, (Map<String, String>) linkedHashMap);
                m29582a(str2, linkedHashMap, opt.toString(), ebVar);
            } catch (Exception e) {
                e = e;
                C9925da.m28653a(e);
                this.f25457b.mo64805a(str2, "");
            }
        } catch (Exception e2) {
            e = e2;
            str2 = "";
            C9925da.m28653a(e);
            this.f25457b.mo64805a(str2, "");
        }
    }

    /* renamed from: a */
    private static void m29580a(Object obj, Map<String, String> map) {
        if (obj != null && (obj instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            C10263mq.m29879a((Object) keys, UserMetadata.KEYDATA_FILENAME);
            while (keys.hasNext()) {
                String next = keys.next();
                C10263mq.m29879a((Object) next, SDKConstants.PARAM_KEY);
                String optString = jSONObject.optString(next, "");
                C10263mq.m29879a((Object) optString, "args.optString(key, \"\")");
                map.put(next, optString);
            }
        }
    }

    /* renamed from: d */
    private static JSONObject m29588d(String str) {
        int a = C10312oc.m29955a((CharSequence) str, "/?q=") + 4;
        if (str != null) {
            String substring = str.substring(a);
            C10263mq.m29879a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return new JSONObject(C10060gn.m29207a(substring));
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    private final void m29582a(String str, Map<String, String> map, String str2, C9981eb ebVar) {
        String str3 = "";
        switch (str.hashCode()) {
            case -1289167206:
                if (str.equals(MraidJsMethods.EXPAND)) {
                    mo64934c();
                    return;
                }
                return;
            case -984419449:
                if (str.equals("ogyResolveIntent")) {
                    String str4 = map.get("intentUri");
                    String str5 = map.get(TJAdUnitConstants.String.CALLBACK_ID);
                    if (str5 != null) {
                        str3 = str5;
                    }
                    mo64933b(str4, str3);
                    return;
                }
                return;
            case -934437708:
                if (str.equals(MraidJsMethods.RESIZE)) {
                    m29589d();
                    return;
                }
                return;
            case -840442113:
                if (str.equals(MraidJsMethods.UNLOAD)) {
                    mo64922a();
                    return;
                }
                return;
            case -12713460:
                if (str.equals("ogyOnAdImpression")) {
                    m29579a(ebVar);
                    return;
                }
                return;
            case 3417674:
                if (str.equals("open")) {
                    mo64928a(map.get("url"), ebVar.mo64530m().mo64575b());
                    return;
                }
                return;
            case 94756344:
                if (str.equals("close")) {
                    m29583a(map, false);
                    return;
                }
                return;
            case 451326307:
                if (str.equals("ogyCreateShortcut")) {
                    mo64930a(map, str2);
                    return;
                }
                return;
            case 624734601:
                if (str.equals("setResizeProperties")) {
                    m29590d(map);
                    return;
                }
                return;
            case 901631159:
                if (str.equals("ogyOnAdEvent")) {
                    mo64925a(ebVar.mo64530m());
                    return;
                }
                return;
            case 1121179396:
                if (str.equals("ogyOnAdClicked")) {
                    mo64932b(ebVar.mo64530m().mo64575b());
                    return;
                }
                return;
            case 1614272768:
                if (str.equals("useCustomClose")) {
                    m29587c(map);
                    return;
                }
                return;
            case 1622028878:
                if (str.equals("ogyForceClose")) {
                    m29583a(map, true);
                    return;
                }
                return;
            case 1805873469:
                if (str.equals("ogyStartIntent")) {
                    String str6 = map.get("intentUri");
                    String str7 = map.get(TJAdUnitConstants.String.CALLBACK_ID);
                    if (str7 != null) {
                        str3 = str7;
                    }
                    mo64929a(str6, str3, ebVar.mo64530m().mo64575b());
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m29583a(Map<String, String> map, boolean z) {
        boolean a = m29585a(map);
        if (z) {
            mo64936c(a);
        } else {
            mo64923a(a);
        }
        if (a) {
            m29586b(map);
        }
    }

    /* renamed from: a */
    private static boolean m29585a(Map<String, String> map) {
        String str = map.get("showNextAd");
        if (str == null) {
            return true;
        }
        return str.equals("true");
    }

    /* renamed from: b */
    private final void m29586b(Map<String, String> map) {
        String str = map.get("nextAdId");
        if (str == null) {
            str = "";
        }
        mo64927a(str);
    }

    /* renamed from: c */
    private final void m29587c(Map<String, String> map) {
        String str = map.get("useCustomClose");
        mo64924b(str == null ? false : str.equals("false"));
    }

    /* renamed from: d */
    private final void m29590d(Map<String, String> map) {
        C10146iz.C10147a aVar = C10146iz.f25479a;
        C10146iz a = C10146iz.C10147a.m29657a(map);
        mo64926a(a);
        if (a == null) {
            this.f25457b.mo64805a("setResizeProperties", "Wrong parameters");
        }
    }

    /* renamed from: d */
    private final void m29589d() {
        try {
            mo64931b();
        } catch (Throwable th) {
            C10078hb hbVar = this.f25457b;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            hbVar.mo64805a(MraidJsMethods.RESIZE, message);
        }
    }

    /* renamed from: a */
    private final void m29579a(C9981eb ebVar) {
        if (ebVar.mo64547y().mo64587a() && ebVar.mo64547y().mo64588b() == C9995eo.IMPRESSION_SOURCE_FORMAT) {
            mo64935c(ebVar.mo64530m().mo64575b());
        }
    }
}
