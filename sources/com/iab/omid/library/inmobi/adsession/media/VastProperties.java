package com.iab.omid.library.inmobi.adsession.media;

import com.iab.omid.library.inmobi.p251d.C7844c;
import com.iab.omid.library.inmobi.p251d.C7846e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f18909a;

    /* renamed from: b */
    private final Float f18910b;

    /* renamed from: c */
    private final boolean f18911c;

    /* renamed from: d */
    private final Position f18912d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f18909a = z;
        this.f18910b = f;
        this.f18911c = z2;
        this.f18912d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C7846e.m22016a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C7846e.m22016a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo55133a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f18909a);
            if (this.f18909a) {
                jSONObject.put("skipOffset", this.f18910b);
            }
            jSONObject.put("autoPlay", this.f18911c);
            jSONObject.put("position", this.f18912d);
        } catch (JSONException e) {
            C7844c.m22011a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f18912d;
    }

    public Float getSkipOffset() {
        return this.f18910b;
    }

    public boolean isAutoPlay() {
        return this.f18911c;
    }

    public boolean isSkippable() {
        return this.f18909a;
    }
}
