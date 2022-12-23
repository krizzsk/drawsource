package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdzp {
    private final zzfvm zza;
    private final zzfvm zzb;
    private final zzeaw zzc;
    private final zzgqo zzd;

    public zzdzp(zzfvm zzfvm, zzfvm zzfvm2, zzeaw zzeaw, zzgqo zzgqo) {
        this.zza = zzfvm;
        this.zzb = zzfvm2;
        this.zzc = zzeaw;
        this.zzd = zzgqo;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zza(zzbzv zzbzv, int i, zzebn zzebn) throws Exception {
        return ((zzeco) this.zzd.zzb()).zzc(zzbzv, i);
    }

    public final zzfvl zzb(zzbzv zzbzv) {
        zzfvl zzfvl;
        String str = zzbzv.zzd;
        zzt.zzp();
        if (zzs.zzy(str)) {
            zzfvl = zzfvc.zzh(new zzebn(1));
        } else {
            zzfvl = zzfvc.zzg(this.zza.zzb(new zzdzm(this, zzbzv)), ExecutionException.class, zzdzn.zza, this.zzb);
        }
        return zzfvc.zzg(zzfvl, zzebn.class, new zzdzo(this, zzbzv, Binder.getCallingUid()), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzc(zzbzv zzbzv) throws Exception {
        zzcga zzcga;
        zzeaw zzeaw = this.zzc;
        synchronized (zzeaw.zzb) {
            if (zzeaw.zzc) {
                zzcga = zzeaw.zza;
            } else {
                zzeaw.zzc = true;
                zzeaw.zze = zzbzv;
                zzeaw.zzf.checkAvailabilityAndConnect();
                zzeaw.zza.zzc(new zzeav(zzeaw), zzcfv.zzf);
                zzcga = zzeaw.zza;
            }
        }
        return (InputStream) zzcga.get((long) ((Integer) zzay.zzc().zzb(zzbhz.zzey)).intValue(), TimeUnit.SECONDS);
    }
}
