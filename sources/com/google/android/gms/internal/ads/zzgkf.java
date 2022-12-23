package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgkf {
    private static final zzgkd zza = new zzgke();
    private static final zzgkd zzb;

    static {
        zzgkd zzgkd;
        try {
            zzgkd = (zzgkd) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgkd = null;
        }
        zzb = zzgkd;
    }

    static zzgkd zza() {
        zzgkd zzgkd = zzb;
        if (zzgkd != null) {
            return zzgkd;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzgkd zzb() {
        return zza;
    }
}
