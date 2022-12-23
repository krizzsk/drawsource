package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfxs extends zzgas {
    zzfxs() {
        super(zzgbs.class, new zzfxq(zzfwf.class));
    }

    static /* bridge */ /* synthetic */ zzgaq zzg(int i, int i2, int i3, int i4, int i5, int i6) {
        zzgca zzc = zzgcb.zzc();
        zzgcd zzc2 = zzgce.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgce) zzc2.zzal());
        zzc.zza(i);
        zzgeo zzc3 = zzgep.zzc();
        zzger zzc4 = zzges.zzc();
        zzc4.zzb(5);
        zzc4.zza(i4);
        zzc3.zzb((zzges) zzc4.zzal());
        zzc3.zza(32);
        zzgbu zza = zzgbv.zza();
        zza.zza((zzgcb) zzc.zzal());
        zza.zzb((zzgep) zzc3.zzal());
        return new zzgaq((zzgbv) zza.zzal(), i6);
    }

    public final zzgar zza() {
        return new zzfxr(this, zzgbv.class);
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgbs.zze(zzgji, zzgkc.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgbs zzgbs = (zzgbs) zzgma;
        zzgim.zzb(zzgbs.zza(), 0);
        new zzfxv();
        zzfxv.zzh(zzgbs.zzf());
        new zzgbb();
        zzgbb.zzh(zzgbs.zzg());
    }

    public final int zze() {
        return 2;
    }

    public final int zzf() {
        return 3;
    }
}
