package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzglw {
    private static final zzglv zza;
    private static final zzglv zzb = new zzglv();

    static {
        zzglv zzglv;
        try {
            zzglv = (zzglv) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzglv = null;
        }
        zza = zzglv;
    }

    static zzglv zza() {
        return zza;
    }

    static zzglv zzb() {
        return zzb;
    }
}
