package com.google.android.gms.internal.ads;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgad {
    private static final byte[] zza = new byte[0];
    private final zzgac zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    private zzgad(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzgac zzgac) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzgac;
    }

    static zzgad zzc(byte[] bArr, byte[] bArr2, zzgao zzgao, zzgab zzgab, zzgac zzgac, byte[] bArr3) throws GeneralSecurityException {
        zzgab zzgab2 = zzgab;
        byte[] bArr4 = zzgan.zzc;
        if (Arrays.equals(bArr4, bArr4)) {
            byte[] zzb2 = zzgan.zzb(zzgan.zzb, zzgan.zzc, zzgac.zzb());
            byte[] zzc2 = zzghh.zzc(zzgan.zza, zzgab2.zzd(zzgan.zzg, zza, "psk_id_hash", zzb2), zzgab2.zzd(zzgan.zzg, bArr3, "info_hash", zzb2));
            zzgab zzgab3 = zzgab;
            byte[] zzd2 = zzgab2.zzd(bArr2, zza, "secret", zzb2);
            byte[] bArr5 = zzc2;
            byte[] bArr6 = zzb2;
            return new zzgad(bArr, zzgab3.zzc(zzd2, bArr5, SDKConstants.PARAM_KEY, bArr6, zzgac.zza()), zzgab3.zzc(zzd2, bArr5, "base_nonce", bArr6, 12), BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), zzgac);
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    private final synchronized byte[] zzd() throws GeneralSecurityException {
        byte[] zzd2;
        byte[] bArr = this.zze;
        byte[] byteArray = this.zzg.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            } else if (length != 13) {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            } else if (byteArray[0] == 0) {
                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
            } else {
                throw new GeneralSecurityException("integer too large");
            }
        }
        zzd2 = zzghh.zzd(bArr, byteArray);
        if (this.zzg.compareTo(this.zzc) < 0) {
            this.zzg = this.zzg.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return zzd2;
    }

    /* access modifiers changed from: package-private */
    public final byte[] zza() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zzc(this.zzd, zzd(), bArr, bArr2);
    }
}
