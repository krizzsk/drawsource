package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C6473Q;
import com.ironsource.mediationsdk.C6611b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6657h;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.mediationsdk.p206a.C6518d;
import com.ironsource.mediationsdk.sdk.C6700h;
import com.ironsource.mediationsdk.sdk.C6701i;
import com.ironsource.mediationsdk.utils.C6737d;
import com.ironsource.mediationsdk.utils.C6738e;
import com.ironsource.mediationsdk.utils.C6743i;
import com.ironsource.mediationsdk.utils.C6745k;
import com.ironsource.mediationsdk.utils.C6753o;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.I */
final class C6450I extends C6507a implements C6700h, C6737d, C6743i {

    /* renamed from: m */
    C6701i f16305m;

    /* renamed from: n */
    C6732u f16306n = C6732u.m20387a();

    /* renamed from: o */
    private final String f16307o = getClass().getName();

    /* renamed from: p */
    private boolean f16308p = false;

    /* renamed from: q */
    private boolean f16309q = false;

    /* renamed from: r */
    private boolean f16310r;

    /* renamed from: s */
    private InterstitialPlacement f16311s;

    /* renamed from: t */
    private boolean f16312t = false;

    /* renamed from: u */
    private Map<String, C6455J> f16313u = new ConcurrentHashMap();

    /* renamed from: v */
    private CopyOnWriteArraySet<String> f16314v = new CopyOnWriteArraySet<>();

    /* renamed from: w */
    private long f16315w;

    /* renamed from: x */
    private boolean f16316x;

    C6450I() {
        this.f16716a = new C6738e("interstitial", this);
        this.f16316x = false;
    }

