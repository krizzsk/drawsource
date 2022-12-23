package com.applovin.impl.sdk.p052d;

/* renamed from: com.applovin.impl.sdk.d.e */
public final class C1880e {

    /* renamed from: a */
    private long f3458a;

    /* renamed from: b */
    private long f3459b;

    /* renamed from: c */
    private boolean f3460c;

    /* renamed from: d */
    private long f3461d;

    /* renamed from: e */
    private long f3462e;

    /* renamed from: f */
    private int f3463f;

    /* renamed from: g */
    private Exception f3464g;

    /* renamed from: a */
    public void mo14336a() {
        this.f3460c = true;
    }

    /* renamed from: a */
    public void mo14337a(int i) {
        this.f3463f = i;
    }

    /* renamed from: a */
    public void mo14338a(long j) {
        this.f3458a += j;
    }

    /* renamed from: a */
    public void mo14339a(Exception exc) {
        this.f3464g = exc;
    }

    /* renamed from: b */
    public void mo14340b(long j) {
        this.f3459b += j;
    }

    /* renamed from: b */
    public boolean mo14341b() {
        return this.f3460c;
    }

    /* renamed from: c */
    public long mo14342c() {
        return this.f3458a;
    }

    /* renamed from: d */
    public long mo14343d() {
        return this.f3459b;
    }

    /* renamed from: e */
    public void mo14344e() {
        this.f3461d++;
    }

    /* renamed from: f */
    public void mo14345f() {
        this.f3462e++;
    }

    /* renamed from: g */
    public long mo14346g() {
        return this.f3461d;
    }

    /* renamed from: h */
    public long mo14347h() {
        return this.f3462e;
    }

    /* renamed from: i */
    public Exception mo14348i() {
        return this.f3464g;
    }

    /* renamed from: j */
    public int mo14349j() {
        return this.f3463f;
    }

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.f3458a + ", totalCachedBytes=" + this.f3459b + ", isHTMLCachingCancelled=" + this.f3460c + ", htmlResourceCacheSuccessCount=" + this.f3461d + ", htmlResourceCacheFailureCount=" + this.f3462e + '}';
    }
}
