package com.bytedance.sdk.openadsdk.core.p154j.p155a;

import com.smaato.sdk.video.vast.model.ErrorCode;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.a.a */
/* compiled from: VastErrorCode */
public enum C3474a {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(ErrorCode.WRAPPER_REQUEST_TIMEOUT_ERROR),
    NO_ADS_VAST_RESPONSE(ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(ErrorCode.UNDEFINED_ERROR);
    

    /* renamed from: h */
    private final int f8682h;

    private C3474a(int i) {
        this.f8682h = i;
    }

    /* renamed from: a */
    public String mo19908a() {
        return String.valueOf(this.f8682h);
    }
}
