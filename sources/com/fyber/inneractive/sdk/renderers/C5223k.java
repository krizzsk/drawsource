package com.fyber.inneractive.sdk.renderers;

import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.cache.session.enums.C4192a;
import com.fyber.inneractive.sdk.cache.session.enums.C4193b;
import com.fyber.inneractive.sdk.config.C4252h;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.config.global.features.C4227c;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.flow.C4371p;
import com.fyber.inneractive.sdk.flow.C4375s;
import com.fyber.inneractive.sdk.flow.C4379u;
import com.fyber.inneractive.sdk.interfaces.C4397c;
import com.fyber.inneractive.sdk.network.C4509p;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.p191ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5253a;
import com.fyber.inneractive.sdk.util.C5260c0;
import com.fyber.inneractive.sdk.util.C5295l0;
import com.fyber.inneractive.sdk.util.C5326w0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5347c;
import com.fyber.inneractive.sdk.web.C5349d;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.renderers.k */
public class C5223k extends C4375s<C4379u, InneractiveFullscreenAdEventsListener> {

    /* renamed from: A */
    public boolean f13815A = false;

    /* renamed from: B */
    public boolean f13816B = false;

    /* renamed from: C */
    public boolean f13817C = false;

    /* renamed from: D */
    public boolean f13818D = false;

    /* renamed from: E */
    public C5326w0 f13819E;

    /* renamed from: F */
    public UnitDisplayType f13820F = UnitDisplayType.INTERSTITIAL;

    /* renamed from: G */
    public boolean f13821G = false;

    /* renamed from: H */
    public boolean f13822H = false;

    /* renamed from: I */
    public C4397c.C4399b f13823I;

    /* renamed from: J */
    public C5295l0 f13824J;

    /* renamed from: w */
    public C5349d.C5355f f13825w;

    /* renamed from: x */
    public boolean f13826x = false;

    /* renamed from: y */
    public IAmraidWebViewController f13827y;

    /* renamed from: z */
    public boolean f13828z = false;

    /* renamed from: com.fyber.inneractive.sdk.renderers.k$a */
    public class C5224a implements C5326w0.C5328b {
        public C5224a() {
        }

        /* renamed from: a */
        public void mo24200a(C5326w0 w0Var) {
            boolean unused = C5223k.this.f13821G = true;
        }
    }

    /* renamed from: E */
    public boolean mo24333E() {
        return !this.f13816B && this.f13827y.f14127I;
    }

    /* renamed from: G */
    public int mo24334G() {
        Integer b;
        AdContent adcontent = this.f10720b;
        if (adcontent == null) {
            return -1;
        }
        C4379u uVar = (C4379u) adcontent;
        if (uVar.f10714c == null || uVar.f10714c.mo24264a(C4227c.class) == null || (b = ((C4227c) ((C4379u) this.f10720b).f10714c.mo24264a(C4227c.class)).mo24240b("close_clickable_area_dp")) == null) {
            return -1;
        }
        return b.intValue();
    }

    /* renamed from: H */
    public int mo24335H() {
        Integer b;
        AdContent adcontent = this.f10720b;
        if (adcontent == null) {
            return -1;
        }
        C4379u uVar = (C4379u) adcontent;
        if (uVar.f10714c == null || uVar.f10714c.mo24264a(C4227c.class) == null || (b = ((C4227c) ((C4379u) this.f10720b).f10714c.mo24264a(C4227c.class)).mo24240b("close_visible_size_dp")) == null) {
            return -1;
        }
        return b.intValue();
    }

    /* renamed from: I */
    public long mo24336I() {
        int i = 2;
        if (this.f13820F == UnitDisplayType.REWARDED) {
            int a = IAConfigManager.f10324J.f10356v.f10459b.mo24271a("rewarded_mraid_delay", 31, 30);
            IAlog.m16446a("%sGetting rewarded total delay of %d seconds", IAlog.m16443a((Object) this), Integer.valueOf(a));
            i = a;
        } else {
            C4252h hVar = IAConfigManager.f10324J.f10356v.f10459b;
            String l = Long.toString(2);
            if (hVar.f10456a.containsKey("mraid_x_delay")) {
                l = hVar.f10456a.get("mraid_x_delay");
            }
            try {
                i = Integer.parseInt(l);
            } catch (Throwable unused) {
            }
        }
        return (long) (i * 1000);
    }

