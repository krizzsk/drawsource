package com.google.firebase.crashlytics.internal;

import android.util.Log;

public class Logger {
    static final Logger DEFAULT_LOGGER = new Logger(TAG);
    public static final String TAG = "FirebaseCrashlytics";
    private int logLevel = 4;
    private final String tag;

    public Logger(String str) {
        this.tag = str;
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    private boolean canLog(int i) {
        return this.logLevel <= i || Log.isLoggable(this.tag, i);
    }

    /* renamed from: d */
    public void mo52102d(String str, Throwable th) {
        if (canLog(3)) {
            Log.d(this.tag, str, th);
        }
    }

    /* renamed from: v */
    public void mo52110v(String str, Throwable th) {
        if (canLog(2)) {
            Log.v(this.tag, str, th);
        }
    }

    /* renamed from: i */
    public void mo52106i(String str, Throwable th) {
        if (canLog(4)) {
            Log.i(this.tag, str, th);
        }
    }

    /* renamed from: w */
    public void mo52112w(String str, Throwable th) {
        if (canLog(5)) {
            Log.w(this.tag, str, th);
        }
    }

    /* renamed from: e */
    public void mo52104e(String str, Throwable th) {
        if (canLog(6)) {
            Log.e(this.tag, str, th);
        }
    }

    /* renamed from: d */
    public void mo52101d(String str) {
        mo52102d(str, (Throwable) null);
    }

    /* renamed from: v */
    public void mo52109v(String str) {
        mo52110v(str, (Throwable) null);
    }

    /* renamed from: i */
    public void mo52105i(String str) {
        mo52106i(str, (Throwable) null);
    }

    /* renamed from: w */
    public void mo52111w(String str) {
        mo52112w(str, (Throwable) null);
    }

    /* renamed from: e */
    public void mo52103e(String str) {
        mo52104e(str, (Throwable) null);
    }

    public void log(int i, String str) {
        log(i, str, false);
    }

    public void log(int i, String str, boolean z) {
        if (z || canLog(i)) {
            Log.println(i, this.tag, str);
        }
    }
}
