package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzgk implements zzjt, zzju {
    private final int zza;
    private final zziz zzb = new zziz();
    private zzjv zzc;
    private int zzd;
    private zzmu zze;
    private int zzf;
    private zztq zzg;
    private zzad[] zzh;
    private long zzi;
    private long zzj = Long.MIN_VALUE;
    private boolean zzk;
    private boolean zzl;

    public zzgk(int i) {
        this.zza = i;
    }

    private final void zzP(long j, boolean z) throws zzgt {
        this.zzk = false;
        this.zzj = j;
        zzu(j, z);
    }

    public final void zzA() {
        zzcw.zzf(this.zzf == 0);
        zziz zziz = this.zzb;
        zziz.zzb = null;
        zziz.zza = null;
        zzv();
    }

    public final void zzB(long j) throws zzgt {
        zzP(j, false);
    }

    public final void zzC() {
        this.zzk = true;
    }

    public /* synthetic */ void zzD(float f, float f2) {
    }

    public final void zzE() throws zzgt {
        boolean z = true;
        if (this.zzf != 1) {
            z = false;
        }
        zzcw.zzf(z);
        this.zzf = 2;
        zzw();
    }

    public final void zzF() {
        zzcw.zzf(this.zzf == 2);
        this.zzf = 1;
        zzx();
    }

    public final boolean zzG() {
        return this.zzj == Long.MIN_VALUE;
    }

    public final boolean zzH() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public final zzad[] zzJ() {
        zzad[] zzadArr = this.zzh;
        if (zzadArr != null) {
            return zzadArr;
        }
        throw null;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzbe() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final int zzbf(zziz zziz, zzgb zzgb, int i) {
        zztq zztq = this.zzg;
        if (zztq != null) {
            int zza2 = zztq.zza(zziz, zzgb, i);
            if (zza2 == -4) {
                if (zzgb.zzg()) {
                    this.zzj = Long.MIN_VALUE;
                    return this.zzk ? -4 : -3;
                }
                long j = zzgb.zzd + this.zzi;
                zzgb.zzd = j;
                this.zzj = Math.max(this.zzj, j);
            } else if (zza2 == -5) {
                zzad zzad = zziz.zza;
                if (zzad != null) {
                    long j2 = zzad.zzq;
                    if (j2 != Long.MAX_VALUE) {
                        zzab zzb2 = zzad.zzb();
                        zzb2.zzW(j2 + this.zzi);
                        zziz.zza = zzb2.zzY();
                        return -5;
                    }
                } else {
                    throw null;
                }
            }
            return zza2;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final zzgt zzbg(Throwable th, zzad zzad, boolean z, int i) {
        int i2 = 4;
        if (zzad != null && !this.zzl) {
            this.zzl = true;
            try {
                i2 = zzO(zzad) & 7;
            } catch (zzgt unused) {
            } finally {
                this.zzl = false;
            }
        }
        return zzgt.zzb(th, zzK(), this.zzd, zzad, i2, z, i);
    }

    public int zze() throws zzgt {
        return 0;
    }

    public final long zzf() {
        return this.zzj;
    }

    /* access modifiers changed from: protected */
    public final zziz zzh() {
        zziz zziz = this.zzb;
        zziz.zzb = null;
        zziz.zza = null;
        return zziz;
    }

    public zzjb zzi() {
        return null;
    }

    public final zzju zzj() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final zzjv zzk() {
        zzjv zzjv = this.zzc;
        if (zzjv != null) {
            return zzjv;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final zzmu zzl() {
        zzmu zzmu = this.zze;
        if (zzmu != null) {
            return zzmu;
        }
        throw null;
    }

    public final zztq zzm() {
        return this.zzg;
    }

    public final void zzn() {
        boolean z = true;
        if (this.zzf != 1) {
            z = false;
        }
        zzcw.zzf(z);
        zziz zziz = this.zzb;
        zziz.zzb = null;
        zziz.zza = null;
        this.zzf = 0;
        this.zzg = null;
        this.zzh = null;
        this.zzk = false;
        zzs();
    }

    public final void zzo(zzjv zzjv, zzad[] zzadArr, zztq zztq, long j, boolean z, boolean z2, long j2, long j3) throws zzgt {
        boolean z3 = z;
        zzcw.zzf(this.zzf == 0);
        this.zzc = zzjv;
        this.zzf = 1;
        zzt(z, z2);
        zzz(zzadArr, zztq, j2, j3);
        long j4 = j;
        zzP(j, z);
    }

    public void zzp(int i, Object obj) throws zzgt {
    }

    public final void zzq(int i, zzmu zzmu) {
        this.zzd = i;
        this.zze = zzmu;
    }

    /* access modifiers changed from: protected */
    public void zzs() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzt(boolean z, boolean z2) throws zzgt {
    }

    /* access modifiers changed from: protected */
    public void zzu(long j, boolean z) throws zzgt {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzv() {
    }

    /* access modifiers changed from: protected */
    public void zzw() throws zzgt {
    }

    /* access modifiers changed from: protected */
    public void zzx() {
    }

    /* access modifiers changed from: protected */
    public void zzy(zzad[] zzadArr, long j, long j2) throws zzgt {
        throw null;
    }

    public final void zzz(zzad[] zzadArr, zztq zztq, long j, long j2) throws zzgt {
        zzcw.zzf(!this.zzk);
        this.zzg = zztq;
        if (this.zzj == Long.MIN_VALUE) {
            this.zzj = j;
        }
        this.zzh = zzadArr;
        this.zzi = j2;
        zzy(zzadArr, j, j2);
    }

    /* access modifiers changed from: protected */
    public final boolean zzI() {
        if (zzG()) {
            return this.zzk;
        }
        zztq zztq = this.zzg;
        if (zztq != null) {
            return zztq.zze();
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final int zzd(long j) {
        zztq zztq = this.zzg;
        if (zztq != null) {
            return zztq.zzb(j - this.zzi);
        }
        throw null;
    }

    public final void zzr() throws IOException {
        zztq zztq = this.zzg;
        if (zztq != null) {
            zztq.zzd();
            return;
        }
        throw null;
    }
}
