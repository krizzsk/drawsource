package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzvn {
    public final int zza;
    public final zzjv[] zzb;
    public final zzvg[] zzc;
    public final zzct zzd;
    public final Object zze;

    public zzvn(zzjv[] zzjvArr, zzvg[] zzvgArr, zzct zzct, Object obj) {
        this.zzb = zzjvArr;
        this.zzc = (zzvg[]) zzvgArr.clone();
        this.zzd = zzct;
        this.zze = obj;
        this.zza = zzjvArr.length;
    }

    public final boolean zza(zzvn zzvn, int i) {
        if (zzvn != null && zzeg.zzS(this.zzb[i], zzvn.zzb[i]) && zzeg.zzS(this.zzc[i], zzvn.zzc[i])) {
            return true;
        }
        return false;
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}
