package com.ironsource.mediationsdk;

import android.util.Log;
import com.ironsource.mediationsdk.C6611b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.mediationsdk.p206a.C6522h;
import com.ironsource.mediationsdk.sdk.C6726l;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.ag */
public final class C6598ag extends C6611b implements RewardedVideoSmashListener {

    /* renamed from: r */
    JSONObject f17096r;
    /* access modifiers changed from: package-private */

    /* renamed from: s */
    public C6726l f17097s;
    /* access modifiers changed from: package-private */

    /* renamed from: t */
    public AtomicBoolean f17098t;
    /* access modifiers changed from: package-private */

    /* renamed from: u */
    public long f17099u;

    /* renamed from: v */
    String f17100v;

    /* renamed from: w */
    public int f17101w;

    /* renamed from: x */
    private int f17102x;

    /* renamed from: y */
    private final String f17103y = IronSourceConstants.REQUEST_URL;

    C6598ag(NetworkSettings networkSettings, int i) {
        super(networkSettings);
        JSONObject rewardedVideoSettings = networkSettings.getRewardedVideoSettings();
        this.f17096r = rewardedVideoSettings;
        this.f17126k = rewardedVideoSettings.optInt("maxAdsPerIteration", 99);
        this.f17127l = this.f17096r.optInt("maxAdsPerSession", 99);
        this.f17128m = this.f17096r.optInt("maxAdsPerDay", 99);
        this.f17100v = this.f17096r.optString(IronSourceConstants.REQUEST_URL);
        this.f17098t = new AtomicBoolean(false);
        this.f17102x = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m20068a(int i, Object[][] objArr) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData((C6611b) this);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.f17132q.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoSmash logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C6522h.m19751d().mo36349b(new C6517c(i, providerAdditionalData));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo36098g() {
        this.f17123h = 0;
        mo36614a(mo36603o() ? C6611b.C6612a.AVAILABLE : C6611b.C6612a.NOT_AVAILABLE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo36099h() {
        try {
            mo36620e();
            this.f17124i = new Timer();
            this.f17124i.schedule(new TimerTask() {
                public final void run() {
                    synchronized (C6598ag.this) {
                        cancel();
                        if (C6598ag.this.f17097s != null) {
                            String str = "Timeout for " + C6598ag.this.f17119d;
                            C6598ag.this.f17132q.log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                            C6598ag.this.mo36614a(C6611b.C6612a.NOT_AVAILABLE);
                            long time = new Date().getTime() - C6598ag.this.f17099u;
                            if (C6598ag.this.f17098t.compareAndSet(true, false)) {
                                C6598ag.this.m20068a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(time)}});
                                C6598ag.this.m20068a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(time)}});
                            } else {
                                C6598ag.this.m20068a(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(time)}});
                            }
                            C6598ag.this.f17097s.mo36591a(false, C6598ag.this);
                        }
                    }
                }
            }, (long) (this.f17102x * 1000));
        } catch (Exception e) {
            mo36615a("startInitTimer", e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo36100i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo36101k() {
        return IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE;
    }

    /* renamed from: n */
    public final void mo36602n() {
        this.f17131p = null;
        if (this.f17117b != null) {
            if (!(this.f17116a == C6611b.C6612a.CAPPED_PER_DAY || this.f17116a == C6611b.C6612a.CAPPED_PER_SESSION)) {
                this.f17098t.set(true);
                this.f17099u = new Date().getTime();
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f17132q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, this.f17119d + ":fetchRewardedVideoForAutomaticLoad()", 1);
            this.f17117b.fetchRewardedVideoForAutomaticLoad(this.f17096r, this);
        }
    }

    /* renamed from: o */
    public final boolean mo36603o() {
        if (this.f17117b == null) {
            return false;
        }
        IronSourceLoggerManager ironSourceLoggerManager = this.f17132q;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.f17119d + ":isRewardedVideoAvailable()", 1);
        return this.f17117b.isRewardedVideoAvailable(this.f17096r);
    }

    public final void onRewardedVideoAdClicked() {
        C6726l lVar = this.f17097s;
        if (lVar != null) {
            lVar.mo36599f(this);
        }
    }

    public final void onRewardedVideoAdClosed() {
        C6726l lVar = this.f17097s;
        if (lVar != null) {
            lVar.mo36592b(this);
        }
        mo36602n();
    }

    public final void onRewardedVideoAdEnded() {
        C6726l lVar = this.f17097s;
        if (lVar != null) {
            lVar.mo36596d(this);
        }
    }

    public final void onRewardedVideoAdOpened() {
        C6726l lVar = this.f17097s;
        if (lVar != null) {
            lVar.mo36586a(this);
        }
    }

    public final void onRewardedVideoAdRewarded() {
        C6726l lVar = this.f17097s;
        if (lVar != null) {
            lVar.mo36598e(this);
        }
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        C6726l lVar = this.f17097s;
        if (lVar != null) {
            lVar.mo36587a(ironSourceError, this);
        }
    }

    public final void onRewardedVideoAdStarted() {
        C6726l lVar = this.f17097s;
        if (lVar != null) {
            lVar.mo36593c(this);
        }
    }

    public final void onRewardedVideoAdVisible() {
        C6726l lVar = this.f17097s;
        if (lVar != null) {
            lVar.mo36600g(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onRewardedVideoAvailabilityChanged(boolean r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.mo36620e()     // Catch:{ all -> 0x00b4 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.f17098t     // Catch:{ all -> 0x00b4 }
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r2, r1)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0036
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x00b4 }
            r0.<init>()     // Catch:{ all -> 0x00b4 }
            long r3 = r0.getTime()     // Catch:{ all -> 0x00b4 }
            long r5 = r8.f17099u     // Catch:{ all -> 0x00b4 }
            long r3 = r3 - r5
            if (r9 == 0) goto L_0x001f
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0021
        L_0x001f:
            r0 = 1200(0x4b0, float:1.682E-42)
        L_0x0021:
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x00b4 }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00b4 }
            java.lang.String r7 = "duration"
            r6[r1] = r7     // Catch:{ all -> 0x00b4 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00b4 }
            r6[r2] = r3     // Catch:{ all -> 0x00b4 }
            r5[r1] = r6     // Catch:{ all -> 0x00b4 }
            r8.m20068a(r0, r5)     // Catch:{ all -> 0x00b4 }
            goto L_0x0041
        L_0x0036:
            if (r9 == 0) goto L_0x003b
            r0 = 1207(0x4b7, float:1.691E-42)
            goto L_0x003d
        L_0x003b:
            r0 = 1208(0x4b8, float:1.693E-42)
        L_0x003d:
            r1 = 0
            r8.m20068a(r0, r1)     // Catch:{ all -> 0x00b4 }
        L_0x0041:
            boolean r0 = r8.mo36618c()     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x009a
            if (r9 == 0) goto L_0x004f
            com.ironsource.mediationsdk.b$a r0 = r8.f17116a     // Catch:{ all -> 0x00b4 }
            com.ironsource.mediationsdk.b$a r1 = com.ironsource.mediationsdk.C6611b.C6612a.AVAILABLE     // Catch:{ all -> 0x00b4 }
            if (r0 != r1) goto L_0x0057
        L_0x004f:
            if (r9 != 0) goto L_0x0078
            com.ironsource.mediationsdk.b$a r0 = r8.f17116a     // Catch:{ all -> 0x00b4 }
            com.ironsource.mediationsdk.b$a r1 = com.ironsource.mediationsdk.C6611b.C6612a.NOT_AVAILABLE     // Catch:{ all -> 0x00b4 }
            if (r0 == r1) goto L_0x0078
        L_0x0057:
            if (r9 == 0) goto L_0x005c
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C6611b.C6612a.AVAILABLE     // Catch:{ all -> 0x00b4 }
            goto L_0x005e
        L_0x005c:
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C6611b.C6612a.NOT_AVAILABLE     // Catch:{ all -> 0x00b4 }
        L_0x005e:
            r8.mo36614a(r0)     // Catch:{ all -> 0x00b4 }
            if (r9 == 0) goto L_0x006d
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00b4 }
            r8.f17130o = r0     // Catch:{ all -> 0x00b4 }
        L_0x006d:
            com.ironsource.mediationsdk.sdk.l r0 = r8.f17097s     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x00b2
            com.ironsource.mediationsdk.sdk.l r0 = r8.f17097s     // Catch:{ all -> 0x00b4 }
            r0.mo36591a((boolean) r9, (com.ironsource.mediationsdk.C6598ag) r8)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r8)
            return
        L_0x0078:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r1.<init>()     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = r8.f17119d     // Catch:{ all -> 0x00b4 }
            r1.append(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = ": state remains "
            r1.append(r2)     // Catch:{ all -> 0x00b4 }
            r1.append(r9)     // Catch:{ all -> 0x00b4 }
            java.lang.String r9 = " in smash, mediation remains unchanged"
            r1.append(r9)     // Catch:{ all -> 0x00b4 }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x00b4 }
            r0.info(r9)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r8)
            return
        L_0x009a:
            com.ironsource.mediationsdk.logger.IronLog r9 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00b4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r0.<init>()     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = r8.f17119d     // Catch:{ all -> 0x00b4 }
            r0.append(r1)     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = ": is capped or exhausted"
            r0.append(r1)     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b4 }
            r9.info(r0)     // Catch:{ all -> 0x00b4 }
        L_0x00b2:
            monitor-exit(r8)
            return
        L_0x00b4:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6598ag.onRewardedVideoAvailabilityChanged(boolean):void");
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    public final void onRewardedVideoInitSuccess() {
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        long time = new Date().getTime() - this.f17099u;
        if (ironSourceError.getErrorCode() == 1058) {
            m20068a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(time)}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f17131p = Long.valueOf(System.currentTimeMillis());
        }
        m20068a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(time)}});
    }

    public final void onRewardedVideoLoadSuccess() {
    }
}
