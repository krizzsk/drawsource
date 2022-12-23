package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgam extends zzgas {
    public zzgam() {
        super(zzgfg.class, new zzgal(zzfwn.class));
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgfg.zzg(zzgji, zzgkc.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgfg zzgfg = (zzgfg) zzgma;
        zzgim.zzb(zzgfg.zza(), 0);
        if (zzgfg.zzl()) {
            zzgan.zza(zzgfg.zzc());
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }

    public final int zzf() {
        return 5;
    }
}
