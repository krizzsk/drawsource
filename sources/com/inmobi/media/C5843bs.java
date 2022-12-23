package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* renamed from: com.inmobi.media.bs */
/* compiled from: AdFetchFailureException */
public final class C5843bs extends RuntimeException {

    /* renamed from: a */
    public final InMobiAdRequestStatus f14698a;

    /* renamed from: b */
    public final byte f14699b;

    public C5843bs(InMobiAdRequestStatus inMobiAdRequestStatus, byte b) {
        this.f14698a = inMobiAdRequestStatus;
        this.f14699b = b;
    }

    public final String getMessage() {
        return this.f14698a.getMessage();
    }
}
