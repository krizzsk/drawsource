package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfjz {
    private JSONObject zza;
    private final zzfki zzb;

    public zzfjz(zzfki zzfki) {
        this.zzb = zzfki;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfkj(this, (byte[]) null));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfkk(this, hashSet, jSONObject, j, (byte[]) null));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfkl(this, hashSet, jSONObject, j, (byte[]) null));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
