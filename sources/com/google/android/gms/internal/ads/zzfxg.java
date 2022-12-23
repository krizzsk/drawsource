package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfxg implements zzfxj {
    final /* synthetic */ zzgas zza;

    zzfxg(zzgas zzgas) {
        this.zza = zzgas;
    }

    public final zzfwo zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzfwq(this.zza, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    public final zzfwo zzb() {
        zzgas zzgas = this.zza;
        return new zzfwq(zzgas, zzgas.zzi());
    }

    public final Class zzc() {
        return this.zza.getClass();
    }

    public final Class zzd() {
        return null;
    }

    public final Set zze() {
        return this.zza.zzl();
    }
}
