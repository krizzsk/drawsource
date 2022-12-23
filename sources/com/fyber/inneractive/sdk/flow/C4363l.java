package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.cache.session.C4188c;
import com.fyber.inneractive.sdk.cache.session.C4189d;
import com.fyber.inneractive.sdk.cache.session.enums.C4192a;
import com.fyber.inneractive.sdk.cache.session.enums.C4193b;
import com.fyber.inneractive.sdk.config.C4213d0;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.network.C4489h0;
import com.fyber.inneractive.sdk.network.C4501m0;
import com.fyber.inneractive.sdk.network.C4509p;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.network.C4516r;
import com.fyber.inneractive.sdk.network.C4521u;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5289j0;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.l */
public abstract class C4363l<AdContent extends C4361j, EventsListener extends InneractiveUnitController.EventsListener> implements InneractiveAdRenderer, InneractiveInternalBrowserActivity.InternalBrowserListener {

    /* renamed from: a */
    public InneractiveAdSpot f10719a;

    /* renamed from: b */
    public AdContent f10720b;

    /* renamed from: c */
    public EventsListener f10721c;

    /* renamed from: d */
    public boolean f10722d = false;

    /* renamed from: e */
    public boolean f10723e = false;

    /* renamed from: f */
    public boolean f10724f = false;

    /* renamed from: g */
    public boolean f10725g = false;

    /* renamed from: h */
    public boolean f10726h = false;

    /* renamed from: i */
    public boolean f10727i = true;

    /* renamed from: j */
    public Runnable f10728j;

    /* renamed from: com.fyber.inneractive.sdk.flow.l$a */
    public class C4364a implements C4521u<String> {

        /* renamed from: a */
        public final /* synthetic */ String f10729a;

        /* renamed from: b */
        public final /* synthetic */ long f10730b;

        public C4364a(C4363l lVar, String str, long j) {
            this.f10729a = str;
            this.f10730b = j;
        }

