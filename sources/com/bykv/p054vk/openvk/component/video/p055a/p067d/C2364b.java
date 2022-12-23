package com.bykv.p054vk.openvk.component.video.p055a.p067d;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.p054vk.openvk.component.video.api.C2397b;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2415c;
import com.bykv.p054vk.openvk.component.video.p055a.p056a.C2277a;
import com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2286c;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* renamed from: com.bykv.vk.openvk.component.video.a.d.b */
/* compiled from: AndroidMediaPlayer */
public class C2364b extends C2363a {

    /* renamed from: b */
    private final MediaPlayer f4795b;

    /* renamed from: c */
    private final C2365a f4796c;

    /* renamed from: d */
    private C2277a f4797d;

    /* renamed from: e */
    private Surface f4798e;

    /* renamed from: f */
    private final Object f4799f;

    /* renamed from: g */
    private volatile boolean f4800g;

    public C2364b() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.f4799f = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f4795b = mediaPlayer;
        }
        m5479a(mediaPlayer);
        try {
            this.f4795b.setAudioStreamType(3);
        } catch (Throwable th) {
            C2415c.m5836c("CSJ_VIDEO", "setAudioStreamType error: ", th);
        }
        this.f4796c = new C2365a(this);
        m5481p();
    }

    /* renamed from: a */
    private void m5479a(MediaPlayer mediaPlayer) {
        Field declaredField;
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 28) {
            try {
                Class<?> cls = Class.forName("android.media.MediaTimeProvider");
                Class<?> cls2 = Class.forName("android.media.SubtitleController");
                Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
                Object newInstance = cls2.getConstructor(new Class[]{Context.class, cls, Class.forName("android.media.SubtitleController$Listener")}).newInstance(new Object[]{C2397b.m5665a(), null, null});
                declaredField = cls2.getDeclaredField("mHandler");
                declaredField.setAccessible(true);
                declaredField.set(newInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", new Class[]{cls2, cls3}).invoke(mediaPlayer, new Object[]{newInstance, null});
            } catch (Throwable th) {
                C2415c.m5836c("CSJ_VIDEO", "setSubtitleController error: ", th);
            }
        }
    }

    /* renamed from: a */
    public void mo15833a(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.f4799f) {
            try {
                if (!this.f4800g && surfaceHolder != null && surfaceHolder.getSurface() != null && this.f4787a) {
                    this.f4795b.setDisplay(surfaceHolder);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo15832a(Surface surface) {
        m5482q();
        this.f4798e = surface;
        this.f4795b.setSurface(surface);
    }

    /* renamed from: a */
    public void mo15836a(String str) throws Throwable {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equalsIgnoreCase(ShareInternalUtility.STAGING_PARAM)) {
            this.f4795b.setDataSource(str);
        } else {
            this.f4795b.setDataSource(parse.getPath());
        }
    }

    /* renamed from: a */
    public void mo15835a(FileDescriptor fileDescriptor) throws Throwable {
        this.f4795b.setDataSource(fileDescriptor);
    }

    /* renamed from: a */
    public synchronized void mo15834a(C2401c cVar) {
        this.f4797d = C2277a.m5180a(C2397b.m5665a(), cVar);
        C2286c.m5237a(cVar);
        this.f4795b.setDataSource(this.f4797d);
    }

    /* renamed from: o */
    private void m5480o() {
        C2277a aVar;
        if (Build.VERSION.SDK_INT >= 23 && (aVar = this.f4797d) != null) {
            try {
                aVar.close();
            } catch (Throwable th) {
                C2415c.m5836c("CSJ_VIDEO", "releaseMediaDataSource error: ", th);
            }
            this.f4797d = null;
        }
    }

    /* renamed from: e */
    public void mo15840e() throws Throwable {
        this.f4795b.start();
    }

    /* renamed from: f */
    public void mo15841f() throws Throwable {
        this.f4795b.stop();
    }

    /* renamed from: g */
    public void mo15843g() throws Throwable {
        this.f4795b.pause();
    }

    /* renamed from: h */
    public void mo15844h() {
        MediaPlayer mediaPlayer = this.f4795b;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    /* renamed from: b */
    public void mo15837b(boolean z) throws Throwable {
        this.f4795b.setScreenOnWhilePlaying(z);
    }

    /* renamed from: a */
    public void mo15831a(long j) throws Throwable {
        this.f4795b.seekTo((int) j);
    }

    /* renamed from: i */
    public long mo15845i() {
        try {
            return (long) this.f4795b.getCurrentPosition();
        } catch (Throwable th) {
            C2415c.m5836c("CSJ_VIDEO", "getCurrentPosition error: ", th);
            return 0;
        }
    }

    /* renamed from: j */
    public long mo15846j() {
        try {
            return (long) this.f4795b.getDuration();
        } catch (Throwable th) {
            C2415c.m5836c("CSJ_VIDEO", "getDuration error: ", th);
            return 0;
        }
    }

    /* renamed from: k */
    public void mo15847k() throws Throwable {
        synchronized (this.f4799f) {
            if (!this.f4800g) {
                this.f4795b.release();
                this.f4800g = true;
                m5482q();
                m5480o();
                mo15815a();
                m5481p();
            }
        }
    }

    /* renamed from: l */
    public void mo15848l() throws Throwable {
        try {
            this.f4795b.reset();
        } catch (Throwable th) {
            C2415c.m5836c("CSJ_VIDEO", "reset error: ", th);
        }
        m5480o();
        mo15815a();
        m5481p();
    }

    /* renamed from: c */
    public void mo15838c(boolean z) throws Throwable {
        this.f4795b.setLooping(z);
    }

    /* renamed from: d */
    public void mo15839d(boolean z) throws Throwable {
        MediaPlayer mediaPlayer = this.f4795b;
        if (mediaPlayer != null) {
            if (z) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                mediaPlayer.setVolume(1.0f, 1.0f);
            }
        }
    }

    /* renamed from: m */
    public int mo15849m() {
        MediaPlayer mediaPlayer = this.f4795b;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    /* renamed from: n */
    public int mo15850n() {
        MediaPlayer mediaPlayer = this.f4795b;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: p */
    private void m5481p() {
        this.f4795b.setOnPreparedListener(this.f4796c);
        this.f4795b.setOnBufferingUpdateListener(this.f4796c);
        this.f4795b.setOnCompletionListener(this.f4796c);
        this.f4795b.setOnSeekCompleteListener(this.f4796c);
        this.f4795b.setOnVideoSizeChangedListener(this.f4796c);
        this.f4795b.setOnErrorListener(this.f4796c);
        this.f4795b.setOnInfoListener(this.f4796c);
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.d.b$a */
    /* compiled from: AndroidMediaPlayer */
    private static class C2365a implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        private final WeakReference<C2364b> f4801a;

        public C2365a(C2364b bVar) {
            this.f4801a = new WeakReference<>(bVar);
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                C2415c.m5831b("CSJ_VIDEO", "onInfo: ");
                C2364b bVar = (C2364b) this.f4801a.get();
                if (bVar == null || !bVar.mo15828b(i, i2)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                C2415c.m5836c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onInfo error: ", th);
                return false;
            }
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                C2415c.m5833b("CSJ_VIDEO", "onError: ", Integer.valueOf(i), Integer.valueOf(i2));
                C2364b bVar = (C2364b) this.f4801a.get();
                if (bVar == null || !bVar.mo15826a(i, i2)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                C2415c.m5836c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onError error: ", th);
                return false;
            }
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                C2364b bVar = (C2364b) this.f4801a.get();
                if (bVar != null) {
                    bVar.mo15817a(i, i2, 1, 1);
                }
            } catch (Throwable th) {
                C2415c.m5836c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onVideoSizeChanged error: ", th);
            }
        }

        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                C2364b bVar = (C2364b) this.f4801a.get();
                if (bVar != null) {
                    bVar.mo15830d();
                }
            } catch (Throwable th) {
                C2415c.m5836c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onSeekComplete error: ", th);
            }
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            try {
                C2364b bVar = (C2364b) this.f4801a.get();
                if (bVar != null) {
                    bVar.mo15816a(i);
                }
            } catch (Throwable th) {
                C2415c.m5836c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onBufferingUpdate error: ", th);
            }
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                C2364b bVar = (C2364b) this.f4801a.get();
                if (bVar != null) {
                    bVar.mo15829c();
                }
            } catch (Throwable th) {
                C2415c.m5836c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onCompletion error: ", th);
            }
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                C2364b bVar = (C2364b) this.f4801a.get();
                if (bVar != null) {
                    bVar.mo15827b();
                }
            } catch (Throwable th) {
                C2415c.m5836c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onPrepared error: ", th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        m5482q();
    }

    /* renamed from: q */
    private void m5482q() {
        try {
            if (this.f4798e != null) {
                this.f4798e.release();
                this.f4798e = null;
            }
        } catch (Throwable unused) {
        }
    }
}
