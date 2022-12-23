package com.fyber.inneractive.sdk.util;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: com.fyber.inneractive.sdk.util.x */
public class C5329x implements LocationListener {

    /* renamed from: a */
    public final /* synthetic */ C5332z f14068a;

    public C5329x(C5332z zVar) {
        this.f14068a = zVar;
    }

    public void onLocationChanged(Location location) {
        Runnable runnable;
        if (location != null) {
            long abs = Math.abs(System.currentTimeMillis() - location.getTime());
            this.f14068a.getClass();
            IAlog.m16446a("%sgps location changed: %s tss = %d tssM = %d", "Location Manager: ", location, Long.valueOf(abs), Long.valueOf(abs / 60000));
            this.f14068a.getClass();
            IAlog.m16446a("%sgps location sampling took: %d msec", "Location Manager: ", Long.valueOf(System.currentTimeMillis() - this.f14068a.f14076g));
            C5332z zVar = this.f14068a;
            zVar.mo26420a(zVar.f14075f);
            C5332z zVar2 = this.f14068a;
            zVar2.f14075f = null;
            if (zVar2.f14074e == null && (runnable = zVar2.f14073d) != null) {
                C5299n.f14024b.removeCallbacks(runnable);
            }
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        this.f14068a.getClass();
        IAlog.m16446a("%sgps location listener - onStatusChanged: %dextras = %s", "Location Manager: ", Integer.valueOf(i), bundle);
    }
}
