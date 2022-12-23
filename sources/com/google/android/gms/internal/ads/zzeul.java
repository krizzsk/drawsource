package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeul implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;

    public zzeul(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4, zzgrh zzgrh5) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
        this.zzd = zzgrh4;
        this.zze = zzgrh5;
    }

    public static zzeuj zza(String str, zzbcp zzbcp, zzcer zzcer, ScheduledExecutorService scheduledExecutorService, zzfvm zzfvm) {
        return new zzeuj(str, zzbcp, zzcer, scheduledExecutorService, zzfvm, (byte[]) null);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfvm zzfvm = zzcfv.zza;
        zzgrc.zzb(zzfvm);
        return new zzeuj(((zzevl) this.zza).zza(), new zzbcp(), (zzcer) this.zzc.zzb(), (ScheduledExecutorService) this.zzd.zzb(), zzfvm, (byte[]) null);
    }
}
