package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgae implements zzfwm {
    private final zzgfd zza;
    private final zzgac zzb;
    private final zzgao zzc;
    private final zzgab zzd;

    private zzgae(zzgfd zzgfd, zzgao zzgao, zzgab zzgab, zzgac zzgac, int i, byte[] bArr) {
        this.zza = zzgfd;
        this.zzc = zzgao;
        this.zzd = zzgab;
        this.zzb = zzgac;
    }

    static zzgae zza(zzgfd zzgfd) throws GeneralSecurityException {
        if (!zzgfd.zzk()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        } else if (!zzgfd.zzf().zzl()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        } else if (!zzgfd.zzg().zzD()) {
            zzgfa zzc2 = zzgfd.zzf().zzc();
            zzgao zzc3 = zzgah.zzc(zzc2);
            zzgab zzb2 = zzgah.zzb(zzc2);
            zzgac zza2 = zzgah.zza(zzc2);
            int zzg = zzc2.zzg();
            if (zzg - 2 == 1) {
                return new zzgae(zzgfd, zzc3, zzb2, zza2, 32, (byte[]) null);
            }
            throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzgeu.zza(zzg)));
        } else {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
    }
}
