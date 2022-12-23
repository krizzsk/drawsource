package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgak extends zzgau {
    public zzgak() {
        super(zzgfd.class, zzgfg.class, new zzgai(zzfwm.class));
    }

    static /* bridge */ /* synthetic */ zzgaq zzg(int i, int i2, int i3, int i4) {
        zzgez zza = zzgfa.zza();
        zza.zzc(3);
        zza.zzb(3);
        zza.zza(i3);
        zzgew zza2 = zzgex.zza();
        zza2.zza((zzgfa) zza.zzal());
        return new zzgaq((zzgex) zza2.zzal(), i4);
    }

    public final zzgar zza() {
        return new zzgaj(this, zzgex.class);
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgfd.zze(zzgji, zzgkc.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgfd zzgfd = (zzgfd) zzgma;
        if (zzgfd.zzg().zzD()) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (zzgfd.zzk()) {
            zzgim.zzb(zzgfd.zza(), 0);
            zzgan.zza(zzgfd.zzf().zzc());
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }

    public final int zzf() {
        return 4;
    }
}
