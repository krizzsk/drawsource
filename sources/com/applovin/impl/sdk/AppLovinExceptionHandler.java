package com.applovin.impl.sdk;

import android.os.Process;
import com.tapjoy.TJAdUnitConstants;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static final AppLovinExceptionHandler f2837a = new AppLovinExceptionHandler();

    /* renamed from: b */
    private final Set<C1969m> f2838b = new HashSet(2);

    /* renamed from: c */
    private final AtomicBoolean f2839c = new AtomicBoolean();

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f2840d;

    public static AppLovinExceptionHandler shared() {
        return f2837a;
    }

    public void addSdk(C1969m mVar) {
        this.f2838b.add(mVar);
    }

    public void enable() {
        if (this.f2839c.compareAndSet(false, true)) {
            this.f2840d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        for (C1969m next : this.f2838b) {
            if (C2102v.m5104a()) {
                next.mo14509A().mo15012b("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            ((EventServiceImpl) next.mo14594w()).trackEventSynchronously(TJAdUnitConstants.String.VIDEO_PAUSED);
            ((EventServiceImpl) next.mo14594w()).trackEventSynchronously("crashed");
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f2840d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}
