package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfsp extends zzfsr implements Serializable {
    static final zzfsp zza = new zzfsp();

    private zzfsp() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        if (comparable == null) {
            throw null;
        } else if (comparable2 != null) {
            return comparable.compareTo(comparable2);
        } else {
            throw null;
        }
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    public final zzfsr zza() {
        return zzfsz.zza;
    }
}
