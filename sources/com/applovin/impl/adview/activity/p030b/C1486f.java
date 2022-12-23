package com.applovin.impl.adview.activity.p030b;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
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
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.f */
public class C1486f extends C1450a implements AppLovinCommunicatorSubscriber {

    /* renamed from: A */
    protected long f1802A;

    /* renamed from: B */
    protected boolean f1803B;

    /* renamed from: C */
    private final C1444c f1804C = new C1444c(this.f1709a, this.f1713e, this.f1710b);
    /* access modifiers changed from: private */

    /* renamed from: D */
    public MediaPlayer f1805D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final C1499b f1806E = new C1499b();

    /* renamed from: F */
    private final C1498a f1807F = new C1498a();

    /* renamed from: G */
    private final Handler f1808G = new Handler(Looper.getMainLooper());

    /* renamed from: H */
    private final boolean f1809H = this.f1709a.mo12849f();

    /* renamed from: I */
    private int f1810I;

    /* renamed from: J */
    private int f1811J = -1;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f1812K;

    /* renamed from: L */
    private final AtomicBoolean f1813L = new AtomicBoolean();

    /* renamed from: M */
    private final AtomicBoolean f1814M = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: N */
    public long f1815N = -2;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public long f1816O = 0;

    /* renamed from: s */
    protected final AppLovinVideoView f1817s;

    /* renamed from: t */
    protected final C1433a f1818t;

    /* renamed from: u */
    protected final C1550m f1819u;

    /* renamed from: v */
    protected final ImageView f1820v;

    /* renamed from: w */
    protected final C1564t f1821w;

    /* renamed from: x */
    protected final ProgressBar f1822x;

    /* renamed from: y */
    protected final C1537j f1823y = new C1537j(this.f1808G, this.f1710b);

    /* renamed from: z */
    protected boolean f1824z = Utils.isVideoMutedInitially(this.f1710b);

    /* renamed from: com.applovin.impl.adview.activity.b.f$a */
    private class C1498a implements C1565u.C1566a {
        private C1498a() {
        }

