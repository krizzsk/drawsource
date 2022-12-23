package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfzh extends zzgar {
    final /* synthetic */ zzfzi zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfzh(zzfzi zzfzi, Class cls) {
        super(cls);
        this.zza = zzfzi;
    }

    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgma) throws GeneralSecurityException {
        zzgdb zzc = zzgdc.zzc();
        zzc.zza(zzgji.zzv(zzgik.zza(((zzgdf) zzgma).zza())));
        zzc.zzb(0);
        return (zzgdc) zzc.zzal();
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgdf.zze(zzgji, zzgkc.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzgde zzc = zzgdf.zzc();
        zzc.zza(64);
        hashMap.put("AES256_SIV", new zzgaq((zzgdf) zzc.zzal(), 1));
        zzgde zzc2 = zzgdf.zzc();
        zzc2.zza(64);
        hashMap.put("AES256_SIV_RAW", new zzgaq((zzgdf) zzc2.zzal(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgdf zzgdf = (zzgdf) zzgma;
        if (zzgdf.zza() != 64) {
            int zza2 = zzgdf.zza();
            throw new InvalidAlgorithmParameterException("invalid key size: " + zza2 + ". Valid keys must have 64 bytes.");
        }
    }
}
