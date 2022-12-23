package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeps implements zzetg {
    private final zzfvm zza;
    private final zzduh zzb;
    private final String zzc;
    private final zzfcd zzd;

    public zzeps(zzfvm zzfvm, zzduh zzduh, zzfcd zzfcd, String str) {
        this.zza = zzfvm;
        this.zzb = zzduh;
        this.zzd = zzfcd;
        this.zzc = str;
    }

    public final int zza() {
        return 17;
    }

    public final zzfvl zzb() {
        return this.zza.zzb(new zzepr(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzept zzc() throws Exception {
        return new zzept(this.zzb.zzb(this.zzd.zzf, this.zzc), this.zzb.zza());
    }
}
