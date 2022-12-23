package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzazk implements zzazd {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzarx zzd = zzarx.zza;

    public final long zzI() {
        long j;
        long j2 = this.zzb;
        if (!this.zza) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzarx zzarx = this.zzd;
        if (zzarx.zzb == 1.0f) {
            j = zzare.zza(elapsedRealtime);
        } else {
            j = zzarx.zza(elapsedRealtime);
        }
        return j2 + j;
    }

    public final zzarx zzJ() {
        throw null;
    }

    public final zzarx zzK(zzarx zzarx) {
        if (this.zza) {
            zza(zzI());
        }
        this.zzd = zzarx;
        return zzarx;
    }

    public final void zza(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    public final void zzb() {
        if (!this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
            this.zza = true;
        }
    }

    public final void zzc() {
        if (this.zza) {
            zza(zzI());
            this.zza = false;
        }
    }

    public final void zzd(zzazd zzazd) {
        zza(zzazd.zzI());
        this.zzd = zzazd.zzJ();
    }
}
