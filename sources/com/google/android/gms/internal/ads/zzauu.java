package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzauu {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzazh zzf;
    private final zzazh zzg;
    private int zzh;
    private int zzi;

    public zzauu(zzazh zzazh, zzazh zzazh2, boolean z) {
        this.zzg = zzazh;
        this.zzf = zzazh2;
        this.zze = z;
        zzazh2.zzv(12);
        this.zza = zzazh2.zzi();
        zzazh.zzv(12);
        this.zzi = zzazh.zzi();
        zzayz.zzf(zzazh.zze() != 1 ? false : true, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        long j;
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        if (this.zze) {
            j = this.zzf.zzn();
        } else {
            j = this.zzf.zzm();
        }
        this.zzd = j;
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzi();
            this.zzg.zzw(4);
            int i2 = -1;
            int i3 = this.zzi - 1;
            this.zzi = i3;
            if (i3 > 0) {
                i2 = -1 + this.zzg.zzi();
            }
            this.zzh = i2;
        }
        return true;
    }
}