    /* renamed from: a */
    private int m19240a(C6611b.C6612a... aVarArr) {
        Iterator it = this.f16718c.iterator();
        int i = 0;
        while (it.hasNext()) {
            C6611b bVar = (C6611b) it.next();
            for (C6611b.C6612a aVar : aVarArr) {
                if (bVar.f17116a == aVar) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    private void m19241a(int i, C6611b bVar, Object[][] objArr) {
        m19242a(i, bVar, objArr, false);
    }

    /* renamed from: a */
    private void m19242a(int i, C6611b bVar, Object[][] objArr, boolean z) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(bVar);
        if (z) {
            try {
                if (this.f16311s != null && !TextUtils.isEmpty(this.f16311s.getPlacementName())) {
                    providerAdditionalData.put("placement", this.f16311s.getPlacementName());
                }
            } catch (Exception e) {
                this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        C6518d.m19731d().mo36349b(new C6517c(i, providerAdditionalData));
    }

    /* renamed from: a */
    private void m19243a(int i, Object[][] objArr) {
        m19244a(i, objArr, false);
    }

    /* renamed from: a */
    private void m19244a(int i, Object[][] objArr, boolean z) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (z) {
            try {
                if (this.f16311s != null && !TextUtils.isEmpty(this.f16311s.getPlacementName())) {
                    mediationAdditionalData.put("placement", this.f16311s.getPlacementName());
                }
            } catch (Exception e) {
                this.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        C6518d.m19731d().mo36349b(new C6517c(i, mediationAdditionalData));
    }

    /* renamed from: b */
    private void m19245b(int i, C6611b bVar, Object[][] objArr) {
        m19242a(i, bVar, objArr, true);
    }

    /* renamed from: c */
    private void m19246c(C6611b bVar) {
        if (!bVar.mo36618c()) {
            m19250i();
            m19248h();
            return;
        }
        bVar.mo36614a(C6611b.C6612a.INITIATED);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0095, code lost:
        return r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.ironsource.mediationsdk.AbstractAdapter m19247g(com.ironsource.mediationsdk.C6455J r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f16723h     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r2.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = r9.f16307o     // Catch:{ all -> 0x00c4 }
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = ":startAdapter("
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = r10.mo36622j()     // Catch:{ all -> 0x00c4 }
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00c4 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.d r0 = com.ironsource.mediationsdk.C6622d.m20139a()     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r10.f17118c     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r10.f17118c     // Catch:{ all -> 0x00c4 }
            org.json.JSONObject r2 = r2.getInterstitialSettings()     // Catch:{ all -> 0x00c4 }
            r4 = 0
            com.ironsource.mediationsdk.AbstractAdapter r0 = r0.mo36647a(r1, r2, r4, r4)     // Catch:{ all -> 0x00c4 }
            r1 = 0
            if (r0 != 0) goto L_0x0059
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f16723h     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r3.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = r10.f17119d     // Catch:{ all -> 0x00c4 }
            r3.append(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = " is configured in IronSource's platform, but the adapter is not integrated"
            r3.append(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00c4 }
            r3 = 2
            r0.log(r2, r10, r3)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r9)
            return r1
        L_0x0059:
            r10.f17117b = r0     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C6611b.C6612a.INIT_PENDING     // Catch:{ all -> 0x00c4 }
            r10.mo36614a(r2)     // Catch:{ all -> 0x00c4 }
            r9.mo36330b(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = r9.f16722g     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = r9.f16721f     // Catch:{ all -> 0x0096 }
            r10.mo36099h()     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f17117b     // Catch:{ all -> 0x0096 }
            if (r5 == 0) goto L_0x0094
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f17117b     // Catch:{ all -> 0x0096 }
            r5.addInterstitialListener(r10)     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r10.f17132q     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_API     // Catch:{ all -> 0x0096 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r7.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r8 = r10.f17119d     // Catch:{ all -> 0x0096 }
            r7.append(r8)     // Catch:{ all -> 0x0096 }
            java.lang.String r8 = ":initInterstitial()"
            r7.append(r8)     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0096 }
            r5.log(r6, r7, r3)     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.AbstractAdapter r3 = r10.f17117b     // Catch:{ all -> 0x0096 }
            org.json.JSONObject r5 = r10.f16360r     // Catch:{ all -> 0x0096 }
            r3.initInterstitial(r2, r4, r5, r10)     // Catch:{ all -> 0x0096 }
        L_0x0094:
            monitor-exit(r9)
            return r0
        L_0x0096:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r9.f16723h     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r4.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = r9.f16307o     // Catch:{ all -> 0x00c4 }
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = "failed to init adapter: "
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = r10.mo36622j()     // Catch:{ all -> 0x00c4 }
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = "v"
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00c4 }
            r2.logException(r3, r4, r0)     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C6611b.C6612a.INIT_FAILED     // Catch:{ all -> 0x00c4 }
            r10.mo36614a(r0)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r9)
            return r1
        L_0x00c4:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6450I.m19247g(com.ironsource.mediationsdk.J):com.ironsource.mediationsdk.AbstractAdapter");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0033 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19248h() {
        /*
            r5 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.f16718c
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C6611b) r1
            com.ironsource.mediationsdk.b$a r3 = r1.f17116a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C6611b.C6612a.NOT_INITIATED
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r3 = r1.f17116a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C6611b.C6612a.INIT_PENDING
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r3 = r1.f17116a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C6611b.C6612a.INITIATED
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r3 = r1.f17116a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C6611b.C6612a.LOAD_PENDING
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r1 = r1.f17116a
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C6611b.C6612a.AVAILABLE
            if (r1 != r3) goto L_0x0006
        L_0x0031:
            r0 = r2
            goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            if (r0 == 0) goto L_0x0064
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f16723h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r3 = "Reset Iteration"
            r0.log(r1, r3, r2)
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.f16718c
            java.util.Iterator r0 = r0.iterator()
        L_0x0045:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C6611b) r1
            com.ironsource.mediationsdk.b$a r3 = r1.f17116a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C6611b.C6612a.EXHAUSTED
            if (r3 != r4) goto L_0x0045
            r1.mo36098g()
            goto L_0x0045
        L_0x005b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f16723h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r3 = "End of Reset Iteration"
            r0.log(r1, r3, r2)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6450I.m19248h():void");
    }

    /* renamed from: h */
    private synchronized void m19249h(C6455J j) {
        m19241a(2002, (C6611b) j, (Object[][]) null);
        j.mo36100i();
        if (j.f17117b != null) {
            IronSourceLoggerManager ironSourceLoggerManager = j.f17132q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag, j.f17119d + ":loadInterstitial()", 1);
            j.f16362t = new Date().getTime();
            j.f17117b.loadInterstitial(j.f16360r, j);
        }
    }

    /* renamed from: i */
    private AbstractAdapter m19250i() {
        AbstractAdapter abstractAdapter = null;
        int i = 0;
        for (int i2 = 0; i2 < this.f16718c.size() && abstractAdapter == null; i2++) {
            if (((C6611b) this.f16718c.get(i2)).f17116a == C6611b.C6612a.AVAILABLE || ((C6611b) this.f16718c.get(i2)).f17116a == C6611b.C6612a.INITIATED || ((C6611b) this.f16718c.get(i2)).f17116a == C6611b.C6612a.INIT_PENDING || ((C6611b) this.f16718c.get(i2)).f17116a == C6611b.C6612a.LOAD_PENDING) {
                i++;
                if (i >= this.f16717b) {
                    break;
                }
            } else if (((C6611b) this.f16718c.get(i2)).f17116a == C6611b.C6612a.NOT_INITIATED && (abstractAdapter = m19247g((C6455J) this.f16718c.get(i2))) == null) {
                ((C6611b) this.f16718c.get(i2)).mo36614a(C6611b.C6612a.INIT_FAILED);
            }
        }
        return abstractAdapter;
    }

    /* renamed from: j */
    private synchronized void m19251j() {
        Iterator it = this.f16718c.iterator();
        while (it.hasNext()) {
            C6611b bVar = (C6611b) it.next();
            if (bVar.f17116a == C6611b.C6612a.AVAILABLE || bVar.f17116a == C6611b.C6612a.LOAD_PENDING || bVar.f17116a == C6611b.C6612a.NOT_AVAILABLE) {
                bVar.mo36614a(C6611b.C6612a.INITIATED);
            }
        }
    }

    /* renamed from: k */
    private void m19252k() {
        for (int i = 0; i < this.f16718c.size(); i++) {
            String providerTypeForReflection = ((C6611b) this.f16718c.get(i)).f17118c.getProviderTypeForReflection();
            if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                C6622d.m20139a().mo36647a(((C6611b) this.f16718c.get(i)).f17118c, ((C6611b) this.f16718c.get(i)).f17118c.getInterstitialSettings(), false, false);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36022a(Context context, boolean z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.f16307o + " Should Track Network State: " + z, 0);
        this.f16724i = z;
    }

    /* renamed from: a */
    public final synchronized void mo36023a(C6455J j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, j.f17119d + " :onInterstitialInitSuccess()", 1);
        m19241a((int) IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, (C6611b) j, (Object[][]) null);
        this.f16310r = true;
        if (this.f16308p) {
            if (m19240a(C6611b.C6612a.AVAILABLE, C6611b.C6612a.LOAD_PENDING) < this.f16717b) {
                j.mo36614a(C6611b.C6612a.LOAD_PENDING);
                m19249h(j);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo36024a(C6455J j, long j2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, j.f17119d + ":onInterstitialAdReady()", 1);
        m19241a(2003, (C6611b) j, new Object[][]{new Object[]{"duration", Long.valueOf(j2)}});
        long time = new Date().getTime() - this.f16315w;
        j.mo36614a(C6611b.C6612a.AVAILABLE);
        this.f16309q = false;
        if (this.f16312t) {
            this.f16312t = false;
            this.f16305m.onInterstitialAdReady();
            m19243a(2004, new Object[][]{new Object[]{"duration", Long.valueOf(time)}});
        }
    }

    /* renamed from: a */
    public final synchronized void mo36025a(IronSourceError ironSourceError, C6455J j) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
            ironSourceLoggerManager.log(ironSourceTag, j.f17119d + ":onInterstitialInitFailed(" + ironSourceError + ")", 1);
            m19241a((int) IronSourceConstants.IS_INSTANCE_INIT_FAILED, (C6611b) j, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
            if (m19240a(C6611b.C6612a.INIT_FAILED) >= this.f16718c.size()) {
                IronSourceLoggerManager ironSourceLoggerManager2 = this.f16723h;
                IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NATIVE;
                ironSourceLoggerManager2.log(ironSourceTag2, "Smart Loading - initialization failed - no adapters are initiated and no more left to init, error: " + ironSourceError.getErrorMessage(), 2);
                if (this.f16308p) {
                    this.f16306n.mo36954a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildGenericError("no ads to show"));
                    m19243a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_GENERIC)}});
                    this.f16312t = false;
                }
                this.f16310r = true;
            } else {
                if (m19250i() == null && this.f16308p) {
                    if (m19240a(C6611b.C6612a.INIT_FAILED, C6611b.C6612a.NOT_AVAILABLE, C6611b.C6612a.CAPPED_PER_SESSION, C6611b.C6612a.CAPPED_PER_DAY, C6611b.C6612a.EXHAUSTED) >= this.f16718c.size()) {
                        this.f16306n.mo36954a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "No ads to show"));
                        m19243a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}});
                        this.f16312t = false;
                    }
                }
                m19248h();
                return;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager3 = this.f16723h;
            IronSourceLogger.IronSourceTag ironSourceTag3 = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
            ironSourceLoggerManager3.logException(ironSourceTag3, "onInterstitialInitFailed(error:" + ironSourceError + ", provider:" + j.mo36622j() + ")", e);
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36026a(com.ironsource.mediationsdk.logger.IronSourceError r8, com.ironsource.mediationsdk.C6455J r9, long r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r7.f16723h     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK     // Catch:{ all -> 0x012c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r2.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r3 = r9.f17119d     // Catch:{ all -> 0x012c }
            r2.append(r3)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = ":onInterstitialAdLoadFailed("
            r2.append(r3)     // Catch:{ all -> 0x012c }
            r2.append(r8)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x012c }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x012c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r0.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r1 = r9.f17119d     // Catch:{ all -> 0x012c }
            r0.append(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = ":onInterstitialAdLoadFailed("
            r0.append(r1)     // Catch:{ all -> 0x012c }
            r0.append(r8)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = ")"
            r0.append(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ all -> 0x012c }
            int r0 = r8.getErrorCode()     // Catch:{ all -> 0x012c }
            r1 = 1158(0x486, float:1.623E-42)
            r2 = 2
            r4 = 0
            if (r0 != r1) goto L_0x0074
            r0 = 2213(0x8a5, float:3.101E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r2][]     // Catch:{ all -> 0x012c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x012c }
            int r8 = r8.getErrorCode()     // Catch:{ all -> 0x012c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x012c }
            r5[r3] = r8     // Catch:{ all -> 0x012c }
            r1[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "duration"
            r8[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x012c }
            r8[r3] = r10     // Catch:{ all -> 0x012c }
            r1[r3] = r8     // Catch:{ all -> 0x012c }
            r7.m19241a((int) r0, (com.ironsource.mediationsdk.C6611b) r9, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x012c }
            goto L_0x00aa
        L_0x0074:
            r0 = 2200(0x898, float:3.083E-42)
            r1 = 3
            java.lang.Object[][] r1 = new java.lang.Object[r1][]     // Catch:{ all -> 0x012c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x012c }
            int r6 = r8.getErrorCode()     // Catch:{ all -> 0x012c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x012c }
            r5[r3] = r6     // Catch:{ all -> 0x012c }
            r1[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "reason"
            r5[r4] = r6     // Catch:{ all -> 0x012c }
            java.lang.String r8 = r8.getErrorMessage()     // Catch:{ all -> 0x012c }
            r5[r3] = r8     // Catch:{ all -> 0x012c }
            r1[r3] = r5     // Catch:{ all -> 0x012c }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "duration"
            r8[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x012c }
            r8[r3] = r10     // Catch:{ all -> 0x012c }
            r1[r2] = r8     // Catch:{ all -> 0x012c }
            r7.m19241a((int) r0, (com.ironsource.mediationsdk.C6611b) r9, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x012c }
        L_0x00aa:
            com.ironsource.mediationsdk.b$a r8 = com.ironsource.mediationsdk.C6611b.C6612a.NOT_AVAILABLE     // Catch:{ all -> 0x012c }
            r9.mo36614a(r8)     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a[] r8 = new com.ironsource.mediationsdk.C6611b.C6612a[r2]     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r9 = com.ironsource.mediationsdk.C6611b.C6612a.AVAILABLE     // Catch:{ all -> 0x012c }
            r8[r4] = r9     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r9 = com.ironsource.mediationsdk.C6611b.C6612a.LOAD_PENDING     // Catch:{ all -> 0x012c }
            r8[r3] = r9     // Catch:{ all -> 0x012c }
            int r8 = r7.m19240a((com.ironsource.mediationsdk.C6611b.C6612a[]) r8)     // Catch:{ all -> 0x012c }
            int r9 = r7.f16717b     // Catch:{ all -> 0x012c }
            if (r8 < r9) goto L_0x00c3
            monitor-exit(r7)
            return
        L_0x00c3:
            java.util.concurrent.CopyOnWriteArrayList r9 = r7.f16718c     // Catch:{ all -> 0x012c }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x012c }
        L_0x00c9:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x012c }
            if (r10 == 0) goto L_0x00e7
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b r10 = (com.ironsource.mediationsdk.C6611b) r10     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r11 = r10.f17116a     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C6611b.C6612a.INITIATED     // Catch:{ all -> 0x012c }
            if (r11 != r0) goto L_0x00c9
            com.ironsource.mediationsdk.b$a r8 = com.ironsource.mediationsdk.C6611b.C6612a.LOAD_PENDING     // Catch:{ all -> 0x012c }
            r10.mo36614a(r8)     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.J r10 = (com.ironsource.mediationsdk.C6455J) r10     // Catch:{ all -> 0x012c }
            r7.m19249h(r10)     // Catch:{ all -> 0x012c }
            monitor-exit(r7)
            return
        L_0x00e7:
            com.ironsource.mediationsdk.AbstractAdapter r9 = r7.m19250i()     // Catch:{ all -> 0x012c }
            if (r9 == 0) goto L_0x00ef
            monitor-exit(r7)
            return
        L_0x00ef:
            boolean r9 = r7.f16308p     // Catch:{ all -> 0x012c }
            if (r9 == 0) goto L_0x012a
            com.ironsource.mediationsdk.b$a[] r9 = new com.ironsource.mediationsdk.C6611b.C6612a[r3]     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r10 = com.ironsource.mediationsdk.C6611b.C6612a.INIT_PENDING     // Catch:{ all -> 0x012c }
            r9[r4] = r10     // Catch:{ all -> 0x012c }
            int r9 = r7.m19240a((com.ironsource.mediationsdk.C6611b.C6612a[]) r9)     // Catch:{ all -> 0x012c }
            int r8 = r8 + r9
            if (r8 != 0) goto L_0x012a
            r7.m19248h()     // Catch:{ all -> 0x012c }
            r7.f16309q = r4     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.u r8 = r7.f16306n     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r9 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.logger.IronSourceError r10 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x012c }
            java.lang.String r11 = "No ads to show"
            r0 = 509(0x1fd, float:7.13E-43)
            r10.<init>(r0, r11)     // Catch:{ all -> 0x012c }
            r8.mo36954a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r9, (com.ironsource.mediationsdk.logger.IronSourceError) r10)     // Catch:{ all -> 0x012c }
            r8 = 2110(0x83e, float:2.957E-42)
            java.lang.Object[][] r9 = new java.lang.Object[r3][]     // Catch:{ all -> 0x012c }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r11 = "errorCode"
            r10[r4] = r11     // Catch:{ all -> 0x012c }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x012c }
            r10[r3] = r11     // Catch:{ all -> 0x012c }
            r9[r4] = r10     // Catch:{ all -> 0x012c }
            r7.m19243a((int) r8, (java.lang.Object[][]) r9)     // Catch:{ all -> 0x012c }
        L_0x012a:
            monitor-exit(r7)
            return
        L_0x012c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6450I.mo36026a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.J, long):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36027a(InterstitialPlacement interstitialPlacement) {
        this.f16311s = interstitialPlacement;
        this.f16305m.f17495e = interstitialPlacement;
    }

    /* renamed from: a */
    public final void mo36028a(String str) {
        if (this.f16308p) {
            this.f16306n.mo36954a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            this.f16308p = false;
            this.f16309q = false;
        }
    }

    /* renamed from: a */
    public final synchronized void mo36029a(String str, String str2) {
        this.f16723h.log(IronSourceLogger.IronSourceTag.NATIVE, this.f16307o + ":initInterstitial(appKey: " + str + ", userId: " + str2 + ")", 1);
        long time = new Date().getTime();
        m19243a((int) IronSourceConstants.IS_MANAGER_INIT_STARTED, (Object[][]) null);
        this.f16722g = str;
        this.f16721f = str2;
        Iterator it = this.f16718c.iterator();
        int i = 0;
        while (it.hasNext()) {
            C6611b bVar = (C6611b) it.next();
            if (this.f16716a.mo36965b(bVar)) {
                m19241a(250, bVar, new Object[][]{new Object[]{"status", "false"}});
            }
            if (this.f16716a.mo36966c(bVar)) {
                bVar.mo36614a(C6611b.C6612a.CAPPED_PER_DAY);
                i++;
            }
        }
        if (i == this.f16718c.size()) {
            this.f16310r = true;
        }
        m19252k();
        for (int i2 = 0; i2 < this.f16717b && m19250i() != null; i2++) {
        }
        m19243a((int) IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
    }

    /* renamed from: a */
    public final void mo36030a(List<IronSource.AD_UNIT> list, boolean z, C6657h hVar) {
    }

    /* renamed from: b */
    public final void mo36031b(C6455J j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, j.f17119d + ":onInterstitialAdOpened()", 1);
        m19245b(2005, j, (Object[][]) null);
        this.f16305m.onInterstitialAdOpened();
    }

    /* renamed from: b */
    public final void mo36032b(IronSourceError ironSourceError, C6455J j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, j.f17119d + ":onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        m19245b(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, j, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        this.f16316x = false;
        m19246c((C6611b) j);
        Iterator it = this.f16718c.iterator();
        while (it.hasNext()) {
            if (((C6611b) it.next()).f17116a == C6611b.C6612a.AVAILABLE) {
                this.f16308p = true;
                InterstitialPlacement interstitialPlacement = this.f16311s;
                if (interstitialPlacement != null) {
                    interstitialPlacement.getPlacementName();
                }
                mo36035d();
                return;
            }
        }
        this.f16305m.onInterstitialAdShowFailed(ironSourceError);
    }

    /* renamed from: c */
    public final synchronized void mo36033c() {
        try {
            if (this.f16316x) {
                this.f16723h.log(IronSourceLogger.IronSourceTag.API, "loadInterstitial cannot be invoked while showing an ad", 3);
                C6432F.m19211a().mo35996a(new IronSourceError(1037, "loadInterstitial cannot be invoked while showing an ad"));
                return;
            }
            this.f16311s = null;
            this.f16305m.f17495e = null;
            if (!this.f16309q) {
                if (!this.f16306n.mo36955a(IronSource.AD_UNIT.INTERSTITIAL)) {
                    C6473Q.C6478a b = C6473Q.m19479a().mo36219b();
                    if (b == C6473Q.C6478a.NOT_INIT) {
                        this.f16723h.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadInterstitial()", 3);
                        return;
                    } else if (b == C6473Q.C6478a.INIT_IN_PROGRESS) {
                        if (C6473Q.m19479a().mo36221c()) {
                            this.f16723h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                            this.f16306n.mo36954a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                            return;
                        }
                        this.f16315w = new Date().getTime();
                        m19243a(2001, (Object[][]) null);
                        this.f16308p = true;
                        this.f16312t = true;
                        return;
                    } else if (b == C6473Q.C6478a.INIT_FAILED) {
                        this.f16723h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        this.f16306n.mo36954a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    } else if (this.f16718c.size() == 0) {
                        this.f16723h.log(IronSourceLogger.IronSourceTag.API, "the server response does not contain interstitial data", 3);
                        this.f16306n.mo36954a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    } else {
                        this.f16315w = new Date().getTime();
                        m19243a(2001, (Object[][]) null);
                        this.f16312t = true;
                        m19251j();
                        if (m19240a(C6611b.C6612a.INITIATED) != 0) {
                            this.f16308p = true;
                            this.f16309q = true;
                            Iterator it = this.f16718c.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                C6611b bVar = (C6611b) it.next();
                                if (bVar.f17116a == C6611b.C6612a.INITIATED) {
                                    bVar.mo36614a(C6611b.C6612a.LOAD_PENDING);
                                    m19249h((C6455J) bVar);
                                    i++;
                                    if (i >= this.f16717b) {
                                        return;
                                    }
                                }
                            }
                            return;
                        } else if (!this.f16310r) {
                            this.f16308p = true;
                            return;
                        } else {
                            IronSourceError buildGenericError = ErrorBuilder.buildGenericError("no ads to load");
                            this.f16723h.log(IronSourceLogger.IronSourceTag.API, buildGenericError.getErrorMessage(), 1);
                            this.f16306n.mo36954a(IronSource.AD_UNIT.INTERSTITIAL, buildGenericError);
                            m19243a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildGenericError.getErrorCode())}});
                            this.f16312t = false;
                            return;
                        }
                    }
                }
            }
            this.f16723h.log(IronSourceLogger.IronSourceTag.API, "Load Interstitial is already in progress", 3);
        } catch (Exception e) {
            e.printStackTrace();
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e.getMessage());
            this.f16723h.log(IronSourceLogger.IronSourceTag.API, buildLoadFailedError.getErrorMessage(), 3);
            this.f16306n.mo36954a(IronSource.AD_UNIT.INTERSTITIAL, buildLoadFailedError);
            if (this.f16312t) {
                this.f16312t = false;
                m19243a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildLoadFailedError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getMessage()}});
            }
        }
    }

    /* renamed from: c */
    public final void mo36034c(C6455J j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, j.f17119d + ":onInterstitialAdClosed()", 1);
        this.f16316x = false;
        m19245b(IronSourceConstants.IS_INSTANCE_CLOSED, j, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C6753o.m20481a().mo36990b(2))}});
        C6753o.m20481a().mo36988a(2);
        this.f16305m.onInterstitialAdClosed();
    }

    /* renamed from: d */
    public final void mo36035d() {
        if (this.f16316x) {
            this.f16723h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad while an ad is already showing", 3);
            this.f16305m.onInterstitialAdShowFailed(new IronSourceError(1036, "showInterstitial error: can't show ad while an ad is already showing"));
        } else if (!this.f16308p) {
            this.f16723h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial failed - You need to load interstitial before showing it", 3);
            this.f16305m.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, "showInterstitial failed - You need to load interstitial before showing it"));
        } else if (!this.f16724i || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            for (int i = 0; i < this.f16718c.size(); i++) {
                C6611b bVar = (C6611b) this.f16718c.get(i);
                if (bVar.f17116a == C6611b.C6612a.AVAILABLE) {
                    C6745k.m20450c((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.f16311s);
                    if (C6745k.m20445b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.f16311s) != C6745k.C6747a.f17643d) {
                        m19244a((int) IronSourceConstants.IS_CAP_PLACEMENT, (Object[][]) null, true);
                    }
                    m19245b(IronSourceConstants.IS_INSTANCE_SHOW, bVar, (Object[][]) null);
                    this.f16316x = true;
                    C6455J j = (C6455J) bVar;
                    if (j.f17117b != null) {
                        j.f17132q.log(IronSourceLogger.IronSourceTag.ADAPTER_API, j.f17119d + ":showInterstitial()", 1);
                        j.mo36619d();
                        j.f17117b.showInterstitial(j.f16360r, j);
                    }
                    if (bVar.mo36617b()) {
                        m19241a((int) IronSourceConstants.IS_CAP_SESSION, bVar, (Object[][]) null);
                    }
                    this.f16716a.mo36963a(bVar);
                    if (this.f16716a.mo36966c(bVar)) {
                        bVar.mo36614a(C6611b.C6612a.CAPPED_PER_DAY);
                        m19241a(250, bVar, new Object[][]{new Object[]{"status", "true"}});
                    }
                    this.f16308p = false;
                    if (!bVar.mo36618c()) {
                        m19250i();
                        return;
                    }
                    return;
                }
            }
            this.f16305m.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, "showInterstitial failed - No adapters ready to show"));
        } else {
            this.f16723h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad when there's no internet connection", 3);
            this.f16305m.onInterstitialAdShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    /* renamed from: d */
    public final void mo36036d(C6455J j) {
        this.f16723h.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, j.f17119d + ":onInterstitialAdShowSucceeded()", 1);
        m19245b(IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, j, (Object[][]) null);
        Iterator it = this.f16718c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C6611b bVar = (C6611b) it.next();
            if (bVar.f17116a == C6611b.C6612a.AVAILABLE) {
                m19246c(bVar);
                z = true;
            }
        }
        if (!z && (j.f17116a == C6611b.C6612a.CAPPED_PER_SESSION || j.f17116a == C6611b.C6612a.EXHAUSTED || j.f17116a == C6611b.C6612a.CAPPED_PER_DAY)) {
            m19248h();
        }
        m19251j();
        this.f16305m.onInterstitialAdShowSucceeded();
    }

    /* renamed from: e */
    public final void mo36037e(C6455J j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, j.f17119d + ":onInterstitialAdClicked()", 1);
        m19245b(2006, j, (Object[][]) null);
        this.f16305m.onInterstitialAdClicked();
    }

    /* renamed from: e */
    public final synchronized boolean mo36038e() {
        boolean z;
        if (this.f16724i && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            return false;
        }
        Iterator it = this.f16718c.iterator();
        while (it.hasNext()) {
            C6611b bVar = (C6611b) it.next();
            if (bVar.f17116a == C6611b.C6612a.AVAILABLE) {
                C6455J j = (C6455J) bVar;
                if (j.f17117b != null) {
                    j.f17132q.log(IronSourceLogger.IronSourceTag.ADAPTER_API, j.f17119d + ":isInterstitialReady()", 1);
                    z = j.f17117b.isInterstitialReady(j.f16360r);
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo36039f() {
        if (this.f16308p) {
            IronSourceError buildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT);
            this.f16306n.mo36954a(IronSource.AD_UNIT.INTERSTITIAL, buildInitFailedError);
            this.f16308p = false;
            this.f16309q = false;
            if (this.f16312t) {
                m19244a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildInitFailedError.getErrorCode())}}, false);
                this.f16312t = false;
            }
        }
    }

    /* renamed from: f */
    public final void mo36040f(C6455J j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16723h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, j.f17119d + ":onInterstitialAdVisible()", 1);
    }

    /* renamed from: g */
    public final void mo36041g() {
        Iterator it = this.f16718c.iterator();
        while (it.hasNext()) {
            C6611b bVar = (C6611b) it.next();
            if (bVar.f17116a == C6611b.C6612a.CAPPED_PER_DAY) {
                m19241a(250, bVar, new Object[][]{new Object[]{"status", "false"}});
                bVar.mo36614a(bVar.mo36617b() ? C6611b.C6612a.CAPPED_PER_SESSION : bVar.mo36616a() ? C6611b.C6612a.EXHAUSTED : C6611b.C6612a.INITIATED);
            }
        }
    }
}
