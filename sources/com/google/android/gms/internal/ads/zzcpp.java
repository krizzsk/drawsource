package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcpp implements zzexy {
    private final Context zza;
    private final zzq zzb;
    private final String zzc;
    private final zzcop zzd;
    private final zzcpp zze = this;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;
    private final zzgrh zzi;
    private final zzgrh zzj;
    private final zzgrh zzk;

    /* synthetic */ zzcpp(zzcop zzcop, Context context, String str, zzq zzq, zzcpo zzcpo) {
        this.zzd = zzcop;
        this.zza = context;
        this.zzb = zzq;
        this.zzc = str;
        this.zzf = zzgqv.zza(context);
        this.zzg = zzgqv.zza(zzq);
        this.zzh = zzgqt.zzc(new zzemi(this.zzd.zzo));
        this.zzi = zzgqt.zzc(zzemn.zza());
        this.zzj = zzgqt.zzc(zzdgq.zza());
        zzgrh zzgrh = this.zzf;
        zzcop zzcop2 = this.zzd;
        this.zzk = zzgqt.zzc(new zzexw(zzgrh, zzcop2.zzp, this.zzg, zzcop2.zzQ, this.zzh, this.zzi, zzfcf.zza(), this.zzj));
    }

    public final zzelo zza() {
        zzcfo zzd2 = this.zzd.zza.zzd();
        zzgrc.zzb(zzd2);
        return new zzelo(this.zza, this.zzb, this.zzc, (zzexv) this.zzk.zzb(), (zzemh) this.zzh.zzb(), zzd2);
    }
}
