package com.iab.omid.library.mmadbridge.p261b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.mmadbridge.adsession.C7925a;
import com.iab.omid.library.mmadbridge.p260a.C7921b;
import com.iab.omid.library.mmadbridge.p260a.C7922c;
import com.iab.omid.library.mmadbridge.p260a.C7923d;
import com.iab.omid.library.mmadbridge.p260a.C7924e;
import com.iab.omid.library.mmadbridge.p261b.C7928b;
import com.iab.omid.library.mmadbridge.walking.TreeWalker;

/* renamed from: com.iab.omid.library.mmadbridge.b.f */
public class C7934f implements C7922c, C7928b.C7929a {

    /* renamed from: a */
    private static C7934f f19159a;

    /* renamed from: b */
    private float f19160b = 0.0f;

    /* renamed from: c */
    private final C7924e f19161c;

    /* renamed from: d */
    private final C7921b f19162d;

    /* renamed from: e */
    private C7923d f19163e;

    /* renamed from: f */
    private C7927a f19164f;

    public C7934f(C7924e eVar, C7921b bVar) {
        this.f19161c = eVar;
        this.f19162d = bVar;
    }

    /* renamed from: a */
    public static C7934f m22411a() {
        if (f19159a == null) {
            f19159a = new C7934f(new C7924e(), new C7921b());
        }
        return f19159a;
    }

    /* renamed from: e */
    private C7927a m22412e() {
        if (this.f19164f == null) {
            this.f19164f = C7927a.m22371a();
        }
        return this.f19164f;
    }

    /* renamed from: a */
    public void mo55449a(float f) {
        this.f19160b = f;
        for (C7925a adSessionStatePublisher : m22412e().mo55529c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55579a(f);
        }
    }

    /* renamed from: a */
    public void mo55568a(Context context) {
        this.f19163e = this.f19161c.mo55453a(new Handler(), context, this.f19162d.mo55448a(), this);
    }

    /* renamed from: a */
    public void mo55544a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo55604a();
        } else {
            TreeWalker.getInstance().mo55607c();
        }
    }

    /* renamed from: b */
    public void mo55569b() {
        C7928b.m22378a().mo55533a((C7928b.C7929a) this);
        C7928b.m22378a().mo55534b();
        TreeWalker.getInstance().mo55604a();
        this.f19163e.mo55450a();
    }

    /* renamed from: c */
    public void mo55570c() {
        TreeWalker.getInstance().mo55606b();
        C7928b.m22378a().mo55535c();
        this.f19163e.mo55451b();
    }

    /* renamed from: d */
    public float mo55571d() {
        return this.f19160b;
    }
}
