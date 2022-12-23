package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p051c.C1869d;
import com.applovin.impl.sdk.p051c.C1870e;

/* renamed from: com.applovin.impl.sdk.utils.p */
public final class C2094p {

    /* renamed from: a */
    private final C1969m f4109a;

    /* renamed from: b */
    private String f4110b;

    /* renamed from: c */
    private final String f4111c;

    /* renamed from: d */
    private final String f4112d;

    public C2094p(C1969m mVar) {
        this.f4109a = mVar;
        this.f4111c = m5068a(C1869d.f3375g, (String) C1870e.m4103b(C1869d.f3374f, null, mVar.mo14520L()));
        this.f4112d = m5068a(C1869d.f3376h, (String) mVar.mo14534a(C1867b.f3096X));
        mo14979a(m5070d());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.applovin.impl.sdk.c.d, com.applovin.impl.sdk.c.d<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m5068a(com.applovin.impl.sdk.p051c.C1869d<java.lang.String> r3, java.lang.String r4) {
        /*
            r2 = this;
            com.applovin.impl.sdk.m r0 = r2.f4109a
            android.content.Context r0 = r0.mo14520L()
            r1 = 0
            java.lang.Object r0 = com.applovin.impl.sdk.p051c.C1870e.m4103b(r3, r1, (android.content.Context) r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)
            if (r1 == 0) goto L_0x0014
            return r0
        L_0x0014:
            boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r4)
            if (r0 == 0) goto L_0x001b
            goto L_0x0029
        L_0x001b:
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
        L_0x0029:
            com.applovin.impl.sdk.m r0 = r2.f4109a
            android.content.Context r0 = r0.mo14520L()
            com.applovin.impl.sdk.p051c.C1870e.m4101a(r3, r4, (android.content.Context) r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.C2094p.m5068a(com.applovin.impl.sdk.c.d, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m5069a(C1969m mVar) {
        String str = (String) mVar.mo14535a(C1869d.f3377i);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String valueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        mVar.mo14541a(C1869d.f3377i, valueOf);
        return valueOf;
    }

    /* renamed from: d */
    private String m5070d() {
        if (!((Boolean) this.f4109a.mo14534a(C1867b.f3307dy)).booleanValue()) {
            this.f4109a.mo14569b(C1869d.f3373e);
        }
        String str = (String) this.f4109a.mo14535a(C1869d.f3373e);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (C2102v.m5104a()) {
            C2102v A = this.f4109a.mo14509A();
            A.mo15012b("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    /* renamed from: a */
    public String mo14978a() {
        return this.f4110b;
    }

    /* renamed from: a */
    public void mo14979a(String str) {
        if (((Boolean) this.f4109a.mo14534a(C1867b.f3307dy)).booleanValue()) {
            this.f4109a.mo14541a(C1869d.f3373e, str);
        }
        this.f4110b = str;
        Bundle bundle = new Bundle(2);
        bundle.putString("user_id", StringUtils.emptyIfNull(str));
        bundle.putString("applovin_random_token", mo14981c());
        this.f4109a.mo14557ag().mo14480a(bundle, "user_info");
    }

    /* renamed from: b */
    public String mo14980b() {
        return this.f4111c;
    }

    /* renamed from: c */
    public String mo14981c() {
        return this.f4112d;
    }
}
