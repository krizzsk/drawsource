package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfzj {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
    @Deprecated
    public static final zzggs zzb = zzggs.zzc();
    @Deprecated
    public static final zzggs zzc = zzggs.zzc();

    static {
        new zzfzi();
        try {
            zzfxk.zzn(new zzfzl());
            if (!zzfzf.zzb()) {
                zzfxk.zzm(new zzfzi(), true);
            }
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
