package com.iab.omid.library.inmobi.p249b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.inmobi.adsession.C7825a;
import com.iab.omid.library.inmobi.p248a.C7821b;
import com.iab.omid.library.inmobi.p248a.C7822c;
import com.iab.omid.library.inmobi.p248a.C7823d;
import com.iab.omid.library.inmobi.p248a.C7824e;
import com.iab.omid.library.inmobi.p249b.C7828b;
import com.iab.omid.library.inmobi.walking.TreeWalker;

/* renamed from: com.iab.omid.library.inmobi.b.f */
public class C7834f implements C7822c, C7828b.C7829a {

    /* renamed from: a */
    private static C7834f f18931a;

    /* renamed from: b */
    private float f18932b = 0.0f;

    /* renamed from: c */
    private final C7824e f18933c;

    /* renamed from: d */
    private final C7821b f18934d;

    /* renamed from: e */
    private C7823d f18935e;

    /* renamed from: f */
    private C7827a f18936f;

    public C7834f(C7824e eVar, C7821b bVar) {
        this.f18933c = eVar;
        this.f18934d = bVar;
    }

    /* renamed from: a */
    public static C7834f m21964a() {
        if (f18931a == null) {
            f18931a = new C7834f(new C7824e(), new C7821b());
        }
        return f18931a;
    }

    /* renamed from: e */
    private C7827a m21965e() {
        if (this.f18936f == null) {
            this.f18936f = C7827a.m21924a();
        }
        return this.f18936f;
    }

    /* renamed from: a */
    public void mo55069a(float f) {
        this.f18932b = f;
        for (C7825a adSessionStatePublisher : m21965e().mo55145c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55195a(f);
        }
    }

    /* renamed from: a */
    public void mo55184a(Context context) {
        this.f18935e = this.f18933c.mo55073a(new Handler(), context, this.f18934d.mo55068a(), this);
    }

    /* renamed from: a */
    public void mo55160a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo55220a();
        } else {
            TreeWalker.getInstance().mo55223c();
        }
    }

    /* renamed from: b */
    public void mo55185b() {
        C7828b.m21931a().mo55149a((C7828b.C7829a) this);
        C7828b.m21931a().mo55150b();
        TreeWalker.getInstance().mo55220a();
        this.f18935e.mo55070a();
    }

    /* renamed from: c */
    public void mo55186c() {
        TreeWalker.getInstance().mo55222b();
        C7828b.m21931a().mo55151c();
        this.f18935e.mo55071b();
    }

    /* renamed from: d */
    public float mo55187d() {
        return this.f18932b;
    }
}
