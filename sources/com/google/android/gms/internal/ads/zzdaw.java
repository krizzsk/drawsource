package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzdaw implements zzddh, zzdco {
    private final Context zza;
    private final zzfbl zzb;
    private final zzbya zzc;

    public zzdaw(Context context, zzfbl zzfbl, zzbya zzbya, byte[] bArr) {
        this.zza = context;
        this.zzb = zzfbl;
        this.zzc = zzbya;
    }

    public final void zzbq(Context context) {
    }

    public final void zzbs(Context context) {
    }

    public final void zzbt(Context context) {
    }

    public final void zzn() {
        zzbyb zzbyb = this.zzb.zzae;
        if (zzbyb != null && zzbyb.zza) {
            ArrayList arrayList = new ArrayList();
            if (!this.zzb.zzae.zzb.isEmpty()) {
                arrayList.add(this.zzb.zzae.zzb);
            }
        }
    }
}
