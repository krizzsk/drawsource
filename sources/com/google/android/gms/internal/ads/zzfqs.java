package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfqs extends AbstractCollection {
    final /* synthetic */ zzfqt zza;

    zzfqs(zzfqt zzfqt) {
        this.zza = zzfqt;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final Iterator iterator() {
        zzfqt zzfqt = this.zza;
        Map zzl = zzfqt.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new zzfqn(zzfqt);
    }

    public final int size() {
        return this.zza.size();
    }
}
