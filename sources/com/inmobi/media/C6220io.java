package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.io */
/* compiled from: IdentityInfo */
public class C6220io {

    /* renamed from: a */
    private static final String f15680a = C6220io.class.getSimpleName();

    /* renamed from: a */
    public static Map<String, String> m18469a() {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("mk-version", C6184hx.m18342a());
            Boolean g = C6232iz.m18518a().mo35447g();
            if (g != null) {
                hashMap.put("u-id-adt", String.valueOf(g.booleanValue() ? 1 : 0));
            }
            hashMap.put(CampaignEx.JSON_KEY_ST_TS, String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar instance = Calendar.getInstance();
            hashMap.put("tz", String.valueOf(instance.get(15) + instance.get(16)));
            C6222iq a = C6222iq.m18501a();
            HashMap hashMap2 = new HashMap();
            if (a.f15699d && a.f15696a != null) {
                hashMap2.put("u-s-id", a.f15696a);
            }
            hashMap.putAll(hashMap2);
        } catch (Exception unused) {
        }
        return hashMap;
    }
}
