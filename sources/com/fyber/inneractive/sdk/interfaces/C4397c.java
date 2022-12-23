package com.fyber.inneractive.sdk.interfaces;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;

/* renamed from: com.fyber.inneractive.sdk.interfaces.c */
public interface C4397c extends InneractiveAdRenderer {

    /* renamed from: com.fyber.inneractive.sdk.interfaces.c$a */
    public interface C4398a {
        void destroy();

        void disableCloseButton();

        void dismissAd(boolean z);

        View getCloseButton();

        ViewGroup getLayout();

        boolean isCloseButtonDisplay();

        void setActivityOrientation(boolean z, Orientation orientation);

        void showCloseButton(boolean z, int i, int i2);

        void showCloseCountdown();

        void updateCloseCountdown(int i);

        boolean wasDismissedByUser();
    }

    /* renamed from: com.fyber.inneractive.sdk.interfaces.c$b */
    public interface C4399b {
    }

    /* renamed from: a */
    void mo24339a(C4398a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError, Resources.NotFoundException;

    /* renamed from: a */
    void mo24340a(C4399b bVar);

    /* renamed from: b */
    void mo24341b();

    /* renamed from: c */
    void mo24551c(boolean z);

    void destroy();

    /* renamed from: m */
    void mo24345m();

    /* renamed from: o */
    void mo24554o();

    /* renamed from: s */
    void mo24555s();

    /* renamed from: u */
    boolean mo24347u();
}
