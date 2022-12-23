package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfzm extends zzgat {
    zzfzm(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object zza(zzgma zzgma) throws GeneralSecurityException {
        zzgdz zzgdz = (zzgdz) zzgma;
        zzgdw zzc = zzgdz.zzf().zzc();
        zzgef zzf = zzc.zzf();
        int zzc2 = zzfzx.zzc(zzf.zzg());
        byte[] zzE = zzgdz.zzg().zzE();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, zzE), zzghq.zze(zzc2));
        return new zzghl((ECPrivateKey) ((KeyFactory) zzghs.zzg.zza("EC")).generatePrivate(eCPrivateKeySpec), zzf.zze().zzE(), zzfzx.zzb(zzf.zzh()), zzfzx.zzd(zzc.zzi()), new zzfzy(zzc.zza().zze()));
    }
}
