package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfte {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzb(Set set, zzfov zzfov) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof zzftb) {
                zzftb zzftb = (zzftb) sortedSet;
                return new zzftc((SortedSet) zzftb.zza, zzfoy.zza(zzftb.zzb, zzfov));
            } else if (sortedSet == null) {
                throw null;
            } else if (zzfov != null) {
                return new zzftc(sortedSet, zzfov);
            } else {
                throw null;
            }
        } else if (set instanceof zzftb) {
            zzftb zzftb2 = (zzftb) set;
            return new zzftb(zzftb2.zza, zzfoy.zza(zzftb2.zzb, zzfov));
        } else if (set == null) {
            throw null;
        } else if (zzfov != null) {
            return new zzftb(set, zzfov);
        } else {
            throw null;
        }
    }

    static boolean zzc(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    static boolean zzd(Set set, Collection collection) {
        if (collection != null) {
            if (collection instanceof zzfso) {
                collection = ((zzfso) collection).zza();
            }
            if (!(collection instanceof Set) || collection.size() <= set.size()) {
                return zze(set, collection.iterator());
            }
            Iterator it = set.iterator();
            if (collection != null) {
                boolean z = false;
                while (it.hasNext()) {
                    if (collection.contains(it.next())) {
                        it.remove();
                        z = true;
                    }
                }
                return z;
            }
            throw null;
        }
        throw null;
    }

    static boolean zze(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
