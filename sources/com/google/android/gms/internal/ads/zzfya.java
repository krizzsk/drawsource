package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfya extends zzgar {
    final /* synthetic */ zzfyb zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfya(zzfyb zzfyb, Class cls) {
        super(cls);
        this.zza = zzfyb;
    }

    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgma) throws GeneralSecurityException {
        zzgcp zzc = zzgcq.zzc();
        zzc.zza(zzgji.zzv(zzgik.zza(((zzgct) zzgma).zza())));
        zzc.zzb(0);
        return (zzgcq) zzc.zzal();
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgct.zze(zzgji, zzgkc.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzfyb.zzg(16, 1));
        hashMap.put("AES128_GCM_RAW", zzfyb.zzg(16, 3));
        hashMap.put("AES256_GCM", zzfyb.zzg(32, 1));
        hashMap.put("AES256_GCM_RAW", zzfyb.zzg(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgim.zza(((zzgct) zzgma).zza());
    }
}
