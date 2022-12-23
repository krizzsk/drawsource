package com.ironsource.sdk.p278a;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* renamed from: com.ironsource.sdk.a.a */
public final class C8100a {

    /* renamed from: a */
    public HashMap<String, Object> f19613a = new HashMap<>();

    /* renamed from: a */
    public final C8100a mo56293a(String str, Object obj) {
        if (obj != null) {
            this.f19613a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
