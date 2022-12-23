package com.ogury.p376cm.internal;

import com.ogury.p376cm.internal.aacaa;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.accac */
public final class accac extends accab {

    /* renamed from: b */
    public static final aaaaa f24465b = new aaaaa((bbabb) null);

    /* renamed from: c */
    private String f24466c = "userConsent";

    /* renamed from: com.ogury.cm.internal.accac$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo63919a() {
        return this.f24466c;
    }

    /* renamed from: a */
    public final boolean mo63913a(JSONObject jSONObject) {
        bbabc.m28052b(jSONObject, "jsonResponse");
        abbba abbba = abbba.f24320a;
        if (!abbba.m27838f("TCF")) {
            return false;
        }
        boolean a = super.mo63913a(jSONObject);
        if (a) {
            abbba abbba2 = abbba.f24320a;
            abcac abcac = (abcac) abcab.m27881d();
            abcac.mo63869a(jSONObject.optJSONObject("iabResponse"));
            JSONObject optJSONObject = jSONObject.optJSONObject("response");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(this.f24466c);
            JSONObject optJSONObject3 = jSONObject.optJSONObject("sdk");
            bbabc.m28049a((Object) optJSONObject3, "jsonResponse.optJSONObject(SDK)");
            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("unifiedVendors");
            bbabc.m28049a((Object) optJSONObject4, "sdkObject.optJSONObject(UNIFIED_VENDORS)");
            abbba abbba3 = abbba.f24320a;
            abbba.m27831c().mo63843a(optJSONObject.optBoolean("hasPaid"));
            abcac.mo63865a(optJSONObject.optBoolean("gdprApplies", true));
            abcac.mo63868a(optJSONObject2.optInt("purposes"));
            abcac.mo63874c(optJSONObject2.optInt("specialFeatures"));
            String optString = optJSONObject2.optString(TJAdUnitConstants.String.VENDORS, "");
            bbabc.m28049a((Object) optString, "userConsent.optString(VENDORS, \"\")");
            Object[] array = aacaa.aaaaa.m27770a(aacaa.aaaaa.m27773b(optString)).toArray(new Integer[0]);
            if (array != null) {
                abcac.mo63870a((Integer[]) array);
                String optString2 = optJSONObject2.optString("vendorsLI", "");
                bbabc.m28049a((Object) optString2, "userConsent.optString(VENDORS_LI, \"\")");
                Object[] array2 = aacaa.aaaaa.m27770a(aacaa.aaaaa.m27773b(optString2)).toArray(new Integer[0]);
                if (array2 != null) {
                    abcac.mo63873b((Integer[]) array2);
                    abcac.mo63871b(optJSONObject2.optInt("purposesLI"));
                    abcac.mo63872b(optJSONObject4.optJSONObject(TJAdUnitConstants.String.VENDORS));
                    abcac.mo63875d(optJSONObject2.optInt("maxVendorId"));
                    String optString3 = optJSONObject.optString("iabString", "");
                    bbabc.m28049a((Object) optString3, "responseObject.optString(IAB_STRING, \"\")");
                    abcac.mo63864a(optString3);
                } else {
                    throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return a;
    }
}
