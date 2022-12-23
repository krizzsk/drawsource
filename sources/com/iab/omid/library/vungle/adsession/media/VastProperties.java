package com.iab.omid.library.vungle.adsession.media;

import com.iab.omid.library.vungle.p275d.C8058c;
import com.iab.omid.library.vungle.p275d.C8060e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f19442a;

    /* renamed from: b */
    private final Float f19443b;

    /* renamed from: c */
    private final boolean f19444c;

    /* renamed from: d */
    private final Position f19445d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f19442a = z;
        this.f19443b = f;
        this.f19444c = z2;
        this.f19445d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C8060e.m23017a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C8060e.m23017a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo56050a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f19442a);
            if (this.f19442a) {
                jSONObject.put("skipOffset", this.f19443b);
            }
            jSONObject.put("autoPlay", this.f19444c);
            jSONObject.put("position", this.f19445d);
        } catch (JSONException e) {
            C8058c.m23012a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f19445d;
    }

    public Float getSkipOffset() {
        return this.f19443b;
    }

    public boolean isAutoPlay() {
        return this.f19444c;
    }

    public boolean isSkippable() {
        return this.f19442a;
    }
}
