package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfzi extends zzgas {
    zzfzi() {
        super(zzgdc.class, new zzfzg(zzfwl.class));
    }

    public final zzgar zza() {
        return new zzfzh(this, zzgdf.class);
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgdc.zze(zzgji, zzgkc.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgdc zzgdc = (zzgdc) zzgma;
        zzgim.zzb(zzgdc.zza(), 0);
        if (zzgdc.zzf().zzd() != 64) {
            int zzd = zzgdc.zzf().zzd();
            throw new InvalidKeyException("invalid key size: " + zzd + ". Valid keys must have 64 bytes.");
        }
    }

    public final int zzf() {
        return 3;
    }
}
