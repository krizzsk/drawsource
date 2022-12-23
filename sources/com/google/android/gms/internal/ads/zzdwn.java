package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdwn implements Runnable {
    public final /* synthetic */ zzdwo zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdwn(zzdwo zzdwo, String str) {
        this.zza = zzdwo;
        this.zzb = str;
    }

    public final void run() {
        zzdwo zzdwo = this.zza;
        zzdwo.zzd.zza(this.zzb);
    }
}
