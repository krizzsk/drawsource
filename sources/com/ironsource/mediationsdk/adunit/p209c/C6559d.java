package com.ironsource.mediationsdk.adunit.p209c;

import com.facebook.internal.security.CertificateUtil;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C6432F;
import com.ironsource.mediationsdk.C6577ae;
import com.ironsource.mediationsdk.C6630h;
import com.ironsource.mediationsdk.C6636j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.p209c.C6560e;
import com.ironsource.mediationsdk.adunit.p209c.p210a.C6551a;
import com.ironsource.mediationsdk.adunit.p209c.p211b.C6555a;
import com.ironsource.mediationsdk.adunit.p212d.p213a.C6568a;
import com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.server.C6729b;
import com.ironsource.mediationsdk.utils.C6745k;
import com.ironsource.mediationsdk.utils.C6753o;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.ironsource.mediationsdk.adunit.c.d */
public abstract class C6559d<Smash extends C6568a<?>, Adapter extends BaseAdInteractionAdapter<?, ? extends AdapterAdInteractionListener>> extends C6560e<Smash, Adapter> implements C6551a {
    public C6559d(C6550a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        super(aVar, set, ironSourceSegment);
    }

    /* renamed from: a */
    private void m19898a(IronSourceError ironSourceError, String str) {
        this.f16980q.f16926d.mo36438a(mo36529h(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.f16978o.mo36511b();
        this.f16981r.mo36505a(ironSourceError, this.f16964a.mo36552a(this.f16964a.f17033b));
        if (this.f16976m.f16949h.mo36508b()) {
            mo36523a(false, false);
        }
    }

    /* renamed from: a */
    public final void mo36493a(C6568a<?> aVar) {
        IronLog.INTERNAL.verbose(mo36517a(aVar.mo36547m()));
        C6554b bVar = this.f16981r;
        AdInfo a = this.f16964a.mo36552a(aVar.mo36549o());
        if (bVar.f16951a == IronSource.AD_UNIT.INTERSTITIAL) {
            C6432F.m19211a().mo36002d(a);
        } else if (bVar.f16951a != IronSource.AD_UNIT.REWARDED_VIDEO) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + bVar.f16951a);
        }
    }

    /* renamed from: a */
    public final void mo36494a(IronSourceError ironSourceError, C6568a<?> aVar) {
        C6729b bVar;
        if (this.f16976m.mo36492a() && (bVar = (C6729b) this.f16965b.get(aVar.mo36388k())) != null) {
            this.f16964a.mo36556a(this.f16964a.f17033b, bVar.mo36941a(mo36529h()));
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo36517a(aVar.mo36547m() + " - error = " + ironSourceError));
        this.f16966c.put(aVar.mo36388k(), C6636j.C6637a.ISAuctionPerformanceFailedToShow);
        mo36520a(C6560e.C6563a.READY_TO_LOAD);
        m19898a(ironSourceError, "");
    }

