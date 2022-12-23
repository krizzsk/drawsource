package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzclq implements zzfpj {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzcmx zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ zzaoc zzf;
    public final /* synthetic */ zzbiy zzg;
    public final /* synthetic */ zzcfo zzh;
    public final /* synthetic */ zzl zzi;
    public final /* synthetic */ zza zzj;
    public final /* synthetic */ zzbdm zzk;
    public final /* synthetic */ zzfbl zzl;
    public final /* synthetic */ zzfbo zzm;

    public /* synthetic */ zzclq(Context context, zzcmx zzcmx, String str, boolean z, boolean z2, zzaoc zzaoc, zzbiy zzbiy, zzcfo zzcfo, zzbio zzbio, zzl zzl2, zza zza2, zzbdm zzbdm, zzfbl zzfbl, zzfbo zzfbo) {
        this.zza = context;
        this.zzb = zzcmx;
        this.zzc = str;
        this.zzd = z;
        this.zze = z2;
        this.zzf = zzaoc;
        this.zzg = zzbiy;
        this.zzh = zzcfo;
        this.zzi = zzl2;
        this.zzj = zza2;
        this.zzk = zzbdm;
        this.zzl = zzfbl;
        this.zzm = zzfbo;
    }

    public final Object zza() {
        Context context = this.zza;
        zzcmx zzcmx = this.zzb;
        String str = this.zzc;
        boolean z = this.zzd;
        boolean z2 = this.zze;
        zzaoc zzaoc = this.zzf;
        zzbiy zzbiy = this.zzg;
        zzcfo zzcfo = this.zzh;
        zzl zzl2 = this.zzi;
        zza zza2 = this.zzj;
        zzbdm zzbdm = this.zzk;
        zzfbl zzfbl = this.zzl;
        zzfbo zzfbo = this.zzm;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = zzcmb.zza;
            zzclx zzclx = new zzclx(new zzcmb(new zzcmw(context), zzcmx, str, z, z2, zzaoc, zzbiy, zzcfo, (zzbio) null, zzl2, zza2, zzbdm, zzfbl, zzfbo));
            zzclx.setWebViewClient(zzt.zzq().zzd(zzclx, zzbdm, z2));
            zzclx.setWebChromeClient(new zzclh(zzclx));
            return zzclx;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
