package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.environment.C6363a;
import com.ironsource.environment.C6397j;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.C6636j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6666p;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.mediationsdk.p206a.C6522h;
import com.ironsource.mediationsdk.server.C6729b;
import com.ironsource.mediationsdk.utils.C6736c;
import com.ironsource.mediationsdk.utils.C6745k;
import com.ironsource.mediationsdk.utils.C6751n;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.Z */
final class C6502Z extends C6692s implements C6397j, C6424D, C6525aa, C6604ai, C6619c, C6629g {

    /* renamed from: A */
    private Boolean f16677A;

    /* renamed from: B */
    private C6506a f16678B;

    /* renamed from: C */
    private int f16679C;

    /* renamed from: D */
    private String f16680D = "";

    /* renamed from: E */
    private boolean f16681E = false;

    /* renamed from: F */
    private NetworkStateReceiver f16682F;

    /* renamed from: G */
    private C6421B f16683G;

    /* renamed from: d */
    final ConcurrentHashMap<String, C6526ab> f16684d;

    /* renamed from: e */
    C6751n f16685e;

    /* renamed from: f */
    C6630h f16686f;

    /* renamed from: g */
    C6636j f16687g;

    /* renamed from: h */
    String f16688h;

    /* renamed from: i */
    JSONObject f16689i;

    /* renamed from: j */
    int f16690j = 1;

    /* renamed from: k */
    long f16691k;

    /* renamed from: l */
    private CopyOnWriteArrayList<C6526ab> f16692l;

    /* renamed from: m */
    private List<C6729b> f16693m;

    /* renamed from: n */
    private ConcurrentHashMap<String, C6729b> f16694n;

    /* renamed from: o */
    private ConcurrentHashMap<String, C6636j.C6637a> f16695o;

    /* renamed from: p */
    private C6729b f16696p;

    /* renamed from: q */
    private C6600ah f16697q;

    /* renamed from: r */
    private boolean f16698r;

    /* renamed from: s */
    private boolean f16699s;

    /* renamed from: t */
    private boolean f16700t;

    /* renamed from: u */
    private String f16701u;

    /* renamed from: v */
    private long f16702v;

    /* renamed from: w */
    private long f16703w;

    /* renamed from: x */
    private int f16704x;

    /* renamed from: y */
    private boolean f16705y;

    /* renamed from: z */
    private boolean f16706z;

