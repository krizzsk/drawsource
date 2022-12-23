package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzclr implements zzfui {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzaoc zzb;
    public final /* synthetic */ zzcfo zzc;
    public final /* synthetic */ zza zzd;
    public final /* synthetic */ String zze;

    public /* synthetic */ zzclr(Context context, zzaoc zzaoc, zzcfo zzcfo, zza zza2, String str) {
        this.zza = context;
        this.zzb = zzaoc;
        this.zzc = zzcfo;
        this.zzd = zza2;
        this.zze = str;
    }

    public final zzfvl zza() {
        Context context = this.zza;
        zzaoc zzaoc = this.zzb;
        zzcfo zzcfo = this.zzc;
        zza zza2 = this.zzd;
        String str = this.zze;
        zzt.zzz();
        zzcli zza3 = zzclu.zza(context, zzcmx.zza(), "", false, false, zzaoc, (zzbiy) null, zzcfo, (zzbio) null, (zzl) null, zza2, zzbdm.zza(), (zzfbl) null, (zzfbo) null);
        zzcfz zza4 = zzcfz.zza(zza3);
        zza3.zzP().zzz(new zzcls(zza4));
        zza3.loadUrl(str);
        return zza4;
    }
}
