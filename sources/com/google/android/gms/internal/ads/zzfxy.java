package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfxy extends zzgas {
    zzfxy() {
        super(zzgch.class, new zzfxw(zzfwf.class));
    }

    static /* bridge */ /* synthetic */ zzgaq zzg(int i, int i2, int i3) {
        zzgcj zzc = zzgck.zzc();
        zzc.zza(i);
        zzgcm zzc2 = zzgcn.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgcn) zzc2.zzal());
        return new zzgaq((zzgck) zzc.zzal(), i3);
    }

    public final zzgar zza() {
        return new zzfxx(this, zzgck.class);
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgch.zze(zzgji, zzgkc.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgch zzgch = (zzgch) zzgma;
        zzgim.zzb(zzgch.zza(), 0);
        zzgim.zza(zzgch.zzg().zzd());
        if (zzgch.zzf().zza() != 12 && zzgch.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public final int zzf() {
        return 3;
    }
}
