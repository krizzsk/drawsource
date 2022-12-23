package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdxs implements zzdxg {
    /* access modifiers changed from: private */
    public final long zza;
    private final zzemp zzb;

    zzdxs(long j, Context context, zzdxl zzdxl, zzcnf zzcnf, String str) {
        this.zza = j;
        zzezq zzt = zzcnf.zzt();
        zzt.zzc(context);
        zzt.zza(new zzq());
        zzt.zzb(str);
        zzemp zza2 = zzt.zzd().zza();
        this.zzb = zza2;
        zza2.zzD(new zzdxr(this, zzdxl));
    }

    public final void zza() {
        this.zzb.zzx();
    }

    public final void zzb(zzl zzl) {
        this.zzb.zzaa(zzl);
    }

    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
