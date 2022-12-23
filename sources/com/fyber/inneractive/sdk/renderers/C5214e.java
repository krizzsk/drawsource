package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.cache.session.enums.C4192a;
import com.fyber.inneractive.sdk.cache.session.enums.C4193b;
import com.fyber.inneractive.sdk.config.C4269r;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.C4379u;
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
import com.fyber.inneractive.sdk.web.C5349d;

/* renamed from: com.fyber.inneractive.sdk.renderers.e */
public class C5214e implements C5349d.C5355f {

    /* renamed from: a */
    public final /* synthetic */ C5216g f13781a;

    public C5214e(C5216g gVar) {
        this.f13781a = gVar;
    }

    /* renamed from: a */
    public void mo24889a(C5349d dVar) {
        C5216g gVar = this.f13781a;
        gVar.getClass();
        IAlog.m16446a("%sweb view callback: onExpand", IAlog.m16443a((Object) gVar));
        C5216g gVar2 = this.f13781a;
        EventsListener eventslistener = gVar2.f10721c;
        if (eventslistener != null) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdExpanded(gVar2.f10719a);
        }
        C5216g gVar3 = this.f13781a;
        gVar3.getClass();
        IAlog.m16446a("%sweb view callback: onExpand", IAlog.m16443a((Object) gVar3));
        this.f13781a.mo26265d(true);
    }

    /* renamed from: a */
    public void mo24891a(C5349d dVar, boolean z) {
    }

    /* renamed from: a */
    public void mo24892a(C5349d dVar, boolean z, Orientation orientation) {
    }

    /* renamed from: b */
    public void mo24896b(C5349d dVar) {
        this.f13781a.mo26265d(true);
        C5216g gVar = this.f13781a;
        gVar.getClass();
        IAlog.m16446a("%sweb view callback: onResize", IAlog.m16443a((Object) gVar));
        C5216g gVar2 = this.f13781a;
        EventsListener eventslistener = gVar2.f10721c;
        if (eventslistener != null) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdResized(gVar2.f10719a);
        }
    }

    /* renamed from: b */
    public void mo24895b() {
        this.f13781a.mo24534z();
        this.f13781a.mo24521B();
    }

    /* renamed from: a */
    public void mo24890a(C5349d dVar, C4444a0 a0Var) {
        C5216g gVar = this.f13781a;
        gVar.getClass();
        IAlog.m16446a("%sweb view callback: onClose", IAlog.m16443a((Object) gVar));
        C5216g gVar2 = this.f13781a;
        EventsListener eventslistener = gVar2.f10721c;
        if (eventslistener != null) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdCollapsed(gVar2.f10719a);
        }
        this.f13781a.mo26261I();
        C5216g gVar3 = this.f13781a;
        gVar3.getClass();
        IAlog.m16446a("%sweb view callback: onClose", IAlog.m16443a((Object) gVar3));
    }

    /* renamed from: a */
    public C5262d0.C5263a mo24886a(String str, C5306p0 p0Var) {
        Context context;
        C4193b bVar;
        C5216g gVar = this.f13781a;
        gVar.getClass();
        IAlog.m16446a("%sweb view callback: onClicked", IAlog.m16443a((Object) gVar));
        ViewGroup viewGroup = this.f13781a.f13788p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            context = C5292l.f14015a;
        } else {
            context = this.f13781a.f13788p.getContext();
        }
        if (context != null) {
            C5216g gVar2 = this.f13781a;
            if (gVar2.f10727i) {
                AdContent adcontent = gVar2.f10720b;
                C5234f fVar = adcontent != null ? (C5234f) ((C4379u) adcontent).f10713b : null;
                if (fVar != null) {
                    gVar2.mo24527a((C5233e) fVar);
                }
                C5216g gVar3 = this.f13781a;
                AdContent adcontent2 = gVar3.f10720b;
                if (adcontent2 != null) {
                    C4379u uVar = (C4379u) adcontent2;
                    if (!(uVar.f10715d == null || ((C4287y) uVar.f10715d).f10546c == null)) {
                        C4192a aVar = C4192a.CLICK;
                        if (((C4287y) uVar.f10715d).f10546c.f10490b == UnitDisplayType.MRECT) {
                            bVar = C4193b.RECTANGLE_DISPLAY;
                        } else {
                            bVar = C4193b.BANNER_DISPLAY;
                        }
                        gVar3.mo24525a(aVar, bVar);
                    }
                }
                return this.f13781a.mo24524a(context, str, p0Var, C5267e.DISPLAY);
            }
        }
        return new C5262d0.C5263a(C5262d0.C5265c.FAILED, new Exception("No context or no native click detected"), context == null ? "null" : context.getClass().getName());
    }

    /* renamed from: a */
    public void mo24887a() {
        this.f13781a.mo24526a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
    }

    /* renamed from: a */
    public void mo24893a(String str, String str2) {
        C5216g gVar = this.f13781a;
        gVar.getClass();
        IAlog.m16446a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.m16443a((Object) gVar));
        ViewGroup viewGroup = this.f13781a.f13788p;
        if (viewGroup != null && viewGroup.getContext() != null) {
            C5216g gVar2 = this.f13781a;
            if (!gVar2.f13794v) {
                C4517s.m13799a(gVar2.f13788p.getContext(), str, str2, this.f13781a.f10720b);
                boolean unused = this.f13781a.f13794v = true;
                C5216g gVar3 = this.f13781a;
                gVar3.getClass();
                IAlog.m16446a("%sreporting auto redirect", IAlog.m16443a((Object) gVar3));
                return;
            }
            gVar2.getClass();
            IAlog.m16446a("%sredirect already reported for this ad", IAlog.m16443a((Object) gVar2));
        }
    }

    /* renamed from: a */
    public void mo26255a(boolean z) {
        C4288z zVar;
        C4269r rVar;
        C4193b bVar;
        C5216g gVar = this.f13781a;
        gVar.getClass();
        IAlog.m16446a("%sweb view callback: onVisibilityChanged: %s", IAlog.m16443a((Object) gVar), Boolean.valueOf(z));
        if (z) {
            C5216g gVar2 = this.f13781a;
            if (!gVar2.f13787o) {
                IAlog.m16446a("%sonShownForTheFirstTime called", IAlog.m16443a((Object) gVar2));
                AdContent adcontent = gVar2.f10720b;
                C5234f fVar = adcontent != null ? (C5234f) ((C4379u) adcontent).f10713b : null;
                if (fVar != null) {
                    IAmraidWebViewController iAmraidWebViewController = gVar2.f13785m;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.mo26346m();
                    }
                    gVar2.mo24529b((C5233e) fVar);
                }
                long G = (long) gVar2.mo26259G();
                gVar2.f13783k = G;
                if (G != 0) {
                    gVar2.mo26262a(G, true);
                }
                AdContent adcontent2 = gVar2.f10720b;
                if (!(adcontent2 == null || (zVar = ((C4379u) adcontent2).f10715d) == null || (rVar = ((C4287y) zVar).f10546c) == null)) {
                    C4192a aVar = C4192a.IMPRESSION;
                    if (rVar.f10490b == UnitDisplayType.MRECT) {
                        bVar = C4193b.RECTANGLE_DISPLAY;
                    } else {
                        bVar = C4193b.BANNER_DISPLAY;
                    }
                    gVar2.mo24525a(aVar, bVar);
                }
                gVar2.mo24520A();
                this.f13781a.f13787o = true;
                return;
            }
            C5208b bVar2 = gVar2.f13797y;
            if (bVar2 != null) {
                bVar2.mo26250b();
            }
            this.f13781a.mo26261I();
            return;
        }
        C5208b bVar3 = this.f13781a.f13797y;
        if (bVar3 != null && bVar3.f13774h) {
            bVar3.mo26251c();
        }
        this.f13781a.mo26265d(false);
    }

    /* renamed from: a */
    public boolean mo24894a(String str) {
        ViewGroup viewGroup = this.f13781a.f13788p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return false;
        }
        boolean startRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(this.f13781a.f13788p.getContext(), str);
        if (!startRichMediaIntent) {
            return startRichMediaIntent;
        }
        C5216g gVar = this.f13781a;
        if (gVar.f10721c == null) {
            return startRichMediaIntent;
        }
        gVar.mo24534z();
        return startRichMediaIntent;
    }

    /* renamed from: a */
    public void mo24888a(InneractiveUnitController.AdDisplayError adDisplayError) {
        C5216g gVar = this.f13781a;
        EventsListener eventslistener = gVar.f10721c;
        if (eventslistener != null) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdEnteredErrorState(gVar.f10719a, adDisplayError);
        }
    }
}
