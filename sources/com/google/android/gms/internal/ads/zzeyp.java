package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeyp implements zzeza {
    private zzdbc zza;

    /* renamed from: zza */
    public final synchronized zzdbc zzd() {
        return this.zza;
    }

    public final /* bridge */ /* synthetic */ zzfvl zzc(zzezb zzezb, zzeyz zzeyz, Object obj) {
        return zzb(zzezb, zzeyz, (zzdbc) null);
    }

    public final synchronized zzfvl zzb(zzezb zzezb, zzeyz zzeyz, zzdbc zzdbc) {
        zzcza zzb;
        if (zzdbc != null) {
            this.zza = zzdbc;
        } else {
            this.zza = (zzdbc) zzeyz.zza(zzezb.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzh(zzb.zzi());
    }
}
