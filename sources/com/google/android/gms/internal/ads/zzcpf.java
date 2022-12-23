package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcpf implements zzewk {
    private final zzcop zza;
    private final zzcpf zzb = this;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;
    private final zzgrh zzi;
    private final zzgrh zzj;
    private final zzgrh zzk;

    /* synthetic */ zzcpf(zzcop zzcop, Context context, String str, zzcpe zzcpe) {
        this.zza = zzcop;
        this.zzc = zzgqv.zza(context);
        this.zzd = zzgqv.zza(str);
        zzgrh zzgrh = this.zzc;
        zzcop zzcop2 = this.zza;
        this.zze = new zzeze(zzgrh, zzcop2.zzay, zzcop2.zzaz);
        this.zzf = zzgqt.zzc(new zzexi(zzcop2.zzay));
        zzgrh zzgrh2 = this.zzc;
        zzcop zzcop3 = this.zza;
        this.zzg = zzgqt.zzc(new zzewc(zzgrh2, zzcop3.zzp, zzcop3.zzQ, this.zze, this.zzf, zzfcf.zza(), zzcop3.zzi));
        zzcop zzcop4 = this.zza;
        this.zzh = zzgqt.zzc(new zzewi(zzcop4.zzQ, this.zzc, this.zzd, this.zzg, this.zzf, zzcop4.zzi));
        zzgrh zzgrh3 = this.zzc;
        zzcop zzcop5 = this.zza;
        this.zzi = new zzezd(zzgrh3, zzcop5.zzay, zzcop5.zzaz);
        this.zzj = zzgqt.zzc(new zzexk(zzgrh3, zzcop5.zzp, zzcop5.zzQ, this.zzi, this.zzf, zzfcf.zza(), zzcop5.zzi));
        zzcop zzcop6 = this.zza;
        this.zzk = zzgqt.zzc(new zzexq(zzcop6.zzQ, this.zzc, this.zzd, this.zzj, this.zzf, zzcop6.zzi));
    }

    public final zzewh zza() {
        return (zzewh) this.zzh.zzb();
    }

    public final zzexp zzb() {
        return (zzexp) this.zzk.zzb();
    }
}
