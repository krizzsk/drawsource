package com.iab.omid.library.vungle.p273b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.vungle.adsession.C8039a;
import com.iab.omid.library.vungle.p272a.C8035b;
import com.iab.omid.library.vungle.p272a.C8036c;
import com.iab.omid.library.vungle.p272a.C8037d;
import com.iab.omid.library.vungle.p272a.C8038e;
import com.iab.omid.library.vungle.p273b.C8042b;
import com.iab.omid.library.vungle.walking.TreeWalker;

/* renamed from: com.iab.omid.library.vungle.b.f */
public class C8048f implements C8036c, C8042b.C8043a {

    /* renamed from: a */
    private static C8048f f19464a;

    /* renamed from: b */
    private float f19465b = 0.0f;

    /* renamed from: c */
    private final C8038e f19466c;

    /* renamed from: d */
    private final C8035b f19467d;

    /* renamed from: e */
    private C8037d f19468e;

    /* renamed from: f */
    private C8041a f19469f;

    public C8048f(C8038e eVar, C8035b bVar) {
        this.f19466c = eVar;
        this.f19467d = bVar;
    }

    /* renamed from: a */
    public static C8048f m22965a() {
        if (f19464a == null) {
            f19464a = new C8048f(new C8038e(), new C8035b());
        }
        return f19464a;
    }

    /* renamed from: e */
    private C8041a m22966e() {
        if (this.f19469f == null) {
            this.f19469f = C8041a.m22925a();
        }
        return this.f19469f;
    }

    /* renamed from: a */
    public void mo55986a(float f) {
        this.f19465b = f;
        for (C8039a adSessionStatePublisher : m22966e().mo56062c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo56112a(f);
        }
    }

    /* renamed from: a */
    public void mo56101a(Context context) {
        this.f19468e = this.f19466c.mo55990a(new Handler(), context, this.f19467d.mo55985a(), this);
    }

    /* renamed from: a */
    public void mo56077a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo56137a();
        } else {
            TreeWalker.getInstance().mo56140c();
        }
    }

    /* renamed from: b */
    public void mo56102b() {
        C8042b.m22932a().mo56066a((C8042b.C8043a) this);
        C8042b.m22932a().mo56067b();
        TreeWalker.getInstance().mo56137a();
        this.f19468e.mo55987a();
    }

    /* renamed from: c */
    public void mo56103c() {
        TreeWalker.getInstance().mo56139b();
        C8042b.m22932a().mo56068c();
        this.f19468e.mo55988b();
    }

    /* renamed from: d */
    public float mo56104d() {
        return this.f19465b;
    }
}
