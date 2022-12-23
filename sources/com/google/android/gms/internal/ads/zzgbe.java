package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgbe implements zzfwx {
    private final zzfxc zza;
    private final byte[] zzb = {0};

    /* synthetic */ zzgbe(zzfxc zzfxc, zzgbd zzgbd) {
        this.zza = zzfxc;
    }

    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzfwz zzfwz : this.zza.zze(copyOf)) {
                try {
                    if (zzfwz.zzd() == 4) {
                        ((zzfwx) zzfwz.zza()).zza(copyOfRange, zzghh.zzc(bArr2, this.zzb));
                        return;
                    }
                    ((zzfwx) zzfwz.zza()).zza(copyOfRange, bArr2);
                    return;
                } catch (GeneralSecurityException e) {
                    zzgbf.zza.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
                }
            }
            for (zzfwz zza2 : this.zza.zze(zzfwk.zza)) {
                try {
                    ((zzfwx) zza2.zza()).zza(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }

    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        if (this.zza.zzb().zzd() == 4) {
            return zzghh.zzc(this.zza.zzb().zzb(), ((zzfwx) this.zza.zzb().zza()).zzb(zzghh.zzc(bArr, this.zzb)));
        }
        return zzghh.zzc(this.zza.zzb().zzb(), ((zzfwx) this.zza.zzb().zza()).zzb(bArr));
    }
}
