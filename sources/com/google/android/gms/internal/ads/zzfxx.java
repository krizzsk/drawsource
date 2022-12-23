package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfxx extends zzgar {
    final /* synthetic */ zzfxy zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfxx(zzfxy zzfxy, Class cls) {
        super(cls);
        this.zza = zzfxy;
    }

    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgma) throws GeneralSecurityException {
        zzgck zzgck = (zzgck) zzgma;
        zzgcg zzc = zzgch.zzc();
        zzc.zza(zzgji.zzv(zzgik.zza(zzgck.zza())));
        zzc.zzb(zzgck.zzf());
        zzc.zzc(0);
        return (zzgch) zzc.zzal();
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgck.zze(zzgji, zzgkc.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzfxy.zzg(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzfxy.zzg(16, 16, 3));
        hashMap.put("AES256_EAX", zzfxy.zzg(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzfxy.zzg(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgck zzgck = (zzgck) zzgma;
        zzgim.zza(zzgck.zza());
        if (zzgck.zzf().zza() != 12 && zzgck.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
