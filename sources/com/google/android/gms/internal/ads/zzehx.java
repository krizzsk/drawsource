package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.PlatformVersion;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzehx implements zzehr {
    private final zzdlu zza;
    private final zzfvm zzb;
    private final zzdpu zzc;
    private final zzfcz zzd;
    private final zzdsk zze;

    public zzehx(zzdlu zzdlu, zzfvm zzfvm, zzdpu zzdpu, zzfcz zzfcz, zzdsk zzdsk) {
        this.zza = zzdlu;
        this.zzb = zzfvm;
        this.zzc = zzdpu;
        this.zzd = zzfcz;
        this.zze = zzdsk;
    }

    private final zzfvl zzg(zzfbx zzfbx, zzfbl zzfbl, JSONObject jSONObject) {
        zzfvl zza2 = this.zzd.zza();
        zzfvl zza3 = this.zzc.zza(zzfbx, zzfbl, jSONObject);
        return zzfvc.zzd(zza2, zza3).zza(new zzehs(this, zza3, zza2, zzfbx, zzfbl, jSONObject), this.zzb);
    }

    public final zzfvl zza(zzfbx zzfbx, zzfbl zzfbl) {
        return zzfvc.zzn(zzfvc.zzn(this.zzd.zza(), new zzehu(this, zzfbl), this.zzb), new zzehv(this, zzfbx, zzfbl), this.zzb);
    }

    public final boolean zzb(zzfbx zzfbx, zzfbl zzfbl) {
        zzfbq zzfbq = zzfbl.zzt;
        return (zzfbq == null || zzfbq.zzc == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdnc zzc(zzfvl zzfvl, zzfvl zzfvl2, zzfbx zzfbx, zzfbl zzfbl, JSONObject jSONObject) throws Exception {
        zzdnh zzdnh = (zzdnh) zzfvl.get();
        zzdse zzdse = (zzdse) zzfvl2.get();
        zzdni zzd2 = this.zza.zzd(new zzcym(zzfbx, zzfbl, (String) null), new zzdnt(zzdnh), new zzdmj(jSONObject, zzdse));
        zzd2.zzj().zzb();
        zzd2.zzk().zza(zzdse);
        zzd2.zzg().zza(zzdnh.zzr());
        zzd2.zzl().zza(this.zze);
        return zzd2.zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzd(zzdse zzdse, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzfvc.zzi(zzdse));
        if (jSONObject.optBoolean("success")) {
            return zzfvc.zzi(jSONObject.getJSONObject("json").getJSONArray(CampaignUnit.JSON_KEY_ADS));
        }
        throw new zzbsp("process json failed");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zze(zzfbl zzfbl, zzdse zzdse) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzhg)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfbl.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzfvc.zzn(zzdse.zzd("google.afma.nativeAds.preProcessJson", jSONObject2), new zzeht(this, zzdse), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzf(zzfbx zzfbx, zzfbl zzfbl, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzfvc.zzh(new zzdzl(3));
        }
        if (zzfbx.zza.zza.zzk <= 1) {
            return zzfvc.zzm(zzg(zzfbx, zzfbl, jSONArray.getJSONObject(0)), zzehw.zza, this.zzb);
        }
        int length = jSONArray.length();
        this.zzd.zzc(Math.min(length, zzfbx.zza.zza.zzk));
        ArrayList arrayList = new ArrayList(zzfbx.zza.zza.zzk);
        for (int i = 0; i < zzfbx.zza.zza.zzk; i++) {
            if (i < length) {
                arrayList.add(zzg(zzfbx, zzfbl, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(zzfvc.zzh(new zzdzl(3)));
            }
        }
        return zzfvc.zzi(arrayList);
    }
}
