package com.applovin.impl.sdk;

import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.C2049g;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.u */
public class C2038u {

    /* renamed from: a */
    private final C1969m f3974a;

    /* renamed from: b */
    private final LocationManager f3975b;

    /* renamed from: c */
    private C2037t f3976c;

    C2038u(C1969m mVar) {
        this.f3974a = mVar;
        this.f3975b = (LocationManager) mVar.mo14520L().getSystemService(FirebaseAnalytics.Param.LOCATION);
    }

    /* renamed from: a */
    private Location m4907a(String str, String str2) {
        C2102v A;
        StringBuilder sb;
        String str3;
        if (!C2049g.m4939a(str2, this.f3974a.mo14520L())) {
            return null;
        }
        try {
            return this.f3975b.getLastKnownLocation(str);
        } catch (SecurityException e) {
            th = e;
            if (C2102v.m5104a()) {
                A = this.f3974a.mo14509A();
                sb = new StringBuilder();
                sb.append("Failed to retrieve location from ");
                sb.append(str);
                str3 = ": access denied.";
                sb.append(str3);
                A.mo15013b("LocationManager", sb.toString(), th);
            }
            return null;
        } catch (IllegalArgumentException e2) {
            th = e2;
            if (C2102v.m5104a()) {
                A = this.f3974a.mo14509A();
                sb = new StringBuilder();
                sb.append("Failed to retrieve location from ");
                sb.append(str);
                str3 = ": device does not support this location provider.";
                sb.append(str3);
                A.mo15013b("LocationManager", sb.toString(), th);
            }
            return null;
        } catch (NullPointerException e3) {
            th = e3;
            if (C2102v.m5104a()) {
                A = this.f3974a.mo14509A();
                sb = new StringBuilder();
                sb.append("Failed to retrieve location from ");
                sb.append(str);
                str3 = ": location provider is not available.";
                sb.append(str3);
                A.mo15013b("LocationManager", sb.toString(), th);
            }
            return null;
        } catch (Throwable th) {
            th = th;
            if (C2102v.m5104a()) {
                A = this.f3974a.mo14509A();
                sb = new StringBuilder();
                sb.append("Failed to retrieve location from ");
                sb.append(str);
                str3 = ".";
                sb.append(str3);
                A.mo15013b("LocationManager", sb.toString(), th);
            }
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo14877a() {
        return C2049g.m4939a("android.permission.ACCESS_COARSE_LOCATION", this.f3974a.mo14520L());
    }

    /* renamed from: b */
    public boolean mo14878b() {
        return C2049g.m4946h() ? this.f3975b.isLocationEnabled() : !C2049g.m4941c() || Settings.Secure.getInt(this.f3974a.mo14520L().getContentResolver(), "location_mode", 0) != 0;
    }

    /* renamed from: c */
    public C2037t mo14879c() {
        if (!this.f3974a.mo14586p().isLocationCollectionEnabled() || !((Boolean) this.f3974a.mo14534a(C1867b.f3279dW)).booleanValue()) {
            return null;
        }
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f3974a.mo14534a(C1867b.f3280dX)).longValue());
        if (this.f3976c != null && System.currentTimeMillis() - this.f3976c.mo14876c() < millis) {
            return this.f3976c;
        }
        Location a = m4907a("gps", "android.permission.ACCESS_FINE_LOCATION");
        if (a == null) {
            a = m4907a("network", "android.permission.ACCESS_COARSE_LOCATION");
        }
        if (a != null) {
            this.f3976c = new C2037t(a.getLatitude(), a.getLongitude(), System.currentTimeMillis());
        }
        return this.f3976c;
    }
}
