package com.ironsource.sdk.p282e.p283a;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.p285g.C8300f;
import com.ironsource.sdk.utils.SDKUtils;
import com.smaato.sdk.video.vast.model.StaticResource;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.e.a.a */
public final class C8283a {

    /* renamed from: a */
    public static final String f20173a = Omid.getVersion();

    /* renamed from: b */
    public final Partner f20174b = Partner.createPartner("Ironsrc", "7");

    /* renamed from: c */
    public final HashMap<String, AdSession> f20175c = new HashMap<>();

    /* renamed from: d */
    public boolean f20176d = false;

    /* renamed from: com.ironsource.sdk.e.a.a$a */
    public static class C8284a {

        /* renamed from: a */
        public boolean f20177a;

        /* renamed from: b */
        public Owner f20178b;

        /* renamed from: c */
        public Owner f20179c;

        /* renamed from: d */
        public String f20180d;

        /* renamed from: e */
        public ImpressionType f20181e;

        /* renamed from: f */
        public CreativeType f20182f;

        /* renamed from: g */
        public String f20183g;

        /* renamed from: h */
        private Owner f20184h;

        /* renamed from: a */
        public static C8284a m23604a(JSONObject jSONObject) {
            C8284a aVar = new C8284a();
            aVar.f20177a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String optString = jSONObject.optString("impressionOwner", "");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    aVar.f20178b = Owner.valueOf(optString.toUpperCase());
                    String optString2 = jSONObject.optString("videoEventsOwner", "");
                    if (!TextUtils.isEmpty(optString)) {
                        try {
                            aVar.f20179c = Owner.valueOf(optString2.toUpperCase());
                            aVar.f20180d = jSONObject.optString("customReferenceData", "");
                            aVar.f20182f = m23606c(jSONObject);
                            aVar.f20181e = m23605b(jSONObject);
                            String optString3 = jSONObject.optString("adViewId", "");
                            if (!TextUtils.isEmpty(optString3)) {
                                aVar.f20183g = optString3;
                                aVar.f20184h = m23607d(jSONObject);
                                return aVar;
                            }
                            throw new IllegalArgumentException("Missing adview id in OMID params" + optString3);
                        } catch (IllegalArgumentException unused) {
                            throw new IllegalArgumentException("Invalid OMID videoEventsOwner " + optString2);
                        }
                    } else {
                        throw new IllegalArgumentException("Missing OMID videoEventsOwner");
                    }
                } catch (IllegalArgumentException unused2) {
                    throw new IllegalArgumentException("Invalid OMID impressionOwner " + optString);
                }
            } else {
                throw new IllegalArgumentException("Missing OMID impressionOwner");
            }
        }

        /* renamed from: b */
        private static ImpressionType m23605b(JSONObject jSONObject) {
            String optString = jSONObject.optString("impressionType", "");
            if (!TextUtils.isEmpty(optString)) {
                for (ImpressionType impressionType : ImpressionType.values()) {
                    if (optString.equalsIgnoreCase(impressionType.toString())) {
                        return impressionType;
                    }
                }
                throw new IllegalArgumentException("Missing OMID creativeType" + optString);
            }
            throw new IllegalArgumentException("Missing OMID creativeType" + optString);
        }

        /* renamed from: c */
        private static CreativeType m23606c(JSONObject jSONObject) {
            String optString = jSONObject.optString(StaticResource.CREATIVE_TYPE, "");
            if (!TextUtils.isEmpty(optString)) {
                for (CreativeType creativeType : CreativeType.values()) {
                    if (optString.equalsIgnoreCase(creativeType.toString())) {
                        return creativeType;
                    }
                }
                throw new IllegalArgumentException("Missing OMID creativeType" + optString);
            }
            throw new IllegalArgumentException("Missing OMID creativeType" + optString);
        }

        /* renamed from: d */
        private static Owner m23607d(JSONObject jSONObject) {
            try {
                return Owner.valueOf(jSONObject.optString("videoEventsOwner", "").toUpperCase());
            } catch (IllegalArgumentException unused) {
                return Owner.NONE;
            }
        }
    }

    /* renamed from: a */
    public final C8300f mo56712a() {
        C8300f fVar = new C8300f();
        fVar.mo56741a("omidVersion", SDKUtils.encodeString(f20173a));
        fVar.mo56741a("omidPartnerName", SDKUtils.encodeString("Ironsrc"));
        fVar.mo56741a("omidPartnerVersion", SDKUtils.encodeString("7"));
        fVar.mo56741a("omidActiveAdSessions", SDKUtils.encodeString(Arrays.toString(this.f20175c.keySet().toArray())));
        return fVar;
    }

    /* renamed from: a */
    public void mo56713a(JSONObject jSONObject) {
        if (!this.f20176d) {
            throw new IllegalStateException("OMID has not been activated");
        } else if (jSONObject == null) {
            throw new IllegalStateException("OMID Session has not started");
        }
    }
}
