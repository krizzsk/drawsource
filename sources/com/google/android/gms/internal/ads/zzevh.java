package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzevh implements zzetg {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbxz zzc;

    public zzevh(zzbxz zzbxz, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.zzc = zzbxz;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    public final int zza() {
        return 49;
    }

    public final zzfvl zzb() {
        return zzfvc.zzm(zzfvc.zzo(zzfvc.zzi(new Bundle()), ((Long) zzay.zzc().zzb(zzbhz.zzdf)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzevg.zza, zzcfv.zza);
    }
}
