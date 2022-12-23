package com.applovin.impl.adview.activity.p030b;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.C1433a;
import com.applovin.impl.adview.C1537j;
import com.applovin.impl.adview.C1550m;
import com.applovin.impl.adview.C1563s;
import com.applovin.impl.adview.C1564t;
import com.applovin.impl.adview.C1565u;
import com.applovin.impl.adview.activity.p029a.C1444c;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1834a;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p049ad.C1846g;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.p053e.C1944z;
import com.applovin.impl.sdk.utils.C2049g;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.C2095q;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C2271R;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.p194ui.PlayerControlView;
import com.google.android.exoplayer2.p194ui.PlayerView;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.e */
public class C1473e extends C1450a implements AppLovinCommunicatorSubscriber {

    /* renamed from: A */
    protected boolean f1766A = Utils.isVideoMutedInitially(this.f1710b);

    /* renamed from: B */
    protected long f1767B;

    /* renamed from: C */
    protected int f1768C;

    /* renamed from: D */
    protected boolean f1769D;

    /* renamed from: E */
    protected boolean f1770E;

    /* renamed from: F */
    private final C1444c f1771F = new C1444c(this.f1709a, this.f1713e, this.f1710b);

    /* renamed from: G */
    private final C1483a f1772G = new C1483a();

    /* renamed from: H */
    private final Handler f1773H = new Handler(Looper.getMainLooper());

    /* renamed from: I */
    private final boolean f1774I = this.f1709a.mo12849f();

    /* renamed from: J */
    private long f1775J = -1;

    /* renamed from: K */
    private final AtomicBoolean f1776K = new AtomicBoolean();

    /* renamed from: L */
    private final AtomicBoolean f1777L = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: M */
    public long f1778M = -2;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public long f1779N = 0;

    /* renamed from: s */
    protected final PlayerView f1780s;

    /* renamed from: t */
    protected final SimpleExoPlayer f1781t;

    /* renamed from: u */
    protected final C1433a f1782u;

    /* renamed from: v */
    protected final C1550m f1783v;

    /* renamed from: w */
    protected final ImageView f1784w;

    /* renamed from: x */
    protected final C1564t f1785x;

    /* renamed from: y */
    protected final ProgressBar f1786y;

    /* renamed from: z */
    protected final C1537j f1787z = new C1537j(this.f1773H, this.f1710b);

    /* renamed from: com.applovin.impl.adview.activity.b.e$a */
    private class C1483a implements C1565u.C1566a {
        private C1483a() {
        }

