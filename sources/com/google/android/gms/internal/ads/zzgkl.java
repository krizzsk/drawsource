package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgkl implements zzgly {
    private static final zzgkl zza = new zzgkl();

    private zzgkl() {
    }

    public static zzgkl zza() {
        return zza;
    }

    public final zzglx zzb(Class cls) {
        if (zzgkq.class.isAssignableFrom(cls)) {
            try {
                return (zzglx) zzgkq.zzaA(cls.asSubclass(zzgkq.class)).zzb(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
    }

    public final boolean zzc(Class cls) {
        return zzgkq.class.isAssignableFrom(cls);
    }
}
