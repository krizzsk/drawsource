package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zza;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdtp {
    private final zzclu zza;
    private final Context zzb;
    private final zzaoc zzc;
    private final zzbiy zzd;
    private final zzcfo zze;
    private final zza zzf;
    private final zzbdm zzg;
    /* access modifiers changed from: private */
    public final zzdei zzh;

    public zzdtp(zzclu zzclu, Context context, zzaoc zzaoc, zzbiy zzbiy, zzcfo zzcfo, zza zza2, zzbdm zzbdm, zzdei zzdei) {
        this.zza = zzclu;
        this.zzb = context;
        this.zzc = zzaoc;
        this.zzd = zzbiy;
        this.zze = zzcfo;
        this.zzf = zza2;
        this.zzg = zzbdm;
        this.zzh = zzdei;
    }

    public final zzcli zza(zzq zzq, zzfbl zzfbl, zzfbo zzfbo) throws zzclt {
        return zzclu.zza(this.zzb, zzcmx.zzc(zzq), zzq.zza, false, false, this.zzc, this.zzd, this.zze, (zzbio) null, new zzdte(this), this.zzf, this.zzg, zzfbl, zzfbo);
    }
}
