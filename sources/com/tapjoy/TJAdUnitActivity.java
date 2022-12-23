package com.tapjoy;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C11480fo;
import com.tapjoy.internal.C11558hj;

public class TJAdUnitActivity extends Activity implements View.OnClickListener {

    /* renamed from: c */
    private static TJAdUnitActivity f26522c;
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public TJAdUnit f26523a;

    /* renamed from: b */
    private final Handler f26524b = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private TJPlacementData f26525d;

    /* renamed from: e */
    private TJAdUnitSaveStateData f26526e = new TJAdUnitSaveStateData();

    /* renamed from: f */
    private RelativeLayout f26527f = null;

    /* renamed from: g */
    private TJCloseButton f26528g;

    /* renamed from: h */
    private ProgressBar f26529h;

    /* renamed from: i */
    private boolean f26530i = false;

    /* renamed from: j */
    private boolean f26531j = false;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TapjoyLog.m30839d("TJAdUnitActivity", "TJAdUnitActivity onCreate: ".concat(String.valueOf(bundle)));
        super.onCreate(bundle);
        f26522c = this;
        if (bundle != null) {
            TJAdUnitSaveStateData tJAdUnitSaveStateData = (TJAdUnitSaveStateData) bundle.getSerializable("ad_unit_bundle");
            this.f26526e = tJAdUnitSaveStateData;
            if (tJAdUnitSaveStateData != null && tJAdUnitSaveStateData.isVideoComplete) {
                TapjoyLog.m30839d("TJAdUnitActivity", "finishing TJAdUnitActivity");
                finish();
                return;
            }
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null || extras.getSerializable(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_DATA) == null) {
            TapjoyLog.m30840e("TJAdUnitActivity", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Failed to launch AdUnit Activity"));
            finish();
            return;
        }
        TJPlacementData tJPlacementData = (TJPlacementData) extras.getSerializable(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_DATA);
        this.f26525d = tJPlacementData;
        if (tJPlacementData.getContentViewId() != null) {
            TapjoyConnectCore.viewWillOpen(this.f26525d.getContentViewId(), 1);
        }
        if (TJPlacementManager.m30756a(this.f26525d.getKey()) != null) {
            this.f26523a = TJPlacementManager.m30756a(this.f26525d.getKey()).getAdUnit();
        } else {
            this.f26523a = new TJAdUnit();
            this.f26523a.setAdContentTracker(new C11480fo(this.f26525d.getPlacementName(), this.f26525d.getPlacementType()));
        }
        if (!this.f26523a.hasCalledLoad()) {
            TapjoyLog.m30839d("TJAdUnitActivity", "No content loaded for ad unit -- loading now");
            this.f26523a.load(this.f26525d, false, this);
        }
        this.f26523a.setAdUnitActivity(this);
        if (Build.VERSION.SDK_INT < 11) {
            setTheme(16973829);
        } else {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().setFlags(16777216, 16777216);
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f26527f = relativeLayout;
        relativeLayout.setLayoutParams(layoutParams);
        this.f26527f.setBackgroundColor(0);
        try {
            TJWebView backgroundWebView = this.f26523a.getBackgroundWebView();
            backgroundWebView.setLayoutParams(layoutParams);
            if (backgroundWebView.getParent() != null) {
                ((ViewGroup) backgroundWebView.getParent()).removeView(backgroundWebView);
            }
            TJWebView webView = this.f26523a.getWebView();
            webView.setLayoutParams(layoutParams);
            if (webView.getParent() != null) {
                ((ViewGroup) webView.getParent()).removeView(webView);
            }
            this.f26527f.addView(backgroundWebView);
            VideoView videoView = this.f26523a.getVideoView();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            if (videoView.getParent() != null) {
                ((ViewGroup) videoView.getParent()).removeView(videoView);
            }
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setGravity(17);
            linearLayout.addView(videoView, new LinearLayout.LayoutParams(-1, -1));
            this.f26527f.addView(linearLayout, layoutParams2);
            this.f26527f.addView(webView);
            this.f26529h = new ProgressBar(this, (AttributeSet) null, 16842874);
            if (this.f26525d.hasProgressSpinner()) {
                setProgressSpinnerVisibility(true);
            } else {
                setProgressSpinnerVisibility(false);
            }
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            this.f26529h.setLayoutParams(layoutParams3);
            this.f26527f.addView(this.f26529h);
            TJCloseButton tJCloseButton = new TJCloseButton(this);
            this.f26528g = tJCloseButton;
            tJCloseButton.setOnClickListener(this);
            this.f26527f.addView(this.f26528g);
            setContentView(this.f26527f);
            this.f26523a.setVisible(true);
        } catch (Exception e) {
            TapjoyLog.m30841e("TJAdUnitActivity", e.getMessage());
        }
        TJCorePlacement a = TJPlacementManager.m30756a(this.f26525d.getKey());
        if (a != null) {
            String str = TJCorePlacement.f26602a;
            TapjoyLog.m30842i(str, "Content shown for placement " + a.f26605c.getPlacementName());
            a.f26608f.mo70022b();
            TJPlacement a2 = a.mo69374a("SHOW");
            if (!(a2 == null || a2.getListener() == null)) {
                a2.getListener().onContentShow(a2);
            }
            if (this.f26523a.getSdkBeacon() != null) {
                this.f26523a.getSdkBeacon().mo70029a();
            }
        }
    }

    public void setCloseButtonVisibility(boolean z) {
        if (z) {
            this.f26528g.setVisibility(0);
        } else {
            this.f26528g.setVisibility(4);
        }
    }

    public void setCloseButtonClickable(boolean z) {
        this.f26528g.setClickableRequested(z);
    }

    public void setProgressSpinnerVisibility(boolean z) {
        if (z) {
            this.f26529h.setVisibility(0);
        } else {
            this.f26529h.setVisibility(4);
        }
    }

    public void onBackPressed() {
        handleClose();
    }

    public void handleClose() {
        handleClose(false);
    }

    public void handleClose(boolean z) {
        if (!this.f26523a.getCloseRequested()) {
            TapjoyLog.m30839d("TJAdUnitActivity", TJAdUnitConstants.String.CLOSE_REQUESTED);
            this.f26523a.closeRequested(z);
            this.f26524b.postDelayed(new Runnable() {
                public final void run() {
                    if (TJAdUnitActivity.this.f26523a.getCloseRequested()) {
                        TapjoyLog.m30839d("TJAdUnitActivity", "Did not receive callback from content. Closing ad.");
                        TJAdUnitActivity.this.finish();
                    }
                }
            }, 1000);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        TJPlacementData tJPlacementData = this.f26525d;
        if ((tJPlacementData != null && !tJPlacementData.shouldHandleDismissOnPause()) || !this.f26531j) {
            m30694b();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        TapjoyLog.m30839d("TJAdUnitActivity", "onResume");
        super.onResume();
        if (this.f26523a.isLockedOrientation()) {
            setRequestedOrientation(this.f26523a.getLockedOrientation());
        }
        this.f26523a.resume(this.f26526e);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        TapjoyLog.m30839d("TJAdUnitActivity", "onStart");
        if (C11558hj.m31644a().f27752m) {
            this.f26530i = true;
            C11558hj.m31644a().mo70111a((Activity) this);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        TJPlacementData tJPlacementData;
        super.onPause();
        TapjoyLog.m30839d("TJAdUnitActivity", "onPause");
        this.f26523a.pause();
        if (isFinishing() && (tJPlacementData = this.f26525d) != null && tJPlacementData.shouldHandleDismissOnPause()) {
            TapjoyLog.m30839d("TJAdUnitActivity", "is Finishing");
            m30694b();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TapjoyLog.m30839d("TJAdUnitActivity", "onSaveInstanceState");
        this.f26526e.seekTime = this.f26523a.getVideoSeekTime();
        this.f26526e.isVideoComplete = this.f26523a.isVideoComplete();
        this.f26526e.isVideoMuted = this.f26523a.isMuted();
        bundle.putSerializable("ad_unit_bundle", this.f26526e);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (this.f26530i) {
            this.f26530i = false;
            C11558hj.m31644a().mo70122b((Activity) this);
        }
        super.onStop();
        TapjoyLog.m30839d("TJAdUnitActivity", "onStop");
    }

    public void showErrorDialog() {
        if (isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AlertDialog.Builder(this, 16974394).setMessage("An error occured. Please try again later.").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TJAdUnitActivity.this.handleClose();
                    dialogInterface.cancel();
                }
            }).create().show();
        } else {
            new AlertDialog.Builder(this).setMessage("An error occured. Please try again later.").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TJAdUnitActivity.this.handleClose();
                    dialogInterface.cancel();
                }
            }).create().show();
        }
    }

    public void onClick(View view) {
        handleClose();
    }

    /* renamed from: a */
    static void m30693a() {
        TJAdUnitActivity tJAdUnitActivity = f26522c;
        if (tJAdUnitActivity != null) {
            tJAdUnitActivity.handleClose(true);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f26523a.notifyOrientationChanged();
    }

    /* renamed from: b */
    private void m30694b() {
        f26522c = null;
        this.f26531j = true;
        TJAdUnit tJAdUnit = this.f26523a;
        if (tJAdUnit != null) {
            tJAdUnit.destroy();
        }
        TJPlacementData tJPlacementData = this.f26525d;
        if (tJPlacementData != null) {
            if (tJPlacementData.getContentViewId() != null) {
                TapjoyConnectCore.viewDidClose(this.f26525d.getContentViewId());
            }
            TJCorePlacement a = TJPlacementManager.m30756a(this.f26525d.getKey());
            if (a != null) {
                a.mo69382d();
            }
        }
    }
}
