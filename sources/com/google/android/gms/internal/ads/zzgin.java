package com.google.android.gms.internal.ads;

import com.google.common.primitives.SignedBytes;
import java.security.InvalidKeyException;
import java.util.Arrays;
import okio.Utf8;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgin {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr3, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            byte b = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) b;
            copyOf[31] = (byte) (b | SignedBytes.MAX_POWER_OF_TWO);
            int i = zzghj.zzb;
            if (bArr4.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr4, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                int i2 = 0;
                while (i2 < 7) {
                    if (!zzghh.zzb(zzghj.zza[i2], copyOf2)) {
                        i2++;
                    } else {
                        throw new InvalidKeyException("Banned public key: ".concat(zzgic.zza(zzghj.zza[i2])));
                    }
                }
                long[] zzk = zzgib.zzk(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                int i3 = 10;
                System.arraycopy(zzk, 0, jArr2, 0, 10);
                int i4 = 0;
                int i5 = 32;
                while (i4 < i5) {
                    byte b2 = copyOf[(32 - i4) - 1] & 255;
                    int i6 = 0;
                    while (i6 < 8) {
                        int i7 = (b2 >> (7 - i6)) & 1;
                        zzghj.zza(jArr4, jArr2, i7);
                        zzghj.zza(jArr5, jArr3, i7);
                        byte[] bArr5 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        byte b3 = b2;
                        long[] jArr10 = jArr;
                        long[] jArr11 = new long[19];
                        int i8 = i4;
                        long[] jArr12 = new long[19];
                        int i9 = i6;
                        long[] jArr13 = new long[19];
                        int i10 = i7;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = jArr9;
                        long[] jArr16 = new long[19];
                        long[] jArr17 = new long[19];
                        zzgib.zzi(jArr4, jArr4, jArr5);
                        zzgib.zzh(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        zzgib.zzi(jArr2, jArr2, jArr3);
                        zzgib.zzh(jArr3, copyOf4, jArr3);
                        zzgib.zzb(jArr13, jArr2, jArr5);
                        zzgib.zzb(jArr14, jArr4, jArr3);
                        zzgib.zze(jArr13);
                        zzgib.zzd(jArr13);
                        zzgib.zze(jArr14);
                        zzgib.zzd(jArr14);
                        long[] jArr18 = jArr2;
                        System.arraycopy(jArr13, 0, copyOf4, 0, 10);
                        zzgib.zzi(jArr13, jArr13, jArr14);
                        zzgib.zzh(jArr14, copyOf4, jArr14);
                        zzgib.zzg(jArr17, jArr13);
                        zzgib.zzg(jArr16, jArr14);
                        zzgib.zzb(jArr14, jArr16, zzk);
                        zzgib.zze(jArr14);
                        zzgib.zzd(jArr14);
                        System.arraycopy(jArr17, 0, jArr6, 0, 10);
                        System.arraycopy(jArr14, 0, jArr7, 0, 10);
                        zzgib.zzg(jArr11, jArr4);
                        zzgib.zzg(jArr12, jArr5);
                        zzgib.zzb(jArr8, jArr11, jArr12);
                        zzgib.zze(jArr8);
                        zzgib.zzd(jArr8);
                        zzgib.zzh(jArr12, jArr11, jArr12);
                        long[] jArr19 = new long[19];
                        Arrays.fill(jArr19, 10, 18, 0);
                        zzgib.zzf(jArr19, jArr12, 121665);
                        zzgib.zzd(jArr19);
                        zzgib.zzi(jArr19, jArr19, jArr11);
                        long[] jArr20 = jArr15;
                        zzgib.zzb(jArr20, jArr12, jArr19);
                        zzgib.zze(jArr20);
                        zzgib.zzd(jArr20);
                        int i11 = i10;
                        zzghj.zza(jArr8, jArr6, i11);
                        zzghj.zza(jArr20, jArr7, i11);
                        i6 = i9 + 1;
                        byte[] bArr6 = bArr2;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        b2 = b3;
                        jArr = jArr10;
                        i4 = i8;
                        jArr6 = jArr18;
                        jArr5 = jArr20;
                        copyOf = bArr5;
                        long[] jArr21 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr21;
                        long[] jArr22 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr22;
                    }
                    byte[] bArr7 = copyOf;
                    long[] jArr23 = jArr9;
                    long[] jArr24 = jArr;
                    long[] jArr25 = jArr2;
                    i4++;
                    byte[] bArr8 = bArr2;
                    copyOf = bArr7;
                    i5 = 32;
                    i3 = 10;
                }
                long[] jArr26 = jArr;
                int i12 = i3;
                long[] jArr27 = new long[i12];
                long[] jArr28 = new long[i12];
                long[] jArr29 = new long[i12];
                long[] jArr30 = new long[i12];
                long[] jArr31 = new long[i12];
                long[] jArr32 = new long[i12];
                long[] jArr33 = new long[i12];
                long[] jArr34 = new long[i12];
                long[] jArr35 = new long[i12];
                long[] jArr36 = new long[i12];
                long[] jArr37 = jArr2;
                long[] jArr38 = new long[i12];
                zzgib.zzg(jArr28, jArr5);
                zzgib.zzg(jArr38, jArr28);
                zzgib.zzg(jArr36, jArr38);
                zzgib.zza(jArr29, jArr36, jArr5);
                zzgib.zza(jArr30, jArr29, jArr28);
                zzgib.zzg(jArr36, jArr30);
                zzgib.zza(jArr31, jArr36, jArr29);
                zzgib.zzg(jArr36, jArr31);
                zzgib.zzg(jArr38, jArr36);
                zzgib.zzg(jArr36, jArr38);
                zzgib.zzg(jArr38, jArr36);
                zzgib.zzg(jArr36, jArr38);
                zzgib.zza(jArr32, jArr36, jArr31);
                zzgib.zzg(jArr36, jArr32);
                zzgib.zzg(jArr38, jArr36);
                for (int i13 = 2; i13 < 10; i13 += 2) {
                    zzgib.zzg(jArr36, jArr38);
                    zzgib.zzg(jArr38, jArr36);
                }
                zzgib.zza(jArr33, jArr38, jArr32);
                zzgib.zzg(jArr36, jArr33);
                zzgib.zzg(jArr38, jArr36);
                for (int i14 = 2; i14 < 20; i14 += 2) {
                    zzgib.zzg(jArr36, jArr38);
                    zzgib.zzg(jArr38, jArr36);
                }
                zzgib.zza(jArr36, jArr38, jArr33);
                zzgib.zzg(jArr38, jArr36);
                zzgib.zzg(jArr36, jArr38);
                for (int i15 = 2; i15 < 10; i15 += 2) {
                    zzgib.zzg(jArr38, jArr36);
                    zzgib.zzg(jArr36, jArr38);
                }
                zzgib.zza(jArr34, jArr36, jArr32);
                zzgib.zzg(jArr36, jArr34);
                zzgib.zzg(jArr38, jArr36);
                for (int i16 = 2; i16 < 50; i16 += 2) {
                    zzgib.zzg(jArr36, jArr38);
                    zzgib.zzg(jArr38, jArr36);
                }
                zzgib.zza(jArr35, jArr38, jArr34);
                zzgib.zzg(jArr38, jArr35);
                zzgib.zzg(jArr36, jArr38);
                for (int i17 = 2; i17 < 100; i17 += 2) {
                    zzgib.zzg(jArr38, jArr36);
                    zzgib.zzg(jArr36, jArr38);
                }
                zzgib.zza(jArr38, jArr36, jArr35);
                zzgib.zzg(jArr36, jArr38);
                zzgib.zzg(jArr38, jArr36);
                for (int i18 = 2; i18 < 50; i18 += 2) {
                    zzgib.zzg(jArr36, jArr38);
                    zzgib.zzg(jArr38, jArr36);
                }
                zzgib.zza(jArr36, jArr38, jArr34);
                zzgib.zzg(jArr38, jArr36);
                zzgib.zzg(jArr36, jArr38);
                zzgib.zzg(jArr38, jArr36);
                zzgib.zzg(jArr36, jArr38);
                zzgib.zzg(jArr38, jArr36);
                zzgib.zza(jArr27, jArr38, jArr30);
                long[] jArr39 = jArr26;
                zzgib.zza(jArr39, jArr4, jArr27);
                long[] jArr40 = new long[10];
                long[] jArr41 = new long[10];
                long[] jArr42 = new long[11];
                long[] jArr43 = new long[11];
                long[] jArr44 = new long[11];
                zzgib.zza(jArr40, zzk, jArr39);
                zzgib.zzi(jArr41, zzk, jArr39);
                long[] jArr45 = new long[10];
                jArr45[0] = 486662;
                zzgib.zzi(jArr43, jArr41, jArr45);
                zzgib.zza(jArr43, jArr43, jArr3);
                long[] jArr46 = jArr37;
                zzgib.zzi(jArr43, jArr43, jArr46);
                zzgib.zza(jArr43, jArr43, jArr40);
                zzgib.zza(jArr43, jArr43, jArr46);
                zzgib.zzf(jArr42, jArr43, 4);
                zzgib.zzd(jArr42);
                zzgib.zza(jArr43, jArr40, jArr3);
                zzgib.zzh(jArr43, jArr43, jArr3);
                zzgib.zza(jArr44, jArr41, jArr46);
                zzgib.zzi(jArr43, jArr43, jArr44);
                zzgib.zzg(jArr43, jArr43);
                if (zzghh.zzb(zzgib.zzj(jArr42), zzgib.zzj(jArr43))) {
                    return zzgib.zzj(jArr39);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zzgic.zza(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] zzb() {
        byte[] zza = zzgik.zza(32);
        zza[0] = (byte) (zza[0] | 7);
        byte b = zza[31] & Utf8.REPLACEMENT_BYTE;
        zza[31] = (byte) b;
        zza[31] = (byte) (b | 128);
        return zza;
    }

    public static byte[] zzc(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return zza(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
