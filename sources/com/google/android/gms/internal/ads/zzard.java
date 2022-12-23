package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzard implements zzary, zzarz {
    private final int zza;
    private zzasa zzb;
    private int zzc;
    private int zzd;
    private zzaxl zze;
    private long zzf;
    private boolean zzg = true;
    private boolean zzh;

    public zzard(int i) {
        this.zza = i;
    }

    public final boolean zzA() {
        return this.zzg;
    }

    public final boolean zzB() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final boolean zzC() {
        return this.zzg ? this.zzh : this.zze.zze();
    }

    /* access modifiers changed from: protected */
    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final int zzd(zzaru zzaru, zzato zzato, boolean z) {
        zzaru zzaru2 = zzaru;
        zzato zzato2 = zzato;
        int zzb2 = this.zze.zzb(zzaru2, zzato2, z);
        if (zzb2 == -4) {
            if (zzato.zzf()) {
                this.zzg = true;
                return this.zzh ? -4 : -3;
            }
            zzato2.zzc += this.zzf;
        } else if (zzb2 == -5) {
            zzart zzart = zzaru2.zza;
            long j = zzart.zzw;
            if (j != Long.MAX_VALUE) {
                zzaru2.zza = new zzart(zzart.zza, zzart.zze, zzart.zzf, zzart.zzc, zzart.zzb, zzart.zzg, zzart.zzj, zzart.zzk, zzart.zzl, zzart.zzm, zzart.zzn, zzart.zzp, zzart.zzo, zzart.zzq, zzart.zzr, zzart.zzs, zzart.zzt, zzart.zzu, zzart.zzv, zzart.zzx, zzart.zzy, zzart.zzz, j + this.zzf, zzart.zzh, zzart.zzi, zzart.zzd);
                return -5;
            }
        }
        return zzb2;
    }

    public int zze() throws zzarf {
        throw null;
    }

    public final zzarz zzf() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final zzasa zzg() {
        return this.zzb;
    }

    public final zzaxl zzh() {
        return this.zze;
    }

    public zzazd zzi() {
        return null;
    }

    public final void zzj() {
        boolean z = true;
        if (this.zzd != 1) {
            z = false;
        }
        zzayz.zze(z);
        this.zzd = 0;
        this.zze = null;
        this.zzh = false;
        zzn();
    }

    public final void zzk(zzasa zzasa, zzart[] zzartArr, zzaxl zzaxl, long j, boolean z, long j2) throws zzarf {
        zzayz.zze(this.zzd == 0);
        this.zzb = zzasa;
        this.zzd = 1;
        zzo(z);
        zzt(zzartArr, zzaxl, j2);
        zzp(j, z);
    }

    public void zzl(int i, Object obj) throws zzarf {
    }

    public final void zzm() throws IOException {
        this.zze.zzc();
    }

    /* access modifiers changed from: protected */
    public void zzn() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzo(boolean z) throws zzarf {
    }

    /* access modifiers changed from: protected */
    public void zzp(long j, boolean z) throws zzarf {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzq() throws zzarf {
    }

    /* access modifiers changed from: protected */
    public void zzr() throws zzarf {
    }

    /* access modifiers changed from: protected */
    public void zzs(zzart[] zzartArr, long j) throws zzarf {
    }

    public final void zzt(zzart[] zzartArr, zzaxl zzaxl, long j) throws zzarf {
        zzayz.zze(!this.zzh);
        this.zze = zzaxl;
        this.zzg = false;
        this.zzf = j;
        zzs(zzartArr, j);
    }

    public final void zzu(long j) throws zzarf {
        this.zzh = false;
        this.zzg = false;
        zzp(j, false);
    }

    public final void zzv() {
        this.zzh = true;
    }

    public final void zzw(int i) {
        this.zzc = i;
    }

    /* access modifiers changed from: protected */
    public final void zzx(long j) {
        this.zze.zzd(j - this.zzf);
    }

    public final void zzy() throws zzarf {
        boolean z = true;
        if (this.zzd != 1) {
            z = false;
        }
        zzayz.zze(z);
        this.zzd = 2;
        zzq();
    }

    public final void zzz() throws zzarf {
        zzayz.zze(this.zzd == 2);
        this.zzd = 1;
        zzr();
    }
}
