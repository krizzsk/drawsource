package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeym implements zzeza {
    private final zzfdo zza;
    private final Executor zzb;
    private final zzfuy zzc = new zzeyk(this);

    public zzeym(zzfdo zzfdo, Executor executor) {
        this.zza = zzfdo;
        this.zzb = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zza(zzdbc zzdbc, zzeyv zzeyv) throws Exception {
        zzfdy zzfdy = zzeyv.zzb;
        zzbzv zzbzv = zzeyv.zza;
        zzfdx zzb2 = zzfdy != null ? this.zza.zzb(zzfdy) : null;
        if (zzfdy == null) {
            return zzfvc.zzi((Object) null);
        }
        if (!(zzb2 == null || zzbzv == null)) {
            zzfvc.zzr(zzdbc.zzb().zzg(zzbzv), this.zzc, this.zzb);
        }
        return zzfvc.zzi(new zzeyl(zzfdy, zzbzv, zzb2));
    }

    public final zzfvl zzb(zzezb zzezb, zzeyz zzeyz, zzdbc zzdbc) {
        return zzfvc.zzf(zzfvc.zzn(zzfut.zzv(new zzeyw(this.zza, zzdbc, this.zzb).zzc()), new zzeyi(this, zzdbc), this.zzb), Exception.class, new zzeyj(this), this.zzb);
    }

    public final /* bridge */ /* synthetic */ zzfvl zzc(zzezb zzezb, zzeyz zzeyz, Object obj) {
        return zzb(zzezb, zzeyz, (zzdbc) null);
    }

    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
