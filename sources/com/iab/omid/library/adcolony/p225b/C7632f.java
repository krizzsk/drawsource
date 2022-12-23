package com.iab.omid.library.adcolony.p225b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.adcolony.adsession.C7623a;
import com.iab.omid.library.adcolony.p224a.C7619b;
import com.iab.omid.library.adcolony.p224a.C7620c;
import com.iab.omid.library.adcolony.p224a.C7621d;
import com.iab.omid.library.adcolony.p224a.C7622e;
import com.iab.omid.library.adcolony.p225b.C7626b;
import com.iab.omid.library.adcolony.walking.TreeWalker;

/* renamed from: com.iab.omid.library.adcolony.b.f */
public class C7632f implements C7620c, C7626b.C7627a {

    /* renamed from: a */
    private static C7632f f18464a;

    /* renamed from: b */
    private float f18465b = 0.0f;

    /* renamed from: c */
    private final C7622e f18466c;

    /* renamed from: d */
    private final C7619b f18467d;

    /* renamed from: e */
    private C7621d f18468e;

    /* renamed from: f */
    private C7625a f18469f;

    public C7632f(C7622e eVar, C7619b bVar) {
        this.f18466c = eVar;
        this.f18467d = bVar;
    }

    /* renamed from: a */
    public static C7632f m21046a() {
        if (f18464a == null) {
            f18464a = new C7632f(new C7622e(), new C7619b());
        }
        return f18464a;
    }

    /* renamed from: e */
    private C7625a m21047e() {
        if (this.f18469f == null) {
            this.f18469f = C7625a.m21006a();
        }
        return this.f18469f;
    }

    /* renamed from: a */
    public void mo54273a(float f) {
        this.f18465b = f;
        for (C7623a adSessionStatePublisher : m21047e().mo54353c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo54403a(f);
        }
    }

    /* renamed from: a */
    public void mo54392a(Context context) {
        this.f18468e = this.f18466c.mo54277a(new Handler(), context, this.f18467d.mo54272a(), this);
    }

    /* renamed from: a */
    public void mo54368a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo54428a();
        } else {
            TreeWalker.getInstance().mo54431c();
        }
    }

    /* renamed from: b */
    public void mo54393b() {
        C7626b.m21013a().mo54357a((C7626b.C7627a) this);
        C7626b.m21013a().mo54358b();
        TreeWalker.getInstance().mo54428a();
        this.f18468e.mo54274a();
    }

    /* renamed from: c */
    public void mo54394c() {
        TreeWalker.getInstance().mo54430b();
        C7626b.m21013a().mo54359c();
        this.f18468e.mo54275b();
    }

    /* renamed from: d */
    public float mo54395d() {
        return this.f18465b;
    }
}
