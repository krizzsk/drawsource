package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzcdw;
import com.google.android.gms.internal.ads.zzced;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfuy;
import com.google.android.gms.internal.ads.zzfvl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzw implements zzfuy {
    final /* synthetic */ zzfvl zza;
    final /* synthetic */ zzced zzb;
    final /* synthetic */ zzcdw zzc;
    final /* synthetic */ zzfhh zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzaa zzf;

    zzw(zzaa zzaa, zzfvl zzfvl, zzced zzced, zzcdw zzcdw, zzfhh zzfhh, long j) {
        this.zzf = zzaa;
        this.zza = zzfvl;
        this.zzb = zzced;
        this.zzc = zzcdw;
        this.zzd = zzfhh;
        this.zze = j;
    }

    public final void zza(Throwable th) {
        long currentTimeMillis = zzt.zzA().currentTimeMillis();
        long j = this.zze;
        String message = th.getMessage();
        zzt.zzo().zzt(th, "SignalGeneratorImpl.generateSignals");
        zzaa zzaa = this.zzf;
        zzf.zzc(zzaa.zzr, zzaa.zzj, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(currentTimeMillis - j)));
        zzfhs zzr = zzaa.zzr(this.zza, this.zzb);
        if (((Boolean) zzbji.zze.zze()).booleanValue() && zzr != null) {
            zzfhh zzfhh = this.zzd;
            zzfhh.zze(false);
            zzr.zza(zzfhh);
            zzr.zzg();
        }
        try {
            zzcdw zzcdw = this.zzc;
            zzcdw.zzb("Internal error. " + message);
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzam zzam = (zzam) obj;
        zzfhs zzr = zzaa.zzr(this.zza, this.zzb);
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzgx)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                zze.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (((Boolean) zzbji.zze.zze()).booleanValue() && zzr != null) {
                zzfhh zzfhh = this.zzd;
                zzfhh.zze(false);
                zzr.zza(zzfhh);
                zzr.zzg();
                return;
            }
            return;
        }
        long currentTimeMillis = zzt.zzA().currentTimeMillis() - this.zze;
        if (zzam == null) {
            try {
                this.zzc.zzc((String) null, (String) null, (Bundle) null);
                zzaa zzaa = this.zzf;
                zzf.zzc(zzaa.zzr, zzaa.zzj, "sgs", new Pair("rid", "-1"));
                this.zzd.zze(true);
                if (((Boolean) zzbji.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            } catch (RemoteException e2) {
                this.zzd.zze(false);
                zzcfi.zzh("", e2);
                if (((Boolean) zzbji.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            } catch (Throwable th) {
                if (((Boolean) zzbji.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
                throw th;
            }
        } else {
            try {
                String optString = new JSONObject(zzam.zzb).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, "");
                if (TextUtils.isEmpty(optString)) {
                    zze.zzj("The request ID is empty in request JSON.");
                    this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                    zzaa zzaa2 = this.zzf;
                    zzf.zzc(zzaa2.zzr, zzaa2.zzj, "sgf", new Pair("sgf_reason", "rid_missing"));
                    this.zzd.zze(false);
                    if (((Boolean) zzbji.zze.zze()).booleanValue() && zzr != null) {
                        zzr.zza(this.zzd);
                        zzr.zzg();
                        return;
                    }
                    return;
                }
                zzaa zzaa3 = this.zzf;
                zzaa.zzG(zzaa3, optString, zzam.zzb, zzaa3.zzj);
                Bundle bundle = zzam.zzc;
                zzaa zzaa4 = this.zzf;
                if (zzaa4.zzw && bundle != null && bundle.getInt(zzaa4.zzy, -1) == -1) {
                    zzaa zzaa5 = this.zzf;
                    bundle.putInt(zzaa5.zzy, zzaa5.zzz.get());
                }
                zzaa zzaa6 = this.zzf;
                if (zzaa6.zzv && bundle != null && TextUtils.isEmpty(bundle.getString(zzaa6.zzx))) {
                    if (TextUtils.isEmpty(this.zzf.zzB)) {
                        zzaa zzaa7 = this.zzf;
                        zzs zzp = zzt.zzp();
                        zzaa zzaa8 = this.zzf;
                        zzaa7.zzB = zzp.zzc(zzaa8.zzg, zzaa8.zzA.zza);
                    }
                    zzaa zzaa9 = this.zzf;
                    bundle.putString(zzaa9.zzx, zzaa9.zzB);
                }
                this.zzc.zzc(zzam.zza, zzam.zzb, bundle);
                zzaa zzaa10 = this.zzf;
                zzf.zzc(zzaa10.zzr, zzaa10.zzj, "sgs", new Pair("tqgt", String.valueOf(currentTimeMillis)));
                this.zzd.zze(true);
                if (((Boolean) zzbji.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            } catch (JSONException e3) {
                zze.zzj("Failed to create JSON object from the request string.");
                zzcdw zzcdw = this.zzc;
                String obj2 = e3.toString();
                zzcdw.zzb("Internal error for request JSON: " + obj2);
                zzaa zzaa11 = this.zzf;
                zzf.zzc(zzaa11.zzr, zzaa11.zzj, "sgf", new Pair("sgf_reason", "request_invalid"));
                this.zzd.zze(false);
                if (((Boolean) zzbji.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            }
        }
    }
}
