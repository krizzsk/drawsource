package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfpq implements Iterator {
    final Iterator zza = this.zzc.zza.entrySet().iterator();
    @CheckForNull
    Collection zzb;
    final /* synthetic */ zzfpr zzc;

    zzfpq(zzfpr zzfpr) {
        this.zzc = zzfpr;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    public final void remove() {
        zzfou.zzi(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfqe.zzg(this.zzc.zzb, this.zzb.size());
        this.zzb.clear();
        this.zzb = null;
    }
}
