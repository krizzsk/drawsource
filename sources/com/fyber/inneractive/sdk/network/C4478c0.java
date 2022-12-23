package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.fyber.inneractive.sdk.config.C4203a;
import com.fyber.inneractive.sdk.config.C4212d;
import com.fyber.inneractive.sdk.config.C4215e;
import com.fyber.inneractive.sdk.config.C4257k;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.config.global.features.C4225a;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.p188dv.C4306g;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.serverapi.C5240a;
import com.fyber.inneractive.sdk.serverapi.C5242b;
import com.fyber.inneractive.sdk.serverapi.C5243c;
import com.fyber.inneractive.sdk.util.C5290k;
import com.fyber.inneractive.sdk.util.C5291k0;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5310r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.network.c0 */
public class C4478c0 extends C4482e0<C5233e> implements C4500m {

    /* renamed from: g */
    public final InneractiveAdRequest f11008g;

    /* renamed from: h */
    public Map<String, String> f11009h;

    /* renamed from: i */
    public StringBuffer f11010i;

    /* renamed from: j */
    public final C5243c f11011j;

    /* renamed from: k */
    public C4306g f11012k;

    /* renamed from: l */
    public C4251s f11013l;

    /* renamed from: m */
    public boolean f11014m;

    public C4478c0(C4521u<C5233e> uVar, InneractiveAdRequest inneractiveAdRequest, C4251s sVar) {
        this(uVar, inneractiveAdRequest, new C5242b(sVar), C4522v.m13803b().mo24698a(), sVar);
    }

