package com.inmobi.media;

import android.os.SystemClock;

/* renamed from: com.inmobi.media.co */
/* compiled from: AdNetworkClient */
public final class C5875co {

    /* renamed from: a */
    private static final String f14835a = C5875co.class.getSimpleName();

    /* renamed from: b */
    private C5876cp f14836b;

    public C5875co(C5876cp cpVar) {
        this.f14836b = cpVar;
    }

    /* renamed from: a */
    public final C5877cq mo34868a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            C6157hb a = new C6159hd(this.f14836b).mo35353a();
            C5877cq cqVar = new C5877cq(this.f14836b, a);
            try {
                C6244je.m18561a().mo35474a(this.f14836b.mo35347g());
                C6244je.m18561a().mo35475b(a.mo35352d());
                if (a.mo35349a()) {
                    return cqVar;
                }
                C6244je.m18561a().mo35476c(SystemClock.elapsedRealtime() - elapsedRealtime);
                return cqVar;
            } catch (Exception unused) {
                return cqVar;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
