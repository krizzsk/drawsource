package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.cache.session.enums.C4192a;
import com.fyber.inneractive.sdk.cache.session.enums.C4193b;
import com.fyber.inneractive.sdk.config.C4213d0;
import com.fyber.inneractive.sdk.config.C4218g;
import com.fyber.inneractive.sdk.config.C4252h;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.C4233i;
import com.fyber.inneractive.sdk.config.global.features.C4234j;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.C4371p;
import com.fyber.inneractive.sdk.flow.C4375s;
import com.fyber.inneractive.sdk.flow.C4392y;
import com.fyber.inneractive.sdk.interfaces.C4397c;
import com.fyber.inneractive.sdk.model.vast.C4420b;
import com.fyber.inneractive.sdk.model.vast.C4421c;
import com.fyber.inneractive.sdk.model.vast.C4425g;
import com.fyber.inneractive.sdk.model.vast.C4426h;
import com.fyber.inneractive.sdk.model.vast.C4435q;
import com.fyber.inneractive.sdk.network.C4517s;
import com.fyber.inneractive.sdk.player.C4533c;
import com.fyber.inneractive.sdk.player.C5008f;
import com.fyber.inneractive.sdk.player.C5015i;
import com.fyber.inneractive.sdk.player.controller.C4574b;
import com.fyber.inneractive.sdk.player.p190ui.C5040g;
import com.fyber.inneractive.sdk.player.p190ui.C5042i;
import com.fyber.inneractive.sdk.response.C5235g;
import com.fyber.inneractive.sdk.util.C5253a;
import com.fyber.inneractive.sdk.util.C5262d0;
import com.fyber.inneractive.sdk.util.C5267e;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.renderers.m */
public class C5226m extends C4375s<C4392y, InneractiveFullscreenAdEventsListener> implements C4397c {

    /* renamed from: A */
    public boolean f13831A = false;

    /* renamed from: B */
    public boolean f13832B = false;

    /* renamed from: C */
    public boolean f13833C = false;

    /* renamed from: D */
    public C4397c.C4399b f13834D;

    /* renamed from: E */
    public UnitDisplayType f13835E = UnitDisplayType.INTERSTITIAL;

    /* renamed from: F */
    public C5228n f13836F;

    /* renamed from: G */
    public final C4533c.C4536c f13837G = new C5227a();

    /* renamed from: H */
    public final RelativeLayout.LayoutParams f13838H = new RelativeLayout.LayoutParams(-1, -1);

    /* renamed from: I */
    public boolean f13839I = false;

    /* renamed from: J */
    public boolean f13840J = false;

    /* renamed from: w */
    public C4397c.C4398a f13841w;

    /* renamed from: x */
    public C5040g f13842x;

    /* renamed from: y */
    public C4574b f13843y;

    /* renamed from: z */
    public WeakReference<InneractiveFullscreenVideoContentController> f13844z;

    /* renamed from: com.fyber.inneractive.sdk.renderers.m$a */
    public class C5227a implements C4533c.C4536c {
        public C5227a() {
        }

        /* renamed from: a */
        public void mo24727a(C4533c cVar) {
            C5226m.this.f13843y.mo24805d(false);
            C5226m.this.f13843y.mo24807f();
        }
    }

    /* renamed from: E */
    public boolean mo24333E() {
        return this.f13839I;
    }

