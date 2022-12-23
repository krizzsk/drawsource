package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzrs implements zzry, zzrx {
    public final zzsa zza;
    private final long zzb;
    private zzsc zzc;
    private zzry zzd;
    private zzrx zze;
    private long zzf = -9223372036854775807L;
    private final zzvv zzg;

    public zzrs(zzsa zzsa, zzvv zzvv, long j, byte[] bArr) {
        this.zza = zzsa;
        this.zzg = zzvv;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public final long zza(long j, zzjw zzjw) {
        zzry zzry = this.zzd;
        int i = zzeg.zza;
        return zzry.zza(j, zzjw);
    }

    public final long zzb() {
        zzry zzry = this.zzd;
        int i = zzeg.zza;
        return zzry.zzb();
    }

    public final long zzc() {
        zzry zzry = this.zzd;
        int i = zzeg.zza;
        return zzry.zzc();
    }

    public final long zzd() {
        zzry zzry = this.zzd;
        int i = zzeg.zza;
        return zzry.zzd();
    }

    public final long zze(long j) {
        zzry zzry = this.zzd;
        int i = zzeg.zza;
        return zzry.zze(j);
    }

    public final long zzf(zzvg[] zzvgArr, boolean[] zArr, zztq[] zztqArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.zzf;
        if (j3 == -9223372036854775807L || j != this.zzb) {
            j2 = j;
        } else {
            this.zzf = -9223372036854775807L;
            j2 = j3;
        }
        zzry zzry = this.zzd;
        int i = zzeg.zza;
        return zzry.zzf(zzvgArr, zArr, zztqArr, zArr2, j2);
    }

    public final /* bridge */ /* synthetic */ void zzg(zzts zzts) {
        zzry zzry = (zzry) zzts;
        zzrx zzrx = this.zze;
        int i = zzeg.zza;
        zzrx.zzg(this);
    }

    public final zzty zzh() {
        zzry zzry = this.zzd;
        int i = zzeg.zza;
        return zzry.zzh();
    }

    public final void zzi(zzry zzry) {
        zzrx zzrx = this.zze;
        int i = zzeg.zza;
        zzrx.zzi(this);
    }

    public final void zzj(long j, boolean z) {
        zzry zzry = this.zzd;
        int i = zzeg.zza;
        zzry.zzj(j, false);
    }

    public final void zzk() throws IOException {
        try {
            zzry zzry = this.zzd;
            if (zzry != null) {
                zzry.zzk();
                return;
            }
            zzsc zzsc = this.zzc;
            if (zzsc != null) {
                zzsc.zzw();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public final void zzl(zzrx zzrx, long j) {
        this.zze = zzrx;
        zzry zzry = this.zzd;
        if (zzry != null) {
            zzry.zzl(this, zzv(this.zzb));
        }
    }

    public final void zzm(long j) {
        zzry zzry = this.zzd;
        int i = zzeg.zza;
        zzry.zzm(j);
    }

    public final long zzn() {
        return this.zzf;
    }

    public final boolean zzo(long j) {
        zzry zzry = this.zzd;
        return zzry != null && zzry.zzo(j);
    }

    public final boolean zzp() {
        zzry zzry = this.zzd;
        return zzry != null && zzry.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzsa zzsa) {
        long zzv = zzv(this.zzb);
        zzsc zzsc = this.zzc;
        if (zzsc != null) {
            zzry zzD = zzsc.zzD(zzsa, this.zzg, zzv);
            this.zzd = zzD;
            if (this.zze != null) {
                zzD.zzl(this, zzv);
                return;
            }
            return;
        }
        throw null;
    }

    public final void zzs(long j) {
        this.zzf = j;
    }

    public final void zzu(zzsc zzsc) {
        zzcw.zzf(this.zzc == null);
        this.zzc = zzsc;
    }

    public final void zzt() {
        zzry zzry = this.zzd;
        if (zzry != null) {
            zzsc zzsc = this.zzc;
            if (zzsc != null) {
                zzsc.zzB(zzry);
                return;
            }
            throw null;
        }
    }
}
