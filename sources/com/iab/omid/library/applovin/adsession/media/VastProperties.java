package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.p239d.C7742c;
import com.iab.omid.library.applovin.p239d.C7744e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f18676a;

    /* renamed from: b */
    private final Float f18677b;

    /* renamed from: c */
    private final boolean f18678c;

    /* renamed from: d */
    private final Position f18679d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f18676a = z;
        this.f18677b = f;
        this.f18678c = z2;
        this.f18679d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C7744e.m21560a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C7744e.m21560a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo54739a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f18676a);
            if (this.f18676a) {
                jSONObject.put("skipOffset", this.f18677b);
            }
            jSONObject.put("autoPlay", this.f18678c);
            jSONObject.put("position", this.f18679d);
        } catch (JSONException e) {
            C7742c.m21555a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f18679d;
    }

    public Float getSkipOffset() {
        return this.f18677b;
    }

    public boolean isAutoPlay() {
        return this.f18678c;
    }

    public boolean isSkippable() {
        return this.f18676a;
    }
}
