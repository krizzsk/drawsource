package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.serverapi.C5243c;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.d0 */
public class C4480d0 {

    /* renamed from: a */
    public final InneractiveAdRequest f11016a;

    /* renamed from: b */
    public final C5243c f11017b;

    /* renamed from: c */
    public Map<String, String> f11018c;

    public C4480d0(InneractiveAdRequest inneractiveAdRequest, C5243c cVar) {
        this.f11016a = inneractiveAdRequest;
        this.f11017b = cVar;
    }

    /* renamed from: a */
    public final void mo24670a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f11018c.put(str, str2);
        }
    }
}
