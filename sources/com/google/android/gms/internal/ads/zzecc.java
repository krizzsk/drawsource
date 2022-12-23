package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzecc implements Callable {
    public final /* synthetic */ zzfvl zza;
    public final /* synthetic */ zzfvl zzb;

    public /* synthetic */ zzecc(zzfvl zzfvl, zzfvl zzfvl2) {
        this.zza = zzfvl;
        this.zzb = zzfvl2;
    }

    public final Object call() {
        return new zzecu((JSONObject) this.zza.get(), (zzbzy) this.zzb.get());
    }
}
