package com.iab.omid.library.applovin.p237b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.adsession.C7723a;
import com.iab.omid.library.applovin.p236a.C7719b;
import com.iab.omid.library.applovin.p236a.C7720c;
import com.iab.omid.library.applovin.p236a.C7721d;
import com.iab.omid.library.applovin.p236a.C7722e;
import com.iab.omid.library.applovin.p237b.C7726b;
import com.iab.omid.library.applovin.walking.TreeWalker;

/* renamed from: com.iab.omid.library.applovin.b.f */
public class C7732f implements C7720c, C7726b.C7727a {

    /* renamed from: a */
    private static C7732f f18698a;

    /* renamed from: b */
    private float f18699b = 0.0f;

    /* renamed from: c */
    private final C7722e f18700c;

    /* renamed from: d */
    private final C7719b f18701d;

    /* renamed from: e */
    private C7721d f18702e;

    /* renamed from: f */
    private C7725a f18703f;

    public C7732f(C7722e eVar, C7719b bVar) {
        this.f18700c = eVar;
        this.f18701d = bVar;
    }

    /* renamed from: a */
    public static C7732f m21506a() {
        if (f18698a == null) {
            f18698a = new C7732f(new C7722e(), new C7719b());
        }
        return f18698a;
    }

    /* renamed from: e */
    private C7725a m21507e() {
        if (this.f18703f == null) {
            this.f18703f = C7725a.m21466a();
        }
        return this.f18703f;
    }

    /* renamed from: a */
    public void mo54671a(float f) {
        this.f18699b = f;
        for (C7723a adSessionStatePublisher : m21507e().mo54751c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo54801a(f);
        }
    }

    /* renamed from: a */
    public void mo54790a(Context context) {
        this.f18702e = this.f18700c.mo54675a(new Handler(), context, this.f18701d.mo54670a(), this);
    }

    /* renamed from: a */
    public void mo54766a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo54826a();
        } else {
            TreeWalker.getInstance().mo54829c();
        }
    }

    /* renamed from: b */
    public void mo54791b() {
        C7726b.m21473a().mo54755a((C7726b.C7727a) this);
        C7726b.m21473a().mo54756b();
        TreeWalker.getInstance().mo54826a();
        this.f18702e.mo54672a();
    }

    /* renamed from: c */
    public void mo54792c() {
        TreeWalker.getInstance().mo54828b();
        C7726b.m21473a().mo54757c();
        this.f18702e.mo54673b();
    }

    /* renamed from: d */
    public float mo54793d() {
        return this.f18699b;
    }
}
