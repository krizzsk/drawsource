package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbtl implements zzboz {
    final /* synthetic */ zzbtm zza;
    private final zzcga zzb;

    public zzbtl(zzbtm zzbtm, zzcga zzcga) {
        this.zza = zzbtm;
        this.zzb = zzcga;
    }

    public final void zza(String str) {
        if (str == null) {
            try {
                this.zzb.zze(new zzbsp());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.zzb.zze(new zzbsp(str));
        }
    }

    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzd(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzb.zze(e);
        }
    }
}
