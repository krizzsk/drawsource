package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzaaj implements zzyg {
    private final zzze zza;
    private final int zzb;
    private final zzyz zzc = new zzyz();

    /* synthetic */ zzaaj(zzze zzze, int i, zzaai zzaai) {
        this.zza = zzze;
        this.zzb = i;
    }

    private final long zzc(zzys zzys) throws IOException {
        while (zzys.zze() < zzys.zzd() - 6) {
            zzze zzze = this.zza;
            int i = this.zzb;
            zzyz zzyz = this.zzc;
            long zze = zzys.zze();
            byte[] bArr = new byte[2];
            zzyl zzyl = (zzyl) zzys;
            zzyl.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzys.zzj();
                zzyl.zzl((int) (zze - zzys.zzf()), false);
            } else {
                zzdy zzdy = new zzdy(16);
                System.arraycopy(bArr, 0, zzdy.zzH(), 0, 2);
                zzdy.zzE(zzyv.zza(zzys, zzdy.zzH(), 2, 14));
                zzys.zzj();
                zzyl.zzl((int) (zze - zzys.zzf()), false);
                if (zzza.zzc(zzdy, zzze, i, zzyz)) {
                    break;
                }
            }
            zzyl.zzl(1, false);
        }
        if (zzys.zze() < zzys.zzd() - 6) {
            return this.zzc.zza;
        }
        ((zzyl) zzys).zzl((int) (zzys.zzd() - zzys.zze()), false);
        return this.zza.zzj;
    }

    public final zzyf zza(zzys zzys, long j) throws IOException {
        long zzf = zzys.zzf();
        long zzc2 = zzc(zzys);
        long zze = zzys.zze();
        ((zzyl) zzys).zzl(Math.max(6, this.zza.zzc), false);
        long zzc3 = zzc(zzys);
        long zze2 = zzys.zze();
        if (zzc2 > j || zzc3 <= j) {
            return zzc3 <= j ? zzyf.zzf(zzc3, zze2) : zzyf.zzd(zzc2, zzf);
        }
        return zzyf.zze(zze);
    }

    public final /* synthetic */ void zzb() {
    }
}
