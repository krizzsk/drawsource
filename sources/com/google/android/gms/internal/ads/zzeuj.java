package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeuj implements zzetg {
    private final zzcer zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzfvm zzd;
    private final zzbcp zze;

    zzeuj(String str, zzbcp zzbcp, zzcer zzcer, ScheduledExecutorService scheduledExecutorService, zzfvm zzfvm, byte[] bArr) {
        this.zzb = str;
        this.zze = zzbcp;
        this.zza = zzcer;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfvm;
    }

    public final int zza() {
        return 43;
    }

    public final zzfvl zzb() {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzck)).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzcp)).booleanValue()) {
                zzfvl zzn = zzfvc.zzn(zzfnz.zza(Tasks.forResult(null)), zzeuh.zza, this.zzd);
                if (((Boolean) zzbje.zza.zze()).booleanValue()) {
                    zzn = zzfvc.zzo(zzn, ((Long) zzbje.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfvc.zzf(zzn, Exception.class, new zzeui(this), this.zzd);
            }
        }
        return zzfvc.zzi(new zzeuk((String) null, -1));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeuk zzc(Exception exc) {
        this.zza.zzt(exc, "AppSetIdInfoGmscoreSignal");
        return new zzeuk((String) null, -1);
    }
}
