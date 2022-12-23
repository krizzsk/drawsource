package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzehf implements zzdlg {
    private final Context zza;
    private final zzcfo zzb;
    private final zzfvl zzc;
    private final zzfbl zzd;
    private final zzcli zze;
    private final zzfcd zzf;
    private final zzbop zzg;
    private final boolean zzh;

    zzehf(Context context, zzcfo zzcfo, zzfvl zzfvl, zzfbl zzfbl, zzcli zzcli, zzfcd zzfcd, boolean z, zzbop zzbop) {
        this.zza = context;
        this.zzb = zzcfo;
        this.zzc = zzfvl;
        this.zzd = zzfbl;
        this.zze = zzcli;
        this.zzf = zzfcd;
        this.zzg = zzbop;
        this.zzh = z;
    }

    public final void zza(boolean z, Context context, zzdcg zzdcg) {
        zzdka zzdka = (zzdka) zzfvc.zzq(this.zzc);
        this.zze.zzap(true);
        boolean z2 = false;
        boolean zze2 = this.zzh ? this.zzg.zze(false) : false;
        zzt.zzp();
        boolean zzE = zzs.zzE(this.zza);
        boolean z3 = this.zzh;
        if (z3) {
            z2 = this.zzg.zzd();
        }
        zzj zzj = new zzj(zze2, zzE, z2, z3 ? this.zzg.zza() : 0.0f, -1, z, this.zzd.zzP, false);
        if (zzdcg != null) {
            zzdcg.zzf();
        }
        zzt.zzj();
        zzdkv zzj2 = zzdka.zzj();
        zzcli zzcli = this.zze;
        zzfbl zzfbl = this.zzd;
        int i = zzfbl.zzR;
        zzcfo zzcfo = this.zzb;
        String str = zzfbl.zzC;
        zzfbq zzfbq = zzfbl.zzt;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((zza) null, (zzo) zzj2, (zzw) null, zzcli, i, zzcfo, str, zzj, zzfbq.zzb, zzfbq.zza, this.zzf.zzf, zzdcg);
        zzm.zza(context, adOverlayInfoParcel, true);
    }
}
