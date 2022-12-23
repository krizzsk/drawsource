package com.unity3d.services.ads.gmascar.finder;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.gmascar.bridges.C11841a;
import com.unity3d.services.ads.gmascar.bridges.C11844c;
import com.unity3d.services.ads.gmascar.bridges.C11846d;
import com.unity3d.services.ads.gmascar.bridges.C11849e;
import com.unity3d.services.ads.gmascar.utils.C11861a;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;

/* renamed from: com.unity3d.services.ads.gmascar.finder.a */
/* compiled from: GMAInitializer */
public class C11851a {

    /* renamed from: a */
    private C11849e f28766a;

    /* renamed from: b */
    private C11846d f28767b;

    /* renamed from: c */
    private C11844c f28768c;

    /* renamed from: d */
    private C11841a f28769d;

    /* renamed from: e */
    private C11861a f28770e = new C11861a();

    public C11851a(C11849e eVar, C11846d dVar, C11844c cVar, C11841a aVar) {
        this.f28766a = eVar;
        this.f28767b = dVar;
        this.f28768c = cVar;
        this.f28769d = aVar;
    }

    /* renamed from: a */
    public boolean mo70796a(Object obj) {
        Object obj2 = this.f28768c.mo70788a(obj).get(this.f28766a.mo70785g());
        if (obj2 != null) {
            if (this.f28769d.mo70784a(obj2)) {
                C12136a.m33103c().mo71310a((Enum) C12143b.GMA, (Enum) GMAEvent.INIT_SUCCESS, new Object[0]);
                return true;
            }
            C12136a.m33103c().mo71310a((Enum) C12143b.GMA, (Enum) GMAEvent.INIT_ERROR, new Object[0]);
        }
        return false;
    }

    /* renamed from: b */
    public void mo70797b() {
        if (mo70798c()) {
            this.f28770e.mo70807a(GMAEvent.ALREADY_INITIALIZED, new Object[0]);
        } else {
            this.f28766a.mo70792a(C12084a.m32908e(), this.f28767b.mo70790i());
        }
    }

    /* renamed from: c */
    public boolean mo70798c() {
        try {
            return mo70796a(this.f28766a.mo70793i());
        } catch (Exception e) {
            C12065a.m32843a("ERROR: Could not get initialization status of GMA SDK - %s", e.getLocalizedMessage());
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: a */
    public C11846d mo70795a() {
        return this.f28767b;
    }
}
