package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfxu extends zzgar {
    final /* synthetic */ zzfxv zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfxu(zzfxv zzfxv, Class cls) {
        super(cls);
        this.zza = zzfxv;
    }

    public static final zzgby zzf(zzgcb zzgcb) throws GeneralSecurityException {
        zzgbx zzc = zzgby.zzc();
        zzc.zzb(zzgcb.zzg());
        zzc.zza(zzgji.zzv(zzgik.zza(zzgcb.zza())));
        zzc.zzc(0);
        return (zzgby) zzc.zzal();
    }

    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgma) throws GeneralSecurityException {
        return zzf((zzgcb) zzgma);
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgcb.zzf(zzgji, zzgkc.zza());
    }

    /* renamed from: zze */
    public final void zzd(zzgcb zzgcb) throws GeneralSecurityException {
        zzgim.zza(zzgcb.zza());
        zzfxv.zzm(zzgcb.zzg());
    }
}
