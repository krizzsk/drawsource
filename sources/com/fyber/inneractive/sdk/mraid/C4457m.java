package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.p191ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.web.C5349d;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.m */
public class C4457m extends C4443a {
    public C4457m(Map<String, String> map, C5349d dVar, C5306p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo24635a() {
        String str = this.f10962b.get("uri");
        if (str == null || "".equals(str)) {
            this.f10963c.mo26470a(C4450f.PLAY_VIDEO, "Video can't be played with null or empty URL");
            return;
        }
        L l = ((IAmraidWebViewController) this.f10963c).f14084g;
        if (l != null) {
            ((C5349d.C5355f) l).mo24894a(str);
        }
    }

    /* renamed from: c */
    public String mo24632c() {
        return this.f10962b.get("uri");
    }
}
