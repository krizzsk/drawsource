package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.h */
public class C1950h extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    public static int f3632a = -1;

    /* renamed from: b */
    private final AudioManager f3633b;

    /* renamed from: c */
    private final Context f3634c;

    /* renamed from: d */
    private final C1969m f3635d;

    /* renamed from: e */
    private final Set<C1952a> f3636e = new HashSet();

    /* renamed from: f */
    private final Object f3637f = new Object();

    /* renamed from: g */
    private boolean f3638g;

    /* renamed from: h */
    private int f3639h;

    /* renamed from: com.applovin.impl.sdk.h$a */
    public interface C1952a {
        /* renamed from: a */
        void mo13014a(int i);
    }

    C1950h(C1969m mVar) {
        this.f3635d = mVar;
        Context L = mVar.mo14520L();
        this.f3634c = L;
        this.f3633b = (AudioManager) L.getSystemService("audio");
    }

    /* renamed from: a */
    public static boolean m4399a(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: b */
    private void m4400b() {
        if (C2102v.m5104a()) {
            this.f3635d.mo14509A().mo15012b("AudioSessionManager", "Observing ringer mode...");
        }
        this.f3639h = f3632a;
        this.f3634c.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f3635d.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        this.f3635d.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: b */
    private void m4401b(final int i) {
        if (!this.f3638g) {
            if (C2102v.m5104a()) {
                C2102v A = this.f3635d.mo14509A();
                A.mo15012b("AudioSessionManager", "Ringer mode is " + i);
            }
            synchronized (this.f3637f) {
                for (final C1952a next : this.f3636e) {
                    AppLovinSdkUtils.runOnUiThread(new Runnable() {
                        public void run() {
                            next.mo13014a(i);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: c */
    private void m4402c() {
        if (C2102v.m5104a()) {
            this.f3635d.mo14509A().mo15012b("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f3634c.unregisterReceiver(this);
        this.f3635d.mo14560aj().unregisterReceiver(this);
    }

    /* renamed from: a */
    public int mo14474a() {
        return this.f3633b.getRingerMode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14475a(com.applovin.impl.sdk.C1950h.C1952a r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f3637f
            monitor-enter(r0)
            java.util.Set<com.applovin.impl.sdk.h$a> r1 = r2.f3636e     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x000d:
            java.util.Set<com.applovin.impl.sdk.h$a> r1 = r2.f3636e     // Catch:{ all -> 0x0020 }
            r1.add(r3)     // Catch:{ all -> 0x0020 }
            java.util.Set<com.applovin.impl.sdk.h$a> r3 = r2.f3636e     // Catch:{ all -> 0x0020 }
            int r3 = r3.size()     // Catch:{ all -> 0x0020 }
            r1 = 1
            if (r3 != r1) goto L_0x001e
            r2.m4400b()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1950h.mo14475a(com.applovin.impl.sdk.h$a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14476b(com.applovin.impl.sdk.C1950h.C1952a r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f3637f
            monitor-enter(r0)
            java.util.Set<com.applovin.impl.sdk.h$a> r1 = r2.f3636e     // Catch:{ all -> 0x001f }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x000d:
            java.util.Set<com.applovin.impl.sdk.h$a> r1 = r2.f3636e     // Catch:{ all -> 0x001f }
            r1.remove(r3)     // Catch:{ all -> 0x001f }
            java.util.Set<com.applovin.impl.sdk.h$a> r3 = r2.f3636e     // Catch:{ all -> 0x001f }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x001d
            r2.m4402c()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1950h.mo14476b(com.applovin.impl.sdk.h$a):void");
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            m4401b(this.f3633b.getRingerMode());
        }
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f3638g = true;
            this.f3639h = this.f3633b.getRingerMode();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.f3638g = false;
            if (this.f3639h != this.f3633b.getRingerMode()) {
                this.f3639h = f3632a;
                m4401b(this.f3633b.getRingerMode());
            }
        }
    }
}
