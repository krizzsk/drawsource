package com.iab.omid.library.oguryco.adsession.media;

import com.iab.omid.library.oguryco.p269d.C7995c;
import com.iab.omid.library.oguryco.p269d.C7997e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f19253a;

    /* renamed from: b */
    private final Float f19254b;

    /* renamed from: c */
    private final boolean f19255c;

    /* renamed from: d */
    private final Position f19256d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f19253a = z;
        this.f19254b = f;
        this.f19255c = z2;
        this.f19256d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C7997e.m22696a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C7997e.m22696a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public final JSONObject mo55715a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f19253a);
            if (this.f19253a) {
                jSONObject.put("skipOffset", this.f19254b);
            }
            jSONObject.put("autoPlay", this.f19255c);
            jSONObject.put("position", this.f19256d);
        } catch (JSONException e) {
            C7995c.m22691a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f19256d;
    }

    public final Float getSkipOffset() {
        return this.f19254b;
    }

    public final boolean isAutoPlay() {
        return this.f19255c;
    }

    public final boolean isSkippable() {
        return this.f19253a;
    }
}
