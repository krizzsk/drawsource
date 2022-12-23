package com.smaato.sdk.core.lgpd;

import com.smaato.sdk.core.util.Objects;

public enum ConsentToLgpd {
    CONSENT_LGPD_ENABLED("1"),
    CONSENT_LGPD_DISABLED("0"),
    CONSENT_LGPD_UNKNOWN("-1");
    

    /* renamed from: id */
    public final String f26400id;

    private ConsentToLgpd(String str) {
        this.f26400id = (String) Objects.requireNonNull(str);
    }

    public static ConsentToLgpd getValueForString(String str) {
        for (ConsentToLgpd consentToLgpd : values()) {
            if (consentToLgpd.f26400id.equals(str)) {
                return consentToLgpd;
            }
        }
        return null;
    }

    public String getId() {
        return this.f26400id;
    }
}
