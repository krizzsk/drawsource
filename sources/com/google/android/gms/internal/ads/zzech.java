package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzech implements Callable {
    public final /* synthetic */ zzfvl zza;
    public final /* synthetic */ zzfvl zzb;

    public /* synthetic */ zzech(zzfvl zzfvl, zzfvl zzfvl2) {
        this.zza = zzfvl;
        this.zzb = zzfvl2;
    }

    public final Object call() {
        zzfvl zzfvl = this.zza;
        zzfvl zzfvl2 = this.zzb;
        return new zzecn((zzecr) zzfvl.get(), ((zzecl) zzfvl2.get()).zzb, ((zzecl) zzfvl2.get()).zza);
    }
}
