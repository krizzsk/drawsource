package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfta extends zzfsr implements Serializable {
    final zzfsr zza;

    zzfta(zzfsr zzfsr) {
        this.zza = zzfsr;
    }

    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfta) {
            return this.zza.equals(((zzfta) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        zzfsr zzfsr = this.zza;
        sb.append(zzfsr);
        sb.append(".reverse()");
        return zzfsr.toString().concat(".reverse()");
    }

    public final zzfsr zza() {
        return this.zza;
    }
}
