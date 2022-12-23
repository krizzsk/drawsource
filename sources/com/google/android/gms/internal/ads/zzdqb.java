package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdqb implements zzcmt {
    public final /* synthetic */ zzcfz zza;

    public /* synthetic */ zzdqb(zzcfz zzcfz) {
        this.zza = zzcfz;
    }

    public final void zza(boolean z) {
        zzcfz zzcfz = this.zza;
        if (z) {
            zzcfz.zzb();
        } else {
            zzcfz.zze(new zzeit(1, "Image Web View failed to load."));
        }
    }
}
