package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zztf implements zzsm {
    private final zzep zzc;
    private int zzd = 1048576;
    private final zzte zze;
    private final zzvz zzf;
    private final zzoz zzg;

    public zztf(zzep zzep, zzte zzte, byte[] bArr) {
        zzoz zzoz = new zzoz();
        zzvz zzvz = new zzvz(-1);
        this.zzc = zzep;
        this.zze = zzte;
        this.zzg = zzoz;
        this.zzf = zzvz;
    }

    public final zztf zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzth zzb(zzbb zzbb) {
        if (zzbb.zzd != null) {
            return new zzth(zzbb, this.zzc, this.zze, zzpi.zza, this.zzf, this.zzd, (zztg) null, (byte[]) null);
        }
        throw null;
    }
}
