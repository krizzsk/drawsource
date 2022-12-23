package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcvz implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;
    private final zzgrh zzi;
    private final zzgrh zzj;

    public zzcvz(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4, zzgrh zzgrh5, zzgrh zzgrh6, zzgrh zzgrh7, zzgrh zzgrh8, zzgrh zzgrh9, zzgrh zzgrh10) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
        this.zzd = zzgrh4;
        this.zze = zzgrh5;
        this.zzf = zzgrh6;
        this.zzg = zzgrh7;
        this.zzh = zzgrh8;
        this.zzi = zzgrh9;
        this.zzj = zzgrh10;
    }

    public static zzcvy zzc(zzcxw zzcxw, Context context, zzfbm zzfbm, View view, zzcli zzcli, zzcxv zzcxv, zzdns zzdns, zzdji zzdji, zzgqo zzgqo, Executor executor) {
        return new zzcvy(zzcxw, context, zzfbm, view, zzcli, zzcxv, zzdns, zzdji, zzgqo, executor);
    }

    /* renamed from: zza */
    public final zzcvy zzb() {
        return new zzcvy(((zzczs) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcwf) this.zzc).zza(), ((zzcwe) this.zzd).zza(), ((zzcwq) this.zze).zza(), ((zzcwg) this.zzf).zza(), ((zzdls) this.zzg).zza(), (zzdji) this.zzh.zzb(), zzgqt.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
