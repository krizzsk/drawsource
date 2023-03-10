package com.iab.omid.library.applovin.adsession;

import com.iab.omid.library.applovin.p239d.C7740b;
import com.iab.omid.library.applovin.p239d.C7744e;
import com.smaato.sdk.video.vast.model.StaticResource;
import org.json.JSONObject;

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
        C7744e.m21560a((Object) creativeType2, "CreativeType is null");
        C7744e.m21560a((Object) impressionType2, "ImpressionType is null");
        C7744e.m21560a((Object) owner, "Impression owner is null");
        C7744e.m21558a(owner, creativeType2, impressionType2);
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
        C7740b.m21543a(jSONObject, "impressionOwner", this.impressionOwner);
        C7740b.m21543a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C7740b.m21543a(jSONObject, StaticResource.CREATIVE_TYPE, this.creativeType);
        C7740b.m21543a(jSONObject, "impressionType", this.impressionType);
        C7740b.m21543a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
