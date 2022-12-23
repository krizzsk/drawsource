package com.iab.omid.library.amazon.adsession.media;

import com.iab.omid.library.amazon.p233d.C7692c;
import com.iab.omid.library.amazon.p233d.C7694e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f18559a;

    /* renamed from: b */
    private final Float f18560b;

    /* renamed from: c */
    private final boolean f18561c;

    /* renamed from: d */
    private final Position f18562d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f18559a = z;
        this.f18560b = f;
        this.f18561c = z2;
        this.f18562d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C7694e.m21330a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C7694e.m21330a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo54540a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f18559a);
            if (this.f18559a) {
                jSONObject.put("skipOffset", this.f18560b);
            }
            jSONObject.put("autoPlay", this.f18561c);
            jSONObject.put("position", this.f18562d);
        } catch (JSONException e) {
            C7692c.m21325a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f18562d;
    }

    public Float getSkipOffset() {
        return this.f18560b;
    }

    public boolean isAutoPlay() {
        return this.f18561c;
    }

    public boolean isSkippable() {
        return this.f18559a;
    }
}
