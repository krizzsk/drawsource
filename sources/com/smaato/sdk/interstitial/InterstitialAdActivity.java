package com.smaato.sdk.interstitial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.core.view.ViewCompat;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.openmeasurement.OMImageViewabilityTracker;
import com.smaato.sdk.core.openmeasurement.ViewabilityVerificationResource;
import com.smaato.sdk.core.p380ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p383ui.AdContentView;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.p384fi.Consumer;
import com.smaato.sdk.image.p385ad.Extension;
import com.smaato.sdk.image.p385ad.ImageAdInteractor;
import com.smaato.sdk.image.p385ad.ImageAdObject;
import com.smaato.sdk.interstitial.InterstitialAdActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

public class InterstitialAdActivity extends Activity {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String KEY_BACKGROUND_COLOR = "KEY_BACKGROUND_COLOR";
    private static final String KEY_IS_SPLASH = "KEY_IS_SPLASH";
    private static final String KEY_PRESENTER_UUID = "KEY_PRESENTER_UUID";
    private static final String LOG_TAG = InterstitialAdActivity.class.getName();
    private static final String OMID = "omid";
    private static final long SPLASH_DELAY_CLOSE_AD_MS = 5000;
    private static final long SPLASH_DELAY_SHOW_CLOSE_BUTTON_MS = 3000;
    private InterstitialAdPresenter adPresenter;
    private final TimerTask closeAdTask = new TimerTask() {
        public /* synthetic */ void lambda$run$0$InterstitialAdActivity$2() {
            InterstitialAdActivity.this.onClose();
        }

        public void run() {
            InterstitialAdActivity.this.runOnUiThread(new Runnable() {
                public final void run() {
                    InterstitialAdActivity.C109362.this.lambda$run$0$InterstitialAdActivity$2();
                }
            });
        }
    };
    /* access modifiers changed from: private */
    public ImageButton closeButton;
    /* access modifiers changed from: private */
    public FrameLayout contentHolder;
    @Inject
    private InterstitialAdPresenterStorage interstitialAdPresenterStorage;
    private boolean isBackButtonEnabled;
    private boolean isSplash;
    @Inject
    private Logger logger;
    @Inject
    private OMImageViewabilityTracker omImageViewabilityTracker;
    private final Runnable onFinish = new Runnable() {
        public final void run() {
            InterstitialAdActivity.this.finish();
        }
    };
    private final Runnable onShowCloseButton = new Runnable() {
        public final void run() {
            InterstitialAdActivity.this.lambda$new$0$InterstitialAdActivity();
        }
    };
    private UUID presenterUuid;
    private final TimerTask showCloseButtonTask = new TimerTask() {
        public /* synthetic */ void lambda$run$1$InterstitialAdActivity$1() {
            Objects.onNotNull(InterstitialAdActivity.this.closeButton, $$Lambda$InterstitialAdActivity$1$I6QDP7eBfEcJIGbIGjS2HTIHlYc.INSTANCE);
        }

        public void run() {
            InterstitialAdActivity.this.runOnUiThread(new Runnable() {
                public final void run() {
                    InterstitialAdActivity.C109351.this.lambda$run$1$InterstitialAdActivity$1();
                }
            });
        }
    };
    private boolean splashTimersAreStarted = false;

    public /* synthetic */ void lambda$new$0$InterstitialAdActivity() {
        this.closeButton.setVisibility(0);
        this.isBackButtonEnabled = true;
    }

