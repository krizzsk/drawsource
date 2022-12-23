package com.ogury.p376cm.internal;

import com.ogury.core.OguryError;
import com.ogury.p376cm.internal.aacaa;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.accab */
public abstract class accab implements acbbc {

    /* renamed from: a */
    public static final aaaaa f24464a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.accab$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public abstract String mo63919a();

    /* renamed from: a */
    public boolean mo63913a(JSONObject jSONObject) {
        bbabc.m28052b(jSONObject, "jsonResponse");
        if (jSONObject != null && jSONObject.has("sdk") && jSONObject.has("response") && jSONObject.optJSONObject("response").has(mo63919a())) {
            JSONObject optJSONObject = jSONObject.optJSONObject("response");
            if (optJSONObject.has("lastOpt")) {
                abbba abbba = abbba.f24320a;
                abbcb c = abbba.m27831c();
                String optString = optJSONObject.optString("lastOpt");
                bbabc.m28049a((Object) optString, "responseObject.optString(LAST_OPT)");
                c.mo63842a(aacaa.aaaaa.m27775d(optString));
            }
            return true;
        }
        abbba abbba2 = abbba.f24320a;
        abbba.m27824a(new acbcc(false, new OguryError(1004, "Json not valid")));
        return false;
    }
}
