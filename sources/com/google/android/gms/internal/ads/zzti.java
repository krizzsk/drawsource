package com.google.android.gms.internal.ads;

import android.support.p003v4.media.session.PlaybackStateCompat;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzti implements zzvp {
    public long zza;
    public long zzb;
    public zzvo zzc;
    public zzti zzd;

    public zzti(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = this.zza;
        int i = this.zzc.zzb;
        return (int) (j - j2);
    }

    public final zzti zzb() {
        this.zzc = null;
        zzti zzti = this.zzd;
        this.zzd = null;
        return zzti;
    }

    public final zzvo zzc() {
        zzvo zzvo = this.zzc;
        if (zzvo != null) {
            return zzvo;
        }
        throw null;
    }

    public final zzvp zzd() {
        zzti zzti = this.zzd;
        if (zzti == null || zzti.zzc == null) {
            return null;
        }
        return zzti;
    }

    public final void zze(long j, int i) {
        zzcw.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }
}
