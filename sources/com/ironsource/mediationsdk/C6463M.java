package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.C6363a;
import com.ironsource.environment.C6397j;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.C6467N;
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
import com.ironsource.mediationsdk.utils.C6751n;
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

/* renamed from: com.ironsource.mediationsdk.M */
final class C6463M extends C6692s implements C6397j, C6424D, C6470O, C6604ai, C6619c, C6629g {

    /* renamed from: A */
    private long f16441A;

    /* renamed from: B */
    private Boolean f16442B;

    /* renamed from: C */
    private C6421B f16443C;

    /* renamed from: d */
    C6471P f16444d;

    /* renamed from: e */
    C6636j f16445e;

    /* renamed from: f */
    C6630h f16446f;

    /* renamed from: g */
    long f16447g;

    /* renamed from: h */
    final ConcurrentHashMap<String, C6467N> f16448h;

    /* renamed from: i */
    C6751n f16449i;

    /* renamed from: j */
    int f16450j = 1;

    /* renamed from: k */
    C6466a f16451k;

    /* renamed from: l */
    final Object f16452l = new Object();

    /* renamed from: m */
    private ConcurrentHashMap<String, C6729b> f16453m;

    /* renamed from: n */
    private ConcurrentHashMap<String, C6636j.C6637a> f16454n;

    /* renamed from: o */
    private C6729b f16455o;

    /* renamed from: p */
    private JSONObject f16456p;

    /* renamed from: q */
    private C6600ah f16457q;

    /* renamed from: r */
    private boolean f16458r;

    /* renamed from: s */
    private String f16459s = "";

    /* renamed from: t */
    private int f16460t;

    /* renamed from: u */
    private NetworkStateReceiver f16461u;

    /* renamed from: v */
    private boolean f16462v = false;

    /* renamed from: w */
    private String f16463w;

    /* renamed from: x */
    private int f16464x;

    /* renamed from: y */
    private boolean f16465y;

    /* renamed from: z */
    private boolean f16466z;

