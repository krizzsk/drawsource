package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfsz extends zzfsr implements Serializable {
    static final zzfsz zza = new zzfsz();

    private zzfsz() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        if (comparable == null) {
            throw null;
        } else if (comparable == comparable2) {
            return 0;
        } else {
            return comparable2.compareTo(comparable);
        }
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    public final zzfsr zza() {
        return zzfsp.zza;
    }
}
