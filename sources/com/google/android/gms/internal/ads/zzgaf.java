package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgaf implements zzfwn {
    private static final byte[] zza = new byte[0];
    private final zzgfg zzb;
    private final zzgac zzc;
    private final zzgao zzd;
    private final zzgab zze;

    private zzgaf(zzgfg zzgfg, zzgao zzgao, zzgab zzgab, zzgac zzgac, byte[] bArr) {
        this.zzb = zzgfg;
        this.zzd = zzgao;
        this.zze = zzgab;
        this.zzc = zzgac;
    }

    static zzgaf zzb(zzgfg zzgfg) throws GeneralSecurityException {
        if (!zzgfg.zzh().zzD()) {
            zzgfa zzc2 = zzgfg.zzc();
            return new zzgaf(zzgfg, zzgah.zzc(zzc2), zzgah.zzb(zzc2), zzgah.zza(zzc2), (byte[]) null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        zzgfg zzgfg = this.zzb;
        zzgao zzgao = this.zzd;
        zzgab zzgab = this.zze;
        zzgac zzgac = this.zzc;
        zzgag zza2 = zzgao.zza(zzgfg.zzh().zzE(), zzgin.zzb());
        zzgad zzc2 = zzgad.zzc(zza2.zza(), zza2.zzb(), zzgao, zzgab, zzgac, bArr3);
        return zzghh.zzc(zzc2.zza(), zzc2.zzb(bArr, zza));
    }
}
