package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbtm implements zzfuj {
    private final zzbss zza;
    private final zzbst zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final zzfvl zzd;

    zzbtm(zzfvl zzfvl, String str, zzbst zzbst, zzbss zzbss) {
        this.zzd = zzfvl;
        this.zzb = zzbst;
        this.zza = zzbss;
    }

    public final zzfvl zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final zzfvl zzb(Object obj) {
        return zzfvc.zzn(this.zzd, new zzbtk(this, obj), zzcfv.zzf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(Object obj, zzbsn zzbsn) throws Exception {
        zzcga zzcga = new zzcga();
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzbol.zzo.zzc(uuid, new zzbtl(this, zzcga));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbsn.zzl(this.zzc, jSONObject);
        return zzcga;
    }
}
