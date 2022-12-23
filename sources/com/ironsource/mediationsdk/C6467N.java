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

/* renamed from: com.ironsource.mediationsdk.N */
public final class C6467N extends C6529ac implements RewardedVideoSmashListener {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public C6469a f16475a;

    /* renamed from: b */
    String f16476b;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C6470O f16477j;

    /* renamed from: k */
    private Timer f16478k;

    /* renamed from: l */
    private int f16479l;

    /* renamed from: m */
    private String f16480m;

    /* renamed from: n */
    private String f16481n;

    /* renamed from: o */
    private Placement f16482o;

    /* renamed from: p */
    private long f16483p;

    /* renamed from: q */
    private JSONObject f16484q;

    /* renamed from: r */
    private int f16485r;

    /* renamed from: s */
    private String f16486s;

    /* renamed from: t */
    private final Object f16487t;

    /* renamed from: u */
    private final Object f16488u;

    /* renamed from: v */
    private long f16489v;

    /* renamed from: com.ironsource.mediationsdk.N$a */
    public enum C6469a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6467N(com.ironsource.mediationsdk.C6467N r10, com.ironsource.mediationsdk.C6470O r11, com.ironsource.mediationsdk.AbstractAdapter r12, int r13, java.lang.String r14, org.json.JSONObject r15, int r16, java.lang.String r17) {
        /*
            r9 = this;
            r8 = r9
            r0 = r10
            java.lang.String r1 = r0.f16480m
            java.lang.String r2 = r0.f16481n
            com.ironsource.mediationsdk.model.a r3 = r0.f16847d
            com.ironsource.mediationsdk.model.NetworkSettings r3 = r3.f17320a
            int r5 = r0.f16479l
            r0 = r9
            r4 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r14
            r8.f16476b = r0
            r0 = r15
            r8.f16484q = r0
            r0 = r16
            r8.f16485r = r0
            r0 = r17
            r8.f16486s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6467N.<init>(com.ironsource.mediationsdk.N, com.ironsource.mediationsdk.O, com.ironsource.mediationsdk.AbstractAdapter, int, java.lang.String, org.json.JSONObject, int, java.lang.String):void");
    }

    public C6467N(String str, String str2, NetworkSettings networkSettings, C6470O o, int i, AbstractAdapter abstractAdapter, int i2) {
        super(new C6650a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f16487t = new Object();
        this.f16488u = new Object();
        this.f16480m = str;
        this.f16481n = str2;
        this.f16477j = o;
        this.f16478k = null;
        this.f16479l = i;
        this.f16846c.updateRewardedVideoListener(this);
        this.f16851h = i2;
        this.f16475a = C6469a.NO_INIT;
        this.f16489v = 0;
        if (this.f16847d.f17322c) {
            m19445c("initForBidding()");
            m19439a(C6469a.INIT_IN_PROGRESS);
            m19448g();
            try {
                this.f16846c.initRewardedVideoForBidding(this.f16480m, this.f16481n, this.f16849f, this);
            } catch (Throwable th) {
                m19446d("initForBidding exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
            }
        }
    }

    /* renamed from: a */
    private void m19437a(int i) {
        m19438a(i, (Object[][]) null, false);
    }

    /* renamed from: a */
    private void m19438a(int i, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> n = mo36391n();
        if (!TextUtils.isEmpty(this.f16476b)) {
            n.put("auctionId", this.f16476b);
        }
        JSONObject jSONObject = this.f16484q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16484q);
        }
        if (z && (placement = this.f16482o) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n.put("placement", this.f16482o.getPlacementName());
        }
        if (m19443b(i)) {
            C6522h.m19751d();
            C6522h.m19689a(n, this.f16485r, this.f16486s);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f16851h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, mo36388k() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C6522h.m19751d().mo36349b(new C6517c(i, new JSONObject(n)));
        if (i == 1203) {
            C6753o.m20481a().mo36988a(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19439a(C6469a aVar) {
        m19445c("current state=" + this.f16475a + ", new state=" + aVar);
        synchronized (this.f16487t) {
            this.f16475a = aVar;
        }
    }

    /* renamed from: b */
    private static boolean m19443b(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1212 || i == 1213 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m19445c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + mo36388k() + " " + hashCode() + "  : " + str, 0);
    }

    /* renamed from: d */
    private void m19446d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + mo36388k() + " " + hashCode() + " : " + str, 3);
    }

