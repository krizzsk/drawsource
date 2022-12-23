package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C4215e;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.util.C5277g0;
import com.fyber.inneractive.sdk.util.C5292l;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.response.c */
public class C5231c extends C5230b {
    /* renamed from: a */
    public void mo24320a(String str, C4287y yVar) throws IOException {
        String str2;
        C5234f fVar = (C5234f) this.f13854a;
        if (str == null) {
            str2 = null;
        } else {
            str2 = C5277g0.f13990g.mo26375a(str);
        }
        int i = C4215e.f10405a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.assetResponse");
        if (!TextUtils.isEmpty(property)) {
            String c = C5292l.m16513c(property);
            if (!TextUtils.isEmpty(c)) {
                str2 = c;
            }
        }
        fVar.f13891B = str2;
    }

    /* renamed from: b */
    public boolean mo24321b() {
        return true;
    }

    /* renamed from: a */
    public C5233e mo24319a() {
        C5234f fVar = new C5234f();
        this.f13854a = fVar;
        return fVar;
    }
}
