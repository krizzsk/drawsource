package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfyh extends zzgas {
    zzfyh() {
        super(zzgdi.class, new zzfyf(zzfwf.class));
    }

    public final zzgar zza() {
        return new zzfyg(this, zzgdl.class);
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgdi.zze(zzgji, zzgkc.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgdi zzgdi = (zzgdi) zzgma;
        zzgim.zzb(zzgdi.zza(), 0);
        if (zzgdi.zzf().zzd() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    public final int zzf() {
        return 3;
    }
}
