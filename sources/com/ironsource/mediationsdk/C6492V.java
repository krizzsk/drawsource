package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C6650a;
import com.ironsource.mediationsdk.model.C6656g;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.mediationsdk.p206a.C6518d;
import com.ironsource.mediationsdk.p215b.C6617c;
import com.ironsource.mediationsdk.p216c.C6621b;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.C6740f;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.V */
public final class C6492V extends C6529ac implements C6617c.C6618a, BannerSmashListener {

    /* renamed from: a */
    String f16610a;

    /* renamed from: b */
    private C6621b f16611b;

    /* renamed from: j */
    private C6617c f16612j;

    /* renamed from: k */
    private C6493a f16613k;

    /* renamed from: l */
    private C6491U f16614l;

    /* renamed from: m */
    private IronSourceBannerLayout f16615m;

    /* renamed from: n */
    private JSONObject f16616n;

    /* renamed from: o */
    private int f16617o;

    /* renamed from: p */
    private String f16618p;

    /* renamed from: q */
    private C6656g f16619q;

    /* renamed from: r */
    private final Object f16620r;

    /* renamed from: s */
    private C6740f f16621s;

    /* renamed from: t */
    private boolean f16622t;

    /* renamed from: com.ironsource.mediationsdk.V$a */
    public enum C6493a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    C6492V(C6621b bVar, C6491U u, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2, boolean z) {
        super(new C6650a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f16620r = new Object();
        this.f16613k = C6493a.NONE;
        this.f16611b = bVar;
        this.f16612j = new C6617c(bVar.mo36639f());
        this.f16614l = u;
        this.f16851h = i;
        this.f16610a = str;
        this.f16617o = i2;
        this.f16618p = str2;
        this.f16616n = jSONObject;
        this.f16622t = z;
        this.f16846c.addBannerListener(this);
        if (mo36385h()) {
            m19554f();
        }
    }

    C6492V(C6621b bVar, C6491U u, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, boolean z) {
        this(bVar, u, networkSettings, abstractAdapter, i, "", (JSONObject) null, 0, "", z);
    }

    /* renamed from: a */
    private void m19548a(C6493a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m19557r() + "state = " + aVar.name());
        synchronized (this.f16620r) {
            this.f16613k = aVar;
        }
    }

