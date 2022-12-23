package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzcex;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public class QueryInfo {
    private final zzeg zza;

    public QueryInfo(zzeg zzeg) {
        this.zza = zzeg;
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzdr zzdr;
        zzbhz.zzc(context);
        if (((Boolean) zzbjn.zzh.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                zzcex.zzb.execute(new zza(context, adFormat, adRequest, queryInfoGenerationCallback));
                return;
            }
        }
        if (adRequest == null) {
            zzdr = null;
        } else {
            zzdr = adRequest.zza();
        }
        new zzbym(context, adFormat, zzdr).zzb(queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.zza.zzb();
    }

    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    public String getRequestId() {
        return this.zza.zzd();
    }

    public final zzeg zza() {
        return this.zza;
    }
}
