package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcve extends zzcxx {
    private final View zzc;
    private final zzcli zzd;
    private final zzfbm zze;
    private final int zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final zzcuw zzi;
    private zzbck zzj;

    zzcve(zzcxw zzcxw, View view, zzcli zzcli, zzfbm zzfbm, int i, boolean z, boolean z2, zzcuw zzcuw) {
        super(zzcxw);
        this.zzc = view;
        this.zzd = zzcli;
        this.zze = zzfbm;
        this.zzf = i;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = zzcuw;
    }

    public final int zza() {
        return this.zzf;
    }

    public final View zzb() {
        return this.zzc;
    }

    public final zzfbm zzc() {
        return zzfch.zzb(this.zzb.zzs, this.zze);
    }

    public final void zzd(zzbca zzbca) {
        this.zzd.zzaj(zzbca);
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return this.zzd.zzay();
    }

    public final boolean zzh() {
        return this.zzd.zzP() != null && this.zzd.zzP().zzJ();
    }

    public final void zzi(long j, int i) {
        this.zzi.zza(j, i);
    }

    public final zzbck zzj() {
        return this.zzj;
    }

    public final void zzk(zzbck zzbck) {
        this.zzj = zzbck;
    }
}