        /* renamed from: a */
        public void mo13061a(C1564t tVar) {
            if (C2102v.m5104a()) {
                C1473e.this.f1711c.mo15012b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            C1473e.this.mo13030a(tVar.getAndClearLastClickLocation());
        }

        /* renamed from: b */
        public void mo13062b(C1564t tVar) {
            if (C2102v.m5104a()) {
                C1473e.this.f1711c.mo15012b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            C1473e.this.mo12999h();
        }

        /* renamed from: c */
        public void mo13063c(C1564t tVar) {
            if (C2102v.m5104a()) {
                C1473e.this.f1711c.mo15012b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            C1473e.this.mo13031c();
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.e$b */
    private class C1484b implements AppLovinTouchToClickListener.OnClickListener, Player.EventListener, PlayerControlView.VisibilityListener {
        private C1484b() {
        }

        public void onClick(View view, PointF pointF) {
            C1473e.this.mo13030a(pointF);
        }

        public void onPlaybackStateChanged(int i) {
            if (C2102v.m5104a()) {
                C2102v vVar = C1473e.this.f1711c;
                vVar.mo15012b("AppLovinFullscreenActivity", "Player state changed to state " + i + " and will play when ready: " + C1473e.this.f1781t.getPlayWhenReady());
            }
            if (i == 2) {
                C1473e.this.mo13034v();
                C1473e.this.f1712d.mo14335g();
            } else if (i == 3) {
                C1473e.this.f1781t.setVolume(C1473e.this.f1766A ^ true ? 1.0f : 0.0f);
                C1473e eVar = C1473e.this;
                eVar.mo13032c(eVar.f1781t.getDuration());
                C1473e.this.mo13012u();
                if (C2102v.m5104a()) {
                    C2102v vVar2 = C1473e.this.f1711c;
                    vVar2.mo15012b("AppLovinFullscreenActivity", "MediaPlayer prepared: " + C1473e.this.f1781t);
                }
                C1473e.this.f1787z.mo13187a();
                if (C1473e.this.f1783v != null) {
                    C1473e.this.mo13047A();
                }
                C1473e.this.mo13035w();
                if (C1473e.this.f1725q.mo14265c()) {
                    C1473e.this.mo12996e();
                }
            } else if (i == 4) {
                if (C2102v.m5104a()) {
                    C1473e.this.f1711c.mo15012b("AppLovinFullscreenActivity", "Video completed");
                }
                C1473e.this.f1770E = true;
                C1473e.this.mo13037y();
            }
        }

        public void onPlayerError(PlaybackException playbackException) {
            C1473e eVar = C1473e.this;
            eVar.mo13033c("Video view error (" + playbackException + ")");
            C1473e.this.mo12999h();
        }

        public void onVisibilityChange(int i) {
            if (i == 0) {
                C1473e.this.f1780s.hideController();
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.e$c */
    private class C1485c implements View.OnClickListener {
        private C1485c() {
        }

        public void onClick(View view) {
            if (view == C1473e.this.f1783v) {
                if (C1473e.this.mo13010s()) {
                    C1473e.this.mo12996e();
                    C1473e.this.mo13007p();
                    C1473e.this.f1725q.mo14264b();
                    return;
                }
                C1473e.this.mo13031c();
            } else if (view == C1473e.this.f1784w) {
                C1473e.this.mo13036x();
            } else if (C2102v.m5104a()) {
                C2102v vVar = C1473e.this.f1711c;
                vVar.mo15016e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public C1473e(C1839e eVar, Activity activity, C1969m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        if (eVar.hasVideoUrl()) {
            C1485c cVar = new C1485c();
            if (eVar.mo14233q() >= 0) {
                C1550m mVar2 = new C1550m(eVar.mo14239w(), activity);
                this.f1783v = mVar2;
                mVar2.setVisibility(8);
                this.f1783v.setOnClickListener(cVar);
            } else {
                this.f1783v = null;
            }
            if (m2660a(this.f1766A, mVar)) {
                ImageView imageView = new ImageView(activity);
                this.f1784w = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f1784w.setClickable(true);
                this.f1784w.setOnClickListener(cVar);
                mo13051d(this.f1766A);
            } else {
                this.f1784w = null;
            }
            String B = eVar.mo14163B();
            if (StringUtils.isValidString(B)) {
                C1565u uVar = new C1565u(mVar);
                uVar.mo13244a(new WeakReference(this.f1772G));
                C1564t tVar = new C1564t(uVar, activity);
                this.f1785x = tVar;
                tVar.mo13243a(B);
            } else {
                this.f1785x = null;
            }
            if (this.f1774I) {
                C1433a aVar = new C1433a(activity, ((Integer) mVar.mo14534a(C1867b.f3206cB)).intValue(), 16842874);
                this.f1782u = aVar;
                aVar.setColor(Color.parseColor("#75FFFFFF"));
                this.f1782u.setBackgroundColor(Color.parseColor("#00000000"));
                this.f1782u.setVisibility(8);
                AppLovinCommunicator.getInstance(activity).subscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
            } else {
                this.f1782u = null;
            }
            if (eVar.mo14175O()) {
                ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842872);
                this.f1786y = progressBar;
                progressBar.setMax(10000);
                this.f1786y.setPadding(0, 0, 0, 0);
                if (C2049g.m4942d()) {
                    this.f1786y.setProgressTintList(ColorStateList.valueOf(eVar.mo14176P()));
                }
                this.f1787z.mo13188a("PROGRESS_BAR", ((Long) mVar.mo14534a(C1867b.f3255cy)).longValue(), (C1537j.C1539a) new C1537j.C1539a() {
                    /* renamed from: a */
                    public void mo13038a() {
                        if (C1473e.this.f1769D) {
                            C1473e.this.f1786y.setVisibility(8);
                            return;
                        }
                        C1473e.this.f1786y.setProgress((int) ((((float) C1473e.this.f1781t.getCurrentPosition()) / ((float) C1473e.this.f1767B)) * 10000.0f));
                    }

                    /* renamed from: b */
                    public boolean mo13039b() {
                        return !C1473e.this.f1769D;
                    }
                });
            } else {
                this.f1786y = null;
            }
            this.f1781t = new SimpleExoPlayer.Builder(activity).build();
            C1484b bVar = new C1484b();
            this.f1781t.addListener((Player.EventListener) bVar);
            this.f1781t.setRepeatMode(0);
            PlayerView playerView = new PlayerView(activity);
            this.f1780s = playerView;
            playerView.hideController();
            this.f1780s.setControllerVisibilityListener(bVar);
            this.f1780s.setPlayer(this.f1781t);
            this.f1780s.setOnTouchListener(new AppLovinTouchToClickListener(mVar, C1867b.f3112aM, activity, bVar));
            mo13052z();
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    /* renamed from: E */
    private void m2658E() {
        C1564t tVar;
        C1563s C = this.f1709a.mo14164C();
        if (C != null && C.mo13234e() && !this.f1769D && (tVar = this.f1785x) != null) {
            final boolean z = tVar.getVisibility() == 4;
            final long f = C.mo13236f();
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    if (z) {
                        C2095q.m5075a((View) C1473e.this.f1785x, f, (Runnable) null);
                    } else {
                        C2095q.m5080b(C1473e.this.f1785x, f, (Runnable) null);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private static boolean m2660a(boolean z, C1969m mVar) {
        if (!((Boolean) mVar.mo14534a(C1867b.f3247cq)).booleanValue()) {
            return false;
        }
        if (!((Boolean) mVar.mo14534a(C1867b.f3248cr)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) mVar.mo14534a(C1867b.f3250ct)).booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo13047A() {
        if (this.f1777L.compareAndSet(false, true)) {
            mo12985a(this.f1783v, this.f1709a.mo14233q(), new Runnable() {
                public void run() {
                    long unused = C1473e.this.f1778M = -1;
                    long unused2 = C1473e.this.f1779N = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo13048B() {
        this.f1768C = mo13050D();
        this.f1781t.setPlayWhenReady(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo13049C() {
        if (this.f1769D) {
            if (C2102v.m5104a()) {
                this.f1711c.mo15015d("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
            }
        } else if (!this.f1710b.mo14554ad().mo15025a()) {
            long j = this.f1775J;
            if (j >= 0) {
                if (C2102v.m5104a()) {
                    C2102v vVar = this.f1711c;
                    vVar.mo15012b("AppLovinFullscreenActivity", "Resuming video at position " + j + "ms for MediaPlayer: " + this.f1781t);
                }
                this.f1781t.setPlayWhenReady(true);
                this.f1787z.mo13187a();
                this.f1775J = -1;
                if (!this.f1781t.isPlaying()) {
                    mo13034v();
                }
            } else if (C2102v.m5104a()) {
                C2102v vVar2 = this.f1711c;
                vVar2.mo15012b("AppLovinFullscreenActivity", "Invalid last video position, isVideoPlaying=" + this.f1781t.isPlaying());
            }
        } else if (C2102v.m5104a()) {
            this.f1711c.mo15015d("AppLovinFullscreenActivity", "Skip video resume - app paused");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public int mo13050D() {
        SimpleExoPlayer simpleExoPlayer = this.f1781t;
        if (simpleExoPlayer == null) {
            return 0;
        }
        long currentPosition = simpleExoPlayer.getCurrentPosition();
        if (this.f1770E) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.f1767B)) * 100.0f) : this.f1768C;
    }

    /* renamed from: a */
    public void mo13025a() {
        if (C2102v.m5104a()) {
            this.f1711c.mo15012b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    /* renamed from: a */
    public void mo12982a(long j) {
        mo12986a((Runnable) new Runnable() {
            public void run() {
                C1473e.this.mo13049C();
            }
        }, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13030a(PointF pointF) {
        if (this.f1709a.mo12831D()) {
            if (C2102v.m5104a()) {
                this.f1711c.mo15012b("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri k = this.f1709a.mo12859k();
            if (k != null) {
                this.f1710b.mo14592u().trackAndLaunchVideoClick(this.f1709a, k, pointF, this, this.f1714f != null ? this.f1714f.getContext() : this.f1710b.mo14520L());
                C2053j.m4997a(this.f1722n, (AppLovinAd) this.f1709a);
                this.f1712d.mo14327b();
                this.f1719k++;
                return;
            }
            return;
        }
        m2658E();
    }

    /* renamed from: a */
    public void mo12984a(ViewGroup viewGroup) {
        this.f1771F.mo12973a(this.f1784w, this.f1783v, this.f1785x, this.f1782u, this.f1786y, this.f1780s, this.f1714f, viewGroup);
        this.f1781t.setPlayWhenReady(true);
        if (this.f1709a.mo14216am()) {
            this.f1725q.mo14262a(this.f1709a, (Runnable) new Runnable() {
                public void run() {
                    C1473e.this.mo12982a(250);
                }
            });
        }
        if (this.f1774I) {
            mo13034v();
        }
        this.f1714f.renderAd(this.f1709a);
        this.f1712d.mo14328b(this.f1774I ? 1 : 0);
        if (this.f1783v != null) {
            this.f1710b.mo14526S().mo14431a(new C1944z(this.f1710b, new Runnable() {
                public void run() {
                    C1473e.this.mo13047A();
                }
            }), C1918o.C1920a.MAIN, this.f1709a.mo14234r(), true);
        }
        super.mo12993b(this.f1766A);
    }

    /* renamed from: b */
    public void mo13026b() {
        if (C2102v.m5104a()) {
            this.f1711c.mo15012b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        mo13031c();
    }

    /* renamed from: c */
    public void mo13031c() {
        this.f1778M = SystemClock.elapsedRealtime() - this.f1779N;
        if (C2102v.m5104a()) {
            this.f1711c.mo15012b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.f1778M + "ms");
        }
        this.f1712d.mo14334f();
        this.f1718j++;
        if (this.f1709a.mo14240x()) {
            mo12999h();
        } else {
            mo13037y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13032c(long j) {
        this.f1767B = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13033c(String str) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.f1711c;
            vVar.mo15016e("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f1709a);
        }
        if (this.f1776K.compareAndSet(false, true)) {
            if (this.f1723o instanceof C1846g) {
                ((C1846g) this.f1723o).onAdDisplayFailed(str);
            }
            mo12999h();
        }
    }

    /* renamed from: c */
    public void mo12994c(boolean z) {
        super.mo12994c(z);
        if (z) {
            mo12982a(0);
        } else if (!this.f1769D) {
            mo12996e();
        }
    }

    /* renamed from: d */
    public void mo12995d() {
        mo12984a((ViewGroup) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo13051d(boolean z) {
        if (C2049g.m4942d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f1713e.getDrawable(z ? C2271R.C2272drawable.unmute_to_mute : C2271R.C2272drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f1784w.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f1784w.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aC = z ? this.f1709a.mo14194aC() : this.f1709a.mo14195aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f1784w.setImageURI(aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* renamed from: e */
    public void mo12996e() {
        String str;
        C2102v vVar;
        if (C2102v.m5104a()) {
            this.f1711c.mo15012b("AppLovinFullscreenActivity", "Pausing video");
        }
        if (this.f1781t.isPlaying()) {
            this.f1775J = this.f1781t.getCurrentPosition();
            this.f1781t.setPlayWhenReady(false);
            this.f1787z.mo13190c();
            if (C2102v.m5104a()) {
                vVar = this.f1711c;
                str = "Paused video at position " + this.f1775J + "ms";
            } else {
                return;
            }
        } else if (C2102v.m5104a()) {
            vVar = this.f1711c;
            str = "Nothing to pause";
        } else {
            return;
        }
        vVar.mo15012b("AppLovinFullscreenActivity", str);
    }

    public String getCommunicatorId() {
        return "FullscreenVideoAdExoPlayerPresenter";
    }

    /* renamed from: h */
    public void mo12999h() {
        this.f1787z.mo13189b();
        this.f1773H.removeCallbacksAndMessages((Object) null);
        mo13004m();
        super.mo12999h();
    }

    /* renamed from: k */
    public void mo13002k() {
        this.f1781t.release();
        if (this.f1774I) {
            AppLovinCommunicator.getInstance(this.f1713e).unsubscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
        }
        super.mo13002k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo13004m() {
        super.mo12981a(mo13050D(), this.f1774I, mo13009r(), this.f1778M);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j = messageData.getLong("ad_id");
            if (((Boolean) this.f1710b.mo14534a(C1867b.f3321eM)).booleanValue() && j == this.f1709a.getAdIdNumber() && this.f1774I) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i < 200 || i >= 300) && !this.f1770E && !this.f1781t.isPlaying()) {
                    mo13033c("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo13009r() {
        return this.f1709a != null && mo13050D() >= this.f1709a.mo14177Q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo13010s() {
        return mo13011t() && !mo13009r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo13012u() {
        long j;
        long millis;
        long j2 = 0;
        if (this.f1709a.mo14207ad() >= 0 || this.f1709a.mo14208ae() >= 0) {
            if (this.f1709a.mo14207ad() >= 0) {
                j = this.f1709a.mo14207ad();
            } else {
                C1834a aVar = (C1834a) this.f1709a;
                long j3 = this.f1767B;
                if (j3 > 0) {
                    j2 = 0 + j3;
                }
                if (aVar.mo14209af()) {
                    int l = (int) ((C1834a) this.f1709a).mo14142l();
                    if (l > 0) {
                        millis = TimeUnit.SECONDS.toMillis((long) l);
                    } else {
                        int s = (int) aVar.mo14235s();
                        if (s > 0) {
                            millis = TimeUnit.SECONDS.toMillis((long) s);
                        }
                    }
                    j2 += millis;
                }
                j = (long) (((double) j2) * (((double) this.f1709a.mo14208ae()) / 100.0d));
            }
            mo12991b(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo13034v() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1473e.this.f1782u != null) {
                    C1473e.this.f1782u.mo12955a();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo13035w() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1473e.this.f1782u != null) {
                    C1473e.this.f1782u.mo12956b();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo13036x() {
        boolean z = !this.f1766A;
        this.f1766A = z;
        this.f1781t.setVolume(z ^ true ? 1.0f : 0.0f);
        mo13051d(this.f1766A);
        mo12990a(this.f1766A, 0);
    }

    /* renamed from: y */
    public void mo13037y() {
        mo13048B();
        this.f1771F.mo12974a(this.f1715g, this.f1714f);
        mo12988a("javascript:al_onPoststitialShow(" + this.f1718j + "," + this.f1719k + ");", (long) this.f1709a.mo14179S());
        if (this.f1715g != null) {
            if (this.f1709a.mo14235s() >= 0) {
                mo12985a(this.f1715g, this.f1709a.mo14235s(), new Runnable() {
                    public void run() {
                        C1473e.this.f1717i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f1715g.setVisibility(0);
            }
        }
        this.f1769D = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo13052z() {
        mo12989a(!this.f1774I);
        ProgressiveMediaSource createMediaSource = new ProgressiveMediaSource.Factory(new DefaultDataSourceFactory((Context) this.f1713e, Util.getUserAgent(this.f1713e, "com.applovin.sdk"))).createMediaSource(MediaItem.fromUri(this.f1709a.mo12853h()));
        this.f1781t.setVolume(this.f1766A ^ true ? 1.0f : 0.0f);
        this.f1781t.setMediaSource(createMediaSource);
        this.f1781t.prepare();
        this.f1781t.setPlayWhenReady(false);
    }
}
