package com.google.android.gms.internal.ads;

import com.smaato.sdk.video.vast.model.StaticResource;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfio {
    private final zzfiv zza;
    private final zzfiv zzb;
    private final zzfis zzc;
    private final zzfiu zzd;

    private zzfio(zzfis zzfis, zzfiu zzfiu, zzfiv zzfiv, zzfiv zzfiv2, boolean z) {
        this.zzc = zzfis;
        this.zzd = zzfiu;
        this.zza = zzfiv;
        if (zzfiv2 == null) {
            this.zzb = zzfiv.NONE;
        } else {
            this.zzb = zzfiv2;
        }
    }

    public static zzfio zza(zzfis zzfis, zzfiu zzfiu, zzfiv zzfiv, zzfiv zzfiv2, boolean z) {
        zzfjv.zzb(zzfiu, "ImpressionType is null");
        zzfjv.zzb(zzfiv, "Impression owner is null");
        if (zzfiv == zzfiv.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (zzfis == zzfis.DEFINED_BY_JAVASCRIPT && zzfiv == zzfiv.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (zzfiu != zzfiu.DEFINED_BY_JAVASCRIPT || zzfiv != zzfiv.NATIVE) {
            return new zzfio(zzfis, zzfiu, zzfiv, zzfiv2, true);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfjt.zzg(jSONObject, "impressionOwner", this.zza);
        if (this.zzd != null) {
            zzfjt.zzg(jSONObject, "mediaEventsOwner", this.zzb);
            zzfjt.zzg(jSONObject, StaticResource.CREATIVE_TYPE, this.zzc);
            zzfjt.zzg(jSONObject, "impressionType", this.zzd);
        } else {
            zzfjt.zzg(jSONObject, "videoEventsOwner", this.zzb);
        }
        zzfjt.zzg(jSONObject, "isolateVerificationScripts", true);
        return jSONObject;
    }
}
