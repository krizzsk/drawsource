package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzrh implements zzsk, zzpd {
    final /* synthetic */ zzrj zza;
    private final Object zzb;
    private zzsj zzc;
    private zzpc zzd;

    public zzrh(zzrj zzrj, Object obj) {
        this.zza = zzrj;
        this.zzc = zzrj.zze((zzsa) null);
        this.zzd = zzrj.zzc((zzsa) null);
        this.zzb = obj;
    }

    private final boolean zzf(int i, zzsa zzsa) {
        zzsa zzsa2;
        if (zzsa != null) {
            zzsa2 = this.zza.zzv(this.zzb, zzsa);
            if (zzsa2 == null) {
                return false;
            }
        } else {
            zzsa2 = null;
        }
        zzsj zzsj = this.zzc;
        if (zzsj.zza != i || !zzeg.zzS(zzsj.zzb, zzsa2)) {
            this.zzc = this.zza.zzf(i, zzsa2, 0);
        }
        zzpc zzpc = this.zzd;
        if (zzpc.zza == i && zzeg.zzS(zzpc.zzb, zzsa2)) {
            return true;
        }
        this.zzd = this.zza.zzd(i, zzsa2);
        return true;
    }

    public final void zzaf(int i, zzsa zzsa, zzrw zzrw) {
        if (zzf(i, zzsa)) {
            this.zzc.zzc(zzrw);
        }
    }

    public final void zzag(int i, zzsa zzsa, zzrr zzrr, zzrw zzrw) {
        if (zzf(i, zzsa)) {
            this.zzc.zze(zzrr, zzrw);
        }
    }

    public final void zzah(int i, zzsa zzsa, zzrr zzrr, zzrw zzrw) {
        if (zzf(i, zzsa)) {
            this.zzc.zzg(zzrr, zzrw);
        }
    }

    public final void zzai(int i, zzsa zzsa, zzrr zzrr, zzrw zzrw, IOException iOException, boolean z) {
        if (zzf(i, zzsa)) {
            this.zzc.zzi(zzrr, zzrw, iOException, z);
        }
    }

    public final void zzaj(int i, zzsa zzsa, zzrr zzrr, zzrw zzrw) {
        if (zzf(i, zzsa)) {
            this.zzc.zzk(zzrr, zzrw);
        }
    }
}
