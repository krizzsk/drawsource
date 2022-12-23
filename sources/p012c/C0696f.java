package p012c;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.smaato.adsession.C8021a;
import com.iab.omid.library.smaato.walking.TreeWalker;
import p009b.C0645b;
import p009b.C0646c;
import p009b.C0647d;
import p009b.C0648e;
import p012c.C0690b;

/* renamed from: c.f */
public class C0696f implements C0690b.C0691a, C0646c {

    /* renamed from: f */
    private static C0696f f68f;

    /* renamed from: a */
    private float f69a = 0.0f;

    /* renamed from: b */
    private final C0648e f70b;

    /* renamed from: c */
    private final C0645b f71c;

    /* renamed from: d */
    private C0647d f72d;

    /* renamed from: e */
    private C0689a f73e;

    public C0696f(C0648e eVar, C0645b bVar) {
        this.f70b = eVar;
        this.f71c = bVar;
    }

    /* renamed from: a */
    private C0689a m74a() {
        if (this.f73e == null) {
            this.f73e = C0689a.m34c();
        }
        return this.f73e;
    }

    /* renamed from: c */
    public static C0696f m75c() {
        if (f68f == null) {
            f68f = new C0696f(new C0648e(), new C0645b());
        }
        return f68f;
    }

    /* renamed from: a */
    public void mo10089a(float f) {
        this.f69a = f;
        for (C8021a adSessionStatePublisher : m74a().mo10261a()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55933a(f);
        }
    }

    /* renamed from: a */
    public void mo10303a(Context context) {
        this.f72d = this.f70b.mo10093a(new Handler(), context, this.f71c.mo10088a(), this);
    }

    /* renamed from: a */
    public void mo10279a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo55962h();
        } else {
            TreeWalker.getInstance().mo55961g();
        }
    }

    /* renamed from: b */
    public float mo10304b() {
        return this.f69a;
    }

    /* renamed from: d */
    public void mo10305d() {
        C0690b.m41a().mo10268a((C0690b.C0691a) this);
        C0690b.m41a().mo10270d();
        TreeWalker.getInstance().mo55962h();
        this.f72d.mo10090c();
    }

    /* renamed from: e */
    public void mo10306e() {
        TreeWalker.getInstance().mo55963j();
        C0690b.m41a().mo10271e();
        this.f72d.mo10091d();
    }
}
