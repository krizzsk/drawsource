package com.tapjoy.internal;

import com.vungle.warren.model.Advertisement;

/* renamed from: com.tapjoy.internal.da */
public enum C11348da {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL(Advertisement.KEY_POSTROLL),
    STANDALONE("standalone");
    

    /* renamed from: e */
    private final String f27104e;

    private C11348da(String str) {
        this.f27104e = str;
    }

    public final String toString() {
        return this.f27104e;
    }
}
