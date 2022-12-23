package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.C4252h;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* renamed from: com.fyber.inneractive.sdk.util.g */
public class C5276g {
    /* renamed from: a */
    public static boolean m16480a(UnitDisplayType unitDisplayType, C4252h hVar) {
        return !unitDisplayType.isFullscreenUnit() || hVar.mo24273a("use_fraud_detection_fullscreen", true);
    }
}
