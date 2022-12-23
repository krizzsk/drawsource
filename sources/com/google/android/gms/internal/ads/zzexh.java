package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzexh implements zzdbw, zzdds, zzeyx, zzo, zzdee, zzdcj, zzdjg {
    private final zzfdk zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzexh zzh = null;

    public zzexh(zzfdk zzfdk) {
        this.zza = zzfdk;
    }

    public static zzexh zzi(zzexh zzexh) {
        zzexh zzexh2 = new zzexh(zzexh.zza);
        zzexh2.zzh = zzexh;
        return zzexh2;
    }

    public final void zzb() {
        zzexh zzexh = this.zzh;
        if (zzexh != null) {
            zzexh.zzb();
            return;
        }
        zzeyo.zza(this.zzf, zzexa.zza);
        zzeyo.zza(this.zzd, zzexb.zza);
        zzeyo.zza(this.zzd, zzexc.zza);
    }

    public final void zzbC() {
        zzexh zzexh = this.zzh;
        if (zzexh != null) {
            zzexh.zzbC();
        } else {
            zzeyo.zza(this.zzf, zzewx.zza);
        }
    }

    public final void zzbK() {
    }

    public final void zzbL(zzeyx zzeyx) {
        this.zzh = (zzexh) zzeyx;
    }

    public final void zzbr() {
    }

    public final void zze() {
        zzexh zzexh = this.zzh;
        if (zzexh != null) {
            zzexh.zze();
        } else {
            zzeyo.zza(this.zzf, zzexe.zza);
        }
    }

    public final void zzf(int i) {
        zzexh zzexh = this.zzh;
        if (zzexh != null) {
            zzexh.zzf(i);
        } else {
            zzeyo.zza(this.zzf, new zzeww(i));
        }
    }

    public final void zzg(zzs zzs) {
        zzexh zzexh = this.zzh;
        if (zzexh != null) {
            zzexh.zzg(zzs);
        } else {
            zzeyo.zza(this.zzg, new zzewv(zzs));
        }
    }

    public final void zzh() {
        zzexh zzexh = this.zzh;
        if (zzexh != null) {
            zzexh.zzh();
        } else {
            zzeyo.zza(this.zze, zzexg.zza);
        }
    }

    public final void zzj() {
        zzexh zzexh = this.zzh;
        if (zzexh != null) {
            zzexh.zzj();
            return;
        }
        this.zza.zza();
        zzeyo.zza(this.zzc, zzewt.zza);
        zzeyo.zza(this.zzd, zzewu.zza);
    }

    public final void zzk(zze zze2) {
        zzexh zzexh = this.zzh;
        if (zzexh != null) {
            zzexh.zzk(zze2);
        } else {
            zzeyo.zza(this.zzd, new zzexd(zze2));
        }
    }

    public final void zzn(zzdds zzdds) {
        this.zze.set(zzdds);
    }

    public final void zzo(zzo zzo) {
        this.zzf.set(zzo);
    }

    public final void zzp(zzde zzde) {
        this.zzg.set(zzde);
    }

    public final void zzq() {
        zzexh zzexh = this.zzh;
        if (zzexh != null) {
            zzexh.zzq();
        } else {
            zzeyo.zza(this.zzd, zzexf.zza);
        }
    }

    public final void zzr(zzbcj zzbcj) {
        this.zzb.set(zzbcj);
    }

    public final void zzs(zzbcn zzbcn) {
        this.zzd.set(zzbcn);
    }

    public final void zzt(zzbck zzbck) {
        this.zzc.set(zzbck);
    }

    public final void zzl(zzbcg zzbcg) {
        zzexh zzexh = this.zzh;
        if (zzexh != null) {
            zzexh.zzl(zzbcg);
        } else {
            zzeyo.zza(this.zzb, new zzewz(zzbcg));
        }
    }

    public final void zza(zze zze2) {
        zzexh zzexh = this.zzh;
        if (zzexh != null) {
            zzexh.zza(zze2);
            return;
        }
        zzeyo.zza(this.zzb, new zzews(zze2));
        zzeyo.zza(this.zzb, new zzewy(zze2));
    }
}