    /* renamed from: com.ironsource.mediationsdk.M$a */
    enum C6466a {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6463M(List<NetworkSettings> list, C6666p pVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        C6666p pVar2 = pVar;
        long time = new Date().getTime();
        mo36162a((int) IronSourceConstants.RV_MANAGER_INIT_STARTED);
        mo36165a(C6466a.RV_STATE_INITIATING);
        this.f16442B = null;
        this.f16464x = pVar2.f17401c;
        this.f16465y = pVar2.f17402d;
        this.f16463w = "";
        this.f16456p = null;
        C6736c cVar = pVar2.f17410l;
        this.f16466z = false;
        this.f16444d = new C6471P(pVar2.f17410l.f17583p, pVar2.f17410l.f17575h);
        this.f16453m = new ConcurrentHashMap<>();
        this.f16454n = new ConcurrentHashMap<>();
        this.f16441A = new Date().getTime();
        boolean z = cVar.f17573f > 0;
        this.f16458r = z;
        if (z) {
            this.f16446f = new C6630h("rewardedVideo", cVar, this);
        }
        this.f16457q = new C6600ah(cVar, this);
        this.f16448h = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a = C6622d.m20139a().mo36647a(next, next.getRewardedVideoSettings(), false, false);
            if (a != null) {
                C6467N n = r0;
                C6467N n2 = new C6467N(str, str2, next, this, pVar2.f17403e, a, this.f16450j);
                String k = n.mo36388k();
                this.f16448h.put(k, n);
                arrayList.add(k);
            }
        }
        this.f16445e = new C6636j(arrayList, cVar.f17574g);
        this.f16449i = new C6751n(new ArrayList(this.f16448h.values()));
        mo36164a((int) IronSourceConstants.RV_MANAGER_INIT_ENDED, C6363a.C63641.m19007a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}}));
        this.f16443C = new C6421B(pVar2.f17407i, this);
        m19400a(cVar.f17577j);
    }

    /* renamed from: a */
    private String m19398a(C6729b bVar) {
        C6467N n = this.f16448h.get(bVar.mo36942a());
        String num = n != null ? Integer.toString(n.mo36386i()) : TextUtils.isEmpty(bVar.mo36943b()) ? "1" : "2";
        return num + bVar.mo36942a();
    }

    /* renamed from: a */
    private void m19399a(int i, Map<String, Object> map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z2 && !TextUtils.isEmpty(this.f16444d.f16500b)) {
            hashMap.put("auctionId", this.f16444d.f16500b);
        }
        JSONObject jSONObject = this.f16456p;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16456p);
        }
        if (z && !TextUtils.isEmpty(this.f16463w)) {
            hashMap.put("placement", this.f16463w);
        }
        if (m19406b(i)) {
            C6522h.m19751d();
            C6522h.m19689a((Map<String, Object>) hashMap, this.f16460t, this.f16459s);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f16450j));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    hashMap.putAll(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C6522h.m19751d().mo36349b(new C6517c(i, new JSONObject(hashMap)));
    }

    /* renamed from: a */
    private void m19400a(long j) {
        if (this.f16449i.mo36986a()) {
            m19402a("all smashes are capped");
            mo36170b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            mo36178f();
            return;
        }
        mo36835a(IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.f16458r) {
            if (!this.f16454n.isEmpty()) {
                this.f16445e.mo36687a(this.f16454n);
                this.f16454n.clear();
            }
            new Timer().schedule(new TimerTask() {
                public final void run() {
                    C6463M m = C6463M.this;
                    synchronized (m.f16452l) {
                        if (m.f16451k != C6466a.RV_STATE_AUCTION_IN_PROGRESS) {
                            m.mo36165a(C6466a.RV_STATE_AUCTION_IN_PROGRESS);
                            AsyncTask.execute(new Runnable() {
                                public final void run() {
                                    StringBuilder sb;
                                    C6463M.m19402a("makeAuction()");
                                    C6463M.this.f16447g = new Date().getTime();
                                    HashMap hashMap = new HashMap();
                                    ArrayList arrayList = new ArrayList();
                                    StringBuilder sb2 = new StringBuilder();
                                    for (C6467N next : C6463M.this.f16448h.values()) {
                                        if (!C6463M.this.f16449i.mo36987b(next) && C6463M.this.f16444d.mo36212b(next)) {
                                            if (next.mo36385h()) {
                                                Map<String, Object> a = next.mo36182a();
                                                if (a != null) {
                                                    hashMap.put(next.mo36388k(), a);
                                                    sb = new StringBuilder();
                                                } else {
                                                    next.mo36187b(IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Missing bidding data"}});
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
                                        C6463M.this.mo36170b((int) IronSourceConstants.RV_AUCTION_FAILED, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}));
                                        C6463M.m19402a("makeAuction() failed - No candidates available for auctioning");
                                        C6463M.this.mo36178f();
                                        return;
                                    }
                                    C6463M.m19402a("makeAuction() - request waterfall is: " + sb2);
                                    C6463M.this.mo36162a(1000);
                                    C6463M.this.mo36162a((int) IronSourceConstants.RV_AUCTION_REQUEST);
                                    C6463M.this.mo36164a((int) IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
                                    C6463M.this.f16446f.mo36662a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, C6463M.this.f16445e, C6463M.this.f16450j, C6463M.this.f17485b);
                                }
                            });
                        }
                    }
                }
            }, j);
            return;
        }
        m19402a("auction fallback flow starting");
        m19410g();
        if (this.f16444d.mo36207a().isEmpty()) {
            m19402a("loadSmashes -  waterfall is empty");
            mo36170b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            mo36178f();
            return;
        }
        mo36162a(1000);
        m19413i();
    }

    /* renamed from: a */
    private static void m19401a(C6467N n, String str) {
        String str2 = n.mo36388k() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    /* renamed from: a */
    static void m19402a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 0);
    }

    /* renamed from: a */
    private void m19403a(List<C6729b> list, String str, JSONObject jSONObject) {
        this.f16453m.clear();
        this.f16454n.clear();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        StringBuilder sb = new StringBuilder();
        for (C6729b next : list) {
            sb.append(m19398a(next) + ",");
            C6467N n = this.f16448h.get(next.mo36942a());
            if (n != null) {
                AbstractAdapter a = C6622d.m20139a().mo36646a(n.f16847d.f17320a);
                if (a != null) {
                    C6467N n2 = new C6467N(n, this, a, this.f16450j, str, jSONObject, this.f16460t, this.f16459s);
                    n2.f16848e = true;
                    copyOnWriteArrayList.add(n2);
                    this.f16453m.put(n2.mo36388k(), next);
                    this.f16454n.put(next.mo36942a(), C6636j.C6637a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                m19402a("updateWaterfall() - could not find matching smash for auction response item " + next.mo36942a());
            }
        }
        this.f16444d.mo36210a((CopyOnWriteArrayList<C6467N>) copyOnWriteArrayList, str);
        if (this.f16444d.mo36211b()) {
            mo36170b((int) IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfalls hold too many with size=" + this.f16444d.f16499a.size()}}));
        }
        m19402a("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            m19402a("Updated waterfall is empty");
        }
        mo36170b((int) IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    /* renamed from: a */
    private void m19404a(boolean z, Map<String, Object> map) {
        synchronized (this.f16452l) {
            if (this.f16442B == null || this.f16442B.booleanValue() != z) {
                this.f16442B = Boolean.valueOf(z);
                long time = new Date().getTime() - this.f16441A;
                this.f16441A = new Date().getTime();
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("duration", Long.valueOf(time));
                mo36170b(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
                C6577ae.m20001a().mo36563a(z, this.f16444d.mo36206a(this.f16444d.f16500b));
            }
        }
    }

    /* renamed from: b */
    private static void m19405b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 3);
    }

    /* renamed from: b */
    private static boolean m19406b(int i) {
        return i == 1003 || i == 1302 || i == 1301 || i == 1303;
    }

    /* renamed from: c */
    private void m19407c(int i) {
        m19399a(i, (Map<String, Object>) null, true, true);
    }

    /* renamed from: c */
    private void m19408c(int i, Map<String, Object> map) {
        m19399a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map, true, true);
    }

    /* renamed from: c */
    private static void m19409c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    /* renamed from: g */
    private void m19410g() {
        List<C6729b> h = m19412h();
        m19403a(h, "fallback_" + System.currentTimeMillis(), this.f16456p);
    }

    /* renamed from: g */
    private void m19411g(C6467N n) {
        String b = this.f16453m.get(n.mo36388k()).mo36943b();
        n.mo36384b(b);
        n.mo36185a(b);
    }

    /* renamed from: h */
    private List<C6729b> m19412h() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C6467N next : this.f16448h.values()) {
            if (!next.mo36385h() && !this.f16449i.mo36987b(next) && this.f16444d.mo36212b(next)) {
                copyOnWriteArrayList.add(new C6729b(next.mo36388k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: i */
    private void m19413i() {
        if (this.f16444d.mo36207a().isEmpty()) {
            m19402a("loadSmashes -  waterfall is empty");
            mo36170b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            mo36178f();
            return;
        }
        mo36165a(C6466a.RV_STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.f16444d.mo36207a().size() && i < this.f16464x; i2++) {
            C6467N n = this.f16444d.mo36207a().get(i2);
            if (n.f16848e) {
                if (!this.f16465y || !n.mo36385h()) {
                    m19411g(n);
                    i++;
                } else if (i == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + n.mo36388k() + ". No other instances will be loaded at the same time.";
                    m19402a(str);
                    IronSourceUtils.sendAutomationLog(str);
                    m19411g(n);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + n.mo36388k() + " as a non bidder is being loaded";
                    m19402a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36162a(int i) {
        m19399a(i, (Map<String, Object>) null, false, false);
    }

    /* renamed from: a */
    public final void mo36163a(int i, String str, int i2, String str2, long j) {
        Map<String, Object> map;
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        m19402a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.f16460t = i2;
        this.f16459s = str2;
        this.f16456p = null;
        m19410g();
        if (TextUtils.isEmpty(str)) {
            map = C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            map = C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(j)}});
        }
        mo36170b((int) IronSourceConstants.RV_AUCTION_FAILED, map);
        m19413i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36164a(int i, Map<String, Object> map) {
        m19399a(i, map, false, false);
    }

    /* renamed from: a */
    public final void mo35984a(Context context, boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager Should Track Network State: " + z, 0);
        try {
            this.f16462v = z;
            if (z) {
                if (this.f16461u == null) {
                    this.f16461u = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f16461u, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f16461u != null) {
                context.getApplicationContext().unregisterReceiver(this.f16461u);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36165a(C6466a aVar) {
        m19402a("current state=" + this.f16451k + ", new state=" + aVar);
        this.f16451k = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x011e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36166a(com.ironsource.mediationsdk.C6467N r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f16452l
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "onLoadSuccess mState="
            r1.<init>(r2)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.M$a r2 = r12.f16451k     // Catch:{ all -> 0x0170 }
            r1.append(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0170 }
            m19401a((com.ironsource.mediationsdk.C6467N) r13, (java.lang.String) r1)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r13.f16476b     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.P r2 = r12.f16444d     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r2.f16500b     // Catch:{ all -> 0x0170 }
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 != r2) goto L_0x011f
            com.ironsource.mediationsdk.M$a r1 = r12.f16451k     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.M$a r2 = com.ironsource.mediationsdk.C6463M.C6466a.RV_STATE_AUCTION_IN_PROGRESS     // Catch:{ all -> 0x0170 }
            if (r1 != r2) goto L_0x0029
            goto L_0x011f
        L_0x0029:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r1 = r12.f16454n     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r13.mo36388k()     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.j$a r6 = com.ironsource.mediationsdk.C6636j.C6637a.ISAuctionPerformanceLoadedSuccessfully     // Catch:{ all -> 0x0170 }
            r1.put(r2, r6)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.M$a r1 = r12.f16451k     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.M$a r2 = com.ironsource.mediationsdk.C6463M.C6466a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0170 }
            if (r1 != r2) goto L_0x011d
            com.ironsource.mediationsdk.M$a r1 = com.ironsource.mediationsdk.C6463M.C6466a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0170 }
            r12.mo36165a((com.ironsource.mediationsdk.C6463M.C6466a) r1)     // Catch:{ all -> 0x0170 }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x0170 }
            r1.<init>()     // Catch:{ all -> 0x0170 }
            long r1 = r1.getTime()     // Catch:{ all -> 0x0170 }
            long r6 = r12.f16447g     // Catch:{ all -> 0x0170 }
            long r1 = r1 - r6
            r6 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r7 = new java.lang.Object[r5][]     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x0170 }
            java.lang.String r9 = "duration"
            r8[r3] = r9     // Catch:{ all -> 0x0170 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0170 }
            r8[r5] = r1     // Catch:{ all -> 0x0170 }
            r7[r3] = r8     // Catch:{ all -> 0x0170 }
            java.util.Map r1 = com.ironsource.environment.C6363a.C63641.m19007a((java.lang.Object[][]) r7)     // Catch:{ all -> 0x0170 }
            r12.mo36170b((int) r6, (java.util.Map<java.lang.String, java.lang.Object>) r1)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.B r1 = r12.f16443C     // Catch:{ all -> 0x0170 }
            r6 = 0
            r1.mo35978a(r6)     // Catch:{ all -> 0x0170 }
            boolean r1 = r12.f16458r     // Catch:{ all -> 0x0170 }
            if (r1 == 0) goto L_0x0119
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r1 = r12.f16453m     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r13.mo36388k()     // Catch:{ all -> 0x0170 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0170 }
            r11 = r1
            com.ironsource.mediationsdk.server.b r11 = (com.ironsource.mediationsdk.server.C6729b) r11     // Catch:{ all -> 0x0170 }
            if (r11 == 0) goto L_0x00ad
            com.ironsource.mediationsdk.P r1 = r12.f16444d     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.P r2 = r12.f16444d     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r2.f16500b     // Catch:{ all -> 0x0170 }
            java.lang.String r3 = ""
            com.ironsource.mediationsdk.impressionData.ImpressionData r3 = r11.mo36941a(r3)     // Catch:{ all -> 0x0170 }
            r1.mo36209a((java.lang.String) r2, (com.ironsource.mediationsdk.impressionData.ImpressionData) r3)     // Catch:{ all -> 0x0170 }
            int r1 = r13.mo36386i()     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.server.b r2 = r12.f16455o     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.C6630h.m20184a(r11, r1, r2)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.h r6 = r12.f16446f     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.P r1 = r12.f16444d     // Catch:{ all -> 0x0170 }
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.mo36207a()     // Catch:{ all -> 0x0170 }
            r7 = r1
            java.util.concurrent.CopyOnWriteArrayList r7 = (java.util.concurrent.CopyOnWriteArrayList) r7     // Catch:{ all -> 0x0170 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r8 = r12.f16453m     // Catch:{ all -> 0x0170 }
            int r9 = r13.mo36386i()     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.server.b r10 = r12.f16455o     // Catch:{ all -> 0x0170 }
            r6.mo36663a((java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.C6529ac>) r7, (java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.C6729b>) r8, (int) r9, (com.ironsource.mediationsdk.server.C6729b) r10, (com.ironsource.mediationsdk.server.C6729b) r11)     // Catch:{ all -> 0x0170 }
            goto L_0x0119
        L_0x00ad:
            java.lang.String r1 = r13.mo36388k()     // Catch:{ all -> 0x0170 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = "onLoadSuccess winner instance "
            r2.<init>(r6)     // Catch:{ all -> 0x0170 }
            r2.append(r1)     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = " missing from waterfall. auctionId: "
            r2.append(r6)     // Catch:{ all -> 0x0170 }
            java.lang.String r13 = r13.f16476b     // Catch:{ all -> 0x0170 }
            r2.append(r13)     // Catch:{ all -> 0x0170 }
            java.lang.String r13 = " and the current id is "
            r2.append(r13)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.P r13 = r12.f16444d     // Catch:{ all -> 0x0170 }
            java.lang.String r13 = r13.f16500b     // Catch:{ all -> 0x0170 }
            r2.append(r13)     // Catch:{ all -> 0x0170 }
            java.lang.String r13 = r2.toString()     // Catch:{ all -> 0x0170 }
            m19405b((java.lang.String) r13)     // Catch:{ all -> 0x0170 }
            r13 = 81317(0x13da5, float:1.1395E-40)
            r2 = 3
            java.lang.Object[][] r2 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "errorCode"
            r6[r3] = r7     // Catch:{ all -> 0x0170 }
            r7 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0170 }
            r6[r5] = r7     // Catch:{ all -> 0x0170 }
            r2[r3] = r6     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "reason"
            r6[r3] = r7     // Catch:{ all -> 0x0170 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r8 = "Loaded missing "
            r7.<init>(r8)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.M$a r8 = com.ironsource.mediationsdk.C6463M.C6466a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0170 }
            r7.append(r8)     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0170 }
            r6[r5] = r7     // Catch:{ all -> 0x0170 }
            r2[r5] = r6     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "ext1"
            r6[r3] = r7     // Catch:{ all -> 0x0170 }
            r6[r5] = r1     // Catch:{ all -> 0x0170 }
            r2[r4] = r6     // Catch:{ all -> 0x0170 }
            java.util.Map r1 = com.ironsource.environment.C6363a.C63641.m19007a((java.lang.Object[][]) r2)     // Catch:{ all -> 0x0170 }
            r12.mo36170b((int) r13, (java.util.Map<java.lang.String, java.lang.Object>) r1)     // Catch:{ all -> 0x0170 }
        L_0x0119:
            r13 = 0
            r12.m19404a((boolean) r5, (java.util.Map<java.lang.String, java.lang.Object>) r13)     // Catch:{ all -> 0x0170 }
        L_0x011d:
            monitor-exit(r0)     // Catch:{ all -> 0x0170 }
            return
        L_0x011f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "onLoadSuccess was invoked with auctionId: "
            r1.<init>(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r13.f16476b     // Catch:{ all -> 0x0170 }
            r1.append(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = " and the current id is "
            r1.append(r2)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.P r2 = r12.f16444d     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r2.f16500b     // Catch:{ all -> 0x0170 }
            r1.append(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0170 }
            m19402a((java.lang.String) r1)     // Catch:{ all -> 0x0170 }
            r1 = 81315(0x13da3, float:1.13947E-40)
            java.lang.Object[][] r2 = new java.lang.Object[r4][]     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "errorCode"
            r6[r3] = r7     // Catch:{ all -> 0x0170 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0170 }
            r6[r5] = r7     // Catch:{ all -> 0x0170 }
            r2[r3] = r6     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = "reason"
            r4[r3] = r6     // Catch:{ all -> 0x0170 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = "onLoadSuccess wrong auction ID "
            r3.<init>(r6)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.M$a r6 = r12.f16451k     // Catch:{ all -> 0x0170 }
            r3.append(r6)     // Catch:{ all -> 0x0170 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0170 }
            r4[r5] = r3     // Catch:{ all -> 0x0170 }
            r2[r5] = r4     // Catch:{ all -> 0x0170 }
            r13.mo36187b(r1, r2)     // Catch:{ all -> 0x0170 }
            monitor-exit(r0)     // Catch:{ all -> 0x0170 }
            return
        L_0x0170:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0170 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6463M.mo36166a(com.ironsource.mediationsdk.N):void");
    }

    /* renamed from: a */
    public final void mo36167a(C6467N n, Placement placement) {
        m19401a(n, "onRewardedVideoAdRewarded");
        C6577ae.m20001a().mo36562a(placement, this.f16444d.mo36206a(n.f16476b));
    }

    /* renamed from: a */
    public final void mo36168a(IronSourceError ironSourceError, C6467N n) {
        C6729b bVar;
        if (this.f16458r && (bVar = this.f16453m.get(n.mo36388k())) != null) {
            C6471P p = this.f16444d;
            p.mo36209a(p.f16500b, bVar.mo36941a(this.f16463w));
        }
        m19401a(n, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f16466z = false;
        m19408c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}));
        C6577ae.m20001a().mo36561a(ironSourceError, this.f16444d.mo36206a(n.f16476b));
        this.f16454n.put(n.mo36388k(), C6636j.C6637a.ISAuctionPerformanceFailedToShow);
        if (this.f16451k != C6466a.RV_STATE_READY_TO_SHOW) {
            m19404a(false, (Map<String, Object>) null);
        }
        this.f16457q.mo36607c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0206, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0208, code lost:
        m19402a("showVideo()");
        r10.f16449i.mo36985a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0218, code lost:
        if (r10.f16449i.mo36987b(r6) == false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x021a, code lost:
        r6.mo36189b_();
        com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r6.mo36388k() + " rewarded video is now session capped");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0235, code lost:
        com.ironsource.mediationsdk.utils.C6745k.m20454e(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), r11.getPlacementName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0254, code lost:
        if (com.ironsource.mediationsdk.utils.C6745k.m20452c(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), r11.getPlacementName()) == false) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0256, code lost:
        m19407c((int) com.ironsource.mediationsdk.utils.IronSourceConstants.RV_CAP_PLACEMENT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x025b, code lost:
        r10.f16443C.mo35977a();
        r6.mo36184a(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35985a(com.ironsource.mediationsdk.model.Placement r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f16452l
            monitor-enter(r0)
            r1 = 1113(0x459, float:1.56E-42)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r11 != 0) goto L_0x004a
            java.lang.String r11 = "showRewardedVideo error: empty default placement"
            m19409c((java.lang.String) r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0264 }
            r6 = 1021(0x3fd, float:1.431E-42)
            r5.<init>(r6, r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.ae r7 = com.ironsource.mediationsdk.C6577ae.m20001a()     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.P r8 = r10.f16444d     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.P r9 = r10.f16444d     // Catch:{ all -> 0x0264 }
            java.lang.String r9 = r9.f16500b     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r8 = r8.mo36206a((java.lang.String) r9)     // Catch:{ all -> 0x0264 }
            r7.mo36561a((com.ironsource.mediationsdk.logger.IronSourceError) r5, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r8)     // Catch:{ all -> 0x0264 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0264 }
            java.lang.String r8 = "errorCode"
            r7[r4] = r8     // Catch:{ all -> 0x0264 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0264 }
            r7[r3] = r6     // Catch:{ all -> 0x0264 }
            r5[r4] = r7     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0264 }
            java.lang.String r6 = "reason"
            r2[r4] = r6     // Catch:{ all -> 0x0264 }
            r2[r3] = r11     // Catch:{ all -> 0x0264 }
            r5[r3] = r2     // Catch:{ all -> 0x0264 }
            java.util.Map r11 = com.ironsource.environment.C6363a.C63641.m19007a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0264 }
            r10.m19399a(r1, r11, r4, r3)     // Catch:{ all -> 0x0264 }
            monitor-exit(r0)     // Catch:{ all -> 0x0264 }
            return
        L_0x004a:
            java.lang.String r5 = r11.getPlacementName()     // Catch:{ all -> 0x0264 }
            r10.f16463w = r5     // Catch:{ all -> 0x0264 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0264 }
            java.lang.String r6 = "showRewardedVideo("
            r5.<init>(r6)     // Catch:{ all -> 0x0264 }
            r5.append(r11)     // Catch:{ all -> 0x0264 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0264 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0264 }
            r6.log(r7, r5, r4)     // Catch:{ all -> 0x0264 }
            r5 = 1100(0x44c, float:1.541E-42)
            r10.m19407c((int) r5)     // Catch:{ all -> 0x0264 }
            boolean r5 = r10.f16466z     // Catch:{ all -> 0x0264 }
            if (r5 == 0) goto L_0x00b5
            java.lang.String r11 = "showRewardedVideo error: can't show ad while an ad is already showing"
            m19409c((java.lang.String) r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0264 }
            r6 = 1022(0x3fe, float:1.432E-42)
            r5.<init>(r6, r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.ae r7 = com.ironsource.mediationsdk.C6577ae.m20001a()     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.P r8 = r10.f16444d     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.P r9 = r10.f16444d     // Catch:{ all -> 0x0264 }
            java.lang.String r9 = r9.f16500b     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r8 = r8.mo36206a((java.lang.String) r9)     // Catch:{ all -> 0x0264 }
            r7.mo36561a((com.ironsource.mediationsdk.logger.IronSourceError) r5, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r8)     // Catch:{ all -> 0x0264 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0264 }
            java.lang.String r8 = "errorCode"
            r7[r4] = r8     // Catch:{ all -> 0x0264 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0264 }
            r7[r3] = r6     // Catch:{ all -> 0x0264 }
            r5[r4] = r7     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0264 }
            java.lang.String r6 = "reason"
            r2[r4] = r6     // Catch:{ all -> 0x0264 }
            r2[r3] = r11     // Catch:{ all -> 0x0264 }
            r5[r3] = r2     // Catch:{ all -> 0x0264 }
            java.util.Map r11 = com.ironsource.environment.C6363a.C63641.m19007a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0264 }
            r10.m19408c(r1, r11)     // Catch:{ all -> 0x0264 }
            monitor-exit(r0)     // Catch:{ all -> 0x0264 }
            return
        L_0x00b5:
            com.ironsource.mediationsdk.M$a r5 = r10.f16451k     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.M$a r6 = com.ironsource.mediationsdk.C6463M.C6466a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0264 }
            if (r5 == r6) goto L_0x00fb
            java.lang.String r11 = "showRewardedVideo error: show called while no ads are available"
            m19409c((java.lang.String) r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0264 }
            r6 = 1023(0x3ff, float:1.434E-42)
            r5.<init>(r6, r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.ae r7 = com.ironsource.mediationsdk.C6577ae.m20001a()     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.P r8 = r10.f16444d     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.P r9 = r10.f16444d     // Catch:{ all -> 0x0264 }
            java.lang.String r9 = r9.f16500b     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r8 = r8.mo36206a((java.lang.String) r9)     // Catch:{ all -> 0x0264 }
            r7.mo36561a((com.ironsource.mediationsdk.logger.IronSourceError) r5, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r8)     // Catch:{ all -> 0x0264 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0264 }
            java.lang.String r8 = "errorCode"
            r7[r4] = r8     // Catch:{ all -> 0x0264 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0264 }
            r7[r3] = r6     // Catch:{ all -> 0x0264 }
            r5[r4] = r7     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0264 }
            java.lang.String r6 = "reason"
            r2[r4] = r6     // Catch:{ all -> 0x0264 }
            r2[r3] = r11     // Catch:{ all -> 0x0264 }
            r5[r3] = r2     // Catch:{ all -> 0x0264 }
            java.util.Map r11 = com.ironsource.environment.C6363a.C63641.m19007a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0264 }
            r10.m19408c(r1, r11)     // Catch:{ all -> 0x0264 }
            monitor-exit(r0)     // Catch:{ all -> 0x0264 }
            return
        L_0x00fb:
            com.ironsource.environment.ContextProvider r5 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0264 }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x0264 }
            java.lang.String r6 = r10.f16463w     // Catch:{ all -> 0x0264 }
            boolean r5 = com.ironsource.mediationsdk.utils.C6745k.m20452c((android.content.Context) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0264 }
            if (r5 == 0) goto L_0x015e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0264 }
            java.lang.String r5 = "showRewardedVideo error: placement "
            r11.<init>(r5)     // Catch:{ all -> 0x0264 }
            java.lang.String r5 = r10.f16463w     // Catch:{ all -> 0x0264 }
            r11.append(r5)     // Catch:{ all -> 0x0264 }
            java.lang.String r5 = " is capped"
            r11.append(r5)     // Catch:{ all -> 0x0264 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0264 }
            m19409c((java.lang.String) r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0264 }
            r6 = 524(0x20c, float:7.34E-43)
            r5.<init>(r6, r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.ae r7 = com.ironsource.mediationsdk.C6577ae.m20001a()     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.P r8 = r10.f16444d     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.P r9 = r10.f16444d     // Catch:{ all -> 0x0264 }
            java.lang.String r9 = r9.f16500b     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r8 = r8.mo36206a((java.lang.String) r9)     // Catch:{ all -> 0x0264 }
            r7.mo36561a((com.ironsource.mediationsdk.logger.IronSourceError) r5, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r8)     // Catch:{ all -> 0x0264 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0264 }
            java.lang.String r8 = "errorCode"
            r7[r4] = r8     // Catch:{ all -> 0x0264 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0264 }
            r7[r3] = r6     // Catch:{ all -> 0x0264 }
            r5[r4] = r7     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0264 }
            java.lang.String r6 = "reason"
            r2[r4] = r6     // Catch:{ all -> 0x0264 }
            r2[r3] = r11     // Catch:{ all -> 0x0264 }
            r5[r3] = r2     // Catch:{ all -> 0x0264 }
            java.util.Map r11 = com.ironsource.environment.C6363a.C63641.m19007a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0264 }
            r10.m19408c(r1, r11)     // Catch:{ all -> 0x0264 }
            monitor-exit(r0)     // Catch:{ all -> 0x0264 }
            return
        L_0x015e:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ all -> 0x0264 }
            r2.<init>()     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.P r5 = r10.f16444d     // Catch:{ all -> 0x0264 }
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.mo36207a()     // Catch:{ all -> 0x0264 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0264 }
        L_0x016d:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0264 }
            if (r6 == 0) goto L_0x01b8
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.N r6 = (com.ironsource.mediationsdk.C6467N) r6     // Catch:{ all -> 0x0264 }
            boolean r7 = r6.mo36188b()     // Catch:{ all -> 0x0264 }
            if (r7 == 0) goto L_0x018a
            r10.f16466z = r3     // Catch:{ all -> 0x0264 }
            r6.mo36186a((boolean) r3)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.M$a r3 = com.ironsource.mediationsdk.C6463M.C6466a.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x0264 }
            r10.mo36165a((com.ironsource.mediationsdk.C6463M.C6466a) r3)     // Catch:{ all -> 0x0264 }
            goto L_0x01b9
        L_0x018a:
            java.lang.Long r7 = r6.mo36392o()     // Catch:{ all -> 0x0264 }
            if (r7 == 0) goto L_0x01b4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0264 }
            r7.<init>()     // Catch:{ all -> 0x0264 }
            java.lang.String r8 = r6.mo36388k()     // Catch:{ all -> 0x0264 }
            r7.append(r8)     // Catch:{ all -> 0x0264 }
            java.lang.String r8 = ":"
            r7.append(r8)     // Catch:{ all -> 0x0264 }
            java.lang.Long r8 = r6.mo36392o()     // Catch:{ all -> 0x0264 }
            r7.append(r8)     // Catch:{ all -> 0x0264 }
            java.lang.String r8 = ","
            r7.append(r8)     // Catch:{ all -> 0x0264 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0264 }
            r2.append(r7)     // Catch:{ all -> 0x0264 }
        L_0x01b4:
            r6.mo36186a((boolean) r4)     // Catch:{ all -> 0x0264 }
            goto L_0x016d
        L_0x01b8:
            r6 = 0
        L_0x01b9:
            if (r6 != 0) goto L_0x0205
            java.lang.String r11 = "showRewardedVideo(): No ads to show"
            m19402a((java.lang.String) r11)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.ae r3 = com.ironsource.mediationsdk.C6577ae.m20001a()     // Catch:{ all -> 0x0264 }
            java.lang.String r4 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r4 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r4)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.P r5 = r10.f16444d     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.P r6 = r10.f16444d     // Catch:{ all -> 0x0264 }
            java.lang.String r6 = r6.f16500b     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r5 = r5.mo36206a((java.lang.String) r6)     // Catch:{ all -> 0x0264 }
            r3.mo36561a((com.ironsource.mediationsdk.logger.IronSourceError) r4, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r5)     // Catch:{ all -> 0x0264 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0264 }
            r3.<init>()     // Catch:{ all -> 0x0264 }
            java.lang.String r4 = "errorCode"
            r5 = 509(0x1fd, float:7.13E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0264 }
            r3.put(r4, r5)     // Catch:{ all -> 0x0264 }
            java.lang.String r4 = "reason"
            r3.put(r4, r11)     // Catch:{ all -> 0x0264 }
            int r11 = r2.length()     // Catch:{ all -> 0x0264 }
            if (r11 == 0) goto L_0x01fb
            java.lang.String r11 = "ext1"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0264 }
            r3.put(r11, r2)     // Catch:{ all -> 0x0264 }
        L_0x01fb:
            r10.m19408c(r1, r3)     // Catch:{ all -> 0x0264 }
            com.ironsource.mediationsdk.ah r11 = r10.f16457q     // Catch:{ all -> 0x0264 }
            r11.mo36607c()     // Catch:{ all -> 0x0264 }
            monitor-exit(r0)     // Catch:{ all -> 0x0264 }
            return
        L_0x0205:
            monitor-exit(r0)     // Catch:{ all -> 0x0264 }
            if (r6 == 0) goto L_0x0263
            java.lang.String r0 = "showVideo()"
            m19402a((java.lang.String) r0)
            com.ironsource.mediationsdk.utils.n r0 = r10.f16449i
            r0.mo36985a(r6)
            com.ironsource.mediationsdk.utils.n r0 = r10.f16449i
            boolean r0 = r0.mo36987b(r6)
            if (r0 == 0) goto L_0x0235
            r6.mo36189b_()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.mo36388k()
            r0.append(r1)
            java.lang.String r1 = " rewarded video is now session capped"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)
        L_0x0235:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = r11.getPlacementName()
            com.ironsource.mediationsdk.utils.C6745k.m20454e(r0, r1)
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = r11.getPlacementName()
            boolean r0 = com.ironsource.mediationsdk.utils.C6745k.m20452c((android.content.Context) r0, (java.lang.String) r1)
            if (r0 == 0) goto L_0x025b
            r0 = 1400(0x578, float:1.962E-42)
            r10.m19407c((int) r0)
        L_0x025b:
            com.ironsource.mediationsdk.B r0 = r10.f16443C
            r0.mo35977a()
            r6.mo36184a((com.ironsource.mediationsdk.model.Placement) r11)
        L_0x0263:
            return
        L_0x0264:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0264 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6463M.mo35985a(com.ironsource.mediationsdk.model.Placement):void");
    }

    /* renamed from: a */
    public final void mo36169a(List<C6729b> list, String str, C6729b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        m19402a("makeAuction(): success");
        this.f16455o = bVar;
        this.f16460t = i;
        this.f16456p = jSONObject;
        this.f16459s = "";
        if (!TextUtils.isEmpty(str2)) {
            mo36170b((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}));
        }
        mo36840a(jSONObject2, IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.f17484a.mo36958a(IronSource.AD_UNIT.REWARDED_VIDEO)) {
            mo36170b((int) IronSourceConstants.RV_AD_UNIT_CAPPED, C6363a.C63641.m19007a(new Object[][]{new Object[]{"auctionId", str}}));
            mo36178f();
            return;
        }
        m19403a(list, str, this.f16456p);
        mo36170b((int) IronSourceConstants.RV_AUCTION_SUCCESS, C6363a.C63641.m19007a(new Object[][]{new Object[]{"duration", Long.valueOf(j)}}));
        m19413i();
    }

    /* renamed from: a */
    public final void mo35903a(boolean z) {
        if (this.f16462v) {
            boolean z2 = false;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z, 0);
            Boolean bool = this.f16442B;
            if (bool != null && ((z && !bool.booleanValue() && mo35986c()) || (!z && this.f16442B.booleanValue()))) {
                z2 = true;
            }
            if (z2) {
                m19404a(z, (Map<String, Object>) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36170b(int i, Map<String, Object> map) {
        m19399a(i, map, false, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011f, code lost:
        r11 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0127, code lost:
        if (r11.hasNext() == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0129, code lost:
        m19411g((com.ironsource.mediationsdk.C6467N) r11.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0133, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36171b(com.ironsource.mediationsdk.C6467N r11) {
        /*
            r10 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            java.lang.Object r1 = r10.f16452l
            monitor-enter(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = "onLoadError mState="
            r2.<init>(r3)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.M$a r3 = r10.f16451k     // Catch:{ all -> 0x0187 }
            r2.append(r3)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0187 }
            m19401a((com.ironsource.mediationsdk.C6467N) r11, (java.lang.String) r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r11.f16476b     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.P r3 = r10.f16444d     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = r3.f16500b     // Catch:{ all -> 0x0187 }
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L_0x0134
            com.ironsource.mediationsdk.M$a r2 = r10.f16451k     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.M$a r3 = com.ironsource.mediationsdk.C6463M.C6466a.RV_STATE_AUCTION_IN_PROGRESS     // Catch:{ all -> 0x0187 }
            if (r2 != r3) goto L_0x002d
            goto L_0x0134
        L_0x002d:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r2 = r10.f16454n     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = r11.mo36388k()     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.j$a r6 = com.ironsource.mediationsdk.C6636j.C6637a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x0187 }
            r2.put(r3, r6)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.M$a r2 = r10.f16451k     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.M$a r3 = com.ironsource.mediationsdk.C6463M.C6466a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0187 }
            if (r2 == r3) goto L_0x0046
            com.ironsource.mediationsdk.M$a r2 = r10.f16451k     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.M$a r3 = com.ironsource.mediationsdk.C6463M.C6466a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0187 }
            if (r2 == r3) goto L_0x0046
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            return
        L_0x0046:
            com.ironsource.mediationsdk.P r2 = r10.f16444d     // Catch:{ all -> 0x0187 }
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.mo36207a()     // Catch:{ all -> 0x0187 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0187 }
            r3 = r5
            r6 = r3
        L_0x0052:
            boolean r7 = r2.hasNext()     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x00fd
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.N r7 = (com.ironsource.mediationsdk.C6467N) r7     // Catch:{ all -> 0x0187 }
            boolean r8 = r7.f16848e     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00df
            boolean r8 = r10.f16465y     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00b7
            boolean r8 = r7.mo36385h()     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00b7
            if (r3 != 0) goto L_0x008f
            if (r6 == 0) goto L_0x0071
            goto L_0x008f
        L_0x0071:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = "Advanced Loading: Starting to load bidder "
            r8.<init>(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = r7.mo36388k()     // Catch:{ all -> 0x0187 }
            r8.append(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = ". No other instances will be loaded at the same time."
            r8.append(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0187 }
            m19402a((java.lang.String) r8)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r8)     // Catch:{ all -> 0x0187 }
            goto L_0x00b7
        L_0x008f:
            if (r3 == 0) goto L_0x0094
            java.lang.String r11 = "a non bidder is being loaded"
            goto L_0x0096
        L_0x0094:
            java.lang.String r11 = "a non bidder was already loaded successfully"
        L_0x0096:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = "Advanced Loading: Won't start loading bidder "
            r2.<init>(r4)     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = r7.mo36388k()     // Catch:{ all -> 0x0187 }
            r2.append(r4)     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = " as "
            r2.append(r4)     // Catch:{ all -> 0x0187 }
            r2.append(r11)     // Catch:{ all -> 0x0187 }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x0187 }
            m19402a((java.lang.String) r11)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r11)     // Catch:{ all -> 0x0187 }
            goto L_0x00fd
        L_0x00b7:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r8 = r10.f16453m     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = r7.mo36388k()     // Catch:{ all -> 0x0187 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x0052
            r0.add(r7)     // Catch:{ all -> 0x0187 }
            boolean r8 = r10.f16465y     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00fd
            boolean r8 = r11.mo36385h()     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00fd
            boolean r7 = r7.mo36385h()     // Catch:{ all -> 0x0187 }
            if (r7 != 0) goto L_0x00fd
            int r7 = r0.size()     // Catch:{ all -> 0x0187 }
            int r8 = r10.f16464x     // Catch:{ all -> 0x0187 }
            if (r7 >= r8) goto L_0x00fd
            goto L_0x00f1
        L_0x00df:
            com.ironsource.mediationsdk.N$a r8 = r7.f16475a     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.N$a r9 = com.ironsource.mediationsdk.C6467N.C6469a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0187 }
            if (r8 == r9) goto L_0x00ee
            com.ironsource.mediationsdk.N$a r8 = r7.f16475a     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.N$a r9 = com.ironsource.mediationsdk.C6467N.C6469a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x0187 }
            if (r8 != r9) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r8 = r5
            goto L_0x00ef
        L_0x00ee:
            r8 = r4
        L_0x00ef:
            if (r8 == 0) goto L_0x00f4
        L_0x00f1:
            r3 = r4
            goto L_0x0052
        L_0x00f4:
            boolean r7 = r7.mo36188b()     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x0052
            r6 = r4
            goto L_0x0052
        L_0x00fd:
            int r11 = r0.size()     // Catch:{ all -> 0x0187 }
            if (r11 != 0) goto L_0x011e
            if (r6 != 0) goto L_0x011e
            if (r3 != 0) goto L_0x011e
            java.lang.String r11 = "onLoadError(): No other available smashes"
            m19402a((java.lang.String) r11)     // Catch:{ all -> 0x0187 }
            boolean r11 = r10.f16466z     // Catch:{ all -> 0x0187 }
            if (r11 != 0) goto L_0x0114
            r11 = 0
            r10.m19404a((boolean) r5, (java.util.Map<java.lang.String, java.lang.Object>) r11)     // Catch:{ all -> 0x0187 }
        L_0x0114:
            com.ironsource.mediationsdk.M$a r11 = com.ironsource.mediationsdk.C6463M.C6466a.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x0187 }
            r10.mo36165a((com.ironsource.mediationsdk.C6463M.C6466a) r11)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.ah r11 = r10.f16457q     // Catch:{ all -> 0x0187 }
            r11.mo36608d()     // Catch:{ all -> 0x0187 }
        L_0x011e:
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            java.util.Iterator r11 = r0.iterator()
        L_0x0123:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r11.next()
            com.ironsource.mediationsdk.N r0 = (com.ironsource.mediationsdk.C6467N) r0
            r10.m19411g(r0)
            goto L_0x0123
        L_0x0133:
            return
        L_0x0134:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = "onLoadError was invoked with auctionId:"
            r0.<init>(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r11.f16476b     // Catch:{ all -> 0x0187 }
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = " and the current id is "
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.P r2 = r10.f16444d     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r2.f16500b     // Catch:{ all -> 0x0187 }
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0187 }
            m19402a((java.lang.String) r0)     // Catch:{ all -> 0x0187 }
            r0 = 81315(0x13da3, float:1.13947E-40)
            r2 = 2
            java.lang.Object[][] r3 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0187 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0187 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x0187 }
            r7 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0187 }
            r6[r4] = r7     // Catch:{ all -> 0x0187 }
            r3[r5] = r6     // Catch:{ all -> 0x0187 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0187 }
            java.lang.String r6 = "reason"
            r2[r5] = r6     // Catch:{ all -> 0x0187 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r6 = "loadError wrong auction ID "
            r5.<init>(r6)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.M$a r6 = r10.f16451k     // Catch:{ all -> 0x0187 }
            r5.append(r6)     // Catch:{ all -> 0x0187 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0187 }
            r2[r4] = r5     // Catch:{ all -> 0x0187 }
            r3[r4] = r2     // Catch:{ all -> 0x0187 }
            r11.mo36187b(r0, r3)     // Catch:{ all -> 0x0187 }
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            return
        L_0x0187:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6463M.mo36171b(com.ironsource.mediationsdk.N):void");
    }

    /* renamed from: b */
    public final void mo36172b(C6467N n, Placement placement) {
        m19401a(n, "onRewardedVideoAdClicked");
        C6577ae.m20001a().mo36566b(placement, this.f16444d.mo36206a(n.f16476b));
    }

    /* renamed from: c */
    public final void mo36173c(C6467N n) {
        this.f16444d.mo36208a(n);
        this.f16450j++;
        m19401a(n, "onRewardedVideoAdOpened");
        if (this.f16458r) {
            C6729b bVar = this.f16453m.get(n.mo36388k());
            if (bVar != null) {
                C6471P p = this.f16444d;
                p.mo36209a(p.f16500b, bVar.mo36941a(this.f16463w));
                C6630h.m20185a(bVar, n.mo36386i(), this.f16455o, this.f16463w);
                this.f16454n.put(n.mo36388k(), C6636j.C6637a.ISAuctionPerformanceShowedSuccessfully);
                mo36839a(bVar, this.f16463w);
            } else {
                String k = n.mo36388k();
                m19405b("onRewardedVideoAdOpened showing instance " + k + " missing from waterfall");
                mo36170b((int) IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f16451k}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}}));
            }
        }
        C6577ae.m20001a().mo36559a(this.f16444d.mo36206a(n.f16476b));
        m19404a(false, (Map<String, Object>) null);
        this.f16457q.mo36605a();
    }

    /* renamed from: c */
    public final boolean mo35986c() {
        if ((!this.f16462v || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.f16451k == C6466a.RV_STATE_READY_TO_SHOW && !this.f16466z) {
            Iterator<C6467N> it = this.f16444d.mo36207a().iterator();
            while (it.hasNext()) {
                if (it.next().mo36188b()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c_ */
    public final void mo36174c_() {
        mo36165a(C6466a.RV_STATE_NOT_LOADED);
        m19404a(false, C6363a.C63641.m19007a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        m19400a(0);
    }

    /* renamed from: d */
    public final void mo36175d(C6467N n) {
        String str;
        m19401a(n, "onRewardedVideoAdClosed, mediation state: " + this.f16451k.name());
        C6577ae.m20001a().mo36565b(this.f16444d.mo36206a(n.f16476b));
        this.f16466z = false;
        boolean z = this.f16451k == C6466a.RV_STATE_READY_TO_SHOW;
        StringBuilder sb = new StringBuilder();
        if (z) {
            Iterator<C6467N> it = this.f16444d.mo36207a().iterator();
            while (it.hasNext()) {
                C6467N next = it.next();
                if (next.f16475a == C6467N.C6469a.LOADED) {
                    sb.append(next.mo36388k() + ";");
                }
            }
        }
        Object[][] objArr = new Object[1][];
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
        objArr[0] = objArr2;
        n.mo36183a((int) IronSourceConstants.RV_INSTANCE_CLOSED, objArr);
        if (n.equals(this.f16444d.f16501c)) {
            this.f16444d.mo36208a((C6467N) null);
            if (this.f16451k != C6466a.RV_STATE_READY_TO_SHOW) {
                m19404a(false, (Map<String, Object>) null);
            }
        }
    }

    /* renamed from: e */
    public final void mo36176e() {
        m19402a("onLoadTriggered: RV load was triggered in " + this.f16451k + " state");
        m19400a(0);
    }

    /* renamed from: e */
    public final void mo36177e(C6467N n) {
        m19401a(n, "onRewardedVideoAdStarted");
        C6577ae.m20001a().mo36564b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo36178f() {
        mo36165a(C6466a.RV_STATE_NOT_LOADED);
        if (!this.f16466z) {
            m19404a(false, (Map<String, Object>) null);
        }
        this.f16457q.mo36608d();
    }

    /* renamed from: f */
    public final void mo36179f(C6467N n) {
        m19401a(n, "onRewardedVideoAdEnded");
        C6577ae.m20001a().mo36567c();
    }
}
