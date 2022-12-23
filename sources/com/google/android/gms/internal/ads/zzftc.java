package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzftc extends zzftb implements SortedSet {
    zzftc(SortedSet sortedSet, zzfov zzfov) {
        super(sortedSet, zzfov);
    }

    @CheckForNull
    public final Comparator comparator() {
        return ((SortedSet) this.zza).comparator();
    }

    public final Object first() {
        Iterator it = this.zza.iterator();
        zzfov zzfov = this.zzb;
        if (it == null) {
            throw null;
        } else if (zzfov != null) {
            while (it.hasNext()) {
                Object next = it.next();
                if (zzfov.zza(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        } else {
            throw null;
        }
    }

    public final SortedSet headSet(Object obj) {
        return new zzftc(((SortedSet) this.zza).headSet(obj), this.zzb);
    }

    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.zza;
        while (true) {
            Object last = sortedSet.last();
            if (this.zzb.zza(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return new zzftc(((SortedSet) this.zza).subSet(obj, obj2), this.zzb);
    }

    public final SortedSet tailSet(Object obj) {
        return new zzftc(((SortedSet) this.zza).tailSet(obj), this.zzb);
    }
}
