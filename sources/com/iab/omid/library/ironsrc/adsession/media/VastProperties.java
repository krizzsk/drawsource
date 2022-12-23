package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.p257d.C7894c;
import com.iab.omid.library.ironsrc.p257d.C7896e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f19022a;

    /* renamed from: b */
    private final Float f19023b;

    /* renamed from: c */
    private final boolean f19024c;

    /* renamed from: d */
    private final Position f19025d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f19022a = z;
        this.f19023b = f;
        this.f19024c = z2;
        this.f19025d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C7896e.m22237a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C7896e.m22237a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public final JSONObject mo55327a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f19022a);
            if (this.f19022a) {
                jSONObject.put("skipOffset", this.f19023b);
            }
            jSONObject.put("autoPlay", this.f19024c);
            jSONObject.put("position", this.f19025d);
        } catch (JSONException e) {
            C7894c.m22232a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f19025d;
    }

    public final Float getSkipOffset() {
        return this.f19023b;
    }

    public final boolean isAutoPlay() {
        return this.f19024c;
    }

    public final boolean isSkippable() {
        return this.f19022a;
    }
}
