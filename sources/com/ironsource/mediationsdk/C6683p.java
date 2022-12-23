package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C6686q;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6656g;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.mediationsdk.p206a.C6518d;
import com.ironsource.mediationsdk.sdk.C6693a;
import com.ironsource.mediationsdk.utils.C6740f;
import com.ironsource.mediationsdk.utils.C6745k;
import com.ironsource.mediationsdk.utils.C6753o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.p */
public final class C6683p implements C6693a {

    /* renamed from: a */
    private C6686q f17444a;

    /* renamed from: b */
    private IronSourceBannerLayout f17445b;

    /* renamed from: c */
    private C6656g f17446c;

    /* renamed from: d */
    private C6685a f17447d = C6685a.NOT_INITIATED;

    /* renamed from: e */
    private IronSourceLoggerManager f17448e = IronSourceLoggerManager.getLogger();

    /* renamed from: f */
    private String f17449f;

    /* renamed from: g */
    private String f17450g;

    /* renamed from: h */
    private final CopyOnWriteArrayList<C6686q> f17451h = new CopyOnWriteArrayList<>();

    /* renamed from: i */
    private long f17452i;

    /* renamed from: j */
    private Timer f17453j;

    /* renamed from: k */
    private AtomicBoolean f17454k = new AtomicBoolean();

    /* renamed from: l */
    private AtomicBoolean f17455l = new AtomicBoolean();

    /* renamed from: m */
    private C6740f f17456m;

    /* renamed from: n */
    private C6740f f17457n;

    /* renamed from: o */
    private int f17458o;

    /* renamed from: p */
    private int f17459p;

    /* renamed from: com.ironsource.mediationsdk.p$a */
    enum C6685a {
        NOT_INITIATED,
        READY_TO_LOAD,
        FIRST_LOAD_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        RELOAD_IN_PROGRESS
    }

