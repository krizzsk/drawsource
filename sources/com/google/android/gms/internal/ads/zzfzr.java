package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfzr {
    @Deprecated
    public static final zzggs zza = zzggs.zzc();
    @Deprecated
    public static final zzggs zzb = zzggs.zzc();
    @Deprecated
    public static final zzggs zzc = zzggs.zzc();

    static {
        new zzfzq();
        new zzfzo();
        try {
            zzfxk.zzn(new zzfzt());
            zzfxk.zzn(new zzfzw());
            zzfxm.zza();
            if (!zzfzf.zzb()) {
                zzfxk.zzk(new zzfzo(), new zzfzq(), true);
                zzfxk.zzk(new zzgak(), new zzgam(), true);
            }
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
