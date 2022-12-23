package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.os.Build;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.cache.session.enums.C4192a;
import com.fyber.inneractive.sdk.cache.session.enums.C4193b;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.C4379u;
import com.fyber.inneractive.sdk.interfaces.C4397c;
import com.fyber.inneractive.sdk.mraid.C4444a0;
import com.fyber.inneractive.sdk.network.C4517s;
import com.fyber.inneractive.sdk.p191ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.response.C5234f;
import com.fyber.inneractive.sdk.util.C5262d0;
import com.fyber.inneractive.sdk.util.C5267e;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5347c;
import com.fyber.inneractive.sdk.web.C5349d;

/* renamed from: com.fyber.inneractive.sdk.renderers.l */
public class C5225l implements C5349d.C5355f {

    /* renamed from: a */
    public final /* synthetic */ C5223k f13830a;

    public C5225l(C5223k kVar) {
        this.f13830a = kVar;
    }

    /* renamed from: a */
    public void mo24889a(C5349d dVar) {
        C5223k kVar = this.f13830a;
        kVar.getClass();
        IAlog.m16446a("%sweb view callback: onExpand", IAlog.m16443a((Object) kVar));
        boolean unused = this.f13830a.f13817C = true;
        this.f13830a.mo26288M();
    }

    /* renamed from: b */
    public void mo24896b(C5349d dVar) {
        C5223k kVar = this.f13830a;
        kVar.getClass();
        IAlog.m16446a("%sweb view callback: onResize", IAlog.m16443a((Object) kVar));
    }

    /* renamed from: b */
    public void mo24895b() {
        this.f13830a.mo24534z();
    }

    /* renamed from: a */
    public void mo24890a(C5349d dVar, C4444a0 a0Var) {
        C5223k kVar = this.f13830a;
        kVar.getClass();
        IAlog.m16446a("%sweb view callback: onClose", IAlog.m16443a((Object) kVar));
        C5223k kVar2 = this.f13830a;
        if (kVar2.f13817C) {
            boolean unused = kVar2.f13817C = false;
            this.f13830a.mo26288M();
            return;
        }
        if (kVar2.f13820F == UnitDisplayType.REWARDED) {
            kVar2.mo26287L();
        }
        C4397c.C4398a aVar = this.f13830a.f10755k;
        if (aVar != null) {
            aVar.dismissAd(true);
        }
    }

    /* renamed from: a */
    public C5262d0.C5263a mo24886a(String str, C5306p0 p0Var) {
        C5234f fVar;
        C4193b bVar;
        C5223k kVar = this.f13830a;
        kVar.getClass();
        IAlog.m16446a("%sweb view callback: onClicked", IAlog.m16443a((Object) kVar));
        Context context = C5292l.f14015a;
        C4397c.C4398a aVar = this.f13830a.f10755k;
        if (!(aVar == null || aVar.getLayout() == null || this.f13830a.f10755k.getLayout().getContext() == null)) {
            context = this.f13830a.f10755k.getLayout().getContext();
        }
        if (context != null) {
            C5223k kVar2 = this.f13830a;
            if (kVar2.f10727i) {
                AdContent adcontent = kVar2.f10720b;
                if (adcontent == null) {
                    fVar = null;
                } else {
                    fVar = (C5234f) ((C4379u) adcontent).f10713b;
                }
                if (fVar != null) {
                    kVar2.mo24527a((C5233e) fVar);
                }
                C5223k kVar3 = this.f13830a;
                C4192a aVar2 = C4192a.CLICK;
                if (kVar3.f13820F == UnitDisplayType.REWARDED) {
                    bVar = C4193b.REWARDED_DISPLAY;
                } else {
                    bVar = C4193b.INTERSTITIAL_DISPLAY;
                }
                kVar3.mo24525a(aVar2, bVar);
                return this.f13830a.mo24524a(context, str, p0Var, C5267e.DISPLAY);
            }
        }
        return new C5262d0.C5263a(C5262d0.C5265c.FAILED, new Exception("No context or no native click detected"), context == null ? "null" : context.getClass().getName());
    }

    /* renamed from: a */
    public void mo24887a() {
        this.f13830a.mo24526a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
        this.f13830a.destroy();
    }