    /* renamed from: f */
    private boolean m19447f() {
        try {
            return this.f16846c.isRewardedVideoAvailable(this.f16849f);
        } catch (Exception e) {
            m19446d("isRewardedVideoAvailable exception: " + e.getLocalizedMessage());
            e.printStackTrace();
            mo36187b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5002}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
            return false;
        }
    }

    /* renamed from: g */
    private void m19448g() {
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
            m19445c("setCustomParams() " + e.getMessage());
        }
    }

    /* renamed from: q */
    private void m19449q() {
        synchronized (this.f16488u) {
            if (this.f16478k != null) {
                this.f16478k.cancel();
                this.f16478k = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public long m19450r() {
        return new Date().getTime() - this.f16483p;
    }

    /* renamed from: a */
    public final Map<String, Object> mo36182a() {
        try {
            if (mo36385h()) {
                return this.f16846c.getRewardedVideoBiddingData(this.f16849f);
            }
            return null;
        } catch (Throwable th) {
            m19446d("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            mo36187b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5001}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    /* renamed from: a */
    public final void mo36183a(int i, Object[][] objArr) {
        m19438a(i, objArr, true);
    }

    /* renamed from: a */
    public final void mo36184a(Placement placement) {
        m19449q();
        m19445c("showVideo()");
        this.f16482o = placement;
        m19439a(C6469a.SHOW_IN_PROGRESS);
        mo36183a((int) IronSourceConstants.RV_INSTANCE_SHOW, (Object[][]) null);
        try {
            this.f16846c.showRewardedVideo(this.f16849f, this);
        } catch (Throwable th) {
            m19446d("showVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(1038, th.getLocalizedMessage()));
        }
    }

    /* renamed from: a */
    public final void mo36185a(String str) {
        C6469a aVar;
        m19445c("loadVideo() auctionId: " + this.f16476b + " state: " + this.f16475a);
        this.f16852i = null;
        this.f16848e = false;
        synchronized (this.f16487t) {
            aVar = this.f16475a;
            if (!(this.f16475a == C6469a.LOAD_IN_PROGRESS || this.f16475a == C6469a.SHOW_IN_PROGRESS)) {
                m19439a(C6469a.LOAD_IN_PROGRESS);
            }
        }
        if (aVar == C6469a.LOAD_IN_PROGRESS) {
            mo36187b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during load"}});
        } else if (aVar == C6469a.SHOW_IN_PROGRESS) {
            mo36187b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during show"}});
        } else {
            synchronized (this.f16488u) {
                Timer timer = new Timer();
                this.f16478k = timer;
                timer.schedule(new TimerTask() {
                    public final void run() {
                        boolean z;
                        int i;
                        String str = "Rewarded Video - load instance time out";
                        if (C6467N.this.f16475a == C6469a.LOAD_IN_PROGRESS || C6467N.this.f16475a == C6469a.INIT_IN_PROGRESS) {
                            if (C6467N.this.f16475a == C6469a.LOAD_IN_PROGRESS) {
                                i = 1025;
                            } else {
                                i = 1032;
                                str = "Rewarded Video - init instance time out";
                            }
                            C6467N.this.m19439a(C6469a.NOT_LOADED);
                            z = true;
                        } else {
                            i = 0;
                            z = false;
                        }
                        C6467N.this.m19445c(str);
                        if (z) {
                            C6467N.this.mo36187b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(C6467N.this.m19450r())}});
                            C6467N.this.mo36187b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(C6467N.this.m19450r())}});
                            C6467N.this.f16477j.mo36171b(C6467N.this);
                            return;
                        }
                        C6467N.this.mo36187b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(C6467N.this.m19450r())}, new Object[]{IronSourceConstants.EVENTS_EXT1, C6467N.this.f16475a.name()}});
                    }
                }, (long) (this.f16479l * 1000));
            }
            this.f16483p = new Date().getTime();
            m19437a(1001);
            try {
                if (mo36385h()) {
                    this.f16846c.loadRewardedVideoForBidding(this.f16849f, this, str);
                    return;
                }
                m19448g();
                this.f16846c.initRewardedVideo(this.f16480m, this.f16481n, this.f16849f, this);
            } catch (Throwable th) {
                m19446d("loadVideo exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                mo36187b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(mo36385h() ? IronSourceConstants.errorCode_loadException : IronSourceConstants.errorCode_initFailed)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            }
        }
    }

    /* renamed from: a */
    public final void mo36186a(boolean z) {
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? "true" : "false";
        objArr[0] = objArr2;
        m19438a(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    /* renamed from: b */
    public final void mo36187b(int i, Object[][] objArr) {
        m19438a(i, objArr, false);
    }

    /* renamed from: b */
    public final boolean mo36188b() {
        return mo36385h() ? this.f16475a == C6469a.LOADED && m19447f() : m19447f();
    }

    /* renamed from: b_ */
    public final void mo36189b_() {
        this.f16846c.setMediationState(C6611b.C6612a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        m19438a(IronSourceConstants.RV_CAP_SESSION, (Object[][]) null, false);
    }

    /* renamed from: c */
    public final LoadWhileShowSupportState mo36190c() {
        try {
            return this.f16846c.getLoadWhileShowSupportState(this.f16849f);
        } catch (Exception e) {
            m19446d("Exception while calling adapter.getLoadWhileShowSupportState() - " + e.getLocalizedMessage());
            return LoadWhileShowSupportState.NONE;
        }
    }

    /* renamed from: e */
    public final int mo36191e() {
        return 2;
    }

    public final void onRewardedVideoAdClicked() {
        m19445c("onRewardedVideoAdClicked");
        this.f16477j.mo36172b(this, this.f16482o);
        mo36183a(1006, (Object[][]) null);
    }

    public final void onRewardedVideoAdClosed() {
        m19445c("onRewardedVideoAdClosed");
        synchronized (this.f16487t) {
            if (this.f16475a != C6469a.SHOW_IN_PROGRESS) {
                mo36183a((int) IronSourceConstants.RV_INSTANCE_CLOSED, (Object[][]) null);
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_adClosed)};
                mo36187b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "adClosed: " + this.f16475a}});
                return;
            }
            m19439a(C6469a.ENDED);
            this.f16489v = new Date().getTime();
            this.f16477j.mo36175d(this);
        }
    }

    public final void onRewardedVideoAdEnded() {
        m19445c("onRewardedVideoAdEnded");
        this.f16477j.mo36179f(this);
        mo36183a((int) IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    public final void onRewardedVideoAdOpened() {
        m19445c("onRewardedVideoAdOpened");
        this.f16477j.mo36173c(this);
        mo36183a(1005, (Object[][]) null);
    }

    public final void onRewardedVideoAdRewarded() {
        m19445c("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.f16477j.mo36167a(this, this.f16482o);
        Map<String, Object> n = mo36391n();
        Placement placement = this.f16482o;
        if (placement != null) {
            n.put("placement", placement.getPlacementName());
            n.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f16482o.getRewardName());
            n.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f16482o.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(C6459L.m19304a().f16423m)) {
            n.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C6459L.m19304a().f16423m);
        }
        if (C6459L.m19304a().f16424n != null) {
            for (String next : C6459L.m19304a().f16424n.keySet()) {
                n.put(ContentMetadata.KEY_CUSTOM_PREFIX + next, C6459L.m19304a().f16424n.get(next));
            }
        }
        if (!TextUtils.isEmpty(this.f16476b)) {
            n.put("auctionId", this.f16476b);
        }
        JSONObject jSONObject = this.f16484q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16484q);
        }
        if (m19443b(1010)) {
            C6522h.m19751d();
            C6522h.m19689a(n, this.f16485r, this.f16486s);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f16851h));
        C6517c cVar = new C6517c(1010, new JSONObject(n));
        cVar.mo36370a(IronSourceConstants.EVENTS_TRANS_ID, (Object) IronSourceUtils.getTransId(cVar.mo36371b(), mo36388k()));
        long j = this.f16489v;
        if (j != 0) {
            long j2 = time - j;
            m19445c("onRewardedVideoAdRewarded timeAfterClosed=" + j2);
            cVar.mo36370a("duration", (Object) Long.valueOf(j2));
        }
        C6522h.m19751d().mo36349b(cVar);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        m19445c("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        mo36183a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        synchronized (this.f16487t) {
            if (this.f16475a != C6469a.SHOW_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)};
                mo36187b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showFailed: " + this.f16475a}});
                return;
            }
            m19439a(C6469a.ENDED);
            this.f16477j.mo36168a(ironSourceError, this);
        }
    }

    public final void onRewardedVideoAdStarted() {
        m19445c("onRewardedVideoAdStarted");
        this.f16477j.mo36177e(this);
        mo36183a((int) IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    public final void onRewardedVideoAdVisible() {
        m19445c("onRewardedVideoAdVisible");
        mo36183a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        m19445c("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.f16475a.name());
        synchronized (this.f16487t) {
            if (this.f16475a == C6469a.LOAD_IN_PROGRESS) {
                m19439a(z ? C6469a.LOADED : C6469a.NOT_LOADED);
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (!z2) {
            m19449q();
            mo36187b(z ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(m19450r())}});
            if (z) {
                this.f16477j.mo36166a(this);
            } else {
                this.f16477j.mo36171b(this);
            }
        } else if (z) {
            mo36187b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f16475a.name()}});
        } else {
            mo36187b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1034}, new Object[]{"duration", Long.valueOf(m19450r())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f16475a.name()}});
        }
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        m19445c("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        m19449q();
        mo36187b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1033}, new Object[]{"duration", Long.valueOf(m19450r())}});
        mo36187b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(m19450r())}});
        synchronized (this.f16487t) {
            if (this.f16475a != C6469a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)};
                mo36187b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initFailed: " + this.f16475a}});
                return;
            }
            m19439a(C6469a.NO_INIT);
            this.f16477j.mo36171b(this);
        }
    }

    public final void onRewardedVideoInitSuccess() {
        m19445c("onRewardedVideoInitSuccess");
        synchronized (this.f16487t) {
            if (this.f16475a != C6469a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)};
                mo36187b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initSuccess: " + this.f16475a}});
                return;
            }
            m19439a(C6469a.NOT_LOADED);
        }
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            m19438a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(m19450r())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f16852i = Long.valueOf(System.currentTimeMillis());
        }
        m19438a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(m19450r())}}, false);
    }

    public final void onRewardedVideoLoadSuccess() {
    }
}
