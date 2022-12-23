package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbte implements zzbsq {
    /* access modifiers changed from: private */
    public final zzbss zza;
    private final zzbst zzb;
    private final zzbsm zzc;
    private final String zzd;

    zzbte(zzbsm zzbsm, String str, zzbst zzbst, zzbss zzbss) {
        this.zzc = zzbsm;
        this.zzd = str;
        this.zzb = zzbst;
        this.zza = zzbss;
    }

    static /* bridge */ /* synthetic */ void zzd(zzbte zzbte, zzbsg zzbsg, zzbsn zzbsn, Object obj, zzcga zzcga) {
        try {
            zzt.zzp();
            String uuid = UUID.randomUUID().toString();
            zzbol.zzo.zzc(uuid, new zzbtd(zzbte, zzbsg, zzcga));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzbte.zzb.zzb(obj));
            zzbsn.zzl(zzbte.zzd, jSONObject);
        } catch (Exception e) {
            zzcga.zze(e);
            zze.zzh("Unable to invokeJavascript", e);
            zzbsg.zzb();
        } catch (Throwable th) {
            zzbsg.zzb();
            throw th;
        }
    }

    public final zzfvl zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final zzfvl zzb(Object obj) {
        zzcga zzcga = new zzcga();
        zzbsg zzb2 = this.zzc.zzb((zzaoc) null);
        zzb2.zzi(new zzbtb(this, zzb2, obj, zzcga), new zzbtc(this, zzcga, zzb2));
        return zzcga;
    }
}
