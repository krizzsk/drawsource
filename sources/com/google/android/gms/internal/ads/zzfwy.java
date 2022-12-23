package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfwy {
    @Deprecated
    public static final zzfwt zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgfw zzg = zzgfw.zzg(bArr, zzgkc.zza());
            for (zzgfv zzgfv : zzg.zzh()) {
                if (zzgfv.zzc().zzi() == 2 || zzgfv.zzc().zzi() == 3 || zzgfv.zzc().zzi() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzfwt.zza(zzg);
        } catch (zzglc unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
