package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzji implements zzsk, zzpd {
    final /* synthetic */ zzjm zza;
    private final zzjk zzb;
    private zzsj zzc;
    private zzpc zzd;

    public zzji(zzjm zzjm, zzjk zzjk) {
        this.zza = zzjm;
        this.zzc = zzjm.zzf;
        this.zzd = zzjm.zzg;
        this.zzb = zzjk;
    }

    private final boolean zzf(int i, zzsa zzsa) {
        zzsa zzsa2 = null;
        if (zzsa != null) {
            zzjk zzjk = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzjk.zzc.size()) {
                    break;
                } else if (((zzsa) zzjk.zzc.get(i2)).zzd == zzsa.zzd) {
                    zzsa2 = zzsa.zzc(Pair.create(zzjk.zzb, zzsa.zza));
                    break;
                } else {
                    i2++;
                }
            }
            if (zzsa2 == null) {
                return false;
            }
        }
        int i3 = i + this.zzb.zzd;
        zzsj zzsj = this.zzc;
        if (zzsj.zza != i3 || !zzeg.zzS(zzsj.zzb, zzsa2)) {
            this.zzc = this.zza.zzf.zza(i3, zzsa2, 0);
        }
        zzpc zzpc = this.zzd;
        if (zzpc.zza == i3 && zzeg.zzS(zzpc.zzb, zzsa2)) {
            return true;
        }
        this.zzd = this.zza.zzg.zza(i3, zzsa2);
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