    /* renamed from: G */
    public int mo24334G() {
        Integer b;
        AdContent adcontent = this.f10720b;
        if (adcontent == null) {
            return -1;
        }
        C4392y yVar = (C4392y) adcontent;
        if (yVar.f10714c == null || yVar.f10714c.mo24264a(C4233i.class) == null || (b = ((C4233i) ((C4392y) this.f10720b).f10714c.mo24264a(C4233i.class)).mo24240b("close_clickable_area_dp")) == null) {
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
        C4392y yVar = (C4392y) adcontent;
        if (yVar.f10714c == null || yVar.f10714c.mo24264a(C4233i.class) == null || (b = ((C4233i) ((C4392y) this.f10720b).f10714c.mo24264a(C4233i.class)).mo24240b("close_visible_size_dp")) == null) {
            return -1;
        }
        return b.intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008e  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo24336I() {
        /*
            r8 = this;
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f10324J
            com.fyber.inneractive.sdk.config.i r1 = r0.f10356v
            com.fyber.inneractive.sdk.config.h r1 = r1.f10459b
            java.lang.String r2 = "endcard"
            com.fyber.inneractive.sdk.config.f r1 = r1.mo24272a((java.lang.String) r2)
            r1.getClass()
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f10408a
            java.lang.String r3 = "endcard_cr"
            boolean r2 = r2.containsKey(r3)
            r4 = 1
            java.lang.String r5 = "endcard_ci"
            r6 = 3
            if (r2 != 0) goto L_0x0094
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f10408a
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x0028
            goto L_0x0094
        L_0x0028:
            com.fyber.inneractive.sdk.config.i r0 = r0.f10356v
            com.fyber.inneractive.sdk.config.h r0 = r0.f10459b
            java.lang.String r1 = "vast_endcard_x_delay"
            java.lang.String r2 = java.lang.Long.toString(r6)
            java.util.Map<java.lang.String, java.lang.String> r3 = r0.f10456a
            boolean r3 = r3.containsKey(r1)
            if (r3 == 0) goto L_0x0043
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f10456a
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0043:
            long r6 = java.lang.Long.parseLong(r2)     // Catch:{ all -> 0x0047 }
        L_0x0047:
            AdContent r0 = r8.f10720b
            if (r0 == 0) goto L_0x00c1
            com.fyber.inneractive.sdk.flow.y r0 = (com.fyber.inneractive.sdk.flow.C4392y) r0
            T r1 = r0.f10713b
            if (r1 == 0) goto L_0x00c1
            com.fyber.inneractive.sdk.response.g r1 = (com.fyber.inneractive.sdk.response.C5235g) r1
            com.fyber.inneractive.sdk.model.vast.b r1 = r1.f13893C
            if (r1 == 0) goto L_0x00c1
            com.fyber.inneractive.sdk.model.vast.c r1 = r1.f10865g
            if (r1 == 0) goto L_0x00c1
            com.fyber.inneractive.sdk.model.vast.g r1 = r1.f10868a
            com.fyber.inneractive.sdk.model.vast.g r2 = com.fyber.inneractive.sdk.model.vast.C4425g.Static
            if (r1 != r2) goto L_0x00c1
            com.fyber.inneractive.sdk.config.global.s r0 = r0.f10714c
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.j> r1 = com.fyber.inneractive.sdk.config.global.features.C4234j.class
            com.fyber.inneractive.sdk.config.global.features.e r0 = r0.mo24264a(r1)
            com.fyber.inneractive.sdk.config.global.features.j r0 = (com.fyber.inneractive.sdk.config.global.features.C4234j) r0
            if (r0 == 0) goto L_0x008b
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r8.f13835E
            int[] r2 = com.fyber.inneractive.sdk.config.global.features.C4234j.C4235a.f10427a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            if (r1 == r4) goto L_0x0084
            r2 = 2
            if (r1 == r2) goto L_0x007d
            goto L_0x008b
        L_0x007d:
            java.lang.String r1 = "endcard_x_btn_delay_iv"
            java.lang.Integer r0 = r0.mo24240b(r1)
            goto L_0x008c
        L_0x0084:
            java.lang.String r1 = "endcard_x_btn_delay_rv"
            java.lang.Integer r0 = r0.mo24240b(r1)
            goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            if (r0 == 0) goto L_0x00c1
            int r0 = r0.intValue()
            long r6 = (long) r0
            goto L_0x00c1
        L_0x0094:
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r0 = r8.f13835E
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r2 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r0 != r2) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r3 = r5
        L_0x009c:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f10408a     // Catch:{ Exception -> 0x00b1 }
            boolean r0 = r0.containsKey(r3)     // Catch:{ Exception -> 0x00b1 }
            if (r0 == 0) goto L_0x00b1
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f10408a     // Catch:{ Exception -> 0x00b1 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00b1 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b2
        L_0x00b1:
            r0 = r6
        L_0x00b2:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x00c1
            r2 = 5
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x00c1
            r8.f10764t = r4
            r6 = r0
        L_0x00c1:
            com.fyber.inneractive.sdk.player.controller.b r0 = r8.f13843y
            r1 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x00cc
            long r3 = r6 * r1
            r0.mo24799a((long) r3)
        L_0x00cc:
            long r6 = r6 * r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C5226m.mo24336I():long");
    }

    /* renamed from: J */
    public boolean mo24337J() {
        C5040g gVar = this.f13842x;
        return gVar != null && ((C5042i) gVar).mo25675d();
    }

    /* renamed from: L */
    public void mo26289L() {
        if (!this.f13832B && this.f10721c != null) {
            this.f13832B = true;
            C4397c.C4398a aVar = this.f13841w;
            if (aVar != null && aVar.wasDismissedByUser()) {
                mo26294a(C4435q.EVENT_CLOSE);
                mo26294a(C4435q.EVENT_CLOSE_LINEAR);
            }
            ((InneractiveFullscreenAdEventsListener) this.f10721c).onAdDismissed(this.f10719a);
        }
    }

    /* renamed from: M */
    public final void mo26290M() {
        C4193b bVar;
        AdContent adcontent = this.f10720b;
        if (adcontent != null) {
            C4392y yVar = (C4392y) adcontent;
            if (yVar.f10715d != null && ((C4287y) yVar.f10715d).f10546c != null) {
                UnitDisplayType unitDisplayType = ((C4287y) yVar.f10715d).f10546c.f10490b;
                C4213d0 d0Var = IAConfigManager.f10324J.f10358x;
                if (unitDisplayType == UnitDisplayType.REWARDED) {
                    bVar = C4193b.REWARDED_VIDEO;
                } else {
                    bVar = C4193b.INTERSTITIAL_VIDEO;
                }
                d0Var.mo24211a(bVar, C4192a.CLICK);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.fyber.inneractive.sdk.flow.l, com.fyber.inneractive.sdk.renderers.m, com.fyber.inneractive.sdk.player.controller.s, com.fyber.inneractive.sdk.flow.s, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24339a(com.fyber.inneractive.sdk.interfaces.C4397c.C4398a r5, android.app.Activity r6) throws com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError {
        /*
            r4 = this;
            super.mo24339a((com.fyber.inneractive.sdk.interfaces.C4397c.C4398a) r5, (android.app.Activity) r6)
            r4.f13841w = r5
            r5 = 0
            r4.f13831A = r5
            r4.f13832B = r5
            r4.f13840J = r5
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r6 = r4.f10719a
            com.fyber.inneractive.sdk.external.InneractiveUnitController r6 = r6.getSelectedUnitController()
            r0 = 1
            if (r6 == 0) goto L_0x0053
            boolean r1 = r6 instanceof com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController
            if (r1 != 0) goto L_0x0027
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r1 = com.fyber.inneractive.sdk.util.IAlog.m16443a((java.lang.Object) r4)
            r6[r5] = r1
            java.lang.String r1 = "%sWrong type of unit controller found. Expecting InneractiveFullscreenUnitController"
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r1, r6)
            goto L_0x0053
        L_0x0027:
            com.fyber.inneractive.sdk.external.InneractiveContentController r6 = r6.getSelectedContentController()
            if (r6 == 0) goto L_0x0053
            boolean r1 = r6 instanceof com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController
            if (r1 == 0) goto L_0x003b
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController r6 = (com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController) r6
            r1.<init>(r6)
            r4.f13844z = r1
            goto L_0x0053
        L_0x003b:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = com.fyber.inneractive.sdk.util.IAlog.m16443a((java.lang.Object) r4)
            r1[r5] = r2
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r1[r0] = r6
            java.lang.String r6 = "%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s"
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r6, r1)
        L_0x0053:
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r6 = r4.f10719a
            com.fyber.inneractive.sdk.flow.j r6 = r6.getAdContent()
            com.fyber.inneractive.sdk.config.z r6 = r6.f10715d
            if (r6 == 0) goto L_0x0067
            com.fyber.inneractive.sdk.config.y r6 = (com.fyber.inneractive.sdk.config.C4287y) r6
            com.fyber.inneractive.sdk.config.a0 r6 = r6.f10549f
            if (r6 == 0) goto L_0x0067
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r6 = r6.f10378j
            r4.f13835E = r6
        L_0x0067:
            AdContent r6 = r4.f10720b
            com.fyber.inneractive.sdk.flow.y r6 = (com.fyber.inneractive.sdk.flow.C4392y) r6
            com.fyber.inneractive.sdk.player.i r6 = r6.f10797g
            com.fyber.inneractive.sdk.interfaces.c$a r1 = r4.f13841w
            android.view.ViewGroup r1 = r1.getLayout()
            android.content.Context r1 = r1.getContext()
            if (r6 == 0) goto L_0x00f8
            com.fyber.inneractive.sdk.player.a$a r2 = r6.f13374f
            if (r2 == 0) goto L_0x008b
            r3 = r2
            com.fyber.inneractive.sdk.player.f r3 = (com.fyber.inneractive.sdk.player.C5008f) r3
            com.fyber.inneractive.sdk.player.controller.g r3 = r3.f11205b
            if (r3 == 0) goto L_0x0086
            r3 = r0
            goto L_0x0087
        L_0x0086:
            r3 = r5
        L_0x0087:
            if (r3 == 0) goto L_0x008b
            r3 = r0
            goto L_0x008c
        L_0x008b:
            r3 = r5
        L_0x008c:
            if (r3 == 0) goto L_0x00e3
            com.fyber.inneractive.sdk.player.f r2 = (com.fyber.inneractive.sdk.player.C5008f) r2
            r2.getClass()
            com.fyber.inneractive.sdk.renderers.c r5 = new com.fyber.inneractive.sdk.renderers.c
            r5.<init>(r6)
            r4.f13836F = r5
            com.fyber.inneractive.sdk.player.ui.g r5 = r5.mo26254a((android.content.Context) r1)
            r4.f13842x = r5
            com.fyber.inneractive.sdk.renderers.n r5 = r4.f13836F
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r6 = r4.f10719a
            AdContent r1 = r4.f10720b
            com.fyber.inneractive.sdk.flow.y r1 = (com.fyber.inneractive.sdk.flow.C4392y) r1
            com.fyber.inneractive.sdk.player.controller.b r5 = r5.mo26245a(r6, r1)
            r4.f13843y = r5
            com.fyber.inneractive.sdk.renderers.n r6 = r4.f13836F
            boolean r6 = r6.mo26248a()
            r5.mo24805d(r6)
            com.fyber.inneractive.sdk.player.controller.b r5 = r4.f13843y
            r5.mo24801a(r4)
            com.fyber.inneractive.sdk.player.ui.g r5 = r4.f13842x
            com.fyber.inneractive.sdk.player.ui.c r5 = (com.fyber.inneractive.sdk.player.p190ui.C5036c) r5
            r5.mo25652b()
            android.widget.RelativeLayout$LayoutParams r5 = r4.f13838H
            r6 = 13
            r5.addRule(r6)
            com.fyber.inneractive.sdk.interfaces.c$a r5 = r4.f13841w
            android.view.ViewGroup r5 = r5.getLayout()
            com.fyber.inneractive.sdk.player.ui.g r6 = r4.f13842x
            android.view.View r6 = (android.view.View) r6
            android.widget.RelativeLayout$LayoutParams r1 = r4.f13838H
            r5.addView(r6, r1)
            com.fyber.inneractive.sdk.renderers.n r5 = r4.f13836F
            com.fyber.inneractive.sdk.player.c$c r6 = r4.f13837G
            r5.mo26247a(r6)
            r4.f13831A = r0
            goto L_0x00f8
        L_0x00e3:
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.m16443a((java.lang.Object) r4)
            r6[r5] = r0
            java.lang.String r5 = "%sFull screen video ad renderer is not valid."
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r5, r6)
            com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError r5 = new com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError
            java.lang.String r6 = "Full screen video could not be loaded"
            r5.<init>((java.lang.String) r6)
            throw r5
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C5226m.mo24339a(com.fyber.inneractive.sdk.interfaces.c$a, android.app.Activity):void");
    }

    /* renamed from: b */
    public void mo24341b() {
    }

    /* renamed from: c */
    public void mo24551c(boolean z) {
        C5040g gVar = this.f13842x;
        if ((gVar != null && ((C5042i) gVar).mo25675d()) && this.f13839I) {
            return;
        }
        if (z) {
            this.f10765u.mo26364c();
        } else {
            this.f10765u.mo26361a();
        }
    }

    public void destroy() {
        C4397c.C4398a aVar = this.f13841w;
        if (aVar != null) {
            aVar.destroy();
        }
        if (this.f13831A) {
            mo26289L();
        }
        C4574b bVar = this.f13843y;
        if (bVar != null) {
            bVar.destroy();
            this.f13843y = null;
        }
        C5040g gVar = this.f13842x;
        if (gVar != null) {
            gVar.destroy();
            this.f13842x = null;
        }
        this.f13841w = null;
        this.f13844z = null;
        super.destroy();
    }

    /* renamed from: e */
    public void mo26299e() {
        if (!this.f13833C) {
            this.f10765u.mo26362a(true);
        }
        this.f13833C = true;
    }

    /* renamed from: g */
    public void mo26300g() {
        C4421c cVar;
        C4426h hVar;
        AdContent adcontent = this.f10720b;
        if (adcontent != null) {
            C4392y yVar = (C4392y) adcontent;
            if (yVar.f10712a != null && yVar.f10713b != null) {
                String str = null;
                mo26290M();
                C4420b bVar = ((C5235g) ((C4392y) this.f10720b).f10713b).f13893C;
                if (!(bVar == null || (cVar = bVar.f10865g) == null || (hVar = cVar.f10869b) == null)) {
                    str = hVar.toString();
                }
                mo24528a(str);
            }
        }
    }

    /* renamed from: h */
    public void mo26301h() {
        this.f13839I = true;
        CountDownTimer countDownTimer = this.f10766v;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f10766v = null;
        }
        if (!this.f10763s) {
            this.f10763s = true;
            C4397c.C4398a aVar = this.f13841w;
            if (aVar != null) {
                mo24552d(aVar.isCloseButtonDisplay());
            }
        }
        C4397c.C4398a aVar2 = this.f13841w;
        if (aVar2 != null && aVar2.isCloseButtonDisplay()) {
            mo24553e(true);
        }
    }

    /* renamed from: j */
    public void mo26302j() {
        C4397c.C4398a aVar = this.f13841w;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        mo24526a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
    }

    /* renamed from: k */
    public void mo26303k() {
        C4397c.C4398a aVar = this.f13841w;
        if (aVar != null) {
            aVar.dismissAd(true);
        }
    }

    /* renamed from: l */
    public void mo26304l() {
        C4193b bVar;
        C4213d0 d0Var = IAConfigManager.f10324J.f10358x;
        if (this.f13835E == UnitDisplayType.INTERSTITIAL) {
            bVar = C4193b.INTERSTITIAL_VIDEO;
        } else {
            bVar = C4193b.REWARDED_VIDEO;
        }
        d0Var.mo24211a(bVar, C4192a.IMPRESSION);
        mo24520A();
    }

    /* renamed from: m */
    public void mo24345m() {
        mo26289L();
        InneractiveAdSpot inneractiveAdSpot = this.f10719a;
        if (inneractiveAdSpot != null && (inneractiveAdSpot instanceof C4371p)) {
            ((C4371p) inneractiveAdSpot).mo24535a();
        }
    }

    /* renamed from: o */
    public void mo24554o() {
        super.mo24554o();
        this.f10765u.mo26363b();
    }

    public void onCompleted() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) C5312s.m16531a(this.f13844z);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onCompleted();
        }
        C4213d0 d0Var = IAConfigManager.f10324J.f10358x;
        UnitDisplayType unitDisplayType = this.f13835E;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.REWARDED;
        d0Var.mo24211a(unitDisplayType == unitDisplayType2 ? C4193b.REWARDED_VIDEO : C4193b.INTERSTITIAL_VIDEO, C4192a.COMPLETION);
        if (this.f13835E == unitDisplayType2) {
            C4397c.C4399b bVar = this.f13834D;
            if (bVar != null) {
                ((InneractiveFullscreenUnitController.C4333a) bVar).mo24454a();
            }
            mo24523D();
        }
        AdContent adcontent = this.f10720b;
        if (adcontent != null && ((C4392y) adcontent).f10797g != null) {
            mo24549F();
        }
    }

    public void onPlayerError() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) C5312s.m16531a(this.f13844z);
        C4397c.C4398a aVar = this.f13841w;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onPlayerError();
        }
    }

