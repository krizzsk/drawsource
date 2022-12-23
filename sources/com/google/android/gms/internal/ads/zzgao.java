package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgao {
    private final zzgab zza;

    zzgao(zzgab zzgab) {
        this.zza = zzgab;
    }

    /* access modifiers changed from: package-private */
    public final zzgag zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zza2 = zzgin.zza(bArr2, bArr);
        byte[] zzc = zzgin.zzc(bArr2);
        byte[] zzc2 = zzghh.zzc(zzc, bArr);
        byte[] zzd = zzgan.zzd(zzgan.zzb);
        zzgab zzgab = this.zza;
        return new zzgag(zzgab.zzb((byte[]) null, zza2, "eae_prk", zzc2, "shared_secret", zzd, zzgab.zza()), zzc);
    }
}
