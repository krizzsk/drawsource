package com.ironsource.mediationsdk.adunit.p212d.p213a;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C6625f;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p207a.C6538a;
import com.ironsource.mediationsdk.adunit.p208b.C6540b;
import com.ironsource.mediationsdk.adunit.p208b.C6541c;
import com.ironsource.mediationsdk.adunit.p208b.C6542d;
import com.ironsource.mediationsdk.adunit.p209c.p210a.C6552b;
import com.ironsource.mediationsdk.adunit.p212d.C6567a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C6650a;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p215b.C6617c;
import com.ironsource.mediationsdk.p216c.C6621b;
import com.ironsource.mediationsdk.utils.C6740f;
import com.ironsource.mediationsdk.utils.C6751n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.d.a.c */
public abstract class C6570c<Listener extends C6552b> implements AdapterAdListener, NetworkInitializationListener, C6541c, C6617c.C6618a, C6751n.C6752a {

    /* renamed from: a */
    protected C6567a f17010a;

    /* renamed from: b */
    protected Listener f17011b;

    /* renamed from: c */
    protected C6542d f17012c = new C6542d(this.f17010a.f16999a, C6542d.C6544b.PROVIDER, this);

    /* renamed from: d */
    protected C6571a f17013d;

    /* renamed from: e */
    protected Placement f17014e;

    /* renamed from: f */
    protected AdData f17015f;

    /* renamed from: g */
    protected Object f17016g;

    /* renamed from: h */
    private BaseAdAdapter<?, AdapterAdListener> f17017h;

    /* renamed from: i */
    private C6650a f17018i;

    /* renamed from: j */
    private JSONObject f17019j;

    /* renamed from: k */
    private String f17020k;

    /* renamed from: l */
    private Long f17021l;

    /* renamed from: m */
    private C6740f f17022m;

    /* renamed from: n */
    private C6617c f17023n;

    /* renamed from: com.ironsource.mediationsdk.adunit.d.a.c$a */
    public enum C6571a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    public C6570c(C6567a aVar, BaseAdAdapter<?, ?> baseAdAdapter, C6650a aVar2, Listener listener) {
        this.f17010a = aVar;
        this.f17011b = listener;
        this.f17018i = aVar2;
        this.f17019j = aVar2.f17321b;
        this.f17017h = baseAdAdapter;
        this.f17023n = new C6617c((long) (this.f17010a.f17002d * 1000));
        this.f17016g = new Object();
        mo36536a(C6571a.NONE);
    }

