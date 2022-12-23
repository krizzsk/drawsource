package com.ironsource.mediationsdk.adunit.p212d.p213a;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.p209c.p210a.C6551a;
import com.ironsource.mediationsdk.adunit.p212d.C6567a;
import com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C6650a;
import com.ironsource.mediationsdk.model.Placement;

/* renamed from: com.ironsource.mediationsdk.adunit.d.a.a */
public abstract class C6568a<Listener extends C6551a> extends C6570c<Listener> implements AdapterAdInteractionListener {

    /* renamed from: h */
    private BaseAdInteractionAdapter<?, AdapterAdInteractionListener> f17008h;

    public C6568a(C6567a aVar, BaseAdInteractionAdapter<?, ?> baseAdInteractionAdapter, C6650a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
        this.f17008h = baseAdInteractionAdapter;
    }

    /* renamed from: a */
    public final void mo36532a(Placement placement) {
        int i;
        IronLog.INTERNAL.verbose(mo36539c("placementName = " + placement.getPlacementName()));
        try {
            this.f17014e = placement;
            mo36536a(C6570c.C6571a.SHOWING);
            this.f17012c.f16926d.mo36437a(mo36551q());
            this.f17008h.showAd(this.f17015f, this);
        } catch (Throwable th) {
            String str = "showAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(mo36539c(str));
            mo36536a(C6570c.C6571a.FAILED);
            if (this.f17012c != null) {
                this.f17012c.f16927e.mo36487m(str);
            }
            IronSource.AD_UNIT ad_unit = this.f17010a.f16999a;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i = IronSourceError.ERROR_IS_SHOW_EXCEPTION;
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i = 1038;
            } else {
                IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
                i = IronSourceError.ERROR_CODE_GENERIC;
            }
            onAdShowFailed(i, str);
        }
    }

    /* renamed from: a */
    public final void mo36533a(boolean z) {
        if (this.f17012c != null) {
            this.f17012c.f16926d.mo36441a(z);
        }
    }

    /* renamed from: a */
    public final boolean mo36534a() {
        if (this.f17015f != null) {
            try {
                return mo36545i() ? this.f17013d == C6570c.C6571a.LOADED && this.f17008h.isAdAvailable(this.f17015f) : this.f17008h.isAdAvailable(this.f17015f);
            } catch (Throwable th) {
                String str = "isReadyToShow - exception = " + th.getLocalizedMessage();
                IronLog.INTERNAL.error(mo36539c(str));
                if (this.f17012c != null) {
                    this.f17012c.f16927e.mo36487m(str);
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo36535c() {
        super.mo36535c();
        BaseAdInteractionAdapter<?, AdapterAdInteractionListener> baseAdInteractionAdapter = this.f17008h;
        if (baseAdInteractionAdapter != null) {
            try {
                baseAdInteractionAdapter.releaseMemory();
            } catch (Exception e) {
                String format = String.format("releaseMemory - exception = ", new Object[]{e});
                IronLog.INTERNAL.verbose(mo36539c(format));
                if (this.f17012c != null) {
                    this.f17012c.f16927e.mo36487m(format);
                }
            }
            this.f17008h = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        ((com.ironsource.mediationsdk.adunit.p209c.p210a.C6551a) r5.f17011b).mo36497c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdClosed() {
        /*
            r5 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = ""
            java.lang.String r1 = r5.mo36539c(r1)
            r0.verbose(r1)
            java.lang.Object r0 = r5.f17016g
            monitor-enter(r0)
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = r5.f17013d     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c.C6571a.SHOWING     // Catch:{ all -> 0x0087 }
            if (r1 != r2) goto L_0x0068
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c.C6571a.NONE     // Catch:{ all -> 0x0087 }
            r5.mo36536a((com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c.C6571a) r1)     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.b.d r1 = r5.f17012c     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = ""
            com.ironsource.mediationsdk.adunit.d.a r2 = r5.f17010a     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = r2.f16999a     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x0087 }
            if (r2 != r3) goto L_0x0054
            com.ironsource.mediationsdk.adunit.c.a.b r1 = r5.f17011b     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.c.a.a r1 = (com.ironsource.mediationsdk.adunit.p209c.p210a.C6551a) r1     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r1.mo36496c()     // Catch:{ all -> 0x0087 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = "otherInstanceAvailable = "
            r2.<init>(r3)     // Catch:{ all -> 0x0087 }
            int r3 = r1.length()     // Catch:{ all -> 0x0087 }
            if (r3 <= 0) goto L_0x004b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            java.lang.String r4 = "true|"
            r3.<init>(r4)     // Catch:{ all -> 0x0087 }
            r3.append(r1)     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0087 }
            goto L_0x004d
        L_0x004b:
            java.lang.String r1 = "false"
        L_0x004d:
            r2.append(r1)     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0087 }
        L_0x0054:
            com.ironsource.mediationsdk.adunit.b.d r2 = r5.f17012c     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.b.a r2 = r2.f16926d     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = r5.mo36551q()     // Catch:{ all -> 0x0087 }
            r2.mo36439a(r3, r1)     // Catch:{ all -> 0x0087 }
        L_0x005f:
            monitor-exit(r0)     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.c.a.b r0 = r5.f17011b
            com.ironsource.mediationsdk.adunit.c.a.a r0 = (com.ironsource.mediationsdk.adunit.p209c.p210a.C6551a) r0
            r0.mo36497c(r5)
            return
        L_0x0068:
            com.ironsource.mediationsdk.adunit.b.d r1 = r5.f17012c     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x0085
            com.ironsource.mediationsdk.adunit.b.d r1 = r5.f17012c     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.b.i r1 = r1.f16927e     // Catch:{ all -> 0x0087 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = "unexpected closed for "
            r2.<init>(r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = r5.mo36547m()     // Catch:{ all -> 0x0087 }
            r2.append(r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0087 }
            r1.mo36485k(r2)     // Catch:{ all -> 0x0087 }
        L_0x0085:
            monitor-exit(r0)     // Catch:{ all -> 0x0087 }
            return
        L_0x0087:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0087 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p212d.p213a.C6568a.onAdClosed():void");
    }

    public void onAdEnded() {
        IronLog.INTERNAL.verbose(mo36539c(""));
        if (this.f17012c != null) {
            this.f17012c.f16926d.mo36446f(mo36551q());
        }
        ((C6551a) this.f17011b).mo36499e(this);
    }

    public void onAdOpened() {
        IronLog.INTERNAL.verbose(mo36539c(""));
        if (this.f17012c != null) {
            this.f17012c.f16926d.mo36443c(mo36551q());
        }
        ((C6551a) this.f17011b).mo36495b(this);
    }

    public void onAdShowFailed(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo36539c("error = " + i + ", " + str));
        if (this.f17013d == C6570c.C6571a.SHOWING) {
            mo36536a(C6570c.C6571a.FAILED);
            if (this.f17012c != null) {
                this.f17012c.f16926d.mo36438a(mo36551q(), i, str, "");
            }
            ((C6551a) this.f17011b).mo36494a(new IronSourceError(i, str), this);
        } else if (this.f17012c != null) {
            this.f17012c.f16927e.mo36484j(String.format("unexpected show failed for %s, error - %d, %s", new Object[]{mo36547m(), Integer.valueOf(i), str}));
        }
    }

    public void onAdShowSuccess() {
        IronLog.INTERNAL.verbose(mo36539c(""));
        if (this.f17012c != null) {
            this.f17012c.f16926d.mo36442b(mo36551q());
        }
        ((C6551a) this.f17011b).mo36493a(this);
    }

    public void onAdStarted() {
        IronLog.INTERNAL.verbose(mo36539c(""));
        if (this.f17012c != null) {
            this.f17012c.f16926d.mo36445e(mo36551q());
        }
        ((C6551a) this.f17011b).mo36498d(this);
    }

    public void onAdVisible() {
        IronLog.INTERNAL.verbose(mo36539c(""));
        if (this.f17012c != null) {
            this.f17012c.f16926d.mo36447g(mo36551q());
        }
    }
}
