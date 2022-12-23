package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeup implements zzetg {
    private final Context zza;
    private final zzcer zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzcei zzf;

    public zzeup(zzcei zzcei, int i, Context context, zzcer zzcer, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.zzf = zzcei;
        this.zza = context;
        this.zzb = zzcer;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zze = str;
    }

    public final int zza() {
        return 44;
    }

    public final zzfvl zzb() {
        return zzfvc.zzf((zzfut) zzfvc.zzo(zzfvc.zzm(zzfut.zzv(zzfvc.zzl(new zzeum(this), this.zzd)), zzeun.zza, this.zzd), ((Long) zzay.zzc().zzb(zzbhz.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzeuo(this), zzfvs.zzb());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeuq zzc(Exception exc) {
        this.zzb.zzt(exc, "AttestationTokenSignal");
        return null;
    }
}
