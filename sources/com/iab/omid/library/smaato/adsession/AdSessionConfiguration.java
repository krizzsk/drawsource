package com.iab.omid.library.smaato.adsession;

import com.smaato.sdk.video.vast.model.StaticResource;
import org.json.JSONObject;
import p397e.C12465b;
import p397e.C12469e;

public class AdSessionConfiguration {
    private final CreativeType creativeType;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;

    private AdSessionConfiguration(CreativeType creativeType2, ImpressionType impressionType2, Owner owner, Owner owner2, boolean z) {
        this.creativeType = creativeType2;
        this.impressionType = impressionType2;
        this.impressionOwner = owner;
        if (owner2 == null) {
            this.mediaEventsOwner = Owner.NONE;
        } else {
            this.mediaEventsOwner = owner2;
        }
        this.isolateVerificationScripts = z;
    }

    public static AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType2, ImpressionType impressionType2, Owner owner, Owner owner2, boolean z) {
        C12469e.m33308a((Object) creativeType2, "CreativeType is null");
        C12469e.m33308a((Object) impressionType2, "ImpressionType is null");
        C12469e.m33308a((Object) owner, "Impression owner is null");
        C12469e.m33306a(owner, creativeType2, impressionType2);
        return new AdSessionConfiguration(creativeType2, impressionType2, owner, owner2, z);
    }

    public boolean isNativeImpressionOwner() {
        return Owner.NATIVE == this.impressionOwner;
    }

    public boolean isNativeMediaEventsOwner() {
        return Owner.NATIVE == this.mediaEventsOwner;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        C12465b.m33291a(jSONObject, "impressionOwner", this.impressionOwner);
        C12465b.m33291a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C12465b.m33291a(jSONObject, StaticResource.CREATIVE_TYPE, this.creativeType);
        C12465b.m33291a(jSONObject, "impressionType", this.impressionType);
        C12465b.m33291a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
