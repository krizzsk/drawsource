package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfst extends zzfrj {
    final /* synthetic */ zzfsu zza;

    zzfst(zzfsu zzfsu) {
        this.zza = zzfsu;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzfou.zza(i, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        zzfsu zzfsu = this.zza;
        int i2 = i + i;
        Object obj = zzfsu.zzb[i2];
        obj.getClass();
        Object obj2 = zzfsu.zzb[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzc;
    }

    public final boolean zzf() {
        return true;
    }
}
