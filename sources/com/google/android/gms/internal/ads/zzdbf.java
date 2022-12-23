package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdbf {
    private final Context zza;
    private final zzfcd zzb;
    private final Bundle zzc;
    private final zzfby zzd;

    /* synthetic */ zzdbf(zzdbd zzdbd, zzdbe zzdbe) {
        this.zza = zzdbd.zza;
        this.zzb = zzdbd.zzb;
        this.zzc = zzdbd.zzc;
        this.zzd = zzdbd.zzd;
    }

    /* access modifiers changed from: package-private */
    public final Context zza(Context context) {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final Bundle zzb() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final zzdbd zzc() {
        zzdbd zzdbd = new zzdbd();
        zzdbd.zzc(this.zza);
        zzdbd.zzf(this.zzb);
        zzdbd.zzd(this.zzc);
        return zzdbd;
    }

    /* access modifiers changed from: package-private */
    public final zzfby zzd() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final zzfcd zze() {
        return this.zzb;
    }
}
