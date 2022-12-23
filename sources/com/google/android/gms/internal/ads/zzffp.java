package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzffp {
    public static final zzffw zza(Callable callable, Object obj, zzffx zzffx) {
        return zzb(callable, zzffx.zzb, obj, zzffx);
    }

    public static final zzffw zzb(Callable callable, zzfvm zzfvm, Object obj, zzffx zzffx) {
        return new zzffw(zzffx, obj, (String) null, zzffx.zza, Collections.emptyList(), zzfvm.zzb(callable), (zzffv) null);
    }

    public static final zzffw zzc(zzfvl zzfvl, Object obj, zzffx zzffx) {
        return new zzffw(zzffx, obj, (String) null, zzffx.zza, Collections.emptyList(), zzfvl, (zzffv) null);
    }

    public static final zzffw zzd(zzffj zzffj, zzfvm zzfvm, Object obj, zzffx zzffx) {
        return zzb(new zzffo(zzffj), zzfvm, obj, zzffx);
    }
}
