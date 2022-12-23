package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p052d.C1881f;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.C2042a;
import com.applovin.impl.sdk.utils.Utils;
import com.tapjoy.TJAdUnitConstants;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.applovin.impl.sdk.y */
public class C2106y {

    /* renamed from: b */
    private static final AtomicBoolean f4138b = new AtomicBoolean();

    /* renamed from: a */
    final C1969m f4139a;

    /* renamed from: c */
    private final AtomicBoolean f4140c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicBoolean f4141d = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicInteger f4142e = new AtomicInteger();

    /* renamed from: f */
    private Date f4143f;

    /* renamed from: g */
    private Date f4144g;

    C2106y(final C1969m mVar) {
        this.f4139a = mVar;
        final Application application = (Application) mVar.mo14520L();
        application.registerActivityLifecycleCallbacks(new C2042a() {
            public void onActivityResumed(Activity activity) {
                super.onActivityResumed(activity);
                C2106y.this.m5130e();
            }
        });
        application.registerComponentCallbacks(new ComponentCallbacks2() {
            public void onConfigurationChanged(Configuration configuration) {
            }

            public void onLowMemory() {
            }

            public void onTrimMemory(int i) {
                C2106y.this.f4142e.set(i);
                if (i == 20) {
                    C2106y.this.m5131f();
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.USER_PRESENT".equals(action)) {
                    if (Utils.isCurrentProcessInForeground()) {
                        C2106y.this.m5130e();
                    }
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    C2106y.this.m5131f();
                }
            }
        }, intentFilter);
        if (((Boolean) mVar.mo14534a(C1867b.f3246cp)).booleanValue() && f4138b.compareAndSet(false, true)) {
            final Intent intent = new Intent(application, AppKilledService.class);
            application.startService(intent);
            mVar.mo14560aj().registerReceiver(new AppLovinBroadcastManager.Receiver() {
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    application.stopService(intent);
                    mVar.mo14560aj().unregisterReceiver(this);
                }
            }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m5130e() {
        if (this.f4141d.compareAndSet(true, false)) {
            m5133h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m5131f() {
        if (this.f4141d.compareAndSet(false, true)) {
            m5132g();
        }
    }

    /* renamed from: g */
    private void m5132g() {
        if (C2102v.m5104a()) {
            this.f4139a.mo14509A().mo15012b("SessionTracker", "Application Paused");
        }
        this.f4139a.mo14560aj().sendBroadcastSync(new Intent("com.applovin.application_paused"), (Map<String, Object>) null);
        if (!this.f4140c.get()) {
            boolean booleanValue = ((Boolean) this.f4139a.mo14534a(C1867b.f3294dl)).booleanValue();
            long millis = TimeUnit.MINUTES.toMillis(((Long) this.f4139a.mo14534a(C1867b.f3296dn)).longValue());
            if (this.f4143f == null || System.currentTimeMillis() - this.f4143f.getTime() >= millis) {
                ((EventServiceImpl) this.f4139a.mo14594w()).trackEvent(TJAdUnitConstants.String.VIDEO_PAUSED);
                if (booleanValue) {
                    this.f4143f = new Date();
                }
            }
            if (!booleanValue) {
                this.f4143f = new Date();
            }
        }
    }

    /* renamed from: h */
    private void m5133h() {
        if (C2102v.m5104a()) {
            this.f4139a.mo14509A().mo15012b("SessionTracker", "Application Resumed");
        }
        boolean booleanValue = ((Boolean) this.f4139a.mo14534a(C1867b.f3294dl)).booleanValue();
        long longValue = ((Long) this.f4139a.mo14534a(C1867b.f3295dm)).longValue();
        this.f4139a.mo14560aj().sendBroadcastSync(new Intent("com.applovin.application_resumed"), (Map<String, Object>) null);
        if (!this.f4140c.getAndSet(false)) {
            long millis = TimeUnit.MINUTES.toMillis(longValue);
            if (this.f4144g == null || System.currentTimeMillis() - this.f4144g.getTime() >= millis) {
                ((EventServiceImpl) this.f4139a.mo14594w()).trackEvent("resumed");
                if (booleanValue) {
                    this.f4144g = new Date();
                }
            }
            if (!booleanValue) {
                this.f4144g = new Date();
            }
            this.f4139a.mo14527T().mo14351a(C1881f.f3475k);
        }
    }

    /* renamed from: a */
    public boolean mo15025a() {
        return this.f4141d.get();
    }

    /* renamed from: b */
    public int mo15026b() {
        return this.f4142e.get();
    }

    /* renamed from: c */
    public void mo15027c() {
        this.f4140c.set(true);
    }

    /* renamed from: d */
    public void mo15028d() {
        this.f4140c.set(false);
    }
}
