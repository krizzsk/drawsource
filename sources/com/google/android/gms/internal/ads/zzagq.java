package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzagq implements zzagz {
    private zzad zza;
    private zzee zzb;
    private zzzy zzc;

    public zzagq(String str) {
        zzab zzab = new zzab();
        zzab.zzS(str);
        this.zza = zzab.zzY();
    }

    public final void zza(zzdy zzdy) {
        zzcw.zzb(this.zzb);
        int i = zzeg.zza;
        long zzd = this.zzb.zzd();
        long zze = this.zzb.zze();
        if (zzd != -9223372036854775807L && zze != -9223372036854775807L) {
            zzad zzad = this.zza;
            if (zze != zzad.zzq) {
                zzab zzb2 = zzad.zzb();
                zzb2.zzW(zze);
                zzad zzY = zzb2.zzY();
                this.zza = zzY;
                this.zzc.zzk(zzY);
            }
            int zza2 = zzdy.zza();
            zzzw.zzb(this.zzc, zzdy, zza2);
            this.zzc.zzs(zzd, 1, zza2, 0, (zzzx) null);
        }
    }

    public final void zzb(zzee zzee, zzyu zzyu, zzahm zzahm) {
        this.zzb = zzee;
        zzahm.zzc();
        zzzy zzv = zzyu.zzv(zzahm.zza(), 5);
        this.zzc = zzv;
        zzv.zzk(this.zza);
    }
}
