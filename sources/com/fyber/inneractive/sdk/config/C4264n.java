package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4245m;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.C4473b;
import com.fyber.inneractive.sdk.network.C4484f;
import com.fyber.inneractive.sdk.network.C4485f0;
import com.fyber.inneractive.sdk.network.C4501m0;
import com.fyber.inneractive.sdk.network.C4506n0;
import com.fyber.inneractive.sdk.network.C4521u;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* renamed from: com.fyber.inneractive.sdk.config.n */
public class C4264n implements C4521u<IAConfigManager.C4200a> {

    /* renamed from: a */
    public final /* synthetic */ IAConfigManager f10476a;

    public C4264n(IAConfigManager iAConfigManager) {
        this.f10476a = iAConfigManager;
    }

    /* renamed from: a */
    public void mo24154a(Object obj, Exception exc, boolean z) {
        int i;
        IAConfigManager.C4200a aVar = (IAConfigManager.C4200a) obj;
        boolean z2 = false;
        if (aVar != null) {
            if (aVar.f10364d != null) {
                this.f10476a.getClass();
            }
            if (z) {
                IAConfigManager iAConfigManager = this.f10476a;
                IAConfigManager iAConfigManager2 = IAConfigManager.f10324J;
                iAConfigManager.getClass();
                iAConfigManager.f10339e = aVar.f10363c;
                iAConfigManager.f10338d = aVar.f10362b;
                iAConfigManager.f10335a = aVar.f10365e;
                iAConfigManager.f10336b = aVar.f10366f;
            } else {
                IAConfigManager.f10325K = System.currentTimeMillis();
                IAConfigManager iAConfigManager3 = this.f10476a;
                iAConfigManager3.getClass();
                IAlog.m16446a("Got new remote configuration from server:", new Object[0]);
                iAConfigManager3.f10339e = aVar.f10363c;
                iAConfigManager3.f10338d = aVar.f10362b;
                iAConfigManager3.f10335a = aVar.f10365e;
                iAConfigManager3.f10336b = aVar.f10366f;
            }
        } else if (exc instanceof C4484f) {
            IAConfigManager.f10325K = System.currentTimeMillis();
        }
        if (!z) {
            IAConfigManager iAConfigManager4 = this.f10476a;
            boolean f = IAConfigManager.m13180f();
            iAConfigManager4.getClass();
            if (f) {
                iAConfigManager4.mo24187a((Exception) null);
            } else {
                if ((exc instanceof InvalidAppIdException) || (exc instanceof FileNotFoundException) || (!(exc instanceof C4506n0) ? TextUtils.isEmpty(iAConfigManager4.f10337c.trim()) : !((i = ((C4506n0) exc).f11099a) < 400 || i >= 500))) {
                    z2 = true;
                }
                if (z2) {
                    iAConfigManager4.mo24187a(new InvalidAppIdException());
                } else if (exc instanceof C4473b) {
                    iAConfigManager4.mo24187a(exc);
                } else {
                    iAConfigManager4.mo24187a(new IAConfigManager.C4201b());
                }
            }
            if (IAConfigManager.m13180f()) {
                IAConfigManager iAConfigManager5 = this.f10476a;
                if (iAConfigManager5.f10328C == null) {
                    iAConfigManager5.f10328C = new C4485f0(new C4267p(iAConfigManager5), iAConfigManager5.f10340f, new C4245m());
                }
                C4501m0 l = iAConfigManager5.f10328C.mo24653l();
                if (l != C4501m0.RUNNING && l != C4501m0.QUEUED) {
                    iAConfigManager5.f10354t.mo24706c(iAConfigManager5.f10328C);
                }
            }
        }
    }
}
