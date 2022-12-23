package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgnp extends AbstractList implements RandomAccess, zzgli {
    /* access modifiers changed from: private */
    public final zzgli zza;

    public zzgnp(zzgli zzgli) {
        this.zza = zzgli;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzglh) this.zza).get(i);
    }

    public final Iterator iterator() {
        return new zzgno(this);
    }

    public final ListIterator listIterator(int i) {
        return new zzgnn(this, i);
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzgli zze() {
        return this;
    }

    public final Object zzf(int i) {
        return this.zza.zzf(i);
    }

    public final List zzh() {
        return this.zza.zzh();
    }

    public final void zzi(zzgji zzgji) {
        throw new UnsupportedOperationException();
    }
}
