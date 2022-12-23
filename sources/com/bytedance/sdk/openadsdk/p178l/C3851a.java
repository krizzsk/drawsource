package com.bytedance.sdk.openadsdk.p178l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.adexpress.C2528a;
import com.bytedance.sdk.component.p118e.p121c.C2851a;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.C3502k;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.openadsdk.l.a */
/* compiled from: ActivityLifecycleListener */
public class C3851a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static boolean f9899a = false;

    /* renamed from: b */
    public static long f9900b;

    /* renamed from: c */
    public static long f9901c;

    /* renamed from: d */
    private AtomicInteger f9902d = new AtomicInteger(0);

    /* renamed from: e */
    private AtomicBoolean f9903e = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public HashSet<Integer> f9904f = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C3855a f9905g = new C3855a();

    /* renamed from: h */
    private volatile CopyOnWriteArrayList<C2528a> f9906h = new CopyOnWriteArrayList<>();

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        if (this.f9902d.incrementAndGet() > 0) {
            this.f9903e.set(false);
        }
    }

    public void onActivityResumed(final Activity activity) {
        C2882e.m8036a(new C2885g("AppConfig_onActivityResume") {
            public void run() {
                C3502k.m10921c().removeMessages(1001);
                if (activity != null) {
                    C3851a.this.f9904f.add(Integer.valueOf(activity.hashCode()));
                    C2851a.m7927b((Context) activity);
                }
            }
        }, 5);
        if (!f9899a) {
            f9900b = System.currentTimeMillis();
            f9899a = true;
        }
    }

    public void onActivityPaused(Activity activity) {
        C2882e.m8036a(new C2885g("AppConfig_onActivityResume") {
            public void run() {
                Handler c = C3502k.m10921c();
                Message obtain = Message.obtain(c, C3851a.this.f9905g);
                obtain.what = 1001;
                c.sendMessageDelayed(obtain, 30000);
            }
        }, 5);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.l.a$a */
    /* compiled from: ActivityLifecycleListener */
    static class C3855a implements Runnable {
        C3855a() {
        }

        public void run() {
            C2882e.m8039b().execute(new C2885g("reportPvFromBackGround") {
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    public void onActivityStopped(Activity activity) {
        if (this.f9902d.decrementAndGet() == 0) {
            this.f9903e.set(true);
        }
        m12578b();
    }

    public void onActivityDestroyed(Activity activity) {
        if (activity != null) {
            this.f9904f.remove(Integer.valueOf(activity.hashCode()));
        }
        if (this.f9906h != null && this.f9906h.size() > 0) {
            Iterator<C2528a> it = this.f9906h.iterator();
            while (it.hasNext()) {
                C2528a next = it.next();
                if (next != null) {
                    next.mo16544a(activity);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo20711a(C2528a aVar) {
        this.f9906h.add(new WeakReference(aVar).get());
    }

    /* renamed from: b */
    public boolean mo20713b(C2528a aVar) {
        return this.f9906h.remove(new WeakReference(aVar).get());
    }

    /* renamed from: a */
    public boolean mo20712a() {
        return this.f9903e.get();
    }

    /* renamed from: b */
    private void m12578b() {
        C2882e.m8041b((C2885g) new C2885g("reportSdkUseTime") {
            public void run() {
                if (C3851a.this.mo20712a()) {
                    C3851a.f9899a = false;
                    C3851a.f9901c = System.currentTimeMillis();
                    C3753b.m12287a().mo20567a(C3851a.f9900b / 1000, C3851a.f9901c / 1000, C3502k.f8767b.get() ^ true ? 1 : 0);
                    C3502k.f8767b.set(false);
                }
            }
        });
    }
}
