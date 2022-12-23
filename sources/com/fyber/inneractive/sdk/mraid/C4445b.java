package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.web.C5349d;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.b */
public abstract class C4445b {

    /* renamed from: a */
    public String f10961a;

    /* renamed from: b */
    public Map<String, String> f10962b;

    /* renamed from: c */
    public C5349d f10963c;

    /* renamed from: d */
    public C5306p0 f10964d;

    public C4445b(Map<String, String> map, C5349d dVar, C5306p0 p0Var) {
        this.f10962b = map;
        this.f10964d = p0Var;
        this.f10963c = dVar;
    }

    /* renamed from: a */
    public int mo24634a(String str) {
        String str2 = this.f10962b.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2, 10);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public abstract void mo24635a();

    /* renamed from: b */
    public abstract boolean mo24631b();
}
