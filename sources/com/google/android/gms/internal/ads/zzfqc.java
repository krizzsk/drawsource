package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfqc extends zzfqa implements ListIterator {
    final /* synthetic */ zzfqd zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfqc(zzfqd zzfqd) {
        super(zzfqd);
        this.zzd = zzfqd;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzfqe.zzd(this.zzd.zzf);
        if (isEmpty) {
            this.zzd.zza();
        }
    }

    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfqc(zzfqd zzfqd, int i) {
        super(zzfqd, ((List) zzfqd.zzb).listIterator(i));
        this.zzd = zzfqd;
    }
}
