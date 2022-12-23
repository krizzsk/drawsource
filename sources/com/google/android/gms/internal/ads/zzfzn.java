package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfzn extends zzgar {
    final /* synthetic */ zzfzo zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfzn(zzfzo zzfzo, Class cls) {
        super(cls);
        this.zza = zzfzo;
    }

    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgma) throws GeneralSecurityException {
        zzgdt zzgdt = (zzgdt) zzgma;
        KeyPair zzb = zzghq.zzb(zzghq.zze(zzfzx.zzc(zzgdt.zze().zzf().zzg())));
        ECPoint w = ((ECPublicKey) zzb.getPublic()).getW();
        zzgeb zzd = zzgec.zzd();
        zzd.zzb(0);
        zzd.zza(zzgdt.zze());
        zzd.zzc(zzgji.zzv(w.getAffineX().toByteArray()));
        zzd.zzd(zzgji.zzv(w.getAffineY().toByteArray()));
        zzgdy zzc = zzgdz.zzc();
        zzc.zzc(0);
        zzc.zzb((zzgec) zzd.zzal());
        zzc.zza(zzgji.zzv(((ECPrivateKey) zzb.getPrivate()).getS().toByteArray()));
        return (zzgdz) zzc.zzal();
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgdt.zzd(zzgji, zzgkc.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzfzo.zzh(4, 5, 3, zzfws.zza("AES128_GCM"), zzfzo.zza, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzfzo.zzh(4, 5, 3, zzfws.zza("AES128_GCM"), zzfzo.zza, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzfzo.zzh(4, 5, 4, zzfws.zza("AES128_GCM"), zzfzo.zza, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzfzo.zzh(4, 5, 4, zzfws.zza("AES128_GCM"), zzfzo.zza, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzfzo.zzh(4, 5, 4, zzfws.zza("AES128_GCM"), zzfzo.zza, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzfzo.zzh(4, 5, 3, zzfws.zza("AES128_CTR_HMAC_SHA256"), zzfzo.zza, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzfzo.zzh(4, 5, 3, zzfws.zza("AES128_CTR_HMAC_SHA256"), zzfzo.zza, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzfzo.zzh(4, 5, 4, zzfws.zza("AES128_CTR_HMAC_SHA256"), zzfzo.zza, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzfzo.zzh(4, 5, 4, zzfws.zza("AES128_CTR_HMAC_SHA256"), zzfzo.zza, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzfzx.zza(((zzgdt) zzgma).zze());
    }
}
