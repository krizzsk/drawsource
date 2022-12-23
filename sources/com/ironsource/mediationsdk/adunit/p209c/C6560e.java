package com.ironsource.mediationsdk.adunit.p209c;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.environment.C6397j;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.p204e.C6387c;
import com.ironsource.mediationsdk.C6421B;
import com.ironsource.mediationsdk.C6432F;
import com.ironsource.mediationsdk.C6577ae;
import com.ironsource.mediationsdk.C6604ai;
import com.ironsource.mediationsdk.C6619c;
import com.ironsource.mediationsdk.C6622d;
import com.ironsource.mediationsdk.C6629g;
import com.ironsource.mediationsdk.C6630h;
import com.ironsource.mediationsdk.C6636j;
import com.ironsource.mediationsdk.C6732u;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p208b.C6540b;
import com.ironsource.mediationsdk.adunit.p208b.C6541c;
import com.ironsource.mediationsdk.adunit.p208b.C6542d;
import com.ironsource.mediationsdk.adunit.p208b.C6549i;
import com.ironsource.mediationsdk.adunit.p209c.p210a.C6552b;
import com.ironsource.mediationsdk.adunit.p209c.p211b.C6555a;
import com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c;
import com.ironsource.mediationsdk.adunit.p214e.C6574a;
import com.ironsource.mediationsdk.adunit.p214e.C6576b;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p216c.C6621b;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.server.C6729b;
import com.ironsource.mediationsdk.utils.C6734a;
import com.ironsource.mediationsdk.utils.C6740f;
import com.ironsource.mediationsdk.utils.C6750m;
import com.ironsource.mediationsdk.utils.C6751n;
import com.ironsource.mediationsdk.utils.C6753o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.c.e */
public abstract class C6560e<Smash extends C6570c<?>, Adapter extends BaseAdAdapter<?, ? extends AdapterAdListener>> implements C6397j, C6541c, C6552b, C6576b, C6604ai, C6619c, C6629g {

    /* renamed from: a */
    protected C6574a<Smash> f16964a;

    /* renamed from: b */
    protected ConcurrentHashMap<String, C6729b> f16965b;

    /* renamed from: c */
    protected ConcurrentHashMap<String, C6636j.C6637a> f16966c;

    /* renamed from: d */
    protected C6630h f16967d;

    /* renamed from: e */
    protected C6636j f16968e;

    /* renamed from: f */
    protected int f16969f;

    /* renamed from: g */
    protected String f16970g = "";

    /* renamed from: h */
    protected JSONObject f16971h;

    /* renamed from: i */
    protected C6729b f16972i;

    /* renamed from: j */
    protected Placement f16973j;

    /* renamed from: k */
    protected boolean f16974k = false;

    /* renamed from: l */
    protected C6751n f16975l;

    /* renamed from: m */
    protected C6550a f16976m;

    /* renamed from: n */
    protected C6563a f16977n;

    /* renamed from: o */
    protected C6557c f16978o;

    /* renamed from: p */
    protected C6421B f16979p;

    /* renamed from: q */
    protected C6542d f16980q;

    /* renamed from: r */
    protected C6554b f16981r;

    /* renamed from: s */
    protected IronSourceSegment f16982s;

    /* renamed from: t */
    protected final Object f16983t = new Object();

    /* renamed from: u */
    private C6740f f16984u;

    /* renamed from: v */
    private C6740f f16985v;

    /* renamed from: w */
    private C6734a f16986w;

    /* renamed from: x */
    private long f16987x = 0;

    /* renamed from: y */
    private Boolean f16988y;

    /* renamed from: z */
    private Set<ImpressionDataListener> f16989z = new HashSet();

    /* renamed from: com.ironsource.mediationsdk.adunit.c.e$a */
    public enum C6563a {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public C6560e(C6550a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + aVar.f16942a + ", loading mode = " + aVar.f16949h.f16952a);
        C6740f fVar = new C6740f();
        this.f16982s = ironSourceSegment;
        this.f16976m = aVar;
        this.f16980q = new C6542d(this.f16976m.f16942a, C6542d.C6544b.MEDIATION, this);
        this.f16981r = new C6554b(this.f16976m.f16942a);
        this.f16978o = new C6557c(this.f16976m.f16949h, this);
        mo36520a(C6563a.NONE);
        this.f16989z = set;
        this.f16964a = new C6574a<>(this.f16976m.f16945d.f17583p, this.f16976m.f16945d.f17575h, this);
        this.f16980q.f16923a.mo36463a();
        this.f16965b = new ConcurrentHashMap<>();
        this.f16966c = new ConcurrentHashMap<>();
        this.f16973j = null;
        C6732u.m20387a().mo36953a(this.f16976m.f16942a, this.f16976m.f16947f);
        this.f16971h = new JSONObject();
        if (this.f16976m.mo36492a()) {
            this.f16967d = new C6630h(this.f16976m.f16942a.toString(), this.f16976m.f16945d, this);
        }
        m19913a(this.f16976m.f16944c, this.f16976m.f16945d.f17574g);
        m19921k();
        m19922l();
        this.f16984u = new C6740f();
        mo36520a(C6563a.READY_TO_LOAD);
        this.f16980q.f16923a.mo36464a(C6740f.m20412a(fVar));
        this.f16979p = new C6421B(aVar.f16950i, this);
        this.f16986w = new C6734a();
        if (this.f16976m.f16949h.mo36508b()) {
            IronLog.INTERNAL.verbose("first automatic load");
            mo36526d();
        }
    }

