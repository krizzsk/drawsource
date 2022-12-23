package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzetj {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfhs zzd;
    private final zzdwh zze;

    public zzetj(Context context, Executor executor, Set set, zzfhs zzfhs, zzdwh zzdwh) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfhs;
        this.zze = zzdwh;
    }

    public final zzfvl zza(Object obj) {
        zzfhh zza2 = zzfhg.zza(this.zza, 8);
        zza2.zzf();
        ArrayList arrayList = new ArrayList(this.zzb.size());
        for (zzetg zzetg : this.zzb) {
            zzfvl zzb2 = zzetg.zzb();
            zzb2.zzc(new zzeth(this, zzetg), zzcfv.zzf);
            arrayList.add(zzb2);
        }
        zzfvl zza3 = zzfvc.zzc(arrayList).zza(new zzeti(arrayList, obj), this.zzc);
        if (zzfhu.zza()) {
            zzfhr.zza(zza3, this.zzd, zza2);
        }
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzetg zzetg) {
        long elapsedRealtime = zzt.zzA().elapsedRealtime() - zzt.zzA().elapsedRealtime();
        if (((Boolean) zzbjs.zza.zze()).booleanValue()) {
            String zzc2 = zzfpi.zzc(zzetg.getClass().getCanonicalName());
            zze.zza("Signal runtime (ms) : " + zzc2 + " = " + elapsedRealtime);
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzbM)).booleanValue()) {
            zzdwg zza2 = this.zze.zza();
            zza2.zzb("action", "lat_ms");
            zza2.zzb("lat_grp", "sig_lat_grp");
            zza2.zzb("lat_id", String.valueOf(zzetg.zza()));
            zza2.zzb("clat_ms", String.valueOf(elapsedRealtime));
            zza2.zzh();
        }
    }
}
