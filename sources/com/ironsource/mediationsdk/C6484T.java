package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C6636j;
import com.ironsource.mediationsdk.C6689r;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C6656g;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.mediationsdk.p206a.C6518d;
import com.ironsource.mediationsdk.p215b.C6615b;
import com.ironsource.mediationsdk.p216c.C6621b;
import com.ironsource.mediationsdk.server.C6729b;
import com.ironsource.mediationsdk.utils.C6740f;
import com.ironsource.mediationsdk.utils.C6745k;
import com.ironsource.mediationsdk.utils.C6753o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.T */
public final class C6484T extends C6692s implements C6491U, C6615b.C6616a, C6629g {

    /* renamed from: d */
    C6621b f16571d;

    /* renamed from: e */
    C6615b f16572e;

    /* renamed from: f */
    IronSourceBannerLayout f16573f;

    /* renamed from: g */
    C6656g f16574g;

    /* renamed from: h */
    C6492V f16575h;

    /* renamed from: i */
    int f16576i;

    /* renamed from: j */
    final ConcurrentHashMap<String, C6492V> f16577j;

    /* renamed from: k */
    C6630h f16578k;

    /* renamed from: l */
    C6636j f16579l;

    /* renamed from: m */
    ConcurrentHashMap<String, C6636j.C6637a> f16580m;

    /* renamed from: n */
    long f16581n;

    /* renamed from: o */
    private C6490a f16582o = C6490a.NONE;

    /* renamed from: p */
    private int f16583p;

    /* renamed from: q */
    private CopyOnWriteArrayList<C6492V> f16584q;

    /* renamed from: r */
    private String f16585r;

    /* renamed from: s */
    private JSONObject f16586s;

    /* renamed from: t */
    private String f16587t = "";

    /* renamed from: u */
    private int f16588u;

    /* renamed from: v */
    private C6729b f16589v;

    /* renamed from: w */
    private ConcurrentHashMap<String, C6729b> f16590w;

    /* renamed from: x */
    private final Object f16591x = new Object();

    /* renamed from: y */
    private C6740f f16592y;

    /* renamed from: com.ironsource.mediationsdk.T$a */
    enum C6490a {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    public C6484T(List<NetworkSettings> list, C6621b bVar, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("isAuctionEnabled = " + bVar.mo36636c());
        this.f16571d = bVar;
        this.f16572e = new C6615b(this.f16571d.mo36640g());
        this.f16577j = new ConcurrentHashMap<>();
        this.f16584q = new CopyOnWriteArrayList<>();
        this.f16590w = new ConcurrentHashMap<>();
        this.f16580m = new ConcurrentHashMap<>();
        this.f16576i = C6753o.m20481a().mo36990b(3);
        C6681o.m20255a().f17437a = this.f16571d.mo36638e();
        if (this.f16571d.mo36636c()) {
            this.f16578k = new C6630h("banner", this.f16571d.mo36641h(), this);
        }
        m19503a(list);
        m19506b(list);
        this.f16581n = new Date().getTime();
        mo36255a(C6490a.READY_TO_LOAD);
    }

    /* renamed from: a */
    static /* synthetic */ ISBannerSize m19498a(C6484T t) {
        IronSourceBannerLayout ironSourceBannerLayout = t.f16573f;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        return t.f16573f.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getCurrentActiveActivity()) ? ISBannerSize.f16317a : ISBannerSize.BANNER : t.f16573f.getSize();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19499a(int i, Object[][] objArr) {
        mo36253a(i, objArr, this.f16576i);
    }

    /* renamed from: a */
    private void m19502a(C6492V v, C6729b bVar) {
        C6630h.m20185a(bVar, v.mo36386i(), this.f16589v, mo36265f());
        mo36839a(this.f16590w.get(v.mo36388k()), mo36265f());
    }

