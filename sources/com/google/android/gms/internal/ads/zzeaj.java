package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeaj {
    private final ScheduledExecutorService zza;
    private final zzfvm zzb;
    private final zzeba zzc;
    private final zzgqo zzd;

    public zzeaj(ScheduledExecutorService scheduledExecutorService, zzfvm zzfvm, zzeba zzeba, zzgqo zzgqo) {
        this.zza = scheduledExecutorService;
        this.zzb = zzfvm;
        this.zzc = zzeba;
        this.zzd = zzgqo;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zza(zzbzv zzbzv, int i, Throwable th) throws Exception {
        return ((zzeco) this.zzd.zzb()).zzd(zzbzv, i);
    }

    public final zzfvl zzb(zzbzv zzbzv) {
        zzfvl zzfvl;
        String str = zzbzv.zzd;
        zzt.zzp();
        if (zzs.zzy(str)) {
            zzfvl = zzfvc.zzh(new zzebn(1));
        } else {
            zzeba zzeba = this.zzc;
            synchronized (zzeba.zzb) {
                if (zzeba.zzc) {
                    zzfvl = zzeba.zza;
                } else {
                    zzeba.zzc = true;
                    zzeba.zze = zzbzv;
                    zzeba.zzf.checkAvailabilityAndConnect();
                    zzeba.zza.zzc(new zzeaz(zzeba), zzcfv.zzf);
                    zzfvl = zzeba.zza;
                }
            }
        }
        int callingUid = Binder.getCallingUid();
        zzfut zzv = zzfut.zzv(zzfvl);
        long intValue = (long) ((Integer) zzay.zzc().zzb(zzbhz.zzey)).intValue();
        return zzfvc.zzg((zzfut) zzfvc.zzo(zzv, intValue, TimeUnit.SECONDS, this.zza), Throwable.class, new zzeai(this, zzbzv, callingUid), this.zzb);
    }
}
