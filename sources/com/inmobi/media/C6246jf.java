package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.C6094fv;
import com.inmobi.media.C6120gh;
import com.inmobi.media.C6238jc;
import java.util.UUID;

/* renamed from: com.inmobi.media.jf */
/* compiled from: SignalsComponent */
public class C6246jf {

    /* renamed from: a */
    private static final String f15735a = C6246jf.class.getSimpleName();

    /* renamed from: b */
    private C6238jc f15736b;

    /* renamed from: c */
    private boolean f15737c;

    /* renamed from: com.inmobi.media.jf$a */
    /* compiled from: SignalsComponent */
    static class C6247a {

        /* renamed from: a */
        static final C6246jf f15738a = new C6246jf((byte) 0);
    }

    /* synthetic */ C6246jf(byte b) {
        this();
    }

    private C6246jf() {
    }

    /* renamed from: a */
    public static C6246jf m18571a() {
        return C6247a.f15738a;
    }

    /* renamed from: b */
    public final synchronized void mo35477b() {
        C6094fv.m18084a("signals", C6183hw.m18332f(), (C6094fv.C6097c) null);
        C6222iq a = C6222iq.m18501a();
        a.f15699d = m18573e().sessionEnabled;
        if (!a.f15699d) {
            a.f15696a = null;
            a.f15697b = 0;
            a.f15698c = 0;
        }
        C6244je a2 = C6244je.m18561a();
        C6246jf jfVar = C6247a.f15738a;
        if (m18573e().sessionEnabled) {
            C6222iq.m18501a().f15696a = UUID.randomUUID().toString();
            C6222iq.m18501a().f15697b = System.currentTimeMillis();
            C6222iq.m18501a().f15698c = 0;
            a2.f15733f = SystemClock.elapsedRealtime();
            a2.f15728a = 0;
            a2.f15729b = 0;
            a2.f15730c = 0;
            a2.f15731d = 0;
            a2.f15732e = 0;
            a2.f15733f = 0;
        }
        if (m18576h()) {
            m18577i();
        }
        if (m18575g()) {
            C6240jd.m18548a().mo35467b();
        }
    }

    /* renamed from: c */
    public final synchronized void mo35478c() {
        C6244je.m18561a();
        C6244je.m18562b();
        if (this.f15737c) {
            this.f15737c = false;
            if (this.f15736b != null) {
                C6238jc jcVar = this.f15736b;
                boolean unused = jcVar.f15717a.f15718a = true;
                C6238jc.C6239a aVar = jcVar.f15717a;
                C6246jf jfVar = C6247a.f15738a;
                aVar.sendEmptyMessageDelayed(2, (long) (m18573e().stopRequestTimeout * 1000));
            }
        }
        C6240jd a = C6240jd.m18548a();
        if (C6240jd.m18552c()) {
            if (a.f15721a != null) {
                a.f15721a.removeUpdates(a);
            }
            if (a.f15722b != null) {
                a.f15722b.disconnect();
            }
        }
        a.f15722b = null;
    }

    /* renamed from: d */
    public static C6236ja m18572d() {
        return new C6236ja(((C6120gh) C6094fv.m18084a("signals", C6183hw.m18332f(), (C6094fv.C6097c) null)).mo35283f());
    }

    /* renamed from: a */
    public static C6120gh.C6123b m18570a(String str) {
        return ((C6120gh) C6094fv.m18084a("signals", str, (C6094fv.C6097c) null)).ice;
    }

    /* renamed from: e */
    public static C6120gh.C6123b m18573e() {
        return ((C6120gh) C6094fv.m18084a("signals", C6183hw.m18332f(), (C6094fv.C6097c) null)).ice;
    }

    /* renamed from: f */
    public static C6120gh.C6124c m18574f() {
        return ((C6120gh) C6094fv.m18084a("signals", C6183hw.m18332f(), (C6094fv.C6097c) null)).unifiedIdServiceConfig;
    }

    /* renamed from: i */
    private synchronized void m18577i() {
        if (!this.f15737c) {
            this.f15737c = true;
            if (this.f15736b == null) {
                this.f15736b = new C6238jc();
            }
            this.f15736b.mo35465a();
        }
    }

    /* renamed from: g */
    static boolean m18575g() {
        String m = C6183hw.m18341m();
        C6256jm c = C6258jo.m18615c();
        String e = c != null ? c.mo35486e() : null;
        return (m == null || m18570a(m).locationEnabled) && (e == null || c.mo35482a()) && (!(c != null && c.mo35485d()) || m18570a(e).locationEnabled);
    }

    /* renamed from: h */
    public static boolean m18576h() {
        String m = C6183hw.m18341m();
        C6256jm c = C6258jo.m18615c();
        String e = c != null ? c.mo35486e() : null;
        return (m == null || m18570a(m).f15439w.vwe) && (e == null || c.mo35483b()) && (!(c != null && c.mo35485d()) || m18570a(e).f15439w.vwe);
    }
}
