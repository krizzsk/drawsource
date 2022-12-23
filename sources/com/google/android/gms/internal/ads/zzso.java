package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzso implements zzry, zzrx {
    /* access modifiers changed from: private */
    public final zzry zza;
    private final long zzb;
    private zzrx zzc;

    public zzso(zzry zzry, long j) {
        this.zza = zzry;
        this.zzb = j;
    }

    public final long zza(long j, zzjw zzjw) {
        return this.zza.zza(j - this.zzb, zzjw) + this.zzb;
    }

    public final long zzb() {
        long zzb2 = this.zza.zzb();
        if (zzb2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb2 + this.zzb;
    }

    public final long zzc() {
        long zzc2 = this.zza.zzc();
        if (zzc2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc2 + this.zzb;
    }

    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    public final long zze(long j) {
        return this.zza.zze(j - this.zzb) + this.zzb;
    }

    public final long zzf(zzvg[] zzvgArr, boolean[] zArr, zztq[] zztqArr, boolean[] zArr2, long j) {
        zztq[] zztqArr2 = zztqArr;
        zztq[] zztqArr3 = new zztq[zztqArr2.length];
        int i = 0;
        while (true) {
            zztq zztq = null;
            if (i >= zztqArr2.length) {
                break;
            }
            zzsp zzsp = (zzsp) zztqArr2[i];
            if (zzsp != null) {
                zztq = zzsp.zzc();
            }
            zztqArr3[i] = zztq;
            i++;
        }
        long zzf = this.zza.zzf(zzvgArr, zArr, zztqArr3, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zztqArr2.length; i2++) {
            zztq zztq2 = zztqArr3[i2];
            if (zztq2 == null) {
                zztqArr2[i2] = null;
            } else {
                zztq zztq3 = zztqArr2[i2];
                if (zztq3 == null || ((zzsp) zztq3).zzc() != zztq2) {
                    zztqArr2[i2] = new zzsp(zztq2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
    }

    public final /* bridge */ /* synthetic */ void zzg(zzts zzts) {
        zzry zzry = (zzry) zzts;
        zzrx zzrx = this.zzc;
        if (zzrx != null) {
            zzrx.zzg(this);
            return;
        }
        throw null;
    }

    public final zzty zzh() {
        return this.zza.zzh();
    }

    public final void zzj(long j, boolean z) {
        this.zza.zzj(j - this.zzb, false);
    }

    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    public final void zzl(zzrx zzrx, long j) {
        this.zzc = zzrx;
        this.zza.zzl(this, j - this.zzb);
    }

    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    public final boolean zzo(long j) {
        return this.zza.zzo(j - this.zzb);
    }

    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final void zzi(zzry zzry) {
        zzrx zzrx = this.zzc;
        if (zzrx != null) {
            zzrx.zzi(this);
            return;
        }
        throw null;
    }
}
