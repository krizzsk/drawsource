package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.cache.session.C4188c;
import com.fyber.inneractive.sdk.cache.session.C4189d;
import com.fyber.inneractive.sdk.cache.session.enums.C4192a;
import com.fyber.inneractive.sdk.cache.session.enums.C4193b;
import com.fyber.inneractive.sdk.config.C4253i;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5326w0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.fyber.inneractive.sdk.config.b */
public class C4205b implements C4253i.C4255b {

    /* renamed from: a */
    public final AtomicBoolean f10380a = new AtomicBoolean(false);

    /* renamed from: b */
    public boolean f10381b = false;

    /* renamed from: c */
    public C5326w0 f10382c;

    /* renamed from: d */
    public final C4216e0 f10383d;

    /* renamed from: e */
    public final Handler f10384e = new Handler(Looper.getMainLooper(), new C4206a());

    /* renamed from: f */
    public final C5326w0.C5328b f10385f;

    /* renamed from: com.fyber.inneractive.sdk.config.b$a */
    public class C4206a implements Handler.Callback {
        public C4206a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 123) {
                return false;
            }
            C4205b bVar = C4205b.this;
            if (bVar.f10380a.compareAndSet(false, true)) {
                if (bVar.f10380a.get() && bVar.f10382c != null) {
                    IAlog.m16446a("startCounting", new Object[0]);
                    bVar.f10382c.mo26411c();
                }
                IAlog.m16446a("Pause signal", new Object[0]);
            }
            return true;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.b$b */
    public class C4207b implements Application.ActivityLifecycleCallbacks {
        public C4207b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            if (!C4205b.this.f10384e.hasMessages(123) && !C4205b.this.f10380a.get()) {
                C4205b.this.f10384e.sendEmptyMessageDelayed(123, 3000);
            }
        }

        public void onActivityResumed(Activity activity) {
            C4205b.this.f10384e.removeMessages(123);
            C4205b bVar = C4205b.this;
            if (bVar.f10380a.compareAndSet(true, false)) {
                if (bVar.f10381b) {
                    IAlog.m16446a("onActivityResumed: restartSession", new Object[0]);
                    bVar.f10381b = false;
                    C4216e0 e0Var = bVar.f10383d;
                    if (e0Var != null) {
                        C4189d dVar = ((C4213d0) e0Var).f10400a;
                        if (dVar != null) {
                            dVar.mo24178a(dVar.f10297a);
                            C5299n.m16520a(new C4188c(dVar, C4192a.NEW_SESSION, C4193b.NONE));
                        }
                        C4216e0 e0Var2 = bVar.f10383d;
                        ((C4213d0) e0Var2).f10402c.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                        ((C4213d0) bVar.f10383d).f10401b.clear();
                    }
                }
                C5326w0 w0Var = bVar.f10382c;
                if (w0Var != null) {
                    w0Var.f14064d = false;
                    w0Var.f14066f = 0;
                    Handler handler = w0Var.f14063c;
                    if (handler != null) {
                        handler.removeMessages(1932593528);
                    }
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.b$c */
    public class C4208c implements C5326w0.C5328b {
        public C4208c() {
        }

        /* renamed from: a */
        public void mo24200a(C5326w0 w0Var) {
            IAlog.m16446a("onVisibleTimeReached: %s", Long.valueOf(System.currentTimeMillis()));
            boolean unused = C4205b.this.f10381b = true;
        }
    }

    public C4205b(C4216e0 e0Var) {
        C4207b bVar = new C4207b();
        this.f10385f = new C4208c();
        this.f10383d = e0Var;
        Application a = C5292l.m16501a();
        if (a != null) {
            a.registerActivityLifecycleCallbacks(bVar);
        }
    }

    public void onGlobalConfigChanged(C4253i iVar, C4252h hVar) {
        C5326w0 w0Var = this.f10382c;
        if (w0Var != null) {
            w0Var.f14064d = false;
            w0Var.f14066f = 0;
            Handler handler = w0Var.f14063c;
            if (handler != null) {
                handler.removeMessages(1932593528);
            }
            C5326w0 w0Var2 = new C5326w0(TimeUnit.MINUTES, (long) hVar.mo24271a("session_duration", 30, 1), this.f10382c.f14066f);
            this.f10382c = w0Var2;
            w0Var2.f14065e = this.f10385f;
        }
        iVar.f10460c.remove(this);
    }
}