    /* renamed from: a */
    private void m19503a(List<NetworkSettings> list) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings providerName : list) {
            arrayList.add(providerName.getProviderName());
        }
        this.f16579l = new C6636j(arrayList, this.f16571d.mo36641h().f17574g);
    }

    /* renamed from: a */
    private static void m19504a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        try {
            String description = iSBannerSize.getDescription();
            char c = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                jSONObject.put("bannerAdSize", 1);
            } else if (c == 1) {
                jSONObject.put("bannerAdSize", 2);
            } else if (c == 2) {
                jSONObject.put("bannerAdSize", 3);
            } else if (c == 3) {
                jSONObject.put("bannerAdSize", 5);
            } else if (c == 4) {
                jSONObject.put("bannerAdSize", 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
            if (iSBannerSize.isAdaptive()) {
                String str = "Adaptive=true";
                if (jSONObject.has(IronSourceConstants.EVENTS_EXT1)) {
                    str = jSONObject.optString(IronSourceConstants.EVENTS_EXT1) + " , Adaptive=true";
                }
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19505a(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.f16582o);
        if (mo36259a(C6490a.STARTED_LOADING, this.f16571d.mo36636c() ? z ? C6490a.AUCTION : C6490a.FIRST_AUCTION : z ? C6490a.RELOADING : C6490a.LOADING)) {
            this.f16592y = new C6740f();
            this.f16585r = "";
            this.f16586s = null;
            this.f16583p = 0;
            this.f16576i = C6753o.m20481a().mo36990b(3);
            m19499a(z ? IronSourceConstants.BN_RELOAD : 3001, (Object[][]) null);
            if (this.f16571d.mo36636c()) {
                mo36263e();
                return;
            }
            m19511h();
            m19510g();
            return;
        }
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.error("wrong state - " + this.f16582o);
    }

    /* renamed from: b */
    private void m19506b(List<NetworkSettings> list) {
        for (int i = 0; i < list.size(); i++) {
            NetworkSettings networkSettings = list.get(i);
            AbstractAdapter a = C6622d.m20139a().mo36647a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a != null) {
                C6492V v = new C6492V(this.f16571d, this, networkSettings, a, this.f16576i, m19518o());
                this.f16577j.put(v.mo36388k(), v);
            } else {
                IronLog.INTERNAL.verbose(networkSettings.getProviderInstanceName() + " can't load adapter");
            }
        }
    }

    /* renamed from: b */
    private static boolean m19507b(int i) {
        return i == 3201 || i == 3110 || i == 3111 || i == 3116 || i == 3119 || i == 3112 || i == 3115 || i == 3501 || i == 3502 || i == 3506;
    }

    /* renamed from: c */
    private String m19508c(List<C6729b> list) {
        int i;
        int i2;
        IronLog.INTERNAL.verbose("waterfall.size() = " + list.size());
        this.f16584q.clear();
        this.f16590w.clear();
        this.f16580m.clear();
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (i3 < list.size()) {
            C6729b bVar = list.get(i3);
            C6492V v = this.f16577j.get(bVar.mo36942a());
            if (v != null) {
                AbstractAdapter a = C6622d.m20139a().mo36646a(v.f16847d.f17320a);
                if (a != null) {
                    C6492V v2 = r0;
                    i = i3;
                    i2 = 1;
                    C6492V v3 = new C6492V(this.f16571d, this, v.f16847d.f17320a, a, this.f16576i, this.f16585r, this.f16586s, this.f16588u, this.f16587t, m19518o());
                    v2.f16848e = true;
                    this.f16584q.add(v2);
                    this.f16590w.put(v2.mo36388k(), bVar);
                    this.f16580m.put(bVar.mo36942a(), C6636j.C6637a.ISAuctionPerformanceDidntAttemptToLoad);
                } else {
                    i = i3;
                    i2 = 1;
                }
            } else {
                i = i3;
                i2 = 1;
                IronLog.INTERNAL.error("could not find matching smash for auction response item - item = " + bVar.mo36942a());
            }
            C6492V v4 = this.f16577j.get(bVar.mo36942a());
            String str = "1";
            if (v4 == null ? !TextUtils.isEmpty(bVar.mo36943b()) : v4.mo36385h()) {
                str = "2";
            }
            sb.append(str + bVar.mo36942a());
            int i4 = i;
            if (i4 != list.size() - i2) {
                sb.append(",");
            }
            i3 = i4 + 1;
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb.toString());
        return sb.toString();
    }

    /* renamed from: f */
    private void m19509f(C6492V v) {
        Iterator<C6492V> it = this.f16584q.iterator();
        while (it.hasNext()) {
            C6492V next = it.next();
            if (!next.equals(v)) {
                next.mo36275d();
            }
        }
    }

    /* renamed from: g */
    private void m19510g() {
        int i = this.f16583p;
        while (true) {
            String str = null;
            if (i < this.f16584q.size()) {
                C6492V v = this.f16584q.get(i);
                if (v.f16848e) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("loading smash - " + v.mo36393p());
                    this.f16583p = i + 1;
                    IronSourceBannerLayout ironSourceBannerLayout = this.f16573f;
                    if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
                        if (v.mo36385h()) {
                            str = this.f16590w.get(v.mo36388k()).mo36943b();
                            v.mo36384b(str);
                        }
                        v.mo36272a(this.f16573f.mo36064a(), this.f16574g, str);
                        return;
                    }
                    return;
                }
                i++;
            } else {
                String str2 = this.f16584q.isEmpty() ? "Empty waterfall" : "Mediation No fill";
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("errorReason = " + str2);
                m19509f((C6492V) null);
                if (mo36259a(C6490a.LOADING, C6490a.READY_TO_LOAD)) {
                    m19499a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_NO_FILL)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}, new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f16592y))}});
                    C6681o.m20255a().mo36812a(this.f16573f, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, str2), false);
                    return;
                } else if (mo36259a(C6490a.RELOADING, C6490a.LOADED)) {
                    m19499a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f16592y))}});
                    C6681o.m20255a().mo36812a(this.f16573f, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, str2), true);
                    this.f16572e.mo36630a(this);
                    return;
                } else {
                    mo36255a(C6490a.READY_TO_LOAD);
                    IronLog ironLog3 = IronLog.INTERNAL;
                    ironLog3.error("wrong state = " + this.f16582o);
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    private void m19511h() {
        List<C6729b> i = m19512i();
        this.f16585r = m20309d();
        m19508c(i);
    }

    /* renamed from: i */
    private List<C6729b> m19512i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C6492V next : this.f16577j.values()) {
            if (!next.mo36385h() && !C6745k.m20449b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), mo36265f())) {
                copyOnWriteArrayList.add(new C6729b(next.mo36388k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: j */
    private boolean m19513j() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f16573f;
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: k */
    private ISBannerSize m19514k() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f16573f;
        if (ironSourceBannerLayout != null) {
            return ironSourceBannerLayout.getSize();
        }
        return null;
    }

    /* renamed from: l */
    private boolean m19515l() {
        boolean z;
        synchronized (this.f16591x) {
            if (this.f16582o != C6490a.LOADING) {
                if (this.f16582o != C6490a.RELOADING) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: m */
    private boolean m19516m() {
        boolean z;
        synchronized (this.f16591x) {
            if (this.f16582o != C6490a.FIRST_AUCTION) {
                if (this.f16582o != C6490a.AUCTION) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: n */
    private boolean m19517n() {
        boolean z;
        synchronized (this.f16591x) {
            z = this.f16582o == C6490a.LOADED;
        }
        return z;
    }

    /* renamed from: o */
    private boolean m19518o() {
        return this.f16582o == C6490a.RELOADING || this.f16582o == C6490a.AUCTION;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36251a() {
        /*
            r6 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = "checking with IronsourceLifecycleManager if app in foreground"
            r0.verbose(r1)
            com.ironsource.lifecycle.d r0 = com.ironsource.lifecycle.C6408d.m19164a()
            boolean r0 = r0.mo35921b()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0088
            com.ironsource.mediationsdk.IronSourceBannerLayout r0 = r6.f16573f
            if (r0 != 0) goto L_0x0020
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner is null"
        L_0x001b:
            r0.verbose(r3)
            r0 = r2
            goto L_0x0056
        L_0x0020:
            boolean r0 = r0.isShown()
            if (r0 != 0) goto L_0x002b
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner or one of its parents are INVISIBLE or GONE"
            goto L_0x001b
        L_0x002b:
            com.ironsource.mediationsdk.IronSourceBannerLayout r0 = r6.f16573f
            boolean r0 = r0.hasWindowFocus()
            if (r0 != 0) goto L_0x0038
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner has no window focus"
            goto L_0x001b
        L_0x0038:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.ironsource.mediationsdk.IronSourceBannerLayout r3 = r6.f16573f
            boolean r0 = r3.getGlobalVisibleRect(r0)
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "visible = "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.verbose(r4)
        L_0x0056:
            if (r0 == 0) goto L_0x0085
            com.ironsource.mediationsdk.T$a r0 = com.ironsource.mediationsdk.C6484T.C6490a.LOADED
            com.ironsource.mediationsdk.T$a r3 = com.ironsource.mediationsdk.C6484T.C6490a.STARTED_LOADING
            boolean r0 = r6.mo36259a((com.ironsource.mediationsdk.C6484T.C6490a) r0, (com.ironsource.mediationsdk.C6484T.C6490a) r3)
            if (r0 == 0) goto L_0x006d
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "start loading"
            r0.verbose(r3)
            r6.m19505a((boolean) r1)
            goto L_0x0082
        L_0x006d:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "wrong state = "
            r3.<init>(r4)
            com.ironsource.mediationsdk.T$a r4 = r6.f16582o
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.error(r3)
        L_0x0082:
            r0 = 0
            r3 = r2
            goto L_0x008b
        L_0x0085:
            java.lang.String r0 = "banner is not visible - start reload timer"
            goto L_0x008a
        L_0x0088:
            java.lang.String r0 = "app in background - start reload timer"
        L_0x008a:
            r3 = r1
        L_0x008b:
            if (r3 == 0) goto L_0x00af
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r3.verbose(r0)
            r0 = 3200(0xc80, float:4.484E-42)
            java.lang.Object[][] r3 = new java.lang.Object[r1][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r2] = r5
            r5 = 614(0x266, float:8.6E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            r3[r2] = r4
            r6.m19499a((int) r0, (java.lang.Object[][]) r3)
            com.ironsource.mediationsdk.b.b r0 = r6.f16572e
            r0.mo36630a(r6)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6484T.mo36251a():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36252a(int i) {
        m19499a(i, (Object[][]) null);
    }

    /* renamed from: a */
    public final void mo36163a(int i, String str, int i2, String str2, long j) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        IronLog.INTERNAL.verbose(str3);
        IronSourceUtils.sendAutomationLog("BN: " + str3);
        if (m19516m()) {
            this.f16587t = str2;
            this.f16588u = i2;
            this.f16586s = null;
            m19511h();
            m19499a((int) IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}});
            mo36255a(this.f16582o == C6490a.FIRST_AUCTION ? C6490a.LOADING : C6490a.RELOADING);
            m19510g();
            return;
        }
        IronLog.INTERNAL.warning("wrong state - mCurrentState = " + this.f16582o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36253a(int i, Object[][] objArr, int i2) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        try {
            ISBannerSize k = m19514k();
            if (k != null) {
                m19504a(mediationAdditionalData, k);
            }
            if (this.f16574g != null) {
                mediationAdditionalData.put("placement", mo36265f());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (!TextUtils.isEmpty(this.f16585r)) {
                mediationAdditionalData.put("auctionId", this.f16585r);
            }
            if (this.f16586s != null && this.f16586s.length() > 0) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16586s);
            }
            if (m19507b(i)) {
                mediationAdditionalData.put(IronSourceConstants.AUCTION_TRIALS, this.f16588u);
                if (!TextUtils.isEmpty(this.f16587t)) {
                    mediationAdditionalData.put(IronSourceConstants.AUCTION_FALLBACK, this.f16587t);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
        C6518d.m19731d().mo36349b(new C6517c(i, mediationAdditionalData));
    }

    /* renamed from: a */
    public final void mo36254a(final IronSourceBannerLayout ironSourceBannerLayout, final C6656g gVar) {
        IronLog.INTERNAL.verbose("");
        mo36835a(IronSource.AD_UNIT.BANNER);
        mo36841a_();
        if (!mo36259a(C6490a.READY_TO_LOAD, C6490a.STARTED_LOADING)) {
            IronLog.API.error("can't load banner - loadBanner already called and still in progress");
        } else if (!C6681o.m20255a().mo36814b()) {
            C64851 r0 = new C6689r.C6691b() {
                /* renamed from: a */
                public final void mo36266a() {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("placement = " + gVar.getPlacementName());
                    C6484T.this.f16573f = ironSourceBannerLayout;
                    C6484T.this.f16574g = gVar;
                    if (C6745k.m20449b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), gVar.getPlacementName())) {
                        IronLog.INTERNAL.verbose("placement is capped");
                        C6681o a = C6681o.m20255a();
                        IronSourceBannerLayout ironSourceBannerLayout = ironSourceBannerLayout;
                        a.mo36812a(ironSourceBannerLayout, new IronSourceError(604, "placement " + gVar.getPlacementName() + " is capped"), false);
                        C6484T.this.m19499a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 604}});
                        C6484T.this.mo36255a(C6490a.READY_TO_LOAD);
                        return;
                    }
                    C6484T.this.m19505a(false);
                }

                /* renamed from: a */
                public final void mo36267a(String str) {
                    IronLog ironLog = IronLog.API;
                    ironLog.error("can't load banner - errorMessage = " + str);
                }
            };
            String str = null;
            if (!C6689r.m20304a(ironSourceBannerLayout)) {
                Object[] objArr = new Object[1];
                objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
                str = String.format("can't load banner - %s", objArr);
            }
            if (gVar == null || TextUtils.isEmpty(gVar.getPlacementName())) {
                Object[] objArr2 = new Object[1];
                objArr2[0] = gVar == null ? "placement is null" : "placement name is empty";
                str = String.format("can't load banner - %s", objArr2);
            }
            if (!TextUtils.isEmpty(str)) {
                IronLog.INTERNAL.error(str);
                r0.mo36267a(str);
                return;
            }
            r0.mo36266a();
        } else {
            IronLog.INTERNAL.verbose("can't load banner - already has pending invocation");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36255a(C6490a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("from '" + this.f16582o + "' to '" + aVar + "'");
        synchronized (this.f16591x) {
            this.f16582o = aVar;
        }
    }

    /* renamed from: a */
    public final void mo36256a(C6492V v) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(v.mo36393p());
        if (m19513j()) {
            C6668n.m20237a().mo36798d(this.f17486c);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo36253a((int) IronSourceConstants.BN_CALLBACK_CLICK, objArr, v.mo36390m());
    }

    /* renamed from: a */
    public final void mo36257a(C6492V v, View view, FrameLayout.LayoutParams layoutParams) {
        Object[][] objArr;
        C6492V v2 = v;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + v.mo36393p());
        if (v2.f16610a != this.f16585r) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("invoked with auctionId: " + v2.f16610a + " and the current id is " + this.f16585r);
            Object[] objArr2 = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
            v2.mo36271a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr2, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong auction id " + v2.f16610a + " State - " + this.f16582o}, new Object[]{IronSourceConstants.EVENTS_EXT1, v.mo36388k()}});
        } else if (m19515l()) {
            C6492V v3 = this.f16575h;
            if (v3 != null) {
                v3.mo36275d();
            }
            m19509f(v);
            this.f16575h = v2;
            IronSourceBannerLayout ironSourceBannerLayout = this.f16573f;
            if (ironSourceBannerLayout != null) {
                ironSourceBannerLayout.mo36065a(view, layoutParams);
            }
            this.f16580m.put(v.mo36388k(), C6636j.C6637a.ISAuctionPerformanceShowedSuccessfully);
            if (this.f16571d.mo36636c()) {
                C6729b bVar = this.f16590w.get(v.mo36388k());
                if (bVar != null) {
                    mo36837a(bVar.mo36941a(mo36265f()));
                    C6630h.m20184a(bVar, v.mo36386i(), this.f16589v);
                    this.f16578k.mo36663a((CopyOnWriteArrayList<C6529ac>) this.f16584q, this.f16590w, v.mo36386i(), this.f16589v, bVar);
                    if (!this.f16571d.mo36641h().f17587t) {
                        m19502a(v2, bVar);
                    }
                } else {
                    String k = v.mo36388k();
                    IronLog ironLog3 = IronLog.INTERNAL;
                    ironLog3.error("onLoadSuccess winner instance " + k + " missing from waterfall. auctionId = " + this.f16585r);
                    m19499a((int) IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                }
            }
            if (this.f16582o == C6490a.LOADING) {
                if (m19513j()) {
                    this.f16573f.mo36066a(this.f17486c, false);
                    objArr = new Object[][]{new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f16592y))}};
                } else {
                    objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}, new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f16592y))}};
                }
                m19499a((int) IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, objArr);
            } else {
                if (m19513j()) {
                    this.f16573f.mo36066a(this.f17486c, true);
                }
                IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
                m19499a((int) IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f16592y))}});
            }
            String f = mo36265f();
            C6745k.m20455f(ContextProvider.getInstance().getCurrentActiveActivity(), f);
            if (C6745k.m20449b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), f)) {
                m19499a((int) IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
            }
            C6753o.m20481a().mo36988a(3);
            mo36255a(C6490a.LOADED);
            this.f16572e.mo36630a(this);
        } else {
            IronLog ironLog4 = IronLog.INTERNAL;
            ironLog4.warning("wrong state - mCurrentState = " + this.f16582o);
        }
    }

    /* renamed from: a */
    public final void mo36258a(IronSourceError ironSourceError, C6492V v) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (v.f16610a != this.f16585r) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("invoked with auctionId: " + v.f16610a + " and the current id is " + this.f16585r);
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 3};
            v.mo36271a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong auction " + v.f16610a + " State - " + this.f16582o}, new Object[]{IronSourceConstants.EVENTS_EXT1, v.mo36388k()}});
        } else if (m19515l()) {
            this.f16580m.put(v.mo36388k(), C6636j.C6637a.ISAuctionPerformanceFailedToLoad);
            m19510g();
        } else {
            IronLog ironLog3 = IronLog.INTERNAL;
            ironLog3.warning("wrong state - mCurrentState = " + this.f16582o);
        }
    }

    /* renamed from: a */
    public final void mo36169a(List<C6729b> list, String str, C6729b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (m19516m()) {
            this.f16587t = "";
            this.f16585r = str;
            this.f16588u = i;
            this.f16589v = bVar;
            this.f16586s = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                m19499a((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}});
            }
            mo36840a(jSONObject2, IronSource.AD_UNIT.BANNER);
            if (this.f17484a.mo36958a(IronSource.AD_UNIT.BANNER)) {
                m19499a((int) IronSourceConstants.BN_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}});
                C6490a aVar = this.f16582o;
                mo36255a(C6490a.READY_TO_LOAD);
                if (aVar == C6490a.FIRST_AUCTION) {
                    C6681o.m20255a().mo36812a(this.f16573f, new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped"), false);
                    return;
                }
                return;
            }
            m19499a((int) IronSourceConstants.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
            mo36255a(this.f16582o == C6490a.FIRST_AUCTION ? C6490a.LOADING : C6490a.RELOADING);
            m19499a((int) IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, m19508c(list)}});
            m19510g();
            return;
        }
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.warning("wrong state - mCurrentState = " + this.f16582o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo36259a(C6490a aVar, C6490a aVar2) {
        boolean z;
        synchronized (this.f16591x) {
            if (this.f16582o == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("set state from '" + this.f16582o + "' to '" + aVar2 + "'");
                z = true;
                this.f16582o = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void mo36260b(C6492V v) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(v.mo36393p());
        if (m19513j()) {
            C6668n.m20237a().mo36796b(this.f17486c);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo36253a((int) IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, v.mo36390m());
    }

    /* renamed from: c */
    public final void mo36261c(C6492V v) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(v.mo36393p());
        if (m19513j()) {
            C6668n.m20237a().mo36793a(this.f17486c);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo36253a((int) IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, v.mo36390m());
    }

    /* renamed from: d */
    public final void mo36262d(C6492V v) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(v.mo36393p());
        if (m19513j()) {
            C6668n.m20237a().mo36797c(this.f17486c);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo36253a((int) IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, v.mo36390m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo36263e() {
        IronLog.INTERNAL.verbose("");
        AsyncTask.execute(new Runnable() {
            public final void run() {
                boolean z;
                C6484T t = C6484T.this;
                if (!t.f16580m.isEmpty()) {
                    t.f16579l.mo36687a(t.f16580m);
                    t.f16580m.clear();
                }
                C6484T t2 = C6484T.this;
                long d = t2.f16571d.mo36637d() - (new Date().getTime() - t2.f16581n);
                if (d > 0) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("waiting before auction - timeToWaitBeforeAuction = " + d);
                    new Timer().schedule(new TimerTask() {
                        public final void run() {
                            C6484T.this.mo36263e();
                        }
                    }, d);
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C6484T.this.mo36252a((int) IronSourceConstants.BN_AUCTION_REQUEST);
                    C6689r.m20302a(C6484T.this.mo36265f(), C6484T.this.f16577j, new C6689r.C6690a() {
                        /* renamed from: a */
                        public final void mo36269a(Map<String, Object> map, List<String> list, StringBuilder sb) {
                            IronLog ironLog = IronLog.INTERNAL;
                            ironLog.verbose("auction waterfallString = " + sb);
                            if (map.size() == 0 && list.size() == 0) {
                                C6484T.this.m19499a((int) IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}});
                                if (C6484T.this.mo36259a(C6490a.AUCTION, C6490a.LOADED)) {
                                    C6484T.this.f16572e.mo36630a(C6484T.this);
                                    return;
                                }
                                C6681o.m20255a().mo36812a(C6484T.this.f16573f, new IronSourceError(1005, "No candidates available for auctioning"), false);
                                C6484T.this.m19499a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
                                C6484T.this.mo36255a(C6490a.READY_TO_LOAD);
                                return;
                            }
                            C6484T.this.m19499a((int) IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
                            if (C6484T.this.f16578k != null) {
                                C6630h hVar = C6484T.this.f16578k;
                                Context applicationContext = ContextProvider.getInstance().getApplicationContext();
                                C6636j jVar = C6484T.this.f16579l;
                                int i = C6484T.this.f16576i;
                                IronSourceSegment ironSourceSegment = C6484T.this.f17485b;
                                hVar.f17189b = C6484T.m19498a(C6484T.this);
                                hVar.mo36662a(applicationContext, map, list, jVar, i, ironSourceSegment);
                                return;
                            }
                            IronLog.INTERNAL.error("mAuctionHandler is null");
                        }
                    });
                }
            }
        });
    }

    /* renamed from: e */
    public final void mo36264e(C6492V v) {
        C6729b bVar;
        IronLog.INTERNAL.verbose(v.mo36393p());
        if (m19517n()) {
            if (this.f16571d.mo36636c() && this.f16571d.mo36641h().f17587t && (bVar = this.f16590w.get(v.mo36388k())) != null) {
                m19502a(v, bVar);
            }
            m19499a((int) IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("wrong state - mCurrentState = " + this.f16582o);
        String k = v.mo36388k();
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        m19499a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + this.f16582o}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo36265f() {
        C6656g gVar = this.f16574g;
        return gVar != null ? gVar.getPlacementName() : "";
    }
}
