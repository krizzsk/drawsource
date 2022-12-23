package com.fyber.inneractive.sdk.config.global.features;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.C4419a;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.b */
public class C4226b extends C4229e {

    /* renamed from: e */
    public C4419a f10423e;

    public C4226b() {
        super("cta_locale");
    }

    /* renamed from: b */
    public C4229e mo24234b() {
        C4226b bVar = new C4226b();
        mo24238a((C4229e) bVar);
        return bVar;
    }

    /* renamed from: e */
    public void mo24235e(String str) {
        if (!TextUtils.isEmpty(str) && this.f10423e == null) {
            String a = mo24237a("install_" + str, (String) null);
            String a2 = mo24237a("skip_ad_" + str, (String) null);
            this.f10423e = new C4419a(a, a2, mo24237a("skip_in_" + str, (String) null));
        }
    }
}
