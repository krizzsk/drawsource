package com.fyber.inneractive.sdk.renderers;

import android.view.View;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.cache.session.enums.C4192a;
import com.fyber.inneractive.sdk.cache.session.enums.C4193b;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveNativeAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.flow.C4375s;
import com.fyber.inneractive.sdk.flow.C4392y;
import com.fyber.inneractive.sdk.interfaces.C4397c;
import com.fyber.inneractive.sdk.model.vast.C4420b;
import com.fyber.inneractive.sdk.model.vast.C4421c;
import com.fyber.inneractive.sdk.model.vast.C4426h;
import com.fyber.inneractive.sdk.player.C5015i;
import com.fyber.inneractive.sdk.response.C5235g;
import com.fyber.inneractive.sdk.util.C5262d0;
import com.fyber.inneractive.sdk.util.C5267e;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.renderers.j */
public class C5222j extends C4375s<C4392y, InneractiveNativeAdEventsListener> implements C4397c {

    /* renamed from: w */
    public boolean f13814w = false;

    /* renamed from: E */
    public boolean mo24333E() {
        return false;
    }

    /* renamed from: G */
    public int mo24334G() {
        return 0;
    }

    /* renamed from: H */
    public int mo24335H() {
        return 0;
    }

    /* renamed from: I */
    public long mo24336I() {
        return 0;
    }

    /* renamed from: J */
    public boolean mo24337J() {
        return false;
    }

    /* renamed from: L */
    public final void mo26270L() {
        AdContent adcontent = this.f10720b;
        if (adcontent != null) {
            C4392y yVar = (C4392y) adcontent;
            if (yVar.f10715d != null && ((C4287y) yVar.f10715d).f10546c != null) {
                IAConfigManager.f10324J.f10358x.mo24211a(((C4287y) yVar.f10715d).f10546c.f10490b == UnitDisplayType.REWARDED ? C4193b.REWARDED_VIDEO : C4193b.INTERSTITIAL_VIDEO, C4192a.CLICK);
            }
        }
    }

    /* renamed from: a */
    public long mo24338a(long j) {
        return 0;
    }

    /* renamed from: a */
    public C5262d0.C5263a mo26271a(C5306p0 p0Var, C5267e eVar) {
        mo26270L();
        throw null;
    }

    /* renamed from: a */
    public void mo24340a(C4397c.C4399b bVar) {
    }

    /* renamed from: a */
    public void mo26275a(boolean z) {
    }

    /* renamed from: a */
    public void mo26276a(boolean z, Orientation orientation) {
    }

    /* renamed from: b */
    public void mo24341b() {
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo24342b(C4361j jVar) {
        C4392y yVar = (C4392y) jVar;
        return false;
    }

    public void destroy() {
        if (!this.f13814w) {
            mo24345m();
        }
        this.f10720b = null;
        super.destroy();
    }

    /* renamed from: e */
    public void mo26277e() {
    }

    /* renamed from: g */
    public void mo26278g() {
        C4421c cVar;
        C4426h hVar;
        AdContent adcontent = this.f10720b;
        if (adcontent != null) {
            C4392y yVar = (C4392y) adcontent;
            if (yVar.f10712a != null && yVar.f10713b != null) {
                String str = null;
                C4420b bVar = ((C5235g) yVar.f10713b).f13893C;
                if (!(bVar == null || (cVar = bVar.f10865g) == null || (hVar = cVar.f10869b) == null)) {
                    str = hVar.toString();
                }
                mo24528a(str);
            }
        }
    }

    /* renamed from: j */
    public void mo26280j() {
        mo24526a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
    }

    /* renamed from: k */
    public void mo26281k() {
    }

    /* renamed from: l */
    public void mo26282l() {
    }

    /* renamed from: m */
    public void mo24345m() {
        this.f13814w = true;
        AdContent adcontent = this.f10720b;
        if (adcontent != null) {
            C5015i iVar = ((C4392y) adcontent).f10797g;
        }
        IAlog.m16446a("%sunit controller is null!", IAlog.m16443a((Object) this));
    }

    /* renamed from: o */
    public void mo24554o() {
    }

    public void onCompleted() {
    }

    public void onPlayerError() {
    }

    public void onProgress(int i, int i2) {
    }

    /* renamed from: r */
    public void mo26286r() {
        mo24534z();
    }

    /* renamed from: s */
    public void mo24555s() {
    }

    /* renamed from: u */
    public boolean mo24347u() {
        return false;
    }

    /* renamed from: h */
    public void mo26279h() {
        IAlog.m16446a("%snShownCloseButton", IAlog.m16443a((Object) this));
    }

    /* renamed from: a */
    public void mo26274a(String str, String str2) {
        IAlog.m16446a(IAlog.m16443a((Object) this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r2 = (r2 = r2.f10865g).f10869b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.util.C5262d0.C5263a mo26272a(java.lang.String r2, com.fyber.inneractive.sdk.util.C5306p0 r3) {
        /*
            r1 = this;
            AdContent r2 = r1.f10720b
            r3 = 0
            if (r2 == 0) goto L_0x002f
            com.fyber.inneractive.sdk.flow.y r2 = (com.fyber.inneractive.sdk.flow.C4392y) r2
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r0 = r2.f10712a
            if (r0 == 0) goto L_0x002f
            T r2 = r2.f10713b
            if (r2 == 0) goto L_0x002f
            r1.mo26270L()
            AdContent r2 = r1.f10720b
            com.fyber.inneractive.sdk.flow.y r2 = (com.fyber.inneractive.sdk.flow.C4392y) r2
            T r2 = r2.f10713b
            com.fyber.inneractive.sdk.response.g r2 = (com.fyber.inneractive.sdk.response.C5235g) r2
            com.fyber.inneractive.sdk.model.vast.b r2 = r2.f13893C
            if (r2 == 0) goto L_0x002b
            com.fyber.inneractive.sdk.model.vast.c r2 = r2.f10865g
            if (r2 == 0) goto L_0x002b
            com.fyber.inneractive.sdk.model.vast.h r2 = r2.f10869b
            if (r2 == 0) goto L_0x002b
            java.lang.String r2 = r2.toString()
            goto L_0x002c
        L_0x002b:
            r2 = r3
        L_0x002c:
            r1.mo24528a((java.lang.String) r2)
        L_0x002f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C5222j.mo26272a(java.lang.String, com.fyber.inneractive.sdk.util.p0):com.fyber.inneractive.sdk.util.d0$a");
    }

    /* renamed from: a */
    public void mo26273a(View view, String str) {
        if (view != null && view.getContext() != null) {
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
            mo24534z();
        }
    }
}
