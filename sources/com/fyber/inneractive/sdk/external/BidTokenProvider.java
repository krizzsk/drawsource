package com.fyber.inneractive.sdk.external;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.C4151a;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C4507o;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

public final class BidTokenProvider {
    public static String getBidderToken() {
        boolean z = false;
        if (!InneractiveAdManager.wasInitialized()) {
            IAlog.m16447b("BidTokenProvider: Cannot generate token. Please init Fyber Marketplace SDK.", new Object[0]);
            return null;
        }
        C4151a aVar = C4151a.f10188h;
        if (aVar.f10194f.get() == null) {
            aVar.mo24015a();
        } else {
            aVar.mo24017b();
        }
        String str = aVar.f10194f.get();
        IAConfigManager iAConfigManager = IAConfigManager.f10324J;
        String str2 = iAConfigManager.f10347m;
        int i = 2000;
        if (!TextUtils.isEmpty(str2)) {
            i = iAConfigManager.f10356v.f10459b.mo24271a(aVar.f10193e.get(str2.toLowerCase()), 2000, 1);
        } else {
            str2 = "unknown";
        }
        if (str != null && str.getBytes().length > i) {
            C4507o oVar = C4507o.TOKEN_EXCEEDS_LIMIT;
            C4511q.C4512a aVar2 = new C4511q.C4512a((C5233e) null);
            aVar2.f11163b = oVar;
            aVar2.f11162a = null;
            aVar2.f11165d = null;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mediator", str2);
            } catch (Exception unused) {
                IAlog.m16450e("Got exception adding param to json object: %s, %s", "mediator", str2);
            }
            Integer valueOf = Integer.valueOf(str.getBytes().length);
            try {
                jSONObject.put("token_size", valueOf);
            } catch (Exception unused2) {
                IAlog.m16450e("Got exception adding param to json object: %s, %s", "token_size", valueOf);
            }
            Integer valueOf2 = Integer.valueOf(i);
            try {
                jSONObject.put("token_limit", valueOf2);
            } catch (Exception unused3) {
                IAlog.m16450e("Got exception adding param to json object: %s, %s", "token_limit", valueOf2);
            }
            aVar2.f11167f.put(jSONObject);
            aVar2.mo24693a((String) null);
            z = true;
        }
        if (z) {
            return null;
        }
        return str;
    }
}
