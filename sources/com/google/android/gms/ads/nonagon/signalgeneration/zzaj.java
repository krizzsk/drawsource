package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.internal.ads.zzbzv;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvl;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzaj implements zzfuj {
    public final /* synthetic */ zzbzv zza;

    public /* synthetic */ zzaj(zzbzv zzbzv) {
        this.zza = zzbzv;
    }

    public final zzfvl zza(Object obj) {
        zzbzv zzbzv = this.zza;
        zzam zzam = new zzam(new JsonReader(new InputStreamReader((InputStream) obj)));
        try {
            zzam.zzb = zzaw.zzb().zzh(zzbzv.zza).toString();
        } catch (JSONException unused) {
            zzam.zzb = JsonUtils.EMPTY_JSON;
        }
        return zzfvc.zzi(zzam);
    }
}
