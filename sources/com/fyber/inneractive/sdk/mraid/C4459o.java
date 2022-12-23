package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.web.C5349d;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.o */
public class C4459o extends C4445b {
    public C4459o(Map<String, String> map, C5349d dVar, C5306p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo24635a() {
        Map<String, String> map = this.f10962b;
        this.f10963c.setOrientationProperties(map == null || !map.containsKey("allowOrientationChange") || !"false".equals(this.f10962b.get("allowOrientationChange")), this.f10962b.get("forceOrientation"));
    }

    /* renamed from: b */
    public boolean mo24631b() {
        return false;
    }
}
