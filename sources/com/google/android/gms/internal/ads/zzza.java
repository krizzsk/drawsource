package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzza {
    public static int zza(zzdy zzdy, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzdy.zzk() + 1;
            case 7:
                return zzdy.zzo() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzys zzys, zzze zzze) throws IOException {
        zzys.zzj();
        zzyl zzyl = (zzyl) zzys;
        boolean z = true;
        zzyl.zzl(1, false);
        byte[] bArr = new byte[1];
        zzyl.zzm(bArr, 0, 1, false);
        byte b = bArr[0] & 1;
        zzyl.zzl(2, false);
        int i = 1 != b ? 6 : 7;
        zzdy zzdy = new zzdy(i);
        zzdy.zzE(zzyv.zza(zzys, zzdy.zzH(), 0, i));
        zzys.zzj();
        zzyz zzyz = new zzyz();
        if (1 != b) {
            z = false;
        }
        if (zzd(zzdy, zzze, z, zzyz)) {
            return zzyz.zza;
        }
        throw zzbp.zza((String) null, (Throwable) null);
    }

    public static boolean zzc(zzdy zzdy, zzze zzze, int i, zzyz zzyz) {
        int zza;
        zzdy zzdy2 = zzdy;
        zzze zzze2 = zzze;
        int zzc = zzdy.zzc();
        long zzs = zzdy.zzs();
        long j = zzs >>> 16;
        if (j != ((long) i)) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((zzs >> 12) & 15);
        int i3 = (int) ((zzs >> 8) & 15);
        int i4 = (int) (15 & (zzs >> 4));
        int i5 = (int) ((zzs >> 1) & 7);
        long j2 = zzs & 1;
        if (i4 <= 7) {
            if (i4 != zzze2.zzg - 1) {
                return false;
            }
        } else if (i4 > 10 || zzze2.zzg != 2) {
            return false;
        }
        if ((i5 != 0 && i5 != zzze2.zzi) || j2 == 1 || !zzd(zzdy2, zzze2, z, zzyz) || (zza = zza(zzdy2, i2)) == -1 || zza > zzze2.zzb) {
            return false;
        }
        int i6 = zzze2.zze;
        if (i3 != 0) {
            if (i3 <= 11) {
                if (i3 != zzze2.zzf) {
                    return false;
                }
            } else if (i3 == 12) {
                if (zzdy.zzk() * 1000 != i6) {
                    return false;
                }
            } else if (i3 > 14) {
                return false;
            } else {
                int zzo = zzdy.zzo();
                if (i3 == 14) {
                    zzo *= 10;
                }
                if (zzo != i6) {
                    return false;
                }
            }
        }
        if (zzdy.zzk() == zzeg.zzh(zzdy.zzH(), zzc, zzdy.zzc() - 1, 0)) {
            return true;
        }
        return false;
    }

    private static boolean zzd(zzdy zzdy, zzze zzze, boolean z, zzyz zzyz) {
        try {
            long zzu = zzdy.zzu();
            if (!z) {
                zzu *= (long) zzze.zzb;
            }
            zzyz.zza = zzu;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
