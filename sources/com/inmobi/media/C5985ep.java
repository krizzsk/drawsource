package com.inmobi.media;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ep */
/* compiled from: OmidNativeTracker */
public final class C5985ep extends C5868ci {

    /* renamed from: i */
    private static final String f15173i = C5985ep.class.getSimpleName();

    /* renamed from: g */
    public final String f15174g;

    /* renamed from: h */
    public final String f15175h;

    public C5985ep(String str, String str2, String str3, String str4, Map<String, String> map) {
        super(str3, 0, str4, map);
        this.f15175h = str;
        this.f15174g = str2;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f14812a);
            jSONObject.put("url", this.f14813b);
            jSONObject.put("eventType", this.f14815d);
            jSONObject.put("eventId", this.f14814c);
            if (!TextUtils.isEmpty(this.f15175h)) {
                jSONObject.put("vendorKey", this.f15175h);
            }
            if (!TextUtils.isEmpty(this.f15174g)) {
                jSONObject.put("verificationParams", this.f15174g);
            }
            Map map = this.f14816e;
            if (map == null) {
                map = new HashMap();
            }
            jSONObject.put("extras", C6196id.m18384a((Map<String, String>) map, ","));
            return jSONObject.toString();
        } catch (JSONException e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return "";
        }
    }
}
