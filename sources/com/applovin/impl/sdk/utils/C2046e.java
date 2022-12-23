package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1969m;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.utils.e */
public class C2046e implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private static final Set<C2046e> f3990a = new HashSet();

    /* renamed from: b */
    private final C2092o f3991b;

    /* renamed from: c */
    private final C1969m f3992c;

    private C2046e(long j, C1969m mVar, final Runnable runnable) {
        this.f3991b = C2092o.m5058a(j, mVar, new Runnable() {
            public void run() {
                C2046e.this.mo14894a();
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.f3992c = mVar;
        f3990a.add(this);
        mVar.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        mVar.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: a */
    public static C2046e m4933a(long j, C1969m mVar, Runnable runnable) {
        return new C2046e(j, mVar, runnable);
    }

    /* renamed from: a */
    public void mo14894a() {
        this.f3991b.mo14976d();
        this.f3992c.mo14560aj().unregisterReceiver(this);
        f3990a.remove(this);
    }

    /* renamed from: b */
    public long mo14895b() {
        return this.f3991b.mo14973a();
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f3991b.mo14974b();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.f3991b.mo14975c();
        }
    }
}
