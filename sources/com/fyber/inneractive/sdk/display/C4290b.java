package com.fyber.inneractive.sdk.display;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4375s;
import com.fyber.inneractive.sdk.interfaces.C4397c;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.display.b */
public class C4290b extends C4289a implements C4397c.C4398a {

    /* renamed from: a */
    public InneractiveAdSpot f10551a;

    /* renamed from: b */
    public C4397c f10552b;

    /* renamed from: a */
    public void mo24290a(Activity activity, InneractiveAdSpot inneractiveAdSpot, String str) {
        InneractiveAdSpot inneractiveAdSpot2;
        if (TextUtils.isEmpty(str) || (inneractiveAdSpot2 = InneractiveAdSpotManager.get().getSpot(str)) == null || inneractiveAdSpot2.getAdContent() == null) {
            inneractiveAdSpot2 = null;
        }
        this.f10551a = inneractiveAdSpot2;
        if (inneractiveAdSpot2 != null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot2.getSelectedUnitController();
            if (selectedUnitController instanceof InneractiveFullscreenAdActivity.FullScreenRendererProvider) {
                C4397c fullscreenRenderer = ((InneractiveFullscreenAdActivity.FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
                this.f10552b = fullscreenRenderer;
                if (fullscreenRenderer != null) {
                    InneractiveAdSpot inneractiveAdSpot3 = this.f10551a;
                    C4375s sVar = (C4375s) fullscreenRenderer;
                    sVar.f10719a = inneractiveAdSpot3;
                    sVar.f10720b = inneractiveAdSpot3.getAdContent();
                    sVar.f10721c = inneractiveAdSpot3.getSelectedUnitController().getEventsListener();
                    sVar.f10765u.f13939a = inneractiveAdSpot3;
                    try {
                        this.f10552b.mo24339a(this, activity);
                    } catch (InneractiveUnitController.AdDisplayError e) {
                        IAlog.m16450e("Interstitial Activity: %s", e.getMessage());
                    } catch (Resources.NotFoundException e2) {
                        IAlog.m16450e("Interstitial Activity: %s", e2.getMessage());
                    }
                }
            }
        }
    }

    public void destroy() {
    }

    public void disableCloseButton() {
    }

    public void dismissAd(boolean z) {
        C4397c cVar = this.f10552b;
        if (cVar != null) {
            cVar.destroy();
            this.f10552b = null;
        }
    }

    public View getCloseButton() {
        return null;
    }

    public ViewGroup getLayout() {
        return null;
    }

    public boolean isCloseButtonDisplay() {
        return false;
    }

    public void setActivityOrientation(boolean z, Orientation orientation) {
    }

    public void showCloseButton(boolean z, int i, int i2) {
    }

    public void showCloseCountdown() {
    }

    public void updateCloseCountdown(int i) {
    }

    public boolean wasDismissedByUser() {
        return false;
    }
}
