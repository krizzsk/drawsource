package com.iab.omid.library.fyber.p243b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.fyber.adsession.C7774a;
import com.iab.omid.library.fyber.p242a.C7770b;
import com.iab.omid.library.fyber.p242a.C7771c;
import com.iab.omid.library.fyber.p242a.C7772d;
import com.iab.omid.library.fyber.p242a.C7773e;
import com.iab.omid.library.fyber.p243b.C7777b;
import com.iab.omid.library.fyber.walking.TreeWalker;

/* renamed from: com.iab.omid.library.fyber.b.f */
public class C7783f implements C7771c, C7777b.C7778a {

    /* renamed from: a */
    private static C7783f f18815a;

    /* renamed from: b */
    private float f18816b = 0.0f;

    /* renamed from: c */
    private final C7773e f18817c;

    /* renamed from: d */
    private final C7770b f18818d;

    /* renamed from: e */
    private C7772d f18819e;

    /* renamed from: f */
    private C7776a f18820f;

    public C7783f(C7773e eVar, C7770b bVar) {
        this.f18817c = eVar;
        this.f18818d = bVar;
    }

    /* renamed from: a */
    public static C7783f m21736a() {
        if (f18815a == null) {
            f18815a = new C7783f(new C7773e(), new C7770b());
        }
        return f18815a;
    }

    /* renamed from: e */
    private C7776a m21737e() {
        if (this.f18820f == null) {
            this.f18820f = C7776a.m21696a();
        }
        return this.f18820f;
    }

    /* renamed from: a */
    public void mo54870a(float f) {
        this.f18816b = f;
        for (C7774a adSessionStatePublisher : m21737e().mo54950c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55000a(f);
        }
    }

    /* renamed from: a */
    public void mo54989a(Context context) {
        this.f18819e = this.f18817c.mo54874a(new Handler(), context, this.f18818d.mo54869a(), this);
    }

    /* renamed from: a */
    public void mo54965a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo55025a();
        } else {
            TreeWalker.getInstance().mo55028c();
        }
    }

    /* renamed from: b */
    public void mo54990b() {
        C7777b.m21703a().mo54954a((C7777b.C7778a) this);
        C7777b.m21703a().mo54955b();
        TreeWalker.getInstance().mo55025a();
        this.f18819e.mo54871a();
    }

    /* renamed from: c */
    public void mo54991c() {
        TreeWalker.getInstance().mo55027b();
        C7777b.m21703a().mo54956c();
        this.f18819e.mo54872b();
    }

    /* renamed from: d */
    public float mo54992d() {
        return this.f18816b;
    }
}
