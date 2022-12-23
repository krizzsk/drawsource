package com.mbridge.msdk.video.signal.p371a;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.video.signal.C9620h;

/* renamed from: com.mbridge.msdk.video.signal.a.f */
/* compiled from: DefaultJSRewardVideoV1 */
public class C9510f implements C9620h {
    /* renamed from: a */
    public String mo63272a() {
        C8672v.m24874a("js", "getEndScreenInfo");
        return JsonUtils.EMPTY_JSON;
    }

    public void notifyCloseBtn(int i) {
        C8672v.m24874a("js", "notifyCloseBtn,state=" + i);
    }

    public void toggleCloseBtn(int i) {
        C8672v.m24874a("js", "toggleCloseBtn,state=" + i);
    }

    /* renamed from: a */
    public void mo63273a(String str) {
        C8672v.m24874a("js", "triggerCloseBtn,state=" + str);
    }

    /* renamed from: b */
    public void mo63274b(String str) {
        C8672v.m24874a("js", "setOrientation,landscape=" + str);
    }

    /* renamed from: c */
    public void mo63275c(String str) {
        C8672v.m24874a("js", "handlerPlayableException，msg=" + str);
    }
}
