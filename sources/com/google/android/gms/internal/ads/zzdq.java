package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdq implements Runnable {
    public final /* synthetic */ zzdw zza;
    public final /* synthetic */ zzvw zzb;

    public /* synthetic */ zzdq(zzdw zzdw, zzvw zzvw, byte[] bArr) {
        this.zza = zzdw;
        this.zzb = zzvw;
    }

    public final void run() {
        zzdw zzdw = this.zza;
        zzvw zzvw = this.zzb;
        zzvw.zza.zzk(zzdw.zza());
    }
}
