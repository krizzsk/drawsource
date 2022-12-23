package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcuo implements zzgqu {
    private final zzgrh zza;

    public zzcuo(zzgrh zzgrh) {
        this.zza = zzgrh;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcyn) this.zza).zza().zzA);
        } catch (JSONException unused) {
            return null;
        }
    }
}
