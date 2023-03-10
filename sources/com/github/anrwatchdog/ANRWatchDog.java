package com.github.anrwatchdog;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

public class ANRWatchDog extends Thread {
    private static final ANRInterceptor DEFAULT_ANR_INTERCEPTOR = new ANRInterceptor() {
        public long intercept(long j) {
            return 0;
        }
    };
    private static final ANRListener DEFAULT_ANR_LISTENER = new ANRListener() {
        public void onAppNotResponding(ANRError aNRError) {
            throw aNRError;
        }
    };
    private static final int DEFAULT_ANR_TIMEOUT = 5000;
    private static final InterruptionListener DEFAULT_INTERRUPTION_LISTENER = new InterruptionListener() {
        public void onInterrupted(InterruptedException interruptedException) {
            Log.w("ANRWatchdog", "Interrupted: " + interruptedException.getMessage());
        }
    };
    private ANRInterceptor _anrInterceptor;
    private ANRListener _anrListener;
    private boolean _ignoreDebugger;
    private InterruptionListener _interruptionListener;
    private boolean _logThreadsWithoutStackTrace;
    private String _namePrefix;
    /* access modifiers changed from: private */
    public volatile boolean _reported;
    /* access modifiers changed from: private */
    public volatile long _tick;
    private final Runnable _ticker;
    private final int _timeoutInterval;
    private final Handler _uiHandler;

    public interface ANRInterceptor {
        long intercept(long j);
    }

    public interface ANRListener {
        void onAppNotResponding(ANRError aNRError);
    }

    public interface InterruptionListener {
        void onInterrupted(InterruptedException interruptedException);
    }

    public ANRWatchDog() {
        this(5000);
    }

    public ANRWatchDog(int i) {
        this._anrListener = DEFAULT_ANR_LISTENER;
        this._anrInterceptor = DEFAULT_ANR_INTERCEPTOR;
        this._interruptionListener = DEFAULT_INTERRUPTION_LISTENER;
        this._uiHandler = new Handler(Looper.getMainLooper());
        this._namePrefix = "";
        this._logThreadsWithoutStackTrace = false;
        this._ignoreDebugger = false;
        this._tick = 0;
        this._reported = false;
        this._ticker = new Runnable() {
            public void run() {
                long unused = ANRWatchDog.this._tick = 0;
                boolean unused2 = ANRWatchDog.this._reported = false;
            }
        };
        this._timeoutInterval = i;
    }

    public int getTimeoutInterval() {
        return this._timeoutInterval;
    }

    public ANRWatchDog setANRListener(ANRListener aNRListener) {
        if (aNRListener == null) {
            this._anrListener = DEFAULT_ANR_LISTENER;
        } else {
            this._anrListener = aNRListener;
        }
        return this;
    }

    public ANRWatchDog setANRInterceptor(ANRInterceptor aNRInterceptor) {
        if (aNRInterceptor == null) {
            this._anrInterceptor = DEFAULT_ANR_INTERCEPTOR;
        } else {
            this._anrInterceptor = aNRInterceptor;
        }
        return this;
    }

    public ANRWatchDog setInterruptionListener(InterruptionListener interruptionListener) {
        if (interruptionListener == null) {
            this._interruptionListener = DEFAULT_INTERRUPTION_LISTENER;
        } else {
            this._interruptionListener = interruptionListener;
        }
        return this;
    }

    public ANRWatchDog setReportThreadNamePrefix(String str) {
        if (str == null) {
            str = "";
        }
        this._namePrefix = str;
        return this;
    }

    public ANRWatchDog setReportMainThreadOnly() {
        this._namePrefix = null;
        return this;
    }

    public ANRWatchDog setReportAllThreads() {
        this._namePrefix = "";
        return this;
    }

    public ANRWatchDog setLogThreadsWithoutStackTrace(boolean z) {
        this._logThreadsWithoutStackTrace = z;
        return this;
    }

    public ANRWatchDog setIgnoreDebugger(boolean z) {
        this._ignoreDebugger = z;
        return this;
    }

    public void run() {
        ANRError aNRError;
        setName("|ANR-WatchDog|");
        long j = (long) this._timeoutInterval;
        while (!isInterrupted()) {
            boolean z = this._tick == 0;
            this._tick += j;
            if (z) {
                this._uiHandler.post(this._ticker);
            }
            try {
                Thread.sleep(j);
                if (this._tick != 0 && !this._reported) {
                    if (this._ignoreDebugger || (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger())) {
                        j = this._anrInterceptor.intercept(this._tick);
                        if (j <= 0) {
                            if (this._namePrefix != null) {
                                aNRError = ANRError.New(this._tick, this._namePrefix, this._logThreadsWithoutStackTrace);
                            } else {
                                aNRError = ANRError.NewMainOnly(this._tick);
                            }
                            this._anrListener.onAppNotResponding(aNRError);
                            j = (long) this._timeoutInterval;
                            this._reported = true;
                        }
                    } else {
                        Log.w("ANRWatchdog", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                        this._reported = true;
                    }
                }
            } catch (InterruptedException e) {
                this._interruptionListener.onInterrupted(e);
                return;
            }
        }
    }
}
