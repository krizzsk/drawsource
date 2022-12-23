package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import com.unity3d.player.C11769j;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.unity3d.player.k */
final class C11772k {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public UnityPlayer f28494a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f28495b = null;

    /* renamed from: c */
    private C11779a f28496c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Semaphore f28497d = new Semaphore(0);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Lock f28498e = new ReentrantLock();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C11769j f28499f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f28500g = 2;

    /* renamed from: h */
    private boolean f28501h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f28502i = false;

    /* renamed from: com.unity3d.player.k$a */
    public interface C11779a {
        /* renamed from: a */
        void mo70465a();
    }

    C11772k(UnityPlayer unityPlayer) {
        this.f28494a = unityPlayer;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m32205d() {
        C11769j jVar = this.f28499f;
        if (jVar != null) {
            this.f28494a.removeViewFromPlayer(jVar);
            this.f28502i = false;
            this.f28499f.destroyPlayer();
            this.f28499f = null;
            C11779a aVar = this.f28496c;
            if (aVar != null) {
                aVar.mo70465a();
            }
        }
    }

    /* renamed from: a */
    public final void mo70601a() {
        this.f28498e.lock();
        C11769j jVar = this.f28499f;
        if (jVar != null) {
            if (this.f28500g == 0) {
                jVar.CancelOnPrepare();
            } else if (this.f28502i) {
                boolean a = jVar.mo70574a();
                this.f28501h = a;
                if (!a) {
                    this.f28499f.pause();
                }
            }
        }
        this.f28498e.unlock();
    }

    /* renamed from: a */
    public final boolean mo70602a(Context context, String str, int i, int i2, int i3, boolean z, long j, long j2, C11779a aVar) {
        this.f28498e.lock();
        this.f28496c = aVar;
        this.f28495b = context;
        this.f28497d.drainPermits();
        this.f28500g = 2;
        final String str2 = str;
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        final boolean z2 = z;
        final long j3 = j;
        final long j4 = j2;
        runOnUiThread(new Runnable() {
            public final void run() {
                if (C11772k.this.f28499f != null) {
                    C11756d.Log(5, "Video already playing");
                    int unused = C11772k.this.f28500g = 2;
                    C11772k.this.f28497d.release();
                    return;
                }
                C11769j unused2 = C11772k.this.f28499f = new C11769j(C11772k.this.f28495b, str2, i4, i5, i6, z2, j3, j4, new C11769j.C11770a() {
                    /* renamed from: a */
                    public final void mo70598a(int i) {
                        C11772k.this.f28498e.lock();
                        int unused = C11772k.this.f28500g = i;
                        if (i == 3 && C11772k.this.f28502i) {
                            C11772k.this.runOnUiThread(new Runnable() {
                                public final void run() {
                                    C11772k.this.m32205d();
                                    C11772k.this.f28494a.resume();
                                }
                            });
                        }
                        if (i != 0) {
                            C11772k.this.f28497d.release();
                        }
                        C11772k.this.f28498e.unlock();
                    }
                });
                if (C11772k.this.f28499f != null) {
                    C11772k.this.f28494a.addView(C11772k.this.f28499f);
                }
            }
        });
        boolean z3 = false;
        try {
            this.f28498e.unlock();
            this.f28497d.acquire();
            this.f28498e.lock();
            if (this.f28500g != 2) {
                z3 = true;
            }
        } catch (InterruptedException unused) {
        }
        runOnUiThread(new Runnable() {
            public final void run() {
                C11772k.this.f28494a.pause();
            }
        });
        runOnUiThread((!z3 || this.f28500g == 3) ? new Runnable() {
            public final void run() {
                C11772k.this.m32205d();
                C11772k.this.f28494a.resume();
            }
        } : new Runnable() {
            public final void run() {
                if (C11772k.this.f28499f != null) {
                    C11772k.this.f28494a.addViewToPlayer(C11772k.this.f28499f, true);
                    boolean unused = C11772k.this.f28502i = true;
                    C11772k.this.f28499f.requestFocus();
                }
            }
        });
        this.f28498e.unlock();
        return z3;
    }

    /* renamed from: b */
    public final void mo70603b() {
        this.f28498e.lock();
        C11769j jVar = this.f28499f;
        if (jVar != null && this.f28502i && !this.f28501h) {
            jVar.start();
        }
        this.f28498e.unlock();
    }

    /* renamed from: c */
    public final void mo70604c() {
        this.f28498e.lock();
        C11769j jVar = this.f28499f;
        if (jVar != null) {
            jVar.updateVideoLayout();
        }
        this.f28498e.unlock();
    }

    /* access modifiers changed from: protected */
    public final void runOnUiThread(Runnable runnable) {
        Context context = this.f28495b;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            C11756d.Log(5, "Not running from an Activity; Ignoring execution request...");
        }
    }
}
