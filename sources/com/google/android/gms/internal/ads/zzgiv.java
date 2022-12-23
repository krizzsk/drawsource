package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgiv {
    static int zza(byte[] bArr, int i, zzgiu zzgiu) throws zzglc {
        int zzj = zzj(bArr, i, zzgiu);
        int i2 = zzgiu.zza;
        if (i2 < 0) {
            throw zzglc.zzf();
        } else if (i2 > bArr.length - zzj) {
            throw zzglc.zzj();
        } else if (i2 == 0) {
            zzgiu.zzc = zzgji.zzb;
            return zzj;
        } else {
            zzgiu.zzc = zzgji.zzw(bArr, zzj, i2);
            return zzj + i2;
        }
    }

    static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
    }

    static int zzc(zzgmt zzgmt, byte[] bArr, int i, int i2, int i3, zzgiu zzgiu) throws IOException {
        zzgmd zzgmd = (zzgmd) zzgmt;
        Object zze = zzgmd.zze();
        int zzc = zzgmd.zzc(zze, bArr, i, i2, i3, zzgiu);
        zzgmd.zzf(zze);
        zzgiu.zzc = zze;
        return zzc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zzd(com.google.android.gms.internal.ads.zzgmt r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.zzgiu r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = zzk(r8, r7, r0, r10)
            int r8 = r10.zza
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.zze()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zzi(r1, r2, r3, r4, r5)
            r6.zzf(r9)
            r10.zzc = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.ads.zzglc r6 = com.google.android.gms.internal.ads.zzglc.zzj()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgiv.zzd(com.google.android.gms.internal.ads.zzgmt, byte[], int, int, com.google.android.gms.internal.ads.zzgiu):int");
    }

    static int zze(zzgmt zzgmt, int i, byte[] bArr, int i2, int i3, zzgkz zzgkz, zzgiu zzgiu) throws IOException {
        int zzd = zzd(zzgmt, bArr, i2, i3, zzgiu);
        zzgkz.add(zzgiu.zzc);
        while (zzd < i3) {
            int zzj = zzj(bArr, zzd, zzgiu);
            if (i != zzgiu.zza) {
                break;
            }
            zzd = zzd(zzgmt, bArr, zzj, i3, zzgiu);
            zzgkz.add(zzgiu.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i, zzgkz zzgkz, zzgiu zzgiu) throws IOException {
        zzgkr zzgkr = (zzgkr) zzgkz;
        int zzj = zzj(bArr, i, zzgiu);
        int i2 = zzgiu.zza + zzj;
        while (zzj < i2) {
            zzj = zzj(bArr, zzj, zzgiu);
            zzgkr.zzh(zzgiu.zza);
        }
        if (zzj == i2) {
            return zzj;
        }
        throw zzglc.zzj();
    }

    static int zzg(byte[] bArr, int i, zzgiu zzgiu) throws zzglc {
        int zzj = zzj(bArr, i, zzgiu);
        int i2 = zzgiu.zza;
        if (i2 < 0) {
            throw zzglc.zzf();
        } else if (i2 == 0) {
            zzgiu.zzc = "";
            return zzj;
        } else {
            zzgiu.zzc = new String(bArr, zzj, i2, zzgla.zzb);
            return zzj + i2;
        }
    }

    static int zzh(byte[] bArr, int i, zzgiu zzgiu) throws zzglc {
        int zzj = zzj(bArr, i, zzgiu);
        int i2 = zzgiu.zza;
        if (i2 < 0) {
            throw zzglc.zzf();
        } else if (i2 == 0) {
            zzgiu.zzc = "";
            return zzj;
        } else {
            zzgiu.zzc = zzgnz.zzh(bArr, zzj, i2);
            return zzj + i2;
        }
    }

    static int zzi(int i, byte[] bArr, int i2, int i3, zzgnl zzgnl, zzgiu zzgiu) throws zzglc {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzm = zzm(bArr, i2, zzgiu);
                zzgnl.zzh(i, Long.valueOf(zzgiu.zzb));
                return zzm;
            } else if (i4 == 1) {
                zzgnl.zzh(i, Long.valueOf(zzn(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zzj = zzj(bArr, i2, zzgiu);
                int i5 = zzgiu.zza;
                if (i5 < 0) {
                    throw zzglc.zzf();
                } else if (i5 <= bArr.length - zzj) {
                    if (i5 == 0) {
                        zzgnl.zzh(i, zzgji.zzb);
                    } else {
                        zzgnl.zzh(i, zzgji.zzw(bArr, zzj, i5));
                    }
                    return zzj + i5;
                } else {
                    throw zzglc.zzj();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                zzgnl zze = zzgnl.zze();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i2, zzgiu);
                    int i8 = zzgiu.zza;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = zzj2;
                        break;
                    }
                    i7 = i8;
                    i2 = zzi(i8, bArr, zzj2, i3, zze, zzgiu);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzglc.zzg();
                }
                zzgnl.zzh(i, zze);
                return i2;
            } else if (i4 == 5) {
                zzgnl.zzh(i, Integer.valueOf(zzb(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzglc.zzc();
            }
        } else {
            throw zzglc.zzc();
        }
    }

    static int zzj(byte[] bArr, int i, zzgiu zzgiu) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzk(b, bArr, i2, zzgiu);
        }
        zzgiu.zza = b;
        return i2;
    }

    static int zzk(int i, byte[] bArr, int i2, zzgiu zzgiu) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzgiu.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzgiu.zza = i5 | (b2 << Ascii.f18306SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << Ascii.f18306SO);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzgiu.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << Ascii.NAK);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzgiu.zza = i9 | (b4 << Ascii.f18299FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << Ascii.f18299FS);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                zzgiu.zza = i11;
                return i12;
            }
        }
    }

    static int zzl(int i, byte[] bArr, int i2, int i3, zzgkz zzgkz, zzgiu zzgiu) {
        zzgkr zzgkr = (zzgkr) zzgkz;
        int zzj = zzj(bArr, i2, zzgiu);
        zzgkr.zzh(zzgiu.zza);
        while (zzj < i3) {
            int zzj2 = zzj(bArr, zzj, zzgiu);
            if (i != zzgiu.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzgiu);
            zzgkr.zzh(zzgiu.zza);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i, zzgiu zzgiu) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zzgiu.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        zzgiu.zzb = j2;
        return i3;
    }

    static long zzn(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
