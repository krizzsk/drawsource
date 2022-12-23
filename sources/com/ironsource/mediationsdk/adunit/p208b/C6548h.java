package com.ironsource.mediationsdk.adunit.p208b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.b.h */
public final class C6548h extends C6546f {
    public C6548h(C6542d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo36465a(long j, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        mo36461a(C6540b.LOAD_AD_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo36466a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        mo36461a(C6540b.LOAD_AD_FAILED_WITH_REASON, hashMap);
    }

    /* renamed from: a */
    public final void mo36467a(long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        if (z) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.valueOf(z));
        }
        mo36461a(C6540b.LOAD_AD_SUCCESS, hashMap);
    }

    /* renamed from: a */
    public final void mo36468a(boolean z) {
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.valueOf(z));
        }
        mo36461a(C6540b.LOAD_AD, hashMap);
    }

    /* renamed from: a */
    public final void mo36469a(boolean z, long j, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        if (z2) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS));
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired");
        }
        mo36461a(z ? C6540b.AD_AVAILABILITY_CHANGED_TRUE : C6540b.AD_AVAILABILITY_CHANGED_FALSE, hashMap);
    }

    /* renamed from: b */
    public final void mo36470b(long j, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        mo36461a(C6540b.LOAD_AD_NO_FILL, hashMap);
    }
}
