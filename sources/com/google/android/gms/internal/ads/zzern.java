package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.smaato.sdk.core.api.VideoType;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzern implements zzetg {
    private final zzfvm zza;
    private final Context zzb;
    private final Set zzc;

    public zzern(zzfvm zzfvm, Context context, Set set) {
        this.zza = zzfvm;
        this.zzb = context;
        this.zzc = set;
    }

    public final int zza() {
        return 27;
    }

    public final zzfvl zzb() {
        return this.zza.zzb(new zzerm(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzero zzc() throws Exception {
        String str = null;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzeb)).booleanValue()) {
            Set set = this.zzc;
            if (set.contains(VideoType.REWARDED) || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                zzt.zzh();
                if (true == ((Boolean) zzay.zzc().zzb(zzbhz.zzeb)).booleanValue()) {
                    str = "a.1.3.3-google_20200416";
                }
                return new zzero(str);
            }
        }
        return new zzero((String) null);
    }
}
