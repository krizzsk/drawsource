package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzegx implements zzefd {
    /* access modifiers changed from: private */
    public final zzcws zza;
    private final zzege zzb;
    private final zzfvm zzc;
    /* access modifiers changed from: private */
    public final zzdbv zzd;
    private final ScheduledExecutorService zze;

    public zzegx(zzcws zzcws, zzege zzege, zzdbv zzdbv, ScheduledExecutorService scheduledExecutorService, zzfvm zzfvm) {
        this.zza = zzcws;
        this.zzb = zzege;
        this.zzd = zzdbv;
        this.zze = scheduledExecutorService;
        this.zzc = zzfvm;
    }

    public final zzfvl zza(zzfbx zzfbx, zzfbl zzfbl) {
        return this.zzc.zzb(new zzegu(this, zzfbx, zzfbl));
    }

    public final boolean zzb(zzfbx zzfbx, zzfbl zzfbl) {
        return zzfbx.zza.zza.zza() != null && this.zzb.zzb(zzfbx, zzfbl);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcvv zzc(zzfbx zzfbx, zzfbl zzfbl) throws Exception {
        return this.zza.zzb(new zzcym(zzfbx, zzfbl, (String) null), new zzcxf(zzfbx.zza.zza.zza(), new zzegv(this, zzfbx, zzfbl))).zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzfbx zzfbx, zzfbl zzfbl) {
        zzfvc.zzr(zzfvc.zzo(this.zzb.zza(zzfbx, zzfbl), (long) zzfbl.zzS, TimeUnit.SECONDS, this.zze), new zzegw(this), this.zzc);
    }
}
