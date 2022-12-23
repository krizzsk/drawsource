package com.inmobi.media;

/* renamed from: com.inmobi.media.je */
/* compiled from: SessionManager */
public class C6244je {

    /* renamed from: g */
    private static final String f15727g = C6244je.class.getSimpleName();

    /* renamed from: a */
    long f15728a;

    /* renamed from: b */
    long f15729b;

    /* renamed from: c */
    long f15730c;

    /* renamed from: d */
    long f15731d;

    /* renamed from: e */
    long f15732e;

    /* renamed from: f */
    long f15733f;

    /* renamed from: com.inmobi.media.je$a */
    /* compiled from: SessionManager */
    static class C6245a {

        /* renamed from: a */
        static final C6244je f15734a = new C6244je((byte) 0);
    }

    /* synthetic */ C6244je(byte b) {
        this();
    }

    /* renamed from: a */
    public static C6244je m18561a() {
        return C6245a.f15734a;
    }

    private C6244je() {
        this.f15728a = 0;
        this.f15729b = 0;
        this.f15730c = 0;
        this.f15731d = 0;
        this.f15732e = 0;
        this.f15733f = 0;
    }

    /* renamed from: b */
    static void m18562b() {
        C6246jf.m18571a();
        if (C6246jf.m18573e().sessionEnabled) {
            C6222iq.m18501a().f15698c = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo35474a(long j) {
        int a = C6210ik.m18422a();
        if (a == 0) {
            m18565f(j);
        } else if (a == 1) {
            m18563d(j);
        }
    }

    /* renamed from: b */
    public final void mo35475b(long j) {
        int a = C6210ik.m18422a();
        if (a == 0) {
            m18566g(j);
        } else if (a == 1) {
            m18564e(j);
        }
    }

    /* renamed from: d */
    private void m18563d(long j) {
        this.f15728a += j;
    }

    /* renamed from: e */
    private void m18564e(long j) {
        this.f15729b += j;
    }

    /* renamed from: f */
    private void m18565f(long j) {
        this.f15730c += j;
    }

    /* renamed from: g */
    private void m18566g(long j) {
        this.f15731d += j;
    }

    /* renamed from: c */
    public final void mo35476c(long j) {
        this.f15732e += j;
    }
}