    public void onProgress(int i, int i2) {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) C5312s.m16531a(this.f13844z);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onProgress(i, i2);
        }
    }

    /* renamed from: r */
    public void mo26308r() {
        mo24534z();
    }

    /* renamed from: s */
    public void mo24555s() {
        super.mo24555s();
        C5253a aVar = this.f10765u;
        if (aVar.f13940b) {
            aVar.f13943e = System.currentTimeMillis();
        }
    }

    /* renamed from: u */
    public boolean mo24347u() {
        C4574b bVar;
        C4397c.C4398a aVar;
        C5040g gVar;
        AdContent adcontent = this.f10720b;
        if (adcontent != null) {
            C4392y yVar = (C4392y) adcontent;
            if (!(yVar.f10797g == null || (bVar = this.f13843y) == null || (aVar = this.f13841w) == null || (gVar = this.f13842x) == null)) {
                ((C5008f) yVar.f10797g.f13374f).getClass();
                if (bVar == null) {
                    aVar.dismissAd(true);
                    return true;
                } else if (((C5042i) gVar).mo25675d()) {
                    if (!this.f10760p) {
                        return true;
                    }
                    aVar.dismissAd(true);
                    return true;
                } else if (!bVar.mo24804c()) {
                    return true;
                } else {
                    bVar.mo24803c(true);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo24340a(C4397c.C4399b bVar) {
        this.f13834D = bVar;
    }

    /* renamed from: a */
    public C5262d0.C5263a mo26291a(C5306p0 p0Var, C5267e eVar) {
        Context context;
        mo26290M();
        if (this.f13842x.getContext() == null) {
            context = C5292l.f14015a;
        } else {
            context = this.f13842x.getContext();
        }
        AdContent adcontent = this.f10720b;
        return mo24524a(context, adcontent != null ? ((C4392y) adcontent).mo24573f() : null, p0Var, eVar);
    }

    /* renamed from: a */
    public void mo26297a(boolean z, Orientation orientation) {
        C4397c.C4398a aVar = this.f13841w;
        if (aVar != null) {
            aVar.setActivityOrientation(z, orientation);
        }
    }

    /* renamed from: a */
    public void mo26295a(String str, String str2) {
        IAlog.m16446a(IAlog.m16443a((Object) this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
        C4397c.C4398a aVar = this.f13841w;
        if (aVar != null && aVar.getLayout() != null && this.f13841w.getLayout().getContext() != null) {
            if (!this.f13840J) {
                C4517s.m13799a(this.f13841w.getLayout().getContext(), str, str2, this.f10720b);
                this.f13840J = true;
                IAlog.m16446a(IAlog.m16443a((Object) this) + "reporting auto redirect", new Object[0]);
                return;
            }
            IAlog.m16446a(IAlog.m16443a((Object) this) + "redirect already reported for this ad", new Object[0]);
        }
    }

    /* renamed from: a */
    public C5262d0.C5263a mo26292a(String str, C5306p0 p0Var) {
        Context context;
        C4426h hVar;
        AdContent adcontent = this.f10720b;
        if (adcontent != null) {
            C4392y yVar = (C4392y) adcontent;
            if (!(yVar.f10713b == null || yVar.f10713b == null)) {
                C4420b bVar = ((C5235g) yVar.f10713b).f13893C;
                mo26290M();
                if (bVar != null) {
                    C4421c cVar = bVar.f10865g;
                    String str2 = null;
                    if (!(cVar == null || (hVar = cVar.f10869b) == null)) {
                        str2 = hVar.toString();
                    }
                    mo24528a(str2);
                    C5267e eVar = cVar == null ? C5267e.DEFAULT_ENDCARD : C5267e.VAST_ENDCARD;
                    if (this.f13842x.getContext() == null) {
                        context = C5292l.f14015a;
                    } else {
                        context = this.f13842x.getContext();
                    }
                    C5262d0.C5263a a = mo24524a(context, str, p0Var, eVar);
                    if (!(cVar == null || a.f13957a == C5262d0.C5265c.FAILED)) {
                        C4435q qVar = C4435q.EVENT_CLICK;
                        String[] strArr = {"EVENT_CLICK"};
                        C5015i iVar = ((C4392y) this.f10720b).f10797g;
                        if (iVar != null) {
                            iVar.mo25604a("EVENT_TRACKING", strArr);
                        }
                    }
                    return a;
                }
            }
        }
        return new C5262d0.C5263a(C5262d0.C5265c.FAILED, new Exception("Internal SDK Error"), "null");
    }

    /* renamed from: a */
    public void mo26296a(boolean z) {
        C4397c.C4398a aVar;
        AdContent adcontent = this.f10720b;
        if (adcontent != null) {
            C4392y yVar = (C4392y) adcontent;
            if (yVar.f10797g != null) {
                yVar.f10797g.mo25604a("TRACKING_COMPLETED", new String[0]);
                mo24549F();
                String[] strArr = new String[0];
                C5015i iVar = ((C4392y) this.f10720b).f10797g;
                if (iVar != null) {
                    iVar.mo25604a("TRACKING_COMPLETED", strArr);
                }
                if (!IAConfigManager.f10324J.f10356v.f10459b.mo24272a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).mo24228a("dsos", false) || !z || (aVar = this.f13841w) == null) {
                    mo24551c(z);
                } else {
                    aVar.dismissAd(true);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo26293a(View view, String str) {
        if (view != null && view.getContext() != null) {
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
            mo24534z();
        }
    }

    /* renamed from: a */
    public boolean mo24342b(C4392y yVar) {
        C4218g gVar;
        T t;
        C4420b bVar;
        C4421c cVar;
        IAConfigManager iAConfigManager = IAConfigManager.f10324J;
        C4252h hVar = iAConfigManager.f10356v.f10459b;
        hVar.getClass();
        String str = iAConfigManager.f10338d;
        if (hVar.f10457b.containsKey(str)) {
            gVar = hVar.f10457b.get(str);
        } else {
            gVar = new C4218g();
        }
        if (gVar.f10409a.containsKey(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD) || (t = yVar.f10713b) == null || (bVar = ((C5235g) t).f13893C) == null || (cVar = bVar.f10865g) == null || cVar.f10868a != C4425g.Static) {
            return false;
        }
        C4234j jVar = (C4234j) yVar.f10714c.mo24264a(C4234j.class);
        UnitDisplayType unitDisplayType = this.f13835E;
        jVar.getClass();
        int i = C4234j.C4235a.f10427a[unitDisplayType.ordinal()];
        if (i == 1) {
            return jVar.mo24239a("countdown_rv", false);
        }
        if (i != 2) {
            return false;
        }
        return jVar.mo24239a("countdown_iv", false);
    }

    /* renamed from: a */
    public long mo24338a(long j) {
        if (this.f10764t) {
            return j;
        }
        C4252h hVar = IAConfigManager.f10324J.f10356v.f10459b;
        long j2 = 12;
        String l = Long.toString(12);
        if (hVar.f10456a.containsKey("vast_endcard_x_fallback_delay")) {
            l = hVar.f10456a.get("vast_endcard_x_fallback_delay");
        }
        try {
            j2 = Long.parseLong(l);
        } catch (Throwable unused) {
        }
        return j2 * 1000;
    }

    /* renamed from: a */
    public void mo26294a(C4435q qVar) {
        C5015i iVar;
        AdContent adcontent = this.f10720b;
        if (adcontent != null && (iVar = ((C4392y) adcontent).f10797g) != null) {
            String[] strArr = {qVar.f10949a};
            if (iVar != null) {
                iVar.mo25604a("EVENT_TRACKING", strArr);
            }
        }
    }
}
