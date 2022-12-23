package com.unity3d.ads;

import com.unity3d.services.core.log.C12065a;
import org.json.JSONException;
import org.json.JSONObject;

public class UnityAdsBaseOptions {

    /* renamed from: a */
    private JSONObject f28237a = new JSONObject();

    /* renamed from: b */
    private String f28238b = "objectId";

    public JSONObject getData() {
        return this.f28237a;
    }

    public void set(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                this.f28237a.put(str, str2);
            } catch (JSONException e) {
                C12065a.m32842a("Failed to set Unity Ads options", (Exception) e);
            }
        }
    }

    public void setObjectId(String str) {
        set(this.f28238b, str);
    }
}
