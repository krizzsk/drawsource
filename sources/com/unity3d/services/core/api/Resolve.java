package com.unity3d.services.core.api;

import com.unity3d.services.core.request.C12093b;
import com.unity3d.services.core.request.C12097f;
import com.unity3d.services.core.request.C12098g;
import com.unity3d.services.core.request.C12104l;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Resolve {
    @WebViewExposed
    public static void resolve(String str, String str2, C12160l lVar) {
        if (C12104l.m32995a(str2, new C11977a(str))) {
            lVar.mo71347a(str);
            return;
        }
        lVar.mo71346a(C12097f.INVALID_HOST, str);
    }

    /* renamed from: com.unity3d.services.core.api.Resolve$a */
    static class C11977a implements C12093b {

        /* renamed from: a */
        final /* synthetic */ String f29119a;

        C11977a(String str) {
            this.f29119a = str;
        }

        /* renamed from: a */
        public void mo71021a(String str, String str2) {
            if (C12136a.m33103c() != null) {
                C12136a.m33103c().mo71310a((Enum) C12143b.RESOLVE, (Enum) C12098g.COMPLETE, this.f29119a, str, str2);
            }
        }

        /* renamed from: a */
        public void mo71020a(String str, C12097f fVar, String str2) {
            if (C12136a.m33103c() != null) {
                C12136a.m33103c().mo71310a((Enum) C12143b.RESOLVE, (Enum) C12098g.FAILED, this.f29119a, str, fVar.name(), str2);
            }
        }
    }
}
