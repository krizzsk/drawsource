package com.unity3d.services.core.device.reader.pii;

import java.util.Locale;

/* renamed from: com.unity3d.services.core.device.reader.pii.e */
/* compiled from: PiiPrivacyMode */
public enum C12056e {
    APP,
    NONE,
    MIXED,
    UNDEFINED,
    NULL;

    /* renamed from: a */
    public static C12056e m32821a(String str) {
        if (str == null) {
            return NULL;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return UNDEFINED;
        }
    }
}
