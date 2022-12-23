package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.p284f.C8286a;

/* renamed from: com.ironsource.mediationsdk.utils.o */
public final class C6753o {

    /* renamed from: f */
    private static C6753o f17782f;

    /* renamed from: a */
    private int f17783a = 1;

    /* renamed from: b */
    private int f17784b = 1;

    /* renamed from: c */
    private int f17785c = 1;

    /* renamed from: d */
    private int f17786d = 1;

    /* renamed from: e */
    private C8286a f17787e = new C8286a();

    /* renamed from: com.ironsource.mediationsdk.utils.o$1 */
    static /* synthetic */ class C67541 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17788a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17788a = r0
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17788a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17788a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17788a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C6753o.C67541.<clinit>():void");
        }
    }

    private C6753o() {
        m20483d(this.f17783a);
        m20484e(this.f17784b);
        m20485f(this.f17786d);
    }

    /* renamed from: a */
    public static synchronized C6753o m20481a() {
        C6753o oVar;
        synchronized (C6753o.class) {
            if (f17782f == null) {
                f17782f = new C6753o();
            }
            oVar = f17782f;
        }
        return oVar;
    }

    /* renamed from: c */
    private static IronSource.AD_UNIT m20482c(int i) {
        if (i == 0) {
            return IronSource.AD_UNIT.OFFERWALL;
        }
        if (i == 1) {
            return IronSource.AD_UNIT.REWARDED_VIDEO;
        }
        if (i == 2) {
            return IronSource.AD_UNIT.INTERSTITIAL;
        }
        if (i != 3) {
            return null;
        }
        return IronSource.AD_UNIT.BANNER;
    }

    /* renamed from: d */
    private void m20483d(int i) {
        this.f17783a = i;
        this.f17787e.mo56715b(i);
    }

    /* renamed from: e */
    private void m20484e(int i) {
        this.f17784b = i;
        this.f17787e.mo56714a(i);
    }

    /* renamed from: f */
    private void m20485f(int i) {
        this.f17786d = i;
        this.f17787e.mo56716c(i);
    }

    /* renamed from: a */
    public final synchronized void mo36988a(int i) {
        mo36989a(m20482c(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36989a(com.ironsource.mediationsdk.IronSource.AD_UNIT r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L_0x0005
            monitor-exit(r2)
            return
        L_0x0005:
            int[] r0 = com.ironsource.mediationsdk.utils.C6753o.C67541.f17788a     // Catch:{ all -> 0x0039 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0039 }
            r3 = r0[r3]     // Catch:{ all -> 0x0039 }
            r0 = 1
            if (r3 == r0) goto L_0x0032
            r1 = 2
            if (r3 == r1) goto L_0x002a
            r1 = 3
            if (r3 == r1) goto L_0x0022
            r1 = 4
            if (r3 == r1) goto L_0x001a
            goto L_0x0020
        L_0x001a:
            int r3 = r2.f17786d     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.m20485f(r3)     // Catch:{ all -> 0x0039 }
        L_0x0020:
            monitor-exit(r2)
            return
        L_0x0022:
            int r3 = r2.f17784b     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.m20484e(r3)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x002a:
            int r3 = r2.f17783a     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.m20483d(r3)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0032:
            int r3 = r2.f17785c     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.f17785c = r3     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0039:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C6753o.mo36989a(com.ironsource.mediationsdk.IronSource$AD_UNIT):void");
    }

    /* renamed from: b */
    public final synchronized int mo36990b(int i) {
        return mo36991b(m20482c(i));
    }

    /* renamed from: b */
    public final synchronized int mo36991b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return -1;
        }
        int i = C67541.f17788a[ad_unit.ordinal()];
        if (i == 1) {
            return this.f17785c;
        } else if (i == 2) {
            return this.f17783a;
        } else if (i == 3) {
            return this.f17784b;
        } else if (i != 4) {
            return -1;
        } else {
            return this.f17786d;
        }
    }
}
