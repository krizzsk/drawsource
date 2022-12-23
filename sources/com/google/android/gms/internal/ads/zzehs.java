package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzehs implements Callable {
    public final /* synthetic */ zzehx zza;
    public final /* synthetic */ zzfvl zzb;
    public final /* synthetic */ zzfvl zzc;
    public final /* synthetic */ zzfbx zzd;
    public final /* synthetic */ zzfbl zze;
    public final /* synthetic */ JSONObject zzf;

    public /* synthetic */ zzehs(zzehx zzehx, zzfvl zzfvl, zzfvl zzfvl2, zzfbx zzfbx, zzfbl zzfbl, JSONObject jSONObject) {
        this.zza = zzehx;
        this.zzb = zzfvl;
        this.zzc = zzfvl2;
        this.zzd = zzfbx;
        this.zze = zzfbl;
        this.zzf = jSONObject;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
