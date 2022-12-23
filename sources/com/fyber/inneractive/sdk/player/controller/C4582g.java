package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.measurement.C4408g;
import com.fyber.inneractive.sdk.player.C4533c;
import com.fyber.inneractive.sdk.player.C4607e;
import com.fyber.inneractive.sdk.player.enums.C4610b;
import com.fyber.inneractive.sdk.player.mediaplayer.C5018a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.player.controller.g */
public abstract class C4582g implements C5018a.C5030l {

    /* renamed from: a */
    public Context f11378a = null;

    /* renamed from: b */
    public List<C4588f> f11379b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public List<C4587e> f11380c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public C4589g f11381d;

    /* renamed from: e */
    public C4610b f11382e = C4610b.Idle;

    /* renamed from: f */
    public C4586d f11383f;

    /* renamed from: g */
    public boolean f11384g;

    /* renamed from: h */
    public C4607e f11385h;

    /* renamed from: i */
    public Handler f11386i;

    /* renamed from: j */
    public TextureView f11387j;

    /* renamed from: k */
    public SurfaceTexture f11388k;

    /* renamed from: l */
    public Surface f11389l;

    /* renamed from: m */
    public TextureView.SurfaceTextureListener f11390m;

    /* renamed from: n */
    public boolean f11391n = false;

    /* renamed from: o */
    public boolean f11392o;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$a */
    public class C4583a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Exception f11393a;

        public C4583a(Exception exc) {
            this.f11393a = exc;
        }

