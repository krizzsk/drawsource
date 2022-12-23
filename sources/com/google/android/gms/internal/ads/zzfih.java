package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzfih implements Runnable {
    public final /* synthetic */ zzfii zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzfhs zzc;

    public /* synthetic */ zzfih(zzfii zzfii, String str, zzfhs zzfhs) {
        this.zza = zzfii;
        this.zzb = str;
        this.zzc = zzfhs;
    }

    public final void run() {
        this.zza.zzb(this.zzb, this.zzc);
    }
}
