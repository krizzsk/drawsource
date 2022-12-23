package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzeys implements zzfok {
    final /* synthetic */ zzeyw zza;

    zzeys(zzeyw zzeyw) {
        this.zza = zzeyw;
    }

    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzcfi.zzh("", (zzebn) obj);
        zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzeyw zzeyw = this.zza;
        zzeyw.zzd = new zzeyv((zzbzv) null, zzeyw.zze(), (zzeyu) null);
        return this.zza.zzd;
    }
}