        /* renamed from: a */
        public void mo24154a(Object obj, Exception exc, boolean z) {
            String str = (String) obj;
            int i = IAlog.f13936a;
            IAlog.m16444a(1, (Exception) null, "Hit Request - %s", this.f10729a);
            IAlog.m16446a("Hit Request: Hitting URL finished: %s", this.f10729a);
            if (exc == null) {
                IAlog.m16446a("Hit Request: Hitting URL response code: %s", str);
            } else {
                IAlog.m16446a("Hit Request: Hitting URL failed: %s", exc);
            }
            IAlog.m16446a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f10730b));
        }
    }

    /* renamed from: A */
    public void mo24520A() {
        C5233e c;
        OnGlobalImpressionDataListener onGlobalImpressionDataListener;
        ImpressionData impressionData;
        if (!this.f10724f && this.f10721c != null) {
            IAlog.m16446a("%sCalling external interface onAdImpression", IAlog.m16443a((Object) this));
            this.f10721c.onAdImpression(this.f10719a);
            AdContent adcontent = this.f10720b;
            if (!(adcontent == null || (c = adcontent.mo24293c()) == null)) {
                IAConfigManager iAConfigManager = IAConfigManager.f10324J;
                C4213d0 d0Var = iAConfigManager.f10358x;
                if (d0Var != null) {
                    UnitDisplayType unitDisplayType = c.f13878n;
                    ImpressionData impressionData2 = c.f13882r;
                    d0Var.mo24213a(unitDisplayType, "LAST_DOMAIN_SHOWED", impressionData2 != null ? impressionData2.getAdvertiserDomain() : null);
                    d0Var.mo24213a(unitDisplayType, "LAST_APP_BUNDLE_ID", c.f13889y);
                    if (!(unitDisplayType == UnitDisplayType.REWARDED || (impressionData = c.f13882r) == null || impressionData.getVideo() == null || !c.f13882r.getVideo().isSkippable())) {
                        d0Var.mo24214a(unitDisplayType, "LAST_VAST_SKIPED");
                    }
                    if (this.f10720b.isVideoAd()) {
                        d0Var.mo24214a(unitDisplayType, "LAST_VAST_CLICKED_TYPE");
                    }
                    d0Var.mo24214a(unitDisplayType, "LAST_CLICKED");
                }
                C5289j0 j0Var = iAConfigManager.f10326A;
                C4288z zVar = this.f10720b.f10715d;
                ImpressionData impressionData3 = c.f13882r;
                j0Var.getClass();
                if (!(zVar == null || (onGlobalImpressionDataListener = j0Var.f14006a) == null)) {
                    C4287y yVar = (C4287y) zVar;
                    onGlobalImpressionDataListener.onImpression(yVar.f10545b, yVar.f10544a, impressionData3);
                }
                EventsListener eventslistener = this.f10721c;
                if (eventslistener instanceof InneractiveFullscreenAdEventsListenerWithImpressionData) {
                    ((InneractiveFullscreenAdEventsListenerWithImpressionData) eventslistener).onAdImpression(this.f10719a, c.f13882r);
                } else if (eventslistener instanceof InneractiveAdViewEventsListenerWithImpressionData) {
                    ((InneractiveAdViewEventsListenerWithImpressionData) eventslistener).onAdImpression(this.f10719a, c.f13882r);
                }
            }
            this.f10724f = true;
        }
    }

    /* renamed from: B */
    public void mo24521B() {
        if (this.f10721c != null) {
            IAlog.m16446a("%sCalling external interface onAdWillOpenExternalApp", IAlog.m16443a((Object) this));
            this.f10721c.onAdWillOpenExternalApp(this.f10719a);
        }
        mo24522C();
    }

    /* renamed from: C */
    public final void mo24522C() {
        this.f10726h = false;
        this.f10725g = false;
    }

    /* renamed from: D */
    public void mo24523D() {
        AdContent adcontent = this.f10720b;
        if (adcontent != null && adcontent.mo24293c() != null) {
            String str = this.f10720b.mo24293c().f13879o;
            if (!TextUtils.isEmpty(str)) {
                IAlog.m16449d("%sfiring rewarded completion!", IAlog.m16443a((Object) this));
                int i = IAlog.f13936a;
                IAlog.m16444a(1, (Exception) null, "AD_REWARDED_COMPLETION", new Object[0]);
                mo24530b(str);
            }
        }
    }

    /* renamed from: b */
    public void mo24529b(C5233e eVar) {
        String str = eVar.f13875k;
        if (str != null && str.trim().length() > 0) {
            IAlog.m16449d("%sfiring impression!", IAlog.m16443a((Object) this));
            int i = IAlog.f13936a;
            IAlog.m16444a(1, (Exception) null, "AD_IMPRESSION", new Object[0]);
            mo24530b(str);
        }
    }

    public boolean canRefreshAd() {
        return true;
    }

    public void destroy() {
        if (this.f10722d) {
            InneractiveInternalBrowserActivity.setInternalBrowserListener((InneractiveInternalBrowserActivity.InternalBrowserListener) null);
            this.f10722d = false;
        }
        Runnable runnable = this.f10728j;
        if (runnable != null) {
            C5299n.f14024b.removeCallbacks(runnable);
            this.f10728j = null;
        }
        this.f10720b = null;
        this.f10721c = null;
        this.f10719a = null;
    }

    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.f10719a = inneractiveAdSpot;
        this.f10720b = inneractiveAdSpot.getAdContent();
        this.f10721c = inneractiveAdSpot.getSelectedUnitController().getEventsListener();
    }

    public void onApplicationInBackground() {
        mo24521B();
        mo24522C();
    }

    public void onInternalBrowserDismissed() {
        IAlog.m16446a("onInternalBrowserDismissed callback called", new Object[0]);
        if (this.f10722d) {
            this.f10722d = false;
            InneractiveInternalBrowserActivity.setInternalBrowserListener((InneractiveInternalBrowserActivity.InternalBrowserListener) null);
        }
        if (this.f10721c != null) {
            IAlog.m16446a("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.m16443a((Object) this));
            this.f10721c.onAdWillCloseInternalBrowser(this.f10719a);
        }
        mo24522C();
    }

    /* renamed from: w */
    public int mo24531w() {
        return -1;
    }

    /* renamed from: x */
    public int mo24532x() {
        return -1;
    }

    /* renamed from: y */
    public boolean mo24533y() {
        AdContent adcontent = this.f10720b;
        if (adcontent != null) {
            return adcontent.mo24299d();
        }
        return true;
    }

    /* renamed from: z */
    public void mo24534z() {
        C5233e c;
        if (this.f10721c != null) {
            IAlog.m16446a("%sCalling external interface onAdClicked", IAlog.m16443a((Object) this));
            this.f10721c.onAdClicked(this.f10719a);
        }
        AdContent adcontent = this.f10720b;
        if (adcontent != null && (c = adcontent.mo24293c()) != null) {
            IAConfigManager.f10324J.f10358x.mo24213a(c.f13878n, "LAST_CLICKED", "1");
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x010a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x011b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0133 */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.util.C5262d0.C5263a mo24524a(android.content.Context r17, java.lang.String r18, com.fyber.inneractive.sdk.util.C5306p0 r19, com.fyber.inneractive.sdk.util.C5267e r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            java.lang.String r4 = "Got exception adding param to json object: %s, %s"
            boolean r5 = r0.f10727i
            java.lang.String r6 = "none"
            r7 = 0
            if (r5 == 0) goto L_0x035e
            boolean r5 = r0.f10722d
            if (r5 == 0) goto L_0x0017
            goto L_0x035e
        L_0x0017:
            r16.mo24534z()
            boolean r5 = android.text.TextUtils.isEmpty(r18)
            if (r5 == 0) goto L_0x0036
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = "InneractiveAdRendererImpl: openClickThroughUrl - is empty"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r2, r1)
            com.fyber.inneractive.sdk.util.d0$a r1 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C5262d0.C5265c.FAILED
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "empty url"
            r3.<init>(r4)
            r1.<init>(r2, r3, r6)
            return r1
        L_0x0036:
            boolean r5 = android.text.TextUtils.isEmpty(r18)
            java.lang.String r6 = "url"
            r8 = 0
            if (r5 != 0) goto L_0x0064
            android.net.Uri r5 = android.net.Uri.parse(r18)
            java.lang.String r9 = r5.getScheme()
            java.lang.String r10 = r5.getHost()
            if (r9 == 0) goto L_0x0064
            java.lang.String r11 = "fybernativebrowser"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x0064
            if (r10 == 0) goto L_0x0064
            java.lang.String r9 = "navigate"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x0064
            java.lang.String r5 = r5.getQueryParameter(r6)
            goto L_0x0065
        L_0x0064:
            r5 = r8
        L_0x0065:
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            r10 = 1
            if (r9 != 0) goto L_0x006f
            r9 = r5
        L_0x006d:
            r5 = r7
            goto L_0x007b
        L_0x006f:
            java.lang.String r5 = "FYBER_OPEN_BROWSER"
            r9 = r18
            boolean r5 = r9.contains(r5)
            if (r5 == 0) goto L_0x007a
            goto L_0x006d
        L_0x007a:
            r5 = r10
        L_0x007b:
            com.fyber.inneractive.sdk.util.d0$d r11 = com.fyber.inneractive.sdk.util.C5262d0.C5266d.OPEN_EVERYTHING
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r12 = r0.f10719a
            if (r12 == 0) goto L_0x0086
            java.lang.String r12 = r12.getLocalUniqueId()
            goto L_0x0087
        L_0x0086:
            r12 = r8
        L_0x0087:
            com.fyber.inneractive.sdk.util.d0$a r5 = com.fyber.inneractive.sdk.util.C5262d0.m16464a(r1, r9, r5, r11, r12)
            int r11 = com.fyber.inneractive.sdk.util.IAlog.f13936a
            r11 = 3
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.String r13 = "VAST_EVENT"
            r12[r7] = r13
            r12[r10] = r5
            r13 = 2
            r12[r13] = r9
            java.lang.String r14 = "%s EVENT_CLICK %s %s"
            com.fyber.inneractive.sdk.util.IAlog.m16444a(r10, r8, r14, r12)
            com.fyber.inneractive.sdk.util.d0$c r12 = r5.f13957a
            com.fyber.inneractive.sdk.util.d0$c r14 = com.fyber.inneractive.sdk.util.C5262d0.C5265c.FAILED
            java.lang.String r15 = "is_auto_click"
            if (r12 != r14) goto L_0x014a
            com.fyber.inneractive.sdk.network.o r1 = com.fyber.inneractive.sdk.network.C4507o.CLICK_PARSING_FAILURE
            boolean r3 = r0.f10723e
            if (r3 != 0) goto L_0x0140
            r0.f10723e = r10
            java.lang.Throwable r3 = r5.f13958b
            if (r3 != 0) goto L_0x00b5
            java.lang.String r3 = "null-exception!"
            goto L_0x00b9
        L_0x00b5:
            java.lang.String r3 = r3.getMessage()
        L_0x00b9:
            AdContent r11 = r0.f10720b     // Catch:{ all -> 0x0140 }
            if (r11 != 0) goto L_0x00c9
            com.fyber.inneractive.sdk.network.q$a r11 = new com.fyber.inneractive.sdk.network.q$a     // Catch:{ all -> 0x0140 }
            r11.<init>(r8)     // Catch:{ all -> 0x0140 }
            r11.f11163b = r1     // Catch:{ all -> 0x0140 }
            r11.f11162a = r8     // Catch:{ all -> 0x0140 }
            r11.f11165d = r8     // Catch:{ all -> 0x0140 }
            goto L_0x00e4
        L_0x00c9:
            com.fyber.inneractive.sdk.network.q$a r11 = new com.fyber.inneractive.sdk.network.q$a     // Catch:{ all -> 0x0140 }
            AdContent r12 = r0.f10720b     // Catch:{ all -> 0x0140 }
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r14 = r12.f10712a     // Catch:{ all -> 0x0140 }
            com.fyber.inneractive.sdk.response.e r12 = r12.mo24293c()     // Catch:{ all -> 0x0140 }
            AdContent r8 = r0.f10720b     // Catch:{ all -> 0x0140 }
            com.fyber.inneractive.sdk.config.global.s r8 = r8.f10714c     // Catch:{ all -> 0x0140 }
            org.json.JSONArray r8 = r8.mo24268c()     // Catch:{ all -> 0x0140 }
            r11.<init>(r12)     // Catch:{ all -> 0x0140 }
            r11.f11163b = r1     // Catch:{ all -> 0x0140 }
            r11.f11162a = r14     // Catch:{ all -> 0x0140 }
            r11.f11165d = r8     // Catch:{ all -> 0x0140 }
        L_0x00e4:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0140 }
            r1.<init>()     // Catch:{ all -> 0x0140 }
            if (r9 != 0) goto L_0x00ee
            java.lang.String r8 = "null"
            goto L_0x00ef
        L_0x00ee:
            r8 = r9
        L_0x00ef:
            r1.put(r6, r8)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00fc
        L_0x00f3:
            java.lang.Object[] r12 = new java.lang.Object[r13]     // Catch:{ all -> 0x0140 }
            r12[r7] = r6     // Catch:{ all -> 0x0140 }
            r12[r10] = r8     // Catch:{ all -> 0x0140 }
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r4, r12)     // Catch:{ all -> 0x0140 }
        L_0x00fc:
            java.lang.String r6 = "message"
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0140 }
            if (r8 == 0) goto L_0x0106
            java.lang.String r3 = "empty"
        L_0x0106:
            r1.put(r6, r3)     // Catch:{ Exception -> 0x010a }
            goto L_0x0113
        L_0x010a:
            java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ all -> 0x0140 }
            r8[r7] = r6     // Catch:{ all -> 0x0140 }
            r8[r10] = r3     // Catch:{ all -> 0x0140 }
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r4, r8)     // Catch:{ all -> 0x0140 }
        L_0x0113:
            java.lang.String r3 = "ctx_name"
            java.lang.String r6 = r5.f13959c     // Catch:{ all -> 0x0140 }
            r1.put(r3, r6)     // Catch:{ Exception -> 0x011b }
            goto L_0x0124
        L_0x011b:
            java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ all -> 0x0140 }
            r8[r7] = r3     // Catch:{ all -> 0x0140 }
            r8[r10] = r6     // Catch:{ all -> 0x0140 }
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r4, r8)     // Catch:{ all -> 0x0140 }
        L_0x0124:
            org.json.JSONArray r3 = r11.f11167f     // Catch:{ all -> 0x0140 }
            r3.put(r1)     // Catch:{ all -> 0x0140 }
            boolean r2 = r2.f14031c     // Catch:{ all -> 0x0140 }
            if (r2 == 0) goto L_0x013c
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0140 }
            r1.put(r15, r2)     // Catch:{ Exception -> 0x0133 }
            goto L_0x013c
        L_0x0133:
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x0140 }
            r1[r7] = r15     // Catch:{ all -> 0x0140 }
            r1[r10] = r2     // Catch:{ all -> 0x0140 }
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r4, r1)     // Catch:{ all -> 0x0140 }
        L_0x013c:
            r1 = 0
            r11.mo24693a((java.lang.String) r1)     // Catch:{ all -> 0x0140 }
        L_0x0140:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r7] = r9
            java.lang.String r2 = "InneractiveAdRendererImpl: openClickThroughUrl - failed opening URL %s"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r2, r1)
            return r5
        L_0x014a:
            boolean r4 = r0.f10726h
            if (r4 != 0) goto L_0x02ad
            r0.f10726h = r10
            AdContent r4 = r0.f10720b
            if (r4 != 0) goto L_0x016a
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r8 = "InneractiveAdRendererImpl: no ad content?"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r8, r4)
            com.fyber.inneractive.sdk.network.q$a r4 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.p r8 = com.fyber.inneractive.sdk.network.C4509p.FYBER_SUCCESS_CLICK
            r12 = 0
            r4.<init>(r12)
            r4.f11164c = r8
            r4.f11162a = r12
            r4.f11165d = r12
            goto L_0x018e
        L_0x016a:
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r8 = "InneractiveAdRendererImpl: ad content exists!"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r8, r4)
            com.fyber.inneractive.sdk.network.q$a r4 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.p r8 = com.fyber.inneractive.sdk.network.C4509p.FYBER_SUCCESS_CLICK
            AdContent r12 = r0.f10720b
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r14 = r12.f10712a
            com.fyber.inneractive.sdk.response.e r12 = r12.mo24293c()
            AdContent r11 = r0.f10720b
            com.fyber.inneractive.sdk.config.global.s r11 = r11.f10714c
            org.json.JSONArray r11 = r11.mo24268c()
            r4.<init>(r12)
            r4.f11164c = r8
            r4.f11162a = r14
            r4.f11165d = r11
        L_0x018e:
            com.fyber.inneractive.sdk.network.q$b r8 = new com.fyber.inneractive.sdk.network.q$b
            r8.<init>()
            com.fyber.inneractive.sdk.network.q$b r11 = r8.mo24695a(r6, r9)
            com.fyber.inneractive.sdk.util.d0$c r12 = r5.f13957a
            java.lang.String r12 = r12.toString()
            java.lang.String r14 = "opened_from"
            com.fyber.inneractive.sdk.network.q$b r11 = r11.mo24695a(r14, r12)
            java.lang.String r12 = "opened_by"
            java.lang.String r14 = "renderer"
            com.fyber.inneractive.sdk.network.q$b r11 = r11.mo24695a(r12, r14)
            java.lang.String r12 = "origin"
            r11.mo24695a(r12, r3)
            boolean r11 = r2.f14031c
            if (r11 == 0) goto L_0x01bb
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r8.mo24695a(r15, r2)
            goto L_0x026e
        L_0x01bb:
            float r11 = r2.f14029a
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x01ca
            float r11 = r2.f14030b
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x01ca
            r11 = r10
            goto L_0x01cb
        L_0x01ca:
            r11 = r7
        L_0x01cb:
            if (r11 == 0) goto L_0x026e
            boolean r11 = r16.mo24533y()
            int r14 = r16.mo24532x()
            if (r11 == 0) goto L_0x01d8
            goto L_0x01dc
        L_0x01d8:
            int r14 = com.fyber.inneractive.sdk.util.C5292l.m16507b((int) r14)
        L_0x01dc:
            if (r14 != 0) goto L_0x01e0
            r11 = r12
            goto L_0x01e4
        L_0x01e0:
            float r11 = r2.f14029a
            float r14 = (float) r14
            float r11 = r11 / r14
        L_0x01e4:
            boolean r14 = r16.mo24533y()
            int r15 = r16.mo24531w()
            if (r14 == 0) goto L_0x01ef
            goto L_0x01f3
        L_0x01ef:
            int r15 = com.fyber.inneractive.sdk.util.C5292l.m16507b((int) r15)
        L_0x01f3:
            if (r15 != 0) goto L_0x01f6
            goto L_0x01fb
        L_0x01f6:
            float r2 = r2.f14030b
            float r12 = (float) r15
            float r12 = r2 / r12
        L_0x01fb:
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.Float r14 = java.lang.Float.valueOf(r11)
            r2[r7] = r14
            java.lang.Float r14 = java.lang.Float.valueOf(r12)
            r2[r10] = r14
            java.lang.String r14 = "Point location -  x - %.2f , y- %.2f"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r14, r2)
            boolean r2 = r16.mo24533y()
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.Object[] r14 = new java.lang.Object[r10]
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r14[r7] = r11
            java.lang.String r11 = "%.2f"
            java.lang.String r14 = java.lang.String.format(r2, r11, r14)
            java.lang.String r15 = "td_x"
            com.fyber.inneractive.sdk.network.q$b r14 = r8.mo24695a(r15, r14)
            boolean r15 = r16.mo24533y()
            java.lang.Object[] r15 = new java.lang.Object[r10]
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r15[r7] = r12
            java.lang.String r2 = java.lang.String.format(r2, r11, r15)
            java.lang.String r11 = "td_y"
            r14.mo24695a(r11, r2)
            boolean r2 = r16.mo24533y()
            if (r2 == 0) goto L_0x0254
            int r2 = com.fyber.inneractive.sdk.util.C5292l.m16511c()
            if (r2 != r10) goto L_0x024c
            java.lang.String r2 = "p"
            goto L_0x024e
        L_0x024c:
            java.lang.String r2 = "l"
        L_0x024e:
            java.lang.String r11 = "o"
            r8.mo24695a(r11, r2)
            goto L_0x026e
        L_0x0254:
            int r2 = r16.mo24532x()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r11 = "b_w"
            r8.mo24695a(r11, r2)
            int r2 = r16.mo24531w()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r11 = "b_h"
            r8.mo24695a(r11, r2)
        L_0x026e:
            com.fyber.inneractive.sdk.util.e r2 = com.fyber.inneractive.sdk.util.C5267e.VAST_ENDCARD
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x02a2
            AdContent r2 = r0.f10720b
            if (r2 == 0) goto L_0x0287
            com.fyber.inneractive.sdk.config.global.s r2 = r2.f10714c
            if (r2 == 0) goto L_0x0287
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.b> r3 = com.fyber.inneractive.sdk.config.global.features.C4226b.class
            com.fyber.inneractive.sdk.config.global.features.e r2 = r2.mo24264a(r3)
            com.fyber.inneractive.sdk.config.global.features.b r2 = (com.fyber.inneractive.sdk.config.global.features.C4226b) r2
            goto L_0x0288
        L_0x0287:
            r2 = 0
        L_0x0288:
            if (r2 == 0) goto L_0x0296
            com.fyber.inneractive.sdk.model.vast.a r2 = r2.f10423e
            if (r2 == 0) goto L_0x0291
            boolean r2 = r2.f10858d
            goto L_0x0292
        L_0x0291:
            r2 = r7
        L_0x0292:
            if (r2 == 0) goto L_0x0296
            r2 = r10
            goto L_0x0297
        L_0x0296:
            r2 = r7
        L_0x0297:
            if (r2 == 0) goto L_0x02a2
            com.fyber.inneractive.sdk.config.IAConfigManager r2 = com.fyber.inneractive.sdk.config.IAConfigManager.f10324J
            java.lang.String r2 = r2.f10350p
            java.lang.String r3 = "cta_lng"
            r8.mo24695a(r3, r2)
        L_0x02a2:
            org.json.JSONArray r2 = r4.f11167f
            org.json.JSONObject r3 = r8.f11177a
            r2.put(r3)
            r2 = 0
            r4.mo24693a((java.lang.String) r2)
        L_0x02ad:
            if (r1 == 0) goto L_0x02d5
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r2 = com.fyber.inneractive.sdk.util.IAlog.m16443a((java.lang.Object) r16)
            r1[r7] = r2
            java.lang.String r2 = "%sBlocking clicks until grace has ended"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r2, r1)
            r0.f10727i = r7
            java.lang.Runnable r1 = r0.f10728j
            if (r1 == 0) goto L_0x02c7
            android.os.Handler r2 = com.fyber.inneractive.sdk.util.C5299n.f14024b
            r2.removeCallbacks(r1)
        L_0x02c7:
            com.fyber.inneractive.sdk.flow.k r1 = new com.fyber.inneractive.sdk.flow.k
            r1.<init>(r0)
            r0.f10728j = r1
            android.os.Handler r2 = com.fyber.inneractive.sdk.util.C5299n.f14024b
            r3 = 1500(0x5dc, double:7.41E-321)
            r2.postDelayed(r1, r3)
        L_0x02d5:
            com.fyber.inneractive.sdk.util.d0$c r1 = r5.f13957a
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C5262d0.C5265c.OPEN_IN_EXTERNAL_APPLICATION
            if (r1 != r2) goto L_0x02eb
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = "InneractiveAdRendererImpl: handleOpenResult - opened in external application"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r2, r1)
            EventsListener r1 = r0.f10721c
            if (r1 == 0) goto L_0x035d
            r16.mo24521B()
            goto L_0x035d
        L_0x02eb:
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C5262d0.C5265c.OPENED_IN_INTERNAL_BROWSER
            if (r1 != r2) goto L_0x02fc
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = "InneractiveAdRendererImpl: handleOpenResult - opened in internal browser"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r2, r1)
            r0.f10722d = r10
            com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.setInternalBrowserListener(r16)
            goto L_0x035d
        L_0x02fc:
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C5262d0.C5265c.OPEN_IN_EXTERNAL_BROWSER
            if (r1 == r2) goto L_0x0304
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C5262d0.C5265c.OPENED_USING_CHROME_NAVIGATE
            if (r1 != r2) goto L_0x035d
        L_0x0304:
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r3 = "InneractiveAdRendererImpl: handleOpenResult - opened in external browser"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r3, r2)
            AdContent r2 = r0.f10720b
            if (r2 == 0) goto L_0x0318
            com.fyber.inneractive.sdk.response.e r2 = r2.mo24293c()
            AdContent r3 = r0.f10720b
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r3 = r3.f10712a
            goto L_0x031a
        L_0x0318:
            r2 = 0
            r3 = 0
        L_0x031a:
            com.fyber.inneractive.sdk.network.q$a r4 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.p r8 = com.fyber.inneractive.sdk.network.C4509p.EXTERNAL_BROWSER_OPENED
            r4.<init>(r2)
            r4.f11164c = r8
            r4.f11162a = r3
            r2 = 0
            r4.f11165d = r2
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r2[r7] = r6
            r2[r10] = r9
            com.fyber.inneractive.sdk.network.q$a r2 = r4.mo24692a((java.lang.Object[]) r2)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "fallback"
            r3[r7] = r4
            com.fyber.inneractive.sdk.util.d0$c r4 = com.fyber.inneractive.sdk.util.C5262d0.C5265c.OPENED_USING_CHROME_NAVIGATE
            if (r1 != r4) goto L_0x0340
            java.lang.String r1 = "chrome"
            goto L_0x0342
        L_0x0340:
            java.lang.String r1 = "na"
        L_0x0342:
            r3[r10] = r1
            AdContent r1 = r0.f10720b
            com.fyber.inneractive.sdk.config.global.s r1 = r1.f10714c
            org.json.JSONArray r1 = r1.mo24268c()
            r3[r13] = r1
            com.fyber.inneractive.sdk.network.q$a r1 = r2.mo24692a((java.lang.Object[]) r3)
            r2 = 0
            r1.mo24693a((java.lang.String) r2)
            EventsListener r1 = r0.f10721c
            if (r1 == 0) goto L_0x035d
            r16.mo24521B()
        L_0x035d:
            return r5
        L_0x035e:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = "InneractiveAdRendererImpl: openClickThroughUrl - external/browser is already opened"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r2, r1)
            com.fyber.inneractive.sdk.util.d0$a r1 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C5262d0.C5265c.FAILED
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "external/browser is already open"
            r3.<init>(r4)
            r1.<init>(r2, r3, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C4363l.mo24524a(android.content.Context, java.lang.String, com.fyber.inneractive.sdk.util.p0, com.fyber.inneractive.sdk.util.e):com.fyber.inneractive.sdk.util.d0$a");
    }

    /* renamed from: b */
    public void mo24530b(String str) {
        C4489h0 h0Var = new C4489h0(new C4364a(this, str, System.currentTimeMillis()), str);
        IAConfigManager.f10324J.f10354t.f11186a.offer(h0Var);
        h0Var.mo24642a(C4501m0.QUEUED);
    }

    /* renamed from: a */
    public void mo24527a(C5233e eVar) {
        String str = eVar.f13876l;
        if (str != null && str.trim().length() > 0) {
            int i = IAlog.f13936a;
            IAlog.m16444a(1, (Exception) null, "AD_CLICKED", new Object[0]);
            mo24530b(str);
        }
    }

    /* renamed from: a */
    public void mo24528a(String str) {
        if (!this.f10725g) {
            this.f10725g = true;
            C4509p pVar = C4509p.VAST_EVENT_COMPANION_CLICKED;
            AdContent adcontent = this.f10720b;
            InneractiveAdRequest inneractiveAdRequest = adcontent != null ? adcontent.f10712a : null;
            C5233e c = adcontent != null ? adcontent.mo24293c() : null;
            AdContent adcontent2 = this.f10720b;
            JSONArray c2 = adcontent2 != null ? adcontent2.f10714c.mo24268c() : null;
            C4511q.C4512a aVar = new C4511q.C4512a(c);
            aVar.f11164c = pVar;
            aVar.f11162a = inneractiveAdRequest;
            aVar.f11165d = c2;
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "na";
            }
            try {
                jSONObject.put("mime", str);
            } catch (Exception unused) {
                IAlog.m16450e("Got exception adding param to json object: %s, %s", "mime", str);
            }
            aVar.f11167f.put(jSONObject);
            aVar.mo24693a((String) null);
        }
    }

    /* renamed from: a */
    public void mo24526a(InneractiveUnitController.AdDisplayError adDisplayError) {
        String simpleName = adDisplayError.getClass().getSimpleName();
        String message = adDisplayError.getMessage();
        AdContent adcontent = this.f10720b;
        C5233e eVar = null;
        InneractiveAdRequest inneractiveAdRequest = adcontent != null ? adcontent.f10712a : null;
        if (adcontent != null) {
            eVar = adcontent.mo24293c();
        }
        C4516r.m13797a(simpleName, message, inneractiveAdRequest, eVar);
        if (this.f10721c != null) {
            IAlog.m16446a("%sCalling external interface onAdEnteredErrorState: %s", IAlog.m16443a((Object) this), adDisplayError.getMessage());
            this.f10721c.onAdEnteredErrorState(this.f10719a, adDisplayError);
        }
    }

    /* renamed from: a */
    public void mo24525a(C4192a aVar, C4193b bVar) {
        C4189d dVar = IAConfigManager.f10324J.f10358x.f10400a;
        if (dVar != null) {
            C5299n.m16520a(new C4188c(dVar, aVar, bVar));
        }
    }
}
