package com.unity3d.services.core.configuration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class Experiments {

    /* renamed from: a */
    private final JSONObject f29219a;

    public Experiments() {
        this((JSONObject) null);
    }

    public JSONObject getExperimentData() {
        return this.f29219a;
    }

    public Map<String, String> getExperimentTags() {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = this.f29219a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, String.valueOf(this.f29219a.opt(next)));
        }
        return hashMap;
    }

    public boolean isForwardExperimentsToWebViewEnabled() {
        return this.f29219a.optBoolean("fff", false);
    }

    public boolean isNativeTokenEnabled() {
        return this.f29219a.optBoolean("tsi_nt", false);
    }

    public boolean isNativeWebViewCacheEnabled() {
        return this.f29219a.optBoolean("nwc", false);
    }

    public boolean isNewLifecycleTimer() {
        return this.f29219a.optBoolean("nlt", false);
    }

    public boolean isPrivacyRequestEnabled() {
        return this.f29219a.optBoolean("tsi_prr", false);
    }

    public boolean isTwoStageInitializationEnabled() {
        return this.f29219a.optBoolean("tsi", false);
    }

    public boolean isUpdatePiiFields() {
        return this.f29219a.optBoolean("tsi_upii", false);
    }

    public boolean isWebAssetAdCaching() {
        return this.f29219a.optBoolean("wac", false);
    }

    public boolean shouldNativeTokenAwaitPrivacy() {
        return this.f29219a.optBoolean("tsi_prw", false);
    }

    public Experiments(JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f29219a = new JSONObject();
        } else {
            this.f29219a = jSONObject;
        }
    }
}
