package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzefs implements zzdlg {
    private final zzcfo zza;
    private final zzfvl zzb;
    private final zzfbl zzc;
    private final zzcli zzd;
    private final zzfcd zze;
    private final zzbop zzf;
    private final boolean zzg;

    zzefs(zzcfo zzcfo, zzfvl zzfvl, zzfbl zzfbl, zzcli zzcli, zzfcd zzfcd, boolean z, zzbop zzbop) {
        this.zza = zzcfo;
        this.zzb = zzfvl;
        this.zzc = zzfbl;
        this.zzd = zzcli;
        this.zze = zzfcd;
        this.zzg = z;
        this.zzf = zzbop;
    }

    public final void zza(boolean z, Context context, zzdcg zzdcg) {
        zzcvg zzcvg = (zzcvg) zzfvc.zzq(this.zzb);
        this.zzd.zzap(true);
        boolean zze2 = this.zzg ? this.zzf.zze(true) : true;
        boolean z2 = this.zzg;
        zzj zzj = new zzj(zze2, true, z2 ? this.zzf.zzd() : false, z2 ? this.zzf.zza() : 0.0f, -1, z, this.zzc.zzP, false);
        if (zzdcg != null) {
            zzdcg.zzf();
        }
        zzt.zzj();
        zzdkv zzg2 = zzcvg.zzg();
        zzcli zzcli = this.zzd;
        int i = this.zzc.zzR;
        if (i == -1) {
            zzw zzw = this.zze.zzj;
            if (zzw != null) {
                int i2 = zzw.zza;
                if (i2 == 1) {
                    i = 7;
                } else if (i2 == 2) {
                    i = 6;
                }
            }
            zze.zze("Error setting app open orientation; no targeting orientation available.");
            i = this.zzc.zzR;
        }
        int i3 = i;
        zzcfo zzcfo = this.zza;
        zzfbl zzfbl = this.zzc;
        String str = zzfbl.zzC;
        zzfbq zzfbq = zzfbl.zzt;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((zza) null, (zzo) zzg2, (com.google.android.gms.ads.internal.overlay.zzw) null, zzcli, i3, zzcfo, str, zzj, zzfbq.zzb, zzfbq.zza, this.zze.zzf, zzdcg);
        zzm.zza(context, adOverlayInfoParcel, true);
    }
}
