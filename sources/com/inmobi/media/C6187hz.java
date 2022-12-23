package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.inmobi.media.hz */
/* compiled from: ApplicationFocusChangeObserver */
public class C6187hz {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f15618a = C6187hz.class.getSimpleName();

    /* renamed from: b */
    private static HashSet<C6191c> f15619b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f15620c = false;

    /* renamed from: com.inmobi.media.hz$b */
    /* compiled from: ApplicationFocusChangeObserver */
    static class C6190b {

        /* renamed from: a */
        static final C6187hz f15625a = new C6187hz((byte) 0);
    }

    /* renamed from: com.inmobi.media.hz$c */
    /* compiled from: ApplicationFocusChangeObserver */
    public interface C6191c {
        /* renamed from: a */
        void mo35407a(boolean z);
    }

    /* synthetic */ C6187hz(byte b) {
        this();
    }

    /* renamed from: a */
    public static C6187hz m18359a() {
        return C6190b.f15625a;
    }

    private C6187hz() {
    }

    /* renamed from: a */
    public void mo35398a(Context context, C6191c cVar) {
        if (f15619b == null) {
            f15619b = new LinkedHashSet();
            Application application = (Application) context.getApplicationContext();
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {

                        /* renamed from: b */
                        private final Handler f15622b = new C6189a(Looper.getMainLooper());

                        /* renamed from: c */
                        private WeakReference<Activity> f15623c;

                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                        }

                        public final void onActivityDestroyed(Activity activity) {
                        }

                        public final void onActivityPaused(Activity activity) {
                        }

                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        }

                        /* renamed from: a */
                        private void m18366a(Activity activity) {
                            WeakReference<Activity> weakReference = this.f15623c;
                            if (weakReference == null || weakReference.get() != activity) {
                                this.f15623c = new WeakReference<>(activity);
                            }
                            this.f15622b.removeMessages(1001);
                            this.f15622b.sendEmptyMessage(1002);
                        }

                        public final void onActivityStarted(Activity activity) {
                            m18366a(activity);
                        }

                        public final void onActivityResumed(Activity activity) {
                            m18366a(activity);
                        }

                        public final void onActivityStopped(Activity activity) {
                            WeakReference<Activity> weakReference = this.f15623c;
                            if (weakReference == null || weakReference.get() == activity) {
                                this.f15622b.sendEmptyMessageDelayed(1001, 3000);
                            }
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        }
        f15619b.add(cVar);
    }

    /* renamed from: b */
    public static void m18361b() {
        f15620c = true;
    }

    /* renamed from: c */
    public static void m18362c() {
        f15620c = false;
    }

    /* renamed from: com.inmobi.media.hz$a */
    /* compiled from: ApplicationFocusChangeObserver */
    static class C6189a extends Handler {

        /* renamed from: a */
        boolean f15624a = true;

        C6189a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            if (!C6187hz.f15620c) {
                if (message.what == 1001 && this.f15624a) {
                    this.f15624a = false;
                    C6187hz.m18360a(false);
                    String unused = C6187hz.f15618a;
                } else if (message.what == 1002 && !this.f15624a) {
                    this.f15624a = true;
                    C6187hz.m18360a(true);
                    String unused2 = C6187hz.f15618a;
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m18360a(boolean z) {
        if (C6183hw.m18324c() != null) {
            Iterator<C6191c> it = f15619b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo35407a(z);
                } catch (Exception unused) {
                }
            }
        }
    }
}
