package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.foundation.tools.C8616ad;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.nativex.listener.C8896a;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.VideoNativePlayer;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.videocommon.download.C9641a;
import com.mbridge.msdk.videocommon.download.C9645c;
import com.mbridge.msdk.videocommon.view.MyImageView;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class MediaViewPlayerView extends LinearLayout implements VideoPlayerStatusListener {

    /* renamed from: F */
    private static Handler f22025F = new Handler();

    /* renamed from: A */
    private String f22026A;

    /* renamed from: B */
    private String f22027B;

    /* renamed from: C */
    private CampaignEx f22028C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C8896a f22029D;

    /* renamed from: E */
    private Timer f22030E;

    /* renamed from: G */
    private C9641a f22031G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public VideoNativePlayer f22032H;

    /* renamed from: I */
    private C8934a f22033I;

    /* renamed from: J */
    private AdSession f22034J = null;

    /* renamed from: K */
    private MediaEvents f22035K = null;

    /* renamed from: L */
    private boolean f22036L = false;

    /* renamed from: a */
    private boolean f22037a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f22038b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f22039c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f22040d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f22041e = false;

    /* renamed from: f */
    private boolean f22042f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f22043g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f22044h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f22045i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f22046j = true;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f22047k = false;

    /* renamed from: l */
    private volatile int f22048l = -1;

    /* renamed from: m */
    private boolean f22049m = true;

    /* renamed from: n */
    private boolean f22050n = true;

    /* renamed from: o */
    private TextureView f22051o;

    /* renamed from: p */
    private LinearLayout f22052p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Surface f22053q;

    /* renamed from: r */
    private ProgressBar f22054r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public MyImageView f22055s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public ImageView f22056t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public ImageView f22057u;

    /* renamed from: v */
    private ImageView f22058v;

    /* renamed from: w */
    private ImageView f22059w;

    /* renamed from: x */
    private View f22060x;

    /* renamed from: y */
    private AnimationDrawable f22061y;

    /* renamed from: z */
    private AlphaAnimation f22062z;

    public void onBufferingEnd() {
    }

    public void onBufferingStart(String str) {
    }

    public void setMediaViewPlayListener(C8934a aVar) {
        this.f22033I = aVar;
    }

    public MediaViewPlayerView(Context context) {
        super(context);
        m25815a();
    }

    public MediaViewPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25815a();
    }

    /* renamed from: a */
    private void m25815a() {
        try {
            m25822c();
            m25819b();
        } catch (Exception e) {
            C8672v.m24878d("MediaViewPlayerView", e.getMessage());
        }
    }

    /* renamed from: b */
    private void m25819b() {
        VideoNativePlayer videoNativePlayer = new VideoNativePlayer();
        this.f22032H = videoNativePlayer;
        videoNativePlayer.setSelfVideoFeedsPlayerListener(this);
    }

    /* renamed from: c */
    private void m25822c() {
        try {
            View inflate = LayoutInflater.from(getContext()).inflate(C8658p.m24799a(getContext(), "mbridge_nativex_playerview", "layout"), (ViewGroup) null);
            if (inflate != null) {
                this.f22052p = (LinearLayout) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_ll_loading", "id"));
                TextureView textureView = (TextureView) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_textureview", "id"));
                this.f22051o = textureView;
                textureView.setKeepScreenOn(true);
                this.f22051o.setSurfaceTextureListener(new C8935b());
                this.f22054r = (ProgressBar) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_progress", "id"));
                this.f22055s = (MyImageView) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_iv_playend_pic", "id"));
                this.f22056t = (ImageView) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_iv_play", "id"));
                this.f22057u = (ImageView) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_iv_pause", "id"));
                this.f22058v = (ImageView) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_iv_sound", "id"));
                this.f22060x = inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_view_cover", "id"));
                ImageView imageView = (ImageView) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_iv_sound_animation", "id"));
                this.f22059w = imageView;
                AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
                this.f22061y = animationDrawable;
                animationDrawable.start();
                m25824d();
                addView(inflate, -1, -1);
            }
        } catch (Throwable th) {
            C8672v.m24878d("MediaViewPlayerView", th.getMessage());
        }
    }

    public boolean initPlayerViewData(String str, CampaignEx campaignEx, boolean z, VideoPlayerStatusListener videoPlayerStatusListener, C9641a aVar, String str2) {
        CampaignEx campaignEx2 = campaignEx;
        try {
            if (TextUtils.isEmpty(str) || campaignEx2 == null) {
                return false;
            }
            this.f22027B = str;
            this.f22038b = z;
            this.f22028C = campaignEx2;
            this.f22031G = aVar;
            this.f22026A = str2;
            this.f22032H.initParameter(campaignEx.getVideoUrlEncode(), true, this.f22046j, this.f22055s, videoPlayerStatusListener);
            try {
                if (this.f22028C != null) {
                    String imageUrl = this.f22028C.getImageUrl();
                    if (!C8616ad.m24717a(imageUrl)) {
                        if (getContext() != null) {
                            if (C8481b.m24310a(getContext()).mo57884b(imageUrl)) {
                                Bitmap a = C8481b.m24310a(C8388a.m23845e().mo56913g()).mo57880a(imageUrl);
                                if (!(this.f22055s == null || a == null)) {
                                    this.f22055s.setImageUrl(imageUrl);
                                    this.f22055s.setImageBitmap(a);
                                    this.f22055s.setVisibility(0);
                                }
                            } else {
                                C8481b.m24310a(getContext()).mo57883a(imageUrl, (C8484c) new C8484c() {
                                    public final void onFailedLoad(String str, String str2) {
                                    }

                                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                                        if (MediaViewPlayerView.this.f22055s != null && bitmap != null) {
                                            MediaViewPlayerView.this.f22055s.setImageUrl(str);
                                            MediaViewPlayerView.this.f22055s.setImageBitmap(bitmap);
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C8672v.m24878d("MediaViewPlayerView", th.getMessage());
            }
            this.f22037a = true;
            return true;
        } catch (Exception e) {
            C8672v.m24878d("MediaViewPlayerView", e.getMessage());
            this.f22037a = false;
        }
    }

    public void playVideo() {
        try {
            if (!this.f22037a || this.f22032H == null) {
                return;
            }
            if (!this.f22043g) {
                m25827e();
                return;
            }
            if ((!TextUtils.isEmpty(this.f22027B) && this.f22027B.startsWith("http")) || this.f22027B.startsWith("https")) {
                this.f22027B = m25844m();
            }
            m25831f();
            this.f22032H.play(getContext(), this.f22027B, this.f22053q);
            if ((this.f22042f || this.f22041e) && this.f22035K != null) {
                this.f22042f = false;
                this.f22035K.resume();
            }
            if (this.f22047k) {
                this.f22032H.openSound();
            } else {
                this.f22032H.closeSound();
            }
            this.f22039c = false;
        } catch (Throwable th) {
            C8672v.m24878d("MediaViewPlayerView", th.getMessage());
        }
    }

    public void startOrPlayVideo() {
        try {
            if (!this.f22043g) {
                m25827e();
            } else if (!hasPrepare()) {
                playVideo();
            } else {
                try {
                    if (this.f22032H != null) {
                        m25831f();
                        if (this.f22045i) {
                            this.f22032H.start(this.f22053q);
                            this.f22045i = false;
                        } else {
                            this.f22032H.start();
                        }
                        if ((this.f22042f || this.f22041e) && this.f22035K != null) {
                            this.f22042f = false;
                            this.f22035K.resume();
                        }
                    }
                } catch (Throwable th) {
                    C8672v.m24875a("MediaViewPlayerView", th.getMessage(), th);
                }
            }
        } catch (Exception e) {
            C8672v.m24878d("MediaViewPlayerView", e.getMessage());
        }
    }

    public void pause() {
        try {
            if (this.f22032H != null) {
                this.f22032H.pause();
                this.f22042f = true;
            }
            if (this.f22035K != null) {
                this.f22035K.pause();
            }
            m25834h();
        } catch (Throwable th) {
            C8672v.m24878d("MediaViewPlayerView", th.getMessage());
        }
    }

    public void stop() {
        try {
            if (this.f22032H != null) {
                this.f22032H.stop();
            }
            m25834h();
        } catch (Exception e) {
            C8672v.m24878d("MediaViewPlayerView", e.getMessage());
        }
    }

    public void release() {
        try {
            if (this.f22032H != null) {
                this.f22032H.releasePlayer();
                this.f22032H = null;
            }
        } catch (Throwable th) {
            C8672v.m24878d("MediaViewPlayerView", th.getMessage());
        }
    }

    public boolean hasPrepare() {
        try {
            if (this.f22032H != null) {
                return this.f22032H.hasPrepare();
            }
            return false;
        } catch (Throwable th) {
            C8672v.m24878d("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean isComplete() {
        try {
            if (this.f22032H != null) {
                return this.f22032H.isComplete();
            }
            return false;
        } catch (Throwable th) {
            C8672v.m24878d("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean isPlaying() {
        try {
            if (this.f22032H != null) {
                return this.f22032H.isPlaying();
            }
            return false;
        } catch (Throwable th) {
            C8672v.m24878d("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public void openSound() {
        this.f22047k = true;
        try {
            if (this.f22032H != null) {
                this.f22058v.setImageResource(C8658p.m24799a(getContext(), "mbridge_nativex_sound_open", "drawable"));
                this.f22032H.openSound();
            }
            if (this.f22035K != null) {
                this.f22035K.volumeChange(1.0f);
            }
        } catch (IllegalArgumentException e) {
            C8672v.m24874a("OMSDK", e.getMessage());
        } catch (Throwable th) {
            C8672v.m24878d("MediaViewPlayerView", th.getMessage());
        }
    }

    public void closeSound() {
        this.f22047k = false;
        try {
            if (this.f22032H != null) {
                this.f22058v.setImageResource(C8658p.m24799a(getContext(), "mbridge_nativex_sound_close", "drawable"));
                this.f22032H.closeSound();
            }
            if (this.f22035K != null) {
                this.f22035K.volumeChange(0.0f);
            }
        } catch (IllegalArgumentException e) {
            C8672v.m24874a("OMSDK", e.getMessage());
        } catch (Throwable th) {
            C8672v.m24878d("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setIsFrontDesk(boolean z) {
        try {
            if (this.f22032H != null) {
                this.f22032H.setIsFrontDesk(z);
            }
        } catch (Throwable th) {
            C8672v.m24878d("MediaViewPlayerView", th.getMessage());
        }
    }

    public boolean halfLoadingViewisVisible() {
        try {
            if (this.f22032H == null || !this.f22032H.loadingViewIsVisible()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C8672v.m24878d("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public void setIsComplete(boolean z) {
        try {
            if (this.f22032H != null) {
                this.f22032H.setIsComplete(z);
            }
        } catch (Throwable th) {
            C8672v.m24878d("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setEnterFullScreen() {
        try {
            C8672v.m24876b("MediaViewPlayerView", "setEnterFullScreen");
            this.f22040d = true;
            this.f22044h = true;
            this.f22058v.setVisibility(0);
            m25834h();
        } catch (Throwable th) {
            C8672v.m24875a("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void setExitFullScreen() {
        try {
            this.f22040d = false;
            this.f22039c = false;
            this.f22058v.setVisibility(8);
            m25832g();
            m25831f();
        } catch (Throwable th) {
            C8672v.m24875a("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public boolean curIsFullScreen() {
        return this.f22040d;
    }

    public void setIsActivePause(boolean z) {
        this.f22041e = z;
    }

    public boolean getIsActiviePause() {
        return this.f22041e;
    }

    public Campaign getCampaign() {
        return this.f22028C;
    }

    public void setAllowLoopPlay(boolean z) {
        this.f22046j = z;
    }

    public void setOnMediaViewPlayerViewListener(C8896a aVar) {
        this.f22029D = aVar;
    }

    /* renamed from: d */
    private void m25824d() {
        this.f22058v.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                try {
                    if (MediaViewPlayerView.this.f22047k) {
                        MediaViewPlayerView.this.closeSound();
                        if (MediaViewPlayerView.this.f22029D != null) {
                            MediaViewPlayerView.this.f22029D.mo58704a();
                            return;
                        }
                        return;
                    }
                    MediaViewPlayerView.this.openSound();
                    if (MediaViewPlayerView.this.f22029D != null) {
                        MediaViewPlayerView.this.f22029D.mo58706b();
                    }
                } catch (Throwable th) {
                    C8672v.m24878d("MediaViewPlayerView", th.getMessage());
                }
            }
        });
        this.f22057u.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                try {
                    MediaViewPlayerView.this.pause();
                    MediaViewPlayerView.this.f22056t.setVisibility(0);
                    MediaViewPlayerView.this.m25837i();
                    MediaViewPlayerView.this.m25840k();
                    if (MediaViewPlayerView.this.f22029D != null) {
                        MediaViewPlayerView.this.f22029D.mo58708c();
                    }
                    boolean unused = MediaViewPlayerView.this.f22041e = true;
                } catch (Throwable th) {
                    C8672v.m24875a("MediaViewPlayerView", th.getMessage(), th);
                }
            }
        });
        this.f22056t.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MediaViewPlayerView.this.onClickPlayButton();
            }
        });
    }

    public void onClickPlayButton() {
        try {
            m25831f();
            m25838j();
            setIsComplete(false);
            if (this.f22042f) {
                this.f22032H.play();
            } else if (!hasPrepare() || this.f22039c) {
                C8672v.m24876b("MediaViewPlayerView", "点击播放 playVideo()");
                this.f22032H.replaySameSource(getContext(), this.f22027B, this.f22053q);
            } else {
                C8672v.m24876b("MediaViewPlayerView", "startOrPlayVideo() hasPrepare():" + hasPrepare() + " mIsNeedToRepeatPrepare:" + this.f22039c);
                startOrPlayVideo();
            }
            if (this.f22041e && this.f22029D != null) {
                this.f22029D.mo58709d();
            }
            this.f22041e = false;
        } catch (Throwable th) {
            C8672v.m24875a("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void onClickPlayerView() {
        try {
            if ((this.f22055s != null && this.f22055s.getVisibility() == 0) || !isPlaying() || this.f22057u == null) {
                return;
            }
            if (this.f22057u.getVisibility() == 0) {
                gonePauseView();
                m25842l();
                return;
            }
            if (this.f22062z != null) {
                this.f22062z.cancel();
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            this.f22062z = alphaAnimation;
            alphaAnimation.setDuration(300);
            this.f22062z.setInterpolator(new DecelerateInterpolator());
            this.f22062z.setAnimationListener(new Animation.AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    MediaViewPlayerView.this.f22057u.setVisibility(0);
                    MediaViewPlayerView.m25833g(MediaViewPlayerView.this);
                }
            });
            m25837i();
            this.f22060x.startAnimation(this.f22062z);
        } catch (Throwable th) {
            C8672v.m24878d("MediaViewPlayerView", th.getMessage());
        }
    }

    public void showPlayView() {
        this.f22056t.setVisibility(0);
    }

    public void gonePauseView() {
        Handler handler = f22025F;
        if (handler != null) {
            handler.post(new Runnable() {
                public final void run() {
                    try {
                        MediaViewPlayerView.this.m25840k();
                        MediaViewPlayerView.this.m25838j();
                    } catch (Exception e) {
                        C8672v.m24878d("MediaViewPlayerView", e.getMessage());
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m25827e() {
        try {
            this.f22055s.setVisibility(0);
            this.f22056t.setVisibility(0);
            m25837i();
            m25840k();
            this.f22054r.setVisibility(8);
        } catch (Throwable th) {
            C8672v.m24878d("MediaViewPlayerView", th.getMessage());
        }
    }

    /* renamed from: f */
    private void m25831f() {
        try {
            this.f22055s.setVisibility(8);
            this.f22056t.setVisibility(8);
            m25838j();
            showProgressView(this.f22050n);
        } catch (Throwable th) {
            C8672v.m24878d("MediaViewPlayerView", th.getMessage());
        }
    }

    /* renamed from: g */
    private void m25832g() {
        ImageView imageView;
        if (!this.f22040d && (imageView = this.f22059w) != null && imageView.getVisibility() != 0 && this.f22049m) {
            this.f22059w.setVisibility(0);
        }
    }

    /* renamed from: h */
    private void m25834h() {
        if (this.f22059w.getVisibility() == 0) {
            this.f22059w.setVisibility(8);
        }
    }

    public void showProgressView(boolean z) {
        this.f22050n = z;
        ProgressBar progressBar = this.f22054r;
        if (progressBar != null) {
            progressBar.setVisibility(z ? 0 : 4);
        }
    }

    public void showSoundIndicator(boolean z) {
        this.f22049m = z;
        if (z) {
            m25832g();
        } else {
            m25834h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m25837i() {
        this.f22060x.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m25838j() {
        if (this.f22056t.getVisibility() != 0) {
            this.f22060x.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m25840k() {
        this.f22057u.setVisibility(8);
    }

    public void onPlayStarted(int i) {
        if (this.f22029D != null && !TextUtils.isEmpty(this.f22027B)) {
            this.f22029D.mo58705a(this.f22027B);
        }
    }

    public void onPlayProgress(int i, int i2) {
        try {
            m25831f();
            m25832g();
            this.f22041e = false;
            this.f22039c = false;
            this.f22048l = i;
        } catch (Throwable th) {
            C8672v.m24875a("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void onPlayCompleted() {
        if (this.f22029D != null && !TextUtils.isEmpty(this.f22027B)) {
            this.f22029D.mo58707b(this.f22027B);
        }
        C8934a aVar = this.f22033I;
        if (aVar != null) {
            aVar.mo58760a();
            return;
        }
        try {
            if (!this.f22046j) {
                this.f22039c = true;
                m25827e();
            }
        } catch (Exception e) {
            C8672v.m24878d("MediaViewPlayerView", e.getMessage());
        }
    }

    public void onPlayError(String str) {
        try {
            this.f22039c = true;
            m25827e();
            if (!this.f22036L) {
                this.f22032H.play(getContext(), this.f22027B, this.f22053q);
                this.f22036L = true;
            }
        } catch (Exception e) {
            C8672v.m24878d("MediaViewPlayerView", e.getMessage());
        }
    }

    public void onPlaySetDataSourceError(String str) {
        try {
            this.f22039c = true;
            try {
                if (!URLUtil.isNetworkUrl(this.f22027B)) {
                    String videoUrlEncode = this.f22028C.getVideoUrlEncode();
                    if (C8616ad.m24718b(videoUrlEncode)) {
                        this.f22027B = videoUrlEncode;
                    }
                }
            } catch (Throwable th) {
                C8672v.m24878d("MediaViewPlayerView", th.getMessage());
            }
        } catch (Exception e) {
            C8672v.m24878d("MediaViewPlayerView", e.getMessage());
        }
    }

    /* renamed from: l */
    private void m25842l() {
        try {
            if (f22025F != null) {
                f22025F.removeCallbacksAndMessages((Object) null);
            }
            if (this.f22030E != null) {
                this.f22030E.cancel();
            }
        } catch (Exception e) {
            C8672v.m24878d("MediaViewPlayerView", e.getMessage());
        }
    }

    /* renamed from: m */
    private String m25844m() {
        String str;
        try {
            if (this.f22028C == null) {
                return null;
            }
            try {
                if (this.f22031G == null) {
                    if (this.f22028C.getAdType() != 287) {
                        if (this.f22028C.getAdType() != 94) {
                            str = this.f22028C.getId() + this.f22028C.getVideoUrlEncode() + this.f22028C.getBidToken();
                            this.f22031G = C9645c.getInstance().mo63652a(this.f22026A, str);
                        }
                    }
                    str = this.f22028C.getRequestId() + this.f22028C.getId() + this.f22028C.getVideoUrlEncode();
                    this.f22031G = C9645c.getInstance().mo63652a(this.f22026A, str);
                }
            } catch (Exception e) {
                C8672v.m24878d("MediaViewPlayerView", e.getMessage());
            }
            if (this.f22031G != null && this.f22031G.mo63639f() == 5) {
                String d = this.f22031G.mo63635d();
                if (new File(d).exists()) {
                    return d;
                }
            }
            String videoUrlEncode = this.f22028C.getVideoUrlEncode();
            if (C8616ad.m24718b(videoUrlEncode)) {
                return videoUrlEncode;
            }
            return null;
        } catch (Exception e2) {
            C8672v.m24878d("MediaViewPlayerView", e2.getMessage());
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MediaViewPlayerView$a */
    public static class C8934a {

        /* renamed from: a */
        private MediaViewPlayerView f22070a;

        public C8934a(MediaViewPlayerView mediaViewPlayerView) {
            this.f22070a = mediaViewPlayerView;
        }

        /* renamed from: a */
        public void mo58760a() {
            try {
                if (this.f22070a != null && !this.f22070a.f22046j) {
                    C8672v.m24876b("MediaViewPlayerView", "play end and display endcardView");
                    this.f22070a.m25827e();
                }
            } catch (Exception e) {
                C8672v.m24878d("MediaViewPlayerView", e.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MediaViewPlayerView$b */
    private class C8935b implements TextureView.SurfaceTextureListener {
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        private C8935b() {
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            try {
                Surface unused = MediaViewPlayerView.this.f22053q = new Surface(surfaceTexture);
                boolean unused2 = MediaViewPlayerView.this.f22043g = true;
                boolean unused3 = MediaViewPlayerView.this.f22045i = true;
                if (MediaViewPlayerView.this.f22040d) {
                    if (MediaViewPlayerView.this.f22044h) {
                        boolean unused4 = MediaViewPlayerView.this.f22039c = false;
                        boolean unused5 = MediaViewPlayerView.this.f22044h = false;
                    }
                    if (!MediaViewPlayerView.this.isComplete()) {
                        if (!MediaViewPlayerView.this.f22041e) {
                            MediaViewPlayerView.this.startOrPlayVideo();
                            return;
                        }
                    }
                    MediaViewPlayerView.this.m25827e();
                } else if (MediaViewPlayerView.this.f22038b) {
                    if (MediaViewPlayerView.this.hasPrepare()) {
                        if (MediaViewPlayerView.this.isComplete()) {
                            MediaViewPlayerView.this.m25827e();
                            return;
                        }
                    }
                    MediaViewPlayerView.this.startOrPlayVideo();
                } else {
                    if (MediaViewPlayerView.this.hasPrepare()) {
                        if (!MediaViewPlayerView.this.isComplete()) {
                            MediaViewPlayerView.this.startOrPlayVideo();
                            return;
                        }
                    }
                    MediaViewPlayerView.this.m25827e();
                }
            } catch (Exception e) {
                C8672v.m24878d("MediaViewPlayerView", e.getMessage());
            }
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C8672v.m24876b("MediaViewPlayerView", "onSurfaceTextureSizeChanged ");
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            try {
                if (MediaViewPlayerView.this.f22032H != null && MediaViewPlayerView.this.f22032H.isPlayIng()) {
                    MediaViewPlayerView.this.pause();
                }
                boolean unused = MediaViewPlayerView.this.f22039c = true;
                boolean unused2 = MediaViewPlayerView.this.f22043g = false;
            } catch (Throwable th) {
                C8672v.m24878d("MediaViewPlayerView", th.getMessage());
            }
            return true;
        }
    }

    public void registerView(AdSession adSession) {
        this.f22034J = adSession;
        if (adSession != null) {
            adSession.registerAdView(this);
            adSession.addFriendlyObstruction(this.f22052p, FriendlyObstructionPurpose.OTHER, (String) null);
            adSession.addFriendlyObstruction(this.f22054r, FriendlyObstructionPurpose.OTHER, (String) null);
            adSession.addFriendlyObstruction(this.f22055s, FriendlyObstructionPurpose.VIDEO_CONTROLS, (String) null);
            adSession.addFriendlyObstruction(this.f22056t, FriendlyObstructionPurpose.VIDEO_CONTROLS, (String) null);
            adSession.addFriendlyObstruction(this.f22057u, FriendlyObstructionPurpose.VIDEO_CONTROLS, (String) null);
            adSession.addFriendlyObstruction(this.f22058v, FriendlyObstructionPurpose.OTHER, (String) null);
        }
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f22035K = mediaEvents;
    }

    public void unregisterView() {
        AdSession adSession = this.f22034J;
        if (adSession != null) {
            adSession.removeAllFriendlyObstructions();
        }
    }

    public void onPlayProgressMS(int i, int i2) {
        try {
            if (this.f22054r != null && this.f22054r.getVisibility() == 0) {
                if (i2 > 0) {
                    this.f22054r.setMax(i2);
                }
                if (i >= 0) {
                    this.f22054r.setProgress(i + 1);
                }
            }
        } catch (Throwable th) {
            C8672v.m24878d("MediaViewPlayerView", th.getMessage());
        }
    }

    /* renamed from: g */
    static /* synthetic */ void m25833g(MediaViewPlayerView mediaViewPlayerView) {
        mediaViewPlayerView.m25842l();
        mediaViewPlayerView.f22030E = new Timer();
        mediaViewPlayerView.f22030E.schedule(new TimerTask() {
            public final void run() {
                try {
                    MediaViewPlayerView.this.gonePauseView();
                } catch (Throwable th) {
                    C8672v.m24875a("MediaViewPlayerView", th.getMessage(), th);
                }
            }
        }, 2000);
    }
}
