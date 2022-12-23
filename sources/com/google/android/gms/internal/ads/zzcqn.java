package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcqn implements zzezr {
    private final zzcop zza;
    private final zzcqn zzb = this;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;
    private final zzgrh zzi;

    /* synthetic */ zzcqn(zzcop zzcop, Context context, String str, zzq zzq, zzcqm zzcqm) {
        this.zza = zzcop;
        this.zzc = zzgqv.zza(context);
        this.zzd = zzgqv.zza(zzq);
        this.zze = zzgqv.zza(str);
        this.zzf = zzgqt.zzc(new zzemi(this.zza.zzo));
        this.zzg = zzgqt.zzc(new zzfap(this.zza.zzay));
        zzgrh zzgrh = this.zzc;
        zzcop zzcop2 = this.zza;
        zzgrh zzc2 = zzgqt.zzc(new zzezp(zzgrh, zzcop2.zzp, zzcop2.zzQ, this.zzf, this.zzg, zzfcf.zza()));
        this.zzh = zzc2;
        this.zzi = zzgqt.zzc(new zzemq(this.zzc, this.zzd, this.zze, zzc2, this.zzf, this.zzg, this.zza.zzi));
    }

    public final zzemp zza() {
        return (zzemp) this.zzi.zzb();
    }
}
