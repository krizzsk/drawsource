package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.mediationsdk.C6611b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6650a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.mediationsdk.p206a.C6522h;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.C6753o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.ab */
public final class C6526ab extends C6529ac implements RewardedVideoSmashListener {

    /* renamed from: A */
    private String f16815A;

    /* renamed from: B */
    private String f16816B;

    /* renamed from: C */
    private final Object f16817C = new Object();
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final Object f16818D = new Object();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public C6528a f16819a = C6528a.NO_INIT;

    /* renamed from: b */
    boolean f16820b;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C6525aa f16821j;

    /* renamed from: k */
    private Timer f16822k;

    /* renamed from: l */
    private int f16823l;

    /* renamed from: m */
    private String f16824m;

    /* renamed from: n */
    private String f16825n;

    /* renamed from: o */
    private String f16826o;

    /* renamed from: p */
    private boolean f16827p;

    /* renamed from: q */
    private boolean f16828q;

    /* renamed from: r */
    private Placement f16829r;

    /* renamed from: s */
    private long f16830s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f16831t;

    /* renamed from: u */
    private JSONObject f16832u;

    /* renamed from: v */
    private String f16833v;

    /* renamed from: w */
    private int f16834w;

    /* renamed from: x */
    private String f16835x;

    /* renamed from: y */
    private int f16836y;

    /* renamed from: z */
    private int f16837z;

    /* renamed from: com.ironsource.mediationsdk.ab$a */
    public enum C6528a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public C6526ab(String str, String str2, NetworkSettings networkSettings, C6525aa aaVar, int i, AbstractAdapter abstractAdapter) {
        super(new C6650a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f16824m = str;
        this.f16825n = str2;
        this.f16821j = aaVar;
        this.f16822k = null;
        this.f16823l = i;
        this.f16846c.addRewardedVideoListener(this);
        this.f16827p = false;
        this.f16828q = false;
        this.f16820b = false;
        this.f16829r = null;
        this.f16831t = "";
        this.f16832u = null;
        this.f16851h = 1;
        m19782g();
    }

    /* renamed from: a */
    private void m19769a(int i) {
        m19770a(i, (Object[][]) null, false);
    }

    /* renamed from: a */
    private void m19770a(int i, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> n = mo36391n();
        if (!TextUtils.isEmpty(this.f16831t)) {
            n.put("auctionId", this.f16831t);
        }
        JSONObject jSONObject = this.f16832u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16832u);
        }
        if (z && (placement = this.f16829r) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n.put("placement", this.f16829r.getPlacementName());
        }
        if (m19777b(i)) {
            C6522h.m19751d();
            C6522h.m19689a(n, this.f16834w, this.f16835x);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f16851h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, mo36388k() + " smash: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C6522h.m19751d().mo36349b(new C6517c(i, new JSONObject(n)));
        if (i == 1203) {
            C6753o.m20481a().mo36988a(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19771a(C6528a aVar) {
        m19774a("current state=" + this.f16819a + ", new state=" + aVar);
        synchronized (this.f16818D) {
            this.f16819a = aVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19774a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + mo36388k() + " : " + str, 0);
    }

    /* renamed from: a */
    private void m19775a(String str, String str2, int i, String str3, int i2, String str4) {
        this.f16833v = str2;
        this.f16826o = str;
        this.f16836y = i;
        this.f16816B = str3;
        this.f16837z = i2;
        this.f16815A = str4;
    }

    /* renamed from: b */
    private static boolean m19777b(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1213 || i == 1212 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
    }

    /* renamed from: c */
    private void m19779c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + mo36388k() + " : " + str, 3);
    }

    /* renamed from: g */
    private void m19782g() {
        this.f16833v = "";
        this.f16836y = -1;
        this.f16816B = "";
        this.f16826o = "";
        this.f16837z = this.f16851h;
        this.f16815A = "";
    }

    /* renamed from: q */
    private boolean m19783q() {
        try {
            return this.f16846c.isRewardedVideoAvailable(this.f16849f);
        } catch (Exception e) {
            m19779c("isRewardedVideoAvailable exception: " + e.getLocalizedMessage());
            e.printStackTrace();
            mo36380b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5002}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
            return false;
        }
    }

    /* renamed from: r */
    private void m19784r() {
        try {
            String str = C6459L.m19304a().f16422l;
            if (!TextUtils.isEmpty(str)) {
                this.f16846c.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f16846c.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
            }
        } catch (Exception e) {
            m19774a("setCustomParams() " + e.getMessage());
        }
    }

