package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzadr implements zzadq {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzadr(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzadr zza(long j, long j2, zzzk zzzk, zzdy zzdy) {
        int i;
        long j3 = j;
        zzzk zzzk2 = zzzk;
        zzdy zzdy2 = zzdy;
        zzdy2.zzG(10);
        int zze = zzdy.zze();
        if (zze <= 0) {
            return null;
        }
        int i2 = zzzk2.zzd;
        long zzw = zzeg.zzw((long) zze, ((long) (i2 >= 32000 ? 1152 : 576)) * 1000000, (long) i2);
        int zzo = zzdy.zzo();
        int zzo2 = zzdy.zzo();
        int zzo3 = zzdy.zzo();
        zzdy2.zzG(2);
        long j4 = j2 + ((long) zzzk2.zzc);
        long[] jArr = new long[zzo];
        long[] jArr2 = new long[zzo];
        int i3 = 0;
        long j5 = j2;
        while (i3 < zzo) {
            int i4 = zzo2;
            jArr[i3] = (((long) i3) * zzw) / ((long) zzo);
            long j6 = j4;
            jArr2[i3] = Math.max(j5, j6);
            if (zzo3 == 1) {
                i = zzdy.zzk();
            } else if (zzo3 == 2) {
                i = zzdy.zzo();
            } else if (zzo3 == 3) {
                i = zzdy.zzm();
            } else if (zzo3 != 4) {
                return null;
            } else {
                i = zzdy.zzn();
            }
            long j7 = (long) i;
            int i5 = i4;
            j5 += j7 * ((long) i5);
            i3++;
            jArr = jArr;
            zzo2 = i5;
            j4 = j6;
        }
        long[] jArr3 = jArr;
        if (!(j3 == -1 || j3 == j5)) {
            Log.w("VbriSeeker", "VBRI data size mismatch: " + j3 + ", " + j5);
        }
        return new zzadr(jArr3, jArr2, zzw, j5);
    }

    public final long zzb() {
        return this.zzd;
    }

    public final long zzc(long j) {
        return this.zza[zzeg.zzd(this.zzb, j, true, true)];
    }

    public final long zze() {
        return this.zzc;
    }

    public final zzzs zzg(long j) {
        int zzd2 = zzeg.zzd(this.zza, j, true, true);
        zzzv zzzv = new zzzv(this.zza[zzd2], this.zzb[zzd2]);
        if (zzzv.zzb < j) {
            long[] jArr = this.zza;
            if (zzd2 != jArr.length - 1) {
                int i = zzd2 + 1;
                return new zzzs(zzzv, new zzzv(jArr[i], this.zzb[i]));
            }
        }
        return new zzzs(zzzv, zzzv);
    }

    public final boolean zzh() {
        return true;
    }
}
