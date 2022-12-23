package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgaz extends zzgat {
    zzgaz(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object zza(zzgma zzgma) throws GeneralSecurityException {
        zzgem zzgem = (zzgem) zzgma;
        int zzg = zzgem.zzg().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgem.zzh().zzE(), "HMAC");
        int zza = zzgem.zzg().zza();
        int i = zzg - 2;
        if (i == 1) {
            return new zzgii(new zzgih("HMACSHA1", secretKeySpec), zza);
        }
        if (i == 2) {
            return new zzgii(new zzgih("HMACSHA384", secretKeySpec), zza);
        }
        if (i == 3) {
            return new zzgii(new zzgih("HMACSHA256", secretKeySpec), zza);
        }
        if (i == 4) {
            return new zzgii(new zzgih("HMACSHA512", secretKeySpec), zza);
        }
        if (i == 5) {
            return new zzgii(new zzgih("HMACSHA224", secretKeySpec), zza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
