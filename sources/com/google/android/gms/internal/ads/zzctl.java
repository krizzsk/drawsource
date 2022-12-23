package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzctl implements Runnable {
    public final /* synthetic */ zzcts zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzctl(zzcts zzcts, int i, int i2) {
        this.zza = zzcts;
        this.zzb = i;
        this.zzc = i2;
    }

    public final void run() {
        this.zza.zzi(this.zzb, this.zzc);
    }
}
