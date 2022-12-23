package com.unity3d.services.ads.video;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.widget.VideoView;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.unity3d.services.ads.video.c */
/* compiled from: VideoPlayerView */
public class C11917c extends VideoView {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f28913a;

    /* renamed from: b */
    private Timer f28914b;

    /* renamed from: c */
    private Timer f28915c;

    /* renamed from: d */
    private int f28916d = 500;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public MediaPlayer f28917e = null;

    /* renamed from: f */
    private Float f28918f = null;

    /* renamed from: g */
    private boolean f28919g = true;

    /* renamed from: h */
    private AudioManager f28920h = null;

    /* renamed from: com.unity3d.services.ads.video.c$a */
    /* compiled from: VideoPlayerView */
    class C11918a extends TimerTask {
        C11918a() {
        }

        public void run() {
            boolean z;
            try {
                z = C11917c.this.isPlaying();
                try {
                    C12136a.m33103c().mo71310a((Enum) C12143b.VIDEOPLAYER, (Enum) C11916b.PROGRESS, Integer.valueOf(C11917c.this.getCurrentPosition()));
                } catch (IllegalStateException e) {
                    e = e;
                }
            } catch (IllegalStateException e2) {
                e = e2;
                z = false;
                C12065a.m32842a("Exception while sending current position to webapp", (Exception) e);
                C12136a.m33103c().mo71310a((Enum) C12143b.VIDEOPLAYER, (Enum) C11916b.ILLEGAL_STATE, C11916b.PROGRESS, C11917c.this.f28913a, Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.video.c$b */
    /* compiled from: VideoPlayerView */
    class C11919b extends TimerTask {
        C11919b() {
        }

        public void run() {
            if (!C11917c.this.isPlaying()) {
                C12136a.m33103c().mo71310a((Enum) C12143b.VIDEOPLAYER, (Enum) C11916b.PREPARE_TIMEOUT, C11917c.this.f28913a);
                C12065a.m32848c("Video player prepare timeout: " + C11917c.this.f28913a);
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.video.c$c */
    /* compiled from: VideoPlayerView */
    class C11920c implements MediaPlayer.OnPreparedListener {

        /* renamed from: a */
        final /* synthetic */ float f28923a;

        C11920c(float f) {
            this.f28923a = f;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            C11917c.this.mo70868d();
            if (mediaPlayer != null) {
                MediaPlayer unused = C11917c.this.f28917e = mediaPlayer;
            }
            C11917c.this.setVolume(Float.valueOf(this.f28923a));
            C12136a.m33103c().mo71310a((Enum) C12143b.VIDEOPLAYER, (Enum) C11916b.PREPARED, C11917c.this.f28913a, Integer.valueOf(mediaPlayer.getDuration()), Integer.valueOf(mediaPlayer.getVideoWidth()), Integer.valueOf(mediaPlayer.getVideoHeight()));
        }
    }

    /* renamed from: com.unity3d.services.ads.video.c$d */
    /* compiled from: VideoPlayerView */
    class C11921d implements MediaPlayer.OnErrorListener {
        C11921d() {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C11917c.this.mo70868d();
            if (mediaPlayer != null) {
                MediaPlayer unused = C11917c.this.f28917e = mediaPlayer;
            }
            C12136a.m33103c().mo71310a((Enum) C12143b.VIDEOPLAYER, (Enum) C11916b.GENERIC_ERROR, C11917c.this.f28913a, Integer.valueOf(i), Integer.valueOf(i2));
            C11917c.this.mo70869e();
            return true;
        }
    }

    /* renamed from: com.unity3d.services.ads.video.c$e */
    /* compiled from: VideoPlayerView */
    class C11922e implements MediaPlayer.OnCompletionListener {
        C11922e() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            if (mediaPlayer != null) {
                MediaPlayer unused = C11917c.this.f28917e = mediaPlayer;
            }
            C12136a.m33103c().mo71310a((Enum) C12143b.VIDEOPLAYER, (Enum) C11916b.COMPLETED, C11917c.this.f28913a);
            C11917c.this.mo70869e();
        }
    }

    /* renamed from: com.unity3d.services.ads.video.c$f */
    /* compiled from: VideoPlayerView */
    class C11923f implements MediaPlayer.OnInfoListener {
        C11923f() {
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            C12136a.m33103c().mo71310a((Enum) C12143b.VIDEOPLAYER, (Enum) C11916b.INFO, C11917c.this.f28913a, Integer.valueOf(i), Integer.valueOf(i2));
            return true;
        }
    }

    public C11917c(Context context) {
        super(context);
    }

    /* renamed from: b */
    private void m32471b() {
        Timer timer = new Timer();
        this.f28914b = timer;
        C11918a aVar = new C11918a();
        long j = (long) this.f28916d;
        timer.scheduleAtFixedRate(aVar, j, j);
    }

    /* renamed from: c */
    public void mo70867c() {
        stopPlayback();
        mo70869e();
        if (Build.VERSION.SDK_INT < 26) {
            AudioManager audioManager = this.f28920h;
            if (audioManager != null) {
                audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
            }
        } else {
            setAudioFocusRequest(0);
        }
        C12136a.m33103c().mo71310a((Enum) C12143b.VIDEOPLAYER, (Enum) C11916b.STOP, this.f28913a);
    }

    /* renamed from: d */
    public void mo70868d() {
        Timer timer = this.f28915c;
        if (timer != null) {
            timer.cancel();
            this.f28915c.purge();
            this.f28915c = null;
        }
    }

    /* renamed from: e */
    public void mo70869e() {
        Timer timer = this.f28914b;
        if (timer != null) {
            timer.cancel();
            this.f28914b.purge();
            this.f28914b = null;
        }
    }

    public int getProgressEventInterval() {
        return this.f28916d;
    }

    public float getVolume() {
        return this.f28918f.floatValue();
    }

    public void pause() {
        try {
            super.pause();
            if (Build.VERSION.SDK_INT < 26) {
                AudioManager audioManager = this.f28920h;
                if (audioManager != null) {
                    audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
                }
            } else {
                setAudioFocusRequest(0);
            }
            mo70869e();
            C12136a.m33103c().mo71310a((Enum) C12143b.VIDEOPLAYER, (Enum) C11916b.PAUSE, this.f28913a);
        } catch (Exception e) {
            C12136a.m33103c().mo71310a((Enum) C12143b.VIDEOPLAYER, (Enum) C11916b.PAUSE_ERROR, this.f28913a);
            C12065a.m32842a("Error pausing video", e);
        }
    }

    public void seekTo(int i) {
        try {
            super.seekTo(i);
            C12136a.m33103c().mo71310a((Enum) C12143b.VIDEOPLAYER, (Enum) C11916b.SEEKTO, this.f28913a);
        } catch (Exception e) {
            C12136a.m33103c().mo71310a((Enum) C12143b.VIDEOPLAYER, (Enum) C11916b.SEEKTO_ERROR, this.f28913a);
            C12065a.m32842a("Error seeking video", e);
        }
    }

    public void setInfoListenerEnabled(boolean z) {
        this.f28919g = z;
        if (Build.VERSION.SDK_INT <= 16) {
            return;
        }
        if (z) {
            setOnInfoListener(new C11923f());
        } else {
            setOnInfoListener((MediaPlayer.OnInfoListener) null);
        }
    }

    public void setProgressEventInterval(int i) {
        this.f28916d = i;
        if (this.f28914b != null) {
            mo70869e();
            m32471b();
        }
    }

    public void setVolume(Float f) {
        try {
            this.f28917e.setVolume(f.floatValue(), f.floatValue());
            this.f28918f = f;
        } catch (Exception e) {
            C12065a.m32842a("MediaPlayer generic error", e);
        }
    }

    public int[] getVideoViewRectangle() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        return new int[]{iArr[0], iArr[1], getMeasuredWidth(), getMeasuredHeight()};
    }

    /* renamed from: a */
    private void m32470a(long j) {
        Timer timer = new Timer();
        this.f28915c = timer;
        timer.schedule(new C11919b(), j);
    }

    /* renamed from: a */
    public boolean mo70866a(String str, float f, int i) {
        C12065a.m32839a();
        this.f28913a = str;
        setOnPreparedListener(new C11920c(f));
        setOnErrorListener(new C11921d());
        setInfoListenerEnabled(this.f28919g);
        if (i > 0) {
            m32470a((long) i);
        }
        try {
            if (Build.VERSION.SDK_INT < 26) {
                AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
                this.f28920h = audioManager;
                if (audioManager != null) {
                    audioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, 3, 2);
                }
            } else {
                setAudioFocusRequest(2);
            }
            setVideoPath(this.f28913a);
            return true;
        } catch (Exception e) {
            C12136a.m33103c().mo71310a((Enum) C12143b.VIDEOPLAYER, (Enum) C11916b.PREPARE_ERROR, this.f28913a);
            C12065a.m32842a("Error preparing video: " + this.f28913a, e);
            return false;
        }
    }

    /* renamed from: a */
    public void mo70865a() {
        C12065a.m32839a();
        setOnCompletionListener(new C11922e());
        try {
            start();
            mo70869e();
            m32471b();
            C12136a.m33103c().mo71310a((Enum) C12143b.VIDEOPLAYER, (Enum) C11916b.PLAY, this.f28913a);
        } catch (IllegalStateException unused) {
            C12136a.m33103c().mo71310a((Enum) C12143b.VIDEOPLAYER, (Enum) C11916b.ILLEGAL_STATE, this.f28913a, Boolean.FALSE);
        }
    }
}
