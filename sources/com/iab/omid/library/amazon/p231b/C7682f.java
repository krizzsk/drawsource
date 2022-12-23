package com.iab.omid.library.amazon.p231b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.amazon.adsession.C7673a;
import com.iab.omid.library.amazon.p230a.C7669b;
import com.iab.omid.library.amazon.p230a.C7670c;
import com.iab.omid.library.amazon.p230a.C7671d;
import com.iab.omid.library.amazon.p230a.C7672e;
import com.iab.omid.library.amazon.p231b.C7676b;
import com.iab.omid.library.amazon.walking.TreeWalker;

/* renamed from: com.iab.omid.library.amazon.b.f */
public class C7682f implements C7670c, C7676b.C7677a {

    /* renamed from: a */
    private static C7682f f18581a;

    /* renamed from: b */
    private float f18582b = 0.0f;

    /* renamed from: c */
    private final C7672e f18583c;

    /* renamed from: d */
    private final C7669b f18584d;

    /* renamed from: e */
    private C7671d f18585e;

    /* renamed from: f */
    private C7675a f18586f;

    public C7682f(C7672e eVar, C7669b bVar) {
        this.f18583c = eVar;
        this.f18584d = bVar;
    }

    /* renamed from: a */
    public static C7682f m21276a() {
        if (f18581a == null) {
            f18581a = new C7682f(new C7672e(), new C7669b());
        }
        return f18581a;
    }

    /* renamed from: e */
    private C7675a m21277e() {
        if (this.f18586f == null) {
            this.f18586f = C7675a.m21236a();
        }
        return this.f18586f;
    }

    /* renamed from: a */
    public void mo54472a(float f) {
        this.f18582b = f;
        for (C7673a adSessionStatePublisher : m21277e().mo54552c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo54602a(f);
        }
    }

    /* renamed from: a */
    public void mo54591a(Context context) {
        this.f18585e = this.f18583c.mo54476a(new Handler(), context, this.f18584d.mo54471a(), this);
    }

    /* renamed from: a */
    public void mo54567a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo54627a();
        } else {
            TreeWalker.getInstance().mo54630c();
        }
    }

    /* renamed from: b */
    public void mo54592b() {
        C7676b.m21243a().mo54556a((C7676b.C7677a) this);
        C7676b.m21243a().mo54557b();
        TreeWalker.getInstance().mo54627a();
        this.f18585e.mo54473a();
    }

    /* renamed from: c */
    public void mo54593c() {
        TreeWalker.getInstance().mo54629b();
        C7676b.m21243a().mo54558c();
        this.f18585e.mo54474b();
    }

    /* renamed from: d */
    public float mo54594d() {
        return this.f18582b;
    }
}
