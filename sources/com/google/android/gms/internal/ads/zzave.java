package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzave {
    public final zzavn zza = new zzavn();
    public final zzauf zzb;
    public zzavl zzc;
    public zzavb zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public zzaue zzh;
    public zzavm zzi;

    public zzave(zzauf zzauf) {
        this.zzb = zzauf;
    }

    public final void zzb() {
        zzavn zzavn = this.zza;
        zzavn.zzd = 0;
        zzavn.zzr = 0;
        zzavn.zzl = false;
        zzavn.zzq = false;
        zzavn.zzn = null;
        this.zze = 0;
        this.zzg = 0;
        this.zzf = 0;
        this.zzh = null;
        this.zzi = null;
    }

    public final void zza(zzavl zzavl, zzavb zzavb) {
        if (zzavl != null) {
            this.zzc = zzavl;
            if (zzavb != null) {
                this.zzd = zzavb;
                this.zzb.zza(zzavl.zzf);
                zzb();
                return;
            }
            throw null;
        }
        throw null;
    }
}
