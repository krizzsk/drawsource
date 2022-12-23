package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.C4109R;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4363l;
import com.fyber.inneractive.sdk.flow.C4375s;
import com.fyber.inneractive.sdk.interfaces.C4397c;
import com.fyber.inneractive.sdk.network.C4516r;
import com.fyber.inneractive.sdk.p191ui.CloseButtonFlowManager;
import com.fyber.inneractive.sdk.renderers.C5223k;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.IAlog;

public class InneractiveFullscreenAdActivity extends Activity implements C4397c.C4398a {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";

    /* renamed from: a */
    public ViewGroup f10117a;

    /* renamed from: b */
    public InneractiveAdSpot f10118b;

    /* renamed from: c */
    public C4397c f10119c;

    /* renamed from: d */
    public int f10120d = 0;

    /* renamed from: e */
    public int f10121e = 0;

    /* renamed from: f */
    public int f10122f = 0;

    /* renamed from: g */
    public boolean f10123g = false;

    /* renamed from: h */
    public CloseButtonFlowManager f10124h;

    public interface FullScreenRendererProvider {
        C4397c getFullscreenRenderer();
    }

    public interface OnInneractiveFullscreenAdDestroyListener {
        void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity);
    }

    /* renamed from: com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity$a */
    public class C4113a implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity$a$a */
        public class C4114a implements Runnable {
            public C4114a() {
            }

            public void run() {
                if (!InneractiveFullscreenAdActivity.this.isFinishing()) {
                    InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity = InneractiveFullscreenAdActivity.this;
                    String str = InneractiveFullscreenAdActivity.EXTRA_KEY_SPOT_ID;
                    inneractiveFullscreenAdActivity.mo23759a();
                }
            }
        }

        public C4113a() {
        }

        public void onSystemUiVisibilityChange(int i) {
            if ((i & 2) == 0) {
                C5299n.f14024b.postDelayed(new C4114a(), 3000);
            }
        }
    }

    /* renamed from: a */
    public final void mo23759a() {
        if (Build.VERSION.SDK_INT >= 19) {
            View decorView = getWindow().getDecorView();
            if ((decorView.getSystemUiVisibility() & 2) == 0) {
                decorView.setSystemUiVisibility(2818);
            }
            decorView.setOnSystemUiVisibilityChangeListener(new C4113a());
        }
    }

    public void destroy() {
        if (!isFinishing() && this.f10117a != null) {
            finish();
        }
    }

    public void disableCloseButton() {
        CloseButtonFlowManager closeButtonFlowManager = this.f10124h;
        closeButtonFlowManager.f13911c.setVisibility(8);
        closeButtonFlowManager.f13909a.setVisibility(8);
    }

    public void dismissAd(boolean z) {
        this.f10123g = z;
        C4397c cVar = this.f10119c;
        if (cVar != null) {
            cVar.mo24551c(z);
        }
        finish();
    }

    public View getCloseButton() {
        return this.f10124h.f13913e;
    }

    public ViewGroup getLayout() {
        return this.f10117a;
    }

    public void initWindowFeatures(C4397c cVar) {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            getWindow().addFlags(2);
        }
        if (cVar != null && (((C4363l) cVar) instanceof C5223k)) {
            setTheme(16973831);
            if (i >= 19) {
                requestWindowFeature(67108864);
                requestWindowFeature(134217728);
            }
            if (i >= 21) {
                requestWindowFeature(Integer.MIN_VALUE);
            }
        }
        mo23759a();
        C4287y yVar = (C4287y) this.f10118b.getAdContent().f10715d;
        if (yVar.f10549f != null) {
            Orientation orientation = yVar.f10549f.f10373e;
            setActivityOrientation(orientation.allowOrientationChange, orientation);
        }
    }

    public boolean isCloseButtonDisplay() {
        return this.f10124h.f13912d.getVisibility() == 0;
    }

    public void onBackPressed() {
        C4397c cVar = this.f10119c;
        if (cVar == null || !cVar.mo24347u()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C4397c cVar = this.f10119c;
        if (cVar != null) {
            int i = configuration.orientation;
            if (i != this.f10120d) {
                this.f10120d = i;
                cVar.mo24341b();
                return;
            }
            int i2 = this.f10121e;
            int i3 = configuration.screenHeightDp;
            if (i2 != i3 || this.f10122f != configuration.screenWidthDp) {
                this.f10121e = i3;
                this.f10122f = configuration.screenWidthDp;
                cVar.mo24341b();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("spotId");
        InneractiveAdSpot inneractiveAdSpot = null;
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.m16450e("%sSpot id must be provided as an extra before calling createActivity with InneractiveInterstitialAdActivty", IAlog.m16443a((Object) this));
        } else {
            InneractiveAdSpot spot = InneractiveAdSpotManager.get().getSpot(stringExtra);
            if (spot == null) {
                IAlog.m16447b("%sSpot id %s cannot be found in spot manager!", IAlog.m16443a((Object) this), stringExtra);
            }
            if (spot != null && spot.getAdContent() == null) {
                IAlog.m16446a("%sSpot does not have a content. Cannot start activity", IAlog.m16443a((Object) this));
            }
            if (!(spot == null || spot.getAdContent() == null)) {
                inneractiveAdSpot = spot;
            }
        }
        this.f10118b = inneractiveAdSpot;
        if (inneractiveAdSpot == null || inneractiveAdSpot.getAdContent() == null || this.f10118b.getAdContent().f10715d == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        InneractiveUnitController selectedUnitController = this.f10118b.getSelectedUnitController();
        if (selectedUnitController == null || !(selectedUnitController instanceof FullScreenRendererProvider)) {
            IAlog.m16450e("%sno appropriate unit controller found for full screen ad. Aborting", IAlog.m16443a((Object) this));
            super.onCreate(bundle);
            finish();
            return;
        }
        C4397c fullscreenRenderer = ((FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
        this.f10119c = fullscreenRenderer;
        initWindowFeatures(fullscreenRenderer);
        super.onCreate(bundle);
        IAlog.m16446a("%sInterstitial for spot id %s created", IAlog.m16443a((Object) this), this.f10118b.getLocalUniqueId());
        this.f10120d = getResources().getConfiguration().orientation;
        this.f10121e = getResources().getConfiguration().screenHeightDp;
        this.f10122f = getResources().getConfiguration().screenWidthDp;
        if (this.f10119c != null) {
            try {
                setContentView(C4109R.layout.ia_fullscreen_activity);
                this.f10117a = (ViewGroup) findViewById(C4109R.C4111id.ia_ad_content);
                this.f10124h = new CloseButtonFlowManager(this);
                C4397c cVar = this.f10119c;
                InneractiveAdSpot inneractiveAdSpot2 = this.f10118b;
                C4375s sVar = (C4375s) cVar;
                sVar.f10719a = inneractiveAdSpot2;
                sVar.f10720b = inneractiveAdSpot2.getAdContent();
                sVar.f10721c = inneractiveAdSpot2.getSelectedUnitController().getEventsListener();
                sVar.f10765u.f13939a = inneractiveAdSpot2;
                try {
                    this.f10119c.mo24339a(this, this);
                    this.f10118b.getAdContent().f10716e = true;
                } catch (InneractiveUnitController.AdDisplayError e) {
                    IAlog.m16450e("Interstitial Activity: %s", e.getMessage());
                    finish();
                } catch (Resources.NotFoundException e2) {
                    IAlog.m16450e("Interstitial Activity: %s", e2.getMessage());
                    finish();
                }
            } catch (Throwable th) {
                C4516r.m13798a(th, this.f10118b.getAdContent().f10712a, this.f10118b.getAdContent().mo24293c());
                finish();
            }
        } else {
            IAlog.m16450e("Interstitial Activity: Could not find an appropriate full screen ad renderer for content!", new Object[0]);
            finish();
        }
    }

    public void onDestroy() {
        ViewGroup viewGroup = this.f10117a;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f10117a = null;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f10118b;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot == null ? null : inneractiveAdSpot.getSelectedUnitController();
        if (selectedUnitController != null && (selectedUnitController instanceof OnInneractiveFullscreenAdDestroyListener)) {
            ((OnInneractiveFullscreenAdDestroyListener) selectedUnitController).onActivityDestroyed(this);
        }
        C4397c cVar = this.f10119c;
        if (cVar != null) {
            cVar.mo24345m();
            this.f10119c.destroy();
            this.f10119c = null;
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            C4397c cVar = this.f10119c;
            if (cVar != null) {
                cVar.mo24345m();
                this.f10119c.destroy();
                this.f10119c = null;
                return;
            }
            return;
        }
        C4397c cVar2 = this.f10119c;
        if (cVar2 != null) {
            cVar2.mo24555s();
        }
    }

    public void onResume() {
        super.onResume();
        C4397c cVar = this.f10119c;
        if (cVar != null) {
            cVar.mo24554o();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            mo23759a();
        }
    }

    public void setActivityOrientation(boolean z, Orientation orientation) {
        if (z && orientation.equals(Orientation.USER)) {
            setRequestedOrientation(13);
        } else if (z && orientation.equals(Orientation.NONE)) {
            setRequestedOrientation(getRequestedOrientation());
        } else if (orientation.equals(Orientation.LANDSCAPE)) {
            setRequestedOrientation(6);
        } else if (orientation.equals(Orientation.PORTRAIT)) {
            setRequestedOrientation(7);
        } else {
            int i = getResources().getConfiguration().orientation;
            if (i == 1) {
                setRequestedOrientation(7);
            } else if (i == 2) {
                setRequestedOrientation(6);
            }
        }
    }

    public void showCloseButton(boolean z, int i, int i2) {
        int i3;
        int i4;
        CloseButtonFlowManager closeButtonFlowManager = this.f10124h;
        if (z) {
            closeButtonFlowManager.f13909a.setAlpha(0.0f);
            closeButtonFlowManager.f13912d.setAlpha(0.0f);
        }
        closeButtonFlowManager.f13910b.setText("");
        closeButtonFlowManager.f13910b.setVisibility(8);
        if (i >= 5) {
            int a = C5292l.m16500a(i);
            closeButtonFlowManager.f13912d.getLayoutParams().width = a;
            closeButtonFlowManager.f13912d.getLayoutParams().height = a;
        }
        if (i2 >= 5) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) closeButtonFlowManager.f13909a.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) closeButtonFlowManager.f13911c.getLayoutParams();
            int a2 = C5292l.m16500a(i2);
            int i5 = ((FrameLayout.LayoutParams) closeButtonFlowManager.f13912d.getLayoutParams()).width;
            int i6 = a2 - i5;
            if (a2 <= i5 || i6 <= (i4 = layoutParams.rightMargin)) {
                layoutParams2.width = a2;
                layoutParams2.height = a2;
                i3 = layoutParams.rightMargin;
                if (i6 < i3) {
                    i3 -= i6 / 2;
                }
            } else {
                int i7 = (a2 / 2) + (i5 / 2) + i4;
                layoutParams2.width = i7;
                layoutParams2.height = i7;
                layoutParams.gravity = 53;
                i3 = 0;
            }
            layoutParams2.setMargins(i3, i3, i3, i3);
            layoutParams2.gravity = 17;
        }
        closeButtonFlowManager.f13909a.setVisibility(0);
        closeButtonFlowManager.f13912d.setVisibility(0);
        closeButtonFlowManager.f13911c.setVisibility(0);
    }

    public void showCloseCountdown() {
        CloseButtonFlowManager closeButtonFlowManager = this.f10124h;
        closeButtonFlowManager.f13910b.setBackgroundResource(C4109R.C4110drawable.ia_round_overlay_bg);
        closeButtonFlowManager.f13909a.setVisibility(0);
        closeButtonFlowManager.f13910b.setVisibility(0);
        closeButtonFlowManager.f13912d.setVisibility(8);
        closeButtonFlowManager.f13911c.setVisibility(8);
    }

    public void updateCloseCountdown(int i) {
        CloseButtonFlowManager closeButtonFlowManager = this.f10124h;
        closeButtonFlowManager.getClass();
        if (i > 0) {
            closeButtonFlowManager.f13910b.setText(Integer.toString(i));
        }
    }

    public boolean wasDismissedByUser() {
        return this.f10123g;
    }
}
