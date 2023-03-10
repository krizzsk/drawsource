package com.applovin.impl.sdk.nativeAd;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.p028a.C1411a;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.C2042a;
import com.applovin.sdk.C2271R;

public class AppLovinMediaView extends FrameLayout {
    private static final String TAG = "AppLovinMediaView";
    /* access modifiers changed from: private */

    /* renamed from: ad */
    public final AppLovinNativeAdImpl f3762ad;
    /* access modifiers changed from: private */
    public final ImageView imageView;
    /* access modifiers changed from: private */
    public final boolean isVideoMuted;
    private final C2042a lifecycleCallbacksAdapter = new C2042a() {
        public void onActivityPaused(Activity activity) {
            if (AppLovinMediaView.this.videoView != null) {
                AppLovinMediaView.this.videoView.pause();
            }
        }

        public void onActivityResumed(Activity activity) {
            if (AppLovinMediaView.this.videoView != null) {
                AppLovinMediaView.this.videoView.start();
            }
        }
    };
    /* access modifiers changed from: private */
    public final C2102v logger;
    /* access modifiers changed from: private */
    public MediaPlayer mediaPlayer;
    private final C1969m sdk;
    /* access modifiers changed from: private */
    public final C1982a videoUiEventHandler = new C1982a();
    /* access modifiers changed from: private */
    public AppLovinVideoView videoView;

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinMediaView$a */
    private class C1982a implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener {
        private C1982a() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            if (C2102v.m5104a()) {
                AppLovinMediaView.this.logger.mo15012b(AppLovinMediaView.TAG, "Video completed");
            }
            if (AppLovinMediaView.this.videoView != null) {
                AppLovinMediaView.this.videoView.setVisibility(8);
            }
            AppLovinMediaView.this.imageView.setVisibility(0);
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (!C2102v.m5104a()) {
                return true;
            }
            String str = "Video view error (" + i + "," + i2 + ")";
            AppLovinMediaView.this.logger.mo15016e(AppLovinMediaView.TAG, "Encountered media error: " + str + " for ad: " + AppLovinMediaView.this.f3762ad);
            return true;
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (!C2102v.m5104a()) {
                return false;
            }
            C2102v access$500 = AppLovinMediaView.this.logger;
            access$500.mo15012b(AppLovinMediaView.TAG, "MediaPlayer Info: (" + i + ", " + i2 + ")");
            return false;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            MediaPlayer unused = AppLovinMediaView.this.mediaPlayer = mediaPlayer;
            mediaPlayer.setOnInfoListener(AppLovinMediaView.this.videoUiEventHandler);
            mediaPlayer.setOnErrorListener(AppLovinMediaView.this.videoUiEventHandler);
            float f = AppLovinMediaView.this.isVideoMuted ^ true ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f, f);
            if (C2102v.m5104a()) {
                C2102v access$500 = AppLovinMediaView.this.logger;
                access$500.mo15012b(AppLovinMediaView.TAG, "MediaPlayer prepared: " + AppLovinMediaView.this.mediaPlayer);
            }
        }
    }

    public AppLovinMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, C1969m mVar, Context context) {
        super(context);
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f3762ad = appLovinNativeAdImpl;
        this.sdk = mVar;
        this.logger = mVar.mo14509A();
        this.isVideoMuted = true;
        LayoutInflater.from(context).inflate(C2271R.layout.applovin_native_ad_media_view, this, true);
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        C1411a vastAd = appLovinNativeAdImpl.getVastAd();
        Uri h = vastAd != null ? vastAd.mo12853h() : null;
        if (mainImageUri == null && h == null) {
            throw new IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        setOnClickListener(appLovinNativeAdImpl.getClickHandler());
        ImageView imageView2 = (ImageView) findViewById(C2271R.C2273id.image_view);
        this.imageView = imageView2;
        if (mainImageUri != null) {
            imageView2.setImageURI(mainImageUri);
        }
        if (h != null) {
            mVar.mo14556af().mo14046a(this.lifecycleCallbacksAdapter);
            AppLovinVideoView appLovinVideoView = new AppLovinVideoView(context);
            this.videoView = appLovinVideoView;
            appLovinVideoView.setOnPreparedListener(this.videoUiEventHandler);
            this.videoView.setOnCompletionListener(this.videoUiEventHandler);
            this.videoView.setOnErrorListener(this.videoUiEventHandler);
            this.videoView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            addView(this.videoView);
            this.videoView.setVideoURI(h);
            this.imageView.setVisibility(8);
        } else {
            this.videoView = null;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void destroy() {
        setOnClickListener((View.OnClickListener) null);
        this.sdk.mo14556af().mo14048b(this.lifecycleCallbacksAdapter);
        try {
            if (this.videoView != null) {
                this.videoView.pause();
                this.videoView.stopPlayback();
                this.videoView.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
                this.videoView.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
                this.videoView.setOnErrorListener((MediaPlayer.OnErrorListener) null);
                this.videoView = null;
            }
            if (this.mediaPlayer != null) {
                this.mediaPlayer.release();
                this.mediaPlayer = null;
            }
        } catch (Throwable th) {
            Log.d(TAG, "Encountered exception when destroying:" + th);
        }
        removeAllViews();
    }

    public float getAspectRatio() {
        Drawable drawable;
        ImageView imageView2 = this.imageView;
        if (imageView2 == null || (drawable = imageView2.getDrawable()) == null) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            appLovinVideoView.start();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            appLovinVideoView.pause();
        }
        super.onDetachedFromWindow();
    }
}
