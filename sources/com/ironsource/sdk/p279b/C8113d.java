package com.ironsource.sdk.p279b;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.b.d */
public final class C8113d {

    /* renamed from: a */
    HashMap<String, Boolean> f19666a = new HashMap<String, Boolean>() {
        {
            boolean z = true;
            put("isVisible", Boolean.valueOf(C8113d.this.f19667b == 0));
            put("isWindowVisible", Boolean.valueOf(C8113d.this.f19668c != 0 ? false : z));
            put("isShown", Boolean.FALSE);
            put("isViewVisible", Boolean.FALSE);
        }
    };

    /* renamed from: b */
    int f19667b = 4;

    /* renamed from: c */
    int f19668c = 4;

    C8113d() {
    }

    /* renamed from: a */
    public final JSONObject mo56325a() {
        return new JSONObject(this.f19666a);
    }
}
