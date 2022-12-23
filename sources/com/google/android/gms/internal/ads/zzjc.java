package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzjc {
    public final zzry zza;
    public final Object zzb;
    public final zztq[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzjd zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzju[] zzi;
    private final zzvm zzj;
    private final zzjm zzk;
    private zzjc zzl;
    private zzty zzm = zzty.zza;
    private zzvn zzn;
    private long zzo;

    public zzjc(zzju[] zzjuArr, long j, zzvm zzvm, zzvv zzvv, zzjm zzjm, zzjd zzjd, zzvn zzvn, byte[] bArr) {
        zzjd zzjd2 = zzjd;
        this.zzi = zzjuArr;
        this.zzo = j;
        this.zzj = zzvm;
        this.zzk = zzjm;
        this.zzb = zzjd2.zza.zza;
        this.zzf = zzjd2;
        this.zzn = zzvn;
        this.zzc = new zztq[2];
        this.zzh = new boolean[2];
        zzsa zzsa = zzjd2.zza;
        long j2 = zzjd2.zzb;
        long j3 = zzjd2.zzd;
        zzvv zzvv2 = zzvv;
        zzry zzo2 = zzjm.zzo(zzsa, zzvv, j2);
        this.zza = j3 != -9223372036854775807L ? new zzrf(zzo2, true, 0, j3) : zzo2;
    }

    private final void zzs() {
        if (zzu()) {
            int i = 0;
            while (true) {
                zzvn zzvn = this.zzn;
                if (i < zzvn.zza) {
                    zzvn.zzb(i);
                    zzvg zzvg = this.zzn.zzc[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final void zzt() {
        if (zzu()) {
            int i = 0;
            while (true) {
                zzvn zzvn = this.zzn;
                if (i < zzvn.zza) {
                    zzvn.zzb(i);
                    zzvg zzvg = this.zzn.zzc[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzvn zzvn, long j, boolean z) {
        return zzb(zzvn, j, false, new boolean[2]);
    }

    public final long zzb(zzvn zzvn, long j, boolean z, boolean[] zArr) {
        zzvn zzvn2 = zzvn;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzvn2.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzvn.zza(this.zzn, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzju[] zzjuArr = this.zzi;
            if (i2 >= 2) {
                break;
            }
            zzjuArr[i2].zzb();
            i2++;
        }
        zzs();
        this.zzn = zzvn2;
        zzt();
        long zzf2 = this.zza.zzf(zzvn2.zzc, this.zzh, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            zzju[] zzjuArr2 = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzjuArr2[i3].zzb();
            i3++;
        }
        this.zze = false;
        int i4 = 0;
        while (true) {
            zztq[] zztqArr = this.zzc;
            if (i4 >= 2) {
                return zzf2;
            }
            if (zztqArr[i4] != null) {
                zzcw.zzf(zzvn.zzb(i4));
                this.zzi[i4].zzb();
                this.zze = true;
            } else {
                zzcw.zzf(zzvn2.zzc[i4] == null);
            }
            i4++;
        }
    }

    public final long zzc() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long zzb2 = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
        return zzb2 == Long.MIN_VALUE ? this.zzf.zze : zzb2;
    }

    public final long zzd() {
        if (!this.zzd) {
            return 0;
        }
        return this.zza.zzc();
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzjc zzg() {
        return this.zzl;
    }

    public final zzty zzh() {
        return this.zzm;
    }

    public final zzvn zzi() {
        return this.zzn;
    }

    public final zzvn zzj(float f, zzci zzci) throws zzgt {
        zzvn zzj2 = this.zzj.zzj(this.zzi, this.zzm, this.zzf.zza, zzci);
        for (zzvg zzvg : zzj2.zzc) {
        }
        return zzj2;
    }

    public final void zzk(long j) {
        zzcw.zzf(zzu());
        this.zza.zzo(j - this.zzo);
    }

    public final void zzl(float f, zzci zzci) throws zzgt {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzvn zzj2 = zzj(f, zzci);
        zzjd zzjd = this.zzf;
        long j = zzjd.zzb;
        long j2 = zzjd.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0, j2 - 1);
        }
        long zza2 = zza(zzj2, j, false);
        long j3 = this.zzo;
        zzjd zzjd2 = this.zzf;
        this.zzo = j3 + (zzjd2.zzb - zza2);
        this.zzf = zzjd2.zzb(zza2);
    }

    public final void zzm(long j) {
        zzcw.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzjm zzjm = this.zzk;
        zzry zzry = this.zza;
        try {
            if (zzry instanceof zzrf) {
                zzjm.zzh(((zzrf) zzry).zza);
            } else {
                zzjm.zzh(zzry);
            }
        } catch (RuntimeException e) {
            zzdn.zza("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(zzjc zzjc) {
        if (zzjc != this.zzl) {
            zzs();
            this.zzl = zzjc;
            zzt();
        }
    }

    public final void zzp(long j) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zzry zzry = this.zza;
        if (zzry instanceof zzrf) {
            long j = this.zzf.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zzrf) zzry).zzn(0, j);
        }
    }

    public final boolean zzr() {
        return this.zzd && (!this.zze || this.zza.zzb() == Long.MIN_VALUE);
    }
}