    /* renamed from: a */
    private void m19967a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (this.f17012c == null) {
            return;
        }
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.f17012c.f16924b.mo36470b(j, i);
        } else if (!TextUtils.isEmpty(str)) {
            this.f17012c.f16924b.mo36466a(j, i, str);
        } else {
            this.f17012c.f16924b.mo36465a(j, i);
        }
    }

    /* renamed from: a */
    private boolean mo36534a() {
        return this.f17013d == C6571a.INIT_IN_PROGRESS;
    }

    /* renamed from: a */
    public final Map<String, Object> mo36449a(C6540b bVar) {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, this.f17017h != null ? this.f17017h.getNetworkAdapter().getAdapterVersion() : str);
            if (this.f17017h != null) {
                str = this.f17017h.getNetworkAdapter().getNetworkSDKVersion();
            }
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str);
        } catch (Exception unused) {
            IronLog.INTERNAL.error(mo36539c("could not get adapter version for event data" + mo36547m()));
        }
        hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.f17018i.f17320a.getSubProviderId());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f17018i.f17320a.getAdSourceNameForEvents());
        hashMap.put("instanceType", Integer.valueOf(mo36546l()));
        boolean z = true;
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f17020k)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f17020k);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f17010a.f17003e));
        if (this.f17010a.f17004f != null && this.f17010a.f17004f.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f17010a.f17004f);
        }
        if (!TextUtils.isEmpty(this.f17010a.f17005g)) {
            hashMap.put("auctionId", this.f17010a.f17005g);
        }
        if (!(bVar == C6540b.LOAD_AD || bVar == C6540b.LOAD_AD_SUCCESS || bVar == C6540b.LOAD_AD_FAILED || bVar == C6540b.LOAD_AD_FAILED_WITH_REASON || bVar == C6540b.LOAD_AD_NO_FILL || bVar == C6540b.AD_OPENED || bVar == C6540b.AD_CLOSED || bVar == C6540b.SHOW_AD || bVar == C6540b.SHOW_AD_FAILED || bVar == C6540b.AD_CLICKED || bVar == C6540b.AD_REWARDED)) {
            z = false;
        }
        if (z) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f17010a.f17006h));
            if (!TextUtils.isEmpty(this.f17010a.f17007i)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f17010a.f17007i);
            }
        }
        if (!TextUtils.isEmpty(this.f17010a.f17001c.getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f17010a.f17001c.getCustomNetwork());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36536a(C6571a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo36539c("to " + aVar));
        this.f17013d = aVar;
    }

    /* renamed from: a */
    public final void mo36537a(String str) {
        try {
            IronLog.INTERNAL.verbose(mo36539c(""));
            boolean z = false;
            this.f17012c.f16924b.mo36468a(false);
            this.f17021l = null;
            this.f17022m = new C6740f();
            HashMap hashMap = new HashMap();
            hashMap.put(DataKeys.USER_ID, this.f17010a.f17000b);
            hashMap.putAll(C6621b.m20124a(this.f17019j));
            this.f17015f = new AdData(str, hashMap);
            synchronized (this.f17016g) {
                if (this.f17013d != C6571a.NONE) {
                    z = true;
                } else {
                    mo36536a(C6571a.INIT_IN_PROGRESS);
                }
            }
            if (z) {
                String str2 = "loadAd - incorrect state while loading, state = " + this.f17013d;
                IronLog.INTERNAL.error(mo36539c(str2));
                this.f17012c.f16927e.mo36487m(str2);
                onInitFailed(C6538a.m19814a(this.f17010a.f16999a), str2);
                return;
            }
            this.f17023n.mo36632a(this);
            AdapterBaseInterface networkAdapter = this.f17017h.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f17015f, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str3 = "loadAd - network adapter not available " + mo36547m();
            IronLog.INTERNAL.error(mo36539c(str3));
            this.f17012c.f16927e.mo36473a(str3);
            onInitFailed(C6538a.m19814a(this.f17010a.f16999a), str3);
        } catch (Throwable th) {
            String str4 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(mo36539c(str4));
            C6542d dVar = this.f17012c;
            if (dVar != null) {
                dVar.f16927e.mo36487m(str4);
            }
            onInitFailed(C6538a.m19814a(this.f17010a.f16999a), str4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0087, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0050, code lost:
        r0 = r6.f17011b;
        r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("time out");
        com.ironsource.mediationsdk.utils.C6740f.m20412a(r6.f17022m);
        r0.mo36501a(r1, r6);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36273b() {
        /*
            r6 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "state = "
            r1.<init>(r2)
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = r6.f17013d
            r1.append(r2)
            java.lang.String r2 = ", isBidder = "
            r1.append(r2)
            boolean r2 = r6.mo36545i()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r6.mo36539c(r1)
            r0.verbose(r1)
            com.ironsource.mediationsdk.utils.f r0 = r6.f17022m
            long r0 = com.ironsource.mediationsdk.utils.C6740f.m20412a(r0)
            java.lang.String r2 = "time out"
            java.lang.Object r3 = r6.f17016g
            monitor-enter(r3)
            boolean r4 = r6.mo36540d()     // Catch:{ all -> 0x0088 }
            r5 = 1025(0x401, float:1.436E-42)
            if (r4 == 0) goto L_0x005f
            com.ironsource.mediationsdk.adunit.d.a.c$a r4 = com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c.C6571a.FAILED     // Catch:{ all -> 0x0088 }
            r6.mo36536a((com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c.C6571a) r4)     // Catch:{ all -> 0x0088 }
            com.ironsource.mediationsdk.adunit.b.d r4 = r6.f17012c     // Catch:{ all -> 0x0088 }
            if (r4 == 0) goto L_0x004f
            com.ironsource.mediationsdk.adunit.b.d r4 = r6.f17012c     // Catch:{ all -> 0x0088 }
            com.ironsource.mediationsdk.adunit.b.h r4 = r4.f16924b     // Catch:{ all -> 0x0088 }
            r4.mo36465a((long) r0, (int) r5)     // Catch:{ all -> 0x0088 }
            com.ironsource.mediationsdk.adunit.b.d r4 = r6.f17012c     // Catch:{ all -> 0x0088 }
            com.ironsource.mediationsdk.adunit.b.h r4 = r4.f16924b     // Catch:{ all -> 0x0088 }
            r4.mo36466a((long) r0, (int) r5, (java.lang.String) r2)     // Catch:{ all -> 0x0088 }
        L_0x004f:
            monitor-exit(r3)     // Catch:{ all -> 0x0088 }
            Listener r0 = r6.f17011b
            com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r2)
            com.ironsource.mediationsdk.utils.f r2 = r6.f17022m
            com.ironsource.mediationsdk.utils.C6740f.m20412a(r2)
            r0.mo36501a(r1, r6)
            return
        L_0x005f:
            java.lang.String r0 = "unexpected timeout for %s, state - %s, error - %s"
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0088 }
            r2 = 0
            java.lang.String r4 = r6.mo36547m()     // Catch:{ all -> 0x0088 }
            r1[r2] = r4     // Catch:{ all -> 0x0088 }
            r2 = 1
            com.ironsource.mediationsdk.adunit.d.a.c$a r4 = r6.f17013d     // Catch:{ all -> 0x0088 }
            r1[r2] = r4     // Catch:{ all -> 0x0088 }
            r2 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0088 }
            r1[r2] = r4     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x0088 }
            com.ironsource.mediationsdk.adunit.b.d r1 = r6.f17012c     // Catch:{ all -> 0x0088 }
            if (r1 == 0) goto L_0x0086
            com.ironsource.mediationsdk.adunit.b.d r1 = r6.f17012c     // Catch:{ all -> 0x0088 }
            com.ironsource.mediationsdk.adunit.b.i r1 = r1.f16927e     // Catch:{ all -> 0x0088 }
            r1.mo36486l(r0)     // Catch:{ all -> 0x0088 }
        L_0x0086:
            monitor-exit(r3)     // Catch:{ all -> 0x0088 }
            return
        L_0x0088:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0088 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c.mo36273b():void");
    }

    /* renamed from: b */
    public final void mo36538b(String str) {
        C6625f.m20163a();
        this.f17020k = C6625f.m20174d(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo36539c(String str) {
        String str2 = this.f17010a.f16999a.name() + " - " + mo36547m() + " - state = " + this.f17013d;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    /* renamed from: c */
    public void mo36535c() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f17017h;
        if (baseAdAdapter != null) {
            try {
                baseAdAdapter.releaseMemory();
                this.f17017h = null;
            } catch (Exception e) {
                String str = "Exception while calling adapter.releaseMemory() from " + this.f17018i.f17320a.getProviderName() + " - " + e.getLocalizedMessage();
                IronLog.INTERNAL.error(mo36539c(str));
                this.f17012c.f16927e.mo36487m(str);
            }
        }
        C6542d dVar = this.f17012c;
        if (dVar != null) {
            dVar.mo36450a();
            this.f17012c = null;
        }
        C6617c cVar = this.f17023n;
        if (cVar != null) {
            cVar.mo36628c();
            this.f17023n = null;
        }
    }

    /* renamed from: d */
    public final boolean mo36540d() {
        return this.f17013d == C6571a.INIT_IN_PROGRESS || this.f17013d == C6571a.LOADING;
    }

    /* renamed from: e */
    public final boolean mo36541e() {
        return this.f17013d == C6571a.LOADED;
    }

    /* renamed from: f */
    public final boolean mo36542f() {
        return this.f17013d != C6571a.FAILED;
    }

    /* renamed from: g */
    public final void mo36543g() {
        IronLog.INTERNAL.verbose(mo36539c(""));
        C6542d dVar = this.f17012c;
        if (dVar != null) {
            dVar.f16926d.mo36436a();
        }
    }

    /* renamed from: h */
    public final Long mo36544h() {
        return this.f17021l;
    }

    /* renamed from: i */
    public final boolean mo36545i() {
        return this.f17018i.f17322c;
    }

    /* renamed from: j */
    public final int mo36387j() {
        return this.f17018i.f17324e;
    }

    /* renamed from: k */
    public final String mo36388k() {
        return this.f17018i.f17320a.getProviderName();
    }

    /* renamed from: l */
    public final int mo36546l() {
        return this.f17018i.f17323d;
    }

    /* renamed from: m */
    public final String mo36547m() {
        return String.format("%s %s", new Object[]{mo36388k(), Integer.valueOf(hashCode())});
    }

    /* renamed from: n */
    public final String mo36548n() {
        return this.f17018i.f17320a.getProviderTypeForReflection();
    }

    /* renamed from: o */
    public final String mo36549o() {
        return this.f17010a.f17005g;
    }

    public void onAdClicked() {
        IronLog.INTERNAL.verbose(mo36539c(""));
        C6542d dVar = this.f17012c;
        if (dVar != null) {
            dVar.f16926d.mo36444d(mo36551q());
        }
        this.f17011b.mo36502b(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0090, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ba, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdLoadFailed(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "error = "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r7.mo36539c(r1)
            r0.verbose(r1)
            com.ironsource.mediationsdk.b.c r0 = r7.f17023n
            if (r0 == 0) goto L_0x0026
            r0.mo36633d()
        L_0x0026:
            com.ironsource.mediationsdk.utils.f r0 = r7.f17022m
            long r5 = com.ironsource.mediationsdk.utils.C6740f.m20412a(r0)
            java.lang.Object r0 = r7.f17016g
            monitor-enter(r0)
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = r7.f17013d     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c.C6571a.LOADING     // Catch:{ all -> 0x00bb }
            if (r1 != r2) goto L_0x004d
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.m19967a(r2, r3, r4, r5)     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.d.a.c$a r8 = com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c.C6571a.FAILED     // Catch:{ all -> 0x00bb }
            r7.mo36536a((com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c.C6571a) r8)     // Catch:{ all -> 0x00bb }
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            Listener r8 = r7.f17011b
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r0.<init>(r9, r10)
            r8.mo36501a(r0, r7)
            return
        L_0x004d:
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = r7.f17013d     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c.C6571a.FAILED     // Catch:{ all -> 0x00bb }
            if (r1 != r2) goto L_0x005c
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.m19967a(r2, r3, r4, r5)     // Catch:{ all -> 0x00bb }
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return
        L_0x005c:
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = r7.f17013d     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c.C6571a.LOADED     // Catch:{ all -> 0x00bb }
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x0091
            com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType r1 = com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED     // Catch:{ all -> 0x00bb }
            if (r8 != r1) goto L_0x0091
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00bb }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x00bb }
            r7.f17021l = r8     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.b.d r8 = r7.f17012c     // Catch:{ all -> 0x00bb }
            if (r8 == 0) goto L_0x008f
            com.ironsource.mediationsdk.adunit.b.d r8 = r7.f17012c     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.b.i r8 = r8.f16927e     // Catch:{ all -> 0x00bb }
            java.lang.String r9 = "ad expired for %s"
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.model.a r1 = r7.f17018i     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r1.f17320a     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = r1.getProviderName()     // Catch:{ all -> 0x00bb }
            r10[r4] = r1     // Catch:{ all -> 0x00bb }
            java.lang.String r9 = java.lang.String.format(r9, r10)     // Catch:{ all -> 0x00bb }
            r8.mo36490p(r9)     // Catch:{ all -> 0x00bb }
        L_0x008f:
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return
        L_0x0091:
            java.lang.String r8 = "unexpected load failed for %s, state - %s, error - %s, %s"
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = r7.mo36547m()     // Catch:{ all -> 0x00bb }
            r1[r4] = r2     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = r7.f17013d     // Catch:{ all -> 0x00bb }
            r1[r3] = r2     // Catch:{ all -> 0x00bb }
            r2 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00bb }
            r1[r2] = r9     // Catch:{ all -> 0x00bb }
            r9 = 3
            r1[r9] = r10     // Catch:{ all -> 0x00bb }
            java.lang.String r8 = java.lang.String.format(r8, r1)     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.b.d r9 = r7.f17012c     // Catch:{ all -> 0x00bb }
            if (r9 == 0) goto L_0x00b9
            com.ironsource.mediationsdk.adunit.b.d r9 = r7.f17012c     // Catch:{ all -> 0x00bb }
            com.ironsource.mediationsdk.adunit.b.i r9 = r9.f16927e     // Catch:{ all -> 0x00bb }
            r9.mo36483i(r8)     // Catch:{ all -> 0x00bb }
        L_0x00b9:
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return
        L_0x00bb:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c.onAdLoadFailed(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType, int, java.lang.String):void");
    }

    public void onAdLoadSuccess() {
        IronLog.INTERNAL.verbose(mo36539c(""));
        C6617c cVar = this.f17023n;
        if (cVar != null) {
            cVar.mo36633d();
        }
        if (this.f17013d == C6571a.LOADING) {
            long a = C6740f.m20412a(this.f17022m);
            C6542d dVar = this.f17012c;
            if (dVar != null) {
                dVar.f16924b.mo36467a(a, false);
            }
            mo36536a(C6571a.LOADED);
            this.f17011b.mo36500a(this);
        } else if (this.f17013d != C6571a.FAILED) {
            String format = String.format("unexpected load success for %s, state - %s", new Object[]{mo36547m(), this.f17013d});
            C6542d dVar2 = this.f17012c;
            if (dVar2 != null) {
                dVar2.f16927e.mo36482h(format);
            }
        }
    }

    public void onInitFailed(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo36539c("error = " + i + ", " + str));
        if (mo36534a()) {
            C6617c cVar = this.f17023n;
            if (cVar != null) {
                cVar.mo36633d();
            }
            mo36536a(C6571a.FAILED);
            Listener listener = this.f17011b;
            IronSourceError ironSourceError = new IronSourceError(i, str);
            C6740f.m20412a(this.f17022m);
            listener.mo36501a(ironSourceError, this);
        } else if (this.f17013d != C6571a.FAILED) {
            String format = String.format("unexpected init failed for %s, state - %s, error - %s, %s", new Object[]{mo36547m(), this.f17013d, Integer.valueOf(i), str});
            C6542d dVar = this.f17012c;
            if (dVar != null) {
                dVar.f16927e.mo36479e(format);
            }
        }
    }

    public void onInitSuccess() {
        IronLog.INTERNAL.verbose(mo36539c(""));
        if (mo36534a()) {
            C6617c cVar = this.f17023n;
            if (cVar != null) {
                cVar.mo36633d();
            }
            mo36536a(C6571a.READY_TO_LOAD);
            IronLog.INTERNAL.verbose(mo36539c(""));
            mo36536a(C6571a.LOADING);
            try {
                this.f17023n.mo36632a(this);
                this.f17017h.loadAd(this.f17015f, ContextProvider.getInstance().getCurrentActiveActivity(), this);
            } catch (Throwable th) {
                String str = "unexpected error while calling adapter.loadAd() - " + th.getLocalizedMessage();
                IronLog.INTERNAL.error(mo36539c(str));
                C6542d dVar = this.f17012c;
                if (dVar != null) {
                    dVar.f16927e.mo36487m(str);
                }
                onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, IronSourceError.ERROR_CODE_GENERIC, str);
            }
        } else if (this.f17013d != C6571a.FAILED) {
            String format = String.format("unexpected init success for %s, state - %s", new Object[]{mo36547m(), this.f17013d});
            C6542d dVar2 = this.f17012c;
            if (dVar2 != null) {
                dVar2.f16927e.mo36478d(format);
            }
        }
    }

    /* renamed from: p */
    public final boolean mo36550p() {
        return this.f17013d == C6571a.SHOWING;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final String mo36551q() {
        Placement placement = this.f17014e;
        return placement == null ? "" : placement.getPlacementName();
    }
}
