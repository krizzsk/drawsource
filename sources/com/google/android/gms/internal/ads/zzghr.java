package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzghr implements zzfwf {
    private final zzgie zza;
    private final zzfwx zzb;
    private final int zzc;

    public zzghr(zzgie zzgie, zzfwx zzfwx, int i) {
        this.zza = zzgie;
        this.zzb = zzfwx;
        this.zzc = i;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzc;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.zzc, length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.zzb.zza(copyOfRange2, zzghh.zzc(bArr2, copyOfRange, copyOf));
            return this.zza.zza(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzb2 = this.zza.zzb(bArr);
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0).array(), 8);
        return zzghh.zzc(zzb2, this.zzb.zzb(zzghh.zzc(bArr2, zzb2, copyOf)));
    }
}
