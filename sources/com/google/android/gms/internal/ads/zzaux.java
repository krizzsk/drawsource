package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzaux implements zzauv {
    private final int zza = this.zzc.zzi();
    private final int zzb = this.zzc.zzi();
    private final zzazh zzc;

    public zzaux(zzaus zzaus) {
        zzazh zzazh = zzaus.zza;
        this.zzc = zzazh;
        zzazh.zzv(12);
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        int i = this.zza;
        return i == 0 ? this.zzc.zzi() : i;
    }

    public final boolean zzc() {
        return this.zza != 0;
    }
}