    /* renamed from: a */
    public final void mo36513a(Placement placement) {
        C6568a aVar;
        IronSourceError ironSourceError;
        String stringBuffer;
        IronLog.INTERNAL.verbose(mo36517a("state = " + this.f16977n));
        synchronized (this.f16983t) {
            this.f16973j = placement;
            this.f16980q.f16926d.mo36437a(mo36529h());
            C6560e.C6563a aVar2 = this.f16977n;
            C6560e.C6563a aVar3 = C6560e.C6563a.SHOWING;
            int i = IronSourceError.ERROR_CODE_GENERIC;
            aVar = null;
            if (aVar2 == aVar3) {
                IronSource.AD_UNIT ad_unit = this.f16976m.f16942a;
                if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                    i = 1036;
                } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i = 1022;
                } else {
                    IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
                }
                ironSourceError = new IronSourceError(i, "can't show ad while an ad is already showing");
            } else if (this.f16977n != C6560e.C6563a.READY_TO_SHOW) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while no ads are available");
            } else if (placement == null) {
                IronSource.AD_UNIT ad_unit2 = this.f16976m.f16942a;
                if (ad_unit2 == IronSource.AD_UNIT.INTERSTITIAL) {
                    i = 1020;
                } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i = 1021;
                } else {
                    IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit2);
                }
                ironSourceError = new IronSourceError(i, "empty default placement");
            } else if (C6745k.m20444a(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName(), this.f16976m.f16942a)) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, "placement " + placement.getPlacementName() + " is capped");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                IronLog.API.error(mo36517a(ironSourceError.getErrorMessage()));
                stringBuffer = "";
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                Iterator it = this.f16964a.mo36553a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C6568a aVar4 = (C6568a) it.next();
                    if (aVar4.mo36534a()) {
                        mo36520a(C6560e.C6563a.SHOWING);
                        aVar4.mo36533a(true);
                        aVar = aVar4;
                        break;
                    }
                    if (aVar4.mo36544h() != null) {
                        stringBuffer2.append(aVar4.mo36388k() + CertificateUtil.DELIMITER + aVar4.mo36544h() + ",");
                    }
                    aVar4.mo36533a(false);
                    IronLog.INTERNAL.verbose(mo36517a(aVar4.mo36547m() + " - not ready to show"));
                }
                if (aVar == null) {
                    ironSourceError = ErrorBuilder.buildNoAdsToShowError(this.f16976m.f16942a.toString());
                    stringBuffer = stringBuffer2.toString();
                }
            }
            m19898a(ironSourceError, stringBuffer);
        }
        if (aVar != null) {
            Placement placement2 = this.f16973j;
            if (this.f16976m.f16949h.mo36508b()) {
                this.f16979p.mo35977a();
            }
            aVar.mo36532a(placement2);
        }
    }

    /* renamed from: b */
    public final void mo36495b(C6568a<?> aVar) {
        IronLog.INTERNAL.verbose(mo36517a(aVar.mo36547m()));
        this.f16964a.mo36555a((C6570c<?>) aVar);
        this.f16975l.mo36985a(aVar);
        if (this.f16975l.mo36987b(aVar)) {
            IronLog.INTERNAL.verbose(mo36517a(aVar.mo36388k() + " was session capped"));
            aVar.mo36543g();
            IronSourceUtils.sendAutomationLog(aVar.mo36388k() + " was session capped");
        }
        C6745k.m20447b(ContextProvider.getInstance().getApplicationContext(), mo36529h(), this.f16976m.f16942a);
        if (C6745k.m20444a(ContextProvider.getInstance().getApplicationContext(), mo36529h(), this.f16976m.f16942a)) {
            IronLog.INTERNAL.verbose(mo36517a("placement " + mo36529h() + " is capped"));
            this.f16980q.f16926d.mo36448h(mo36529h());
        }
        C6753o.m20481a().mo36989a(this.f16976m.f16942a);
        if (this.f16976m.mo36492a()) {
            C6729b bVar = (C6729b) this.f16965b.get(aVar.mo36388k());
            if (bVar != null) {
                this.f16964a.mo36556a(this.f16964a.f17033b, bVar.mo36941a(mo36529h()));
                C6630h.m20185a(bVar, aVar.mo36546l(), this.f16972i, mo36529h());
                this.f16966c.put(aVar.mo36388k(), C6636j.C6637a.ISAuctionPerformanceShowedSuccessfully);
                mo36522a(bVar, mo36529h());
            } else {
                String k = aVar.mo36388k();
                String str = "showing instance missing from waterfall - " + k;
                IronLog.INTERNAL.verbose(mo36517a(str));
                this.f16980q.f16927e.mo36472a(1011, str, k);
            }
        }
        C6554b bVar2 = this.f16981r;
        AdInfo a = this.f16964a.mo36552a(aVar.mo36549o());
        if (bVar2.f16951a == IronSource.AD_UNIT.INTERSTITIAL) {
            C6432F.m19211a().mo36000b(a);
        } else if (bVar2.f16951a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6577ae.m20001a().mo36559a(a);
        } else {
            IronLog.INTERNAL.warning("ad unit not supported - " + bVar2.f16951a);
        }
        if (this.f16976m.f16949h.mo36508b()) {
            mo36523a(false, false);
        }
        C6557c cVar = this.f16978o;
        if (cVar.f16960a.f16952a == C6555a.C6556a.AUTOMATIC_LOAD_WHILE_SHOW) {
            cVar.mo36510a(cVar.f16960a.f16953b);
        }
    }

    /* renamed from: b */
    public final boolean mo36514b() {
        if (!mo36527f()) {
            return false;
        }
        if (this.f16974k && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        Iterator it = this.f16964a.mo36553a().iterator();
        while (it.hasNext()) {
            if (((C6568a) it.next()).mo36534a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final String mo36496c() {
        StringBuilder sb = new StringBuilder();
        if (this.f16977n == C6560e.C6563a.READY_TO_SHOW) {
            Iterator it = this.f16964a.mo36553a().iterator();
            while (it.hasNext()) {
                C6568a aVar = (C6568a) it.next();
                if (aVar.mo36541e()) {
                    sb.append(aVar.mo36388k() + ";");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo36497c(C6568a<?> aVar) {
        IronLog.INTERNAL.verbose(mo36517a(aVar.mo36547m()));
        if (this.f16977n == C6560e.C6563a.SHOWING) {
            mo36520a(C6560e.C6563a.READY_TO_LOAD);
        }
        C6557c cVar = this.f16978o;
        if (cVar.f16960a.f16952a == C6555a.C6556a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            cVar.mo36510a(cVar.f16960a.f16953b);
        }
        C6554b bVar = this.f16981r;
        AdInfo a = this.f16964a.mo36552a(aVar.mo36549o());
        if (bVar.f16951a == IronSource.AD_UNIT.INTERSTITIAL) {
            C6432F.m19211a().mo36001c(a);
        } else if (bVar.f16951a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6577ae.m20001a().mo36565b(a);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + bVar.f16951a);
        }
    }

    /* renamed from: d */
    public final void mo36498d(C6568a<?> aVar) {
        IronLog.INTERNAL.verbose(mo36517a(aVar.mo36547m()));
        C6554b bVar = this.f16981r;
        if (bVar.f16951a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6577ae.m20001a().mo36564b();
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar.f16951a);
    }

    /* renamed from: e */
    public final void mo36499e(C6568a<?> aVar) {
        IronLog.INTERNAL.verbose(mo36517a(aVar.mo36547m()));
        C6554b bVar = this.f16981r;
        if (bVar.f16951a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6577ae.m20001a().mo36567c();
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar.f16951a);
    }
}