    /* renamed from: J */
    public boolean mo24337J() {
        return false;
    }

    /* renamed from: M */
    public final void mo26288M() {
        if (this.f10720b == null || this.f13827y == null) {
            IAlog.m16446a("updateWebViewLayoutParams called, but web view is invalid", new Object[0]);
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C5347c cVar = this.f13827y.f14079b;
        layoutParams.gravity = 17;
        cVar.setLayoutParams(layoutParams);
    }

    public void destroy() {
        EventsListener eventslistener;
        if (this.f13828z && !this.f13815A && (eventslistener = this.f10721c) != null) {
            this.f13815A = true;
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdDismissed(this.f10719a);
        }
        this.f13825w = null;
        C5326w0 w0Var = this.f13819E;
        if (w0Var != null) {
            w0Var.f14065e = null;
            this.f13819E = null;
        }
        super.destroy();
    }

    /* renamed from: m */
    public void mo24345m() {
        C4251s sVar;
        EventsListener eventslistener;
        if (this.f13820F == UnitDisplayType.REWARDED) {
            mo26287L();
        }
        if (!this.f13815A && (eventslistener = this.f10721c) != null) {
            this.f13815A = true;
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdDismissed(this.f10719a);
        }
        C5295l0 l0Var = this.f13824J;
        if (l0Var != null) {
            long j = l0Var.f14019b;
            if (j != 0) {
                String a = C5260c0.m16459a(j, l0Var.f14021d);
                l0Var.f14019b = 0;
                l0Var.f14020c = 0;
                l0Var.f14021d = 0;
                InneractiveAdSpot inneractiveAdSpot = l0Var.f14018a;
                C4361j adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
                C4509p pVar = C4509p.INTERSTITIAL_VIEW_TIME;
                InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f10712a : null;
                C5233e c = adContent != null ? adContent.mo24293c() : null;
                JSONArray c2 = (adContent == null || (sVar = adContent.f10714c) == null) ? null : sVar.mo24268c();
                C4511q.C4512a aVar = new C4511q.C4512a(c);
                aVar.f11164c = pVar;
                aVar.f11162a = inneractiveAdRequest;
                aVar.f11165d = c2;
                aVar.mo24692a("time", a);
                aVar.mo24693a((String) null);
            }
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f10719a;
        if (inneractiveAdSpot2 != null && (inneractiveAdSpot2 instanceof C4371p)) {
            ((C4371p) inneractiveAdSpot2).mo24535a();
        }
    }

    /* renamed from: o */
    public void mo24554o() {
        C5326w0 w0Var;
        super.mo24554o();
        if (this.f13820F == UnitDisplayType.REWARDED && (w0Var = this.f13819E) != null) {
            w0Var.mo26410b();
        }
        C5295l0 l0Var = this.f13824J;
        if (l0Var != null) {
            if (l0Var.f14019b == 0) {
                l0Var.f14019b = System.currentTimeMillis();
            }
            if (l0Var.f14020c > 0) {
                l0Var.f14021d += System.currentTimeMillis() - l0Var.f14020c;
                l0Var.f14020c = 0;
            }
        }
        this.f10765u.mo26363b();
    }

    /* renamed from: s */
    public void mo24555s() {
        C5326w0 w0Var;
        super.mo24555s();
        if (this.f13820F == UnitDisplayType.REWARDED && (w0Var = this.f13819E) != null) {
            w0Var.mo26408a();
        }
        C5295l0 l0Var = this.f13824J;
        if (l0Var != null) {
            l0Var.f14020c = System.currentTimeMillis();
        }
        C5253a aVar = this.f10765u;
        if (aVar.f13940b) {
            aVar.f13943e = System.currentTimeMillis();
        }
    }

    /* renamed from: u */
    public boolean mo24347u() {
        boolean z;
        if (this.f10755k == null) {
            z = true;
        } else if (this.f13820F == UnitDisplayType.REWARDED) {
            if (this.f13821G) {
                mo26287L();
            }
            z = this.f13821G;
        } else {
            z = this.f10760p;
        }
        if (!z) {
            return true;
        }
        C4397c.C4398a aVar = this.f10755k;
        if (aVar == null) {
            return false;
        }
        aVar.dismissAd(true);
        return true;
    }

    /* renamed from: L */
    public final void mo26287L() {
        IAlog.m16446a("%sprovide reward called", IAlog.m16443a((Object) this));
        if (this.f13822H) {
            IAlog.m16446a("%sreward was already provided", IAlog.m16443a((Object) this));
            return;
        }
        IAlog.m16446a("%sreward sent", IAlog.m16443a((Object) this));
        if (this.f13823I != null) {
            mo24525a(C4192a.COMPLETION, C4193b.REWARDED_DISPLAY);
            ((InneractiveFullscreenUnitController.C4333a) this.f13823I).mo24454a();
        }
        mo24523D();
        this.f13822H = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = ((com.fyber.inneractive.sdk.flow.C4379u) r7).f10715d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24339a(com.fyber.inneractive.sdk.interfaces.C4397c.C4398a r6, android.app.Activity r7) throws com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError, android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            super.mo24339a((com.fyber.inneractive.sdk.interfaces.C4397c.C4398a) r6, (android.app.Activity) r7)
            AdContent r7 = r5.f10720b
            r0 = 0
            if (r7 == 0) goto L_0x0014
            r1 = r7
            com.fyber.inneractive.sdk.flow.u r1 = (com.fyber.inneractive.sdk.flow.C4379u) r1
            com.fyber.inneractive.sdk.config.z r1 = r1.f10715d
            if (r1 == 0) goto L_0x0014
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C4287y) r1
            com.fyber.inneractive.sdk.config.r r1 = r1.f10546c
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00f3
            if (r7 == 0) goto L_0x0020
            com.fyber.inneractive.sdk.flow.u r7 = (com.fyber.inneractive.sdk.flow.C4379u) r7
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r7 = r7.f10770g
            goto L_0x0021
        L_0x0020:
            r7 = r0
        L_0x0021:
            r5.f13827y = r7
            if (r7 == 0) goto L_0x00de
            com.fyber.inneractive.sdk.web.c r4 = r7.f14079b
            if (r4 == 0) goto L_0x002b
            r4 = r2
            goto L_0x002c
        L_0x002b:
            r4 = r3
        L_0x002c:
            if (r4 == 0) goto L_0x00de
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f10490b
            r5.f13820F = r1
            r5.f13828z = r3
            r5.f13815A = r3
            com.fyber.inneractive.sdk.util.l0 r1 = new com.fyber.inneractive.sdk.util.l0
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r4 = r5.f10719a
            r1.<init>(r4)
            r5.f13824J = r1
            r5.f10755k = r6
            android.view.View r6 = r6.getCloseButton()
            if (r6 == 0) goto L_0x005b
            com.fyber.inneractive.sdk.measurement.a$a r7 = r7.f14143x
            if (r7 == 0) goto L_0x005b
            com.fyber.inneractive.sdk.measurement.f r7 = (com.fyber.inneractive.sdk.measurement.C4407f) r7
            com.iab.omid.library.fyber.adsession.AdSession r1 = r7.f10807b     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x005b
            com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose r4 = com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose.CLOSE_AD     // Catch:{ all -> 0x0057 }
            r1.addFriendlyObstruction(r6, r4, r0)     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r6 = move-exception
            r7.mo24586a(r6)
        L_0x005b:
            AdContent r6 = r5.f10720b
            com.fyber.inneractive.sdk.flow.u r6 = (com.fyber.inneractive.sdk.flow.C4379u) r6
            T r6 = r6.f10713b
            com.fyber.inneractive.sdk.response.f r6 = (com.fyber.inneractive.sdk.response.C5234f) r6
            int r7 = r6.f13869e
            int r6 = r6.f13870f
            r1 = 300(0x12c, float:4.2E-43)
            if (r7 != r1) goto L_0x006f
            r1 = 250(0xfa, float:3.5E-43)
            if (r6 == r1) goto L_0x0077
        L_0x006f:
            r1 = 600(0x258, float:8.41E-43)
            if (r7 != r1) goto L_0x0078
            r1 = 500(0x1f4, float:7.0E-43)
            if (r6 != r1) goto L_0x0078
        L_0x0077:
            r3 = r2
        L_0x0078:
            r5.f13816B = r3
            if (r3 == 0) goto L_0x008b
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r1 = r5.f13827y
            float r7 = (float) r7
            int r7 = com.fyber.inneractive.sdk.util.C5292l.m16499a((float) r7)
            float r6 = (float) r6
            int r6 = com.fyber.inneractive.sdk.util.C5292l.m16499a((float) r6)
            r1.setAdDefaultSize(r7, r6)
        L_0x008b:
            com.fyber.inneractive.sdk.web.d$f r6 = r5.f13825w
            if (r6 != 0) goto L_0x0096
            com.fyber.inneractive.sdk.renderers.l r6 = new com.fyber.inneractive.sdk.renderers.l
            r6.<init>(r5)
            r5.f13825w = r6
        L_0x0096:
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r6 = r5.f13827y
            com.fyber.inneractive.sdk.web.d$f r7 = r5.f13825w
            r6.setListener(r7)
            r5.mo26288M()
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r6 = r5.f13827y
            com.fyber.inneractive.sdk.interfaces.c$a r7 = r5.f10755k
            android.view.ViewGroup r7 = r7.getLayout()
            AdContent r1 = r5.f10720b
            com.fyber.inneractive.sdk.flow.u r1 = (com.fyber.inneractive.sdk.flow.C4379u) r1
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r1.f10712a
            r6.mo26426a(r7, r0)
            r5.f13828z = r2
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r6 = r5.f13820F
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r7 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r6 != r7) goto L_0x00dd
            com.fyber.inneractive.sdk.util.w0 r6 = new com.fyber.inneractive.sdk.util.w0
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f10324J
            com.fyber.inneractive.sdk.config.i r0 = r0.f10356v
            com.fyber.inneractive.sdk.config.h r0 = r0.f10459b
            r1 = 31
            r2 = 30
            java.lang.String r3 = "rewarded_mraid_delay"
            int r0 = r0.mo24271a(r3, r1, r2)
            long r0 = (long) r0
            r6.<init>(r7, r0)
            r5.f13819E = r6
            com.fyber.inneractive.sdk.renderers.k$a r7 = new com.fyber.inneractive.sdk.renderers.k$a
            r7.<init>()
            r6.f14065e = r7
            r6.mo26411c()
        L_0x00dd:
            return
        L_0x00de:
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r7 = com.fyber.inneractive.sdk.util.IAlog.m16443a((java.lang.Object) r5)
            r6[r3] = r7
            java.lang.String r7 = "%sWeb view controller content is not valid. Web view might have crashed"
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r7, r6)
            com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError r6 = new com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError
            java.lang.String r7 = "Web view could not be loaded"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x00f3:
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r7 = com.fyber.inneractive.sdk.util.IAlog.m16443a((java.lang.Object) r5)
            r6[r3] = r7
            java.lang.String r7 = "%sNo display config for full screen mraid ad renderer! Cannot render"
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r7, r6)
            com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError r6 = new com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError
            java.lang.String r7 = "No display config for full screen mraid"
            r6.<init>((java.lang.String) r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C5223k.mo24339a(com.fyber.inneractive.sdk.interfaces.c$a, android.app.Activity):void");
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo24342b(C4361j jVar) {
        C4379u uVar = (C4379u) jVar;
        return false;
    }

    /* renamed from: c */
    public void mo24551c(boolean z) {
        if (mo24333E()) {
            return;
        }
        if (z) {
            this.f10765u.mo26364c();
        } else {
            this.f10765u.mo26361a();
        }
    }

    /* renamed from: b */
    public void mo24341b() {
        mo26288M();
    }

    /* renamed from: a */
    public long mo24338a(long j) {
        if (this.f13820F == UnitDisplayType.REWARDED) {
            return 0;
        }
        C4252h hVar = IAConfigManager.f10324J.f10356v.f10459b;
        long j2 = 13;
        String l = Long.toString(13);
        if (hVar.f10456a.containsKey("mraid_x_fallback_delay")) {
            l = hVar.f10456a.get("mraid_x_fallback_delay");
        }
        try {
            j2 = Long.parseLong(l);
        } catch (Throwable unused) {
        }
        return j2 * 1000;
    }

    /* renamed from: a */
    public void mo24340a(C4397c.C4399b bVar) {
        this.f13823I = bVar;
    }
}
