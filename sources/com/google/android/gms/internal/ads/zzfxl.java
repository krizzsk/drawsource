package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfxl {
    public static final Charset zza = Charset.forName("UTF-8");

    public static zzggb zza(zzgfw zzgfw) {
        zzgfy zza2 = zzggb.zza();
        zza2.zzb(zzgfw.zzc());
        for (zzgfv zzgfv : zzgfw.zzh()) {
            zzgfz zza3 = zzgga.zza();
            zza3.zzb(zzgfv.zzc().zzf());
            zza3.zzd(zzgfv.zzi());
            zza3.zzc(zzgfv.zzj());
            zza3.zza(zzgfv.zza());
            zza2.zza((zzgga) zza3.zzal());
        }
        return (zzggb) zza2.zzal();
    }

    public static void zzb(zzgfw zzgfw) throws GeneralSecurityException {
        int zzc = zzgfw.zzc();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgfv zzgfv : zzgfw.zzh()) {
            if (zzgfv.zzi() == 3) {
                if (!zzgfv.zzh()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(zzgfv.zza())}));
                } else if (zzgfv.zzj() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(zzgfv.zza())}));
                } else if (zzgfv.zzi() != 2) {
                    if (zzgfv.zza() == zzc) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    z2 &= zzgfv.zzc().zzi() == 5;
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(zzgfv.zza())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
