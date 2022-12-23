package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfxh implements zzfxj {
    final /* synthetic */ zzgau zza;
    final /* synthetic */ zzgas zzb;

    zzfxh(zzgau zzgau, zzgas zzgas) {
        this.zza = zzgau;
        this.zzb = zzgas;
    }

    public final zzfwo zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzfxe(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    public final zzfwo zzb() {
        zzgau zzgau = this.zza;
        return new zzfxe(zzgau, this.zzb, zzgau.zzi());
    }

    public final Class zzc() {
        return this.zza.getClass();
    }

    public final Class zzd() {
        return this.zzb.getClass();
    }

    public final Set zze() {
        return this.zza.zzl();
    }
}
