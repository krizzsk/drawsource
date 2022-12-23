package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfxm {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    public static final String zzb = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    @Deprecated
    public static final zzggs zzc;
    @Deprecated
    public static final zzggs zzd;
    @Deprecated
    public static final zzggs zze;

    static {
        new zzfxs();
        new zzfyb();
        new zzfye();
        new zzfxy();
        new zzfyk();
        new zzfyo();
        new zzfyh();
        new zzfyr();
        zzggs zzc2 = zzggs.zzc();
        zzc = zzc2;
        zzd = zzc2;
        zze = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzfxk.zzn(new zzfxp());
        zzgbc.zza();
        zzfxk.zzm(new zzfxs(), true);
        zzfxk.zzm(new zzfyb(), true);
        if (!zzfzf.zzb()) {
            zzfxk.zzm(new zzfxy(), true);
            zzfye.zzg(true);
            zzfxk.zzm(new zzfyh(), true);
            zzfxk.zzm(new zzfyk(), true);
            zzfxk.zzm(new zzfyo(), true);
            zzfxk.zzm(new zzfyr(), true);
        }
    }
}
