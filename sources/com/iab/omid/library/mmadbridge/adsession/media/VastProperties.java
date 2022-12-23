package com.iab.omid.library.mmadbridge.adsession.media;

import com.iab.omid.library.mmadbridge.p263d.C7944c;
import com.iab.omid.library.mmadbridge.p263d.C7946e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f19137a;

    /* renamed from: b */
    private final Float f19138b;

    /* renamed from: c */
    private final boolean f19139c;

    /* renamed from: d */
    private final Position f19140d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f19137a = z;
        this.f19138b = f;
        this.f19139c = z2;
        this.f19140d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C7946e.m22465a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C7946e.m22465a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo55517a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f19137a);
            if (this.f19137a) {
                jSONObject.put("skipOffset", this.f19138b);
            }
            jSONObject.put("autoPlay", this.f19139c);
            jSONObject.put("position", this.f19140d);
        } catch (JSONException e) {
            C7944c.m22460a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f19140d;
    }

    public Float getSkipOffset() {
        return this.f19138b;
    }

    public boolean isAutoPlay() {
        return this.f19139c;
    }

    public boolean isSkippable() {
        return this.f19137a;
    }
}