    /* renamed from: a */
    public void mo24893a(String str, String str2) {
        C5223k kVar = this.f13830a;
        kVar.getClass();
        IAlog.m16446a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.m16443a((Object) kVar));
        C4397c.C4398a aVar = this.f13830a.f10755k;
        if (aVar != null && aVar.getLayout() != null) {
            C5223k kVar2 = this.f13830a;
            if (!kVar2.f13818D) {
                C4517s.m13799a(kVar2.f10755k.getLayout().getContext(), str, str2, this.f13830a.f10720b);
                boolean unused = this.f13830a.f13818D = true;
                C5223k kVar3 = this.f13830a;
                kVar3.getClass();
                IAlog.m16446a("%sreporting auto redirect", IAlog.m16443a((Object) kVar3));
                return;
            }
            kVar2.getClass();
            IAlog.m16446a("%sredirect already reported for this ad", IAlog.m16443a((Object) kVar2));
        }
    }

    /* renamed from: a */
    public void mo26255a(boolean z) {
        C4193b bVar;
        C5347c cVar;
        String str;
        if (z) {
            C5223k kVar = this.f13830a;
            if (!kVar.f13826x) {
                kVar.f13826x = true;
                if (kVar.f10720b != null) {
                    IAmraidWebViewController iAmraidWebViewController = kVar.f13827y;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.mo26346m();
                    }
                    T t = ((C4379u) kVar.f10720b).f10713b;
                    if (!(t == null || (str = t.f13875k) == null || str.trim().length() <= 0)) {
                        IAlog.m16449d("%sfiring impression!", IAlog.m16443a((Object) kVar));
                        int i = IAlog.f13936a;
                        IAlog.m16444a(1, (Exception) null, "AD_IMPRESSION", new Object[0]);
                        kVar.mo24530b(str);
                    }
                    if (Build.VERSION.SDK_INT >= 19 && (cVar = kVar.f13827y.f14079b) != null) {
                        cVar.mo26448a("var forceReflow = function(elem){ elem = elem || document.documentElement; elem.style.zIndex = 2147483646; var width = elem.style.width, px = elem.offsetWidth+1; elem.style.width = px+'px'; setTimeout(function(){ elem.style.zIndex = 2147483646; elem.style.width = width; elem = null; }, 0); }; forceReflow(document.documentElement);");
                    }
                    C4192a aVar = C4192a.IMPRESSION;
                    if (kVar.f13820F == UnitDisplayType.REWARDED) {
                        bVar = C4193b.REWARDED_DISPLAY;
                    } else {
                        bVar = C4193b.INTERSTITIAL_DISPLAY;
                    }
                    kVar.mo24525a(aVar, bVar);
                    kVar.mo24520A();
                    kVar.mo24549F();
                }
            }
        }
        C5223k kVar2 = this.f13830a;
        kVar2.getClass();
        IAlog.m16446a("%sweb view callback: onVisibilityChanged: %s", IAlog.m16443a((Object) kVar2), Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void mo24892a(C5349d dVar, boolean z, Orientation orientation) {
        C4397c.C4398a aVar = this.f13830a.f10755k;
        if (aVar != null) {
            aVar.setActivityOrientation(z, orientation);
        }
    }

    /* renamed from: a */
    public boolean mo24894a(String str) {
        C4397c.C4398a aVar = this.f13830a.f10755k;
        if (aVar == null || aVar.getLayout() == null) {
            return false;
        }
        boolean startRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(this.f13830a.f10755k.getLayout().getContext(), str);
        if (!startRichMediaIntent) {
            return startRichMediaIntent;
        }
        this.f13830a.mo24534z();
        return startRichMediaIntent;
    }

    /* renamed from: a */
    public void mo24891a(C5349d dVar, boolean z) {
        if (z) {
            C5223k kVar = this.f13830a;
            if (!kVar.f10763s) {
                boolean unused = kVar.f10763s = true;
                C5223k kVar2 = this.f13830a;
                C4397c.C4398a aVar = kVar2.f10755k;
                if (aVar != null) {
                    kVar2.mo24552d(aVar.isCloseButtonDisplay());
                }
            }
            this.f13830a.mo24550K();
            C4397c.C4398a aVar2 = this.f13830a.f10755k;
            if (aVar2 != null && aVar2.isCloseButtonDisplay()) {
                C5223k kVar3 = this.f13830a;
                kVar3.f10760p = false;
                C4397c.C4398a aVar3 = kVar3.f10755k;
                if (aVar3 != null) {
                    aVar3.disableCloseButton();
                }
                kVar3.f10765u.mo26361a();
            }
        }
    }

    /* renamed from: a */
    public void mo24888a(InneractiveUnitController.AdDisplayError adDisplayError) {
        this.f13830a.mo24553e(false);
        C5223k kVar = this.f13830a;
        EventsListener eventslistener = kVar.f10721c;
        if (eventslistener != null) {
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdEnteredErrorState(kVar.f10719a, adDisplayError);
        }
    }
}
