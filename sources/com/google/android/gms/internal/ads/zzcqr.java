package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcqr implements zzfbf {
    private final zzcop zza;
    private final zzcqr zzb = this;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;
    private final zzgrh zzi;
    private final zzgrh zzj;

    /* synthetic */ zzcqr(zzcop zzcop, Context context, String str, zzcqq zzcqq) {
        this.zza = zzcop;
        zzgqu zza2 = zzgqv.zza(context);
        this.zzc = zza2;
        zzcop zzcop2 = this.zza;
        this.zzd = new zzezf(zza2, zzcop2.zzay, zzcop2.zzaz);
        this.zze = zzgqt.zzc(new zzfap(zzcop2.zzay));
        this.zzf = zzgqt.zzc(zzfca.zza());
        zzgrh zzgrh = this.zzc;
        zzcop zzcop3 = this.zza;
        zzgrh zzc2 = zzgqt.zzc(new zzfaz(zzgrh, zzcop3.zzp, zzcop3.zzQ, this.zzd, this.zze, zzfcf.zza(), this.zzf));
        this.zzg = zzc2;
        this.zzh = zzgqt.zzc(new zzfbj(zzc2, this.zze, this.zzf));
        zzgqu zzc3 = zzgqv.zzc(str);
        this.zzi = zzc3;
        this.zzj = zzgqt.zzc(new zzfbd(zzc3, this.zzg, this.zzc, this.zze, this.zzf, this.zza.zzi));
    }

    public final zzfbc zza() {
        return (zzfbc) this.zzj.zzb();
    }

    public final zzfbi zzb() {
        return (zzfbi) this.zzh.zzb();
    }
}
