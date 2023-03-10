package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
abstract class zzafl {
    private final zzafe zza = new zzafe();
    private zzzy zzb;
    private zzyu zzc;
    private zzafg zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private zzafi zzj = new zzafi();
    private long zzk;
    private boolean zzl;
    private boolean zzm;

    /* access modifiers changed from: protected */
    public abstract long zza(zzdy zzdy);

    /* access modifiers changed from: protected */
    public void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzafi();
            this.zzf = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1;
        this.zzg = 0;
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean zzc(zzdy zzdy, long j, zzafi zzafi) throws IOException;

    /* access modifiers changed from: package-private */
    public final int zze(zzys zzys, zzzr zzzr) throws IOException {
        zzys zzys2 = zzys;
        zzcw.zzb(this.zzb);
        int i = zzeg.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
            while (this.zza.zze(zzys2)) {
                long zzf2 = zzys.zzf();
                long j = this.zzf;
                this.zzk = zzf2 - j;
                if (zzc(this.zza.zza(), j, this.zzj)) {
                    this.zzf = zzys.zzf();
                } else {
                    zzad zzad = this.zzj.zza;
                    this.zzi = zzad.zzA;
                    if (!this.zzm) {
                        this.zzb.zzk(zzad);
                        this.zzm = true;
                    }
                    zzafg zzafg = this.zzj.zzb;
                    if (zzafg != null) {
                        this.zzd = zzafg;
                    } else if (zzys.zzd() == -1) {
                        this.zzd = new zzafk((zzafj) null);
                    } else {
                        zzaff zzb2 = this.zza.zzb();
                        this.zzd = new zzaez(this, this.zzf, zzys.zzd(), (long) (zzb2.zzd + zzb2.zze), zzb2.zzb, (zzb2.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                    return 0;
                }
            }
            this.zzh = 3;
            return -1;
        } else if (i2 == 1) {
            ((zzyl) zzys2).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        } else if (i2 != 2) {
            return -1;
        } else {
            long zzd2 = this.zzd.zzd(zzys2);
            if (zzd2 >= 0) {
                zzzr.zza = zzd2;
                return 1;
            }
            if (zzd2 < -1) {
                zzi(-(zzd2 + 2));
            }
            if (!this.zzl) {
                zzzu zze2 = this.zzd.zze();
                zzcw.zzb(zze2);
                this.zzc.zzL(zze2);
                this.zzl = true;
            }
            if (this.zzk > 0 || this.zza.zze(zzys2)) {
                this.zzk = 0;
                zzdy zza2 = this.zza.zza();
                long zza3 = zza(zza2);
                if (zza3 >= 0) {
                    long j2 = this.zzg;
                    if (j2 + zza3 >= this.zze) {
                        long zzf3 = zzf(j2);
                        zzzw.zzb(this.zzb, zza2, zza2.zzd());
                        this.zzb.zzs(zzf3, 1, zza2.zzd(), 0, (zzzx) null);
                        this.zze = -1;
                    }
                }
                this.zzg += zza3;
                return 0;
            }
            this.zzh = 3;
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    public final long zzf(long j) {
        return (j * 1000000) / ((long) this.zzi);
    }

    /* access modifiers changed from: protected */
    public final long zzg(long j) {
        return (((long) this.zzi) * j) / 1000000;
    }

    /* access modifiers changed from: package-private */
    public final void zzh(zzyu zzyu, zzzy zzzy) {
        this.zzc = zzyu;
        this.zzb = zzzy;
        zzb(true);
    }

    /* access modifiers changed from: protected */
    public void zzi(long j) {
        this.zzg = j;
    }

    /* access modifiers changed from: package-private */
    public final void zzj(long j, long j2) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
        } else if (this.zzh != 0) {
            this.zze = zzg(j2);
            zzafg zzafg = this.zzd;
            int i = zzeg.zza;
            zzafg.zzg(this.zze);
            this.zzh = 2;
        }
    }
}
