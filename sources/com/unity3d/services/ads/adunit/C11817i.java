package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;
import com.unity3d.services.ads.webplayer.C11928e;
import com.unity3d.services.ads.webplayer.C11929f;
import com.unity3d.services.ads.webplayer.C11937g;
import com.unity3d.services.core.misc.C12081k;

/* renamed from: com.unity3d.services.ads.adunit.i */
/* compiled from: WebPlayerHandler */
public class C11817i implements C11814f {

    /* renamed from: a */
    private static String f28707a = "webplayer";

    /* renamed from: b */
    private C11929f f28708b;

    /* renamed from: a */
    public void mo70742a(AdUnitActivity adUnitActivity) {
    }

    /* renamed from: a */
    public boolean mo70744a() {
        C11929f fVar = this.f28708b;
        if (fVar != null) {
            C12081k.m32885a(fVar);
            this.f28708b.destroy();
        }
        C11937g.m32510a().mo70945b(f28707a);
        this.f28708b = null;
        return true;
    }

    /* renamed from: b */
    public View mo70745b() {
        return this.f28708b;
    }

    /* renamed from: b */
    public void mo70746b(AdUnitActivity adUnitActivity) {
    }

    /* renamed from: c */
    public void mo70747c(AdUnitActivity adUnitActivity) {
    }

    /* renamed from: d */
    public void mo70748d(AdUnitActivity adUnitActivity) {
    }

    /* renamed from: e */
    public boolean mo70749e(AdUnitActivity adUnitActivity) {
        if (this.f28708b != null) {
            return true;
        }
        C11928e a = C11928e.m32480a();
        String str = f28707a;
        C11929f fVar = new C11929f(adUnitActivity, str, a.mo70889c(str), a.mo70887b(f28707a));
        this.f28708b = fVar;
        fVar.setEventSettings(a.mo70885a(f28707a));
        C11937g.m32510a().mo70944a(f28707a, this.f28708b);
        return true;
    }

    /* renamed from: f */
    public void mo70750f(AdUnitActivity adUnitActivity) {
        if (adUnitActivity.isFinishing()) {
            mo70744a();
        }
    }

    /* renamed from: a */
    public void mo70743a(AdUnitActivity adUnitActivity, Bundle bundle) {
        mo70749e(adUnitActivity);
    }
}
