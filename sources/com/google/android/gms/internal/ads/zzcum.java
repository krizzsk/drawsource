package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzcum implements Runnable {
    public final /* synthetic */ zzcun zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzcum(zzcun zzcun, JSONObject jSONObject) {
        this.zza = zzcun;
        this.zzb = jSONObject;
    }

    public final void run() {
        this.zza.zzd(this.zzb);
    }
}
