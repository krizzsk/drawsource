package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgmg {
    private static final zzgmf zza;
    private static final zzgmf zzb = new zzgmf();

    static {
        zzgmf zzgmf;
        try {
            zzgmf = (zzgmf) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgmf = null;
        }
        zza = zzgmf;
    }

    static zzgmf zza() {
        return zza;
    }

    static zzgmf zzb() {
        return zzb;
    }
}
