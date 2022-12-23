package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgah {
    static zzgac zza(zzgfa zzgfa) throws GeneralSecurityException {
        if (zzgfa.zze() == 3) {
            return new zzfzz(16);
        }
        if (zzgfa.zze() == 4) {
            return new zzfzz(32);
        }
        if (zzgfa.zze() == 5) {
            return new zzgaa();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    static zzgab zzb(zzgfa zzgfa) {
        if (zzgfa.zzf() == 3) {
            return new zzgab("HmacSha256");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    static zzgao zzc(zzgfa zzgfa) {
        if (zzgfa.zzg() == 3) {
            return new zzgao(new zzgab("HmacSha256"));
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }
}
