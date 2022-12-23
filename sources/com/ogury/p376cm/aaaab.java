package com.ogury.p376cm;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.p376cm.internal.aabcc;
import com.ogury.p376cm.internal.aacaa;
import com.ogury.p376cm.internal.babca;
import com.ogury.p376cm.internal.bbabc;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.aaaab */
public final class aaaab {

    /* renamed from: a */
    public static final aaaab f24146a = new aaaab();

    private aaaab() {
    }

    /* renamed from: a */
    public static int m27640a(String str, int i, JSONObject jSONObject) {
        bbabc.m28052b(str, SDKConstants.PARAM_KEY);
        bbabc.m28052b(str, SDKConstants.PARAM_KEY);
        JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(str) : null;
        if (optJSONObject == null) {
            return 0;
        }
        bbabc.m28052b(optJSONObject, "jsonObject");
        Iterator<String> keys = optJSONObject.keys();
        bbabc.m28049a((Object) keys, "keysInJson");
        int i2 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = optJSONObject.optString(next);
            bbabc.m28049a((Object) optString, "jsonObject.optString(key)");
            Object[] array = aacaa.aaaaa.m27770a(aacaa.aaaaa.m27773b(optString)).toArray(new Integer[0]);
            if (array != null) {
                aabcc aabcc = aabcc.f24272a;
                if (aabcc.m27768a((Integer[]) array, i)) {
                    bbabc.m28049a((Object) next, SDKConstants.PARAM_KEY);
                    i2 += (int) Math.pow(2.0d, (double) Integer.parseInt(next));
                }
            } else {
                throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return i2;
    }
}
