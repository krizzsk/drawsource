package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgr implements zzjb {
    private final zzjz zza;
    private final zzgq zzb;
    private zzjt zzc;
    private zzjb zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzgr(zzgq zzgq, zzcx zzcx) {
        this.zzb = zzgq;
        this.zza = new zzjz(zzcx);
    }

    public final long zza() {
        throw null;
    }

    public final long zzb(boolean z) {
        zzjt zzjt = this.zzc;
        if (zzjt == null || zzjt.zzM() || (!this.zzc.zzN() && (z || this.zzc.zzG()))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzjb zzjb = this.zzd;
            if (zzjb != null) {
                long zza2 = zzjb.zza();
                if (this.zze) {
                    if (zza2 < this.zza.zza()) {
                        this.zza.zze();
                    } else {
                        this.zze = false;
                        if (this.zzf) {
                            this.zza.zzd();
                        }
                    }
                }
                this.zza.zzb(zza2);
                zzbt zzc2 = zzjb.zzc();
                if (!zzc2.equals(this.zza.zzc())) {
                    this.zza.zzg(zzc2);
                    this.zzb.zza(zzc2);
                }
            } else {
                throw null;
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzjb zzjb2 = this.zzd;
        if (zzjb2 != null) {
            return zzjb2.zza();
        }
        throw null;
    }

    public final zzbt zzc() {
        zzjb zzjb = this.zzd;
        return zzjb != null ? zzjb.zzc() : this.zza.zzc();
    }

    public final void zzd(zzjt zzjt) {
        if (zzjt == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzjt zzjt) throws zzgt {
        zzjb zzjb;
        zzjb zzi = zzjt.zzi();
        if (zzi != null && zzi != (zzjb = this.zzd)) {
            if (zzjb == null) {
                this.zzd = zzi;
                this.zzc = zzjt;
                zzi.zzg(this.zza.zzc());
                return;
            }
            throw zzgt.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    public final void zzg(zzbt zzbt) {
        zzjb zzjb = this.zzd;
        if (zzjb != null) {
            zzjb.zzg(zzbt);
            zzbt = this.zzd.zzc();
        }
        this.zza.zzg(zzbt);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}
