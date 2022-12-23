package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeyq implements zzeza {
    private final zzeza zza;
    private zzdbc zzb;

    public zzeyq(zzeza zzeza) {
        this.zza = zzeza;
    }

    /* renamed from: zza */
    public final synchronized zzdbc zzd() {
        return this.zzb;
    }

    public final synchronized zzfvl zzb(zzezb zzezb, zzeyz zzeyz, zzdbc zzdbc) {
        this.zzb = zzdbc;
        if (zzezb.zza != null) {
            zzcza zzb2 = this.zzb.zzb();
            return zzb2.zzh(zzb2.zzj(zzfvc.zzi(zzezb.zza)));
        }
        return ((zzeyp) this.zza).zzb(zzezb, zzeyz, zzdbc);
    }

    public final /* bridge */ /* synthetic */ zzfvl zzc(zzezb zzezb, zzeyz zzeyz, Object obj) {
        return zzb(zzezb, zzeyz, (zzdbc) null);
    }
}
