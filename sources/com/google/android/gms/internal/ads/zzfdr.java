package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfdr {
    private final zzfdq zza = new zzfdq();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    zzfdr() {
    }

    public final zzfdq zza() {
        zzfdq zza2 = this.zza.clone();
        zzfdq zzfdq = this.zza;
        zzfdq.zza = false;
        zzfdq.zzb = false;
        return zza2;
    }

    public final String zzb() {
        return "\n\tPool does not exist: " + this.zzd + "\n\tNew pools created: " + this.zzb + "\n\tPools removed: " + this.zzc + "\n\tEntries added: " + this.zzf + "\n\tNo entries retrieved: " + this.zze + "\n";
    }

    public final void zzc() {
        this.zzf++;
    }

    public final void zzd() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zze() {
        this.zze++;
    }

    public final void zzf() {
        this.zzd++;
    }

    public final void zzg() {
        this.zzc++;
        this.zza.zzb = true;
    }
}
