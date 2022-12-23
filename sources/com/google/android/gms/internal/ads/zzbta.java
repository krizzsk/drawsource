package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbb;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbta {
    static final zzbb zza = new zzbsy();
    static final zzbb zzb = new zzbsz();
    private final zzbsm zzc;

    public zzbta(Context context, zzcfo zzcfo, String str, @Nullable zzfhu zzfhu) {
        this.zzc = new zzbsm(context, zzcfo, str, zza, zzb, zzfhu);
    }

    public final zzbsq zza(String str, zzbst zzbst, zzbss zzbss) {
        return new zzbte(this.zzc, str, zzbst, zzbss);
    }

    public final zzbtj zzb() {
        return new zzbtj(this.zzc);
    }
}
