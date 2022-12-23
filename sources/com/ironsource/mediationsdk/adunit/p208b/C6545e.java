package com.ironsource.mediationsdk.adunit.p208b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.b.e */
public final class C6545e extends C6546f {
    public C6545e(C6542d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo36454a() {
        mo36460a(C6540b.AUCTION_REQUEST);
    }

    /* renamed from: a */
    public final void mo36455a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        mo36461a(C6540b.AUCTION_SUCCESS, hashMap);
    }

    /* renamed from: a */
    public final void mo36456a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        mo36461a(C6540b.AUCTION_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo36457a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        mo36461a(C6540b.AUCTION_REQUEST_WATERFALL, hashMap);
    }

    /* renamed from: b */
    public final void mo36458b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        mo36461a(C6540b.AUCTION_RESULT_WATERFALL, hashMap);
    }

    /* renamed from: c */
    public final void mo36459c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("auctionId", str);
        mo36461a(C6540b.AD_UNIT_CAPPED, hashMap);
    }
}
