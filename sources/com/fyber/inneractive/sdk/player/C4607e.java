package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.player.controller.C4582g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.fyber.inneractive.sdk.player.e */
public class C4607e {

    /* renamed from: a */
    public C4582g f11441a;

    /* renamed from: b */
    public ScheduledThreadPoolExecutor f11442b;

    /* renamed from: c */
    public Runnable f11443c;

    /* renamed from: d */
    public boolean f11444d = false;

    /* renamed from: com.fyber.inneractive.sdk.player.e$a */
    public class C4608a implements Runnable {
        public C4608a() {
        }

        public void run() {
            C4607e eVar = C4607e.this;
            eVar.getClass();
            IAlog.m16446a("player progress monitor: run started", new Object[0]);
            int c = eVar.f11441a.mo24789c();
            if (!eVar.f11444d) {
                int i = c + 0;
                IAlog.m16446a("run: 2 seconds passed? played for %d since last play started", Integer.valueOf(i));
                if (i >= 2000) {
                    IAlog.m16446a("run: setting played 2 seconds flag", new Object[0]);
                    eVar.f11444d = true;
                }
            }
            eVar.f11441a.mo24781a(c);
        }
    }

    public C4607e(C4582g gVar) {
        this.f11441a = gVar;
        this.f11443c = new C4608a();
    }
}
