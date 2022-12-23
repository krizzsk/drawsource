package com.inmobi.media;

import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import java.lang.Thread;
import java.lang.reflect.Method;

/* renamed from: com.inmobi.media.gm */
/* compiled from: InMobiCrashHandler */
public class C6135gm implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    private static final String f15458b = C6135gm.class.getSimpleName();

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f15459a;

    public C6135gm(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f15459a = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    private static boolean m18181a(Class<?> cls, StackTraceElement stackTraceElement) {
        if (stackTraceElement.getClassName().equals(cls.getName())) {
            for (Method name : PublisherCallbacks.class.getDeclaredMethods()) {
                if (stackTraceElement.getMethodName().equals(name.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        boolean z = true;
        if (th != null) {
            try {
                if (!(th instanceof SdkNotInitializedException)) {
                    if (!(th instanceof InvalidPlacementIdException)) {
                        StackTraceElement[] stackTrace = th.getStackTrace();
                        int length = stackTrace.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            StackTraceElement stackTraceElement = stackTrace[i];
                            if (m18181a(InMobiInterstitial.C8089a.class.getSuperclass(), stackTraceElement) || m18181a(InMobiInterstitial.C8089a.class, stackTraceElement) || m18181a(InMobiNative.NativeCallbacks.class, stackTraceElement) || m18181a(InMobiBanner.C8087a.class, stackTraceElement) || m18181a(InMobiBanner.C8087a.class.getSuperclass(), stackTraceElement)) {
                                break;
                            }
                            if (stackTraceElement.getClassName().equals(InMobiSdk.class.getName())) {
                                if (stackTraceElement.getMethodName().equals(InMobiSdk.class.getDeclaredMethod("fireListener", new Class[]{SdkInitializationListener.class, String.class}).getName())) {
                                    break;
                                }
                            }
                            if (stackTraceElement.getClassName().contains(C6135gm.class.getName())) {
                                break;
                            } else if (stackTraceElement.getClassName().contains("com.inmobi.")) {
                                break;
                            } else if (stackTraceElement.getClassName().contains("com.aerserv.")) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                try {
                    C6130gj.m18161a().mo35309a(new C6134gl(thread, (Throwable) e));
                    C6130gj.m18161a().mo35309a(new C6134gl(thread, th));
                } catch (Exception unused) {
                }
            }
        }
        z = false;
        if (z) {
            C6130gj.m18161a().mo35309a(new C6134gl(thread, th));
        }
        this.f15459a.uncaughtException(thread, th);
    }
}
