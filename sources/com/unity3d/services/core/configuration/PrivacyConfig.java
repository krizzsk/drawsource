package com.unity3d.services.core.configuration;

import org.json.JSONObject;

public class PrivacyConfig {

    /* renamed from: a */
    private final PrivacyConfigStatus f29303a;

    public PrivacyConfig() {
        this(PrivacyConfigStatus.UNKNOWN);
    }

    /* renamed from: a */
    private boolean m32649a(JSONObject jSONObject) {
        return jSONObject.optBoolean("pas", false);
    }

    public boolean allowedToSendPii() {
        return this.f29303a.equals(PrivacyConfigStatus.ALLOWED);
    }

    public PrivacyConfigStatus getPrivacyStatus() {
        return this.f29303a;
    }

    public PrivacyConfig(JSONObject jSONObject) {
        this.f29303a = m32649a(jSONObject) ? PrivacyConfigStatus.ALLOWED : PrivacyConfigStatus.DENIED;
    }

    public PrivacyConfig(PrivacyConfigStatus privacyConfigStatus) {
        this.f29303a = privacyConfigStatus;
    }
}
