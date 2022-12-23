package com.fyber.inneractive.sdk.util;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: com.fyber.inneractive.sdk.util.w */
public class C5325w implements LocationListener {

    /* renamed from: a */
    public final /* synthetic */ C5332z f14060a;

    public C5325w(C5332z zVar) {
        this.f14060a = zVar;
    }

    public void onLocationChanged(Location location) {
        Runnable runnable;
        if (location != null) {
            long abs = Math.abs(System.currentTimeMillis() - location.getTime());
            this.f14060a.getClass();
            IAlog.m16446a("%snetwork location changed: %s tss = %d tssM = %d", "Location Manager: ", location, Long.valueOf(abs), Long.valueOf(abs / 60000));
            this.f14060a.getClass();
            IAlog.m16446a("%snetwork location sampling took: %d msec", "Location Manager: ", Long.valueOf(System.currentTimeMillis() - this.f14060a.f14076g));
            C5332z zVar = this.f14060a;
            zVar.mo26420a(zVar.f14074e);
            C5332z zVar2 = this.f14060a;
            zVar2.f14074e = null;
            if (zVar2.f14075f == null && (runnable = zVar2.f14073d) != null) {
                C5299n.f14024b.removeCallbacks(runnable);
            }
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        this.f14060a.getClass();
        IAlog.m16446a("%snetwork location listener - onStatusChanged: %dextras = %s", "Location Manager: ", Integer.valueOf(i), bundle);
    }
}
