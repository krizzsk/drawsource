package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.k */
public abstract class C4496k {

    /* renamed from: a */
    public String f11050a;

    /* renamed from: b */
    public Map<String, Object> f11051b;

    /* renamed from: c */
    public String f11052c = null;

    public C4496k(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f11051b = new HashMap();
            this.f11050a = str;
            return;
        }
        throw new InvalidParameterException();
    }

    /* renamed from: a */
    public void mo24686a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.f11051b.put(str, obj);
        }
    }
}
