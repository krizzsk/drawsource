package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzezf implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzezf(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
    }

    /* renamed from: zza */
    public final zzeza zzb() {
        zzcel zzcel;
        Context context = (Context) this.zza.zzb();
        zzfdk zzfdk = (zzfdk) this.zzb.zzb();
        zzfec zzfec = (zzfec) this.zzc.zzb();
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfo)).booleanValue()) {
            zzcel = zzt.zzo().zzh().zzh();
        } else {
            zzcel = zzt.zzo().zzh().zzi();
        }
        boolean z = false;
        if (zzcel != null && zzcel.zzh()) {
            z = true;
        }
        if (((Integer) zzay.zzc().zzb(zzbhz.zzfq)).intValue() > 0) {
            if (!((Boolean) zzay.zzc().zzb(zzbhz.zzfn)).booleanValue() || z) {
                zzfeb zza2 = zzfec.zza(zzfds.Rewarded, context, zzfdk, new zzeye(new zzeyb()));
                return new zzeyg(new zzeyq(new zzeyp()), new zzeym(zza2.zza, zzcfv.zza), zza2.zzb, zza2.zza.zza().zzf, zzcfv.zza);
            }
        }
        return new zzeyp();
    }
}
