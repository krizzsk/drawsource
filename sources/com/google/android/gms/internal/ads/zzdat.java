package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdat implements zzdbt, zzdiq, zzdgk, zzdcj {
    /* access modifiers changed from: private */
    public final zzdcl zza;
    private final zzfbl zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final zzfvt zze = zzfvt.zzf();
    private ScheduledFuture zzf;

    public zzdat(zzdcl zzdcl, zzfbl zzfbl, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zza = zzdcl;
        this.zzb = zzfbl;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        synchronized (this) {
            if (!this.zze.isDone()) {
                this.zze.zzd(true);
            }
        }
    }

    public final void zzbv() {
    }

    public final void zzc() {
    }

    public final synchronized void zzd() {
        if (!this.zze.isDone()) {
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zzd(true);
        }
    }

    public final void zze() {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzbp)).booleanValue()) {
            zzfbl zzfbl = this.zzb;
            if (zzfbl.zzZ != 2) {
                return;
            }
            if (zzfbl.zzr == 0) {
                this.zza.zza();
                return;
            }
            zzfvc.zzr(this.zze, new zzdas(this), this.zzd);
            this.zzf = this.zzc.schedule(new zzdar(this), (long) this.zzb.zzr, TimeUnit.MILLISECONDS);
        }
    }

    public final void zzf() {
    }

    public final void zzj() {
    }

    public final synchronized void zzk(zze zze2) {
        if (!this.zze.isDone()) {
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zze(new Exception());
        }
    }

    public final void zzm() {
    }

    public final void zzo() {
        int i = this.zzb.zzZ;
        if (i == 0 || i == 1) {
            this.zza.zza();
        }
    }

    public final void zzp(zzcal zzcal, String str, String str2) {
    }

    public final void zzr() {
    }
}
