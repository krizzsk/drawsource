package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfrw extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzfok zzb;

    zzfrw(List list, zzfok zzfok) {
        this.zza = list;
        this.zzb = zzfok;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final ListIterator listIterator(int i) {
        return new zzfrv(this, this.zza.listIterator(i));
    }

    public final int size() {
        return this.zza.size();
    }
}
