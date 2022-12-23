package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgbc {
    @Deprecated
    public static final zzggs zza;
    @Deprecated
    public static final zzggs zzb;
    @Deprecated
    public static final zzggs zzc;

    static {
        new zzgbb();
        zzggs zzc2 = zzggs.zzc();
        zza = zzc2;
        zzb = zzc2;
        zzc = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzfxk.zzn(new zzgbf());
        zzfxk.zzm(new zzgbb(), true);
        if (!zzfzf.zzb()) {
            zzfxk.zzm(new zzgay(), true);
        }
    }
}
