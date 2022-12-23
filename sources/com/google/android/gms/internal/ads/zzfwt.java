package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfwt {
    private final zzgfw zza;

    private zzfwt(zzgfw zzgfw) {
        this.zza = zzgfw;
    }

    static final zzfwt zza(zzgfw zzgfw) throws GeneralSecurityException {
        if (zzgfw != null && zzgfw.zza() > 0) {
            return new zzfwt(zzgfw);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public static final zzfwt zzb(zzfwr zzfwr) throws GeneralSecurityException {
        zzfwu zzd = zzfwu.zzd();
        zzd.zzc(zzfwr.zza());
        return zzd.zzb();
    }

    public final String toString() {
        return zzfxl.zza(this.zza).toString();
    }

    /* access modifiers changed from: package-private */
    public final zzgfw zzc() {
        return this.zza;
    }

    public final Object zzd(Class cls) throws GeneralSecurityException {
        Class zze = zzfxk.zze(cls);
        if (zze != null) {
            zzfxl.zzb(this.zza);
            zzfxc zzc = zzfxc.zzc(zze);
            for (zzgfv zzgfv : this.zza.zzh()) {
                if (zzgfv.zzi() == 3) {
                    zzfwz zza2 = zzc.zza(zzfxk.zzf(zzgfv.zzc(), zze), zzgfv);
                    if (zzgfv.zza() == this.zza.zzc()) {
                        zzc.zzf(zza2);
                    }
                }
            }
            return zzfxk.zzi(zzc, cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
    }
}
