package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzvq implements Runnable {
    public final /* synthetic */ zzvr zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzvq(zzvr zzvr, int i, long j, long j2) {
        this.zza = zzvr;
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public final void run() {
        zzvr zzvr = this.zza;
        zzvr.zzb.zzY(this.zzb, this.zzc, this.zzd);
    }
}
