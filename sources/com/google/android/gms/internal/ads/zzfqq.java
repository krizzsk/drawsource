package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfqq extends AbstractSet {
    final /* synthetic */ zzfqt zza;

    zzfqq(zzfqt zzfqt) {
        this.zza = zzfqt;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.containsKey(obj);
    }

    public final Iterator iterator() {
        zzfqt zzfqt = this.zza;
        Map zzl = zzfqt.zzl();
        if (zzl != null) {
            return zzl.keySet().iterator();
        }
        return new zzfql(zzfqt);
    }

    public final boolean remove(@CheckForNull Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.keySet().remove(obj);
        }
        return this.zza.zzx(obj) != zzfqt.zzd;
    }

    public final int size() {
        return this.zza.size();
    }
}
