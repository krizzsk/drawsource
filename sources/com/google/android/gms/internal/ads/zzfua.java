package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzfua implements Runnable {
    public final /* synthetic */ zzfuc zza;
    public final /* synthetic */ zzfvl zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzfua(zzfuc zzfuc, zzfvl zzfvl, int i) {
        this.zza = zzfuc;
        this.zzb = zzfvl;
        this.zzc = i;
    }

    public final void run() {
        this.zza.zzx(this.zzb, this.zzc);
    }
}