    public static Intent createIntent(Activity activity, UUID uuid, int i, boolean z) {
        Objects.requireNonNull(activity);
        Objects.requireNonNull(uuid);
        return new Intent(activity, InterstitialAdActivity.class).putExtra(KEY_PRESENTER_UUID, uuid).putExtra(KEY_BACKGROUND_COLOR, i).putExtra(KEY_IS_SPLASH, z);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AndroidsInjector.inject((Activity) this);
        if (this.interstitialAdPresenterStorage == null) {
            Log.e(LOG_TAG, "SmaatoSdk is not initialized.");
            finish();
            return;
        }
        UUID uuid = (UUID) getIntent().getSerializableExtra(KEY_PRESENTER_UUID);
        this.presenterUuid = uuid;
        this.adPresenter = this.interstitialAdPresenterStorage.getAdPresenter(uuid);
        this.isSplash = getIntent().getBooleanExtra(KEY_IS_SPLASH, false);
        InterstitialAdPresenter interstitialAdPresenter = this.adPresenter;
        if (interstitialAdPresenter == null) {
            this.logger.error(LogDomain.WIDGET, "No InterstitialAdPresenter available", new Object[0]);
            finish();
            return;
        }
        interstitialAdPresenter.setOnShowCloseButtonListener(this.onShowCloseButton);
        this.adPresenter.setOnFinishListener(this.onFinish);
        initView(this.adPresenter.getAdContentView(this));
        addOMEvent();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.isSplash && !this.splashTimersAreStarted) {
            startTimers();
        }
    }

    private void initView(final AdContentView adContentView) {
        if (requireNonNullAdContentView(adContentView)) {
            setContentView(C10941R.layout.smaato_sdk_interstitial_activity);
            this.closeButton = (ImageButton) findViewById(C10941R.C10943id.smaato_sdk_interstitial_close);
            Objects.onNotNull(this.adPresenter, new Consumer() {
                public final void accept(Object obj) {
                    InterstitialAdActivity.this.lambda$initView$1$InterstitialAdActivity((InterstitialAdPresenter) obj);
                }
            });
            findViewById(16908290).setBackgroundColor(getIntent().getIntExtra(KEY_BACKGROUND_COLOR, ViewCompat.MEASURED_STATE_MASK));
            FrameLayout frameLayout = (FrameLayout) findViewById(C10941R.C10943id.smaato_sdk_interstitial_content);
            this.contentHolder = frameLayout;
            frameLayout.addView(adContentView);
            this.closeButton.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    InterstitialAdActivity.this.lambda$initView$2$InterstitialAdActivity(view);
                }
            });
            this.contentHolder.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    InterstitialAdActivity.this.contentHolder.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    if (InterstitialAdActivity.this.requireNonNullAdContentView(adContentView)) {
                        InterstitialAdActivity interstitialAdActivity = InterstitialAdActivity.this;
                        float access$400 = interstitialAdActivity.defineScaleFactor(interstitialAdActivity.contentHolder, adContentView);
                        if (Float.isNaN(access$400)) {
                            access$400 = 1.0f;
                        }
                        adContentView.setScaleX(access$400);
                        adContentView.setScaleY(access$400);
                    }
                }
            });
            reSizeCloseButtonForSmallerResolutions();
        }
    }

    public /* synthetic */ void lambda$initView$1$InterstitialAdActivity(InterstitialAdPresenter interstitialAdPresenter) {
        interstitialAdPresenter.setFriendlyObstructionView(this.closeButton);
    }

    public /* synthetic */ void lambda$initView$2$InterstitialAdActivity(View view) {
        onClose();
    }

    /* access modifiers changed from: package-private */
    public void reSizeCloseButtonForSmallerResolutions() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.densityDpi;
            float scaleX = this.closeButton.getScaleX();
            float scaleY = this.closeButton.getScaleY();
            if (i <= 160) {
                this.closeButton.setScaleX(scaleX * 0.7f);
                this.closeButton.setScaleY(scaleY * 0.7f);
            } else if (i <= 240) {
                this.closeButton.setScaleX(scaleX * 0.65f);
                this.closeButton.setScaleY(scaleY * 0.65f);
            } else if (i <= 320) {
                this.closeButton.setScaleX(scaleX * 0.7f);
                this.closeButton.setScaleY(scaleY * 0.7f);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(LOG_TAG, "error while getting display metrics", e);
        }
    }

    /* access modifiers changed from: private */
    public boolean requireNonNullAdContentView(AdContentView adContentView) {
        if (adContentView != null) {
            return true;
        }
        Objects.onNotNull(this.adPresenter, $$Lambda$YUdjKelnKP5Oc30hgLII0ncOlW0.INSTANCE);
        finish();
        return false;
    }

    /* access modifiers changed from: private */
    public float defineScaleFactor(FrameLayout frameLayout, AdContentView adContentView) {
        return Math.min(((float) frameLayout.getWidth()) / ((float) adContentView.getWidth()), ((float) frameLayout.getHeight()) / ((float) adContentView.getHeight()));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            Objects.onNotNull(this.interstitialAdPresenterStorage, new Consumer() {
                public final void accept(Object obj) {
                    InterstitialAdActivity.this.lambda$onDestroy$3$InterstitialAdActivity((InterstitialAdPresenterStorage) obj);
                }
            });
            Objects.onNotNull(this.adPresenter, $$Lambda$BKAgaEbF6EgLc9UoekMxWFH84UY.INSTANCE);
        }
    }

    public /* synthetic */ void lambda$onDestroy$3$InterstitialAdActivity(InterstitialAdPresenterStorage interstitialAdPresenterStorage2) {
        interstitialAdPresenterStorage2.removeAdPresenter(this.presenterUuid);
    }

    public void onBackPressed() {
        if (this.isBackButtonEnabled) {
            onClose();
            super.onBackPressed();
        }
    }

    private void startTimers() {
        new Timer().schedule(this.showCloseButtonTask, SPLASH_DELAY_SHOW_CLOSE_BUTTON_MS);
        new Timer().schedule(this.closeAdTask, 5000);
        this.splashTimersAreStarted = true;
    }

    /* access modifiers changed from: private */
    public void onClose() {
        Objects.onNotNull(this.adPresenter, $$Lambda$txm5DTbYXLiKFmFQmU_1Fi3AAck.INSTANCE);
    }

    private void addOMEvent() {
        InterstitialAdPresenter interstitialAdPresenter = this.adPresenter;
        if (interstitialAdPresenter != null && (interstitialAdPresenter.getAdInteractor() instanceof ImageAdInteractor)) {
            this.omImageViewabilityTracker.registerAdView(this.contentHolder, getViewabilityResourcesMap());
            this.omImageViewabilityTracker.startTracking();
            this.omImageViewabilityTracker.trackLoaded();
            this.omImageViewabilityTracker.trackImpression();
        }
    }

    private Map<String, List<ViewabilityVerificationResource>> getViewabilityResourcesMap() {
        List list;
        HashMap hashMap = new HashMap();
        try {
            if ((this.adPresenter.getAdInteractor() instanceof ImageAdInteractor) && (list = (List) ((ImageAdObject) ((ImageAdInteractor) this.adPresenter.getAdInteractor()).getAdObject()).getExtensions()) != null && !list.isEmpty()) {
                Extension extension = (Extension) list.get(0);
                ViewabilityVerificationResource viewabilityVerificationResource = new ViewabilityVerificationResource(extension.getExtConfig().getVendorKey(), extension.getScript(), "", extension.getExtConfig().getVerificationParam(), true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(viewabilityVerificationResource);
                hashMap.put("omid", arrayList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(LOG_TAG, "error in getting viewability resource map", e);
        }
        return hashMap;
    }
}
