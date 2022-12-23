package com.iab.omid.library.adcolony.adsession.media;

import com.iab.omid.library.adcolony.p227d.C7642c;
import com.iab.omid.library.adcolony.p227d.C7644e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f18442a;

    /* renamed from: b */
    private final Float f18443b;

    /* renamed from: c */
    private final boolean f18444c;

    /* renamed from: d */
    private final Position f18445d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f18442a = z;
        this.f18443b = f;
        this.f18444c = z2;
        this.f18445d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C7644e.m21100a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C7644e.m21100a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo54341a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f18442a);
            if (this.f18442a) {
                jSONObject.put("skipOffset", this.f18443b);
            }
            jSONObject.put("autoPlay", this.f18444c);
            jSONObject.put("position", this.f18445d);
        } catch (JSONException e) {
            C7642c.m21095a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f18445d;
    }

    public Float getSkipOffset() {
        return this.f18443b;
    }

    public boolean isAutoPlay() {
        return this.f18444c;
    }

    public boolean isSkippable() {
        return this.f18442a;
    }
}
