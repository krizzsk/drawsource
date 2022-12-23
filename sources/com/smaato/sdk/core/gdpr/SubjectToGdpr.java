package com.smaato.sdk.core.gdpr;

import com.smaato.sdk.core.util.Objects;

public enum SubjectToGdpr {
    CMP_GDPR_ENABLED("1"),
    CMP_GDPR_DISABLED("0"),
    CMP_GDPR_UNKNOWN("-1");
    

    /* renamed from: id */
    public final String f26395id;

    private SubjectToGdpr(String str) {
        this.f26395id = (String) Objects.requireNonNull(str);
    }

    public static SubjectToGdpr getValueForString(String str) {
        for (SubjectToGdpr subjectToGdpr : values()) {
            if (subjectToGdpr.f26395id.equals(str)) {
                return subjectToGdpr;
            }
        }
        return null;
    }

    public String getId() {
        return this.f26395id;
    }
}
