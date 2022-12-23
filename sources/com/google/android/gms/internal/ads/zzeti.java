package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzeti implements Callable {
    public final /* synthetic */ List zza;
    public final /* synthetic */ Object zzb;

    public /* synthetic */ zzeti(List list, Object obj) {
        this.zza = list;
        this.zzb = obj;
    }

    public final Object call() {
        List<zzfvl> list = this.zza;
        Object obj = this.zzb;
        for (zzfvl zzfvl : list) {
            zzetf zzetf = (zzetf) zzfvl.get();
            if (zzetf != null) {
                zzetf.zzf(obj);
            }
        }
        return obj;
    }
}
