package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.environment.C6363a;
import com.ironsource.environment.C6397j;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.C6611b;
import com.ironsource.mediationsdk.logger.C6643c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.mediationsdk.p206a.C6522h;
import com.ironsource.mediationsdk.sdk.C6701i;
import com.ironsource.mediationsdk.sdk.C6726l;
import com.ironsource.mediationsdk.utils.C6737d;
import com.ironsource.mediationsdk.utils.C6738e;
import com.ironsource.mediationsdk.utils.C6745k;
import com.ironsource.mediationsdk.utils.C6753o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.af */
final class C6596af extends C6507a implements C6397j, C6619c, C6726l, C6737d {

    /* renamed from: m */
    C6701i f17082m;

    /* renamed from: n */
    boolean f17083n = false;

    /* renamed from: o */
    int f17084o;

    /* renamed from: p */
    C6421B f17085p;

    /* renamed from: q */
    private final String f17086q = getClass().getSimpleName();

    /* renamed from: r */
    private boolean f17087r = false;

    /* renamed from: s */
    private NetworkStateReceiver f17088s;

    /* renamed from: t */
    private Placement f17089t;

    /* renamed from: u */
    private Timer f17090u = null;

    /* renamed from: v */
    private List<C6611b.C6612a> f17091v = Arrays.asList(new C6611b.C6612a[]{C6611b.C6612a.INIT_FAILED, C6611b.C6612a.CAPPED_PER_SESSION, C6611b.C6612a.EXHAUSTED, C6611b.C6612a.CAPPED_PER_DAY});

    /* renamed from: w */
    private boolean f17092w = false;

    /* renamed from: x */
    private long f17093x = new Date().getTime();

    /* renamed from: y */
    private boolean f17094y = false;

    C6596af() {
        this.f16716a = new C6738e("rewarded_video", this);
    }

    /* renamed from: a */
    private void m20027a(int i) {
        m20029a(i, (Object[][]) null);
    }

