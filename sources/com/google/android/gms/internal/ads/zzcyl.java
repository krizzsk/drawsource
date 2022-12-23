package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcyl {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzfvl zzc;
    private volatile boolean zzd = true;

    public zzcyl(Executor executor, ScheduledExecutorService scheduledExecutorService, zzfvl zzfvl) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzfvl;
    }

    static /* bridge */ /* synthetic */ void zzb(zzcyl zzcyl, List list, zzfuy zzfuy) {
        if (list == null || list.isEmpty()) {
            zzcyl.zza.execute(new zzcyf(zzfuy));
            return;
        }
        zzfvl zzi = zzfvc.zzi((Object) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzi = zzfvc.zzn(zzfvc.zzg(zzi, Throwable.class, new zzcyg(zzfuy), zzcyl.zza), new zzcyh(zzcyl, zzfuy, (zzfvl) it.next()), zzcyl.zza);
        }
        zzfvc.zzr(zzi, new zzcyk(zzcyl, zzfuy), zzcyl.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zza(zzfuy zzfuy, zzfvl zzfvl, zzcxx zzcxx) throws Exception {
        if (zzcxx != null) {
            zzfuy.zzb(zzcxx);
        }
        return zzfvc.zzo(zzfvl, ((Long) zzbkb.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzfuy zzfuy) {
        zzfvc.zzr(this.zzc, new zzcyj(this, zzfuy), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