    /* renamed from: a */
    private static String m19908a(C6729b bVar, int i) {
        return String.format("%s%s", new Object[]{Integer.valueOf(i), bVar.mo36942a()});
    }

    /* renamed from: a */
    private String m19909a(List<C6729b> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo36517a("waterfall.size() = " + list.size()));
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < list.size(); i++) {
            C6729b bVar = list.get(i);
            C6570c b = m19917b(bVar, str);
            if (b != null) {
                copyOnWriteArrayList.add(b);
                sb.append(m19908a(bVar, b.mo36546l()));
            }
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        this.f16964a.mo36554a(this.f16976m.f16949h.f16952a, copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(mo36517a("updateWaterfall() - next waterfall is " + sb.toString()));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19910a(int i, String str, boolean z) {
        mo36520a(C6563a.READY_TO_LOAD);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo36517a("errorCode = " + i + ", errorReason = " + str));
        if (this.f16976m.f16949h.mo36507a()) {
            if (z) {
                this.f16980q.f16924b.mo36466a(C6740f.m20412a(this.f16985v), i, str);
            }
            C6732u.m20387a().mo36954a(this.f16976m.f16942a, new IronSourceError(i, str));
        } else {
            if (z) {
                this.f16980q.f16927e.mo36471a(i, str);
            }
            mo36523a(false, false);
        }
        this.f16978o.mo36509a();
    }

    /* renamed from: a */
    private void m19913a(List<NetworkSettings> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings providerName : list) {
            arrayList.add(providerName.getProviderName());
        }
        this.f16968e = new C6636j(arrayList, i);
    }

    /* renamed from: a */
    private boolean m19914a(C6563a aVar, C6563a aVar2) {
        boolean z;
        synchronized (this.f16983t) {
            if (this.f16977n == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(mo36517a("set state from '" + this.f16977n + "' to '" + aVar2 + "'"));
                z = true;
                this.f16977n = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m19916a(NetworkSettings networkSettings) {
        AdapterBaseInterface a = C6622d.m20139a().mo36648a(networkSettings, this.f16976m.f16942a);
        return (a instanceof AdapterSettingsInterface) && this.f16964a.mo36557a(this.f16976m.f16949h.f16952a, networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), ((AdapterSettingsInterface) a).getLoadWhileShowSupportedState(networkSettings));
    }

    /* renamed from: b */
    private Smash m19917b(C6729b bVar, String str) {
        NetworkSettings a = this.f16976m.mo36491a(bVar.mo36942a());
        if (a != null) {
            C6622d.m20139a().mo36648a(a, this.f16976m.f16942a);
            BaseAdAdapter a2 = mo36515a(a, this.f16976m.f16942a);
            if (a2 != null) {
                Smash a3 = mo36516a(a, a2, C6753o.m20481a().mo36991b(this.f16976m.f16942a), str);
                this.f16965b.put(a3.mo36388k(), bVar);
                this.f16966c.put(bVar.mo36942a(), C6636j.C6637a.ISAuctionPerformanceDidntAttemptToLoad);
                return a3;
            }
            String str2 = "addSmashToWaterfall - could not load ad adapter for " + a.getProviderInstanceName();
            IronLog.INTERNAL.error(mo36517a(str2));
            this.f16980q.f16927e.mo36476b(str2);
        } else {
            String str3 = "could not find matching provider settings for auction response item - item = " + bVar.mo36942a();
            IronLog.INTERNAL.error(mo36517a(str3));
            this.f16980q.f16927e.mo36477c(str3);
        }
        return null;
    }

    /* renamed from: c */
    private void m19918c(Smash smash) {
        IronLog.INTERNAL.verbose(mo36517a(""));
        String b = this.f16965b.get(smash.mo36388k()).mo36943b();
        smash.mo36538b(b);
        smash.mo36537a(b);
    }

    /* renamed from: i */
    private boolean m19919i() {
        boolean z;
        synchronized (this.f16983t) {
            z = this.f16977n == C6563a.LOADING;
        }
        return z;
    }

    /* renamed from: j */
    private boolean m19920j() {
        boolean z;
        synchronized (this.f16983t) {
            z = this.f16977n == C6563a.AUCTION;
        }
        return z;
    }

    /* renamed from: k */
    private void m19921k() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : this.f16976m.f16944c) {
            arrayList.add(new C6750m(next.getProviderInstanceName(), next.getMaxAdsPerSession(this.f16976m.f16942a)));
        }
        this.f16975l = new C6751n(arrayList);
    }

    /* renamed from: l */
    private void m19922l() {
        JSONObject jSONObject;
        IronLog.INTERNAL.verbose(mo36517a(""));
        for (NetworkSettings next : this.f16976m.f16944c) {
            if (next.isIronSource() || next.isBidder(this.f16976m.f16942a)) {
                HashMap hashMap = new HashMap();
                hashMap.put(DataKeys.USER_ID, this.f16976m.f16943b);
                if (this.f16976m.f16942a == IronSource.AD_UNIT.INTERSTITIAL) {
                    jSONObject = next.getInterstitialSettings();
                } else if (this.f16976m.f16942a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    jSONObject = next.getRewardedVideoSettings();
                } else {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.error("ad unit not supported - " + this.f16976m.f16942a);
                    jSONObject = new JSONObject();
                }
                hashMap.putAll(C6621b.m20124a(jSONObject));
                AdData adData = new AdData((String) null, hashMap);
                AdapterBaseInterface a = C6622d.m20139a().mo36648a(next, this.f16976m.f16942a);
                if (a != null) {
                    try {
                        a.init(adData, ContextProvider.getInstance().getApplicationContext(), (NetworkInitializationListener) null);
                    } catch (Exception e) {
                        C6549i iVar = this.f16980q.f16927e;
                        iVar.mo36473a("initNetworks - exception while calling networkAdapter.init - " + e);
                    }
                } else {
                    this.f16980q.f16927e.mo36473a("initNetworks - could not load network adapter");
                }
            }
        }
    }

    /* renamed from: m */
    private void m19923m() {
        IronLog.INTERNAL.verbose(mo36517a(""));
        m19909a(m19924n(), m19930t());
    }

    /* renamed from: n */
    private List<C6729b> m19924n() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings next : this.f16976m.f16944c) {
            C6750m mVar = new C6750m(next.getProviderInstanceName(), next.getMaxAdsPerSession(this.f16976m.f16942a));
            if (!next.isBidder(this.f16976m.f16942a) && !this.f16975l.mo36987b(mVar) && m19916a(next)) {
                copyOnWriteArrayList.add(new C6729b(mVar.mo36388k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: o */
    private void m19925o() {
        Iterator it = m19926p().iterator();
        while (it.hasNext()) {
            m19918c((C6570c) it.next());
        }
    }

    /* renamed from: p */
    private ArrayList<Smash> m19926p() {
        StringBuilder sb;
        IronLog.INTERNAL.verbose(mo36517a("mWaterfall.size() = " + this.f16964a.mo36553a().size()));
        ArrayList<Smash> arrayList = new ArrayList<>();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= this.f16964a.mo36553a().size() || i2 >= this.f16976m.f16946e) {
                break;
            }
            C6570c cVar = (C6570c) this.f16964a.mo36553a().get(i);
            if (cVar.mo36542f()) {
                if (cVar.mo36540d() || cVar.mo36541e()) {
                    IronLog.INTERNAL.verbose("smash = " + cVar.mo36547m());
                } else if (!cVar.mo36545i()) {
                    arrayList.add(cVar);
                } else if (i2 == 0) {
                    sb.append(cVar.mo36388k());
                    sb.append(". No other instances will be loaded at the same time.");
                    String sb2 = sb.toString();
                    IronLog.INTERNAL.verbose(mo36517a(sb2));
                    IronSourceUtils.sendAutomationLog(sb2);
                    arrayList.add(cVar);
                    i2++;
                } else {
                    sb = new StringBuilder("Advanced Loading: Won't start loading bidder ");
                    sb.append(cVar.mo36388k());
                    sb.append(" as a non bidder is being loaded");
                    String sb3 = sb.toString();
                    IronLog.INTERNAL.verbose(mo36517a(sb3));
                    IronSourceUtils.sendAutomationLog(sb3);
                }
                i2++;
            } else {
                IronLog.INTERNAL.verbose(mo36517a(String.format("smash %s is not ready to load", new Object[]{cVar.mo36547m()})));
            }
            i++;
        }
        if (i2 == 0) {
            m19910a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", true);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r2 <= 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        new java.util.Timer().schedule(new com.ironsource.mediationsdk.adunit.p209c.C6560e.C65611(r4), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        m19928r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r2 = r4.f16976m.f16945d.f17577j - com.ironsource.mediationsdk.utils.C6740f.m20412a(r4.f16984u);
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19927q() {
        /*
            r4 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = ""
            java.lang.String r1 = r4.mo36517a((java.lang.String) r1)
            r0.verbose(r1)
            java.lang.Object r0 = r4.f16983t
            monitor-enter(r0)
            com.ironsource.mediationsdk.adunit.c.e$a r1 = r4.f16977n     // Catch:{ all -> 0x0041 }
            com.ironsource.mediationsdk.adunit.c.e$a r2 = com.ironsource.mediationsdk.adunit.p209c.C6560e.C6563a.AUCTION     // Catch:{ all -> 0x0041 }
            if (r1 != r2) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x0016:
            com.ironsource.mediationsdk.adunit.c.e$a r1 = com.ironsource.mediationsdk.adunit.p209c.C6560e.C6563a.AUCTION     // Catch:{ all -> 0x0041 }
            r4.mo36520a((com.ironsource.mediationsdk.adunit.p209c.C6560e.C6563a) r1)     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            com.ironsource.mediationsdk.utils.f r0 = r4.f16984u
            long r0 = com.ironsource.mediationsdk.utils.C6740f.m20412a(r0)
            com.ironsource.mediationsdk.adunit.c.a r2 = r4.f16976m
            com.ironsource.mediationsdk.utils.c r2 = r2.f16945d
            long r2 = r2.f17577j
            long r2 = r2 - r0
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            com.ironsource.mediationsdk.adunit.c.e$1 r1 = new com.ironsource.mediationsdk.adunit.c.e$1
            r1.<init>()
            r0.schedule(r1, r2)
            return
        L_0x003d:
            r4.m19928r()
            return
        L_0x0041:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p209c.C6560e.m19927q():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m19928r() {
        IronLog.INTERNAL.verbose(mo36517a(""));
        AsyncTask.execute(new Runnable() {
            public final void run() {
                int i;
                C6560e.this.f16971h = new JSONObject();
                C6560e.this.f16980q.f16925c.mo36454a();
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                for (NetworkSettings next : C6560e.this.f16976m.f16944c) {
                    if (!C6560e.this.f16975l.mo36987b(new C6750m(next.getProviderInstanceName(), next.getMaxAdsPerSession(C6560e.this.f16976m.f16942a))) && C6560e.this.m19916a(next)) {
                        if (next.isBidder(C6560e.this.f16976m.f16942a)) {
                            AdapterBaseInterface a = C6622d.m20139a().mo36648a(next, C6560e.this.f16976m.f16942a);
                            if (a instanceof AdapterBidderInterface) {
                                try {
                                    Map<String, Object> biddingData = ((AdapterBidderInterface) a).getBiddingData(ContextProvider.getInstance().getApplicationContext());
                                    if (biddingData != null) {
                                        hashMap.put(next.getProviderInstanceName(), biddingData);
                                        sb.append(next.getInstanceType(C6560e.this.f16976m.f16942a) + next.getProviderInstanceName() + ",");
                                    } else {
                                        C6560e.this.f16980q.f16927e.mo36474a(next.getProviderDefaultInstance(), a.getAdapterVersion(), a.getNetworkSDKVersion(), next.getSubProviderId(), "Missing bidding data");
                                    }
                                } catch (Exception e) {
                                    C6549i iVar = C6560e.this.f16980q.f16927e;
                                    iVar.mo36487m("exception while calling networkAdapter.getBiddingData - " + e);
                                }
                            } else {
                                C6560e.this.f16980q.f16927e.mo36473a(a == null ? "could not load network adapter" : "network adapter does not implementing AdapterBidderInterface");
                            }
                        } else {
                            arrayList.add(next.getProviderInstanceName());
                            sb.append(next.getInstanceType(C6560e.this.f16976m.f16942a) + next.getProviderInstanceName() + ",");
                        }
                    }
                }
                IronLog ironLog = IronLog.INTERNAL;
                C6560e eVar = C6560e.this;
                ironLog.verbose(eVar.mo36517a("auction waterfallString = " + sb));
                if (hashMap.size() == 0 && arrayList.size() == 0) {
                    IronLog.INTERNAL.verbose(C6560e.this.mo36517a("auction failed - no candidates"));
                    C6560e.this.f16980q.f16925c.mo36456a(0, 1005, "No candidates available for auctioning");
                    C6560e eVar2 = C6560e.this;
                    IronSource.AD_UNIT ad_unit = eVar2.f16976m.f16942a;
                    if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                        i = 1035;
                    } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                        i = 1024;
                    } else {
                        IronLog ironLog2 = IronLog.INTERNAL;
                        ironLog2.warning("ad unit not supported - " + ad_unit);
                        i = IronSourceError.ERROR_CODE_GENERIC;
                    }
                    eVar2.m19910a(i, "no auction candidates", true);
                    return;
                }
                C6560e.this.f16980q.f16925c.mo36457a(sb.toString());
                if (C6560e.this.f16967d != null) {
                    C6560e.this.f16967d.mo36662a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, C6560e.this.f16968e, C6753o.m20481a().mo36991b(C6560e.this.f16976m.f16942a), C6560e.this.f16982s);
                } else {
                    IronLog.INTERNAL.error(C6560e.this.mo36517a("mAuctionHandler is null"));
                }
            }
        });
    }

    /* renamed from: s */
    private void m19929s() {
        this.f16986w.mo36957a(this.f16976m.f16942a, false);
    }

    /* renamed from: t */
    private static String m19930t() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Adapter mo36515a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Smash mo36516a(NetworkSettings networkSettings, Adapter adapter, int i, String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo36517a(String str) {
        String name = this.f16976m.f16942a.name();
        if (TextUtils.isEmpty(str)) {
            return name;
        }
        return name + " - " + str;
    }

    /* renamed from: a */
    public final Map<String, Object> mo36449a(C6540b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        boolean z = true;
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f16964a.f17033b)) {
            hashMap.put("auctionId", this.f16964a.f17033b);
        }
        JSONObject jSONObject = this.f16971h;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16971h);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C6753o.m20481a().mo36991b(this.f16976m.f16942a)));
        if (!(bVar == C6540b.LOAD_AD_SUCCESS || bVar == C6540b.LOAD_AD_FAILED || bVar == C6540b.LOAD_AD_FAILED_WITH_REASON || bVar == C6540b.AUCTION_SUCCESS || bVar == C6540b.AUCTION_FAILED || bVar == C6540b.AD_UNIT_CAPPED)) {
            z = false;
        }
        if (z) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f16969f));
            if (!TextUtils.isEmpty(this.f16970g)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f16970g);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo36518a(int i) {
        C6549i iVar = this.f16980q.f16927e;
        iVar.mo36489o("waterfalls hold too many with size = " + i);
    }

    /* renamed from: a */
    public final void mo36163a(int i, String str, int i2, String str2, long j) {
        String str3 = "";
        IronLog.INTERNAL.verbose(mo36517a(str3));
        if (m19920j()) {
            String str4 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
            IronLog.INTERNAL.verbose(mo36517a(str4));
            StringBuilder sb = new StringBuilder();
            IronSource.AD_UNIT ad_unit = this.f16976m.f16942a;
            if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                str3 = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
            } else if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                str3 = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
            } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                str3 = "BN";
            }
            sb.append(str3);
            sb.append(": ");
            sb.append(str4);
            IronSourceUtils.sendAutomationLog(sb.toString());
            this.f16969f = i2;
            this.f16970g = str2;
            this.f16971h = new JSONObject();
            m19923m();
            this.f16980q.f16925c.mo36456a(j, i, str);
            mo36520a(C6563a.LOADING);
            m19925o();
            return;
        }
        this.f16980q.f16927e.mo36481g("unexpected auction fail - error = " + i + ", " + str);
    }

    /* renamed from: a */
    public final void mo36519a(IronSourceSegment ironSourceSegment) {
        this.f16982s = ironSourceSegment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36520a(C6563a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo36517a("from " + this.f16977n + " to " + aVar));
        synchronized (this.f16983t) {
            this.f16977n = aVar;
        }
    }

    /* renamed from: a */
    public final void mo36500a(C6570c<?> cVar) {
        IronLog.INTERNAL.verbose(mo36517a(cVar.mo36547m()));
        if (cVar.mo36549o() != this.f16964a.f17033b) {
            String str = "onLoadSuccess was invoked with state = " + this.f16977n + " auctionId: " + cVar.mo36549o() + " and the current id is " + this.f16964a.f17033b;
            IronLog.INTERNAL.verbose(str);
            this.f16980q.f16927e.mo36482h(str);
            return;
        }
        this.f16966c.put(cVar.mo36388k(), C6636j.C6637a.ISAuctionPerformanceLoadedSuccessfully);
        if (m19914a(C6563a.LOADING, C6563a.READY_TO_SHOW)) {
            this.f16980q.f16924b.mo36467a(C6740f.m20412a(this.f16985v), this.f16976m.f16942a == IronSource.AD_UNIT.REWARDED_VIDEO && this.f16976m.f16949h.f16952a == C6555a.C6556a.MANUAL);
            if (this.f16976m.f16949h.mo36508b()) {
                this.f16979p.mo35978a(0);
            }
            if (this.f16976m.mo36492a()) {
                C6729b bVar = this.f16965b.get(cVar.mo36388k());
                if (bVar != null) {
                    C6574a<Smash> aVar = this.f16964a;
                    aVar.mo36556a(aVar.f17033b, bVar.mo36941a(""));
                    C6630h.m20184a(bVar, cVar.mo36546l(), this.f16972i);
                    ArrayList arrayList = new ArrayList();
                    Iterator<Smash> it = this.f16964a.mo36553a().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C6570c) it.next()).mo36388k());
                    }
                    C6630h.m20186a((ArrayList<String>) arrayList, this.f16965b, cVar.mo36546l(), this.f16972i, bVar);
                } else {
                    String k = cVar.mo36388k();
                    String str2 = "winner instance missing from waterfall - " + k;
                    IronLog.INTERNAL.verbose(mo36517a(str2));
                    this.f16980q.f16927e.mo36472a(1010, str2, k);
                }
            }
            if (this.f16976m.f16949h.mo36507a()) {
                C6554b bVar2 = this.f16981r;
                AdInfo a = this.f16964a.mo36552a(cVar.mo36549o());
                if (bVar2.f16951a == IronSource.AD_UNIT.INTERSTITIAL) {
                    C6432F.m19211a().mo35995a(a);
                } else if (bVar2.f16951a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    C6577ae a2 = C6577ae.m20001a();
                    if (a2.f17045a != null && (a2.f17045a instanceof RewardedVideoManualListener)) {
                        C6387c.f16171a.mo35896a(new Runnable() {
                            public final void run() {
                                if (C6577ae.this.f17045a != null) {
                                    ((RewardedVideoManualListener) C6577ae.this.f17045a).onRewardedVideoAdReady();
                                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdReady()", 1);
                                }
                            }
                        });
                    }
                    if (a2.f17046b != null && (a2.f17046b instanceof LevelPlayRewardedVideoManualListener)) {
                        C6387c.f16171a.mo35896a(new Runnable(a) {

                            /* renamed from: a */
                            private /* synthetic */ AdInfo f17051a;

                            {
                                this.f17051a = r2;
                            }

                            public final void run() {
                                if (C6577ae.this.f17046b != null) {
                                    ((LevelPlayRewardedVideoManualListener) C6577ae.this.f17046b).onAdReady(C6577ae.this.mo36896f(this.f17051a));
                                    IronLog ironLog = IronLog.CALLBACK;
                                    ironLog.info("onAdReady() adInfo = " + C6577ae.this.mo36896f(this.f17051a));
                                }
                            }
                        });
                    }
                } else {
                    IronLog.INTERNAL.warning("ad unit not supported - " + bVar2.f16951a);
                }
            } else {
                mo36523a(true, false);
            }
        } else {
            this.f16980q.f16927e.mo36482h(String.format("unexpected load success for smash - %s", new Object[]{cVar.mo36547m()}));
        }
    }

    /* renamed from: a */
    public final void mo36521a(ImpressionDataListener impressionDataListener) {
        this.f16989z.add(impressionDataListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
        r6 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
        if (r6.hasNext() == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008d, code lost:
        m19918c((com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c) r6.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36501a(com.ironsource.mediationsdk.logger.IronSourceError r6, com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c<?> r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r5.f16983t
            monitor-enter(r1)
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r3.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r4 = r7.mo36547m()     // Catch:{ all -> 0x00ce }
            r3.append(r4)     // Catch:{ all -> 0x00ce }
            java.lang.String r4 = " - error = "
            r3.append(r4)     // Catch:{ all -> 0x00ce }
            r3.append(r6)     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = r5.mo36517a((java.lang.String) r3)     // Catch:{ all -> 0x00ce }
            r2.verbose(r3)     // Catch:{ all -> 0x00ce }
            java.lang.String r2 = r7.mo36549o()     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.e.a<Smash> r3 = r5.f16964a     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = r3.f17033b     // Catch:{ all -> 0x00ce }
            if (r2 != r3) goto L_0x0098
            com.ironsource.mediationsdk.adunit.c.e$a r2 = r5.f16977n     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.c.e$a r3 = com.ironsource.mediationsdk.adunit.p209c.C6560e.C6563a.AUCTION     // Catch:{ all -> 0x00ce }
            if (r2 != r3) goto L_0x003a
            goto L_0x0098
        L_0x003a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r2 = r5.f16966c     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = r7.mo36388k()     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.j$a r4 = com.ironsource.mediationsdk.C6636j.C6637a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x00ce }
            r2.put(r3, r4)     // Catch:{ all -> 0x00ce }
            boolean r2 = r5.m19919i()     // Catch:{ all -> 0x00ce }
            if (r2 != 0) goto L_0x007e
            boolean r2 = r5.mo36527f()     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x0052
            goto L_0x007e
        L_0x0052:
            com.ironsource.mediationsdk.adunit.b.d r2 = r5.f16980q     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.b.i r2 = r2.f16927e     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            java.lang.String r4 = "unexpected load failed for state - "
            r3.<init>(r4)     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.c.e$a r4 = r5.f16977n     // Catch:{ all -> 0x00ce }
            r3.append(r4)     // Catch:{ all -> 0x00ce }
            java.lang.String r4 = " smash - "
            r3.append(r4)     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = r7.mo36547m()     // Catch:{ all -> 0x00ce }
            r3.append(r7)     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = ", error - "
            r3.append(r7)     // Catch:{ all -> 0x00ce }
            r3.append(r6)     // Catch:{ all -> 0x00ce }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00ce }
            r2.mo36483i(r6)     // Catch:{ all -> 0x00ce }
            goto L_0x0082
        L_0x007e:
            java.util.ArrayList r0 = r5.m19926p()     // Catch:{ all -> 0x00ce }
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x00ce }
            java.util.Iterator r6 = r0.iterator()
        L_0x0087:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0097
            java.lang.Object r7 = r6.next()
            com.ironsource.mediationsdk.adunit.d.a.c r7 = (com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c) r7
            r5.m19918c(r7)
            goto L_0x0087
        L_0x0097:
            return
        L_0x0098:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "onAdLoadFailed was invoked with state ="
            r6.<init>(r0)     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.c.e$a r0 = r5.f16977n     // Catch:{ all -> 0x00ce }
            r6.append(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = " auctionId: "
            r6.append(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = r7.mo36549o()     // Catch:{ all -> 0x00ce }
            r6.append(r7)     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = " and the current id is "
            r6.append(r7)     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.e.a<Smash> r7 = r5.f16964a     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = r7.f17033b     // Catch:{ all -> 0x00ce }
            r6.append(r7)     // Catch:{ all -> 0x00ce }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.logger.IronLog r7 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00ce }
            r7.verbose(r6)     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.b.d r7 = r5.f16980q     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.b.i r7 = r7.f16927e     // Catch:{ all -> 0x00ce }
            r7.mo36483i(r6)     // Catch:{ all -> 0x00ce }
            monitor-exit(r1)     // Catch:{ all -> 0x00ce }
            return
        L_0x00ce:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ce }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p209c.C6560e.mo36501a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.adunit.d.a.c):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36522a(C6729b bVar, String str) {
        if (bVar != null) {
            ImpressionData a = bVar.mo36941a(str);
            if (a != null) {
                for (ImpressionDataListener next : this.f16989z) {
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info(mo36517a("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + a));
                    next.onImpressionSuccess(a);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose(mo36517a("no auctionResponseItem or listener"));
    }

    /* renamed from: a */
    public final void mo36169a(List<C6729b> list, String str, C6729b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.verbose(mo36517a(""));
        if (m19920j()) {
            this.f16970g = "";
            this.f16969f = i;
            this.f16972i = bVar;
            this.f16971h = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                this.f16980q.f16927e.mo36475b(i2, str2);
            }
            this.f16986w.mo36957a(this.f16976m.f16942a, jSONObject2 != null ? jSONObject2.optBoolean("isAdUnitCapped", false) : false);
            if (this.f16986w.mo36958a(this.f16976m.f16942a)) {
                this.f16980q.f16925c.mo36459c(str);
                m19910a(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped", false);
                return;
            }
            String a = m19909a(list, str);
            this.f16980q.f16925c.mo36455a(j);
            this.f16980q.f16925c.mo36458b(a);
            mo36520a(C6563a.LOADING);
            m19925o();
            return;
        }
        C6549i iVar = this.f16980q.f16927e;
        iVar.mo36480f("unexpected auction success for auctionId - " + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (mo36514b() != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r3.f16988y.booleanValue() != false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35903a(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.f16974k
            if (r0 == 0) goto L_0x0048
            com.ironsource.mediationsdk.adunit.c.a r0 = r3.f16976m
            com.ironsource.mediationsdk.adunit.c.b.a r0 = r0.f16949h
            boolean r0 = r0.mo36507a()
            if (r0 == 0) goto L_0x000f
            goto L_0x0048
        L_0x000f:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "network availability changed to - "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.verbose(r1)
            java.lang.Boolean r0 = r3.f16988y
            r1 = 0
            if (r0 != 0) goto L_0x0029
        L_0x0027:
            r2 = r1
            goto L_0x0043
        L_0x0029:
            r2 = 1
            if (r4 == 0) goto L_0x0039
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0039
            boolean r0 = r3.mo36514b()
            if (r0 == 0) goto L_0x0039
            goto L_0x0043
        L_0x0039:
            if (r4 != 0) goto L_0x0027
            java.lang.Boolean r0 = r3.f16988y
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0027
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r3.mo36523a((boolean) r4, (boolean) r1)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p209c.C6560e.mo35903a(boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36523a(boolean z, boolean z2) {
        synchronized (this.f16983t) {
            if (this.f16988y == null || this.f16988y.booleanValue() != z) {
                this.f16988y = Boolean.valueOf(z);
                long j = 0;
                if (this.f16987x != 0) {
                    j = new Date().getTime() - this.f16987x;
                }
                this.f16987x = new Date().getTime();
                this.f16980q.f16924b.mo36469a(z, j, z2);
                this.f16981r.mo36506a(z, this.f16964a.mo36552a(this.f16964a.f17033b));
            }
        }
    }

    /* renamed from: b */
    public final void mo36502b(C6570c<?> cVar) {
        IronLog.INTERNAL.verbose(mo36517a(cVar.mo36547m()));
        C6554b bVar = this.f16981r;
        Placement placement = this.f16973j;
        AdInfo a = this.f16964a.mo36552a(cVar.mo36549o());
        if (bVar.f16951a == IronSource.AD_UNIT.INTERSTITIAL) {
            C6432F.m19211a().mo36003e(a);
        } else if (bVar.f16951a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6577ae.m20001a().mo36566b(placement, a);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + bVar.f16951a);
        }
    }

    /* renamed from: b */
    public final void mo36524b(ImpressionDataListener impressionDataListener) {
        this.f16989z.remove(impressionDataListener);
    }

    /* renamed from: b */
    public final void mo36525b(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo36517a("track = " + z));
        this.f16974k = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo36514b();

    /* renamed from: c_ */
    public final void mo36174c_() {
        if (this.f16976m.f16949h.mo36508b()) {
            mo36520a(C6563a.READY_TO_LOAD);
            mo36523a(false, true);
            mo36526d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fe, code lost:
        if (r5.f16976m.mo36492a() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0100, code lost:
        m19923m();
        m19925o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36526d() {
        /*
            r5 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = ""
            java.lang.String r1 = r5.mo36517a((java.lang.String) r1)
            r0.verbose(r1)
            java.lang.Object r0 = r5.f16983t
            monitor-enter(r0)
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f16976m     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a r1 = r1.f16949h     // Catch:{ all -> 0x0107 }
            boolean r1 = r1.mo36508b()     // Catch:{ all -> 0x0107 }
            r2 = 1
            if (r1 == 0) goto L_0x0034
            com.ironsource.mediationsdk.utils.n r1 = r5.f16975l     // Catch:{ all -> 0x0107 }
            boolean r1 = r1.mo36986a()     // Catch:{ all -> 0x0107 }
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = "all smashes are capped"
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0107 }
            java.lang.String r4 = r5.mo36517a((java.lang.String) r1)     // Catch:{ all -> 0x0107 }
            r3.verbose(r4)     // Catch:{ all -> 0x0107 }
            r3 = 80001(0x13881, float:1.12105E-40)
            r5.m19910a(r3, r1, r2)     // Catch:{ all -> 0x0107 }
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            return
        L_0x0034:
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f16976m     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a r1 = r1.f16949h     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r1 = r1.f16952a     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r3 = com.ironsource.mediationsdk.adunit.p209c.p211b.C6555a.C6556a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch:{ all -> 0x0107 }
            r4 = 0
            if (r1 == r3) goto L_0x0075
            com.ironsource.mediationsdk.adunit.c.e$a r1 = r5.f16977n     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.e$a r3 = com.ironsource.mediationsdk.adunit.p209c.C6560e.C6563a.SHOWING     // Catch:{ all -> 0x0107 }
            if (r1 != r3) goto L_0x0075
            java.lang.String r1 = "load cannot be invoked while showing an ad"
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = r5.mo36517a((java.lang.String) r1)     // Catch:{ all -> 0x0107 }
            r2.error(r3)     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.a r3 = r5.f16976m     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = r3.f16942a     // Catch:{ all -> 0x0107 }
            int r3 = com.ironsource.mediationsdk.adunit.p207a.C6538a.m19819b(r3)     // Catch:{ all -> 0x0107 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f16976m     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a r1 = r1.f16949h     // Catch:{ all -> 0x0107 }
            boolean r1 = r1.mo36507a()     // Catch:{ all -> 0x0107 }
            if (r1 == 0) goto L_0x006d
            com.ironsource.mediationsdk.adunit.c.b r1 = r5.f16981r     // Catch:{ all -> 0x0107 }
            r1.mo36504a(r2)     // Catch:{ all -> 0x0107 }
            goto L_0x0073
        L_0x006d:
            com.ironsource.mediationsdk.adunit.c.b r1 = r5.f16981r     // Catch:{ all -> 0x0107 }
            r2 = 0
            r1.mo36506a((boolean) r4, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r2)     // Catch:{ all -> 0x0107 }
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            return
        L_0x0075:
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f16976m     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a r1 = r1.f16949h     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r1 = r1.f16952a     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r3 = com.ironsource.mediationsdk.adunit.p209c.p211b.C6555a.C6556a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch:{ all -> 0x0107 }
            if (r1 == r3) goto L_0x00a6
            com.ironsource.mediationsdk.adunit.c.e$a r1 = r5.f16977n     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.e$a r3 = com.ironsource.mediationsdk.adunit.p209c.C6560e.C6563a.READY_TO_LOAD     // Catch:{ all -> 0x0107 }
            if (r1 == r3) goto L_0x008b
            com.ironsource.mediationsdk.adunit.c.e$a r1 = r5.f16977n     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.e$a r3 = com.ironsource.mediationsdk.adunit.p209c.C6560e.C6563a.READY_TO_SHOW     // Catch:{ all -> 0x0107 }
            if (r1 != r3) goto L_0x0099
        L_0x008b:
            com.ironsource.mediationsdk.u r1 = com.ironsource.mediationsdk.C6732u.m20387a()     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.a r3 = r5.f16976m     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = r3.f16942a     // Catch:{ all -> 0x0107 }
            boolean r1 = r1.mo36955a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x0107 }
            if (r1 == 0) goto L_0x00a6
        L_0x0099:
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = "load is already in progress"
            java.lang.String r2 = r5.mo36517a((java.lang.String) r2)     // Catch:{ all -> 0x0107 }
            r1.error(r2)     // Catch:{ all -> 0x0107 }
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            return
        L_0x00a6:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0107 }
            r1.<init>()     // Catch:{ all -> 0x0107 }
            r5.f16971h = r1     // Catch:{ all -> 0x0107 }
            r5.m19929s()     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f16976m     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = r1.f16942a     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x0107 }
            if (r1 != r3) goto L_0x00c3
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f16976m     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a r1 = r1.f16949h     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r1 = r1.f16952a     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r3 = com.ironsource.mediationsdk.adunit.p209c.p211b.C6555a.C6556a.MANUAL     // Catch:{ all -> 0x0107 }
            if (r1 != r3) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r2 = r4
        L_0x00c4:
            com.ironsource.mediationsdk.adunit.b.d r1 = r5.f16980q     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.b.h r1 = r1.f16924b     // Catch:{ all -> 0x0107 }
            r1.mo36468a(r2)     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.utils.f r1 = new com.ironsource.mediationsdk.utils.f     // Catch:{ all -> 0x0107 }
            r1.<init>()     // Catch:{ all -> 0x0107 }
            r5.f16985v = r1     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f16976m     // Catch:{ all -> 0x0107 }
            boolean r1 = r1.mo36492a()     // Catch:{ all -> 0x0107 }
            if (r1 == 0) goto L_0x00f2
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r1 = r5.f16966c     // Catch:{ all -> 0x0107 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0107 }
            if (r1 != 0) goto L_0x00ee
            com.ironsource.mediationsdk.j r1 = r5.f16968e     // Catch:{ all -> 0x0107 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r2 = r5.f16966c     // Catch:{ all -> 0x0107 }
            r1.mo36687a((java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.C6636j.C6637a>) r2)     // Catch:{ all -> 0x0107 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r1 = r5.f16966c     // Catch:{ all -> 0x0107 }
            r1.clear()     // Catch:{ all -> 0x0107 }
        L_0x00ee:
            r5.m19927q()     // Catch:{ all -> 0x0107 }
            goto L_0x00f7
        L_0x00f2:
            com.ironsource.mediationsdk.adunit.c.e$a r1 = com.ironsource.mediationsdk.adunit.p209c.C6560e.C6563a.LOADING     // Catch:{ all -> 0x0107 }
            r5.mo36520a((com.ironsource.mediationsdk.adunit.p209c.C6560e.C6563a) r1)     // Catch:{ all -> 0x0107 }
        L_0x00f7:
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.adunit.c.a r0 = r5.f16976m
            boolean r0 = r0.mo36492a()
            if (r0 != 0) goto L_0x0106
            r5.m19923m()
            r5.m19925o()
        L_0x0106:
            return
        L_0x0107:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p209c.C6560e.mo36526d():void");
    }

    /* renamed from: e */
    public final void mo36176e() {
        IronLog.INTERNAL.verbose(mo36517a(""));
        mo36526d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo36527f() {
        boolean z;
        synchronized (this.f16983t) {
            z = this.f16977n == C6563a.READY_TO_SHOW;
        }
        return z;
    }

    /* renamed from: g */
    public final void mo36528g() {
        this.f16989z.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo36529h() {
        Placement placement = this.f16973j;
        return placement == null ? "" : placement.getPlacementName();
    }
}
