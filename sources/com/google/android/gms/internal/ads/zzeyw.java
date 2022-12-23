package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzeyw {
    private final zzfdo zza;
    private final zzdbc zzb;
    private final Executor zzc;
    /* access modifiers changed from: private */
    public zzeyv zzd;

    public zzeyw(zzfdo zzfdo, zzdbc zzdbc, Executor executor) {
        this.zza = zzfdo;
        this.zzb = zzdbc;
        this.zzc = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    public final zzfdy zze() {
        zzfcd zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final zzfvl zzc() {
        zzfvl zzfvl;
        zzeyv zzeyv = this.zzd;
        if (zzeyv != null) {
            return zzfvc.zzi(zzeyv);
        }
        if (!((Boolean) zzbjv.zza.zze()).booleanValue()) {
            zzeyv zzeyv2 = new zzeyv((zzbzv) null, zze(), (zzeyu) null);
            this.zzd = zzeyv2;
            zzfvl = zzfvc.zzi(zzeyv2);
        } else {
            zzfvl = zzfvc.zzf(zzfvc.zzm(zzfut.zzv(this.zzb.zzb().zze(this.zza.zza())), new zzeyt(this), this.zzc), zzebn.class, new zzeys(this), this.zzc);
        }
        return zzfvc.zzm(zzfvl, zzeyr.zza, this.zzc);
    }
}
