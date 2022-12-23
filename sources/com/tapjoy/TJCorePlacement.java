package com.tapjoy;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C11285b;
import com.tapjoy.internal.C11315bv;
import com.tapjoy.internal.C11474fk;
import com.tapjoy.internal.C11480fo;
import com.tapjoy.internal.C11488fs;
import com.tapjoy.internal.C11494fw;
import com.tapjoy.internal.C11495fx;
import com.tapjoy.internal.C11496fy;
import com.tapjoy.internal.C11506gd;
import com.tapjoy.internal.C11520gi;
import com.tapjoy.internal.C11526gl;
import com.tapjoy.internal.C11550hf;
import com.tapjoy.internal.C11554hg;
import com.tapjoy.internal.C11558hj;
import com.tapjoy.internal.C11572ho;
import com.tapjoy.internal.C11578hq;
import com.tapjoy.internal.C11580hs;
import com.tapjoy.internal.C11631it;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class TJCorePlacement {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public static final String f26602a = TJCorePlacement.class.getSimpleName();

    /* renamed from: A */
    private TJAdUnit.TJAdUnitVideoListener f26603A = new TJAdUnit.TJAdUnitVideoListener() {
        public final void onVideoStart() {
            TJPlacement a = TJCorePlacement.this.mo69374a("SHOW");
            if (a != null && a.getVideoListener() != null) {
                a.getVideoListener().onVideoStart(a);
            }
        }

        public final void onVideoCompleted() {
            TJPlacement a = TJCorePlacement.this.mo69374a("SHOW");
            if (a != null && a.getVideoListener() != null) {
                a.getVideoListener().onVideoComplete(a);
            }
        }

        public final void onVideoError(String str) {
            TJPlacement a = TJCorePlacement.this.mo69374a("SHOW");
            if (a != null && a.getVideoListener() != null) {
                a.getVideoListener().onVideoError(a, str);
            }
        }
    };
    /* access modifiers changed from: package-private */

    /* renamed from: b */
    public Context f26604b;
    /* access modifiers changed from: package-private */

    /* renamed from: c */
    public TJPlacementData f26605c;

    /* renamed from: d */
    String f26606d;
    /* access modifiers changed from: package-private */

    /* renamed from: e */
    public long f26607e;

    /* renamed from: f */
    final C11496fy f26608f = new C11496fy();

    /* renamed from: g */
    TJAdUnit f26609g;
    /* access modifiers changed from: package-private */

    /* renamed from: h */
    public boolean f26610h = false;
    /* access modifiers changed from: package-private */

    /* renamed from: i */
    public C11578hq f26611i = null;

    /* renamed from: j */
    boolean f26612j;

    /* renamed from: k */
    volatile boolean f26613k = false;

    /* renamed from: l */
    volatile boolean f26614l = false;

    /* renamed from: m */
    volatile boolean f26615m = false;

    /* renamed from: n */
    String f26616n;

    /* renamed from: o */
    String f26617o;

    /* renamed from: p */
    String f26618p;

    /* renamed from: q */
    String f26619q;

    /* renamed from: r */
    HashMap<String, String> f26620r;

    /* renamed from: s */
    private Map<String, TJPlacement> f26621s = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Map<String, String> f26622t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C11480fo f26623u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f26624v = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C11631it f26625w = null;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public volatile boolean f26626x = false;

    /* renamed from: y */
    private boolean f26627y;

    /* renamed from: z */
    private TJAdUnit.TJAdUnitWebViewListener f26628z = new TJAdUnit.TJAdUnitWebViewListener() {
        public final void onContentReady() {
            TJCorePlacement.this.mo69381c();
        }

        public final void onClosed() {
            if (TJCorePlacement.this.f26610h) {
                TJPlacementManager.decrementPlacementCacheCount();
                boolean unused = TJCorePlacement.this.f26610h = false;
            }
            if (TJCorePlacement.this.f26624v) {
                TJPlacementManager.decrementPlacementPreRenderCount();
                boolean unused2 = TJCorePlacement.this.f26624v = false;
            }
        }

        public final void onClick() {
            TJCorePlacement.m30714e(TJCorePlacement.this);
        }
    };

    TJCorePlacement(String str, String str2, boolean z) {
        Activity c = C11285b.m30884c();
        this.f26604b = c;
        if (c == null) {
            TapjoyLog.m30839d(f26602a, "getVisibleActivity() is NULL. Activity can be explicitly set via `Tapjoy.setActivity(Activity)`");
        }
        this.f26627y = z;
        TJPlacementData tJPlacementData = new TJPlacementData(str2, getPlacementContentUrl());
        this.f26605c = tJPlacementData;
        tJPlacementData.setPlacementName(str);
        this.f26606d = UUID.randomUUID().toString();
        TJAdUnit tJAdUnit = new TJAdUnit();
        this.f26609g = tJAdUnit;
        tJAdUnit.setWebViewListener(this.f26628z);
        this.f26609g.setVideoListener(this.f26603A);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo69375a() {
        String url = this.f26605c.getUrl();
        if (TextUtils.isEmpty(url)) {
            url = getPlacementContentUrl();
            if (TextUtils.isEmpty(url)) {
                C11520gi.m31530b("TJPlacement.requestContent").mo70064a("TJPlacement is missing APP_ID").mo70071c();
                mo69377a(mo69374a("REQUEST"), TapjoyErrorMessage.ErrorType.SDK_ERROR, new TJError(0, "TJPlacement is missing APP_ID"));
                return;
            }
            this.f26605c.updateUrl(url);
        }
        String str = f26602a;
        TapjoyLog.m30839d(str, "sendContentRequest -- URL: " + url + " name: " + this.f26605c.getPlacementName());
        mo69379a(url, (Map<String, String>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo69379a(String str, Map<String, String> map) {
        if (this.f26626x) {
            String str2 = f26602a;
            TapjoyLog.m30842i(str2, "Placement " + this.f26605c.getPlacementName() + " is already requesting content");
            C11520gi.m31530b("TJPlacement.requestContent").mo70069b("already doing").mo70071c();
            return;
        }
        this.f26605c.resetPlacementRequestData();
        C11496fy fyVar = this.f26608f;
        String str3 = null;
        fyVar.f27592b = null;
        fyVar.f27594d = null;
        fyVar.f27591a = null;
        this.f26609g.resetContentLoadState();
        this.f26626x = false;
        this.f26613k = false;
        this.f26614l = false;
        this.f26615m = false;
        this.f26611i = null;
        this.f26625w = null;
        this.f26626x = true;
        final TJPlacement a = mo69374a("REQUEST");
        if (!this.f26627y) {
            Map<String, String> genericURLParams = TapjoyConnectCore.getGenericURLParams();
            this.f26622t = genericURLParams;
            genericURLParams.putAll(TapjoyConnectCore.getTimeStampAndVerifierParams());
        } else {
            Map<String, String> limitedGenericURLParams = TapjoyConnectCore.getLimitedGenericURLParams();
            this.f26622t = limitedGenericURLParams;
            limitedGenericURLParams.putAll(TapjoyConnectCore.getLimitedTimeStampAndVerifierParams());
        }
        TapjoyUtil.safePut(this.f26622t, TJAdUnitConstants.PARAM_PLACEMENT_NAME, this.f26605c.getPlacementName(), true);
        TapjoyUtil.safePut(this.f26622t, TJAdUnitConstants.PARAM_PLACEMENT_PRELOAD, "true", true);
        TapjoyUtil.safePut(this.f26622t, "debug", Boolean.toString(C11554hg.f27724a), true);
        C11558hj a2 = C11558hj.m31644a();
        Map<String, String> map2 = this.f26622t;
        if (a2.f27741b != null) {
            C11580hs hsVar = a2.f27741b;
            hsVar.mo70165b();
            str3 = hsVar.f27820b.mo70312a();
        }
        TapjoyUtil.safePut(map2, TJAdUnitConstants.PARAM_ACTION_ID_EXCLUSION, str3, true);
        TapjoyUtil.safePut(this.f26622t, TJAdUnitConstants.PARAM_PLACEMENT_BY_SDK, String.valueOf(this.f26612j), true);
        TapjoyUtil.safePut(this.f26622t, TJAdUnitConstants.PARAM_PUSH_ID, a.pushId, true);
        TapjoyUtil.safePut(this.f26622t, TapjoyConstants.TJC_MEDIATION_SOURCE, this.f26616n, true);
        TapjoyUtil.safePut(this.f26622t, TapjoyConstants.TJC_ADAPTER_VERSION, this.f26617o, true);
        if (!TextUtils.isEmpty(TapjoyConnectCore.getCustomParameter())) {
            TapjoyUtil.safePut(this.f26622t, TapjoyConstants.TJC_CUSTOM_PARAMETER, TapjoyConnectCore.getCustomParameter(), true);
        }
        if (map != null) {
            this.f26622t.putAll(map);
        }
        final C11474fk fkVar = new C11474fk(C11506gd.m31493b().mo70077b("placement_request_content_retry_timeout"));
        final C11526gl c = C11506gd.m31493b().mo70078c("placement_request_content_retry_backoff");
        final C11520gi.C11522a d = C11520gi.m31533d("TJPlacement.requestContent");
        final String str4 = str;
        new Thread() {
            public final void run() {
                C11520gi.m31525a("TJPlacement.requestContent", d);
                int i = 0;
                while (!m30735a()) {
                    i++;
                    TJCorePlacement.this.f26622t.put(TapjoyConstants.TJC_RETRY, Integer.toString(i));
                    if (i == 1) {
                        d.mo70066a("retry_timeout", (Object) Long.valueOf(fkVar.f27547b));
                    }
                    d.mo70065a("retry_count", (long) i);
                }
            }

            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0335 */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private boolean m30735a() {
                /*
                    r12 = this;
                    java.lang.String r0 = com.tapjoy.TJCorePlacement.f26602a
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Sending content request for placement "
                    r1.<init>(r2)
                    com.tapjoy.TJCorePlacement r2 = com.tapjoy.TJCorePlacement.this
                    java.lang.String r2 = r2.f26605c.getPlacementName()
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    com.tapjoy.TapjoyLog.m30842i(r0, r1)
                    com.tapjoy.TJCorePlacement r0 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.internal.hj r1 = com.tapjoy.internal.C11558hj.m31644a()
                    com.tapjoy.TJCorePlacement r2 = com.tapjoy.TJCorePlacement.this
                    java.lang.String r8 = r2.f26605c.getPlacementName()
                    com.tapjoy.TJCorePlacement r2 = com.tapjoy.TJCorePlacement.this
                    android.content.Context r9 = r2.f26604b
                    com.tapjoy.internal.hr r1 = r1.f27740a
                    com.tapjoy.internal.hj r2 = r1.f27815a
                    r10 = 0
                    com.tapjoy.internal.fd r2 = r2.mo70110a((boolean) r10)
                    com.tapjoy.internal.it r11 = new com.tapjoy.internal.it
                    com.tapjoy.internal.hj r4 = r1.f27815a
                    com.tapjoy.internal.fc r5 = r2.f27417d
                    com.tapjoy.internal.ew r6 = r2.f27418e
                    com.tapjoy.internal.fj r7 = r2.f27419f
                    r3 = r11
                    r3.<init>(r4, r5, r6, r7, r8, r9)
                    com.tapjoy.internal.C11631it unused = r0.f26625w = r11
                    com.tapjoy.TapjoyURLConnection r0 = new com.tapjoy.TapjoyURLConnection
                    r0.<init>()
                    java.lang.String r1 = r7
                    com.tapjoy.TJCorePlacement r2 = com.tapjoy.TJCorePlacement.this
                    java.util.Map r2 = r2.f26622t
                    r3 = 0
                    com.tapjoy.TapjoyHttpURLResponse r0 = r0.getResponseFromURL((java.lang.String) r1, (java.util.Map<java.lang.String, java.lang.String>) r3, (java.util.Map<java.lang.String, java.lang.String>) r3, (java.util.Map<java.lang.String, java.lang.String>) r2)
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacementData r1 = r1.f26605c
                    int r2 = r0.statusCode
                    r1.setHttpStatusCode(r2)
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacementData r1 = r1.f26605c
                    java.lang.String r2 = r0.response
                    r1.setHttpResponse(r2)
                    java.lang.String r1 = "x-tapjoy-prerender"
                    java.lang.String r1 = r0.getHeaderFieldAsString(r1)
                    java.lang.String r2 = "0"
                    boolean r1 = r1.equals(r2)
                    r2 = 1
                    if (r1 != 0) goto L_0x0087
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacementData r1 = r1.f26605c
                    r1.setPrerenderingRequested(r2)
                L_0x0087:
                    java.lang.String r1 = "X-Tapjoy-Debug"
                    java.lang.String r1 = r0.getHeaderFieldAsString(r1)
                    if (r1 == 0) goto L_0x00a0
                    java.lang.String r3 = com.tapjoy.TJCorePlacement.f26602a
                    java.lang.String r4 = "Tapjoy-Server-Debug: "
                    java.lang.String r1 = java.lang.String.valueOf(r1)
                    java.lang.String r1 = r4.concat(r1)
                    com.tapjoy.TapjoyLog.m30843v(r3, r1)
                L_0x00a0:
                    java.lang.String r1 = "x-tapjoy-handle-dismiss-on-pause"
                    java.lang.String r1 = r0.getHeaderFieldAsString(r1)
                    java.lang.String r3 = "0"
                    boolean r1 = r1.equals(r3)
                    if (r1 != 0) goto L_0x00b7
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacementData r1 = r1.f26605c
                    r1.setHandleDismissOnPause(r2)
                L_0x00b7:
                    long r3 = r0.expires
                    r5 = 0
                    int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r1 <= 0) goto L_0x00de
                    long r3 = r0.expires
                    long r7 = r0.date
                    int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                    if (r1 <= 0) goto L_0x00ca
                    long r7 = r0.date
                    goto L_0x00ce
                L_0x00ca:
                    long r7 = com.tapjoy.internal.C11685u.m32055b()
                L_0x00ce:
                    long r3 = r3 - r7
                    int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r1 <= 0) goto L_0x00e3
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    long r7 = android.os.SystemClock.elapsedRealtime()
                    long r7 = r7 + r3
                    long unused = r1.f26607e = r7
                    goto L_0x00e3
                L_0x00de:
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    long unused = r1.f26607e = r5
                L_0x00e3:
                    if (r0 == 0) goto L_0x033a
                    com.tapjoy.TJPlacement r1 = r8
                    com.tapjoy.TJPlacementListener r1 = r1.getListener()
                    if (r1 == 0) goto L_0x033a
                    int r1 = r0.statusCode
                    if (r1 == 0) goto L_0x02c9
                    r3 = 200(0xc8, float:2.8E-43)
                    if (r1 == r3) goto L_0x011b
                    java.lang.String r1 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gi$a r1 = com.tapjoy.internal.C11520gi.m31530b(r1)
                    java.lang.String r3 = "content_type"
                    java.lang.String r4 = "none"
                    com.tapjoy.internal.gi$a r1 = r1.mo70066a((java.lang.String) r3, (java.lang.Object) r4)
                    java.lang.String r3 = "code"
                    int r0 = r0.statusCode
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    com.tapjoy.internal.gi$a r0 = r1.mo70066a((java.lang.String) r3, (java.lang.Object) r0)
                    r0.mo70071c()
                    com.tapjoy.TJCorePlacement r0 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacement r1 = r8
                    r0.mo69376a((com.tapjoy.TJPlacement) r1)
                    goto L_0x033a
                L_0x011b:
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJCorePlacement.m30720j(r1)
                    java.lang.String r1 = "Content-Type"
                    java.lang.String r1 = r0.getHeaderFieldAsString(r1)
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L_0x0203
                    java.lang.String r3 = "json"
                    boolean r1 = r1.contains(r3)
                    if (r1 == 0) goto L_0x0203
                    java.lang.String r1 = "X-Tapjoy-Disable-Preload"
                    java.lang.String r1 = r0.getHeaderFieldAsString(r1)
                    java.lang.String r3 = "1"
                    boolean r1 = r1.equals(r3)
                    if (r1 == 0) goto L_0x01b2
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this     // Catch:{ TapjoyException -> 0x0172 }
                    java.lang.String r3 = r0.response     // Catch:{ TapjoyException -> 0x0172 }
                    com.tapjoy.TJCorePlacement.m30706a((com.tapjoy.TJCorePlacement) r1, (java.lang.String) r3)     // Catch:{ TapjoyException -> 0x0172 }
                    java.lang.String r1 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gi$a r1 = com.tapjoy.internal.C11520gi.m31530b(r1)     // Catch:{ TapjoyException -> 0x0172 }
                    java.lang.String r3 = "content_type"
                    java.lang.String r4 = "ad"
                    com.tapjoy.internal.gi$a r1 = r1.mo70066a((java.lang.String) r3, (java.lang.Object) r4)     // Catch:{ TapjoyException -> 0x0172 }
                    r1.mo70071c()     // Catch:{ TapjoyException -> 0x0172 }
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this     // Catch:{ TapjoyException -> 0x0172 }
                    com.tapjoy.internal.fy r1 = r1.f26608f     // Catch:{ TapjoyException -> 0x0172 }
                    com.tapjoy.TJCorePlacement r3 = com.tapjoy.TJCorePlacement.this     // Catch:{ TapjoyException -> 0x0172 }
                    com.tapjoy.internal.fo r3 = r3.f26623u     // Catch:{ TapjoyException -> 0x0172 }
                    r1.f27591a = r3     // Catch:{ TapjoyException -> 0x0172 }
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this     // Catch:{ TapjoyException -> 0x0172 }
                    com.tapjoy.TJCorePlacement.m30722l(r1)     // Catch:{ TapjoyException -> 0x0172 }
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this     // Catch:{ TapjoyException -> 0x0172 }
                    r1.mo69381c()     // Catch:{ TapjoyException -> 0x0172 }
                    goto L_0x033a
                L_0x0172:
                    r1 = move-exception
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r1 = r1.getMessage()
                    r3.append(r1)
                    java.lang.String r1 = " for placement "
                    r3.append(r1)
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    java.lang.String r1 = r1.f26605c.getPlacementName()
                    r3.append(r1)
                    java.lang.String r1 = r3.toString()
                    java.lang.String r3 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gi$a r3 = com.tapjoy.internal.C11520gi.m31530b(r3)
                    java.lang.String r4 = "server error"
                    com.tapjoy.internal.gi$a r3 = r3.mo70064a((java.lang.String) r4)
                    r3.mo70071c()
                    com.tapjoy.TJCorePlacement r3 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacement r4 = r8
                    com.tapjoy.TapjoyErrorMessage$ErrorType r5 = com.tapjoy.TapjoyErrorMessage.ErrorType.SERVER_ERROR
                    com.tapjoy.TJError r6 = new com.tapjoy.TJError
                    int r0 = r0.statusCode
                    r6.<init>(r0, r1)
                    r3.mo69377a(r4, r5, r6)
                    goto L_0x033a
                L_0x01b2:
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    java.lang.String r3 = r0.response
                    boolean r1 = r1.m30711b((java.lang.String) r3)
                    if (r1 == 0) goto L_0x01d9
                    java.lang.String r0 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gi$a r0 = com.tapjoy.internal.C11520gi.m31530b(r0)
                    java.lang.String r1 = "content_type"
                    java.lang.String r3 = "mm"
                    com.tapjoy.internal.gi$a r0 = r0.mo70066a((java.lang.String) r1, (java.lang.Object) r3)
                    r0.mo70071c()
                    com.tapjoy.TJCorePlacement r0 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJCorePlacement.m30722l(r0)
                    com.tapjoy.TJCorePlacement r0 = com.tapjoy.TJCorePlacement.this
                    r0.mo69381c()
                    goto L_0x033a
                L_0x01d9:
                    java.lang.String r1 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gi$a r1 = com.tapjoy.internal.C11520gi.m31530b(r1)
                    java.lang.String r3 = "asset error"
                    com.tapjoy.internal.gi$a r1 = r1.mo70064a((java.lang.String) r3)
                    r1.mo70071c()
                    java.lang.String r1 = r0.response
                    if (r1 != 0) goto L_0x01ef
                    java.lang.String r1 = "asset error"
                    goto L_0x01f1
                L_0x01ef:
                    java.lang.String r1 = r0.response
                L_0x01f1:
                    com.tapjoy.TJCorePlacement r3 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacement r4 = r8
                    com.tapjoy.TapjoyErrorMessage$ErrorType r5 = com.tapjoy.TapjoyErrorMessage.ErrorType.SERVER_ERROR
                    com.tapjoy.TJError r6 = new com.tapjoy.TJError
                    int r0 = r0.statusCode
                    r6.<init>(r0, r1)
                    r3.mo69377a(r4, r5, r6)
                    goto L_0x033a
                L_0x0203:
                    java.lang.String r1 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gi$a r1 = com.tapjoy.internal.C11520gi.m31530b(r1)
                    java.lang.String r3 = "content_type"
                    java.lang.String r4 = "ad"
                    com.tapjoy.internal.gi$a r1 = r1.mo70066a((java.lang.String) r3, (java.lang.Object) r4)
                    r1.mo70071c()
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.internal.fy r1 = r1.f26608f
                    com.tapjoy.TJCorePlacement r3 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.internal.fo r3 = r3.f26623u
                    r1.f27591a = r3
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJCorePlacement.m30722l(r1)
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJCorePlacement$3$1 r3 = new com.tapjoy.TJCorePlacement$3$1
                    r3.<init>()
                    java.lang.String r4 = com.tapjoy.TJCorePlacement.f26602a
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    java.lang.String r6 = "Checking if there is content to cache for placement "
                    r5.<init>(r6)
                    com.tapjoy.TJPlacementData r6 = r1.f26605c
                    java.lang.String r6 = r6.getPlacementName()
                    r5.append(r6)
                    java.lang.String r5 = r5.toString()
                    com.tapjoy.TapjoyLog.m30842i(r4, r5)
                    java.lang.String r4 = "x-tapjoy-cacheable-assets"
                    java.lang.String r0 = r0.getHeaderFieldAsString(r4)
                    r4 = 2
                    boolean r5 = com.tapjoy.TJPlacementManager.canCachePlacement()     // Catch:{ Exception -> 0x02ac }
                    if (r5 != 0) goto L_0x0270
                    java.lang.String r0 = com.tapjoy.TJCorePlacement.f26602a     // Catch:{ Exception -> 0x02ac }
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ac }
                    java.lang.String r6 = "Placement caching limit reached. No content will be cached for placement "
                    r5.<init>(r6)     // Catch:{ Exception -> 0x02ac }
                    com.tapjoy.TJPlacementData r1 = r1.f26605c     // Catch:{ Exception -> 0x02ac }
                    java.lang.String r1 = r1.getPlacementName()     // Catch:{ Exception -> 0x02ac }
                    r5.append(r1)     // Catch:{ Exception -> 0x02ac }
                    java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x02ac }
                    com.tapjoy.TapjoyLog.m30842i(r0, r1)     // Catch:{ Exception -> 0x02ac }
                    r3.onCachingComplete(r4)     // Catch:{ Exception -> 0x02ac }
                    goto L_0x033a
                L_0x0270:
                    org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x02ac }
                    r5.<init>(r0)     // Catch:{ Exception -> 0x02ac }
                    int r0 = r5.length()     // Catch:{ Exception -> 0x02ac }
                    if (r0 <= 0) goto L_0x02a7
                    java.lang.String r0 = com.tapjoy.TJCorePlacement.f26602a     // Catch:{ Exception -> 0x02ac }
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ac }
                    java.lang.String r7 = "Begin caching content for placement "
                    r6.<init>(r7)     // Catch:{ Exception -> 0x02ac }
                    com.tapjoy.TJPlacementData r7 = r1.f26605c     // Catch:{ Exception -> 0x02ac }
                    java.lang.String r7 = r7.getPlacementName()     // Catch:{ Exception -> 0x02ac }
                    r6.append(r7)     // Catch:{ Exception -> 0x02ac }
                    java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x02ac }
                    com.tapjoy.TapjoyLog.m30842i(r0, r6)     // Catch:{ Exception -> 0x02ac }
                    com.tapjoy.TJPlacementManager.incrementPlacementCacheCount()     // Catch:{ Exception -> 0x02ac }
                    r1.f26610h = r2     // Catch:{ Exception -> 0x02ac }
                    com.tapjoy.TapjoyCache r0 = com.tapjoy.TapjoyCache.getInstance()     // Catch:{ Exception -> 0x02ac }
                    com.tapjoy.TJCorePlacement$6 r6 = new com.tapjoy.TJCorePlacement$6     // Catch:{ Exception -> 0x02ac }
                    r6.<init>(r3)     // Catch:{ Exception -> 0x02ac }
                    r0.cacheAssetGroup(r5, r6)     // Catch:{ Exception -> 0x02ac }
                    goto L_0x033a
                L_0x02a7:
                    r3.onCachingComplete(r2)     // Catch:{ Exception -> 0x02ac }
                    goto L_0x033a
                L_0x02ac:
                    r0 = move-exception
                    r3.onCachingComplete(r4)
                    java.lang.String r1 = com.tapjoy.TJCorePlacement.f26602a
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r4 = "Error while handling placement cache: "
                    r3.<init>(r4)
                    java.lang.String r0 = r0.getMessage()
                    r3.append(r0)
                    java.lang.String r0 = r3.toString()
                    com.tapjoy.TapjoyLog.m30839d(r1, r0)
                    goto L_0x033a
                L_0x02c9:
                    com.tapjoy.internal.fk r1 = r6
                    com.tapjoy.internal.gl r3 = r9
                    long r3 = r3.f27690e
                    boolean r1 = r1.mo69992a(r3)
                    if (r1 == 0) goto L_0x030c
                    java.lang.String r1 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gi$a r1 = com.tapjoy.internal.C11520gi.m31530b(r1)
                    java.lang.String r3 = "network error"
                    com.tapjoy.internal.gi$a r1 = r1.mo70064a((java.lang.String) r3)
                    java.lang.String r3 = "retry_timeout"
                    com.tapjoy.internal.fk r4 = r6
                    long r4 = r4.f27547b
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    com.tapjoy.internal.gi$a r1 = r1.mo70066a((java.lang.String) r3, (java.lang.Object) r4)
                    r1.mo70071c()
                    java.lang.String r1 = r0.response
                    if (r1 != 0) goto L_0x02f9
                    java.lang.String r1 = "network error"
                    goto L_0x02fb
                L_0x02f9:
                    java.lang.String r1 = r0.response
                L_0x02fb:
                    com.tapjoy.TJCorePlacement r3 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacement r4 = r8
                    com.tapjoy.TapjoyErrorMessage$ErrorType r5 = com.tapjoy.TapjoyErrorMessage.ErrorType.NETWORK_ERROR
                    com.tapjoy.TJError r6 = new com.tapjoy.TJError
                    int r0 = r0.statusCode
                    r6.<init>(r0, r1)
                    r3.mo69377a(r4, r5, r6)
                    goto L_0x033a
                L_0x030c:
                    com.tapjoy.internal.gl r0 = r9
                    long r1 = r0.f27690e
                    long r3 = r0.f27690e
                    double r3 = (double) r3
                    double r7 = r0.f27689d
                    double r3 = r3 * r7
                    long r3 = (long) r3
                    long r7 = r0.f27687b
                    int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                    if (r7 >= 0) goto L_0x0320
                    long r3 = r0.f27687b
                    goto L_0x0328
                L_0x0320:
                    long r7 = r0.f27688c
                    int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                    if (r7 <= 0) goto L_0x0328
                    long r3 = r0.f27688c
                L_0x0328:
                    r0.f27690e = r3
                    int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                    if (r3 <= 0) goto L_0x0339
                    monitor-enter(r0)
                    r0.wait(r1)     // Catch:{ InterruptedException -> 0x0335 }
                    goto L_0x0335
                L_0x0333:
                    r1 = move-exception
                    goto L_0x0337
                L_0x0335:
                    monitor-exit(r0)     // Catch:{ all -> 0x0333 }
                    goto L_0x0339
                L_0x0337:
                    monitor-exit(r0)     // Catch:{ all -> 0x0333 }
                    throw r1
                L_0x0339:
                    return r10
                L_0x033a:
                    com.tapjoy.TJCorePlacement r0 = com.tapjoy.TJCorePlacement.this
                    boolean unused = r0.f26626x = false
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TJCorePlacement.C112193.m30735a():boolean");
            }
        }.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m30711b(String str) {
        try {
            C11631it.C11632a aVar = (C11631it.C11632a) this.f26625w.mo69753a(URI.create(this.f26605c.getUrl()), new ByteArrayInputStream(str.getBytes()));
            this.f26611i = aVar.f28027a;
            aVar.f28027a.mo70091b();
            if (!aVar.f28027a.mo70092c()) {
                TapjoyLog.m30841e(f26602a, "Failed to load fiverocks placement");
                return false;
            }
            C11488fs fsVar = null;
            if (this.f26611i instanceof C11572ho) {
                fsVar = new C11494fw(this.f26605c.getPlacementName(), this.f26605c.getPlacementType(), this.f26623u);
            } else if (this.f26611i instanceof C11550hf) {
                fsVar = new C11495fx(this.f26605c.getPlacementName(), this.f26605c.getPlacementType(), this.f26623u);
            }
            this.f26608f.f27591a = fsVar;
            return true;
        } catch (IOException e) {
            TapjoyLog.m30841e(f26602a, e.toString());
            e.printStackTrace();
            return false;
        } catch (C11315bv e2) {
            TapjoyLog.m30841e(f26602a, e2.toString());
            e2.printStackTrace();
            return false;
        }
    }

    public Context getContext() {
        return this.f26604b;
    }

    public void setContext(Context context) {
        this.f26604b = context;
    }

    public TJAdUnit getAdUnit() {
        return this.f26609g;
    }

    public TJPlacementData getPlacementData() {
        return this.f26605c;
    }

    public boolean isContentReady() {
        return this.f26615m;
    }

    public boolean isContentAvailable() {
        return this.f26614l;
    }

    public String getPlacementContentUrl() {
        String e = mo69383e();
        if (!TextUtils.isEmpty(e)) {
            return TapjoyConnectCore.getPlacementURL() + "v1/apps/" + e + "/content?";
        }
        TapjoyLog.m30842i(f26602a, "Placement content URL cannot be generated for null app ID");
        return "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo69380b() {
        if (this.f26611i != null) {
            return "mm";
        }
        return this.f26614l ? "ad" : "none";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69378a(String str, TJPlacement tJPlacement) {
        synchronized (this.f26621s) {
            this.f26621s.put(str, tJPlacement);
            String str2 = f26602a;
            TapjoyLog.m30839d(str2, "Setting " + str + " placement: " + tJPlacement.getGUID());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final TJPlacement mo69374a(String str) {
        TJPlacement tJPlacement;
        synchronized (this.f26621s) {
            tJPlacement = this.f26621s.get(str);
            if (tJPlacement != null) {
                String str2 = f26602a;
                TapjoyLog.m30839d(str2, "Returning " + str + " placement: " + tJPlacement.getGUID());
            }
        }
        return tJPlacement;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69376a(TJPlacement tJPlacement) {
        C11496fy fyVar = this.f26608f;
        String placementName = this.f26605c.getPlacementName();
        String placementType = this.f26605c.getPlacementType();
        String b = mo69380b();
        fyVar.f27593c = 0;
        fyVar.f27592b = C11520gi.m31534e("PlacementContent.funnel").mo70063a().mo70066a("placement", (Object) placementName).mo70066a("placement_type", (Object) placementType).mo70066a(FirebaseAnalytics.Param.CONTENT_TYPE, (Object) b).mo70066a("state", (Object) Integer.valueOf(fyVar.f27593c));
        fyVar.f27592b.mo70071c();
        if (!"none".equals(b)) {
            fyVar.f27595e = C11520gi.m31534e("PlacementContent.ready").mo70063a().mo70066a("placement", (Object) placementName).mo70066a("placement_type", (Object) placementType).mo70066a(FirebaseAnalytics.Param.CONTENT_TYPE, (Object) b);
        }
        if (tJPlacement != null && tJPlacement.getListener() != null) {
            String str = f26602a;
            TapjoyLog.m30842i(str, "Content request delivered successfully for placement " + this.f26605c.getPlacementName() + ", contentAvailable: " + isContentAvailable() + ", mediationAgent: " + this.f26618p);
            tJPlacement.getListener().onRequestSuccess(tJPlacement);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69377a(TJPlacement tJPlacement, TapjoyErrorMessage.ErrorType errorType, TJError tJError) {
        String str = f26602a;
        TapjoyLog.m30840e(str, new TapjoyErrorMessage(errorType, "Content request failed for placement " + this.f26605c.getPlacementName() + "; Reason= " + tJError.message));
        if (tJPlacement != null && tJPlacement.getListener() != null) {
            tJPlacement.getListener().onRequestFailure(tJPlacement, tJError);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo69381c() {
        if (!this.f26613k) {
            this.f26615m = true;
            String str = f26602a;
            TapjoyLog.m30842i(str, "Content is ready for placement " + this.f26605c.getPlacementName());
            if (this.f26609g.isPrerendered()) {
                C11496fy fyVar = this.f26608f;
                Boolean bool = Boolean.TRUE;
                C11520gi.C11522a aVar = fyVar.f27592b;
                if (aVar != null) {
                    aVar.mo70066a("prerendered", (Object) bool);
                }
                C11520gi.C11522a aVar2 = fyVar.f27595e;
                if (aVar2 != null) {
                    aVar2.mo70066a("prerendered", (Object) bool);
                }
            }
            C11496fy fyVar2 = this.f26608f;
            C11520gi.C11522a aVar3 = fyVar2.f27595e;
            if (aVar3 != null) {
                fyVar2.f27595e = null;
                aVar3.mo70068b().mo70071c();
            }
            TJPlacement a = mo69374a("REQUEST");
            if (a != null && a.getListener() != null) {
                a.getListener().onContentReady(a);
                this.f26613k = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo69382d() {
        TJPlacement a = mo69374a("SHOW");
        if (a != null && a.getListener() != null) {
            m30708b(a);
        }
    }

    /* renamed from: b */
    private void m30708b(TJPlacement tJPlacement) {
        String str = f26602a;
        TapjoyLog.m30842i(str, "Content dismissed for placement " + this.f26605c.getPlacementName());
        this.f26608f.mo70020a();
        if (tJPlacement != null && tJPlacement.f26670a != null) {
            tJPlacement.f26670a.onContentDismiss(tJPlacement);
        }
    }

    public boolean isLimited() {
        return this.f26627y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo69383e() {
        if (!this.f26627y) {
            return TapjoyConnectCore.getAppID();
        }
        return TapjoyConnectCore.getLimitedAppID();
    }

    /* renamed from: e */
    static /* synthetic */ void m30714e(TJCorePlacement tJCorePlacement) {
        TJPlacement a = tJCorePlacement.mo69374a("SHOW");
        String str = f26602a;
        TapjoyLog.m30842i(str, "Handle onClick for placement " + tJCorePlacement.f26605c.getPlacementName());
        if (a != null && a.getListener() != null) {
            a.getListener().onClick(a);
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m30720j(TJCorePlacement tJCorePlacement) {
        C11480fo foVar = new C11480fo(tJCorePlacement.f26605c.getPlacementName(), tJCorePlacement.f26605c.getPlacementType());
        tJCorePlacement.f26623u = foVar;
        tJCorePlacement.f26609g.setAdContentTracker(foVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m30706a(TJCorePlacement tJCorePlacement, String str) {
        if (str != null) {
            try {
                String str2 = f26602a;
                TapjoyLog.m30839d(str2, "Disable preload flag is set for placement " + tJCorePlacement.f26605c.getPlacementName());
                tJCorePlacement.f26605c.setRedirectURL(new JSONObject(str).getString(TapjoyConstants.TJC_REDIRECT_URL));
                tJCorePlacement.f26605c.setPreloadDisabled(true);
                tJCorePlacement.f26605c.setHasProgressSpinner(true);
                String str3 = f26602a;
                TapjoyLog.m30839d(str3, "redirect_url:" + tJCorePlacement.f26605c.getRedirectURL());
            } catch (JSONException unused) {
                throw new TapjoyException("TJPlacement request failed, malformed server response");
            }
        } else {
            throw new TapjoyException("TJPlacement request failed due to null response");
        }
    }

    /* renamed from: l */
    static /* synthetic */ void m30722l(TJCorePlacement tJCorePlacement) {
        tJCorePlacement.f26614l = true;
        tJCorePlacement.mo69376a(tJCorePlacement.mo69374a("REQUEST"));
    }
}
