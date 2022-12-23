package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfyd extends zzgar {
    final /* synthetic */ zzfye zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfyd(zzfye zzfye, Class cls) {
        super(cls);
        this.zza = zzfye;
    }

    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgma) throws GeneralSecurityException {
        zzgcv zzc = zzgcw.zzc();
        zzc.zza(zzgji.zzv(zzgik.zza(((zzgcz) zzgma).zza())));
        zzc.zzb(0);
        return (zzgcw) zzc.zzal();
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgcz.zze(zzgji, zzgkc.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzfye.zzh(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzfye.zzh(16, 3));
        hashMap.put("AES256_GCM_SIV", zzfye.zzh(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzfye.zzh(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgim.zza(((zzgcz) zzgma).zza());
    }
}
