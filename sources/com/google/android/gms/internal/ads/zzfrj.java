package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzfrj extends zzfre implements List, RandomAccess {
    private static final zzftj zza = new zzfrh(zzfss.zza, 0);

    zzfrj() {
    }

    public static zzfrg zzi() {
        return new zzfrg(4);
    }

    static zzfrj zzj(Object[] objArr) {
        return zzk(objArr, objArr.length);
    }

    static zzfrj zzk(Object[] objArr, int i) {
        if (i == 0) {
            return zzfss.zza;
        }
        return new zzfss(objArr, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzfrj zzl(java.lang.Iterable r0) {
        /*
            if (r0 == 0) goto L_0x0007
            com.google.android.gms.internal.ads.zzfrj r0 = zzm(r0)
            return r0
        L_0x0007:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfrj.zzl(java.lang.Iterable):com.google.android.gms.internal.ads.zzfrj");
    }

    public static zzfrj zzm(Collection collection) {
        if (collection instanceof zzfre) {
            zzfrj zzd = ((zzfre) collection).zzd();
            if (!zzd.zzf()) {
                return zzd;
            }
            Object[] array = zzd.toArray();
            return zzk(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzfsq.zzb(array2, length);
        return zzk(array2, length);
    }

    public static zzfrj zzn(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfss.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfsq.zzb(objArr2, length);
        return zzk(objArr2, length);
    }

    public static zzfrj zzo() {
        return zzfss.zza;
    }

    public static zzfrj zzp(Object obj) {
        Object[] objArr = {obj};
        zzfsq.zzb(objArr, 1);
        return zzk(objArr, 1);
    }

    public static zzfrj zzq(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfsq.zzb(objArr, 2);
        return zzk(objArr, 2);
    }

    public static zzfrj zzr(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {"2011", "1009", "3010"};
        zzfsq.zzb(objArr, 3);
        return zzk(objArr, 3);
    }

    public static zzfrj zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfsq.zzb(objArr, 5);
        return zzk(objArr, 5);
    }

    public static zzfrj zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfsq.zzb(objArr, 6);
        return zzk(objArr, 6);
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (zzfoq.zza(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzfoq.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Deprecated
    public final zzfrj zzd() {
        return this;
    }

    public final zzfti zze() {
        return listIterator(0);
    }

    /* renamed from: zzh */
    public zzfrj subList(int i, int i2) {
        zzfou.zzg(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzfss.zza;
        }
        return new zzfri(this, i, i3);
    }

    /* renamed from: zzu */
    public final zzftj listIterator(int i) {
        zzfou.zzb(i, size(), FirebaseAnalytics.Param.INDEX);
        if (isEmpty()) {
            return zza;
        }
        return new zzfrh(this, i);
    }
}
