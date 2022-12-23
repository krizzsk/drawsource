package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzre implements zztq {
    public final zztq zza;
    final /* synthetic */ zzrf zzb;
    private boolean zzc;

    public zzre(zzrf zzrf, zztq zztq) {
        this.zzb = zzrf;
        this.zza = zztq;
    }

    public final int zza(zziz zziz, zzgb zzgb, int i) {
        if (this.zzb.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzgb.zzc(4);
            return -4;
        }
        int zza2 = this.zza.zza(zziz, zzgb, i);
        if (zza2 == -5) {
            zzad zzad = zziz.zza;
            if (zzad != null) {
                int i2 = zzad.zzC;
                int i3 = 0;
                if (i2 == 0) {
                    if (zzad.zzD != 0) {
                        i2 = 0;
                    }
                    return -5;
                }
                if (this.zzb.zzb == Long.MIN_VALUE) {
                    i3 = zzad.zzD;
                }
                zzab zzb2 = zzad.zzb();
                zzb2.zzC(i2);
                zzb2.zzD(i3);
                zziz.zza = zzb2.zzY();
                return -5;
            }
            throw null;
        }
        zzrf zzrf = this.zzb;
        long j = zzrf.zzb;
        if (j == Long.MIN_VALUE || ((zza2 != -4 || zzgb.zzd < j) && (zza2 != -3 || zzrf.zzb() != Long.MIN_VALUE || zzgb.zzc))) {
            return zza2;
        }
        zzgb.zzb();
        zzgb.zzc(4);
        this.zzc = true;
        return -4;
    }

    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
