package com.mbridge.msdk.foundation.same.net;

import android.net.TrafficStats;
import android.os.SystemClock;

/* renamed from: com.mbridge.msdk.foundation.same.net.a */
/* compiled from: BandWideUtil */
public final class C8505a {

    /* renamed from: a */
    private static long f20847a;

    /* renamed from: b */
    private static long f20848b;

    /* renamed from: c */
    private static long f20849c;

    /* renamed from: com.mbridge.msdk.foundation.same.net.a$a */
    /* compiled from: BandWideUtil */
    private static class C8507a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C8505a f20850a = new C8505a();
    }

    private C8505a() {
    }

    /* renamed from: a */
    public static C8505a m24367a() {
        return C8507a.f20850a;
    }

    /* renamed from: b */
    public final synchronized void mo57912b() {
        if (f20847a == 0) {
            f20847a = SystemClock.elapsedRealtime();
            f20849c = TrafficStats.getTotalRxBytes();
        }
    }

    /* renamed from: c */
    public final synchronized void mo57913c() {
        if (!(f20847a == 0 || f20849c == 0)) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - f20847a;
            if (elapsedRealtime != 0) {
                try {
                    if (TrafficStats.getTotalRxBytes() != -1) {
                        long totalRxBytes = ((TrafficStats.getTotalRxBytes() - f20849c) * 1000) / elapsedRealtime;
                        if (totalRxBytes == 0) {
                            f20848b = 1;
                        } else {
                            f20848b = totalRxBytes;
                        }
                    } else {
                        f20848b = 0;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            mo57914d();
        }
    }

    /* renamed from: d */
    public final synchronized void mo57914d() {
        f20849c = 0;
        f20847a = 0;
    }

    /* renamed from: e */
    public final long mo57915e() {
        return f20848b;
    }
}
