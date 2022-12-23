package com.iab.omid.library.smaato.adsession.media;

import org.json.JSONException;
import org.json.JSONObject;
import p397e.C12467c;
import p397e.C12469e;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f19370a;

    /* renamed from: b */
    private final Float f19371b;

    /* renamed from: c */
    private final boolean f19372c;

    /* renamed from: d */
    private final Position f19373d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f19370a = z;
        this.f19371b = f;
        this.f19372c = z2;
        this.f19373d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C12469e.m33308a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C12469e.m33308a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo55927a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f19370a);
            if (this.f19370a) {
                jSONObject.put("skipOffset", this.f19371b);
            }
            jSONObject.put("autoPlay", this.f19372c);
            jSONObject.put("position", this.f19373d);
        } catch (JSONException e) {
            C12467c.m33303a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f19373d;
    }

    public Float getSkipOffset() {
        return this.f19371b;
    }

    public boolean isAutoPlay() {
        return this.f19372c;
    }

    public boolean isSkippable() {
        return this.f19370a;
    }
}
