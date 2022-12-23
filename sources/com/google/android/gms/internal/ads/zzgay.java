package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgay extends zzgas {
    zzgay() {
        super(zzgbj.class, new zzgaw(zzfwx.class));
    }

    /* access modifiers changed from: private */
    public static void zzm(zzgbp zzgbp) throws GeneralSecurityException {
        if (zzgbp.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (zzgbp.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    public static void zzn(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public final zzgar zza() {
        return new zzgax(this, zzgbm.class);
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgbj.zze(zzgji, zzgkc.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgbj zzgbj = (zzgbj) zzgma;
        zzgim.zzb(zzgbj.zza(), 0);
        zzn(zzgbj.zzg().zzd());
        zzm(zzgbj.zzf());
    }

    public final int zzf() {
        return 3;
    }
}
