package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Timer;

/* renamed from: com.ironsource.mediationsdk.b */
public abstract class C6611b {

    /* renamed from: a */
    C6612a f17116a;

    /* renamed from: b */
    public AbstractAdapter f17117b;

    /* renamed from: c */
    NetworkSettings f17118c;

    /* renamed from: d */
    String f17119d;

    /* renamed from: e */
    boolean f17120e;

    /* renamed from: f */
    public String f17121f;

    /* renamed from: g */
    public String f17122g;

    /* renamed from: h */
    int f17123h;

    /* renamed from: i */
    Timer f17124i;

    /* renamed from: j */
    Timer f17125j;

    /* renamed from: k */
    int f17126k;

    /* renamed from: l */
    int f17127l;

    /* renamed from: m */
    public int f17128m;

    /* renamed from: n */
    public int f17129n;

    /* renamed from: o */
    protected Long f17130o;

    /* renamed from: p */
    protected Long f17131p;

    /* renamed from: q */
    IronSourceLoggerManager f17132q;

    /* renamed from: r */
    private String f17133r;

    /* renamed from: s */
    private int f17134s;

    /* renamed from: t */
    private String f17135t = "maxAdsPerSession";

    /* renamed from: u */
    private String f17136u = "maxAdsPerIteration";

    /* renamed from: v */
    private String f17137v = "maxAdsPerDay";

    /* renamed from: com.ironsource.mediationsdk.b$a */
    public enum C6612a {
        NOT_INITIATED(0),
        INIT_FAILED(1),
        INITIATED(2),
        AVAILABLE(3),
        NOT_AVAILABLE(4),
        EXHAUSTED(5),
        CAPPED_PER_SESSION(6),
        INIT_PENDING(7),
        LOAD_PENDING(8),
        CAPPED_PER_DAY(9),
        NEEDS_RELOAD(10);
        

        /* renamed from: l */
        public int f17150l;

        private C6612a(int i) {
            this.f17150l = i;
        }
    }

    C6611b(NetworkSettings networkSettings) {
        this.f17133r = networkSettings.getProviderTypeForReflection();
        this.f17119d = networkSettings.getProviderInstanceName();
        this.f17120e = networkSettings.isMultipleInstances();
        this.f17118c = networkSettings;
        this.f17121f = networkSettings.getSubProviderId();
        this.f17122g = networkSettings.getAdSourceNameForEvents();
        this.f17123h = 0;
        this.f17134s = 0;
        this.f17116a = C6612a.NOT_INITIATED;
        this.f17132q = IronSourceLoggerManager.getLogger();
        this.f17130o = null;
        this.f17131p = null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36614a(com.ironsource.mediationsdk.C6611b.C6612a r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.b$a r0 = r4.f17116a     // Catch:{ all -> 0x0044 }
            if (r0 != r5) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r4.f17116a = r5     // Catch:{ all -> 0x0044 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r4.f17132q     // Catch:{ all -> 0x0044 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = "Smart Loading - "
            r2.<init>(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r4.f17119d     // Catch:{ all -> 0x0044 }
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = " state changed to "
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0044 }
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0044 }
            r3 = 0
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0044 }
            com.ironsource.mediationsdk.AbstractAdapter r0 = r4.f17117b     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C6611b.C6612a.CAPPED_PER_SESSION     // Catch:{ all -> 0x0044 }
            if (r5 == r0) goto L_0x0039
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C6611b.C6612a.CAPPED_PER_DAY     // Catch:{ all -> 0x0044 }
            if (r5 != r0) goto L_0x0042
        L_0x0039:
            com.ironsource.mediationsdk.AbstractAdapter r0 = r4.f17117b     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r4.mo36101k()     // Catch:{ all -> 0x0044 }
            r0.setMediationState(r5, r1)     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r4)
            return
        L_0x0044:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6611b.mo36614a(com.ironsource.mediationsdk.b$a):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36615a(String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f17132q;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, str + " exception: " + this.f17119d + " | " + str2, 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo36616a() {
        return this.f17123h >= this.f17126k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo36617b() {
        return this.f17134s >= this.f17127l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo36618c() {
        if (!mo36616a() && !mo36617b()) {
            if (!(this.f17116a == C6612a.CAPPED_PER_DAY)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo36619d() {
        this.f17123h++;
        this.f17134s++;
        if (mo36617b()) {
            mo36614a(C6612a.CAPPED_PER_SESSION);
        } else if (mo36616a()) {
            mo36614a(C6612a.EXHAUSTED);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo36620e() {
        try {
            if (this.f17124i != null) {
                this.f17124i.cancel();
            }
        } catch (Exception e) {
            mo36615a("stopInitTimer", e.getLocalizedMessage());
        } finally {
            this.f17124i = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo36621f() {
        try {
            if (this.f17125j != null) {
                this.f17125j.cancel();
            }
        } catch (Exception e) {
            mo36615a("stopLoadTimer", e.getLocalizedMessage());
        } finally {
            this.f17125j = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo36098g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo36099h();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract void mo36100i();

    /* renamed from: j */
    public final String mo36622j() {
        return this.f17120e ? this.f17133r : this.f17119d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract String mo36101k();

    /* renamed from: l */
    public final Long mo36623l() {
        return this.f17130o;
    }

    /* renamed from: m */
    public final Long mo36624m() {
        return this.f17131p;
    }
}
