package com.smaato.sdk.core.p382ub;

import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.smaato.sdk.core.p382ub.AutoValue_UbId;

/* renamed from: com.smaato.sdk.core.ub.UbId */
public abstract class UbId {

    /* renamed from: com.smaato.sdk.core.ub.UbId$Builder */
    public static abstract class Builder {
        public abstract Builder adSpaceId(String str);

        public abstract UbId build();

        public abstract Builder sessionId(String str);
    }

    public abstract String adSpaceId();

    public abstract String sessionId();

    UbId() {
    }

    public static UbId create(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        String[] split = str2.split(CertificateUtil.DELIMITER);
        if (split.length != 2) {
            return null;
        }
        String str3 = split[0];
        String str4 = split[1];
        if (!TextUtils.isEmpty(str4) && str.equalsIgnoreCase(str3)) {
            return builder().adSpaceId(str).sessionId(str4).build();
        }
        return null;
    }

    public static Builder builder() {
        return new AutoValue_UbId.Builder();
    }

    public String toString() {
        return adSpaceId() + CertificateUtil.DELIMITER + sessionId();
    }
}
