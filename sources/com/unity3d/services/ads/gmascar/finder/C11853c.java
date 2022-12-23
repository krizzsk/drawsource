package com.unity3d.services.ads.gmascar.finder;

import com.google.ads.AdRequest;
import com.smaato.sdk.core.dns.DnsName;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.gmascar.bridges.C11849e;
import com.unity3d.services.ads.gmascar.listeners.C11860a;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;

/* renamed from: com.unity3d.services.ads.gmascar.finder.c */
/* compiled from: ScarVersionFinder */
public class C11853c implements C11860a {

    /* renamed from: a */
    private static C11849e f28775a;

    /* renamed from: b */
    private C11852b f28776b;

    /* renamed from: c */
    private C11851a f28777c;

    /* renamed from: d */
    private long f28778d = -1;

    public C11853c(C11849e eVar, C11852b bVar, C11851a aVar) {
        f28775a = eVar;
        this.f28776b = bVar;
        this.f28777c = aVar;
        aVar.mo70795a().mo70789a((C11860a) this);
    }

    /* renamed from: a */
    public void mo70802a(boolean z) {
        C12136a.m33103c().mo71310a((Enum) C12143b.INIT_GMA, (Enum) GMAEvent.VERSION, z ? f28775a.mo70794j() : AdRequest.VERSION);
    }

    /* renamed from: b */
    public void mo70803b() {
        try {
            if (!this.f28776b.mo70799a()) {
                C12136a.m33103c().mo71310a((Enum) C12143b.INIT_GMA, (Enum) GMAEvent.VERSION, AdRequest.VERSION);
            } else if (!this.f28777c.mo70798c()) {
                this.f28777c.mo70797b();
            } else {
                mo70802a(true);
            }
        } catch (Exception e) {
            C12065a.m32843a("Got exception finding GMA SDK: %s", e.getLocalizedMessage());
        }
    }

    /* renamed from: a */
    public long mo70800a() {
        String j;
        if (this.f28778d == -1 && (j = f28775a.mo70794j()) != null) {
            String[] split = j.split(DnsName.ESCAPED_DOT);
            if (split.length > 1) {
                this.f28778d = Long.parseLong(split[1]);
            }
        }
        return this.f28778d;
    }

    /* renamed from: a */
    public void mo70801a(Object obj) {
        mo70802a(this.f28777c.mo70796a(obj));
    }
}
