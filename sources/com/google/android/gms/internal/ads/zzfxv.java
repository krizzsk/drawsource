package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfxv extends zzgas {
    zzfxv() {
        super(zzgby.class, new zzfxt(zzgie.class));
    }

    public static final void zzh(zzgby zzgby) throws GeneralSecurityException {
        zzgim.zzb(zzgby.zza(), 0);
        zzgim.zza(zzgby.zzh().zzd());
        zzm(zzgby.zzg());
    }

    /* access modifiers changed from: private */
    public static final void zzm(zzgce zzgce) throws GeneralSecurityException {
        if (zzgce.zza() < 12 || zzgce.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final zzgar zza() {
        return new zzfxu(this, zzgcb.class);
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgby.zzf(zzgji, zzgkc.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzh((zzgby) zzgma);
    }

    public final int zzf() {
        return 3;
    }
}
