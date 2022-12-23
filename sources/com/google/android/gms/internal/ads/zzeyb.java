package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeyb implements zzeza {
    private zzdbc zza;
    private final Executor zzb = zzfvs.zzb();

    public final zzdbc zza() {
        return this.zza;
    }

    public final zzfvl zzb(zzezb zzezb, zzeyz zzeyz, zzdbc zzdbc) {
        zzdbb zza2 = zzeyz.zza(zzezb.zzb);
        zza2.zzb(new zzezg(true));
        zzdbc zzdbc2 = (zzdbc) zza2.zzh();
        this.zza = zzdbc2;
        zzcza zzb2 = zzdbc2.zzb();
        zzfdx zzfdx = new zzfdx();
        return zzfvc.zzm(zzfvc.zzn(zzfut.zzv(zzb2.zzi()), new zzexz(this, zzfdx, zzb2), this.zzb), new zzeya(zzfdx), this.zzb);
    }

    public final /* bridge */ /* synthetic */ zzfvl zzc(zzezb zzezb, zzeyz zzeyz, Object obj) {
        return zzb(zzezb, zzeyz, (zzdbc) null);
    }

    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
