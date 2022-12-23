package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzglh extends zzgis implements RandomAccess, zzgli {
    public static final zzgli zza = zzb;
    private static final zzglh zzb;
    private final List zzc;

    static {
        zzglh zzglh = new zzglh(10);
        zzb = zzglh;
        zzglh.zzb();
    }

    public zzglh() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgji) {
            return ((zzgji) obj).zzA(zzgla.zzb);
        }
        return zzgla.zzh((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzbM();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        zzbM();
        if (collection instanceof zzgli) {
            collection = ((zzgli) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zzbM();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbM();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzj(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzbM();
        return zzj(this.zzc.set(i, (String) obj));
    }

    public final int size() {
        return this.zzc.size();
    }

    public final /* bridge */ /* synthetic */ zzgkz zzd(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzc);
            return new zzglh(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final zzgli zze() {
        return zzc() ? new zzgnp(this) : this;
    }

    public final Object zzf(int i) {
        return this.zzc.get(i);
    }

    /* renamed from: zzg */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgji) {
            zzgji zzgji = (zzgji) obj;
            String zzA = zzgji.zzA(zzgla.zzb);
            if (zzgji.zzp()) {
                this.zzc.set(i, zzA);
            }
            return zzA;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzgla.zzh(bArr);
        if (zzgla.zzi(bArr)) {
            this.zzc.set(i, zzh);
        }
        return zzh;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final void zzi(zzgji zzgji) {
        zzbM();
        this.zzc.add(zzgji);
        this.modCount++;
    }

    public zzglh(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzglh(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
