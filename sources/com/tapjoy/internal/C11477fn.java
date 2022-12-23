package com.tapjoy.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.tapjoy.TapjoyLog;
import com.tapjoy.TapjoyUtil;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.tapjoy.internal.fn */
public final class C11477fn {

    /* renamed from: a */
    private static final C11477fn f27550a = new C11477fn();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Application f27551b;

    /* renamed from: c */
    private Application.ActivityLifecycleCallbacks f27552c;

    /* renamed from: d */
    private final HashSet<String> f27553d = new HashSet<>();

    /* renamed from: a */
    public static void m31440a(Context context) {
        if (Build.VERSION.SDK_INT >= 14 && context != null) {
            C11477fn fnVar = f27550a;
            Context applicationContext = context.getApplicationContext();
            if (fnVar.f27551b == null) {
                try {
                    if (applicationContext instanceof Application) {
                        fnVar.f27551b = (Application) applicationContext;
                    } else {
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        TapjoyUtil.runOnMainThread(new Runnable() {
                            public final void run() {
                                try {
                                    Application unused = C11477fn.this.f27551b = C11477fn.m31441b();
                                } catch (Exception e) {
                                    TapjoyLog.m30844w("Tapjoy.ActivityTracker", Log.getStackTraceString(e));
                                } catch (Throwable th) {
                                    countDownLatch.countDown();
                                    throw th;
                                }
                                countDownLatch.countDown();
                            }
                        });
                        countDownLatch.await();
                    }
                } catch (Exception e) {
                    TapjoyLog.m30844w("Tapjoy.ActivityTracker", Log.getStackTraceString(e));
                }
                if (fnVar.f27551b == null) {
                    return;
                }
            }
            synchronized (fnVar) {
                if (fnVar.f27552c == null) {
                    Activity c = C11285b.m30884c();
                    if (c != null) {
                        fnVar.f27553d.add(m31442b(c));
                    }
                    final HashSet<String> hashSet = fnVar.f27553d;
                    C114792 r1 = new Application.ActivityLifecycleCallbacks() {
                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                        }

                        public final void onActivityDestroyed(Activity activity) {
                        }

                        public final void onActivityPaused(Activity activity) {
                        }

                        public final void onActivityResumed(Activity activity) {
                        }

                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        }

                        public final void onActivityStarted(Activity activity) {
                            hashSet.add(C11477fn.m31442b(activity));
                            if (hashSet.size() == 1) {
                                C11558hj.m31644a().mo70129e();
                            }
                            C11285b.m30880a(activity);
                        }

                        public final void onActivityStopped(Activity activity) {
                            hashSet.remove(C11477fn.m31442b(activity));
                            if (hashSet.size() <= 0) {
                                C11558hj.m31644a().mo70130f();
                            }
                        }
                    };
                    fnVar.f27552c = r1;
                    fnVar.f27551b.registerActivityLifecycleCallbacks(r1);
                    C11558hj.m31644a().mo70129e();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m31439a() {
        if (Build.VERSION.SDK_INT >= 14) {
            C11477fn fnVar = f27550a;
            if (fnVar.f27551b != null) {
                synchronized (fnVar) {
                    if (fnVar.f27552c != null) {
                        fnVar.f27551b.unregisterActivityLifecycleCallbacks(fnVar.f27552c);
                        fnVar.f27552c = null;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m31442b(Activity activity) {
        return activity.getClass().getName() + "@" + System.identityHashCode(activity);
    }

    /* renamed from: b */
    static /* synthetic */ Application m31441b() {
        return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke((Object) null, (Object[]) null);
    }
}
