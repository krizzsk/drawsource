package com.unity3d.services.core.configuration;

import com.unity3d.services.core.misc.C12074d;
import com.unity3d.services.core.misc.C12079i;

public class PrivacyConfigStorage extends C12079i<PrivacyConfig> {

    /* renamed from: b */
    private static PrivacyConfigStorage f29305b;

    /* renamed from: c */
    private PrivacyConfig f29306c = new PrivacyConfig();

    private PrivacyConfigStorage() {
    }

    public static PrivacyConfigStorage getInstance() {
        if (f29305b == null) {
            f29305b = new PrivacyConfigStorage();
        }
        return f29305b;
    }

    public synchronized PrivacyConfig getPrivacyConfig() {
        return this.f29306c;
    }

    public synchronized void registerObserver(C12074d<PrivacyConfig> dVar) {
        super.registerObserver(dVar);
        if (this.f29306c.getPrivacyStatus() != PrivacyConfigStatus.UNKNOWN) {
            dVar.mo70863a(this.f29306c);
        }
    }

    public synchronized void setPrivacyConfig(PrivacyConfig privacyConfig) {
        this.f29306c = privacyConfig;
        mo71230a(privacyConfig);
    }
}
