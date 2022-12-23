package com.fyber.inneractive.sdk.external;

import android.app.Activity;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.C4204a0;
import com.fyber.inneractive.sdk.config.C4269r;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.display.C4289a;
import com.fyber.inneractive.sdk.display.C4290b;
import com.fyber.inneractive.sdk.display.C4291c;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.factories.C4342c;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.flow.C4371p;
import com.fyber.inneractive.sdk.flow.C4391x;
import com.fyber.inneractive.sdk.interfaces.C4397c;
import com.fyber.inneractive.sdk.network.C4509p;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.p188dv.C4292a;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

public class InneractiveFullscreenUnitController extends C4391x<InneractiveFullscreenAdEventsListener> implements InneractiveFullscreenAdActivity.FullScreenRendererProvider, InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener {

    /* renamed from: a */
    public boolean f10632a = false;

    /* renamed from: b */
    public InneractiveFullScreenAdRewardedListener f10633b;

    /* renamed from: c */
    public final C4397c.C4399b f10634c = new C4333a();
    public C4397c mRenderer;

    public static class AdExpiredError extends InneractiveUnitController.AdDisplayError {
        public AdExpiredError(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController$a */
    public class C4333a implements C4397c.C4399b {
        public C4333a() {
        }

        /* renamed from: a */
        public void mo24454a() {
            C4371p pVar = (C4371p) C5312s.m16531a(InneractiveFullscreenUnitController.this.mAdSpot);
            InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = InneractiveFullscreenUnitController.this.f10633b;
            if (inneractiveFullScreenAdRewardedListener != null && pVar != null) {
                inneractiveFullScreenAdRewardedListener.onAdRewarded(pVar);
            }
        }
    }

    public void destroy() {
        C4397c cVar = this.mRenderer;
        if (cVar != null) {
            cVar.destroy();
            this.mRenderer = null;
        }
        super.destroy();
    }

    public C4397c getFullscreenRenderer() {
        return this.mRenderer;
    }

    public InneractiveFullScreenAdRewardedListener getRewardedListener() {
        return this.f10633b;
    }

    public boolean isAvailable() {
        C4371p pVar = (C4371p) C5312s.m16531a(this.mAdSpot);
        return pVar != null && pVar.isReady();
    }

    public void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f10632a = false;
    }

    public void setRewardedListener(InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener) {
        this.f10633b = inneractiveFullScreenAdRewardedListener;
    }

    public void show(Activity activity) {
        C4289a aVar;
        if (activity == null) {
            IAlog.m16450e("show() called with a null activity", new Object[0]);
        } else if (!this.f10632a) {
            InneractiveAdSpot adSpot = getAdSpot();
            if (adSpot == null) {
                IAlog.m16450e("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
                return;
            }
            C4361j adContent = adSpot.getAdContent();
            if (adContent != null) {
                C4509p pVar = C4509p.IA_PUBLISHER_REQUESTED_SHOW;
                InneractiveAdRequest inneractiveAdRequest = adContent.f10712a;
                C5233e c = adContent.mo24293c();
                JSONArray c2 = adContent.f10714c.mo24268c();
                C4511q.C4512a aVar2 = new C4511q.C4512a(c);
                aVar2.f11164c = pVar;
                aVar2.f11162a = inneractiveAdRequest;
                aVar2.f11165d = c2;
                aVar2.mo24693a((String) null);
            }
            if (!adSpot.isReady()) {
                EL el = this.mEventsListener;
                if (el != null) {
                    ((InneractiveFullscreenAdEventsListener) el).onAdEnteredErrorState(adSpot, new AdExpiredError("Ad Expired"));
                    return;
                }
                return;
            }
            if (this.mRenderer == null) {
                this.mRenderer = C4342c.C4344b.f10659a.mo24486a(getAdSpot());
            }
            selectContentController();
            if (adContent instanceof C4292a) {
                aVar = new C4290b();
            } else {
                aVar = new C4291c();
            }
            aVar.mo24290a(activity, adSpot, adSpot.getLocalUniqueId());
            this.f10632a = true;
            C4397c cVar = this.mRenderer;
            if (cVar != null) {
                cVar.mo24340a(this.f10634c);
            }
        } else {
            IAlog.m16450e("InneractiveFullscreenUnitController->show(android.content.Context) called while an ad is already showing", new Object[0]);
        }
    }

    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        C4287y yVar = (C4287y) inneractiveAdSpot.getAdContent().f10715d;
        if (yVar.f10548e != null) {
            return false;
        }
        C4269r rVar = yVar.f10546c;
        if (rVar != null && UnitDisplayType.INTERSTITIAL.equals(rVar.f10490b)) {
            return true;
        }
        C4204a0 a0Var = yVar.f10549f;
        if (a0Var == null || (!UnitDisplayType.REWARDED.equals(a0Var.f10378j) && !UnitDisplayType.INTERSTITIAL.equals(a0Var.f10378j) && !UnitDisplayType.VERTICAL.equals(a0Var.f10378j))) {
            return false;
        }
        return true;
    }

    public boolean supportsRefresh() {
        return false;
    }
}
