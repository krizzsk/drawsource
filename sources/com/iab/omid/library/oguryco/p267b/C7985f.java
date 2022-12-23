package com.iab.omid.library.oguryco.p267b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.oguryco.adsession.C7975a;
import com.iab.omid.library.oguryco.p266a.C7971b;
import com.iab.omid.library.oguryco.p266a.C7972c;
import com.iab.omid.library.oguryco.p266a.C7973d;
import com.iab.omid.library.oguryco.p266a.C7974e;
import com.iab.omid.library.oguryco.p267b.C7978b;
import com.iab.omid.library.oguryco.walking.TreeWalker;

/* renamed from: com.iab.omid.library.oguryco.b.f */
public class C7985f implements C7972c, C7978b.C7980a {

    /* renamed from: a */
    private static C7985f f19283a;

    /* renamed from: b */
    private float f19284b = 0.0f;

    /* renamed from: c */
    private final C7974e f19285c;

    /* renamed from: d */
    private final C7971b f19286d;

    /* renamed from: e */
    private C7973d f19287e;

    /* renamed from: f */
    private C7977a f19288f;

    public C7985f(C7974e eVar, C7971b bVar) {
        this.f19285c = eVar;
        this.f19286d = bVar;
    }

    /* renamed from: a */
    public static C7985f m22644a() {
        if (f19283a == null) {
            f19283a = new C7985f(new C7974e(), new C7971b());
        }
        return f19283a;
    }

    /* renamed from: e */
    private C7977a m22645e() {
        if (this.f19288f == null) {
            this.f19288f = C7977a.m22601a();
        }
        return this.f19288f;
    }

    /* renamed from: a */
    public void mo55648a(float f) {
        this.f19284b = f;
        for (C7975a adSessionStatePublisher : m22645e().mo55750c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55794a(f);
        }
    }

    /* renamed from: a */
    public void mo55783a(Context context) {
        this.f19287e = this.f19285c.mo55652a(new Handler(), context, this.f19286d.mo55647a(), this);
    }

    /* renamed from: a */
    public void mo55759a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo55819a();
        } else {
            TreeWalker.getInstance().mo55822c();
        }
    }

    /* renamed from: b */
    public void mo55784b() {
        C7978b.m22608a().mo55754a((C7978b.C7980a) this);
        C7978b.m22608a().mo55755b();
        if (C7978b.m22608a().mo55757d()) {
            TreeWalker.getInstance().mo55819a();
        }
        this.f19287e.mo55649a();
    }

    /* renamed from: c */
    public void mo55785c() {
        TreeWalker.getInstance().mo55821b();
        C7978b.m22608a().mo55756c();
        this.f19287e.mo55650b();
    }

    /* renamed from: d */
    public float mo55786d() {
        return this.f19284b;
    }
}
