package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzecd implements Callable {
    public final /* synthetic */ zzfvl zza;
    public final /* synthetic */ zzfvl zzb;
    public final /* synthetic */ zzfvl zzc;

    public /* synthetic */ zzecd(zzfvl zzfvl, zzfvl zzfvl2, zzfvl zzfvl3) {
        this.zza = zzfvl;
        this.zzb = zzfvl2;
        this.zzc = zzfvl3;
    }

    public final Object call() {
        return new zzecn((zzecr) this.zza.get(), (JSONObject) this.zzb.get(), (zzbzy) this.zzc.get());
    }
}
