package com.iab.omid.library.oguryco.adsession;

import com.iab.omid.library.oguryco.p269d.C7993b;
import com.iab.omid.library.oguryco.p269d.C7997e;
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
        C7997e.m22696a((Object) creativeType2, "CreativeType is null");
        C7997e.m22696a((Object) impressionType2, "ImpressionType is null");
        C7997e.m22696a((Object) owner, "Impression owner is null");
        C7997e.m22694a(owner, creativeType2, impressionType2);
        return new AdSessionConfiguration(creativeType2, impressionType2, owner, owner2, z);
    }

    @Deprecated
    public static AdSessionConfiguration createAdSessionConfiguration(Owner owner, Owner owner2) {
        return createAdSessionConfiguration(owner, owner2, true);
    }

    public static AdSessionConfiguration createAdSessionConfiguration(Owner owner, Owner owner2, boolean z) {
        C7997e.m22696a((Object) owner, "Impression owner is null");
        C7997e.m22694a(owner, (CreativeType) null, (ImpressionType) null);
        return new AdSessionConfiguration((CreativeType) null, (ImpressionType) null, owner, owner2, z);
    }

    public boolean isNativeImpressionOwner() {
        return Owner.NATIVE == this.impressionOwner;
    }

    public boolean isNativeMediaEventsOwner() {
        return Owner.NATIVE == this.mediaEventsOwner;
    }

    public boolean isNativeVideoEventsOwner() {
        return isNativeMediaEventsOwner();
    }

    public JSONObject toJsonObject() {
        String str;
        Object obj;
        JSONObject jSONObject = new JSONObject();
        C7993b.m22680a(jSONObject, "impressionOwner", this.impressionOwner);
        if (this.creativeType == null || this.impressionType == null) {
            obj = this.mediaEventsOwner;
            str = "videoEventsOwner";
        } else {
            C7993b.m22680a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
            C7993b.m22680a(jSONObject, StaticResource.CREATIVE_TYPE, this.creativeType);
            obj = this.impressionType;
            str = "impressionType";
        }
        C7993b.m22680a(jSONObject, str, obj);
        C7993b.m22680a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
