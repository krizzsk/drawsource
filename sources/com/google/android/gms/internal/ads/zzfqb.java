package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
class zzfqb extends AbstractCollection {
    final Object zza;
    Collection zzb;
    @CheckForNull
    final zzfqb zzc;
    @CheckForNull
    final Collection zzd;
    final /* synthetic */ zzfqe zze;

    zzfqb(zzfqe zzfqe, Object obj, @CheckForNull Collection collection, zzfqb zzfqb) {
        this.zze = zzfqe;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfqb;
        this.zzd = zzfqb == null ? null : zzfqb.zzb;
    }

    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (!add) {
            return add;
        }
        zzfqe.zzd(this.zze);
        if (!isEmpty) {
            return add;
        }
        zza();
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        zzfqe.zzf(this.zze, this.zzb.size() - size);
        if (size != 0) {
            return addAll;
        }
        zza();
        return true;
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.zzb.clear();
            zzfqe.zzg(this.zze, size);
            zzc();
        }
    }

    public final boolean contains(@CheckForNull Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    public final Iterator iterator() {
        zzb();
        return new zzfqa(this);
    }

    public final boolean remove(@CheckForNull Object obj) {
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzfqe.zze(this.zze);
            zzc();
        }
        return remove;
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            zzfqe.zzf(this.zze, this.zzb.size() - size);
            zzc();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection collection) {
        if (collection != null) {
            int size = size();
            boolean retainAll = this.zzb.retainAll(collection);
            if (retainAll) {
                zzfqe.zzf(this.zze, this.zzb.size() - size);
                zzc();
            }
            return retainAll;
        }
        throw null;
    }

    public final int size() {
        zzb();
        return this.zzb.size();
    }

    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        zzfqb zzfqb = this.zzc;
        if (zzfqb != null) {
            zzfqb.zza();
        } else {
            this.zze.zza.put(this.zza, this.zzb);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        Collection collection;
        zzfqb zzfqb = this.zzc;
        if (zzfqb != null) {
            zzfqb.zzb();
            if (this.zzc.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
        } else if (this.zzb.isEmpty() && (collection = (Collection) this.zze.zza.get(this.zza)) != null) {
            this.zzb = collection;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        zzfqb zzfqb = this.zzc;
        if (zzfqb != null) {
            zzfqb.zzc();
        } else if (this.zzb.isEmpty()) {
            this.zze.zza.remove(this.zza);
        }
    }
}