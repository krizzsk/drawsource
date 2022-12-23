package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzas;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdap implements zzfok {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzcfo zzb;
    public final /* synthetic */ zzfcd zzc;

    public /* synthetic */ zzdap(Context context, zzcfo zzcfo, zzfcd zzfcd) {
        this.zza = context;
        this.zzb = zzcfo;
        this.zzc = zzfcd;
    }

    public final Object apply(Object obj) {
        Context context = this.zza;
        zzcfo zzcfo = this.zzb;
        zzfcd zzfcd = this.zzc;
        zzfbl zzfbl = (zzfbl) obj;
        zzas zzas = new zzas(context);
        zzas.zzp(zzfbl.zzC);
        zzas.zzq(zzfbl.zzD.toString());
        zzas.zzo(zzcfo.zza);
        zzas.zzn(zzfcd.zzf);
        return zzas;
    }
}
