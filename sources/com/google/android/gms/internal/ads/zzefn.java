package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzefn implements zzfok {
    public final /* synthetic */ zzefq zza;
    public final /* synthetic */ zzcli zzb;
    public final /* synthetic */ zzfbl zzc;
    public final /* synthetic */ zzcvg zzd;

    public /* synthetic */ zzefn(zzefq zzefq, zzcli zzcli, zzfbl zzfbl, zzcvg zzcvg) {
        this.zza = zzefq;
        this.zzb = zzcli;
        this.zzc = zzfbl;
        this.zzd = zzcvg;
    }

    public final Object apply(Object obj) {
        zzcli zzcli = this.zzb;
        zzfbl zzfbl = this.zzc;
        zzcvg zzcvg = this.zzd;
        if (zzfbl.zzN) {
            zzcli.zzag();
        }
        zzcli.zzaa();
        zzcli.onPause();
        return zzcvg.zza();
    }
}