    /* renamed from: s */
    private void m19785s() {
        synchronized (this.f16817C) {
            if (this.f16822k != null) {
                this.f16822k.cancel();
                this.f16822k = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public long m19786t() {
        return new Date().getTime() - this.f16830s;
    }

    /* renamed from: a */
    public final Map<String, Object> mo36182a() {
        try {
            if (mo36385h()) {
                return this.f16846c.getRewardedVideoBiddingData(this.f16849f);
            }
            return null;
        } catch (Throwable th) {
            m19779c("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            mo36380b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5001}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    /* renamed from: a */
    public final void mo36375a(int i, Object[][] objArr) {
        m19770a(i, objArr, true);
    }

    /* renamed from: a */
    public final void mo36376a(Placement placement, int i) {
        m19785s();
        m19774a("showVideo()");
        this.f16829r = placement;
        this.f16851h = i;
        m19771a(C6528a.SHOW_IN_PROGRESS);
        mo36375a((int) IronSourceConstants.RV_INSTANCE_SHOW, (Object[][]) null);
        try {
            this.f16846c.showRewardedVideo(this.f16849f, this);
        } catch (Throwable th) {
            m19779c("showVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(1038, th.getLocalizedMessage()));
        }
    }

    /* renamed from: a */
    public final void mo36377a(String str, String str2, JSONObject jSONObject, int i, String str3, int i2, String str4) {
        C6528a aVar;
        m19774a("loadVideo() auctionId: " + str2 + " state: " + this.f16819a);
        this.f16852i = null;
        this.f16848e = false;
        this.f16820b = true;
        synchronized (this.f16818D) {
            aVar = this.f16819a;
            if (!(this.f16819a == C6528a.LOAD_IN_PROGRESS || this.f16819a == C6528a.SHOW_IN_PROGRESS)) {
                m19771a(C6528a.LOAD_IN_PROGRESS);
            }
        }
        if (aVar == C6528a.LOAD_IN_PROGRESS) {
            mo36380b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during load"}});
            this.f16828q = true;
            m19775a(str, str2, i, str3, i2, str4);
            this.f16821j.mo36319b(this, str2);
        } else if (aVar == C6528a.SHOW_IN_PROGRESS) {
            mo36380b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during show"}});
            this.f16827p = true;
            m19775a(str, str2, i, str3, i2, str4);
        } else {
            this.f16850g = str4;
            this.f16831t = str2;
            this.f16832u = jSONObject;
            this.f16834w = i;
            this.f16835x = str3;
            this.f16851h = i2;
            synchronized (this.f16817C) {
                m19785s();
                Timer timer = new Timer();
                this.f16822k = timer;
                timer.schedule(new TimerTask() {
                    public final void run() {
                        boolean z;
                        int i;
                        String str;
                        int i2;
                        String str2 = "Rewarded Video - load instance time out";
                        synchronized (C6526ab.this.f16818D) {
                            if (C6526ab.this.f16819a != C6528a.LOAD_IN_PROGRESS) {
                                if (C6526ab.this.f16819a != C6528a.INIT_IN_PROGRESS) {
                                    i = 0;
                                    z = false;
                                }
                            }
                            if (C6526ab.this.f16819a == C6528a.LOAD_IN_PROGRESS) {
                                str = str2;
                                i2 = 1025;
                            } else {
                                i2 = 1032;
                                str = "Rewarded Video - init instance time out";
                            }
                            C6526ab.this.m19771a(C6528a.NOT_LOADED);
                            z = true;
                            String str3 = str;
                            i = i2;
                            str2 = str3;
                        }
                        C6526ab.this.m19774a(str2);
                        if (z) {
                            C6526ab.this.mo36380b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(C6526ab.this.m19786t())}});
                            C6526ab.this.mo36380b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}, new Object[]{"duration", Long.valueOf(C6526ab.this.m19786t())}});
                            C6525aa e = C6526ab.this.f16821j;
                            C6526ab abVar = C6526ab.this;
                            e.mo36319b(abVar, abVar.f16831t);
                            return;
                        }
                        C6526ab.this.mo36380b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(C6526ab.this.m19786t())}, new Object[]{IronSourceConstants.EVENTS_EXT1, C6526ab.this.f16819a.name()}});
                    }
                }, (long) (this.f16823l * 1000));
            }
            this.f16830s = new Date().getTime();
            m19769a(1001);
            try {
                if (mo36385h()) {
                    this.f16846c.loadRewardedVideoForBidding(this.f16849f, this, str);
                } else if (aVar == C6528a.NO_INIT) {
                    m19784r();
                    this.f16846c.initRewardedVideo(this.f16824m, this.f16825n, this.f16849f, this);
                } else {
                    this.f16846c.fetchRewardedVideoForAutomaticLoad(this.f16849f, this);
                }
            } catch (Throwable th) {
                m19779c("loadRewardedVideoForBidding exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                onRewardedVideoLoadFailed(new IronSourceError(1030, th.getLocalizedMessage()));
                mo36380b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            }
        }
    }

    /* renamed from: a */
    public final void mo36378a(boolean z, int i) {
        this.f16851h = i;
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? "true" : "false";
        objArr[0] = objArr2;
        m19770a(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    /* renamed from: b */
    public final void mo36379b() {
        m19774a("initForBidding()");
        m19771a(C6528a.INIT_IN_PROGRESS);
        m19784r();
        try {
            this.f16846c.initRewardedVideoForBidding(this.f16824m, this.f16825n, this.f16849f, this);
        } catch (Throwable th) {
            m19779c("initForBidding exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: b */
    public final void mo36380b(int i, Object[][] objArr) {
        m19770a(i, objArr, false);
    }

    /* renamed from: c */
    public final boolean mo36381c() {
        return mo36385h() ? this.f16820b && this.f16819a == C6528a.LOADED && m19783q() : m19783q();
    }

    /* renamed from: f */
    public final void mo36382f() {
        this.f16846c.setMediationState(C6611b.C6612a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        m19770a(IronSourceConstants.RV_CAP_SESSION, (Object[][]) null, false);
    }

    public final void onRewardedVideoAdClicked() {
        m19774a("onRewardedVideoAdClicked");
        this.f16821j.mo36318b(this, this.f16829r);
        mo36375a(1006, (Object[][]) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        r12.f16821j.mo36317b(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        if (r12.f16827p == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
        m19774a("onRewardedVideoAdClosed and mShouldLoadAfterClose is true - calling loadRewardedVideoForBidding");
        r12.f16827p = false;
        mo36377a(r12.f16826o, r12.f16833v, r12.f16832u, r12.f16836y, r12.f16816B, r12.f16837z, r12.f16815A);
        m19782g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRewardedVideoAdClosed() {
        /*
            r12 = this;
            java.lang.String r0 = "onRewardedVideoAdClosed"
            r12.m19774a((java.lang.String) r0)
            java.lang.Object r0 = r12.f16818D
            monitor-enter(r0)
            com.ironsource.mediationsdk.ab$a r1 = r12.f16819a     // Catch:{ all -> 0x0077 }
            com.ironsource.mediationsdk.ab$a r2 = com.ironsource.mediationsdk.C6526ab.C6528a.SHOW_IN_PROGRESS     // Catch:{ all -> 0x0077 }
            r3 = 0
            if (r1 == r2) goto L_0x004b
            r1 = 1203(0x4b3, float:1.686E-42)
            r2 = 0
            r12.mo36375a((int) r1, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x0077 }
            r1 = 81316(0x13da4, float:1.13948E-40)
            r2 = 2
            java.lang.Object[][] r4 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0077 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0077 }
            java.lang.String r6 = "errorCode"
            r5[r3] = r6     // Catch:{ all -> 0x0077 }
            r6 = 5009(0x1391, float:7.019E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0077 }
            r7 = 1
            r5[r7] = r6     // Catch:{ all -> 0x0077 }
            r4[r3] = r5     // Catch:{ all -> 0x0077 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = "reason"
            r2[r3] = r5     // Catch:{ all -> 0x0077 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = "adClosed: "
            r3.<init>(r5)     // Catch:{ all -> 0x0077 }
            com.ironsource.mediationsdk.ab$a r5 = r12.f16819a     // Catch:{ all -> 0x0077 }
            r3.append(r5)     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0077 }
            r2[r7] = r3     // Catch:{ all -> 0x0077 }
            r4[r7] = r2     // Catch:{ all -> 0x0077 }
            r12.mo36380b(r1, r4)     // Catch:{ all -> 0x0077 }
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            return
        L_0x004b:
            com.ironsource.mediationsdk.ab$a r1 = com.ironsource.mediationsdk.C6526ab.C6528a.NOT_LOADED     // Catch:{ all -> 0x0077 }
            r12.m19771a((com.ironsource.mediationsdk.C6526ab.C6528a) r1)     // Catch:{ all -> 0x0077 }
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            com.ironsource.mediationsdk.aa r0 = r12.f16821j
            r0.mo36317b(r12)
            boolean r0 = r12.f16827p
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "onRewardedVideoAdClosed and mShouldLoadAfterClose is true - calling loadRewardedVideoForBidding"
            r12.m19774a((java.lang.String) r0)
            r12.f16827p = r3
            java.lang.String r5 = r12.f16826o
            java.lang.String r6 = r12.f16833v
            org.json.JSONObject r7 = r12.f16832u
            int r8 = r12.f16836y
            java.lang.String r9 = r12.f16816B
            int r10 = r12.f16837z
            java.lang.String r11 = r12.f16815A
            r4 = r12
            r4.mo36377a(r5, r6, r7, r8, r9, r10, r11)
            r12.m19782g()
        L_0x0076:
            return
        L_0x0077:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6526ab.onRewardedVideoAdClosed():void");
    }

    public final void onRewardedVideoAdEnded() {
        m19774a("onRewardedVideoAdEnded");
        this.f16821j.mo36321d(this);
        mo36375a((int) IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    public final void onRewardedVideoAdOpened() {
        m19774a("onRewardedVideoAdOpened");
        this.f16821j.mo36312a(this);
        mo36375a(1005, (Object[][]) null);
    }

    public final void onRewardedVideoAdRewarded() {
        m19774a("onRewardedVideoAdRewarded");
        this.f16821j.mo36313a(this, this.f16829r);
        Map<String, Object> n = mo36391n();
        Placement placement = this.f16829r;
        if (placement != null) {
            n.put("placement", placement.getPlacementName());
            n.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f16829r.getRewardName());
            n.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f16829r.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(C6459L.m19304a().f16423m)) {
            n.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C6459L.m19304a().f16423m);
        }
        if (C6459L.m19304a().f16424n != null) {
            for (String next : C6459L.m19304a().f16424n.keySet()) {
                n.put(ContentMetadata.KEY_CUSTOM_PREFIX + next, C6459L.m19304a().f16424n.get(next));
            }
        }
        if (!TextUtils.isEmpty(this.f16831t)) {
            n.put("auctionId", this.f16831t);
        }
        JSONObject jSONObject = this.f16832u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16832u);
        }
        if (m19777b(1010)) {
            C6522h.m19751d();
            C6522h.m19689a(n, this.f16834w, this.f16835x);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f16851h));
        C6517c cVar = new C6517c(1010, new JSONObject(n));
        cVar.mo36370a(IronSourceConstants.EVENTS_TRANS_ID, (Object) IronSourceUtils.getTransId(cVar.mo36371b(), mo36388k()));
        C6522h.m19751d().mo36349b(cVar);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        m19774a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        mo36375a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        synchronized (this.f16818D) {
            if (this.f16819a != C6528a.SHOW_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)};
                mo36380b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showFailed: " + this.f16819a}});
                return;
            }
            m19771a(C6528a.NOT_LOADED);
            this.f16821j.mo36315a(ironSourceError, this);
        }
    }

    public final void onRewardedVideoAdStarted() {
        m19774a("onRewardedVideoAdStarted");
        this.f16821j.mo36320c(this);
        mo36375a((int) IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    public final void onRewardedVideoAdVisible() {
        m19774a("onRewardedVideoAdVisible");
        mo36375a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        m19774a("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.f16819a.name());
        synchronized (this.f16818D) {
            if (this.f16819a == C6528a.LOAD_IN_PROGRESS) {
                m19771a(z ? C6528a.LOADED : C6528a.NOT_LOADED);
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (!z2) {
            m19785s();
            mo36380b(z ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(m19786t())}});
            if (this.f16828q) {
                this.f16828q = false;
                m19774a("onRewardedVideoAvailabilityChanged to " + z + "and mShouldLoadAfterLoad is true - calling loadVideo");
                mo36377a(this.f16826o, this.f16833v, this.f16832u, this.f16836y, this.f16816B, this.f16837z, this.f16815A);
                m19782g();
            } else if (z) {
                this.f16821j.mo36314a(this, this.f16831t);
            } else {
                this.f16821j.mo36319b(this, this.f16831t);
            }
        } else if (z) {
            mo36380b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f16819a.name()}});
        } else {
            mo36380b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1034}, new Object[]{"duration", Long.valueOf(m19786t())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f16819a.name()}});
        }
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        m19774a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        m19785s();
        mo36380b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1033}, new Object[]{"duration", Long.valueOf(m19786t())}});
        mo36380b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(m19786t())}});
        synchronized (this.f16818D) {
            if (this.f16819a != C6528a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)};
                mo36380b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initFailed: " + this.f16819a}});
                return;
            }
            m19771a(C6528a.NO_INIT);
            this.f16821j.mo36319b(this, this.f16831t);
        }
    }

    public final void onRewardedVideoInitSuccess() {
        m19774a("onRewardedVideoInitSuccess");
        synchronized (this.f16818D) {
            if (this.f16819a != C6528a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)};
                mo36380b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initSuccess: " + this.f16819a}});
                return;
            }
            m19771a(C6528a.NOT_LOADED);
        }
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            m19770a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(m19786t())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f16852i = Long.valueOf(System.currentTimeMillis());
        }
        m19770a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(m19786t())}}, false);
    }

    public final void onRewardedVideoLoadSuccess() {
    }
}
