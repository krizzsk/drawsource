package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdqh {
    private final Context zza;
    private final zzdpq zzb;
    private final zzaoc zzc;
    private final zzcfo zzd;
    private final zza zze;
    private final zzbdm zzf;
    private final Executor zzg;
    private final zzbkp zzh;
    private final zzdqz zzi;
    private final zzdtp zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsk zzl;
    private final zzdwh zzm;
    private final zzfgp zzn;
    private final zzfii zzo;
    private final zzees zzp;

    public zzdqh(Context context, zzdpq zzdpq, zzaoc zzaoc, zzcfo zzcfo, zza zza2, zzbdm zzbdm, Executor executor, zzfcd zzfcd, zzdqz zzdqz, zzdtp zzdtp, ScheduledExecutorService scheduledExecutorService, zzdwh zzdwh, zzfgp zzfgp, zzfii zzfii, zzees zzees, zzdsk zzdsk) {
        this.zza = context;
        this.zzb = zzdpq;
        this.zzc = zzaoc;
        this.zzd = zzcfo;
        this.zze = zza2;
        this.zzf = zzbdm;
        this.zzg = executor;
        this.zzh = zzfcd.zzi;
        this.zzi = zzdqz;
        this.zzj = zzdtp;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdwh;
        this.zzn = zzfgp;
        this.zzo = zzfii;
        this.zzp = zzees;
        this.zzl = zzdsk;
    }

    public static final zzef zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfrj.zzo();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfrj.zzo();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzef zzr = zzr(optJSONArray.optJSONObject(i));
            if (zzr != null) {
                arrayList.add(zzr);
            }
        }
        return zzfrj.zzm(arrayList);
    }

    private static zzfvl zzl(zzfvl zzfvl, Object obj) {
        return zzfvc.zzg(zzfvl, Exception.class, new zzdqe((Object) null), zzcfv.zzf);
    }

    private static zzfvl zzm(boolean z, zzfvl zzfvl, Object obj) {
        if (z) {
            return zzfvc.zzn(zzfvl, new zzdqc(zzfvl), zzcfv.zzf);
        }
        return zzl(zzfvl, (Object) null);
    }

    private final zzfvl zzn(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzfvc.zzi((Object) null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzfvc.zzi((Object) null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzfvc.zzi(new zzbkn((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzfvc.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzdqf(optString, optDouble, optInt, optInt2), this.zzg), (Object) null);
    }

    private final zzfvl zzo(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzfvc.zzi(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z));
        }
        return zzfvc.zzm(zzfvc.zze(arrayList), zzdqd.zza, this.zzg);
    }

    private final zzfvl zzp(JSONObject jSONObject, zzfbl zzfbl, zzfbo zzfbo) {
        zzfvl zzb2 = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString(TJAdUnitConstants.String.HTML), zzfbl, zzfbo, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzfvc.zzn(zzb2, new zzdqg(zzb2), zzcfv.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt(CampaignEx.JSON_KEY_AD_R), jSONObject2.getInt("g"), jSONObject2.getInt(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final zzef zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(IronSourceConstants.EVENTS_ERROR_REASON);
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzef(optString, optString2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbkk zza(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", TTAdSdk.INIT_LOCAL_FAIL_CODE);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzbkk(optString, list, zzq, zzq2, num, optInt3 + optInt2, this.zzh.zze, optBoolean);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzb(zzq zzq, zzfbl zzfbl, zzfbo zzfbo, String str, String str2, Object obj) throws Exception {
        zzcli zza2 = this.zzj.zza(zzq, zzfbl, zzfbo);
        zzcfz zza3 = zzcfz.zza(zza2);
        zzdsh zzb2 = this.zzl.zzb();
        zzdsh zzdsh = zzb2;
        zzcmv zzP = zza2.zzP();
        zzb zzb3 = r3;
        zzb zzb4 = new zzb(this.zza, (zzccj) null, (zzbzj) null);
        zzP.zzL(zzb2, zzdsh, zzb2, zzb2, zzb2, false, (zzbop) null, zzb3, (zzbww) null, (zzccj) null, this.zzp, this.zzo, this.zzm, this.zzn, (zzbon) null, zzb2);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzcP)).booleanValue()) {
            zza2.zzaf("/getNativeAdViewSignals", zzbol.zzs);
        }
        zza2.zzaf("/getNativeClickMeta", zzbol.zzt);
        zza2.zzP().zzz(new zzdqb(zza3));
        zza2.zzad(str, str2, (String) null);
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(String str, Object obj) throws Exception {
        zzt.zzz();
        zzcli zza2 = zzclu.zza(this.zza, zzcmx.zza(), "native-omid", false, false, this.zzc, (zzbiy) null, this.zzd, (zzbio) null, (zzl) null, this.zze, this.zzf, (zzfbl) null, (zzfbo) null);
        zzcfz zza3 = zzcfz.zza(zza2);
        zza2.zzP().zzz(new zzdpx(zza3));
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzee)).booleanValue()) {
            zza2.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza2.loadData(str, "text/html", "UTF-8");
        }
        return zza3;
    }

    public final zzfvl zzd(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzfvc.zzi((Object) null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzfvc.zzm(zzo(optJSONArray, false, true), new zzdpy(this, optJSONObject), this.zzg), (Object) null);
    }

    public final zzfvl zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final zzfvl zzf(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzbkp zzbkp = this.zzh;
        return zzo(optJSONArray, zzbkp.zzb, zzbkp.zzd);
    }

    public final zzfvl zzg(JSONObject jSONObject, String str, zzfbl zzfbl, zzfbo zzfbo) {
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzhX)).booleanValue()) {
            return zzfvc.zzi((Object) null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfvc.zzi((Object) null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzfvc.zzi((Object) null);
        }
        String optString = optJSONObject.optString("base_url");
        String optString2 = optJSONObject.optString(TJAdUnitConstants.String.HTML);
        zzq zzk2 = zzk(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzfvc.zzi((Object) null);
        }
        zzfvl zzn2 = zzfvc.zzn(zzfvc.zzi((Object) null), new zzdpz(this, zzk2, zzfbl, zzfbo, optString, optString2), zzcfv.zze);
        return zzfvc.zzn(zzn2, new zzdqa(zzn2), zzcfv.zzf);
    }

    public final zzfvl zzh(JSONObject jSONObject, zzfbl zzfbl, zzfbo zzfbo) {
        zzfvl zzfvl;
        JSONObject zzg2 = zzbu.zzg(jSONObject, "html_containers", "instream");
        if (zzg2 != null) {
            return zzp(zzg2, zzfbl, zzfbo);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return zzfvc.zzi((Object) null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzhW)).booleanValue() && optJSONObject.has(TJAdUnitConstants.String.HTML)) {
            z = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z) {
                zze.zzj("Required field 'vast_xml' or 'html' is missing");
                return zzfvc.zzi((Object) null);
            }
        } else if (!z) {
            zzfvl = this.zzi.zza(optJSONObject);
            return zzl(zzfvc.zzo(zzfvl, (long) ((Integer) zzay.zzc().zzb(zzbhz.zzcQ)).intValue(), TimeUnit.SECONDS, this.zzk), (Object) null);
        }
        zzfvl = zzp(optJSONObject, zzfbl, zzfbo);
        return zzl(zzfvc.zzo(zzfvl, (long) ((Integer) zzay.zzc().zzb(zzbhz.zzcQ)).intValue(), TimeUnit.SECONDS, this.zzk), (Object) null);
    }

    private final zzq zzk(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return zzq.zzc();
            }
            i = 0;
        }
        return new zzq(this.zza, new AdSize(i, i2));
    }
}
