package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfyn extends zzgar {
    final /* synthetic */ zzfyo zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfyn(zzfyo zzfyo, Class cls) {
        super(cls);
        this.zza = zzfyo;
    }

    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgma) throws GeneralSecurityException {
        zzggj zzc = zzggk.zzc();
        zzc.zza((zzggn) zzgma);
        zzc.zzb(0);
        return (zzggk) zzc.zzal();
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzggn.zze(zzgji, zzgkc.zza());
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzggn zzggn = (zzggn) zzgma;
        if (zzggn.zzf().isEmpty() || !zzggn.zzg()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
