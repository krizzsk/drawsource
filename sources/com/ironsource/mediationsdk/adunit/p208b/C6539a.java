package com.ironsource.mediationsdk.adunit.p208b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.adunit.b.a */
public final class C6539a extends C6546f {
    public C6539a(C6542d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo36436a() {
        mo36460a(C6540b.SESSION_CAPPED);
    }

    /* renamed from: a */
    public final void mo36437a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo36461a(C6540b.SHOW_AD, hashMap);
    }

    /* renamed from: a */
    public final void mo36438a(String str, int i, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str2);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str3);
        }
        mo36461a(C6540b.SHOW_AD_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo36439a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        mo36461a(C6540b.AD_CLOSED, hashMap);
    }

    /* renamed from: a */
    public final void mo36440a(String str, String str2, int i, long j, String str3, long j2, Map<String, Object> map, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j2 != 0) {
            hashMap.put("duration", Long.valueOf(j2));
        }
        hashMap.putAll(map);
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        mo36462a(C6540b.AD_REWARDED, hashMap, j);
    }

    /* renamed from: a */
    public final void mo36441a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", z ? "true" : "false");
        mo36461a(C6540b.SHOW_AD_CHANCE, hashMap);
    }

    /* renamed from: b */
    public final void mo36442b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo36461a(C6540b.SHOW_AD_SUCCESS, hashMap);
    }

    /* renamed from: c */
    public final void mo36443c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo36461a(C6540b.AD_OPENED, hashMap);
    }

    /* renamed from: d */
    public final void mo36444d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo36461a(C6540b.AD_CLICKED, hashMap);
    }

    /* renamed from: e */
    public final void mo36445e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo36461a(C6540b.AD_STARTED, hashMap);
    }

    /* renamed from: f */
    public final void mo36446f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo36461a(C6540b.AD_ENDED, hashMap);
    }

    /* renamed from: g */
    public final void mo36447g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo36461a(C6540b.AD_VISIBLE, hashMap);
    }

    /* renamed from: h */
    public final void mo36448h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo36461a(C6540b.PLACEMENT_CAPPED, hashMap);
    }
}
