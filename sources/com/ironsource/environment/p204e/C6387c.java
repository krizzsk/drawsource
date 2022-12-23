package com.ironsource.environment.p204e;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72581bv = {1, 0, 3}, mo72582d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo72583d2 = {"Lcom/ironsource/environment/thread/IronSourceThreadManager;", "", "()V", "backgroundHandler", "Lcom/ironsource/environment/thread/IronSourceHandlerThread;", "uiHandler", "Landroid/os/Handler;", "postBackgroundTask", "", "action", "Ljava/lang/Runnable;", "delay", "", "postOnUiThreadTask", "removeBackgroundTask", "removeUiThreadTask", "environment_release"}, mo72584k = 1, mo72585mv = {1, 4, 2})
/* renamed from: com.ironsource.environment.e.c */
public final class C6387c {

    /* renamed from: a */
    public static final C6387c f16171a = new C6387c();

    /* renamed from: b */
    private static final Handler f16172b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static final C6386b f16173c;

    static {
        C6386b bVar = new C6386b("background");
        bVar.start();
        bVar.mo35894a();
        f16173c = bVar;
    }

    private C6387c() {
    }

    /* renamed from: a */
    public static void m19068a(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f16172b.postDelayed(runnable, j);
    }

    /* renamed from: b */
    public static void m19070b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f16172b.removeCallbacks(runnable);
    }

    /* renamed from: b */
    public static void m19071b(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f16173c.mo35895a(runnable, j);
    }

    /* renamed from: a */
    public final void mo35896a(Runnable runnable) {
        m19068a(runnable, 0);
    }

    /* renamed from: c */
    public final void mo35897c(Runnable runnable) {
        m19071b(runnable, 0);
    }
}
