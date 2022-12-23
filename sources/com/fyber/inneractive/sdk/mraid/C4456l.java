package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.C5262d0;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5349d;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.l */
public class C4456l extends C4443a {
    public C4456l(Map<String, String> map, C5349d dVar, C5306p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: d */
    public void mo24633d() {
        C5349d dVar = this.f10963c;
        if (dVar != null) {
            dVar.mo26470a(C4450f.OPEN, "No native click was detected in a timely fashion");
        }
    }

    /* renamed from: a */
    public void mo24635a() {
        C5262d0.C5263a aVar;
        String str;
        String str2;
        String str3 = this.f10962b.get("url");
        IAlog.m16449d("IAmraidActionOpen: opening Internal Browser For Url: %s", str3);
        C5349d dVar = this.f10963c;
        if (dVar != null) {
            C5306p0 p0Var = this.f10964d;
            L l = dVar.f14084g;
            if (l != null) {
                aVar = ((C5349d.C5355f) l).mo24886a(str3, p0Var);
            } else {
                C5262d0.C5265c cVar = C5262d0.C5265c.FAILED;
                Exception exc = new Exception("No webview listener available");
                if (dVar.mo26479g() == null) {
                    str2 = "null";
                } else {
                    str2 = dVar.mo26479g().getClass().getName();
                }
                aVar = new C5262d0.C5263a(cVar, exc, str2);
            }
            if (aVar.f13957a == C5262d0.C5265c.FAILED) {
                C5349d dVar2 = this.f10963c;
                C4450f fVar = C4450f.OPEN;
                Throwable th = aVar.f13958b;
                if (th == null) {
                    str = "unknown error";
                } else {
                    str = th.getMessage();
                }
                dVar2.mo26470a(fVar, str);
            }
        }
    }

    /* renamed from: c */
    public String mo24632c() {
        return this.f10962b.get("url");
    }
}