        public void run() {
            C4582g gVar = C4582g.this;
            if (!gVar.f11384g) {
                try {
                    List<C4588f> list = gVar.f11379b;
                    if (list != null) {
                        for (C4588f a : list) {
                            a.mo24717a(this.f11393a);
                        }
                    }
                } catch (Exception e) {
                    if (IAlog.f13936a <= 3) {
                        C4582g gVar2 = C4582g.this;
                        gVar2.getClass();
                        IAlog.m16446a("%sonPlayerError callback threw an exception!", IAlog.m16443a((Object) gVar2));
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$b */
    public class C4584b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f11395a;

        public C4584b(int i) {
            this.f11395a = i;
        }

        public void run() {
            try {
                List<C4587e> list = C4582g.this.f11380c;
                if (list != null) {
                    for (C4587e a : list) {
                        a.mo24839a(this.f11395a);
                    }
                }
            } catch (Exception e) {
                if (IAlog.f13936a <= 3) {
                    C4582g gVar = C4582g.this;
                    gVar.getClass();
                    IAlog.m16446a("%sonPlayerProgress callback threw an exception!", IAlog.m16443a((Object) gVar));
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$c */
    public class C4585c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4610b f11397a;

        public C4585c(C4610b bVar) {
            this.f11397a = bVar;
        }

        public void run() {
            C4582g gVar;
            TextureView textureView;
            TextureView textureView2;
            TextureView textureView3;
            try {
                List<C4588f> list = C4582g.this.f11379b;
                if (list != null) {
                    for (C4588f a : list) {
                        a.mo24840a(this.f11397a);
                    }
                }
                C4610b bVar = this.f11397a;
                if (bVar == C4610b.Idle || bVar == C4610b.Error || bVar == C4610b.f11462i) {
                    C4582g gVar2 = C4582g.this;
                    if (!(gVar2.f11388k == null || (textureView3 = gVar2.f11387j) == null || textureView3.getParent() == null)) {
                        ((ViewGroup) C4582g.this.f11387j.getParent()).removeView(C4582g.this.f11387j);
                    }
                    gVar = C4582g.this;
                    gVar.f11387j = null;
                    gVar.f11388k = null;
                }
            } catch (Exception e) {
                if (IAlog.f13936a <= 3) {
                    C4582g gVar3 = C4582g.this;
                    gVar3.getClass();
                    IAlog.m16446a("%sonPlayerStateChanged callback threw an exception!", IAlog.m16443a((Object) gVar3));
                    e.printStackTrace();
                }
                C4610b bVar2 = this.f11397a;
                if (bVar2 == C4610b.Idle || bVar2 == C4610b.Error || bVar2 == C4610b.f11462i) {
                    C4582g gVar4 = C4582g.this;
                    if (!(gVar4.f11388k == null || (textureView = gVar4.f11387j) == null || textureView.getParent() == null)) {
                        ((ViewGroup) C4582g.this.f11387j.getParent()).removeView(C4582g.this.f11387j);
                    }
                    gVar = C4582g.this;
                    gVar.f11387j = null;
                }
            } catch (Throwable th) {
                C4610b bVar3 = this.f11397a;
                if (bVar3 == C4610b.Idle || bVar3 == C4610b.Error || bVar3 == C4610b.f11462i) {
                    C4582g gVar5 = C4582g.this;
                    if (!(gVar5.f11388k == null || (textureView2 = gVar5.f11387j) == null || textureView2.getParent() == null)) {
                        ((ViewGroup) C4582g.this.f11387j.getParent()).removeView(C4582g.this.f11387j);
                    }
                    C4582g gVar6 = C4582g.this;
                    gVar6.f11387j = null;
                    gVar6.f11388k = null;
                }
                throw th;
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$d */
    public interface C4586d {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$e */
    public interface C4587e {
        /* renamed from: a */
        void mo24839a(int i);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$f */
    public interface C4588f {
        /* renamed from: a */
        void mo24840a(C4610b bVar);

        /* renamed from: a */
        void mo24717a(Exception exc);

        /* renamed from: e */
        void mo24841e();

        /* renamed from: e */
        void mo24723e(boolean z);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$g */
    public interface C4589g {
    }

    public C4582g(Context context) {
        this.f11378a = context.getApplicationContext();
        this.f11386i = new Handler(context.getMainLooper());
        this.f11385h = new C4607e(this);
        mo24785a(true);
    }

    /* renamed from: a */
    public abstract void mo24782a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo24783a(Surface surface);

    /* renamed from: a */
    public abstract void mo24784a(String str, int i);

    /* renamed from: a */
    public abstract void mo24785a(boolean z);

    /* renamed from: a */
    public abstract boolean mo24786a();

    /* renamed from: b */
    public abstract void mo24788b(boolean z);

    /* renamed from: c */
    public abstract int mo24789c();

    /* renamed from: c */
    public final void mo24834c(boolean z) {
        C4408g gVar;
        C4586d dVar = this.f11383f;
        if (dVar != null && (gVar = C4533c.this.f11212i) != null) {
            if (z) {
                if (gVar.f10814c != null) {
                    IAlog.m16446a("%s mute", "OMVideo");
                    try {
                        gVar.f10814c.volumeChange(0.0f);
                    } catch (Throwable th) {
                        gVar.mo24588a(th);
                    }
                }
            } else if (gVar.f10814c != null) {
                IAlog.m16446a("%s unMute", "OMVideo");
                try {
                    gVar.f10814c.volumeChange(1.0f);
                } catch (Throwable th2) {
                    gVar.mo24588a(th2);
                }
            }
        }
    }

    /* renamed from: d */
    public abstract int mo24790d();

    /* renamed from: d */
    public abstract void mo24791d(boolean z);

    /* renamed from: e */
    public abstract Bitmap mo24792e();

    /* renamed from: f */
    public abstract String mo24793f();

    /* renamed from: g */
    public abstract int mo24794g();

    /* renamed from: h */
    public abstract int mo24795h();

    /* renamed from: i */
    public abstract boolean mo24796i();

    /* renamed from: j */
    public boolean mo24813j() {
        return this.f11382e == C4610b.Playing;
    }

    /* renamed from: k */
    public abstract void mo24797k();

    /* renamed from: l */
    public abstract void mo24798l();

    /* renamed from: m */
    public void mo24835m() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        C4607e eVar = this.f11385h;
        if (eVar != null && (scheduledThreadPoolExecutor = eVar.f11442b) != null) {
            scheduledThreadPoolExecutor.shutdownNow();
            eVar.f11442b = null;
        }
    }

    /* renamed from: a */
    public void mo24833a(Exception exc) {
        mo24832a(C4610b.Error);
        IAlog.m16446a("%sonPlayerError called with: %s for onPlayerError", IAlog.m16443a((Object) this), exc);
        this.f11386i.post(new C4583a(exc));
        mo24835m();
    }

    /* renamed from: b */
    public void mo24787b() {
        IAlog.m16446a("%sdestroy started", IAlog.m16443a((Object) this));
        mo24835m();
        this.f11385h = null;
        Handler handler = this.f11386i;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        List<C4588f> list = this.f11379b;
        if (list != null) {
            list.clear();
        }
        this.f11379b = null;
        this.f11383f = null;
        this.f11384g = true;
        IAlog.m16446a("%sdestroy finished", IAlog.m16443a((Object) this));
    }

    /* renamed from: a */
    public void mo24781a(int i) {
        this.f11386i.post(new C4584b(i));
    }

    /* renamed from: a */
    public void mo24832a(C4610b bVar) {
        if (bVar != this.f11382e) {
            this.f11382e = bVar;
            if (bVar == C4610b.Playing) {
                C4607e eVar = this.f11385h;
                if (eVar != null && eVar.f11442b == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                    eVar.f11442b = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(eVar.f11443c, (long) 100, (long) 1000, TimeUnit.MILLISECONDS);
                }
            } else if (bVar == C4610b.Paused || bVar == C4610b.Idle || bVar == C4610b.f11462i) {
                mo24835m();
            }
            this.f11386i.post(new C4585c(bVar));
        }
    }
}
