package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
abstract class zzva {
    public final int zza;
    public final zzck zzb;
    public final int zzc;
    public final zzad zzd;

    public zzva(int i, zzck zzck, int i2) {
        this.zza = i;
        this.zzb = zzck;
        this.zzc = i2;
        this.zzd = zzck.zzb(i2);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzva zzva);
}