        /* renamed from: a */
        public void mo13061a(C1564t tVar) {
            if (C2102v.m5104a()) {
                C1486f.this.f1711c.mo15012b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            C1486f.this.mo13040a(tVar.getAndClearLastClickLocation());
        }

        /* renamed from: b */
        public void mo13062b(C1564t tVar) {
            if (C2102v.m5104a()) {
                C1486f.this.f1711c.mo15012b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            C1486f.this.mo12999h();
        }

        /* renamed from: c */
        public void mo13063c(C1564t tVar) {
            if (C2102v.m5104a()) {
                C1486f.this.f1711c.mo15012b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            C1486f.this.mo13031c();
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.f$b */
    private class C1499b implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, AppLovinTouchToClickListener.OnClickListener {
        private C1499b() {
        }

        public void onClick(View view, PointF pointF) {
            C1486f.this.mo13040a(pointF);
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            if (C2102v.m5104a()) {
                C1486f.this.f1711c.mo15012b("AppLovinFullscreenActivity", "Video completed");
            }
            boolean unused = C1486f.this.f1812K = true;
            C1486f.this.mo13046y();
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C1486f fVar = C1486f.this;
            fVar.mo13042c("Video view error (" + i + "," + i2 + ")");
            C1486f.this.f1817s.start();
            return true;
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (C2102v.m5104a()) {
                C2102v vVar = C1486f.this.f1711c;
                vVar.mo15012b("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i + ", " + i2 + ")");
            }
            if (i == 701) {
                C1486f.this.mo13043v();
                C1486f.this.f1712d.mo14335g();
                return false;
            } else if (i == 3) {
                C1486f.this.f1823y.mo13187a();
                if (C1486f.this.f1819u != null) {
                    C1486f.this.m2694A();
                }
                C1486f.this.mo13044w();
                if (!C1486f.this.f1725q.mo14265c()) {
                    return false;
                }
                C1486f.this.mo12996e();
                return false;
            } else if (i != 702) {
                return false;
            } else {
                C1486f.this.mo13044w();
                return false;
            }
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            MediaPlayer unused = C1486f.this.f1805D = mediaPlayer;
            mediaPlayer.setOnInfoListener(C1486f.this.f1806E);
            mediaPlayer.setOnErrorListener(C1486f.this.f1806E);
            float f = C1486f.this.f1824z ^ true ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f, f);
            C1486f.this.mo13041c((long) mediaPlayer.getDuration());
            C1486f.this.mo13012u();
            if (C2102v.m5104a()) {
                C2102v vVar = C1486f.this.f1711c;
                vVar.mo15012b("AppLovinFullscreenActivity", "MediaPlayer prepared: " + C1486f.this.f1805D);
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.f$c */
    private class C1500c implements View.OnClickListener {
        private C1500c() {
        }

        public void onClick(View view) {
            if (view == C1486f.this.f1819u) {
                if (C1486f.this.mo13010s()) {
                    C1486f.this.mo12996e();
                    C1486f.this.mo13007p();
                    C1486f.this.f1725q.mo14264b();
                    return;
                }
                C1486f.this.mo13031c();
            } else if (view == C1486f.this.f1820v) {
                C1486f.this.mo13045x();
            } else if (C2102v.m5104a()) {
                C2102v vVar = C1486f.this.f1711c;
                vVar.mo15016e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public C1486f(C1839e eVar, Activity activity, C1969m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        if (eVar.hasVideoUrl()) {
            AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
            this.f1817s = appLovinVideoView;
            appLovinVideoView.setOnPreparedListener(this.f1806E);
            this.f1817s.setOnCompletionListener(this.f1806E);
            this.f1817s.setOnErrorListener(this.f1806E);
            this.f1817s.setOnTouchListener(new AppLovinTouchToClickListener(mVar, C1867b.f3112aM, activity, this.f1806E));
            C1500c cVar = new C1500c();
            if (eVar.mo14233q() >= 0) {
                C1550m mVar2 = new C1550m(eVar.mo14239w(), activity);
                this.f1819u = mVar2;
                mVar2.setVisibility(8);
                this.f1819u.setOnClickListener(cVar);
            } else {
                this.f1819u = null;
            }
            if (m2701a(this.f1824z, mVar)) {
                ImageView imageView = new ImageView(activity);
                this.f1820v = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f1820v.setClickable(true);
                this.f1820v.setOnClickListener(cVar);
                m2707e(this.f1824z);
            } else {
                this.f1820v = null;
            }
            String B = eVar.mo14163B();
            if (StringUtils.isValidString(B)) {
                C1565u uVar = new C1565u(mVar);
                uVar.mo13244a(new WeakReference(this.f1807F));
                C1564t tVar = new C1564t(uVar, activity);
                this.f1821w = tVar;
                tVar.mo13243a(B);
            } else {
                this.f1821w = null;
            }
            if (this.f1809H) {
                C1433a aVar = new C1433a(activity, ((Integer) mVar.mo14534a(C1867b.f3206cB)).intValue(), 16842874);
                this.f1818t = aVar;
                aVar.setColor(Color.parseColor("#75FFFFFF"));
                this.f1818t.setBackgroundColor(Color.parseColor("#00000000"));
                this.f1818t.setVisibility(8);
                AppLovinCommunicator.getInstance(activity).subscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
            } else {
                this.f1818t = null;
            }
            if (eVar.mo14175O()) {
                ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842872);
                this.f1822x = progressBar;
                progressBar.setMax(10000);
                this.f1822x.setPadding(0, 0, 0, 0);
                if (C2049g.m4942d()) {
                    this.f1822x.setProgressTintList(ColorStateList.valueOf(eVar.mo14176P()));
                }
                this.f1823y.mo13188a("PROGRESS_BAR", ((Long) mVar.mo14534a(C1867b.f3255cy)).longValue(), (C1537j.C1539a) new C1537j.C1539a() {
                    /* renamed from: a */
                    public void mo13038a() {
                        if (C1486f.this.f1803B) {
                            C1486f.this.f1822x.setVisibility(8);
                            return;
                        }
                        C1486f.this.f1822x.setProgress((int) ((((float) C1486f.this.f1817s.getCurrentPosition()) / ((float) C1486f.this.f1802A)) * 10000.0f));
                    }

                    /* renamed from: b */
                    public boolean mo13039b() {
                        return !C1486f.this.f1803B;
                    }
                });
                return;
            }
            this.f1822x = null;
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m2694A() {
        if (this.f1814M.compareAndSet(false, true)) {
            mo12985a(this.f1819u, this.f1709a.mo14233q(), new Runnable() {
                public void run() {
                    long unused = C1486f.this.f1815N = -1;
                    long unused2 = C1486f.this.f1816O = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    /* renamed from: B */
    private void m2695B() {
        C1564t tVar;
        C1563s C = this.f1709a.mo14164C();
        if (C != null && C.mo13234e() && !this.f1803B && (tVar = this.f1821w) != null) {
            final boolean z = tVar.getVisibility() == 4;
            final long f = C.mo13236f();
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    if (z) {
                        C2095q.m5075a((View) C1486f.this.f1821w, f, (Runnable) null);
                    } else {
                        C2095q.m5080b(C1486f.this.f1821w, f, (Runnable) null);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m2696C() {
        if (this.f1803B) {
            if (C2102v.m5104a()) {
                this.f1711c.mo15015d("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
            }
        } else if (this.f1710b.mo14554ad().mo15025a()) {
            if (C2102v.m5104a()) {
                this.f1711c.mo15015d("AppLovinFullscreenActivity", "Skip video resume - app paused");
            }
        } else if (this.f1811J >= 0) {
            if (C2102v.m5104a()) {
                C2102v vVar = this.f1711c;
                vVar.mo15012b("AppLovinFullscreenActivity", "Resuming video at position " + this.f1811J + "ms for MediaPlayer: " + this.f1805D);
            }
            this.f1817s.seekTo(this.f1811J);
            this.f1817s.start();
            this.f1823y.mo13187a();
            this.f1811J = -1;
            mo12986a((Runnable) new Runnable() {
                public void run() {
                    if (C1486f.this.f1818t != null) {
                        C1486f.this.f1818t.mo12955a();
                        C1486f.this.mo12986a((Runnable) new Runnable() {
                            public void run() {
                                C1486f.this.f1818t.mo12956b();
                            }
                        }, 2000);
                    }
                }
            }, 250);
        } else if (C2102v.m5104a()) {
            this.f1711c.mo15012b("AppLovinFullscreenActivity", "Invalid last video position");
        }
    }

    /* renamed from: a */
    private static boolean m2701a(boolean z, C1969m mVar) {
        if (!((Boolean) mVar.mo14534a(C1867b.f3247cq)).booleanValue()) {
            return false;
        }
        if (!((Boolean) mVar.mo14534a(C1867b.f3248cr)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) mVar.mo14534a(C1867b.f3250ct)).booleanValue();
    }

    /* renamed from: d */
    private void m2706d(boolean z) {
        this.f1810I = mo13068z();
        if (z) {
            this.f1817s.pause();
        } else {
            this.f1817s.stopPlayback();
        }
    }

    /* renamed from: e */
    private void m2707e(boolean z) {
        if (C2049g.m4942d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f1713e.getDrawable(z ? C2271R.C2272drawable.unmute_to_mute : C2271R.C2272drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f1820v.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f1820v.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aC = z ? this.f1709a.mo14194aC() : this.f1709a.mo14195aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f1820v.setImageURI(aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
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
                C1486f.this.m2696C();
            }
        }, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13040a(PointF pointF) {
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
        m2695B();
    }

    /* renamed from: a */
    public void mo12984a(ViewGroup viewGroup) {
        String str;
        this.f1804C.mo12973a(this.f1820v, this.f1819u, this.f1821w, this.f1818t, this.f1822x, this.f1817s, this.f1714f, viewGroup);
        if (C2049g.m4945g() && (str = this.f1710b.mo14586p().getExtraParameters().get("audio_focus_request")) != null) {
            this.f1817s.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        mo12989a(!this.f1809H);
        this.f1817s.setVideoURI(this.f1709a.mo12853h());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (this.f1709a.mo14216am()) {
            this.f1725q.mo14262a(this.f1709a, (Runnable) new Runnable() {
                public void run() {
                    C1486f.this.mo12982a(250);
                }
            });
        }
        this.f1817s.start();
        if (this.f1809H) {
            mo13043v();
        }
        this.f1714f.renderAd(this.f1709a);
        this.f1712d.mo14328b(this.f1809H ? 1 : 0);
        if (this.f1819u != null) {
            this.f1710b.mo14526S().mo14431a(new C1944z(this.f1710b, new Runnable() {
                public void run() {
                    C1486f.this.m2694A();
                }
            }), C1918o.C1920a.MAIN, this.f1709a.mo14234r(), true);
        }
        super.mo12993b(this.f1824z);
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
        this.f1815N = SystemClock.elapsedRealtime() - this.f1816O;
        if (C2102v.m5104a()) {
            this.f1711c.mo15012b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.f1815N + "ms");
        }
        this.f1712d.mo14334f();
        this.f1718j++;
        if (this.f1709a.mo14240x()) {
            mo12999h();
        } else {
            mo13046y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13041c(long j) {
        this.f1802A = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13042c(String str) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.f1711c;
            vVar.mo15016e("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f1709a);
        }
        if (this.f1813L.compareAndSet(false, true)) {
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
        } else if (!this.f1803B) {
            mo12996e();
        }
    }

    /* renamed from: d */
    public void mo12995d() {
        mo12984a((ViewGroup) null);
    }

    /* renamed from: e */
    public void mo12996e() {
        if (C2102v.m5104a()) {
            this.f1711c.mo15012b("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f1811J = this.f1817s.getCurrentPosition();
        this.f1817s.pause();
        this.f1823y.mo13190c();
        if (C2102v.m5104a()) {
            C2102v vVar = this.f1711c;
            vVar.mo15012b("AppLovinFullscreenActivity", "Paused video at position " + this.f1811J + "ms");
        }
    }

    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    /* renamed from: h */
    public void mo12999h() {
        this.f1823y.mo13189b();
        this.f1808G.removeCallbacksAndMessages((Object) null);
        mo13004m();
        super.mo12999h();
    }

    /* renamed from: k */
    public void mo13002k() {
        if (C2102v.m5104a()) {
            this.f1711c.mo15014c("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (this.f1809H) {
                AppLovinCommunicator.getInstance(this.f1713e).unsubscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
            }
            if (this.f1817s != null) {
                this.f1817s.pause();
                this.f1817s.stopPlayback();
            }
            if (this.f1805D != null) {
                this.f1805D.release();
            }
        } catch (Throwable th) {
            Log.e("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.mo13002k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo13004m() {
        super.mo12981a(mo13068z(), this.f1809H, mo13009r(), this.f1815N);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j = messageData.getLong("ad_id");
            if (((Boolean) this.f1710b.mo14534a(C1867b.f3321eM)).booleanValue() && j == this.f1709a.getAdIdNumber() && this.f1809H) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i < 200 || i >= 300) && !this.f1812K && !this.f1817s.isPlaying()) {
                    mo13042c("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo13009r() {
        return mo13068z() >= this.f1709a.mo14177Q();
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
                long j3 = this.f1802A;
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
    public void mo13043v() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1486f.this.f1818t != null) {
                    C1486f.this.f1818t.mo12955a();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo13044w() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1486f.this.f1818t != null) {
                    C1486f.this.f1818t.mo12956b();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo13045x() {
        if (this.f1805D != null) {
            try {
                boolean z = false;
                float f = (float) (!this.f1824z ? 0 : 1);
                this.f1805D.setVolume(f, f);
                if (!this.f1824z) {
                    z = true;
                }
                this.f1824z = z;
                m2707e(z);
                mo12990a(this.f1824z, 0);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: y */
    public void mo13046y() {
        if (C2102v.m5104a()) {
            this.f1711c.mo15012b("AppLovinFullscreenActivity", "Showing postitial...");
        }
        m2706d(this.f1709a.mo14201aJ());
        this.f1804C.mo12974a(this.f1715g, this.f1714f);
        mo12988a("javascript:al_onPoststitialShow(" + this.f1718j + "," + this.f1719k + ");", (long) this.f1709a.mo14179S());
        if (this.f1715g != null) {
            if (this.f1709a.mo14235s() >= 0) {
                mo12985a(this.f1715g, this.f1709a.mo14235s(), new Runnable() {
                    public void run() {
                        C1486f.this.f1717i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f1715g.setVisibility(0);
            }
        }
        this.f1803B = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo13068z() {
        long currentPosition = (long) this.f1817s.getCurrentPosition();
        if (this.f1812K) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.f1802A)) * 100.0f) : this.f1810I;
    }
}
