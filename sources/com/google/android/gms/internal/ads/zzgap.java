package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgap {
    private final zzfwf zza;
    private final zzfwl zzb;

    public zzgap(zzfwf zzfwf) {
        this.zza = zzfwf;
        this.zzb = null;
    }

    public zzgap(zzfwl zzfwl) {
        this.zza = null;
        this.zzb = zzfwl;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzfwf zzfwf = this.zza;
        if (zzfwf != null) {
            return zzfwf.zzb(bArr, bArr2);
        }
        return this.zzb.zza(bArr, bArr2);
    }
}
