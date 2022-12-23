package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdzr implements Callable {
    public final /* synthetic */ zzaoc zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzdzr(zzaoc zzaoc, Context context) {
        this.zza = zzaoc;
        this.zzb = context;
    }

    public final Object call() {
        zzaoc zzaoc = this.zza;
        return zzaoc.zzc().zzg(this.zzb);
    }
}