    /* renamed from: a */
    private void m19549a(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 606) {
            mo36271a(this.f16622t ? IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL : IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f16621s))}});
        } else {
            mo36271a(this.f16622t ? IronSourceConstants.BN_INSTANCE_RELOAD_ERROR : IronSourceConstants.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f16621s))}});
        }
        C6491U u = this.f16614l;
        if (u != null) {
            u.mo36258a(ironSourceError, this);
        }
    }

    /* renamed from: a */
    private void m19550a(String str) {
        IronLog.INTERNAL.verbose(mo36393p());
        if (m19552a(C6493a.READY_TO_LOAD, C6493a.LOADING)) {
            this.f16621s = new C6740f();
            mo36271a(this.f16622t ? IronSourceConstants.BN_INSTANCE_RELOAD : 3002, (Object[][]) null);
            if (this.f16846c != null) {
                try {
                    if (mo36385h()) {
                        this.f16846c.loadBannerForBidding(this.f16615m, this.f16849f, this, str);
                    } else {
                        this.f16846c.loadBanner(this.f16615m, this.f16849f, this);
                    }
                } catch (Exception e) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.error("Exception while trying to load banner from " + this.f16846c.getProviderName() + ", exception =  " + e.getLocalizedMessage());
                    e.printStackTrace();
                    onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, e.getLocalizedMessage()));
                    mo36271a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
                }
            }
        } else {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("wrong state - state = " + this.f16613k);
        }
    }

    /* renamed from: a */
    private static boolean m19551a(int i) {
        return i == 3005 || i == 3002 || i == 3012 || i == 3015 || i == 3008 || i == 3305 || i == 3300 || i == 3306 || i == 3307 || i == 3302 || i == 3303 || i == 3304 || i == 3009;
    }

    /* renamed from: a */
    private boolean m19552a(C6493a aVar, C6493a aVar2) {
        boolean z;
        synchronized (this.f16620r) {
            if (this.f16613k == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(m19557r() + "set state from '" + this.f16613k + "' to '" + aVar2 + "'");
                z = true;
                this.f16613k = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    private void m19553b(int i) {
        mo36271a(i, (Object[][]) null);
    }

    /* renamed from: f */
    private void m19554f() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m19557r() + "isBidder = " + mo36385h());
        m19548a(C6493a.INIT_IN_PROGRESS);
        m19555g();
        try {
            if (this.f16846c == null) {
                return;
            }
            if (mo36385h()) {
                this.f16846c.initBannerForBidding(this.f16611b.mo36634a(), this.f16611b.mo36635b(), this.f16849f, this);
            } else {
                this.f16846c.initBanners(this.f16611b.mo36634a(), this.f16611b.mo36635b(), this.f16849f, this);
            }
        } catch (Throwable th) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("Exception while trying to init banner from " + this.f16846c.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, th.getLocalizedMessage()));
            mo36271a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
        }
    }

    /* renamed from: g */
    private void m19555g() {
        if (this.f16846c != null) {
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
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("Exception while trying to set custom params from " + this.f16846c.getProviderName() + ", exception =  " + e.getLocalizedMessage());
                e.printStackTrace();
                mo36271a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_internal)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
            }
        }
    }

    /* renamed from: q */
    private boolean m19556q() {
        boolean z;
        synchronized (this.f16620r) {
            z = this.f16613k == C6493a.LOADED;
        }
        return z;
    }

    /* renamed from: r */
    private String m19557r() {
        return String.format("%s - ", new Object[]{mo36393p()});
    }

    /* renamed from: s */
    private boolean m19558s() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f16615m;
        return ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: a */
    public final void mo36182a() {
        IronLog.INTERNAL.verbose(mo36393p());
        m19548a(C6493a.DESTROYED);
        if (this.f16846c == null) {
            IronLog.INTERNAL.warning("mAdapter == null");
            return;
        }
        try {
            this.f16846c.destroyBanner(this.f16847d.f17320a.getBannerSettings());
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to destroy banner from " + this.f16846c.getProviderName() + ", exception =  " + e.getLocalizedMessage());
            e.printStackTrace();
            mo36271a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_destroy)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
        }
        m19553b(IronSourceConstants.BN_INSTANCE_DESTROY);
    }

    /* renamed from: a */
    public final void mo36271a(int i, Object[][] objArr) {
        Map<String, Object> n = mo36391n();
        if (m19558s()) {
            n.put(IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed");
        } else {
            C6689r.m20303a(n, this.f16615m.getSize());
        }
        if (!TextUtils.isEmpty(this.f16610a)) {
            n.put("auctionId", this.f16610a);
        }
        JSONObject jSONObject = this.f16616n;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16616n);
        }
        C6656g gVar = this.f16619q;
        if (gVar != null) {
            n.put("placement", gVar.getPlacementName());
        }
        if (m19551a(i)) {
            C6518d.m19731d();
            C6518d.m19689a(n, this.f16617o, this.f16618p);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f16851h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(mo36388k() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e));
            }
        }
        C6518d.m19731d().mo36349b(new C6517c(i, new JSONObject(n)));
    }

    /* renamed from: a */
    public final void mo36272a(IronSourceBannerLayout ironSourceBannerLayout, C6656g gVar, String str) {
        C6491U u;
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(mo36393p());
        this.f16619q = gVar;
        if (!C6689r.m20304a(ironSourceBannerLayout)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            IronLog.INTERNAL.verbose(str2);
            u = this.f16614l;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, str2);
        } else if (this.f16846c == null) {
            IronLog.INTERNAL.verbose("mAdapter is null");
            u = this.f16614l;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "mAdapter is null");
        } else {
            this.f16615m = ironSourceBannerLayout;
            this.f16612j.mo36632a(this);
            try {
                if (mo36385h()) {
                    m19550a(str);
                    return;
                } else {
                    m19554f();
                    return;
                }
            } catch (Throwable th) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception = " + th.getLocalizedMessage());
                th.printStackTrace();
                onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th.getLocalizedMessage()));
                return;
            }
        }
        u.mo36258a(ironSourceError, this);
    }

    /* renamed from: b */
    public final void mo36273b() {
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(mo36393p());
        if (m19552a(C6493a.INIT_IN_PROGRESS, C6493a.LOAD_FAILED)) {
            IronLog.INTERNAL.verbose("init timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
        } else if (m19552a(C6493a.LOADING, C6493a.LOAD_FAILED)) {
            IronLog.INTERNAL.verbose("load timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "Timed out");
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("unexpected state - " + this.f16613k);
            return;
        }
        m19549a(ironSourceError);
    }

    /* renamed from: c */
    public final Map<String, Object> mo36274c() {
        try {
            if (!mo36385h() || this.f16846c == null) {
                return null;
            }
            return this.f16846c.getBannerBiddingData(this.f16849f);
        } catch (Throwable th) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to getBannerBiddingData from " + this.f16846c.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            mo36271a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5001}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    /* renamed from: d */
    public final void mo36275d() {
        this.f16612j.mo36628c();
        super.mo36275d();
    }

    public final void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(mo36393p());
        mo36271a((int) IronSourceConstants.BN_INSTANCE_CLICK, (Object[][]) null);
        C6491U u = this.f16614l;
        if (u != null) {
            u.mo36256a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(mo36393p());
        mo36271a((int) IronSourceConstants.BN_INSTANCE_LEAVE_APP, (Object[][]) null);
        C6491U u = this.f16614l;
        if (u != null) {
            u.mo36262d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m19557r() + "error = " + ironSourceError);
        this.f16612j.mo36633d();
        if (m19552a(C6493a.LOADING, C6493a.LOAD_FAILED)) {
            m19549a(ironSourceError);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(mo36393p());
        this.f16612j.mo36633d();
        if (m19552a(C6493a.LOADING, C6493a.LOADED)) {
            mo36271a(this.f16622t ? IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f16621s))}});
            C6491U u = this.f16614l;
            if (u != null) {
                u.mo36257a(this, view, layoutParams);
                return;
            }
            return;
        }
        mo36271a(this.f16622t ? IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, (Object[][]) null);
    }

    public final void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(mo36393p());
        mo36271a((int) IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, (Object[][]) null);
        C6491U u = this.f16614l;
        if (u != null) {
            u.mo36260b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(mo36393p());
        mo36271a((int) IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, (Object[][]) null);
        C6491U u = this.f16614l;
        if (u != null) {
            u.mo36261c(this);
        }
    }

    public final void onBannerAdShown() {
        IronLog.INTERNAL.verbose(mo36393p());
        if (m19556q()) {
            mo36271a((int) IronSourceConstants.BN_INSTANCE_SHOW, (Object[][]) null);
            C6491U u = this.f16614l;
            if (u != null) {
                u.mo36264e(this);
                return;
            }
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("wrong state - mState = " + this.f16613k);
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        mo36271a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + this.f16613k}, new Object[]{IronSourceConstants.EVENTS_EXT1, mo36388k()}});
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m19557r() + "error = " + ironSourceError);
        this.f16612j.mo36633d();
        if (m19552a(C6493a.INIT_IN_PROGRESS, C6493a.NONE)) {
            C6491U u = this.f16614l;
            if (u != null) {
                u.mo36258a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, "Banner init failed"), this);
                return;
            }
            return;
        }
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.warning("wrong state - mState = " + this.f16613k);
    }

    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(mo36393p());
        if (m19552a(C6493a.INIT_IN_PROGRESS, C6493a.READY_TO_LOAD) && !mo36385h()) {
            if (!C6689r.m20304a(this.f16615m)) {
                this.f16614l.mo36258a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.f16615m == null ? "banner is null" : "banner is destroyed"), this);
            } else {
                m19550a((String) null);
            }
        }
    }
}
