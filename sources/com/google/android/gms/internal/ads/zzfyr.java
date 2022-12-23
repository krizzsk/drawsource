package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfyr extends zzgas {
    zzfyr() {
        super(zzggv.class, new zzfyp(zzfwf.class));
    }

    public final zzgar zza() {
        return new zzfyq(this, zzggy.class);
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzggv.zze(zzgji, zzgkc.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzggv zzggv = (zzggv) zzgma;
        zzgim.zzb(zzggv.zza(), 0);
        if (zzggv.zzf().zzd() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    public final int zzf() {
        return 3;
    }
}
