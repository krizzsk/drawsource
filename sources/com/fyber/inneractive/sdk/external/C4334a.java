package com.fyber.inneractive.sdk.external;

import android.content.SharedPreferences;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* renamed from: com.fyber.inneractive.sdk.external.a */
public class C4334a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f10652a;

    /* renamed from: b */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f10653b;

    public C4334a(SharedPreferences sharedPreferences, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f10652a = sharedPreferences;
        this.f10653b = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        SharedPreferences sharedPreferences = this.f10652a;
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringBuffer = stringWriter.getBuffer().toString();
        if (stringBuffer.contains("com.fyber.inneractive")) {
            sharedPreferences.edit().putString("FyberExceptionKey", stringBuffer).putString("FyberVersionKey", InneractiveAdManager.getVersion()).putString("FyberNameKey", th.getClass().getName()).putString("FyberDescriptionKey", th.getLocalizedMessage()).commit();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f10653b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