    /* renamed from: a */
    private void m20028a(int i, C6611b bVar, Object[][] objArr) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(bVar);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoManager logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C6522h.m19751d().mo36349b(new C6517c(i, providerAdditionalData));
    }

    /* renamed from: a */
    private void m20029a(int i, Object[][] objArr) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoManager logMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C6522h.m19751d().mo36349b(new C6517c(i, mediationAdditionalData));
    }

    /* renamed from: a */
    private synchronized void m20030a(C6611b bVar, int i) {
        Object[][] objArr;
        C6745k.m20451c((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.f17089t);
        if (C6745k.m20452c((Context) ContextProvider.getInstance().getCurrentActiveActivity(), m20045p())) {
            m20029a((int) IronSourceConstants.RV_CAP_PLACEMENT, new Object[][]{new Object[]{"placement", m20045p()}});
        }
        this.f16716a.mo36963a(bVar);
        if (this.f17089t != null) {
            if (this.f17083n) {
                m20031a(((C6598ag) bVar).f17100v, true, this.f17089t.getPlacementId());
                int placementId = this.f17089t.getPlacementId();
                int i2 = 0;
                while (i2 < i && i2 < this.f16718c.size()) {
                    if (!this.f17091v.contains(((C6611b) this.f16718c.get(i2)).f17116a)) {
                        m20031a(((C6598ag) this.f16718c.get(i2)).f17100v, false, placementId);
                    }
                    i2++;
                }
            }
            String p = m20045p();
            m20028a((int) IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, bVar, new Object[][]{new Object[]{"placement", p}, new Object[]{"status", "true"}});
            int i3 = 0;
            while (i3 < this.f16718c.size() && i3 < i) {
                C6611b bVar2 = (C6611b) this.f16718c.get(i3);
                if (bVar2.f17116a == C6611b.C6612a.NOT_AVAILABLE || bVar2.f17116a == C6611b.C6612a.NEEDS_RELOAD) {
                    m20028a((int) IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, bVar2, new Object[][]{new Object[]{"placement", p}, new Object[]{"status", "false"}});
                }
                i3++;
            }
        } else {
            this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
        if (this.f17089t != null) {
            objArr = new Object[][]{new Object[]{"placement", m20045p()}};
        } else {
            objArr = null;
        }
        m20028a((int) IronSourceConstants.RV_INSTANCE_SHOW, bVar, objArr);
        this.f17094y = true;
        this.f17085p.mo35977a();
        ((C6598ag) bVar).f17101w = C6753o.m20481a().mo36990b(1);
        C6598ag agVar = (C6598ag) bVar;
        if (agVar.f17117b != null) {
            agVar.f17132q.log(IronSourceLogger.IronSourceTag.INTERNAL, agVar.f17119d + ":showRewardedVideo()", 1);
            agVar.mo36619d();
            agVar.f17117b.showRewardedVideo(agVar.f17096r, agVar);
        }
    }

    /* renamed from: a */
    private synchronized void m20031a(String str, boolean z, int i) {
        String str2 = "";
        try {
            str2 = (str2 + str) + "&sdkVersion=" + IronSourceUtils.getSDKVersion();
            Thread thread = new Thread(new Runnable(str2, z, i) {

                /* renamed from: a */
                private /* synthetic */ String f17546a;

                /* renamed from: b */
                private /* synthetic */ boolean f17547b;

                /* renamed from: c */
                private /* synthetic */ int f17548c;

                {
                    this.f17546a = r1;
                    this.f17547b = r2;
                    this.f17548c = r3;
                }

                public final void run() {
                    String str = this.f17546a;
                    boolean z = this.f17547b;
                    try {
                        new JSONObject(HttpFunctions.getStringFromURL(ServerURL.getRequestURL(str, z, this.f17548c)));
                        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NETWORK;
                        logger.log(ironSourceTag, "callRequestURL(reqUrl:" + str + ", hit:" + z + ")", 1);
                    } catch (Throwable th) {
                        StringBuilder sb = new StringBuilder("callRequestURL(reqUrl:");
                        if (str == null) {
                            sb.append("null");
                        } else {
                            sb.append(str);
                        }
                        sb.append(", hit:");
                        sb.append(z);
                        sb.append(")");
                        IronSourceLoggerManager logger2 = IronSourceLoggerManager.getLogger();
                        IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NETWORK;
                        logger2.log(ironSourceTag2, sb.toString() + ", e:" + Log.getStackTraceString(th), 0);
                    }
                }
            }, "callAsyncRequestURL");
            thread.setUncaughtExceptionHandler(new C6643c());
            thread.start();
        } catch (Throwable th) {
            this.f16723h.logException(IronSourceLogger.IronSourceTag.NETWORK, "reportImpression:(providerURL:" + str2 + ", hit:" + z + ")", th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m20032a(java.util.Map<java.lang.String, java.lang.Object> r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ironsource.mediationsdk.b r0 = r2.f16719d     // Catch:{ all -> 0x004a }
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r0 = r2.f16726k     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0023
            r2.f16726k = r1     // Catch:{ all -> 0x004a }
            com.ironsource.mediationsdk.b r3 = r2.f16719d     // Catch:{ all -> 0x004a }
            com.ironsource.mediationsdk.ag r3 = (com.ironsource.mediationsdk.C6598ag) r3     // Catch:{ all -> 0x004a }
            com.ironsource.mediationsdk.AbstractAdapter r3 = r2.m20036h(r3)     // Catch:{ all -> 0x004a }
            if (r3 != 0) goto L_0x0021
            com.ironsource.mediationsdk.sdk.i r3 = r2.f17082m     // Catch:{ all -> 0x004a }
            java.lang.Boolean r0 = r2.f16725j     // Catch:{ all -> 0x004a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004a }
            r3.onRewardedVideoAvailabilityChanged(r0)     // Catch:{ all -> 0x004a }
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            boolean r0 = r2.m20040k()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x003d
            r3 = 0
            boolean r3 = r2.m20033a((boolean) r1, (boolean) r3)     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0048
            com.ironsource.mediationsdk.sdk.i r3 = r2.f17082m     // Catch:{ all -> 0x004a }
            java.lang.Boolean r0 = r2.f16725j     // Catch:{ all -> 0x004a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004a }
            r3.onRewardedVideoAvailabilityChanged(r0)     // Catch:{ all -> 0x004a }
            monitor-exit(r2)
            return
        L_0x003d:
            com.ironsource.mediationsdk.sdk.i r0 = r2.f17082m     // Catch:{ all -> 0x004a }
            java.lang.Boolean r1 = r2.f16725j     // Catch:{ all -> 0x004a }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x004a }
            r0.mo36917a((boolean) r1, (java.util.Map<java.lang.String, java.lang.Object>) r3)     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r2)
            return
        L_0x004a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6596af.m20032a(java.util.Map):void");
    }

    /* renamed from: a */
    private synchronized boolean m20033a(boolean z, boolean z2) {
        boolean z3;
        Boolean bool;
        z3 = false;
        if (this.f16725j == null) {
            mo36595d();
            if (z) {
                bool = Boolean.TRUE;
            } else if (!m20040k() && m20037h()) {
                bool = Boolean.FALSE;
            }
        } else if (z && !this.f16725j.booleanValue()) {
            bool = Boolean.TRUE;
        } else if (!z && this.f16725j.booleanValue() && ((!m20039j() || z2) && !m20040k())) {
            bool = Boolean.FALSE;
        }
        this.f16725j = bool;
        z3 = true;
        return z3;
    }

    /* renamed from: b */
    private void m20034b(boolean z) {
        if (!z && mo36594c()) {
            m20029a(1000, (Object[][]) null);
            m20029a(1003, new Object[][]{new Object[]{"duration", 0}});
            this.f17092w = false;
        } else if (m20038i()) {
            m20029a(1000, (Object[][]) null);
            this.f17092w = true;
            this.f17093x = new Date().getTime();
        }
    }

    /* renamed from: f */
    private AbstractAdapter m20035f() {
        AbstractAdapter abstractAdapter = null;
        int i = 0;
        for (int i2 = 0; i2 < this.f16718c.size() && abstractAdapter == null; i2++) {
            if (((C6611b) this.f16718c.get(i2)).f17116a == C6611b.C6612a.AVAILABLE || ((C6611b) this.f16718c.get(i2)).f17116a == C6611b.C6612a.INITIATED) {
                i++;
                if (i >= this.f16717b) {
                    break;
                }
            } else if (((C6611b) this.f16718c.get(i2)).f17116a == C6611b.C6612a.NOT_INITIATED && (abstractAdapter = m20036h((C6598ag) this.f16718c.get(i2))) == null) {
                ((C6611b) this.f16718c.get(i2)).mo36614a(C6611b.C6612a.INIT_FAILED);
            }
        }
        return abstractAdapter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a8, code lost:
        return r0;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.ironsource.mediationsdk.AbstractAdapter m20036h(com.ironsource.mediationsdk.C6598ag r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f16723h     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            r2.<init>()     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = r9.f17086q     // Catch:{ all -> 0x00d7 }
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = ":startAdapter("
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = r10.f17119d     // Catch:{ all -> 0x00d7 }
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00d7 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.d r0 = com.ironsource.mediationsdk.C6622d.m20139a()     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r10.f17118c     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r10.f17118c     // Catch:{ all -> 0x00d7 }
            org.json.JSONObject r2 = r2.getRewardedVideoSettings()     // Catch:{ all -> 0x00d7 }
            r4 = 0
            com.ironsource.mediationsdk.AbstractAdapter r0 = r0.mo36647a(r1, r2, r4, r4)     // Catch:{ all -> 0x00d7 }
            r1 = 0
            if (r0 != 0) goto L_0x0057
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f16723h     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            r3.<init>()     // Catch:{ all -> 0x00d7 }
            java.lang.String r10 = r10.f17119d     // Catch:{ all -> 0x00d7 }
            r3.append(r10)     // Catch:{ all -> 0x00d7 }
            java.lang.String r10 = " is configured in IronSource's platform, but the adapter is not integrated"
            r3.append(r10)     // Catch:{ all -> 0x00d7 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00d7 }
            r3 = 2
            r0.log(r2, r10, r3)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r9)
            return r1
        L_0x0057:
            r10.f17117b = r0     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C6611b.C6612a.INITIATED     // Catch:{ all -> 0x00d7 }
            r10.mo36614a(r2)     // Catch:{ all -> 0x00d7 }
            r9.mo36330b(r10)     // Catch:{ all -> 0x00d7 }
            r2 = 1001(0x3e9, float:1.403E-42)
            r9.m20028a((int) r2, (com.ironsource.mediationsdk.C6611b) r10, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x00d7 }
            java.lang.String r2 = r9.f16722g     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = r9.f16721f     // Catch:{ all -> 0x00a9 }
            r10.mo36099h()     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f17117b     // Catch:{ all -> 0x00a9 }
            if (r5 == 0) goto L_0x00a7
            java.util.concurrent.atomic.AtomicBoolean r5 = r10.f17098t     // Catch:{ all -> 0x00a9 }
            r5.set(r3)     // Catch:{ all -> 0x00a9 }
            java.util.Date r5 = new java.util.Date     // Catch:{ all -> 0x00a9 }
            r5.<init>()     // Catch:{ all -> 0x00a9 }
            long r5 = r5.getTime()     // Catch:{ all -> 0x00a9 }
            r10.f17099u = r5     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f17117b     // Catch:{ all -> 0x00a9 }
            r5.addRewardedVideoListener(r10)     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r10.f17132q     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x00a9 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r7.<init>()     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = r10.f17119d     // Catch:{ all -> 0x00a9 }
            r7.append(r8)     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = ":initRewardedVideo()"
            r7.append(r8)     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00a9 }
            r5.log(r6, r7, r3)     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.AbstractAdapter r3 = r10.f17117b     // Catch:{ all -> 0x00a9 }
            org.json.JSONObject r5 = r10.f17096r     // Catch:{ all -> 0x00a9 }
            r3.initRewardedVideo(r2, r4, r5, r10)     // Catch:{ all -> 0x00a9 }
        L_0x00a7:
            monitor-exit(r9)
            return r0
        L_0x00a9:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r9.f16723h     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            r4.<init>()     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = r9.f17086q     // Catch:{ all -> 0x00d7 }
            r4.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = "failed to init adapter: "
            r4.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = r10.mo36622j()     // Catch:{ all -> 0x00d7 }
            r4.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = "v"
            r4.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00d7 }
            r2.logException(r3, r4, r0)     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C6611b.C6612a.INIT_FAILED     // Catch:{ all -> 0x00d7 }
            r10.mo36614a(r0)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r9)
            return r1
        L_0x00d7:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6596af.m20036h(com.ironsource.mediationsdk.ag):com.ironsource.mediationsdk.AbstractAdapter");
    }

    /* renamed from: h */
    private synchronized boolean m20037h() {
        int i;
        Iterator it = this.f16718c.iterator();
        i = 0;
        while (it.hasNext()) {
            C6611b bVar = (C6611b) it.next();
            if (bVar.f17116a == C6611b.C6612a.INIT_FAILED || bVar.f17116a == C6611b.C6612a.CAPPED_PER_DAY || bVar.f17116a == C6611b.C6612a.CAPPED_PER_SESSION || bVar.f17116a == C6611b.C6612a.NOT_AVAILABLE || bVar.f17116a == C6611b.C6612a.NEEDS_RELOAD || bVar.f17116a == C6611b.C6612a.EXHAUSTED) {
                i++;
            }
        }
        return this.f16718c.size() == i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000d  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m20038i() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.f16718c     // Catch:{ all -> 0x003c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x003c }
        L_0x0007:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C6611b) r1     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r2 = r1.f17116a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C6611b.C6612a.NOT_AVAILABLE     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r2 = r1.f17116a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C6611b.C6612a.NEEDS_RELOAD     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r2 = r1.f17116a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C6611b.C6612a.AVAILABLE     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r2 = r1.f17116a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C6611b.C6612a.INITIATED     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r2 = r1.f17116a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C6611b.C6612a.INIT_PENDING     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r1 = r1.f17116a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C6611b.C6612a.LOAD_PENDING     // Catch:{ all -> 0x003c }
            if (r1 != r2) goto L_0x0007
        L_0x0037:
            r0 = 1
        L_0x0038:
            monitor-exit(r4)
            return r0
        L_0x003a:
            r0 = 0
            goto L_0x0038
        L_0x003c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6596af.m20038i():boolean");
    }

    /* renamed from: j */
    private synchronized boolean m20039j() {
        boolean z;
        z = false;
        Iterator it = this.f16718c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C6611b) it.next()).f17116a == C6611b.C6612a.AVAILABLE) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    /* renamed from: k */
    private synchronized boolean m20040k() {
        if (this.f16719d == null) {
            return false;
        }
        return ((C6598ag) this.f16719d).mo36603o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m20041l() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.AbstractAdapter r0 = r9.m20035f()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r9)
            return
        L_0x0009:
            r0 = 4
            com.ironsource.mediationsdk.b$a[] r1 = new com.ironsource.mediationsdk.C6611b.C6612a[r0]     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C6611b.C6612a.NOT_AVAILABLE     // Catch:{ all -> 0x005a }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C6611b.C6612a.NEEDS_RELOAD     // Catch:{ all -> 0x005a }
            r4 = 1
            r1[r4] = r2     // Catch:{ all -> 0x005a }
            r2 = 2
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C6611b.C6612a.CAPPED_PER_SESSION     // Catch:{ all -> 0x005a }
            r1[r2] = r4     // Catch:{ all -> 0x005a }
            r2 = 3
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C6611b.C6612a.CAPPED_PER_DAY     // Catch:{ all -> 0x005a }
            r1[r2] = r4     // Catch:{ all -> 0x005a }
            java.util.concurrent.CopyOnWriteArrayList r2 = r9.f16718c     // Catch:{ all -> 0x005a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x005a }
            r4 = r3
        L_0x0027:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x0041
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b r5 = (com.ironsource.mediationsdk.C6611b) r5     // Catch:{ all -> 0x005a }
            r6 = r3
        L_0x0034:
            if (r6 >= r0) goto L_0x0027
            r7 = r1[r6]     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b$a r8 = r5.f17116a     // Catch:{ all -> 0x005a }
            if (r8 != r7) goto L_0x003e
            int r4 = r4 + 1
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0034
        L_0x0041:
            java.util.concurrent.CopyOnWriteArrayList r0 = r9.f16718c     // Catch:{ all -> 0x005a }
            int r0 = r0.size()     // Catch:{ all -> 0x005a }
            if (r4 >= r0) goto L_0x004e
            r9.m20042m()     // Catch:{ all -> 0x005a }
            monitor-exit(r9)
            return
        L_0x004e:
            boolean r0 = r9.m20033a((boolean) r3, (boolean) r3)     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0058
            r0 = 0
            r9.m20032a((java.util.Map<java.lang.String, java.lang.Object>) r0)     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r9)
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6596af.m20041l():void");
    }

    /* renamed from: m */
    private synchronized void m20042m() {
        if (m20043n()) {
            this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Reset Iteration", 0);
            Iterator it = this.f16718c.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C6611b bVar = (C6611b) it.next();
                if (bVar.f17116a == C6611b.C6612a.EXHAUSTED) {
                    bVar.mo36098g();
                }
                if (bVar.f17116a == C6611b.C6612a.AVAILABLE) {
                    z = true;
                }
            }
            this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, "End of Reset Iteration", 0);
            if (m20033a(z, false)) {
                this.f17082m.onRewardedVideoAvailabilityChanged(this.f16725j.booleanValue());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0028 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000d  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m20043n() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.f16718c     // Catch:{ all -> 0x002a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002a }
        L_0x0007:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0028
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C6611b) r1     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b$a r2 = r1.f17116a     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C6611b.C6612a.NOT_INITIATED     // Catch:{ all -> 0x002a }
            if (r2 == r3) goto L_0x0025
            com.ironsource.mediationsdk.b$a r2 = r1.f17116a     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C6611b.C6612a.INITIATED     // Catch:{ all -> 0x002a }
            if (r2 == r3) goto L_0x0025
            com.ironsource.mediationsdk.b$a r1 = r1.f17116a     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C6611b.C6612a.AVAILABLE     // Catch:{ all -> 0x002a }
            if (r1 != r2) goto L_0x0007
        L_0x0025:
            r0 = 0
        L_0x0026:
            monitor-exit(r4)
            return r0
        L_0x0028:
            r0 = 1
            goto L_0x0026
        L_0x002a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6596af.m20043n():boolean");
    }

    /* renamed from: o */
    private void m20044o() {
        for (int i = 0; i < this.f16718c.size(); i++) {
            String providerTypeForReflection = ((C6611b) this.f16718c.get(i)).f17118c.getProviderTypeForReflection();
            if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                C6622d.m20139a().mo36647a(((C6611b) this.f16718c.get(i)).f17118c, ((C6611b) this.f16718c.get(i)).f17118c.getRewardedVideoSettings(), false, false);
                return;
            }
        }
    }

    /* renamed from: p */
    private String m20045p() {
        Placement placement = this.f17089t;
        return placement == null ? "" : placement.getPlacementName();
    }

    /* renamed from: q */
    private void m20046q() {
        Iterator it = this.f16718c.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            C6611b bVar = (C6611b) it.next();
            if (bVar.f17116a == C6611b.C6612a.AVAILABLE && bVar.mo36623l() != null && bVar.mo36623l().longValue() < j) {
                j = bVar.mo36623l().longValue();
            }
        }
        if (j != Long.MAX_VALUE) {
            this.f17085p.mo35978a(System.currentTimeMillis() - j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36022a(Context context, boolean z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.f17086q + " Should Track Network State: " + z, 0);
        try {
            this.f16724i = z;
            if (this.f16724i) {
                if (this.f17088s == null) {
                    this.f17088s = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f17088s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f17088s != null) {
                context.getApplicationContext().unregisterReceiver(this.f17088s);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo36586a(C6598ag agVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, agVar.f17119d + ":onRewardedVideoAdOpened()", 1);
        m20028a(1005, (C6611b) agVar, new Object[][]{new Object[]{"placement", m20045p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(agVar.f17101w)}});
        this.f17082m.onRewardedVideoAdOpened();
    }

    /* renamed from: a */
    public final void mo36587a(IronSourceError ironSourceError, C6598ag agVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, agVar.f17119d + ":onRewardedVideoAdShowFailed(" + ironSourceError + ")", 1);
        this.f17094y = false;
        int i = agVar.f17101w;
        m20028a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, (C6611b) agVar, new Object[][]{new Object[]{"placement", m20045p()}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(i)}});
        m20034b(false);
        this.f17082m.onRewardedVideoAdShowFailed(ironSourceError);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36588a(Placement placement) {
        this.f17089t = placement;
        this.f17082m.f17496f = placement.getPlacementName();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36589a(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f16723h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r2.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r3 = r9.f17086q     // Catch:{ all -> 0x01a1 }
            r2.append(r3)     // Catch:{ all -> 0x01a1 }
            java.lang.String r3 = ":showRewardedVideo(placementName: "
            r2.append(r3)     // Catch:{ all -> 0x01a1 }
            r2.append(r10)     // Catch:{ all -> 0x01a1 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01a1 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.sdk.i r0 = r9.f17082m     // Catch:{ all -> 0x01a1 }
            r0.f17496f = r10     // Catch:{ all -> 0x01a1 }
            r0 = 1100(0x44c, float:1.541E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r3][]     // Catch:{ all -> 0x01a1 }
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = "placement"
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x01a1 }
            r4[r3] = r10     // Catch:{ all -> 0x01a1 }
            r1[r6] = r4     // Catch:{ all -> 0x01a1 }
            r9.m20029a((int) r0, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x01a1 }
            boolean r10 = r9.f17094y     // Catch:{ all -> 0x01a1 }
            r0 = 3
            if (r10 == 0) goto L_0x0057
            java.lang.String r10 = "showRewardedVideo error: can't show ad while an ad is already showing"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r9.f16723h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01a1 }
            r1.log(r2, r10, r0)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01a1 }
            r1 = 1022(0x3fe, float:1.432E-42)
            r0.<init>(r1, r10)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.sdk.i r10 = r9.f17082m     // Catch:{ all -> 0x01a1 }
            r10.onRewardedVideoAdShowFailed(r0)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x0057:
            boolean r10 = r9.f16724i     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x007f
            com.ironsource.environment.ContextProvider r10 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01a1 }
            android.app.Activity r10 = r10.getCurrentActiveActivity()     // Catch:{ all -> 0x01a1 }
            boolean r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r10)     // Catch:{ all -> 0x01a1 }
            if (r10 != 0) goto L_0x007f
            java.lang.String r10 = "showRewardedVideo error: can't show ad when there's no internet connection"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r9.f16723h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01a1 }
            r1.log(r2, r10, r0)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.sdk.i r10 = r9.f17082m     // Catch:{ all -> 0x01a1 }
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoInternetConnectionShowFailError(r0)     // Catch:{ all -> 0x01a1 }
            r10.onRewardedVideoAdShowFailed(r0)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x007f:
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ all -> 0x01a1 }
            r10.<init>()     // Catch:{ all -> 0x01a1 }
            r0 = r6
        L_0x0085:
            java.util.concurrent.CopyOnWriteArrayList r1 = r9.f16718c     // Catch:{ all -> 0x01a1 }
            int r1 = r1.size()     // Catch:{ all -> 0x01a1 }
            if (r0 >= r1) goto L_0x0173
            java.util.concurrent.CopyOnWriteArrayList r1 = r9.f16718c     // Catch:{ all -> 0x01a1 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C6611b) r1     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f16723h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            java.lang.String r8 = "showRewardedVideo, iterating on: "
            r7.<init>(r8)     // Catch:{ all -> 0x01a1 }
            java.lang.String r8 = r1.f17119d     // Catch:{ all -> 0x01a1 }
            r7.append(r8)     // Catch:{ all -> 0x01a1 }
            java.lang.String r8 = ", Status: "
            r7.append(r8)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.b$a r8 = r1.f17116a     // Catch:{ all -> 0x01a1 }
            r7.append(r8)     // Catch:{ all -> 0x01a1 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x01a1 }
            r4.log(r5, r7, r6)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.b$a r4 = r1.f17116a     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.b$a r5 = com.ironsource.mediationsdk.C6611b.C6612a.AVAILABLE     // Catch:{ all -> 0x01a1 }
            if (r4 != r5) goto L_0x016f
            r4 = r1
            com.ironsource.mediationsdk.ag r4 = (com.ironsource.mediationsdk.C6598ag) r4     // Catch:{ all -> 0x01a1 }
            boolean r4 = r4.mo36603o()     // Catch:{ all -> 0x01a1 }
            if (r4 == 0) goto L_0x0120
            r9.m20030a((com.ironsource.mediationsdk.C6611b) r1, (int) r0)     // Catch:{ all -> 0x01a1 }
            boolean r10 = r9.f16727l     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x00d7
            com.ironsource.mediationsdk.b r10 = r9.f16720e     // Catch:{ all -> 0x01a1 }
            boolean r10 = r1.equals(r10)     // Catch:{ all -> 0x01a1 }
            if (r10 != 0) goto L_0x00d7
            r9.mo36329b()     // Catch:{ all -> 0x01a1 }
        L_0x00d7:
            boolean r10 = r1.mo36617b()     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x00ed
            com.ironsource.mediationsdk.b$a r10 = com.ironsource.mediationsdk.C6611b.C6612a.CAPPED_PER_SESSION     // Catch:{ all -> 0x01a1 }
            r1.mo36614a(r10)     // Catch:{ all -> 0x01a1 }
            r10 = 1401(0x579, float:1.963E-42)
            r0 = 0
            r9.m20028a((int) r10, (com.ironsource.mediationsdk.C6611b) r1, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01a1 }
            r9.m20041l()     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x00ed:
            com.ironsource.mediationsdk.utils.e r10 = r9.f16716a     // Catch:{ all -> 0x01a1 }
            boolean r10 = r10.mo36966c((com.ironsource.mediationsdk.C6611b) r1)     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x0112
            com.ironsource.mediationsdk.b$a r10 = com.ironsource.mediationsdk.C6611b.C6612a.CAPPED_PER_DAY     // Catch:{ all -> 0x01a1 }
            r1.mo36614a(r10)     // Catch:{ all -> 0x01a1 }
            r10 = 150(0x96, float:2.1E-43)
            java.lang.Object[][] r0 = new java.lang.Object[r3][]     // Catch:{ all -> 0x01a1 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01a1 }
            java.lang.String r4 = "status"
            r2[r6] = r4     // Catch:{ all -> 0x01a1 }
            java.lang.String r4 = "true"
            r2[r3] = r4     // Catch:{ all -> 0x01a1 }
            r0[r6] = r2     // Catch:{ all -> 0x01a1 }
            r9.m20028a((int) r10, (com.ironsource.mediationsdk.C6611b) r1, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01a1 }
            r9.m20041l()     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x0112:
            boolean r10 = r1.mo36616a()     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x011e
            r9.m20035f()     // Catch:{ all -> 0x01a1 }
            r9.m20042m()     // Catch:{ all -> 0x01a1 }
        L_0x011e:
            monitor-exit(r9)
            return
        L_0x0120:
            java.lang.Long r4 = r1.mo36624m()     // Catch:{ all -> 0x01a1 }
            if (r4 == 0) goto L_0x0148
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r4.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = r1.f17119d     // Catch:{ all -> 0x01a1 }
            r4.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.Long r5 = r1.mo36624m()     // Catch:{ all -> 0x01a1 }
            r4.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = ","
            r4.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01a1 }
            r10.append(r4)     // Catch:{ all -> 0x01a1 }
        L_0x0148:
            r4 = r1
            com.ironsource.mediationsdk.ag r4 = (com.ironsource.mediationsdk.C6598ag) r4     // Catch:{ all -> 0x01a1 }
            r9.mo36591a((boolean) r6, (com.ironsource.mediationsdk.C6598ag) r4)     // Catch:{ all -> 0x01a1 }
            java.lang.Exception r4 = new java.lang.Exception     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = "FailedToShowVideoException"
            r4.<init>(r5)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f16723h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r8.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = r1.f17119d     // Catch:{ all -> 0x01a1 }
            r8.append(r1)     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = " Failed to show video"
            r8.append(r1)     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x01a1 }
            r5.logException(r7, r1, r4)     // Catch:{ all -> 0x01a1 }
        L_0x016f:
            int r0 = r0 + 1
            goto L_0x0085
        L_0x0173:
            boolean r0 = r9.m20040k()     // Catch:{ all -> 0x01a1 }
            if (r0 == 0) goto L_0x0186
            com.ironsource.mediationsdk.b r10 = r9.f16719d     // Catch:{ all -> 0x01a1 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r9.f16718c     // Catch:{ all -> 0x01a1 }
            int r0 = r0.size()     // Catch:{ all -> 0x01a1 }
            r9.m20030a((com.ironsource.mediationsdk.C6611b) r10, (int) r0)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x0186:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x01a1 }
            r0.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = "ext1"
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01a1 }
            r0.put(r1, r10)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.sdk.i r10 = r9.f17082m     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r1)     // Catch:{ all -> 0x01a1 }
            r10.mo36916a((com.ironsource.mediationsdk.logger.IronSourceError) r1, (java.util.Map<java.lang.String, java.lang.Object>) r0)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x01a1:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6596af.mo36589a(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00de, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36590a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f16723h     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00df }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r2.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r3 = r9.f17086q     // Catch:{ all -> 0x00df }
            r2.append(r3)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = ":initRewardedVideo(appKey: "
            r2.append(r3)     // Catch:{ all -> 0x00df }
            r2.append(r10)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = ", userId: "
            r2.append(r3)     // Catch:{ all -> 0x00df }
            r2.append(r11)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00df }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00df }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00df }
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x00df }
            r0.<init>()     // Catch:{ all -> 0x00df }
            long r0 = r0.getTime()     // Catch:{ all -> 0x00df }
            r2 = 81312(0x13da0, float:1.13942E-40)
            r9.m20027a((int) r2)     // Catch:{ all -> 0x00df }
            r9.f16722g = r10     // Catch:{ all -> 0x00df }
            r9.f16721f = r11     // Catch:{ all -> 0x00df }
            java.util.concurrent.CopyOnWriteArrayList r10 = r9.f16718c     // Catch:{ all -> 0x00df }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x00df }
            r11 = 0
            r2 = r11
        L_0x0047:
            boolean r4 = r10.hasNext()     // Catch:{ all -> 0x00df }
            r5 = 2
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r10.next()     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.b r4 = (com.ironsource.mediationsdk.C6611b) r4     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.utils.e r6 = r9.f16716a     // Catch:{ all -> 0x00df }
            boolean r6 = r6.mo36965b((com.ironsource.mediationsdk.C6611b) r4)     // Catch:{ all -> 0x00df }
            if (r6 == 0) goto L_0x006f
            r6 = 150(0x96, float:2.1E-43)
            java.lang.Object[][] r7 = new java.lang.Object[r3][]     // Catch:{ all -> 0x00df }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00df }
            java.lang.String r8 = "status"
            r5[r11] = r8     // Catch:{ all -> 0x00df }
            java.lang.String r8 = "false"
            r5[r3] = r8     // Catch:{ all -> 0x00df }
            r7[r11] = r5     // Catch:{ all -> 0x00df }
            r9.m20028a((int) r6, (com.ironsource.mediationsdk.C6611b) r4, (java.lang.Object[][]) r7)     // Catch:{ all -> 0x00df }
        L_0x006f:
            com.ironsource.mediationsdk.utils.e r5 = r9.f16716a     // Catch:{ all -> 0x00df }
            boolean r5 = r5.mo36966c((com.ironsource.mediationsdk.C6611b) r4)     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x0047
            com.ironsource.mediationsdk.b$a r5 = com.ironsource.mediationsdk.C6611b.C6612a.CAPPED_PER_DAY     // Catch:{ all -> 0x00df }
            r4.mo36614a(r5)     // Catch:{ all -> 0x00df }
            int r2 = r2 + 1
            goto L_0x0047
        L_0x007f:
            java.util.concurrent.CopyOnWriteArrayList r10 = r9.f16718c     // Catch:{ all -> 0x00df }
            int r10 = r10.size()     // Catch:{ all -> 0x00df }
            if (r2 != r10) goto L_0x008e
            com.ironsource.mediationsdk.sdk.i r10 = r9.f17082m     // Catch:{ all -> 0x00df }
            r10.onRewardedVideoAvailabilityChanged(r11)     // Catch:{ all -> 0x00df }
            monitor-exit(r9)
            return
        L_0x008e:
            r10 = 1000(0x3e8, float:1.401E-42)
            r9.m20027a((int) r10)     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.sdk.i r10 = r9.f17082m     // Catch:{ all -> 0x00df }
            r2 = 0
            r10.f17496f = r2     // Catch:{ all -> 0x00df }
            r9.f17092w = r3     // Catch:{ all -> 0x00df }
            java.util.Date r10 = new java.util.Date     // Catch:{ all -> 0x00df }
            r10.<init>()     // Catch:{ all -> 0x00df }
            long r6 = r10.getTime()     // Catch:{ all -> 0x00df }
            r9.f17093x = r6     // Catch:{ all -> 0x00df }
            java.util.Date r10 = new java.util.Date     // Catch:{ all -> 0x00df }
            r10.<init>()     // Catch:{ all -> 0x00df }
            long r6 = r10.getTime()     // Catch:{ all -> 0x00df }
            long r6 = r6 - r0
            r10 = 81313(0x13da1, float:1.13944E-40)
            java.lang.Object[][] r0 = new java.lang.Object[r3][]     // Catch:{ all -> 0x00df }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "duration"
            r1[r11] = r2     // Catch:{ all -> 0x00df }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x00df }
            r1[r3] = r2     // Catch:{ all -> 0x00df }
            r0[r11] = r1     // Catch:{ all -> 0x00df }
            r9.m20029a((int) r10, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x00df }
            r9.m20044o()     // Catch:{ all -> 0x00df }
        L_0x00c8:
            int r10 = r9.f16717b     // Catch:{ all -> 0x00df }
            if (r11 >= r10) goto L_0x00dd
            java.util.concurrent.CopyOnWriteArrayList r10 = r9.f16718c     // Catch:{ all -> 0x00df }
            int r10 = r10.size()     // Catch:{ all -> 0x00df }
            if (r11 >= r10) goto L_0x00dd
            com.ironsource.mediationsdk.AbstractAdapter r10 = r9.m20035f()     // Catch:{ all -> 0x00df }
            if (r10 == 0) goto L_0x00dd
            int r11 = r11 + 1
            goto L_0x00c8
        L_0x00dd:
            monitor-exit(r9)
            return
        L_0x00df:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6596af.mo36590a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo35903a(boolean z) {
        Boolean bool;
        if (this.f16724i) {
            boolean z2 = false;
            this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z, 0);
            if (this.f16725j != null) {
                if (z && !this.f16725j.booleanValue() && m20039j()) {
                    bool = Boolean.TRUE;
                } else if (!z && this.f16725j.booleanValue()) {
                    bool = Boolean.FALSE;
                }
                this.f16725j = bool;
                z2 = true;
            }
            if (z2) {
                this.f17087r = !z;
                this.f17082m.onRewardedVideoAvailabilityChanged(z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ed, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36591a(boolean r9, com.ironsource.mediationsdk.C6598ag r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r8.f16723h     // Catch:{ all -> 0x0117 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0117 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0117 }
            r2.<init>()     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = r10.f17119d     // Catch:{ all -> 0x0117 }
            r2.append(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = ": onRewardedVideoAvailabilityChanged(available:"
            r2.append(r3)     // Catch:{ all -> 0x0117 }
            r2.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0117 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0117 }
            boolean r0 = r8.f17087r     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x002a
            monitor-exit(r8)
            return
        L_0x002a:
            r0 = 0
            if (r9 == 0) goto L_0x0058
            boolean r1 = r8.f17092w     // Catch:{ all -> 0x0117 }
            if (r1 == 0) goto L_0x0058
            r8.f17092w = r0     // Catch:{ all -> 0x0117 }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x0117 }
            r1.<init>()     // Catch:{ all -> 0x0117 }
            long r1 = r1.getTime()     // Catch:{ all -> 0x0117 }
            long r4 = r8.f17093x     // Catch:{ all -> 0x0117 }
            long r1 = r1 - r4
            r4 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r5 = new java.lang.Object[r3][]     // Catch:{ all -> 0x0117 }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0117 }
            java.lang.String r7 = "duration"
            r6[r0] = r7     // Catch:{ all -> 0x0117 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0117 }
            r6[r3] = r1     // Catch:{ all -> 0x0117 }
            r5[r0] = r6     // Catch:{ all -> 0x0117 }
            r8.m20029a((int) r4, (java.lang.Object[][]) r5)     // Catch:{ all -> 0x0117 }
            r8.m20046q()     // Catch:{ all -> 0x0117 }
        L_0x0058:
            com.ironsource.mediationsdk.b r1 = r8.f16719d     // Catch:{ all -> 0x00ee }
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x0073
            boolean r0 = r8.m20033a((boolean) r9, (boolean) r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0071
            com.ironsource.mediationsdk.sdk.i r0 = r8.f17082m     // Catch:{ all -> 0x00ee }
            java.lang.Boolean r1 = r8.f16725j     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ee }
            r0.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x00ee }
        L_0x0071:
            monitor-exit(r8)
            return
        L_0x0073:
            com.ironsource.mediationsdk.b r1 = r8.f16720e     // Catch:{ all -> 0x00ee }
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00ba
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r8.f16723h     // Catch:{ all -> 0x00ee }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x00ee }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r4.<init>()     // Catch:{ all -> 0x00ee }
            java.lang.String r5 = r10.f17119d     // Catch:{ all -> 0x00ee }
            r4.append(r5)     // Catch:{ all -> 0x00ee }
            java.lang.String r5 = " is a premium adapter, canShowPremium: "
            r4.append(r5)     // Catch:{ all -> 0x00ee }
            boolean r5 = r8.mo36328a()     // Catch:{ all -> 0x00ee }
            r4.append(r5)     // Catch:{ all -> 0x00ee }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00ee }
            r1.log(r2, r4, r3)     // Catch:{ all -> 0x00ee }
            boolean r1 = r8.mo36328a()     // Catch:{ all -> 0x00ee }
            if (r1 != 0) goto L_0x00ba
            com.ironsource.mediationsdk.b$a r1 = com.ironsource.mediationsdk.C6611b.C6612a.CAPPED_PER_SESSION     // Catch:{ all -> 0x00ee }
            r10.mo36614a(r1)     // Catch:{ all -> 0x00ee }
            boolean r0 = r8.m20033a((boolean) r0, (boolean) r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00b8
            com.ironsource.mediationsdk.sdk.i r0 = r8.f17082m     // Catch:{ all -> 0x00ee }
            java.lang.Boolean r1 = r8.f16725j     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ee }
            r0.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x00ee }
        L_0x00b8:
            monitor-exit(r8)
            return
        L_0x00ba:
            com.ironsource.mediationsdk.utils.e r1 = r8.f16716a     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.mo36966c((com.ironsource.mediationsdk.C6611b) r10)     // Catch:{ all -> 0x00ee }
            if (r1 != 0) goto L_0x00ec
            if (r9 == 0) goto L_0x00dc
            boolean r1 = r10.mo36618c()     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00dc
            boolean r0 = r8.m20033a((boolean) r3, (boolean) r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00ec
            com.ironsource.mediationsdk.sdk.i r0 = r8.f17082m     // Catch:{ all -> 0x00ee }
            java.lang.Boolean r1 = r8.f16725j     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ee }
            r0.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x00ee }
            goto L_0x0115
        L_0x00dc:
            boolean r0 = r8.m20033a((boolean) r0, (boolean) r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            r8.m20032a((java.util.Map<java.lang.String, java.lang.Object>) r0)     // Catch:{ all -> 0x00ee }
        L_0x00e6:
            r8.m20035f()     // Catch:{ all -> 0x00ee }
            r8.m20042m()     // Catch:{ all -> 0x00ee }
        L_0x00ec:
            monitor-exit(r8)
            return
        L_0x00ee:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r8.f16723h     // Catch:{ all -> 0x0117 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0117 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = "onRewardedVideoAvailabilityChanged(available:"
            r3.<init>(r4)     // Catch:{ all -> 0x0117 }
            r3.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = ", provider:"
            r3.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = r10.mo36622j()     // Catch:{ all -> 0x0117 }
            r3.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = ")"
            r3.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x0117 }
            r1.logException(r2, r9, r0)     // Catch:{ all -> 0x0117 }
        L_0x0115:
            monitor-exit(r8)
            return
        L_0x0117:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6596af.mo36591a(boolean, com.ironsource.mediationsdk.ag):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo36329b() {
        super.mo36329b();
        Iterator it = this.f16718c.iterator();
        while (it.hasNext()) {
            C6611b bVar = (C6611b) it.next();
            if (bVar.equals(this.f16720e)) {
                bVar.mo36614a(C6611b.C6612a.CAPPED_PER_SESSION);
                m20035f();
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo36592b(C6598ag agVar) {
        String str;
        this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, agVar.f17119d + ":onRewardedVideoAdClosed()", 1);
        this.f17094y = false;
        StringBuilder sb = new StringBuilder();
        try {
            Iterator it = this.f16718c.iterator();
            while (it.hasNext()) {
                C6611b bVar = (C6611b) it.next();
                if (((C6598ag) bVar).mo36603o()) {
                    sb.append(bVar.f17119d + ";");
                }
            }
        } catch (Throwable unused) {
            this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Failed to check RV availability", 0);
        }
        Object[][] objArr = new Object[3][];
        objArr[0] = new Object[]{"placement", m20045p()};
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_EXT1;
        StringBuilder sb2 = new StringBuilder("otherRVAvailable = ");
        if (sb.length() > 0) {
            str = "true|" + sb;
        } else {
            str = "false";
        }
        sb2.append(str);
        objArr2[1] = sb2.toString();
        objArr[1] = objArr2;
        objArr[2] = new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(agVar.f17101w)};
        m20028a((int) IronSourceConstants.RV_INSTANCE_CLOSED, (C6611b) agVar, objArr);
        C6753o.m20481a().mo36988a(1);
        if (!agVar.mo36617b() && !this.f16716a.mo36966c((C6611b) agVar)) {
            m20028a(1001, (C6611b) agVar, (Object[][]) null);
        }
        m20034b(false);
        this.f17082m.onRewardedVideoAdClosed();
        m20046q();
        Iterator it2 = this.f16718c.iterator();
        while (it2.hasNext()) {
            C6611b bVar2 = (C6611b) it2.next();
            this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Fetch on ad closed, iterating on: " + bVar2.f17119d + ", Status: " + bVar2.f17116a, 0);
            if (bVar2.f17116a == C6611b.C6612a.NOT_AVAILABLE || bVar2.f17116a == C6611b.C6612a.NEEDS_RELOAD) {
                try {
                    if (!bVar2.f17119d.equals(agVar.f17119d)) {
                        this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, bVar2.f17119d + ":reload smash", 1);
                        ((C6598ag) bVar2).mo36602n();
                        m20028a(1001, bVar2, (Object[][]) null);
                    }
                } catch (Throwable th) {
                    this.f16723h.log(IronSourceLogger.IronSourceTag.NATIVE, bVar2.f17119d + " Failed to call fetchVideo(), " + th.getLocalizedMessage(), 1);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo36593c(C6598ag agVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, agVar.f17119d + ":onRewardedVideoAdStarted()", 1);
        m20028a((int) IronSourceConstants.RV_INSTANCE_STARTED, (C6611b) agVar, new Object[][]{new Object[]{"placement", m20045p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(agVar.f17101w)}});
        this.f17082m.onRewardedVideoAdStarted();
    }

    /* renamed from: c */
    public final synchronized boolean mo36594c() {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, this.f17086q + ":isRewardedVideoAvailable()", 1);
        if (this.f16724i && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            return false;
        }
        Iterator it = this.f16718c.iterator();
        while (it.hasNext()) {
            C6611b bVar = (C6611b) it.next();
            if (bVar.mo36618c() && ((C6598ag) bVar).mo36603o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c_ */
    public final void mo36174c_() {
        if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext()) || this.f16725j == null) {
            IronLog.INTERNAL.info("while reloading mediation due to expiration, internet loss occurred");
            m20029a((int) IronSourceConstants.TROUBLESHOOTING_RV_TRADITIONAL_RELOAD_FAILED_INTERNET_LOSS, (Object[][]) null);
            return;
        }
        if (m20033a(false, true)) {
            m20032a(C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        }
        m20034b(true);
        Iterator it = this.f16718c.iterator();
        while (it.hasNext()) {
            C6611b bVar = (C6611b) it.next();
            if (bVar.f17116a == C6611b.C6612a.AVAILABLE || bVar.f17116a == C6611b.C6612a.NOT_AVAILABLE) {
                bVar.mo36614a(C6611b.C6612a.NEEDS_RELOAD);
            }
        }
        Iterator it2 = this.f16718c.iterator();
        while (it2.hasNext()) {
            C6611b bVar2 = (C6611b) it2.next();
            if (bVar2.f17116a == C6611b.C6612a.NEEDS_RELOAD) {
                try {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.info(bVar2.f17119d + ":reload smash");
                    m20028a(1001, bVar2, (Object[][]) null);
                    ((C6598ag) bVar2).mo36602n();
                } catch (Throwable th) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error(bVar2.f17119d + " Failed to call fetchVideo(), " + th.getLocalizedMessage());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo36595d() {
        if (this.f17084o <= 0) {
            this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, "load interval is not set, ignoring", 1);
            return;
        }
        Timer timer = this.f17090u;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f17090u = timer2;
        timer2.schedule(new TimerTask() {
            public final void run() {
                cancel();
                C6596af.this.mo36597e();
                C6596af.this.mo36595d();
            }
        }, (long) (this.f17084o * 1000));
    }

    /* renamed from: d */
    public final void mo36596d(C6598ag agVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, agVar.f17119d + ":onRewardedVideoAdEnded()", 1);
        m20028a((int) IronSourceConstants.RV_INSTANCE_ENDED, (C6611b) agVar, new Object[][]{new Object[]{"placement", m20045p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(agVar.f17101w)}});
        this.f17082m.onRewardedVideoAdEnded();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo36597e() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0092 }
            android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ all -> 0x0092 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0090
            java.lang.Boolean r0 = r8.f16725j     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x0015
            goto L_0x0090
        L_0x0015:
            java.lang.Boolean r0 = r8.f16725j     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x008e
            r0 = 102(0x66, float:1.43E-43)
            r1 = 0
            r8.m20029a((int) r0, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x0092 }
            r0 = 1000(0x3e8, float:1.401E-42)
            r8.m20029a((int) r0, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x0092 }
            r0 = 1
            r8.f17092w = r0     // Catch:{ all -> 0x0092 }
            java.util.concurrent.CopyOnWriteArrayList r2 = r8.f16718c     // Catch:{ all -> 0x0092 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0092 }
        L_0x0031:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0092 }
            if (r3 == 0) goto L_0x008e
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.b r3 = (com.ironsource.mediationsdk.C6611b) r3     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.b$a r4 = r3.f17116a     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.b$a r5 = com.ironsource.mediationsdk.C6611b.C6612a.NOT_AVAILABLE     // Catch:{ all -> 0x0092 }
            if (r4 != r5) goto L_0x0031
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r8.f16723h     // Catch:{ all -> 0x006b }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x006b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            java.lang.String r7 = "Fetch from timer: "
            r6.<init>(r7)     // Catch:{ all -> 0x006b }
            java.lang.String r7 = r3.f17119d     // Catch:{ all -> 0x006b }
            r6.append(r7)     // Catch:{ all -> 0x006b }
            java.lang.String r7 = ":reload smash"
            r6.append(r7)     // Catch:{ all -> 0x006b }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x006b }
            r4.log(r5, r6, r0)     // Catch:{ all -> 0x006b }
            r4 = 1001(0x3e9, float:1.403E-42)
            r8.m20028a((int) r4, (com.ironsource.mediationsdk.C6611b) r3, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x006b }
            r4 = r3
            com.ironsource.mediationsdk.ag r4 = (com.ironsource.mediationsdk.C6598ag) r4     // Catch:{ all -> 0x006b }
            r4.mo36602n()     // Catch:{ all -> 0x006b }
            goto L_0x0031
        L_0x006b:
            r4 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r8.f16723h     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x0092 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r7.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = r3.f17119d     // Catch:{ all -> 0x0092 }
            r7.append(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = " Failed to call fetchVideo(), "
            r7.append(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = r4.getLocalizedMessage()     // Catch:{ all -> 0x0092 }
            r7.append(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0092 }
            r5.log(r6, r3, r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0031
        L_0x008e:
            monitor-exit(r8)
            return
        L_0x0090:
            monitor-exit(r8)
            return
        L_0x0092:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6596af.mo36597e():void");
    }

    /* renamed from: e */
    public final void mo36598e(C6598ag agVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, agVar.f17119d + ":onRewardedVideoAdRewarded()", 1);
        if (this.f17089t == null) {
            this.f17089t = C6459L.m19304a().f16419i.f17750c.f17352a.mo36792a();
        }
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData((C6611b) agVar);
        try {
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, agVar.f17101w);
            if (this.f17089t != null) {
                providerAdditionalData.put("placement", m20045p());
                providerAdditionalData.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f17089t.getRewardName());
                providerAdditionalData.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, this.f17089t.getRewardAmount());
            } else {
                this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C6517c cVar = new C6517c(1010, providerAdditionalData);
        if (!TextUtils.isEmpty(this.f16722g)) {
            cVar.mo36370a(IronSourceConstants.EVENTS_TRANS_ID, (Object) IronSourceUtils.getTransId(cVar.mo36371b(), agVar.mo36622j()));
            if (!TextUtils.isEmpty(C6459L.m19304a().f16423m)) {
                cVar.mo36370a(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, (Object) C6459L.m19304a().f16423m);
            }
            Map<String, String> map = C6459L.m19304a().f16424n;
            if (map != null) {
                for (String next : map.keySet()) {
                    cVar.mo36370a(ContentMetadata.KEY_CUSTOM_PREFIX + next, (Object) map.get(next));
                }
            }
        }
        C6522h.m19751d().mo36349b(cVar);
        Placement placement = this.f17089t;
        if (placement != null) {
            this.f17082m.onRewardedVideoAdRewarded(placement);
        } else {
            this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
    }

    /* renamed from: f */
    public final void mo36599f(C6598ag agVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, agVar.f17119d + ":onRewardedVideoAdClicked()", 1);
        if (this.f17089t == null) {
            this.f17089t = C6459L.m19304a().f16419i.f17750c.f17352a.mo36792a();
        }
        if (this.f17089t == null) {
            this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
            return;
        }
        m20028a(1006, (C6611b) agVar, new Object[][]{new Object[]{"placement", m20045p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(agVar.f17101w)}});
        this.f17082m.onRewardedVideoAdClicked(this.f17089t);
    }

    /* renamed from: g */
    public final void mo36041g() {
        Iterator it = this.f16718c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C6611b bVar = (C6611b) it.next();
            if (bVar.f17116a == C6611b.C6612a.CAPPED_PER_DAY) {
                m20028a((int) IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, bVar, new Object[][]{new Object[]{"status", "false"}});
                bVar.mo36614a(C6611b.C6612a.NOT_AVAILABLE);
                if (((C6598ag) bVar).mo36603o() && bVar.mo36618c()) {
                    bVar.mo36614a(C6611b.C6612a.AVAILABLE);
                    z = true;
                }
            }
        }
        if (z && m20033a(true, false)) {
            this.f17082m.onRewardedVideoAvailabilityChanged(true);
        }
    }

    /* renamed from: g */
    public final void mo36600g(C6598ag agVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, agVar.f17119d + ":onRewardedVideoAdVisible()", 1);
        if (this.f17089t != null) {
            m20028a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, (C6611b) agVar, new Object[][]{new Object[]{"placement", m20045p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(agVar.f17101w)}});
            return;
        }
        this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
    }
}