    /* renamed from: a */
    public String mo24640a() {
        String str;
        Boolean bool;
        String str2;
        String str3;
        String str4;
        int i = C4215e.f10405a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            str = "https://" + IAConfigManager.f10324J.f10343i.f10485f;
        } else {
            str = C4203a.m13185a(property, "clientRequestEnhancedXmlAd");
        }
        InneractiveAdRequest inneractiveAdRequest = this.f11008g;
        C5243c cVar = this.f11011j;
        C4480d0 d0Var = new C4480d0(inneractiveAdRequest, cVar);
        d0Var.f11018c = new HashMap();
        d0Var.mo24670a("fromSDK", Boolean.toString(true));
        d0Var.mo24670a("po", System.getProperty("ia.testEnvironmentConfiguration.number"));
        String str5 = "1";
        d0Var.mo24670a("secure", (C5310r.m16527a() ^ true) || IAConfigManager.f10324J.f10352r ? str5 : "0");
        d0Var.mo24670a("spotid", inneractiveAdRequest.getSpotId());
        String property2 = System.getProperty("ia.testEnvironmentConfiguration.chosenUnitId");
        if (property2 == null) {
            if (inneractiveAdRequest.getSelectedUnitConfig() == null) {
                property2 = null;
            } else {
                property2 = ((C4287y) inneractiveAdRequest.getSelectedUnitConfig()).f10544a;
            }
        }
        d0Var.mo24670a("uid", property2);
        IAConfigManager iAConfigManager = IAConfigManager.f10324J;
        if (!TextUtils.isEmpty(iAConfigManager.f10349o)) {
            d0Var.mo24670a("med", String.format("%s_%s", new Object[]{iAConfigManager.f10347m, iAConfigManager.f10349o}));
        } else {
            d0Var.mo24670a("med", iAConfigManager.f10347m);
        }
        cVar.getClass();
        d0Var.mo24670a(InneractiveMediationDefs.GENDER_FEMALE, Integer.toString(372));
        C5242b bVar = (C5242b) cVar;
        List<Integer> list = C5242b.f13904e;
        if (!list.isEmpty()) {
            d0Var.mo24670a("protocols", C5292l.m16502a(",", (Collection<Integer>) list));
        }
        List<String> list2 = C5242b.f13905f;
        if (!list2.isEmpty()) {
            d0Var.mo24670a("mimes", C5292l.m16509b(",", list2));
        }
        List<Integer> list3 = C5242b.f13903d;
        if (!list3.isEmpty()) {
            d0Var.mo24670a("api", C5292l.m16502a(",", (Collection<Integer>) list3));
        }
        d0Var.mo24670a("a", Integer.toString(iAConfigManager.f10344j.getAge()));
        InneractiveUserConfig.Gender gender = iAConfigManager.f10344j.getGender();
        if (InneractiveUserConfig.Gender.MALE.equals(gender)) {
            d0Var.mo24670a("g", InneractiveMediationDefs.GENDER_MALE);
        } else if (InneractiveUserConfig.Gender.FEMALE.equals(gender)) {
            d0Var.mo24670a("g", InneractiveMediationDefs.GENDER_FEMALE);
        }
        d0Var.mo24670a("zip", iAConfigManager.f10344j.getZipCode());
        d0Var.mo24670a(CampaignEx.JSON_KEY_AD_K, iAConfigManager.f10345k);
        d0Var.mo24670a("t", Long.toString(System.currentTimeMillis()));
        d0Var.mo24670a("v", bVar.mo26323a("2.2.0"));
        Boolean a = iAConfigManager.f10329D.mo24205a();
        if (a != null) {
            if (a.booleanValue()) {
                str4 = str5;
            } else {
                str4 = "0";
            }
            d0Var.mo24670a("gdpr_privacy_consent", str4);
        }
        C4212d dVar = iAConfigManager.f10329D;
        dVar.getClass();
        if (C5292l.f14015a == null) {
            bool = null;
        } else {
            bool = dVar.f10398f;
        }
        if (bool != null) {
            if (!bool.booleanValue()) {
                str5 = "0";
            }
            d0Var.mo24670a("lgpd_consent", str5);
        }
        String property3 = System.getProperty("ia.testEnvironmentConfiguration.device");
        String str6 = C4257k.m13294b() ? "amazonId" : "aaid";
        if (TextUtils.isEmpty(property3)) {
            property3 = C4257k.m13293a();
        }
        d0Var.mo24670a(str6, property3);
        d0Var.mo24670a("dnt", Boolean.toString(C4257k.m13295c()));
        d0Var.mo24670a("dml", bVar.mo26325b());
        int c = C5292l.m16512c(C5292l.m16516e());
        int c2 = C5292l.m16512c(C5292l.m16514d());
        if (c > 0 && c2 > 0) {
            d0Var.mo24670a("w", Integer.toString(c));
            d0Var.mo24670a("h", Integer.toString(c2));
        }
        int c3 = C5292l.m16511c();
        d0Var.mo24670a("o", c3 == 1 ? "p" : c3 == 2 ? "l" : "u");
        if (bVar.mo26337n() && iAConfigManager.f10353s) {
            d0Var.mo24670a("lg", bVar.mo26327d() + "," + bVar.mo26328e());
            d0Var.mo24670a("hacc", bVar.mo26326c());
            d0Var.mo24670a("vacc", bVar.mo26330g());
            d0Var.mo24670a("tacc", bVar.mo26329f());
        }
        d0Var.mo24670a("ciso", C5290k.m16489g());
        d0Var.mo24670a("os", APSAnalytics.OS_NAME);
        d0Var.mo24670a("mcc", bVar.mo26331h());
        d0Var.mo24670a("mnc", bVar.mo26332i());
        d0Var.mo24670a("nt", C5291k0.m16498f().f14014a);
        d0Var.mo24670a("crn", bVar.mo26321a());
        d0Var.mo24670a("lng", iAConfigManager.f10350p);
        List<String> list4 = iAConfigManager.f10351q;
        if (list4 != null && !list4.isEmpty()) {
            d0Var.mo24670a("in_lng", C5292l.m16509b(",", list4));
        }
        d0Var.mo24670a(BidResponsed.KEY_BID_ID, C5292l.f14015a.getPackageName());
        d0Var.mo24670a("appv", bVar.mo26334k());
        C4212d dVar2 = iAConfigManager.f10329D;
        dVar2.getClass();
        if (C5292l.f14015a == null) {
            str2 = null;
        } else {
            str2 = dVar2.f10394b;
        }
        d0Var.mo24670a("gdpr_consent_data", str2);
        C4212d dVar3 = iAConfigManager.f10329D;
        dVar3.getClass();
        if (C5292l.f14015a == null) {
            str3 = null;
        } else {
            str3 = dVar3.f10397e;
        }
        d0Var.mo24670a("us_privacy", str3);
        d0Var.mo24670a("mute_video", Boolean.toString(iAConfigManager.f10346l));
        d0Var.mo24670a("osv", Build.VERSION.RELEASE);
        HashMap hashMap = new HashMap();
        bVar.mo26324a(hashMap, inneractiveAdRequest.getSpotId());
        for (Map.Entry entry : hashMap.entrySet()) {
            d0Var.mo24670a((String) entry.getKey(), (String) entry.getValue());
        }
        Map<String, String> map = d0Var.f11018c;
        StringBuilder sb = new StringBuilder(str);
        boolean z = true;
        for (Map.Entry next : map.entrySet()) {
            sb.append(z ? "?" : "&");
            sb.append((String) next.getKey());
            sb.append("=");
            sb.append(Uri.encode((String) next.getValue()));
            z = false;
        }
        String sb2 = sb.toString();
        if (!this.f11014m) {
            int i2 = IAlog.f13936a;
            IAlog.m16444a(1, (Exception) null, "%s %s", "AD_REQUEST", sb2);
            this.f11014m = true;
        }
        return sb2;
    }

    /* renamed from: d */
    public StringBuffer mo24661d() {
        return this.f11010i;
    }

    /* renamed from: f */
    public C4499l0 mo24647f() {
        return C4499l0.HIGH;
    }

    /* renamed from: h */
    public C4251s mo24649h() {
        return this.f11013l;
    }

    /* renamed from: i */
    public C4508o0 mo24650i() {
        C4225a aVar;
        C4251s sVar = this.f11013l;
        if (sVar == null || (aVar = (C4225a) sVar.mo24264a(C4225a.class)) == null) {
            return super.mo24650i();
        }
        Integer b = aVar.mo24240b("connect_timeout");
        int i = 5000;
        int max = Math.max(b != null ? b.intValue() : 5000, 1);
        Integer b2 = aVar.mo24240b("read_timeout");
        if (b2 != null) {
            i = b2.intValue();
        }
        return new C4508o0(max, Math.max(i, 1));
    }

    /* renamed from: j */
    public boolean mo24651j() {
        return false;
    }

    /* renamed from: n */
    public C4528y mo24655n() {
        return C4528y.f11195b;
    }

    /* renamed from: o */
    public Map<String, String> mo24662o() {
        return this.f11009h;
    }

    /* renamed from: p */
    public int mo24656p() {
        return 0;
    }

    /* renamed from: q */
    public Map<String, String> mo24657q() {
        int i = C4215e.f10405a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        if (TextUtils.isEmpty(property)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mockadnetworkresponseid", property);
        IAlog.m16446a("NetworkRequestAd: Adding mock response header - %s", property);
        return hashMap;
    }

    public C4478c0(C4521u<C5233e> uVar, InneractiveAdRequest inneractiveAdRequest, C5243c cVar, C4486g gVar, C4251s sVar) {
        super(uVar, gVar);
        this.f11012k = null;
        this.f11014m = false;
        this.f11013l = sVar;
        this.f11008g = inneractiveAdRequest;
        this.f11011j = cVar;
    }

    /* renamed from: k */
    public byte[] mo24652k() {
        byte[] bArr = new byte[0];
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            C4251s sVar = ((C5242b) this.f11011j).f13906a;
            JSONArray d = sVar != null ? sVar.mo24269d() : null;
            if (d != null && d.length() > 0) {
                jSONObject2.put("experiments", d);
                jSONObject.put("sdk_experiments", jSONObject2);
            }
            UnitDisplayType a = C5240a.m16396a(this.f11008g.getSpotId());
            IAConfigManager iAConfigManager = IAConfigManager.f10324J;
            JSONArray a2 = iAConfigManager.f10358x.mo24210a(a);
            if (a2 != null && a2.length() > 0) {
                jSONObject.put("user_sessions", a2);
            }
            int a3 = iAConfigManager.f10356v.f10459b.mo24271a("dv_enabled", 0, 0);
            if (a != null && a3 == 1) {
                C4306g a4 = iAConfigManager.f10330E.mo24325a(a);
                this.f11012k = a4;
                if (a4 != null) {
                    jSONObject.put("gdem_signal", a4.f10568a.getQuery());
                }
            }
            if (Build.VERSION.SDK_INT >= 19) {
                bArr = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
            } else {
                bArr = jSONObject.toString().getBytes("UTF-8");
            }
            IAlog.m16446a("request json body - %s", jSONObject.toString());
        } catch (Exception unused) {
            IAlog.m16446a("Failed building body for ad request!", new Object[0]);
        }
        return bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072 A[Catch:{ Exception -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077 A[Catch:{ Exception -> 0x0081 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.network.C4472a0 mo24638a(java.io.InputStream r6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7, int r8) throws java.lang.Exception {
        /*
            r5 = this;
            r8 = 0
            if (r7 == 0) goto L_0x003a
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r7.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0010:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0010
            java.lang.Object r3 = r7.get(r2)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0010
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x0010
            java.lang.String r2 = r2.toLowerCase()
            java.lang.Object r3 = r3.get(r8)
            r0.put(r2, r3)
            goto L_0x0010
        L_0x0038:
            r5.f11009h = r0
        L_0x003a:
            r7 = 0
            if (r6 == 0) goto L_0x004d
            java.lang.StringBuffer r6 = com.fyber.inneractive.sdk.util.C5312s.m16535a((java.io.InputStream) r6, (boolean) r8)     // Catch:{ Exception -> 0x0042 }
            goto L_0x004b
        L_0x0042:
            r6 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r1 = "failed create response builder in network request ad"
            com.fyber.inneractive.sdk.util.IAlog.m16445a(r1, r6, r0)
            r6 = r7
        L_0x004b:
            r5.f11010i = r6
        L_0x004d:
            com.fyber.inneractive.sdk.network.a0 r6 = new com.fyber.inneractive.sdk.network.a0
            r6.<init>()
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.f11009h     // Catch:{ Exception -> 0x0081 }
            if (r0 == 0) goto L_0x006f
            java.lang.String r1 = "X-IA-Ad-Type"
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ Exception -> 0x0081 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0081 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0081 }
            if (r1 != 0) goto L_0x006f
            boolean r1 = android.text.TextUtils.isDigitsOnly(r0)     // Catch:{ Exception -> 0x0081 }
            if (r1 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r0 = r7
        L_0x0070:
            if (r0 == 0) goto L_0x0077
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0078
        L_0x0077:
            r0 = 6
        L_0x0078:
            com.fyber.inneractive.sdk.dv.g r1 = r5.f11012k     // Catch:{ Exception -> 0x0081 }
            com.fyber.inneractive.sdk.response.e r7 = r5.mo24671a(r0, r5, r7, r1)     // Catch:{ Exception -> 0x0081 }
            r6.f10996a = r7     // Catch:{ Exception -> 0x0081 }
            return r6
        L_0x0081:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r8 = "failed parse ad network request"
            com.fyber.inneractive.sdk.util.IAlog.m16445a(r8, r6, r7)
            com.fyber.inneractive.sdk.network.z r7 = new com.fyber.inneractive.sdk.network.z
            r7.<init>((java.lang.Exception) r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C4478c0.mo24638a(java.io.InputStream, java.util.Map, int):com.fyber.inneractive.sdk.network.a0");
    }
}
