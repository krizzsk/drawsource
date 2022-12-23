package com.ironsource.environment.p204e;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72581bv = {1, 0, 3}, mo72582d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo72583d2 = {"Lcom/ironsource/environment/thread/ISAdPlayerThreadManager;", "", "()V", "backgroundHandler", "Lcom/ironsource/environment/thread/IronSourceHandlerThread;", "publisherCallbackHandler", "uiHandler", "Landroid/os/Handler;", "getBackgroundThreadLooper", "Landroid/os/Looper;", "postBackgroundTask", "", "action", "Ljava/lang/Runnable;", "delay", "", "postCallbacks", "postOnUiThreadTask", "environment_release"}, mo72584k = 1, mo72585mv = {1, 4, 2})
/* renamed from: com.ironsource.environment.e.a */
public final class C6385a {

    /* renamed from: a */
    public static final C6385a f16166a = new C6385a();

    /* renamed from: b */
    private static final Handler f16167b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static final C6386b f16168c;

    /* renamed from: d */
    private static final C6386b f16169d;

    static {
        C6386b bVar = new C6386b("isadplayer-background");
        bVar.start();
        bVar.mo35894a();
        f16168c = bVar;
        C6386b bVar2 = new C6386b("isadplayer-publisher-callbacks");
        bVar2.start();
        bVar2.mo35894a();
        f16169d = bVar2;
    }

    private C6385a() {
    }

    /* renamed from: a */
    public static Looper m19061a() {
        return f16168c.getLooper();
    }

    /* renamed from: a */
    public final void mo35891a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f16167b.postDelayed(runnable, 0);
    }

    /* renamed from: b */
    public final void mo35892b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f16168c.mo35895a(runnable, 0);
    }

    /* renamed from: c */
    public final void mo35893c(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f16169d.mo35895a(runnable, 0);
    }
}
