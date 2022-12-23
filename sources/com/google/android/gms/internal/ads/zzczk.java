package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzczk implements zzddh, zza, zzdeo, zzdcn, zzdbt, zzdgz {
    private final Clock zza;
    private final zzcek zzb;

    public zzczk(Clock clock, zzcek zzcek) {
        this.zza = clock;
        this.zzb = zzcek;
    }

    public final void onAdClicked() {
        this.zzb.zzd();
    }

    public final void zzb(zzfbx zzfbx) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    public final void zzbE(zzbzv zzbzv) {
    }

    public final void zzbv() {
    }

    public final String zzc() {
        return this.zzb.zzc();
    }

    public final void zzd() {
    }

    public final void zze(zzbeh zzbeh) {
        this.zzb.zzi();
    }

    public final void zzf(zzbeh zzbeh) {
    }

    public final void zzg(zzl zzl) {
        this.zzb.zzj(zzl);
    }

    public final void zzh(boolean z) {
    }

    public final void zzi(zzbeh zzbeh) {
        this.zzb.zzg();
    }

    public final void zzj() {
        this.zzb.zze();
    }

    public final void zzk(boolean z) {
    }

    public final void zzl() {
        this.zzb.zzf();
    }

    public final void zzm() {
    }

    public final void zzn() {
        this.zzb.zzh(true);
    }

    public final void zzo() {
    }

    public final void zzp(zzcal zzcal, String str, String str2) {
    }

    public final void zzr() {
    }
}
