package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzejr implements Runnable {
    public final /* synthetic */ zzejs zza;
    public final /* synthetic */ zzfbx zzb;
    public final /* synthetic */ zzfbl zzc;
    public final /* synthetic */ zzefg zzd;

    public /* synthetic */ zzejr(zzejs zzejs, zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) {
        this.zza = zzejs;
        this.zzb = zzfbx;
        this.zzc = zzfbl;
        this.zzd = zzefg;
    }

    public final void run() {
        zzejs zzejs = this.zza;
        zzeju.zze(this.zzb, this.zzc, this.zzd);
    }
}
