package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdqy {
    private final Executor zza;
    private final zzcun zzb;
    private final zzdjb zzc;

    zzdqy(Executor executor, zzcun zzcun, zzdjb zzdjb) {
        this.zza = executor;
        this.zzc = zzdjb;
        this.zzb = zzcun;
    }

    public final void zza(zzcli zzcli) {
        if (zzcli != null) {
            this.zzc.zza(zzcli.zzH());
            this.zzc.zzj(new zzdqu(zzcli), this.zza);
            this.zzc.zzj(new zzdqv(zzcli), this.zza);
            this.zzc.zzj(this.zzb, this.zza);
            this.zzb.zzf(zzcli);
            zzcli.zzaf("/trackActiveViewUnit", new zzdqw(this));
            zzcli.zzaf("/untrackActiveViewUnit", new zzdqx(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcli zzcli, Map map) {
        this.zzb.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcli zzcli, Map map) {
        this.zzb.zza();
    }
}
