package com.iab.omid.library.ironsrc.p255b;

import android.content.Context;
import com.iab.omid.library.ironsrc.adsession.C7875a;

/* renamed from: com.iab.omid.library.ironsrc.b.b */
public class C7878b {

    /* renamed from: a */
    private static C7878b f19030a = new C7878b();

    /* renamed from: b */
    private Context f19031b;

    /* renamed from: c */
    private boolean f19032c;

    /* renamed from: d */
    private boolean f19033d;

    /* renamed from: e */
    private C7879a f19034e;

    /* renamed from: com.iab.omid.library.ironsrc.b.b$a */
    public interface C7879a {
    }

    private C7878b() {
    }

    /* renamed from: a */
    public static C7878b m22155a() {
        return f19030a;
    }

    /* renamed from: e */
    private void m22156e() {
        boolean z = !this.f19033d;
        for (C7875a adSessionStatePublisher : C7877a.m22148a().mo55337b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55393a(z);
        }
    }

    /* renamed from: a */
    public void mo55342a(Context context) {
        this.f19031b = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo55343a(C7879a aVar) {
        this.f19034e = aVar;
    }

    /* renamed from: b */
    public void mo55344b() {
        this.f19032c = true;
        m22156e();
    }

    /* renamed from: c */
    public void mo55345c() {
        this.f19032c = false;
        this.f19033d = false;
        this.f19034e = null;
    }

    /* renamed from: d */
    public boolean mo55346d() {
        return !this.f19033d;
    }
}
