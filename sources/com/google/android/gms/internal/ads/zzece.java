package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzece implements Callable {
    public final /* synthetic */ zzeco zza;
    public final /* synthetic */ zzfvl zzb;
    public final /* synthetic */ zzfvl zzc;
    public final /* synthetic */ zzbzv zzd;
    public final /* synthetic */ zzfhh zze;

    public /* synthetic */ zzece(zzeco zzeco, zzfvl zzfvl, zzfvl zzfvl2, zzbzv zzbzv, zzfhh zzfhh) {
        this.zza = zzeco;
        this.zzb = zzfvl;
        this.zzc = zzfvl2;
        this.zzd = zzbzv;
        this.zze = zzfhh;
    }

    public final Object call() {
        return this.zza.zzj(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
