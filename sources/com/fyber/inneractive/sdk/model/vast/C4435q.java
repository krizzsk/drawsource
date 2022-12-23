package com.fyber.inneractive.sdk.model.vast;

import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.tapjoy.TJAdUnitConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.model.vast.q */
public enum C4435q {
    EVENT_IMPRESSION("impression"),
    EVENT_START("start"),
    EVENT_FIRSTQ(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE),
    EVENT_MID("midpoint"),
    EVENT_THIRDQ(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE),
    EVENT_COMPLETE("complete"),
    EVENT_MUTE("mute"),
    EVENT_UNMUTE("unmute"),
    EVENT_FULLSCREEN("fullscreen"),
    EVENT_CREATIVE_VIEW("creativeView"),
    EVENT_CLICK("click"),
    EVENT_ERROR("error"),
    EVENT_REWIND("rewind"),
    EVENT_CLOSE("close"),
    EVENT_VERIFICATION_NOT_EXECUTED("verificationNotExecuted"),
    EVENT_EXPAND(MraidJsMethods.EXPAND),
    EVENT_COLLAPSE("collapse"),
    EVENT_CLOSE_LINEAR("closeLinear"),
    UNKNOWN("UnkownEvent");
    

    /* renamed from: u */
    public static final Map<String, C4435q> f10947u = null;

    /* renamed from: a */
    public final String f10949a;

    /* access modifiers changed from: public */
    static {
        f10947u = new HashMap();
        for (C4435q qVar : values()) {
            ((HashMap) f10947u).put(qVar.f10949a, qVar);
        }
    }

    /* access modifiers changed from: public */
    C4435q(String str) {
        this.f10949a = str;
    }

    /* renamed from: a */
    public static C4435q m13617a(String str) {
        HashMap hashMap = (HashMap) f10947u;
        return hashMap.containsKey(str) ? (C4435q) hashMap.get(str) : UNKNOWN;
    }
}
