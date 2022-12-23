package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzcwc {
    private final zzcxv zza;
    private final View zzb;
    private final zzfbm zzc;
    private final zzcli zzd;

    public zzcwc(View view, zzcli zzcli, zzcxv zzcxv, zzfbm zzfbm) {
        this.zzb = view;
        this.zzd = zzcli;
        this.zza = zzcxv;
        this.zzc = zzfbm;
    }

    public static final zzdiz zzf(Context context, zzcfo zzcfo, zzfbl zzfbl, zzfcd zzfcd) {
        return new zzdiz(new zzcwa(context, zzcfo, zzfbl, zzfcd), zzcfv.zzf);
    }

    public static final Set zzg(zzcxm zzcxm) {
        return Collections.singleton(new zzdiz(zzcxm, zzcfv.zzf));
    }

    public static final zzdiz zzh(zzcxk zzcxk) {
        return new zzdiz(zzcxk, zzcfv.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcli zzb() {
        return this.zzd;
    }

    public final zzcxv zzc() {
        return this.zza;
    }

    public zzddf zzd(Set set) {
        return new zzddf(set);
    }

    public final zzfbm zze() {
        return this.zzc;
    }
}
