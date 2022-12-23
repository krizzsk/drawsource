package com.ironsource.sdk;

import com.ironsource.sdk.p285g.C8293d;
import com.smaato.sdk.core.api.VideoType;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.d */
public final class C8263d {

    /* renamed from: a */
    private static String f20117a = "ManRewInst_";

    /* renamed from: a */
    public static String m23535a() {
        return String.valueOf(System.currentTimeMillis());
    }

    /* renamed from: a */
    public static String m23536a(C8108b bVar) {
        return (bVar.mo56308a() ? C8293d.C8298e.Banner : bVar.f19645a ? C8293d.C8298e.RewardedVideo : C8293d.C8298e.Interstitial).toString();
    }

    /* renamed from: a */
    public static String m23537a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean(VideoType.REWARDED)) {
            return jSONObject.optString("name");
        }
        return f20117a + jSONObject.optString("name");
    }
}
