package com.ogury.p376cm.internal;

import com.ogury.core.OguryError;
import com.ogury.p376cm.internal.aacaa;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.accaa */
public final class accaa implements acbbc {

    /* renamed from: a */
    public static final aaaaa f24463a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.accaa$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo63913a(JSONObject jSONObject) {
        bbabc.m28052b(jSONObject, "jsonResponse");
        abbba abbba = abbba.f24320a;
        if (abbba.m27838f("CCPAF")) {
            if (jSONObject != null && jSONObject.has("sdk") && jSONObject.has("ccpaResponse") && jSONObject.optJSONObject("ccpaResponse").has("userConsent")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("ccpaResponse");
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("userConsent");
                abbba abbba2 = abbba.f24320a;
                abbcb c = abbba.m27831c();
                String optString = optJSONObject.optString("lastOpt");
                bbabc.m28049a((Object) optString, "ccpaResponse.optString(LAST_OPT)");
                c.mo63842a(aacaa.aaaaa.m27775d(optString));
                abbba abbba3 = abbba.f24320a;
                abcaa d = abbba.m27831c().mo63846d();
                String optString2 = optJSONObject.optString("uspString");
                bbabc.m28049a((Object) optString2, "ccpaResponse.optString(USP_STRING)");
                d.mo63854a(optString2);
                abbba abbba4 = abbba.f24320a;
                abbba.m27831c().mo63846d().mo63860d(optJSONObject.optBoolean("ccpaApplies"));
                abbba abbba5 = abbba.f24320a;
                abbba.m27831c().mo63846d().mo63855a(optJSONObject2.optBoolean("explicitNotice"));
                abbba abbba6 = abbba.f24320a;
                abbba.m27831c().mo63846d().mo63856b(optJSONObject2.optBoolean("optOutSale"));
                abbba abbba7 = abbba.f24320a;
                abbba.m27831c().mo63846d().mo63858c(optJSONObject2.optBoolean("lspa"));
            } else {
                abbba abbba8 = abbba.f24320a;
                abbba.m27824a(new acbcc(false, new OguryError(1004, "Json not valid")));
            }
        }
        return false;
    }
}
