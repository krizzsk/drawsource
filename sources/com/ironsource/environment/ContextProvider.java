package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;

public class ContextProvider {

    /* renamed from: e */
    private static volatile ContextProvider f16098e;

    /* renamed from: a */
    private Activity f16099a;

    /* renamed from: b */
    private Context f16100b;

    /* renamed from: c */
    private ConcurrentHashMap<String, C6361a> f16101c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private Handler f16102d = new Handler(Looper.getMainLooper());

    /* renamed from: com.ironsource.environment.ContextProvider$a */
    public interface C6361a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f16098e == null) {
            synchronized (ContextProvider.class) {
                if (f16098e == null) {
                    f16098e = new ContextProvider();
                }
            }
        }
        return f16098e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f16099a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Context getApplicationContext() {
        /*
            r1 = this;
            android.content.Context r0 = r1.f16100b
            if (r0 != 0) goto L_0x000d
            android.app.Activity r0 = r1.f16099a
            if (r0 == 0) goto L_0x000d
            android.content.Context r0 = r0.getApplicationContext()
            return r0
        L_0x000d:
            android.content.Context r0 = r1.f16100b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.ContextProvider.getApplicationContext():android.content.Context");
    }

    public Activity getCurrentActiveActivity() {
        return this.f16099a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            for (C6361a onPause : this.f16101c.values()) {
                onPause.onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f16099a = activity;
            for (C6361a onResume : this.f16101c.values()) {
                onResume.onResume(this.f16099a);
            }
        }
    }

    @Deprecated
    public void postOnUIThread(Runnable runnable) {
        Handler handler = this.f16102d;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void registerLifeCycleListener(C6361a aVar) {
        this.f16101c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f16099a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f16100b = context;
        }
    }
}
