package com.ironsource.sdk;

import com.ironsource.sdk.p288j.C8310a;
import com.ironsource.sdk.utils.SDKUtils;
import com.smaato.sdk.core.api.VideoType;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c */
public final class C8115c {

    /* renamed from: a */
    public boolean f19670a = false;

    /* renamed from: b */
    public boolean f19671b = false;

    /* renamed from: c */
    public C8099a f19672c = null;

    /* renamed from: d */
    public Map<String, String> f19673d;

    /* renamed from: e */
    public boolean f19674e;

    /* renamed from: f */
    private String f19675f;

    /* renamed from: g */
    private final C8310a f19676g;

    public C8115c(String str, C8310a aVar) {
        this.f19675f = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f19676g = (C8310a) SDKUtils.requireNonNull(aVar, "AdListener name can't be null");
    }

    /* renamed from: a */
    public final C8108b mo56326a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f19675f);
            jSONObject.put(VideoType.REWARDED, this.f19670a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new C8108b((this.f19671b || this.f19674e) ? C8263d.m23535a() : C8263d.m23537a(jSONObject), this.f19675f, this.f19670a, this.f19671b, this.f19674e, this.f19673d, this.f19676g, this.f19672c);
    }
}
