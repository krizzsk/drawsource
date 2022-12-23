package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzevu implements zzetg {
    private final zzcer zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzfvm zzd;
    private final String zze;
    private final zzceg zzf;

    zzevu(zzcer zzcer, boolean z, zzceg zzceg, zzfvm zzfvm, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.zza = zzcer;
        this.zzb = z;
        this.zzf = zzceg;
        this.zzd = zzfvm;
        this.zze = str;
        this.zzc = scheduledExecutorService;
    }

    public final int zza() {
        return 50;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzevv zzc(Exception exc) {
        this.zza.zzt(exc, "TrustlessTokenSignal");
        return null;
    }

    public final zzfvl zzb() {
        if (!this.zzb) {
            return zzfvc.zzi((Object) null);
        }
        return zzfvc.zzf(zzfvc.zzo(zzfvc.zzm(zzfvc.zzi((Object) null), zzevs.zza, this.zzd), ((Long) zzbkc.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzevt(this), this.zzd);
    }
}
