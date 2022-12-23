package com.ironsource.mediationsdk;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.p204e.C6387c;
import com.ironsource.mediationsdk.C6636j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6658i;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.mediationsdk.p206a.C6518d;
import com.ironsource.mediationsdk.server.C6729b;
import com.ironsource.mediationsdk.utils.C6736c;
import com.ironsource.mediationsdk.utils.C6751n;
import com.ironsource.mediationsdk.utils.C6753o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.W */
final class C6494W extends C6692s implements C6423C, C6498X, C6629g {

    /* renamed from: d */
    C6751n f16631d;

    /* renamed from: e */
    final ConcurrentHashMap<String, C6499Y> f16632e;

    /* renamed from: f */
    String f16633f;

    /* renamed from: g */
    JSONObject f16634g;

    /* renamed from: h */
    C6630h f16635h;

    /* renamed from: i */
    C6636j f16636i;

    /* renamed from: j */
    long f16637j;

    /* renamed from: k */
    long f16638k;

    /* renamed from: l */
    private C6497a f16639l;

    /* renamed from: m */
    private CopyOnWriteArrayList<C6499Y> f16640m;

    /* renamed from: n */
    private ConcurrentHashMap<String, C6729b> f16641n;

    /* renamed from: o */
    private ConcurrentHashMap<String, C6636j.C6637a> f16642o;

    /* renamed from: p */
    private C6729b f16643p;

    /* renamed from: q */
    private String f16644q;

    /* renamed from: r */
    private int f16645r;

    /* renamed from: s */
    private boolean f16646s;

    /* renamed from: t */
    private boolean f16647t;

    /* renamed from: u */
    private long f16648u;

    /* renamed from: v */
    private int f16649v;

    /* renamed from: w */
    private String f16650w = "";

    /* renamed from: x */
    private boolean f16651x = false;

    /* renamed from: com.ironsource.mediationsdk.W$a */
    enum C6497a {
        STATE_NOT_INITIALIZED,
        STATE_READY_TO_LOAD,
        STATE_AUCTION,
        STATE_LOADING_SMASHES,
        STATE_READY_TO_SHOW,
        STATE_SHOWING
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6494W(List<NetworkSettings> list, C6658i iVar, String str, String str2, int i, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        C6658i iVar2 = iVar;
        long time = new Date().getTime();
        m19566a((int) IronSourceConstants.IS_MANAGER_INIT_STARTED);
        mo36286a(C6497a.STATE_NOT_INITIALIZED);
        this.f16632e = new ConcurrentHashMap<>();
        this.f16640m = new CopyOnWriteArrayList<>();
        this.f16641n = new ConcurrentHashMap<>();
        this.f16642o = new ConcurrentHashMap<>();
        this.f16644q = "";
        this.f16633f = "";
        this.f16634g = null;
        this.f16645r = iVar2.f17359c;
        this.f16646s = iVar2.f17360d;
        C6732u.m20387a().mo36953a(IronSource.AD_UNIT.INTERSTITIAL, i);
        C6736c cVar = iVar2.f17365i;
        this.f16638k = cVar.f17577j;
        boolean z = cVar.f17573f > 0;
        this.f16647t = z;
        if (z) {
            this.f16635h = new C6630h("interstitial", cVar, this);
        }
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a = C6622d.m20139a().mo36647a(next, next.getInterstitialSettings(), false, false);
            if (a != null) {
                C6624e a2 = C6624e.m20158a();
                if (a2.mo36655a(a, a2.f17171a, "interstitial")) {
                    C6499Y y = r0;
                    C6499Y y2 = new C6499Y(str, str2, next, this, iVar2.f17361e, a);
                    String k = y.mo36388k();
                    this.f16632e.put(k, y);
                    arrayList.add(k);
                }
            }
        }
        this.f16636i = new C6636j(arrayList, cVar.f17574g);
        this.f16631d = new C6751n(new ArrayList(this.f16632e.values()));
        for (C6499Y next2 : this.f16632e.values()) {
            if (next2.mo36385h()) {
                next2.mo36304b();
            }
        }
        this.f16637j = new Date().getTime();
        mo36286a(C6497a.STATE_READY_TO_LOAD);
        m19570a((int) IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
    }

    /* renamed from: a */
    private String m19565a(C6729b bVar) {
        C6499Y y = this.f16632e.get(bVar.mo36942a());
        String num = y != null ? Integer.toString(y.mo36386i()) : TextUtils.isEmpty(bVar.mo36943b()) ? "1" : "2";
        return num + bVar.mo36942a();
    }

    /* renamed from: a */
    private void m19566a(int i) {
        m19571a(i, (Object[][]) null, false);
    }

