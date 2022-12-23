package com.bytedance.sdk.openadsdk.p176j;

import com.tapjoy.TapjoyConstants;

/* renamed from: com.bytedance.sdk.openadsdk.j.d */
/* compiled from: NetType */
public enum C3798d {
    TYPE_2G("2g"),
    TYPE_3G("3g"),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI),
    TYPE_UNKNOWN(TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE);
    

    /* renamed from: g */
    private String f9782g;

    private C3798d(String str) {
        this.f9782g = str;
    }

    public String toString() {
        return this.f9782g;
    }
}
