package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfyb extends zzgas {
    zzfyb() {
        super(zzgcq.class, new zzfxz(zzfwf.class));
    }

    static /* bridge */ /* synthetic */ zzgaq zzg(int i, int i2) {
        zzgcs zzc = zzgct.zzc();
        zzc.zza(i);
        return new zzgaq((zzgct) zzc.zzal(), i2);
    }

    public final zzgar zza() {
        return new zzfya(this, zzgct.class);
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgcq.zze(zzgji, zzgkc.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgcq zzgcq = (zzgcq) zzgma;
        zzgim.zzb(zzgcq.zza(), 0);
        zzgim.zza(zzgcq.zzf().zzd());
    }

    public final int zze() {
        return 2;
    }

    public final int zzf() {
        return 3;
    }
}
