package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfxr extends zzgar {
    final /* synthetic */ zzfxs zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfxr(zzfxs zzfxs, Class cls) {
        super(cls);
        this.zza = zzfxs;
    }

    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgma) throws GeneralSecurityException {
        zzgbv zzgbv = (zzgbv) zzgma;
        new zzfxv();
        zzgby zzf = zzfxu.zzf(zzgbv.zze());
        zzgma zza2 = new zzgbb().zza().zza(zzgbv.zzf());
        zzgbr zzc = zzgbs.zzc();
        zzc.zza(zzf);
        zzc.zzb((zzgem) zza2);
        zzc.zzc(0);
        return (zzgbs) zzc.zzal();
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgbv.zzd(zzgji, zzgkc.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzfxs.zzg(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzfxs.zzg(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzfxs.zzg(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzfxs.zzg(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgbv zzgbv = (zzgbv) zzgma;
        ((zzfxu) new zzfxv().zza()).zzd(zzgbv.zze());
        new zzgbb().zza().zzd(zzgbv.zzf());
        zzgim.zza(zzgbv.zze().zza());
    }
}
