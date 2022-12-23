package com.ironsource.mediationsdk;

import com.ironsource.environment.p204e.C6387c;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.u */
public final class C6732u {

    /* renamed from: a */
    private static final C6732u f17552a = new C6732u();

    /* renamed from: b */
    private Map<String, Long> f17553b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<String, Boolean> f17554c = new HashMap();

    /* renamed from: d */
    private int f17555d;

    /* renamed from: e */
    private int f17556e;

    private C6732u() {
    }

    /* renamed from: a */
    public static synchronized C6732u m20387a() {
        C6732u uVar;
        synchronized (C6732u.class) {
            uVar = f17552a;
        }
        return uVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m20390b(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        this.f17553b.put(ad_unit.toString(), Long.valueOf(System.currentTimeMillis()));
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            C6432F.m19211a().mo35996a(ironSourceError);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6577ae.m20001a().mo36560a(ironSourceError);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    /* renamed from: a */
    public final void mo36953a(IronSource.AD_UNIT ad_unit, int i) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f17555d = i;
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f17556e = i;
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    /* renamed from: a */
    public final synchronized void mo36954a(final IronSource.AD_UNIT ad_unit, final IronSourceError ironSourceError) {
        int i;
        if (!mo36955a(ad_unit)) {
            final String ad_unit2 = ad_unit.toString();
            if (!this.f17553b.containsKey(ad_unit2)) {
                m20390b(ad_unit, ironSourceError);
                return;
            }
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i = this.f17555d;
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i = this.f17556e;
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.warning("ad unit not supported - " + ad_unit);
                i = 0;
            }
            long j = (long) (i * 1000);
            long currentTimeMillis = System.currentTimeMillis() - this.f17553b.get(ad_unit2).longValue();
            if (currentTimeMillis > j) {
                m20390b(ad_unit, ironSourceError);
                return;
            }
            this.f17554c.put(ad_unit2, Boolean.TRUE);
            long j2 = j - currentTimeMillis;
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose("delaying callback by " + j2);
            C6387c cVar = C6387c.f16171a;
            C6387c.m19068a(new Runnable() {
                public final void run() {
                    IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
                    C6732u.this.m20390b(ad_unit, ironSourceError);
                    C6732u.this.f17554c.put(ad_unit2, Boolean.FALSE);
                }
            }, j2);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo36955a(IronSource.AD_UNIT ad_unit) {
        if (!this.f17554c.containsKey(ad_unit.toString())) {
            return false;
        }
        return this.f17554c.get(ad_unit.toString()).booleanValue();
    }
}
