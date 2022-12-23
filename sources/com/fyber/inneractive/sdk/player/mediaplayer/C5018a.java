package com.fyber.inneractive.sdk.player.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.fyber.inneractive.sdk.player.controller.C4582g;
import com.fyber.inneractive.sdk.player.enums.C4610b;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a */
public final class C5018a extends MediaPlayer implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a */
    public Context f13378a;

    /* renamed from: b */
    public volatile C4610b f13379b = C4610b.Idle;

    /* renamed from: c */
    public boolean f13380c = false;

    /* renamed from: d */
    public boolean f13381d = false;

    /* renamed from: e */
    public boolean f13382e = false;

    /* renamed from: f */
    public boolean f13383f = false;

    /* renamed from: g */
    public boolean f13384g = false;

    /* renamed from: h */
    public Handler f13385h;

    /* renamed from: i */
    public C5030l f13386i;

    /* renamed from: j */
    public Surface f13387j;

    /* renamed from: k */
    public SurfaceHolder f13388k;

    /* renamed from: l */
    public long f13389l;

    /* renamed from: m */
    public int f13390m = 0;

    /* renamed from: n */
    public HandlerThread f13391n;

    /* renamed from: o */
    public Handler f13392o;

    /* renamed from: p */
    public Runnable f13393p;

    /* renamed from: q */
    public Runnable f13394q;

    /* renamed from: r */
    public int f13395r = 0;

    /* renamed from: s */
    public int f13396s = 0;

    /* renamed from: t */
    public int f13397t = 0;

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$a */
    public class C5019a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f13398a;

        /* renamed from: b */
        public final /* synthetic */ int f13399b;

        public C5019a(int i, int i2) {
            this.f13398a = i;
            this.f13399b = i2;
        }

        public void run() {
            if (C5018a.this.f13386i != null) {
                String format = String.format(Locale.ENGLISH, "Player Error: %d, %d", new Object[]{Integer.valueOf(this.f13398a), Integer.valueOf(this.f13399b)});
                ((C4582g) C5018a.this.f13386i).mo24833a((Exception) new C5031m(format));
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$b */
    public class C5020b implements Runnable {
        public C5020b() {
        }

        public void run() {
            C5018a.m15209a(C5018a.this);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$c */
    public class C5021c implements Runnable {
        public C5021c() {
        }

        public void run() {
            IAlog.m16446a("%sCannot wait for video size anymore", C5018a.this.mo25615c());
            C5018a aVar = C5018a.this;
            if (aVar.f13395r == 0) {
                IAlog.m16446a("%sCannot wait for video size anymore. duration is still 0 - aborting", aVar.mo25615c());
                C5018a aVar2 = C5018a.this;
                aVar2.onError(aVar2, 0, 0);
                return;
            }
            IAlog.m16446a("%sCannot wait for video size anymore. moving into ready", aVar.mo25615c());
            boolean unused = C5018a.this.f13383f = true;
            C5018a.this.mo25616d();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$d */
    public class C5022d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4610b f13403a;

        public C5022d(C4610b bVar) {
            this.f13403a = bVar;
        }

        public void run() {
            C5030l lVar = C5018a.this.f13386i;
            if (lVar != null) {
                ((C4582g) lVar).mo24832a(this.f13403a);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$e */
    public class C5023e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ SurfaceHolder f13405a;

        public C5023e(SurfaceHolder surfaceHolder) {
            this.f13405a = surfaceHolder;
        }

        public void run() {
            C5018a.m15211a(C5018a.this, this.f13405a);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$f */
    public class C5024f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Surface f13407a;

        public C5024f(Surface surface) {
            this.f13407a = surface;
        }

        public void run() {
            C5018a.m15210a(C5018a.this, this.f13407a);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$g */
    public class C5025g implements Runnable {
        public C5025g() {
        }

        public void run() {
            C5018a.m15213b(C5018a.this);
            Handler handler = C5018a.this.f13392o;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                C5018a.this.f13392o = null;
            }
            C5018a.this.f13391n = null;
            Looper.myLooper().quit();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$h */
    public class C5026h implements Runnable {
        public C5026h() {
        }

        public void run() {
            C5018a.this.mo25618f();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$i */
    public class C5027i implements Runnable {
        public C5027i() {
        }

        public void run() {
            C5018a.m15214c(C5018a.this);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$j */
    public class C5028j implements Runnable {
        public C5028j() {
        }

        public void run() {
            C5018a.m15215d(C5018a.this);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$k */
    public class C5029k implements Runnable {
        public C5029k() {
        }

        public void run() {
            C5018a aVar = C5018a.this;
            String c = aVar.mo25615c();
            long currentTimeMillis = System.currentTimeMillis();
            aVar.setVolume(0.0f, 0.0f);
            IAlog.m16449d(c + "timelog: " + "mute" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$l */
    public interface C5030l {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$m */
    public static class C5031m extends Exception {
        public C5031m(String str) {
            super(str);
        }

        public C5031m(Throwable th, String str) {
            super(str, th);
        }
    }

    public C5018a(Context context, C5030l lVar, Handler handler) {
        this.f13378a = context;
        this.f13386i = lVar;
        this.f13385h = handler;
        setOnPreparedListener(this);
        setOnErrorListener(this);
        setOnSeekCompleteListener(this);
        setOnVideoSizeChangedListener(this);
        super.setOnCompletionListener(this);
        mo25609a();
    }

    /* renamed from: c */
    public static void m15214c(C5018a aVar) {
        String c = aVar.mo25615c();
        long currentTimeMillis = System.currentTimeMillis();
        C4610b bVar = aVar.f13379b;
        if (bVar == C4610b.Paused || bVar == C4610b.Prepared || bVar == C4610b.f11462i || bVar == C4610b.Start_in_progress) {
            super.start();
            aVar.mo25610a(C4610b.Playing);
        } else {
            IAlog.m16446a("%s Start called in wrong mState! %s", aVar.mo25615c(), bVar);
            if (aVar.f13379b == C4610b.Seeking) {
                aVar.f13380c = true;
            }
        }
        IAlog.m16449d(c + "timelog: " + "start" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    /* renamed from: d */
    public static void m15215d(C5018a aVar) {
        String c = aVar.mo25615c();
        long currentTimeMillis = System.currentTimeMillis();
        if (super.isPlaying()) {
            super.pause();
        } else {
            IAlog.m16446a("%s paused called cannot set to pause, canceled", aVar.mo25615c());
        }
        IAlog.m16449d(c + "timelog: " + "delayed pause" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    /* renamed from: b */
    public boolean mo25614b() {
        return (this.f13379b == C4610b.Idle || this.f13379b == C4610b.Preparing) ? false : true;
    }

    /* renamed from: e */
    public void mo25617e() {
        this.f13381d = true;
        if (mo25614b()) {
            mo25611a((Runnable) new C5029k());
        } else {
            IAlog.m16446a("%s mute called when player is not ready!", mo25615c());
        }
        IAlog.m16446a("%s mute", mo25615c());
    }

    /* renamed from: f */
    public final void mo25618f() {
        String c = mo25615c();
        long currentTimeMillis = System.currentTimeMillis();
        C4610b bVar = this.f13379b;
        C4610b bVar2 = C4610b.Idle;
        if (bVar == bVar2) {
            IAlog.m16446a("%s reset called, but player is already resetted. Do nothing", mo25615c());
            return;
        }
        mo25610a(bVar2);
        try {
            super.reset();
        } catch (Exception unused) {
        }
        IAlog.m16449d(c + "timelog: " + "reset" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    public int getCurrentPosition() {
        if (mo25614b()) {
            return super.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        return this.f13395r;
    }

    public int getVideoHeight() {
        return this.f13397t;
    }

    public int getVideoWidth() {
        return this.f13396s;
    }

    public boolean isPlaying() {
        return mo25614b() && this.f13379b != C4610b.Paused && super.isPlaying();
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        mo25610a(C4610b.f11462i);
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.m16450e("%s onError code = %d code2 = %d", mo25615c(), Integer.valueOf(i), Integer.valueOf(i2));
        mo25618f();
        this.f13385h.post(new C5019a(i, i2));
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.m16446a("%s onPrepared %s gotPrepared = %s", mo25615c(), this, Boolean.valueOf(this.f13384g));
        IAlog.m16446a("%sMedia prepare time took %d msec", mo25615c(), Long.valueOf(System.currentTimeMillis() - this.f13389l));
        if (this.f13379b != C4610b.Preparing && this.f13379b != C4610b.Seeking) {
            IAlog.m16450e("%s onPrepared: previous error encountered. Aborting", mo25615c());
        } else if (!this.f13384g) {
            this.f13384g = true;
            mo25616d();
        } else {
            IAlog.m16446a("%s onPrepared called again??? We are already prepared", mo25615c());
        }
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        IAlog.m16446a("%s onSeekComplete called current position = %d", mo25615c(), Integer.valueOf(mediaPlayer.getCurrentPosition()));
        if (this.f13379b != C4610b.Seeking) {
            IAlog.m16446a("%s onSeekComplete called when Story is not seeking", mo25615c());
            return;
        }
        if (this.f13381d) {
            mo25617e();
        }
        if (this.f13380c) {
            IAlog.m16446a("%s onSeekComplete mPlayAfterSeek = true", mo25615c());
            this.f13379b = C4610b.Paused;
            start();
            return;
        }
        IAlog.m16446a("%s onSeekComplete mPlayAfterSeek = false", mo25615c());
        mo25610a(C4610b.Paused);
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.m16446a("%s onVideoSizeChanged %d, %d", mo25615c(), Integer.valueOf(i), Integer.valueOf(i2));
        if (!this.f13383f) {
            Runnable runnable = this.f13393p;
            if (runnable != null) {
                C5299n.f14024b.removeCallbacks(runnable);
                IAlog.m16446a("%s onVideoSizeChanged cancelling prepared runnable", mo25615c());
            }
            this.f13383f = true;
            if (i == 0 || i2 == 0) {
                IAlog.m16450e("%s onVideoSizeChanged - Invalid video size!", mo25615c());
                onError(this, 0, 0);
                return;
            }
            IAlog.m16446a("%sMedia got video size time took %d msec", mo25615c(), Long.valueOf(System.currentTimeMillis() - this.f13389l));
            this.f13396s = i;
            this.f13397t = i2;
            mo25616d();
        }
    }

    public void pause() {
        C4610b bVar;
        if (this.f13379b == C4610b.Idle || this.f13379b == C4610b.f11462i || this.f13379b == (bVar = C4610b.Paused) || this.f13379b == C4610b.Prepared) {
            IAlog.m16446a("%s paused called when player is in mState: %s ignoring", mo25615c(), this.f13379b);
            return;
        }
        mo25610a(bVar);
        if (mo25614b()) {
            mo25611a((Runnable) new C5028j());
        } else {
            IAlog.m16446a("%s paused called when player is not ready!", mo25615c());
        }
        IAlog.m16446a("%s pause", mo25615c());
    }

    public void release() {
        if (!this.f13382e) {
            mo25611a((Runnable) new C5025g());
        }
        this.f13386i = null;
        this.f13394q = null;
        this.f13382e = true;
        IAlog.m16446a("%s release called", mo25615c());
    }

    public void reset() {
        IAlog.m16446a("%s reset called", mo25615c());
        Runnable runnable = this.f13393p;
        if (runnable != null) {
            C5299n.f14024b.removeCallbacks(runnable);
        }
        mo25611a((Runnable) new C5026h());
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        IAlog.m16446a("%s setDisplay called", mo25615c());
        if (!mo25614b()) {
            IAlog.m16446a("%s setDisplay called when player is not ready!", mo25615c());
            return;
        }
        SurfaceHolder surfaceHolder2 = this.f13388k;
        if (surfaceHolder2 == null || !surfaceHolder2.equals(surfaceHolder)) {
            this.f13388k = surfaceHolder;
            mo25611a((Runnable) new C5023e(surfaceHolder));
            return;
        }
        IAlog.m16446a("%s setDisplay called with existing surface. ignoring!", mo25615c());
    }

    public final void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        throw new IllegalAccessError("Please use IAplayerCallbacks to receive completion events");
    }

    public void setSurface(Surface surface) {
        IAlog.m16446a("%s setSurface called", mo25615c());
        Surface surface2 = this.f13387j;
        if (surface2 == null || !surface2.equals(surface)) {
            this.f13387j = surface;
            mo25611a((Runnable) new C5024f(surface));
            return;
        }
        IAlog.m16446a("%s setSurface called with existing surface. ignoring!", mo25615c());
    }

    public void start() {
        IAlog.m16446a("%s Start called", mo25615c());
        if (!mo25614b()) {
            IAlog.m16446a("%s MediaPlayer: Start called when player is not ready! - mState = %s", mo25615c(), this.f13379b);
        } else if (this.f13379b == C4610b.Seeking) {
            this.f13380c = true;
        } else if (isPlaying()) {
            IAlog.m16446a("%s MediaPlayer: Start called when player is already playing. do nothing", mo25615c());
        } else {
            mo25610a(C4610b.Start_in_progress);
            mo25611a((Runnable) new C5027i());
        }
    }

    public void stop() {
        String c = mo25615c();
        long currentTimeMillis = System.currentTimeMillis();
        if (mo25614b()) {
            super.stop();
        }
        IAlog.m16446a("%s stop called", mo25615c());
        IAlog.m16449d(c + "timelog: " + "stop" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    /* renamed from: b */
    public static void m15213b(C5018a aVar) {
        String c = aVar.mo25615c();
        long currentTimeMillis = System.currentTimeMillis();
        super.release();
        IAlog.m16449d(c + "timelog: " + "release" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    /* renamed from: a */
    public void mo25612a(String str) {
        String c = mo25615c();
        long currentTimeMillis = System.currentTimeMillis();
        this.f13383f = false;
        this.f13384g = false;
        if (isPlaying()) {
            IAlog.m16446a("%s loadUri stopping play before refresh", mo25615c());
            stop();
        }
        this.f13389l = System.currentTimeMillis();
        mo25618f();
        IAlog.m16446a("%s calling setDataSource with %s", mo25615c(), str);
        try {
            setDataSource(str);
            IAlog.m16446a("%s setDataSource succeeded, calling prepareAsync", mo25615c());
            mo25610a(C4610b.Preparing);
            try {
                prepareAsync();
            } catch (IllegalStateException e) {
                IAlog.m16447b("%s prepareAsync failed with illegal mState exception: %s", mo25615c(), e.getMessage());
                int i = this.f13390m + 1;
                this.f13390m = i;
                if (i < 5) {
                    mo25612a(str);
                }
                this.f13390m = 0;
            }
            IAlog.m16449d(c + "timelog: " + "loadUri" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        } catch (Exception e2) {
            IAlog.m16447b("%s error setting data source %s", mo25615c(), str);
            IAlog.m16447b("%s exception message: %s", mo25615c(), e2.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo25613b(C4610b bVar) {
        if (this.f13379b == bVar) {
            IAlog.m16446a("%s updatePlayerState - mState didn't change!", mo25615c());
            return;
        }
        IAlog.m16446a("%s updatePlayerState - changing from %s to %s", mo25615c(), this.f13379b, bVar);
        this.f13379b = bVar;
        this.f13385h.post(new C5022d(bVar));
    }

    /* renamed from: d */
    public final void mo25616d() {
        if (!this.f13384g) {
            return;
        }
        if (this.f13383f) {
            IAlog.m16446a("%sMedia load time took %d msec", mo25615c(), Long.valueOf(System.currentTimeMillis() - this.f13389l));
            this.f13395r = super.getDuration();
            mo25610a(C4610b.Prepared);
            if (this.f13381d) {
                mo25617e();
                return;
            }
            return;
        }
        IAlog.m16446a("%sGot prepared only, waiting for video size", mo25615c());
        if (this.f13393p == null) {
            this.f13393p = new C5021c();
        }
        C5299n.f14024b.postDelayed(this.f13393p, 2000);
    }

    /* renamed from: c */
    public final String mo25615c() {
        return "mp(" + this + "): T:" + Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + ": ";
    }

    /* renamed from: a */
    public final void mo25609a() {
        HandlerThread handlerThread = new HandlerThread("MP-Worker");
        this.f13391n = handlerThread;
        handlerThread.start();
        this.f13392o = new Handler(this.f13391n.getLooper());
        this.f13394q = new C5020b();
    }

    /* renamed from: a */
    public final void mo25610a(C4610b bVar) {
        IAlog.m16446a("%s updatePlayerState - %s", mo25615c(), bVar);
        synchronized (this.f13379b) {
            mo25613b(bVar);
        }
    }

    /* renamed from: a */
    public static void m15210a(C5018a aVar, Surface surface) {
        String c = aVar.mo25615c();
        long currentTimeMillis = System.currentTimeMillis();
        IAlog.m16446a("%s setSurface called with %s", aVar.mo25615c(), surface);
        try {
            super.setSurface(surface);
            if (surface == null) {
                IAlog.m16446a("%s setSurface with null! current surface cleared", aVar.mo25615c());
            } else {
                IAlog.m16446a("%s setSurface - replacing surface!", aVar.mo25615c());
            }
            IAlog.m16449d(c + "timelog: " + "setSurface" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.m16446a("%s super.setSurface threw exception!", aVar.mo25615c());
        }
    }

    /* renamed from: a */
    public static void m15211a(C5018a aVar, SurfaceHolder surfaceHolder) {
        String c = aVar.mo25615c();
        long currentTimeMillis = System.currentTimeMillis();
        IAlog.m16446a("%s setDisplay called with %s", aVar.mo25615c(), surfaceHolder);
        try {
            super.setDisplay(surfaceHolder);
            if (surfaceHolder == null) {
                IAlog.m16446a("%s setDisplay with null! current display cleared", aVar.mo25615c());
            } else {
                IAlog.m16446a("%s setDisplay - replacing surface holder!", aVar.mo25615c());
            }
            IAlog.m16449d(c + "timelog: " + "setDisplayInternal" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.m16446a("%s super.setDisplay threw exception!", aVar.mo25615c());
        }
    }

    /* renamed from: a */
    public final void mo25611a(Runnable runnable) {
        Handler handler;
        Handler handler2;
        HandlerThread handlerThread = this.f13391n;
        if (handlerThread != null && handlerThread.isAlive() && !this.f13391n.isInterrupted() && (handler2 = this.f13392o) != null) {
            handler2.post(runnable);
        }
        if ((this.f13396s == 0 || this.f13397t == 0 || this.f13395r == 0) && (handler = this.f13392o) != null) {
            handler.post(this.f13394q);
        }
    }

    /* renamed from: a */
    public static void m15209a(C5018a aVar) {
        if (aVar.mo25614b()) {
            aVar.f13396s = super.getVideoWidth();
            aVar.f13397t = super.getVideoHeight();
            aVar.f13395r = super.getDuration();
        }
    }
}
