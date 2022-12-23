package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfzv implements zzfwn {
    final zzfxc zza;

    public zzfzv(zzfxc zzfxc) {
        this.zza = zzfxc;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzfxc zzfxc = this.zza;
        if (zzfxc.zzb() != null) {
            return zzghh.zzc(zzfxc.zzb().zzb(), ((zzfwn) this.zza.zzb().zza()).zza(bArr, bArr2));
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
