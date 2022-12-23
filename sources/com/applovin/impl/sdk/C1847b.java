package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p051c.C1866a;
import com.applovin.impl.sdk.utils.C2092o;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.b */
public class C1847b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final C1969m f3002a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1849a f3003b;

    /* renamed from: c */
    private C2092o f3004c;

    /* renamed from: d */
    private final Object f3005d = new Object();

    /* renamed from: e */
    private long f3006e;

    /* renamed from: com.applovin.impl.sdk.b$a */
    public interface C1849a {
        void onAdExpired();
    }

    public C1847b(C1969m mVar, C1849a aVar) {
        this.f3002a = mVar;
        this.f3003b = aVar;
    }

    /* renamed from: b */
    private void m4026b() {
        C2092o oVar = this.f3004c;
        if (oVar != null) {
            oVar.mo14976d();
            this.f3004c = null;
        }
    }

    /* renamed from: c */
    private void m4027c() {
        synchronized (this.f3005d) {
            m4026b();
        }
    }

    /* renamed from: d */
    private void m4028d() {
        boolean z;
        synchronized (this.f3005d) {
            long currentTimeMillis = this.f3006e - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                mo14247a();
                z = true;
            } else {
                mo14248a(currentTimeMillis);
                z = false;
            }
        }
        if (z) {
            this.f3003b.onAdExpired();
        }
    }

    /* renamed from: a */
    public void mo14247a() {
        synchronized (this.f3005d) {
            m4026b();
            this.f3002a.mo14560aj().unregisterReceiver(this);
        }
    }

    /* renamed from: a */
    public void mo14248a(long j) {
        synchronized (this.f3005d) {
            mo14247a();
            this.f3006e = System.currentTimeMillis() + j;
            this.f3002a.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
            this.f3002a.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
            if (((Boolean) this.f3002a.mo14534a(C1866a.f3051E)).booleanValue() || !this.f3002a.mo14554ad().mo15025a()) {
                this.f3004c = C2092o.m5058a(j, this.f3002a, new Runnable() {
                    public void run() {
                        C1847b.this.mo14247a();
                        C1847b.this.f3003b.onAdExpired();
                    }
                });
            }
        }
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            m4027c();
        } else if ("com.applovin.application_resumed".equals(action)) {
            m4028d();
        }
    }
}
