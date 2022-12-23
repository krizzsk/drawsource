package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcqd implements zzdxq {
    /* access modifiers changed from: private */
    public final Context zza;
    private final zzbph zzb;
    private final zzcop zzc;
    private final zzcqd zzd = this;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;

    /* synthetic */ zzcqd(zzcop zzcop, Context context, zzbph zzbph, zzcqc zzcqc) {
        this.zzc = zzcop;
        this.zza = context;
        this.zzb = zzbph;
        this.zze = zzgqv.zza(this);
        zzgqu zza2 = zzgqv.zza(zzbph);
        this.zzf = zza2;
        zzdxm zzdxm = new zzdxm(zza2);
        this.zzg = zzdxm;
        this.zzh = zzgqt.zzc(new zzdxo(this.zze, zzdxm));
    }

    public final zzdxh zzb() {
        return new zzcpx(this.zzc, this.zzd, (zzcpw) null);
    }

    public final zzdxn zzd() {
        return (zzdxn) this.zzh.zzb();
    }
}
