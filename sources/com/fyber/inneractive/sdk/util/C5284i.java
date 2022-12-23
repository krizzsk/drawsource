package com.fyber.inneractive.sdk.util;

/* renamed from: com.fyber.inneractive.sdk.util.i */
public class C5284i {

    /* renamed from: a */
    public static boolean f14001a = false;

    /* renamed from: b */
    public static Boolean f14002b;

    /* renamed from: com.fyber.inneractive.sdk.util.i$a */
    public interface C5285a {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (com.google.android.gms.common.GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(r3) == 0) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m16485a(android.content.Context r3, com.fyber.inneractive.sdk.util.C5284i.C5285a r4) {
        /*
            java.lang.Boolean r0 = f14002b
            if (r0 != 0) goto L_0x0037
            r0 = 1
            java.lang.String r1 = "com.google.android.gms.common.GoogleApiAvailability"
            java.lang.Class.forName(r1)     // Catch:{ all -> 0x0011 }
            java.lang.String r1 = "com.google.android.gms.location.LocationServices"
            java.lang.Class.forName(r1)     // Catch:{ all -> 0x0011 }
            f14001a = r0     // Catch:{ all -> 0x0011 }
        L_0x0011:
            boolean r1 = f14001a
            if (r1 == 0) goto L_0x0033
            r1 = 0
            com.google.android.gms.common.GoogleApiAvailability r2 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch:{ all -> 0x0021 }
            int r2 = r2.isGooglePlayServicesAvailable(r3)     // Catch:{ all -> 0x0021 }
            if (r2 != 0) goto L_0x002b
            goto L_0x002c
        L_0x0021:
            r0 = move-exception
            java.lang.String r0 = com.fyber.inneractive.sdk.util.C5312s.m16534a((java.lang.Throwable) r0)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.m16449d(r0, r2)
        L_0x002b:
            r0 = r1
        L_0x002c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            f14002b = r0
            goto L_0x0037
        L_0x0033:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            f14002b = r0
        L_0x0037:
            java.lang.Boolean r0 = f14002b
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = com.fyber.inneractive.sdk.util.C5292l.m16510b((java.lang.String) r0)
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.fyber.inneractive.sdk.util.C5292l.m16510b((java.lang.String) r0)
            if (r0 == 0) goto L_0x005f
        L_0x004f:
            com.google.android.gms.location.FusedLocationProviderClient r3 = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(r3)     // Catch:{ all -> 0x005f }
            com.google.android.gms.tasks.Task r3 = r3.getLastLocation()     // Catch:{ all -> 0x005f }
            com.fyber.inneractive.sdk.util.h r0 = new com.fyber.inneractive.sdk.util.h     // Catch:{ all -> 0x005f }
            r0.<init>(r4)     // Catch:{ all -> 0x005f }
            r3.addOnSuccessListener(r0)     // Catch:{ all -> 0x005f }
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C5284i.m16485a(android.content.Context, com.fyber.inneractive.sdk.util.i$a):void");
    }
}