    public C6683p(List<NetworkSettings> list, String str, String str2, long j, int i, int i2) {
        this.f17449f = str;
        this.f17450g = str2;
        this.f17452i = (long) i;
        C6681o.m20255a().f17437a = i2;
        for (int i3 = 0; i3 < list.size(); i3++) {
            NetworkSettings networkSettings = list.get(i3);
            AbstractAdapter a = C6622d.m20139a().mo36647a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a == null || !C6624e.m20158a().mo36654a(a)) {
                m20268a(networkSettings.getProviderInstanceName() + " can't load adapter or wrong version");
            } else {
                this.f17451h.add(new C6686q(this, networkSettings, a, j, i3 + 1));
            }
        }
        this.f17446c = null;
        m20266a(C6685a.READY_TO_LOAD);
    }

    /* renamed from: a */
    private void m20260a(int i) {
        m20264a(i, (Object[][]) null);
    }

    /* renamed from: a */
    private void m20261a(int i, C6686q qVar) {
        m20262a(i, qVar, (Object[][]) null);
    }

    /* renamed from: a */
    private void m20262a(int i, C6686q qVar, Object[][] objArr) {
        m20263a(i, qVar, objArr, this.f17459p);
    }

    /* renamed from: a */
    private void m20263a(int i, C6686q qVar, Object[][] objArr, int i2) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(qVar);
        try {
            if (this.f17445b != null) {
                m20269a(providerAdditionalData, this.f17445b.getSize());
            }
            if (this.f17446c != null) {
                providerAdditionalData.put("placement", this.f17446c.getPlacementName());
            }
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            this.f17448e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendProviderEvent " + Log.getStackTraceString(e), 3);
        }
        C6518d.m19731d().mo36349b(new C6517c(i, providerAdditionalData));
    }

    /* renamed from: a */
    private void m20264a(int i, Object[][] objArr) {
        m20265a(i, objArr, this.f17459p);
    }

    /* renamed from: a */
    private void m20265a(int i, Object[][] objArr, int i2) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (this.f17445b != null) {
                m20269a(mediationAdditionalData, this.f17445b.getSize());
            }
            if (this.f17446c != null) {
                mediationAdditionalData.put("placement", this.f17446c.getPlacementName());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            this.f17448e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendMediationEvent " + Log.getStackTraceString(e), 3);
        }
        C6518d.m19731d().mo36349b(new C6517c(i, mediationAdditionalData));
    }

    /* renamed from: a */
    private void m20266a(C6685a aVar) {
        this.f17447d = aVar;
        m20268a("state=" + aVar.name());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m20267a(com.ironsource.mediationsdk.C6683p r8) {
        /*
            com.ironsource.mediationsdk.p$a r0 = r8.f17447d
            com.ironsource.mediationsdk.p$a r1 = com.ironsource.mediationsdk.C6683p.C6685a.RELOAD_IN_PROGRESS
            if (r0 == r1) goto L_0x001e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onReloadTimer wrong state="
            r0.<init>(r1)
            com.ironsource.mediationsdk.p$a r1 = r8.f17447d
            java.lang.String r1 = r1.name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.m20268a((java.lang.String) r0)
            return
        L_0x001e:
            r0 = 0
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r2 = "checking with IronsourceLifecycleManager if app in foreground"
            r1.verbose(r2)
            com.ironsource.lifecycle.d r1 = com.ironsource.lifecycle.C6408d.m19164a()
            boolean r1 = r1.mo35921b()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x00e1
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r8.f17445b
            java.lang.String r4 = "banner is null"
            if (r1 != 0) goto L_0x003f
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r1.verbose(r4)
        L_0x003d:
            r1 = r3
            goto L_0x0078
        L_0x003f:
            boolean r1 = r1.isShown()
            if (r1 != 0) goto L_0x004d
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r5 = "banner or one of its parents are INVISIBLE or GONE"
        L_0x0049:
            r1.verbose(r5)
            goto L_0x003d
        L_0x004d:
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r8.f17445b
            boolean r1 = r1.hasWindowFocus()
            if (r1 != 0) goto L_0x005a
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r5 = "banner has no window focus"
            goto L_0x0049
        L_0x005a:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r8.f17445b
            boolean r1 = r5.getGlobalVisibleRect(r1)
            com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "visible = "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.verbose(r6)
        L_0x0078:
            if (r1 == 0) goto L_0x00de
            com.ironsource.mediationsdk.utils.o r1 = com.ironsource.mediationsdk.utils.C6753o.m20481a()
            r5 = 3
            int r1 = r1.mo36990b((int) r5)
            r8.f17459p = r1
            r1 = 3011(0xbc3, float:4.22E-42)
            r8.m20260a((int) r1)
            r1 = 3012(0xbc4, float:4.221E-42)
            com.ironsource.mediationsdk.q r5 = r8.f17444a
            r8.m20261a((int) r1, (com.ironsource.mediationsdk.C6686q) r5)
            com.ironsource.mediationsdk.utils.f r1 = new com.ironsource.mediationsdk.utils.f
            r1.<init>()
            r8.f17456m = r1
            com.ironsource.mediationsdk.utils.f r1 = new com.ironsource.mediationsdk.utils.f
            r1.<init>()
            r8.f17457n = r1
            com.ironsource.mediationsdk.q r1 = r8.f17444a
            java.lang.String r5 = "reloadBanner()"
            r1.mo36831a((java.lang.String) r5)
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f17471e
            if (r5 == 0) goto L_0x00c9
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f17471e
            boolean r5 = r5.isDestroyed()
            if (r5 == 0) goto L_0x00b3
            goto L_0x00c9
        L_0x00b3:
            r1.mo36832b()
            com.ironsource.mediationsdk.q$a r4 = com.ironsource.mediationsdk.C6686q.C6688a.LOADED
            r1.mo36830a((com.ironsource.mediationsdk.C6686q.C6688a) r4)
            com.ironsource.mediationsdk.AbstractAdapter r4 = r1.f17467a
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f17471e
            com.ironsource.mediationsdk.model.NetworkSettings r6 = r1.f17468b
            org.json.JSONObject r6 = r6.getBannerSettings()
            r4.reloadBanner(r5, r6, r1)
            goto L_0x00dc
        L_0x00c9:
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f17471e
            if (r5 != 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            java.lang.String r4 = "banner is destroyed"
        L_0x00d0:
            com.ironsource.mediationsdk.sdk.a r5 = r1.f17469c
            com.ironsource.mediationsdk.logger.IronSourceError r6 = new com.ironsource.mediationsdk.logger.IronSourceError
            r7 = 610(0x262, float:8.55E-43)
            r6.<init>(r7, r4)
            r5.mo36818a((com.ironsource.mediationsdk.logger.IronSourceError) r6, (com.ironsource.mediationsdk.C6686q) r1, (boolean) r3)
        L_0x00dc:
            r1 = r3
            goto L_0x00e4
        L_0x00de:
            java.lang.String r0 = "banner is not visible - start reload timer"
            goto L_0x00e3
        L_0x00e1:
            java.lang.String r0 = "app in background - start reload timer"
        L_0x00e3:
            r1 = r2
        L_0x00e4:
            if (r1 == 0) goto L_0x0106
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r1.verbose(r0)
            r0 = 3200(0xc80, float:4.484E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r2][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r3] = r5
            r5 = 614(0x266, float:8.6E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            r1[r3] = r4
            r8.m20264a((int) r0, (java.lang.Object[][]) r1)
            r8.m20275d()
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6683p.m20267a(com.ironsource.mediationsdk.p):void");
    }

    /* renamed from: a */
    private void m20268a(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f17448e;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, "BannerManager " + str, 0);
    }

    /* renamed from: a */
    private void m20269a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
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
        } catch (Exception e) {
            this.f17448e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendProviderEvent " + Log.getStackTraceString(e), 3);
        }
    }

    /* renamed from: a */
    private boolean m20270a() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f17445b;
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: b */
    private void m20271b() {
        Iterator<C6686q> it = this.f17451h.iterator();
        while (it.hasNext()) {
            it.next().f17470d = true;
        }
    }

    /* renamed from: b */
    private void m20272b(C6686q qVar, View view, FrameLayout.LayoutParams layoutParams) {
        this.f17444a = qVar;
        this.f17445b.mo36065a(view, layoutParams);
    }

    /* renamed from: b */
    private void m20273b(C6686q qVar, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("bindView = " + z + " smash - " + qVar.mo36828a());
        m20262a((int) IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS, qVar, new Object[][]{new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f17457n))}});
        m20264a((int) IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f17456m))}});
        this.f17458o = C6753o.m20481a().mo36990b(3);
        C6753o.m20481a().mo36988a(3);
        if (z) {
            m20272b(qVar, view, layoutParams);
        }
        m20275d();
    }

    /* renamed from: c */
    private boolean m20274c() {
        Iterator<C6686q> it = this.f17451h.iterator();
        while (it.hasNext()) {
            C6686q next = it.next();
            if (next.f17470d && this.f17444a != next) {
                m20262a(this.f17447d == C6685a.FIRST_LOAD_IN_PROGRESS ? 3002 : IronSourceConstants.BN_INSTANCE_RELOAD, next, (Object[][]) null);
                this.f17457n = new C6740f();
                next.mo36829a(this.f17445b.mo36064a(), this.f17449f, this.f17450g);
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m20275d() {
        try {
            m20276e();
            if (this.f17452i > 0) {
                Timer timer = new Timer();
                this.f17453j = timer;
                timer.schedule(new TimerTask() {
                    public final void run() {
                        C6683p.m20267a(C6683p.this);
                    }
                }, this.f17452i * 1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    private void m20276e() {
        Timer timer = this.f17453j;
        if (timer != null) {
            timer.cancel();
            this.f17453j = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo36816a(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout == null) {
            this.f17448e.log(IronSourceLogger.IronSourceTag.API, "destroyBanner banner cannot be null", 3);
        } else if (ironSourceBannerLayout.isDestroyed()) {
            this.f17448e.log(IronSourceLogger.IronSourceTag.API, "Banner is already destroyed and can't be used anymore. Please create a new one using IronSource.createBanner API", 3);
        } else {
            m20265a((int) IronSourceConstants.BN_DESTROY, (Object[][]) null, this.f17458o);
            m20276e();
            if (this.f17444a != null) {
                m20262a((int) IronSourceConstants.BN_INSTANCE_DESTROY, this.f17444a, (Object[][]) null);
                C6686q qVar = this.f17444a;
                qVar.mo36831a("destroyBanner()");
                if (qVar.f17467a == null) {
                    qVar.mo36831a("destroyBanner() mAdapter == null");
                } else {
                    qVar.f17467a.destroyBanner(qVar.f17468b.getBannerSettings());
                    qVar.mo36830a(C6686q.C6688a.DESTROYED);
                }
                this.f17444a = null;
            }
            ironSourceBannerLayout.mo36068b();
            this.f17445b = null;
            this.f17446c = null;
            m20266a(C6685a.READY_TO_LOAD);
        }
    }

    /* renamed from: a */
    public final synchronized void mo36817a(IronSourceBannerLayout ironSourceBannerLayout, C6656g gVar) {
        if (ironSourceBannerLayout != null) {
            try {
                if (!ironSourceBannerLayout.isDestroyed()) {
                    if (gVar != null) {
                        if (!TextUtils.isEmpty(gVar.getPlacementName())) {
                            if (this.f17447d == C6685a.READY_TO_LOAD) {
                                if (!C6681o.m20255a().mo36814b()) {
                                    this.f17459p = C6753o.m20481a().mo36990b(3);
                                    m20266a(C6685a.FIRST_LOAD_IN_PROGRESS);
                                    this.f17445b = ironSourceBannerLayout;
                                    this.f17446c = gVar;
                                    m20264a(3001, (Object[][]) null);
                                    if (C6745k.m20449b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), gVar.getPlacementName())) {
                                        C6681o a = C6681o.m20255a();
                                        a.mo36811a(ironSourceBannerLayout, new IronSourceError(604, "placement " + gVar.getPlacementName() + " is capped"));
                                        m20264a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 604}});
                                        m20266a(C6685a.READY_TO_LOAD);
                                        return;
                                    }
                                    this.f17456m = new C6740f();
                                    Iterator<C6686q> it = this.f17451h.iterator();
                                    while (it.hasNext()) {
                                        it.next().f17470d = true;
                                    }
                                    this.f17457n = new C6740f();
                                    C6686q qVar = this.f17451h.get(0);
                                    m20262a(3002, qVar, (Object[][]) null);
                                    qVar.mo36829a(ironSourceBannerLayout.mo36064a(), this.f17449f, this.f17450g);
                                    return;
                                }
                            }
                            this.f17448e.log(IronSourceLogger.IronSourceTag.API, "A banner is already loaded", 3);
                            return;
                        }
                    }
                    Object[] objArr = new Object[1];
                    objArr[0] = gVar == null ? "placement is null" : "placement name is empty";
                    this.f17448e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr), 3);
                    return;
                }
            } catch (Exception e) {
                C6681o a2 = C6681o.m20255a();
                a2.mo36812a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, "loadBanner() failed " + e.getMessage()), false);
                m20264a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_EXCEPTION)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getMessage()}});
                m20266a(C6685a.READY_TO_LOAD);
                return;
            }
        }
        Object[] objArr2 = new Object[1];
        objArr2[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
        this.f17448e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr2), 3);
    }

    /* renamed from: a */
    public final void mo36818a(IronSourceError ironSourceError, C6686q qVar, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + qVar.mo36828a());
        if (this.f17447d == C6685a.FIRST_LOAD_IN_PROGRESS || this.f17447d == C6685a.LOAD_IN_PROGRESS) {
            if (z) {
                m20262a((int) IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, qVar, new Object[][]{new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f17457n))}});
            } else {
                m20262a((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR, qVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f17457n))}});
            }
            if (!m20274c()) {
                if (this.f17447d == C6685a.FIRST_LOAD_IN_PROGRESS) {
                    C6681o.m20255a().mo36812a(this.f17445b, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, "No ads to show"), false);
                    m20264a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_NO_FILL)}, new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f17456m))}});
                    m20266a(C6685a.READY_TO_LOAD);
                    return;
                }
                m20264a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f17456m))}});
                m20266a(C6685a.RELOAD_IN_PROGRESS);
                m20275d();
                return;
            }
            return;
        }
        m20268a("onBannerAdLoadFailed " + qVar.mo36828a() + " wrong state=" + this.f17447d.name());
    }

    /* renamed from: a */
    public final void mo36819a(C6686q qVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + qVar.mo36828a());
        Object[][] objArr = null;
        if (m20270a()) {
            C6668n.m20237a().mo36798d((AdInfo) null);
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m20265a((int) IronSourceConstants.BN_CALLBACK_CLICK, objArr, this.f17458o);
        m20263a((int) IronSourceConstants.BN_INSTANCE_CLICK, qVar, objArr, this.f17458o);
    }

    /* renamed from: a */
    public final void mo36820a(C6686q qVar, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + qVar.mo36828a());
        if (this.f17447d == C6685a.FIRST_LOAD_IN_PROGRESS) {
            m20262a((int) IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, qVar, new Object[][]{new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f17457n))}});
            m20272b(qVar, view, layoutParams);
            C6656g gVar = this.f17446c;
            String placementName = gVar != null ? gVar.getPlacementName() : "";
            C6745k.m20455f(ContextProvider.getInstance().getCurrentActiveActivity(), placementName);
            if (C6745k.m20449b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), placementName)) {
                m20264a((int) IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
            }
            m20264a((int) IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f17456m))}});
            this.f17445b.mo36066a((AdInfo) null, false);
            this.f17458o = C6753o.m20481a().mo36990b(3);
            C6753o.m20481a().mo36988a(3);
            m20266a(C6685a.RELOAD_IN_PROGRESS);
            m20275d();
        } else if (this.f17447d == C6685a.LOAD_IN_PROGRESS) {
            m20266a(C6685a.RELOAD_IN_PROGRESS);
            m20273b(qVar, view, layoutParams, true);
        } else {
            m20262a((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, qVar, (Object[][]) null);
        }
    }

    /* renamed from: a */
    public final void mo36821a(C6686q qVar, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + qVar.mo36828a());
        if (this.f17447d != C6685a.RELOAD_IN_PROGRESS) {
            m20268a("onBannerAdReloaded " + qVar.mo36828a() + " wrong state=" + this.f17447d.name());
            m20262a((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, qVar, (Object[][]) null);
            return;
        }
        IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
        m20273b(qVar, view, layoutParams, z);
    }

    /* renamed from: b */
    public final void mo36822b(IronSourceError ironSourceError, C6686q qVar, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + qVar.mo36828a());
        if (this.f17447d != C6685a.RELOAD_IN_PROGRESS) {
            m20268a("onBannerAdReloadFailed " + qVar.mo36828a() + " wrong state=" + this.f17447d.name());
            return;
        }
        if (z) {
            m20262a((int) IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL, qVar, new Object[][]{new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f17457n))}});
        } else {
            m20262a((int) IronSourceConstants.BN_INSTANCE_RELOAD_ERROR, qVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f17457n))}});
        }
        if (this.f17451h.size() == 1) {
            m20264a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(C6740f.m20412a(this.f17456m))}});
            m20275d();
            return;
        }
        m20266a(C6685a.LOAD_IN_PROGRESS);
        m20271b();
        m20274c();
    }

    /* renamed from: b */
    public final void mo36823b(C6686q qVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + qVar.mo36828a());
        Object[][] objArr = null;
        if (m20270a()) {
            C6668n.m20237a().mo36796b((AdInfo) null);
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m20265a((int) IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, this.f17458o);
        m20263a((int) IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, qVar, objArr, this.f17458o);
    }

    /* renamed from: c */
    public final void mo36824c(C6686q qVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + qVar.mo36828a());
        Object[][] objArr = null;
        if (m20270a()) {
            C6668n.m20237a().mo36793a((AdInfo) null);
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m20265a((int) IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, this.f17458o);
        m20263a((int) IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, qVar, objArr, this.f17458o);
    }

    /* renamed from: d */
    public final void mo36825d(C6686q qVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + qVar.mo36828a());
        Object[][] objArr = null;
        if (m20270a()) {
            C6668n.m20237a().mo36797c((AdInfo) null);
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m20265a((int) IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, this.f17458o);
        m20263a((int) IronSourceConstants.BN_INSTANCE_LEAVE_APP, qVar, objArr, this.f17458o);
    }

    /* renamed from: e */
    public final void mo36826e(C6686q qVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + qVar.mo36828a());
        m20264a((int) IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
        m20262a((int) IronSourceConstants.BN_INSTANCE_SHOW, qVar, (Object[][]) null);
    }
}
