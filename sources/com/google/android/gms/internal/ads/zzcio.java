package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcio {
    private final zzaym zza = new zzaym(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    zzcio() {
    }

    public final void zza() {
        zze(false);
    }

    public final void zzb() {
        zze(true);
    }

    public final void zzc() {
        zze(true);
    }

    public final void zzd(zzary[] zzaryArr, zzaxq zzaxq, zzayc zzayc) {
        this.zzf = 0;
        for (int i = 0; i < 2; i++) {
            if (zzayc.zza(i) != null) {
                this.zzf += zzazo.zzf(zzaryArr[i].zzc());
            }
        }
        this.zza.zzf(this.zzf);
    }

    /* access modifiers changed from: package-private */
    public final void zze(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }

    public final synchronized void zzf(int i) {
        this.zzd = ((long) i) * 1000;
    }

    public final synchronized void zzg(int i) {
        this.zze = ((long) i) * 1000;
    }

    public final synchronized void zzh(int i) {
        this.zzc = ((long) i) * 1000;
    }

    public final synchronized void zzi(int i) {
        this.zzb = ((long) i) * 1000;
    }

    public final synchronized boolean zzj(long j) {
        boolean z;
        z = true;
        boolean z2 = j > this.zzc ? false : j < this.zzb ? true : true;
        int zza2 = this.zza.zza();
        int i = this.zzf;
        if (!z2) {
            if (!z2 || !this.zzg || zza2 >= i) {
                z = false;
            }
        }
        this.zzg = z;
        return z;
    }

    public final synchronized boolean zzk(long j, boolean z) {
        long j2;
        j2 = z ? this.zze : this.zzd;
        return j2 <= 0 || j >= j2;
    }

    public final zzaym zzl() {
        return this.zza;
    }
}
