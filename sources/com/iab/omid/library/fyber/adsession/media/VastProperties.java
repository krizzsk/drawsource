package com.iab.omid.library.fyber.adsession.media;

import com.iab.omid.library.fyber.p245d.C7793c;
import com.iab.omid.library.fyber.p245d.C7795e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f18793a;

    /* renamed from: b */
    private final Float f18794b;

    /* renamed from: c */
    private final boolean f18795c;

    /* renamed from: d */
    private final Position f18796d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f18793a = z;
        this.f18794b = f;
        this.f18795c = z2;
        this.f18796d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C7795e.m21790a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C7795e.m21790a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo54938a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f18793a);
            if (this.f18793a) {
                jSONObject.put("skipOffset", this.f18794b);
            }
            jSONObject.put("autoPlay", this.f18795c);
            jSONObject.put("position", this.f18796d);
        } catch (JSONException e) {
            C7793c.m21785a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f18796d;
    }

    public Float getSkipOffset() {
        return this.f18794b;
    }

    public boolean isAutoPlay() {
        return this.f18795c;
    }

    public boolean isSkippable() {
        return this.f18793a;
    }
}
