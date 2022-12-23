package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdbp implements zzgqu {
    private final zzdbo zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;

    public zzdbp(zzdbo zzdbo, zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4) {
        this.zza = zzdbo;
        this.zzb = zzgrh;
        this.zzc = zzgrh2;
        this.zzd = zzgrh3;
        this.zze = zzgrh4;
    }

    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zzb.zzb();
        zzcfo zza2 = ((zzcnv) this.zzc).zza();
        zzfbl zza3 = ((zzcyn) this.zzd).zza();
        zzccf zzccf = new zzccf();
        if (zza3.zzB != null) {
            return new zzcce(context, zza2, zza3.zzB, zza3.zzt.zzb, zzccf, (byte[]) null);
        }
        return null;
    }
}
