package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C4203a;
import com.fyber.inneractive.sdk.config.C4256j;
import com.fyber.inneractive.sdk.config.C4269r;
import com.fyber.inneractive.sdk.config.C4286x;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C4365m;
import com.fyber.inneractive.sdk.interfaces.C4394a;
import com.fyber.inneractive.sdk.metrics.C4413b;
import com.fyber.inneractive.sdk.metrics.C4415c;
import com.fyber.inneractive.sdk.network.C4502n;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.flow.e */
public abstract class C4350e implements C4502n.C4505c, C4394a.C4395a {

    /* renamed from: a */
    public final Runnable f10676a = new C4351a();

    /* renamed from: b */
    public long f10677b = 0;

    /* renamed from: c */
    public C4394a f10678c;

    /* renamed from: d */
    public C4352b f10679d;

    /* renamed from: e */
    public InneractiveAdRequest f10680e;

    /* renamed from: f */
    public C4251s f10681f;

    /* renamed from: g */
    public C4502n f10682g;

    /* renamed from: com.fyber.inneractive.sdk.flow.e$a */
    public class C4351a implements Runnable {
        public C4351a() {
        }

        public void run() {
            C4350e.this.mo24500e();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.e$b */
    public interface C4352b {
    }

    /* renamed from: a */
    public void mo24504a(InneractiveAdRequest inneractiveAdRequest, C5233e eVar, InneractiveErrorCode inneractiveErrorCode) {
        mo24506b();
        if (IAlog.f13936a <= 3) {
            Thread.dumpStack();
        }
        IAlog.m16449d("%sgot onAdRequestFailed! with: %s", mo24499d(), inneractiveErrorCode);
        if (this.f10679d != null) {
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode);
            if (!(eVar == null || eVar.f13873i == null)) {
                inneractiveInfrastructureError.setCause(new Exception(eVar.f13873i + ": " + eVar.f13874j));
            }
            ((C4369n) this.f10679d).mo24543a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }

    /* renamed from: b */
    public void mo24506b() {
        if (this.f10677b > 0) {
            IAlog.m16446a("%scancel in flight timeout after %d millis", mo24499d(), Long.valueOf(System.currentTimeMillis() - this.f10677b));
            C5299n.f14024b.removeCallbacks(this.f10676a);
            this.f10677b = 0;
        }
    }

    /* renamed from: c */
    public C5233e mo24507c() {
        C4394a aVar = this.f10678c;
        if (aVar == null) {
            return null;
        }
        C4348c cVar = (C4348c) aVar;
        if (cVar.f10671c != null) {
            return cVar.f10671c.mo24293c();
        }
        return null;
    }

    /* renamed from: d */
    public String mo24499d() {
        return IAlog.m16443a((Object) this);
    }

    /* renamed from: e */
    public void mo24500e() {
        IAlog.m16446a("%sin flight timeout reached after %d millis", mo24499d(), Long.valueOf(System.currentTimeMillis() - this.f10677b));
        C4394a aVar = this.f10678c;
        if (aVar != null) {
            aVar.mo24491a();
            this.f10678c = null;
        }
    }

    /* renamed from: f */
    public void mo24508f() {
        int i;
        C4286x a;
        mo24506b();
        InneractiveAdRequest inneractiveAdRequest = this.f10680e;
        if (inneractiveAdRequest instanceof C4346a0) {
            inneractiveAdRequest.getClass();
        }
        UnitDisplayType unitDisplayType = null;
        InneractiveAdRequest inneractiveAdRequest2 = this.f10680e;
        if (!(inneractiveAdRequest2 == null || (a = C4203a.m13183a(inneractiveAdRequest2.getSpotId())) == null)) {
            for (C4287y yVar : a.f10542a) {
                C4269r rVar = yVar.f10546c;
                if (rVar != null) {
                    unitDisplayType = rVar.f10490b;
                }
            }
        }
        C4256j jVar = IAConfigManager.f10324J.f10357w;
        jVar.getClass();
        if (unitDisplayType == UnitDisplayType.BANNER) {
            i = jVar.f10464a.f10459b.mo24271a("in_flight_banner_timeout_sec", 10, 3);
        } else {
            i = jVar.f10464a.f10459b.mo24271a("in_flight_interstitial_timeout_sec", 25, 3);
        }
        C5299n.f14024b.postDelayed(this.f10676a, TimeUnit.SECONDS.toMillis((long) i));
        this.f10677b = System.currentTimeMillis();
        IAlog.m16446a("%sstart in flight timeout", mo24499d());
    }

    /* renamed from: a */
    public void mo24503a() {
        T t;
        C4391x xVar;
        mo24506b();
        IAlog.m16449d("%sgot onAdLoaded!", mo24499d());
        C4394a aVar = this.f10678c;
        if (aVar != null) {
            C4352b bVar = this.f10679d;
            if (bVar != null) {
                InneractiveAdRequest inneractiveAdRequest = this.f10680e;
                Content content = ((C4348c) aVar).f10671c;
                C4369n nVar = (C4369n) bVar;
                C4365m mVar = nVar.f10747a;
                if (mVar.f10740j || (xVar = mVar.f10736f) == null || !xVar.supportsRefresh()) {
                    boolean unused = nVar.f10747a.f10740j = false;
                    C4365m mVar2 = nVar.f10747a;
                    mVar2.f10735e = content;
                    content.f10712a = inneractiveAdRequest;
                    if (!mVar2.mo24540d()) {
                        C4365m mVar3 = nVar.f10747a;
                        mVar3.getClass();
                        IAlog.m16446a("%sCannot find appropriate unit controller for unit: %s", IAlog.m16443a((Object) mVar3), nVar.f10747a.f10735e.f10715d);
                        C4349d dVar = nVar.f10747a.f10738h;
                        C5233e c = dVar != null ? dVar.mo24507c() : null;
                        InneractiveErrorCode inneractiveErrorCode = InneractiveErrorCode.INVALID_INPUT;
                        nVar.mo24543a(inneractiveAdRequest, c, new InneractiveInfrastructureError(inneractiveErrorCode, new Exception("Cannot find appropriate unit controller for unit: " + nVar.f10747a.f10735e.f10715d)));
                        nVar.f10747a.f10735e = null;
                    } else {
                        C4365m mVar4 = nVar.f10747a;
                        InneractiveAdSpot.RequestListener requestListener = mVar4.f10732b;
                        if (requestListener != null) {
                            requestListener.onInneractiveSuccessfulAdRequest(mVar4);
                        }
                    }
                } else if (nVar.f10747a.f10736f.canRefreshAd()) {
                    C4365m mVar5 = nVar.f10747a;
                    mVar5.f10735e = content;
                    content.f10712a = inneractiveAdRequest;
                    C4365m.C4368c cVar = mVar5.f10739i;
                    if (cVar != null) {
                        cVar.onAdRefreshed(mVar5);
                    } else {
                        C4391x xVar2 = mVar5.f10736f;
                        if (xVar2 instanceof InneractiveAdViewUnitController) {
                            ((InneractiveAdViewUnitController) xVar2).onAdRefreshed(mVar5);
                        }
                    }
                } else {
                    C4365m mVar6 = nVar.f10747a;
                    mVar6.getClass();
                    IAlog.m16446a("%sad loaded successfully, but the selected unit controller has rejected the refresh!", IAlog.m16443a((Object) mVar6));
                    C4365m mVar7 = nVar.f10747a;
                    mVar7.f10739i.onAdRefreshFailed(mVar7, InneractiveErrorCode.CANCELLED);
                }
                String str = nVar.f10747a.f10731a;
                C4415c cVar2 = C4415c.f10844c;
                cVar2.mo24596a(str).mo24601e();
                cVar2.mo24596a(str).mo24598b();
                C4365m mVar8 = nVar.f10747a;
                C4361j jVar = mVar8.f10735e;
                if (!(jVar == null || (t = jVar.f10713b) == null || t.f13878n == null)) {
                    C4361j jVar2 = mVar8.f10735e;
                    T t2 = jVar2.f10713b;
                    new C4413b(t2, mVar8.f10733c, mVar8.f10731a, t2.f13878n, jVar2.f10714c.mo24268c()).mo24594a();
                }
            }
            this.f10678c = null;
        }
    }

    /* renamed from: a */
    public void mo24505a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        mo24506b();
        IAlog.m16449d("%sgot onFailedLoading! with: %s", mo24499d(), inneractiveInfrastructureError);
        C4352b bVar = this.f10679d;
        if (bVar != null) {
            ((C4369n) bVar).mo24543a(this.f10680e, mo24507c(), inneractiveInfrastructureError);
        }
    }
}
