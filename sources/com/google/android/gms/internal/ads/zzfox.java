package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzfox implements Serializable, zzfov {
    private final List zza;

    /* synthetic */ zzfox(List list, zzfow zzfow) {
        this.zza = list;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzfox) {
            return this.zza.equals(((zzfox) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.zza;
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z = true;
        for (Object next : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(next);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    public final boolean zza(Object obj) {
        for (int i = 0; i < this.zza.size(); i++) {
            if (!((zzfov) this.zza.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