    /* renamed from: a */
    private void m19567a(int i, C6499Y y) {
        m19569a(i, y, (Object[][]) null, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19568a(int i, C6499Y y, Object[][] objArr) {
        m19569a(i, y, objArr, false);
    }

    /* renamed from: a */
    private void m19569a(int i, C6499Y y, Object[][] objArr, boolean z) {
        Map<String, Object> n = y.mo36391n();
        if (!TextUtils.isEmpty(this.f16633f)) {
            n.put("auctionId", this.f16633f);
        }
        JSONObject jSONObject = this.f16634g;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16634g);
        }
        if (z && !TextUtils.isEmpty(this.f16644q)) {
            n.put("placement", this.f16644q);
        }
        if (m19582c(i)) {
            C6518d.m19731d();
            C6518d.m19689a(n, this.f16649v, this.f16650w);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C6518d.m19731d().mo36349b(new C6517c(i, new JSONObject(n)));
    }

    /* renamed from: a */
    private void m19570a(int i, Object[][] objArr) {
        m19571a(i, objArr, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19571a(int i, Object[][] objArr, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f16633f)) {
            hashMap.put("auctionId", this.f16633f);
        }
        JSONObject jSONObject = this.f16634g;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16634g);
        }
        if (z && !TextUtils.isEmpty(this.f16644q)) {
            hashMap.put("placement", this.f16644q);
        }
        if (m19582c(i)) {
            C6518d.m19731d();
            C6518d.m19689a((Map<String, Object>) hashMap, this.f16649v, this.f16650w);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                m19580b("sendMediationEvent " + e.getMessage());
            }
        }
        C6518d.m19731d().mo36349b(new C6517c(i, new JSONObject(hashMap)));
    }

    /* renamed from: a */
    private static void m19574a(C6499Y y, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsManager " + y.mo36388k() + " : " + str, 0);
    }

    /* renamed from: a */
    private void m19575a(List<C6729b> list) {
        this.f16640m.clear();
        this.f16641n.clear();
        this.f16642o.clear();
        StringBuilder sb = new StringBuilder();
        for (C6729b next : list) {
            sb.append(m19565a(next) + ",");
            C6499Y y = this.f16632e.get(next.mo36942a());
            if (y != null) {
                y.f16848e = true;
                this.f16640m.add(y);
                this.f16641n.put(y.mo36388k(), next);
                this.f16642o.put(next.mo36942a(), C6636j.C6637a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                m19580b("updateWaterfall() - could not find matching smash for auction response item " + next.mo36942a());
            }
        }
        m19580b("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            m19580b("Updated waterfall is empty");
        }
        m19570a((int) IronSourceConstants.IS_RESULT_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
    }

    /* renamed from: b */
    private void m19576b(int i) {
        m19571a(i, (Object[][]) null, true);
    }

    /* renamed from: b */
    private void m19577b(int i, C6499Y y) {
        m19569a(i, y, (Object[][]) null, true);
    }

    /* renamed from: b */
    private void m19578b(int i, C6499Y y, Object[][] objArr) {
        m19569a(i, y, objArr, true);
    }

    /* renamed from: b */
    private void m19579b(int i, Object[][] objArr) {
        m19571a((int) IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, objArr, true);
    }

    /* renamed from: b */
    static void m19580b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgIsManager " + str, 0);
    }

    /* renamed from: c */
    private static void m19581c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    /* renamed from: c */
    private static boolean m19582c(int i) {
        return i == 2002 || i == 2003 || i == 2200 || i == 2213 || i == 2005 || i == 2204 || i == 2201 || i == 2203 || i == 2006 || i == 2004 || i == 2110 || i == 2301 || i == 2300 || i == 2303;
    }

    /* renamed from: g */
    private void m19583g() {
        List<C6729b> h = m19585h();
        this.f16633f = m20309d();
        m19575a(h);
    }

    /* renamed from: g */
    private void m19584g(C6499Y y) {
        String b = this.f16641n.get(y.mo36388k()).mo36943b();
        y.mo36384b(b);
        m19567a(2002, y);
        y.mo36303a(b);
    }

    /* renamed from: h */
    private List<C6729b> m19585h() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C6499Y next : this.f16632e.values()) {
            if (!next.mo36385h() && !this.f16631d.mo36987b(next)) {
                copyOnWriteArrayList.add(new C6729b(next.mo36388k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: i */
    private void m19586i() {
        if (this.f16640m.isEmpty()) {
            mo36286a(C6497a.STATE_READY_TO_LOAD);
            m19571a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1035}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Empty waterfall"}}, false);
            C6732u.m20387a().mo36954a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(1035, "Empty waterfall"));
            return;
        }
        mo36286a(C6497a.STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.f16640m.size() && i < this.f16645r; i2++) {
            C6499Y y = this.f16640m.get(i2);
            if (y.f16848e) {
                if (!this.f16646s || !y.mo36385h()) {
                    m19584g(y);
                    i++;
                } else if (i == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + y.mo36388k() + ". No other instances will be loaded at the same time.";
                    m19580b(str);
                    IronSourceUtils.sendAutomationLog(str);
                    m19584g(y);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + y.mo36388k() + " as a non bidder is being loaded";
                    m19580b(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36285a() {
        mo36286a(C6497a.STATE_AUCTION);
        AsyncTask.execute(new Runnable() {
            public final void run() {
                StringBuilder sb;
                C6494W.this.f16633f = "";
                C6494W.this.f16634g = null;
                StringBuilder sb2 = new StringBuilder();
                long time = C6494W.this.f16638k - (new Date().getTime() - C6494W.this.f16637j);
                if (time > 0) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("delaying auction by " + time);
                    C6387c cVar = C6387c.f16171a;
                    C6387c.m19071b(new Runnable() {
                        public final void run() {
                            C6494W.this.mo36285a();
                        }
                    }, time);
                    return;
                }
                C6494W.this.m19571a(2000, (Object[][]) null, false);
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (C6499Y next : C6494W.this.f16632e.values()) {
                    if (!C6494W.this.f16631d.mo36987b(next)) {
                        if (next.mo36385h()) {
                            Map<String, Object> a = next.mo36182a();
                            if (a != null) {
                                hashMap.put(next.mo36388k(), a);
                                sb = new StringBuilder();
                            } else {
                                C6494W.this.m19568a((int) IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, next, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Missing bidding data"}});
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
                if (hashMap.size() == 0 && arrayList.size() == 0) {
                    C6494W.this.m19571a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}, false);
                    C6494W.m19580b("makeAuction() failed - No candidates available for auctioning");
                    C6732u.m20387a().mo36954a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(1005, "No candidates available for auctioning"));
                    C6494W.this.m19571a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}}, false);
                    C6494W.this.mo36286a(C6497a.STATE_READY_TO_LOAD);
                    return;
                }
                C6494W.this.m19571a((int) IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}, false);
                int b = C6753o.m20481a().mo36990b(2);
                if (C6494W.this.f16635h != null) {
                    C6494W.this.f16635h.mo36662a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, C6494W.this.f16636i, b, C6494W.this.f17485b);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo36163a(int i, String str, int i2, String str2, long j) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        m19580b(str3);
        IronSourceUtils.sendAutomationLog("IS: " + str3);
        this.f16649v = i2;
        this.f16650w = str2;
        this.f16634g = null;
        m19583g();
        if (TextUtils.isEmpty(str)) {
            m19570a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            m19570a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(j)}});
        }
        m19586i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36286a(C6497a aVar) {
        this.f16639l = aVar;
        m19580b("state=" + aVar);
    }

    /* renamed from: a */
    public final void mo36287a(C6499Y y) {
        synchronized (this) {
            m19574a(y, "onInterstitialAdOpened");
            m19577b(2005, y);
            if (this.f16647t) {
                C6729b bVar = this.f16641n.get(y.mo36388k());
                if (bVar != null) {
                    mo36837a(bVar.mo36941a(this.f16644q));
                    C6630h.m20185a(bVar, y.mo36386i(), this.f16643p, this.f16644q);
                    this.f16642o.put(y.mo36388k(), C6636j.C6637a.ISAuctionPerformanceShowedSuccessfully);
                    mo36839a(bVar, this.f16644q);
                } else {
                    String k = y.mo36388k();
                    m19580b("onInterstitialAdOpened showing instance " + k + " missing from waterfall");
                    Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1011};
                    m19570a((int) IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f16639l}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                }
            }
            C6432F.m19211a().mo36000b(this.f17486c);
        }
    }

    /* renamed from: a */
    public final void mo36288a(C6499Y y, long j) {
        C6499Y y2 = y;
        synchronized (this) {
            m19574a(y2, "onInterstitialAdReady");
            m19568a(2003, y2, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
            if (this.f16642o.containsKey(y.mo36388k())) {
                this.f16642o.put(y.mo36388k(), C6636j.C6637a.ISAuctionPerformanceLoadedSuccessfully);
            }
            if (this.f16639l == C6497a.STATE_LOADING_SMASHES) {
                mo36286a(C6497a.STATE_READY_TO_SHOW);
                m19570a(2004, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.f16648u)}});
                if (this.f16647t) {
                    C6729b bVar = this.f16641n.get(y.mo36388k());
                    if (bVar != null) {
                        mo36837a(bVar.mo36941a(""));
                        C6630h.m20184a(bVar, y.mo36386i(), this.f16643p);
                        this.f16635h.mo36663a((CopyOnWriteArrayList<C6529ac>) this.f16640m, this.f16641n, y.mo36386i(), this.f16643p, bVar);
                    } else {
                        String k = y.mo36388k();
                        m19580b("onInterstitialAdReady winner instance " + k + " missing from waterfall");
                        m19570a((int) IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                    }
                }
                C6432F.m19211a().mo35995a(this.f17486c);
            }
        }
    }

    /* renamed from: a */
    public final void mo36289a(IronSourceError ironSourceError, C6499Y y) {
        C6729b bVar;
        synchronized (this) {
            if (this.f16647t && (bVar = this.f16641n.get(y.mo36388k())) != null) {
                mo36837a(bVar.mo36941a(this.f16644q));
            }
            m19574a(y, "onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
            C6432F.m19211a().mo35997a(ironSourceError, this.f17486c);
            m19578b(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, y, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
            this.f16642o.put(y.mo36388k(), C6636j.C6637a.ISAuctionPerformanceFailedToShow);
            mo36286a(C6497a.STATE_READY_TO_LOAD);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f0, code lost:
        if (r11 == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f2, code lost:
        r9 = "a non bidder is being loaded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f5, code lost:
        r9 = "a non bidder was already loaded successfully";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f7, code lost:
        r9 = "Advanced Loading: Won't start loading bidder " + r1.mo36388k() + " as " + r9;
        m19580b(r9);
        com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0149  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36290a(com.ironsource.mediationsdk.logger.IronSourceError r9, com.ironsource.mediationsdk.C6499Y r10, long r11) {
        /*
            r8 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = "onInterstitialAdLoadFailed error="
            r1.<init>(r2)     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = r9.getErrorMessage()     // Catch:{ all -> 0x01b9 }
            r1.append(r2)     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = " state="
            r1.append(r2)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.W$a r2 = r8.f16639l     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = r2.name()     // Catch:{ all -> 0x01b9 }
            r1.append(r2)     // Catch:{ all -> 0x01b9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01b9 }
            m19574a((com.ironsource.mediationsdk.C6499Y) r10, (java.lang.String) r1)     // Catch:{ all -> 0x01b9 }
            int r1 = r9.getErrorCode()     // Catch:{ all -> 0x01b9 }
            r2 = 1158(0x486, float:1.623E-42)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 != r2) goto L_0x005c
            r1 = 2213(0x8a5, float:3.101E-42)
            java.lang.Object[][] r2 = new java.lang.Object[r3][]     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x01b9 }
            int r9 = r9.getErrorCode()     // Catch:{ all -> 0x01b9 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01b9 }
            r6[r5] = r9     // Catch:{ all -> 0x01b9 }
            r2[r4] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = "duration"
            r9[r4] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01b9 }
            r9[r5] = r11     // Catch:{ all -> 0x01b9 }
            r2[r5] = r9     // Catch:{ all -> 0x01b9 }
            r8.m19568a((int) r1, (com.ironsource.mediationsdk.C6499Y) r10, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x01b9 }
            goto L_0x0092
        L_0x005c:
            r1 = 2200(0x898, float:3.083E-42)
            r2 = 3
            java.lang.Object[][] r2 = new java.lang.Object[r2][]     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x01b9 }
            int r7 = r9.getErrorCode()     // Catch:{ all -> 0x01b9 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01b9 }
            r6[r5] = r7     // Catch:{ all -> 0x01b9 }
            r2[r4] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "reason"
            r6[r4] = r7     // Catch:{ all -> 0x01b9 }
            java.lang.String r9 = r9.getErrorMessage()     // Catch:{ all -> 0x01b9 }
            r6[r5] = r9     // Catch:{ all -> 0x01b9 }
            r2[r5] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = "duration"
            r9[r4] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01b9 }
            r9[r5] = r11     // Catch:{ all -> 0x01b9 }
            r2[r3] = r9     // Catch:{ all -> 0x01b9 }
            r8.m19568a((int) r1, (com.ironsource.mediationsdk.C6499Y) r10, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x01b9 }
        L_0x0092:
            if (r10 == 0) goto L_0x00ab
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r9 = r8.f16642o     // Catch:{ all -> 0x01b9 }
            java.lang.String r11 = r10.mo36388k()     // Catch:{ all -> 0x01b9 }
            boolean r9 = r9.containsKey(r11)     // Catch:{ all -> 0x01b9 }
            if (r9 == 0) goto L_0x00ab
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.j$a> r9 = r8.f16642o     // Catch:{ all -> 0x01b9 }
            java.lang.String r11 = r10.mo36388k()     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.j$a r12 = com.ironsource.mediationsdk.C6636j.C6637a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x01b9 }
            r9.put(r11, r12)     // Catch:{ all -> 0x01b9 }
        L_0x00ab:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.Y> r9 = r8.f16640m     // Catch:{ all -> 0x01b9 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x01b9 }
            r11 = r4
            r12 = r11
        L_0x00b3:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x01b9 }
            if (r1 == 0) goto L_0x0152
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.Y r1 = (com.ironsource.mediationsdk.C6499Y) r1     // Catch:{ all -> 0x01b9 }
            boolean r2 = r1.f16848e     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0134
            boolean r2 = r8.f16646s     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0118
            boolean r2 = r1.mo36385h()     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0118
            if (r11 != 0) goto L_0x00f0
            if (r12 == 0) goto L_0x00d2
            goto L_0x00f0
        L_0x00d2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = "Advanced Loading: Starting to load bidder "
            r2.<init>(r6)     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = r1.mo36388k()     // Catch:{ all -> 0x01b9 }
            r2.append(r6)     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = ". No other instances will be loaded at the same time."
            r2.append(r6)     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01b9 }
            m19580b((java.lang.String) r2)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r2)     // Catch:{ all -> 0x01b9 }
            goto L_0x0118
        L_0x00f0:
            if (r11 == 0) goto L_0x00f5
            java.lang.String r9 = "a non bidder is being loaded"
            goto L_0x00f7
        L_0x00f5:
            java.lang.String r9 = "a non bidder was already loaded successfully"
        L_0x00f7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = "Advanced Loading: Won't start loading bidder "
            r10.<init>(r12)     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = r1.mo36388k()     // Catch:{ all -> 0x01b9 }
            r10.append(r12)     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = " as "
            r10.append(r12)     // Catch:{ all -> 0x01b9 }
            r10.append(r9)     // Catch:{ all -> 0x01b9 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x01b9 }
            m19580b((java.lang.String) r9)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9)     // Catch:{ all -> 0x01b9 }
            goto L_0x0152
        L_0x0118:
            r0.add(r1)     // Catch:{ all -> 0x01b9 }
            boolean r2 = r8.f16646s     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0152
            boolean r2 = r10.mo36385h()     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0152
            boolean r1 = r1.mo36385h()     // Catch:{ all -> 0x01b9 }
            if (r1 != 0) goto L_0x0152
            int r1 = r0.size()     // Catch:{ all -> 0x01b9 }
            int r2 = r8.f16645r     // Catch:{ all -> 0x01b9 }
            if (r1 >= r2) goto L_0x0152
            goto L_0x0146
        L_0x0134:
            com.ironsource.mediationsdk.Y$a r2 = r1.f16661a     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.Y$a r6 = com.ironsource.mediationsdk.C6499Y.C6501a.INIT_IN_PROGRESS     // Catch:{ all -> 0x01b9 }
            if (r2 == r6) goto L_0x0143
            com.ironsource.mediationsdk.Y$a r2 = r1.f16661a     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.Y$a r6 = com.ironsource.mediationsdk.C6499Y.C6501a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x01b9 }
            if (r2 != r6) goto L_0x0141
            goto L_0x0143
        L_0x0141:
            r2 = r4
            goto L_0x0144
        L_0x0143:
            r2 = r5
        L_0x0144:
            if (r2 == 0) goto L_0x0149
        L_0x0146:
            r11 = r5
            goto L_0x00b3
        L_0x0149:
            boolean r1 = r1.mo36307g()     // Catch:{ all -> 0x01b9 }
            if (r1 == 0) goto L_0x00b3
            r12 = r5
            goto L_0x00b3
        L_0x0152:
            int r9 = r0.size()     // Catch:{ all -> 0x01b9 }
            if (r9 != 0) goto L_0x018c
            com.ironsource.mediationsdk.W$a r9 = r8.f16639l     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.W$a r10 = com.ironsource.mediationsdk.C6494W.C6497a.STATE_LOADING_SMASHES     // Catch:{ all -> 0x01b9 }
            if (r9 != r10) goto L_0x018c
            if (r11 != 0) goto L_0x018c
            com.ironsource.mediationsdk.u r9 = com.ironsource.mediationsdk.C6732u.m20387a()     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = "No ads to show"
            r1 = 509(0x1fd, float:7.13E-43)
            r11.<init>(r1, r12)     // Catch:{ all -> 0x01b9 }
            r9.mo36954a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r10, (com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x01b9 }
            r9 = 2110(0x83e, float:2.957E-42)
            java.lang.Object[][] r10 = new java.lang.Object[r5][]     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = "errorCode"
            r11[r4] = r12     // Catch:{ all -> 0x01b9 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01b9 }
            r11[r5] = r12     // Catch:{ all -> 0x01b9 }
            r10[r4] = r11     // Catch:{ all -> 0x01b9 }
            r8.m19570a((int) r9, (java.lang.Object[][]) r10)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.W$a r9 = com.ironsource.mediationsdk.C6494W.C6497a.STATE_READY_TO_LOAD     // Catch:{ all -> 0x01b9 }
            r8.mo36286a((com.ironsource.mediationsdk.C6494W.C6497a) r9)     // Catch:{ all -> 0x01b9 }
        L_0x018c:
            monitor-exit(r8)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.logger.IronLog r9 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "smashesToLoad.size() = "
            r10.<init>(r11)
            int r11 = r0.size()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.verbose(r10)
            java.util.Iterator r9 = r0.iterator()
        L_0x01a8:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01b8
            java.lang.Object r10 = r9.next()
            com.ironsource.mediationsdk.Y r10 = (com.ironsource.mediationsdk.C6499Y) r10
            r8.m19584g(r10)
            goto L_0x01a8
        L_0x01b8:
            return
        L_0x01b9:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01b9 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6494W.mo36290a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.Y, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0194, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36291a(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.W$a r0 = r9.f16639l     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.W$a r1 = com.ironsource.mediationsdk.C6494W.C6497a.STATE_SHOWING     // Catch:{ all -> 0x01e1 }
            r2 = 2111(0x83f, float:2.958E-42)
            r3 = 1
            r4 = 2
            r5 = 0
            if (r0 != r1) goto L_0x0040
            java.lang.String r10 = "showInterstitial error: can't show ad while an ad is already showing"
            m19581c((java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01e1 }
            r1 = 1036(0x40c, float:1.452E-42)
            r0.<init>(r1, r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.F r6 = com.ironsource.mediationsdk.C6432F.m19211a()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r7 = r9.f17486c     // Catch:{ all -> 0x01e1 }
            r6.mo35997a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01e1 }
            r6[r3] = r1     // Catch:{ all -> 0x01e1 }
            r0[r5] = r6     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01e1 }
            r1[r3] = r10     // Catch:{ all -> 0x01e1 }
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r9.m19571a((int) r2, (java.lang.Object[][]) r0, (boolean) r5)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)
            return
        L_0x0040:
            com.ironsource.mediationsdk.W$a r0 = r9.f16639l     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.W$a r1 = com.ironsource.mediationsdk.C6494W.C6497a.STATE_READY_TO_SHOW     // Catch:{ all -> 0x01e1 }
            r6 = 509(0x1fd, float:7.13E-43)
            if (r0 == r1) goto L_0x0091
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "showInterstitial() error state="
            r10.<init>(r0)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.W$a r0 = r9.f16639l     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e1 }
            r10.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01e1 }
            m19580b((java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            java.lang.String r10 = "showInterstitial error: show called while no ads are available"
            m19581c((java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01e1 }
            r0.<init>(r6, r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.F r1 = com.ironsource.mediationsdk.C6432F.m19211a()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r7 = r9.f17486c     // Catch:{ all -> 0x01e1 }
            r1.mo35997a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "errorCode"
            r1[r5] = r7     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01e1 }
            r1[r3] = r6     // Catch:{ all -> 0x01e1 }
            r0[r5] = r1     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01e1 }
            r1[r3] = r10     // Catch:{ all -> 0x01e1 }
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r9.m19570a((int) r2, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)
            return
        L_0x0091:
            if (r10 != 0) goto L_0x00c7
            java.lang.String r10 = "showInterstitial error: empty default placement"
            m19581c((java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01e1 }
            r1 = 1020(0x3fc, float:1.43E-42)
            r0.<init>(r1, r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.F r6 = com.ironsource.mediationsdk.C6432F.m19211a()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r7 = r9.f17486c     // Catch:{ all -> 0x01e1 }
            r6.mo35997a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01e1 }
            r6[r3] = r1     // Catch:{ all -> 0x01e1 }
            r0[r5] = r6     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01e1 }
            r1[r3] = r10     // Catch:{ all -> 0x01e1 }
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r9.m19570a((int) r2, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)
            return
        L_0x00c7:
            r9.f16644q = r10     // Catch:{ all -> 0x01e1 }
            r0 = 2100(0x834, float:2.943E-42)
            r9.m19576b((int) r0)     // Catch:{ all -> 0x01e1 }
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01e1 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01e1 }
            boolean r0 = com.ironsource.mediationsdk.utils.C6745k.m20443a((android.content.Context) r0, (java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0123
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "placement "
            r10.<init>(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r9.f16644q     // Catch:{ all -> 0x01e1 }
            r10.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = " is capped"
            r10.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01e1 }
            m19581c((java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01e1 }
            r1 = 524(0x20c, float:7.34E-43)
            r0.<init>(r1, r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.F r6 = com.ironsource.mediationsdk.C6432F.m19211a()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r7 = r9.f17486c     // Catch:{ all -> 0x01e1 }
            r6.mo35997a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01e1 }
            r6[r3] = r1     // Catch:{ all -> 0x01e1 }
            r0[r5] = r6     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01e1 }
            r1[r3] = r10     // Catch:{ all -> 0x01e1 }
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r9.m19579b((int) r2, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)
            return
        L_0x0123:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.Y> r0 = r9.f16640m     // Catch:{ all -> 0x01e1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01e1 }
        L_0x0129:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x01e1 }
            if (r1 == 0) goto L_0x01b1
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.Y r1 = (com.ironsource.mediationsdk.C6499Y) r1     // Catch:{ all -> 0x01e1 }
            boolean r7 = r1.mo36307g()     // Catch:{ all -> 0x01e1 }
            if (r7 == 0) goto L_0x0195
            com.ironsource.mediationsdk.W$a r0 = com.ironsource.mediationsdk.C6494W.C6497a.STATE_SHOWING     // Catch:{ all -> 0x01e1 }
            r9.mo36286a((com.ironsource.mediationsdk.C6494W.C6497a) r0)     // Catch:{ all -> 0x01e1 }
            r1.mo36305c()     // Catch:{ all -> 0x01e1 }
            r0 = 2201(0x899, float:3.084E-42)
            r9.m19577b((int) r0, (com.ironsource.mediationsdk.C6499Y) r1)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.utils.n r0 = r9.f16631d     // Catch:{ all -> 0x01e1 }
            r0.mo36985a(r1)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.utils.n r0 = r9.f16631d     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.mo36987b(r1)     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0175
            r1.mo36306f()     // Catch:{ all -> 0x01e1 }
            r0 = 2401(0x961, float:3.365E-42)
            r9.m19567a((int) r0, (com.ironsource.mediationsdk.C6499Y) r1)     // Catch:{ all -> 0x01e1 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            r0.<init>()     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = r1.mo36388k()     // Catch:{ all -> 0x01e1 }
            r0.append(r1)     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = " was session capped"
            r0.append(r1)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ all -> 0x01e1 }
        L_0x0175:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01e1 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.utils.C6745k.m20453d(r0, r10)     // Catch:{ all -> 0x01e1 }
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01e1 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01e1 }
            boolean r10 = com.ironsource.mediationsdk.utils.C6745k.m20443a((android.content.Context) r0, (java.lang.String) r10)     // Catch:{ all -> 0x01e1 }
            if (r10 == 0) goto L_0x0193
            r10 = 2400(0x960, float:3.363E-42)
            r9.m19576b((int) r10)     // Catch:{ all -> 0x01e1 }
        L_0x0193:
            monitor-exit(r9)
            return
        L_0x0195:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            java.lang.String r8 = "showInterstitial "
            r7.<init>(r8)     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = r1.mo36388k()     // Catch:{ all -> 0x01e1 }
            r7.append(r1)     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = " isReadyToShow() == false"
            r7.append(r1)     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x01e1 }
            m19580b((java.lang.String) r1)     // Catch:{ all -> 0x01e1 }
            goto L_0x0129
        L_0x01b1:
            com.ironsource.mediationsdk.F r10 = com.ironsource.mediationsdk.C6432F.m19211a()     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r0)     // Catch:{ all -> 0x01e1 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r1 = r9.f17486c     // Catch:{ all -> 0x01e1 }
            r10.mo35997a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r1)     // Catch:{ all -> 0x01e1 }
            java.lang.Object[][] r10 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = "errorCode"
            r0[r5] = r1     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01e1 }
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r10[r5] = r0     // Catch:{ all -> 0x01e1 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = "reason"
            r0[r5] = r1     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = "Show Fail - No ads to show"
            r0[r3] = r1     // Catch:{ all -> 0x01e1 }
            r10[r3] = r0     // Catch:{ all -> 0x01e1 }
            r9.m19579b((int) r2, (java.lang.Object[][]) r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)
            return
        L_0x01e1:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6494W.mo36291a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo36169a(List<C6729b> list, String str, C6729b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        this.f16633f = str;
        this.f16643p = bVar;
        this.f16634g = jSONObject;
        this.f16649v = i;
        this.f16650w = "";
        if (!TextUtils.isEmpty(str2)) {
            m19571a((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}, false);
        }
        mo36840a(jSONObject2, IronSource.AD_UNIT.INTERSTITIAL);
        if (this.f17484a.mo36958a(IronSource.AD_UNIT.INTERSTITIAL)) {
            m19571a((int) IronSourceConstants.IS_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}}, false);
            mo36286a(C6497a.STATE_READY_TO_LOAD);
            C6732u.m20387a().mo36954a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped"));
            return;
        }
        m19571a((int) IronSourceConstants.IS_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}}, false);
        m19575a(list);
        m19586i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36292a(boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Should Track Network State: " + z, 0);
        this.f16651x = z;
    }

    /* renamed from: b */
    public final void mo36293b(C6499Y y) {
        synchronized (this) {
            m19574a(y, "onInterstitialAdClosed");
            m19578b(IronSourceConstants.IS_INSTANCE_CLOSED, y, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C6753o.m20481a().mo36990b(2))}});
            C6753o.m20481a().mo36988a(2);
            C6432F.m19211a().mo36001c(this.f17486c);
            mo36286a(C6497a.STATE_READY_TO_LOAD);
        }
    }

    /* renamed from: b */
    public final void mo36294b(IronSourceError ironSourceError, C6499Y y) {
        m19568a((int) IronSourceConstants.IS_INSTANCE_INIT_FAILED, y, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
    }

    /* renamed from: c */
    public final void mo36295c(C6499Y y) {
        m19574a(y, "onInterstitialAdShowSucceeded");
        C6432F.m19211a().mo36002d(this.f17486c);
        m19577b((int) IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, y);
    }

    /* renamed from: d */
    public final void mo36296d(C6499Y y) {
        m19574a(y, "onInterstitialAdClicked");
        C6432F.m19211a().mo36003e(this.f17486c);
        m19577b(2006, y);
    }

    /* renamed from: e */
    public final synchronized void mo36297e() {
        if (this.f16639l == C6497a.STATE_SHOWING) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "loadInterstitial: load cannot be invoked while showing an ad", 3);
            C6432F.m19211a().mo35996a(new IronSourceError(1037, "loadInterstitial: load cannot be invoked while showing an ad"));
        } else if ((this.f16639l == C6497a.STATE_READY_TO_LOAD || this.f16639l == C6497a.STATE_READY_TO_SHOW) && !C6732u.m20387a().mo36955a(IronSource.AD_UNIT.INTERSTITIAL)) {
            this.f16633f = "";
            this.f16644q = "";
            this.f16634g = null;
            mo36835a(IronSource.AD_UNIT.INTERSTITIAL);
            mo36841a_();
            m19571a(2001, (Object[][]) null, false);
            this.f16648u = new Date().getTime();
            if (this.f16647t) {
                if (!this.f16642o.isEmpty()) {
                    this.f16636i.mo36687a(this.f16642o);
                    this.f16642o.clear();
                }
                mo36285a();
                return;
            }
            m19583g();
            m19586i();
        } else {
            m19580b("loadInterstitial: load is already in progress");
        }
    }

    /* renamed from: e */
    public final void mo36298e(C6499Y y) {
        m19574a(y, "onInterstitialAdVisible");
    }

    /* renamed from: f */
    public final void mo36299f(C6499Y y) {
        m19567a((int) IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return false;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo36300f() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f16651x     // Catch:{ all -> 0x0039 }
            r1 = 0
            if (r0 == 0) goto L_0x0014
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0039 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x0039 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x001a
        L_0x0014:
            com.ironsource.mediationsdk.W$a r0 = r3.f16639l     // Catch:{ all -> 0x0039 }
            com.ironsource.mediationsdk.W$a r2 = com.ironsource.mediationsdk.C6494W.C6497a.STATE_READY_TO_SHOW     // Catch:{ all -> 0x0039 }
            if (r0 == r2) goto L_0x001c
        L_0x001a:
            monitor-exit(r3)
            return r1
        L_0x001c:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.Y> r0 = r3.f16640m     // Catch:{ all -> 0x0039 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0039 }
        L_0x0022:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0039 }
            com.ironsource.mediationsdk.Y r2 = (com.ironsource.mediationsdk.C6499Y) r2     // Catch:{ all -> 0x0039 }
            boolean r2 = r2.mo36307g()     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0022
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x0037:
            monitor-exit(r3)
            return r1
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6494W.mo36300f():boolean");
    }
}
