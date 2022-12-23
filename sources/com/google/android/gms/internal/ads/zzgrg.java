package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgrg implements zzgrh {
    private static final Object zza = new Object();
    private volatile zzgrh zzb;
    private volatile Object zzc = zza;

    private zzgrg(zzgrh zzgrh) {
        this.zzb = zzgrh;
    }

    public static zzgrh zza(zzgrh zzgrh) {
        if ((zzgrh instanceof zzgrg) || (zzgrh instanceof zzgqt)) {
            return zzgrh;
        }
        if (zzgrh != null) {
            return new zzgrg(zzgrh);
        }
        throw null;
    }

    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzgrh zzgrh = this.zzb;
        if (zzgrh == null) {
            return this.zzc;
        }
        Object zzb2 = zzgrh.zzb();
        this.zzc = zzb2;
        this.zzb = null;
        return zzb2;
    }
}
