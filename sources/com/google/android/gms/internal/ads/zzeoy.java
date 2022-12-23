package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeoy implements zzetg {
    final zzcer zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzfvm zzd;
    private final Context zze;

    zzeoy(Context context, zzcer zzcer, ScheduledExecutorService scheduledExecutorService, zzfvm zzfvm) {
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzco)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcer;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfvm;
    }

    public final int zza() {
        return 11;
    }

    public final zzfvl zzb() {
        Task<AppSetIdInfo> task;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzck)).booleanValue()) {
            if (!((Boolean) zzay.zzc().zzb(zzbhz.zzcp)).booleanValue()) {
                if (!((Boolean) zzay.zzc().zzb(zzbhz.zzcl)).booleanValue()) {
                    return zzfvc.zzm(zzfnz.zza(this.zzb.getAppSetIdInfo()), zzeov.zza, zzcfv.zzf);
                }
                if (((Boolean) zzay.zzc().zzb(zzbhz.zzco)).booleanValue()) {
                    task = zzfdf.zza(this.zze);
                } else {
                    task = this.zzb.getAppSetIdInfo();
                }
                if (task == null) {
                    return zzfvc.zzi(new zzeoz((String) null, -1));
                }
                zzfvl zzn = zzfvc.zzn(zzfnz.zza(task), zzeow.zza, zzcfv.zzf);
                if (((Boolean) zzay.zzc().zzb(zzbhz.zzcm)).booleanValue()) {
                    zzn = zzfvc.zzo(zzn, ((Long) zzay.zzc().zzb(zzbhz.zzcn)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfvc.zzf(zzn, Exception.class, new zzeox(this), this.zzd);
            }
        }
        return zzfvc.zzi(new zzeoz((String) null, -1));
    }
}
