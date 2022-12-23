package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.p204e.C6387c;
import com.ironsource.mediationsdk.C6419A;
import com.ironsource.mediationsdk.C6625f;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C6650a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.mediationsdk.p206a.C6518d;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.server.C6729b;
import com.ironsource.mediationsdk.utils.C6753o;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.v */
public final class C6756v extends C6419A implements C6629g, BannerSmashListener {

    /* renamed from: a */
    long f17794a;

    /* renamed from: b */
    public C6630h f17795b;

    /* renamed from: c */
    ISDemandOnlyBannerLayout f17796c;

    /* renamed from: l */
    private long f17797l;

    /* renamed from: m */
    private String f17798m;

    /* renamed from: n */
    private String f17799n;

    /* renamed from: o */
    private C6639l f17800o = new C6639l();

    public C6756v(String str, String str2, NetworkSettings networkSettings, long j, AbstractAdapter abstractAdapter) {
        super(new C6650a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f16243g = j;
        this.f17798m = str;
        this.f17799n = str2;
        this.f16240d.initBannerForBidding(str, str2, this.f16242f, this);
    }

    /* renamed from: a */
    private void m20491a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 606) {
            mo36993a((int) IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            mo36993a((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j)}});
        }
    }

    /* renamed from: a */
    private void m20494a(List<String> list, String str) {
        m19178a(list, mo35947e(), mo35948f(), this.f16247k, str);
    }

    /* renamed from: l */
    private boolean m20495l() {
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f17796c;
        return iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed();
    }

    /* renamed from: m */
    private void m20496m() {
        IronLog.INTERNAL.verbose("");
        final C6638k n = m20497n();
        C6387c.f16171a.mo35897c(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:32:0x013c  */
            /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r26 = this;
                    r1 = r26
                    com.ironsource.mediationsdk.v r0 = com.ironsource.mediationsdk.C6756v.this
                    r2 = 83500(0x1462c, float:1.17008E-40)
                    r3 = 0
                    r0.mo36993a((int) r2, (java.lang.Object[][]) r3)
                    com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r4 = "auction waterfallString = "
                    r2.<init>(r4)
                    com.ironsource.mediationsdk.k r4 = r0
                    java.lang.String r4 = r4.f17257g
                    r2.append(r4)
                    java.lang.String r2 = r2.toString()
                    r0.verbose(r2)
                    r0 = 1
                    java.lang.Object[][] r2 = new java.lang.Object[r0][]
                    r4 = 2
                    java.lang.Object[] r4 = new java.lang.Object[r4]
                    java.lang.String r5 = "ext1"
                    r6 = 0
                    r4[r6] = r5
                    com.ironsource.mediationsdk.k r5 = r0
                    java.lang.String r5 = r5.f17257g
                    r4[r0] = r5
                    r2[r6] = r4
                    com.ironsource.mediationsdk.v r4 = com.ironsource.mediationsdk.C6756v.this
                    r5 = 83510(0x14636, float:1.17022E-40)
                    r4.mo36993a((int) r5, (java.lang.Object[][]) r2)
                    com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()
                    android.content.Context r5 = r2.getApplicationContext()
                    com.ironsource.mediationsdk.v r2 = com.ironsource.mediationsdk.C6756v.this
                    com.ironsource.mediationsdk.h r2 = r2.f17795b
                    com.ironsource.mediationsdk.k r14 = r0
                    com.ironsource.mediationsdk.v r15 = com.ironsource.mediationsdk.C6756v.this
                    com.ironsource.mediationsdk.i r2 = r2.f17188a     // Catch:{ Exception -> 0x0121 }
                    java.lang.String r4 = "context"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)     // Catch:{ Exception -> 0x0121 }
                    java.lang.String r4 = "auctionParams"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r4)     // Catch:{ Exception -> 0x0121 }
                    java.lang.String r4 = "auctionListener"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r4)     // Catch:{ Exception -> 0x0121 }
                    org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0121 }
                    r4.<init>()     // Catch:{ Exception -> 0x0121 }
                    org.json.JSONObject r24 = com.ironsource.mediationsdk.C6632i.m20193a(r3)     // Catch:{ Exception -> 0x0121 }
                    boolean r3 = r2.f17222b     // Catch:{ Exception -> 0x0121 }
                    java.lang.String r13 = "AuctionDataUtils.getInst…segmentJson\n            )"
                    if (r3 == 0) goto L_0x0095
                    com.ironsource.mediationsdk.f r16 = com.ironsource.mediationsdk.C6625f.m20163a()     // Catch:{ Exception -> 0x0121 }
                    java.lang.String r3 = r14.f17260j     // Catch:{ Exception -> 0x0121 }
                    boolean r4 = r14.f17253c     // Catch:{ Exception -> 0x0121 }
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r14.f17254d     // Catch:{ Exception -> 0x0121 }
                    java.util.List<java.lang.String> r6 = r14.f17255e     // Catch:{ Exception -> 0x0121 }
                    r21 = 0
                    int r7 = r14.f17256f     // Catch:{ Exception -> 0x0121 }
                    com.ironsource.mediationsdk.ISBannerSize r8 = r14.f17258h     // Catch:{ Exception -> 0x0121 }
                    r17 = r3
                    r18 = r4
                    r19 = r5
                    r20 = r6
                    r22 = r7
                    r23 = r8
                    org.json.JSONObject r3 = r16.mo36658a((java.lang.String) r17, (boolean) r18, (java.util.Map<java.lang.String, java.lang.Object>) r19, (java.util.List<java.lang.String>) r20, (com.ironsource.mediationsdk.C6636j) r21, (int) r22, (com.ironsource.mediationsdk.ISBannerSize) r23, (org.json.JSONObject) r24)     // Catch:{ Exception -> 0x0121 }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r13)     // Catch:{ Exception -> 0x0121 }
                    goto L_0x00c6
                L_0x0095:
                    com.ironsource.mediationsdk.f r4 = com.ironsource.mediationsdk.C6625f.m20163a()     // Catch:{ Exception -> 0x0121 }
                    java.util.Map<java.lang.String, java.lang.Object> r6 = r14.f17254d     // Catch:{ Exception -> 0x0121 }
                    java.util.List<java.lang.String> r7 = r14.f17255e     // Catch:{ Exception -> 0x0121 }
                    r8 = 0
                    int r9 = r14.f17256f     // Catch:{ Exception -> 0x0121 }
                    java.lang.String r10 = r2.f17223c     // Catch:{ Exception -> 0x0121 }
                    com.ironsource.mediationsdk.utils.c r11 = r2.f17221a     // Catch:{ Exception -> 0x0121 }
                    com.ironsource.mediationsdk.ISBannerSize r12 = r14.f17258h     // Catch:{ Exception -> 0x0121 }
                    r3 = r13
                    r13 = r24
                    org.json.JSONObject r4 = r4.mo36657a(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0121 }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)     // Catch:{ Exception -> 0x0121 }
                    java.lang.String r3 = "adunit"
                    java.lang.String r5 = r14.f17260j     // Catch:{ Exception -> 0x0121 }
                    r4.put(r3, r5)     // Catch:{ Exception -> 0x0121 }
                    java.lang.String r3 = "doNotEncryptResponse"
                    boolean r5 = r14.f17253c     // Catch:{ Exception -> 0x0121 }
                    if (r5 == 0) goto L_0x00c0
                    java.lang.String r5 = "false"
                    goto L_0x00c2
                L_0x00c0:
                    java.lang.String r5 = "true"
                L_0x00c2:
                    r4.put(r3, r5)     // Catch:{ Exception -> 0x0121 }
                    r3 = r4
                L_0x00c6:
                    boolean r4 = r14.f17259i     // Catch:{ Exception -> 0x0121 }
                    if (r4 == 0) goto L_0x00cf
                    java.lang.String r4 = "isDemandOnly"
                    r3.put(r4, r0)     // Catch:{ Exception -> 0x0121 }
                L_0x00cf:
                    boolean r4 = r14.f17251a     // Catch:{ Exception -> 0x0121 }
                    if (r4 == 0) goto L_0x00d8
                    java.lang.String r4 = "isOneFlow"
                    r3.put(r4, r0)     // Catch:{ Exception -> 0x0121 }
                L_0x00d8:
                    boolean r0 = r14.f17259i     // Catch:{ Exception -> 0x0121 }
                    if (r0 == 0) goto L_0x00e1
                    com.ironsource.mediationsdk.utils.c r0 = r2.f17221a     // Catch:{ Exception -> 0x0121 }
                    java.lang.String r0 = r0.f17572e     // Catch:{ Exception -> 0x0121 }
                    goto L_0x00e5
                L_0x00e1:
                    com.ironsource.mediationsdk.utils.c r0 = r2.f17221a     // Catch:{ Exception -> 0x0121 }
                    java.lang.String r0 = r0.f17571d     // Catch:{ Exception -> 0x0121 }
                L_0x00e5:
                    com.ironsource.mediationsdk.h$a r4 = new com.ironsource.mediationsdk.h$a     // Catch:{ Exception -> 0x0121 }
                    java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x0121 }
                    r5.<init>(r0)     // Catch:{ Exception -> 0x0121 }
                    boolean r0 = r14.f17253c     // Catch:{ Exception -> 0x0121 }
                    com.ironsource.mediationsdk.utils.c r6 = r2.f17221a     // Catch:{ Exception -> 0x0121 }
                    int r6 = r6.f17573f     // Catch:{ Exception -> 0x0121 }
                    com.ironsource.mediationsdk.utils.c r7 = r2.f17221a     // Catch:{ Exception -> 0x0121 }
                    long r7 = r7.f17576i     // Catch:{ Exception -> 0x0121 }
                    com.ironsource.mediationsdk.utils.c r9 = r2.f17221a     // Catch:{ Exception -> 0x0121 }
                    boolean r9 = r9.f17584q     // Catch:{ Exception -> 0x0121 }
                    com.ironsource.mediationsdk.utils.c r10 = r2.f17221a     // Catch:{ Exception -> 0x0121 }
                    boolean r10 = r10.f17585r     // Catch:{ Exception -> 0x0121 }
                    com.ironsource.mediationsdk.utils.c r2 = r2.f17221a     // Catch:{ Exception -> 0x0121 }
                    int r2 = r2.f17586s     // Catch:{ Exception -> 0x0121 }
                    r11 = r15
                    r15 = r4
                    r16 = r11
                    r17 = r5
                    r18 = r3
                    r19 = r0
                    r20 = r6
                    r21 = r7
                    r23 = r9
                    r24 = r10
                    r25 = r2
                    r15.<init>(r16, r17, r18, r19, r20, r21, r23, r24, r25)     // Catch:{ Exception -> 0x011f }
                    com.ironsource.environment.e.c r0 = com.ironsource.environment.p204e.C6387c.f16171a     // Catch:{ Exception -> 0x011f }
                    r0.mo35897c(r4)     // Catch:{ Exception -> 0x011f }
                    return
                L_0x011f:
                    r0 = move-exception
                    goto L_0x0123
                L_0x0121:
                    r0 = move-exception
                    r11 = r15
                L_0x0123:
                    com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r4 = "execute auction exception "
                    r3.<init>(r4)
                    java.lang.String r4 = r0.getMessage()
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    r2.error(r3)
                    if (r11 == 0) goto L_0x014c
                    r7 = 1000(0x3e8, float:1.401E-42)
                    java.lang.String r8 = r0.getMessage()
                    r9 = 0
                    r2 = 0
                    java.lang.String r10 = "other"
                    r6 = r11
                    r11 = r2
                    r6.mo36163a(r7, r8, r9, r10, r11)
                L_0x014c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6756v.C67571.run():void");
            }
        });
    }

    /* renamed from: n */
    private C6638k m20497n() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo35947e());
        C6638k kVar = new C6638k("banner");
        kVar.mo36689a((List<String>) arrayList);
        kVar.mo36690b("" + mo35948f() + mo35947e());
        kVar.mo36688a(mo35949g());
        kVar.f17253c = IronSourceUtils.getSerr() == 1;
        kVar.f17259i = true;
        kVar.f17251a = true;
        kVar.f17258h = this.f17796c.getSize();
        return kVar;
    }

    /* renamed from: o */
    private String m20498o() {
        return this.f16241e.f17320a.isMultipleInstances() ? this.f16241e.f17320a.getProviderTypeForReflection() : this.f16241e.f17320a.getProviderName();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36992a() {
        this.f16244h = null;
        this.f16245i = null;
        this.f17800o = new C6639l();
    }

    /* renamed from: a */
    public final void mo36163a(int i, String str, int i2, String str2, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("Auction failed. error " + i + " - " + str);
        this.f16244h = null;
        this.f16245i = null;
        mo36993a((int) IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, mo35951i()}});
        if (mo35945b(C6419A.C6420a.LOAD_IN_PROGRESS)) {
            mo36996a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_AUCTION_FAILED, "No available ad to load"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36993a(int i, Object[][] objArr) {
        Map<String, Object> d = mo35946d();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        d.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.getMessage());
            }
        }
        C6518d.m19731d().mo36349b(new C6517c(i, new JSONObject(d)));
    }

    /* renamed from: a */
    public final void mo36994a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + mo35951i());
        if (mo35937a(new C6419A.C6420a[]{C6419A.C6420a.NOT_LOADED, C6419A.C6420a.LOADED, C6419A.C6420a.SHOW_IN_PROGRESS}, C6419A.C6420a.LOAD_IN_PROGRESS) == C6419A.C6420a.LOAD_IN_PROGRESS) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose("load banner id: " + mo35949g() + " already in progress");
            return;
        }
        mo36992a();
        if (!mo35950h()) {
            IronLog.INTERNAL.verbose("can't load banner when isOneFlow = false");
            mo36996a(new IronSourceError(IronSourceError.ERROR_CODE_MISSING_CONFIGURATION, "Missing configuration settings"));
            return;
        }
        mo36993a(3002, (Object[][]) null);
        this.f17796c = iSDemandOnlyBannerLayout;
        this.f17794a = new Date().getTime();
        mo36998c();
        if (this.f17795b.mo36664a()) {
            m20496m();
            return;
        }
        IronLog.INTERNAL.verbose("can't load the banner the auction isn't enabled");
        mo36996a(new IronSourceError(IronSourceError.ERROR_CODE_MISSING_CONFIGURATION, "Missing server configuration"));
    }

    /* renamed from: a */
    public final void mo36995a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + mo35951i());
        if (mo35937a(new C6419A.C6420a[]{C6419A.C6420a.NOT_LOADED, C6419A.C6420a.LOADED, C6419A.C6420a.SHOW_IN_PROGRESS}, C6419A.C6420a.LOAD_IN_PROGRESS) == C6419A.C6420a.LOAD_IN_PROGRESS) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose("load instance id: " + mo35949g() + " already in progress");
            return;
        }
        mo36992a();
        if (m20495l()) {
            mo36996a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, "bannerLayout is null or destroyed"));
        } else if (!mo35953k()) {
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
            mo36993a((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR, (Object[][]) null);
            mo36996a(buildLoadFailedError);
        } else if (this.f16240d == null) {
            IronLog.INTERNAL.error("adapter object is null");
            mo36996a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "Missing internal configuration"));
        } else {
            try {
                C6625f.m20163a();
                JSONObject a = C6625f.m20166a(str);
                C6625f.m20163a();
                C6625f.C6626a a2 = C6625f.m20162a(a);
                C6625f.m20163a();
                C6729b a3 = C6625f.m20164a(mo35947e(), a2.f17176b);
                if (a3 == null) {
                    IronSourceError buildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched adm");
                    mo36993a((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR, (Object[][]) null);
                    mo36996a(buildLoadFailedError2);
                    return;
                }
                String b = a3.mo36943b();
                if (b == null) {
                    IronLog.INTERNAL.error("serverData is null");
                    mo36996a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_SERVER_DATA, "No available ad to load"));
                    return;
                }
                mo35939a(b);
                mo35944b(a2.f17175a);
                mo35941a(a2.f17178d);
                mo36993a(3002, (Object[][]) null);
                mo36993a((int) IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.f17794a = new Date().getTime();
                mo36998c();
                this.f17800o.f17263c = a3.mo36945d();
                this.f16240d.initBannerForBidding(this.f17798m, this.f17799n, this.f16242f, this);
                this.f16240d.loadBannerForDemandOnlyForBidding(iSDemandOnlyBannerLayout, this.f16242f, this, b);
            } catch (Exception e) {
                mo36996a(ErrorBuilder.buildLoadFailedError("loadBannerForBidder: Exception= " + e.getMessage()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36996a(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + m20498o());
        if (mo35943a(C6419A.C6420a.LOAD_IN_PROGRESS, C6419A.C6420a.NOT_LOADED)) {
            mo35952j();
            m20491a(ironSourceError, System.currentTimeMillis() - this.f17794a);
            m20494a(this.f17800o.f17262b, IronSourceUtils.getCurrentMethodName());
            if (!m20495l()) {
                this.f17796c.sendBannerAdLoadFailed(mo35949g(), ironSourceError);
            }
        }
    }

    /* renamed from: a */
    public final void mo36169a(List<C6729b> list, String str, C6729b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        String str3;
        IronSourceError ironSourceError;
        IronSourceError ironSourceError2;
        IronLog.INTERNAL.verbose("");
        this.f16244h = str;
        this.f16245i = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            mo36993a((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}});
        }
        mo36993a((int) IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_EXT1;
        if (list.isEmpty()) {
            str3 = "";
        } else {
            str3 = "1" + list.get(0).mo36942a();
        }
        objArr2[1] = str3;
        objArr[0] = objArr2;
        mo36993a((int) IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_AUCTION_RESPONSE_WATERFALL, objArr);
        if (mo35945b(C6419A.C6420a.LOAD_IN_PROGRESS)) {
            if (list.isEmpty()) {
                ironSourceError = new IronSourceError(IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, "There is no available ad to load");
                IronLog.INTERNAL.error("loadBanner - empty waterfall");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                mo36996a(ironSourceError);
                return;
            }
            C6729b bVar2 = list.get(0);
            this.f17800o.f17263c = bVar2.mo36945d();
            this.f17800o.f17261a = bVar2.mo36947f();
            this.f17800o.f17262b = bVar2.mo36946e();
            String b = bVar2.mo36943b();
            mo35939a(b);
            IronLog.INTERNAL.verbose("");
            if (mo35945b(C6419A.C6420a.LOAD_IN_PROGRESS)) {
                if (b == null) {
                    IronLog.INTERNAL.verbose("serverData is null");
                    ironSourceError2 = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_SERVER_DATA, "No available ad to load");
                } else if (this.f16240d == null) {
                    IronLog.INTERNAL.verbose("adapter object is null");
                    ironSourceError2 = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "Missing internal configuration");
                } else {
                    mo36993a((int) IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                    this.f17797l = System.currentTimeMillis();
                    this.f16240d.initBannerForBidding(this.f17798m, this.f17799n, this.f16242f, this);
                    this.f16240d.loadBannerForDemandOnlyForBidding(this.f17796c, this.f16242f, this, b);
                    return;
                }
                mo36996a(ironSourceError2);
            }
        }
    }

    /* renamed from: b */
    public final void mo36997b() {
        IronLog.INTERNAL.verbose("");
        if (m20495l()) {
            IronLog.INTERNAL.error("Banner is null or already destroyed and can't be used anymore");
            return;
        }
        mo35937a(new C6419A.C6420a[]{C6419A.C6420a.LOADED, C6419A.C6420a.LOAD_IN_PROGRESS, C6419A.C6420a.SHOW_IN_PROGRESS}, C6419A.C6420a.NOT_LOADED);
        mo35952j();
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f17796c;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.f16326e = true;
            iSDemandOnlyBannerLayout.f16325d = null;
            iSDemandOnlyBannerLayout.f16323b = null;
            iSDemandOnlyBannerLayout.f16324c = null;
            iSDemandOnlyBannerLayout.f16322a = null;
            iSDemandOnlyBannerLayout.removeBannerListener();
        }
        this.f17796c = null;
        if (this.f16240d == null) {
            IronLog.INTERNAL.error("can't destroy adapter. mAdapter == null");
        } else {
            this.f16240d.destroyBanner(this.f16242f);
        }
        mo36993a((int) IronSourceConstants.BN_INSTANCE_DESTROY, (Object[][]) null);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("banner layout was destroyed. bannerId: " + mo35949g());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo36998c() {
        IronLog.INTERNAL.verbose("");
        mo35940a((TimerTask) new TimerTask() {
            public final void run() {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("load timed out state=" + C6756v.this.mo35951i());
                C6756v.this.mo36996a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "load timed out"));
            }
        });
    }

    /* renamed from: d */
    public final Map<String, Object> mo35946d() {
        HashMap hashMap = new HashMap();
        try {
            if (m20495l()) {
                hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed");
            } else {
                C6689r.m20303a((Map<String, Object>) hashMap, this.f17796c.getSize());
            }
            String str = "";
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, this.f16240d != null ? this.f16240d.getVersion() : str);
            if (this.f16240d != null) {
                str = this.f16240d.getCoreSDKVersion();
            }
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str);
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.f16241e.f17320a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f16241e.f17320a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (mo35950h()) {
                hashMap.put("isOneFlow", 1);
            }
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            hashMap.put("instanceType", Integer.valueOf(this.f16241e.f17323d));
            if (!TextUtils.isEmpty(this.f16244h)) {
                hashMap.put("auctionId", this.f16244h);
            }
            if (this.f16245i != null && this.f16245i.length() > 0) {
                hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16245i);
            }
            if (!TextUtils.isEmpty(this.f16247k)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f16247k);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Instance: " + mo35947e() + " " + e.getMessage());
        }
        return hashMap;
    }

    public final void onBannerAdClicked() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + m20498o());
        mo36993a((int) IronSourceConstants.BN_INSTANCE_CLICK, (Object[][]) null);
        if (!m20495l()) {
            C6644m a = C6644m.m20216a();
            String g = mo35949g();
            if (a.f17280a != null) {
                C6387c.f16171a.mo35896a(new Runnable(g) {

                    /* renamed from: a */
                    private /* synthetic */ String f17288a;

                    public final void run(
/*
Method generation error in method: com.ironsource.mediationsdk.m.4.run():void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.mediationsdk.m.4.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                });
            }
        }
    }

    public final void onBannerAdLeftApplication() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + m20498o());
        mo36993a((int) IronSourceConstants.BN_INSTANCE_LEAVE_APP, (Object[][]) null);
        if (!m20495l()) {
            C6644m a = C6644m.m20216a();
            String g = mo35949g();
            if (a.f17280a != null) {
                C6387c.f16171a.mo35896a(new Runnable(g) {

                    /* renamed from: a */
                    private /* synthetic */ String f17290a;

                    public final void run(
/*
Method generation error in method: com.ironsource.mediationsdk.m.5.run():void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.mediationsdk.m.5.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                });
            }
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + m20498o());
        long currentTimeMillis = System.currentTimeMillis() - this.f17797l;
        mo36993a((int) IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(currentTimeMillis)}});
        mo36996a(ironSourceError);
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + m20498o());
        int b = C6753o.m20481a().mo36990b(3);
        mo36993a((int) IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b)}, new Object[]{"duration", Long.valueOf(System.currentTimeMillis() - this.f17797l)}});
        if (mo35943a(C6419A.C6420a.LOAD_IN_PROGRESS, C6419A.C6420a.LOADED)) {
            mo35952j();
            if (!m20495l()) {
                C6387c.f16171a.mo35896a(new Runnable(view, layoutParams) {

                    /* renamed from: a */
                    private /* synthetic */ View f16331a;

                    /* renamed from: b */
                    private /* synthetic */ FrameLayout.LayoutParams f16332b;

                    public final void run(
/*
Method generation error in method: com.ironsource.mediationsdk.ISDemandOnlyBannerLayout.2.run():void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.mediationsdk.ISDemandOnlyBannerLayout.2.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                });
            }
            mo36993a((int) IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b)}, new Object[]{"duration", Long.valueOf(System.currentTimeMillis() - this.f17794a)}});
            C6753o.m20481a().mo36988a(3);
            m20494a(this.f17800o.f17261a, IronSourceUtils.getCurrentMethodName());
            if (!m20495l()) {
                ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f17796c;
                String g = mo35949g();
                C6644m a = C6644m.m20216a();
                if (a.f17280a != null) {
                    C6387c.f16171a.mo35896a(new Runnable(g) {

                        /* renamed from: a */
                        private /* synthetic */ String f17284a;

                        public final void run(
/*
Method generation error in method: com.ironsource.mediationsdk.m.2.run():void, dex: classes2.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.mediationsdk.m.2.run():void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    });
                }
                iSDemandOnlyBannerLayout.f16327f = true;
            }
        }
    }

    public final void onBannerAdScreenDismissed() {
    }

    public final void onBannerAdScreenPresented() {
    }

    public final void onBannerAdShown() {
        if (mo35943a(C6419A.C6420a.LOADED, C6419A.C6420a.SHOW_IN_PROGRESS)) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("smash - " + m20498o());
            mo36993a((int) IronSourceConstants.BN_INSTANCE_SHOW, (Object[][]) null);
            m20494a(this.f17800o.f17263c, IronSourceUtils.getCurrentMethodName());
            if (!m20495l()) {
                C6644m a = C6644m.m20216a();
                String g = mo35949g();
                if (a.f17280a != null) {
                    C6387c.f16171a.mo35896a(new Runnable(g) {

                        /* renamed from: a */
                        private /* synthetic */ String f17286a;

                        public final void run(
/*
Method generation error in method: com.ironsource.mediationsdk.m.3.run():void, dex: classes2.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.mediationsdk.m.3.run():void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    });
                }
            }
        }
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + m20498o() + " " + ironSourceError.toString());
    }

    public final void onBannerInitSuccess() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + m20498o());
    }
}
