package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbzv;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvl;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzak implements zzfuj {
    private final Executor zza;
    private final zzeaj zzb;

    public zzak(Executor executor, zzeaj zzeaj) {
        this.zza = executor;
        this.zzb = zzeaj;
    }

    public final /* bridge */ /* synthetic */ zzfvl zza(Object obj) throws Exception {
        zzbzv zzbzv = (zzbzv) obj;
        return zzfvc.zzn(this.zzb.zzb(zzbzv), new zzaj(zzbzv), this.zza);
    }
}
