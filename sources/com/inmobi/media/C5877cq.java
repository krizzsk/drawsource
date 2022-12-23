package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.logger.IronSourceError;
import p405ms.p406bd.p407o.Pgl.C12600c;

/* renamed from: com.inmobi.media.cq */
/* compiled from: AdNetworkResponse */
public final class C5877cq {

    /* renamed from: a */
    public C6157hb f14846a;

    /* renamed from: b */
    public InMobiAdRequestStatus f14847b;

    /* renamed from: c */
    private C5876cp f14848c;

    public C5877cq(C5876cp cpVar, C6157hb hbVar) {
        this.f14848c = cpVar;
        this.f14846a = hbVar;
        if (hbVar.f15541a != null) {
            int i = this.f14846a.f15541a.f15517a;
            if (i == -8) {
                this.f14847b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED);
            } else if (i == -7) {
                this.f14847b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID);
                if (this.f14846a.f15541a.f15518b != null) {
                    this.f14847b.setCustomMessage(this.f14846a.f15541a.f15518b);
                }
            } else if (i != 0) {
                switch (i) {
                    case 500:
                    case IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE /*501*/:
                    case IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION /*502*/:
                    case 503:
                    case IronSourceError.ERROR_CODE_KEY_NOT_SET /*505*/:
                        this.f14847b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.SERVER_ERROR);
                        return;
                    case C12600c.COLLECT_MODE_TIKTOK_GUEST /*504*/:
                        this.f14847b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
                        return;
                    default:
                        this.f14847b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
                        return;
                }
            } else {
                this.f14847b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
            }
        }
    }
}
