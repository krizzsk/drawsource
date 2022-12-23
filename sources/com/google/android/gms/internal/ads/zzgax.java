package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgax extends zzgar {
    zzgax(zzgay zzgay, Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgma) throws GeneralSecurityException {
        zzgbm zzgbm = (zzgbm) zzgma;
        zzgbi zzc = zzgbj.zzc();
        zzc.zzc(0);
        zzc.zza(zzgji.zzv(zzgik.zza(zzgbm.zza())));
        zzc.zzb(zzgbm.zzf());
        return (zzgbj) zzc.zzal();
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgbm.zze(zzgji, zzgkc.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzgbl zzc = zzgbm.zzc();
        zzc.zza(32);
        zzgbo zzc2 = zzgbp.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgbp) zzc2.zzal());
        hashMap.put("AES_CMAC", new zzgaq((zzgbm) zzc.zzal(), 1));
        zzgbl zzc3 = zzgbm.zzc();
        zzc3.zza(32);
        zzgbo zzc4 = zzgbp.zzc();
        zzc4.zza(16);
        zzc3.zzb((zzgbp) zzc4.zzal());
        hashMap.put("AES256_CMAC", new zzgaq((zzgbm) zzc3.zzal(), 1));
        zzgbl zzc5 = zzgbm.zzc();
        zzc5.zza(32);
        zzgbo zzc6 = zzgbp.zzc();
        zzc6.zza(16);
        zzc5.zzb((zzgbp) zzc6.zzal());
        hashMap.put("AES256_CMAC_RAW", new zzgaq((zzgbm) zzc5.zzal(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgbm zzgbm = (zzgbm) zzgma;
        zzgay.zzm(zzgbm.zzf());
        zzgay.zzn(zzgbm.zza());
    }
}
