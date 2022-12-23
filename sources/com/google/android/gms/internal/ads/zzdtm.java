package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdtm implements zzcmt {
    public final /* synthetic */ zzcga zza;

    public /* synthetic */ zzdtm(zzcga zzcga) {
        this.zza = zzcga;
    }

    public final void zza(boolean z) {
        zzcga zzcga = this.zza;
        if (z) {
            zzcga.zzd((Object) null);
        } else {
            zzcga.zze(new Exception("Ad Web View failed to load."));
        }
    }
}