    /* renamed from: com.ironsource.mediationsdk.Z$a */
    enum C6506a {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6502Z(List<NetworkSettings> list, C6666p pVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        C6666p pVar2 = pVar;
        long time = new Date().getTime();
        mo36309a((int) IronSourceConstants.RV_MANAGER_INIT_STARTED);
        mo36311a(C6506a.RV_STATE_INITIATING);
        this.f16677A = null;
        this.f16704x = pVar2.f17401c;
        this.f16705y = pVar2.f17402d;
        this.f16701u = "";
        C6736c cVar = pVar2.f17410l;
        this.f16706z = false;
        this.f16692l = new CopyOnWriteArrayList<>();
        this.f16693m = new ArrayList();
        this.f16694n = new ConcurrentHashMap<>();
        this.f16695o = new ConcurrentHashMap<>();
        this.f16703w = new Date().getTime();
        this.f16698r = cVar.f17573f > 0;
        this.f16699s = cVar.f17581n;
        this.f16700t = !cVar.f17582o;
        this.f16702v = cVar.f17580m;
        if (this.f16698r) {
            this.f16686f = new C6630h("rewardedVideo", cVar, this);
        }
        this.f16697q = new C6600ah(cVar, this);
        this.f16684d = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a = C6622d.m20139a().mo36647a(next, next.getRewardedVideoSettings(), false, false);
            if (a != null) {
                C6624e a2 = C6624e.m20158a();
                if (a2.mo36655a(a, a2.f17172b, "rewarded video")) {
                    C6526ab abVar = r0;
                    C6526ab abVar2 = new C6526ab(str, str2, next, this, pVar2.f17403e, a);
                    String k = abVar.mo36388k();
                    this.f16684d.put(k, abVar);
                    arrayList.add(k);
                }
            }
        }
        this.f16687g = new C6636j(arrayList, cVar.f17574g);
        this.f16685e = new C6751n(new ArrayList(this.f16684d.values()));
        for (C6526ab next2 : this.f16684d.values()) {
            if (next2.mo36385h()) {
                next2.mo36379b();
            }
        }
        mo36310a((int) IronSourceConstants.RV_MANAGER_INIT_ENDED, C6363a.C63641.m19007a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}}));
        this.f16683G = new C6421B(pVar2.f17407i, this);
        m19635a(cVar.f17577j);
    }

    /* renamed from: a */
    private String m19633a(C6729b bVar) {
        C6526ab abVar = this.f16684d.get(bVar.mo36942a());
        String num = abVar != null ? Integer.toString(abVar.mo36386i()) : TextUtils.isEmpty(bVar.mo36943b()) ? "1" : "2";
        return num + bVar.mo36942a();
    }

    /* renamed from: a */
    private void m19634a(int i, Map<String, Object> map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (z2 && !TextUtils.isEmpty(this.f16688h)) {
            hashMap.put("auctionId", this.f16688h);
        }
        JSONObject jSONObject = this.f16689i;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16689i);
        }
        if (z && !TextUtils.isEmpty(this.f16701u)) {
            hashMap.put("placement", this.f16701u);
        }
        if (m19646c(i)) {
            C6522h.m19751d();
            C6522h.m19689a((Map<String, Object>) hashMap, this.f16679C, this.f16680D);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f16690j));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    hashMap.putAll(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "ProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C6522h.m19751d().mo36349b(new C6517c(i, new JSONObject(hashMap)));
    }

    /* renamed from: a */
    private void m19635a(long j) {
        if (this.f16685e.mo36986a()) {
            mo36316b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            mo36323g();
            return;
        }
        mo36841a_();
        if (this.f16698r) {
            if (!this.f16695o.isEmpty()) {
                this.f16687g.mo36687a(this.f16695o);
                this.f16695o.clear();
            }
            new Timer().schedule(new TimerTask() {
                public final void run() {
                    C6502Z z = C6502Z.this;
                    z.mo36311a(C6506a.RV_STATE_AUCTION_IN_PROGRESS);
                    AsyncTask.execute(new Runnable() {
                        public final void run() {
                            StringBuilder sb;
                            C6502Z.m19636a("makeAuction()");
                            C6502Z.this.f16688h = "";
                            C6502Z.this.f16689i = null;
                            C6502Z.this.mo36835a(IronSource.AD_UNIT.REWARDED_VIDEO);
                            C6502Z.this.f16691k = new Date().getTime();
                            HashMap hashMap = new HashMap();
                            ArrayList arrayList = new ArrayList();
                            StringBuilder sb2 = new StringBuilder();
                            for (C6526ab next : C6502Z.this.f16684d.values()) {
                                if (next.mo36385h()) {
                                    next.f16820b = false;
                                }
                                if (!C6502Z.this.f16685e.mo36987b(next)) {
                                    if (next.mo36385h()) {
                                        Map<String, Object> a = next.mo36182a();
                                        if (a != null) {
                                            hashMap.put(next.mo36388k(), a);
                                            sb = new StringBuilder();
                                        } else {
                                            next.mo36380b(IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Missing bidding data"}});
                                        }
                                    } else {
                                        arrayList.add(next.mo36388k());
                                        sb = new StringBuilder();
                                    }
                                    sb.append(next.mo36386i());
                                    sb.append(next.mo36388k());
                                    sb.append(",");
                                    sb2.append(sb.toString());
                                }
                            }
                            if (hashMap.keySet().size() == 0 && arrayList.size() == 0) {
                                C6502Z.this.mo36316b((int) IronSourceConstants.RV_AUCTION_FAILED, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}));
                                C6502Z.m19636a("makeAuction() failed - No candidates available for auctioning");
                                C6502Z.this.mo36323g();
                                return;
                            }
                            C6502Z.m19636a("makeAuction() - request waterfall is: " + sb2);
                            C6502Z.this.mo36309a(1000);
                            C6502Z.this.mo36309a((int) IronSourceConstants.RV_AUCTION_REQUEST);
                            C6502Z.this.mo36310a((int) IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
                            C6502Z.this.f16686f.mo36662a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, C6502Z.this.f16687g, C6502Z.this.f16690j, C6502Z.this.f17485b);
                        }
                    });
                }
            }, j);
            return;
        }
        IronLog.INTERNAL.verbose("auction is disabled, fallback flow will occur");
        m19648h();
        if (this.f16693m.isEmpty()) {
            mo36316b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80002}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            mo36323g();
            return;
        }
        mo36309a(1000);
        if (!this.f16700t || !this.f16706z) {
            mo36322f();
        }
    }

    /* renamed from: a */
    static void m19636a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager: " + str, 0);
    }

    /* renamed from: a */
    private void m19637a(List<C6729b> list) {
        this.f16693m = list;
        StringBuilder sb = new StringBuilder();
        for (C6729b a : list) {
            sb.append(m19633a(a) + ",");
        }
        m19636a("updateNextWaterfallToLoad() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            m19636a("Updated waterfall is empty");
        }
        mo36316b((int) IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    /* renamed from: a */
    private void m19638a(boolean z, Map<String, Object> map) {
        Boolean bool = this.f16677A;
        if (bool == null || bool.booleanValue() != z) {
            this.f16677A = Boolean.valueOf(z);
            long time = new Date().getTime() - this.f16703w;
            this.f16703w = new Date().getTime();
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("duration", Long.valueOf(time));
            mo36316b(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
            C6577ae.m20001a().mo36563a(z, this.f17486c);
        }
    }

    /* renamed from: b */
    private void m19639b(int i) {
        m19634a(i, new HashMap(), true, true);
    }

    /* renamed from: b */
    private static void m19640b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager: " + str, 3);
    }

    /* renamed from: b */
    private void m19641b(List<C6729b> list) {
        this.f16692l.clear();
        this.f16694n.clear();
        this.f16695o.clear();
        for (C6729b next : list) {
            C6526ab abVar = this.f16684d.get(next.mo36942a());
            if (abVar != null) {
                abVar.f16848e = true;
                this.f16692l.add(abVar);
                this.f16694n.put(abVar.mo36388k(), next);
                this.f16695o.put(next.mo36942a(), C6636j.C6637a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                m19636a("updateWaterfall() - could not find matching smash for auction response item " + next.mo36942a());
            }
        }
        this.f16693m.clear();
    }

    /* renamed from: b */
    private void m19642b(boolean z) {
        m19638a(z, (Map<String, Object>) new HashMap());
    }

    /* renamed from: c */
    private void m19643c(int i, Map<String, Object> map) {
        m19634a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map, true, true);
    }

    /* renamed from: c */
    private static void m19644c(C6526ab abVar, String str) {
        String str2 = abVar.mo36388k() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvManager: " + str2, 0);
    }

    /* renamed from: c */
    private static void m19645c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    /* renamed from: c */
    private static boolean m19646c(int i) {
        return i == 1003 || i == 1302 || i == 1301 || i == 1303;
    }

    /* renamed from: e */
    private void m19647e(C6526ab abVar) {
        String b = this.f16694n.get(abVar.mo36388k()).mo36943b();
        C6625f.m20163a();
        C6526ab abVar2 = abVar;
        abVar2.mo36377a(b, this.f16688h, this.f16689i, this.f16679C, this.f16680D, this.f16690j, C6625f.m20174d(b));
    }

    /* renamed from: h */
    private void m19648h() {
        this.f16688h = m20309d();
        m19637a(m19649i());
    }

    /* renamed from: i */
    private List<C6729b> m19649i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C6526ab next : this.f16684d.values()) {
            if (!next.mo36385h() && !this.f16685e.mo36987b(next)) {
                copyOnWriteArrayList.add(new C6729b(next.mo36388k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: j */
    private void m19650j() {
        if (this.f16692l.isEmpty()) {
            mo36316b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            mo36323g();
            return;
        }
        mo36311a(C6506a.RV_STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.f16692l.size() && i < this.f16704x; i2++) {
            C6526ab abVar = this.f16692l.get(i2);
            if (abVar.f16848e) {
                if (!this.f16705y || !abVar.mo36385h()) {
                    m19647e(abVar);
                    i++;
                } else if (i == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + abVar.mo36388k() + ". No other instances will be loaded at the same time.";
                    m19636a(str);
                    IronSourceUtils.sendAutomationLog(str);
                    m19647e(abVar);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + abVar.mo36388k() + " as a non bidder is being loaded";
                    m19636a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36309a(int i) {
        m19634a(i, new HashMap(), false, false);
    }

    /* renamed from: a */
    public final void mo36163a(int i, String str, int i2, String str2, long j) {
        Map<String, Object> map;
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        m19636a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.f16679C = i2;
        this.f16680D = str2;
        this.f16689i = null;
        m19648h();
        if (TextUtils.isEmpty(str)) {
            map = C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            map = C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(j)}});
        }
        mo36316b((int) IronSourceConstants.RV_AUCTION_FAILED, map);
        if (!this.f16700t || !this.f16706z) {
            mo36322f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36310a(int i, Map<String, Object> map) {
        m19634a(i, map, false, false);
    }

    /* renamed from: a */
    public final void mo35984a(Context context, boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager Should Track Network State: " + z, 0);
        try {
            this.f16681E = z;
            if (z) {
                if (this.f16682F == null) {
                    this.f16682F = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f16682F, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f16682F != null) {
                context.getApplicationContext().unregisterReceiver(this.f16682F);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36311a(C6506a aVar) {
        m19636a("current state=" + this.f16678B + ", new state=" + aVar);
        this.f16678B = aVar;
    }

    /* renamed from: a */
    public final void mo36312a(C6526ab abVar) {
        synchronized (this) {
            this.f16690j++;
            m19644c(abVar, "onRewardedVideoAdOpened");
            if (this.f16698r) {
                C6729b bVar = this.f16694n.get(abVar.mo36388k());
                if (bVar != null) {
                    mo36837a(bVar.mo36941a(this.f16701u));
                    C6630h.m20185a(bVar, abVar.mo36386i(), this.f16696p, this.f16701u);
                    this.f16695o.put(abVar.mo36388k(), C6636j.C6637a.ISAuctionPerformanceShowedSuccessfully);
                    mo36839a(bVar, this.f16701u);
                } else {
                    String k = abVar.mo36388k();
                    m19640b("onRewardedVideoAdOpened showing instance " + k + " missing from waterfall");
                    mo36316b((int) IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f16678B}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}}));
                }
            }
            C6577ae.m20001a().mo36559a(this.f17486c);
            this.f16697q.mo36605a();
        }
    }

    /* renamed from: a */
    public final void mo36313a(C6526ab abVar, Placement placement) {
        m19644c(abVar, "onRewardedVideoAdRewarded");
        C6577ae.m20001a().mo36562a(placement, this.f17486c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0148, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36314a(com.ironsource.mediationsdk.C6526ab r12, java.lang.String r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "onLoadSuccess "
            m19644c((com.ironsource.mediationsdk.C6526ab) r12, (java.lang.String) r0)     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = r11.f16688h     // Catch:{ all -> 0x0149 }
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r11.f16688h     // Catch:{ all -> 0x0149 }
            boolean r0 = r13.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x0062
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            java.lang.String r4 = "onLoadSuccess was invoked with auctionId: "
            r0.<init>(r4)     // Catch:{ all -> 0x0149 }
            r0.append(r13)     // Catch:{ all -> 0x0149 }
            java.lang.String r13 = " and the current id is "
            r0.append(r13)     // Catch:{ all -> 0x0149 }
            java.lang.String r13 = r11.f16688h     // Catch:{ all -> 0x0149 }
            r0.append(r13)     // Catch:{ all -> 0x0149 }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x0149 }
            m19636a((java.lang.String) r13)     // Catch:{ all -> 0x0149 }
            r13 = 81315(0x13da3, float:1.13947E-40)
            java.lang.Object[][] r0 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0149 }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0149 }
            java.lang.String r5 = "errorCode"
            r4[r1] = r5     // Catch:{ all -> 0x0149 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0149 }
            r4[r3] = r5     // Catch:{ all -> 0x0149 }
            r0[r1] = r4     // Catch:{ all -> 0x0149 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0149 }
            java.lang.String r4 = "reason"
            r2[r1] = r4     // Catch:{ all -> 0x0149 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            java.lang.String r4 = "onLoadSuccess wrong auction ID "
            r1.<init>(r4)     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.Z$a r4 = r11.f16678B     // Catch:{ all -> 0x0149 }
            r1.append(r4)     // Catch:{ all -> 0x0149 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0149 }
            r2[r3] = r1     // Catch:{ all -> 0x0149 }
            r0[r3] = r2     // Catch:{ all -> 0x0149 }
            r12.mo36380b(r13, r0)     // Catch:{ all -> 0x0149 }
            monitor-exit(r11)
            return
        L_0x0062:
            com.ironsource.mediationsdk.Z$a r0 = r11.f16678B     // Catch:{ all -> 0x0149 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r4 = r11.f16695o     // Catch:{ all -> 0x0149 }
            java.lang.String r5 = r12.mo36388k()     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.j$a r6 = com.ironsource.mediationsdk.C6636j.C6637a.ISAuctionPerformanceLoadedSuccessfully     // Catch:{ all -> 0x0149 }
            r4.put(r5, r6)     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.Z$a r4 = r11.f16678B     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.Z$a r5 = com.ironsource.mediationsdk.C6502Z.C6506a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0149 }
            if (r4 != r5) goto L_0x0147
            com.ironsource.mediationsdk.Z$a r4 = com.ironsource.mediationsdk.C6502Z.C6506a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0149 }
            r11.mo36311a((com.ironsource.mediationsdk.C6502Z.C6506a) r4)     // Catch:{ all -> 0x0149 }
            java.util.Date r4 = new java.util.Date     // Catch:{ all -> 0x0149 }
            r4.<init>()     // Catch:{ all -> 0x0149 }
            long r4 = r4.getTime()     // Catch:{ all -> 0x0149 }
            long r6 = r11.f16691k     // Catch:{ all -> 0x0149 }
            long r4 = r4 - r6
            r6 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r7 = new java.lang.Object[r3][]     // Catch:{ all -> 0x0149 }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x0149 }
            java.lang.String r9 = "duration"
            r8[r1] = r9     // Catch:{ all -> 0x0149 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0149 }
            r8[r3] = r4     // Catch:{ all -> 0x0149 }
            r7[r1] = r8     // Catch:{ all -> 0x0149 }
            java.util.Map r4 = com.ironsource.environment.C6363a.C63641.m19007a((java.lang.Object[][]) r7)     // Catch:{ all -> 0x0149 }
            r11.mo36316b((int) r6, (java.util.Map<java.lang.String, java.lang.Object>) r4)     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.B r4 = r11.f16683G     // Catch:{ all -> 0x0149 }
            r5 = 0
            r4.mo35978a(r5)     // Catch:{ all -> 0x0149 }
            boolean r4 = r11.f16698r     // Catch:{ all -> 0x0149 }
            if (r4 == 0) goto L_0x0144
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r4 = r11.f16694n     // Catch:{ all -> 0x0149 }
            java.lang.String r5 = r12.mo36388k()     // Catch:{ all -> 0x0149 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0149 }
            r10 = r4
            com.ironsource.mediationsdk.server.b r10 = (com.ironsource.mediationsdk.server.C6729b) r10     // Catch:{ all -> 0x0149 }
            if (r10 == 0) goto L_0x00de
            java.lang.String r13 = ""
            com.ironsource.mediationsdk.impressionData.ImpressionData r13 = r10.mo36941a(r13)     // Catch:{ all -> 0x0149 }
            r11.mo36837a((com.ironsource.mediationsdk.impressionData.ImpressionData) r13)     // Catch:{ all -> 0x0149 }
            int r13 = r12.mo36386i()     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.server.b r0 = r11.f16696p     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.C6630h.m20184a(r10, r13, r0)     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.h r5 = r11.f16686f     // Catch:{ all -> 0x0149 }
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.ab> r13 = r11.f16692l     // Catch:{ all -> 0x0149 }
            r6 = r13
            java.util.concurrent.CopyOnWriteArrayList r6 = (java.util.concurrent.CopyOnWriteArrayList) r6     // Catch:{ all -> 0x0149 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r7 = r11.f16694n     // Catch:{ all -> 0x0149 }
            int r8 = r12.mo36386i()     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.server.b r9 = r11.f16696p     // Catch:{ all -> 0x0149 }
            r5.mo36663a((java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.C6529ac>) r6, (java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.C6729b>) r7, (int) r8, (com.ironsource.mediationsdk.server.C6729b) r9, (com.ironsource.mediationsdk.server.C6729b) r10)     // Catch:{ all -> 0x0149 }
            goto L_0x0144
        L_0x00de:
            java.lang.String r12 = r12.mo36388k()     // Catch:{ all -> 0x0149 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            java.lang.String r5 = "onLoadSuccess winner instance "
            r4.<init>(r5)     // Catch:{ all -> 0x0149 }
            r4.append(r12)     // Catch:{ all -> 0x0149 }
            java.lang.String r5 = " missing from waterfall. auctionId: "
            r4.append(r5)     // Catch:{ all -> 0x0149 }
            r4.append(r13)     // Catch:{ all -> 0x0149 }
            java.lang.String r13 = " and the current id is "
            r4.append(r13)     // Catch:{ all -> 0x0149 }
            java.lang.String r13 = r11.f16688h     // Catch:{ all -> 0x0149 }
            r4.append(r13)     // Catch:{ all -> 0x0149 }
            java.lang.String r13 = r4.toString()     // Catch:{ all -> 0x0149 }
            m19640b((java.lang.String) r13)     // Catch:{ all -> 0x0149 }
            r13 = 81317(0x13da5, float:1.1395E-40)
            r4 = 3
            java.lang.Object[][] r4 = new java.lang.Object[r4][]     // Catch:{ all -> 0x0149 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0149 }
            java.lang.String r6 = "errorCode"
            r5[r1] = r6     // Catch:{ all -> 0x0149 }
            r6 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0149 }
            r5[r3] = r6     // Catch:{ all -> 0x0149 }
            r4[r1] = r5     // Catch:{ all -> 0x0149 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0149 }
            java.lang.String r6 = "reason"
            r5[r1] = r6     // Catch:{ all -> 0x0149 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            java.lang.String r7 = "Loaded missing "
            r6.<init>(r7)     // Catch:{ all -> 0x0149 }
            r6.append(r0)     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0149 }
            r5[r3] = r0     // Catch:{ all -> 0x0149 }
            r4[r3] = r5     // Catch:{ all -> 0x0149 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0149 }
            java.lang.String r5 = "ext1"
            r0[r1] = r5     // Catch:{ all -> 0x0149 }
            r0[r3] = r12     // Catch:{ all -> 0x0149 }
            r4[r2] = r0     // Catch:{ all -> 0x0149 }
            java.util.Map r12 = com.ironsource.environment.C6363a.C63641.m19007a((java.lang.Object[][]) r4)     // Catch:{ all -> 0x0149 }
            r11.mo36316b((int) r13, (java.util.Map<java.lang.String, java.lang.Object>) r12)     // Catch:{ all -> 0x0149 }
        L_0x0144:
            r11.m19642b((boolean) r3)     // Catch:{ all -> 0x0149 }
        L_0x0147:
            monitor-exit(r11)
            return
        L_0x0149:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6502Z.mo36314a(com.ironsource.mediationsdk.ab, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo36315a(IronSourceError ironSourceError, C6526ab abVar) {
        C6729b bVar;
        synchronized (this) {
            if (this.f16698r && (bVar = this.f16694n.get(abVar.mo36388k())) != null) {
                mo36837a(bVar.mo36941a(this.f16701u));
            }
            m19644c(abVar, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
            m19643c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}));
            C6577ae.m20001a().mo36561a(ironSourceError, this.f17486c);
            this.f16706z = false;
            this.f16695o.put(abVar.mo36388k(), C6636j.C6637a.ISAuctionPerformanceFailedToShow);
            if (this.f16678B != C6506a.RV_STATE_READY_TO_SHOW) {
                m19642b(false);
            }
            this.f16697q.mo36607c();
        }
    }

    /* renamed from: a */
    public final synchronized void mo35985a(Placement placement) {
        if (placement == null) {
            m19645c("showRewardedVideo error: empty default placement");
            C6577ae.m20001a().mo36561a(new IronSourceError(1021, "showRewardedVideo error: empty default placement"), this.f17486c);
            m19634a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1021}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: empty default placement"}}), false, true);
            return;
        }
        this.f16701u = placement.getPlacementName();
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "showRewardedVideo(" + placement + ")", 0);
        m19639b((int) IronSourceConstants.RV_API_SHOW_CALLED);
        if (this.f16706z) {
            m19645c("showRewardedVideo error: can't show ad while an ad is already showing");
            C6577ae.m20001a().mo36561a(new IronSourceError(1022, "showRewardedVideo error: can't show ad while an ad is already showing"), this.f17486c);
            m19643c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1022}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: can't show ad while an ad is already showing"}}));
        } else if (this.f16678B != C6506a.RV_STATE_READY_TO_SHOW) {
            m19645c("showRewardedVideo error: show called while no ads are available");
            C6577ae.m20001a().mo36561a(new IronSourceError(1023, "showRewardedVideo error: show called while no ads are available"), this.f17486c);
            m19643c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1023}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: show called while no ads are available"}}));
        } else if (C6745k.m20452c(ContextProvider.getInstance().getApplicationContext(), this.f16701u)) {
            String str = "showRewardedVideo error: placement " + this.f16701u + " is capped";
            m19645c(str);
            C6577ae.m20001a().mo36561a(new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str), this.f17486c);
            m19643c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}}));
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<C6526ab> it = this.f16692l.iterator();
            while (it.hasNext()) {
                C6526ab next = it.next();
                if (next.mo36381c()) {
                    this.f16706z = true;
                    next.mo36378a(true, this.f16690j);
                    m19636a("showVideo()");
                    this.f16685e.mo36985a(next);
                    if (this.f16685e.mo36987b(next)) {
                        next.mo36382f();
                        IronSourceUtils.sendAutomationLog(next.mo36388k() + " rewarded video is now session capped");
                    }
                    C6745k.m20454e(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName());
                    if (C6745k.m20452c(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName())) {
                        m19639b((int) IronSourceConstants.RV_CAP_PLACEMENT);
                    }
                    this.f16683G.mo35977a();
                    next.mo36376a(placement, this.f16690j);
                    mo36311a(C6506a.RV_STATE_NOT_LOADED);
                    return;
                }
                if (next.mo36392o() != null) {
                    stringBuffer.append(next.mo36388k() + CertificateUtil.DELIMITER + next.mo36392o() + ",");
                }
                next.mo36378a(false, this.f16690j);
            }
            m19636a("showRewardedVideo(): No ads to show");
            C6577ae.m20001a().mo36561a(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT), this.f17486c);
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW));
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo(): No ads to show");
            if (stringBuffer.length() != 0) {
                hashMap.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
            }
            m19643c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, (Map<String, Object>) hashMap);
            this.f16697q.mo36607c();
        }
    }

    /* renamed from: a */
    public final void mo36169a(List<C6729b> list, String str, C6729b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        m19636a("makeAuction(): success");
        this.f16688h = str;
        this.f16696p = bVar;
        this.f16689i = jSONObject;
        this.f16679C = i;
        this.f16680D = "";
        if (!TextUtils.isEmpty(str2)) {
            mo36316b((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}));
        }
        mo36840a(jSONObject2, IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.f17484a.mo36958a(IronSource.AD_UNIT.REWARDED_VIDEO)) {
            mo36316b((int) IronSourceConstants.RV_AD_UNIT_CAPPED, C6363a.C63641.m19007a(new Object[][]{new Object[]{"auctionId", str}}));
            mo36323g();
            return;
        }
        mo36316b((int) IronSourceConstants.RV_AUCTION_SUCCESS, C6363a.C63641.m19007a(new Object[][]{new Object[]{"duration", Long.valueOf(j)}}));
        m19637a(list);
        if (!this.f16700t || !this.f16706z) {
            mo36322f();
        }
    }

    /* renamed from: a */
    public final void mo35903a(boolean z) {
        if (this.f16681E) {
            boolean z2 = false;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z, 0);
            Boolean bool = this.f16677A;
            if (bool != null && ((z && !bool.booleanValue() && mo35986c()) || (!z && this.f16677A.booleanValue()))) {
                z2 = true;
            }
            if (z2) {
                m19642b(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36316b(int i, Map<String, Object> map) {
        m19634a(i, map, false, true);
    }

    /* renamed from: b */
    public final void mo36317b(C6526ab abVar) {
        synchronized (this) {
            abVar.mo36375a((int) IronSourceConstants.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "otherRVAvailable = false"}});
            m19644c(abVar, "onRewardedVideoAdClosed, mediation state: " + this.f16678B.name());
            C6577ae.m20001a().mo36565b(this.f17486c);
            this.f16706z = false;
            if (this.f16678B != C6506a.RV_STATE_READY_TO_SHOW) {
                m19642b(false);
            }
            if (!this.f16699s) {
                this.f16697q.mo36606b();
            } else if (this.f16693m != null && this.f16693m.size() > 0) {
                new Timer().schedule(new TimerTask() {
                    public final void run() {
                        C6502Z.this.mo36322f();
                    }
                }, this.f16702v);
            }
        }
    }

    /* renamed from: b */
    public final void mo36318b(C6526ab abVar, Placement placement) {
        m19644c(abVar, "onRewardedVideoAdClicked");
        C6577ae.m20001a().mo36566b(placement, this.f17486c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015b, code lost:
        r9 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0163, code lost:
        if (r9.hasNext() == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0165, code lost:
        m19647e((com.ironsource.mediationsdk.C6526ab) r9.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016f, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0135  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36319b(com.ironsource.mediationsdk.C6526ab r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "onLoadError state="
            r1.<init>(r2)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.Z$a r2 = r8.f16678B     // Catch:{ all -> 0x0170 }
            r1.append(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0170 }
            m19644c((com.ironsource.mediationsdk.C6526ab) r9, (java.lang.String) r1)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r8.f16688h     // Catch:{ all -> 0x0170 }
            boolean r1 = r10.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0170 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0072
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = "onLoadError was invoked with auctionId:"
            r0.<init>(r1)     // Catch:{ all -> 0x0170 }
            r0.append(r10)     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = " and the current id is "
            r0.append(r10)     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = r8.f16688h     // Catch:{ all -> 0x0170 }
            r0.append(r10)     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x0170 }
            m19636a((java.lang.String) r10)     // Catch:{ all -> 0x0170 }
            r10 = 81315(0x13da3, float:1.13947E-40)
            r0 = 2
            java.lang.Object[][] r1 = new java.lang.Object[r0][]     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0170 }
            java.lang.String r5 = "errorCode"
            r4[r3] = r5     // Catch:{ all -> 0x0170 }
            r5 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0170 }
            r4[r2] = r5     // Catch:{ all -> 0x0170 }
            r1[r3] = r4     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0170 }
            java.lang.String r4 = "reason"
            r0[r3] = r4     // Catch:{ all -> 0x0170 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r4 = "loadError wrong auction ID "
            r3.<init>(r4)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.Z$a r4 = r8.f16678B     // Catch:{ all -> 0x0170 }
            r3.append(r4)     // Catch:{ all -> 0x0170 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0170 }
            r0[r2] = r3     // Catch:{ all -> 0x0170 }
            r1[r2] = r0     // Catch:{ all -> 0x0170 }
            r9.mo36380b(r10, r1)     // Catch:{ all -> 0x0170 }
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            return
        L_0x0072:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r10 = r8.f16695o     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r9.mo36388k()     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.j$a r4 = com.ironsource.mediationsdk.C6636j.C6637a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x0170 }
            r10.put(r1, r4)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.Z$a r10 = r8.f16678B     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.Z$a r1 = com.ironsource.mediationsdk.C6502Z.C6506a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0170 }
            if (r10 == r1) goto L_0x008b
            com.ironsource.mediationsdk.Z$a r10 = r8.f16678B     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.Z$a r1 = com.ironsource.mediationsdk.C6502Z.C6506a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0170 }
            if (r10 == r1) goto L_0x008b
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            return
        L_0x008b:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.ab> r10 = r8.f16692l     // Catch:{ all -> 0x0170 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0170 }
            r1 = r3
            r4 = r1
        L_0x0093:
            boolean r5 = r10.hasNext()     // Catch:{ all -> 0x0170 }
            if (r5 == 0) goto L_0x013e
            java.lang.Object r5 = r10.next()     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.ab r5 = (com.ironsource.mediationsdk.C6526ab) r5     // Catch:{ all -> 0x0170 }
            boolean r6 = r5.f16848e     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x0120
            boolean r6 = r8.f16705y     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x00f8
            boolean r6 = r5.mo36385h()     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x00f8
            if (r1 != 0) goto L_0x00d0
            if (r4 == 0) goto L_0x00b2
            goto L_0x00d0
        L_0x00b2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "Advanced Loading: Starting to load bidder "
            r6.<init>(r7)     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = r5.mo36388k()     // Catch:{ all -> 0x0170 }
            r6.append(r7)     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = ". No other instances will be loaded at the same time."
            r6.append(r7)     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0170 }
            m19636a((java.lang.String) r6)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r6)     // Catch:{ all -> 0x0170 }
            goto L_0x00f8
        L_0x00d0:
            if (r1 == 0) goto L_0x00d5
            java.lang.String r9 = "a non bidder is being loaded"
            goto L_0x00d7
        L_0x00d5:
            java.lang.String r9 = "a non bidder was already loaded successfully"
        L_0x00d7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "Advanced Loading: Won't start loading bidder "
            r10.<init>(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r5.mo36388k()     // Catch:{ all -> 0x0170 }
            r10.append(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = " as "
            r10.append(r2)     // Catch:{ all -> 0x0170 }
            r10.append(r9)     // Catch:{ all -> 0x0170 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x0170 }
            m19636a((java.lang.String) r9)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9)     // Catch:{ all -> 0x0170 }
            goto L_0x013e
        L_0x00f8:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r6 = r8.f16694n     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = r5.mo36388k()     // Catch:{ all -> 0x0170 }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x0093
            r0.add(r5)     // Catch:{ all -> 0x0170 }
            boolean r6 = r8.f16705y     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x013e
            boolean r6 = r9.mo36385h()     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x013e
            boolean r5 = r5.mo36385h()     // Catch:{ all -> 0x0170 }
            if (r5 != 0) goto L_0x013e
            int r5 = r0.size()     // Catch:{ all -> 0x0170 }
            int r6 = r8.f16704x     // Catch:{ all -> 0x0170 }
            if (r5 >= r6) goto L_0x013e
            goto L_0x0132
        L_0x0120:
            com.ironsource.mediationsdk.ab$a r6 = r5.f16819a     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.ab$a r7 = com.ironsource.mediationsdk.C6526ab.C6528a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0170 }
            if (r6 == r7) goto L_0x012f
            com.ironsource.mediationsdk.ab$a r6 = r5.f16819a     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.ab$a r7 = com.ironsource.mediationsdk.C6526ab.C6528a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x0170 }
            if (r6 != r7) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r6 = r3
            goto L_0x0130
        L_0x012f:
            r6 = r2
        L_0x0130:
            if (r6 == 0) goto L_0x0135
        L_0x0132:
            r1 = r2
            goto L_0x0093
        L_0x0135:
            boolean r5 = r5.mo36381c()     // Catch:{ all -> 0x0170 }
            if (r5 == 0) goto L_0x0093
            r4 = r2
            goto L_0x0093
        L_0x013e:
            int r9 = r0.size()     // Catch:{ all -> 0x0170 }
            if (r9 != 0) goto L_0x015a
            if (r4 != 0) goto L_0x015a
            if (r1 != 0) goto L_0x015a
            java.lang.String r9 = "onLoadError(): No other available smashes"
            m19636a((java.lang.String) r9)     // Catch:{ all -> 0x0170 }
            r8.m19642b((boolean) r3)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.Z$a r9 = com.ironsource.mediationsdk.C6502Z.C6506a.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x0170 }
            r8.mo36311a((com.ironsource.mediationsdk.C6502Z.C6506a) r9)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.ah r9 = r8.f16697q     // Catch:{ all -> 0x0170 }
            r9.mo36608d()     // Catch:{ all -> 0x0170 }
        L_0x015a:
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            java.util.Iterator r9 = r0.iterator()
        L_0x015f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x016f
            java.lang.Object r10 = r9.next()
            com.ironsource.mediationsdk.ab r10 = (com.ironsource.mediationsdk.C6526ab) r10
            r8.m19647e(r10)
            goto L_0x015f
        L_0x016f:
            return
        L_0x0170:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6502Z.mo36319b(com.ironsource.mediationsdk.ab, java.lang.String):void");
    }

    /* renamed from: c */
    public final void mo36320c(C6526ab abVar) {
        m19644c(abVar, "onRewardedVideoAdStarted");
        C6577ae.m20001a().mo36564b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo35986c() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f16681E     // Catch:{ all -> 0x0040 }
            r1 = 0
            if (r0 == 0) goto L_0x0016
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0040 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x0040 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0016
            monitor-exit(r3)
            return r1
        L_0x0016:
            com.ironsource.mediationsdk.Z$a r0 = r3.f16678B     // Catch:{ all -> 0x0040 }
            com.ironsource.mediationsdk.Z$a r2 = com.ironsource.mediationsdk.C6502Z.C6506a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0040 }
            if (r0 != r2) goto L_0x003e
            boolean r0 = r3.f16706z     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0021
            goto L_0x003e
        L_0x0021:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.ab> r0 = r3.f16692l     // Catch:{ all -> 0x0040 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0040 }
        L_0x0027:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0040 }
            com.ironsource.mediationsdk.ab r2 = (com.ironsource.mediationsdk.C6526ab) r2     // Catch:{ all -> 0x0040 }
            boolean r2 = r2.mo36381c()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x0027
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x003c:
            monitor-exit(r3)
            return r1
        L_0x003e:
            monitor-exit(r3)
            return r1
        L_0x0040:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6502Z.mo35986c():boolean");
    }

    /* renamed from: c_ */
    public final void mo36174c_() {
        mo36311a(C6506a.RV_STATE_NOT_LOADED);
        m19638a(false, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        m19635a(0);
    }

    /* renamed from: d */
    public final void mo36321d(C6526ab abVar) {
        m19644c(abVar, "onRewardedVideoAdEnded");
        C6577ae.m20001a().mo36567c();
    }

    /* renamed from: e */
    public final synchronized void mo36176e() {
        m19636a("onLoadTriggered: RV load was triggered in " + this.f16678B + " state");
        m19635a(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo36322f() {
        m19641b(this.f16693m);
        m19650j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo36323g() {
        mo36311a(C6506a.RV_STATE_NOT_LOADED);
        m19642b(false);
        this.f16697q.mo36608d();
    }
}
