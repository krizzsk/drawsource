package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.C5326w0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.flow.r */
public class C4373r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f10752a;

    /* renamed from: b */
    public final /* synthetic */ C4375s f10753b;

    /* renamed from: com.fyber.inneractive.sdk.flow.r$a */
    public class C4374a implements Runnable {
        public C4374a() {
        }

        public void run() {
            C4375s sVar = C4373r.this.f10753b;
            sVar.mo24553e(!sVar.f10764t);
            C4373r.this.f10753b.f10758n = null;
        }
    }

    public C4373r(C4375s sVar, long j) {
        this.f10753b = sVar;
        this.f10752a = j;
    }

    public void run() {
        if (this.f10753b.mo24333E()) {
            C4375s sVar = this.f10753b;
            sVar.f10758n = new C4374a();
            long a = sVar.mo24338a(this.f10752a);
            C4375s sVar2 = this.f10753b;
            sVar2.getClass();
            C5326w0 w0Var = new C5326w0(TimeUnit.MILLISECONDS, a);
            sVar2.f10759o = w0Var;
            w0Var.f14065e = new C4378t(sVar2);
            w0Var.mo26411c();
            C4375s sVar3 = this.f10753b;
            sVar3.getClass();
            IAlog.m16446a("%sad contains custom close. Will show transparent x in %d", IAlog.m16443a((Object) sVar3), Long.valueOf(a));
            this.f10753b.f10756l = null;
            return;
        }
        C4375s sVar4 = this.f10753b;
        sVar4.getClass();
        IAlog.m16446a("%sad does not contain custom close. Showing close button", IAlog.m16443a((Object) sVar4));
        this.f10753b.mo24553e(false);
    }
}
